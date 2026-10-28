package io.getstream.chat.android.client.api2.mapping;

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
import io.getstream.chat.android.client.api2.model.dto.ConnectingEventDto;
import io.getstream.chat.android.client.api2.model.dto.ConnectionErrorEventDto;
import io.getstream.chat.android.client.api2.model.dto.DisconnectedEventDto;
import io.getstream.chat.android.client.api2.model.dto.DownstreamChannelCustomDto;
import io.getstream.chat.android.client.api2.model.dto.DownstreamMessageDto;
import io.getstream.chat.android.client.api2.model.dto.DownstreamThreadInfoDto;
import io.getstream.chat.android.client.api2.model.dto.DownstreamUserDto;
import io.getstream.chat.android.client.api2.model.dto.DraftMessageDeletedEventDto;
import io.getstream.chat.android.client.api2.model.dto.DraftMessageUpdatedEventDto;
import io.getstream.chat.android.client.api2.model.dto.ErrorEventDto;
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
import io.getstream.chat.android.client.extensions.StringExtensionsKt;
import io.getstream.chat.android.models.Answer;
import io.getstream.chat.android.models.Channel;
import io.getstream.chat.android.models.ChannelInfo;
import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.models.Poll;
import io.getstream.chat.android.models.User;
import io.getstream.chat.android.models.Vote;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import l83.C23465k;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000¶\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0011\u0010\u0006\u001a\u00020\u0007*\u00020\bH\u0000¢\u0006\u0002\b\tJ\f\u0010\u0006\u001a\u00020\n*\u00020\u000bH\u0002J\f\u0010\u0006\u001a\u00020\f*\u00020\rH\u0002J\f\u0010\u0006\u001a\u00020\u000e*\u00020\u000fH\u0002J\f\u0010\u0006\u001a\u00020\u0010*\u00020\u0011H\u0002J\f\u0010\u0006\u001a\u00020\u0012*\u00020\u0013H\u0002J\f\u0010\u0006\u001a\u00020\u0014*\u00020\u0015H\u0002J\f\u0010\u0006\u001a\u00020\u0016*\u00020\u0017H\u0002J\f\u0010\u0006\u001a\u00020\u0018*\u00020\u0019H\u0002J\f\u0010\u0006\u001a\u00020\u001a*\u00020\u001bH\u0002J\f\u0010\u0006\u001a\u00020\u001c*\u00020\u001dH\u0002J\f\u0010\u0006\u001a\u00020\u001e*\u00020\u001fH\u0002J\f\u0010\u0006\u001a\u00020 *\u00020!H\u0002J\f\u0010\u0006\u001a\u00020\"*\u00020#H\u0002J\f\u0010\u0006\u001a\u00020$*\u00020%H\u0002J\f\u0010\u0006\u001a\u00020&*\u00020'H\u0002J\f\u0010\u0006\u001a\u00020(*\u00020)H\u0002J\f\u0010\u0006\u001a\u00020**\u00020+H\u0002J\f\u0010\u0006\u001a\u00020,*\u00020-H\u0002J\f\u0010\u0006\u001a\u00020.*\u00020/H\u0002J\f\u0010\u0006\u001a\u000200*\u000201H\u0002J\f\u0010\u0006\u001a\u000202*\u000203H\u0002J\f\u0010\u0006\u001a\u000204*\u000205H\u0002J\f\u0010\u0006\u001a\u000206*\u000207H\u0002J\f\u0010\u0006\u001a\u000208*\u000209H\u0002J\f\u0010\u0006\u001a\u00020:*\u00020;H\u0002J\f\u0010\u0006\u001a\u00020<*\u00020=H\u0002J\f\u0010\u0006\u001a\u00020>*\u00020?H\u0002J\f\u0010\u0006\u001a\u00020@*\u00020AH\u0002J\f\u0010\u0006\u001a\u00020B*\u00020CH\u0002J\f\u0010\u0006\u001a\u00020D*\u00020EH\u0002J\f\u0010\u0006\u001a\u00020F*\u00020GH\u0002J\f\u0010\u0006\u001a\u00020H*\u00020IH\u0002J\f\u0010\u0006\u001a\u00020J*\u00020KH\u0002J\f\u0010\u0006\u001a\u00020L*\u00020MH\u0002J\f\u0010\u0006\u001a\u00020N*\u00020OH\u0002J\f\u0010\u0006\u001a\u00020P*\u00020QH\u0002J\f\u0010\u0006\u001a\u00020R*\u00020SH\u0002J\f\u0010\u0006\u001a\u00020T*\u00020UH\u0002J\f\u0010\u0006\u001a\u00020V*\u00020WH\u0002J\f\u0010\u0006\u001a\u00020X*\u00020YH\u0002J\f\u0010\u0006\u001a\u00020Z*\u00020[H\u0002J\f\u0010\u0006\u001a\u00020\\*\u00020]H\u0002J\f\u0010\u0006\u001a\u00020^*\u00020_H\u0002J\f\u0010\u0006\u001a\u00020`*\u00020aH\u0002J\f\u0010\u0006\u001a\u00020b*\u00020cH\u0002J\f\u0010\u0006\u001a\u00020d*\u00020eH\u0002J\f\u0010\u0006\u001a\u00020f*\u00020gH\u0002J\f\u0010\u0006\u001a\u00020h*\u00020iH\u0002J\f\u0010\u0006\u001a\u00020j*\u00020kH\u0002J\f\u0010\u0006\u001a\u00020l*\u00020mH\u0002J\f\u0010\u0006\u001a\u00020n*\u00020oH\u0002J\f\u0010\u0006\u001a\u00020p*\u00020qH\u0002J\f\u0010\u0006\u001a\u00020r*\u00020sH\u0002J\f\u0010\u0006\u001a\u00020t*\u00020uH\u0002J\f\u0010\u0006\u001a\u00020v*\u00020wH\u0002J\f\u0010\u0006\u001a\u00020x*\u00020yH\u0002J\f\u0010\u0006\u001a\u00020z*\u00020{H\u0002J\f\u0010\u0006\u001a\u00020|*\u00020}H\u0002J\f\u0010\u0006\u001a\u00020~*\u00020\u007fH\u0002J\u000e\u0010\u0006\u001a\u00030\u0080\u0001*\u00030\u0081\u0001H\u0002J\u000e\u0010\u0006\u001a\u00030\u0082\u0001*\u00030\u0083\u0001H\u0002J\u000e\u0010\u0006\u001a\u00030\u0084\u0001*\u00030\u0085\u0001H\u0002J\u000e\u0010\u0006\u001a\u00030\u0086\u0001*\u00030\u0087\u0001H\u0002J\u000e\u0010\u0006\u001a\u00030\u0088\u0001*\u00030\u0089\u0001H\u0002J\u000e\u0010\u0006\u001a\u00030\u008a\u0001*\u00030\u008b\u0001H\u0002J\u000e\u0010\u0006\u001a\u00030\u008c\u0001*\u00030\u008d\u0001H\u0002J\u000e\u0010\u0006\u001a\u00030\u008e\u0001*\u00030\u008f\u0001H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0090\u0001"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/mapping/EventMapping;", "", "domainMapping", "Lio/getstream/chat/android/client/api2/mapping/DomainMapping;", "<init>", "(Lio/getstream/chat/android/client/api2/mapping/DomainMapping;)V", "toDomain", "Lio/getstream/chat/android/client/events/ChatEvent;", "Lio/getstream/chat/android/client/api2/model/dto/ChatEventDto;", "toDomain$stream_chat_android_client_release", "Lio/getstream/chat/android/client/events/ChannelDeletedEvent;", "Lio/getstream/chat/android/client/api2/model/dto/ChannelDeletedEventDto;", "Lio/getstream/chat/android/client/events/ChannelHiddenEvent;", "Lio/getstream/chat/android/client/api2/model/dto/ChannelHiddenEventDto;", "Lio/getstream/chat/android/client/events/ChannelTruncatedEvent;", "Lio/getstream/chat/android/client/api2/model/dto/ChannelTruncatedEventDto;", "Lio/getstream/chat/android/client/events/ChannelUpdatedEvent;", "Lio/getstream/chat/android/client/api2/model/dto/ChannelUpdatedEventDto;", "Lio/getstream/chat/android/client/events/ChannelUpdatedByUserEvent;", "Lio/getstream/chat/android/client/api2/model/dto/ChannelUpdatedByUserEventDto;", "Lio/getstream/chat/android/client/events/ChannelVisibleEvent;", "Lio/getstream/chat/android/client/api2/model/dto/ChannelVisibleEventDto;", "Lio/getstream/chat/android/client/events/HealthEvent;", "Lio/getstream/chat/android/client/api2/model/dto/HealthEventDto;", "Lio/getstream/chat/android/client/events/MemberAddedEvent;", "Lio/getstream/chat/android/client/api2/model/dto/MemberAddedEventDto;", "Lio/getstream/chat/android/client/events/MemberRemovedEvent;", "Lio/getstream/chat/android/client/api2/model/dto/MemberRemovedEventDto;", "Lio/getstream/chat/android/client/events/MemberUpdatedEvent;", "Lio/getstream/chat/android/client/api2/model/dto/MemberUpdatedEventDto;", "Lio/getstream/chat/android/client/events/MessageDeletedEvent;", "Lio/getstream/chat/android/client/api2/model/dto/MessageDeletedEventDto;", "Lio/getstream/chat/android/client/events/MessageDeliveredEvent;", "Lio/getstream/chat/android/client/api2/model/dto/MessageDeliveredEventDto;", "Lio/getstream/chat/android/client/events/MessageReadEvent;", "Lio/getstream/chat/android/client/api2/model/dto/MessageReadEventDto;", "Lio/getstream/chat/android/client/events/MessageUpdatedEvent;", "Lio/getstream/chat/android/client/api2/model/dto/MessageUpdatedEventDto;", "Lio/getstream/chat/android/client/events/NewMessageEvent;", "Lio/getstream/chat/android/client/api2/model/dto/NewMessageEventDto;", "Lio/getstream/chat/android/client/events/NotificationAddedToChannelEvent;", "Lio/getstream/chat/android/client/api2/model/dto/NotificationAddedToChannelEventDto;", "Lio/getstream/chat/android/client/events/NotificationChannelDeletedEvent;", "Lio/getstream/chat/android/client/api2/model/dto/NotificationChannelDeletedEventDto;", "Lio/getstream/chat/android/client/events/NotificationChannelMutesUpdatedEvent;", "Lio/getstream/chat/android/client/api2/model/dto/NotificationChannelMutesUpdatedEventDto;", "Lio/getstream/chat/android/client/events/NotificationChannelTruncatedEvent;", "Lio/getstream/chat/android/client/api2/model/dto/NotificationChannelTruncatedEventDto;", "Lio/getstream/chat/android/client/events/NotificationInviteAcceptedEvent;", "Lio/getstream/chat/android/client/api2/model/dto/NotificationInviteAcceptedEventDto;", "Lio/getstream/chat/android/client/events/NotificationInviteRejectedEvent;", "Lio/getstream/chat/android/client/api2/model/dto/NotificationInviteRejectedEventDto;", "Lio/getstream/chat/android/client/events/NotificationInvitedEvent;", "Lio/getstream/chat/android/client/api2/model/dto/NotificationInvitedEventDto;", "Lio/getstream/chat/android/client/events/NotificationMarkReadEvent;", "Lio/getstream/chat/android/client/api2/model/dto/NotificationMarkReadEventDto;", "Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;", "Lio/getstream/chat/android/client/api2/model/dto/NotificationMarkUnreadEventDto;", "Lio/getstream/chat/android/client/events/MarkAllReadEvent;", "Lio/getstream/chat/android/client/api2/model/dto/MarkAllReadEventDto;", "Lio/getstream/chat/android/client/events/NotificationMessageNewEvent;", "Lio/getstream/chat/android/client/api2/model/dto/NotificationMessageNewEventDto;", "Lio/getstream/chat/android/client/events/ThreadUpdatedEvent;", "Lio/getstream/chat/android/client/api2/model/dto/ThreadUpdatedEventDto;", "Lio/getstream/chat/android/client/events/NotificationThreadMessageNewEvent;", "Lio/getstream/chat/android/client/api2/model/dto/NotificationThreadMessageNewEventDto;", "Lio/getstream/chat/android/client/events/NotificationMutesUpdatedEvent;", "Lio/getstream/chat/android/client/api2/model/dto/NotificationMutesUpdatedEventDto;", "Lio/getstream/chat/android/client/events/NotificationRemovedFromChannelEvent;", "Lio/getstream/chat/android/client/api2/model/dto/NotificationRemovedFromChannelEventDto;", "Lio/getstream/chat/android/client/events/ReactionDeletedEvent;", "Lio/getstream/chat/android/client/api2/model/dto/ReactionDeletedEventDto;", "Lio/getstream/chat/android/client/events/ReactionNewEvent;", "Lio/getstream/chat/android/client/api2/model/dto/ReactionNewEventDto;", "Lio/getstream/chat/android/client/events/ReactionUpdateEvent;", "Lio/getstream/chat/android/client/api2/model/dto/ReactionUpdateEventDto;", "Lio/getstream/chat/android/client/events/TypingStartEvent;", "Lio/getstream/chat/android/client/api2/model/dto/TypingStartEventDto;", "Lio/getstream/chat/android/client/events/TypingStopEvent;", "Lio/getstream/chat/android/client/api2/model/dto/TypingStopEventDto;", "Lio/getstream/chat/android/client/events/ChannelUserBannedEvent;", "Lio/getstream/chat/android/client/api2/model/dto/ChannelUserBannedEventDto;", "Lio/getstream/chat/android/client/events/GlobalUserBannedEvent;", "Lio/getstream/chat/android/client/api2/model/dto/GlobalUserBannedEventDto;", "Lio/getstream/chat/android/client/events/UserDeletedEvent;", "Lio/getstream/chat/android/client/api2/model/dto/UserDeletedEventDto;", "Lio/getstream/chat/android/client/events/UserPresenceChangedEvent;", "Lio/getstream/chat/android/client/api2/model/dto/UserPresenceChangedEventDto;", "Lio/getstream/chat/android/client/events/UserStartWatchingEvent;", "Lio/getstream/chat/android/client/api2/model/dto/UserStartWatchingEventDto;", "Lio/getstream/chat/android/client/events/UserStopWatchingEvent;", "Lio/getstream/chat/android/client/api2/model/dto/UserStopWatchingEventDto;", "Lio/getstream/chat/android/client/events/ChannelUserUnbannedEvent;", "Lio/getstream/chat/android/client/api2/model/dto/ChannelUserUnbannedEventDto;", "Lio/getstream/chat/android/client/events/GlobalUserUnbannedEvent;", "Lio/getstream/chat/android/client/api2/model/dto/GlobalUserUnbannedEventDto;", "Lio/getstream/chat/android/client/events/UserUpdatedEvent;", "Lio/getstream/chat/android/client/api2/model/dto/UserUpdatedEventDto;", "Lio/getstream/chat/android/client/events/PollClosedEvent;", "Lio/getstream/chat/android/client/api2/model/dto/PollClosedEventDto;", "Lio/getstream/chat/android/client/events/PollDeletedEvent;", "Lio/getstream/chat/android/client/api2/model/dto/PollDeletedEventDto;", "Lio/getstream/chat/android/client/events/PollUpdatedEvent;", "Lio/getstream/chat/android/client/api2/model/dto/PollUpdatedEventDto;", "Lio/getstream/chat/android/client/events/VoteCastedEvent;", "Lio/getstream/chat/android/client/api2/model/dto/VoteCastedEventDto;", "Lio/getstream/chat/android/client/events/AnswerCastedEvent;", "Lio/getstream/chat/android/client/api2/model/dto/AnswerCastedEventDto;", "Lio/getstream/chat/android/client/events/VoteChangedEvent;", "Lio/getstream/chat/android/client/api2/model/dto/VoteChangedEventDto;", "Lio/getstream/chat/android/client/events/VoteRemovedEvent;", "Lio/getstream/chat/android/client/api2/model/dto/VoteRemovedEventDto;", "Lio/getstream/chat/android/client/events/DraftMessageUpdatedEvent;", "Lio/getstream/chat/android/client/api2/model/dto/DraftMessageUpdatedEventDto;", "Lio/getstream/chat/android/client/events/DraftMessageDeletedEvent;", "Lio/getstream/chat/android/client/api2/model/dto/DraftMessageDeletedEventDto;", "Lio/getstream/chat/android/client/events/ReminderCreatedEvent;", "Lio/getstream/chat/android/client/api2/model/dto/ReminderCreatedEventDto;", "Lio/getstream/chat/android/client/events/ReminderUpdatedEvent;", "Lio/getstream/chat/android/client/api2/model/dto/ReminderUpdatedEventDto;", "Lio/getstream/chat/android/client/events/ReminderDeletedEvent;", "Lio/getstream/chat/android/client/api2/model/dto/ReminderDeletedEventDto;", "Lio/getstream/chat/android/client/events/NotificationReminderDueEvent;", "Lio/getstream/chat/android/client/api2/model/dto/NotificationReminderDueEventDto;", "Lio/getstream/chat/android/client/events/UserMessagesDeletedEvent;", "Lio/getstream/chat/android/client/api2/model/dto/UserMessagesDeletedEventDto;", "Lio/getstream/chat/android/client/events/AIIndicatorUpdatedEvent;", "Lio/getstream/chat/android/client/api2/model/dto/AIIndicatorUpdatedEventDto;", "Lio/getstream/chat/android/client/events/AIIndicatorClearEvent;", "Lio/getstream/chat/android/client/api2/model/dto/AIIndicatorClearEventDto;", "Lio/getstream/chat/android/client/events/AIIndicatorStopEvent;", "Lio/getstream/chat/android/client/api2/model/dto/AIIndicatorStopEventDto;", "Lio/getstream/chat/android/client/events/ConnectedEvent;", "Lio/getstream/chat/android/client/api2/model/dto/ConnectedEventDto;", "Lio/getstream/chat/android/client/events/ConnectionErrorEvent;", "Lio/getstream/chat/android/client/api2/model/dto/ConnectionErrorEventDto;", "Lio/getstream/chat/android/client/events/ConnectingEvent;", "Lio/getstream/chat/android/client/api2/model/dto/ConnectingEventDto;", "Lio/getstream/chat/android/client/events/DisconnectedEvent;", "Lio/getstream/chat/android/client/api2/model/dto/DisconnectedEventDto;", "Lio/getstream/chat/android/client/events/ErrorEvent;", "Lio/getstream/chat/android/client/api2/model/dto/ErrorEventDto;", "Lio/getstream/chat/android/client/events/UnknownEvent;", "Lio/getstream/chat/android/client/api2/model/dto/UnknownEventDto;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class EventMapping {
    private final DomainMapping domainMapping;

    public EventMapping(DomainMapping domainMapping) {
        AbstractC22676k.m65750j(domainMapping, "domainMapping");
        this.domainMapping = domainMapping;
    }

    private final ChannelDeletedEvent toDomain(ChannelDeletedEventDto channelDeletedEventDto) {
        DomainMapping domainMapping = this.domainMapping;
        String type = channelDeletedEventDto.getType();
        Date date$stream_chat_android_client_release = channelDeletedEventDto.getCreated_at().getDate$stream_chat_android_client_release();
        String rawDate$stream_chat_android_client_release = channelDeletedEventDto.getCreated_at().getRawDate$stream_chat_android_client_release();
        String cid = channelDeletedEventDto.getCid();
        String channel_type = channelDeletedEventDto.getChannel_type();
        String channel_id = channelDeletedEventDto.getChannel_id();
        Channel domain$stream_chat_android_client_release = domainMapping.toDomain$stream_chat_android_client_release(channelDeletedEventDto.getChannel());
        DownstreamUserDto user = channelDeletedEventDto.getUser();
        return new ChannelDeletedEvent(type, date$stream_chat_android_client_release, rawDate$stream_chat_android_client_release, cid, channel_type, channel_id, domain$stream_chat_android_client_release, user != null ? domainMapping.toDomain$stream_chat_android_client_release(user) : null);
    }

    public final ChatEvent toDomain$stream_chat_android_client_release(ChatEventDto chatEventDto) {
        AbstractC22676k.m65750j(chatEventDto, "<this>");
        if (chatEventDto instanceof NewMessageEventDto) {
            return toDomain((NewMessageEventDto) chatEventDto);
        }
        if (chatEventDto instanceof ChannelDeletedEventDto) {
            return toDomain((ChannelDeletedEventDto) chatEventDto);
        }
        if (chatEventDto instanceof ChannelHiddenEventDto) {
            return toDomain((ChannelHiddenEventDto) chatEventDto);
        }
        if (chatEventDto instanceof ChannelTruncatedEventDto) {
            return toDomain((ChannelTruncatedEventDto) chatEventDto);
        }
        if (chatEventDto instanceof ChannelUpdatedByUserEventDto) {
            return toDomain((ChannelUpdatedByUserEventDto) chatEventDto);
        }
        if (chatEventDto instanceof ChannelUpdatedEventDto) {
            return toDomain((ChannelUpdatedEventDto) chatEventDto);
        }
        if (chatEventDto instanceof ChannelUserBannedEventDto) {
            return toDomain((ChannelUserBannedEventDto) chatEventDto);
        }
        if (chatEventDto instanceof ChannelUserUnbannedEventDto) {
            return toDomain((ChannelUserUnbannedEventDto) chatEventDto);
        }
        if (chatEventDto instanceof ChannelVisibleEventDto) {
            return toDomain((ChannelVisibleEventDto) chatEventDto);
        }
        if (chatEventDto instanceof ConnectedEventDto) {
            return toDomain((ConnectedEventDto) chatEventDto);
        }
        if (chatEventDto instanceof ConnectionErrorEventDto) {
            return toDomain((ConnectionErrorEventDto) chatEventDto);
        }
        if (chatEventDto instanceof ConnectingEventDto) {
            return toDomain((ConnectingEventDto) chatEventDto);
        }
        if (chatEventDto instanceof DisconnectedEventDto) {
            return toDomain((DisconnectedEventDto) chatEventDto);
        }
        if (chatEventDto instanceof ErrorEventDto) {
            return toDomain((ErrorEventDto) chatEventDto);
        }
        if (chatEventDto instanceof GlobalUserBannedEventDto) {
            return toDomain((GlobalUserBannedEventDto) chatEventDto);
        }
        if (chatEventDto instanceof GlobalUserUnbannedEventDto) {
            return toDomain((GlobalUserUnbannedEventDto) chatEventDto);
        }
        if (chatEventDto instanceof HealthEventDto) {
            return toDomain((HealthEventDto) chatEventDto);
        }
        if (chatEventDto instanceof MarkAllReadEventDto) {
            return toDomain((MarkAllReadEventDto) chatEventDto);
        }
        if (chatEventDto instanceof MemberAddedEventDto) {
            return toDomain((MemberAddedEventDto) chatEventDto);
        }
        if (chatEventDto instanceof MemberRemovedEventDto) {
            return toDomain((MemberRemovedEventDto) chatEventDto);
        }
        if (chatEventDto instanceof MemberUpdatedEventDto) {
            return toDomain((MemberUpdatedEventDto) chatEventDto);
        }
        if (chatEventDto instanceof MessageDeletedEventDto) {
            return toDomain((MessageDeletedEventDto) chatEventDto);
        }
        if (chatEventDto instanceof MessageDeliveredEventDto) {
            return toDomain((MessageDeliveredEventDto) chatEventDto);
        }
        if (chatEventDto instanceof MessageReadEventDto) {
            return toDomain((MessageReadEventDto) chatEventDto);
        }
        if (chatEventDto instanceof MessageUpdatedEventDto) {
            return toDomain((MessageUpdatedEventDto) chatEventDto);
        }
        if (chatEventDto instanceof NotificationAddedToChannelEventDto) {
            return toDomain((NotificationAddedToChannelEventDto) chatEventDto);
        }
        if (chatEventDto instanceof NotificationChannelDeletedEventDto) {
            return toDomain((NotificationChannelDeletedEventDto) chatEventDto);
        }
        if (chatEventDto instanceof NotificationChannelMutesUpdatedEventDto) {
            return toDomain((NotificationChannelMutesUpdatedEventDto) chatEventDto);
        }
        if (chatEventDto instanceof NotificationChannelTruncatedEventDto) {
            return toDomain((NotificationChannelTruncatedEventDto) chatEventDto);
        }
        if (chatEventDto instanceof NotificationInviteAcceptedEventDto) {
            return toDomain((NotificationInviteAcceptedEventDto) chatEventDto);
        }
        if (chatEventDto instanceof NotificationInviteRejectedEventDto) {
            return toDomain((NotificationInviteRejectedEventDto) chatEventDto);
        }
        if (chatEventDto instanceof NotificationInvitedEventDto) {
            return toDomain((NotificationInvitedEventDto) chatEventDto);
        }
        if (chatEventDto instanceof NotificationMarkReadEventDto) {
            return toDomain((NotificationMarkReadEventDto) chatEventDto);
        }
        if (chatEventDto instanceof NotificationMarkUnreadEventDto) {
            return toDomain((NotificationMarkUnreadEventDto) chatEventDto);
        }
        if (chatEventDto instanceof NotificationMessageNewEventDto) {
            return toDomain((NotificationMessageNewEventDto) chatEventDto);
        }
        if (chatEventDto instanceof NotificationThreadMessageNewEventDto) {
            return toDomain((NotificationThreadMessageNewEventDto) chatEventDto);
        }
        if (chatEventDto instanceof ThreadUpdatedEventDto) {
            return toDomain((ThreadUpdatedEventDto) chatEventDto);
        }
        if (chatEventDto instanceof NotificationMutesUpdatedEventDto) {
            return toDomain((NotificationMutesUpdatedEventDto) chatEventDto);
        }
        if (chatEventDto instanceof NotificationRemovedFromChannelEventDto) {
            return toDomain((NotificationRemovedFromChannelEventDto) chatEventDto);
        }
        if (chatEventDto instanceof ReactionDeletedEventDto) {
            return toDomain((ReactionDeletedEventDto) chatEventDto);
        }
        if (chatEventDto instanceof ReactionNewEventDto) {
            return toDomain((ReactionNewEventDto) chatEventDto);
        }
        if (chatEventDto instanceof ReactionUpdateEventDto) {
            return toDomain((ReactionUpdateEventDto) chatEventDto);
        }
        if (chatEventDto instanceof TypingStartEventDto) {
            return toDomain((TypingStartEventDto) chatEventDto);
        }
        if (chatEventDto instanceof TypingStopEventDto) {
            return toDomain((TypingStopEventDto) chatEventDto);
        }
        if (chatEventDto instanceof UnknownEventDto) {
            return toDomain((UnknownEventDto) chatEventDto);
        }
        if (chatEventDto instanceof UserDeletedEventDto) {
            return toDomain((UserDeletedEventDto) chatEventDto);
        }
        if (chatEventDto instanceof UserPresenceChangedEventDto) {
            return toDomain((UserPresenceChangedEventDto) chatEventDto);
        }
        if (chatEventDto instanceof UserStartWatchingEventDto) {
            return toDomain((UserStartWatchingEventDto) chatEventDto);
        }
        if (chatEventDto instanceof UserStopWatchingEventDto) {
            return toDomain((UserStopWatchingEventDto) chatEventDto);
        }
        if (chatEventDto instanceof UserUpdatedEventDto) {
            return toDomain((UserUpdatedEventDto) chatEventDto);
        }
        if (chatEventDto instanceof PollClosedEventDto) {
            return toDomain((PollClosedEventDto) chatEventDto);
        }
        if (chatEventDto instanceof PollDeletedEventDto) {
            return toDomain((PollDeletedEventDto) chatEventDto);
        }
        if (chatEventDto instanceof PollUpdatedEventDto) {
            return toDomain((PollUpdatedEventDto) chatEventDto);
        }
        if (chatEventDto instanceof VoteCastedEventDto) {
            return toDomain((VoteCastedEventDto) chatEventDto);
        }
        if (chatEventDto instanceof VoteChangedEventDto) {
            return toDomain((VoteChangedEventDto) chatEventDto);
        }
        if (chatEventDto instanceof AnswerCastedEventDto) {
            return toDomain((AnswerCastedEventDto) chatEventDto);
        }
        if (chatEventDto instanceof VoteRemovedEventDto) {
            return toDomain((VoteRemovedEventDto) chatEventDto);
        }
        if (chatEventDto instanceof DraftMessageDeletedEventDto) {
            return toDomain((DraftMessageDeletedEventDto) chatEventDto);
        }
        if (chatEventDto instanceof DraftMessageUpdatedEventDto) {
            return toDomain((DraftMessageUpdatedEventDto) chatEventDto);
        }
        if (chatEventDto instanceof ReminderCreatedEventDto) {
            return toDomain((ReminderCreatedEventDto) chatEventDto);
        }
        if (chatEventDto instanceof ReminderUpdatedEventDto) {
            return toDomain((ReminderUpdatedEventDto) chatEventDto);
        }
        if (chatEventDto instanceof ReminderDeletedEventDto) {
            return toDomain((ReminderDeletedEventDto) chatEventDto);
        }
        if (chatEventDto instanceof NotificationReminderDueEventDto) {
            return toDomain((NotificationReminderDueEventDto) chatEventDto);
        }
        if (chatEventDto instanceof UserMessagesDeletedEventDto) {
            return toDomain((UserMessagesDeletedEventDto) chatEventDto);
        }
        if (chatEventDto instanceof AIIndicatorUpdatedEventDto) {
            return toDomain((AIIndicatorUpdatedEventDto) chatEventDto);
        }
        if (chatEventDto instanceof AIIndicatorClearEventDto) {
            return toDomain((AIIndicatorClearEventDto) chatEventDto);
        }
        if (chatEventDto instanceof AIIndicatorStopEventDto) {
            return toDomain((AIIndicatorStopEventDto) chatEventDto);
        }
        throw new NoWhenBranchMatchedException();
    }

    private final ChannelHiddenEvent toDomain(ChannelHiddenEventDto channelHiddenEventDto) {
        DomainMapping domainMapping = this.domainMapping;
        return new ChannelHiddenEvent(channelHiddenEventDto.getType(), channelHiddenEventDto.getCreated_at().getDate$stream_chat_android_client_release(), channelHiddenEventDto.getCreated_at().getRawDate$stream_chat_android_client_release(), channelHiddenEventDto.getCid(), channelHiddenEventDto.getChannel_type(), channelHiddenEventDto.getChannel_id(), domainMapping.toDomain$stream_chat_android_client_release(channelHiddenEventDto.getUser()), domainMapping.toDomain$stream_chat_android_client_release(channelHiddenEventDto.getChannel()), channelHiddenEventDto.getClear_history());
    }

    private final ChannelTruncatedEvent toDomain(ChannelTruncatedEventDto channelTruncatedEventDto) {
        DomainMapping domainMapping = this.domainMapping;
        String type = channelTruncatedEventDto.getType();
        Date date$stream_chat_android_client_release = channelTruncatedEventDto.getCreated_at().getDate$stream_chat_android_client_release();
        String rawDate$stream_chat_android_client_release = channelTruncatedEventDto.getCreated_at().getRawDate$stream_chat_android_client_release();
        String cid = channelTruncatedEventDto.getCid();
        String channel_type = channelTruncatedEventDto.getChannel_type();
        String channel_id = channelTruncatedEventDto.getChannel_id();
        DownstreamUserDto user = channelTruncatedEventDto.getUser();
        User domain$stream_chat_android_client_release = user != null ? domainMapping.toDomain$stream_chat_android_client_release(user) : null;
        DownstreamMessageDto message = channelTruncatedEventDto.getMessage();
        return new ChannelTruncatedEvent(type, date$stream_chat_android_client_release, rawDate$stream_chat_android_client_release, cid, channel_type, channel_id, domainMapping.toDomain$stream_chat_android_client_release(channelTruncatedEventDto.getChannel()), domain$stream_chat_android_client_release, message != null ? domainMapping.toDomain$stream_chat_android_client_release(message, domainMapping.toChannelInfo$stream_chat_android_client_release(channelTruncatedEventDto.getChannel())) : null);
    }

    private final ChannelUpdatedEvent toDomain(ChannelUpdatedEventDto channelUpdatedEventDto) {
        DomainMapping domainMapping = this.domainMapping;
        String type = channelUpdatedEventDto.getType();
        Date date$stream_chat_android_client_release = channelUpdatedEventDto.getCreated_at().getDate$stream_chat_android_client_release();
        String rawDate$stream_chat_android_client_release = channelUpdatedEventDto.getCreated_at().getRawDate$stream_chat_android_client_release();
        String cid = channelUpdatedEventDto.getCid();
        String channel_type = channelUpdatedEventDto.getChannel_type();
        String channel_id = channelUpdatedEventDto.getChannel_id();
        DownstreamMessageDto message = channelUpdatedEventDto.getMessage();
        return new ChannelUpdatedEvent(type, date$stream_chat_android_client_release, rawDate$stream_chat_android_client_release, cid, channel_type, channel_id, domainMapping.toDomain$stream_chat_android_client_release(channelUpdatedEventDto.getChannel()), message != null ? domainMapping.toDomain$stream_chat_android_client_release(message, domainMapping.toChannelInfo$stream_chat_android_client_release(channelUpdatedEventDto.getChannel())) : null);
    }

    private final ChannelUpdatedByUserEvent toDomain(ChannelUpdatedByUserEventDto channelUpdatedByUserEventDto) {
        DomainMapping domainMapping = this.domainMapping;
        String type = channelUpdatedByUserEventDto.getType();
        Date date$stream_chat_android_client_release = channelUpdatedByUserEventDto.getCreated_at().getDate$stream_chat_android_client_release();
        String rawDate$stream_chat_android_client_release = channelUpdatedByUserEventDto.getCreated_at().getRawDate$stream_chat_android_client_release();
        String cid = channelUpdatedByUserEventDto.getCid();
        String channel_type = channelUpdatedByUserEventDto.getChannel_type();
        String channel_id = channelUpdatedByUserEventDto.getChannel_id();
        User domain$stream_chat_android_client_release = domainMapping.toDomain$stream_chat_android_client_release(channelUpdatedByUserEventDto.getUser());
        DownstreamMessageDto message = channelUpdatedByUserEventDto.getMessage();
        return new ChannelUpdatedByUserEvent(type, date$stream_chat_android_client_release, rawDate$stream_chat_android_client_release, cid, channel_type, channel_id, domain$stream_chat_android_client_release, domainMapping.toDomain$stream_chat_android_client_release(channelUpdatedByUserEventDto.getChannel()), message != null ? domainMapping.toDomain$stream_chat_android_client_release(message, domainMapping.toChannelInfo$stream_chat_android_client_release(channelUpdatedByUserEventDto.getChannel())) : null);
    }

    private final ChannelVisibleEvent toDomain(ChannelVisibleEventDto channelVisibleEventDto) {
        DomainMapping domainMapping = this.domainMapping;
        return new ChannelVisibleEvent(channelVisibleEventDto.getType(), channelVisibleEventDto.getCreated_at().getDate$stream_chat_android_client_release(), channelVisibleEventDto.getCreated_at().getRawDate$stream_chat_android_client_release(), channelVisibleEventDto.getCid(), channelVisibleEventDto.getChannel_type(), channelVisibleEventDto.getChannel_id(), domainMapping.toDomain$stream_chat_android_client_release(channelVisibleEventDto.getUser()), domainMapping.toDomain$stream_chat_android_client_release(channelVisibleEventDto.getChannel()));
    }

    private final HealthEvent toDomain(HealthEventDto healthEventDto) {
        return new HealthEvent(healthEventDto.getType(), healthEventDto.getCreated_at().getDate$stream_chat_android_client_release(), healthEventDto.getCreated_at().getRawDate$stream_chat_android_client_release(), healthEventDto.getConnection_id());
    }

    private final MemberAddedEvent toDomain(MemberAddedEventDto memberAddedEventDto) {
        DomainMapping domainMapping = this.domainMapping;
        return new MemberAddedEvent(memberAddedEventDto.getType(), memberAddedEventDto.getCreated_at().getDate$stream_chat_android_client_release(), memberAddedEventDto.getCreated_at().getRawDate$stream_chat_android_client_release(), domainMapping.toDomain$stream_chat_android_client_release(memberAddedEventDto.getUser()), memberAddedEventDto.getCid(), memberAddedEventDto.getChannel_type(), memberAddedEventDto.getChannel_id(), domainMapping.toDomain$stream_chat_android_client_release(memberAddedEventDto.getMember()));
    }

    private final MemberRemovedEvent toDomain(MemberRemovedEventDto memberRemovedEventDto) {
        DomainMapping domainMapping = this.domainMapping;
        return new MemberRemovedEvent(memberRemovedEventDto.getType(), memberRemovedEventDto.getCreated_at().getDate$stream_chat_android_client_release(), memberRemovedEventDto.getCreated_at().getRawDate$stream_chat_android_client_release(), domainMapping.toDomain$stream_chat_android_client_release(memberRemovedEventDto.getUser()), memberRemovedEventDto.getCid(), memberRemovedEventDto.getChannel_type(), memberRemovedEventDto.getChannel_id(), domainMapping.toDomain$stream_chat_android_client_release(memberRemovedEventDto.getMember()));
    }

    private final MemberUpdatedEvent toDomain(MemberUpdatedEventDto memberUpdatedEventDto) {
        DomainMapping domainMapping = this.domainMapping;
        return new MemberUpdatedEvent(memberUpdatedEventDto.getType(), memberUpdatedEventDto.getCreated_at().getDate$stream_chat_android_client_release(), memberUpdatedEventDto.getCreated_at().getRawDate$stream_chat_android_client_release(), domainMapping.toDomain$stream_chat_android_client_release(memberUpdatedEventDto.getUser()), memberUpdatedEventDto.getCid(), memberUpdatedEventDto.getChannel_type(), memberUpdatedEventDto.getChannel_id(), domainMapping.toDomain$stream_chat_android_client_release(memberUpdatedEventDto.getMember()));
    }

    private final MessageDeletedEvent toDomain(MessageDeletedEventDto messageDeletedEventDto) {
        ChannelInfo channelInfo;
        User domain$stream_chat_android_client_release;
        DomainMapping domainMapping = this.domainMapping;
        String type = messageDeletedEventDto.getType();
        Date date$stream_chat_android_client_release = messageDeletedEventDto.getCreated_at().getDate$stream_chat_android_client_release();
        String rawDate$stream_chat_android_client_release = messageDeletedEventDto.getCreated_at().getRawDate$stream_chat_android_client_release();
        DownstreamUserDto user = messageDeletedEventDto.getUser();
        if (user != null) {
            domain$stream_chat_android_client_release = domainMapping.toDomain$stream_chat_android_client_release(user);
            channelInfo = null;
        } else {
            channelInfo = null;
            domain$stream_chat_android_client_release = null;
        }
        String cid = messageDeletedEventDto.getCid();
        String channel_type = messageDeletedEventDto.getChannel_type();
        String channel_id = messageDeletedEventDto.getChannel_id();
        Message domain$stream_chat_android_client_release$default = DomainMapping.toDomain$stream_chat_android_client_release$default(domainMapping, messageDeletedEventDto.getMessage(), channelInfo, 1, channelInfo);
        Boolean hard_delete = messageDeletedEventDto.getHard_delete();
        boolean zBooleanValue = hard_delete != null ? hard_delete.booleanValue() : false;
        Integer channel_message_count = messageDeletedEventDto.getChannel_message_count();
        Boolean deleted_for_me = messageDeletedEventDto.getDeleted_for_me();
        return new MessageDeletedEvent(type, date$stream_chat_android_client_release, rawDate$stream_chat_android_client_release, cid, channel_type, channel_id, domain$stream_chat_android_client_release$default, domain$stream_chat_android_client_release, zBooleanValue, channel_message_count, deleted_for_me != null ? deleted_for_me.booleanValue() : false);
    }

    private final MessageDeliveredEvent toDomain(MessageDeliveredEventDto messageDeliveredEventDto) {
        return new MessageDeliveredEvent(messageDeliveredEventDto.getType(), messageDeliveredEventDto.getCreated_at().getDate$stream_chat_android_client_release(), messageDeliveredEventDto.getCreated_at().getRawDate$stream_chat_android_client_release(), this.domainMapping.toDomain$stream_chat_android_client_release(messageDeliveredEventDto.getUser()), messageDeliveredEventDto.getCid(), messageDeliveredEventDto.getChannel_type(), messageDeliveredEventDto.getChannel_id(), messageDeliveredEventDto.getLast_delivered_at().getDate$stream_chat_android_client_release(), messageDeliveredEventDto.getLast_delivered_message_id());
    }

    private final MessageReadEvent toDomain(MessageReadEventDto messageReadEventDto) {
        DomainMapping domainMapping = this.domainMapping;
        String type = messageReadEventDto.getType();
        Date date$stream_chat_android_client_release = messageReadEventDto.getCreated_at().getDate$stream_chat_android_client_release();
        String rawDate$stream_chat_android_client_release = messageReadEventDto.getCreated_at().getRawDate$stream_chat_android_client_release();
        User domain$stream_chat_android_client_release = domainMapping.toDomain$stream_chat_android_client_release(messageReadEventDto.getUser());
        String cid = messageReadEventDto.getCid();
        String channel_type = messageReadEventDto.getChannel_type();
        String channel_id = messageReadEventDto.getChannel_id();
        DownstreamThreadInfoDto thread = messageReadEventDto.getThread();
        return new MessageReadEvent(type, date$stream_chat_android_client_release, rawDate$stream_chat_android_client_release, domain$stream_chat_android_client_release, cid, channel_type, channel_id, messageReadEventDto.getLast_read_message_id(), thread != null ? domainMapping.toDomain$stream_chat_android_client_release(thread) : null, messageReadEventDto.getTeam());
    }

    private final MessageUpdatedEvent toDomain(MessageUpdatedEventDto messageUpdatedEventDto) {
        DomainMapping domainMapping = this.domainMapping;
        return new MessageUpdatedEvent(messageUpdatedEventDto.getType(), messageUpdatedEventDto.getCreated_at().getDate$stream_chat_android_client_release(), messageUpdatedEventDto.getCreated_at().getRawDate$stream_chat_android_client_release(), domainMapping.toDomain$stream_chat_android_client_release(messageUpdatedEventDto.getUser()), messageUpdatedEventDto.getCid(), messageUpdatedEventDto.getChannel_type(), messageUpdatedEventDto.getChannel_id(), DomainMapping.toDomain$stream_chat_android_client_release$default(domainMapping, messageUpdatedEventDto.getMessage(), (ChannelInfo) null, 1, (Object) null));
    }

    private final NewMessageEvent toDomain(NewMessageEventDto newMessageEventDto) {
        DomainMapping domainMapping = this.domainMapping;
        String cid = newMessageEventDto.getCid();
        String channel_id = newMessageEventDto.getChannel_id();
        String channel_type = newMessageEventDto.getChannel_type();
        Integer channel_member_count = newMessageEventDto.getChannel_member_count();
        int iIntValue = channel_member_count != null ? channel_member_count.intValue() : 0;
        DownstreamChannelCustomDto channel_custom = newMessageEventDto.getChannel_custom();
        String name = channel_custom != null ? channel_custom.getName() : null;
        DownstreamChannelCustomDto channel_custom2 = newMessageEventDto.getChannel_custom();
        return new NewMessageEvent(newMessageEventDto.getType(), newMessageEventDto.getCreated_at().getDate$stream_chat_android_client_release(), newMessageEventDto.getCreated_at().getRawDate$stream_chat_android_client_release(), domainMapping.toDomain$stream_chat_android_client_release(newMessageEventDto.getUser()), newMessageEventDto.getCid(), newMessageEventDto.getChannel_type(), newMessageEventDto.getChannel_id(), domainMapping.toDomain$stream_chat_android_client_release(newMessageEventDto.getMessage(), new ChannelInfo(cid, channel_id, channel_type, iIntValue, name, channel_custom2 != null ? channel_custom2.getImage() : null)), newMessageEventDto.getWatcher_count(), newMessageEventDto.getTotal_unread_count(), newMessageEventDto.getUnread_channels(), newMessageEventDto.getChannel_message_count());
    }

    private final NotificationAddedToChannelEvent toDomain(NotificationAddedToChannelEventDto notificationAddedToChannelEventDto) {
        DomainMapping domainMapping = this.domainMapping;
        return new NotificationAddedToChannelEvent(notificationAddedToChannelEventDto.getType(), notificationAddedToChannelEventDto.getCreated_at().getDate$stream_chat_android_client_release(), notificationAddedToChannelEventDto.getCreated_at().getRawDate$stream_chat_android_client_release(), notificationAddedToChannelEventDto.getCid(), notificationAddedToChannelEventDto.getChannel_type(), notificationAddedToChannelEventDto.getChannel_id(), domainMapping.toDomain$stream_chat_android_client_release(notificationAddedToChannelEventDto.getChannel()), domainMapping.toDomain$stream_chat_android_client_release(notificationAddedToChannelEventDto.getMember()), notificationAddedToChannelEventDto.getTotal_unread_count(), notificationAddedToChannelEventDto.getUnread_channels());
    }

    private final NotificationChannelDeletedEvent toDomain(NotificationChannelDeletedEventDto notificationChannelDeletedEventDto) {
        return new NotificationChannelDeletedEvent(notificationChannelDeletedEventDto.getType(), notificationChannelDeletedEventDto.getCreated_at().getDate$stream_chat_android_client_release(), notificationChannelDeletedEventDto.getCreated_at().getRawDate$stream_chat_android_client_release(), notificationChannelDeletedEventDto.getCid(), notificationChannelDeletedEventDto.getChannel_type(), notificationChannelDeletedEventDto.getChannel_id(), this.domainMapping.toDomain$stream_chat_android_client_release(notificationChannelDeletedEventDto.getChannel()), notificationChannelDeletedEventDto.getTotal_unread_count(), notificationChannelDeletedEventDto.getUnread_channels());
    }

    private final NotificationChannelMutesUpdatedEvent toDomain(NotificationChannelMutesUpdatedEventDto notificationChannelMutesUpdatedEventDto) {
        return new NotificationChannelMutesUpdatedEvent(notificationChannelMutesUpdatedEventDto.getType(), notificationChannelMutesUpdatedEventDto.getCreated_at().getDate$stream_chat_android_client_release(), notificationChannelMutesUpdatedEventDto.getCreated_at().getRawDate$stream_chat_android_client_release(), this.domainMapping.toDomain$stream_chat_android_client_release(notificationChannelMutesUpdatedEventDto.getMe()));
    }

    private final NotificationChannelTruncatedEvent toDomain(NotificationChannelTruncatedEventDto notificationChannelTruncatedEventDto) {
        return new NotificationChannelTruncatedEvent(notificationChannelTruncatedEventDto.getType(), notificationChannelTruncatedEventDto.getCreated_at().getDate$stream_chat_android_client_release(), notificationChannelTruncatedEventDto.getCreated_at().getRawDate$stream_chat_android_client_release(), notificationChannelTruncatedEventDto.getCid(), notificationChannelTruncatedEventDto.getChannel_type(), notificationChannelTruncatedEventDto.getChannel_id(), this.domainMapping.toDomain$stream_chat_android_client_release(notificationChannelTruncatedEventDto.getChannel()), notificationChannelTruncatedEventDto.getTotal_unread_count(), notificationChannelTruncatedEventDto.getUnread_channels());
    }

    private final NotificationInviteAcceptedEvent toDomain(NotificationInviteAcceptedEventDto notificationInviteAcceptedEventDto) {
        DomainMapping domainMapping = this.domainMapping;
        return new NotificationInviteAcceptedEvent(notificationInviteAcceptedEventDto.getType(), notificationInviteAcceptedEventDto.getCreated_at().getDate$stream_chat_android_client_release(), notificationInviteAcceptedEventDto.getCreated_at().getRawDate$stream_chat_android_client_release(), notificationInviteAcceptedEventDto.getCid(), notificationInviteAcceptedEventDto.getChannel_type(), notificationInviteAcceptedEventDto.getChannel_id(), domainMapping.toDomain$stream_chat_android_client_release(notificationInviteAcceptedEventDto.getUser()), domainMapping.toDomain$stream_chat_android_client_release(notificationInviteAcceptedEventDto.getMember()), domainMapping.toDomain$stream_chat_android_client_release(notificationInviteAcceptedEventDto.getChannel()));
    }

    private final NotificationInviteRejectedEvent toDomain(NotificationInviteRejectedEventDto notificationInviteRejectedEventDto) {
        DomainMapping domainMapping = this.domainMapping;
        return new NotificationInviteRejectedEvent(notificationInviteRejectedEventDto.getType(), notificationInviteRejectedEventDto.getCreated_at().getDate$stream_chat_android_client_release(), notificationInviteRejectedEventDto.getCreated_at().getRawDate$stream_chat_android_client_release(), notificationInviteRejectedEventDto.getCid(), notificationInviteRejectedEventDto.getChannel_type(), notificationInviteRejectedEventDto.getChannel_id(), domainMapping.toDomain$stream_chat_android_client_release(notificationInviteRejectedEventDto.getUser()), domainMapping.toDomain$stream_chat_android_client_release(notificationInviteRejectedEventDto.getMember()), domainMapping.toDomain$stream_chat_android_client_release(notificationInviteRejectedEventDto.getChannel()));
    }

    private final NotificationInvitedEvent toDomain(NotificationInvitedEventDto notificationInvitedEventDto) {
        DomainMapping domainMapping = this.domainMapping;
        return new NotificationInvitedEvent(notificationInvitedEventDto.getType(), notificationInvitedEventDto.getCreated_at().getDate$stream_chat_android_client_release(), notificationInvitedEventDto.getCreated_at().getRawDate$stream_chat_android_client_release(), notificationInvitedEventDto.getCid(), notificationInvitedEventDto.getChannel_type(), notificationInvitedEventDto.getChannel_id(), domainMapping.toDomain$stream_chat_android_client_release(notificationInvitedEventDto.getUser()), domainMapping.toDomain$stream_chat_android_client_release(notificationInvitedEventDto.getMember()));
    }

    private final NotificationMarkReadEvent toDomain(NotificationMarkReadEventDto notificationMarkReadEventDto) {
        DomainMapping domainMapping = this.domainMapping;
        String type = notificationMarkReadEventDto.getType();
        Date date$stream_chat_android_client_release = notificationMarkReadEventDto.getCreated_at().getDate$stream_chat_android_client_release();
        String rawDate$stream_chat_android_client_release = notificationMarkReadEventDto.getCreated_at().getRawDate$stream_chat_android_client_release();
        User domain$stream_chat_android_client_release = domainMapping.toDomain$stream_chat_android_client_release(notificationMarkReadEventDto.getUser());
        String cid = notificationMarkReadEventDto.getCid();
        String channel_type = notificationMarkReadEventDto.getChannel_type();
        String channel_id = notificationMarkReadEventDto.getChannel_id();
        int total_unread_count = notificationMarkReadEventDto.getTotal_unread_count();
        int unread_channels = notificationMarkReadEventDto.getUnread_channels();
        String thread_id = notificationMarkReadEventDto.getThread_id();
        DownstreamThreadInfoDto thread = notificationMarkReadEventDto.getThread();
        return new NotificationMarkReadEvent(type, date$stream_chat_android_client_release, rawDate$stream_chat_android_client_release, domain$stream_chat_android_client_release, cid, channel_type, channel_id, total_unread_count, unread_channels, notificationMarkReadEventDto.getLast_read_message_id(), thread_id, thread != null ? domainMapping.toDomain$stream_chat_android_client_release(thread) : null, notificationMarkReadEventDto.getUnread_threads(), notificationMarkReadEventDto.getUnread_thread_messages());
    }

    private final NotificationMarkUnreadEvent toDomain(NotificationMarkUnreadEventDto notificationMarkUnreadEventDto) {
        DomainMapping domainMapping = this.domainMapping;
        String type = notificationMarkUnreadEventDto.getType();
        Date date$stream_chat_android_client_release = notificationMarkUnreadEventDto.getCreated_at().getDate$stream_chat_android_client_release();
        String rawDate$stream_chat_android_client_release = notificationMarkUnreadEventDto.getCreated_at().getRawDate$stream_chat_android_client_release();
        User domain$stream_chat_android_client_release = domainMapping.toDomain$stream_chat_android_client_release(notificationMarkUnreadEventDto.getUser());
        String cid = notificationMarkUnreadEventDto.getCid();
        String channel_type = notificationMarkUnreadEventDto.getChannel_type();
        String channel_id = notificationMarkUnreadEventDto.getChannel_id();
        int total_unread_count = notificationMarkUnreadEventDto.getTotal_unread_count();
        int unread_channels = notificationMarkUnreadEventDto.getUnread_channels();
        String first_unread_message_id = notificationMarkUnreadEventDto.getFirst_unread_message_id();
        String last_read_message_id = notificationMarkUnreadEventDto.getLast_read_message_id();
        return new NotificationMarkUnreadEvent(type, date$stream_chat_android_client_release, rawDate$stream_chat_android_client_release, domain$stream_chat_android_client_release, cid, channel_type, channel_id, total_unread_count, unread_channels, notificationMarkUnreadEventDto.getUnread_messages(), first_unread_message_id, notificationMarkUnreadEventDto.getLast_read_at().getDate$stream_chat_android_client_release(), last_read_message_id, notificationMarkUnreadEventDto.getThread_id(), notificationMarkUnreadEventDto.getUnread_threads(), null, 32768, null);
    }

    private final MarkAllReadEvent toDomain(MarkAllReadEventDto markAllReadEventDto) {
        return new MarkAllReadEvent(markAllReadEventDto.getType(), markAllReadEventDto.getCreated_at().getDate$stream_chat_android_client_release(), markAllReadEventDto.getCreated_at().getRawDate$stream_chat_android_client_release(), this.domainMapping.toDomain$stream_chat_android_client_release(markAllReadEventDto.getUser()), markAllReadEventDto.getTotal_unread_count(), markAllReadEventDto.getUnread_channels());
    }

    private final NotificationMessageNewEvent toDomain(NotificationMessageNewEventDto notificationMessageNewEventDto) {
        DomainMapping domainMapping = this.domainMapping;
        return new NotificationMessageNewEvent(notificationMessageNewEventDto.getType(), notificationMessageNewEventDto.getCreated_at().getDate$stream_chat_android_client_release(), notificationMessageNewEventDto.getCreated_at().getRawDate$stream_chat_android_client_release(), notificationMessageNewEventDto.getCid(), notificationMessageNewEventDto.getChannel_type(), notificationMessageNewEventDto.getChannel_id(), domainMapping.toDomain$stream_chat_android_client_release(notificationMessageNewEventDto.getChannel()), domainMapping.toDomain$stream_chat_android_client_release(notificationMessageNewEventDto.getMessage(), domainMapping.toChannelInfo$stream_chat_android_client_release(notificationMessageNewEventDto.getChannel())), notificationMessageNewEventDto.getTotal_unread_count(), notificationMessageNewEventDto.getUnread_channels());
    }

    private final ThreadUpdatedEvent toDomain(ThreadUpdatedEventDto threadUpdatedEventDto) {
        return new ThreadUpdatedEvent(threadUpdatedEventDto.getType(), threadUpdatedEventDto.getCreated_at().getDate$stream_chat_android_client_release(), threadUpdatedEventDto.getCreated_at().getRawDate$stream_chat_android_client_release(), threadUpdatedEventDto.getCid(), threadUpdatedEventDto.getChannel_type(), threadUpdatedEventDto.getChannel_id(), this.domainMapping.toDomain$stream_chat_android_client_release(threadUpdatedEventDto.getThread()));
    }

    private final NotificationThreadMessageNewEvent toDomain(NotificationThreadMessageNewEventDto notificationThreadMessageNewEventDto) {
        DomainMapping domainMapping = this.domainMapping;
        return new NotificationThreadMessageNewEvent(notificationThreadMessageNewEventDto.getType(), notificationThreadMessageNewEventDto.getCid(), notificationThreadMessageNewEventDto.getChannel_id(), notificationThreadMessageNewEventDto.getChannel_type(), domainMapping.toDomain$stream_chat_android_client_release(notificationThreadMessageNewEventDto.getMessage(), domainMapping.toChannelInfo$stream_chat_android_client_release(notificationThreadMessageNewEventDto.getChannel())), domainMapping.toDomain$stream_chat_android_client_release(notificationThreadMessageNewEventDto.getChannel()), notificationThreadMessageNewEventDto.getCreated_at().getDate$stream_chat_android_client_release(), notificationThreadMessageNewEventDto.getCreated_at().getRawDate$stream_chat_android_client_release(), notificationThreadMessageNewEventDto.getUnread_threads(), notificationThreadMessageNewEventDto.getUnread_thread_messages());
    }

    private final NotificationMutesUpdatedEvent toDomain(NotificationMutesUpdatedEventDto notificationMutesUpdatedEventDto) {
        return new NotificationMutesUpdatedEvent(notificationMutesUpdatedEventDto.getType(), notificationMutesUpdatedEventDto.getCreated_at().getDate$stream_chat_android_client_release(), notificationMutesUpdatedEventDto.getCreated_at().getRawDate$stream_chat_android_client_release(), this.domainMapping.toDomain$stream_chat_android_client_release(notificationMutesUpdatedEventDto.getMe()));
    }

    private final NotificationRemovedFromChannelEvent toDomain(NotificationRemovedFromChannelEventDto notificationRemovedFromChannelEventDto) {
        DomainMapping domainMapping = this.domainMapping;
        String type = notificationRemovedFromChannelEventDto.getType();
        Date date$stream_chat_android_client_release = notificationRemovedFromChannelEventDto.getCreated_at().getDate$stream_chat_android_client_release();
        String rawDate$stream_chat_android_client_release = notificationRemovedFromChannelEventDto.getCreated_at().getRawDate$stream_chat_android_client_release();
        DownstreamUserDto user = notificationRemovedFromChannelEventDto.getUser();
        return new NotificationRemovedFromChannelEvent(type, date$stream_chat_android_client_release, rawDate$stream_chat_android_client_release, notificationRemovedFromChannelEventDto.getCid(), notificationRemovedFromChannelEventDto.getChannel_type(), notificationRemovedFromChannelEventDto.getChannel_id(), domainMapping.toDomain$stream_chat_android_client_release(notificationRemovedFromChannelEventDto.getChannel()), domainMapping.toDomain$stream_chat_android_client_release(notificationRemovedFromChannelEventDto.getMember()), user != null ? domainMapping.toDomain$stream_chat_android_client_release(user) : null);
    }

    private final ReactionDeletedEvent toDomain(ReactionDeletedEventDto reactionDeletedEventDto) {
        DomainMapping domainMapping = this.domainMapping;
        return new ReactionDeletedEvent(reactionDeletedEventDto.getType(), reactionDeletedEventDto.getCreated_at().getDate$stream_chat_android_client_release(), reactionDeletedEventDto.getCreated_at().getRawDate$stream_chat_android_client_release(), domainMapping.toDomain$stream_chat_android_client_release(reactionDeletedEventDto.getUser()), reactionDeletedEventDto.getCid(), reactionDeletedEventDto.getChannel_type(), reactionDeletedEventDto.getChannel_id(), DomainMapping.toDomain$stream_chat_android_client_release$default(domainMapping, reactionDeletedEventDto.getMessage(), (ChannelInfo) null, 1, (Object) null), domainMapping.toDomain$stream_chat_android_client_release(reactionDeletedEventDto.getReaction()));
    }

    private final ReactionNewEvent toDomain(ReactionNewEventDto reactionNewEventDto) {
        DomainMapping domainMapping = this.domainMapping;
        return new ReactionNewEvent(reactionNewEventDto.getType(), reactionNewEventDto.getCreated_at().getDate$stream_chat_android_client_release(), reactionNewEventDto.getCreated_at().getRawDate$stream_chat_android_client_release(), domainMapping.toDomain$stream_chat_android_client_release(reactionNewEventDto.getUser()), reactionNewEventDto.getCid(), reactionNewEventDto.getChannel_type(), reactionNewEventDto.getChannel_id(), DomainMapping.toDomain$stream_chat_android_client_release$default(domainMapping, reactionNewEventDto.getMessage(), (ChannelInfo) null, 1, (Object) null), domainMapping.toDomain$stream_chat_android_client_release(reactionNewEventDto.getReaction()));
    }

    private final ReactionUpdateEvent toDomain(ReactionUpdateEventDto reactionUpdateEventDto) {
        DomainMapping domainMapping = this.domainMapping;
        return new ReactionUpdateEvent(reactionUpdateEventDto.getType(), reactionUpdateEventDto.getCreated_at().getDate$stream_chat_android_client_release(), reactionUpdateEventDto.getCreated_at().getRawDate$stream_chat_android_client_release(), domainMapping.toDomain$stream_chat_android_client_release(reactionUpdateEventDto.getUser()), reactionUpdateEventDto.getCid(), reactionUpdateEventDto.getChannel_type(), reactionUpdateEventDto.getChannel_id(), DomainMapping.toDomain$stream_chat_android_client_release$default(domainMapping, reactionUpdateEventDto.getMessage(), (ChannelInfo) null, 1, (Object) null), domainMapping.toDomain$stream_chat_android_client_release(reactionUpdateEventDto.getReaction()));
    }

    private final TypingStartEvent toDomain(TypingStartEventDto typingStartEventDto) {
        return new TypingStartEvent(typingStartEventDto.getType(), typingStartEventDto.getCreated_at().getDate$stream_chat_android_client_release(), typingStartEventDto.getCreated_at().getRawDate$stream_chat_android_client_release(), this.domainMapping.toDomain$stream_chat_android_client_release(typingStartEventDto.getUser()), typingStartEventDto.getCid(), typingStartEventDto.getChannel_type(), typingStartEventDto.getChannel_id(), typingStartEventDto.getParent_id());
    }

    private final TypingStopEvent toDomain(TypingStopEventDto typingStopEventDto) {
        return new TypingStopEvent(typingStopEventDto.getType(), typingStopEventDto.getCreated_at().getDate$stream_chat_android_client_release(), typingStopEventDto.getCreated_at().getRawDate$stream_chat_android_client_release(), this.domainMapping.toDomain$stream_chat_android_client_release(typingStopEventDto.getUser()), typingStopEventDto.getCid(), typingStopEventDto.getChannel_type(), typingStopEventDto.getChannel_id(), typingStopEventDto.getParent_id());
    }

    private final ChannelUserBannedEvent toDomain(ChannelUserBannedEventDto channelUserBannedEventDto) {
        DomainMapping domainMapping = this.domainMapping;
        String type = channelUserBannedEventDto.getType();
        Date date$stream_chat_android_client_release = channelUserBannedEventDto.getCreated_at().getDate$stream_chat_android_client_release();
        String rawDate$stream_chat_android_client_release = channelUserBannedEventDto.getCreated_at().getRawDate$stream_chat_android_client_release();
        String cid = channelUserBannedEventDto.getCid();
        String channel_type = channelUserBannedEventDto.getChannel_type();
        String channel_id = channelUserBannedEventDto.getChannel_id();
        User domain$stream_chat_android_client_release = domainMapping.toDomain$stream_chat_android_client_release(channelUserBannedEventDto.getUser());
        Date expiration = channelUserBannedEventDto.getExpiration();
        Boolean shadow = channelUserBannedEventDto.getShadow();
        return new ChannelUserBannedEvent(type, date$stream_chat_android_client_release, rawDate$stream_chat_android_client_release, cid, channel_type, channel_id, domain$stream_chat_android_client_release, expiration, shadow != null ? shadow.booleanValue() : false);
    }

    private final GlobalUserBannedEvent toDomain(GlobalUserBannedEventDto globalUserBannedEventDto) {
        return new GlobalUserBannedEvent(globalUserBannedEventDto.getType(), this.domainMapping.toDomain$stream_chat_android_client_release(globalUserBannedEventDto.getUser()), globalUserBannedEventDto.getCreated_at().getDate$stream_chat_android_client_release(), globalUserBannedEventDto.getCreated_at().getRawDate$stream_chat_android_client_release());
    }

    private final UserDeletedEvent toDomain(UserDeletedEventDto userDeletedEventDto) {
        return new UserDeletedEvent(userDeletedEventDto.getType(), userDeletedEventDto.getCreated_at().getDate$stream_chat_android_client_release(), userDeletedEventDto.getCreated_at().getRawDate$stream_chat_android_client_release(), this.domainMapping.toDomain$stream_chat_android_client_release(userDeletedEventDto.getUser()));
    }

    private final UserPresenceChangedEvent toDomain(UserPresenceChangedEventDto userPresenceChangedEventDto) {
        return new UserPresenceChangedEvent(userPresenceChangedEventDto.getType(), userPresenceChangedEventDto.getCreated_at().getDate$stream_chat_android_client_release(), userPresenceChangedEventDto.getCreated_at().getRawDate$stream_chat_android_client_release(), this.domainMapping.toDomain$stream_chat_android_client_release(userPresenceChangedEventDto.getUser()));
    }

    private final UserStartWatchingEvent toDomain(UserStartWatchingEventDto userStartWatchingEventDto) {
        return new UserStartWatchingEvent(userStartWatchingEventDto.getType(), userStartWatchingEventDto.getCreated_at().getDate$stream_chat_android_client_release(), userStartWatchingEventDto.getCreated_at().getRawDate$stream_chat_android_client_release(), userStartWatchingEventDto.getCid(), userStartWatchingEventDto.getWatcher_count(), userStartWatchingEventDto.getChannel_type(), userStartWatchingEventDto.getChannel_id(), this.domainMapping.toDomain$stream_chat_android_client_release(userStartWatchingEventDto.getUser()));
    }

    private final UserStopWatchingEvent toDomain(UserStopWatchingEventDto userStopWatchingEventDto) {
        return new UserStopWatchingEvent(userStopWatchingEventDto.getType(), userStopWatchingEventDto.getCreated_at().getDate$stream_chat_android_client_release(), userStopWatchingEventDto.getCreated_at().getRawDate$stream_chat_android_client_release(), userStopWatchingEventDto.getCid(), userStopWatchingEventDto.getWatcher_count(), userStopWatchingEventDto.getChannel_type(), userStopWatchingEventDto.getChannel_id(), this.domainMapping.toDomain$stream_chat_android_client_release(userStopWatchingEventDto.getUser()));
    }

    private final ChannelUserUnbannedEvent toDomain(ChannelUserUnbannedEventDto channelUserUnbannedEventDto) {
        return new ChannelUserUnbannedEvent(channelUserUnbannedEventDto.getType(), channelUserUnbannedEventDto.getCreated_at().getDate$stream_chat_android_client_release(), channelUserUnbannedEventDto.getCreated_at().getRawDate$stream_chat_android_client_release(), this.domainMapping.toDomain$stream_chat_android_client_release(channelUserUnbannedEventDto.getUser()), channelUserUnbannedEventDto.getCid(), channelUserUnbannedEventDto.getChannel_type(), channelUserUnbannedEventDto.getChannel_id());
    }

    private final GlobalUserUnbannedEvent toDomain(GlobalUserUnbannedEventDto globalUserUnbannedEventDto) {
        return new GlobalUserUnbannedEvent(globalUserUnbannedEventDto.getType(), globalUserUnbannedEventDto.getCreated_at().getDate$stream_chat_android_client_release(), globalUserUnbannedEventDto.getCreated_at().getRawDate$stream_chat_android_client_release(), this.domainMapping.toDomain$stream_chat_android_client_release(globalUserUnbannedEventDto.getUser()));
    }

    private final UserUpdatedEvent toDomain(UserUpdatedEventDto userUpdatedEventDto) {
        return new UserUpdatedEvent(userUpdatedEventDto.getType(), userUpdatedEventDto.getCreated_at().getDate$stream_chat_android_client_release(), userUpdatedEventDto.getCreated_at().getRawDate$stream_chat_android_client_release(), this.domainMapping.toDomain$stream_chat_android_client_release(userUpdatedEventDto.getUser()));
    }

    private final PollClosedEvent toDomain(PollClosedEventDto pollClosedEventDto) {
        Poll domain$stream_chat_android_client_release = this.domainMapping.toDomain$stream_chat_android_client_release(pollClosedEventDto.getPoll());
        C23465k c23465kCidToTypeAndId = StringExtensionsKt.cidToTypeAndId(pollClosedEventDto.getCid());
        return new PollClosedEvent(pollClosedEventDto.getType(), pollClosedEventDto.getCreated_at().getDate$stream_chat_android_client_release(), pollClosedEventDto.getCreated_at().getRawDate$stream_chat_android_client_release(), pollClosedEventDto.getCid(), (String) c23465kCidToTypeAndId.f92937w, (String) c23465kCidToTypeAndId.f92938x, pollClosedEventDto.getMessage_id(), domain$stream_chat_android_client_release);
    }

    private final PollDeletedEvent toDomain(PollDeletedEventDto pollDeletedEventDto) {
        Poll domain$stream_chat_android_client_release = this.domainMapping.toDomain$stream_chat_android_client_release(pollDeletedEventDto.getPoll());
        C23465k c23465kCidToTypeAndId = StringExtensionsKt.cidToTypeAndId(pollDeletedEventDto.getCid());
        return new PollDeletedEvent(pollDeletedEventDto.getType(), pollDeletedEventDto.getCreated_at().getDate$stream_chat_android_client_release(), pollDeletedEventDto.getCreated_at().getRawDate$stream_chat_android_client_release(), pollDeletedEventDto.getCid(), (String) c23465kCidToTypeAndId.f92937w, (String) c23465kCidToTypeAndId.f92938x, pollDeletedEventDto.getMessage_id(), domain$stream_chat_android_client_release);
    }

    private final PollUpdatedEvent toDomain(PollUpdatedEventDto pollUpdatedEventDto) {
        Poll domain$stream_chat_android_client_release = this.domainMapping.toDomain$stream_chat_android_client_release(pollUpdatedEventDto.getPoll());
        C23465k c23465kCidToTypeAndId = StringExtensionsKt.cidToTypeAndId(pollUpdatedEventDto.getCid());
        return new PollUpdatedEvent(pollUpdatedEventDto.getType(), pollUpdatedEventDto.getCreated_at().getDate$stream_chat_android_client_release(), pollUpdatedEventDto.getCreated_at().getRawDate$stream_chat_android_client_release(), pollUpdatedEventDto.getCid(), (String) c23465kCidToTypeAndId.f92937w, (String) c23465kCidToTypeAndId.f92938x, pollUpdatedEventDto.getMessage_id(), domain$stream_chat_android_client_release);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0104  */
    private final VoteCastedEvent toDomain(VoteCastedEventDto voteCastedEventDto) {
        Poll poll;
        DomainMapping domainMapping = this.domainMapping;
        Vote domain$stream_chat_android_client_release = domainMapping.toDomain$stream_chat_android_client_release(voteCastedEventDto.getPoll_vote());
        C23465k c23465kCidToTypeAndId = StringExtensionsKt.cidToTypeAndId(voteCastedEventDto.getCid());
        String str = (String) c23465kCidToTypeAndId.f92937w;
        String str2 = (String) c23465kCidToTypeAndId.f92938x;
        Poll domain$stream_chat_android_client_release2 = domainMapping.toDomain$stream_chat_android_client_release(voteCastedEventDto.getPoll());
        User user = domain$stream_chat_android_client_release.getUser();
        Vote vote = AbstractC22676k.m65745e(user != null ? user.getId() : null, domainMapping.getCurrentUserIdProvider().invoke()) ? domain$stream_chat_android_client_release : null;
        if (vote != null) {
            List<Vote> votes = domain$stream_chat_android_client_release2.getVotes();
            int iM73988W = AbstractC25247g0.m73988W(AbstractC25267u.m74163i0(votes, 10));
            if (iM73988W < 16) {
                iM73988W = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iM73988W);
            for (Object obj : votes) {
                linkedHashMap.put(((Vote) obj).getId(), obj);
            }
            List listM74093D1 = AbstractC25265s.m74093D1(AbstractC25247g0.m73996e0(linkedHashMap, new C23465k(vote.getId(), vote)).values());
            List<Vote> ownVotes = domain$stream_chat_android_client_release2.getOwnVotes();
            int iM73988W2 = AbstractC25247g0.m73988W(AbstractC25267u.m74163i0(ownVotes, 10));
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(iM73988W2 >= 16 ? iM73988W2 : 16);
            for (Object obj2 : ownVotes) {
                linkedHashMap2.put(((Vote) obj2).getId(), obj2);
            }
            Poll pollCopy$default = Poll.copy$default(domain$stream_chat_android_client_release2, null, null, null, null, null, false, null, false, false, 0, null, listM74093D1, AbstractC25265s.m74093D1(AbstractC25247g0.m73996e0(linkedHashMap2, new C23465k(vote.getId(), vote)).values()), null, null, false, 0, null, null, null, 1042431, null);
            if (pollCopy$default != null) {
                poll = pollCopy$default;
            } else {
                poll = domain$stream_chat_android_client_release2;
            }
        } else {
            poll = domain$stream_chat_android_client_release2;
        }
        return new VoteCastedEvent(voteCastedEventDto.getType(), voteCastedEventDto.getCreated_at().getDate$stream_chat_android_client_release(), voteCastedEventDto.getCreated_at().getRawDate$stream_chat_android_client_release(), voteCastedEventDto.getCid(), str, str2, voteCastedEventDto.getMessage_id(), poll, domain$stream_chat_android_client_release);
    }

    private final AnswerCastedEvent toDomain(AnswerCastedEventDto answerCastedEventDto) {
        DomainMapping domainMapping = this.domainMapping;
        Answer answerDomain$stream_chat_android_client_release = domainMapping.toAnswerDomain$stream_chat_android_client_release(answerCastedEventDto.getPoll_vote());
        C23465k c23465kCidToTypeAndId = StringExtensionsKt.cidToTypeAndId(answerCastedEventDto.getCid());
        return new AnswerCastedEvent(answerCastedEventDto.getType(), answerCastedEventDto.getCreated_at().getDate$stream_chat_android_client_release(), answerCastedEventDto.getCreated_at().getRawDate$stream_chat_android_client_release(), answerCastedEventDto.getCid(), (String) c23465kCidToTypeAndId.f92937w, (String) c23465kCidToTypeAndId.f92938x, answerCastedEventDto.getMessage_id(), domainMapping.toDomain$stream_chat_android_client_release(answerCastedEventDto.getPoll()), answerDomain$stream_chat_android_client_release);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0104  */
    private final VoteChangedEvent toDomain(VoteChangedEventDto voteChangedEventDto) {
        Poll poll;
        DomainMapping domainMapping = this.domainMapping;
        Vote domain$stream_chat_android_client_release = domainMapping.toDomain$stream_chat_android_client_release(voteChangedEventDto.getPoll_vote());
        C23465k c23465kCidToTypeAndId = StringExtensionsKt.cidToTypeAndId(voteChangedEventDto.getCid());
        String str = (String) c23465kCidToTypeAndId.f92937w;
        String str2 = (String) c23465kCidToTypeAndId.f92938x;
        Poll domain$stream_chat_android_client_release2 = domainMapping.toDomain$stream_chat_android_client_release(voteChangedEventDto.getPoll());
        User user = domain$stream_chat_android_client_release.getUser();
        Vote vote = AbstractC22676k.m65745e(user != null ? user.getId() : null, domainMapping.getCurrentUserIdProvider().invoke()) ? domain$stream_chat_android_client_release : null;
        if (vote != null) {
            List<Vote> votes = domain$stream_chat_android_client_release2.getVotes();
            int iM73988W = AbstractC25247g0.m73988W(AbstractC25267u.m74163i0(votes, 10));
            if (iM73988W < 16) {
                iM73988W = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iM73988W);
            for (Object obj : votes) {
                linkedHashMap.put(((Vote) obj).getId(), obj);
            }
            List listM74093D1 = AbstractC25265s.m74093D1(AbstractC25247g0.m73996e0(linkedHashMap, new C23465k(vote.getId(), vote)).values());
            List<Vote> ownVotes = domain$stream_chat_android_client_release2.getOwnVotes();
            int iM73988W2 = AbstractC25247g0.m73988W(AbstractC25267u.m74163i0(ownVotes, 10));
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(iM73988W2 >= 16 ? iM73988W2 : 16);
            for (Object obj2 : ownVotes) {
                linkedHashMap2.put(((Vote) obj2).getId(), obj2);
            }
            Poll pollCopy$default = Poll.copy$default(domain$stream_chat_android_client_release2, null, null, null, null, null, false, null, false, false, 0, null, listM74093D1, AbstractC25265s.m74093D1(AbstractC25247g0.m73996e0(linkedHashMap2, new C23465k(vote.getId(), vote)).values()), null, null, false, 0, null, null, null, 1042431, null);
            if (pollCopy$default != null) {
                poll = pollCopy$default;
            } else {
                poll = domain$stream_chat_android_client_release2;
            }
        } else {
            poll = domain$stream_chat_android_client_release2;
        }
        return new VoteChangedEvent(voteChangedEventDto.getType(), voteChangedEventDto.getCreated_at().getDate$stream_chat_android_client_release(), voteChangedEventDto.getCreated_at().getRawDate$stream_chat_android_client_release(), voteChangedEventDto.getCid(), str, str2, voteChangedEventDto.getMessage_id(), poll, domain$stream_chat_android_client_release);
    }

    private final VoteRemovedEvent toDomain(VoteRemovedEventDto voteRemovedEventDto) {
        DomainMapping domainMapping = this.domainMapping;
        Vote domain$stream_chat_android_client_release = domainMapping.toDomain$stream_chat_android_client_release(voteRemovedEventDto.getPoll_vote());
        C23465k c23465kCidToTypeAndId = StringExtensionsKt.cidToTypeAndId(voteRemovedEventDto.getCid());
        return new VoteRemovedEvent(voteRemovedEventDto.getType(), voteRemovedEventDto.getCreated_at().getDate$stream_chat_android_client_release(), voteRemovedEventDto.getCreated_at().getRawDate$stream_chat_android_client_release(), voteRemovedEventDto.getCid(), (String) c23465kCidToTypeAndId.f92937w, (String) c23465kCidToTypeAndId.f92938x, voteRemovedEventDto.getMessage_id(), domainMapping.toDomain$stream_chat_android_client_release(voteRemovedEventDto.getPoll()), domain$stream_chat_android_client_release);
    }

    private final DraftMessageUpdatedEvent toDomain(DraftMessageUpdatedEventDto draftMessageUpdatedEventDto) {
        return new DraftMessageUpdatedEvent(draftMessageUpdatedEventDto.getType(), draftMessageUpdatedEventDto.getCreated_at().getDate$stream_chat_android_client_release(), draftMessageUpdatedEventDto.getCreated_at().getRawDate$stream_chat_android_client_release(), DomainMapping.toDomain$stream_chat_android_client_release$default(this.domainMapping, draftMessageUpdatedEventDto.getDraft(), (ChannelInfo) null, 1, (Object) null));
    }

    private final DraftMessageDeletedEvent toDomain(DraftMessageDeletedEventDto draftMessageDeletedEventDto) {
        return new DraftMessageDeletedEvent(draftMessageDeletedEventDto.getType(), draftMessageDeletedEventDto.getCreated_at().getDate$stream_chat_android_client_release(), draftMessageDeletedEventDto.getCreated_at().getRawDate$stream_chat_android_client_release(), DomainMapping.toDomain$stream_chat_android_client_release$default(this.domainMapping, draftMessageDeletedEventDto.getDraft(), (ChannelInfo) null, 1, (Object) null));
    }

    private final ReminderCreatedEvent toDomain(ReminderCreatedEventDto reminderCreatedEventDto) {
        DomainMapping domainMapping = this.domainMapping;
        C23465k c23465kCidToTypeAndId = StringExtensionsKt.cidToTypeAndId(reminderCreatedEventDto.getCid());
        String str = (String) c23465kCidToTypeAndId.f92937w;
        String str2 = (String) c23465kCidToTypeAndId.f92938x;
        return new ReminderCreatedEvent(reminderCreatedEventDto.getType(), reminderCreatedEventDto.getCreated_at().getDate$stream_chat_android_client_release(), reminderCreatedEventDto.getCreated_at().getRawDate$stream_chat_android_client_release(), reminderCreatedEventDto.getCid(), str, str2, domainMapping.toDomain$stream_chat_android_client_release(reminderCreatedEventDto.getReminder()), reminderCreatedEventDto.getMessage_id(), reminderCreatedEventDto.getUser_id());
    }

    private final ReminderUpdatedEvent toDomain(ReminderUpdatedEventDto reminderUpdatedEventDto) {
        DomainMapping domainMapping = this.domainMapping;
        C23465k c23465kCidToTypeAndId = StringExtensionsKt.cidToTypeAndId(reminderUpdatedEventDto.getCid());
        String str = (String) c23465kCidToTypeAndId.f92937w;
        String str2 = (String) c23465kCidToTypeAndId.f92938x;
        return new ReminderUpdatedEvent(reminderUpdatedEventDto.getType(), reminderUpdatedEventDto.getCreated_at().getDate$stream_chat_android_client_release(), reminderUpdatedEventDto.getCreated_at().getRawDate$stream_chat_android_client_release(), reminderUpdatedEventDto.getCid(), str, str2, domainMapping.toDomain$stream_chat_android_client_release(reminderUpdatedEventDto.getReminder()), reminderUpdatedEventDto.getMessage_id(), reminderUpdatedEventDto.getUser_id());
    }

    private final ReminderDeletedEvent toDomain(ReminderDeletedEventDto reminderDeletedEventDto) {
        DomainMapping domainMapping = this.domainMapping;
        C23465k c23465kCidToTypeAndId = StringExtensionsKt.cidToTypeAndId(reminderDeletedEventDto.getCid());
        String str = (String) c23465kCidToTypeAndId.f92937w;
        String str2 = (String) c23465kCidToTypeAndId.f92938x;
        return new ReminderDeletedEvent(reminderDeletedEventDto.getType(), reminderDeletedEventDto.getCreated_at().getDate$stream_chat_android_client_release(), reminderDeletedEventDto.getCreated_at().getRawDate$stream_chat_android_client_release(), reminderDeletedEventDto.getCid(), str, str2, domainMapping.toDomain$stream_chat_android_client_release(reminderDeletedEventDto.getReminder()), reminderDeletedEventDto.getMessage_id(), reminderDeletedEventDto.getUser_id());
    }

    private final NotificationReminderDueEvent toDomain(NotificationReminderDueEventDto notificationReminderDueEventDto) {
        DomainMapping domainMapping = this.domainMapping;
        C23465k c23465kCidToTypeAndId = StringExtensionsKt.cidToTypeAndId(notificationReminderDueEventDto.getCid());
        String str = (String) c23465kCidToTypeAndId.f92937w;
        String str2 = (String) c23465kCidToTypeAndId.f92938x;
        return new NotificationReminderDueEvent(notificationReminderDueEventDto.getType(), notificationReminderDueEventDto.getCreated_at().getDate$stream_chat_android_client_release(), notificationReminderDueEventDto.getCreated_at().getRawDate$stream_chat_android_client_release(), notificationReminderDueEventDto.getCid(), str, str2, domainMapping.toDomain$stream_chat_android_client_release(notificationReminderDueEventDto.getReminder()), notificationReminderDueEventDto.getMessage_id(), notificationReminderDueEventDto.getUser_id());
    }

    private final UserMessagesDeletedEvent toDomain(UserMessagesDeletedEventDto userMessagesDeletedEventDto) {
        DomainMapping domainMapping = this.domainMapping;
        return new UserMessagesDeletedEvent(userMessagesDeletedEventDto.getType(), userMessagesDeletedEventDto.getCreated_at().getDate$stream_chat_android_client_release(), userMessagesDeletedEventDto.getCreated_at().getRawDate$stream_chat_android_client_release(), domainMapping.toDomain$stream_chat_android_client_release(userMessagesDeletedEventDto.getUser()), userMessagesDeletedEventDto.getCid(), userMessagesDeletedEventDto.getChannel_type(), userMessagesDeletedEventDto.getChannel_id(), AbstractC22676k.m65745e(userMessagesDeletedEventDto.getHard_delete(), Boolean.TRUE));
    }

    private final AIIndicatorUpdatedEvent toDomain(AIIndicatorUpdatedEventDto aIIndicatorUpdatedEventDto) {
        DomainMapping domainMapping = this.domainMapping;
        C23465k c23465kCidToTypeAndId = StringExtensionsKt.cidToTypeAndId(aIIndicatorUpdatedEventDto.getCid());
        String str = (String) c23465kCidToTypeAndId.f92937w;
        String str2 = (String) c23465kCidToTypeAndId.f92938x;
        return new AIIndicatorUpdatedEvent(aIIndicatorUpdatedEventDto.getType(), aIIndicatorUpdatedEventDto.getCreated_at().getDate$stream_chat_android_client_release(), aIIndicatorUpdatedEventDto.getCreated_at().getRawDate$stream_chat_android_client_release(), domainMapping.toDomain$stream_chat_android_client_release(aIIndicatorUpdatedEventDto.getUser()), aIIndicatorUpdatedEventDto.getCid(), str, str2, aIIndicatorUpdatedEventDto.getAi_state(), aIIndicatorUpdatedEventDto.getMessage_id());
    }

    private final AIIndicatorClearEvent toDomain(AIIndicatorClearEventDto aIIndicatorClearEventDto) {
        DomainMapping domainMapping = this.domainMapping;
        C23465k c23465kCidToTypeAndId = StringExtensionsKt.cidToTypeAndId(aIIndicatorClearEventDto.getCid());
        return new AIIndicatorClearEvent(aIIndicatorClearEventDto.getType(), aIIndicatorClearEventDto.getCreated_at().getDate$stream_chat_android_client_release(), aIIndicatorClearEventDto.getCreated_at().getRawDate$stream_chat_android_client_release(), domainMapping.toDomain$stream_chat_android_client_release(aIIndicatorClearEventDto.getUser()), aIIndicatorClearEventDto.getCid(), (String) c23465kCidToTypeAndId.f92937w, (String) c23465kCidToTypeAndId.f92938x);
    }

    private final AIIndicatorStopEvent toDomain(AIIndicatorStopEventDto aIIndicatorStopEventDto) {
        DomainMapping domainMapping = this.domainMapping;
        C23465k c23465kCidToTypeAndId = StringExtensionsKt.cidToTypeAndId(aIIndicatorStopEventDto.getCid());
        String str = (String) c23465kCidToTypeAndId.f92937w;
        String str2 = (String) c23465kCidToTypeAndId.f92938x;
        return new AIIndicatorStopEvent(aIIndicatorStopEventDto.getType(), aIIndicatorStopEventDto.getCreated_at().getDate$stream_chat_android_client_release(), aIIndicatorStopEventDto.getCreated_at().getRawDate$stream_chat_android_client_release(), domainMapping.toDomain$stream_chat_android_client_release(aIIndicatorStopEventDto.getUser()), aIIndicatorStopEventDto.getCid(), str, str2);
    }

    private final ConnectedEvent toDomain(ConnectedEventDto connectedEventDto) {
        return new ConnectedEvent(connectedEventDto.getType(), connectedEventDto.getCreated_at().getDate$stream_chat_android_client_release(), connectedEventDto.getCreated_at().getRawDate$stream_chat_android_client_release(), this.domainMapping.toDomain$stream_chat_android_client_release(connectedEventDto.getMe()), connectedEventDto.getConnection_id());
    }

    private final ConnectionErrorEvent toDomain(ConnectionErrorEventDto connectionErrorEventDto) {
        return new ConnectionErrorEvent(connectionErrorEventDto.getType(), connectionErrorEventDto.getCreated_at().getDate$stream_chat_android_client_release(), connectionErrorEventDto.getCreated_at().getRawDate$stream_chat_android_client_release(), connectionErrorEventDto.getConnection_id(), ErrorMappingKt.toDomain(connectionErrorEventDto.getError()));
    }

    private final ConnectingEvent toDomain(ConnectingEventDto connectingEventDto) {
        return new ConnectingEvent(connectingEventDto.getType(), connectingEventDto.getCreated_at().getDate$stream_chat_android_client_release(), connectingEventDto.getCreated_at().getRawDate$stream_chat_android_client_release());
    }

    private final DisconnectedEvent toDomain(DisconnectedEventDto disconnectedEventDto) {
        return new DisconnectedEvent(disconnectedEventDto.getType(), disconnectedEventDto.getCreated_at().getDate$stream_chat_android_client_release(), disconnectedEventDto.getCreated_at().getRawDate$stream_chat_android_client_release(), null, 8, null);
    }

    private final ErrorEvent toDomain(ErrorEventDto errorEventDto) {
        return new ErrorEvent(errorEventDto.getType(), errorEventDto.getCreated_at().getDate$stream_chat_android_client_release(), errorEventDto.getCreated_at().getRawDate$stream_chat_android_client_release(), errorEventDto.getError());
    }

    private final UnknownEvent toDomain(UnknownEventDto unknownEventDto) {
        DomainMapping domainMapping = this.domainMapping;
        String type = unknownEventDto.getType();
        Date date$stream_chat_android_client_release = unknownEventDto.getCreated_at().getDate$stream_chat_android_client_release();
        String rawDate$stream_chat_android_client_release = unknownEventDto.getCreated_at().getRawDate$stream_chat_android_client_release();
        DownstreamUserDto user = unknownEventDto.getUser();
        return new UnknownEvent(type, date$stream_chat_android_client_release, rawDate$stream_chat_android_client_release, user != null ? domainMapping.toDomain$stream_chat_android_client_release(user) : null, unknownEventDto.getRawData());
    }
}
