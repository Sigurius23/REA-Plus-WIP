package io.getstream.chat.android.client.api2.mapping;

import io.getstream.chat.android.DeliveryReceipts;
import io.getstream.chat.android.PrivacySettings;
import io.getstream.chat.android.ReadReceipts;
import io.getstream.chat.android.TypingIndicators;
import io.getstream.chat.android.client.api2.model.dto.AttachmentDto;
import io.getstream.chat.android.client.api2.model.dto.DeliveryReceiptsDto;
import io.getstream.chat.android.client.api2.model.dto.DeviceDto;
import io.getstream.chat.android.client.api2.model.dto.PrivacySettingsDto;
import io.getstream.chat.android.client.api2.model.dto.ReadReceiptsDto;
import io.getstream.chat.android.client.api2.model.dto.TypingIndicatorsDto;
import io.getstream.chat.android.client.api2.model.dto.UpstreamConnectedEventDto;
import io.getstream.chat.android.client.api2.model.dto.UpstreamLocationDto;
import io.getstream.chat.android.client.api2.model.dto.UpstreamMemberDataDto;
import io.getstream.chat.android.client.api2.model.dto.UpstreamMemberDto;
import io.getstream.chat.android.client.api2.model.dto.UpstreamMessageDto;
import io.getstream.chat.android.client.api2.model.dto.UpstreamMuteDto;
import io.getstream.chat.android.client.api2.model.dto.UpstreamReactionDto;
import io.getstream.chat.android.client.api2.model.dto.UpstreamUserDto;
import io.getstream.chat.android.client.events.ConnectedEvent;
import io.getstream.chat.android.models.Attachment;
import io.getstream.chat.android.models.Device;
import io.getstream.chat.android.models.DraftMessage;
import io.getstream.chat.android.models.Location;
import io.getstream.chat.android.models.Member;
import io.getstream.chat.android.models.MemberData;
import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.models.MessageTransformer;
import io.getstream.chat.android.models.MessageType;
import io.getstream.chat.android.models.Mute;
import io.getstream.chat.android.models.Reaction;
import io.getstream.chat.android.models.User;
import io.getstream.chat.android.models.UserTransformer;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import m83.AbstractC25260n;
import m83.AbstractC25267u;
import m83.C25271y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\u000b\u001a\u00020\f*\u00020\rH\u0000¢\u0006\u0002\b\u000eJ\u0011\u0010\u000b\u001a\u00020\u000f*\u00020\u0010H\u0000¢\u0006\u0002\b\u000eJ\u0011\u0010\u000b\u001a\u00020\u0011*\u00020\u0012H\u0000¢\u0006\u0002\b\u000eJ\u0011\u0010\u000b\u001a\u00020\u0013*\u00020\u0014H\u0000¢\u0006\u0002\b\u000eJ\u0011\u0010\u000b\u001a\u00020\u0015*\u00020\u0016H\u0000¢\u0006\u0002\b\u000eJ\u0011\u0010\u000b\u001a\u00020\u0017*\u00020\u0018H\u0000¢\u0006\u0002\b\u000eJ\u0011\u0010\u000b\u001a\u00020\u0015*\u00020\u0019H\u0000¢\u0006\u0002\b\u000eJ\u0011\u0010\u000b\u001a\u00020\u001a*\u00020\u001bH\u0000¢\u0006\u0002\b\u000eJ\u0011\u0010\u000b\u001a\u00020\u001c*\u00020\u001dH\u0000¢\u0006\u0002\b\u000eJ\u0011\u0010\u000b\u001a\u00020\u001e*\u00020\u001fH\u0000¢\u0006\u0002\b\u000eJ\u0011\u0010\u000b\u001a\u00020 *\u00020!H\u0000¢\u0006\u0002\b\u000eJ\u0011\u0010\u000b\u001a\u00020\"*\u00020#H\u0000¢\u0006\u0002\b\u000eJ\u0011\u0010\u000b\u001a\u00020$*\u00020%H\u0000¢\u0006\u0002\b\u000eJ\u0011\u0010\u000b\u001a\u00020&*\u00020'H\u0000¢\u0006\u0002\b\u000eJ\u0011\u0010\u000b\u001a\u00020(*\u00020)H\u0000¢\u0006\u0002\b\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006*"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/mapping/DtoMapping;", "", "messageTransformer", "Lio/getstream/chat/android/models/MessageTransformer;", "userTransformer", "Lio/getstream/chat/android/models/UserTransformer;", "<init>", "(Lio/getstream/chat/android/models/MessageTransformer;Lio/getstream/chat/android/models/UserTransformer;)V", "supportedUpstreamMessageTypes", "", "", "toDto", "Lio/getstream/chat/android/client/api2/model/dto/AttachmentDto;", "Lio/getstream/chat/android/models/Attachment;", "toDto$stream_chat_android_client_release", "Lio/getstream/chat/android/client/api2/model/dto/DeviceDto;", "Lio/getstream/chat/android/models/Device;", "Lio/getstream/chat/android/client/api2/model/dto/UpstreamMemberDataDto;", "Lio/getstream/chat/android/models/MemberData;", "Lio/getstream/chat/android/client/api2/model/dto/UpstreamMemberDto;", "Lio/getstream/chat/android/models/Member;", "Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;", "Lio/getstream/chat/android/models/Message;", "Lio/getstream/chat/android/client/api2/model/dto/UpstreamLocationDto;", "Lio/getstream/chat/android/models/Location;", "Lio/getstream/chat/android/models/DraftMessage;", "Lio/getstream/chat/android/client/api2/model/dto/UpstreamMuteDto;", "Lio/getstream/chat/android/models/Mute;", "Lio/getstream/chat/android/client/api2/model/dto/UpstreamReactionDto;", "Lio/getstream/chat/android/models/Reaction;", "Lio/getstream/chat/android/client/api2/model/dto/PrivacySettingsDto;", "Lio/getstream/chat/android/PrivacySettings;", "Lio/getstream/chat/android/client/api2/model/dto/TypingIndicatorsDto;", "Lio/getstream/chat/android/TypingIndicators;", "Lio/getstream/chat/android/client/api2/model/dto/ReadReceiptsDto;", "Lio/getstream/chat/android/ReadReceipts;", "Lio/getstream/chat/android/client/api2/model/dto/DeliveryReceiptsDto;", "Lio/getstream/chat/android/DeliveryReceipts;", "Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;", "Lio/getstream/chat/android/models/User;", "Lio/getstream/chat/android/client/api2/model/dto/UpstreamConnectedEventDto;", "Lio/getstream/chat/android/client/events/ConnectedEvent;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class DtoMapping {
    private final MessageTransformer messageTransformer;
    private final Set<String> supportedUpstreamMessageTypes;
    private final UserTransformer userTransformer;

    public DtoMapping(MessageTransformer messageTransformer, UserTransformer userTransformer) {
        AbstractC22676k.m65750j(messageTransformer, "messageTransformer");
        AbstractC22676k.m65750j(userTransformer, "userTransformer");
        this.messageTransformer = messageTransformer;
        this.userTransformer = userTransformer;
        this.supportedUpstreamMessageTypes = AbstractC25260n.m74059b1(new String[]{"regular", MessageType.SYSTEM});
    }

    public final AttachmentDto toDto$stream_chat_android_client_release(Attachment attachment) {
        AbstractC22676k.m65750j(attachment, "<this>");
        String assetUrl = attachment.getAssetUrl();
        String authorName = attachment.getAuthorName();
        String fallback = attachment.getFallback();
        int fileSize = attachment.getFileSize();
        String image = attachment.getImage();
        String imageUrl = attachment.getImageUrl();
        String mimeType = attachment.getMimeType();
        String name = attachment.getName();
        String ogUrl = attachment.getOgUrl();
        String text = attachment.getText();
        String thumbUrl = attachment.getThumbUrl();
        String title = attachment.getTitle();
        String titleLink = attachment.getTitleLink();
        return new AttachmentDto(assetUrl, authorName, attachment.getAuthorLink(), fallback, Integer.valueOf(fileSize), image, imageUrl, mimeType, name, ogUrl, text, thumbUrl, title, titleLink, attachment.getType(), attachment.getOriginalHeight(), attachment.getOriginalWidth(), attachment.getExtraData());
    }

    public final DeviceDto toDto$stream_chat_android_client_release(Device device) {
        AbstractC22676k.m65750j(device, "<this>");
        return new DeviceDto(device.getToken(), device.getPushProvider().getKey(), device.getProviderName());
    }

    public final UpstreamMemberDataDto toDto$stream_chat_android_client_release(MemberData memberData) {
        AbstractC22676k.m65750j(memberData, "<this>");
        return new UpstreamMemberDataDto(memberData.getUserId(), memberData.getExtraData());
    }

    public final UpstreamMemberDto toDto$stream_chat_android_client_release(Member member) {
        AbstractC22676k.m65750j(member, "<this>");
        return new UpstreamMemberDto(toDto$stream_chat_android_client_release(member.getUser()), member.getCreatedAt(), member.getUpdatedAt(), member.isInvited(), member.getInviteAcceptedAt(), member.getInviteRejectedAt(), Boolean.valueOf(member.getShadowBanned()), Boolean.valueOf(member.getBanned()), member.getChannelRole(), member.getNotificationsMuted(), member.getStatus(), member.getBanExpires(), member.getPinnedAt(), member.getArchivedAt(), member.getExtraData());
    }

    public final UpstreamMessageDto toDto$stream_chat_android_client_release(Message message) {
        AbstractC22676k.m65750j(message, "<this>");
        Message messageTransform = this.messageTransformer.transform(message);
        String type = this.supportedUpstreamMessageTypes.contains(messageTransform.getType()) ? messageTransform.getType() : "";
        List<Attachment> attachments = messageTransform.getAttachments();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(attachments, 10));
        Iterator<T> it = attachments.iterator();
        while (it.hasNext()) {
            arrayList.add(toDto$stream_chat_android_client_release((Attachment) it.next()));
        }
        String cid = messageTransform.getCid();
        String command = messageTransform.getCommand();
        String html = messageTransform.getHtml();
        String id4 = messageTransform.getId();
        List<String> mentionedUsersIds = messageTransform.getMentionedUsersIds();
        String parentId = messageTransform.getParentId();
        Date pinExpires = messageTransform.getPinExpires();
        Boolean boolValueOf = Boolean.valueOf(messageTransform.getPinned());
        Date pinnedAt = messageTransform.getPinnedAt();
        User pinnedBy = messageTransform.getPinnedBy();
        UpstreamUserDto dto$stream_chat_android_client_release = pinnedBy != null ? toDto$stream_chat_android_client_release(pinnedBy) : null;
        String replyMessageId = messageTransform.getReplyMessageId();
        boolean shadowed = messageTransform.getShadowed();
        boolean showInChannel = messageTransform.getShowInChannel();
        boolean silent = messageTransform.getSilent();
        String text = messageTransform.getText();
        List<User> threadParticipants = messageTransform.getThreadParticipants();
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(threadParticipants, 10));
        Iterator<T> it3 = threadParticipants.iterator();
        while (it3.hasNext()) {
            arrayList2.add(toDto$stream_chat_android_client_release((User) it3.next()));
        }
        List<String> restrictedVisibility = messageTransform.getRestrictedVisibility();
        Location sharedLocation = messageTransform.getSharedLocation();
        return new UpstreamMessageDto(arrayList, cid, command, null, html, id4, type, mentionedUsersIds, parentId, pinExpires, boolValueOf, pinnedAt, dto$stream_chat_android_client_release, replyMessageId, shadowed, showInChannel, silent, text, arrayList2, restrictedVisibility, sharedLocation != null ? toDto$stream_chat_android_client_release(sharedLocation) : null, messageTransform.getExtraData());
    }

    public final UpstreamLocationDto toDto$stream_chat_android_client_release(Location location) {
        AbstractC22676k.m65750j(location, "<this>");
        return new UpstreamLocationDto(location.getLatitude(), location.getLongitude(), location.getDeviceId(), location.getEndAt());
    }

    public final UpstreamMessageDto toDto$stream_chat_android_client_release(DraftMessage draftMessage) {
        AbstractC22676k.m65750j(draftMessage, "<this>");
        List<Attachment> attachments = draftMessage.getAttachments();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(attachments, 10));
        Iterator<T> it = attachments.iterator();
        while (it.hasNext()) {
            arrayList.add(toDto$stream_chat_android_client_release((Attachment) it.next()));
        }
        String cid = draftMessage.getCid();
        String command = draftMessage.getCommand();
        String args = draftMessage.getArgs();
        String id4 = draftMessage.getId();
        List<String> mentionedUsersIds = draftMessage.getMentionedUsersIds();
        String parentId = draftMessage.getParentId();
        Message replyMessage = draftMessage.getReplyMessage();
        String id5 = replyMessage != null ? replyMessage.getId() : null;
        boolean showInChannel = draftMessage.getShowInChannel();
        boolean silent = draftMessage.getSilent();
        String text = draftMessage.getText();
        Map<String, Object> extraData = draftMessage.getExtraData();
        C25271y c25271y = C25271y.f99162w;
        return new UpstreamMessageDto(arrayList, cid, command, args, "", id4, "regular", mentionedUsersIds, parentId, null, null, null, null, id5, false, showInChannel, silent, text, c25271y, c25271y, null, extraData);
    }

    public final UpstreamMuteDto toDto$stream_chat_android_client_release(Mute mute) {
        AbstractC22676k.m65750j(mute, "<this>");
        User user = mute.getUser();
        UpstreamUserDto dto$stream_chat_android_client_release = user != null ? toDto$stream_chat_android_client_release(user) : null;
        User target = mute.getTarget();
        return new UpstreamMuteDto(dto$stream_chat_android_client_release, target != null ? toDto$stream_chat_android_client_release(target) : null, mute.getCreatedAt(), mute.getUpdatedAt(), mute.getExpires());
    }

    public final UpstreamReactionDto toDto$stream_chat_android_client_release(Reaction reaction) {
        AbstractC22676k.m65750j(reaction, "<this>");
        Date createdAt = reaction.getCreatedAt();
        String messageId = reaction.getMessageId();
        int score = reaction.getScore();
        String type = reaction.getType();
        Date updatedAt = reaction.getUpdatedAt();
        User user = reaction.getUser();
        return new UpstreamReactionDto(createdAt, messageId, score, type, updatedAt, user != null ? toDto$stream_chat_android_client_release(user) : null, reaction.getUserId(), reaction.getEmojiCode(), reaction.getExtraData());
    }

    public final PrivacySettingsDto toDto$stream_chat_android_client_release(PrivacySettings privacySettings) {
        AbstractC22676k.m65750j(privacySettings, "<this>");
        TypingIndicators typingIndicators = privacySettings.getTypingIndicators();
        TypingIndicatorsDto dto$stream_chat_android_client_release = typingIndicators != null ? toDto$stream_chat_android_client_release(typingIndicators) : null;
        ReadReceipts readReceipts = privacySettings.getReadReceipts();
        ReadReceiptsDto dto$stream_chat_android_client_release2 = readReceipts != null ? toDto$stream_chat_android_client_release(readReceipts) : null;
        DeliveryReceipts deliveryReceipts = privacySettings.getDeliveryReceipts();
        return new PrivacySettingsDto(dto$stream_chat_android_client_release, deliveryReceipts != null ? toDto$stream_chat_android_client_release(deliveryReceipts) : null, dto$stream_chat_android_client_release2);
    }

    public final TypingIndicatorsDto toDto$stream_chat_android_client_release(TypingIndicators typingIndicators) {
        AbstractC22676k.m65750j(typingIndicators, "<this>");
        return new TypingIndicatorsDto(typingIndicators.getEnabled());
    }

    public final ReadReceiptsDto toDto$stream_chat_android_client_release(ReadReceipts readReceipts) {
        AbstractC22676k.m65750j(readReceipts, "<this>");
        return new ReadReceiptsDto(readReceipts.getEnabled());
    }

    public final DeliveryReceiptsDto toDto$stream_chat_android_client_release(DeliveryReceipts deliveryReceipts) {
        AbstractC22676k.m65750j(deliveryReceipts, "<this>");
        return new DeliveryReceiptsDto(deliveryReceipts.getEnabled());
    }

    public final UpstreamUserDto toDto$stream_chat_android_client_release(User user) {
        AbstractC22676k.m65750j(user, "<this>");
        User userTransform = this.userTransformer.transform(user);
        boolean zIsBanned = userTransform.isBanned();
        String id4 = userTransform.getId();
        String name = userTransform.getName();
        String image = userTransform.getImage();
        boolean zIsInvisible = userTransform.isInvisible();
        PrivacySettings privacySettings = userTransform.getPrivacySettings();
        PrivacySettingsDto dto$stream_chat_android_client_release = privacySettings != null ? toDto$stream_chat_android_client_release(privacySettings) : null;
        String language = userTransform.getLanguage();
        String role = userTransform.getRole();
        List<Device> devices = userTransform.getDevices();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(devices, 10));
        Iterator<T> it = devices.iterator();
        while (it.hasNext()) {
            arrayList.add(toDto$stream_chat_android_client_release((Device) it.next()));
        }
        return new UpstreamUserDto(zIsBanned, id4, name, image, zIsInvisible, dto$stream_chat_android_client_release, language, role, arrayList, userTransform.getTeams(), userTransform.getTeamsRole(), userTransform.getExtraData());
    }

    public final UpstreamConnectedEventDto toDto$stream_chat_android_client_release(ConnectedEvent connectedEvent) {
        AbstractC22676k.m65750j(connectedEvent, "<this>");
        return new UpstreamConnectedEventDto(connectedEvent.getType(), connectedEvent.getCreatedAt(), toDto$stream_chat_android_client_release(connectedEvent.getMe()), connectedEvent.getConnectionId());
    }
}
