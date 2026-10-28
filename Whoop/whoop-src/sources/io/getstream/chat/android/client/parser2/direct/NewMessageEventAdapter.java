package io.getstream.chat.android.client.parser2.direct;

import androidx.profileinstaller.ProfileVerifier;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.whoop.service.network.model.UserState;
import io.getstream.chat.android.client.events.NewMessageEvent;
import io.getstream.chat.android.client.parser2.adapters.internal.StreamDateFormatter;
import io.getstream.chat.android.models.ChannelInfo;
import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.models.User;
import java.util.Date;
import l83.C23465k;
import live.hms.video.utils.AndroidSDKConstants;
import no.nordicsemi.android.dfu.DfuBaseService;
import p441qx.AbstractC30704c0;
import p441qx.EnumC30741w;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0001\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0001¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\r\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0017R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m65681d2 = {"Lio/getstream/chat/android/client/parser2/direct/NewMessageEventAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lio/getstream/chat/android/client/events/NewMessageEvent;", "Lio/getstream/chat/android/models/Message;", "messageAdapter", "Lio/getstream/chat/android/models/User;", "userAdapter", "<init>", "(Lcom/squareup/moshi/JsonAdapter;Lcom/squareup/moshi/JsonAdapter;)V", "Lcom/squareup/moshi/JsonReader;", "reader", "Ll83/k;", "", "parseChannelCustom", "(Lcom/squareup/moshi/JsonReader;)Ll83/k;", "fromJson", "(Lcom/squareup/moshi/JsonReader;)Lio/getstream/chat/android/client/events/NewMessageEvent;", "Lqx/c0;", "p0", "p1", "Ll83/a0;", "toJson", "(Lqx/c0;Lio/getstream/chat/android/client/events/NewMessageEvent;)V", "Lcom/squareup/moshi/JsonAdapter;", "Lio/getstream/chat/android/client/parser2/adapters/internal/StreamDateFormatter;", "streamDateFormatter", "Lio/getstream/chat/android/client/parser2/adapters/internal/StreamDateFormatter;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class NewMessageEventAdapter extends JsonAdapter<NewMessageEvent> {
    private final JsonAdapter<Message> messageAdapter;
    private final StreamDateFormatter streamDateFormatter;
    private final JsonAdapter<User> userAdapter;

    public NewMessageEventAdapter(JsonAdapter<Message> messageAdapter, JsonAdapter<User> userAdapter) {
        AbstractC22676k.m65750j(messageAdapter, "messageAdapter");
        AbstractC22676k.m65750j(userAdapter, "userAdapter");
        this.messageAdapter = messageAdapter;
        this.userAdapter = userAdapter;
        this.streamDateFormatter = new StreamDateFormatter("NewMessageEventAdapter", false, 2, null);
    }

    private final C23465k parseChannelCustom(JsonReader reader) {
        if (reader.mo16731k() != EnumC30741w.f126551y) {
            reader.skipValue();
            return new C23465k(null, null);
        }
        reader.beginObject();
        String strNextString = null;
        String strNextString2 = null;
        while (reader.hasNext()) {
            String strNextName = reader.nextName();
            boolean zM65745e = AbstractC22676k.m65745e(strNextName, "name");
            EnumC30741w enumC30741w = EnumC30741w.f126546I;
            if (zM65745e) {
                if (reader.mo16731k() == enumC30741w) {
                    reader.mo16730i();
                    strNextString = null;
                } else {
                    strNextString = reader.nextString();
                }
            } else if (!AbstractC22676k.m65745e(strNextName, "image")) {
                reader.skipValue();
            } else if (reader.mo16731k() == enumC30741w) {
                reader.mo16730i();
                strNextString2 = null;
            } else {
                strNextString2 = reader.nextString();
            }
        }
        reader.endObject();
        return new C23465k(strNextString, strNextString2);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final /* bridge */ /* synthetic */ void toJson(AbstractC30704c0 abstractC30704c0, Object obj) {
        toJson(abstractC30704c0, (NewMessageEvent) obj);
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:75:0x015d  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.squareup.moshi.JsonAdapter
    public final NewMessageEvent fromJson(JsonReader reader) {
        String str;
        String str2;
        Message message;
        Message messageCopy;
        Message messageCopy2;
        AbstractC22676k.m65750j(reader, "reader");
        EnumC30741w enumC30741wMo16731k = reader.mo16731k();
        EnumC30741w enumC30741w = EnumC30741w.f126546I;
        if (enumC30741wMo16731k == enumC30741w) {
            reader.mo16730i();
            return null;
        }
        reader.beginObject();
        Message message2 = null;
        String strNextString = null;
        Date date = null;
        String strNextString2 = null;
        User user = null;
        String strNextString3 = null;
        String strNextString4 = null;
        String strNextString5 = null;
        Integer nullableInt = null;
        String str3 = null;
        String str4 = null;
        Integer nullableInt2 = null;
        int iNextInt = 0;
        int iNextInt2 = 0;
        int iNextInt3 = 0;
        while (true) {
            Date date2 = date;
            Integer num = nullableInt;
            String str5 = str3;
            Message message3 = message2;
            if (!reader.hasNext()) {
                String str6 = strNextString5;
                reader.endObject();
                JsonParsingUtils jsonParsingUtils = JsonParsingUtils.INSTANCE;
                jsonParsingUtils.requireField(strNextString, "type", reader);
                jsonParsingUtils.requireField(strNextString2, "created_at", reader);
                if (date2 == null) {
                    throw new JsonDataException(AbstractC31061c.m95640p("Unparseable 'created_at' value '", strNextString2, "' at ", reader.m16727b()));
                }
                jsonParsingUtils.requireField(user, UserState.Sources.USER, reader);
                jsonParsingUtils.requireField(strNextString3, "cid", reader);
                jsonParsingUtils.requireField(strNextString4, "channel_type", reader);
                jsonParsingUtils.requireField(str6, "channel_id", reader);
                jsonParsingUtils.requireField(message3, "message", reader);
                boolean z4 = true;
                boolean z13 = message3.getChannelInfo() == null;
                boolean zM65745e = AbstractC22676k.m65745e(message3.getCid(), strNextString3);
                Message replyTo = message3.getReplyTo();
                boolean z14 = (replyTo == null || AbstractC22676k.m65745e(replyTo.getCid(), strNextString3)) ? false : true;
                boolean z15 = replyTo != null && replyTo.getChannelInfo() == null;
                if (!z14 && !z15) {
                    z4 = false;
                }
                if (z13 || !zM65745e || z4) {
                    String str7 = strNextString4;
                    str = strNextString3;
                    ChannelInfo channelInfo = new ChannelInfo(str, str6, str7, num != null ? num.intValue() : 0, str5, str4);
                    str2 = str7;
                    ChannelInfo channelInfo2 = message3.getChannelInfo();
                    ChannelInfo channelInfo3 = channelInfo2 == null ? channelInfo : channelInfo2;
                    String cid = !zM65745e ? str : message3.getCid();
                    if (replyTo != null) {
                        if (z4) {
                            String cid2 = z14 ? str : replyTo.getCid();
                            ChannelInfo channelInfo4 = replyTo.getChannelInfo();
                            messageCopy2 = replyTo.copy(((-1) & 1) != 0 ? replyTo.id : null, ((-1) & 2) != 0 ? replyTo.cid : cid2, ((-1) & 4) != 0 ? replyTo.text : null, ((-1) & 8) != 0 ? replyTo.html : null, ((-1) & 16) != 0 ? replyTo.parentId : null, ((-1) & 32) != 0 ? replyTo.command : null, ((-1) & 64) != 0 ? replyTo.attachments : null, ((-1) & 128) != 0 ? replyTo.mentionedUsersIds : null, ((-1) & 256) != 0 ? replyTo.mentionedUsers : null, ((-1) & 512) != 0 ? replyTo.replyCount : 0, ((-1) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? replyTo.deletedReplyCount : 0, ((-1) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? replyTo.reactionCounts : null, ((-1) & 4096) != 0 ? replyTo.reactionScores : null, ((-1) & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? replyTo.reactionGroups : null, ((-1) & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? replyTo.syncStatus : null, ((-1) & 32768) != 0 ? replyTo.type : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? replyTo.latestReactions : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? replyTo.ownReactions : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? replyTo.createdAt : null, ((-1) & 524288) != 0 ? replyTo.updatedAt : null, ((-1) & 1048576) != 0 ? replyTo.deletedAt : null, ((-1) & 2097152) != 0 ? replyTo.updatedLocallyAt : null, ((-1) & 4194304) != 0 ? replyTo.createdLocallyAt : null, ((-1) & 8388608) != 0 ? replyTo.user : null, ((-1) & 16777216) != 0 ? replyTo.extraData : null, ((-1) & AndroidSDKConstants.FLAG_MUTABLE) != 0 ? replyTo.silent : false, ((-1) & 67108864) != 0 ? replyTo.shadowed : false, ((-1) & 134217728) != 0 ? replyTo.i18n : null, ((-1) & 268435456) != 0 ? replyTo.showInChannel : false, ((-1) & 536870912) != 0 ? replyTo.channelInfo : channelInfo4 == null ? channelInfo : channelInfo4, ((-1) & 1073741824) != 0 ? replyTo.replyTo : null, ((-1) & Integer.MIN_VALUE) != 0 ? replyTo.replyMessageId : null, (65535 & 1) != 0 ? replyTo.pinned : false, (65535 & 2) != 0 ? replyTo.pinnedAt : null, (65535 & 4) != 0 ? replyTo.pinExpires : null, (65535 & 8) != 0 ? replyTo.pinnedBy : null, (65535 & 16) != 0 ? replyTo.threadParticipants : null, (65535 & 32) != 0 ? replyTo.skipPushNotification : false, (65535 & 64) != 0 ? replyTo.skipEnrichUrl : false, (65535 & 128) != 0 ? replyTo.moderationDetails : null, (65535 & 256) != 0 ? replyTo.moderation : null, (65535 & 512) != 0 ? replyTo.messageTextUpdatedAt : null, (65535 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? replyTo.poll : null, (65535 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? replyTo.restrictedVisibility : null, (65535 & 4096) != 0 ? replyTo.reminder : null, (65535 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? replyTo.sharedLocation : null, (65535 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? replyTo.channelRole : null, (65535 & 32768) != 0 ? replyTo.deletedForMe : false);
                        } else {
                            messageCopy2 = replyTo;
                        }
                        message = messageCopy2;
                    } else {
                        message = null;
                    }
                    messageCopy = message3.copy(((-1) & 1) != 0 ? message3.id : null, ((-1) & 2) != 0 ? message3.cid : cid, ((-1) & 4) != 0 ? message3.text : null, ((-1) & 8) != 0 ? message3.html : null, ((-1) & 16) != 0 ? message3.parentId : null, ((-1) & 32) != 0 ? message3.command : null, ((-1) & 64) != 0 ? message3.attachments : null, ((-1) & 128) != 0 ? message3.mentionedUsersIds : null, ((-1) & 256) != 0 ? message3.mentionedUsers : null, ((-1) & 512) != 0 ? message3.replyCount : 0, ((-1) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? message3.deletedReplyCount : 0, ((-1) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? message3.reactionCounts : null, ((-1) & 4096) != 0 ? message3.reactionScores : null, ((-1) & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? message3.reactionGroups : null, ((-1) & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? message3.syncStatus : null, ((-1) & 32768) != 0 ? message3.type : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? message3.latestReactions : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? message3.ownReactions : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? message3.createdAt : null, ((-1) & 524288) != 0 ? message3.updatedAt : null, ((-1) & 1048576) != 0 ? message3.deletedAt : null, ((-1) & 2097152) != 0 ? message3.updatedLocallyAt : null, ((-1) & 4194304) != 0 ? message3.createdLocallyAt : null, ((-1) & 8388608) != 0 ? message3.user : null, ((-1) & 16777216) != 0 ? message3.extraData : null, ((-1) & AndroidSDKConstants.FLAG_MUTABLE) != 0 ? message3.silent : false, ((-1) & 67108864) != 0 ? message3.shadowed : false, ((-1) & 134217728) != 0 ? message3.i18n : null, ((-1) & 268435456) != 0 ? message3.showInChannel : false, ((-1) & 536870912) != 0 ? message3.channelInfo : channelInfo3, ((-1) & 1073741824) != 0 ? message3.replyTo : message, ((-1) & Integer.MIN_VALUE) != 0 ? message3.replyMessageId : null, (65535 & 1) != 0 ? message3.pinned : false, (65535 & 2) != 0 ? message3.pinnedAt : null, (65535 & 4) != 0 ? message3.pinExpires : null, (65535 & 8) != 0 ? message3.pinnedBy : null, (65535 & 16) != 0 ? message3.threadParticipants : null, (65535 & 32) != 0 ? message3.skipPushNotification : false, (65535 & 64) != 0 ? message3.skipEnrichUrl : false, (65535 & 128) != 0 ? message3.moderationDetails : null, (65535 & 256) != 0 ? message3.moderation : null, (65535 & 512) != 0 ? message3.messageTextUpdatedAt : null, (65535 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? message3.poll : null, (65535 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? message3.restrictedVisibility : null, (65535 & 4096) != 0 ? message3.reminder : null, (65535 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? message3.sharedLocation : null, (65535 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? message3.channelRole : null, (65535 & 32768) != 0 ? message3.deletedForMe : false);
                } else {
                    messageCopy = message3;
                    str2 = strNextString4;
                    str = strNextString3;
                }
                return new NewMessageEvent(strNextString, date2, strNextString2, user, str, str2, str6, messageCopy, iNextInt, iNextInt2, iNextInt3, nullableInt2);
            }
            String str8 = strNextString5;
            String strNextName = reader.nextName();
            if (strNextName != null) {
                switch (strNextName.hashCode()) {
                    case -1930808873:
                        if (strNextName.equals("channel_id")) {
                            strNextString5 = reader.nextString();
                            nullableInt = num;
                        } else {
                            reader.skipValue();
                            nullableInt = num;
                            strNextString5 = str8;
                        }
                        str3 = str5;
                        message2 = message3;
                        date = date2;
                        break;
                    case -1906547302:
                        if (strNextName.equals("total_unread_count")) {
                            iNextInt2 = reader.nextInt();
                        } else {
                            reader.skipValue();
                        }
                        nullableInt = num;
                        strNextString5 = str8;
                        str3 = str5;
                        message2 = message3;
                        date = date2;
                        break;
                    case -1876650400:
                        if (strNextName.equals("unread_channels")) {
                            iNextInt3 = reader.nextInt();
                        } else {
                            reader.skipValue();
                        }
                        nullableInt = num;
                        strNextString5 = str8;
                        str3 = str5;
                        message2 = message3;
                        date = date2;
                        break;
                    case -1121455571:
                        if (strNextName.equals("channel_custom")) {
                            C23465k channelCustom = parseChannelCustom(reader);
                            str3 = (String) channelCustom.f92937w;
                            str4 = (String) channelCustom.f92938x;
                            nullableInt = num;
                            strNextString5 = str8;
                        } else {
                            reader.skipValue();
                            nullableInt = num;
                            strNextString5 = str8;
                            str3 = str5;
                        }
                        message2 = message3;
                        date = date2;
                        break;
                    case -81103626:
                        if (strNextName.equals("channel_type")) {
                            strNextString4 = reader.nextString();
                        } else {
                            reader.skipValue();
                        }
                        nullableInt = num;
                        strNextString5 = str8;
                        str3 = str5;
                        message2 = message3;
                        date = date2;
                        break;
                    case 98494:
                        if (strNextName.equals("cid")) {
                            strNextString3 = reader.nextString();
                        } else {
                            reader.skipValue();
                        }
                        nullableInt = num;
                        strNextString5 = str8;
                        str3 = str5;
                        message2 = message3;
                        date = date2;
                        break;
                    case 3575610:
                        if (strNextName.equals("type")) {
                            strNextString = reader.nextString();
                        } else {
                            reader.skipValue();
                        }
                        nullableInt = num;
                        strNextString5 = str8;
                        str3 = str5;
                        message2 = message3;
                        date = date2;
                        break;
                    case 3599307:
                        if (strNextName.equals(UserState.Sources.USER)) {
                            user = (User) this.userAdapter.fromJson(reader);
                        } else {
                            reader.skipValue();
                        }
                        nullableInt = num;
                        strNextString5 = str8;
                        str3 = str5;
                        message2 = message3;
                        date = date2;
                        break;
                    case 657281228:
                        if (strNextName.equals("watcher_count")) {
                            iNextInt = reader.nextInt();
                        } else {
                            reader.skipValue();
                        }
                        nullableInt = num;
                        strNextString5 = str8;
                        str3 = str5;
                        message2 = message3;
                        date = date2;
                        break;
                    case 954925063:
                        if (strNextName.equals("message")) {
                            message2 = (Message) this.messageAdapter.fromJson(reader);
                            nullableInt = num;
                            strNextString5 = str8;
                            str3 = str5;
                        } else {
                            reader.skipValue();
                            nullableInt = num;
                            strNextString5 = str8;
                            str3 = str5;
                            message2 = message3;
                        }
                        date = date2;
                        break;
                    case 1369680106:
                        if (!strNextName.equals("created_at") || reader.mo16731k() == enumC30741w) {
                            reader.skipValue();
                            nullableInt = num;
                            strNextString5 = str8;
                            str3 = str5;
                            message2 = message3;
                            date = date2;
                        } else {
                            strNextString2 = reader.nextString();
                            StreamDateFormatter streamDateFormatter = this.streamDateFormatter;
                            AbstractC22676k.m65747g(strNextString2);
                            date = streamDateFormatter.parse$stream_chat_android_client_release(strNextString2);
                            nullableInt = num;
                            strNextString5 = str8;
                            str3 = str5;
                            message2 = message3;
                        }
                        break;
                    case 1844890854:
                        if (strNextName.equals("channel_member_count")) {
                            nullableInt = JsonParsingUtils.INSTANCE.readNullableInt(reader);
                        } else {
                            reader.skipValue();
                            nullableInt = num;
                        }
                        strNextString5 = str8;
                        str3 = str5;
                        message2 = message3;
                        date = date2;
                        break;
                    case 1967595675:
                        if (strNextName.equals("channel_message_count")) {
                            nullableInt2 = JsonParsingUtils.INSTANCE.readNullableInt(reader);
                        } else {
                            reader.skipValue();
                        }
                        nullableInt = num;
                        strNextString5 = str8;
                        str3 = str5;
                        message2 = message3;
                        date = date2;
                        break;
                    default:
                        reader.skipValue();
                        nullableInt = num;
                        strNextString5 = str8;
                        str3 = str5;
                        message2 = message3;
                        date = date2;
                        break;
                }
            } else {
                reader.skipValue();
                nullableInt = num;
                strNextString5 = str8;
                str3 = str5;
                message2 = message3;
                date = date2;
            }
        }
    }

    public final void toJson(AbstractC30704c0 p13, NewMessageEvent p14) {
        AbstractC22676k.m65750j(p13, "p0");
        throw new IllegalStateException("Serialization not supported for direct-to-domain path");
    }
}
