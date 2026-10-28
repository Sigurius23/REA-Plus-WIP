package io.getstream.chat.android.client.parser2.adapters;

import androidx.room.AbstractC1772c1;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.whoop.service.network.model.UserState;
import io.getstream.chat.android.client.api2.model.dto.AIIndicatorClearEventDto;
import io.getstream.chat.android.client.api2.model.dto.AIIndicatorStopEventDto;
import io.getstream.chat.android.client.api2.model.dto.AIIndicatorUpdatedEventDto;
import io.getstream.chat.android.client.api2.model.dto.AnswerCastedEventDto;
import io.getstream.chat.android.client.api2.model.dto.ChannelDeletedEventDto;
import io.getstream.chat.android.client.api2.model.dto.ChannelHiddenEventDto;
import io.getstream.chat.android.client.api2.model.dto.ChannelTruncatedEventDto;
import io.getstream.chat.android.client.api2.model.dto.ChannelUpdatedByUserEventDto;
import io.getstream.chat.android.client.api2.model.dto.ChannelUpdatedEventDto;
import io.getstream.chat.android.client.api2.model.dto.ChannelUserBannedEventDto;
import io.getstream.chat.android.client.api2.model.dto.ChannelUserUnbannedEventDto;
import io.getstream.chat.android.client.api2.model.dto.ChannelVisibleEventDto;
import io.getstream.chat.android.client.api2.model.dto.ChatEventDto;
import io.getstream.chat.android.client.api2.model.dto.ConnectedEventDto;
import io.getstream.chat.android.client.api2.model.dto.ConnectionErrorEventDto;
import io.getstream.chat.android.client.api2.model.dto.DownstreamUserDto;
import io.getstream.chat.android.client.api2.model.dto.DraftMessageDeletedEventDto;
import io.getstream.chat.android.client.api2.model.dto.DraftMessageUpdatedEventDto;
import io.getstream.chat.android.client.api2.model.dto.GlobalUserBannedEventDto;
import io.getstream.chat.android.client.api2.model.dto.GlobalUserUnbannedEventDto;
import io.getstream.chat.android.client.api2.model.dto.HealthEventDto;
import io.getstream.chat.android.client.api2.model.dto.MarkAllReadEventDto;
import io.getstream.chat.android.client.api2.model.dto.MemberAddedEventDto;
import io.getstream.chat.android.client.api2.model.dto.MemberRemovedEventDto;
import io.getstream.chat.android.client.api2.model.dto.MemberUpdatedEventDto;
import io.getstream.chat.android.client.api2.model.dto.MessageDeletedEventDto;
import io.getstream.chat.android.client.api2.model.dto.MessageDeliveredEventDto;
import io.getstream.chat.android.client.api2.model.dto.MessageReadEventDto;
import io.getstream.chat.android.client.api2.model.dto.MessageUpdatedEventDto;
import io.getstream.chat.android.client.api2.model.dto.NewMessageEventDto;
import io.getstream.chat.android.client.api2.model.dto.NotificationAddedToChannelEventDto;
import io.getstream.chat.android.client.api2.model.dto.NotificationChannelDeletedEventDto;
import io.getstream.chat.android.client.api2.model.dto.NotificationChannelMutesUpdatedEventDto;
import io.getstream.chat.android.client.api2.model.dto.NotificationChannelTruncatedEventDto;
import io.getstream.chat.android.client.api2.model.dto.NotificationInviteAcceptedEventDto;
import io.getstream.chat.android.client.api2.model.dto.NotificationInviteRejectedEventDto;
import io.getstream.chat.android.client.api2.model.dto.NotificationInvitedEventDto;
import io.getstream.chat.android.client.api2.model.dto.NotificationMarkReadEventDto;
import io.getstream.chat.android.client.api2.model.dto.NotificationMarkUnreadEventDto;
import io.getstream.chat.android.client.api2.model.dto.NotificationMessageNewEventDto;
import io.getstream.chat.android.client.api2.model.dto.NotificationMutesUpdatedEventDto;
import io.getstream.chat.android.client.api2.model.dto.NotificationReminderDueEventDto;
import io.getstream.chat.android.client.api2.model.dto.NotificationRemovedFromChannelEventDto;
import io.getstream.chat.android.client.api2.model.dto.NotificationThreadMessageNewEventDto;
import io.getstream.chat.android.client.api2.model.dto.PollClosedEventDto;
import io.getstream.chat.android.client.api2.model.dto.PollDeletedEventDto;
import io.getstream.chat.android.client.api2.model.dto.PollUpdatedEventDto;
import io.getstream.chat.android.client.api2.model.dto.ReactionDeletedEventDto;
import io.getstream.chat.android.client.api2.model.dto.ReactionNewEventDto;
import io.getstream.chat.android.client.api2.model.dto.ReactionUpdateEventDto;
import io.getstream.chat.android.client.api2.model.dto.ReminderCreatedEventDto;
import io.getstream.chat.android.client.api2.model.dto.ReminderDeletedEventDto;
import io.getstream.chat.android.client.api2.model.dto.ReminderUpdatedEventDto;
import io.getstream.chat.android.client.api2.model.dto.ThreadUpdatedEventDto;
import io.getstream.chat.android.client.api2.model.dto.TypingStartEventDto;
import io.getstream.chat.android.client.api2.model.dto.TypingStopEventDto;
import io.getstream.chat.android.client.api2.model.dto.UnknownEventDto;
import io.getstream.chat.android.client.api2.model.dto.UserDeletedEventDto;
import io.getstream.chat.android.client.api2.model.dto.UserMessagesDeletedEventDto;
import io.getstream.chat.android.client.api2.model.dto.UserPresenceChangedEventDto;
import io.getstream.chat.android.client.api2.model.dto.UserStartWatchingEventDto;
import io.getstream.chat.android.client.api2.model.dto.UserStopWatchingEventDto;
import io.getstream.chat.android.client.api2.model.dto.UserUpdatedEventDto;
import io.getstream.chat.android.client.api2.model.dto.VoteCastedEventDto;
import io.getstream.chat.android.client.api2.model.dto.VoteChangedEventDto;
import io.getstream.chat.android.client.api2.model.dto.VoteRemovedEventDto;
import io.getstream.chat.android.client.api2.model.dto.utils.internal.ExactDate;
import io.getstream.chat.android.models.EventType;
import java.util.LinkedHashMap;
import java.util.Map;
import p441qx.AbstractC30704c0;
import p441qx.C30722l0;
import p441qx.EnumC30741w;
import p471rx.AbstractC31885f;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000Æ\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\u000b\u001a\u00020\n*\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0017R(\u0010\u0019\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00180\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR8\u0010\u001d\u001a&\u0012\f\u0012\n \u001c*\u0004\u0018\u00010\u001b0\u001b \u001c*\u0012\u0012\f\u0012\n \u001c*\u0004\u0018\u00010\u001b0\u001b\u0018\u00010\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001aR8\u0010\u001f\u001a&\u0012\f\u0012\n \u001c*\u0004\u0018\u00010\u001e0\u001e \u001c*\u0012\u0012\f\u0012\n \u001c*\u0004\u0018\u00010\u001e0\u001e\u0018\u00010\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001aR8\u0010!\u001a&\u0012\f\u0012\n \u001c*\u0004\u0018\u00010 0  \u001c*\u0012\u0012\f\u0012\n \u001c*\u0004\u0018\u00010 0 \u0018\u00010\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001aR8\u0010#\u001a&\u0012\f\u0012\n \u001c*\u0004\u0018\u00010\"0\" \u001c*\u0012\u0012\f\u0012\n \u001c*\u0004\u0018\u00010\"0\"\u0018\u00010\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u001aR8\u0010%\u001a&\u0012\f\u0012\n \u001c*\u0004\u0018\u00010$0$ \u001c*\u0012\u0012\f\u0012\n \u001c*\u0004\u0018\u00010$0$\u0018\u00010\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u001aR8\u0010'\u001a&\u0012\f\u0012\n \u001c*\u0004\u0018\u00010&0& \u001c*\u0012\u0012\f\u0012\n \u001c*\u0004\u0018\u00010&0&\u0018\u00010\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u001aR8\u0010)\u001a&\u0012\f\u0012\n \u001c*\u0004\u0018\u00010(0( \u001c*\u0012\u0012\f\u0012\n \u001c*\u0004\u0018\u00010(0(\u0018\u00010\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010\u001aR8\u0010+\u001a&\u0012\f\u0012\n \u001c*\u0004\u0018\u00010*0* \u001c*\u0012\u0012\f\u0012\n \u001c*\u0004\u0018\u00010*0*\u0018\u00010\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010\u001aR8\u0010-\u001a&\u0012\f\u0012\n \u001c*\u0004\u0018\u00010,0, \u001c*\u0012\u0012\f\u0012\n \u001c*\u0004\u0018\u00010,0,\u0018\u00010\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010\u001aR8\u0010/\u001a&\u0012\f\u0012\n \u001c*\u0004\u0018\u00010.0. \u001c*\u0012\u0012\f\u0012\n \u001c*\u0004\u0018\u00010.0.\u0018\u00010\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010\u001aR8\u00101\u001a&\u0012\f\u0012\n \u001c*\u0004\u0018\u00010000 \u001c*\u0012\u0012\f\u0012\n \u001c*\u0004\u0018\u00010000\u0018\u00010\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010\u001aR8\u00103\u001a&\u0012\f\u0012\n \u001c*\u0004\u0018\u00010202 \u001c*\u0012\u0012\f\u0012\n \u001c*\u0004\u0018\u00010202\u0018\u00010\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010\u001aR8\u00105\u001a&\u0012\f\u0012\n \u001c*\u0004\u0018\u00010404 \u001c*\u0012\u0012\f\u0012\n \u001c*\u0004\u0018\u00010404\u0018\u00010\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010\u001aR8\u00107\u001a&\u0012\f\u0012\n \u001c*\u0004\u0018\u00010606 \u001c*\u0012\u0012\f\u0012\n \u001c*\u0004\u0018\u00010606\u0018\u00010\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u0010\u001aR8\u00109\u001a&\u0012\f\u0012\n \u001c*\u0004\u0018\u00010808 \u001c*\u0012\u0012\f\u0012\n \u001c*\u0004\u0018\u00010808\u0018\u00010\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010\u001aR8\u0010;\u001a&\u0012\f\u0012\n \u001c*\u0004\u0018\u00010:0: \u001c*\u0012\u0012\f\u0012\n \u001c*\u0004\u0018\u00010:0:\u0018\u00010\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010\u001aR8\u0010=\u001a&\u0012\f\u0012\n \u001c*\u0004\u0018\u00010<0< \u001c*\u0012\u0012\f\u0012\n \u001c*\u0004\u0018\u00010<0<\u0018\u00010\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010\u001aR8\u0010?\u001a&\u0012\f\u0012\n \u001c*\u0004\u0018\u00010>0> \u001c*\u0012\u0012\f\u0012\n \u001c*\u0004\u0018\u00010>0>\u0018\u00010\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010\u001aR8\u0010A\u001a&\u0012\f\u0012\n \u001c*\u0004\u0018\u00010@0@ \u001c*\u0012\u0012\f\u0012\n \u001c*\u0004\u0018\u00010@0@\u0018\u00010\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010\u001aR8\u0010C\u001a&\u0012\f\u0012\n \u001c*\u0004\u0018\u00010B0B \u001c*\u0012\u0012\f\u0012\n \u001c*\u0004\u0018\u00010B0B\u0018\u00010\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010\u001aR8\u0010E\u001a&\u0012\f\u0012\n \u001c*\u0004\u0018\u00010D0D \u001c*\u0012\u0012\f\u0012\n \u001c*\u0004\u0018\u00010D0D\u0018\u00010\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010\u001aR8\u0010G\u001a&\u0012\f\u0012\n \u001c*\u0004\u0018\u00010F0F \u001c*\u0012\u0012\f\u0012\n \u001c*\u0004\u0018\u00010F0F\u0018\u00010\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010\u001aR8\u0010I\u001a&\u0012\f\u0012\n \u001c*\u0004\u0018\u00010H0H \u001c*\u0012\u0012\f\u0012\n \u001c*\u0004\u0018\u00010H0H\u0018\u00010\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010\u001aR8\u0010K\u001a&\u0012\f\u0012\n \u001c*\u0004\u0018\u00010J0J \u001c*\u0012\u0012\f\u0012\n \u001c*\u0004\u0018\u00010J0J\u0018\u00010\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010\u001aR8\u0010M\u001a&\u0012\f\u0012\n \u001c*\u0004\u0018\u00010L0L \u001c*\u0012\u0012\f\u0012\n \u001c*\u0004\u0018\u00010L0L\u0018\u00010\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010\u001aR8\u0010O\u001a&\u0012\f\u0012\n \u001c*\u0004\u0018\u00010N0N \u001c*\u0012\u0012\f\u0012\n \u001c*\u0004\u0018\u00010N0N\u0018\u00010\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010\u001aR8\u0010Q\u001a&\u0012\f\u0012\n \u001c*\u0004\u0018\u00010P0P \u001c*\u0012\u0012\f\u0012\n \u001c*\u0004\u0018\u00010P0P\u0018\u00010\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010\u001aR8\u0010S\u001a&\u0012\f\u0012\n \u001c*\u0004\u0018\u00010R0R \u001c*\u0012\u0012\f\u0012\n \u001c*\u0004\u0018\u00010R0R\u0018\u00010\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010\u001aR8\u0010U\u001a&\u0012\f\u0012\n \u001c*\u0004\u0018\u00010T0T \u001c*\u0012\u0012\f\u0012\n \u001c*\u0004\u0018\u00010T0T\u0018\u00010\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010\u001aR8\u0010W\u001a&\u0012\f\u0012\n \u001c*\u0004\u0018\u00010V0V \u001c*\u0012\u0012\f\u0012\n \u001c*\u0004\u0018\u00010V0V\u0018\u00010\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010\u001aR8\u0010Y\u001a&\u0012\f\u0012\n \u001c*\u0004\u0018\u00010X0X \u001c*\u0012\u0012\f\u0012\n \u001c*\u0004\u0018\u00010X0X\u0018\u00010\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010\u001aR8\u0010[\u001a&\u0012\f\u0012\n \u001c*\u0004\u0018\u00010Z0Z \u001c*\u0012\u0012\f\u0012\n \u001c*\u0004\u0018\u00010Z0Z\u0018\u00010\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\u001aR8\u0010]\u001a&\u0012\f\u0012\n \u001c*\u0004\u0018\u00010\\0\\ \u001c*\u0012\u0012\f\u0012\n \u001c*\u0004\u0018\u00010\\0\\\u0018\u00010\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010\u001aR8\u0010_\u001a&\u0012\f\u0012\n \u001c*\u0004\u0018\u00010^0^ \u001c*\u0012\u0012\f\u0012\n \u001c*\u0004\u0018\u00010^0^\u0018\u00010\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010\u001aR8\u0010a\u001a&\u0012\f\u0012\n \u001c*\u0004\u0018\u00010`0` \u001c*\u0012\u0012\f\u0012\n \u001c*\u0004\u0018\u00010`0`\u0018\u00010\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010\u001aR8\u0010c\u001a&\u0012\f\u0012\n \u001c*\u0004\u0018\u00010b0b \u001c*\u0012\u0012\f\u0012\n \u001c*\u0004\u0018\u00010b0b\u0018\u00010\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010\u001aR8\u0010e\u001a&\u0012\f\u0012\n \u001c*\u0004\u0018\u00010d0d \u001c*\u0012\u0012\f\u0012\n \u001c*\u0004\u0018\u00010d0d\u0018\u00010\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010\u001aR8\u0010g\u001a&\u0012\f\u0012\n \u001c*\u0004\u0018\u00010f0f \u001c*\u0012\u0012\f\u0012\n \u001c*\u0004\u0018\u00010f0f\u0018\u00010\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010\u001aR8\u0010i\u001a&\u0012\f\u0012\n \u001c*\u0004\u0018\u00010h0h \u001c*\u0012\u0012\f\u0012\n \u001c*\u0004\u0018\u00010h0h\u0018\u00010\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010\u001aR8\u0010k\u001a&\u0012\f\u0012\n \u001c*\u0004\u0018\u00010j0j \u001c*\u0012\u0012\f\u0012\n \u001c*\u0004\u0018\u00010j0j\u0018\u00010\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bk\u0010\u001aR8\u0010m\u001a&\u0012\f\u0012\n \u001c*\u0004\u0018\u00010l0l \u001c*\u0012\u0012\f\u0012\n \u001c*\u0004\u0018\u00010l0l\u0018\u00010\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bm\u0010\u001aR8\u0010o\u001a&\u0012\f\u0012\n \u001c*\u0004\u0018\u00010n0n \u001c*\u0012\u0012\f\u0012\n \u001c*\u0004\u0018\u00010n0n\u0018\u00010\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bo\u0010\u001aR8\u0010q\u001a&\u0012\f\u0012\n \u001c*\u0004\u0018\u00010p0p \u001c*\u0012\u0012\f\u0012\n \u001c*\u0004\u0018\u00010p0p\u0018\u00010\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bq\u0010\u001aR8\u0010s\u001a&\u0012\f\u0012\n \u001c*\u0004\u0018\u00010r0r \u001c*\u0012\u0012\f\u0012\n \u001c*\u0004\u0018\u00010r0r\u0018\u00010\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bs\u0010\u001aR8\u0010u\u001a&\u0012\f\u0012\n \u001c*\u0004\u0018\u00010t0t \u001c*\u0012\u0012\f\u0012\n \u001c*\u0004\u0018\u00010t0t\u0018\u00010\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bu\u0010\u001aR8\u0010w\u001a&\u0012\f\u0012\n \u001c*\u0004\u0018\u00010v0v \u001c*\u0012\u0012\f\u0012\n \u001c*\u0004\u0018\u00010v0v\u0018\u00010\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bw\u0010\u001aR8\u0010y\u001a&\u0012\f\u0012\n \u001c*\u0004\u0018\u00010x0x \u001c*\u0012\u0012\f\u0012\n \u001c*\u0004\u0018\u00010x0x\u0018\u00010\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\by\u0010\u001aR8\u0010{\u001a&\u0012\f\u0012\n \u001c*\u0004\u0018\u00010z0z \u001c*\u0012\u0012\f\u0012\n \u001c*\u0004\u0018\u00010z0z\u0018\u00010\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b{\u0010\u001aR8\u0010}\u001a&\u0012\f\u0012\n \u001c*\u0004\u0018\u00010|0| \u001c*\u0012\u0012\f\u0012\n \u001c*\u0004\u0018\u00010|0|\u0018\u00010\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b}\u0010\u001aR8\u0010\u007f\u001a&\u0012\f\u0012\n \u001c*\u0004\u0018\u00010~0~ \u001c*\u0012\u0012\f\u0012\n \u001c*\u0004\u0018\u00010~0~\u0018\u00010\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u007f\u0010\u001aR>\u0010\u0081\u0001\u001a*\u0012\u000e\u0012\f \u001c*\u0005\u0018\u00010\u0080\u00010\u0080\u0001 \u001c*\u0014\u0012\u000e\u0012\f \u001c*\u0005\u0018\u00010\u0080\u00010\u0080\u0001\u0018\u00010\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0081\u0001\u0010\u001aR>\u0010\u0083\u0001\u001a*\u0012\u000e\u0012\f \u001c*\u0005\u0018\u00010\u0082\u00010\u0082\u0001 \u001c*\u0014\u0012\u000e\u0012\f \u001c*\u0005\u0018\u00010\u0082\u00010\u0082\u0001\u0018\u00010\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0083\u0001\u0010\u001aR>\u0010\u0085\u0001\u001a*\u0012\u000e\u0012\f \u001c*\u0005\u0018\u00010\u0084\u00010\u0084\u0001 \u001c*\u0014\u0012\u000e\u0012\f \u001c*\u0005\u0018\u00010\u0084\u00010\u0084\u0001\u0018\u00010\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0085\u0001\u0010\u001aR>\u0010\u0087\u0001\u001a*\u0012\u000e\u0012\f \u001c*\u0005\u0018\u00010\u0086\u00010\u0086\u0001 \u001c*\u0014\u0012\u000e\u0012\f \u001c*\u0005\u0018\u00010\u0086\u00010\u0086\u0001\u0018\u00010\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0087\u0001\u0010\u001aR>\u0010\u0089\u0001\u001a*\u0012\u000e\u0012\f \u001c*\u0005\u0018\u00010\u0088\u00010\u0088\u0001 \u001c*\u0014\u0012\u000e\u0012\f \u001c*\u0005\u0018\u00010\u0088\u00010\u0088\u0001\u0018\u00010\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0089\u0001\u0010\u001aR>\u0010\u008b\u0001\u001a*\u0012\u000e\u0012\f \u001c*\u0005\u0018\u00010\u008a\u00010\u008a\u0001 \u001c*\u0014\u0012\u000e\u0012\f \u001c*\u0005\u0018\u00010\u008a\u00010\u008a\u0001\u0018\u00010\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u008b\u0001\u0010\u001aR>\u0010\u008d\u0001\u001a*\u0012\u000e\u0012\f \u001c*\u0005\u0018\u00010\u008c\u00010\u008c\u0001 \u001c*\u0014\u0012\u000e\u0012\f \u001c*\u0005\u0018\u00010\u008c\u00010\u008c\u0001\u0018\u00010\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u008d\u0001\u0010\u001aR>\u0010\u008f\u0001\u001a*\u0012\u000e\u0012\f \u001c*\u0005\u0018\u00010\u008e\u00010\u008e\u0001 \u001c*\u0014\u0012\u000e\u0012\f \u001c*\u0005\u0018\u00010\u008e\u00010\u008e\u0001\u0018\u00010\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u008f\u0001\u0010\u001aR>\u0010\u0091\u0001\u001a*\u0012\u000e\u0012\f \u001c*\u0005\u0018\u00010\u0090\u00010\u0090\u0001 \u001c*\u0014\u0012\u000e\u0012\f \u001c*\u0005\u0018\u00010\u0090\u00010\u0090\u0001\u0018\u00010\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0091\u0001\u0010\u001aR>\u0010\u0093\u0001\u001a*\u0012\u000e\u0012\f \u001c*\u0005\u0018\u00010\u0092\u00010\u0092\u0001 \u001c*\u0014\u0012\u000e\u0012\f \u001c*\u0005\u0018\u00010\u0092\u00010\u0092\u0001\u0018\u00010\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0093\u0001\u0010\u001aR>\u0010\u0095\u0001\u001a*\u0012\u000e\u0012\f \u001c*\u0005\u0018\u00010\u0094\u00010\u0094\u0001 \u001c*\u0014\u0012\u000e\u0012\f \u001c*\u0005\u0018\u00010\u0094\u00010\u0094\u0001\u0018\u00010\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0095\u0001\u0010\u001aR>\u0010\u0097\u0001\u001a*\u0012\u000e\u0012\f \u001c*\u0005\u0018\u00010\u0096\u00010\u0096\u0001 \u001c*\u0014\u0012\u000e\u0012\f \u001c*\u0005\u0018\u00010\u0096\u00010\u0096\u0001\u0018\u00010\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0097\u0001\u0010\u001aR>\u0010\u0099\u0001\u001a*\u0012\u000e\u0012\f \u001c*\u0005\u0018\u00010\u0098\u00010\u0098\u0001 \u001c*\u0014\u0012\u000e\u0012\f \u001c*\u0005\u0018\u00010\u0098\u00010\u0098\u0001\u0018\u00010\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0099\u0001\u0010\u001a¨\u0006\u009a\u0001"}, m65681d2 = {"Lio/getstream/chat/android/client/parser2/adapters/EventDtoAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lio/getstream/chat/android/client/api2/model/dto/ChatEventDto;", "Lqx/l0;", "moshi", "<init>", "(Lqx/l0;)V", "", "", "", "", "containsAnswer", "(Ljava/util/Map;)Z", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "(Lcom/squareup/moshi/JsonReader;)Lio/getstream/chat/android/client/api2/model/dto/ChatEventDto;", "Lqx/c0;", "writer", "value", "Ll83/a0;", "toJson", "(Lqx/c0;Lio/getstream/chat/android/client/api2/model/dto/ChatEventDto;)V", "Lqx/l0;", "", "mapAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lio/getstream/chat/android/client/api2/model/dto/ConnectedEventDto;", "kotlin.jvm.PlatformType", "connectedEventAdapter", "Lio/getstream/chat/android/client/api2/model/dto/ConnectionErrorEventDto;", "connectionErrorEventAdapter", "Lio/getstream/chat/android/client/api2/model/dto/HealthEventDto;", "healthEventAdapter", "Lio/getstream/chat/android/client/api2/model/dto/DraftMessageUpdatedEventDto;", "draftMessageUpdatedEventAdapter", "Lio/getstream/chat/android/client/api2/model/dto/DraftMessageDeletedEventDto;", "draftMessageDeletedEventAdapter", "Lio/getstream/chat/android/client/api2/model/dto/NewMessageEventDto;", "newMessageEventAdapter", "Lio/getstream/chat/android/client/api2/model/dto/MessageDeletedEventDto;", "messageDeletedEventAdapter", "Lio/getstream/chat/android/client/api2/model/dto/MessageUpdatedEventDto;", "messageUpdatedEventAdapter", "Lio/getstream/chat/android/client/api2/model/dto/MessageReadEventDto;", "messageReadEventAdapter", "Lio/getstream/chat/android/client/api2/model/dto/MessageDeliveredEventDto;", "messageDeliveredEventAdapter", "Lio/getstream/chat/android/client/api2/model/dto/TypingStartEventDto;", "typingStartEventAdapter", "Lio/getstream/chat/android/client/api2/model/dto/TypingStopEventDto;", "typingStopEventAdapter", "Lio/getstream/chat/android/client/api2/model/dto/ReactionNewEventDto;", "reactionNewEventAdapter", "Lio/getstream/chat/android/client/api2/model/dto/ReactionUpdateEventDto;", "reactionUpdateEventAdapter", "Lio/getstream/chat/android/client/api2/model/dto/ReactionDeletedEventDto;", "reactionDeletedEventAdapter", "Lio/getstream/chat/android/client/api2/model/dto/MemberAddedEventDto;", "memberAddedEventAdapter", "Lio/getstream/chat/android/client/api2/model/dto/MemberRemovedEventDto;", "memberRemovedEventAdapter", "Lio/getstream/chat/android/client/api2/model/dto/MemberUpdatedEventDto;", "memberUpdatedEventAdapter", "Lio/getstream/chat/android/client/api2/model/dto/ChannelUpdatedByUserEventDto;", "channelUpdatedByUserEventAdapter", "Lio/getstream/chat/android/client/api2/model/dto/ChannelUpdatedEventDto;", "channelUpdatedEventAdapter", "Lio/getstream/chat/android/client/api2/model/dto/ChannelHiddenEventDto;", "channelHiddenEventAdapter", "Lio/getstream/chat/android/client/api2/model/dto/ChannelDeletedEventDto;", "channelDeletedEventAdapter", "Lio/getstream/chat/android/client/api2/model/dto/ChannelVisibleEventDto;", "channelVisibleEventAdapter", "Lio/getstream/chat/android/client/api2/model/dto/ChannelTruncatedEventDto;", "channelTruncatedEventAdapter", "Lio/getstream/chat/android/client/api2/model/dto/UserStartWatchingEventDto;", "userStartWatchingEventAdapter", "Lio/getstream/chat/android/client/api2/model/dto/UserStopWatchingEventDto;", "userStopWatchingEventAdapter", "Lio/getstream/chat/android/client/api2/model/dto/NotificationAddedToChannelEventDto;", "notificationAddedToChannelEventAdapter", "Lio/getstream/chat/android/client/api2/model/dto/NotificationMarkReadEventDto;", "notificationMarkReadEventAdapter", "Lio/getstream/chat/android/client/api2/model/dto/NotificationMarkUnreadEventDto;", "notificationMarkUnreadEventAdapter", "Lio/getstream/chat/android/client/api2/model/dto/MarkAllReadEventDto;", "markAllReadEventAdapter", "Lio/getstream/chat/android/client/api2/model/dto/NotificationMessageNewEventDto;", "notificationMessageNewEventAdapter", "Lio/getstream/chat/android/client/api2/model/dto/NotificationThreadMessageNewEventDto;", "notificationThreadMessageNewEventAdapter", "Lio/getstream/chat/android/client/api2/model/dto/ThreadUpdatedEventDto;", "threadUpdatedEventAdapter", "Lio/getstream/chat/android/client/api2/model/dto/NotificationInvitedEventDto;", "notificationInvitedEventAdapter", "Lio/getstream/chat/android/client/api2/model/dto/NotificationInviteAcceptedEventDto;", "notificationInviteAcceptedEventAdapter", "Lio/getstream/chat/android/client/api2/model/dto/NotificationInviteRejectedEventDto;", "notificationInviteRejectedEventAdapter", "Lio/getstream/chat/android/client/api2/model/dto/NotificationRemovedFromChannelEventDto;", "notificationRemovedFromChannelEventAdapter", "Lio/getstream/chat/android/client/api2/model/dto/NotificationMutesUpdatedEventDto;", "notificationMutesUpdatedEventAdapter", "Lio/getstream/chat/android/client/api2/model/dto/NotificationChannelMutesUpdatedEventDto;", "notificationChannelMutesUpdatedEventAdapter", "Lio/getstream/chat/android/client/api2/model/dto/NotificationChannelDeletedEventDto;", "notificationChannelDeletedEventAdapter", "Lio/getstream/chat/android/client/api2/model/dto/NotificationChannelTruncatedEventDto;", "notificationChannelTruncatedEventAdapter", "Lio/getstream/chat/android/client/api2/model/dto/UserPresenceChangedEventDto;", "userPresenceChangedEventAdapter", "Lio/getstream/chat/android/client/api2/model/dto/UserUpdatedEventDto;", "userUpdatedEventAdapter", "Lio/getstream/chat/android/client/api2/model/dto/UserDeletedEventDto;", "userDeletedEventAdapter", "Lio/getstream/chat/android/client/api2/model/dto/ChannelUserBannedEventDto;", "channelUserBannedEventAdapter", "Lio/getstream/chat/android/client/api2/model/dto/GlobalUserBannedEventDto;", "globalUserBannedEventAdapter", "Lio/getstream/chat/android/client/api2/model/dto/ChannelUserUnbannedEventDto;", "channelUserUnbannedEventAdapter", "Lio/getstream/chat/android/client/api2/model/dto/GlobalUserUnbannedEventDto;", "globalUserUnbannedEventAdapter", "Lio/getstream/chat/android/client/api2/model/dto/PollUpdatedEventDto;", "pollUpdatedEventAdapter", "Lio/getstream/chat/android/client/api2/model/dto/PollDeletedEventDto;", "pollDeletedEventAdapter", "Lio/getstream/chat/android/client/api2/model/dto/PollClosedEventDto;", "pollClosedEventAdapter", "Lio/getstream/chat/android/client/api2/model/dto/VoteCastedEventDto;", "voteCastedEventAdapter", "Lio/getstream/chat/android/client/api2/model/dto/VoteChangedEventDto;", "voteChangedEventAdapter", "Lio/getstream/chat/android/client/api2/model/dto/AnswerCastedEventDto;", "answerCastedEventAdapter", "Lio/getstream/chat/android/client/api2/model/dto/VoteRemovedEventDto;", "voteRemovedEventAdapter", "Lio/getstream/chat/android/client/api2/model/dto/ReminderCreatedEventDto;", "reminderCreatedEventAdapter", "Lio/getstream/chat/android/client/api2/model/dto/ReminderUpdatedEventDto;", "reminderUpdatedEventAdapter", "Lio/getstream/chat/android/client/api2/model/dto/ReminderDeletedEventDto;", "reminderDeletedEventAdapter", "Lio/getstream/chat/android/client/api2/model/dto/NotificationReminderDueEventDto;", "notificationReminderDueEventAdapter", "Lio/getstream/chat/android/client/api2/model/dto/UserMessagesDeletedEventDto;", "userMessagesDeletedEventAdapter", "Lio/getstream/chat/android/client/api2/model/dto/AIIndicatorUpdatedEventDto;", "aiTypingIndicatorUpdatedEventAdapter", "Lio/getstream/chat/android/client/api2/model/dto/AIIndicatorClearEventDto;", "aiTypingIndicatorClearEventAdapter", "Lio/getstream/chat/android/client/api2/model/dto/AIIndicatorStopEventDto;", "aiTypingIndicatorStopEventAdapter", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class EventDtoAdapter extends JsonAdapter<ChatEventDto> {
    private final JsonAdapter<AIIndicatorClearEventDto> aiTypingIndicatorClearEventAdapter;
    private final JsonAdapter<AIIndicatorStopEventDto> aiTypingIndicatorStopEventAdapter;
    private final JsonAdapter<AIIndicatorUpdatedEventDto> aiTypingIndicatorUpdatedEventAdapter;
    private final JsonAdapter<AnswerCastedEventDto> answerCastedEventAdapter;
    private final JsonAdapter<ChannelDeletedEventDto> channelDeletedEventAdapter;
    private final JsonAdapter<ChannelHiddenEventDto> channelHiddenEventAdapter;
    private final JsonAdapter<ChannelTruncatedEventDto> channelTruncatedEventAdapter;
    private final JsonAdapter<ChannelUpdatedByUserEventDto> channelUpdatedByUserEventAdapter;
    private final JsonAdapter<ChannelUpdatedEventDto> channelUpdatedEventAdapter;
    private final JsonAdapter<ChannelUserBannedEventDto> channelUserBannedEventAdapter;
    private final JsonAdapter<ChannelUserUnbannedEventDto> channelUserUnbannedEventAdapter;
    private final JsonAdapter<ChannelVisibleEventDto> channelVisibleEventAdapter;
    private final JsonAdapter<ConnectedEventDto> connectedEventAdapter;
    private final JsonAdapter<ConnectionErrorEventDto> connectionErrorEventAdapter;
    private final JsonAdapter<DraftMessageDeletedEventDto> draftMessageDeletedEventAdapter;
    private final JsonAdapter<DraftMessageUpdatedEventDto> draftMessageUpdatedEventAdapter;
    private final JsonAdapter<GlobalUserBannedEventDto> globalUserBannedEventAdapter;
    private final JsonAdapter<GlobalUserUnbannedEventDto> globalUserUnbannedEventAdapter;
    private final JsonAdapter<HealthEventDto> healthEventAdapter;
    private final JsonAdapter<Map<String, Object>> mapAdapter;
    private final JsonAdapter<MarkAllReadEventDto> markAllReadEventAdapter;
    private final JsonAdapter<MemberAddedEventDto> memberAddedEventAdapter;
    private final JsonAdapter<MemberRemovedEventDto> memberRemovedEventAdapter;
    private final JsonAdapter<MemberUpdatedEventDto> memberUpdatedEventAdapter;
    private final JsonAdapter<MessageDeletedEventDto> messageDeletedEventAdapter;
    private final JsonAdapter<MessageDeliveredEventDto> messageDeliveredEventAdapter;
    private final JsonAdapter<MessageReadEventDto> messageReadEventAdapter;
    private final JsonAdapter<MessageUpdatedEventDto> messageUpdatedEventAdapter;
    private final C30722l0 moshi;
    private final JsonAdapter<NewMessageEventDto> newMessageEventAdapter;
    private final JsonAdapter<NotificationAddedToChannelEventDto> notificationAddedToChannelEventAdapter;
    private final JsonAdapter<NotificationChannelDeletedEventDto> notificationChannelDeletedEventAdapter;
    private final JsonAdapter<NotificationChannelMutesUpdatedEventDto> notificationChannelMutesUpdatedEventAdapter;
    private final JsonAdapter<NotificationChannelTruncatedEventDto> notificationChannelTruncatedEventAdapter;
    private final JsonAdapter<NotificationInviteAcceptedEventDto> notificationInviteAcceptedEventAdapter;
    private final JsonAdapter<NotificationInviteRejectedEventDto> notificationInviteRejectedEventAdapter;
    private final JsonAdapter<NotificationInvitedEventDto> notificationInvitedEventAdapter;
    private final JsonAdapter<NotificationMarkReadEventDto> notificationMarkReadEventAdapter;
    private final JsonAdapter<NotificationMarkUnreadEventDto> notificationMarkUnreadEventAdapter;
    private final JsonAdapter<NotificationMessageNewEventDto> notificationMessageNewEventAdapter;
    private final JsonAdapter<NotificationMutesUpdatedEventDto> notificationMutesUpdatedEventAdapter;
    private final JsonAdapter<NotificationReminderDueEventDto> notificationReminderDueEventAdapter;
    private final JsonAdapter<NotificationRemovedFromChannelEventDto> notificationRemovedFromChannelEventAdapter;
    private final JsonAdapter<NotificationThreadMessageNewEventDto> notificationThreadMessageNewEventAdapter;
    private final JsonAdapter<PollClosedEventDto> pollClosedEventAdapter;
    private final JsonAdapter<PollDeletedEventDto> pollDeletedEventAdapter;
    private final JsonAdapter<PollUpdatedEventDto> pollUpdatedEventAdapter;
    private final JsonAdapter<ReactionDeletedEventDto> reactionDeletedEventAdapter;
    private final JsonAdapter<ReactionNewEventDto> reactionNewEventAdapter;
    private final JsonAdapter<ReactionUpdateEventDto> reactionUpdateEventAdapter;
    private final JsonAdapter<ReminderCreatedEventDto> reminderCreatedEventAdapter;
    private final JsonAdapter<ReminderDeletedEventDto> reminderDeletedEventAdapter;
    private final JsonAdapter<ReminderUpdatedEventDto> reminderUpdatedEventAdapter;
    private final JsonAdapter<ThreadUpdatedEventDto> threadUpdatedEventAdapter;
    private final JsonAdapter<TypingStartEventDto> typingStartEventAdapter;
    private final JsonAdapter<TypingStopEventDto> typingStopEventAdapter;
    private final JsonAdapter<UserDeletedEventDto> userDeletedEventAdapter;
    private final JsonAdapter<UserMessagesDeletedEventDto> userMessagesDeletedEventAdapter;
    private final JsonAdapter<UserPresenceChangedEventDto> userPresenceChangedEventAdapter;
    private final JsonAdapter<UserStartWatchingEventDto> userStartWatchingEventAdapter;
    private final JsonAdapter<UserStopWatchingEventDto> userStopWatchingEventAdapter;
    private final JsonAdapter<UserUpdatedEventDto> userUpdatedEventAdapter;
    private final JsonAdapter<VoteCastedEventDto> voteCastedEventAdapter;
    private final JsonAdapter<VoteChangedEventDto> voteChangedEventAdapter;
    private final JsonAdapter<VoteRemovedEventDto> voteRemovedEventAdapter;

    public EventDtoAdapter(C30722l0 moshi) {
        AbstractC22676k.m65750j(moshi, "moshi");
        this.moshi = moshi;
        this.mapAdapter = moshi.m94400c(AbstractC1772c1.m5369F(Map.class, String.class, Object.class), AbstractC31885f.f132390a, null);
        this.connectedEventAdapter = moshi.m94398a(ConnectedEventDto.class);
        this.connectionErrorEventAdapter = moshi.m94398a(ConnectionErrorEventDto.class);
        this.healthEventAdapter = moshi.m94398a(HealthEventDto.class);
        this.draftMessageUpdatedEventAdapter = moshi.m94398a(DraftMessageUpdatedEventDto.class);
        this.draftMessageDeletedEventAdapter = moshi.m94398a(DraftMessageDeletedEventDto.class);
        this.newMessageEventAdapter = moshi.m94398a(NewMessageEventDto.class);
        this.messageDeletedEventAdapter = moshi.m94398a(MessageDeletedEventDto.class);
        this.messageUpdatedEventAdapter = moshi.m94398a(MessageUpdatedEventDto.class);
        this.messageReadEventAdapter = moshi.m94398a(MessageReadEventDto.class);
        this.messageDeliveredEventAdapter = moshi.m94398a(MessageDeliveredEventDto.class);
        this.typingStartEventAdapter = moshi.m94398a(TypingStartEventDto.class);
        this.typingStopEventAdapter = moshi.m94398a(TypingStopEventDto.class);
        this.reactionNewEventAdapter = moshi.m94398a(ReactionNewEventDto.class);
        this.reactionUpdateEventAdapter = moshi.m94398a(ReactionUpdateEventDto.class);
        this.reactionDeletedEventAdapter = moshi.m94398a(ReactionDeletedEventDto.class);
        this.memberAddedEventAdapter = moshi.m94398a(MemberAddedEventDto.class);
        this.memberRemovedEventAdapter = moshi.m94398a(MemberRemovedEventDto.class);
        this.memberUpdatedEventAdapter = moshi.m94398a(MemberUpdatedEventDto.class);
        this.channelUpdatedByUserEventAdapter = moshi.m94398a(ChannelUpdatedByUserEventDto.class);
        this.channelUpdatedEventAdapter = moshi.m94398a(ChannelUpdatedEventDto.class);
        this.channelHiddenEventAdapter = moshi.m94398a(ChannelHiddenEventDto.class);
        this.channelDeletedEventAdapter = moshi.m94398a(ChannelDeletedEventDto.class);
        this.channelVisibleEventAdapter = moshi.m94398a(ChannelVisibleEventDto.class);
        this.channelTruncatedEventAdapter = moshi.m94398a(ChannelTruncatedEventDto.class);
        this.userStartWatchingEventAdapter = moshi.m94398a(UserStartWatchingEventDto.class);
        this.userStopWatchingEventAdapter = moshi.m94398a(UserStopWatchingEventDto.class);
        this.notificationAddedToChannelEventAdapter = moshi.m94398a(NotificationAddedToChannelEventDto.class);
        this.notificationMarkReadEventAdapter = moshi.m94398a(NotificationMarkReadEventDto.class);
        this.notificationMarkUnreadEventAdapter = moshi.m94398a(NotificationMarkUnreadEventDto.class);
        this.markAllReadEventAdapter = moshi.m94398a(MarkAllReadEventDto.class);
        this.notificationMessageNewEventAdapter = moshi.m94398a(NotificationMessageNewEventDto.class);
        this.notificationThreadMessageNewEventAdapter = moshi.m94398a(NotificationThreadMessageNewEventDto.class);
        this.threadUpdatedEventAdapter = moshi.m94398a(ThreadUpdatedEventDto.class);
        this.notificationInvitedEventAdapter = moshi.m94398a(NotificationInvitedEventDto.class);
        this.notificationInviteAcceptedEventAdapter = moshi.m94398a(NotificationInviteAcceptedEventDto.class);
        this.notificationInviteRejectedEventAdapter = moshi.m94398a(NotificationInviteRejectedEventDto.class);
        this.notificationRemovedFromChannelEventAdapter = moshi.m94398a(NotificationRemovedFromChannelEventDto.class);
        this.notificationMutesUpdatedEventAdapter = moshi.m94398a(NotificationMutesUpdatedEventDto.class);
        this.notificationChannelMutesUpdatedEventAdapter = moshi.m94398a(NotificationChannelMutesUpdatedEventDto.class);
        this.notificationChannelDeletedEventAdapter = moshi.m94398a(NotificationChannelDeletedEventDto.class);
        this.notificationChannelTruncatedEventAdapter = moshi.m94398a(NotificationChannelTruncatedEventDto.class);
        this.userPresenceChangedEventAdapter = moshi.m94398a(UserPresenceChangedEventDto.class);
        this.userUpdatedEventAdapter = moshi.m94398a(UserUpdatedEventDto.class);
        this.userDeletedEventAdapter = moshi.m94398a(UserDeletedEventDto.class);
        this.channelUserBannedEventAdapter = moshi.m94398a(ChannelUserBannedEventDto.class);
        this.globalUserBannedEventAdapter = moshi.m94398a(GlobalUserBannedEventDto.class);
        this.channelUserUnbannedEventAdapter = moshi.m94398a(ChannelUserUnbannedEventDto.class);
        this.globalUserUnbannedEventAdapter = moshi.m94398a(GlobalUserUnbannedEventDto.class);
        this.pollUpdatedEventAdapter = moshi.m94398a(PollUpdatedEventDto.class);
        this.pollDeletedEventAdapter = moshi.m94398a(PollDeletedEventDto.class);
        this.pollClosedEventAdapter = moshi.m94398a(PollClosedEventDto.class);
        this.voteCastedEventAdapter = moshi.m94398a(VoteCastedEventDto.class);
        this.voteChangedEventAdapter = moshi.m94398a(VoteChangedEventDto.class);
        this.answerCastedEventAdapter = moshi.m94398a(AnswerCastedEventDto.class);
        this.voteRemovedEventAdapter = moshi.m94398a(VoteRemovedEventDto.class);
        this.reminderCreatedEventAdapter = moshi.m94398a(ReminderCreatedEventDto.class);
        this.reminderUpdatedEventAdapter = moshi.m94398a(ReminderUpdatedEventDto.class);
        this.reminderDeletedEventAdapter = moshi.m94398a(ReminderDeletedEventDto.class);
        this.notificationReminderDueEventAdapter = moshi.m94398a(NotificationReminderDueEventDto.class);
        this.userMessagesDeletedEventAdapter = moshi.m94398a(UserMessagesDeletedEventDto.class);
        this.aiTypingIndicatorUpdatedEventAdapter = moshi.m94398a(AIIndicatorUpdatedEventDto.class);
        this.aiTypingIndicatorClearEventAdapter = moshi.m94398a(AIIndicatorClearEventDto.class);
        this.aiTypingIndicatorStopEventAdapter = moshi.m94398a(AIIndicatorStopEventDto.class);
    }

    private final boolean containsAnswer(Map<String, ? extends Object> map) {
        Object obj = map.get("poll_vote");
        Map map2 = obj instanceof Map ? (Map) obj : null;
        Object obj2 = map2 != null ? map2.get("is_answer") : null;
        Boolean bool = obj2 instanceof Boolean ? (Boolean) obj2 : null;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final /* bridge */ /* synthetic */ void toJson(AbstractC30704c0 abstractC30704c0, Object obj) {
        toJson(abstractC30704c0, (ChatEventDto) obj);
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.squareup.moshi.JsonAdapter
    public final ChatEventDto fromJson(JsonReader reader) {
        JsonAdapter jsonAdapter;
        AbstractC22676k.m65750j(reader, "reader");
        if (reader.mo16731k() == EnumC30741w.f126546I) {
            reader.mo16730i();
            return null;
        }
        Object objFromJson = this.mapAdapter.fromJson(reader);
        AbstractC22676k.m65747g(objFromJson);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : ((Map) objFromJson).entrySet()) {
            if (entry.getValue() != null) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Object obj = linkedHashMap.get("type");
        String str = obj instanceof String ? (String) obj : null;
        if (str != null) {
            switch (str.hashCode()) {
                case -2145626921:
                    if (str.equals(EventType.THREAD_UPDATED)) {
                        jsonAdapter = this.threadUpdatedEventAdapter;
                        return (ChatEventDto) jsonAdapter.fromJsonValue(linkedHashMap);
                    }
                    break;
                case -2109288226:
                    if (str.equals(EventType.NOTIFICATION_MARK_UNREAD)) {
                        jsonAdapter = this.notificationMarkUnreadEventAdapter;
                        return (ChatEventDto) jsonAdapter.fromJsonValue(linkedHashMap);
                    }
                    break;
                case -2088332870:
                    if (str.equals(EventType.USER_UNBANNED)) {
                        jsonAdapter = linkedHashMap.containsKey("cid") ? this.channelUserUnbannedEventAdapter : this.globalUserUnbannedEventAdapter;
                        return (ChatEventDto) jsonAdapter.fromJsonValue(linkedHashMap);
                    }
                    break;
                case -2075946506:
                    if (str.equals(EventType.REACTION_UPDATED)) {
                        jsonAdapter = this.reactionUpdateEventAdapter;
                        return (ChatEventDto) jsonAdapter.fromJsonValue(linkedHashMap);
                    }
                    break;
                case -1991571309:
                    if (str.equals(EventType.CHANNEL_TRUNCATED)) {
                        jsonAdapter = this.channelTruncatedEventAdapter;
                        return (ChatEventDto) jsonAdapter.fromJsonValue(linkedHashMap);
                    }
                    break;
                case -1911060276:
                    if (str.equals(EventType.DRAFT_MESSAGE_DELETED)) {
                        jsonAdapter = this.draftMessageDeletedEventAdapter;
                        return (ChatEventDto) jsonAdapter.fromJsonValue(linkedHashMap);
                    }
                    break;
                case -1891614361:
                    if (str.equals(EventType.MEMBER_UPDATED)) {
                        jsonAdapter = this.memberUpdatedEventAdapter;
                        return (ChatEventDto) jsonAdapter.fromJsonValue(linkedHashMap);
                    }
                    break;
                case -1885558550:
                    if (str.equals(EventType.POLL_DELETED)) {
                        jsonAdapter = this.pollDeletedEventAdapter;
                        return (ChatEventDto) jsonAdapter.fromJsonValue(linkedHashMap);
                    }
                    break;
                case -1717161893:
                    if (str.equals("reaction.new")) {
                        jsonAdapter = this.reactionNewEventAdapter;
                        return (ChatEventDto) jsonAdapter.fromJsonValue(linkedHashMap);
                    }
                    break;
                case -1663226689:
                    if (str.equals(EventType.AI_TYPING_INDICATOR_UPDATED)) {
                        jsonAdapter = this.aiTypingIndicatorUpdatedEventAdapter;
                        return (ChatEventDto) jsonAdapter.fromJsonValue(linkedHashMap);
                    }
                    break;
                case -1634848648:
                    if (str.equals(EventType.NOTIFICATION_INVITED)) {
                        jsonAdapter = this.notificationInvitedEventAdapter;
                        return (ChatEventDto) jsonAdapter.fromJsonValue(linkedHashMap);
                    }
                    break;
                case -1606907269:
                    if (str.equals(EventType.POLL_CLOSED)) {
                        jsonAdapter = this.pollClosedEventAdapter;
                        return (ChatEventDto) jsonAdapter.fromJsonValue(linkedHashMap);
                    }
                    break;
                case -1527862027:
                    if (str.equals(EventType.CHANNEL_HIDDEN)) {
                        jsonAdapter = this.channelHiddenEventAdapter;
                        return (ChatEventDto) jsonAdapter.fromJsonValue(linkedHashMap);
                    }
                    break;
                case -1464370004:
                    if (str.equals(EventType.MEMBER_ADDED)) {
                        jsonAdapter = this.memberAddedEventAdapter;
                        return (ChatEventDto) jsonAdapter.fromJsonValue(linkedHashMap);
                    }
                    break;
                case -1460800646:
                    if (str.equals(EventType.USER_WATCHING_STOP)) {
                        jsonAdapter = this.userStopWatchingEventAdapter;
                        return (ChatEventDto) jsonAdapter.fromJsonValue(linkedHashMap);
                    }
                    break;
                case -1399538324:
                    if (str.equals(EventType.REMINDER_CREATED)) {
                        jsonAdapter = this.reminderCreatedEventAdapter;
                        return (ChatEventDto) jsonAdapter.fromJsonValue(linkedHashMap);
                    }
                    break;
                case -1331396835:
                    if (str.equals(EventType.MESSAGE_READ)) {
                        jsonAdapter = linkedHashMap.containsKey("cid") ? this.messageReadEventAdapter : this.markAllReadEventAdapter;
                        return (ChatEventDto) jsonAdapter.fromJsonValue(linkedHashMap);
                    }
                    break;
                case -1266107696:
                    if (str.equals(EventType.CHANNEL_UPDATED)) {
                        jsonAdapter = linkedHashMap.containsKey(UserState.Sources.USER) ? this.channelUpdatedByUserEventAdapter : this.channelUpdatedEventAdapter;
                        return (ChatEventDto) jsonAdapter.fromJsonValue(linkedHashMap);
                    }
                    break;
                case -1192399199:
                    if (str.equals(EventType.USER_BANNED)) {
                        jsonAdapter = linkedHashMap.containsKey("cid") ? this.channelUserBannedEventAdapter : this.globalUserBannedEventAdapter;
                        return (ChatEventDto) jsonAdapter.fromJsonValue(linkedHashMap);
                    }
                    break;
                case -1132674032:
                    if (str.equals(EventType.NOTIFICATION_REMOVED_FROM_CHANNEL)) {
                        jsonAdapter = this.notificationRemovedFromChannelEventAdapter;
                        return (ChatEventDto) jsonAdapter.fromJsonValue(linkedHashMap);
                    }
                    break;
                case -1049195388:
                    if (str.equals(EventType.USER_PRESENCE_CHANGED)) {
                        jsonAdapter = this.userPresenceChangedEventAdapter;
                        return (ChatEventDto) jsonAdapter.fromJsonValue(linkedHashMap);
                    }
                    break;
                case -1040225385:
                    if (str.equals(EventType.AI_TYPING_INDICATOR_CLEAR)) {
                        jsonAdapter = this.aiTypingIndicatorClearEventAdapter;
                        return (ChatEventDto) jsonAdapter.fromJsonValue(linkedHashMap);
                    }
                    break;
                case -1030434342:
                    if (str.equals(EventType.NOTIFICATION_CHANNEL_DELETED)) {
                        jsonAdapter = this.notificationChannelDeletedEventAdapter;
                        return (ChatEventDto) jsonAdapter.fromJsonValue(linkedHashMap);
                    }
                    break;
                case -934872620:
                    if (str.equals("message.updated")) {
                        jsonAdapter = this.messageUpdatedEventAdapter;
                        return (ChatEventDto) jsonAdapter.fromJsonValue(linkedHashMap);
                    }
                    break;
                case -877629795:
                    if (str.equals(EventType.REMINDER_DELETED)) {
                        jsonAdapter = this.reminderDeletedEventAdapter;
                        return (ChatEventDto) jsonAdapter.fromJsonValue(linkedHashMap);
                    }
                    break;
                case -874236103:
                    if (str.equals("message.new")) {
                        jsonAdapter = this.newMessageEventAdapter;
                        return (ChatEventDto) jsonAdapter.fromJsonValue(linkedHashMap);
                    }
                    break;
                case -852016853:
                    if (str.equals(EventType.TYPING_START)) {
                        jsonAdapter = this.typingStartEventAdapter;
                        return (ChatEventDto) jsonAdapter.fromJsonValue(linkedHashMap);
                    }
                    break;
                case -720220647:
                    if (str.equals(EventType.TYPING_STOP)) {
                        jsonAdapter = this.typingStopEventAdapter;
                        return (ChatEventDto) jsonAdapter.fromJsonValue(linkedHashMap);
                    }
                    break;
                case -717213450:
                    if (str.equals(EventType.USER_DELETED)) {
                        jsonAdapter = this.userDeletedEventAdapter;
                        return (ChatEventDto) jsonAdapter.fromJsonValue(linkedHashMap);
                    }
                    break;
                case -701520694:
                    if (str.equals("notification.reminder_due")) {
                        jsonAdapter = this.notificationReminderDueEventAdapter;
                        return (ChatEventDto) jsonAdapter.fromJsonValue(linkedHashMap);
                    }
                    break;
                case -619250538:
                    if (str.equals(EventType.NOTIFICATION_THREAD_MESSAGE_NEW)) {
                        jsonAdapter = this.notificationThreadMessageNewEventAdapter;
                        return (ChatEventDto) jsonAdapter.fromJsonValue(linkedHashMap);
                    }
                    break;
                case -565348084:
                    if (str.equals(EventType.MEMBER_REMOVED)) {
                        jsonAdapter = this.memberRemovedEventAdapter;
                        return (ChatEventDto) jsonAdapter.fromJsonValue(linkedHashMap);
                    }
                    break;
                case -564934009:
                    if (str.equals(EventType.CHANNEL_VISIBLE)) {
                        jsonAdapter = this.channelVisibleEventAdapter;
                        return (ChatEventDto) jsonAdapter.fromJsonValue(linkedHashMap);
                    }
                    break;
                case -557080842:
                    if (str.equals(EventType.HEALTH_CHECK)) {
                        jsonAdapter = linkedHashMap.containsKey("me") ? this.connectedEventAdapter : this.healthEventAdapter;
                        return (ChatEventDto) jsonAdapter.fromJsonValue(linkedHashMap);
                    }
                    break;
                case -438266561:
                    if (str.equals(EventType.NOTIFICATION_CHANNEL_TRUNCATED)) {
                        jsonAdapter = this.notificationChannelTruncatedEventAdapter;
                        return (ChatEventDto) jsonAdapter.fromJsonValue(linkedHashMap);
                    }
                    break;
                case -362422982:
                    if (str.equals(EventType.USER_MESSAGES_DELETED)) {
                        jsonAdapter = this.userMessagesDeletedEventAdapter;
                        return (ChatEventDto) jsonAdapter.fromJsonValue(linkedHashMap);
                    }
                    break;
                case -291053228:
                    if (str.equals(EventType.REACTION_DELETED)) {
                        jsonAdapter = this.reactionDeletedEventAdapter;
                        return (ChatEventDto) jsonAdapter.fromJsonValue(linkedHashMap);
                    }
                    break;
                case -203874568:
                    if (str.equals(EventType.CONNECTION_ERROR)) {
                        jsonAdapter = this.connectionErrorEventAdapter;
                        return (ChatEventDto) jsonAdapter.fromJsonValue(linkedHashMap);
                    }
                    break;
                case -121648284:
                    if (str.equals(EventType.POLL_VOTE_CASTED)) {
                        jsonAdapter = containsAnswer(linkedHashMap) ? this.answerCastedEventAdapter : this.voteCastedEventAdapter;
                        return (ChatEventDto) jsonAdapter.fromJsonValue(linkedHashMap);
                    }
                    break;
                case 244023672:
                    if (str.equals(EventType.AI_TYPING_INDICATOR_STOP)) {
                        jsonAdapter = this.aiTypingIndicatorStopEventAdapter;
                        return (ChatEventDto) jsonAdapter.fromJsonValue(linkedHashMap);
                    }
                    break;
                case 518785582:
                    if (str.equals(EventType.CHANNEL_DELETED)) {
                        jsonAdapter = this.channelDeletedEventAdapter;
                        return (ChatEventDto) jsonAdapter.fromJsonValue(linkedHashMap);
                    }
                    break;
                case 539667738:
                    if (str.equals(EventType.NOTIFICATION_INVITE_ACCEPTED)) {
                        jsonAdapter = this.notificationInviteAcceptedEventAdapter;
                        return (ChatEventDto) jsonAdapter.fromJsonValue(linkedHashMap);
                    }
                    break;
                case 599013742:
                    if (str.equals(EventType.DRAFT_MESSAGE_UPDATED)) {
                        jsonAdapter = this.draftMessageUpdatedEventAdapter;
                        return (ChatEventDto) jsonAdapter.fromJsonValue(linkedHashMap);
                    }
                    break;
                case 624515468:
                    if (str.equals(EventType.POLL_UPDATED)) {
                        jsonAdapter = this.pollUpdatedEventAdapter;
                        return (ChatEventDto) jsonAdapter.fromJsonValue(linkedHashMap);
                    }
                    break;
                case 707474478:
                    if (str.equals(EventType.POLL_VOTE_CHANGED)) {
                        jsonAdapter = containsAnswer(linkedHashMap) ? this.answerCastedEventAdapter : this.voteChangedEventAdapter;
                        return (ChatEventDto) jsonAdapter.fromJsonValue(linkedHashMap);
                    }
                    break;
                case 748333875:
                    if (str.equals(EventType.NOTIFICATION_MUTES_UPDATED)) {
                        jsonAdapter = this.notificationMutesUpdatedEventAdapter;
                        return (ChatEventDto) jsonAdapter.fromJsonValue(linkedHashMap);
                    }
                    break;
                case 850020658:
                    if (str.equals(EventType.MESSAGE_DELETED)) {
                        jsonAdapter = this.messageDeletedEventAdapter;
                        return (ChatEventDto) jsonAdapter.fromJsonValue(linkedHashMap);
                    }
                    break;
                case 942446429:
                    if (str.equals(EventType.MESSAGE_DELIVERED)) {
                        jsonAdapter = this.messageDeliveredEventAdapter;
                        return (ChatEventDto) jsonAdapter.fromJsonValue(linkedHashMap);
                    }
                    break;
                case 1060366810:
                    if (str.equals(EventType.POLL_VOTE_REMOVED)) {
                        jsonAdapter = this.voteRemovedEventAdapter;
                        return (ChatEventDto) jsonAdapter.fromJsonValue(linkedHashMap);
                    }
                    break;
                case 1282886273:
                    if (str.equals(EventType.NOTIFICATION_ADDED_TO_CHANNEL)) {
                        jsonAdapter = this.notificationAddedToChannelEventAdapter;
                        return (ChatEventDto) jsonAdapter.fromJsonValue(linkedHashMap);
                    }
                    break;
                case 1332341751:
                    if (str.equals(EventType.NOTIFICATION_CHANNEL_MUTES_UPDATED)) {
                        jsonAdapter = this.notificationChannelMutesUpdatedEventAdapter;
                        return (ChatEventDto) jsonAdapter.fromJsonValue(linkedHashMap);
                    }
                    break;
                case 1632444223:
                    if (str.equals(EventType.REMINDER_UPDATED)) {
                        jsonAdapter = this.reminderUpdatedEventAdapter;
                        return (ChatEventDto) jsonAdapter.fromJsonValue(linkedHashMap);
                    }
                    break;
                case 1792860568:
                    if (str.equals(EventType.USER_UPDATED)) {
                        jsonAdapter = this.userUpdatedEventAdapter;
                        return (ChatEventDto) jsonAdapter.fromJsonValue(linkedHashMap);
                    }
                    break;
                case 1830106757:
                    if (str.equals(EventType.NOTIFICATION_MARK_READ)) {
                        jsonAdapter = linkedHashMap.containsKey("cid") ? this.notificationMarkReadEventAdapter : this.markAllReadEventAdapter;
                        return (ChatEventDto) jsonAdapter.fromJsonValue(linkedHashMap);
                    }
                    break;
                case 1959806954:
                    if (str.equals(EventType.USER_WATCHING_START)) {
                        jsonAdapter = this.userStartWatchingEventAdapter;
                        return (ChatEventDto) jsonAdapter.fromJsonValue(linkedHashMap);
                    }
                    break;
                case 2015081701:
                    if (str.equals(EventType.NOTIFICATION_MESSAGE_NEW)) {
                        jsonAdapter = this.notificationMessageNewEventAdapter;
                        return (ChatEventDto) jsonAdapter.fromJsonValue(linkedHashMap);
                    }
                    break;
                case 2077696497:
                    if (str.equals(EventType.NOTIFICATION_INVITE_REJECTED)) {
                        jsonAdapter = this.notificationInviteRejectedEventAdapter;
                        return (ChatEventDto) jsonAdapter.fromJsonValue(linkedHashMap);
                    }
                    break;
            }
        }
        if (str == null) {
            str = EventType.UNKNOWN;
        }
        Object objFromJsonValue = this.moshi.m94398a(ExactDate.class).fromJsonValue(linkedHashMap.get("created_at"));
        AbstractC22676k.m65747g(objFromJsonValue);
        return new UnknownEventDto(str, (ExactDate) objFromJsonValue, (DownstreamUserDto) this.moshi.m94398a(DownstreamUserDto.class).fromJsonValue(linkedHashMap.get(UserState.Sources.USER)), linkedHashMap);
    }

    public final void toJson(AbstractC30704c0 writer, ChatEventDto value) {
        AbstractC22676k.m65750j(writer, "writer");
        throw new IllegalStateException(("Can't convert this event to Json " + value).toString());
    }
}
