package com.whoop.community.data.network;

import com.mapbox.maps.MapboxMap;
import com.whoop.profile.domain.ProfileApiKt;
import java.util.List;
import l83.C23454a0;
import p715kotlin.Metadata;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import ud3.C34820i0;
import wg3.InterfaceC37270a;
import wg3.InterfaceC37275f;
import wg3.InterfaceC37281l;
import wg3.InterfaceC37284o;
import wg3.InterfaceC37285p;
import wg3.InterfaceC37286q;
import wg3.InterfaceC37288s;
import wg3.InterfaceC37289t;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0003\u0010\u0004J.\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\t\u001a\u00020\u0007H§@¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\b\b\u0001\u0010\u000e\u001a\u00020\rH§@¢\u0006\u0004\b\u0011\u0010\u0012J*\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\b\b\u0001\u0010\u0013\u001a\u00020\u00072\b\b\u0001\u0010\u000e\u001a\u00020\rH§@¢\u0006\u0004\b\u0014\u0010\u0015J0\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00190\u000f2\b\b\u0001\u0010\u0017\u001a\u00020\u00162\b\b\u0001\u0010\u0018\u001a\u00020\u0016H§@¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\b\u0001\u0010\u001d\u001a\u00020\u0016H§@¢\u0006\u0004\b\u001f\u0010 J*\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\b\b\u0001\u0010\u001d\u001a\u00020\u00162\b\b\u0001\u0010!\u001a\u00020\u0007H§@¢\u0006\u0004\b\"\u0010#J*\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\b\b\u0001\u0010\u001d\u001a\u00020\u00162\b\b\u0001\u0010%\u001a\u00020$H§@¢\u0006\u0004\b&\u0010'J \u0010)\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\b\b\u0001\u0010\u000e\u001a\u00020(H§@¢\u0006\u0004\b)\u0010*J\u0016\u0010,\u001a\b\u0012\u0004\u0012\u00020+0\u000fH§@¢\u0006\u0004\b,\u0010\u0004¨\u0006-À\u0006\u0003"}, m65681d2 = {"Lcom/whoop/community/data/network/ChatApi;", "", "Lcom/whoop/community/data/network/ChatTokenResponseDto;", "getStreamToken", "(Lq83/d;)Ljava/lang/Object;", "Lud3/i0;", "file", "", "channelId", "channelType", "Lcom/whoop/community/data/network/AttachmentResponseDto;", "uploadChatAttachment", "(Lud3/i0;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/community/data/network/MessageStatus;", "body", "Lpg3/v0;", "Ll83/a0;", "sendMessageStatus", "(Lcom/whoop/community/data/network/MessageStatus;Lq83/d;)Ljava/lang/Object;", "messageId", "sendUpdateMessageStatus", "(Ljava/lang/String;Lcom/whoop/community/data/network/MessageStatus;Lq83/d;)Ljava/lang/Object;", "", MapboxMap.QFE_OFFSET, MapboxMap.QFE_LIMIT, "", "Lcom/whoop/community/data/network/DataWidgetDto;", "getDataWidgets", "(IILq83/d;)Ljava/lang/Object;", ProfileApiKt.COMMUNITY_ID_PARAM, "Lcom/whoop/community/data/network/MemberNotificationSettingsDto;", "getNotificationSetting", "(ILq83/d;)Ljava/lang/Object;", "notificationSetting", "updateNotificationSetting", "(ILjava/lang/String;Lq83/d;)Ljava/lang/Object;", "", "online", "updateUserOnlineStatus", "(IZLq83/d;)Ljava/lang/Object;", "Lcom/whoop/community/data/network/ReportMessage;", "reportMessage", "(Lcom/whoop/community/data/network/ReportMessage;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/community/data/network/ChatUnreadCountDto;", "getUserUnreadMessageCount", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface ChatApi {
    @InterfaceC37275f("community-service/v1/chat/widgets")
    Object getDataWidgets(@InterfaceC37289t(MapboxMap.QFE_OFFSET) int i13, @InterfaceC37289t(MapboxMap.QFE_LIMIT) int i14, InterfaceC30057d<? super C29218v0<List<DataWidgetDto>>> interfaceC30057d);

    @InterfaceC37275f("community-service/v1/communities/{communityId}/member")
    Object getNotificationSetting(@InterfaceC37288s(ProfileApiKt.COMMUNITY_ID_PARAM) int i13, InterfaceC30057d<? super MemberNotificationSettingsDto> interfaceC30057d);

    @InterfaceC37275f("community-service/v1/chat/token")
    Object getStreamToken(InterfaceC30057d<? super ChatTokenResponseDto> interfaceC30057d);

    @InterfaceC37275f("community-service/v1/chat/unread-count")
    Object getUserUnreadMessageCount(InterfaceC30057d<? super C29218v0<ChatUnreadCountDto>> interfaceC30057d);

    @InterfaceC37284o("community-service/v1/chat/report")
    Object reportMessage(@InterfaceC37270a ReportMessage reportMessage, InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d);

    @InterfaceC37284o("community-service/v1/chat/message")
    Object sendMessageStatus(@InterfaceC37270a MessageStatus messageStatus, InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d);

    @InterfaceC37285p("community-service/v1/chat/message/{messageId}")
    Object sendUpdateMessageStatus(@InterfaceC37288s("messageId") String str, @InterfaceC37270a MessageStatus messageStatus, InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d);

    @InterfaceC37285p("community-service/v1/communities/{communityId}/notifications/{notificationSetting}")
    Object updateNotificationSetting(@InterfaceC37288s(ProfileApiKt.COMMUNITY_ID_PARAM) int i13, @InterfaceC37288s("notificationSetting") String str, InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d);

    @InterfaceC37285p("community-service/v1/communities/{communityId}/status")
    Object updateUserOnlineStatus(@InterfaceC37288s(ProfileApiKt.COMMUNITY_ID_PARAM) int i13, @InterfaceC37289t("online") boolean z4, InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d);

    @InterfaceC37284o("community-service/v1/chat/channel/{channelId}/image")
    @InterfaceC37281l
    Object uploadChatAttachment(@InterfaceC37286q C34820i0 c34820i0, @InterfaceC37288s("channelId") String str, @InterfaceC37289t("channelType") String str2, InterfaceC30057d<? super AttachmentResponseDto> interfaceC30057d);
}
