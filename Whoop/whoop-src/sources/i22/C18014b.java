package i22;

import androidx.compose.runtime.Composer;
import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4351m;
import h91.C17027b;
import ie1.C18443a;
import ig0.C18461a;
import ih0.C18482a;
import ih1.C18517a;
import io.getstream.chat.android.client.api2.MoshiChatApi;
import io.getstream.chat.android.client.api2.mapping.DomainMapping;
import io.getstream.chat.android.client.api2.model.dto.DownstreamLocationDto;
import io.getstream.chat.android.client.api2.model.dto.UnreadDto;
import io.getstream.chat.android.client.api2.model.response.BlockUserResponse;
import io.getstream.chat.android.client.api2.model.response.LiveLocationsResponse;
import io.getstream.chat.android.client.api2.model.response.MessageResponse;
import io.getstream.chat.android.client.api2.model.response.MessagesResponse;
import io.getstream.chat.android.client.api2.model.response.MuteUserResponse;
import io.getstream.chat.android.client.api2.model.response.PollOptionResponse;
import io.getstream.chat.android.client.api2.model.response.PollResponse;
import io.getstream.chat.android.client.api2.model.response.PollVoteResponse;
import io.getstream.chat.android.client.api2.model.response.QueryMembersResponse;
import io.getstream.chat.android.client.api2.model.response.ReminderResponse;
import io.getstream.chat.android.client.api2.model.response.SearchMessagesResponse;
import io.getstream.chat.android.client.api2.model.response.TokenResponse;
import io.getstream.chat.android.client.api2.model.response.UsersResponse;
import java.util.Map;
import p635y2.InterfaceC39124q0;
import p710im1.AbstractC18668f;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: i22.b */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C18014b implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f69927w;

    public /* synthetic */ C18014b(int i13) {
        this.f69927w = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f69927w) {
            case 0:
                return AbstractC18015c.m51720A((String) obj, (Map) obj2);
            case 1:
                return AbstractC18015c.m51735P((String) obj, (Map) obj2);
            case 2:
                InterfaceC39124q0 intrinsicMeasurable = (InterfaceC39124q0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                AbstractC22676k.m65750j(intrinsicMeasurable, "intrinsicMeasurable");
                return Integer.valueOf(intrinsicMeasurable.mo449b(iIntValue));
            case 3:
                InterfaceC39124q0 intrinsicMeasurable2 = (InterfaceC39124q0) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                AbstractC22676k.m65750j(intrinsicMeasurable2, "intrinsicMeasurable");
                return Integer.valueOf(intrinsicMeasurable2.mo446O(iIntValue2));
            case 4:
                InterfaceC39124q0 intrinsicMeasurable3 = (InterfaceC39124q0) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                AbstractC22676k.m65750j(intrinsicMeasurable3, "intrinsicMeasurable");
                return Integer.valueOf(intrinsicMeasurable3.mo438C(iIntValue3));
            case 5:
                InterfaceC39124q0 intrinsicMeasurable4 = (InterfaceC39124q0) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                AbstractC22676k.m65750j(intrinsicMeasurable4, "intrinsicMeasurable");
                return Integer.valueOf(intrinsicMeasurable4.mo447Q(iIntValue4));
            case 6:
                return C18443a.m53142f((Composer) obj, ((Integer) obj2).intValue());
            case 7:
                return C18461a.m53201c((Composer) obj, ((Integer) obj2).intValue());
            case 8:
                return C18482a.m53325f((Composer) obj, ((Integer) obj2).intValue());
            case 9:
                return C18482a.m53324e((Composer) obj, ((Integer) obj2).intValue());
            case 10:
                return C18517a.m53633c((Composer) obj, ((Integer) obj2).intValue());
            case 11:
                return AbstractC18668f.m54186j((C17027b) obj, ((Integer) obj2).intValue());
            case 12:
                return MoshiChatApi.createPoll$lambda$114((DomainMapping) obj, (PollResponse) obj2);
            case 13:
                return MoshiChatApi.updateReminder$lambda$119((DomainMapping) obj, (ReminderResponse) obj2);
            case 14:
                return MoshiChatApi.partialUpdateMessage$lambda$15((DomainMapping) obj, (MessageResponse) obj2);
            case 15:
                return MoshiChatApi.searchMessages$lambda$77((DomainMapping) obj, (SearchMessagesResponse) obj2);
            case 16:
                return MoshiChatApi.stopLiveLocation$lambda$124((DomainMapping) obj, (DownstreamLocationDto) obj2);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return MoshiChatApi.muteUser$lambda$31((DomainMapping) obj, (MuteUserResponse) obj2);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return MoshiChatApi.m54592c((DomainMapping) obj, (UsersResponse) obj2);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return MoshiChatApi.m54624t((DomainMapping) obj, (LiveLocationsResponse) obj2);
            case 20:
                return MoshiChatApi.m54567F((DomainMapping) obj, (MessagesResponse) obj2);
            case 21:
                return MoshiChatApi.updateMessage$lambda$14((DomainMapping) obj, (MessageResponse) obj2);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return MoshiChatApi.removePollVote$lambda$107((DomainMapping) obj, (PollVoteResponse) obj2);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return MoshiChatApi.getPendingMessage$lambda$20((DomainMapping) obj, (MessageResponse) obj2);
            case 24:
                return MoshiChatApi.deleteMessage$lambda$21((DomainMapping) obj, (MessageResponse) obj2);
            case 25:
                return MoshiChatApi.blockUser$lambda$67((DomainMapping) obj, (BlockUserResponse) obj2);
            case 26:
                return MoshiChatApi.m54603h0((DomainMapping) obj, (QueryMembersResponse) obj2);
            case 27:
                return MoshiChatApi.createPollOption$lambda$109((DomainMapping) obj, (PollOptionResponse) obj2);
            case 28:
                return MoshiChatApi.getUnreadCounts$lambda$41((DomainMapping) obj, (UnreadDto) obj2);
            default:
                return MoshiChatApi.getGuestUser$lambda$71((DomainMapping) obj, (TokenResponse) obj2);
        }
    }
}
