package io.getstream.chat.android.client.channel;

import androidx.core.app.NotificationCompat;
import androidx.lifecycle.InterfaceC1585g0;
import com.mapbox.maps.MapboxMap;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.C19090h;
import io.getstream.chat.android.client.ChatClient;
import io.getstream.chat.android.client.ChatEventListener;
import io.getstream.chat.android.client.api.QueryParams;
import io.getstream.chat.android.client.api.models.PinnedMessagesPagination;
import io.getstream.chat.android.client.api.models.QueryChannelRequest;
import io.getstream.chat.android.client.api.models.SendActionRequest;
import io.getstream.chat.android.client.api.models.WatchChannelRequest;
import io.getstream.chat.android.client.events.AIIndicatorClearEvent;
import io.getstream.chat.android.client.events.AIIndicatorStopEvent;
import io.getstream.chat.android.client.events.AIIndicatorUpdatedEvent;
import io.getstream.chat.android.client.events.AnswerCastedEvent;
import io.getstream.chat.android.client.events.ChannelDeletedEvent;
import io.getstream.chat.android.client.events.ChannelHiddenEvent;
import io.getstream.chat.android.client.events.ChannelTruncatedEvent;
import io.getstream.chat.android.client.events.ChannelUpdatedByUserEvent;
import io.getstream.chat.android.client.events.ChannelUpdatedEvent;
import io.getstream.chat.android.client.events.ChannelUserBannedEvent;
import io.getstream.chat.android.client.events.ChannelUserUnbannedEvent;
import io.getstream.chat.android.client.events.ChannelVisibleEvent;
import io.getstream.chat.android.client.events.ChatEvent;
import io.getstream.chat.android.client.events.ConnectedEvent;
import io.getstream.chat.android.client.events.ConnectingEvent;
import io.getstream.chat.android.client.events.ConnectionErrorEvent;
import io.getstream.chat.android.client.events.DisconnectedEvent;
import io.getstream.chat.android.client.events.DraftMessageDeletedEvent;
import io.getstream.chat.android.client.events.DraftMessageUpdatedEvent;
import io.getstream.chat.android.client.events.ErrorEvent;
import io.getstream.chat.android.client.events.GlobalUserBannedEvent;
import io.getstream.chat.android.client.events.GlobalUserUnbannedEvent;
import io.getstream.chat.android.client.events.HealthEvent;
import io.getstream.chat.android.client.events.MarkAllReadEvent;
import io.getstream.chat.android.client.events.MemberAddedEvent;
import io.getstream.chat.android.client.events.MemberRemovedEvent;
import io.getstream.chat.android.client.events.MemberUpdatedEvent;
import io.getstream.chat.android.client.events.MessageDeletedEvent;
import io.getstream.chat.android.client.events.MessageDeliveredEvent;
import io.getstream.chat.android.client.events.MessageReadEvent;
import io.getstream.chat.android.client.events.MessageUpdatedEvent;
import io.getstream.chat.android.client.events.NewMessageEvent;
import io.getstream.chat.android.client.events.NotificationAddedToChannelEvent;
import io.getstream.chat.android.client.events.NotificationChannelDeletedEvent;
import io.getstream.chat.android.client.events.NotificationChannelMutesUpdatedEvent;
import io.getstream.chat.android.client.events.NotificationChannelTruncatedEvent;
import io.getstream.chat.android.client.events.NotificationInviteAcceptedEvent;
import io.getstream.chat.android.client.events.NotificationInviteRejectedEvent;
import io.getstream.chat.android.client.events.NotificationInvitedEvent;
import io.getstream.chat.android.client.events.NotificationMarkReadEvent;
import io.getstream.chat.android.client.events.NotificationMarkUnreadEvent;
import io.getstream.chat.android.client.events.NotificationMessageNewEvent;
import io.getstream.chat.android.client.events.NotificationMutesUpdatedEvent;
import io.getstream.chat.android.client.events.NotificationReminderDueEvent;
import io.getstream.chat.android.client.events.NotificationRemovedFromChannelEvent;
import io.getstream.chat.android.client.events.NotificationThreadMessageNewEvent;
import io.getstream.chat.android.client.events.PollClosedEvent;
import io.getstream.chat.android.client.events.PollDeletedEvent;
import io.getstream.chat.android.client.events.PollUpdatedEvent;
import io.getstream.chat.android.client.events.ReactionDeletedEvent;
import io.getstream.chat.android.client.events.ReactionNewEvent;
import io.getstream.chat.android.client.events.ReactionUpdateEvent;
import io.getstream.chat.android.client.events.ReminderCreatedEvent;
import io.getstream.chat.android.client.events.ReminderDeletedEvent;
import io.getstream.chat.android.client.events.ReminderUpdatedEvent;
import io.getstream.chat.android.client.events.ThreadUpdatedEvent;
import io.getstream.chat.android.client.events.TypingStartEvent;
import io.getstream.chat.android.client.events.TypingStopEvent;
import io.getstream.chat.android.client.events.UnknownEvent;
import io.getstream.chat.android.client.events.UserDeletedEvent;
import io.getstream.chat.android.client.events.UserMessagesDeletedEvent;
import io.getstream.chat.android.client.events.UserPresenceChangedEvent;
import io.getstream.chat.android.client.events.UserStartWatchingEvent;
import io.getstream.chat.android.client.events.UserStopWatchingEvent;
import io.getstream.chat.android.client.events.UserUpdatedEvent;
import io.getstream.chat.android.client.events.VoteCastedEvent;
import io.getstream.chat.android.client.events.VoteChangedEvent;
import io.getstream.chat.android.client.events.VoteRemovedEvent;
import io.getstream.chat.android.client.query.AddMembersParams;
import io.getstream.chat.android.client.query.CreateChannelParams;
import io.getstream.chat.android.client.utils.ProgressCallback;
import io.getstream.chat.android.client.utils.observable.Disposable;
import io.getstream.chat.android.models.BannedUsersSort;
import io.getstream.chat.android.models.CommandDefaults;
import io.getstream.chat.android.models.FilterObject;
import io.getstream.chat.android.models.Filters;
import io.getstream.chat.android.models.Member;
import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.models.Reaction;
import io.getstream.chat.android.models.querysort.QuerySortByField;
import io.getstream.chat.android.models.querysort.QuerySorter;
import java.io.File;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;
import m83.C25271y;
import m83.C25272z;
import o23.InterfaceC27474d;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u0080\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0019\u0018\u00002\u00020\u0001B!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ1\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u0011J7\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u00122\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0014H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0019\u001a\u00020\u0018H\u0007¢\u0006\u0004\b\u0016\u0010\u001aJ\u001b\u0010\u001f\u001a\u00020\u001e2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b¢\u0006\u0004\b\u001f\u0010 J/\u0010#\u001a\u00020\u001e2\u0012\u0010\"\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020!\"\u00020\u00022\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b¢\u0006\u0004\b#\u0010$J7\u0010#\u001a\u00020\u001e2\u0006\u0010&\u001a\u00020%2\u0012\u0010\"\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020!\"\u00020\u00022\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b¢\u0006\u0004\b#\u0010'J?\u0010#\u001a\u00020\u001e2\"\u0010\"\u001a\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u001c0(0!\"\n\u0012\u0006\b\u0001\u0012\u00020\u001c0(2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b¢\u0006\u0004\b#\u0010)JG\u0010#\u001a\u00020\u001e2\u0006\u0010&\u001a\u00020%2\"\u0010\"\u001a\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u001c0(0!\"\n\u0012\u0006\b\u0001\u0012\u00020\u001c0(2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b¢\u0006\u0004\b#\u0010*J#\u0010,\u001a\u00020\u001e2\u0006\u0010+\u001a\u00020\u00022\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b¢\u0006\u0004\b,\u0010-J3\u0010,\u001a\u00020\u001e\"\b\b\u0000\u0010.*\u00020\u001c2\f\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00000(2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b¢\u0006\u0004\b,\u0010/J\u001d\u00102\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u00101\u001a\u000200H\u0007¢\u0006\u0004\b2\u00103J\u001d\u00105\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u00101\u001a\u000204H\u0007¢\u0006\u0004\b5\u00106J)\u00105\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0012\u00107\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0014H\u0007¢\u0006\u0004\b5\u00108J\u0015\u00105\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0007¢\u0006\u0004\b5\u00109J\u0015\u0010;\u001a\b\u0012\u0004\u0012\u00020:0\u000eH\u0007¢\u0006\u0004\b;\u00109J\u001d\u0010>\u001a\b\u0012\u0004\u0012\u00020=0\u000e2\u0006\u0010<\u001a\u00020\u0002H\u0007¢\u0006\u0004\b>\u0010?J\u001d\u0010A\u001a\b\u0012\u0004\u0012\u00020=0\u000e2\u0006\u0010@\u001a\u00020=H\u0007¢\u0006\u0004\bA\u0010BJ'\u0010D\u001a\b\u0012\u0004\u0012\u00020=0\u000e2\u0006\u0010<\u001a\u00020\u00022\b\b\u0002\u0010C\u001a\u00020\fH\u0007¢\u0006\u0004\bD\u0010EJ'\u0010G\u001a\b\u0012\u0004\u0012\u00020=0\u000e2\u0006\u0010@\u001a\u00020=2\b\b\u0002\u0010F\u001a\u00020\fH\u0007¢\u0006\u0004\bG\u0010HJ1\u0010L\u001a\b\u0012\u0004\u0012\u00020:0\u000e2\u0006\u0010I\u001a\u00020\u00022\b\u0010J\u001a\u0004\u0018\u00010\u00022\b\u0010K\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\bL\u0010MJ\u001d\u0010N\u001a\b\u0012\u0004\u0012\u00020:0\u000e2\u0006\u0010I\u001a\u00020\u0002H\u0007¢\u0006\u0004\bN\u0010?J1\u0010O\u001a\b\u0012\u0004\u0012\u00020:0\u000e2\u0006\u0010I\u001a\u00020\u00022\b\u0010J\u001a\u0004\u0018\u00010\u00022\b\u0010K\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\bO\u0010MJ\u001d\u0010P\u001a\b\u0012\u0004\u0012\u00020:0\u000e2\u0006\u0010I\u001a\u00020\u0002H\u0007¢\u0006\u0004\bP\u0010?J\u007f\u0010^\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020]0\u00120\u000e2\n\b\u0002\u0010R\u001a\u0004\u0018\u00010Q2\u000e\b\u0002\u0010U\u001a\b\u0012\u0004\u0012\u00020T0S2\n\b\u0002\u0010V\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010W\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010Y\u001a\u0004\u0018\u00010X2\n\b\u0002\u0010Z\u001a\u0004\u0018\u00010X2\n\b\u0002\u0010[\u001a\u0004\u0018\u00010X2\n\b\u0002\u0010\\\u001a\u0004\u0018\u00010XH\u0007¢\u0006\u0004\b^\u0010_J\u001d\u0010`\u001a\b\u0012\u0004\u0012\u00020:0\u000e2\u0006\u0010<\u001a\u00020\u0002H\u0007¢\u0006\u0004\b`\u0010?J\u001d\u0010b\u001a\b\u0012\u0004\u0012\u00020:0\u000e2\u0006\u0010a\u001a\u00020\u0002H\u0007¢\u0006\u0004\bb\u0010?J\u001d\u0010c\u001a\b\u0012\u0004\u0012\u00020:0\u000e2\u0006\u0010<\u001a\u00020\u0002H\u0007¢\u0006\u0004\bc\u0010?J\u001d\u0010c\u001a\b\u0012\u0004\u0012\u00020:0\u000e2\u0006\u0010d\u001a\u00020XH\u0007¢\u0006\u0004\bc\u0010eJ\u001d\u0010f\u001a\b\u0012\u0004\u0012\u00020:0\u000e2\u0006\u0010a\u001a\u00020\u0002H\u0007¢\u0006\u0004\bf\u0010?J\u0015\u0010g\u001a\b\u0012\u0004\u0012\u00020:0\u000eH\u0007¢\u0006\u0004\bg\u00109J\u0015\u0010h\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0007¢\u0006\u0004\bh\u00109J\u0015\u0010i\u001a\b\u0012\u0004\u0012\u00020:0\u000eH\u0007¢\u0006\u0004\bi\u00109J\u001f\u0010k\u001a\b\u0012\u0004\u0012\u00020:0\u000e2\b\b\u0002\u0010j\u001a\u00020\fH\u0007¢\u0006\u0004\bk\u0010lJ!\u0010n\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\n\b\u0002\u0010m\u001a\u0004\u0018\u00010=H\u0007¢\u0006\u0004\bn\u0010BJ)\u0010t\u001a\b\u0012\u0004\u0012\u00020s0\u000e2\u0006\u0010p\u001a\u00020o2\n\b\u0002\u0010r\u001a\u0004\u0018\u00010qH\u0007¢\u0006\u0004\bt\u0010uJ)\u0010v\u001a\b\u0012\u0004\u0012\u00020s0\u000e2\u0006\u0010p\u001a\u00020o2\n\b\u0002\u0010r\u001a\u0004\u0018\u00010qH\u0007¢\u0006\u0004\bv\u0010uJ\u001d\u0010x\u001a\b\u0012\u0004\u0012\u00020:0\u000e2\u0006\u0010w\u001a\u00020\u0002H\u0007¢\u0006\u0004\bx\u0010?J\u001d\u0010y\u001a\b\u0012\u0004\u0012\u00020:0\u000e2\u0006\u0010w\u001a\u00020\u0002H\u0007¢\u0006\u0004\by\u0010?J1\u0010~\u001a\b\u0012\u0004\u0012\u00020z0\u000e2\u0006\u0010{\u001a\u00020z2\b\b\u0002\u0010|\u001a\u00020\f2\b\b\u0002\u0010}\u001a\u00020\fH\u0007¢\u0006\u0004\b~\u0010\u007fJ!\u0010\u0081\u0001\u001a\b\u0012\u0004\u0012\u00020=0\u000e2\u0007\u00101\u001a\u00030\u0080\u0001H\u0007¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001J)\u0010\u0084\u0001\u001a\b\u0012\u0004\u0012\u00020=0\u000e2\u0006\u0010<\u001a\u00020\u00022\u0007\u0010\u0083\u0001\u001a\u00020\u0002H\u0007¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001J6\u0010\u0086\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020z0\u00120\u000e2\u0006\u0010<\u001a\u00020\u00022\u0006\u0010V\u001a\u00020\t2\u0006\u0010W\u001a\u00020\tH\u0007¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001J:\u0010\u0088\u0001\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\n\b\u0002\u0010@\u001a\u0004\u0018\u00010=2\u0014\b\u0002\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0014H\u0007¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001J@\u0010\u008c\u0001\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0015\b\u0002\u0010\u008a\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u00142\u000f\b\u0002\u0010\u008b\u0001\u001a\b\u0012\u0004\u0012\u00020\u00020\u0012H\u0007¢\u0006\u0006\b\u008c\u0001\u0010\u008d\u0001JJ\u0010\u0090\u0001\u001a\t\u0012\u0005\u0012\u00030\u008f\u00010\u000e2\u0007\u0010\u008e\u0001\u001a\u00020\u00022\u0015\b\u0002\u0010\u008a\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u00142\u000f\b\u0002\u0010\u008b\u0001\u001a\b\u0012\u0004\u0012\u00020\u00020\u0012H\u0007¢\u0006\u0006\b\u0090\u0001\u0010\u0091\u0001J!\u0010\u0093\u0001\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0007\u0010\u0092\u0001\u001a\u00020\tH\u0007¢\u0006\u0006\b\u0093\u0001\u0010\u0094\u0001J\u0017\u0010\u0095\u0001\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0007¢\u0006\u0005\b\u0095\u0001\u00109JX\u0010\u0098\u0001\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u00122\n\b\u0002\u0010m\u001a\u0004\u0018\u00010=2\u000b\b\u0002\u0010\u0096\u0001\u001a\u0004\u0018\u00010\f2\u000b\b\u0002\u0010\u0097\u0001\u001a\u0004\u0018\u00010X2\n\b\u0002\u0010}\u001a\u0004\u0018\u00010\fH\u0007¢\u0006\u0006\b\u0098\u0001\u0010\u0099\u0001J!\u0010\u0098\u0001\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0007\u0010\u0019\u001a\u00030\u009a\u0001H\u0007¢\u0006\u0006\b\u0098\u0001\u0010\u009b\u0001J>\u0010\u009c\u0001\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u00122\n\b\u0002\u0010m\u001a\u0004\u0018\u00010=2\n\b\u0002\u0010}\u001a\u0004\u0018\u00010\fH\u0007¢\u0006\u0006\b\u009c\u0001\u0010\u009d\u0001J>\u0010\u009e\u0001\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u00122\n\b\u0002\u0010m\u001a\u0004\u0018\u00010=2\n\b\u0002\u0010}\u001a\u0004\u0018\u00010\fH\u0007¢\u0006\u0006\b\u009e\u0001\u0010\u009d\u0001J!\u0010\u009f\u0001\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\b\u0010@\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0005\b\u009f\u0001\u0010?J\u0017\u0010 \u0001\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0007¢\u0006\u0005\b \u0001\u00109J%\u0010¢\u0001\u001a\b\u0012\u0004\u0012\u00020:0\u000e2\u000b\b\u0002\u0010¡\u0001\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0006\b¢\u0001\u0010£\u0001J\u0017\u0010¤\u0001\u001a\b\u0012\u0004\u0012\u00020:0\u000eH\u0007¢\u0006\u0005\b¤\u0001\u00109J.\u0010¦\u0001\u001a\t\u0012\u0005\u0012\u00030¥\u00010\u000e2\u0007\u0010\u008e\u0001\u001a\u00020\u00022\n\b\u0002\u0010K\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0006\b¦\u0001\u0010§\u0001J \u0010¨\u0001\u001a\b\u0012\u0004\u0012\u00020:0\u000e2\u0007\u0010\u008e\u0001\u001a\u00020\u0002H\u0007¢\u0006\u0005\b¨\u0001\u0010?J\u0018\u0010©\u0001\u001a\t\u0012\u0005\u0012\u00030¥\u00010\u000eH\u0007¢\u0006\u0005\b©\u0001\u00109J\u0017\u0010ª\u0001\u001a\b\u0012\u0004\u0012\u00020:0\u000eH\u0007¢\u0006\u0005\bª\u0001\u00109J$\u0010¬\u0001\u001a\b\u0012\u0004\u0012\u00020\u001c0\u000e2\u000b\b\u0002\u0010«\u0001\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0005\b¬\u0001\u0010?J$\u0010\u00ad\u0001\u001a\b\u0012\u0004\u0012\u00020\u001c0\u000e2\u000b\b\u0002\u0010«\u0001\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0005\b\u00ad\u0001\u0010?J6\u0010®\u0001\u001a\b\u0012\u0004\u0012\u00020\u001c0\u000e2\u0006\u0010+\u001a\u00020\u00022\u0014\b\u0002\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0014H\u0007¢\u0006\u0006\b®\u0001\u0010¯\u0001JX\u0010±\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u008f\u00010\u00120\u000e2\u0006\u0010V\u001a\u00020\t2\u0006\u0010W\u001a\u00020\t2\u0006\u0010R\u001a\u00020Q2\r\u0010U\u001a\t\u0012\u0005\u0012\u00030\u008f\u00010S2\u0010\b\u0002\u0010°\u0001\u001a\t\u0012\u0005\u0012\u00030\u008f\u00010\u0012H\u0007¢\u0006\u0006\b±\u0001\u0010²\u0001J/\u0010´\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030³\u00010\u00120\u000e2\u0006\u0010V\u001a\u00020\t2\u0006\u0010W\u001a\u00020\tH\u0007¢\u0006\u0006\b´\u0001\u0010µ\u0001J/\u0010¶\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030³\u00010\u00120\u000e2\u0006\u0010V\u001a\u00020\t2\u0006\u0010W\u001a\u00020\tH\u0007¢\u0006\u0006\b¶\u0001\u0010µ\u0001J=\u0010¸\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020=0\u00120\u000e2\u0006\u0010V\u001a\u00020\t2\u0006\u0010W\u001a\u00020\t2\r\u0010·\u0001\u001a\b\u0012\u0004\u0012\u00020\u00020\u0012H\u0007¢\u0006\u0006\b¸\u0001\u0010¹\u0001J>\u0010¼\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020=0\u00120\u000e2\u0006\u0010W\u001a\u00020\t2\f\u0010U\u001a\b\u0012\u0004\u0012\u00020=0S2\b\u0010»\u0001\u001a\u00030º\u0001H\u0007¢\u0006\u0006\b¼\u0001\u0010½\u0001J+\u0010¿\u0001\u001a\b\u0012\u0004\u0012\u00020=0\u000e2\u0006\u0010@\u001a\u00020=2\t\u0010¾\u0001\u001a\u0004\u0018\u00010XH\u0007¢\u0006\u0006\b¿\u0001\u0010À\u0001J(\u0010¿\u0001\u001a\b\u0012\u0004\u0012\u00020=0\u000e2\u0006\u0010@\u001a\u00020=2\u0006\u0010K\u001a\u00020\tH\u0007¢\u0006\u0006\b¿\u0001\u0010Á\u0001J\u001f\u0010Â\u0001\u001a\b\u0012\u0004\u0012\u00020=0\u000e2\u0006\u0010@\u001a\u00020=H\u0007¢\u0006\u0005\bÂ\u0001\u0010BJ\u0018\u0010Ã\u0001\u001a\t\u0012\u0005\u0012\u00030\u008f\u00010\u000eH\u0007¢\u0006\u0005\bÃ\u0001\u00109J\u0018\u0010Ä\u0001\u001a\t\u0012\u0005\u0012\u00030\u008f\u00010\u000eH\u0007¢\u0006\u0005\bÄ\u0001\u00109J\u0018\u0010Å\u0001\u001a\t\u0012\u0005\u0012\u00030\u008f\u00010\u000eH\u0007¢\u0006\u0005\bÅ\u0001\u00109J\u0018\u0010Æ\u0001\u001a\t\u0012\u0005\u0012\u00030\u008f\u00010\u000eH\u0007¢\u0006\u0005\bÆ\u0001\u00109J0\u0010Ç\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b\"\b\b\u0000\u0010.*\u00020\u001c2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001bH\u0002¢\u0006\u0006\bÇ\u0001\u0010È\u0001J\u001b\u0010Ê\u0001\u001a\u00020\f2\u0007\u0010É\u0001\u001a\u00020\u001cH\u0002¢\u0006\u0006\bÊ\u0001\u0010Ë\u0001R\u001a\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\u000f\n\u0005\b\u0003\u0010Ì\u0001\u001a\u0006\bÍ\u0001\u0010Î\u0001R\u001a\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\u000f\n\u0005\b\u0004\u0010Ì\u0001\u001a\u0006\bÏ\u0001\u0010Î\u0001R\u0015\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0006\u0010Ð\u0001R\u001c\u0010Ñ\u0001\u001a\u00020\u00028\u0006¢\u0006\u0010\n\u0006\bÑ\u0001\u0010Ì\u0001\u001a\u0006\bÒ\u0001\u0010Î\u0001¨\u0006Ó\u0001"}, m65681d2 = {"Lio/getstream/chat/android/client/channel/ChannelClient;", "", "", "channelType", "channelId", "Lio/getstream/chat/android/client/ChatClient;", "client", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/ChatClient;)V", "", "messageLimit", "memberLimit", "", "state", "Lo23/d;", "Lio/getstream/chat/android/models/Channel;", "get", "(IIZ)Lo23/d;", "", "memberIds", "", "extraData", "create", "(Ljava/util/List;Ljava/util/Map;)Lo23/d;", "Lio/getstream/chat/android/client/query/CreateChannelParams;", "params", "(Lio/getstream/chat/android/client/query/CreateChannelParams;)Lo23/d;", "Lio/getstream/chat/android/client/ChatEventListener;", "Lio/getstream/chat/android/client/events/ChatEvent;", "listener", "Lio/getstream/chat/android/client/utils/observable/Disposable;", "subscribe", "(Lio/getstream/chat/android/client/ChatEventListener;)Lio/getstream/chat/android/client/utils/observable/Disposable;", "", "eventTypes", "subscribeFor", "([Ljava/lang/String;Lio/getstream/chat/android/client/ChatEventListener;)Lio/getstream/chat/android/client/utils/observable/Disposable;", "Landroidx/lifecycle/g0;", "lifecycleOwner", "(Landroidx/lifecycle/g0;[Ljava/lang/String;Lio/getstream/chat/android/client/ChatEventListener;)Lio/getstream/chat/android/client/utils/observable/Disposable;", "Ljava/lang/Class;", "([Ljava/lang/Class;Lio/getstream/chat/android/client/ChatEventListener;)Lio/getstream/chat/android/client/utils/observable/Disposable;", "(Landroidx/lifecycle/g0;[Ljava/lang/Class;Lio/getstream/chat/android/client/ChatEventListener;)Lio/getstream/chat/android/client/utils/observable/Disposable;", "eventType", "subscribeForSingle", "(Ljava/lang/String;Lio/getstream/chat/android/client/ChatEventListener;)Lio/getstream/chat/android/client/utils/observable/Disposable;", "T", "(Ljava/lang/Class;Lio/getstream/chat/android/client/ChatEventListener;)Lio/getstream/chat/android/client/utils/observable/Disposable;", "Lio/getstream/chat/android/client/api/models/QueryChannelRequest;", "request", "query", "(Lio/getstream/chat/android/client/api/models/QueryChannelRequest;)Lo23/d;", "Lio/getstream/chat/android/client/api/models/WatchChannelRequest;", "watch", "(Lio/getstream/chat/android/client/api/models/WatchChannelRequest;)Lo23/d;", "data", "(Ljava/util/Map;)Lo23/d;", "()Lo23/d;", "Ll83/a0;", "stopWatching", "messageId", "Lio/getstream/chat/android/models/Message;", "getMessage", "(Ljava/lang/String;)Lo23/d;", "message", "updateMessage", "(Lio/getstream/chat/android/models/Message;)Lo23/d;", "hard", "deleteMessage", "(Ljava/lang/String;Z)Lo23/d;", "isRetrying", "sendMessage", "(Lio/getstream/chat/android/models/Message;Z)Lo23/d;", "targetId", "reason", "timeout", "banUser", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lo23/d;", "unbanUser", "shadowBanUser", "removeShadowBan", "Lio/getstream/chat/android/models/FilterObject;", "filter", "Lio/getstream/chat/android/models/querysort/QuerySorter;", "Lio/getstream/chat/android/models/BannedUsersSort;", "sort", MapboxMap.QFE_OFFSET, MapboxMap.QFE_LIMIT, "Ljava/util/Date;", "createdAtAfter", "createdAtAfterOrEqual", "createdAtBefore", "createdAtBeforeOrEqual", "Lio/getstream/chat/android/models/BannedUser;", "queryBannedUsers", "(Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;)Lo23/d;", "markMessageRead", "threadId", "markThreadRead", "markUnread", "timestamp", "(Ljava/util/Date;)Lo23/d;", "markThreadUnread", "markRead", "delete", "show", "clearHistory", "hide", "(Z)Lo23/d;", "systemMessage", "truncate", "Ljava/io/File;", "file", "Lio/getstream/chat/android/client/utils/ProgressCallback;", "callback", "Lio/getstream/chat/android/models/UploadedFile;", "sendFile", "(Ljava/io/File;Lio/getstream/chat/android/client/utils/ProgressCallback;)Lo23/d;", "sendImage", QueryParams.URL, "deleteFile", "deleteImage", "Lio/getstream/chat/android/models/Reaction;", "reaction", "enforceUnique", "skipPush", "sendReaction", "(Lio/getstream/chat/android/models/Reaction;ZZ)Lo23/d;", "Lio/getstream/chat/android/client/api/models/SendActionRequest;", "sendAction", "(Lio/getstream/chat/android/client/api/models/SendActionRequest;)Lo23/d;", "reactionType", "deleteReaction", "(Ljava/lang/String;Ljava/lang/String;)Lo23/d;", "getReactions", "(Ljava/lang/String;II)Lo23/d;", "update", "(Lio/getstream/chat/android/models/Message;Ljava/util/Map;)Lo23/d;", "set", "unset", "updatePartial", "(Ljava/util/Map;Ljava/util/List;)Lo23/d;", "userId", "Lio/getstream/chat/android/models/Member;", "partialUpdateMember", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/List;)Lo23/d;", "cooldownTimeInSeconds", "enableSlowMode", "(I)Lo23/d;", "disableSlowMode", "hideHistory", "hideHistoryBefore", "addMembers", "(Ljava/util/List;Lio/getstream/chat/android/models/Message;Ljava/lang/Boolean;Ljava/util/Date;Ljava/lang/Boolean;)Lo23/d;", "Lio/getstream/chat/android/client/query/AddMembersParams;", "(Lio/getstream/chat/android/client/query/AddMembersParams;)Lo23/d;", "removeMembers", "(Ljava/util/List;Lio/getstream/chat/android/models/Message;Ljava/lang/Boolean;)Lo23/d;", "inviteMembers", "acceptInvite", "rejectInvite", "expiration", CommandDefaults.MUTE, "(Ljava/lang/Integer;)Lo23/d;", CommandDefaults.UNMUTE, "Lio/getstream/chat/android/models/Mute;", "muteUser", "(Ljava/lang/String;Ljava/lang/Integer;)Lo23/d;", "unmuteUser", "muteCurrentUser", "unmuteCurrentUser", "parentId", "keystroke", "stopTyping", "sendEvent", "(Ljava/lang/String;Ljava/util/Map;)Lo23/d;", QueryChannelRequest.KEY_MEMBERS, "queryMembers", "(IILio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;Ljava/util/List;)Lo23/d;", "Lio/getstream/chat/android/models/Attachment;", "getFileAttachments", "(II)Lo23/d;", "getImageAttachments", "types", "getMessagesWithAttachments", "(IILjava/util/List;)Lo23/d;", "Lio/getstream/chat/android/client/api/models/PinnedMessagesPagination;", "pagination", "getPinnedMessages", "(ILio/getstream/chat/android/models/querysort/QuerySorter;Lio/getstream/chat/android/client/api/models/PinnedMessagesPagination;)Lo23/d;", "expirationDate", "pinMessage", "(Lio/getstream/chat/android/models/Message;Ljava/util/Date;)Lo23/d;", "(Lio/getstream/chat/android/models/Message;I)Lo23/d;", "unpinMessage", "pin", "unpin", "archive", "unarchive", "filterRelevantEvents", "(Lio/getstream/chat/android/client/ChatEventListener;)Lio/getstream/chat/android/client/ChatEventListener;", NotificationCompat.CATEGORY_EVENT, "isRelevantForChannel", "(Lio/getstream/chat/android/client/events/ChatEvent;)Z", "Ljava/lang/String;", "getChannelType", "()Ljava/lang/String;", "getChannelId", "Lio/getstream/chat/android/client/ChatClient;", "cid", "getCid", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ChannelClient {
    private final String channelId;
    private final String channelType;
    private final String cid;
    private final ChatClient client;

    public ChannelClient(String channelType, String channelId, ChatClient client) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        AbstractC22676k.m65750j(client, "client");
        this.channelType = channelType;
        this.channelId = channelId;
        this.client = client;
        this.cid = AbstractC18489d0.m53370k(channelType, ":", channelId);
    }

    public static /* synthetic */ InterfaceC27474d addMembers$default(ChannelClient channelClient, List list, Message message, Boolean bool, Date date, Boolean bool2, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            message = null;
        }
        if ((i13 & 4) != 0) {
            bool = null;
        }
        if ((i13 & 8) != 0) {
            date = null;
        }
        if ((i13 & 16) != 0) {
            bool2 = null;
        }
        return channelClient.addMembers(list, message, bool, date, bool2);
    }

    public static /* synthetic */ InterfaceC27474d deleteMessage$default(ChannelClient channelClient, String str, boolean z4, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            z4 = false;
        }
        return channelClient.deleteMessage(str, z4);
    }

    private final <T extends ChatEvent> ChatEventListener<T> filterRelevantEvents(ChatEventListener<T> listener) {
        return new C19090h(this, listener, 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void filterRelevantEvents$lambda$0(ChannelClient channelClient, ChatEventListener chatEventListener, ChatEvent event) {
        AbstractC22676k.m65750j(event, "event");
        if (channelClient.isRelevantForChannel(event)) {
            chatEventListener.onEvent(event);
        }
    }

    public static /* synthetic */ InterfaceC27474d get$default(ChannelClient channelClient, int i13, int i14, boolean z4, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            i13 = 0;
        }
        if ((i15 & 2) != 0) {
            i14 = 0;
        }
        if ((i15 & 4) != 0) {
            z4 = false;
        }
        return channelClient.get(i13, i14, z4);
    }

    public static /* synthetic */ InterfaceC27474d hide$default(ChannelClient channelClient, boolean z4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z4 = false;
        }
        return channelClient.hide(z4);
    }

    public static /* synthetic */ InterfaceC27474d inviteMembers$default(ChannelClient channelClient, List list, Message message, Boolean bool, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            message = null;
        }
        if ((i13 & 4) != 0) {
            bool = null;
        }
        return channelClient.inviteMembers(list, message, bool);
    }

    private final boolean isRelevantForChannel(ChatEvent event) {
        if (event instanceof ChannelDeletedEvent) {
            return AbstractC22676k.m65745e(((ChannelDeletedEvent) event).getCid(), this.cid);
        }
        if (event instanceof ChannelHiddenEvent) {
            return AbstractC22676k.m65745e(((ChannelHiddenEvent) event).getCid(), this.cid);
        }
        if (event instanceof ChannelTruncatedEvent) {
            return AbstractC22676k.m65745e(((ChannelTruncatedEvent) event).getCid(), this.cid);
        }
        if (event instanceof ChannelUpdatedEvent) {
            return AbstractC22676k.m65745e(((ChannelUpdatedEvent) event).getCid(), this.cid);
        }
        if (event instanceof ChannelUpdatedByUserEvent) {
            return AbstractC22676k.m65745e(((ChannelUpdatedByUserEvent) event).getCid(), this.cid);
        }
        if (event instanceof ChannelVisibleEvent) {
            return AbstractC22676k.m65745e(((ChannelVisibleEvent) event).getCid(), this.cid);
        }
        if (event instanceof MemberAddedEvent) {
            return AbstractC22676k.m65745e(((MemberAddedEvent) event).getCid(), this.cid);
        }
        if (event instanceof MemberRemovedEvent) {
            return AbstractC22676k.m65745e(((MemberRemovedEvent) event).getCid(), this.cid);
        }
        if (event instanceof MemberUpdatedEvent) {
            return AbstractC22676k.m65745e(((MemberUpdatedEvent) event).getCid(), this.cid);
        }
        if (event instanceof MessageDeletedEvent) {
            return AbstractC22676k.m65745e(((MessageDeletedEvent) event).getCid(), this.cid);
        }
        if (event instanceof MessageReadEvent) {
            return AbstractC22676k.m65745e(((MessageReadEvent) event).getCid(), this.cid);
        }
        if (event instanceof MessageDeliveredEvent) {
            return AbstractC22676k.m65745e(((MessageDeliveredEvent) event).getCid(), this.cid);
        }
        if (event instanceof MessageUpdatedEvent) {
            return AbstractC22676k.m65745e(((MessageUpdatedEvent) event).getCid(), this.cid);
        }
        if (event instanceof NewMessageEvent) {
            return AbstractC22676k.m65745e(((NewMessageEvent) event).getCid(), this.cid);
        }
        if (event instanceof NotificationAddedToChannelEvent) {
            return AbstractC22676k.m65745e(((NotificationAddedToChannelEvent) event).getCid(), this.cid);
        }
        if (event instanceof NotificationChannelDeletedEvent) {
            return AbstractC22676k.m65745e(((NotificationChannelDeletedEvent) event).getCid(), this.cid);
        }
        if (event instanceof NotificationChannelTruncatedEvent) {
            return AbstractC22676k.m65745e(((NotificationChannelTruncatedEvent) event).getCid(), this.cid);
        }
        if (event instanceof NotificationInviteAcceptedEvent) {
            return AbstractC22676k.m65745e(((NotificationInviteAcceptedEvent) event).getCid(), this.cid);
        }
        if (event instanceof NotificationInviteRejectedEvent) {
            return AbstractC22676k.m65745e(((NotificationInviteRejectedEvent) event).getCid(), this.cid);
        }
        if (event instanceof NotificationInvitedEvent) {
            return AbstractC22676k.m65745e(((NotificationInvitedEvent) event).getCid(), this.cid);
        }
        if (event instanceof NotificationMarkReadEvent) {
            return AbstractC22676k.m65745e(((NotificationMarkReadEvent) event).getCid(), this.cid);
        }
        if (event instanceof NotificationMarkUnreadEvent) {
            return AbstractC22676k.m65745e(((NotificationMarkUnreadEvent) event).getCid(), this.cid);
        }
        if (event instanceof NotificationMessageNewEvent) {
            return AbstractC22676k.m65745e(((NotificationMessageNewEvent) event).getCid(), this.cid);
        }
        if (event instanceof NotificationThreadMessageNewEvent) {
            return AbstractC22676k.m65745e(((NotificationThreadMessageNewEvent) event).getCid(), this.cid);
        }
        if (event instanceof NotificationRemovedFromChannelEvent) {
            return AbstractC22676k.m65745e(((NotificationRemovedFromChannelEvent) event).getCid(), this.cid);
        }
        if (event instanceof ReactionDeletedEvent) {
            return AbstractC22676k.m65745e(((ReactionDeletedEvent) event).getCid(), this.cid);
        }
        if (event instanceof ReactionNewEvent) {
            return AbstractC22676k.m65745e(((ReactionNewEvent) event).getCid(), this.cid);
        }
        if (event instanceof ReactionUpdateEvent) {
            return AbstractC22676k.m65745e(((ReactionUpdateEvent) event).getCid(), this.cid);
        }
        if (event instanceof TypingStartEvent) {
            return AbstractC22676k.m65745e(((TypingStartEvent) event).getCid(), this.cid);
        }
        if (event instanceof TypingStopEvent) {
            return AbstractC22676k.m65745e(((TypingStopEvent) event).getCid(), this.cid);
        }
        if (event instanceof ChannelUserBannedEvent) {
            return AbstractC22676k.m65745e(((ChannelUserBannedEvent) event).getCid(), this.cid);
        }
        if (event instanceof UserStartWatchingEvent) {
            return AbstractC22676k.m65745e(((UserStartWatchingEvent) event).getCid(), this.cid);
        }
        if (event instanceof UserStopWatchingEvent) {
            return AbstractC22676k.m65745e(((UserStopWatchingEvent) event).getCid(), this.cid);
        }
        if (event instanceof ChannelUserUnbannedEvent) {
            return AbstractC22676k.m65745e(((ChannelUserUnbannedEvent) event).getCid(), this.cid);
        }
        if (event instanceof PollClosedEvent) {
            return AbstractC22676k.m65745e(((PollClosedEvent) event).getCid(), this.cid);
        }
        if (event instanceof PollDeletedEvent) {
            return AbstractC22676k.m65745e(((PollDeletedEvent) event).getCid(), this.cid);
        }
        if (event instanceof PollUpdatedEvent) {
            return AbstractC22676k.m65745e(((PollUpdatedEvent) event).getCid(), this.cid);
        }
        if (event instanceof VoteCastedEvent) {
            return AbstractC22676k.m65745e(((VoteCastedEvent) event).getCid(), this.cid);
        }
        if (event instanceof VoteChangedEvent) {
            return AbstractC22676k.m65745e(((VoteChangedEvent) event).getCid(), this.cid);
        }
        if (event instanceof VoteRemovedEvent) {
            return AbstractC22676k.m65745e(((VoteRemovedEvent) event).getCid(), this.cid);
        }
        if (event instanceof AnswerCastedEvent) {
            return AbstractC22676k.m65745e(((AnswerCastedEvent) event).getCid(), this.cid);
        }
        if (event instanceof UnknownEvent) {
            return AbstractC22676k.m65745e(((UnknownEvent) event).getRawData().get("cid"), this.cid);
        }
        if (event instanceof AIIndicatorUpdatedEvent) {
            return AbstractC22676k.m65745e(((AIIndicatorUpdatedEvent) event).getCid(), this.cid);
        }
        if (event instanceof AIIndicatorClearEvent) {
            return AbstractC22676k.m65745e(((AIIndicatorClearEvent) event).getCid(), this.cid);
        }
        if (event instanceof AIIndicatorStopEvent) {
            return AbstractC22676k.m65745e(((AIIndicatorStopEvent) event).getCid(), this.cid);
        }
        if (event instanceof DraftMessageUpdatedEvent) {
            return AbstractC22676k.m65745e(((DraftMessageUpdatedEvent) event).getDraftMessage().getCid(), this.cid);
        }
        if (event instanceof DraftMessageDeletedEvent) {
            return AbstractC22676k.m65745e(((DraftMessageDeletedEvent) event).getDraftMessage().getCid(), this.cid);
        }
        if (event instanceof ReminderCreatedEvent) {
            return AbstractC22676k.m65745e(((ReminderCreatedEvent) event).getCid(), this.cid);
        }
        if (event instanceof ReminderUpdatedEvent) {
            return AbstractC22676k.m65745e(((ReminderUpdatedEvent) event).getCid(), this.cid);
        }
        if (event instanceof ReminderDeletedEvent) {
            return AbstractC22676k.m65745e(((ReminderDeletedEvent) event).getCid(), this.cid);
        }
        if (event instanceof NotificationReminderDueEvent) {
            return AbstractC22676k.m65745e(((NotificationReminderDueEvent) event).getCid(), this.cid);
        }
        if (event instanceof UserMessagesDeletedEvent) {
            return AbstractC22676k.m65745e(((UserMessagesDeletedEvent) event).getCid(), this.cid);
        }
        if (event instanceof ThreadUpdatedEvent) {
            return AbstractC22676k.m65745e(((ThreadUpdatedEvent) event).getCid(), this.cid);
        }
        if ((event instanceof HealthEvent) || (event instanceof NotificationChannelMutesUpdatedEvent) || (event instanceof NotificationMutesUpdatedEvent) || (event instanceof GlobalUserBannedEvent) || (event instanceof UserDeletedEvent) || (event instanceof UserPresenceChangedEvent) || (event instanceof GlobalUserUnbannedEvent) || (event instanceof UserUpdatedEvent) || (event instanceof ConnectedEvent) || (event instanceof ConnectionErrorEvent) || (event instanceof ConnectingEvent) || (event instanceof DisconnectedEvent) || (event instanceof ErrorEvent) || (event instanceof MarkAllReadEvent)) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static /* synthetic */ InterfaceC27474d keystroke$default(ChannelClient channelClient, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = null;
        }
        return channelClient.keystroke(str);
    }

    public static /* synthetic */ InterfaceC27474d mute$default(ChannelClient channelClient, Integer num, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            num = null;
        }
        return channelClient.mute(num);
    }

    public static /* synthetic */ InterfaceC27474d muteUser$default(ChannelClient channelClient, String str, Integer num, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            num = null;
        }
        return channelClient.muteUser(str, num);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InterfaceC27474d partialUpdateMember$default(ChannelClient channelClient, String str, Map map, List list, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            map = C25272z.f99163w;
        }
        if ((i13 & 4) != 0) {
            list = C25271y.f99162w;
        }
        return channelClient.partialUpdateMember(str, map, list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InterfaceC27474d queryBannedUsers$default(ChannelClient channelClient, FilterObject filterObject, QuerySorter querySorter, Integer num, Integer num2, Date date, Date date2, Date date3, Date date4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            filterObject = null;
        }
        if ((i13 & 2) != 0) {
            querySorter = QuerySortByField.INSTANCE.ascByName("created_at");
        }
        if ((i13 & 4) != 0) {
            num = null;
        }
        if ((i13 & 8) != 0) {
            num2 = null;
        }
        if ((i13 & 16) != 0) {
            date = null;
        }
        if ((i13 & 32) != 0) {
            date2 = null;
        }
        if ((i13 & 64) != 0) {
            date3 = null;
        }
        if ((i13 & 128) != 0) {
            date4 = null;
        }
        return channelClient.queryBannedUsers(filterObject, querySorter, num, num2, date, date2, date3, date4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InterfaceC27474d queryMembers$default(ChannelClient channelClient, int i13, int i14, FilterObject filterObject, QuerySorter querySorter, List list, int i15, Object obj) {
        if ((i15 & 16) != 0) {
            list = C25271y.f99162w;
        }
        return channelClient.queryMembers(i13, i14, filterObject, querySorter, list);
    }

    public static /* synthetic */ InterfaceC27474d removeMembers$default(ChannelClient channelClient, List list, Message message, Boolean bool, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            message = null;
        }
        if ((i13 & 4) != 0) {
            bool = null;
        }
        return channelClient.removeMembers(list, message, bool);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InterfaceC27474d sendEvent$default(ChannelClient channelClient, String str, Map map, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            map = C25272z.f99163w;
        }
        return channelClient.sendEvent(str, map);
    }

    public static /* synthetic */ InterfaceC27474d sendFile$default(ChannelClient channelClient, File file, ProgressCallback progressCallback, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            progressCallback = null;
        }
        return channelClient.sendFile(file, progressCallback);
    }

    public static /* synthetic */ InterfaceC27474d sendImage$default(ChannelClient channelClient, File file, ProgressCallback progressCallback, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            progressCallback = null;
        }
        return channelClient.sendImage(file, progressCallback);
    }

    public static /* synthetic */ InterfaceC27474d sendMessage$default(ChannelClient channelClient, Message message, boolean z4, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            z4 = false;
        }
        return channelClient.sendMessage(message, z4);
    }

    public static /* synthetic */ InterfaceC27474d sendReaction$default(ChannelClient channelClient, Reaction reaction, boolean z4, boolean z13, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            z4 = false;
        }
        if ((i13 & 4) != 0) {
            z13 = false;
        }
        return channelClient.sendReaction(reaction, z4, z13);
    }

    public static /* synthetic */ InterfaceC27474d stopTyping$default(ChannelClient channelClient, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = null;
        }
        return channelClient.stopTyping(str);
    }

    public static /* synthetic */ InterfaceC27474d truncate$default(ChannelClient channelClient, Message message, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            message = null;
        }
        return channelClient.truncate(message);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InterfaceC27474d update$default(ChannelClient channelClient, Message message, Map map, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            message = null;
        }
        if ((i13 & 2) != 0) {
            map = C25272z.f99163w;
        }
        return channelClient.update(message, map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InterfaceC27474d updatePartial$default(ChannelClient channelClient, Map map, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            map = C25272z.f99163w;
        }
        if ((i13 & 2) != 0) {
            list = C25271y.f99162w;
        }
        return channelClient.updatePartial(map, list);
    }

    public final InterfaceC27474d acceptInvite(String message) {
        return this.client.acceptInvite(this.channelType, this.channelId, message);
    }

    public final InterfaceC27474d addMembers(List<String> memberIds, Message systemMessage, Boolean hideHistory, Date hideHistoryBefore, Boolean skipPush) {
        AbstractC22676k.m65750j(memberIds, "memberIds");
        return this.client.addMembers(this.channelType, this.channelId, memberIds, systemMessage, hideHistory, hideHistoryBefore, skipPush);
    }

    public final InterfaceC27474d archive() {
        return this.client.archiveChannel(this.channelType, this.channelId);
    }

    public final InterfaceC27474d banUser(String targetId, String reason, Integer timeout) {
        AbstractC22676k.m65750j(targetId, "targetId");
        return this.client.banUser(targetId, this.channelType, this.channelId, reason, timeout);
    }

    public final InterfaceC27474d create(List<String> memberIds, Map<String, ? extends Object> extraData) {
        AbstractC22676k.m65750j(memberIds, "memberIds");
        AbstractC22676k.m65750j(extraData, "extraData");
        return this.client.createChannel(this.channelType, this.channelId, memberIds, extraData);
    }

    public final InterfaceC27474d delete() {
        return this.client.deleteChannel(this.channelType, this.channelId);
    }

    public final InterfaceC27474d deleteFile(String url) {
        AbstractC22676k.m65750j(url, "url");
        return this.client.deleteFile(this.channelType, this.channelId, url);
    }

    public final InterfaceC27474d deleteImage(String url) {
        AbstractC22676k.m65750j(url, "url");
        return this.client.deleteImage(this.channelType, this.channelId, url);
    }

    public final InterfaceC27474d deleteMessage(String messageId) {
        AbstractC22676k.m65750j(messageId, "messageId");
        return deleteMessage(messageId, false);
    }

    public final InterfaceC27474d deleteReaction(String messageId, String reactionType) {
        AbstractC22676k.m65750j(messageId, "messageId");
        AbstractC22676k.m65750j(reactionType, "reactionType");
        return this.client.deleteReaction(messageId, reactionType, this.cid);
    }

    public final InterfaceC27474d disableSlowMode() {
        return this.client.disableSlowMode(this.channelType, this.channelId);
    }

    public final InterfaceC27474d enableSlowMode(int cooldownTimeInSeconds) {
        return this.client.enableSlowMode(this.channelType, this.channelId, cooldownTimeInSeconds);
    }

    public final InterfaceC27474d get(int messageLimit, int memberLimit, boolean state) {
        return this.client.getChannel(this.cid, messageLimit, memberLimit, state);
    }

    public final String getChannelId() {
        return this.channelId;
    }

    public final String getChannelType() {
        return this.channelType;
    }

    public final String getCid() {
        return this.cid;
    }

    public final InterfaceC27474d getFileAttachments(int offset, int limit) {
        return this.client.getFileAttachments(this.channelType, this.channelId, offset, limit);
    }

    public final InterfaceC27474d getImageAttachments(int offset, int limit) {
        return this.client.getImageAttachments(this.channelType, this.channelId, offset, limit);
    }

    public final InterfaceC27474d getMessage(String messageId) {
        AbstractC22676k.m65750j(messageId, "messageId");
        return this.client.getMessage(messageId);
    }

    public final InterfaceC27474d getMessagesWithAttachments(int offset, int limit, List<String> types) {
        AbstractC22676k.m65750j(types, "types");
        return this.client.getMessagesWithAttachments(this.channelType, this.channelId, offset, limit, types);
    }

    public final InterfaceC27474d getPinnedMessages(int limit, QuerySorter<Message> sort, PinnedMessagesPagination pagination) {
        AbstractC22676k.m65750j(sort, "sort");
        AbstractC22676k.m65750j(pagination, "pagination");
        return this.client.getPinnedMessages(this.channelType, this.channelId, limit, sort, pagination);
    }

    public final InterfaceC27474d getReactions(String messageId, int offset, int limit) {
        AbstractC22676k.m65750j(messageId, "messageId");
        return this.client.getReactions(messageId, offset, limit);
    }

    public final InterfaceC27474d hide(boolean clearHistory) {
        return this.client.hideChannel(this.channelType, this.channelId, clearHistory);
    }

    public final InterfaceC27474d inviteMembers(List<String> memberIds, Message systemMessage, Boolean skipPush) {
        AbstractC22676k.m65750j(memberIds, "memberIds");
        return this.client.inviteMembers(this.channelType, this.channelId, memberIds, systemMessage, skipPush);
    }

    public final InterfaceC27474d keystroke() {
        return keystroke$default(this, null, 1, null);
    }

    public final InterfaceC27474d markMessageRead(String messageId) {
        AbstractC22676k.m65750j(messageId, "messageId");
        return this.client.markMessageRead(this.channelType, this.channelId, messageId);
    }

    public final InterfaceC27474d markRead() {
        return this.client.markRead(this.channelType, this.channelId);
    }

    public final InterfaceC27474d markThreadRead(String threadId) {
        AbstractC22676k.m65750j(threadId, "threadId");
        return this.client.markThreadRead(this.channelType, this.channelId, threadId);
    }

    public final InterfaceC27474d markThreadUnread(String threadId) {
        AbstractC22676k.m65750j(threadId, "threadId");
        return this.client.markThreadUnread(this.channelType, this.channelId, threadId);
    }

    public final InterfaceC27474d markUnread(String messageId) {
        AbstractC22676k.m65750j(messageId, "messageId");
        return this.client.markUnread(this.channelType, this.channelId, messageId);
    }

    public final InterfaceC27474d mute() {
        return mute$default(this, null, 1, null);
    }

    public final InterfaceC27474d muteCurrentUser() {
        return this.client.muteCurrentUser();
    }

    public final InterfaceC27474d muteUser(String userId) {
        AbstractC22676k.m65750j(userId, "userId");
        return muteUser(userId, null);
    }

    public final InterfaceC27474d partialUpdateMember(String userId, Map<String, ? extends Object> set, List<String> unset) {
        AbstractC22676k.m65750j(userId, "userId");
        AbstractC22676k.m65750j(set, "set");
        AbstractC22676k.m65750j(unset, "unset");
        return this.client.partialUpdateMember(this.channelType, this.channelId, userId, set, unset);
    }

    public final InterfaceC27474d pin() {
        return this.client.pinChannel(this.channelType, this.channelId);
    }

    public final InterfaceC27474d pinMessage(Message message, Date expirationDate) {
        AbstractC22676k.m65750j(message, "message");
        return this.client.pinMessage(message, expirationDate);
    }

    public final InterfaceC27474d query(QueryChannelRequest request) {
        AbstractC22676k.m65750j(request, "request");
        return ChatClient.queryChannel$default(this.client, this.channelType, this.channelId, request, false, 8, null);
    }

    public final InterfaceC27474d queryBannedUsers() {
        return queryBannedUsers$default(this, null, null, null, null, null, null, null, null, 255, null);
    }

    public final InterfaceC27474d queryMembers(int offset, int limit, FilterObject filter, QuerySorter<Member> sort, List<Member> members) {
        AbstractC22676k.m65750j(filter, "filter");
        AbstractC22676k.m65750j(sort, "sort");
        AbstractC22676k.m65750j(members, "members");
        return this.client.queryMembers(this.channelType, this.channelId, offset, limit, filter, sort, members);
    }

    public final InterfaceC27474d rejectInvite() {
        return this.client.rejectInvite(this.channelType, this.channelId);
    }

    public final InterfaceC27474d removeMembers(List<String> memberIds, Message systemMessage, Boolean skipPush) {
        AbstractC22676k.m65750j(memberIds, "memberIds");
        return this.client.removeMembers(this.channelType, this.channelId, memberIds, systemMessage, skipPush);
    }

    public final InterfaceC27474d removeShadowBan(String targetId) {
        AbstractC22676k.m65750j(targetId, "targetId");
        return this.client.removeShadowBan(targetId, this.channelType, this.channelId);
    }

    public final InterfaceC27474d sendAction(SendActionRequest request) {
        AbstractC22676k.m65750j(request, "request");
        return this.client.sendAction(request);
    }

    public final InterfaceC27474d sendEvent(String eventType, Map<Object, ? extends Object> extraData) {
        AbstractC22676k.m65750j(eventType, "eventType");
        AbstractC22676k.m65750j(extraData, "extraData");
        return this.client.sendEvent(eventType, this.channelType, this.channelId, extraData);
    }

    public final InterfaceC27474d sendFile(File file) {
        AbstractC22676k.m65750j(file, "file");
        return sendFile(file, null);
    }

    public final InterfaceC27474d sendImage(File file) {
        AbstractC22676k.m65750j(file, "file");
        return sendImage(file, null);
    }

    public final InterfaceC27474d sendMessage(Message message) {
        AbstractC22676k.m65750j(message, "message");
        return sendMessage(message, false);
    }

    public final InterfaceC27474d sendReaction(Reaction reaction) {
        AbstractC22676k.m65750j(reaction, "reaction");
        return sendReaction$default(this, reaction, false, false, 6, null);
    }

    public final InterfaceC27474d shadowBanUser(String targetId, String reason, Integer timeout) {
        AbstractC22676k.m65750j(targetId, "targetId");
        return this.client.shadowBanUser(targetId, this.channelType, this.channelId, reason, timeout);
    }

    public final InterfaceC27474d show() {
        return this.client.showChannel(this.channelType, this.channelId);
    }

    public final InterfaceC27474d stopTyping() {
        return stopTyping$default(this, null, 1, null);
    }

    public final InterfaceC27474d stopWatching() {
        return this.client.stopWatching(this.channelType, this.channelId);
    }

    public final Disposable subscribe(ChatEventListener<ChatEvent> listener) {
        AbstractC22676k.m65750j(listener, "listener");
        return this.client.subscribe(new C19090h(this, listener, 2));
    }

    public final Disposable subscribeFor(String[] eventTypes, ChatEventListener<ChatEvent> listener) {
        AbstractC22676k.m65750j(eventTypes, "eventTypes");
        AbstractC22676k.m65750j(listener, "listener");
        return this.client.subscribeFor((String[]) Arrays.copyOf(eventTypes, eventTypes.length), new C19090h(this, listener, 2));
    }

    public final Disposable subscribeForSingle(String eventType, ChatEventListener<ChatEvent> listener) {
        AbstractC22676k.m65750j(eventType, "eventType");
        AbstractC22676k.m65750j(listener, "listener");
        return this.client.subscribeForSingle(eventType, new C19090h(this, listener, 2));
    }

    public final InterfaceC27474d truncate() {
        return truncate$default(this, null, 1, null);
    }

    public final InterfaceC27474d unarchive() {
        return this.client.unarchiveChannel(this.channelType, this.channelId);
    }

    public final InterfaceC27474d unbanUser(String targetId) {
        AbstractC22676k.m65750j(targetId, "targetId");
        return this.client.unbanUser(targetId, this.channelType, this.channelId);
    }

    public final InterfaceC27474d unmute() {
        return this.client.unmuteChannel(this.channelType, this.channelId);
    }

    public final InterfaceC27474d unmuteCurrentUser() {
        return this.client.unmuteCurrentUser();
    }

    public final InterfaceC27474d unmuteUser(String userId) {
        AbstractC22676k.m65750j(userId, "userId");
        return this.client.unmuteUser(userId);
    }

    public final InterfaceC27474d unpin() {
        return this.client.unpinChannel(this.channelType, this.channelId);
    }

    public final InterfaceC27474d unpinMessage(Message message) {
        AbstractC22676k.m65750j(message, "message");
        return this.client.unpinMessage(message);
    }

    public final InterfaceC27474d update(Message message, Map<String, ? extends Object> extraData) {
        AbstractC22676k.m65750j(extraData, "extraData");
        return this.client.updateChannel(this.channelType, this.channelId, message, extraData);
    }

    public final InterfaceC27474d updateMessage(Message message) {
        AbstractC22676k.m65750j(message, "message");
        return this.client.updateMessage(message);
    }

    public final InterfaceC27474d updatePartial(Map<String, ? extends Object> set, List<String> unset) {
        AbstractC22676k.m65750j(set, "set");
        AbstractC22676k.m65750j(unset, "unset");
        return this.client.updateChannelPartial(this.channelType, this.channelId, set, unset);
    }

    public final InterfaceC27474d watch(WatchChannelRequest request) {
        AbstractC22676k.m65750j(request, "request");
        return ChatClient.queryChannel$default(this.client, this.channelType, this.channelId, request, false, 8, null);
    }

    public final InterfaceC27474d deleteMessage(String messageId, boolean hard) {
        AbstractC22676k.m65750j(messageId, "messageId");
        return this.client.deleteMessage(messageId, hard);
    }

    public final InterfaceC27474d keystroke(String parentId) {
        return this.client.keystroke(this.channelType, this.channelId, parentId);
    }

    public final InterfaceC27474d markUnread(Date timestamp) {
        AbstractC22676k.m65750j(timestamp, "timestamp");
        return this.client.markUnread(this.channelType, this.channelId, timestamp);
    }

    public final InterfaceC27474d mute(Integer expiration) {
        return this.client.muteChannel(this.channelType, this.channelId, expiration);
    }

    public final InterfaceC27474d muteUser(String userId, Integer timeout) {
        AbstractC22676k.m65750j(userId, "userId");
        return this.client.muteUser(userId, timeout);
    }

    public final InterfaceC27474d pinMessage(Message message, int timeout) {
        AbstractC22676k.m65750j(message, "message");
        return this.client.pinMessage(message, timeout);
    }

    public final InterfaceC27474d queryBannedUsers(FilterObject filterObject) {
        return queryBannedUsers$default(this, filterObject, null, null, null, null, null, null, null, 254, null);
    }

    public final InterfaceC27474d sendFile(File file, ProgressCallback callback) {
        AbstractC22676k.m65750j(file, "file");
        return this.client.sendFile(this.channelType, this.channelId, file, callback);
    }

    public final InterfaceC27474d sendImage(File file, ProgressCallback callback) {
        AbstractC22676k.m65750j(file, "file");
        return this.client.sendImage(this.channelType, this.channelId, file, callback);
    }

    public final InterfaceC27474d sendMessage(Message message, boolean isRetrying) {
        AbstractC22676k.m65750j(message, "message");
        return this.client.sendMessage(this.channelType, this.channelId, message, isRetrying);
    }

    public final InterfaceC27474d sendReaction(Reaction reaction, boolean z4) {
        AbstractC22676k.m65750j(reaction, "reaction");
        return sendReaction$default(this, reaction, z4, false, 4, null);
    }

    public final InterfaceC27474d stopTyping(String parentId) {
        return this.client.stopTyping(this.channelType, this.channelId, parentId);
    }

    public final InterfaceC27474d truncate(Message systemMessage) {
        return this.client.truncateChannel(this.channelType, this.channelId, systemMessage);
    }

    public final InterfaceC27474d watch(Map<String, ? extends Object> data) {
        AbstractC22676k.m65750j(data, "data");
        WatchChannelRequest watchChannelRequest = new WatchChannelRequest();
        watchChannelRequest.getData().putAll(data);
        return watch(watchChannelRequest);
    }

    public final InterfaceC27474d queryBannedUsers(FilterObject filterObject, QuerySorter<BannedUsersSort> sort) {
        AbstractC22676k.m65750j(sort, "sort");
        return queryBannedUsers$default(this, filterObject, sort, null, null, null, null, null, null, 252, null);
    }

    public final InterfaceC27474d sendReaction(Reaction reaction, boolean enforceUnique, boolean skipPush) {
        AbstractC22676k.m65750j(reaction, "reaction");
        return this.client.sendReaction(reaction, enforceUnique, this.cid, skipPush);
    }

    public final InterfaceC27474d queryBannedUsers(FilterObject filterObject, QuerySorter<BannedUsersSort> sort, Integer num) {
        AbstractC22676k.m65750j(sort, "sort");
        return queryBannedUsers$default(this, filterObject, sort, num, null, null, null, null, null, 248, null);
    }

    public final Disposable subscribeFor(InterfaceC1585g0 lifecycleOwner, String[] eventTypes, ChatEventListener<ChatEvent> listener) {
        AbstractC22676k.m65750j(lifecycleOwner, "lifecycleOwner");
        AbstractC22676k.m65750j(eventTypes, "eventTypes");
        AbstractC22676k.m65750j(listener, "listener");
        return this.client.subscribeFor(lifecycleOwner, (String[]) Arrays.copyOf(eventTypes, eventTypes.length), new C19090h(this, listener, 2));
    }

    public final <T extends ChatEvent> Disposable subscribeForSingle(Class<T> eventType, ChatEventListener<T> listener) {
        AbstractC22676k.m65750j(eventType, "eventType");
        AbstractC22676k.m65750j(listener, "listener");
        return this.client.subscribeForSingle(eventType, new C19090h(this, listener, 2));
    }

    public final InterfaceC27474d addMembers(AddMembersParams params) {
        AbstractC22676k.m65750j(params, "params");
        return this.client.addMembers(this.channelType, this.channelId, params);
    }

    public final InterfaceC27474d create(CreateChannelParams params) {
        AbstractC22676k.m65750j(params, "params");
        return this.client.createChannel(this.channelType, this.channelId, params);
    }

    public final InterfaceC27474d queryBannedUsers(FilterObject filterObject, QuerySorter<BannedUsersSort> sort, Integer num, Integer num2) {
        AbstractC22676k.m65750j(sort, "sort");
        return queryBannedUsers$default(this, filterObject, sort, num, num2, null, null, null, null, 240, null);
    }

    public final InterfaceC27474d watch() {
        return ChatClient.queryChannel$default(this.client, this.channelType, this.channelId, new WatchChannelRequest(), false, 8, null);
    }

    public final InterfaceC27474d queryBannedUsers(FilterObject filterObject, QuerySorter<BannedUsersSort> sort, Integer num, Integer num2, Date date) {
        AbstractC22676k.m65750j(sort, "sort");
        return queryBannedUsers$default(this, filterObject, sort, num, num2, date, null, null, null, 224, null);
    }

    public final InterfaceC27474d queryBannedUsers(FilterObject filterObject, QuerySorter<BannedUsersSort> sort, Integer num, Integer num2, Date date, Date date2) {
        AbstractC22676k.m65750j(sort, "sort");
        return queryBannedUsers$default(this, filterObject, sort, num, num2, date, date2, null, null, 192, null);
    }

    public final InterfaceC27474d queryBannedUsers(FilterObject filterObject, QuerySorter<BannedUsersSort> sort, Integer num, Integer num2, Date date, Date date2, Date date3) {
        AbstractC22676k.m65750j(sort, "sort");
        return queryBannedUsers$default(this, filterObject, sort, num, num2, date, date2, date3, null, 128, null);
    }

    public final Disposable subscribeFor(Class<? extends ChatEvent>[] eventTypes, ChatEventListener<ChatEvent> listener) {
        AbstractC22676k.m65750j(eventTypes, "eventTypes");
        AbstractC22676k.m65750j(listener, "listener");
        return this.client.subscribeFor((Class<? extends ChatEvent>[]) Arrays.copyOf(eventTypes, eventTypes.length), new C19090h(this, listener, 2));
    }

    public final InterfaceC27474d queryBannedUsers(FilterObject filter, QuerySorter<BannedUsersSort> sort, Integer offset, Integer limit, Date createdAtAfter, Date createdAtAfterOrEqual, Date createdAtBefore, Date createdAtBeforeOrEqual) {
        FilterObject filterObjectAnd;
        AbstractC22676k.m65750j(sort, "sort");
        FilterObject filterObjectM54979eq = Filters.m54979eq("channel_cid", this.cid);
        return this.client.queryBannedUsers((filter == null || (filterObjectAnd = Filters.and(filterObjectM54979eq, filter)) == null) ? filterObjectM54979eq : filterObjectAnd, sort, offset, limit, createdAtAfter, createdAtAfterOrEqual, createdAtBefore, createdAtBeforeOrEqual);
    }

    public final Disposable subscribeFor(InterfaceC1585g0 lifecycleOwner, Class<? extends ChatEvent>[] eventTypes, ChatEventListener<ChatEvent> listener) {
        AbstractC22676k.m65750j(lifecycleOwner, "lifecycleOwner");
        AbstractC22676k.m65750j(eventTypes, "eventTypes");
        AbstractC22676k.m65750j(listener, "listener");
        return this.client.subscribeFor(lifecycleOwner, (Class<? extends ChatEvent>[]) Arrays.copyOf(eventTypes, eventTypes.length), new C19090h(this, listener, 2));
    }
}
