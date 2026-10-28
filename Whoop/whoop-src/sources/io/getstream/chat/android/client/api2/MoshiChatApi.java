package io.getstream.chat.android.client.api2;

import am2.C1012d;
import androidx.core.app.NotificationCompat;
import androidx.room.AbstractC1772c1;
import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.mapbox.maps.MapboxMap;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import ec3.InterfaceC13075p1;
import f01.C13857f;
import i01.C17841d;
import i22.C18014b;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.api.ChatApi;
import io.getstream.chat.android.client.api.ErrorCall;
import io.getstream.chat.android.client.api.QueryParams;
import io.getstream.chat.android.client.api.models.GetThreadOptions;
import io.getstream.chat.android.client.api.models.PinnedMessagesPagination;
import io.getstream.chat.android.client.api.models.PredefinedFilter;
import io.getstream.chat.android.client.api.models.QueryChannelRequest;
import io.getstream.chat.android.client.api.models.QueryChannelsResult;
import io.getstream.chat.android.client.api.models.QueryThreadsRequest;
import io.getstream.chat.android.client.api.models.SendActionRequest;
import io.getstream.chat.android.client.api.models.UpdatePollRequest;
import io.getstream.chat.android.client.api2.endpoint.ChannelApi;
import io.getstream.chat.android.client.api2.endpoint.ConfigApi;
import io.getstream.chat.android.client.api2.endpoint.DeviceApi;
import io.getstream.chat.android.client.api2.endpoint.FileDownloadApi;
import io.getstream.chat.android.client.api2.endpoint.GeneralApi;
import io.getstream.chat.android.client.api2.endpoint.GuestApi;
import io.getstream.chat.android.client.api2.endpoint.MessageApi;
import io.getstream.chat.android.client.api2.endpoint.ModerationApi;
import io.getstream.chat.android.client.api2.endpoint.OpenGraphApi;
import io.getstream.chat.android.client.api2.endpoint.PollsApi;
import io.getstream.chat.android.client.api2.endpoint.PushPreferencesApi;
import io.getstream.chat.android.client.api2.endpoint.RemindersApi;
import io.getstream.chat.android.client.api2.endpoint.ThreadsApi;
import io.getstream.chat.android.client.api2.endpoint.UserApi;
import io.getstream.chat.android.client.api2.mapping.DomainMapping;
import io.getstream.chat.android.client.api2.mapping.DtoMapping;
import io.getstream.chat.android.client.api2.mapping.EventMapping;
import io.getstream.chat.android.client.api2.mapping.FilterDomainMappingKt;
import io.getstream.chat.android.client.api2.model.dto.AttachmentDto;
import io.getstream.chat.android.client.api2.model.dto.ChatEventDto;
import io.getstream.chat.android.client.api2.model.dto.DeviceDto;
import io.getstream.chat.android.client.api2.model.dto.DownstreamChannelUserRead;
import io.getstream.chat.android.client.api2.model.dto.DownstreamDraftDto;
import io.getstream.chat.android.client.api2.model.dto.DownstreamLocationDto;
import io.getstream.chat.android.client.api2.model.dto.DownstreamMemberDto;
import io.getstream.chat.android.client.api2.model.dto.DownstreamMessageDto;
import io.getstream.chat.android.client.api2.model.dto.DownstreamPendingMessageDto;
import io.getstream.chat.android.client.api2.model.dto.DownstreamPushPreferenceDto;
import io.getstream.chat.android.client.api2.model.dto.DownstreamReactionDto;
import io.getstream.chat.android.client.api2.model.dto.DownstreamThreadDto;
import io.getstream.chat.android.client.api2.model.dto.DownstreamUserDto;
import io.getstream.chat.android.client.api2.model.dto.PartialUpdateUserDto;
import io.getstream.chat.android.client.api2.model.dto.SearchWarningDto;
import io.getstream.chat.android.client.api2.model.dto.UnreadDto;
import io.getstream.chat.android.client.api2.model.dto.UpstreamPushPreferenceInputDto;
import io.getstream.chat.android.client.api2.model.requests.AcceptInviteRequest;
import io.getstream.chat.android.client.api2.model.requests.AddDeviceRequest;
import io.getstream.chat.android.client.api2.model.requests.AddMembersRequest;
import io.getstream.chat.android.client.api2.model.requests.BanUserRequest;
import io.getstream.chat.android.client.api2.model.requests.BlockUserRequest;
import io.getstream.chat.android.client.api2.model.requests.CreatePollRequest;
import io.getstream.chat.android.client.api2.model.requests.FlagMessageRequest;
import io.getstream.chat.android.client.api2.model.requests.FlagRequest;
import io.getstream.chat.android.client.api2.model.requests.FlagUserRequest;
import io.getstream.chat.android.client.api2.model.requests.GuestUserRequest;
import io.getstream.chat.android.client.api2.model.requests.HideChannelRequest;
import io.getstream.chat.android.client.api2.model.requests.InviteMembersRequest;
import io.getstream.chat.android.client.api2.model.requests.MarkDeliveredRequest;
import io.getstream.chat.android.client.api2.model.requests.MarkReadRequest;
import io.getstream.chat.android.client.api2.model.requests.MarkUnreadRequest;
import io.getstream.chat.android.client.api2.model.requests.MuteChannelRequest;
import io.getstream.chat.android.client.api2.model.requests.MuteUserRequest;
import io.getstream.chat.android.client.api2.model.requests.PartialUpdateMessageRequest;
import io.getstream.chat.android.client.api2.model.requests.PartialUpdatePollRequest;
import io.getstream.chat.android.client.api2.model.requests.PartialUpdateThreadRequest;
import io.getstream.chat.android.client.api2.model.requests.PartialUpdateUsersRequest;
import io.getstream.chat.android.client.api2.model.requests.PinnedMessagesRequest;
import io.getstream.chat.android.client.api2.model.requests.PollVoteRequest;
import io.getstream.chat.android.client.api2.model.requests.QueryBannedUsersRequest;
import io.getstream.chat.android.client.api2.model.requests.QueryChannelsRequest;
import io.getstream.chat.android.client.api2.model.requests.QueryDraftMessagesRequest;
import io.getstream.chat.android.client.api2.model.requests.QueryDraftsRequest;
import io.getstream.chat.android.client.api2.model.requests.QueryMembersRequest;
import io.getstream.chat.android.client.api2.model.requests.QueryPollVotesRequest;
import io.getstream.chat.android.client.api2.model.requests.QueryPollsRequest;
import io.getstream.chat.android.client.api2.model.requests.QueryReactionsRequest;
import io.getstream.chat.android.client.api2.model.requests.QueryRemindersRequest;
import io.getstream.chat.android.client.api2.model.requests.QueryUsersRequest;
import io.getstream.chat.android.client.api2.model.requests.ReactionRequest;
import io.getstream.chat.android.client.api2.model.requests.RejectInviteRequest;
import io.getstream.chat.android.client.api2.model.requests.ReminderRequest;
import io.getstream.chat.android.client.api2.model.requests.RemoveMembersRequest;
import io.getstream.chat.android.client.api2.model.requests.SearchMessagesRequest;
import io.getstream.chat.android.client.api2.model.requests.SendEventRequest;
import io.getstream.chat.android.client.api2.model.requests.SendMessageRequest;
import io.getstream.chat.android.client.api2.model.requests.SyncHistoryRequest;
import io.getstream.chat.android.client.api2.model.requests.TruncateChannelRequest;
import io.getstream.chat.android.client.api2.model.requests.UnblockUserRequest;
import io.getstream.chat.android.client.api2.model.requests.UpdateChannelPartialRequest;
import io.getstream.chat.android.client.api2.model.requests.UpdateChannelRequest;
import io.getstream.chat.android.client.api2.model.requests.UpdateCooldownRequest;
import io.getstream.chat.android.client.api2.model.requests.UpdateLiveLocationRequest;
import io.getstream.chat.android.client.api2.model.requests.UpdateMemberPartialRequest;
import io.getstream.chat.android.client.api2.model.requests.UpdateMemberPartialResponse;
import io.getstream.chat.android.client.api2.model.requests.UpdateMessageRequest;
import io.getstream.chat.android.client.api2.model.requests.UpdateUsersRequest;
import io.getstream.chat.android.client.api2.model.requests.UpsertPushPreferencesRequest;
import io.getstream.chat.android.client.api2.model.requests.UpstreamOptionDto;
import io.getstream.chat.android.client.api2.model.requests.UpstreamVoteDto;
import io.getstream.chat.android.client.api2.model.response.AppSettingsResponse;
import io.getstream.chat.android.client.api2.model.response.BannedUserResponse;
import io.getstream.chat.android.client.api2.model.response.BlockUserResponse;
import io.getstream.chat.android.client.api2.model.response.ChannelResponse;
import io.getstream.chat.android.client.api2.model.response.DevicesResponse;
import io.getstream.chat.android.client.api2.model.response.DraftMessageResponse;
import io.getstream.chat.android.client.api2.model.response.EventResponse;
import io.getstream.chat.android.client.api2.model.response.FlagResponse;
import io.getstream.chat.android.client.api2.model.response.LiveLocationsResponse;
import io.getstream.chat.android.client.api2.model.response.MessageResponse;
import io.getstream.chat.android.client.api2.model.response.MessagesResponse;
import io.getstream.chat.android.client.api2.model.response.MuteUserResponse;
import io.getstream.chat.android.client.api2.model.response.ParsedPredefinedFilterResponse;
import io.getstream.chat.android.client.api2.model.response.PollOptionResponse;
import io.getstream.chat.android.client.api2.model.response.PollResponse;
import io.getstream.chat.android.client.api2.model.response.PollVoteResponse;
import io.getstream.chat.android.client.api2.model.response.PushPreferencesResponse;
import io.getstream.chat.android.client.api2.model.response.PushPreferencesResponseKt;
import io.getstream.chat.android.client.api2.model.response.QueryBannedUsersResponse;
import io.getstream.chat.android.client.api2.model.response.QueryBlockedUsersResponse;
import io.getstream.chat.android.client.api2.model.response.QueryChannelsResponse;
import io.getstream.chat.android.client.api2.model.response.QueryDraftMessagesResponse;
import io.getstream.chat.android.client.api2.model.response.QueryMembersResponse;
import io.getstream.chat.android.client.api2.model.response.QueryPollVotesResponse;
import io.getstream.chat.android.client.api2.model.response.QueryPollsResponse;
import io.getstream.chat.android.client.api2.model.response.QueryReactionsResponse;
import io.getstream.chat.android.client.api2.model.response.QueryRemindersResponse;
import io.getstream.chat.android.client.api2.model.response.QueryThreadsResponse;
import io.getstream.chat.android.client.api2.model.response.ReactionResponse;
import io.getstream.chat.android.client.api2.model.response.ReactionsResponse;
import io.getstream.chat.android.client.api2.model.response.ReminderResponse;
import io.getstream.chat.android.client.api2.model.response.SearchMessagesResponse;
import io.getstream.chat.android.client.api2.model.response.SyncHistoryResponse;
import io.getstream.chat.android.client.api2.model.response.ThreadInfoResponse;
import io.getstream.chat.android.client.api2.model.response.ThreadResponse;
import io.getstream.chat.android.client.api2.model.response.TokenResponse;
import io.getstream.chat.android.client.api2.model.response.TranslateMessageRequest;
import io.getstream.chat.android.client.api2.model.response.UpdateUsersResponse;
import io.getstream.chat.android.client.api2.model.response.UsersResponse;
import io.getstream.chat.android.client.call.RetrofitCall;
import io.getstream.chat.android.client.events.ChatEvent;
import io.getstream.chat.android.client.extensions.ChannelExtensionKt;
import io.getstream.chat.android.client.extensions.MessageExtensionsKt;
import io.getstream.chat.android.client.helpers.CallPostponeHelper;
import io.getstream.chat.android.client.parser.FilterObjectToMapKt;
import io.getstream.chat.android.client.scope.UserScope;
import io.getstream.chat.android.client.uploader.FileTransformer;
import io.getstream.chat.android.client.uploader.FileUploader;
import io.getstream.chat.android.client.utils.ProgressCallback;
import io.getstream.chat.android.models.AppSettings;
import io.getstream.chat.android.models.Attachment;
import io.getstream.chat.android.models.BannedUsersSort;
import io.getstream.chat.android.models.Channel;
import io.getstream.chat.android.models.ChannelInfo;
import io.getstream.chat.android.models.CreatePollParams;
import io.getstream.chat.android.models.Device;
import io.getstream.chat.android.models.DraftMessage;
import io.getstream.chat.android.models.DraftsSort;
import io.getstream.chat.android.models.FilterObject;
import io.getstream.chat.android.models.Flag;
import io.getstream.chat.android.models.GuestUser;
import io.getstream.chat.android.models.Location;
import io.getstream.chat.android.models.Member;
import io.getstream.chat.android.models.MemberData;
import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.models.MessageReminder;
import io.getstream.chat.android.models.Mute;
import io.getstream.chat.android.models.PendingMessage;
import io.getstream.chat.android.models.Poll;
import io.getstream.chat.android.models.PollOption;
import io.getstream.chat.android.models.PushPreference;
import io.getstream.chat.android.models.PushPreferenceLevel;
import io.getstream.chat.android.models.QueryDraftsResult;
import io.getstream.chat.android.models.QueryPollVotesResult;
import io.getstream.chat.android.models.QueryPollsResult;
import io.getstream.chat.android.models.QueryReactionsResult;
import io.getstream.chat.android.models.QueryRemindersResult;
import io.getstream.chat.android.models.QueryThreadsResult;
import io.getstream.chat.android.models.Reaction;
import io.getstream.chat.android.models.SearchMessagesResult;
import io.getstream.chat.android.models.Thread;
import io.getstream.chat.android.models.ThreadInfo;
import io.getstream.chat.android.models.UnreadCounts;
import io.getstream.chat.android.models.UploadedFile;
import io.getstream.chat.android.models.User;
import io.getstream.chat.android.models.UserBlock;
import io.getstream.chat.android.models.Vote;
import io.getstream.chat.android.models.VotingVisibility;
import io.getstream.chat.android.models.querysort.QuerySorter;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import l83.C23454a0;
import l83.C23465k;
import l83.InterfaceC23462h;
import m83.AbstractC25247g0;
import m83.AbstractC25267u;
import m83.C25271y;
import m83.C25272z;
import n23.AbstractC26202e;
import n23.AbstractC26205h;
import n23.C26198a;
import n23.C26203f;
import n23.C26204g;
import o23.AbstractC27476f;
import o23.C27478h;
import o23.C27485o;
import o23.InterfaceC27474d;
import p007a6.C0438l0;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p505ts.AbstractC34132o;
import p555vl.AbstractC36095b;
import p708hb2.C17095c;
import p708hb2.C17098f;
import p710im1.C18656a0;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22672i;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import wb3.AbstractC37056f;
import yb3.AbstractC39414r;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\u009a\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B¯\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010%\u001a\u00020$\u0012\u0006\u0010'\u001a\u00020&\u0012\u0006\u0010)\u001a\u00020(\u0012\u0006\u0010+\u001a\u00020*¢\u0006\u0004\b,\u0010-J\u001f\u00102\u001a\u0002012\u0006\u0010/\u001a\u00020.2\u0006\u00100\u001a\u00020.H\u0016¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u000201H\u0016¢\u0006\u0004\b4\u00105J\u0015\u00108\u001a\b\u0012\u0004\u0012\u00020706H\u0016¢\u0006\u0004\b8\u00109J-\u0010>\u001a\b\u0012\u0004\u0012\u00020<062\u0006\u0010:\u001a\u00020.2\u0006\u0010;\u001a\u00020.2\u0006\u0010=\u001a\u00020<H\u0016¢\u0006\u0004\b>\u0010?J-\u0010A\u001a\b\u0012\u0004\u0012\u00020@062\u0006\u0010:\u001a\u00020.2\u0006\u0010;\u001a\u00020.2\u0006\u0010=\u001a\u00020@H\u0016¢\u0006\u0004\bA\u0010BJ-\u0010C\u001a\b\u0012\u0004\u0012\u000201062\u0006\u0010:\u001a\u00020.2\u0006\u0010;\u001a\u00020.2\u0006\u0010=\u001a\u00020@H\u0016¢\u0006\u0004\bC\u0010BJ/\u0010H\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020@0G062\b\u0010E\u001a\u0004\u0018\u00010D2\b\u0010F\u001a\u0004\u0018\u00010DH\u0016¢\u0006\u0004\bH\u0010IJ?\u0010Q\u001a\b\u0012\u0004\u0012\u00020P062\u0006\u0010K\u001a\u00020J2\b\u0010F\u001a\u0004\u0018\u00010D2\b\u0010L\u001a\u0004\u0018\u00010.2\f\u0010O\u001a\b\u0012\u0004\u0012\u00020N0MH\u0016¢\u0006\u0004\bQ\u0010RJ\u001d\u0010S\u001a\b\u0012\u0004\u0012\u00020<062\u0006\u0010=\u001a\u00020<H\u0016¢\u0006\u0004\bS\u0010TJG\u0010\\\u001a\b\u0012\u0004\u0012\u00020<062\u0006\u0010U\u001a\u00020.2\u0012\u0010X\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020W0V2\f\u0010Y\u001a\b\u0012\u0004\u0012\u00020.0G2\u0006\u0010[\u001a\u00020ZH\u0016¢\u0006\u0004\b\\\u0010]J\u001d\u0010^\u001a\b\u0012\u0004\u0012\u00020<062\u0006\u0010U\u001a\u00020.H\u0016¢\u0006\u0004\b^\u0010_J\u001d\u0010a\u001a\b\u0012\u0004\u0012\u00020`062\u0006\u0010U\u001a\u00020.H\u0016¢\u0006\u0004\ba\u0010_J-\u0010d\u001a\b\u0012\u0004\u0012\u00020<062\u0006\u0010U\u001a\u00020.2\u0006\u0010b\u001a\u00020Z2\u0006\u0010c\u001a\u00020ZH\u0016¢\u0006\u0004\bd\u0010eJ3\u0010g\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020f0G062\u0006\u0010U\u001a\u00020.2\u0006\u0010E\u001a\u00020D2\u0006\u0010F\u001a\u00020DH\u0016¢\u0006\u0004\bg\u0010hJK\u0010j\u001a\b\u0012\u0004\u0012\u00020i062\u0006\u0010U\u001a\u00020.2\b\u0010K\u001a\u0004\u0018\u00010J2\b\u0010F\u001a\u0004\u0018\u00010D2\b\u0010L\u001a\u0004\u0018\u00010.2\u000e\u0010O\u001a\n\u0012\u0004\u0012\u00020f\u0018\u00010MH\u0016¢\u0006\u0004\bj\u0010kJ-\u0010o\u001a\b\u0012\u0004\u0012\u00020f062\u0006\u0010l\u001a\u00020f2\u0006\u0010m\u001a\u00020Z2\u0006\u0010n\u001a\u00020ZH\u0016¢\u0006\u0004\bo\u0010pJ%\u0010r\u001a\b\u0012\u0004\u0012\u00020<062\u0006\u0010U\u001a\u00020.2\u0006\u0010q\u001a\u00020.H\u0016¢\u0006\u0004\br\u0010sJ\u001d\u0010v\u001a\b\u0012\u0004\u0012\u000201062\u0006\u0010u\u001a\u00020tH\u0016¢\u0006\u0004\bv\u0010wJ\u001d\u0010y\u001a\b\u0012\u0004\u0012\u000201062\u0006\u0010x\u001a\u00020.H\u0016¢\u0006\u0004\by\u0010_J\u001b\u0010z\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020t0G06H\u0016¢\u0006\u0004\bz\u00109J\u001d\u0010~\u001a\b\u0012\u0004\u0012\u00020}062\u0006\u0010|\u001a\u00020{H\u0016¢\u0006\u0004\b~\u0010\u007fJ\"\u0010\u0082\u0001\u001a\b\u0012\u0004\u0012\u00020}062\b\u0010\u0081\u0001\u001a\u00030\u0080\u0001H\u0016¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J)\u0010\u0085\u0001\u001a\b\u0012\u0004\u0012\u00020}062\u0007\u0010\u0084\u0001\u001a\u00020.2\u0006\u0010|\u001a\u00020{H\u0016¢\u0006\u0006\b\u0085\u0001\u0010\u0086\u0001J+\u0010\u0087\u0001\u001a\b\u0012\u0004\u0012\u00020}062\u0007\u0010\u0084\u0001\u001a\u00020.2\b\u0010\u0081\u0001\u001a\u00030\u0080\u0001H\u0016¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001J\u0018\u0010\u008a\u0001\u001a\t\u0012\u0005\u0012\u00030\u0089\u000106H\u0016¢\u0006\u0005\b\u008a\u0001\u00109J\u0017\u0010\u008b\u0001\u001a\b\u0012\u0004\u0012\u00020106H\u0016¢\u0006\u0005\b\u008b\u0001\u00109J,\u0010\u008d\u0001\u001a\t\u0012\u0005\u0012\u00030\u0089\u0001062\u0006\u0010/\u001a\u00020.2\t\u0010\u008c\u0001\u001a\u0004\u0018\u00010DH\u0016¢\u0006\u0006\b\u008d\u0001\u0010\u008e\u0001J\u001f\u0010\u008f\u0001\u001a\b\u0012\u0004\u0012\u000201062\u0006\u0010/\u001a\u00020.H\u0016¢\u0006\u0005\b\u008f\u0001\u0010_J3\u0010\u0091\u0001\u001a\b\u0012\u0004\u0012\u000201062\u0006\u0010:\u001a\u00020.2\u0006\u0010;\u001a\u00020.2\t\u0010\u0090\u0001\u001a\u0004\u0018\u00010DH\u0016¢\u0006\u0006\b\u0091\u0001\u0010\u0092\u0001J'\u0010\u0093\u0001\u001a\b\u0012\u0004\u0012\u000201062\u0006\u0010:\u001a\u00020.2\u0006\u0010;\u001a\u00020.H\u0016¢\u0006\u0005\b\u0093\u0001\u0010sJ?\u0010\u0099\u0001\u001a\t\u0012\u0005\u0012\u00030\u0098\u0001062\u0006\u0010:\u001a\u00020.2\u0006\u0010;\u001a\u00020.2\b\u0010\u0095\u0001\u001a\u00030\u0094\u00012\n\u0010\u0097\u0001\u001a\u0005\u0018\u00010\u0096\u0001H\u0016¢\u0006\u0006\b\u0099\u0001\u0010\u009a\u0001J?\u0010\u009b\u0001\u001a\t\u0012\u0005\u0012\u00030\u0098\u0001062\u0006\u0010:\u001a\u00020.2\u0006\u0010;\u001a\u00020.2\b\u0010\u0095\u0001\u001a\u00030\u0094\u00012\n\u0010\u0097\u0001\u001a\u0005\u0018\u00010\u0096\u0001H\u0016¢\u0006\u0006\b\u009b\u0001\u0010\u009a\u0001J1\u0010\u009d\u0001\u001a\b\u0012\u0004\u0012\u000201062\u0006\u0010:\u001a\u00020.2\u0006\u0010;\u001a\u00020.2\u0007\u0010\u009c\u0001\u001a\u00020.H\u0016¢\u0006\u0006\b\u009d\u0001\u0010\u009e\u0001J1\u0010\u009f\u0001\u001a\b\u0012\u0004\u0012\u000201062\u0006\u0010:\u001a\u00020.2\u0006\u0010;\u001a\u00020.2\u0007\u0010\u009c\u0001\u001a\u00020.H\u0016¢\u0006\u0006\b\u009f\u0001\u0010\u009e\u0001J/\u0010¡\u0001\u001a\t\u0012\u0005\u0012\u00030\u0098\u0001062\b\u0010\u0095\u0001\u001a\u00030\u0094\u00012\n\u0010 \u0001\u001a\u0005\u0018\u00010\u0096\u0001H\u0016¢\u0006\u0006\b¡\u0001\u0010¢\u0001J \u0010\u009d\u0001\u001a\b\u0012\u0004\u0012\u000201062\u0007\u0010\u009c\u0001\u001a\u00020.H\u0016¢\u0006\u0005\b\u009d\u0001\u0010_J/\u0010£\u0001\u001a\t\u0012\u0005\u0012\u00030\u0098\u0001062\b\u0010\u0095\u0001\u001a\u00030\u0094\u00012\n\u0010 \u0001\u001a\u0005\u0018\u00010\u0096\u0001H\u0016¢\u0006\u0006\b£\u0001\u0010¢\u0001J \u0010\u009f\u0001\u001a\b\u0012\u0004\u0012\u000201062\u0007\u0010\u009c\u0001\u001a\u00020.H\u0016¢\u0006\u0005\b\u009f\u0001\u0010_JA\u0010§\u0001\u001a\t\u0012\u0005\u0012\u00030¦\u0001062\u0006\u0010/\u001a\u00020.2\t\u0010¤\u0001\u001a\u0004\u0018\u00010.2\u0013\u0010¥\u0001\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020.0VH\u0016¢\u0006\u0006\b§\u0001\u0010¨\u0001J \u0010©\u0001\u001a\t\u0012\u0005\u0012\u00030¦\u0001062\u0006\u0010/\u001a\u00020.H\u0016¢\u0006\u0005\b©\u0001\u0010_JA\u0010ª\u0001\u001a\t\u0012\u0005\u0012\u00030¦\u0001062\u0006\u0010U\u001a\u00020.2\t\u0010¤\u0001\u001a\u0004\u0018\u00010.2\u0013\u0010¥\u0001\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020.0VH\u0016¢\u0006\u0006\bª\u0001\u0010¨\u0001J \u0010«\u0001\u001a\t\u0012\u0005\u0012\u00030¦\u0001062\u0006\u0010U\u001a\u00020.H\u0016¢\u0006\u0005\b«\u0001\u0010_JP\u0010®\u0001\u001a\b\u0012\u0004\u0012\u000201062\u0007\u0010¬\u0001\u001a\u00020.2\t\u0010\u008c\u0001\u001a\u0004\u0018\u00010D2\t\u0010¤\u0001\u001a\u0004\u0018\u00010.2\u0006\u0010:\u001a\u00020.2\u0006\u0010;\u001a\u00020.2\u0007\u0010\u00ad\u0001\u001a\u00020ZH\u0016¢\u0006\u0006\b®\u0001\u0010¯\u0001J:\u0010°\u0001\u001a\b\u0012\u0004\u0012\u000201062\u0007\u0010¬\u0001\u001a\u00020.2\u0006\u0010:\u001a\u00020.2\u0006\u0010;\u001a\u00020.2\u0007\u0010\u00ad\u0001\u001a\u00020ZH\u0016¢\u0006\u0006\b°\u0001\u0010±\u0001Jz\u0010¸\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030·\u00010G062\u0006\u0010K\u001a\u00020J2\r\u0010O\u001a\t\u0012\u0005\u0012\u00030²\u00010M2\b\u0010E\u001a\u0004\u0018\u00010D2\b\u0010F\u001a\u0004\u0018\u00010D2\n\u0010³\u0001\u001a\u0005\u0018\u00010\u0080\u00012\n\u0010´\u0001\u001a\u0005\u0018\u00010\u0080\u00012\n\u0010µ\u0001\u001a\u0005\u0018\u00010\u0080\u00012\n\u0010¶\u0001\u001a\u0005\u0018\u00010\u0080\u0001H\u0016¢\u0006\u0006\b¸\u0001\u0010¹\u0001J2\u0010¼\u0001\u001a\t\u0012\u0005\u0012\u00030»\u0001062\u0006\u0010:\u001a\u00020.2\u0006\u0010;\u001a\u00020.2\u0007\u0010º\u0001\u001a\u00020DH\u0016¢\u0006\u0006\b¼\u0001\u0010½\u0001J(\u0010¾\u0001\u001a\t\u0012\u0005\u0012\u00030»\u0001062\u0006\u0010:\u001a\u00020.2\u0006\u0010;\u001a\u00020.H\u0016¢\u0006\u0005\b¾\u0001\u0010sJ'\u0010¿\u0001\u001a\b\u0012\u0004\u0012\u000201062\u0006\u0010:\u001a\u00020.2\u0006\u0010;\u001a\u00020.H\u0016¢\u0006\u0005\b¿\u0001\u0010sJN\u0010Â\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020<0G062\u0006\u0010:\u001a\u00020.2\u0006\u0010;\u001a\u00020.2\u0006\u0010F\u001a\u00020D2\f\u0010O\u001a\b\u0012\u0004\u0012\u00020<0M2\b\u0010Á\u0001\u001a\u00030À\u0001H\u0016¢\u0006\u0006\bÂ\u0001\u0010Ã\u0001JH\u0010Å\u0001\u001a\t\u0012\u0005\u0012\u00030»\u0001062\u0006\u0010:\u001a\u00020.2\u0006\u0010;\u001a\u00020.2\u0013\u0010Ä\u0001\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020W0V2\b\u0010S\u001a\u0004\u0018\u00010<H\u0016¢\u0006\u0006\bÅ\u0001\u0010Æ\u0001JK\u0010Ç\u0001\u001a\t\u0012\u0005\u0012\u00030»\u0001062\u0006\u0010:\u001a\u00020.2\u0006\u0010;\u001a\u00020.2\u0012\u0010X\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020W0V2\f\u0010Y\u001a\b\u0012\u0004\u0012\u00020.0GH\u0016¢\u0006\u0006\bÇ\u0001\u0010È\u0001J'\u0010É\u0001\u001a\b\u0012\u0004\u0012\u000201062\u0006\u0010:\u001a\u00020.2\u0006\u0010;\u001a\u00020.H\u0016¢\u0006\u0005\bÉ\u0001\u0010sJ1\u0010Ë\u0001\u001a\b\u0012\u0004\u0012\u000201062\u0006\u0010:\u001a\u00020.2\u0006\u0010;\u001a\u00020.2\u0007\u0010Ê\u0001\u001a\u00020ZH\u0016¢\u0006\u0006\bË\u0001\u0010Ì\u0001J3\u0010Î\u0001\u001a\t\u0012\u0005\u0012\u00030»\u0001062\u0006\u0010:\u001a\u00020.2\u0006\u0010;\u001a\u00020.2\t\u0010Í\u0001\u001a\u0004\u0018\u00010<H\u0016¢\u0006\u0005\bÎ\u0001\u0010?J(\u0010Ï\u0001\u001a\t\u0012\u0005\u0012\u00030»\u0001062\u0006\u0010:\u001a\u00020.2\u0006\u0010;\u001a\u00020.H\u0016¢\u0006\u0005\bÏ\u0001\u0010sJ3\u0010Ð\u0001\u001a\t\u0012\u0005\u0012\u00030»\u0001062\u0006\u0010:\u001a\u00020.2\u0006\u0010;\u001a\u00020.2\b\u0010=\u001a\u0004\u0018\u00010.H\u0016¢\u0006\u0006\bÐ\u0001\u0010\u009e\u0001J(\u0010Ñ\u0001\u001a\t\u0012\u0005\u0012\u00030»\u0001062\u0006\u0010:\u001a\u00020.2\u0006\u0010;\u001a\u00020.H\u0016¢\u0006\u0005\bÑ\u0001\u0010sJ\u0018\u0010Ó\u0001\u001a\t\u0012\u0005\u0012\u00030Ò\u000106H\u0016¢\u0006\u0005\bÓ\u0001\u00109J0\u0010Ô\u0001\u001a\b\u0012\u0004\u0012\u000201062\u0006\u0010:\u001a\u00020.2\u0006\u0010;\u001a\u00020.2\u0006\u0010U\u001a\u00020.H\u0016¢\u0006\u0006\bÔ\u0001\u0010\u009e\u0001J'\u0010Ö\u0001\u001a\b\u0012\u0004\u0012\u000201062\r\u0010Õ\u0001\u001a\b\u0012\u0004\u0012\u00020<0GH\u0016¢\u0006\u0006\bÖ\u0001\u0010×\u0001J1\u0010Ù\u0001\u001a\b\u0012\u0004\u0012\u000201062\u0006\u0010:\u001a\u00020.2\u0006\u0010;\u001a\u00020.2\u0007\u0010Ø\u0001\u001a\u00020.H\u0016¢\u0006\u0006\bÙ\u0001\u0010\u009e\u0001JI\u0010Û\u0001\u001a\b\u0012\u0004\u0012\u000201062\u0006\u0010:\u001a\u00020.2\u0006\u0010;\u001a\u00020.2\b\u0010U\u001a\u0004\u0018\u00010.2\n\u0010Ú\u0001\u001a\u0005\u0018\u00010\u0080\u00012\t\u0010Ø\u0001\u001a\u0004\u0018\u00010.H\u0016¢\u0006\u0006\bÛ\u0001\u0010Ü\u0001J\u0017\u0010Ý\u0001\u001a\b\u0012\u0004\u0012\u00020106H\u0016¢\u0006\u0005\bÝ\u0001\u00109Je\u0010â\u0001\u001a\t\u0012\u0005\u0012\u00030»\u0001062\u0006\u0010:\u001a\u00020.2\u0006\u0010;\u001a\u00020.2\u000e\u0010ß\u0001\u001a\t\u0012\u0005\u0012\u00030Þ\u00010G2\t\u0010Í\u0001\u001a\u0004\u0018\u00010<2\t\u0010à\u0001\u001a\u0004\u0018\u00010Z2\n\u0010á\u0001\u001a\u0005\u0018\u00010\u0080\u00012\b\u0010n\u001a\u0004\u0018\u00010ZH\u0016¢\u0006\u0006\bâ\u0001\u0010ã\u0001JM\u0010ä\u0001\u001a\t\u0012\u0005\u0012\u00030»\u0001062\u0006\u0010:\u001a\u00020.2\u0006\u0010;\u001a\u00020.2\r\u0010ß\u0001\u001a\b\u0012\u0004\u0012\u00020.0G2\t\u0010Í\u0001\u001a\u0004\u0018\u00010<2\b\u0010n\u001a\u0004\u0018\u00010ZH\u0016¢\u0006\u0006\bä\u0001\u0010å\u0001JM\u0010æ\u0001\u001a\t\u0012\u0005\u0012\u00030»\u0001062\u0006\u0010:\u001a\u00020.2\u0006\u0010;\u001a\u00020.2\r\u0010ß\u0001\u001a\b\u0012\u0004\u0012\u00020.0G2\t\u0010Í\u0001\u001a\u0004\u0018\u00010<2\b\u0010n\u001a\u0004\u0018\u00010ZH\u0016¢\u0006\u0006\bæ\u0001\u0010å\u0001JS\u0010è\u0001\u001a\t\u0012\u0005\u0012\u00030ç\u0001062\u0006\u0010:\u001a\u00020.2\u0006\u0010;\u001a\u00020.2\u0006\u0010/\u001a\u00020.2\u0012\u0010X\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020W0V2\f\u0010Y\u001a\b\u0012\u0004\u0012\u00020.0GH\u0016¢\u0006\u0006\bè\u0001\u0010é\u0001J:\u0010ì\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020<0G062\u0007\u0010ê\u0001\u001a\u00020.2\u0006\u0010F\u001a\u00020D2\t\u0010ë\u0001\u001a\u0004\u0018\u00010.H\u0016¢\u0006\u0006\bì\u0001\u0010í\u0001J.\u0010î\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020<0G062\u0006\u0010U\u001a\u00020.2\u0006\u0010F\u001a\u00020DH\u0016¢\u0006\u0006\bî\u0001\u0010ï\u0001J7\u0010ñ\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020<0G062\u0006\u0010U\u001a\u00020.2\u0007\u0010ð\u0001\u001a\u00020.2\u0006\u0010F\u001a\u00020DH\u0016¢\u0006\u0006\bñ\u0001\u0010½\u0001J\"\u0010ô\u0001\u001a\b\u0012\u0004\u0012\u00020<062\b\u0010ó\u0001\u001a\u00030ò\u0001H\u0016¢\u0006\u0006\bô\u0001\u0010õ\u0001J/\u0010ø\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030ö\u00010G062\u000e\u0010÷\u0001\u001a\t\u0012\u0005\u0012\u00030ö\u00010GH\u0016¢\u0006\u0006\bø\u0001\u0010×\u0001J \u0010ú\u0001\u001a\t\u0012\u0005\u0012\u00030ù\u0001062\u0006\u0010/\u001a\u00020.H\u0016¢\u0006\u0005\bú\u0001\u0010_J\u001e\u0010û\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030ù\u00010G06H\u0016¢\u0006\u0005\bû\u0001\u00109J\u001f\u0010ü\u0001\u001a\b\u0012\u0004\u0012\u000201062\u0006\u0010/\u001a\u00020.H\u0016¢\u0006\u0005\bü\u0001\u0010_JI\u0010ý\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030ö\u00010G062\u0006\u0010x\u001a\u00020.2\u0012\u0010X\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020W0V2\f\u0010Y\u001a\b\u0012\u0004\u0012\u00020.0GH\u0016¢\u0006\u0006\bý\u0001\u0010þ\u0001J)\u0010\u0081\u0002\u001a\t\u0012\u0005\u0012\u00030\u0080\u0002062\u0006\u0010/\u001a\u00020.2\u0007\u0010ÿ\u0001\u001a\u00020.H\u0016¢\u0006\u0005\b\u0081\u0002\u0010sJ(\u0010\u0083\u0002\u001a\b\u0012\u0004\u0012\u00020<062\u0006\u0010U\u001a\u00020.2\u0007\u0010\u0082\u0002\u001a\u00020.H\u0016¢\u0006\u0005\b\u0083\u0002\u0010sJ!\u0010\u0085\u0002\u001a\t\u0012\u0005\u0012\u00030\u0084\u0002062\u0007\u0010\u009c\u0001\u001a\u00020.H\u0016¢\u0006\u0005\b\u0085\u0002\u0010_JY\u0010\u0089\u0002\u001a\t\u0012\u0005\u0012\u00030\u0088\u0002062\u0007\u0010\u0086\u0002\u001a\u00020J2\u0007\u0010\u0087\u0002\u001a\u00020J2\b\u0010E\u001a\u0004\u0018\u00010D2\b\u0010F\u001a\u0004\u0018\u00010D2\b\u0010L\u001a\u0004\u0018\u00010.2\u000e\u0010O\u001a\n\u0012\u0004\u0012\u00020<\u0018\u00010MH\u0016¢\u0006\u0006\b\u0089\u0002\u0010\u008a\u0002J#\u0010\u008e\u0002\u001a\t\u0012\u0005\u0012\u00030\u008d\u0002062\b\u0010\u008c\u0002\u001a\u00030\u008b\u0002H\u0016¢\u0006\u0006\b\u008e\u0002\u0010\u008f\u0002J3\u0010\u0091\u0002\u001a\t\u0012\u0005\u0012\u00030»\u0001062\u0006\u0010:\u001a\u00020.2\u0006\u0010;\u001a\u00020.2\b\u0010\u008c\u0002\u001a\u00030\u0090\u0002H\u0016¢\u0006\u0006\b\u0091\u0002\u0010\u0092\u0002J)\u0010\u0094\u0002\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030ö\u00010G062\b\u0010\u0094\u0002\u001a\u00030\u0093\u0002H\u0016¢\u0006\u0006\b\u0094\u0002\u0010\u0095\u0002Jf\u0010\u0096\u0002\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030ç\u00010G062\u0006\u0010:\u001a\u00020.2\u0006\u0010;\u001a\u00020.2\u0006\u0010E\u001a\u00020D2\u0006\u0010F\u001a\u00020D2\u0006\u0010K\u001a\u00020J2\r\u0010O\u001a\t\u0012\u0005\u0012\u00030ç\u00010M2\u000e\u0010ß\u0001\u001a\t\u0012\u0005\u0012\u00030ç\u00010GH\u0016¢\u0006\u0006\b\u0096\u0002\u0010\u0097\u0002JG\u0010\u009a\u0002\u001a\t\u0012\u0005\u0012\u00030\u0099\u0002062\u0007\u0010\u0098\u0002\u001a\u00020.2\u0006\u0010:\u001a\u00020.2\u0006\u0010;\u001a\u00020.2\u0013\u0010Ä\u0001\u001a\u000e\u0012\u0004\u0012\u00020W\u0012\u0004\u0012\u00020W0VH\u0016¢\u0006\u0006\b\u009a\u0002\u0010\u009b\u0002J7\u0010\u009e\u0002\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u0099\u00020G062\r\u0010\u009c\u0002\u001a\b\u0012\u0004\u0012\u00020.0G2\u0007\u0010\u009d\u0002\u001a\u00020.H\u0016¢\u0006\u0006\b\u009e\u0002\u0010\u009f\u0002J!\u0010¢\u0002\u001a\t\u0012\u0005\u0012\u00030¡\u0002062\u0007\u0010 \u0002\u001a\u00020.H\u0016¢\u0006\u0005\b¢\u0002\u0010_J#\u0010¥\u0002\u001a\t\u0012\u0005\u0012\u00030¤\u0002062\b\u0010\u008c\u0002\u001a\u00030£\u0002H\u0016¢\u0006\u0006\b¥\u0002\u0010¦\u0002J+\u0010ª\u0002\u001a\t\u0012\u0005\u0012\u00030©\u0002062\u0006\u0010U\u001a\u00020.2\b\u0010¨\u0002\u001a\u00030§\u0002H\u0016¢\u0006\u0006\bª\u0002\u0010«\u0002JC\u0010\u00ad\u0002\u001a\t\u0012\u0005\u0012\u00030¬\u0002062\u0006\u0010U\u001a\u00020.2\u0012\u0010X\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020W0V2\f\u0010Y\u001a\b\u0012\u0004\u0012\u00020.0GH\u0016¢\u0006\u0006\b\u00ad\u0002\u0010þ\u0001J3\u0010±\u0002\u001a\t\u0012\u0005\u0012\u00030°\u0002062\u0006\u0010U\u001a\u00020.2\u0007\u0010®\u0002\u001a\u00020.2\u0007\u0010¯\u0002\u001a\u00020.H\u0016¢\u0006\u0006\b±\u0002\u0010\u009e\u0001J3\u0010³\u0002\u001a\t\u0012\u0005\u0012\u00030°\u0002062\u0006\u0010U\u001a\u00020.2\u0007\u0010®\u0002\u001a\u00020.2\u0007\u0010²\u0002\u001a\u00020.H\u0016¢\u0006\u0006\b³\u0002\u0010\u009e\u0001J3\u0010µ\u0002\u001a\t\u0012\u0005\u0012\u00030°\u0002062\u0006\u0010U\u001a\u00020.2\u0007\u0010®\u0002\u001a\u00020.2\u0007\u0010´\u0002\u001a\u00020.H\u0016¢\u0006\u0006\bµ\u0002\u0010\u009e\u0001JD\u0010·\u0002\u001a\t\u0012\u0005\u0012\u00030¶\u0002062\u0007\u0010®\u0002\u001a\u00020.2\u0012\u0010X\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020W0V2\f\u0010Y\u001a\b\u0012\u0004\u0012\u00020.0GH\u0016¢\u0006\u0006\b·\u0002\u0010þ\u0001J!\u0010¸\u0002\u001a\t\u0012\u0005\u0012\u00030¶\u0002062\u0007\u0010®\u0002\u001a\u00020.H\u0016¢\u0006\u0005\b¸\u0002\u0010_J,\u0010»\u0002\u001a\t\u0012\u0005\u0012\u00030¹\u0002062\u0007\u0010®\u0002\u001a\u00020.2\b\u0010º\u0002\u001a\u00030¹\u0002H\u0016¢\u0006\u0006\b»\u0002\u0010¼\u0002J,\u0010½\u0002\u001a\t\u0012\u0005\u0012\u00030¹\u0002062\u0007\u0010®\u0002\u001a\u00020.2\b\u0010º\u0002\u001a\u00030¹\u0002H\u0016¢\u0006\u0006\b½\u0002\u0010¼\u0002J)\u0010¾\u0002\u001a\b\u0012\u0004\u0012\u000201062\u0007\u0010®\u0002\u001a\u00020.2\u0007\u0010¯\u0002\u001a\u00020.H\u0016¢\u0006\u0005\b¾\u0002\u0010sJP\u0010À\u0002\u001a\t\u0012\u0005\u0012\u00030¿\u0002062\u0007\u0010®\u0002\u001a\u00020.2\b\u0010K\u001a\u0004\u0018\u00010J2\b\u0010F\u001a\u0004\u0018\u00010D2\b\u0010L\u001a\u0004\u0018\u00010.2\u000f\u0010O\u001a\u000b\u0012\u0005\u0012\u00030°\u0002\u0018\u00010MH\u0016¢\u0006\u0005\bÀ\u0002\u0010kJG\u0010Â\u0002\u001a\t\u0012\u0005\u0012\u00030Á\u0002062\b\u0010K\u001a\u0004\u0018\u00010J2\b\u0010F\u001a\u0004\u0018\u00010D2\b\u0010L\u001a\u0004\u0018\u00010.2\u000f\u0010O\u001a\u000b\u0012\u0005\u0012\u00030¶\u0002\u0018\u00010MH\u0016¢\u0006\u0005\bÂ\u0002\u0010RJ#\u0010Å\u0002\u001a\t\u0012\u0005\u0012\u00030¶\u0002062\b\u0010Ä\u0002\u001a\u00030Ã\u0002H\u0016¢\u0006\u0006\bÅ\u0002\u0010Æ\u0002J#\u0010È\u0002\u001a\t\u0012\u0005\u0012\u00030¶\u0002062\b\u0010ó\u0001\u001a\u00030Ç\u0002H\u0016¢\u0006\u0006\bÈ\u0002\u0010É\u0002J!\u0010Ê\u0002\u001a\t\u0012\u0005\u0012\u00030¶\u0002062\u0007\u0010®\u0002\u001a\u00020.H\u0016¢\u0006\u0005\bÊ\u0002\u0010_J \u0010Ë\u0002\u001a\b\u0012\u0004\u0012\u000201062\u0007\u0010®\u0002\u001a\u00020.H\u0016¢\u0006\u0005\bË\u0002\u0010_J-\u0010Î\u0002\u001a\t\u0012\u0005\u0012\u00030Í\u0002062\u0006\u0010U\u001a\u00020.2\n\u0010Ì\u0002\u001a\u0005\u0018\u00010\u0080\u0001H\u0016¢\u0006\u0006\bÎ\u0002\u0010\u0088\u0001J-\u0010Ï\u0002\u001a\t\u0012\u0005\u0012\u00030Í\u0002062\u0006\u0010U\u001a\u00020.2\n\u0010Ì\u0002\u001a\u0005\u0018\u00010\u0080\u0001H\u0016¢\u0006\u0006\bÏ\u0002\u0010\u0088\u0001J\u001f\u0010Ð\u0002\u001a\b\u0012\u0004\u0012\u000201062\u0006\u0010U\u001a\u00020.H\u0016¢\u0006\u0005\bÐ\u0002\u0010_JB\u0010Ò\u0002\u001a\t\u0012\u0005\u0012\u00030Ñ\u0002062\u0006\u0010K\u001a\u00020J2\u0006\u0010F\u001a\u00020D2\b\u0010L\u001a\u0004\u0018\u00010.2\r\u0010O\u001a\t\u0012\u0005\u0012\u00030Í\u00020MH\u0016¢\u0006\u0006\bÒ\u0002\u0010Ó\u0002J\u001e\u0010Õ\u0002\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030Ô\u00020G06H\u0016¢\u0006\u0005\bÕ\u0002\u00109J#\u0010×\u0002\u001a\t\u0012\u0005\u0012\u00030Ô\u0002062\b\u0010Ö\u0002\u001a\u00030Ô\u0002H\u0016¢\u0006\u0006\b×\u0002\u0010Ø\u0002J#\u0010Ù\u0002\u001a\t\u0012\u0005\u0012\u00030Ô\u0002062\b\u0010Ö\u0002\u001a\u00030Ô\u0002H\u0016¢\u0006\u0006\bÙ\u0002\u0010Ø\u0002J\u0011\u0010Ú\u0002\u001a\u000201H\u0016¢\u0006\u0005\bÚ\u0002\u00105J.\u0010Û\u0002\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020W0V*\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020W0VH\u0002¢\u0006\u0006\bÛ\u0002\u0010Ü\u0002J#\u0010ß\u0002\u001a\t\u0012\u0005\u0012\u00030¦\u0001062\b\u0010Þ\u0002\u001a\u00030Ý\u0002H\u0002¢\u0006\u0006\bß\u0002\u0010à\u0002J.\u0010á\u0002\u001a\t\u0012\u0005\u0012\u00030¦\u0001062\u0013\u0010Þ\u0002\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020.0VH\u0002¢\u0006\u0006\bá\u0002\u0010â\u0002J2\u0010ã\u0002\u001a\t\u0012\u0005\u0012\u00030»\u0001062\u0006\u0010:\u001a\u00020.2\u0006\u0010;\u001a\u00020.2\u0007\u0010º\u0001\u001a\u00020DH\u0002¢\u0006\u0006\bã\u0002\u0010½\u0001J\u001d\u0010æ\u0002\u001a\u00030»\u00012\b\u0010å\u0002\u001a\u00030ä\u0002H\u0002¢\u0006\u0006\bæ\u0002\u0010ç\u0002J4\u0010ê\u0002\u001a\t\u0012\u0005\u0012\u00030°\u0002062\u0006\u0010U\u001a\u00020.2\u0007\u0010®\u0002\u001a\u00020.2\b\u0010é\u0002\u001a\u00030è\u0002H\u0002¢\u0006\u0006\bê\u0002\u0010ë\u0002J9\u0010ï\u0002\u001a\b\u0012\u0004\u0012\u00028\u000006\"\t\b\u0000\u0010ì\u0002*\u00020W2\u0014\u0010î\u0002\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u0000060í\u0002H\u0002¢\u0006\u0006\bï\u0002\u0010ð\u0002JU\u0010õ\u0002\u001a\b\u0012\u0004\u0012\u00028\u000106\"\t\b\u0000\u0010ì\u0002*\u00020W\"\t\b\u0001\u0010ñ\u0002*\u00020W*\t\u0012\u0004\u0012\u00028\u00000ò\u00022\u001a\u0010ô\u0002\u001a\u0015\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010ó\u0002H\u0002¢\u0006\u0006\bõ\u0002\u0010ö\u0002J$\u0010ø\u0002\u001a\b\u0012\u0004\u0012\u00020}06*\n\u0012\u0005\u0012\u00030÷\u00020ò\u0002H\u0002¢\u0006\u0006\bø\u0002\u0010ù\u0002J-\u0010ú\u0002\u001a\b\u0012\u0004\u0012\u00020}06*\n\u0012\u0005\u0012\u00030÷\u00020ò\u00022\u0007\u0010\u0084\u0001\u001a\u00020.H\u0002¢\u0006\u0006\bú\u0002\u0010û\u0002J[\u0010ü\u0002\u001a\b\u0012\u0004\u0012\u00028\u000106\"\t\b\u0000\u0010ì\u0002*\u00020W\"\t\b\u0001\u0010ñ\u0002*\u00020W*\t\u0012\u0004\u0012\u00028\u00000ò\u00022 \u0010ô\u0002\u001a\u001b\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u0001060ó\u0002H\u0002¢\u0006\u0006\bü\u0002\u0010ö\u0002R\u0015\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0003\u0010ý\u0002R\u0015\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0005\u0010þ\u0002R\u0015\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0007\u0010ÿ\u0002R\u0015\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\t\u0010\u0080\u0003R\u0015\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u000b\u0010\u0081\u0003R\u0015\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\r\u0010\u0082\u0003R\u0015\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u000f\u0010\u0083\u0003R\u0015\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0011\u0010\u0084\u0003R\u0015\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0013\u0010\u0085\u0003R\u0015\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0015\u0010\u0086\u0003R\u0015\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0017\u0010\u0087\u0003R\u0015\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0019\u0010\u0088\u0003R\u0015\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001b\u0010\u0089\u0003R\u0015\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001d\u0010\u008a\u0003R\u0015\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001f\u0010\u008b\u0003R\u0015\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b!\u0010\u008c\u0003R\u0015\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b#\u0010\u008d\u0003R\u0015\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b%\u0010\u008e\u0003R\u0015\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b'\u0010\u008f\u0003R\u0015\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b)\u0010\u0090\u0003R\u0015\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b+\u0010\u0091\u0003R!\u0010\u0097\u0003\u001a\u00030\u0092\u00038BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0093\u0003\u0010\u0094\u0003\u001a\u0006\b\u0095\u0003\u0010\u0096\u0003R!\u0010\u009c\u0003\u001a\u00030\u0098\u00038BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0099\u0003\u0010\u0094\u0003\u001a\u0006\b\u009a\u0003\u0010\u009b\u0003R\u001f\u0010/\u001a\u00020.8B@\u0002X\u0082\u000e¢\u0006\u000f\n\u0005\b/\u0010\u009d\u0003\u001a\u0006\b\u009e\u0003\u0010\u009f\u0003R\u001e\u0010¡\u0003\u001a\t\u0012\u0004\u0012\u00020.0 \u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¡\u0003\u0010¢\u0003R\u0016\u00100\u001a\u00020.8BX\u0082\u0004¢\u0006\b\u001a\u0006\b£\u0003\u0010\u009f\u0003¨\u0006¤\u0003"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/MoshiChatApi;", "Lio/getstream/chat/android/client/api/ChatApi;", "Lio/getstream/chat/android/client/api2/mapping/DomainMapping;", "domainMapping", "Lio/getstream/chat/android/client/api2/mapping/EventMapping;", "eventMapping", "Lio/getstream/chat/android/client/api2/mapping/DtoMapping;", "dtoMapping", "Lio/getstream/chat/android/client/uploader/FileUploader;", "fileUploader", "Lio/getstream/chat/android/client/uploader/FileTransformer;", "fileTransformer", "Lio/getstream/chat/android/client/api2/endpoint/UserApi;", "userApi", "Lio/getstream/chat/android/client/api2/endpoint/GuestApi;", "guestApi", "Lio/getstream/chat/android/client/api2/endpoint/MessageApi;", "messageApi", "Lio/getstream/chat/android/client/api2/endpoint/ChannelApi;", "channelApi", "Lio/getstream/chat/android/client/api2/endpoint/DeviceApi;", "deviceApi", "Lio/getstream/chat/android/client/api2/endpoint/ModerationApi;", "moderationApi", "Lio/getstream/chat/android/client/api2/endpoint/GeneralApi;", "generalApi", "Lio/getstream/chat/android/client/api2/endpoint/ConfigApi;", "configApi", "Lio/getstream/chat/android/client/api2/endpoint/FileDownloadApi;", "fileDownloadApi", "Lio/getstream/chat/android/client/api2/endpoint/OpenGraphApi;", "ogApi", "Lio/getstream/chat/android/client/api2/endpoint/ThreadsApi;", "threadsApi", "Lio/getstream/chat/android/client/api2/endpoint/PollsApi;", "pollsApi", "Lio/getstream/chat/android/client/api2/endpoint/RemindersApi;", "remindersApi", "Lio/getstream/chat/android/client/api2/endpoint/PushPreferencesApi;", "pushPreferencesApi", "Lbc3/c0;", "coroutineScope", "Lio/getstream/chat/android/client/scope/UserScope;", "userScope", "<init>", "(Lio/getstream/chat/android/client/api2/mapping/DomainMapping;Lio/getstream/chat/android/client/api2/mapping/EventMapping;Lio/getstream/chat/android/client/api2/mapping/DtoMapping;Lio/getstream/chat/android/client/uploader/FileUploader;Lio/getstream/chat/android/client/uploader/FileTransformer;Lio/getstream/chat/android/client/api2/endpoint/UserApi;Lio/getstream/chat/android/client/api2/endpoint/GuestApi;Lio/getstream/chat/android/client/api2/endpoint/MessageApi;Lio/getstream/chat/android/client/api2/endpoint/ChannelApi;Lio/getstream/chat/android/client/api2/endpoint/DeviceApi;Lio/getstream/chat/android/client/api2/endpoint/ModerationApi;Lio/getstream/chat/android/client/api2/endpoint/GeneralApi;Lio/getstream/chat/android/client/api2/endpoint/ConfigApi;Lio/getstream/chat/android/client/api2/endpoint/FileDownloadApi;Lio/getstream/chat/android/client/api2/endpoint/OpenGraphApi;Lio/getstream/chat/android/client/api2/endpoint/ThreadsApi;Lio/getstream/chat/android/client/api2/endpoint/PollsApi;Lio/getstream/chat/android/client/api2/endpoint/RemindersApi;Lio/getstream/chat/android/client/api2/endpoint/PushPreferencesApi;Lbc3/c0;Lio/getstream/chat/android/client/scope/UserScope;)V", "", "userId", "connectionId", "Ll83/a0;", "setConnection", "(Ljava/lang/String;Ljava/lang/String;)V", "releaseConnection", "()V", "Lo23/d;", "Lio/getstream/chat/android/models/AppSettings;", "appSettings", "()Lo23/d;", "channelType", "channelId", "Lio/getstream/chat/android/models/Message;", "message", "sendMessage", "(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/Message;)Lo23/d;", "Lio/getstream/chat/android/models/DraftMessage;", "createDraftMessage", "(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/DraftMessage;)Lo23/d;", "deleteDraftMessage", "", MapboxMap.QFE_OFFSET, MapboxMap.QFE_LIMIT, "", "queryDraftMessages", "(Ljava/lang/Integer;Ljava/lang/Integer;)Lo23/d;", "Lio/getstream/chat/android/models/FilterObject;", "filter", "next", "Lio/getstream/chat/android/models/querysort/QuerySorter;", "Lio/getstream/chat/android/models/DraftsSort;", "sort", "Lio/getstream/chat/android/models/QueryDraftsResult;", "queryDrafts", "(Lio/getstream/chat/android/models/FilterObject;Ljava/lang/Integer;Ljava/lang/String;Lio/getstream/chat/android/models/querysort/QuerySorter;)Lo23/d;", "updateMessage", "(Lio/getstream/chat/android/models/Message;)Lo23/d;", "messageId", "", "", "set", "unset", "", "skipEnrichUrl", "partialUpdateMessage", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/List;Z)Lo23/d;", "getMessage", "(Ljava/lang/String;)Lo23/d;", "Lio/getstream/chat/android/models/PendingMessage;", "getPendingMessage", "hard", "deleteForMe", "deleteMessage", "(Ljava/lang/String;ZZ)Lo23/d;", "Lio/getstream/chat/android/models/Reaction;", "getReactions", "(Ljava/lang/String;II)Lo23/d;", "Lio/getstream/chat/android/models/QueryReactionsResult;", "queryReactions", "(Ljava/lang/String;Lio/getstream/chat/android/models/FilterObject;Ljava/lang/Integer;Ljava/lang/String;Lio/getstream/chat/android/models/querysort/QuerySorter;)Lo23/d;", "reaction", "enforceUnique", "skipPush", "sendReaction", "(Lio/getstream/chat/android/models/Reaction;ZZ)Lo23/d;", "reactionType", "deleteReaction", "(Ljava/lang/String;Ljava/lang/String;)Lo23/d;", "Lio/getstream/chat/android/models/Device;", "device", "addDevice", "(Lio/getstream/chat/android/models/Device;)Lo23/d;", "id", "deleteDevice", "getDevices", "Lio/getstream/chat/android/models/PushPreferenceLevel;", "level", "Lio/getstream/chat/android/models/PushPreference;", "setUserPushPreference", "(Lio/getstream/chat/android/models/PushPreferenceLevel;)Lo23/d;", "Ljava/util/Date;", "until", "snoozeUserPushNotifications", "(Ljava/util/Date;)Lo23/d;", "cid", "setChannelPushPreference", "(Ljava/lang/String;Lio/getstream/chat/android/models/PushPreferenceLevel;)Lo23/d;", "snoozeChannelPushNotifications", "(Ljava/lang/String;Ljava/util/Date;)Lo23/d;", "Lio/getstream/chat/android/models/Mute;", "muteCurrentUser", "unmuteCurrentUser", "timeout", "muteUser", "(Ljava/lang/String;Ljava/lang/Integer;)Lo23/d;", "unmuteUser", "expiration", "muteChannel", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lo23/d;", "unmuteChannel", "Ljava/io/File;", "file", "Lio/getstream/chat/android/client/utils/ProgressCallback;", "callback", "Lio/getstream/chat/android/models/UploadedFile;", "sendFile", "(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;Lio/getstream/chat/android/client/utils/ProgressCallback;)Lo23/d;", "sendImage", QueryParams.URL, "deleteFile", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lo23/d;", "deleteImage", "progressCallback", "uploadFile", "(Ljava/io/File;Lio/getstream/chat/android/client/utils/ProgressCallback;)Lo23/d;", "uploadImage", "reason", "customData", "Lio/getstream/chat/android/models/Flag;", "flagUser", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lo23/d;", "unflagUser", "flagMessage", "unflagMessage", "targetId", "shadow", "banUser", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lo23/d;", "unbanUser", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lo23/d;", "Lio/getstream/chat/android/models/BannedUsersSort;", "createdAtAfter", "createdAtAfterOrEqual", "createdAtBefore", "createdAtBeforeOrEqual", "Lio/getstream/chat/android/models/BannedUser;", "queryBannedUsers", "(Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;)Lo23/d;", "cooldownTimeInSeconds", "Lio/getstream/chat/android/models/Channel;", "enableSlowMode", "(Ljava/lang/String;Ljava/lang/String;I)Lo23/d;", "disableSlowMode", "stopWatching", "Lio/getstream/chat/android/client/api/models/PinnedMessagesPagination;", "pagination", "getPinnedMessages", "(Ljava/lang/String;Ljava/lang/String;ILio/getstream/chat/android/models/querysort/QuerySorter;Lio/getstream/chat/android/client/api/models/PinnedMessagesPagination;)Lo23/d;", "extraData", "updateChannel", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lio/getstream/chat/android/models/Message;)Lo23/d;", "updateChannelPartial", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/List;)Lo23/d;", "showChannel", "clearHistory", "hideChannel", "(Ljava/lang/String;Ljava/lang/String;Z)Lo23/d;", "systemMessage", "truncateChannel", "rejectInvite", "acceptInvite", "deleteChannel", "Lio/getstream/chat/android/models/UnreadCounts;", "getUnreadCounts", "markRead", "messages", "markDelivered", "(Ljava/util/List;)Lo23/d;", "threadId", "markThreadRead", "messageTimestamp", "markUnread", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;)Lo23/d;", "markAllRead", "Lio/getstream/chat/android/models/MemberData;", QueryChannelRequest.KEY_MEMBERS, "hideHistory", "hideHistoryBefore", "addMembers", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/models/Message;Ljava/lang/Boolean;Ljava/util/Date;Ljava/lang/Boolean;)Lo23/d;", "removeMembers", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/models/Message;Ljava/lang/Boolean;)Lo23/d;", "inviteMembers", "Lio/getstream/chat/android/models/Member;", "partialUpdateMember", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/List;)Lo23/d;", "parentId", "lastId", "getNewerReplies", "(Ljava/lang/String;ILjava/lang/String;)Lo23/d;", "getReplies", "(Ljava/lang/String;I)Lo23/d;", "firstId", "getRepliesMore", "Lio/getstream/chat/android/client/api/models/SendActionRequest;", "request", "sendAction", "(Lio/getstream/chat/android/client/api/models/SendActionRequest;)Lo23/d;", "Lio/getstream/chat/android/models/User;", "users", "updateUsers", "Lio/getstream/chat/android/models/UserBlock;", "blockUser", "queryBlockedUsers", "unblockUser", "partialUpdateUser", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/List;)Lo23/d;", "userName", "Lio/getstream/chat/android/models/GuestUser;", "getGuestUser", "language", "translate", "Lio/getstream/chat/android/models/Attachment;", "og", "channelFilter", "messageFilter", "Lio/getstream/chat/android/models/SearchMessagesResult;", "searchMessages", "(Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/FilterObject;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Lio/getstream/chat/android/models/querysort/QuerySorter;)Lo23/d;", "Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;", "query", "Lio/getstream/chat/android/client/api/models/QueryChannelsResult;", "queryChannels", "(Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;)Lo23/d;", "Lio/getstream/chat/android/client/api/models/QueryChannelRequest;", "queryChannel", "(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/api/models/QueryChannelRequest;)Lo23/d;", "Lio/getstream/chat/android/client/api/models/QueryUsersRequest;", "queryUsers", "(Lio/getstream/chat/android/client/api/models/QueryUsersRequest;)Lo23/d;", "queryMembers", "(Ljava/lang/String;Ljava/lang/String;IILio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;Ljava/util/List;)Lo23/d;", "eventType", "Lio/getstream/chat/android/client/events/ChatEvent;", "sendEvent", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lo23/d;", "channelIds", "lastSyncAt", "getSyncHistory", "(Ljava/util/List;Ljava/lang/String;)Lo23/d;", "fileUrl", "Lud3/a1;", "downloadFile", "Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;", "Lio/getstream/chat/android/models/QueryThreadsResult;", "queryThreads", "(Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;)Lo23/d;", "Lio/getstream/chat/android/client/api/models/GetThreadOptions;", "options", "Lio/getstream/chat/android/models/Thread;", "getThread", "(Ljava/lang/String;Lio/getstream/chat/android/client/api/models/GetThreadOptions;)Lo23/d;", "Lio/getstream/chat/android/models/ThreadInfo;", "partialUpdateThread", "pollId", "optionId", "Lio/getstream/chat/android/models/Vote;", "castPollVote", "answer", "castPollAnswer", "voteId", "removePollVote", "Lio/getstream/chat/android/models/Poll;", "partialUpdatePoll", "closePoll", "Lio/getstream/chat/android/models/PollOption;", "option", "createPollOption", "(Ljava/lang/String;Lio/getstream/chat/android/models/PollOption;)Lo23/d;", "updatePollOption", "deletePollOption", "Lio/getstream/chat/android/models/QueryPollVotesResult;", "queryPollVotes", "Lio/getstream/chat/android/models/QueryPollsResult;", "queryPolls", "Lio/getstream/chat/android/models/CreatePollParams;", "createPollParams", "createPoll", "(Lio/getstream/chat/android/models/CreatePollParams;)Lo23/d;", "Lio/getstream/chat/android/client/api/models/UpdatePollRequest;", "updatePoll", "(Lio/getstream/chat/android/client/api/models/UpdatePollRequest;)Lo23/d;", "getPoll", "deletePoll", "remindAt", "Lio/getstream/chat/android/models/MessageReminder;", "createReminder", "updateReminder", "deleteReminder", "Lio/getstream/chat/android/models/QueryRemindersResult;", "queryReminders", "(Lio/getstream/chat/android/models/FilterObject;ILjava/lang/String;Lio/getstream/chat/android/models/querysort/QuerySorter;)Lo23/d;", "Lio/getstream/chat/android/models/Location;", "queryActiveLocations", "location", "updateLiveLocation", "(Lio/getstream/chat/android/models/Location;)Lo23/d;", "stopLiveLocation", "warmUp", "toDto", "(Ljava/util/Map;)Ljava/util/Map;", "Lio/getstream/chat/android/client/api2/model/requests/FlagRequest;", "body", "flag", "(Lio/getstream/chat/android/client/api2/model/requests/FlagRequest;)Lo23/d;", "unflag", "(Ljava/util/Map;)Lo23/d;", "updateCooldown", "Lio/getstream/chat/android/client/api2/model/response/ChannelResponse;", "response", "flattenChannel", "(Lio/getstream/chat/android/client/api2/model/response/ChannelResponse;)Lio/getstream/chat/android/models/Channel;", "Lio/getstream/chat/android/client/api2/model/requests/UpstreamVoteDto;", "vote", "castVote", "(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/requests/UpstreamVoteDto;)Lo23/d;", "T", "Lkotlin/Function0;", NotificationCompat.CATEGORY_CALL, "postponeCall", "(Lc93/a;)Lo23/d;", "R", "Lio/getstream/chat/android/client/call/RetrofitCall;", "Lkotlin/Function2;", "transform", "mapDomain", "(Lio/getstream/chat/android/client/call/RetrofitCall;Lc93/m;)Lo23/d;", "Lio/getstream/chat/android/client/api2/model/response/PushPreferencesResponse;", "parseUserPushPreferencesResponse", "(Lio/getstream/chat/android/client/call/RetrofitCall;)Lo23/d;", "parseChannelPushPreferencesResponse", "(Lio/getstream/chat/android/client/call/RetrofitCall;Ljava/lang/String;)Lo23/d;", "flatMapDomain", "Lio/getstream/chat/android/client/api2/mapping/DomainMapping;", "Lio/getstream/chat/android/client/api2/mapping/EventMapping;", "Lio/getstream/chat/android/client/api2/mapping/DtoMapping;", "Lio/getstream/chat/android/client/uploader/FileUploader;", "Lio/getstream/chat/android/client/uploader/FileTransformer;", "Lio/getstream/chat/android/client/api2/endpoint/UserApi;", "Lio/getstream/chat/android/client/api2/endpoint/GuestApi;", "Lio/getstream/chat/android/client/api2/endpoint/MessageApi;", "Lio/getstream/chat/android/client/api2/endpoint/ChannelApi;", "Lio/getstream/chat/android/client/api2/endpoint/DeviceApi;", "Lio/getstream/chat/android/client/api2/endpoint/ModerationApi;", "Lio/getstream/chat/android/client/api2/endpoint/GeneralApi;", "Lio/getstream/chat/android/client/api2/endpoint/ConfigApi;", "Lio/getstream/chat/android/client/api2/endpoint/FileDownloadApi;", "Lio/getstream/chat/android/client/api2/endpoint/OpenGraphApi;", "Lio/getstream/chat/android/client/api2/endpoint/ThreadsApi;", "Lio/getstream/chat/android/client/api2/endpoint/PollsApi;", "Lio/getstream/chat/android/client/api2/endpoint/RemindersApi;", "Lio/getstream/chat/android/client/api2/endpoint/PushPreferencesApi;", "Lbc3/c0;", "Lio/getstream/chat/android/client/scope/UserScope;", "Lb23/k;", "logger$delegate", "Ll83/h;", "getLogger", "()Lb23/k;", "logger", "Lio/getstream/chat/android/client/helpers/CallPostponeHelper;", "callPostponeHelper$delegate", "getCallPostponeHelper", "()Lio/getstream/chat/android/client/helpers/CallPostponeHelper;", "callPostponeHelper", "Ljava/lang/String;", "getUserId", "()Ljava/lang/String;", "Lec3/p1;", "_connectionId", "Lec3/p1;", "getConnectionId", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class MoshiChatApi implements ChatApi {
    private final InterfaceC13075p1 _connectionId;

    /* JADX INFO: renamed from: callPostponeHelper$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h callPostponeHelper;
    private final ChannelApi channelApi;
    private final ConfigApi configApi;
    private final InterfaceC2994c0 coroutineScope;
    private final DeviceApi deviceApi;
    private final DomainMapping domainMapping;
    private final DtoMapping dtoMapping;
    private final EventMapping eventMapping;
    private final FileDownloadApi fileDownloadApi;
    private final FileTransformer fileTransformer;
    private final FileUploader fileUploader;
    private final GeneralApi generalApi;
    private final GuestApi guestApi;

    /* JADX INFO: renamed from: logger$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h logger;
    private final MessageApi messageApi;
    private final ModerationApi moderationApi;
    private final OpenGraphApi ogApi;
    private final PollsApi pollsApi;
    private final PushPreferencesApi pushPreferencesApi;
    private final RemindersApi remindersApi;
    private final ThreadsApi threadsApi;
    private final UserApi userApi;
    private volatile String userId;
    private final UserScope userScope;

    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VotingVisibility.values().length];
            try {
                iArr[VotingVisibility.PUBLIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VotingVisibility.ANONYMOUS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.api2.MoshiChatApi$acceptInvite$1 */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* synthetic */ class C190321 extends C22672i implements Function1 {
        public C190321(Object obj) {
            super(1, 0, MoshiChatApi.class, obj, "flattenChannel", "flattenChannel(Lio/getstream/chat/android/client/api2/model/response/ChannelResponse;)Lio/getstream/chat/android/models/Channel;");
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Channel invoke(ChannelResponse p13) {
            AbstractC22676k.m65750j(p13, "p0");
            return ((MoshiChatApi) this.receiver).flattenChannel(p13);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.api2.MoshiChatApi$addMembers$2 */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* synthetic */ class C190332 extends C22672i implements Function1 {
        public C190332(Object obj) {
            super(1, 0, MoshiChatApi.class, obj, "flattenChannel", "flattenChannel(Lio/getstream/chat/android/client/api2/model/response/ChannelResponse;)Lio/getstream/chat/android/models/Channel;");
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Channel invoke(ChannelResponse p13) {
            AbstractC22676k.m65750j(p13, "p0");
            return ((MoshiChatApi) this.receiver).flattenChannel(p13);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.api2.MoshiChatApi$deleteChannel$1 */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* synthetic */ class C190351 extends C22672i implements Function1 {
        public C190351(Object obj) {
            super(1, 0, MoshiChatApi.class, obj, "flattenChannel", "flattenChannel(Lio/getstream/chat/android/client/api2/model/response/ChannelResponse;)Lio/getstream/chat/android/models/Channel;");
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Channel invoke(ChannelResponse p13) {
            AbstractC22676k.m65750j(p13, "p0");
            return ((MoshiChatApi) this.receiver).flattenChannel(p13);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.api2.MoshiChatApi$deleteFile$1 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.api2.MoshiChatApi$deleteFile$1", m100430f = "MoshiChatApi.kt", m100431l = {}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lbc3/c0;", "Ln23/h;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)Ln23/h;"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C190361 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ String $channelId;
        final /* synthetic */ String $channelType;
        final /* synthetic */ String $url;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C190361(String str, String str2, String str3, InterfaceC30057d<? super C190361> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$channelType = str;
            this.$channelId = str2;
            this.$url = str3;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return MoshiChatApi.this.new C190361(this.$channelType, this.$channelId, this.$url, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super AbstractC26205h> interfaceC30057d) {
            return ((C190361) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return MoshiChatApi.this.fileUploader.deleteFile(this.$channelType, this.$channelId, MoshiChatApi.this.getUserId(), this.$url);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.api2.MoshiChatApi$deleteFile$2 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.api2.MoshiChatApi$deleteFile$2", m100430f = "MoshiChatApi.kt", m100431l = {}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lbc3/c0;", "Ln23/h;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)Ln23/h;"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C190372 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ String $url;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C190372(String str, InterfaceC30057d<? super C190372> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$url = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return MoshiChatApi.this.new C190372(this.$url, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super AbstractC26205h> interfaceC30057d) {
            return ((C190372) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return MoshiChatApi.this.fileUploader.deleteFile(this.$url);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.api2.MoshiChatApi$deleteImage$1 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.api2.MoshiChatApi$deleteImage$1", m100430f = "MoshiChatApi.kt", m100431l = {}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lbc3/c0;", "Ln23/h;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)Ln23/h;"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C190381 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ String $channelId;
        final /* synthetic */ String $channelType;
        final /* synthetic */ String $url;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C190381(String str, String str2, String str3, InterfaceC30057d<? super C190381> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$channelType = str;
            this.$channelId = str2;
            this.$url = str3;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return MoshiChatApi.this.new C190381(this.$channelType, this.$channelId, this.$url, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super AbstractC26205h> interfaceC30057d) {
            return ((C190381) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return MoshiChatApi.this.fileUploader.deleteImage(this.$channelType, this.$channelId, MoshiChatApi.this.getUserId(), this.$url);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.api2.MoshiChatApi$deleteImage$2 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.api2.MoshiChatApi$deleteImage$2", m100430f = "MoshiChatApi.kt", m100431l = {}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lbc3/c0;", "Ln23/h;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)Ln23/h;"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C190392 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ String $url;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C190392(String str, InterfaceC30057d<? super C190392> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$url = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return MoshiChatApi.this.new C190392(this.$url, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super AbstractC26205h> interfaceC30057d) {
            return ((C190392) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return MoshiChatApi.this.fileUploader.deleteImage(this.$url);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.api2.MoshiChatApi$inviteMembers$2 */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* synthetic */ class C190402 extends C22672i implements Function1 {
        public C190402(Object obj) {
            super(1, 0, MoshiChatApi.class, obj, "flattenChannel", "flattenChannel(Lio/getstream/chat/android/client/api2/model/response/ChannelResponse;)Lio/getstream/chat/android/models/Channel;");
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Channel invoke(ChannelResponse p13) {
            AbstractC22676k.m65750j(p13, "p0");
            return ((MoshiChatApi) this.receiver).flattenChannel(p13);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.api2.MoshiChatApi$rejectInvite$1 */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* synthetic */ class C190411 extends C22672i implements Function1 {
        public C190411(Object obj) {
            super(1, 0, MoshiChatApi.class, obj, "flattenChannel", "flattenChannel(Lio/getstream/chat/android/client/api2/model/response/ChannelResponse;)Lio/getstream/chat/android/models/Channel;");
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Channel invoke(ChannelResponse p13) {
            AbstractC22676k.m65750j(p13, "p0");
            return ((MoshiChatApi) this.receiver).flattenChannel(p13);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.api2.MoshiChatApi$removeMembers$2 */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* synthetic */ class C190422 extends C22672i implements Function1 {
        public C190422(Object obj) {
            super(1, 0, MoshiChatApi.class, obj, "flattenChannel", "flattenChannel(Lio/getstream/chat/android/client/api2/model/response/ChannelResponse;)Lio/getstream/chat/android/models/Channel;");
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Channel invoke(ChannelResponse p13) {
            AbstractC22676k.m65750j(p13, "p0");
            return ((MoshiChatApi) this.receiver).flattenChannel(p13);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.api2.MoshiChatApi$sendFile$1 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.api2.MoshiChatApi$sendFile$1", m100430f = "MoshiChatApi.kt", m100431l = {}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lbc3/c0;", "Ln23/h;", "Lio/getstream/chat/android/models/UploadedFile;", "<anonymous>", "(Lbc3/c0;)Ln23/h;"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C190431 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ ProgressCallback $callback;
        final /* synthetic */ String $channelId;
        final /* synthetic */ String $channelType;
        final /* synthetic */ File $file;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C190431(File file, ProgressCallback progressCallback, String str, String str2, InterfaceC30057d<? super C190431> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$file = file;
            this.$callback = progressCallback;
            this.$channelType = str;
            this.$channelId = str2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return MoshiChatApi.this.new C190431(this.$file, this.$callback, this.$channelType, this.$channelId, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super AbstractC26205h> interfaceC30057d) {
            return ((C190431) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            File fileTransform = MoshiChatApi.this.fileTransformer.transform(this.$file);
            ProgressCallback progressCallback = this.$callback;
            MoshiChatApi moshiChatApi = MoshiChatApi.this;
            String str = this.$channelType;
            String str2 = this.$channelId;
            if (progressCallback == null) {
                return moshiChatApi.fileUploader.sendFile(str, str2, moshiChatApi.getUserId(), fileTransform);
            }
            AbstractC26205h abstractC26205hSendFile = moshiChatApi.fileUploader.sendFile(str, str2, moshiChatApi.getUserId(), fileTransform, progressCallback);
            boolean z4 = abstractC26205hSendFile instanceof C26204g;
            if (z4) {
                progressCallback.onSuccess(((UploadedFile) ((C26204g) abstractC26205hSendFile).f103919a).getFile());
            } else if (!(abstractC26205hSendFile instanceof C26203f)) {
                throw new NoWhenBranchMatchedException();
            }
            if (z4) {
                return abstractC26205hSendFile;
            }
            if (!(abstractC26205hSendFile instanceof C26203f)) {
                throw new NoWhenBranchMatchedException();
            }
            progressCallback.onError(((C26203f) abstractC26205hSendFile).f103918a);
            return abstractC26205hSendFile;
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.api2.MoshiChatApi$sendImage$1 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.api2.MoshiChatApi$sendImage$1", m100430f = "MoshiChatApi.kt", m100431l = {}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lbc3/c0;", "Ln23/h;", "Lio/getstream/chat/android/models/UploadedFile;", "<anonymous>", "(Lbc3/c0;)Ln23/h;"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C190441 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ ProgressCallback $callback;
        final /* synthetic */ String $channelId;
        final /* synthetic */ String $channelType;
        final /* synthetic */ File $file;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C190441(File file, ProgressCallback progressCallback, String str, String str2, InterfaceC30057d<? super C190441> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$file = file;
            this.$callback = progressCallback;
            this.$channelType = str;
            this.$channelId = str2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return MoshiChatApi.this.new C190441(this.$file, this.$callback, this.$channelType, this.$channelId, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super AbstractC26205h> interfaceC30057d) {
            return ((C190441) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            File fileTransform = MoshiChatApi.this.fileTransformer.transform(this.$file);
            ProgressCallback progressCallback = this.$callback;
            MoshiChatApi moshiChatApi = MoshiChatApi.this;
            String str = this.$channelType;
            String str2 = this.$channelId;
            if (progressCallback == null) {
                return moshiChatApi.fileUploader.sendImage(str, str2, moshiChatApi.getUserId(), fileTransform);
            }
            AbstractC26205h abstractC26205hSendImage = moshiChatApi.fileUploader.sendImage(str, str2, moshiChatApi.getUserId(), fileTransform, progressCallback);
            boolean z4 = abstractC26205hSendImage instanceof C26204g;
            if (z4) {
                progressCallback.onSuccess(((UploadedFile) ((C26204g) abstractC26205hSendImage).f103919a).getFile());
            } else if (!(abstractC26205hSendImage instanceof C26203f)) {
                throw new NoWhenBranchMatchedException();
            }
            if (z4) {
                return abstractC26205hSendImage;
            }
            if (!(abstractC26205hSendImage instanceof C26203f)) {
                throw new NoWhenBranchMatchedException();
            }
            progressCallback.onError(((C26203f) abstractC26205hSendImage).f103918a);
            return abstractC26205hSendImage;
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.api2.MoshiChatApi$truncateChannel$2 */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* synthetic */ class C190452 extends C22672i implements Function1 {
        public C190452(Object obj) {
            super(1, 0, MoshiChatApi.class, obj, "flattenChannel", "flattenChannel(Lio/getstream/chat/android/client/api2/model/response/ChannelResponse;)Lio/getstream/chat/android/models/Channel;");
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Channel invoke(ChannelResponse p13) {
            AbstractC22676k.m65750j(p13, "p0");
            return ((MoshiChatApi) this.receiver).flattenChannel(p13);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.api2.MoshiChatApi$updateChannel$2 */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* synthetic */ class C190462 extends C22672i implements Function1 {
        public C190462(Object obj) {
            super(1, 0, MoshiChatApi.class, obj, "flattenChannel", "flattenChannel(Lio/getstream/chat/android/client/api2/model/response/ChannelResponse;)Lio/getstream/chat/android/models/Channel;");
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Channel invoke(ChannelResponse p13) {
            AbstractC22676k.m65750j(p13, "p0");
            return ((MoshiChatApi) this.receiver).flattenChannel(p13);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.api2.MoshiChatApi$updateChannelPartial$1 */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* synthetic */ class C190471 extends C22672i implements Function1 {
        public C190471(Object obj) {
            super(1, 0, MoshiChatApi.class, obj, "flattenChannel", "flattenChannel(Lio/getstream/chat/android/client/api2/model/response/ChannelResponse;)Lio/getstream/chat/android/models/Channel;");
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Channel invoke(ChannelResponse p13) {
            AbstractC22676k.m65750j(p13, "p0");
            return ((MoshiChatApi) this.receiver).flattenChannel(p13);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.api2.MoshiChatApi$updateCooldown$1 */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* synthetic */ class C190481 extends C22672i implements Function1 {
        public C190481(Object obj) {
            super(1, 0, MoshiChatApi.class, obj, "flattenChannel", "flattenChannel(Lio/getstream/chat/android/client/api2/model/response/ChannelResponse;)Lio/getstream/chat/android/models/Channel;");
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Channel invoke(ChannelResponse p13) {
            AbstractC22676k.m65750j(p13, "p0");
            return ((MoshiChatApi) this.receiver).flattenChannel(p13);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.api2.MoshiChatApi$uploadFile$1 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.api2.MoshiChatApi$uploadFile$1", m100430f = "MoshiChatApi.kt", m100431l = {}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lbc3/c0;", "Ln23/h;", "Lio/getstream/chat/android/models/UploadedFile;", "<anonymous>", "(Lbc3/c0;)Ln23/h;"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C190491 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ File $file;
        final /* synthetic */ ProgressCallback $progressCallback;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C190491(File file, ProgressCallback progressCallback, InterfaceC30057d<? super C190491> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$file = file;
            this.$progressCallback = progressCallback;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return MoshiChatApi.this.new C190491(this.$file, this.$progressCallback, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super AbstractC26205h> interfaceC30057d) {
            return ((C190491) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            File fileTransform = MoshiChatApi.this.fileTransformer.transform(this.$file);
            MoshiChatApi moshiChatApi = MoshiChatApi.this;
            AbstractC26205h abstractC26205hUploadFile = moshiChatApi.fileUploader.uploadFile(fileTransform, this.$progressCallback);
            ProgressCallback progressCallback = this.$progressCallback;
            boolean z4 = abstractC26205hUploadFile instanceof C26204g;
            if (z4) {
                UploadedFile uploadedFile = (UploadedFile) ((C26204g) abstractC26205hUploadFile).f103919a;
                if (progressCallback != null) {
                    progressCallback.onSuccess(uploadedFile.getFile());
                }
            } else if (!(abstractC26205hUploadFile instanceof C26203f)) {
                throw new NoWhenBranchMatchedException();
            }
            ProgressCallback progressCallback2 = this.$progressCallback;
            if (!z4) {
                if (!(abstractC26205hUploadFile instanceof C26203f)) {
                    throw new NoWhenBranchMatchedException();
                }
                AbstractC26202e abstractC26202e = ((C26203f) abstractC26205hUploadFile).f103918a;
                if (progressCallback2 != null) {
                    progressCallback2.onError(abstractC26202e);
                    return abstractC26205hUploadFile;
                }
            }
            return abstractC26205hUploadFile;
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.api2.MoshiChatApi$uploadImage$1 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.api2.MoshiChatApi$uploadImage$1", m100430f = "MoshiChatApi.kt", m100431l = {}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lbc3/c0;", "Ln23/h;", "Lio/getstream/chat/android/models/UploadedFile;", "<anonymous>", "(Lbc3/c0;)Ln23/h;"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C190501 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ File $file;
        final /* synthetic */ ProgressCallback $progressCallback;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C190501(File file, ProgressCallback progressCallback, InterfaceC30057d<? super C190501> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$file = file;
            this.$progressCallback = progressCallback;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return MoshiChatApi.this.new C190501(this.$file, this.$progressCallback, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super AbstractC26205h> interfaceC30057d) {
            return ((C190501) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            File fileTransform = MoshiChatApi.this.fileTransformer.transform(this.$file);
            MoshiChatApi moshiChatApi = MoshiChatApi.this;
            AbstractC26205h abstractC26205hUploadImage = moshiChatApi.fileUploader.uploadImage(fileTransform, this.$progressCallback);
            ProgressCallback progressCallback = this.$progressCallback;
            boolean z4 = abstractC26205hUploadImage instanceof C26204g;
            if (z4) {
                UploadedFile uploadedFile = (UploadedFile) ((C26204g) abstractC26205hUploadImage).f103919a;
                if (progressCallback != null) {
                    progressCallback.onSuccess(uploadedFile.getFile());
                }
            } else if (!(abstractC26205hUploadImage instanceof C26203f)) {
                throw new NoWhenBranchMatchedException();
            }
            ProgressCallback progressCallback2 = this.$progressCallback;
            if (!z4) {
                if (!(abstractC26205hUploadImage instanceof C26203f)) {
                    throw new NoWhenBranchMatchedException();
                }
                AbstractC26202e abstractC26202e = ((C26203f) abstractC26205hUploadImage).f103918a;
                if (progressCallback2 != null) {
                    progressCallback2.onError(abstractC26202e);
                    return abstractC26205hUploadImage;
                }
            }
            return abstractC26205hUploadImage;
        }
    }

    public MoshiChatApi(DomainMapping domainMapping, EventMapping eventMapping, DtoMapping dtoMapping, FileUploader fileUploader, FileTransformer fileTransformer, UserApi userApi, GuestApi guestApi, MessageApi messageApi, ChannelApi channelApi, DeviceApi deviceApi, ModerationApi moderationApi, GeneralApi generalApi, ConfigApi configApi, FileDownloadApi fileDownloadApi, OpenGraphApi ogApi, ThreadsApi threadsApi, PollsApi pollsApi, RemindersApi remindersApi, PushPreferencesApi pushPreferencesApi, InterfaceC2994c0 coroutineScope, UserScope userScope) {
        AbstractC22676k.m65750j(domainMapping, "domainMapping");
        AbstractC22676k.m65750j(eventMapping, "eventMapping");
        AbstractC22676k.m65750j(dtoMapping, "dtoMapping");
        AbstractC22676k.m65750j(fileUploader, "fileUploader");
        AbstractC22676k.m65750j(fileTransformer, "fileTransformer");
        AbstractC22676k.m65750j(userApi, "userApi");
        AbstractC22676k.m65750j(guestApi, "guestApi");
        AbstractC22676k.m65750j(messageApi, "messageApi");
        AbstractC22676k.m65750j(channelApi, "channelApi");
        AbstractC22676k.m65750j(deviceApi, "deviceApi");
        AbstractC22676k.m65750j(moderationApi, "moderationApi");
        AbstractC22676k.m65750j(generalApi, "generalApi");
        AbstractC22676k.m65750j(configApi, "configApi");
        AbstractC22676k.m65750j(fileDownloadApi, "fileDownloadApi");
        AbstractC22676k.m65750j(ogApi, "ogApi");
        AbstractC22676k.m65750j(threadsApi, "threadsApi");
        AbstractC22676k.m65750j(pollsApi, "pollsApi");
        AbstractC22676k.m65750j(remindersApi, "remindersApi");
        AbstractC22676k.m65750j(pushPreferencesApi, "pushPreferencesApi");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        AbstractC22676k.m65750j(userScope, "userScope");
        this.domainMapping = domainMapping;
        this.eventMapping = eventMapping;
        this.dtoMapping = dtoMapping;
        this.fileUploader = fileUploader;
        this.fileTransformer = fileTransformer;
        this.userApi = userApi;
        this.guestApi = guestApi;
        this.messageApi = messageApi;
        this.channelApi = channelApi;
        this.deviceApi = deviceApi;
        this.moderationApi = moderationApi;
        this.generalApi = generalApi;
        this.configApi = configApi;
        this.fileDownloadApi = fileDownloadApi;
        this.ogApi = ogApi;
        this.threadsApi = threadsApi;
        this.pollsApi = pollsApi;
        this.remindersApi = remindersApi;
        this.pushPreferencesApi = pushPreferencesApi;
        this.coroutineScope = coroutineScope;
        this.userScope = userScope;
        this.logger = AbstractC1772c1.m5382S(this, "Chat:MoshiChatApi");
        this.callPostponeHelper = AbstractC30060g.m92088H(new C0438l0(this, 19));
        this.userId = "";
        this._connectionId = AbstractC13091v.m36593c("");
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ ArrayList m54567F(DomainMapping domainMapping, MessagesResponse messagesResponse) {
        return (ArrayList) getPinnedMessages$lambda$38(domainMapping, messagesResponse);
    }

    /* JADX INFO: renamed from: H */
    public static /* synthetic */ C27485o m54569H(MoshiChatApi moshiChatApi, QueryThreadsRequest queryThreadsRequest) {
        return (C27485o) queryThreads$lambda$100(moshiChatApi, queryThreadsRequest);
    }

    /* JADX INFO: renamed from: M */
    public static /* synthetic */ ArrayList m54574M(EventMapping eventMapping, SyncHistoryResponse syncHistoryResponse) {
        return (ArrayList) getSyncHistory$lambda$97$lambda$96(eventMapping, syncHistoryResponse);
    }

    /* JADX INFO: renamed from: O */
    public static /* synthetic */ ArrayList m54576O(DomainMapping domainMapping, MessagesResponse messagesResponse) {
        return (ArrayList) getNewerReplies$lambda$56(domainMapping, messagesResponse);
    }

    /* JADX INFO: renamed from: Q */
    public static /* synthetic */ ArrayList m54578Q(DomainMapping domainMapping, QueryBannedUsersResponse queryBannedUsersResponse) {
        return (ArrayList) queryBannedUsers$lambda$35(domainMapping, queryBannedUsersResponse);
    }

    /* JADX INFO: renamed from: U */
    public static /* synthetic */ ArrayList m54582U(DomainMapping domainMapping, QueryDraftMessagesResponse queryDraftMessagesResponse) {
        return (ArrayList) queryDraftMessages$lambda$10(domainMapping, queryDraftMessagesResponse);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ ArrayList m54588a(DomainMapping domainMapping, DevicesResponse devicesResponse) {
        return (ArrayList) getDevices$lambda$30(domainMapping, devicesResponse);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AppSettings appSettings$lambda$4(DomainMapping mapDomain, AppSettingsResponse it) {
        AbstractC22676k.m65750j(mapDomain, "$this$mapDomain");
        AbstractC22676k.m65750j(it, "it");
        return mapDomain.toDomain$stream_chat_android_client_release(it);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ ArrayList m54590b(DomainMapping domainMapping, QueryBlockedUsersResponse queryBlockedUsersResponse) {
        return (ArrayList) queryBlockedUsers$lambda$68(domainMapping, queryBlockedUsersResponse);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserBlock blockUser$lambda$67(DomainMapping mapDomain, BlockUserResponse response) {
        AbstractC22676k.m65750j(mapDomain, "$this$mapDomain");
        AbstractC22676k.m65750j(response, "response");
        return mapDomain.toDomain$stream_chat_android_client_release(response);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ ArrayList m54592c(DomainMapping domainMapping, UsersResponse usersResponse) {
        return (ArrayList) queryUsers$lambda$88$lambda$87(domainMapping, usersResponse);
    }

    /* JADX INFO: renamed from: c0 */
    public static /* synthetic */ ArrayList m54593c0(DomainMapping domainMapping, UpdateUsersResponse updateUsersResponse) {
        return (ArrayList) updateUsers$lambda$66(domainMapping, updateUsersResponse);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CallPostponeHelper callPostponeHelper_delegate$lambda$0(MoshiChatApi moshiChatApi) {
        return new CallPostponeHelper(moshiChatApi.userScope, 0L, new MoshiChatApi$callPostponeHelper$2$1(moshiChatApi, null), 2, null);
    }

    private final InterfaceC27474d castVote(String messageId, String pollId, UpstreamVoteDto vote) {
        return mapDomain(this.pollsApi.castPollVote(messageId, pollId, new PollVoteRequest(vote)), new C19052b(7));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Vote castVote$lambda$106(DomainMapping mapDomain, PollVoteResponse it) {
        AbstractC22676k.m65750j(mapDomain, "$this$mapDomain");
        AbstractC22676k.m65750j(it, "it");
        return mapDomain.toDomain$stream_chat_android_client_release(it.getVote());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DraftMessage createDraftMessage$lambda$8(DomainMapping mapDomain, DraftMessageResponse response) {
        AbstractC22676k.m65750j(mapDomain, "$this$mapDomain");
        AbstractC22676k.m65750j(response, "response");
        return DomainMapping.toDomain$stream_chat_android_client_release$default(mapDomain, response.getDraft(), (ChannelInfo) null, 1, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Poll createPoll$lambda$114(DomainMapping mapDomain, PollResponse it) {
        AbstractC22676k.m65750j(mapDomain, "$this$mapDomain");
        AbstractC22676k.m65750j(it, "it");
        return mapDomain.toDomain$stream_chat_android_client_release(it.getPoll());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PollOption createPollOption$lambda$109(DomainMapping mapDomain, PollOptionResponse it) {
        AbstractC22676k.m65750j(mapDomain, "$this$mapDomain");
        AbstractC22676k.m65750j(it, "it");
        return mapDomain.toPollOption$stream_chat_android_client_release(it.getPoll_option());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MessageReminder createReminder$lambda$118(DomainMapping mapDomain, ReminderResponse it) {
        AbstractC22676k.m65750j(mapDomain, "$this$mapDomain");
        AbstractC22676k.m65750j(it, "it");
        return mapDomain.toDomain$stream_chat_android_client_release(it.getReminder());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Message deleteMessage$lambda$21(DomainMapping mapDomain, MessageResponse response) {
        AbstractC22676k.m65750j(mapDomain, "$this$mapDomain");
        AbstractC22676k.m65750j(response, "response");
        return DomainMapping.toDomain$stream_chat_android_client_release$default(mapDomain, response.getMessage(), (ChannelInfo) null, 1, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Message deleteReaction$lambda$28(DomainMapping mapDomain, MessageResponse response) {
        AbstractC22676k.m65750j(mapDomain, "$this$mapDomain");
        AbstractC22676k.m65750j(response, "response");
        return DomainMapping.toDomain$stream_chat_android_client_release$default(mapDomain, response.getMessage(), (ChannelInfo) null, 1, (Object) null);
    }

    /* JADX INFO: renamed from: e0 */
    public static /* synthetic */ ArrayList m54597e0(DomainMapping domainMapping, MessagesResponse messagesResponse) {
        return (ArrayList) getRepliesMore$lambda$60(domainMapping, messagesResponse);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ C27485o m54598f(String str, MoshiChatApi moshiChatApi, String str2, io.getstream.chat.android.client.api2.model.requests.QueryChannelRequest queryChannelRequest) {
        return (C27485o) queryChannel$lambda$84(str, moshiChatApi, str2, queryChannelRequest);
    }

    private final InterfaceC27474d flag(FlagRequest body) {
        return mapDomain(this.moderationApi.flag(body), new C19052b(20));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flag flag$lambda$32(DomainMapping mapDomain, FlagResponse response) {
        AbstractC22676k.m65750j(mapDomain, "$this$mapDomain");
        AbstractC22676k.m65750j(response, "response");
        return mapDomain.toDomain$stream_chat_android_client_release(response.getFlag());
    }

    private final <T, R> InterfaceC27474d flatMapDomain(RetrofitCall<T> retrofitCall, InterfaceC4351m interfaceC4351m) {
        return AbstractC27476f.m82907e(retrofitCall, new C19051a(interfaceC4351m, this, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC27474d flatMapDomain$lambda$128(InterfaceC4351m interfaceC4351m, MoshiChatApi moshiChatApi, Object it) {
        AbstractC22676k.m65750j(it, "it");
        return (InterfaceC27474d) interfaceC4351m.invoke(moshiChatApi.domainMapping, it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Channel flattenChannel(ChannelResponse response) {
        DomainMapping domainMapping = this.domainMapping;
        Channel domain$stream_chat_android_client_release = domainMapping.toDomain$stream_chat_android_client_release(response.getChannel());
        ChannelInfo channelInfo$stream_chat_android_client_release = domainMapping.toChannelInfo$stream_chat_android_client_release(response.getChannel());
        List<DownstreamMessageDto> messages = response.getMessages();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(messages, 10));
        Iterator<T> it = messages.iterator();
        while (it.hasNext()) {
            arrayList.add(MessageExtensionsKt.enrichWithCid(domainMapping.toDomain$stream_chat_android_client_release((DownstreamMessageDto) it.next(), channelInfo$stream_chat_android_client_release), domain$stream_chat_android_client_release.getCid()));
        }
        int watcher_count = response.getWatcher_count();
        List<DownstreamChannelUserRead> read = response.getRead();
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(read, 10));
        for (DownstreamChannelUserRead downstreamChannelUserRead : read) {
            Date lastMessageAt = domain$stream_chat_android_client_release.getLastMessageAt();
            if (lastMessageAt == null) {
                lastMessageAt = downstreamChannelUserRead.getLast_read();
            }
            arrayList2.add(domainMapping.toDomain$stream_chat_android_client_release(downstreamChannelUserRead, lastMessageAt));
        }
        List<DownstreamMemberDto> members = response.getMembers();
        ArrayList arrayList3 = new ArrayList(AbstractC25267u.m74163i0(members, 10));
        Iterator<T> it3 = members.iterator();
        while (it3.hasNext()) {
            arrayList3.add(domainMapping.toDomain$stream_chat_android_client_release((DownstreamMemberDto) it3.next()));
        }
        DownstreamMemberDto membership = response.getMembership();
        Member domain$stream_chat_android_client_release2 = membership != null ? domainMapping.toDomain$stream_chat_android_client_release(membership) : null;
        List<DownstreamPendingMessageDto> pending_messages = response.getPending_messages();
        ArrayList arrayList4 = new ArrayList(AbstractC25267u.m74163i0(pending_messages, 10));
        Iterator<T> it4 = pending_messages.iterator();
        while (it4.hasNext()) {
            arrayList4.add(domainMapping.toDomain$stream_chat_android_client_release((DownstreamPendingMessageDto) it4.next(), domain$stream_chat_android_client_release.getCid(), channelInfo$stream_chat_android_client_release));
        }
        List<DownstreamMessageDto> pinned_messages = response.getPinned_messages();
        ArrayList arrayList5 = new ArrayList(AbstractC25267u.m74163i0(pinned_messages, 10));
        Iterator<T> it5 = pinned_messages.iterator();
        while (it5.hasNext()) {
            arrayList5.add(MessageExtensionsKt.enrichWithCid(domainMapping.toDomain$stream_chat_android_client_release((DownstreamMessageDto) it5.next(), channelInfo$stream_chat_android_client_release), domain$stream_chat_android_client_release.getCid()));
        }
        DownstreamPushPreferenceDto push_preferences = response.getPush_preferences();
        PushPreference domain$stream_chat_android_client_release3 = push_preferences != null ? domainMapping.toDomain$stream_chat_android_client_release(push_preferences) : null;
        List<DownstreamUserDto> watchers = response.getWatchers();
        ArrayList arrayList6 = new ArrayList(AbstractC25267u.m74163i0(watchers, 10));
        Iterator<T> it6 = watchers.iterator();
        while (it6.hasNext()) {
            arrayList6.add(domainMapping.toDomain$stream_chat_android_client_release((DownstreamUserDto) it6.next()));
        }
        Boolean hidden = response.getHidden();
        Date hide_messages_before = response.getHide_messages_before();
        DownstreamDraftDto draft = response.getDraft();
        return ChannelExtensionKt.syncUnreadCountWithReads(Channel.copy$default(domain$stream_chat_android_client_release, null, null, null, null, watcher_count, false, null, null, null, null, 0, arrayList, arrayList3, arrayList6, arrayList2, null, null, 0, null, hidden, hide_messages_before, 0, arrayList4, arrayList5, null, domain$stream_chat_android_client_release2, null, false, draft != null ? domainMapping.toDomain$stream_chat_android_client_release(draft, (ChannelInfo) null) : null, null, null, domain$stream_chat_android_client_release3, null, null, null, 1831307247, 7, null), (String) this.domainMapping.getCurrentUserIdProvider().invoke());
    }

    private final CallPostponeHelper getCallPostponeHelper() {
        return (CallPostponeHelper) this.callPostponeHelper.getValue();
    }

    private final String getConnectionId() {
        if (AbstractC22676k.m65745e(((C13045h2) this._connectionId).getValue(), "")) {
            C2345k logger = getLogger();
            InterfaceC2339e interfaceC2339eM7232c = logger.m7232c();
            EnumC2341g enumC2341g = EnumC2341g.ERROR;
            if (interfaceC2339eM7232c.isLoggable(enumC2341g, logger.m7231b())) {
                logger.m7230a().log(enumC2341g, logger.m7231b(), "connectionId accessed before being set. Did you forget to call ChatClient.connectUser()?", null);
            }
        }
        return (String) ((C13045h2) this._connectionId).getValue();
    }

    private static final List getDevices$lambda$30(DomainMapping mapDomain, DevicesResponse response) {
        AbstractC22676k.m65750j(mapDomain, "$this$mapDomain");
        AbstractC22676k.m65750j(response, "response");
        List<DeviceDto> devices = response.getDevices();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(devices, 10));
        Iterator<T> it = devices.iterator();
        while (it.hasNext()) {
            arrayList.add(mapDomain.toDomain$stream_chat_android_client_release((DeviceDto) it.next()));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GuestUser getGuestUser$lambda$71(DomainMapping mapDomain, TokenResponse response) {
        AbstractC22676k.m65750j(mapDomain, "$this$mapDomain");
        AbstractC22676k.m65750j(response, "response");
        return new GuestUser(mapDomain.toDomain$stream_chat_android_client_release(response.getUser()), response.getAccess_token());
    }

    private final C2345k getLogger() {
        return (C2345k) this.logger.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Message getMessage$lambda$19(DomainMapping mapDomain, MessageResponse response) {
        AbstractC22676k.m65750j(mapDomain, "$this$mapDomain");
        AbstractC22676k.m65750j(response, "response");
        return DomainMapping.toDomain$stream_chat_android_client_release$default(mapDomain, response.getMessage(), (ChannelInfo) null, 1, (Object) null);
    }

    private static final List getNewerReplies$lambda$56(DomainMapping mapDomain, MessagesResponse response) {
        AbstractC22676k.m65750j(mapDomain, "$this$mapDomain");
        AbstractC22676k.m65750j(response, "response");
        List<DownstreamMessageDto> messages = response.getMessages();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(messages, 10));
        Iterator<T> it = messages.iterator();
        while (it.hasNext()) {
            arrayList.add(DomainMapping.toDomain$stream_chat_android_client_release$default(mapDomain, (DownstreamMessageDto) it.next(), (ChannelInfo) null, 1, (Object) null));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PendingMessage getPendingMessage$lambda$20(DomainMapping mapDomain, MessageResponse it) {
        AbstractC22676k.m65750j(mapDomain, "$this$mapDomain");
        AbstractC22676k.m65750j(it, "it");
        return mapDomain.toDomain$stream_chat_android_client_release(it);
    }

    private static final List getPinnedMessages$lambda$38(DomainMapping mapDomain, MessagesResponse response) {
        AbstractC22676k.m65750j(mapDomain, "$this$mapDomain");
        AbstractC22676k.m65750j(response, "response");
        List<DownstreamMessageDto> messages = response.getMessages();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(messages, 10));
        Iterator<T> it = messages.iterator();
        while (it.hasNext()) {
            arrayList.add(DomainMapping.toDomain$stream_chat_android_client_release$default(mapDomain, (DownstreamMessageDto) it.next(), (ChannelInfo) null, 1, (Object) null));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Poll getPoll$lambda$117(DomainMapping mapDomain, PollResponse it) {
        AbstractC22676k.m65750j(mapDomain, "$this$mapDomain");
        AbstractC22676k.m65750j(it, "it");
        return mapDomain.toDomain$stream_chat_android_client_release(it.getPoll());
    }

    private static final List getReactions$lambda$23(DomainMapping mapDomain, ReactionsResponse response) {
        AbstractC22676k.m65750j(mapDomain, "$this$mapDomain");
        AbstractC22676k.m65750j(response, "response");
        List<DownstreamReactionDto> reactions = response.getReactions();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(reactions, 10));
        Iterator<T> it = reactions.iterator();
        while (it.hasNext()) {
            arrayList.add(mapDomain.toDomain$stream_chat_android_client_release((DownstreamReactionDto) it.next()));
        }
        return arrayList;
    }

    private static final List getReplies$lambda$58(DomainMapping mapDomain, MessagesResponse response) {
        AbstractC22676k.m65750j(mapDomain, "$this$mapDomain");
        AbstractC22676k.m65750j(response, "response");
        List<DownstreamMessageDto> messages = response.getMessages();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(messages, 10));
        Iterator<T> it = messages.iterator();
        while (it.hasNext()) {
            arrayList.add(DomainMapping.toDomain$stream_chat_android_client_release$default(mapDomain, (DownstreamMessageDto) it.next(), (ChannelInfo) null, 1, (Object) null));
        }
        return arrayList;
    }

    private static final List getRepliesMore$lambda$60(DomainMapping mapDomain, MessagesResponse response) {
        AbstractC22676k.m65750j(mapDomain, "$this$mapDomain");
        AbstractC22676k.m65750j(response, "response");
        List<DownstreamMessageDto> messages = response.getMessages();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(messages, 10));
        Iterator<T> it = messages.iterator();
        while (it.hasNext()) {
            arrayList.add(DomainMapping.toDomain$stream_chat_android_client_release$default(mapDomain, (DownstreamMessageDto) it.next(), (ChannelInfo) null, 1, (Object) null));
        }
        return arrayList;
    }

    private static final List getSyncHistory$lambda$97$lambda$96(EventMapping eventMapping, SyncHistoryResponse response) {
        AbstractC22676k.m65750j(response, "response");
        List<ChatEventDto> events = response.getEvents();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(events, 10));
        Iterator<T> it = events.iterator();
        while (it.hasNext()) {
            arrayList.add(eventMapping.toDomain$stream_chat_android_client_release((ChatEventDto) it.next()));
        }
        return arrayList;
    }

    private static final InterfaceC27474d getThread$lambda$103(MoshiChatApi moshiChatApi, String str, GetThreadOptions getThreadOptions) {
        return moshiChatApi.mapDomain(moshiChatApi.threadsApi.getThread(str, moshiChatApi.getConnectionId(), getThreadOptions.toMap$stream_chat_android_client_release()), new C19052b(21));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Thread getThread$lambda$103$lambda$102(DomainMapping mapDomain, ThreadResponse response) {
        AbstractC22676k.m65750j(mapDomain, "$this$mapDomain");
        AbstractC22676k.m65750j(response, "response");
        return mapDomain.toDomain$stream_chat_android_client_release(response.getThread());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UnreadCounts getUnreadCounts$lambda$41(DomainMapping mapDomain, UnreadDto it) {
        AbstractC22676k.m65750j(mapDomain, "$this$mapDomain");
        AbstractC22676k.m65750j(it, "it");
        return mapDomain.toDomain$stream_chat_android_client_release(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getUserId() {
        if (AbstractC22676k.m65745e(this.userId, "")) {
            C2345k logger = getLogger();
            InterfaceC2339e interfaceC2339eM7232c = logger.m7232c();
            EnumC2341g enumC2341g = EnumC2341g.ERROR;
            if (interfaceC2339eM7232c.isLoggable(enumC2341g, logger.m7231b())) {
                logger.m7230a().log(enumC2341g, logger.m7231b(), "userId accessed before being set. Did you forget to call ChatClient.connectUser()?", null);
            }
        }
        return this.userId;
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ C27485o m54602h(MoshiChatApi moshiChatApi, String str, String str2) {
        return (C27485o) stopWatching$lambda$36(moshiChatApi, str, str2);
    }

    /* JADX INFO: renamed from: h0 */
    public static /* synthetic */ ArrayList m54603h0(DomainMapping domainMapping, QueryMembersResponse queryMembersResponse) {
        return (ArrayList) queryMembers$lambda$92(domainMapping, queryMembersResponse);
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ ArrayList m54608k(DomainMapping domainMapping, ReactionsResponse reactionsResponse) {
        return (ArrayList) getReactions$lambda$23(domainMapping, reactionsResponse);
    }

    private final <T, R> InterfaceC27474d mapDomain(RetrofitCall<T> retrofitCall, InterfaceC4351m interfaceC4351m) {
        return AbstractC27476f.m82909g(retrofitCall, new C19051a(interfaceC4351m, this, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object mapDomain$lambda$125(InterfaceC4351m interfaceC4351m, MoshiChatApi moshiChatApi, Object it) {
        AbstractC22676k.m65750j(it, "it");
        return interfaceC4351m.invoke(moshiChatApi.domainMapping, it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Mute muteUser$lambda$31(DomainMapping mapDomain, MuteUserResponse response) {
        AbstractC22676k.m65750j(mapDomain, "$this$mapDomain");
        AbstractC22676k.m65750j(response, "response");
        return mapDomain.toDomain$stream_chat_android_client_release(response.getMute());
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ C27485o m54616o(MoshiChatApi moshiChatApi, QueryUsersRequest queryUsersRequest) {
        return (C27485o) queryUsers$lambda$88(moshiChatApi, queryUsersRequest);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Attachment og$lambda$73(DomainMapping mapDomain, AttachmentDto it) {
        AbstractC22676k.m65750j(mapDomain, "$this$mapDomain");
        AbstractC22676k.m65750j(it, "it");
        return mapDomain.toDomain$stream_chat_android_client_release(it);
    }

    private final InterfaceC27474d parseChannelPushPreferencesResponse(RetrofitCall<PushPreferencesResponse> retrofitCall, String str) {
        return flatMapDomain(retrofitCall, new C13857f(27, str, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC27474d parseChannelPushPreferencesResponse$lambda$127(String str, MoshiChatApi moshiChatApi, DomainMapping flatMapDomain, PushPreferencesResponse it) {
        AbstractC22676k.m65750j(flatMapDomain, "$this$flatMapDomain");
        AbstractC22676k.m65750j(it, "it");
        String str2 = (String) flatMapDomain.getCurrentUserIdProvider().invoke();
        if (str2 == null) {
            str2 = "";
        }
        DownstreamPushPreferenceDto userChannelPreference = PushPreferencesResponseKt.getUserChannelPreference(it, str2, str);
        if (userChannelPreference != null) {
            return new C27478h(moshiChatApi.coroutineScope, new MoshiChatApi$parseChannelPushPreferencesResponse$1$1(new C26204g(flatMapDomain.toDomain$stream_chat_android_client_release(userChannelPreference)), null));
        }
        return new ErrorCall(moshiChatApi.coroutineScope, new C26198a(AbstractC31061c.m95640p("Push preferences response for user ", str2, " did not contain channel preference for ", str)));
    }

    private final InterfaceC27474d parseUserPushPreferencesResponse(RetrofitCall<PushPreferencesResponse> retrofitCall) {
        return flatMapDomain(retrofitCall, new C17098f(this, 12));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC27474d parseUserPushPreferencesResponse$lambda$126(MoshiChatApi moshiChatApi, DomainMapping flatMapDomain, PushPreferencesResponse it) {
        AbstractC22676k.m65750j(flatMapDomain, "$this$flatMapDomain");
        AbstractC22676k.m65750j(it, "it");
        String str = (String) flatMapDomain.getCurrentUserIdProvider().invoke();
        if (str == null) {
            str = "";
        }
        DownstreamPushPreferenceDto userPreference = PushPreferencesResponseKt.getUserPreference(it, str);
        if (userPreference != null) {
            return new C27478h(moshiChatApi.coroutineScope, new MoshiChatApi$parseUserPushPreferencesResponse$1$1(new C26204g(flatMapDomain.toDomain$stream_chat_android_client_release(userPreference)), null));
        }
        return new ErrorCall(moshiChatApi.coroutineScope, new C26198a(AbstractC11895b.m31996o("Push preferences response for user ", str, " did not contain user preference")));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Member partialUpdateMember$lambda$46(DomainMapping mapDomain, UpdateMemberPartialResponse response) {
        AbstractC22676k.m65750j(mapDomain, "$this$mapDomain");
        AbstractC22676k.m65750j(response, "response");
        return mapDomain.toDomain$stream_chat_android_client_release(response.getChannel_member());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Message partialUpdateMessage$lambda$15(DomainMapping mapDomain, MessageResponse response) {
        AbstractC22676k.m65750j(mapDomain, "$this$mapDomain");
        AbstractC22676k.m65750j(response, "response");
        return DomainMapping.toDomain$stream_chat_android_client_release$default(mapDomain, response.getMessage(), (ChannelInfo) null, 1, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Poll partialUpdatePoll$lambda$108(DomainMapping mapDomain, PollResponse it) {
        AbstractC22676k.m65750j(mapDomain, "$this$mapDomain");
        AbstractC22676k.m65750j(it, "it");
        return mapDomain.toDomain$stream_chat_android_client_release(it.getPoll());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ThreadInfo partialUpdateThread$lambda$105(DomainMapping mapDomain, ThreadInfoResponse response) {
        AbstractC22676k.m65750j(mapDomain, "$this$mapDomain");
        AbstractC22676k.m65750j(response, "response");
        return mapDomain.toDomain$stream_chat_android_client_release(response.getThread());
    }

    private static final List partialUpdateUser$lambda$70(DomainMapping mapDomain, UpdateUsersResponse response) {
        AbstractC22676k.m65750j(mapDomain, "$this$mapDomain");
        AbstractC22676k.m65750j(response, "response");
        Collection<DownstreamUserDto> collectionValues = response.getUsers().values();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(collectionValues, 10));
        Iterator<T> it = collectionValues.iterator();
        while (it.hasNext()) {
            arrayList.add(mapDomain.toDomain$stream_chat_android_client_release((DownstreamUserDto) it.next()));
        }
        return arrayList;
    }

    private final <T> InterfaceC27474d postponeCall(InterfaceC4339a call) {
        return getCallPostponeHelper().postponeCall$stream_chat_android_client_release(call);
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ ArrayList m54620q(DomainMapping domainMapping, MessagesResponse messagesResponse) {
        return (ArrayList) getReplies$lambda$58(domainMapping, messagesResponse);
    }

    private static final List queryActiveLocations$lambda$122(DomainMapping mapDomain, LiveLocationsResponse it) {
        AbstractC22676k.m65750j(mapDomain, "$this$mapDomain");
        AbstractC22676k.m65750j(it, "it");
        List<DownstreamLocationDto> active_live_locations = it.getActive_live_locations();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(active_live_locations, 10));
        Iterator<T> it3 = active_live_locations.iterator();
        while (it3.hasNext()) {
            arrayList.add(mapDomain.toDomain$stream_chat_android_client_release((DownstreamLocationDto) it3.next()));
        }
        return arrayList;
    }

    private static final List queryBannedUsers$lambda$35(DomainMapping mapDomain, QueryBannedUsersResponse response) {
        AbstractC22676k.m65750j(mapDomain, "$this$mapDomain");
        AbstractC22676k.m65750j(response, "response");
        List<BannedUserResponse> bans = response.getBans();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(bans, 10));
        Iterator<T> it = bans.iterator();
        while (it.hasNext()) {
            arrayList.add(mapDomain.toDomain$stream_chat_android_client_release((BannedUserResponse) it.next()));
        }
        return arrayList;
    }

    private static final List queryBlockedUsers$lambda$68(DomainMapping mapDomain, QueryBlockedUsersResponse it) {
        AbstractC22676k.m65750j(mapDomain, "$this$mapDomain");
        AbstractC22676k.m65750j(it, "it");
        return mapDomain.toDomain$stream_chat_android_client_release(it.getBlocks());
    }

    private static final InterfaceC27474d queryChannel$lambda$84(String str, MoshiChatApi moshiChatApi, String str2, io.getstream.chat.android.client.api2.model.requests.QueryChannelRequest queryChannelRequest) {
        return AbstractC27476f.m82909g(str.length() == 0 ? moshiChatApi.channelApi.queryChannel(str2, moshiChatApi.getConnectionId(), queryChannelRequest) : moshiChatApi.channelApi.queryChannel(str2, str, moshiChatApi.getConnectionId(), queryChannelRequest), new MoshiChatApi$queryChannel$lazyQueryChannelCall$1$1(moshiChatApi));
    }

    private static final InterfaceC27474d queryChannels$lambda$82(MoshiChatApi moshiChatApi, QueryChannelsRequest queryChannelsRequest) {
        return AbstractC27476f.m82909g(moshiChatApi.channelApi.queryChannels(moshiChatApi.getConnectionId(), queryChannelsRequest), new C17095c(moshiChatApi, 14));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final QueryChannelsResult queryChannels$lambda$82$lambda$81(MoshiChatApi moshiChatApi, QueryChannelsResponse response) {
        C23465k filterDomainWithFields;
        AbstractC22676k.m65750j(response, "response");
        DomainMapping domainMapping = moshiChatApi.domainMapping;
        List<ChannelResponse> channels = response.getChannels();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(channels, 10));
        Iterator<T> it = channels.iterator();
        while (it.hasNext()) {
            arrayList.add(moshiChatApi.flattenChannel((ChannelResponse) it.next()));
        }
        ParsedPredefinedFilterResponse predefined_filter = response.getPredefined_filter();
        PredefinedFilter predefinedFilter = null;
        if (predefined_filter != null && (filterDomainWithFields = FilterDomainMappingKt.toFilterDomainWithFields(predefined_filter.getFilter())) != null) {
            FilterObject filterObject = (FilterObject) filterDomainWithFields.f92937w;
            Set<String> set = (Set) filterDomainWithFields.f92938x;
            QuerySorter<Channel> sortDomain$stream_chat_android_client_release = domainMapping.toSortDomain$stream_chat_android_client_release(predefined_filter.getSort());
            if (sortDomain$stream_chat_android_client_release == null) {
                sortDomain$stream_chat_android_client_release = domainMapping.defaultPredefinedFilterSort$stream_chat_android_client_release(set);
            }
            predefinedFilter = new PredefinedFilter(filterObject, sortDomain$stream_chat_android_client_release);
        }
        return new QueryChannelsResult(arrayList, predefinedFilter);
    }

    private static final List queryDraftMessages$lambda$10(DomainMapping mapDomain, QueryDraftMessagesResponse response) {
        AbstractC22676k.m65750j(mapDomain, "$this$mapDomain");
        AbstractC22676k.m65750j(response, "response");
        List<DownstreamDraftDto> drafts = response.getDrafts();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(drafts, 10));
        Iterator<T> it = drafts.iterator();
        while (it.hasNext()) {
            arrayList.add(DomainMapping.toDomain$stream_chat_android_client_release$default(mapDomain, (DownstreamDraftDto) it.next(), (ChannelInfo) null, 1, (Object) null));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final QueryDraftsResult queryDrafts$lambda$12(DomainMapping mapDomain, QueryDraftMessagesResponse response) {
        AbstractC22676k.m65750j(mapDomain, "$this$mapDomain");
        AbstractC22676k.m65750j(response, "response");
        List<DownstreamDraftDto> drafts = response.getDrafts();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(drafts, 10));
        Iterator<T> it = drafts.iterator();
        while (it.hasNext()) {
            arrayList.add(DomainMapping.toDomain$stream_chat_android_client_release$default(mapDomain, (DownstreamDraftDto) it.next(), (ChannelInfo) null, 1, (Object) null));
        }
        return new QueryDraftsResult(arrayList, response.getNext());
    }

    private static final List queryMembers$lambda$92(DomainMapping mapDomain, QueryMembersResponse response) {
        AbstractC22676k.m65750j(mapDomain, "$this$mapDomain");
        AbstractC22676k.m65750j(response, "response");
        List<DownstreamMemberDto> members = response.getMembers();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(members, 10));
        Iterator<T> it = members.iterator();
        while (it.hasNext()) {
            arrayList.add(mapDomain.toDomain$stream_chat_android_client_release((DownstreamMemberDto) it.next()));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final QueryPollVotesResult queryPollVotes$lambda$111(DomainMapping mapDomain, QueryPollVotesResponse it) {
        AbstractC22676k.m65750j(mapDomain, "$this$mapDomain");
        AbstractC22676k.m65750j(it, "it");
        return mapDomain.toDomain$stream_chat_android_client_release(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final QueryPollsResult queryPolls$lambda$112(DomainMapping mapDomain, QueryPollsResponse it) {
        AbstractC22676k.m65750j(mapDomain, "$this$mapDomain");
        AbstractC22676k.m65750j(it, "it");
        return mapDomain.toDomain$stream_chat_android_client_release(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final QueryReactionsResult queryReactions$lambda$25(DomainMapping mapDomain, QueryReactionsResponse it) {
        AbstractC22676k.m65750j(mapDomain, "$this$mapDomain");
        AbstractC22676k.m65750j(it, "it");
        List<DownstreamReactionDto> reactions = it.getReactions();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(reactions, 10));
        Iterator<T> it3 = reactions.iterator();
        while (it3.hasNext()) {
            arrayList.add(mapDomain.toDomain$stream_chat_android_client_release((DownstreamReactionDto) it3.next()));
        }
        return new QueryReactionsResult(arrayList, it.getNext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final QueryRemindersResult queryReminders$lambda$120(DomainMapping mapDomain, QueryRemindersResponse it) {
        AbstractC22676k.m65750j(mapDomain, "$this$mapDomain");
        AbstractC22676k.m65750j(it, "it");
        return mapDomain.toDomain$stream_chat_android_client_release(it);
    }

    private static final InterfaceC27474d queryThreads$lambda$100(MoshiChatApi moshiChatApi, QueryThreadsRequest queryThreadsRequest) {
        ThreadsApi threadsApi = moshiChatApi.threadsApi;
        String connectionId = moshiChatApi.getConnectionId();
        FilterObject filter = queryThreadsRequest.getFilter();
        return moshiChatApi.mapDomain(threadsApi.queryThreads(connectionId, new io.getstream.chat.android.client.api2.model.requests.QueryThreadsRequest(filter != null ? FilterObjectToMapKt.toMap(filter) : null, queryThreadsRequest.getSort().toDto(), queryThreadsRequest.getWatch(), queryThreadsRequest.getLimit(), queryThreadsRequest.getMemberLimit(), queryThreadsRequest.getNext(), queryThreadsRequest.getParticipantLimit(), queryThreadsRequest.getPrev(), queryThreadsRequest.getReplyLimit())), new C19052b(5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final QueryThreadsResult queryThreads$lambda$100$lambda$99(DomainMapping mapDomain, QueryThreadsResponse response) {
        AbstractC22676k.m65750j(mapDomain, "$this$mapDomain");
        AbstractC22676k.m65750j(response, "response");
        List<DownstreamThreadDto> threads = response.getThreads();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(threads, 10));
        Iterator<T> it = threads.iterator();
        while (it.hasNext()) {
            arrayList.add(mapDomain.toDomain$stream_chat_android_client_release((DownstreamThreadDto) it.next()));
        }
        return new QueryThreadsResult(arrayList, response.getPrev(), response.getNext());
    }

    private static final InterfaceC27474d queryUsers$lambda$88(MoshiChatApi moshiChatApi, QueryUsersRequest queryUsersRequest) {
        return moshiChatApi.mapDomain(moshiChatApi.userApi.queryUsers(moshiChatApi.getConnectionId(), queryUsersRequest), new C18014b(18));
    }

    private static final List queryUsers$lambda$88$lambda$87(DomainMapping mapDomain, UsersResponse response) {
        AbstractC22676k.m65750j(mapDomain, "$this$mapDomain");
        AbstractC22676k.m65750j(response, "response");
        List<DownstreamUserDto> users = response.getUsers();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(users, 10));
        Iterator<T> it = users.iterator();
        while (it.hasNext()) {
            arrayList.add(mapDomain.toDomain$stream_chat_android_client_release((DownstreamUserDto) it.next()));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ C27485o m54622r(MoshiChatApi moshiChatApi, String str, GetThreadOptions getThreadOptions) {
        return (C27485o) getThread$lambda$103(moshiChatApi, str, getThreadOptions);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Vote removePollVote$lambda$107(DomainMapping mapDomain, PollVoteResponse it) {
        AbstractC22676k.m65750j(mapDomain, "$this$mapDomain");
        AbstractC22676k.m65750j(it, "it");
        return mapDomain.toDomain$stream_chat_android_client_release(it.getVote());
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ C27485o m54623s(MoshiChatApi moshiChatApi, QueryChannelsRequest queryChannelsRequest) {
        return (C27485o) queryChannels$lambda$82(moshiChatApi, queryChannelsRequest);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SearchMessagesResult searchMessages$lambda$77(DomainMapping mapDomain, SearchMessagesResponse response) {
        Message messageEnrichWithCid;
        AbstractC22676k.m65750j(mapDomain, "$this$mapDomain");
        AbstractC22676k.m65750j(response, "response");
        List<MessageResponse> results = response.getResults();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(results, 10));
        Iterator<T> it = results.iterator();
        while (true) {
            String cid = null;
            if (!it.hasNext()) {
                break;
            }
            Message domain$stream_chat_android_client_release$default = DomainMapping.toDomain$stream_chat_android_client_release$default(mapDomain, ((MessageResponse) it.next()).getMessage(), (ChannelInfo) null, 1, (Object) null);
            String cid2 = domain$stream_chat_android_client_release$default.getCid();
            if (AbstractC39414r.m125890i0(cid2)) {
                cid2 = null;
            }
            if (cid2 == null) {
                ChannelInfo channelInfo = domain$stream_chat_android_client_release$default.getChannelInfo();
                if (channelInfo != null) {
                    cid = channelInfo.getCid();
                }
            } else {
                cid = cid2;
            }
            if (cid != null && (messageEnrichWithCid = MessageExtensionsKt.enrichWithCid(domain$stream_chat_android_client_release$default, cid)) != null) {
                domain$stream_chat_android_client_release$default = messageEnrichWithCid;
            }
            arrayList.add(domain$stream_chat_android_client_release$default);
        }
        String next = response.getNext();
        String previous = response.getPrevious();
        SearchWarningDto resultsWarning = response.getResultsWarning();
        return new SearchMessagesResult(arrayList, next, previous, resultsWarning != null ? mapDomain.toDomain$stream_chat_android_client_release(resultsWarning) : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Message sendAction$lambda$61(DomainMapping mapDomain, MessageResponse response) {
        AbstractC22676k.m65750j(mapDomain, "$this$mapDomain");
        AbstractC22676k.m65750j(response, "response");
        return DomainMapping.toDomain$stream_chat_android_client_release$default(mapDomain, response.getMessage(), (ChannelInfo) null, 1, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ChatEvent sendEvent$lambda$94$lambda$93(EventMapping eventMapping, EventResponse response) {
        AbstractC22676k.m65750j(response, "response");
        return eventMapping.toDomain$stream_chat_android_client_release(response.getEvent());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Message sendMessage$lambda$6(DomainMapping mapDomain, MessageResponse response) {
        AbstractC22676k.m65750j(mapDomain, "$this$mapDomain");
        AbstractC22676k.m65750j(response, "response");
        return DomainMapping.toDomain$stream_chat_android_client_release$default(mapDomain, response.getMessage(), (ChannelInfo) null, 1, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Reaction sendReaction$lambda$27(DomainMapping mapDomain, ReactionResponse response) {
        AbstractC22676k.m65750j(mapDomain, "$this$mapDomain");
        AbstractC22676k.m65750j(response, "response");
        return mapDomain.toDomain$stream_chat_android_client_release(response.getReaction());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Location stopLiveLocation$lambda$124(DomainMapping mapDomain, DownstreamLocationDto response) {
        AbstractC22676k.m65750j(mapDomain, "$this$mapDomain");
        AbstractC22676k.m65750j(response, "response");
        return mapDomain.toDomain$stream_chat_android_client_release(response);
    }

    private static final InterfaceC27474d stopWatching$lambda$36(MoshiChatApi moshiChatApi, String str, String str2) {
        return AbstractC27476f.m82913k(moshiChatApi.channelApi.stopWatching(str, str2, moshiChatApi.getConnectionId(), C25272z.f99163w));
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ ArrayList m54624t(DomainMapping domainMapping, LiveLocationsResponse liveLocationsResponse) {
        return (ArrayList) queryActiveLocations$lambda$122(domainMapping, liveLocationsResponse);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.ArrayList, java.util.Collection] */
    private final Map<String, Object> toDto(Map<String, ? extends Object> map) {
        ?? value;
        DtoMapping dtoMapping = this.dtoMapping;
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC25247g0.m73988W(map.size()));
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            if (entry.getValue() instanceof Collection) {
                Object value2 = entry.getValue();
                AbstractC22676k.m65748h(value2, "null cannot be cast to non-null type kotlin.collections.Collection<*>");
                Collection collection = (Collection) value2;
                value = new ArrayList(AbstractC25267u.m74163i0(collection, 10));
                for (Object dto$stream_chat_android_client_release : collection) {
                    if (dto$stream_chat_android_client_release instanceof Attachment) {
                        dto$stream_chat_android_client_release = dtoMapping.toDto$stream_chat_android_client_release((Attachment) dto$stream_chat_android_client_release);
                    }
                    value.add(dto$stream_chat_android_client_release);
                }
            } else {
                value = entry.getValue();
            }
            linkedHashMap.put(key, value);
        }
        return linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Message translate$lambda$72(DomainMapping mapDomain, MessageResponse response) {
        AbstractC22676k.m65750j(mapDomain, "$this$mapDomain");
        AbstractC22676k.m65750j(response, "response");
        return DomainMapping.toDomain$stream_chat_android_client_release$default(mapDomain, response.getMessage(), (ChannelInfo) null, 1, (Object) null);
    }

    private final InterfaceC27474d unflag(Map<String, String> body) {
        return mapDomain(this.moderationApi.unflag(body), new C19052b(10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flag unflag$lambda$33(DomainMapping mapDomain, FlagResponse response) {
        AbstractC22676k.m65750j(mapDomain, "$this$mapDomain");
        AbstractC22676k.m65750j(response, "response");
        return mapDomain.toDomain$stream_chat_android_client_release(response.getFlag());
    }

    private final InterfaceC27474d updateCooldown(String channelType, String channelId, int cooldownTimeInSeconds) {
        return AbstractC27476f.m82909g(this.channelApi.updateCooldown(channelType, channelId, UpdateCooldownRequest.INSTANCE.create(cooldownTimeInSeconds)), new C190481(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Location updateLiveLocation$lambda$123(DomainMapping mapDomain, DownstreamLocationDto response) {
        AbstractC22676k.m65750j(mapDomain, "$this$mapDomain");
        AbstractC22676k.m65750j(response, "response");
        return mapDomain.toDomain$stream_chat_android_client_release(response);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Message updateMessage$lambda$14(DomainMapping mapDomain, MessageResponse response) {
        AbstractC22676k.m65750j(mapDomain, "$this$mapDomain");
        AbstractC22676k.m65750j(response, "response");
        return DomainMapping.toDomain$stream_chat_android_client_release$default(mapDomain, response.getMessage(), (ChannelInfo) null, 1, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Poll updatePoll$lambda$116(DomainMapping mapDomain, PollResponse it) {
        AbstractC22676k.m65750j(mapDomain, "$this$mapDomain");
        AbstractC22676k.m65750j(it, "it");
        return mapDomain.toDomain$stream_chat_android_client_release(it.getPoll());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PollOption updatePollOption$lambda$110(DomainMapping mapDomain, PollOptionResponse it) {
        AbstractC22676k.m65750j(mapDomain, "$this$mapDomain");
        AbstractC22676k.m65750j(it, "it");
        return mapDomain.toPollOption$stream_chat_android_client_release(it.getPoll_option());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MessageReminder updateReminder$lambda$119(DomainMapping mapDomain, ReminderResponse it) {
        AbstractC22676k.m65750j(mapDomain, "$this$mapDomain");
        AbstractC22676k.m65750j(it, "it");
        return mapDomain.toDomain$stream_chat_android_client_release(it.getReminder());
    }

    private static final List updateUsers$lambda$66(DomainMapping mapDomain, UpdateUsersResponse response) {
        AbstractC22676k.m65750j(mapDomain, "$this$mapDomain");
        AbstractC22676k.m65750j(response, "response");
        Collection<DownstreamUserDto> collectionValues = response.getUsers().values();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(collectionValues, 10));
        Iterator<T> it = collectionValues.iterator();
        while (it.hasNext()) {
            arrayList.add(mapDomain.toDomain$stream_chat_android_client_release((DownstreamUserDto) it.next()));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ ArrayList m54628x(DomainMapping domainMapping, UpdateUsersResponse updateUsersResponse) {
        return (ArrayList) partialUpdateUser$lambda$70(domainMapping, updateUsersResponse);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d acceptInvite(String channelType, String channelId, String message) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        return AbstractC27476f.m82909g(this.channelApi.acceptInvite(channelType, channelId, AcceptInviteRequest.INSTANCE.create(getUserId(), message)), new C190321(this));
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d addDevice(Device device) {
        AbstractC22676k.m65750j(device, "device");
        return AbstractC27476f.m82913k(this.deviceApi.addDevices(new AddDeviceRequest(device.getToken(), device.getPushProvider().getKey(), device.getProviderName())));
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d addMembers(String channelType, String channelId, List<MemberData> members, Message systemMessage, Boolean hideHistory, Date hideHistoryBefore, Boolean skipPush) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        AbstractC22676k.m65750j(members, "members");
        ChannelApi channelApi = this.channelApi;
        DtoMapping dtoMapping = this.dtoMapping;
        List<MemberData> list = members;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(dtoMapping.toDto$stream_chat_android_client_release((MemberData) it.next()));
        }
        return AbstractC27476f.m82909g(channelApi.addMembers(channelType, channelId, new AddMembersRequest(arrayList, systemMessage != null ? dtoMapping.toDto$stream_chat_android_client_release(systemMessage) : null, hideHistory, hideHistoryBefore, skipPush)), new C190332(this));
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d appSettings() {
        return mapDomain(this.configApi.getAppSettings(), new C19052b(2));
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d banUser(String targetId, Integer timeout, String reason, String channelType, String channelId, boolean shadow) {
        AbstractC22676k.m65750j(targetId, "targetId");
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        return AbstractC27476f.m82913k(this.moderationApi.banUser(new BanUserRequest(targetId, timeout, reason, channelType, channelId, shadow)));
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d blockUser(String userId) {
        AbstractC22676k.m65750j(userId, "userId");
        return mapDomain(this.userApi.blockUser(new BlockUserRequest(userId)), new C18014b(25));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d castPollAnswer(String messageId, String pollId, String answer) {
        AbstractC22676k.m65750j(messageId, "messageId");
        AbstractC22676k.m65750j(pollId, "pollId");
        AbstractC22676k.m65750j(answer, "answer");
        return castVote(messageId, pollId, new UpstreamVoteDto(null, answer, 1, 0 == true ? 1 : 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d castPollVote(String messageId, String pollId, String optionId) {
        AbstractC22676k.m65750j(messageId, "messageId");
        AbstractC22676k.m65750j(pollId, "pollId");
        AbstractC22676k.m65750j(optionId, "optionId");
        return castVote(messageId, pollId, new UpstreamVoteDto(optionId, null, 2, 0 == true ? 1 : 0));
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d closePoll(String pollId) {
        AbstractC22676k.m65750j(pollId, "pollId");
        return partialUpdatePoll(pollId, AbstractC36095b.m114688p(Boolean.TRUE, "is_closed"), C25271y.f99162w);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d createDraftMessage(String channelType, String channelId, DraftMessage message) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        AbstractC22676k.m65750j(message, "message");
        return mapDomain(this.messageApi.createDraftMessage(channelType, channelId, new SendMessageRequest(this.dtoMapping.toDto$stream_chat_android_client_release(message), false, false, 6, null)), new C19052b(0));
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d createPoll(CreatePollParams createPollParams) {
        String str;
        AbstractC22676k.m65750j(createPollParams, "createPollParams");
        PollsApi pollsApi = this.pollsApi;
        boolean allowAnswers = createPollParams.getAllowAnswers();
        boolean allowUserSuggestedOptions = createPollParams.getAllowUserSuggestedOptions();
        String description = createPollParams.getDescription();
        boolean enforceUniqueVote = createPollParams.getEnforceUniqueVote();
        Integer maxVotesAllowed = createPollParams.getMaxVotesAllowed();
        String name = createPollParams.getName();
        List<PollOption> optionsWithExtraData = createPollParams.getOptionsWithExtraData();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(optionsWithExtraData, 10));
        for (PollOption pollOption : optionsWithExtraData) {
            arrayList.add(new UpstreamOptionDto(null, pollOption.getText(), pollOption.getExtraData(), 1, null));
        }
        int i13 = WhenMappings.$EnumSwitchMapping$0[createPollParams.getVotingVisibility().ordinal()];
        if (i13 == 1) {
            str = CreatePollRequest.VOTING_VISIBILITY_PUBLIC;
        } else {
            if (i13 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            str = CreatePollRequest.VOTING_VISIBILITY_ANONYMOUS;
        }
        return mapDomain(pollsApi.createPoll(new CreatePollRequest(allowAnswers, allowUserSuggestedOptions, description, enforceUniqueVote, maxVotesAllowed, name, arrayList, str, createPollParams.getExtraData())), new C18014b(12));
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d createPollOption(String pollId, PollOption option) {
        AbstractC22676k.m65750j(pollId, "pollId");
        AbstractC22676k.m65750j(option, "option");
        return mapDomain(this.pollsApi.createPollOption(pollId, new UpstreamOptionDto(null, option.getText(), option.getExtraData(), 1, null)), new C18014b(27));
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d createReminder(String messageId, Date remindAt) {
        AbstractC22676k.m65750j(messageId, "messageId");
        return mapDomain(this.remindersApi.createReminder(messageId, new ReminderRequest(remindAt)), new C19052b(6));
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d deleteChannel(String channelType, String channelId) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        return AbstractC27476f.m82909g(this.channelApi.deleteChannel(channelType, channelId), new C190351(this));
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d deleteDevice(String id4) {
        AbstractC22676k.m65750j(id4, "id");
        return AbstractC27476f.m82913k(this.deviceApi.deleteDevice(id4));
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d deleteDraftMessage(String channelType, String channelId, DraftMessage message) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        AbstractC22676k.m65750j(message, "message");
        return AbstractC27476f.m82913k(this.messageApi.deleteDraftMessage(channelType, channelId, message.getParentId()));
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d deleteFile(String channelType, String channelId, String url) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        AbstractC22676k.m65750j(url, "url");
        return new C27478h(this.coroutineScope, new C190361(channelType, channelId, url, null));
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d deleteImage(String channelType, String channelId, String url) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        AbstractC22676k.m65750j(url, "url");
        return new C27478h(this.coroutineScope, new C190381(channelType, channelId, url, null));
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d deleteMessage(String messageId, boolean hard, boolean deleteForMe) {
        AbstractC22676k.m65750j(messageId, "messageId");
        return mapDomain(this.messageApi.deleteMessage(messageId, hard ? Boolean.TRUE : null, deleteForMe ? Boolean.TRUE : null), new C18014b(24));
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d deletePoll(String pollId) {
        AbstractC22676k.m65750j(pollId, "pollId");
        return AbstractC27476f.m82913k(this.pollsApi.deletePoll(pollId));
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d deletePollOption(String pollId, String optionId) {
        AbstractC22676k.m65750j(pollId, "pollId");
        AbstractC22676k.m65750j(optionId, "optionId");
        return AbstractC27476f.m82913k(this.pollsApi.deletePollOption(pollId, optionId));
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d deleteReaction(String messageId, String reactionType) {
        AbstractC22676k.m65750j(messageId, "messageId");
        AbstractC22676k.m65750j(reactionType, "reactionType");
        return mapDomain(this.messageApi.deleteReaction(messageId, reactionType), new C19054d(0));
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d deleteReminder(String messageId) {
        AbstractC22676k.m65750j(messageId, "messageId");
        return AbstractC27476f.m82913k(this.remindersApi.deleteReminder(messageId));
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d disableSlowMode(String channelType, String channelId) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        return updateCooldown(channelType, channelId, 0);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d downloadFile(String fileUrl) {
        AbstractC22676k.m65750j(fileUrl, "fileUrl");
        return this.fileDownloadApi.downloadFile(fileUrl);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d enableSlowMode(String channelType, String channelId, int cooldownTimeInSeconds) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        return updateCooldown(channelType, channelId, cooldownTimeInSeconds);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d flagMessage(String messageId, String reason, Map<String, String> customData) {
        AbstractC22676k.m65750j(messageId, "messageId");
        AbstractC22676k.m65750j(customData, "customData");
        return flag(new FlagMessageRequest(messageId, reason, customData));
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d flagUser(String userId, String reason, Map<String, String> customData) {
        AbstractC22676k.m65750j(userId, "userId");
        AbstractC22676k.m65750j(customData, "customData");
        return flag(new FlagUserRequest(userId, reason, customData));
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d getDevices() {
        return mapDomain(this.deviceApi.getDevices(), new C19054d(3));
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d getGuestUser(String userId, String userName) {
        AbstractC22676k.m65750j(userId, "userId");
        AbstractC22676k.m65750j(userName, "userName");
        return mapDomain(this.guestApi.getGuestUser(GuestUserRequest.INSTANCE.create(userId, userName)), new C18014b(29));
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d getMessage(String messageId) {
        AbstractC22676k.m65750j(messageId, "messageId");
        return mapDomain(this.messageApi.getMessage(messageId), new C19052b(8));
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d getNewerReplies(String parentId, int limit, String lastId) {
        AbstractC22676k.m65750j(parentId, "parentId");
        return mapDomain(this.messageApi.getNewerReplies(parentId, limit, lastId), new C19052b(11));
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d getPendingMessage(String messageId) {
        AbstractC22676k.m65750j(messageId, "messageId");
        return mapDomain(this.messageApi.getMessage(messageId), new C18014b(23));
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d getPinnedMessages(String channelType, String channelId, int limit, QuerySorter<Message> sort, PinnedMessagesPagination pagination) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        AbstractC22676k.m65750j(sort, "sort");
        AbstractC22676k.m65750j(pagination, "pagination");
        return mapDomain(this.channelApi.getPinnedMessages(channelType, channelId, PinnedMessagesRequest.INSTANCE.create(limit, sort, pagination)), new C18014b(20));
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d getPoll(String pollId) {
        AbstractC22676k.m65750j(pollId, "pollId");
        return mapDomain(this.pollsApi.getPoll(pollId), new C19052b(27));
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d getReactions(String messageId, int offset, int limit) {
        AbstractC22676k.m65750j(messageId, "messageId");
        return mapDomain(this.messageApi.getReactions(messageId, offset, limit), new C19052b(3));
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d getReplies(String messageId, int limit) {
        AbstractC22676k.m65750j(messageId, "messageId");
        return mapDomain(this.messageApi.getReplies(messageId, limit), new C19052b(29));
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d getRepliesMore(String messageId, String firstId, int limit) {
        AbstractC22676k.m65750j(messageId, "messageId");
        AbstractC22676k.m65750j(firstId, "firstId");
        return mapDomain(this.messageApi.getRepliesMore(messageId, limit, firstId), new C19052b(13));
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d getSyncHistory(List<String> channelIds, String lastSyncAt) {
        AbstractC22676k.m65750j(channelIds, "channelIds");
        AbstractC22676k.m65750j(lastSyncAt, "lastSyncAt");
        return AbstractC27476f.m82909g(this.generalApi.getSyncHistory(new SyncHistoryRequest(channelIds, lastSyncAt), getConnectionId()), new C19053c(this.eventMapping, 1));
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d getThread(String messageId, GetThreadOptions options) {
        AbstractC22676k.m65750j(messageId, "messageId");
        AbstractC22676k.m65750j(options, "options");
        C18656a0 c18656a0 = new C18656a0(this, messageId, options, 3);
        if (!AbstractC39414r.m125890i0(getConnectionId()) || !options.getWatch()) {
            return (InterfaceC27474d) c18656a0.invoke();
        }
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339eM7232c = logger.m7232c();
        EnumC2341g enumC2341g = EnumC2341g.INFO;
        if (interfaceC2339eM7232c.isLoggable(enumC2341g, logger.m7231b())) {
            logger.m7230a().log(enumC2341g, logger.m7231b(), "[getThread] postponing because an active connection is required", null);
        }
        return postponeCall(c18656a0);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d getUnreadCounts() {
        return mapDomain(this.generalApi.getUnreadCounts(), new C18014b(28));
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d hideChannel(String channelType, String channelId, boolean clearHistory) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        return AbstractC27476f.m82913k(this.channelApi.hideChannel(channelType, channelId, new HideChannelRequest(clearHistory)));
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d inviteMembers(String channelType, String channelId, List<String> members, Message systemMessage, Boolean skipPush) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        AbstractC22676k.m65750j(members, "members");
        return AbstractC27476f.m82909g(this.channelApi.inviteMembers(channelType, channelId, new InviteMembersRequest(members, systemMessage != null ? this.dtoMapping.toDto$stream_chat_android_client_release(systemMessage) : null, skipPush)), new C190402(this));
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d markAllRead() {
        return AbstractC27476f.m82913k(ChannelApi.markAllRead$default(this.channelApi, null, 1, null));
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d markDelivered(List<Message> messages) {
        AbstractC22676k.m65750j(messages, "messages");
        return AbstractC27476f.m82913k(this.channelApi.markDelivered(MarkDeliveredRequest.INSTANCE.create(messages)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d markRead(String channelType, String channelId, String messageId) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        AbstractC22676k.m65750j(messageId, "messageId");
        return AbstractC27476f.m82913k(this.channelApi.markRead(channelType, channelId, new MarkReadRequest(messageId, null, 2, 0 == true ? 1 : 0)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d markThreadRead(String channelType, String channelId, String threadId) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        AbstractC22676k.m65750j(threadId, "threadId");
        return AbstractC27476f.m82913k(this.channelApi.markRead(channelType, channelId, new MarkReadRequest(null, threadId, 1, 0 == true ? 1 : 0)));
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d markUnread(String channelType, String channelId, String messageId, Date messageTimestamp, String threadId) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        return AbstractC27476f.m82913k(this.channelApi.markUnread(channelType, channelId, new MarkUnreadRequest(messageId, messageTimestamp, threadId)));
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d muteChannel(String channelType, String channelId, Integer expiration) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        return AbstractC27476f.m82913k(this.moderationApi.muteChannel(new MuteChannelRequest(AbstractC18489d0.m53370k(channelType, ":", channelId), expiration)));
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d muteCurrentUser() {
        return muteUser(getUserId(), null);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d muteUser(String userId, Integer timeout) {
        AbstractC22676k.m65750j(userId, "userId");
        return mapDomain(this.moderationApi.muteUser(new MuteUserRequest(userId, getUserId(), timeout)), new C18014b(17));
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    /* JADX INFO: renamed from: og */
    public final InterfaceC27474d mo54539og(String url) {
        AbstractC22676k.m65750j(url, "url");
        return mapDomain(this.ogApi.get(url), new C19054d(6));
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d partialUpdateMember(String channelType, String channelId, String userId, Map<String, ? extends Object> set, List<String> unset) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        AbstractC22676k.m65750j(userId, "userId");
        AbstractC22676k.m65750j(set, "set");
        AbstractC22676k.m65750j(unset, "unset");
        return mapDomain(this.channelApi.partialUpdateMember(channelType, channelId, userId, new UpdateMemberPartialRequest(set, unset)), new C19052b(25));
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d partialUpdateMessage(String messageId, Map<String, ? extends Object> set, List<String> unset, boolean skipEnrichUrl) {
        AbstractC22676k.m65750j(messageId, "messageId");
        AbstractC22676k.m65750j(set, "set");
        AbstractC22676k.m65750j(unset, "unset");
        return mapDomain(this.messageApi.partialUpdateMessage(messageId, new PartialUpdateMessageRequest(toDto(set), unset, skipEnrichUrl)), new C18014b(14));
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d partialUpdatePoll(String pollId, Map<String, ? extends Object> set, List<String> unset) {
        AbstractC22676k.m65750j(pollId, "pollId");
        AbstractC22676k.m65750j(set, "set");
        AbstractC22676k.m65750j(unset, "unset");
        return mapDomain(this.pollsApi.partialUpdatePoll(pollId, new PartialUpdatePollRequest(set, unset)), new C19052b(17));
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d partialUpdateThread(String messageId, Map<String, ? extends Object> set, List<String> unset) {
        AbstractC22676k.m65750j(messageId, "messageId");
        AbstractC22676k.m65750j(set, "set");
        AbstractC22676k.m65750j(unset, "unset");
        return mapDomain(this.threadsApi.partialUpdateThread(messageId, new PartialUpdateThreadRequest(set, unset)), new C19052b(1));
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d partialUpdateUser(String id4, Map<String, ? extends Object> set, List<String> unset) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(set, "set");
        AbstractC22676k.m65750j(unset, "unset");
        return mapDomain(this.userApi.partialUpdateUsers(getConnectionId(), new PartialUpdateUsersRequest(AbstractC37056f.m118958J(new PartialUpdateUserDto(id4, set, unset)))), new C19052b(16));
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d queryActiveLocations() {
        return mapDomain(this.userApi.liveLocations(), new C18014b(19));
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d queryBannedUsers(FilterObject filter, QuerySorter<BannedUsersSort> sort, Integer offset, Integer limit, Date createdAtAfter, Date createdAtAfterOrEqual, Date createdAtBefore, Date createdAtBeforeOrEqual) {
        AbstractC22676k.m65750j(filter, "filter");
        AbstractC22676k.m65750j(sort, "sort");
        return mapDomain(this.moderationApi.queryBannedUsers(new QueryBannedUsersRequest(FilterObjectToMapKt.toMap(filter), sort.toDto(), offset, limit, createdAtAfter, createdAtAfterOrEqual, createdAtBefore, createdAtBeforeOrEqual)), new C19052b(22));
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d queryBlockedUsers() {
        return mapDomain(this.userApi.queryBlockedUsers(), new C19052b(12));
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d queryChannel(String channelType, String channelId, QueryChannelRequest query) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        AbstractC22676k.m65750j(query, "query");
        C1012d c1012d = new C1012d(channelId, this, channelType, new io.getstream.chat.android.client.api2.model.requests.QueryChannelRequest(query.getState(), query.getWatch(), query.getPresence(), query.getMessages(), query.getWatchers(), query.getMembers(), query.getData()));
        boolean z4 = query.getWatch() || query.getPresence();
        if (!AbstractC39414r.m125890i0(getConnectionId()) || !z4) {
            return (InterfaceC27474d) c1012d.invoke();
        }
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339eM7232c = logger.m7232c();
        EnumC2341g enumC2341g = EnumC2341g.INFO;
        if (interfaceC2339eM7232c.isLoggable(enumC2341g, logger.m7231b())) {
            logger.m7230a().log(enumC2341g, logger.m7231b(), "[queryChannel] postponing because an active connection is required", null);
        }
        return postponeCall(c1012d);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d queryChannels(io.getstream.chat.android.client.api.models.QueryChannelsRequest query) {
        AbstractC22676k.m65750j(query, "query");
        C17841d c17841d = new C17841d(15, this, new QueryChannelsRequest(query.getPredefinedFilter() != null ? null : FilterObjectToMapKt.toMap(query.getFilter()), query.getPredefinedFilter() == null ? query.getSort() : null, query.getPredefinedFilter(), query.getFilterValues(), query.getSortValues(), query.getOffset(), query.getLimit(), query.getMessageLimit(), query.getMemberLimit(), query.getState(), query.getWatch(), query.getPresence()));
        boolean z4 = query.getWatch() || query.getPresence();
        if (!AbstractC39414r.m125890i0(getConnectionId()) || !z4) {
            return (InterfaceC27474d) c17841d.invoke();
        }
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339eM7232c = logger.m7232c();
        EnumC2341g enumC2341g = EnumC2341g.INFO;
        if (interfaceC2339eM7232c.isLoggable(enumC2341g, logger.m7231b())) {
            logger.m7230a().log(enumC2341g, logger.m7231b(), "[queryChannels] postponing because an active connection is required", null);
        }
        return postponeCall(c17841d);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d queryDraftMessages(Integer offset, Integer limit) {
        return mapDomain(this.messageApi.queryDraftMessages(new QueryDraftMessagesRequest(offset, limit)), new C19054d(5));
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d queryDrafts(FilterObject filter, Integer limit, String next, QuerySorter<DraftsSort> sort) {
        AbstractC22676k.m65750j(filter, "filter");
        AbstractC22676k.m65750j(sort, "sort");
        return mapDomain(this.messageApi.queryDrafts(new QueryDraftsRequest(FilterObjectToMapKt.toMap(filter), limit, next, sort.toDto())), new C19052b(14));
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d queryMembers(String channelType, String channelId, int offset, int limit, FilterObject filter, QuerySorter<Member> sort, List<Member> members) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        AbstractC22676k.m65750j(filter, "filter");
        AbstractC22676k.m65750j(sort, "sort");
        AbstractC22676k.m65750j(members, "members");
        DtoMapping dtoMapping = this.dtoMapping;
        Map<String, Object> map = FilterObjectToMapKt.toMap(filter);
        List<Map<String, Object>> dto = sort.toDto();
        List<Member> list = members;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(dtoMapping.toDto$stream_chat_android_client_release((Member) it.next()));
        }
        return mapDomain(this.generalApi.queryMembers(new QueryMembersRequest(channelType, channelId, map, offset, limit, dto, arrayList)), new C18014b(26));
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d queryPollVotes(String pollId, FilterObject filter, Integer limit, String next, QuerySorter<Vote> sort) {
        AbstractC22676k.m65750j(pollId, "pollId");
        return mapDomain(this.pollsApi.queryPollVotes(pollId, new QueryPollVotesRequest(filter != null ? FilterObjectToMapKt.toMap(filter) : null, limit, next, sort != null ? sort.toDto() : null)), new C19052b(18));
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d queryPolls(FilterObject filter, Integer limit, String next, QuerySorter<Poll> sort) {
        return mapDomain(this.pollsApi.queryPolls(new QueryPollsRequest(filter != null ? FilterObjectToMapKt.toMap(filter) : null, limit, next, sort != null ? sort.toDto() : null)), new C19052b(4));
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d queryReactions(String messageId, FilterObject filter, Integer limit, String next, QuerySorter<Reaction> sort) {
        AbstractC22676k.m65750j(messageId, "messageId");
        return mapDomain(this.messageApi.queryReactions(messageId, new QueryReactionsRequest(filter != null ? FilterObjectToMapKt.toMap(filter) : null, limit, next, sort != null ? sort.toDto() : null)), new C19052b(26));
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d queryReminders(FilterObject filter, int limit, String next, QuerySorter<MessageReminder> sort) {
        AbstractC22676k.m65750j(filter, "filter");
        AbstractC22676k.m65750j(sort, "sort");
        return mapDomain(this.remindersApi.queryReminders(new QueryRemindersRequest(FilterObjectToMapKt.toMap(filter), limit, next, sort.toDto())), new C19054d(1));
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d queryThreads(QueryThreadsRequest query) {
        AbstractC22676k.m65750j(query, "query");
        C17841d c17841d = new C17841d(13, this, query);
        if (!AbstractC39414r.m125890i0(getConnectionId()) || !query.getWatch()) {
            return (InterfaceC27474d) c17841d.invoke();
        }
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339eM7232c = logger.m7232c();
        EnumC2341g enumC2341g = EnumC2341g.INFO;
        if (interfaceC2339eM7232c.isLoggable(enumC2341g, logger.m7231b())) {
            logger.m7230a().log(enumC2341g, logger.m7231b(), "[queryThreads] postponing because an active connection is required", null);
        }
        return postponeCall(c17841d);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d queryUsers(io.getstream.chat.android.client.api.models.QueryUsersRequest queryUsers) {
        AbstractC22676k.m65750j(queryUsers, "queryUsers");
        C17841d c17841d = new C17841d(14, this, new QueryUsersRequest(FilterObjectToMapKt.toMap(queryUsers.getFilter()), queryUsers.getOffset(), queryUsers.getLimit(), queryUsers.getSort(), queryUsers.getPresence()));
        return (AbstractC39414r.m125890i0(getConnectionId()) && queryUsers.getPresence()) ? postponeCall(c17841d) : (InterfaceC27474d) c17841d.invoke();
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d rejectInvite(String channelType, String channelId) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        return AbstractC27476f.m82909g(this.channelApi.rejectInvite(channelType, channelId, new RejectInviteRequest(false, 1, null)), new C190411(this));
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final void releaseConnection() {
        C13045h2 c13045h2 = (C13045h2) this._connectionId;
        c13045h2.getClass();
        c13045h2.m36571k(null, "");
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d removeMembers(String channelType, String channelId, List<String> members, Message systemMessage, Boolean skipPush) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        AbstractC22676k.m65750j(members, "members");
        return AbstractC27476f.m82909g(this.channelApi.removeMembers(channelType, channelId, new RemoveMembersRequest(members, systemMessage != null ? this.dtoMapping.toDto$stream_chat_android_client_release(systemMessage) : null, skipPush)), new C190422(this));
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d removePollVote(String messageId, String pollId, String voteId) {
        AbstractC22676k.m65750j(messageId, "messageId");
        AbstractC22676k.m65750j(pollId, "pollId");
        AbstractC22676k.m65750j(voteId, "voteId");
        return mapDomain(this.pollsApi.removePollVote(messageId, pollId, voteId), new C18014b(22));
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d searchMessages(FilterObject channelFilter, FilterObject messageFilter, Integer offset, Integer limit, String next, QuerySorter<Message> sort) {
        AbstractC22676k.m65750j(channelFilter, "channelFilter");
        AbstractC22676k.m65750j(messageFilter, "messageFilter");
        return mapDomain(this.generalApi.searchMessages(new SearchMessagesRequest(FilterObjectToMapKt.toMap(channelFilter), FilterObjectToMapKt.toMap(messageFilter), offset, limit, next, sort != null ? sort.toDto() : null)), new C18014b(15));
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d sendAction(SendActionRequest request) {
        AbstractC22676k.m65750j(request, "request");
        return mapDomain(this.messageApi.sendAction(request.getMessageId(), new io.getstream.chat.android.client.api2.model.requests.SendActionRequest(request.getChannelId(), request.getMessageId(), request.getType(), request.getFormData())), new C19052b(28));
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d sendEvent(String eventType, String channelType, String channelId, Map<Object, ? extends Object> extraData) {
        AbstractC22676k.m65750j(eventType, "eventType");
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        AbstractC22676k.m65750j(extraData, "extraData");
        EventMapping eventMapping = this.eventMapping;
        LinkedHashMap linkedHashMapM73993b0 = AbstractC25247g0.m73993b0(new C23465k("type", eventType));
        linkedHashMapM73993b0.putAll(extraData);
        return AbstractC27476f.m82909g(this.channelApi.sendEvent(channelType, channelId, new SendEventRequest(linkedHashMapM73993b0)), new C19053c(eventMapping, 0));
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d sendFile(String channelType, String channelId, File file, ProgressCallback callback) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        AbstractC22676k.m65750j(file, "file");
        return new C27478h(this.coroutineScope, new C190431(file, callback, channelType, channelId, null));
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d sendImage(String channelType, String channelId, File file, ProgressCallback callback) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        AbstractC22676k.m65750j(file, "file");
        return new C27478h(this.coroutineScope, new C190441(file, callback, channelType, channelId, null));
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d sendMessage(String channelType, String channelId, Message message) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        AbstractC22676k.m65750j(message, "message");
        return mapDomain(this.messageApi.sendMessage(channelType, channelId, new SendMessageRequest(this.dtoMapping.toDto$stream_chat_android_client_release(message), message.getSkipPushNotification(), message.getSkipEnrichUrl())), new C19054d(4));
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d sendReaction(Reaction reaction, boolean enforceUnique, boolean skipPush) {
        AbstractC22676k.m65750j(reaction, "reaction");
        return mapDomain(this.messageApi.sendReaction(reaction.getMessageId(), new ReactionRequest(this.dtoMapping.toDto$stream_chat_android_client_release(reaction), enforceUnique, skipPush)), new C19052b(19));
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d setChannelPushPreference(String cid, PushPreferenceLevel level) {
        AbstractC22676k.m65750j(cid, "cid");
        AbstractC22676k.m65750j(level, "level");
        return parseChannelPushPreferencesResponse(this.pushPreferencesApi.upsertPushPreferences(new UpsertPushPreferencesRequest(AbstractC37056f.m118958J(new UpstreamPushPreferenceInputDto(cid, level.getValue(), null, Boolean.TRUE)))), cid);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final void setConnection(String userId, String connectionId) {
        AbstractC22676k.m65750j(userId, "userId");
        AbstractC22676k.m65750j(connectionId, "connectionId");
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339eM7232c = logger.m7232c();
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        if (interfaceC2339eM7232c.isLoggable(enumC2341g, logger.m7231b())) {
            logger.m7230a().log(enumC2341g, logger.m7231b(), AbstractC2875y.m8300m("[setConnection] userId: '", userId, "', connectionId: '", connectionId, "'"), null);
        }
        this.userId = userId;
        C13045h2 c13045h2 = (C13045h2) this._connectionId;
        c13045h2.getClass();
        c13045h2.m36571k(null, connectionId);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d setUserPushPreference(PushPreferenceLevel level) {
        AbstractC22676k.m65750j(level, "level");
        return parseUserPushPreferencesResponse(this.pushPreferencesApi.upsertPushPreferences(new UpsertPushPreferencesRequest(AbstractC37056f.m118958J(new UpstreamPushPreferenceInputDto(null, level.getValue(), null, Boolean.TRUE)))));
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d showChannel(String channelType, String channelId) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        return AbstractC27476f.m82913k(this.channelApi.showChannel(channelType, channelId, C25272z.f99163w));
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d snoozeChannelPushNotifications(String cid, Date until) {
        AbstractC22676k.m65750j(cid, "cid");
        AbstractC22676k.m65750j(until, "until");
        return parseChannelPushPreferencesResponse(this.pushPreferencesApi.upsertPushPreferences(new UpsertPushPreferencesRequest(AbstractC37056f.m118958J(new UpstreamPushPreferenceInputDto(cid, null, until, null)))), cid);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d snoozeUserPushNotifications(Date until) {
        AbstractC22676k.m65750j(until, "until");
        return parseUserPushPreferencesResponse(this.pushPreferencesApi.upsertPushPreferences(new UpsertPushPreferencesRequest(AbstractC37056f.m118958J(new UpstreamPushPreferenceInputDto(null, null, until, null)))));
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d stopLiveLocation(Location location) {
        AbstractC22676k.m65750j(location, "location");
        return mapDomain(this.userApi.updateLiveLocation(new UpdateLiveLocationRequest(location.getMessageId(), null, null, location.getDeviceId(), location.getEndAt(), 6, null)), new C18014b(16));
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d stopWatching(String channelType, String channelId) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        return postponeCall(new C18656a0(this, channelType, channelId, 2));
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d translate(String messageId, String language) {
        AbstractC22676k.m65750j(messageId, "messageId");
        AbstractC22676k.m65750j(language, "language");
        return mapDomain(this.messageApi.translate(messageId, new TranslateMessageRequest(language)), new C19052b(24));
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d truncateChannel(String channelType, String channelId, Message systemMessage) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        return AbstractC27476f.m82909g(this.channelApi.truncateChannel(channelType, channelId, new TruncateChannelRequest(systemMessage != null ? this.dtoMapping.toDto$stream_chat_android_client_release(systemMessage) : null)), new C190452(this));
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d unbanUser(String targetId, String channelType, String channelId, boolean shadow) {
        AbstractC22676k.m65750j(targetId, "targetId");
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        return AbstractC27476f.m82913k(this.moderationApi.unbanUser(targetId, channelType, channelId, shadow));
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d unblockUser(String userId) {
        AbstractC22676k.m65750j(userId, "userId");
        return AbstractC27476f.m82913k(this.userApi.unblockUser(new UnblockUserRequest(userId)));
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d unflagMessage(String messageId) {
        AbstractC22676k.m65750j(messageId, "messageId");
        return unflag(AbstractC25247g0.m73993b0(new C23465k("target_message_id", messageId)));
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d unflagUser(String userId) {
        AbstractC22676k.m65750j(userId, "userId");
        return unflag(AbstractC25247g0.m73993b0(new C23465k("target_user_id", userId)));
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d unmuteChannel(String channelType, String channelId) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        return AbstractC27476f.m82913k(this.moderationApi.unmuteChannel(new MuteChannelRequest(AbstractC18489d0.m53370k(channelType, ":", channelId), null)));
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d unmuteCurrentUser() {
        return unmuteUser(getUserId());
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d unmuteUser(String userId) {
        AbstractC22676k.m65750j(userId, "userId");
        return AbstractC27476f.m82913k(this.moderationApi.unmuteUser(new MuteUserRequest(userId, getUserId(), null)));
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d updateChannel(String channelType, String channelId, Map<String, ? extends Object> extraData, Message updateMessage) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        AbstractC22676k.m65750j(extraData, "extraData");
        return AbstractC27476f.m82909g(this.channelApi.updateChannel(channelType, channelId, new UpdateChannelRequest(extraData, updateMessage != null ? this.dtoMapping.toDto$stream_chat_android_client_release(updateMessage) : null)), new C190462(this));
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d updateChannelPartial(String channelType, String channelId, Map<String, ? extends Object> set, List<String> unset) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        AbstractC22676k.m65750j(set, "set");
        AbstractC22676k.m65750j(unset, "unset");
        return AbstractC27476f.m82909g(this.channelApi.updateChannelPartial(channelType, channelId, new UpdateChannelPartialRequest(set, unset)), new C190471(this));
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d updateLiveLocation(Location location) {
        AbstractC22676k.m65750j(location, "location");
        return mapDomain(this.userApi.updateLiveLocation(new UpdateLiveLocationRequest(location.getMessageId(), Double.valueOf(location.getLatitude()), Double.valueOf(location.getLongitude()), location.getDeviceId(), null, 16, null)), new C19052b(9));
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d updateMessage(Message message) {
        AbstractC22676k.m65750j(message, "message");
        return mapDomain(this.messageApi.updateMessage(message.getId(), new UpdateMessageRequest(this.dtoMapping.toDto$stream_chat_android_client_release(message), message.getSkipEnrichUrl(), message.getSkipPushNotification())), new C18014b(21));
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d updatePoll(UpdatePollRequest request) {
        ArrayList arrayList;
        String str;
        AbstractC22676k.m65750j(request, "request");
        Boolean allowAnswers = request.getAllowAnswers();
        Boolean allowUserSuggestedOptions = request.getAllowUserSuggestedOptions();
        String description = request.getDescription();
        Boolean enforceUniqueVote = request.getEnforceUniqueVote();
        String id4 = request.getId();
        Boolean boolIsClosed = request.isClosed();
        Integer maxVotesAllowed = request.getMaxVotesAllowed();
        String name = request.getName();
        List<PollOption> options = request.getOptions();
        if (options != null) {
            List<PollOption> list = options;
            arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
            for (PollOption pollOption : list) {
                arrayList.add(new UpstreamOptionDto(pollOption.getId(), pollOption.getText(), pollOption.getExtraData()));
            }
        } else {
            arrayList = null;
        }
        ArrayList arrayList2 = arrayList;
        int i13 = WhenMappings.$EnumSwitchMapping$0[request.getVotingVisibility().ordinal()];
        if (i13 == 1) {
            str = CreatePollRequest.VOTING_VISIBILITY_PUBLIC;
        } else {
            if (i13 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            str = CreatePollRequest.VOTING_VISIBILITY_ANONYMOUS;
        }
        return mapDomain(this.pollsApi.updatePoll(new io.getstream.chat.android.client.api2.model.requests.UpdatePollRequest(allowAnswers, allowUserSuggestedOptions, description, enforceUniqueVote, id4, boolIsClosed, maxVotesAllowed, name, arrayList2, str, request.getExtraData())), new C19054d(2));
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d updatePollOption(String pollId, PollOption option) {
        AbstractC22676k.m65750j(pollId, "pollId");
        AbstractC22676k.m65750j(option, "option");
        return mapDomain(this.pollsApi.updatePollOption(pollId, new UpstreamOptionDto(option.getId(), option.getText(), option.getExtraData())), new C19052b(23));
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d updateReminder(String messageId, Date remindAt) {
        AbstractC22676k.m65750j(messageId, "messageId");
        return mapDomain(this.remindersApi.updateReminder(messageId, new ReminderRequest(remindAt)), new C18014b(13));
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d updateUsers(List<User> users) {
        AbstractC22676k.m65750j(users, "users");
        UserApi userApi = this.userApi;
        String connectionId = getConnectionId();
        DtoMapping dtoMapping = this.dtoMapping;
        List<User> list = users;
        int iM73988W = AbstractC25247g0.m73988W(AbstractC25267u.m74163i0(list, 10));
        if (iM73988W < 16) {
            iM73988W = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM73988W);
        for (User user : list) {
            linkedHashMap.put(user.getId(), dtoMapping.toDto$stream_chat_android_client_release(user));
        }
        return mapDomain(userApi.updateUsers(connectionId, new UpdateUsersRequest(linkedHashMap)), new C19052b(15));
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d uploadFile(File file, ProgressCallback progressCallback) {
        AbstractC22676k.m65750j(file, "file");
        return new C27478h(this.coroutineScope, new C190491(file, progressCallback, null));
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d uploadImage(File file, ProgressCallback progressCallback) {
        AbstractC22676k.m65750j(file, "file");
        return new C27478h(this.coroutineScope, new C190501(file, progressCallback, null));
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final void warmUp() {
        this.generalApi.warmUp().enqueue();
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d deleteFile(String url) {
        AbstractC22676k.m65750j(url, "url");
        return new C27478h(this.coroutineScope, new C190372(url, null));
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d deleteImage(String url) {
        AbstractC22676k.m65750j(url, "url");
        return new C27478h(this.coroutineScope, new C190392(url, null));
    }
}
