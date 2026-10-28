package io.getstream.chat.android.client.api2.mapping;

import c93.InterfaceC4339a;
import io.getstream.chat.android.DeliveryReceipts;
import io.getstream.chat.android.PrivacySettings;
import io.getstream.chat.android.ReadReceipts;
import io.getstream.chat.android.TypingIndicators;
import io.getstream.chat.android.client.api2.model.dto.AttachmentDto;
import io.getstream.chat.android.client.api2.model.dto.ChannelInfoDto;
import io.getstream.chat.android.client.api2.model.dto.CommandDto;
import io.getstream.chat.android.client.api2.model.dto.ConfigDto;
import io.getstream.chat.android.client.api2.model.dto.DeliveryReceiptsDto;
import io.getstream.chat.android.client.api2.model.dto.DeviceDto;
import io.getstream.chat.android.client.api2.model.dto.DownstreamChannelDto;
import io.getstream.chat.android.client.api2.model.dto.DownstreamChannelMuteDto;
import io.getstream.chat.android.client.api2.model.dto.DownstreamChannelUserRead;
import io.getstream.chat.android.client.api2.model.dto.DownstreamDraftDto;
import io.getstream.chat.android.client.api2.model.dto.DownstreamFlagDto;
import io.getstream.chat.android.client.api2.model.dto.DownstreamLocationDto;
import io.getstream.chat.android.client.api2.model.dto.DownstreamMemberDto;
import io.getstream.chat.android.client.api2.model.dto.DownstreamMemberInfoDto;
import io.getstream.chat.android.client.api2.model.dto.DownstreamMessageDto;
import io.getstream.chat.android.client.api2.model.dto.DownstreamModerationDetailsDto;
import io.getstream.chat.android.client.api2.model.dto.DownstreamModerationDto;
import io.getstream.chat.android.client.api2.model.dto.DownstreamMuteDto;
import io.getstream.chat.android.client.api2.model.dto.DownstreamPendingMessageDto;
import io.getstream.chat.android.client.api2.model.dto.DownstreamPollDto;
import io.getstream.chat.android.client.api2.model.dto.DownstreamPollOptionDto;
import io.getstream.chat.android.client.api2.model.dto.DownstreamPushPreferenceDto;
import io.getstream.chat.android.client.api2.model.dto.DownstreamReactionDto;
import io.getstream.chat.android.client.api2.model.dto.DownstreamReactionGroupDto;
import io.getstream.chat.android.client.api2.model.dto.DownstreamReminderDto;
import io.getstream.chat.android.client.api2.model.dto.DownstreamReminderInfoDto;
import io.getstream.chat.android.client.api2.model.dto.DownstreamThreadDto;
import io.getstream.chat.android.client.api2.model.dto.DownstreamThreadInfoDto;
import io.getstream.chat.android.client.api2.model.dto.DownstreamThreadParticipantDto;
import io.getstream.chat.android.client.api2.model.dto.DownstreamUserBlockDto;
import io.getstream.chat.android.client.api2.model.dto.DownstreamUserDto;
import io.getstream.chat.android.client.api2.model.dto.DownstreamVoteDto;
import io.getstream.chat.android.client.api2.model.dto.PrivacySettingsDto;
import io.getstream.chat.android.client.api2.model.dto.ReadReceiptsDto;
import io.getstream.chat.android.client.api2.model.dto.SearchWarningDto;
import io.getstream.chat.android.client.api2.model.dto.TypingIndicatorsDto;
import io.getstream.chat.android.client.api2.model.dto.UnreadChannelByTypeDto;
import io.getstream.chat.android.client.api2.model.dto.UnreadChannelDto;
import io.getstream.chat.android.client.api2.model.dto.UnreadDto;
import io.getstream.chat.android.client.api2.model.dto.UnreadThreadDto;
import io.getstream.chat.android.client.api2.model.requests.CreatePollRequest;
import io.getstream.chat.android.client.api2.model.response.AppDto;
import io.getstream.chat.android.client.api2.model.response.AppSettingsResponse;
import io.getstream.chat.android.client.api2.model.response.BannedUserResponse;
import io.getstream.chat.android.client.api2.model.response.BlockUserResponse;
import io.getstream.chat.android.client.api2.model.response.FileUploadConfigDto;
import io.getstream.chat.android.client.api2.model.response.MessageResponse;
import io.getstream.chat.android.client.api2.model.response.QueryPollVotesResponse;
import io.getstream.chat.android.client.api2.model.response.QueryPollsResponse;
import io.getstream.chat.android.client.api2.model.response.QueryRemindersResponse;
import io.getstream.chat.android.client.extensions.ChannelExtensionKt;
import io.getstream.chat.android.client.extensions.MessageExtensionsKt;
import io.getstream.chat.android.client.extensions.internal.ThreadKt;
import io.getstream.chat.android.core.internal.StreamHandsOff;
import io.getstream.chat.android.models.Answer;
import io.getstream.chat.android.models.App;
import io.getstream.chat.android.models.AppSettings;
import io.getstream.chat.android.models.Attachment;
import io.getstream.chat.android.models.BannedUser;
import io.getstream.chat.android.models.Channel;
import io.getstream.chat.android.models.ChannelInfo;
import io.getstream.chat.android.models.ChannelMute;
import io.getstream.chat.android.models.ChannelTransformer;
import io.getstream.chat.android.models.ChannelUserRead;
import io.getstream.chat.android.models.Command;
import io.getstream.chat.android.models.Config;
import io.getstream.chat.android.models.Device;
import io.getstream.chat.android.models.DraftMessage;
import io.getstream.chat.android.models.FileUploadConfig;
import io.getstream.chat.android.models.Flag;
import io.getstream.chat.android.models.Location;
import io.getstream.chat.android.models.Member;
import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.models.MessageModerationAction;
import io.getstream.chat.android.models.MessageModerationDetails;
import io.getstream.chat.android.models.MessageReminder;
import io.getstream.chat.android.models.MessageReminderInfo;
import io.getstream.chat.android.models.MessageTransformer;
import io.getstream.chat.android.models.Moderation;
import io.getstream.chat.android.models.ModerationAction;
import io.getstream.chat.android.models.Mute;
import io.getstream.chat.android.models.Option;
import io.getstream.chat.android.models.PendingMessage;
import io.getstream.chat.android.models.Poll;
import io.getstream.chat.android.models.PollOption;
import io.getstream.chat.android.models.PushPreference;
import io.getstream.chat.android.models.PushPreferenceLevel;
import io.getstream.chat.android.models.PushProvider;
import io.getstream.chat.android.models.QueryPollVotesResult;
import io.getstream.chat.android.models.QueryPollsResult;
import io.getstream.chat.android.models.QueryRemindersResult;
import io.getstream.chat.android.models.Reaction;
import io.getstream.chat.android.models.ReactionGroup;
import io.getstream.chat.android.models.SearchWarning;
import io.getstream.chat.android.models.Thread;
import io.getstream.chat.android.models.ThreadInfo;
import io.getstream.chat.android.models.ThreadParticipant;
import io.getstream.chat.android.models.UnreadChannel;
import io.getstream.chat.android.models.UnreadChannelByType;
import io.getstream.chat.android.models.UnreadCounts;
import io.getstream.chat.android.models.UnreadThread;
import io.getstream.chat.android.models.User;
import io.getstream.chat.android.models.UserBlock;
import io.getstream.chat.android.models.UserTransformer;
import io.getstream.chat.android.models.Vote;
import io.getstream.chat.android.models.VotingVisibility;
import io.getstream.chat.android.models.querysort.QuerySortByField;
import io.getstream.chat.android.models.querysort.QuerySorter;
import io.getstream.chat.android.models.querysort.SortDirection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import m83.AbstractC25247g0;
import m83.AbstractC25260n;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25271y;
import m83.C25272z;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000È\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u0000 È\u00012\u00020\u0001:\u0002È\u0001B5\u0012\u0014\u0010\u0005\u001a\u0010\u0012\f\u0012\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00040\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u0012\u001a\u00020\u000f*\u00020\u000eH\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u0014*\u00020\u0013H\u0000¢\u0006\u0004\b\u0010\u0010\u0015J\u0013\u0010\u0019\u001a\u00020\u0016*\u00020\u0013H\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u0012\u001a\u00020\u001c*\u00020\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0016H\u0000¢\u0006\u0004\b\u0010\u0010\u001dJ\u001f\u0010\u0012\u001a\u00020\u001f*\u00020\u001e2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0016H\u0000¢\u0006\u0004\b\u0010\u0010 J'\u0010\u0012\u001a\u00020#*\u00020!2\u0006\u0010\"\u001a\u00020\u00032\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0016H\u0000¢\u0006\u0004\b\u0010\u0010$J\u0013\u0010\u0012\u001a\u00020#*\u00020%H\u0000¢\u0006\u0004\b\u0010\u0010&J\u0013\u0010\u0012\u001a\u00020(*\u00020'H\u0000¢\u0006\u0004\b\u0010\u0010)J\u0013\u0010\u0012\u001a\u00020+*\u00020*H\u0000¢\u0006\u0004\b\u0010\u0010,J\u001b\u0010\u0012\u001a\u00020/*\u00020-2\u0006\u0010.\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0010\u00100J\u0013\u0010\u0012\u001a\u000202*\u000201H\u0000¢\u0006\u0004\b\u0010\u00103J\u0013\u0010\u0012\u001a\u000205*\u000204H\u0000¢\u0006\u0004\b\u0010\u00106J\u0013\u0010\u0012\u001a\u000208*\u000207H\u0000¢\u0006\u0004\b\u0010\u00109J\u0013\u0010\u0012\u001a\u00020;*\u00020:H\u0000¢\u0006\u0004\b\u0010\u0010<J\u0013\u0010\u0012\u001a\u00020>*\u00020=H\u0000¢\u0006\u0004\b\u0010\u0010?J\u0013\u0010\u0012\u001a\u00020A*\u00020@H\u0000¢\u0006\u0004\b\u0010\u0010BJ\u0013\u0010F\u001a\u00020C*\u00020@H\u0000¢\u0006\u0004\bD\u0010EJ\u0013\u0010\u0012\u001a\u00020H*\u00020GH\u0000¢\u0006\u0004\b\u0010\u0010IJ\u0013\u0010M\u001a\u00020J*\u00020GH\u0000¢\u0006\u0004\bK\u0010LJ\u0015\u0010Q\u001a\u00020N*\u0004\u0018\u00010\u0003H\u0000¢\u0006\u0004\bO\u0010PJ\u0013\u0010\u0012\u001a\u00020S*\u00020RH\u0000¢\u0006\u0004\b\u0010\u0010TJ\u0013\u0010\u0012\u001a\u00020V*\u00020UH\u0000¢\u0006\u0004\b\u0010\u0010WJ\u001b\u0010\u0012\u001a\u00020[*\u00020X2\u0006\u0010Z\u001a\u00020YH\u0000¢\u0006\u0004\b\u0010\u0010\\J\u0013\u0010\u0012\u001a\u00020^*\u00020]H\u0000¢\u0006\u0004\b\u0010\u0010_J\u0013\u0010\u0012\u001a\u00020a*\u00020`H\u0000¢\u0006\u0004\b\u0010\u0010bJ\u0013\u0010\u0012\u001a\u00020\u0016*\u00020cH\u0000¢\u0006\u0004\b\u0010\u0010dJ\u0013\u0010\u0012\u001a\u00020f*\u00020eH\u0000¢\u0006\u0004\b\u0010\u0010gJ\u0013\u0010\u0012\u001a\u00020i*\u00020hH\u0000¢\u0006\u0004\b\u0010\u0010jJ\u0013\u0010\u0012\u001a\u00020l*\u00020kH\u0000¢\u0006\u0004\b\u0010\u0010mJ\u0013\u0010\u0012\u001a\u00020o*\u00020nH\u0000¢\u0006\u0004\b\u0010\u0010pJ\u0013\u0010\u0012\u001a\u00020r*\u00020qH\u0000¢\u0006\u0004\b\u0010\u0010sJ\u0013\u0010\u0012\u001a\u00020u*\u00020tH\u0000¢\u0006\u0004\b\u0010\u0010vJ\u0013\u0010\u0012\u001a\u00020x*\u00020wH\u0000¢\u0006\u0004\b\u0010\u0010yJ\u0013\u0010\u0012\u001a\u00020{*\u00020zH\u0000¢\u0006\u0004\b\u0010\u0010|J\u0013\u0010\u0012\u001a\u00020~*\u00020}H\u0000¢\u0006\u0004\b\u0010\u0010\u007fJ\u0016\u0010\u0012\u001a\u00030\u0081\u0001*\u00030\u0080\u0001H\u0000¢\u0006\u0005\b\u0010\u0010\u0082\u0001J\u0016\u0010\u0012\u001a\u00030\u0084\u0001*\u00030\u0083\u0001H\u0000¢\u0006\u0005\b\u0010\u0010\u0085\u0001J\u0016\u0010\u0012\u001a\u00030\u0087\u0001*\u00030\u0086\u0001H\u0000¢\u0006\u0005\b\u0010\u0010\u0088\u0001J\u0016\u0010\u0012\u001a\u00030\u008a\u0001*\u00030\u0089\u0001H\u0000¢\u0006\u0005\b\u0010\u0010\u008b\u0001J\u0016\u0010\u0012\u001a\u00030\u008d\u0001*\u00030\u008c\u0001H\u0000¢\u0006\u0005\b\u0010\u0010\u008e\u0001J\u0016\u0010\u0012\u001a\u00030\u0090\u0001*\u00030\u008f\u0001H\u0000¢\u0006\u0005\b\u0010\u0010\u0091\u0001J$\u0010\u0012\u001a\n\u0012\u0005\u0012\u00030\u0090\u00010\u0092\u0001*\n\u0012\u0005\u0012\u00030\u008f\u00010\u0092\u0001H\u0000¢\u0006\u0005\b\u0010\u0010\u0093\u0001J\u0016\u0010\u0012\u001a\u00030\u0090\u0001*\u00030\u0094\u0001H\u0000¢\u0006\u0005\b\u0010\u0010\u0095\u0001J\u0016\u0010\u0012\u001a\u00030\u0097\u0001*\u00030\u0096\u0001H\u0000¢\u0006\u0005\b\u0010\u0010\u0098\u0001J\u0016\u0010\u0012\u001a\u00030\u009a\u0001*\u00030\u0099\u0001H\u0000¢\u0006\u0005\b\u0010\u0010\u009b\u0001J\u0016\u0010\u0012\u001a\u00030\u009d\u0001*\u00030\u009c\u0001H\u0000¢\u0006\u0005\b\u0010\u0010\u009e\u0001J\u0016\u0010\u0012\u001a\u00030 \u0001*\u00030\u009f\u0001H\u0000¢\u0006\u0005\b\u0010\u0010¡\u0001J\u0016\u0010\u0012\u001a\u00030£\u0001*\u00030¢\u0001H\u0000¢\u0006\u0005\b\u0010\u0010¤\u0001J\u0016\u0010\u0012\u001a\u00030¦\u0001*\u00030¥\u0001H\u0000¢\u0006\u0005\b\u0010\u0010§\u0001J\u0016\u0010\u0012\u001a\u00030©\u0001*\u00030¨\u0001H\u0000¢\u0006\u0005\b\u0010\u0010ª\u0001J\u0016\u0010\u0012\u001a\u00030¬\u0001*\u00030«\u0001H\u0000¢\u0006\u0005\b\u0010\u0010\u00ad\u0001J5\u0010²\u0001\u001a\u000b\u0012\u0004\u0012\u00020\u0014\u0018\u00010¯\u0001*\u0018\u0012\u0011\u0012\u000f\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010®\u0001\u0018\u00010\u0092\u0001H\u0000¢\u0006\u0006\b°\u0001\u0010±\u0001J)\u0010·\u0001\u001a\t\u0012\u0004\u0012\u00020\u00140¯\u00012\u000e\u0010´\u0001\u001a\t\u0012\u0004\u0012\u00020\u00030³\u0001H\u0000¢\u0006\u0006\bµ\u0001\u0010¶\u0001J\u0016\u0010\u0012\u001a\u00030¹\u0001*\u00030¸\u0001H\u0002¢\u0006\u0005\b\u0012\u0010º\u0001J\u0016\u0010\u0012\u001a\u00030¼\u0001*\u00030»\u0001H\u0002¢\u0006\u0005\b\u0012\u0010½\u0001J+\u0010\u0012\u001a\t\u0012\u0004\u0012\u00020+0\u0092\u0001*\t\u0012\u0004\u0012\u00020*0\u0092\u00012\u0007\u0010¾\u0001\u001a\u00020\u0003H\u0003¢\u0006\u0005\b\u0012\u0010¿\u0001J\u0016\u0010À\u0001\u001a\u00020Y*\u00020\u001aH\u0002¢\u0006\u0006\bÀ\u0001\u0010Á\u0001R(\u0010\u0005\u001a\u0010\u0012\f\u0012\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00040\u00028\u0006¢\u0006\u000f\n\u0005\b\u0005\u0010Â\u0001\u001a\u0006\bÃ\u0001\u0010Ä\u0001R\u0015\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0007\u0010Å\u0001R\u0015\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\t\u0010Æ\u0001R\u0015\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u000b\u0010Ç\u0001¨\u0006É\u0001"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/mapping/DomainMapping;", "", "Lkotlin/Function0;", "", "Lio/getstream/chat/android/models/UserId;", "currentUserIdProvider", "Lio/getstream/chat/android/models/ChannelTransformer;", "channelTransformer", "Lio/getstream/chat/android/models/MessageTransformer;", "messageTransformer", "Lio/getstream/chat/android/models/UserTransformer;", "userTransformer", "<init>", "(Lc93/a;Lio/getstream/chat/android/models/ChannelTransformer;Lio/getstream/chat/android/models/MessageTransformer;Lio/getstream/chat/android/models/UserTransformer;)V", "Lio/getstream/chat/android/client/api2/model/response/AppSettingsResponse;", "Lio/getstream/chat/android/models/AppSettings;", "toDomain$stream_chat_android_client_release", "(Lio/getstream/chat/android/client/api2/model/response/AppSettingsResponse;)Lio/getstream/chat/android/models/AppSettings;", "toDomain", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;", "Lio/getstream/chat/android/models/Channel;", "(Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;)Lio/getstream/chat/android/models/Channel;", "Lio/getstream/chat/android/models/ChannelInfo;", "toChannelInfo$stream_chat_android_client_release", "(Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;)Lio/getstream/chat/android/models/ChannelInfo;", "toChannelInfo", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;", "fallbackChannelInfo", "Lio/getstream/chat/android/models/Message;", "(Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;Lio/getstream/chat/android/models/ChannelInfo;)Lio/getstream/chat/android/models/Message;", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftDto;", "Lio/getstream/chat/android/models/DraftMessage;", "(Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftDto;Lio/getstream/chat/android/models/ChannelInfo;)Lio/getstream/chat/android/models/DraftMessage;", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamPendingMessageDto;", "cid", "Lio/getstream/chat/android/models/PendingMessage;", "(Lio/getstream/chat/android/client/api2/model/dto/DownstreamPendingMessageDto;Ljava/lang/String;Lio/getstream/chat/android/models/ChannelInfo;)Lio/getstream/chat/android/models/PendingMessage;", "Lio/getstream/chat/android/client/api2/model/response/MessageResponse;", "(Lio/getstream/chat/android/client/api2/model/response/MessageResponse;)Lio/getstream/chat/android/models/PendingMessage;", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;", "Lio/getstream/chat/android/models/User;", "(Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;)Lio/getstream/chat/android/models/User;", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamReactionDto;", "Lio/getstream/chat/android/models/Reaction;", "(Lio/getstream/chat/android/client/api2/model/dto/DownstreamReactionDto;)Lio/getstream/chat/android/models/Reaction;", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamReactionGroupDto;", "type", "Lio/getstream/chat/android/models/ReactionGroup;", "(Lio/getstream/chat/android/client/api2/model/dto/DownstreamReactionGroupDto;Ljava/lang/String;)Lio/getstream/chat/android/models/ReactionGroup;", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamMuteDto;", "Lio/getstream/chat/android/models/Mute;", "(Lio/getstream/chat/android/client/api2/model/dto/DownstreamMuteDto;)Lio/getstream/chat/android/models/Mute;", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelMuteDto;", "Lio/getstream/chat/android/models/ChannelMute;", "(Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelMuteDto;)Lio/getstream/chat/android/models/ChannelMute;", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamMemberDto;", "Lio/getstream/chat/android/models/Member;", "(Lio/getstream/chat/android/client/api2/model/dto/DownstreamMemberDto;)Lio/getstream/chat/android/models/Member;", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamLocationDto;", "Lio/getstream/chat/android/models/Location;", "(Lio/getstream/chat/android/client/api2/model/dto/DownstreamLocationDto;)Lio/getstream/chat/android/models/Location;", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;", "Lio/getstream/chat/android/models/Poll;", "(Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;)Lio/getstream/chat/android/models/Poll;", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollOptionDto;", "Lio/getstream/chat/android/models/Option;", "(Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollOptionDto;)Lio/getstream/chat/android/models/Option;", "Lio/getstream/chat/android/models/PollOption;", "toPollOption$stream_chat_android_client_release", "(Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollOptionDto;)Lio/getstream/chat/android/models/PollOption;", "toPollOption", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamVoteDto;", "Lio/getstream/chat/android/models/Vote;", "(Lio/getstream/chat/android/client/api2/model/dto/DownstreamVoteDto;)Lio/getstream/chat/android/models/Vote;", "Lio/getstream/chat/android/models/Answer;", "toAnswerDomain$stream_chat_android_client_release", "(Lio/getstream/chat/android/client/api2/model/dto/DownstreamVoteDto;)Lio/getstream/chat/android/models/Answer;", "toAnswerDomain", "Lio/getstream/chat/android/models/VotingVisibility;", "toVotingVisibility$stream_chat_android_client_release", "(Ljava/lang/String;)Lio/getstream/chat/android/models/VotingVisibility;", "toVotingVisibility", "Lio/getstream/chat/android/client/api2/model/response/QueryPollVotesResponse;", "Lio/getstream/chat/android/models/QueryPollVotesResult;", "(Lio/getstream/chat/android/client/api2/model/response/QueryPollVotesResponse;)Lio/getstream/chat/android/models/QueryPollVotesResult;", "Lio/getstream/chat/android/client/api2/model/response/QueryPollsResponse;", "Lio/getstream/chat/android/models/QueryPollsResult;", "(Lio/getstream/chat/android/client/api2/model/response/QueryPollsResponse;)Lio/getstream/chat/android/models/QueryPollsResult;", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelUserRead;", "Ljava/util/Date;", "lastReceivedEventDate", "Lio/getstream/chat/android/models/ChannelUserRead;", "(Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelUserRead;Ljava/util/Date;)Lio/getstream/chat/android/models/ChannelUserRead;", "Lio/getstream/chat/android/client/api2/model/dto/AttachmentDto;", "Lio/getstream/chat/android/models/Attachment;", "(Lio/getstream/chat/android/client/api2/model/dto/AttachmentDto;)Lio/getstream/chat/android/models/Attachment;", "Lio/getstream/chat/android/client/api2/model/response/BannedUserResponse;", "Lio/getstream/chat/android/models/BannedUser;", "(Lio/getstream/chat/android/client/api2/model/response/BannedUserResponse;)Lio/getstream/chat/android/models/BannedUser;", "Lio/getstream/chat/android/client/api2/model/dto/ChannelInfoDto;", "(Lio/getstream/chat/android/client/api2/model/dto/ChannelInfoDto;)Lio/getstream/chat/android/models/ChannelInfo;", "Lio/getstream/chat/android/client/api2/model/dto/CommandDto;", "Lio/getstream/chat/android/models/Command;", "(Lio/getstream/chat/android/client/api2/model/dto/CommandDto;)Lio/getstream/chat/android/models/Command;", "Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;", "Lio/getstream/chat/android/models/Config;", "(Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;)Lio/getstream/chat/android/models/Config;", "Lio/getstream/chat/android/client/api2/model/dto/DeviceDto;", "Lio/getstream/chat/android/models/Device;", "(Lio/getstream/chat/android/client/api2/model/dto/DeviceDto;)Lio/getstream/chat/android/models/Device;", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamFlagDto;", "Lio/getstream/chat/android/models/Flag;", "(Lio/getstream/chat/android/client/api2/model/dto/DownstreamFlagDto;)Lio/getstream/chat/android/models/Flag;", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamModerationDetailsDto;", "Lio/getstream/chat/android/models/MessageModerationDetails;", "(Lio/getstream/chat/android/client/api2/model/dto/DownstreamModerationDetailsDto;)Lio/getstream/chat/android/models/MessageModerationDetails;", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamModerationDto;", "Lio/getstream/chat/android/models/Moderation;", "(Lio/getstream/chat/android/client/api2/model/dto/DownstreamModerationDto;)Lio/getstream/chat/android/models/Moderation;", "Lio/getstream/chat/android/client/api2/model/dto/PrivacySettingsDto;", "Lio/getstream/chat/android/PrivacySettings;", "(Lio/getstream/chat/android/client/api2/model/dto/PrivacySettingsDto;)Lio/getstream/chat/android/PrivacySettings;", "Lio/getstream/chat/android/client/api2/model/dto/TypingIndicatorsDto;", "Lio/getstream/chat/android/TypingIndicators;", "(Lio/getstream/chat/android/client/api2/model/dto/TypingIndicatorsDto;)Lio/getstream/chat/android/TypingIndicators;", "Lio/getstream/chat/android/client/api2/model/dto/DeliveryReceiptsDto;", "Lio/getstream/chat/android/DeliveryReceipts;", "(Lio/getstream/chat/android/client/api2/model/dto/DeliveryReceiptsDto;)Lio/getstream/chat/android/DeliveryReceipts;", "Lio/getstream/chat/android/client/api2/model/dto/ReadReceiptsDto;", "Lio/getstream/chat/android/ReadReceipts;", "(Lio/getstream/chat/android/client/api2/model/dto/ReadReceiptsDto;)Lio/getstream/chat/android/ReadReceipts;", "Lio/getstream/chat/android/client/api2/model/dto/SearchWarningDto;", "Lio/getstream/chat/android/models/SearchWarning;", "(Lio/getstream/chat/android/client/api2/model/dto/SearchWarningDto;)Lio/getstream/chat/android/models/SearchWarning;", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;", "Lio/getstream/chat/android/models/Thread;", "(Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;)Lio/getstream/chat/android/models/Thread;", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadInfoDto;", "Lio/getstream/chat/android/models/ThreadInfo;", "(Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadInfoDto;)Lio/getstream/chat/android/models/ThreadInfo;", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadParticipantDto;", "Lio/getstream/chat/android/models/ThreadParticipant;", "(Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadParticipantDto;)Lio/getstream/chat/android/models/ThreadParticipant;", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserBlockDto;", "Lio/getstream/chat/android/models/UserBlock;", "(Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserBlockDto;)Lio/getstream/chat/android/models/UserBlock;", "", "(Ljava/util/List;)Ljava/util/List;", "Lio/getstream/chat/android/client/api2/model/response/BlockUserResponse;", "(Lio/getstream/chat/android/client/api2/model/response/BlockUserResponse;)Lio/getstream/chat/android/models/UserBlock;", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamReminderDto;", "Lio/getstream/chat/android/models/MessageReminder;", "(Lio/getstream/chat/android/client/api2/model/dto/DownstreamReminderDto;)Lio/getstream/chat/android/models/MessageReminder;", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamReminderInfoDto;", "Lio/getstream/chat/android/models/MessageReminderInfo;", "(Lio/getstream/chat/android/client/api2/model/dto/DownstreamReminderInfoDto;)Lio/getstream/chat/android/models/MessageReminderInfo;", "Lio/getstream/chat/android/client/api2/model/response/QueryRemindersResponse;", "Lio/getstream/chat/android/models/QueryRemindersResult;", "(Lio/getstream/chat/android/client/api2/model/response/QueryRemindersResponse;)Lio/getstream/chat/android/models/QueryRemindersResult;", "Lio/getstream/chat/android/client/api2/model/dto/UnreadDto;", "Lio/getstream/chat/android/models/UnreadCounts;", "(Lio/getstream/chat/android/client/api2/model/dto/UnreadDto;)Lio/getstream/chat/android/models/UnreadCounts;", "Lio/getstream/chat/android/client/api2/model/dto/UnreadChannelDto;", "Lio/getstream/chat/android/models/UnreadChannel;", "(Lio/getstream/chat/android/client/api2/model/dto/UnreadChannelDto;)Lio/getstream/chat/android/models/UnreadChannel;", "Lio/getstream/chat/android/client/api2/model/dto/UnreadThreadDto;", "Lio/getstream/chat/android/models/UnreadThread;", "(Lio/getstream/chat/android/client/api2/model/dto/UnreadThreadDto;)Lio/getstream/chat/android/models/UnreadThread;", "Lio/getstream/chat/android/client/api2/model/dto/UnreadChannelByTypeDto;", "Lio/getstream/chat/android/models/UnreadChannelByType;", "(Lio/getstream/chat/android/client/api2/model/dto/UnreadChannelByTypeDto;)Lio/getstream/chat/android/models/UnreadChannelByType;", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamPushPreferenceDto;", "Lio/getstream/chat/android/models/PushPreference;", "(Lio/getstream/chat/android/client/api2/model/dto/DownstreamPushPreferenceDto;)Lio/getstream/chat/android/models/PushPreference;", "", "Lio/getstream/chat/android/models/querysort/QuerySorter;", "toSortDomain$stream_chat_android_client_release", "(Ljava/util/List;)Lio/getstream/chat/android/models/querysort/QuerySorter;", "toSortDomain", "", "filterFields", "defaultPredefinedFilterSort$stream_chat_android_client_release", "(Ljava/util/Set;)Lio/getstream/chat/android/models/querysort/QuerySorter;", "defaultPredefinedFilterSort", "Lio/getstream/chat/android/client/api2/model/response/AppDto;", "Lio/getstream/chat/android/models/App;", "(Lio/getstream/chat/android/client/api2/model/response/AppDto;)Lio/getstream/chat/android/models/App;", "Lio/getstream/chat/android/client/api2/model/response/FileUploadConfigDto;", "Lio/getstream/chat/android/models/FileUploadConfig;", "(Lio/getstream/chat/android/client/api2/model/response/FileUploadConfigDto;)Lio/getstream/chat/android/models/FileUploadConfig;", "messageId", "(Ljava/util/List;Ljava/lang/String;)Ljava/util/List;", "lastUpdateTime", "(Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;)Ljava/util/Date;", "Lc93/a;", "getCurrentUserIdProvider", "()Lc93/a;", "Lio/getstream/chat/android/models/ChannelTransformer;", "Lio/getstream/chat/android/models/MessageTransformer;", "Lio/getstream/chat/android/models/UserTransformer;", "Companion", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class DomainMapping {
    private static final Companion Companion = new Companion();
    private static final String FIELD_LAST_MESSAGE_AT = "last_message_at";
    private static final String FIELD_LAST_UPDATED = "last_updated";
    private final ChannelTransformer channelTransformer;
    private final InterfaceC4339a currentUserIdProvider;
    private final MessageTransformer messageTransformer;
    private final UserTransformer userTransformer;

    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/mapping/DomainMapping$Companion;", "", "<init>", "()V", "FIELD_LAST_MESSAGE_AT", "", "FIELD_LAST_UPDATED", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public DomainMapping(InterfaceC4339a currentUserIdProvider, ChannelTransformer channelTransformer, MessageTransformer messageTransformer, UserTransformer userTransformer) {
        AbstractC22676k.m65750j(currentUserIdProvider, "currentUserIdProvider");
        AbstractC22676k.m65750j(channelTransformer, "channelTransformer");
        AbstractC22676k.m65750j(messageTransformer, "messageTransformer");
        AbstractC22676k.m65750j(userTransformer, "userTransformer");
        this.currentUserIdProvider = currentUserIdProvider;
        this.channelTransformer = channelTransformer;
        this.messageTransformer = messageTransformer;
        this.userTransformer = userTransformer;
    }

    private final Date lastUpdateTime(DownstreamMessageDto downstreamMessageDto) {
        Date updated_at = downstreamMessageDto.getUpdated_at();
        DownstreamPollDto poll = downstreamMessageDto.getPoll();
        Iterator it = AbstractC25260n.m74077r0(new Date[]{updated_at, poll != null ? poll.getUpdated_at() : null}).iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (it.hasNext()) {
            long time = ((Date) next).getTime();
            do {
                Object next2 = it.next();
                long time2 = ((Date) next2).getTime();
                if (time < time2) {
                    next = next2;
                    time = time2;
                }
            } while (it.hasNext());
        }
        return (Date) next;
    }

    private final App toDomain(AppDto appDto) {
        return new App(appDto.getName(), toDomain(appDto.getFile_upload_config()), toDomain(appDto.getImage_upload_config()));
    }

    public static /* synthetic */ Message toDomain$stream_chat_android_client_release$default(DomainMapping domainMapping, DownstreamMessageDto downstreamMessageDto, ChannelInfo channelInfo, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            channelInfo = null;
        }
        return domainMapping.toDomain$stream_chat_android_client_release(downstreamMessageDto, channelInfo);
    }

    public final QuerySorter<Channel> defaultPredefinedFilterSort$stream_chat_android_client_release(Set<String> filterFields) {
        AbstractC22676k.m65750j(filterFields, "filterFields");
        String str = FIELD_LAST_MESSAGE_AT;
        if (!filterFields.contains(FIELD_LAST_MESSAGE_AT)) {
            str = FIELD_LAST_UPDATED;
        }
        return new QuerySortByField().desc(str);
    }

    public final InterfaceC4339a getCurrentUserIdProvider() {
        return this.currentUserIdProvider;
    }

    public final Answer toAnswerDomain$stream_chat_android_client_release(DownstreamVoteDto downstreamVoteDto) {
        AbstractC22676k.m65750j(downstreamVoteDto, "<this>");
        String id4 = downstreamVoteDto.getId();
        String poll_id = downstreamVoteDto.getPoll_id();
        String answer_text = downstreamVoteDto.getAnswer_text();
        if (answer_text == null) {
            answer_text = "";
        }
        String str = answer_text;
        Date created_at = downstreamVoteDto.getCreated_at();
        Date updated_at = downstreamVoteDto.getUpdated_at();
        DownstreamUserDto user = downstreamVoteDto.getUser();
        return new Answer(id4, poll_id, str, created_at, updated_at, user != null ? toDomain$stream_chat_android_client_release(user) : null);
    }

    public final ChannelInfo toChannelInfo$stream_chat_android_client_release(DownstreamChannelDto downstreamChannelDto) {
        AbstractC22676k.m65750j(downstreamChannelDto, "<this>");
        return new ChannelInfo(downstreamChannelDto.getCid(), downstreamChannelDto.getId(), downstreamChannelDto.getType(), downstreamChannelDto.getMember_count(), downstreamChannelDto.getName(), downstreamChannelDto.getImage());
    }

    public final AppSettings toDomain$stream_chat_android_client_release(AppSettingsResponse appSettingsResponse) {
        AbstractC22676k.m65750j(appSettingsResponse, "<this>");
        return new AppSettings(toDomain(appSettingsResponse.getApp()));
    }

    public final PollOption toPollOption$stream_chat_android_client_release(DownstreamPollOptionDto downstreamPollOptionDto) {
        AbstractC22676k.m65750j(downstreamPollOptionDto, "<this>");
        String id4 = downstreamPollOptionDto.getId();
        String text = downstreamPollOptionDto.getText();
        Map<String, Object> extraData = downstreamPollOptionDto.getExtraData();
        if (extraData == null) {
            extraData = C25272z.f99163w;
        }
        return new PollOption(id4, text, extraData);
    }

    public final QuerySorter<Channel> toSortDomain$stream_chat_android_client_release(List<? extends Map<String, ? extends Object>> list) {
        List<? extends Map<String, ? extends Object>> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return null;
        }
        QuerySortByField querySortByField = new QuerySortByField();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            Map map = (Map) it.next();
            Object obj = map.get("field");
            String str = obj instanceof String ? (String) obj : null;
            if (str == null) {
                return null;
            }
            Object obj2 = map.get("direction");
            Number number = obj2 instanceof Number ? (Number) obj2 : null;
            if (number != null) {
                int iIntValue = number.intValue();
                if (iIntValue == SortDirection.ASC.getValue()) {
                    querySortByField = querySortByField.asc(str);
                } else if (iIntValue == SortDirection.DESC.getValue()) {
                    querySortByField = querySortByField.desc(str);
                }
            }
            return null;
        }
        return querySortByField;
    }

    public final VotingVisibility toVotingVisibility$stream_chat_android_client_release(String str) {
        if (str == null || str.equals(CreatePollRequest.VOTING_VISIBILITY_PUBLIC)) {
            return VotingVisibility.PUBLIC;
        }
        if (str.equals(CreatePollRequest.VOTING_VISIBILITY_ANONYMOUS)) {
            return VotingVisibility.ANONYMOUS;
        }
        throw new IllegalArgumentException("Unknown voting visibility: ".concat(str));
    }

    public static /* synthetic */ DraftMessage toDomain$stream_chat_android_client_release$default(DomainMapping domainMapping, DownstreamDraftDto downstreamDraftDto, ChannelInfo channelInfo, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            channelInfo = null;
        }
        return domainMapping.toDomain$stream_chat_android_client_release(downstreamDraftDto, channelInfo);
    }

    public final Channel toDomain$stream_chat_android_client_release(DownstreamChannelDto downstreamChannelDto) {
        User domain$stream_chat_android_client_release;
        AbstractC22676k.m65750j(downstreamChannelDto, "<this>");
        String id4 = downstreamChannelDto.getId();
        String type = downstreamChannelDto.getType();
        String name = downstreamChannelDto.getName();
        if (name == null) {
            name = "";
        }
        String image = downstreamChannelDto.getImage();
        if (image == null) {
            image = "";
        }
        int watcher_count = downstreamChannelDto.getWatcher_count();
        List<String> filter_tags = downstreamChannelDto.getFilter_tags();
        if (filter_tags == null) {
            filter_tags = C25271y.f99162w;
        }
        List<String> list = filter_tags;
        boolean frozen = downstreamChannelDto.getFrozen();
        Date created_at = downstreamChannelDto.getCreated_at();
        Date deleted_at = downstreamChannelDto.getDeleted_at();
        Date updated_at = downstreamChannelDto.getUpdated_at();
        int member_count = downstreamChannelDto.getMember_count();
        List<DownstreamMessageDto> messages = downstreamChannelDto.getMessages();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(messages, 10));
        Iterator<T> it = messages.iterator();
        while (it.hasNext()) {
            arrayList.add(toDomain$stream_chat_android_client_release((DownstreamMessageDto) it.next(), toChannelInfo$stream_chat_android_client_release(downstreamChannelDto)));
        }
        List<DownstreamMemberDto> members = downstreamChannelDto.getMembers();
        String str = name;
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(members, 10));
        Iterator<T> it3 = members.iterator();
        while (it3.hasNext()) {
            arrayList2.add(toDomain$stream_chat_android_client_release((DownstreamMemberDto) it3.next()));
        }
        List<DownstreamUserDto> watchers = downstreamChannelDto.getWatchers();
        ArrayList arrayList3 = new ArrayList(AbstractC25267u.m74163i0(watchers, 10));
        Iterator<T> it4 = watchers.iterator();
        while (it4.hasNext()) {
            arrayList3.add(toDomain$stream_chat_android_client_release((DownstreamUserDto) it4.next()));
        }
        List<DownstreamChannelUserRead> read = downstreamChannelDto.getRead();
        ArrayList arrayList4 = new ArrayList(AbstractC25267u.m74163i0(read, 10));
        for (DownstreamChannelUserRead downstreamChannelUserRead : read) {
            Date last_message_at = downstreamChannelDto.getLast_message_at();
            if (last_message_at == null) {
                last_message_at = downstreamChannelUserRead.getLast_read();
            }
            arrayList4.add(toDomain$stream_chat_android_client_release(downstreamChannelUserRead, last_message_at));
        }
        Config domain$stream_chat_android_client_release2 = toDomain$stream_chat_android_client_release(downstreamChannelDto.getConfig());
        DownstreamUserDto created_by = downstreamChannelDto.getCreated_by();
        User user = (created_by == null || (domain$stream_chat_android_client_release = toDomain$stream_chat_android_client_release(created_by)) == null) ? new User(null, null, null, null, null, null, null, null, null, false, null, null, null, 0, 0, 0, null, null, null, null, null, null, null, null, null, 33554431, null) : domain$stream_chat_android_client_release;
        String team = downstreamChannelDto.getTeam();
        int cooldown = downstreamChannelDto.getCooldown();
        List<DownstreamMessageDto> pinned_messages = downstreamChannelDto.getPinned_messages();
        ArrayList arrayList5 = new ArrayList(AbstractC25267u.m74163i0(pinned_messages, 10));
        Iterator<T> it5 = pinned_messages.iterator();
        while (it5.hasNext()) {
            arrayList5.add(toDomain$stream_chat_android_client_release((DownstreamMessageDto) it5.next(), toChannelInfo$stream_chat_android_client_release(downstreamChannelDto)));
        }
        Set setM74103I1 = AbstractC25265s.m74103I1(downstreamChannelDto.getOwn_capabilities());
        DownstreamMemberDto membership = downstreamChannelDto.getMembership();
        Member domain$stream_chat_android_client_release3 = membership != null ? toDomain$stream_chat_android_client_release(membership) : null;
        List<DownstreamLocationDto> active_live_locations = downstreamChannelDto.getActive_live_locations();
        ArrayList arrayList6 = new ArrayList(AbstractC25267u.m74163i0(active_live_locations, 10));
        Iterator<T> it6 = active_live_locations.iterator();
        while (it6.hasNext()) {
            arrayList6.add(toDomain$stream_chat_android_client_release((DownstreamLocationDto) it6.next()));
        }
        return this.channelTransformer.transform(ChannelExtensionKt.syncUnreadCountWithReads(new Channel(id4, type, str, image, watcher_count, frozen, created_at, deleted_at, updated_at, null, member_count, arrayList, arrayList2, arrayList3, arrayList4, domain$stream_chat_android_client_release2, user, 0, team, null, null, cooldown, null, arrayList5, setM74103I1, domain$stream_chat_android_client_release3, null, false, null, arrayList6, downstreamChannelDto.getMessage_count(), null, list, downstreamChannelDto.getLast_message_at(), AbstractC25247g0.m74003l0(downstreamChannelDto.getExtraData()), -1671822848, 0, null), (String) this.currentUserIdProvider.invoke()));
    }

    public static /* synthetic */ PendingMessage toDomain$stream_chat_android_client_release$default(DomainMapping domainMapping, DownstreamPendingMessageDto downstreamPendingMessageDto, String str, ChannelInfo channelInfo, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            channelInfo = null;
        }
        return domainMapping.toDomain$stream_chat_android_client_release(downstreamPendingMessageDto, str, channelInfo);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0028  */
    private final FileUploadConfig toDomain(FileUploadConfigDto fileUploadConfigDto) {
        long jLongValue;
        List<String> allowed_file_extensions = fileUploadConfigDto.getAllowed_file_extensions();
        List<String> allowed_mime_types = fileUploadConfigDto.getAllowed_mime_types();
        List<String> blocked_file_extensions = fileUploadConfigDto.getBlocked_file_extensions();
        List<String> blocked_mime_types = fileUploadConfigDto.getBlocked_mime_types();
        Long size_limit = fileUploadConfigDto.getSize_limit();
        if (size_limit == null) {
            jLongValue = AppSettings.DEFAULT_SIZE_LIMIT_IN_BYTES;
        } else {
            if (size_limit.longValue() <= 0) {
                size_limit = null;
            }
            if (size_limit != null) {
                jLongValue = size_limit.longValue();
            } else {
                jLongValue = AppSettings.DEFAULT_SIZE_LIMIT_IN_BYTES;
            }
        }
        return new FileUploadConfig(allowed_file_extensions, allowed_mime_types, blocked_file_extensions, blocked_mime_types, jLongValue);
    }

    @StreamHandsOff(reason = "Backend response is including wrong reactions for the message, so we need to filter them manually.")
    private final List<Reaction> toDomain(List<DownstreamReactionDto> list, String str) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (AbstractC22676k.m65745e(((DownstreamReactionDto) obj).getMessage_id(), str)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(toDomain$stream_chat_android_client_release((DownstreamReactionDto) it.next()));
        }
        return arrayList2;
    }

    public final Message toDomain$stream_chat_android_client_release(DownstreamMessageDto downstreamMessageDto, ChannelInfo channelInfo) {
        AbstractC22676k.m65750j(downstreamMessageDto, "<this>");
        ChannelInfoDto channel = downstreamMessageDto.getChannel();
        ChannelInfo domain$stream_chat_android_client_release = channel != null ? toDomain$stream_chat_android_client_release(channel) : channelInfo;
        List<AttachmentDto> attachments = downstreamMessageDto.getAttachments();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(attachments, 10));
        Iterator<T> it = attachments.iterator();
        while (it.hasNext()) {
            arrayList.add(toDomain$stream_chat_android_client_release((AttachmentDto) it.next()));
        }
        String cid = downstreamMessageDto.getCid();
        String command = downstreamMessageDto.getCommand();
        Date created_at = downstreamMessageDto.getCreated_at();
        Date deleted_at = downstreamMessageDto.getDeleted_at();
        String html = downstreamMessageDto.getHtml();
        Map<String, String> i18n = downstreamMessageDto.getI18n();
        String id4 = downstreamMessageDto.getId();
        List<Reaction> domain = toDomain(downstreamMessageDto.getLatest_reactions(), downstreamMessageDto.getId());
        List<DownstreamUserDto> mentioned_users = downstreamMessageDto.getMentioned_users();
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(mentioned_users, 10));
        Iterator<T> it3 = mentioned_users.iterator();
        while (it3.hasNext()) {
            arrayList2.add(toDomain$stream_chat_android_client_release((DownstreamUserDto) it3.next()));
        }
        List<Reaction> domain2 = toDomain(downstreamMessageDto.getOwn_reactions(), downstreamMessageDto.getId());
        String parent_id = downstreamMessageDto.getParent_id();
        Date pin_expires = downstreamMessageDto.getPin_expires();
        boolean pinned = downstreamMessageDto.getPinned();
        Date pinned_at = downstreamMessageDto.getPinned_at();
        DownstreamUserDto pinned_by = downstreamMessageDto.getPinned_by();
        User domain$stream_chat_android_client_release2 = pinned_by != null ? toDomain$stream_chat_android_client_release(pinned_by) : null;
        Map reaction_counts = downstreamMessageDto.getReaction_counts();
        Map<String, DownstreamReactionGroupDto> map = C25272z.f99163w;
        if (reaction_counts == null) {
            reaction_counts = map;
        }
        LinkedHashMap linkedHashMapM74003l0 = AbstractC25247g0.m74003l0(reaction_counts);
        Map reaction_scores = downstreamMessageDto.getReaction_scores();
        if (reaction_scores == null) {
            reaction_scores = map;
        }
        LinkedHashMap linkedHashMapM74003l1 = AbstractC25247g0.m74003l0(reaction_scores);
        Map<String, DownstreamReactionGroupDto> reaction_groups = downstreamMessageDto.getReaction_groups();
        if (reaction_groups != null) {
            map = reaction_groups;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC25247g0.m73988W(map.size()));
        Iterator<T> it4 = map.entrySet().iterator();
        while (it4.hasNext()) {
            Map.Entry entry = (Map.Entry) it4.next();
            linkedHashMap.put(entry.getKey(), toDomain$stream_chat_android_client_release((DownstreamReactionGroupDto) entry.getValue(), (String) entry.getKey()));
        }
        int reply_count = downstreamMessageDto.getReply_count();
        int deleted_reply_count = downstreamMessageDto.getDeleted_reply_count();
        String quoted_message_id = downstreamMessageDto.getQuoted_message_id();
        DownstreamMessageDto quoted_message = downstreamMessageDto.getQuoted_message();
        Message domain$stream_chat_android_client_release3 = quoted_message != null ? toDomain$stream_chat_android_client_release(quoted_message, domain$stream_chat_android_client_release) : null;
        boolean shadowed = downstreamMessageDto.getShadowed();
        boolean show_in_channel = downstreamMessageDto.getShow_in_channel();
        boolean silent = downstreamMessageDto.getSilent();
        String text = downstreamMessageDto.getText();
        List<DownstreamUserDto> thread_participants = downstreamMessageDto.getThread_participants();
        ChannelInfo channelInfo2 = domain$stream_chat_android_client_release;
        ArrayList arrayList3 = new ArrayList(AbstractC25267u.m74163i0(thread_participants, 10));
        Iterator<T> it5 = thread_participants.iterator();
        while (it5.hasNext()) {
            arrayList3.add(toDomain$stream_chat_android_client_release((DownstreamUserDto) it5.next()));
        }
        String type = downstreamMessageDto.getType();
        Date dateLastUpdateTime = lastUpdateTime(downstreamMessageDto);
        User domain$stream_chat_android_client_release4 = toDomain$stream_chat_android_client_release(downstreamMessageDto.getUser());
        DownstreamModerationDetailsDto moderation_details = downstreamMessageDto.getModeration_details();
        MessageModerationDetails domain$stream_chat_android_client_release5 = moderation_details != null ? toDomain$stream_chat_android_client_release(moderation_details) : null;
        DownstreamModerationDto moderation = downstreamMessageDto.getModeration();
        Moderation domain$stream_chat_android_client_release6 = moderation != null ? toDomain$stream_chat_android_client_release(moderation) : null;
        Date message_text_updated_at = downstreamMessageDto.getMessage_text_updated_at();
        DownstreamPollDto poll = downstreamMessageDto.getPoll();
        Poll domain$stream_chat_android_client_release7 = poll != null ? toDomain$stream_chat_android_client_release(poll) : null;
        DownstreamReminderInfoDto reminder = downstreamMessageDto.getReminder();
        MessageReminderInfo domain$stream_chat_android_client_release8 = reminder != null ? toDomain$stream_chat_android_client_release(reminder) : null;
        DownstreamLocationDto shared_location = downstreamMessageDto.getShared_location();
        Location domain$stream_chat_android_client_release9 = shared_location != null ? toDomain$stream_chat_android_client_release(shared_location) : null;
        DownstreamMemberInfoDto member = downstreamMessageDto.getMember();
        String channel_role = member != null ? member.getChannel_role() : null;
        Boolean deleted_for_me = downstreamMessageDto.getDeleted_for_me();
        return this.messageTransformer.transform(new Message(id4, cid, text, html, parent_id, command, arrayList, null, arrayList2, reply_count, deleted_reply_count, linkedHashMapM74003l0, linkedHashMapM74003l1, linkedHashMap, null, type, domain, domain2, created_at, dateLastUpdateTime, deleted_at, null, null, domain$stream_chat_android_client_release4, AbstractC25247g0.m74003l0(downstreamMessageDto.getExtraData()), silent, shadowed, i18n, show_in_channel, channelInfo2, domain$stream_chat_android_client_release3, quoted_message_id, pinned, pinned_at, pin_expires, domain$stream_chat_android_client_release2, arrayList3, false, false, domain$stream_chat_android_client_release5, domain$stream_chat_android_client_release6, message_text_updated_at, domain$stream_chat_android_client_release7, C25271y.f99162w, domain$stream_chat_android_client_release8, domain$stream_chat_android_client_release9, channel_role, deleted_for_me != null ? deleted_for_me.booleanValue() : false, 6307968, 96, null));
    }

    public final DraftMessage toDomain$stream_chat_android_client_release(DownstreamDraftDto downstreamDraftDto, ChannelInfo channelInfo) {
        List list;
        String parent_id;
        AbstractC22676k.m65750j(downstreamDraftDto, "<this>");
        List<AttachmentDto> attachments = downstreamDraftDto.getMessage().getAttachments();
        List arrayList = C25271y.f99162w;
        if (attachments != null) {
            List<AttachmentDto> list2 = attachments;
            ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList2.add(toDomain$stream_chat_android_client_release((AttachmentDto) it.next()));
            }
            list = arrayList2;
        } else {
            list = arrayList;
        }
        String channel_cid = downstreamDraftDto.getChannel_cid();
        String id4 = downstreamDraftDto.getMessage().getId();
        DownstreamMessageDto parent_message = downstreamDraftDto.getParent_message();
        if (parent_message == null || (parent_id = parent_message.getId()) == null) {
            parent_id = downstreamDraftDto.getParent_id();
        }
        String str = parent_id;
        DownstreamMessageDto quoted_message = downstreamDraftDto.getQuoted_message();
        Message domain$stream_chat_android_client_release = quoted_message != null ? toDomain$stream_chat_android_client_release(quoted_message, channelInfo) : null;
        boolean show_in_channel = downstreamDraftDto.getMessage().getShow_in_channel();
        List<DownstreamUserDto> mentioned_users = downstreamDraftDto.getMessage().getMentioned_users();
        if (mentioned_users != null) {
            List<DownstreamUserDto> list3 = mentioned_users;
            arrayList = new ArrayList(AbstractC25267u.m74163i0(list3, 10));
            Iterator<T> it3 = list3.iterator();
            while (it3.hasNext()) {
                arrayList.add(((DownstreamUserDto) it3.next()).getId());
            }
        }
        List list4 = arrayList;
        boolean silent = downstreamDraftDto.getMessage().getSilent();
        String text = downstreamDraftDto.getMessage().getText();
        String command = downstreamDraftDto.getMessage().getCommand();
        String args = downstreamDraftDto.getMessage().getArgs();
        Map<String, Object> extraData = downstreamDraftDto.getMessage().getExtraData();
        if (extraData == null) {
            extraData = C25272z.f99163w;
        }
        return new DraftMessage(id4, channel_cid, text, str, list, list4, extraData, silent, show_in_channel, domain$stream_chat_android_client_release, command, args);
    }

    public final PendingMessage toDomain$stream_chat_android_client_release(DownstreamPendingMessageDto downstreamPendingMessageDto, String cid, ChannelInfo channelInfo) {
        AbstractC22676k.m65750j(downstreamPendingMessageDto, "<this>");
        AbstractC22676k.m65750j(cid, "cid");
        Message messageEnrichWithCid = MessageExtensionsKt.enrichWithCid(toDomain$stream_chat_android_client_release(downstreamPendingMessageDto.getMessage(), channelInfo), cid);
        Map<String, String> metadata = downstreamPendingMessageDto.getMetadata();
        if (metadata == null) {
            metadata = C25272z.f99163w;
        }
        return new PendingMessage(messageEnrichWithCid, metadata);
    }

    public final PendingMessage toDomain$stream_chat_android_client_release(MessageResponse messageResponse) {
        AbstractC22676k.m65750j(messageResponse, "<this>");
        Message domain$stream_chat_android_client_release$default = toDomain$stream_chat_android_client_release$default(this, messageResponse.getMessage(), (ChannelInfo) null, 1, (Object) null);
        Map<String, String> pending_message_metadata = messageResponse.getPending_message_metadata();
        if (pending_message_metadata == null) {
            pending_message_metadata = C25272z.f99163w;
        }
        return new PendingMessage(domain$stream_chat_android_client_release$default, pending_message_metadata);
    }

    public final User toDomain$stream_chat_android_client_release(DownstreamUserDto downstreamUserDto) {
        String str;
        String str2;
        AbstractC22676k.m65750j(downstreamUserDto, "<this>");
        String id4 = downstreamUserDto.getId();
        String name = downstreamUserDto.getName();
        String str3 = name == null ? "" : name;
        String image = downstreamUserDto.getImage();
        if (image == null) {
            str2 = "";
            str = str2;
        } else {
            str = image;
            str2 = "";
        }
        String role = downstreamUserDto.getRole();
        Boolean invisible = downstreamUserDto.getInvisible();
        PrivacySettingsDto privacy_settings = downstreamUserDto.getPrivacy_settings();
        PrivacySettings domain$stream_chat_android_client_release = privacy_settings != null ? toDomain$stream_chat_android_client_release(privacy_settings) : null;
        String language = downstreamUserDto.getLanguage();
        if (language != null) {
            str2 = language;
        }
        boolean banned = downstreamUserDto.getBanned();
        List<DeviceDto> devices = downstreamUserDto.getDevices();
        C25271y c25271y = C25271y.f99162w;
        if (devices == null) {
            devices = c25271y;
        }
        List<DeviceDto> list = devices;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(toDomain$stream_chat_android_client_release((DeviceDto) it.next()));
        }
        boolean online = downstreamUserDto.getOnline();
        Date created_at = downstreamUserDto.getCreated_at();
        Date deactivated_at = downstreamUserDto.getDeactivated_at();
        Date updated_at = downstreamUserDto.getUpdated_at();
        Date last_active = downstreamUserDto.getLast_active();
        int total_unread_count = downstreamUserDto.getTotal_unread_count();
        int unread_channels = downstreamUserDto.getUnread_channels();
        int unread_threads = downstreamUserDto.getUnread_threads();
        List<DownstreamMuteDto> mutes = downstreamUserDto.getMutes();
        if (mutes == null) {
            mutes = c25271y;
        }
        List<DownstreamMuteDto> list2 = mutes;
        String str4 = str2;
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
        Iterator<T> it3 = list2.iterator();
        while (it3.hasNext()) {
            arrayList2.add(toDomain$stream_chat_android_client_release((DownstreamMuteDto) it3.next()));
        }
        List<String> teams = downstreamUserDto.getTeams();
        Map<String, String> teams_role = downstreamUserDto.getTeams_role();
        if (teams_role == null) {
            teams_role = C25272z.f99163w;
        }
        List<DownstreamChannelMuteDto> channel_mutes = downstreamUserDto.getChannel_mutes();
        if (channel_mutes == null) {
            channel_mutes = c25271y;
        }
        List<DownstreamChannelMuteDto> list3 = channel_mutes;
        ArrayList arrayList3 = new ArrayList(AbstractC25267u.m74163i0(list3, 10));
        Iterator<T> it4 = list3.iterator();
        while (it4.hasNext()) {
            arrayList3.add(toDomain$stream_chat_android_client_release((DownstreamChannelMuteDto) it4.next()));
        }
        List<String> blocked_user_ids = downstreamUserDto.getBlocked_user_ids();
        if (blocked_user_ids == null) {
            blocked_user_ids = c25271y;
        }
        Long avg_response_time = downstreamUserDto.getAvg_response_time();
        DownstreamPushPreferenceDto push_preferences = downstreamUserDto.getPush_preferences();
        return this.userTransformer.transform(new User(id4, role, str3, str, invisible, domain$stream_chat_android_client_release, str4, Boolean.valueOf(banned), arrayList, online, created_at, updated_at, last_active, total_unread_count, unread_channels, unread_threads, arrayList2, teams, teams_role, arrayList3, blocked_user_ids, avg_response_time, push_preferences != null ? toDomain$stream_chat_android_client_release(push_preferences) : null, AbstractC25247g0.m74003l0(downstreamUserDto.getExtraData()), deactivated_at));
    }

    public final Reaction toDomain$stream_chat_android_client_release(DownstreamReactionDto downstreamReactionDto) {
        AbstractC22676k.m65750j(downstreamReactionDto, "<this>");
        Date created_at = downstreamReactionDto.getCreated_at();
        String message_id = downstreamReactionDto.getMessage_id();
        int score = downstreamReactionDto.getScore();
        String type = downstreamReactionDto.getType();
        Date updated_at = downstreamReactionDto.getUpdated_at();
        DownstreamUserDto user = downstreamReactionDto.getUser();
        return new Reaction(message_id, type, score, user != null ? toDomain$stream_chat_android_client_release(user) : null, downstreamReactionDto.getUser_id(), created_at, null, updated_at, null, null, AbstractC25247g0.m74003l0(downstreamReactionDto.getExtraData()), false, false, downstreamReactionDto.getEmoji_code(), 6976, null);
    }

    public final ReactionGroup toDomain$stream_chat_android_client_release(DownstreamReactionGroupDto downstreamReactionGroupDto, String type) {
        AbstractC22676k.m65750j(downstreamReactionGroupDto, "<this>");
        AbstractC22676k.m65750j(type, "type");
        return new ReactionGroup(type, downstreamReactionGroupDto.getCount(), downstreamReactionGroupDto.getSum_scores(), downstreamReactionGroupDto.getFirst_reaction_at(), downstreamReactionGroupDto.getLast_reaction_at());
    }

    public final Mute toDomain$stream_chat_android_client_release(DownstreamMuteDto downstreamMuteDto) {
        AbstractC22676k.m65750j(downstreamMuteDto, "<this>");
        DownstreamUserDto user = downstreamMuteDto.getUser();
        User domain$stream_chat_android_client_release = user != null ? toDomain$stream_chat_android_client_release(user) : null;
        DownstreamUserDto target = downstreamMuteDto.getTarget();
        return new Mute(domain$stream_chat_android_client_release, target != null ? toDomain$stream_chat_android_client_release(target) : null, downstreamMuteDto.getCreated_at(), downstreamMuteDto.getUpdated_at(), downstreamMuteDto.getExpires());
    }

    public final ChannelMute toDomain$stream_chat_android_client_release(DownstreamChannelMuteDto downstreamChannelMuteDto) {
        AbstractC22676k.m65750j(downstreamChannelMuteDto, "<this>");
        DownstreamUserDto user = downstreamChannelMuteDto.getUser();
        User domain$stream_chat_android_client_release = user != null ? toDomain$stream_chat_android_client_release(user) : null;
        DownstreamChannelDto channel = downstreamChannelMuteDto.getChannel();
        return new ChannelMute(domain$stream_chat_android_client_release, channel != null ? toDomain$stream_chat_android_client_release(channel) : null, downstreamChannelMuteDto.getCreated_at(), downstreamChannelMuteDto.getUpdated_at(), downstreamChannelMuteDto.getExpires());
    }

    public final Member toDomain$stream_chat_android_client_release(DownstreamMemberDto downstreamMemberDto) {
        AbstractC22676k.m65750j(downstreamMemberDto, "<this>");
        User domain$stream_chat_android_client_release = toDomain$stream_chat_android_client_release(downstreamMemberDto.getUser());
        Date created_at = downstreamMemberDto.getCreated_at();
        Date updated_at = downstreamMemberDto.getUpdated_at();
        Boolean invited = downstreamMemberDto.getInvited();
        Date invite_accepted_at = downstreamMemberDto.getInvite_accepted_at();
        Date invite_rejected_at = downstreamMemberDto.getInvite_rejected_at();
        Boolean shadow_banned = downstreamMemberDto.getShadow_banned();
        boolean zBooleanValue = shadow_banned != null ? shadow_banned.booleanValue() : false;
        Boolean banned = downstreamMemberDto.getBanned();
        return new Member(domain$stream_chat_android_client_release, created_at, updated_at, invited, invite_accepted_at, invite_rejected_at, zBooleanValue, banned != null ? banned.booleanValue() : false, downstreamMemberDto.getChannel_role(), downstreamMemberDto.getNotifications_muted(), downstreamMemberDto.getStatus(), downstreamMemberDto.getBan_expires(), downstreamMemberDto.getPinned_at(), downstreamMemberDto.getArchived_at(), downstreamMemberDto.getExtraData());
    }

    public final Location toDomain$stream_chat_android_client_release(DownstreamLocationDto downstreamLocationDto) {
        AbstractC22676k.m65750j(downstreamLocationDto, "<this>");
        return new Location(downstreamLocationDto.getChannel_cid(), downstreamLocationDto.getMessage_id(), downstreamLocationDto.getUser_id(), downstreamLocationDto.getEnd_at(), downstreamLocationDto.getLatitude(), downstreamLocationDto.getLongitude(), downstreamLocationDto.getCreated_by_device_id());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r21v0 */
    /* JADX WARN: Type inference failed for: r21v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r21v2 */
    /* JADX WARN: Type inference failed for: r27v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v0, types: [m83.y] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v2 */
    public final Poll toDomain$stream_chat_android_client_release(DownstreamPollDto downstreamPollDto) {
        ?? r24;
        Collection<List<DownstreamVoteDto>> collectionValues;
        DownstreamUserDto user;
        AbstractC22676k.m65750j(downstreamPollDto, "<this>");
        String id4 = (String) this.currentUserIdProvider.invoke();
        if (id4 == null) {
            DownstreamVoteDto downstreamVoteDto = (DownstreamVoteDto) AbstractC25265s.m74100H0(downstreamPollDto.getOwn_votes());
            id4 = (downstreamVoteDto == null || (user = downstreamVoteDto.getUser()) == null) ? null : user.getId();
        }
        Map<String, List<DownstreamVoteDto>> latest_votes_by_option = downstreamPollDto.getLatest_votes_by_option();
        ?? arrayList = C25271y.f99162w;
        if (latest_votes_by_option == null || (collectionValues = latest_votes_by_option.values()) == null) {
            r24 = arrayList;
        } else {
            ArrayList arrayListM74164j0 = AbstractC25267u.m74164j0(collectionValues);
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayListM74164j0) {
                if (!AbstractC22676k.m65745e(((DownstreamVoteDto) obj).is_answer(), Boolean.TRUE)) {
                    arrayList2.add(obj);
                }
            }
            ArrayList arrayList3 = new ArrayList(AbstractC25267u.m74163i0(arrayList2, 10));
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList3.add(toDomain$stream_chat_android_client_release((DownstreamVoteDto) it.next()));
            }
            r24 = arrayList3;
        }
        List<DownstreamVoteDto> own_votes = downstreamPollDto.getOwn_votes();
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : own_votes) {
            if (!AbstractC22676k.m65745e(((DownstreamVoteDto) obj2).is_answer(), Boolean.TRUE)) {
                arrayList4.add(obj2);
            }
        }
        ArrayList arrayList5 = new ArrayList(AbstractC25267u.m74163i0(arrayList4, 10));
        Iterator it3 = arrayList4.iterator();
        while (it3.hasNext()) {
            arrayList5.add(toDomain$stream_chat_android_client_release((DownstreamVoteDto) it3.next()));
        }
        ArrayList arrayList6 = new ArrayList();
        for (Object obj3 : (Iterable) r24) {
            User user2 = ((Vote) obj3).getUser();
            if (AbstractC22676k.m65745e(user2 != null ? user2.getId() : null, id4)) {
                arrayList6.add(obj3);
            }
        }
        ArrayList arrayListM74129g1 = AbstractC25265s.m74129g1(arrayList5, arrayList6);
        int iM73988W = AbstractC25247g0.m73988W(AbstractC25267u.m74163i0(arrayListM74129g1, 10));
        if (iM73988W < 16) {
            iM73988W = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM73988W);
        for (Object obj4 : arrayListM74129g1) {
            linkedHashMap.put(((Vote) obj4).getId(), obj4);
        }
        List listM74093D1 = AbstractC25265s.m74093D1(linkedHashMap.values());
        List<DownstreamVoteDto> latest_answers = downstreamPollDto.getLatest_answers();
        if (latest_answers != null) {
            List<DownstreamVoteDto> list = latest_answers;
            arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
            Iterator it4 = list.iterator();
            while (it4.hasNext()) {
                arrayList.add(toAnswerDomain$stream_chat_android_client_release((DownstreamVoteDto) it4.next()));
            }
        }
        ?? r27 = arrayList;
        String id5 = downstreamPollDto.getId();
        String name = downstreamPollDto.getName();
        String description = downstreamPollDto.getDescription();
        List<DownstreamPollOptionDto> options = downstreamPollDto.getOptions();
        ArrayList arrayList7 = new ArrayList(AbstractC25267u.m74163i0(options, 10));
        Iterator it5 = options.iterator();
        while (it5.hasNext()) {
            arrayList7.add(toDomain$stream_chat_android_client_release((DownstreamPollOptionDto) it5.next()));
        }
        VotingVisibility votingVisibility$stream_chat_android_client_release = toVotingVisibility$stream_chat_android_client_release(downstreamPollDto.getVoting_visibility());
        boolean enforce_unique_vote = downstreamPollDto.getEnforce_unique_vote();
        Integer max_votes_allowed = downstreamPollDto.getMax_votes_allowed();
        boolean allow_user_suggested_options = downstreamPollDto.getAllow_user_suggested_options();
        boolean allow_answers = downstreamPollDto.getAllow_answers();
        int vote_count = downstreamPollDto.getVote_count();
        Map<String, Integer> vote_counts_by_option = downstreamPollDto.getVote_counts_by_option();
        C25272z c25272z = C25272z.f99163w;
        Map<String, Integer> map = vote_counts_by_option == null ? c25272z : vote_counts_by_option;
        Date created_at = downstreamPollDto.getCreated_at();
        Date updated_at = downstreamPollDto.getUpdated_at();
        Boolean boolIs_closed = downstreamPollDto.is_closed();
        boolean zBooleanValue = boolIs_closed != null ? boolIs_closed.booleanValue() : false;
        int answers_count = downstreamPollDto.getAnswers_count();
        DownstreamUserDto created_by = downstreamPollDto.getCreated_by();
        User domain$stream_chat_android_client_release = created_by != null ? toDomain$stream_chat_android_client_release(created_by) : null;
        Map<String, Object> extraData = downstreamPollDto.getExtraData();
        return new Poll(id5, name, description, arrayList7, votingVisibility$stream_chat_android_client_release, enforce_unique_vote, max_votes_allowed, allow_user_suggested_options, allow_answers, vote_count, map, r24, listM74093D1, created_at, updated_at, zBooleanValue, answers_count, r27, domain$stream_chat_android_client_release, extraData == null ? c25272z : extraData);
    }

    public final Option toDomain$stream_chat_android_client_release(DownstreamPollOptionDto downstreamPollOptionDto) {
        AbstractC22676k.m65750j(downstreamPollOptionDto, "<this>");
        String id4 = downstreamPollOptionDto.getId();
        String text = downstreamPollOptionDto.getText();
        Map<String, Object> extraData = downstreamPollOptionDto.getExtraData();
        if (extraData == null) {
            extraData = C25272z.f99163w;
        }
        return new Option(id4, text, extraData);
    }

    public final Vote toDomain$stream_chat_android_client_release(DownstreamVoteDto downstreamVoteDto) {
        AbstractC22676k.m65750j(downstreamVoteDto, "<this>");
        String id4 = downstreamVoteDto.getId();
        String poll_id = downstreamVoteDto.getPoll_id();
        String option_id = downstreamVoteDto.getOption_id();
        Date created_at = downstreamVoteDto.getCreated_at();
        Date updated_at = downstreamVoteDto.getUpdated_at();
        DownstreamUserDto user = downstreamVoteDto.getUser();
        return new Vote(id4, poll_id, option_id, created_at, updated_at, user != null ? toDomain$stream_chat_android_client_release(user) : null);
    }

    public final QueryPollVotesResult toDomain$stream_chat_android_client_release(QueryPollVotesResponse queryPollVotesResponse) {
        AbstractC22676k.m65750j(queryPollVotesResponse, "<this>");
        List<DownstreamVoteDto> votes = queryPollVotesResponse.getVotes();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(votes, 10));
        Iterator<T> it = votes.iterator();
        while (it.hasNext()) {
            arrayList.add(toDomain$stream_chat_android_client_release((DownstreamVoteDto) it.next()));
        }
        return new QueryPollVotesResult(arrayList, queryPollVotesResponse.getNext());
    }

    public final QueryPollsResult toDomain$stream_chat_android_client_release(QueryPollsResponse queryPollsResponse) {
        AbstractC22676k.m65750j(queryPollsResponse, "<this>");
        List<DownstreamPollDto> polls = queryPollsResponse.getPolls();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(polls, 10));
        Iterator<T> it = polls.iterator();
        while (it.hasNext()) {
            arrayList.add(toDomain$stream_chat_android_client_release((DownstreamPollDto) it.next()));
        }
        return new QueryPollsResult(arrayList, queryPollsResponse.getNext());
    }

    public final ChannelUserRead toDomain$stream_chat_android_client_release(DownstreamChannelUserRead downstreamChannelUserRead, Date lastReceivedEventDate) {
        AbstractC22676k.m65750j(downstreamChannelUserRead, "<this>");
        AbstractC22676k.m65750j(lastReceivedEventDate, "lastReceivedEventDate");
        return new ChannelUserRead(toDomain$stream_chat_android_client_release(downstreamChannelUserRead.getUser()), lastReceivedEventDate, downstreamChannelUserRead.getUnread_messages(), downstreamChannelUserRead.getLast_read(), downstreamChannelUserRead.getLast_read_message_id(), downstreamChannelUserRead.getLast_delivered_at(), downstreamChannelUserRead.getLast_delivered_message_id());
    }

    public final Attachment toDomain$stream_chat_android_client_release(AttachmentDto attachmentDto) {
        AbstractC22676k.m65750j(attachmentDto, "<this>");
        String asset_url = attachmentDto.getAsset_url();
        String author_name = attachmentDto.getAuthor_name();
        String author_link = attachmentDto.getAuthor_link();
        String fallback = attachmentDto.getFallback();
        Integer file_size = attachmentDto.getFile_size();
        int iIntValue = file_size != null ? file_size.intValue() : 0;
        String image = attachmentDto.getImage();
        String image_url = attachmentDto.getImage_url();
        String mime_type = attachmentDto.getMime_type();
        String name = attachmentDto.getName();
        return new Attachment(author_name, author_link, attachmentDto.getTitle_link(), attachmentDto.getThumb_url(), image_url, asset_url, attachmentDto.getOg_scrape_url(), mime_type, iIntValue, attachmentDto.getTitle(), attachmentDto.getText(), attachmentDto.getType(), image, name, fallback, attachmentDto.getOriginal_height(), attachmentDto.getOriginal_width(), null, null, AbstractC25247g0.m74003l0(attachmentDto.getExtraData()), 393216, null);
    }

    public final BannedUser toDomain$stream_chat_android_client_release(BannedUserResponse bannedUserResponse) {
        AbstractC22676k.m65750j(bannedUserResponse, "<this>");
        User domain$stream_chat_android_client_release = toDomain$stream_chat_android_client_release(bannedUserResponse.getUser());
        DownstreamUserDto banned_by = bannedUserResponse.getBanned_by();
        User domain$stream_chat_android_client_release2 = banned_by != null ? toDomain$stream_chat_android_client_release(banned_by) : null;
        DownstreamChannelDto channel = bannedUserResponse.getChannel();
        return new BannedUser(domain$stream_chat_android_client_release, domain$stream_chat_android_client_release2, channel != null ? toDomain$stream_chat_android_client_release(channel) : null, bannedUserResponse.getCreated_at(), bannedUserResponse.getExpires(), bannedUserResponse.getShadow(), bannedUserResponse.getReason());
    }

    public final ChannelInfo toDomain$stream_chat_android_client_release(ChannelInfoDto channelInfoDto) {
        AbstractC22676k.m65750j(channelInfoDto, "<this>");
        return new ChannelInfo(channelInfoDto.getCid(), channelInfoDto.getId(), channelInfoDto.getType(), channelInfoDto.getMember_count(), channelInfoDto.getName(), channelInfoDto.getImage());
    }

    public final Command toDomain$stream_chat_android_client_release(CommandDto commandDto) {
        AbstractC22676k.m65750j(commandDto, "<this>");
        return new Command(commandDto.getName(), commandDto.getDescription(), commandDto.getArgs(), commandDto.getSet());
    }

    public final Config toDomain$stream_chat_android_client_release(ConfigDto configDto) {
        boolean zBooleanValue;
        boolean z4;
        AbstractC22676k.m65750j(configDto, "<this>");
        Date created_at = configDto.getCreated_at();
        Date updated_at = configDto.getUpdated_at();
        String name = configDto.getName();
        if (name == null) {
            name = "";
        }
        boolean typing_events = configDto.getTyping_events();
        boolean read_events = configDto.getRead_events();
        boolean delivery_events = configDto.getDelivery_events();
        boolean connect_events = configDto.getConnect_events();
        boolean search = configDto.getSearch();
        boolean reactions = configDto.getReactions();
        boolean replies = configDto.getReplies();
        boolean mutes = configDto.getMutes();
        boolean uploads = configDto.getUploads();
        boolean url_enrichment = configDto.getUrl_enrichment();
        boolean custom_events = configDto.getCustom_events();
        boolean push_notifications = configDto.getPush_notifications();
        Boolean skip_last_msg_update_for_system_msgs = configDto.getSkip_last_msg_update_for_system_msgs();
        if (skip_last_msg_update_for_system_msgs != null) {
            zBooleanValue = skip_last_msg_update_for_system_msgs.booleanValue();
            z4 = false;
        } else {
            zBooleanValue = false;
            z4 = false;
        }
        boolean polls = configDto.getPolls();
        boolean z13 = z4;
        String message_retention = configDto.getMessage_retention();
        int max_message_length = configDto.getMax_message_length();
        String automod = configDto.getAutomod();
        boolean zBooleanValue2 = z13;
        String automod_behavior = configDto.getAutomod_behavior();
        String blocklist_behavior = configDto.getBlocklist_behavior();
        String str = blocklist_behavior != null ? blocklist_behavior : "";
        String str2 = name;
        List<CommandDto> commands = configDto.getCommands();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(commands, 10));
        for (Iterator it = commands.iterator(); it.hasNext(); it = it) {
            arrayList.add(toDomain$stream_chat_android_client_release((CommandDto) it.next()));
        }
        Boolean user_message_reminders = configDto.getUser_message_reminders();
        boolean zBooleanValue3 = user_message_reminders != null ? user_message_reminders.booleanValue() : zBooleanValue2;
        Boolean shared_locations = configDto.getShared_locations();
        if (shared_locations != null) {
            zBooleanValue2 = shared_locations.booleanValue();
        }
        return new Config(created_at, updated_at, str2, typing_events, read_events, delivery_events, connect_events, search, reactions, replies, mutes, uploads, url_enrichment, custom_events, push_notifications, zBooleanValue, polls, message_retention, max_message_length, automod, automod_behavior, str, arrayList, zBooleanValue3, zBooleanValue2, configDto.getMark_messages_pending());
    }

    public final Device toDomain$stream_chat_android_client_release(DeviceDto deviceDto) {
        AbstractC22676k.m65750j(deviceDto, "<this>");
        return new Device(deviceDto.getId(), PushProvider.INSTANCE.fromKey(deviceDto.getPush_provider()), deviceDto.getPush_provider_name());
    }

    public final Flag toDomain$stream_chat_android_client_release(DownstreamFlagDto downstreamFlagDto) {
        AbstractC22676k.m65750j(downstreamFlagDto, "<this>");
        User domain$stream_chat_android_client_release = toDomain$stream_chat_android_client_release(downstreamFlagDto.getUser());
        DownstreamUserDto target_user = downstreamFlagDto.getTarget_user();
        User domain$stream_chat_android_client_release2 = target_user != null ? toDomain$stream_chat_android_client_release(target_user) : null;
        String target_message_id = downstreamFlagDto.getTarget_message_id();
        if (target_message_id == null) {
            target_message_id = "";
        }
        return new Flag(domain$stream_chat_android_client_release, domain$stream_chat_android_client_release2, target_message_id, downstreamFlagDto.getCreated_at(), downstreamFlagDto.getCreated_by_automod(), downstreamFlagDto.getApproved_at(), downstreamFlagDto.getUpdated_at(), downstreamFlagDto.getReviewed_at(), downstreamFlagDto.getApproved_at(), downstreamFlagDto.getRejected_at());
    }

    public final MessageModerationDetails toDomain$stream_chat_android_client_release(DownstreamModerationDetailsDto downstreamModerationDetailsDto) {
        AbstractC22676k.m65750j(downstreamModerationDetailsDto, "<this>");
        String original_text = downstreamModerationDetailsDto.getOriginal_text();
        if (original_text == null) {
            original_text = "";
        }
        MessageModerationAction.Companion companion = MessageModerationAction.INSTANCE;
        String action = downstreamModerationDetailsDto.getAction();
        if (action == null) {
            action = "";
        }
        MessageModerationAction messageModerationActionFromRawValue = companion.fromRawValue(action);
        String error_msg = downstreamModerationDetailsDto.getError_msg();
        return new MessageModerationDetails(original_text, messageModerationActionFromRawValue, error_msg != null ? error_msg : "");
    }

    public final Moderation toDomain$stream_chat_android_client_release(DownstreamModerationDto downstreamModerationDto) {
        AbstractC22676k.m65750j(downstreamModerationDto, "<this>");
        ModerationAction moderationActionFromValue = ModerationAction.INSTANCE.fromValue(downstreamModerationDto.getAction());
        String original_text = downstreamModerationDto.getOriginal_text();
        List<String> text_harms = downstreamModerationDto.getText_harms();
        C25271y c25271y = C25271y.f99162w;
        if (text_harms == null) {
            text_harms = c25271y;
        }
        List<String> image_harms = downstreamModerationDto.getImage_harms();
        if (image_harms == null) {
            image_harms = c25271y;
        }
        String blocklist_matched = downstreamModerationDto.getBlocklist_matched();
        String semantic_filter_matched = downstreamModerationDto.getSemantic_filter_matched();
        Boolean platform_circumvented = downstreamModerationDto.getPlatform_circumvented();
        return new Moderation(moderationActionFromValue, original_text, text_harms, image_harms, blocklist_matched, semantic_filter_matched, platform_circumvented != null ? platform_circumvented.booleanValue() : false);
    }

    public final PrivacySettings toDomain$stream_chat_android_client_release(PrivacySettingsDto privacySettingsDto) {
        AbstractC22676k.m65750j(privacySettingsDto, "<this>");
        TypingIndicatorsDto typing_indicators = privacySettingsDto.getTyping_indicators();
        TypingIndicators domain$stream_chat_android_client_release = typing_indicators != null ? toDomain$stream_chat_android_client_release(typing_indicators) : null;
        DeliveryReceiptsDto delivery_receipts = privacySettingsDto.getDelivery_receipts();
        DeliveryReceipts domain$stream_chat_android_client_release2 = delivery_receipts != null ? toDomain$stream_chat_android_client_release(delivery_receipts) : null;
        ReadReceiptsDto read_receipts = privacySettingsDto.getRead_receipts();
        return new PrivacySettings(domain$stream_chat_android_client_release, domain$stream_chat_android_client_release2, read_receipts != null ? toDomain$stream_chat_android_client_release(read_receipts) : null);
    }

    public final TypingIndicators toDomain$stream_chat_android_client_release(TypingIndicatorsDto typingIndicatorsDto) {
        AbstractC22676k.m65750j(typingIndicatorsDto, "<this>");
        return new TypingIndicators(typingIndicatorsDto.getEnabled());
    }

    public final DeliveryReceipts toDomain$stream_chat_android_client_release(DeliveryReceiptsDto deliveryReceiptsDto) {
        AbstractC22676k.m65750j(deliveryReceiptsDto, "<this>");
        return new DeliveryReceipts(deliveryReceiptsDto.getEnabled());
    }

    public final ReadReceipts toDomain$stream_chat_android_client_release(ReadReceiptsDto readReceiptsDto) {
        AbstractC22676k.m65750j(readReceiptsDto, "<this>");
        return new ReadReceipts(readReceiptsDto.getEnabled());
    }

    public final SearchWarning toDomain$stream_chat_android_client_release(SearchWarningDto searchWarningDto) {
        AbstractC22676k.m65750j(searchWarningDto, "<this>");
        return new SearchWarning(searchWarningDto.getChannel_search_cids(), searchWarningDto.getChannel_search_count(), searchWarningDto.getWarning_code(), searchWarningDto.getWarning_description());
    }

    public final Thread toDomain$stream_chat_android_client_release(DownstreamThreadDto downstreamThreadDto) {
        DraftMessage domain$stream_chat_android_client_release;
        AbstractC22676k.m65750j(downstreamThreadDto, "<this>");
        Integer active_participant_count = downstreamThreadDto.getActive_participant_count();
        int iIntValue = active_participant_count != null ? active_participant_count.intValue() : 0;
        String channel_cid = downstreamThreadDto.getChannel_cid();
        DownstreamChannelDto channel = downstreamThreadDto.getChannel();
        Channel domain$stream_chat_android_client_release2 = channel != null ? toDomain$stream_chat_android_client_release(channel) : null;
        String parent_message_id = downstreamThreadDto.getParent_message_id();
        DownstreamMessageDto parent_message = downstreamThreadDto.getParent_message();
        DownstreamChannelDto channel2 = downstreamThreadDto.getChannel();
        Message domain$stream_chat_android_client_release3 = toDomain$stream_chat_android_client_release(parent_message, channel2 != null ? toChannelInfo$stream_chat_android_client_release(channel2) : null);
        String created_by_user_id = downstreamThreadDto.getCreated_by_user_id();
        DownstreamUserDto created_by = downstreamThreadDto.getCreated_by();
        User domain$stream_chat_android_client_release4 = created_by != null ? toDomain$stream_chat_android_client_release(created_by) : null;
        int participant_count = downstreamThreadDto.getParticipant_count();
        List<DownstreamThreadParticipantDto> thread_participants = downstreamThreadDto.getThread_participants();
        C25271y c25271y = C25271y.f99162w;
        if (thread_participants == null) {
            thread_participants = c25271y;
        }
        List<DownstreamThreadParticipantDto> list = thread_participants;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(toDomain$stream_chat_android_client_release((DownstreamThreadParticipantDto) it.next()));
        }
        List<ThreadParticipant> listSortedByLastReply = ThreadKt.sortedByLastReply(arrayList);
        Date last_message_at = downstreamThreadDto.getLast_message_at();
        Date created_at = downstreamThreadDto.getCreated_at();
        Date updated_at = downstreamThreadDto.getUpdated_at();
        List<DownstreamChannelUserRead> list2 = c25271y;
        Date deleted_at = downstreamThreadDto.getDeleted_at();
        String title = downstreamThreadDto.getTitle();
        List<DownstreamMessageDto> latest_replies = downstreamThreadDto.getLatest_replies();
        Channel channel3 = domain$stream_chat_android_client_release2;
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(latest_replies, 10));
        for (DownstreamMessageDto downstreamMessageDto : latest_replies) {
            DownstreamChannelDto channel4 = downstreamThreadDto.getChannel();
            arrayList2.add(toDomain$stream_chat_android_client_release(downstreamMessageDto, channel4 != null ? toChannelInfo$stream_chat_android_client_release(channel4) : null));
        }
        List<DownstreamChannelUserRead> read = downstreamThreadDto.getRead();
        if (read != null) {
            list2 = read;
        }
        List<DownstreamChannelUserRead> list3 = list2;
        ArrayList arrayList3 = new ArrayList(AbstractC25267u.m74163i0(list3, 10));
        Iterator<T> it3 = list3.iterator();
        while (it3.hasNext()) {
            arrayList3.add(toDomain$stream_chat_android_client_release((DownstreamChannelUserRead) it3.next(), downstreamThreadDto.getLast_message_at()));
            arrayList2 = arrayList2;
        }
        ArrayList arrayList4 = arrayList2;
        DownstreamDraftDto draft = downstreamThreadDto.getDraft();
        if (draft != null) {
            DownstreamChannelDto channel5 = downstreamThreadDto.getChannel();
            domain$stream_chat_android_client_release = toDomain$stream_chat_android_client_release(draft, channel5 != null ? toChannelInfo$stream_chat_android_client_release(channel5) : null);
        } else {
            domain$stream_chat_android_client_release = null;
        }
        return new Thread(iIntValue, channel_cid, channel3, parent_message_id, domain$stream_chat_android_client_release3, created_by_user_id, domain$stream_chat_android_client_release4, participant_count, listSortedByLastReply, last_message_at, created_at, updated_at, deleted_at, title, arrayList4, arrayList3, domain$stream_chat_android_client_release, downstreamThreadDto.getExtraData());
    }

    public final ThreadInfo toDomain$stream_chat_android_client_release(DownstreamThreadInfoDto downstreamThreadInfoDto) {
        Message domain$stream_chat_android_client_release;
        AbstractC22676k.m65750j(downstreamThreadInfoDto, "<this>");
        Integer active_participant_count = downstreamThreadInfoDto.getActive_participant_count();
        int iIntValue = active_participant_count != null ? active_participant_count.intValue() : 0;
        String channel_cid = downstreamThreadInfoDto.getChannel_cid();
        Date created_at = downstreamThreadInfoDto.getCreated_at();
        DownstreamUserDto created_by = downstreamThreadInfoDto.getCreated_by();
        User domain$stream_chat_android_client_release2 = created_by != null ? toDomain$stream_chat_android_client_release(created_by) : null;
        String created_by_user_id = downstreamThreadInfoDto.getCreated_by_user_id();
        Date deleted_at = downstreamThreadInfoDto.getDeleted_at();
        Date last_message_at = downstreamThreadInfoDto.getLast_message_at();
        DownstreamMessageDto parent_message = downstreamThreadInfoDto.getParent_message();
        if (parent_message != null) {
            DownstreamChannelDto channel = downstreamThreadInfoDto.getChannel();
            domain$stream_chat_android_client_release = toDomain$stream_chat_android_client_release(parent_message, channel != null ? toChannelInfo$stream_chat_android_client_release(channel) : null);
        } else {
            domain$stream_chat_android_client_release = null;
        }
        String parent_message_id = downstreamThreadInfoDto.getParent_message_id();
        Integer participant_count = downstreamThreadInfoDto.getParticipant_count();
        int iIntValue2 = participant_count != null ? participant_count.intValue() : 0;
        Integer reply_count = downstreamThreadInfoDto.getReply_count();
        int iIntValue3 = reply_count != null ? reply_count.intValue() : 0;
        String title = downstreamThreadInfoDto.getTitle();
        Date updated_at = downstreamThreadInfoDto.getUpdated_at();
        DownstreamChannelDto channel2 = downstreamThreadInfoDto.getChannel();
        Channel domain$stream_chat_android_client_release3 = channel2 != null ? toDomain$stream_chat_android_client_release(channel2) : null;
        List<DownstreamThreadParticipantDto> thread_participants = downstreamThreadInfoDto.getThread_participants();
        if (thread_participants == null) {
            thread_participants = C25271y.f99162w;
        }
        List<DownstreamThreadParticipantDto> list = thread_participants;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(toDomain$stream_chat_android_client_release((DownstreamThreadParticipantDto) it.next()));
        }
        return new ThreadInfo(iIntValue, channel_cid, created_at, domain$stream_chat_android_client_release2, created_by_user_id, deleted_at, last_message_at, domain$stream_chat_android_client_release, parent_message_id, iIntValue2, iIntValue3, title, updated_at, domain$stream_chat_android_client_release3, ThreadKt.sortedByLastReply(arrayList), downstreamThreadInfoDto.getExtraData());
    }

    public final ThreadParticipant toDomain$stream_chat_android_client_release(DownstreamThreadParticipantDto downstreamThreadParticipantDto) {
        User user;
        AbstractC22676k.m65750j(downstreamThreadParticipantDto, "<this>");
        DownstreamUserDto user2 = downstreamThreadParticipantDto.getUser();
        if (user2 == null || (user = toDomain$stream_chat_android_client_release(user2)) == null) {
            user = new User(downstreamThreadParticipantDto.getUser_id(), null, null, null, null, null, null, null, null, false, null, null, null, 0, 0, 0, null, null, null, null, null, null, null, null, null, 33554430, null);
        }
        return new ThreadParticipant(user, downstreamThreadParticipantDto.getLast_thread_message_at());
    }

    public final UserBlock toDomain$stream_chat_android_client_release(DownstreamUserBlockDto downstreamUserBlockDto) {
        AbstractC22676k.m65750j(downstreamUserBlockDto, "<this>");
        return new UserBlock(downstreamUserBlockDto.getUser_id(), downstreamUserBlockDto.getBlocked_user_id(), downstreamUserBlockDto.getCreated_at());
    }

    public final List<UserBlock> toDomain$stream_chat_android_client_release(List<DownstreamUserBlockDto> list) {
        AbstractC22676k.m65750j(list, "<this>");
        List<DownstreamUserBlockDto> list2 = list;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(toDomain$stream_chat_android_client_release((DownstreamUserBlockDto) it.next()));
        }
        return arrayList;
    }

    public final UserBlock toDomain$stream_chat_android_client_release(BlockUserResponse blockUserResponse) {
        AbstractC22676k.m65750j(blockUserResponse, "<this>");
        return new UserBlock(blockUserResponse.getBlocked_by_user_id(), blockUserResponse.getBlocked_user_id(), blockUserResponse.getCreated_at());
    }

    public final MessageReminder toDomain$stream_chat_android_client_release(DownstreamReminderDto downstreamReminderDto) {
        AbstractC22676k.m65750j(downstreamReminderDto, "<this>");
        Date remind_at = downstreamReminderDto.getRemind_at();
        String channel_cid = downstreamReminderDto.getChannel_cid();
        DownstreamChannelDto channel = downstreamReminderDto.getChannel();
        Channel domain$stream_chat_android_client_release = channel != null ? toDomain$stream_chat_android_client_release(channel) : null;
        String message_id = downstreamReminderDto.getMessage_id();
        DownstreamMessageDto message = downstreamReminderDto.getMessage();
        return new MessageReminder(remind_at, channel_cid, domain$stream_chat_android_client_release, message_id, message != null ? toDomain$stream_chat_android_client_release(message, (ChannelInfo) null) : null, downstreamReminderDto.getCreated_at(), downstreamReminderDto.getUpdated_at());
    }

    public final MessageReminderInfo toDomain$stream_chat_android_client_release(DownstreamReminderInfoDto downstreamReminderInfoDto) {
        AbstractC22676k.m65750j(downstreamReminderInfoDto, "<this>");
        return new MessageReminderInfo(downstreamReminderInfoDto.getRemind_at(), downstreamReminderInfoDto.getCreated_at(), downstreamReminderInfoDto.getUpdated_at());
    }

    public final QueryRemindersResult toDomain$stream_chat_android_client_release(QueryRemindersResponse queryRemindersResponse) {
        AbstractC22676k.m65750j(queryRemindersResponse, "<this>");
        List<DownstreamReminderDto> reminders = queryRemindersResponse.getReminders();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(reminders, 10));
        Iterator<T> it = reminders.iterator();
        while (it.hasNext()) {
            arrayList.add(toDomain$stream_chat_android_client_release((DownstreamReminderDto) it.next()));
        }
        return new QueryRemindersResult(arrayList, queryRemindersResponse.getNext());
    }

    public final UnreadCounts toDomain$stream_chat_android_client_release(UnreadDto unreadDto) {
        AbstractC22676k.m65750j(unreadDto, "<this>");
        int total_unread_count = unreadDto.getTotal_unread_count();
        int total_unread_threads_count = unreadDto.getTotal_unread_threads_count();
        Map<String, Integer> total_unread_count_by_team = unreadDto.getTotal_unread_count_by_team();
        if (total_unread_count_by_team == null) {
            total_unread_count_by_team = C25272z.f99163w;
        }
        Map<String, Integer> map = total_unread_count_by_team;
        List<UnreadChannelDto> channels = unreadDto.getChannels();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(channels, 10));
        Iterator<T> it = channels.iterator();
        while (it.hasNext()) {
            arrayList.add(toDomain$stream_chat_android_client_release((UnreadChannelDto) it.next()));
        }
        List<UnreadThreadDto> threads = unreadDto.getThreads();
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(threads, 10));
        Iterator<T> it3 = threads.iterator();
        while (it3.hasNext()) {
            arrayList2.add(toDomain$stream_chat_android_client_release((UnreadThreadDto) it3.next()));
        }
        List<UnreadChannelByTypeDto> channel_type = unreadDto.getChannel_type();
        ArrayList arrayList3 = new ArrayList(AbstractC25267u.m74163i0(channel_type, 10));
        Iterator<T> it4 = channel_type.iterator();
        while (it4.hasNext()) {
            arrayList3.add(toDomain$stream_chat_android_client_release((UnreadChannelByTypeDto) it4.next()));
        }
        return new UnreadCounts(total_unread_count, total_unread_threads_count, map, arrayList, arrayList2, arrayList3);
    }

    public final UnreadChannel toDomain$stream_chat_android_client_release(UnreadChannelDto unreadChannelDto) {
        AbstractC22676k.m65750j(unreadChannelDto, "<this>");
        return new UnreadChannel(unreadChannelDto.getChannel_id(), unreadChannelDto.getUnread_count(), unreadChannelDto.getLast_read());
    }

    public final UnreadThread toDomain$stream_chat_android_client_release(UnreadThreadDto unreadThreadDto) {
        AbstractC22676k.m65750j(unreadThreadDto, "<this>");
        return new UnreadThread(unreadThreadDto.getParent_message_id(), unreadThreadDto.getUnread_count(), unreadThreadDto.getLast_read(), unreadThreadDto.getLast_read_message_id());
    }

    public final UnreadChannelByType toDomain$stream_chat_android_client_release(UnreadChannelByTypeDto unreadChannelByTypeDto) {
        AbstractC22676k.m65750j(unreadChannelByTypeDto, "<this>");
        return new UnreadChannelByType(unreadChannelByTypeDto.getChannel_type(), unreadChannelByTypeDto.getChannel_count(), unreadChannelByTypeDto.getUnread_count());
    }

    public final PushPreference toDomain$stream_chat_android_client_release(DownstreamPushPreferenceDto downstreamPushPreferenceDto) {
        AbstractC22676k.m65750j(downstreamPushPreferenceDto, "<this>");
        return new PushPreference(PushPreferenceLevel.INSTANCE.fromValue(downstreamPushPreferenceDto.getChat_level()), downstreamPushPreferenceDto.getDisabled_until());
    }
}
