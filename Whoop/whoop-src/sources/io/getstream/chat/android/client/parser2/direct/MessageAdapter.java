package io.getstream.chat.android.client.parser2.direct;

import androidx.core.app.NotificationCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.whoop.service.network.model.UserState;
import io.getstream.chat.android.models.Attachment;
import io.getstream.chat.android.models.ChannelInfo;
import io.getstream.chat.android.models.Location;
import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.models.MessageModerationDetails;
import io.getstream.chat.android.models.MessageReminderInfo;
import io.getstream.chat.android.models.MessageTransformer;
import io.getstream.chat.android.models.Moderation;
import io.getstream.chat.android.models.Poll;
import io.getstream.chat.android.models.Reaction;
import io.getstream.chat.android.models.ReactionGroup;
import io.getstream.chat.android.models.User;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import live.hms.video.utils.AndroidSDKConstants;
import m83.AbstractC25260n;
import m83.C25271y;
import m83.C25272z;
import no.nordicsemi.android.dfu.DfuBaseService;
import p441qx.AbstractC30704c0;
import p441qx.EnumC30741w;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B£\u0001\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0001\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0001\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0001\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0001\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0001\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0001\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0001\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0001\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0001\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0001\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b \u0010!J\u0019\u0010\"\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\"\u0010#J!\u0010\"\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010$\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\"\u0010%J!\u0010*\u001a\u00020)2\u0006\u0010'\u001a\u00020&2\b\u0010(\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b*\u0010+R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010,R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010,R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010,R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010-R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010,R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010,R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010,R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010,R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010,R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010,R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010,R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010.¨\u0006/"}, m65681d2 = {"Lio/getstream/chat/android/client/parser2/direct/MessageAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lio/getstream/chat/android/models/Message;", "Lio/getstream/chat/android/models/Attachment;", "attachmentAdapter", "Lio/getstream/chat/android/models/ChannelInfo;", "channelInfoAdapter", "Lio/getstream/chat/android/models/Reaction;", "reactionAdapter", "Lio/getstream/chat/android/client/parser2/direct/ReactionGroupAdapter;", "reactionGroupAdapter", "Lio/getstream/chat/android/models/User;", "userAdapter", "Lio/getstream/chat/android/models/MessageModerationDetails;", "moderationDetailsAdapter", "Lio/getstream/chat/android/models/Moderation;", "moderationAdapter", "Lio/getstream/chat/android/models/Poll;", "pollAdapter", "Lio/getstream/chat/android/models/MessageReminderInfo;", "reminderAdapter", "Lio/getstream/chat/android/models/Location;", "locationAdapter", "Ljava/util/Date;", "dateAdapter", "Lio/getstream/chat/android/models/MessageTransformer;", "messageTransformer", "<init>", "(Lcom/squareup/moshi/JsonAdapter;Lcom/squareup/moshi/JsonAdapter;Lcom/squareup/moshi/JsonAdapter;Lio/getstream/chat/android/client/parser2/direct/ReactionGroupAdapter;Lcom/squareup/moshi/JsonAdapter;Lcom/squareup/moshi/JsonAdapter;Lcom/squareup/moshi/JsonAdapter;Lcom/squareup/moshi/JsonAdapter;Lcom/squareup/moshi/JsonAdapter;Lcom/squareup/moshi/JsonAdapter;Lcom/squareup/moshi/JsonAdapter;Lio/getstream/chat/android/models/MessageTransformer;)V", "Lcom/squareup/moshi/JsonReader;", "reader", "", "parseMemberChannelRole", "(Lcom/squareup/moshi/JsonReader;)Ljava/lang/String;", "fromJson", "(Lcom/squareup/moshi/JsonReader;)Lio/getstream/chat/android/models/Message;", "fallbackChannelInfo", "(Lcom/squareup/moshi/JsonReader;Lio/getstream/chat/android/models/ChannelInfo;)Lio/getstream/chat/android/models/Message;", "Lqx/c0;", "p0", "p1", "Ll83/a0;", "toJson", "(Lqx/c0;Lio/getstream/chat/android/models/Message;)V", "Lcom/squareup/moshi/JsonAdapter;", "Lio/getstream/chat/android/client/parser2/direct/ReactionGroupAdapter;", "Lio/getstream/chat/android/models/MessageTransformer;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class MessageAdapter extends JsonAdapter<Message> {
    private final JsonAdapter<Attachment> attachmentAdapter;
    private final JsonAdapter<ChannelInfo> channelInfoAdapter;
    private final JsonAdapter<Date> dateAdapter;
    private final JsonAdapter<Location> locationAdapter;
    private final MessageTransformer messageTransformer;
    private final JsonAdapter<Moderation> moderationAdapter;
    private final JsonAdapter<MessageModerationDetails> moderationDetailsAdapter;
    private final JsonAdapter<Poll> pollAdapter;
    private final JsonAdapter<Reaction> reactionAdapter;
    private final ReactionGroupAdapter reactionGroupAdapter;
    private final JsonAdapter<MessageReminderInfo> reminderAdapter;
    private final JsonAdapter<User> userAdapter;

    public MessageAdapter(JsonAdapter<Attachment> attachmentAdapter, JsonAdapter<ChannelInfo> channelInfoAdapter, JsonAdapter<Reaction> reactionAdapter, ReactionGroupAdapter reactionGroupAdapter, JsonAdapter<User> userAdapter, JsonAdapter<MessageModerationDetails> moderationDetailsAdapter, JsonAdapter<Moderation> moderationAdapter, JsonAdapter<Poll> pollAdapter, JsonAdapter<MessageReminderInfo> reminderAdapter, JsonAdapter<Location> locationAdapter, JsonAdapter<Date> dateAdapter, MessageTransformer messageTransformer) {
        AbstractC22676k.m65750j(attachmentAdapter, "attachmentAdapter");
        AbstractC22676k.m65750j(channelInfoAdapter, "channelInfoAdapter");
        AbstractC22676k.m65750j(reactionAdapter, "reactionAdapter");
        AbstractC22676k.m65750j(reactionGroupAdapter, "reactionGroupAdapter");
        AbstractC22676k.m65750j(userAdapter, "userAdapter");
        AbstractC22676k.m65750j(moderationDetailsAdapter, "moderationDetailsAdapter");
        AbstractC22676k.m65750j(moderationAdapter, "moderationAdapter");
        AbstractC22676k.m65750j(pollAdapter, "pollAdapter");
        AbstractC22676k.m65750j(reminderAdapter, "reminderAdapter");
        AbstractC22676k.m65750j(locationAdapter, "locationAdapter");
        AbstractC22676k.m65750j(dateAdapter, "dateAdapter");
        AbstractC22676k.m65750j(messageTransformer, "messageTransformer");
        this.attachmentAdapter = attachmentAdapter;
        this.channelInfoAdapter = channelInfoAdapter;
        this.reactionAdapter = reactionAdapter;
        this.reactionGroupAdapter = reactionGroupAdapter;
        this.userAdapter = userAdapter;
        this.moderationDetailsAdapter = moderationDetailsAdapter;
        this.moderationAdapter = moderationAdapter;
        this.pollAdapter = pollAdapter;
        this.reminderAdapter = reminderAdapter;
        this.locationAdapter = locationAdapter;
        this.dateAdapter = dateAdapter;
        this.messageTransformer = messageTransformer;
    }

    private final String parseMemberChannelRole(JsonReader reader) {
        String nullableString = null;
        if (reader.mo16731k() != EnumC30741w.f126551y) {
            reader.skipValue();
            return null;
        }
        reader.beginObject();
        while (reader.hasNext()) {
            if (AbstractC22676k.m65745e(reader.nextName(), "channel_role")) {
                nullableString = JsonParsingUtils.INSTANCE.readNullableString(reader);
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return nullableString;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final /* bridge */ /* synthetic */ void toJson(AbstractC30704c0 abstractC30704c0, Object obj) {
        toJson(abstractC30704c0, (Message) obj);
        throw null;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Message fromJson(JsonReader reader) {
        AbstractC22676k.m65750j(reader, "reader");
        return fromJson(reader, null);
    }

    public final void toJson(AbstractC30704c0 p13, Message p14) {
        AbstractC22676k.m65750j(p13, "p0");
        throw new IllegalStateException("Serialization not supported for direct-to-domain path");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:12:0x00aa. Please report as an issue. */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final Message fromJson(JsonReader reader, ChannelInfo fallbackChannelInfo) {
        Message message;
        Object next;
        AbstractC22676k.m65750j(reader, "reader");
        Map<String, Object> mapAccumulateExtraData = null;
        if (reader.mo16731k() == EnumC30741w.f126546I) {
            reader.mo16730i();
            return null;
        }
        reader.beginObject();
        Date date = null;
        List list = null;
        List list2 = null;
        String strNextString = null;
        String strNextString2 = null;
        Integer numValueOf = null;
        String strNextString3 = null;
        Integer numValueOf2 = null;
        Boolean boolValueOf = null;
        List list3 = null;
        String strNextString4 = null;
        List list4 = null;
        String strNextString5 = null;
        ChannelInfo channelInfo = null;
        Date date2 = null;
        String nullableString = null;
        Map<String, String> stringMap = null;
        String nullableString2 = null;
        Boolean boolValueOf2 = null;
        Map<String, Integer> linkedHashMap = null;
        Map<String, Integer> linkedHashMap2 = null;
        Map<String, ReactionGroup> reactionGroupsMap = null;
        Date date3 = null;
        Boolean boolValueOf3 = null;
        Boolean boolValueOf4 = null;
        List list5 = null;
        Boolean nullableBoolean = null;
        String nullableString3 = null;
        Date date4 = null;
        Date date5 = null;
        User user = null;
        MessageModerationDetails messageModerationDetails = null;
        Moderation moderation = null;
        Date date6 = null;
        Poll poll = null;
        MessageReminderInfo messageReminderInfo = null;
        Location location = null;
        String memberChannelRole = null;
        User user2 = null;
        Message messageCopy = null;
        while (true) {
            String str = strNextString5;
            String str2 = strNextString4;
            Boolean bool = boolValueOf;
            Integer num = numValueOf2;
            Integer num2 = numValueOf;
            List list6 = list2;
            List list7 = list4;
            List list8 = list;
            String str3 = strNextString;
            String str4 = strNextString3;
            Date date7 = date;
            String str5 = strNextString2;
            List list9 = list3;
            Map<String, Object> map = mapAccumulateExtraData;
            if (reader.hasNext()) {
                String strNextName = reader.nextName();
                if (strNextName != null) {
                    switch (strNextName.hashCode()) {
                        case -2016287450:
                            if (strNextName.equals("moderation")) {
                                moderation = (Moderation) this.moderationAdapter.fromJson(reader);
                                strNextString5 = str;
                                strNextString4 = str2;
                                boolValueOf = bool;
                                numValueOf2 = num;
                                numValueOf = num2;
                                list2 = list6;
                                list4 = list7;
                                list = list8;
                                strNextString = str3;
                                strNextString3 = str4;
                                date = date7;
                                strNextString2 = str5;
                                list3 = list9;
                                mapAccumulateExtraData = map;
                            }
                            break;
                        case -1911863729:
                            if (strNextName.equals("shared_location")) {
                                location = (Location) this.locationAdapter.fromJson(reader);
                                strNextString5 = str;
                                strNextString4 = str2;
                                boolValueOf = bool;
                                numValueOf2 = num;
                                numValueOf = num2;
                                list2 = list6;
                                list4 = list7;
                                list = list8;
                                strNextString = str3;
                                strNextString3 = str4;
                                date = date7;
                                strNextString2 = str5;
                                list3 = list9;
                                mapAccumulateExtraData = map;
                            }
                            break;
                        case -1818275792:
                            if (strNextName.equals("quoted_message")) {
                                messageCopy = fromJson(reader, fallbackChannelInfo);
                                strNextString5 = str;
                                strNextString4 = str2;
                                boolValueOf = bool;
                                numValueOf2 = num;
                                numValueOf = num2;
                                list2 = list6;
                                list4 = list7;
                                list = list8;
                                strNextString = str3;
                                strNextString3 = str4;
                                date = date7;
                                strNextString2 = str5;
                                list3 = list9;
                                mapAccumulateExtraData = map;
                            }
                            break;
                        case -1077769574:
                            if (strNextName.equals("member")) {
                                memberChannelRole = parseMemberChannelRole(reader);
                                strNextString5 = str;
                                strNextString4 = str2;
                                boolValueOf = bool;
                                numValueOf2 = num;
                                numValueOf = num2;
                                list2 = list6;
                                list4 = list7;
                                list = list8;
                                strNextString = str3;
                                strNextString3 = str4;
                                date = date7;
                                strNextString2 = str5;
                                list3 = list9;
                                mapAccumulateExtraData = map;
                            }
                            break;
                        case -988146728:
                            if (strNextName.equals("pinned")) {
                                boolValueOf2 = Boolean.valueOf(reader.mo16729h());
                                strNextString5 = str;
                                strNextString4 = str2;
                                boolValueOf = bool;
                                numValueOf2 = num;
                                numValueOf = num2;
                                list2 = list6;
                                list4 = list7;
                                list = list8;
                                strNextString = str3;
                                strNextString3 = str4;
                                date = date7;
                                strNextString2 = str5;
                                list3 = list9;
                                mapAccumulateExtraData = map;
                            }
                            break;
                        case -902327211:
                            if (strNextName.equals(NotificationCompat.GROUP_KEY_SILENT)) {
                                boolValueOf = Boolean.valueOf(reader.mo16729h());
                                strNextString5 = str;
                                strNextString4 = str2;
                                numValueOf2 = num;
                                numValueOf = num2;
                                list2 = list6;
                                list4 = list7;
                                list = list8;
                                strNextString = str3;
                                strNextString3 = str4;
                                date = date7;
                                strNextString2 = str5;
                                list3 = list9;
                                mapAccumulateExtraData = map;
                            }
                            break;
                        case -860839852:
                            if (strNextName.equals("deleted_reply_count")) {
                                numValueOf2 = Integer.valueOf(reader.nextInt());
                                strNextString5 = str;
                                strNextString4 = str2;
                                boolValueOf = bool;
                                numValueOf = num2;
                                list2 = list6;
                                list4 = list7;
                                list = list8;
                                strNextString = str3;
                                strNextString3 = str4;
                                date = date7;
                                strNextString2 = str5;
                                list3 = list9;
                                mapAccumulateExtraData = map;
                            }
                            break;
                        case -756367937:
                            if (strNextName.equals("shadowed")) {
                                boolValueOf3 = Boolean.valueOf(reader.mo16729h());
                                strNextString5 = str;
                                strNextString4 = str2;
                                boolValueOf = bool;
                                numValueOf2 = num;
                                numValueOf = num2;
                                list2 = list6;
                                list4 = list7;
                                list = list8;
                                strNextString = str3;
                                strNextString3 = str4;
                                date = date7;
                                strNextString2 = str5;
                                list3 = list9;
                                mapAccumulateExtraData = map;
                            }
                            break;
                        case -738997328:
                            if (strNextName.equals("attachments")) {
                                list3 = JsonParsingUtils.INSTANCE.parseList(reader, this.attachmentAdapter);
                                strNextString5 = str;
                                strNextString4 = str2;
                                boolValueOf = bool;
                                numValueOf2 = num;
                                numValueOf = num2;
                                list2 = list6;
                                list4 = list7;
                                list = list8;
                                strNextString = str3;
                                strNextString3 = str4;
                                date = date7;
                                strNextString2 = str5;
                                mapAccumulateExtraData = map;
                            }
                            break;
                        case -518602638:
                            if (strNextName.equals(NotificationCompat.CATEGORY_REMINDER)) {
                                messageReminderInfo = (MessageReminderInfo) this.reminderAdapter.fromJson(reader);
                                strNextString5 = str;
                                strNextString4 = str2;
                                boolValueOf = bool;
                                numValueOf2 = num;
                                numValueOf = num2;
                                list2 = list6;
                                list4 = list7;
                                list = list8;
                                strNextString = str3;
                                strNextString3 = str4;
                                date = date7;
                                strNextString2 = str5;
                                list3 = list9;
                                mapAccumulateExtraData = map;
                            }
                            break;
                        case -295464393:
                            if (strNextName.equals("updated_at")) {
                                date2 = (Date) this.dateAdapter.fromJson(reader);
                                strNextString5 = str;
                                strNextString4 = str2;
                                boolValueOf = bool;
                                numValueOf2 = num;
                                numValueOf = num2;
                                list2 = list6;
                                list4 = list7;
                                list = list8;
                                strNextString = str3;
                                strNextString3 = str4;
                                date = date7;
                                strNextString2 = str5;
                                list3 = list9;
                                mapAccumulateExtraData = map;
                            }
                            break;
                        case -173232646:
                            if (strNextName.equals("pinned_at")) {
                                date4 = (Date) this.dateAdapter.fromJson(reader);
                                strNextString5 = str;
                                strNextString4 = str2;
                                boolValueOf = bool;
                                numValueOf2 = num;
                                numValueOf = num2;
                                list2 = list6;
                                list4 = list7;
                                list = list8;
                                strNextString = str3;
                                strNextString3 = str4;
                                date = date7;
                                strNextString2 = str5;
                                list3 = list9;
                                mapAccumulateExtraData = map;
                            }
                            break;
                        case -173232610:
                            if (strNextName.equals("pinned_by")) {
                                user = (User) this.userAdapter.fromJson(reader);
                                strNextString5 = str;
                                strNextString4 = str2;
                                boolValueOf = bool;
                                numValueOf2 = num;
                                numValueOf = num2;
                                list2 = list6;
                                list4 = list7;
                                list = list8;
                                strNextString = str3;
                                strNextString3 = str4;
                                date = date7;
                                strNextString2 = str5;
                                list3 = list9;
                                mapAccumulateExtraData = map;
                            }
                            break;
                        case -126487670:
                            if (strNextName.equals("quoted_message_id")) {
                                nullableString3 = JsonParsingUtils.INSTANCE.readNullableString(reader);
                                strNextString5 = str;
                                strNextString4 = str2;
                                boolValueOf = bool;
                                numValueOf2 = num;
                                numValueOf = num2;
                                list2 = list6;
                                list4 = list7;
                                list = list8;
                                strNextString = str3;
                                strNextString3 = str4;
                                date = date7;
                                strNextString2 = str5;
                                list3 = list9;
                                mapAccumulateExtraData = map;
                            }
                            break;
                        case -123897678:
                            if (strNextName.equals("latest_reactions")) {
                                list = JsonParsingUtils.INSTANCE.parseList(reader, this.reactionAdapter);
                                strNextString5 = str;
                                strNextString4 = str2;
                                boolValueOf = bool;
                                numValueOf2 = num;
                                numValueOf = num2;
                                list2 = list6;
                                list4 = list7;
                                strNextString = str3;
                                strNextString3 = str4;
                                date = date7;
                                strNextString2 = str5;
                                list3 = list9;
                                mapAccumulateExtraData = map;
                            }
                            break;
                        case -15800725:
                            if (strNextName.equals("show_in_channel")) {
                                boolValueOf4 = Boolean.valueOf(reader.mo16729h());
                                strNextString5 = str;
                                strNextString4 = str2;
                                boolValueOf = bool;
                                numValueOf2 = num;
                                numValueOf = num2;
                                list2 = list6;
                                list4 = list7;
                                list = list8;
                                strNextString = str3;
                                strNextString3 = str4;
                                date = date7;
                                strNextString2 = str5;
                                list3 = list9;
                                mapAccumulateExtraData = map;
                            }
                            break;
                        case 3355:
                            if (strNextName.equals("id")) {
                                strNextString = reader.nextString();
                                strNextString5 = str;
                                strNextString4 = str2;
                                boolValueOf = bool;
                                numValueOf2 = num;
                                numValueOf = num2;
                                list2 = list6;
                                list4 = list7;
                                list = list8;
                                strNextString3 = str4;
                                date = date7;
                                strNextString2 = str5;
                                list3 = list9;
                                mapAccumulateExtraData = map;
                            }
                            break;
                        case 98494:
                            if (strNextName.equals("cid")) {
                                strNextString2 = reader.nextString();
                                strNextString5 = str;
                                strNextString4 = str2;
                                boolValueOf = bool;
                                numValueOf2 = num;
                                numValueOf = num2;
                                list2 = list6;
                                list4 = list7;
                                list = list8;
                                strNextString = str3;
                                strNextString3 = str4;
                                date = date7;
                                list3 = list9;
                                mapAccumulateExtraData = map;
                            }
                            break;
                        case 3176990:
                            if (strNextName.equals("i18n")) {
                                JsonParsingUtils jsonParsingUtils = JsonParsingUtils.INSTANCE;
                                jsonParsingUtils.rejectExplicitNull(reader, "i18n");
                                stringMap = jsonParsingUtils.parseStringMap(reader);
                                strNextString5 = str;
                                strNextString4 = str2;
                                boolValueOf = bool;
                                numValueOf2 = num;
                                numValueOf = num2;
                                list2 = list6;
                                list4 = list7;
                                list = list8;
                                strNextString = str3;
                                strNextString3 = str4;
                                date = date7;
                                strNextString2 = str5;
                                list3 = list9;
                                mapAccumulateExtraData = map;
                            }
                            break;
                        case 3213227:
                            if (strNextName.equals("html")) {
                                strNextString3 = reader.nextString();
                                strNextString5 = str;
                                strNextString4 = str2;
                                boolValueOf = bool;
                                numValueOf2 = num;
                                numValueOf = num2;
                                list2 = list6;
                                list4 = list7;
                                list = list8;
                                strNextString = str3;
                                date = date7;
                                strNextString2 = str5;
                                list3 = list9;
                                mapAccumulateExtraData = map;
                            }
                            break;
                        case 3446719:
                            if (strNextName.equals("poll")) {
                                poll = (Poll) this.pollAdapter.fromJson(reader);
                                strNextString5 = str;
                                strNextString4 = str2;
                                boolValueOf = bool;
                                numValueOf2 = num;
                                numValueOf = num2;
                                list2 = list6;
                                list4 = list7;
                                list = list8;
                                strNextString = str3;
                                strNextString3 = str4;
                                date = date7;
                                strNextString2 = str5;
                                list3 = list9;
                                mapAccumulateExtraData = map;
                            }
                            break;
                        case 3556653:
                            if (strNextName.equals("text")) {
                                strNextString4 = reader.nextString();
                                strNextString5 = str;
                                boolValueOf = bool;
                                numValueOf2 = num;
                                numValueOf = num2;
                                list2 = list6;
                                list4 = list7;
                                list = list8;
                                strNextString = str3;
                                strNextString3 = str4;
                                date = date7;
                                strNextString2 = str5;
                                list3 = list9;
                                mapAccumulateExtraData = map;
                            }
                            break;
                        case 3575610:
                            if (strNextName.equals("type")) {
                                strNextString5 = reader.nextString();
                                strNextString4 = str2;
                                boolValueOf = bool;
                                numValueOf2 = num;
                                numValueOf = num2;
                                list2 = list6;
                                list4 = list7;
                                list = list8;
                                strNextString = str3;
                                strNextString3 = str4;
                                date = date7;
                                strNextString2 = str5;
                                list3 = list9;
                                mapAccumulateExtraData = map;
                            }
                            break;
                        case 3599307:
                            if (strNextName.equals(UserState.Sources.USER)) {
                                user2 = (User) this.userAdapter.fromJson(reader);
                                strNextString5 = str;
                                strNextString4 = str2;
                                boolValueOf = bool;
                                numValueOf2 = num;
                                numValueOf = num2;
                                list2 = list6;
                                list4 = list7;
                                list = list8;
                                strNextString = str3;
                                strNextString3 = str4;
                                date = date7;
                                strNextString2 = str5;
                                list3 = list9;
                                mapAccumulateExtraData = map;
                            }
                            break;
                        case 139882362:
                            if (strNextName.equals("reply_count")) {
                                numValueOf = Integer.valueOf(reader.nextInt());
                                strNextString5 = str;
                                strNextString4 = str2;
                                boolValueOf = bool;
                                numValueOf2 = num;
                                list2 = list6;
                                list4 = list7;
                                list = list8;
                                strNextString = str3;
                                strNextString3 = str4;
                                date = date7;
                                strNextString2 = str5;
                                list3 = list9;
                                mapAccumulateExtraData = map;
                            }
                            break;
                        case 738950403:
                            if (strNextName.equals("channel")) {
                                channelInfo = (ChannelInfo) this.channelInfoAdapter.fromJson(reader);
                                strNextString5 = str;
                                strNextString4 = str2;
                                boolValueOf = bool;
                                numValueOf2 = num;
                                numValueOf = num2;
                                list2 = list6;
                                list4 = list7;
                                list = list8;
                                strNextString = str3;
                                strNextString3 = str4;
                                date = date7;
                                strNextString2 = str5;
                                list3 = list9;
                                mapAccumulateExtraData = map;
                            }
                            break;
                        case 950394699:
                            if (strNextName.equals("command")) {
                                nullableString = JsonParsingUtils.INSTANCE.readNullableString(reader);
                                strNextString5 = str;
                                strNextString4 = str2;
                                boolValueOf = bool;
                                numValueOf2 = num;
                                numValueOf = num2;
                                list2 = list6;
                                list4 = list7;
                                list = list8;
                                strNextString = str3;
                                strNextString3 = str4;
                                date = date7;
                                strNextString2 = str5;
                                list3 = list9;
                                mapAccumulateExtraData = map;
                            }
                            break;
                        case 969538641:
                            if (strNextName.equals("message_text_updated_at")) {
                                date6 = (Date) this.dateAdapter.fromJson(reader);
                                strNextString5 = str;
                                strNextString4 = str2;
                                boolValueOf = bool;
                                numValueOf2 = num;
                                numValueOf = num2;
                                list2 = list6;
                                list4 = list7;
                                list = list8;
                                strNextString = str3;
                                strNextString3 = str4;
                                date = date7;
                                strNextString2 = str5;
                                list3 = list9;
                                mapAccumulateExtraData = map;
                            }
                            break;
                        case 1236138025:
                            if (strNextName.equals("moderation_details")) {
                                messageModerationDetails = (MessageModerationDetails) this.moderationDetailsAdapter.fromJson(reader);
                                strNextString5 = str;
                                strNextString4 = str2;
                                boolValueOf = bool;
                                numValueOf2 = num;
                                numValueOf = num2;
                                list2 = list6;
                                list4 = list7;
                                list = list8;
                                strNextString = str3;
                                strNextString3 = str4;
                                date = date7;
                                strNextString2 = str5;
                                list3 = list9;
                                mapAccumulateExtraData = map;
                            }
                            break;
                        case 1242493877:
                            if (strNextName.equals("thread_participants")) {
                                JsonParsingUtils jsonParsingUtils2 = JsonParsingUtils.INSTANCE;
                                jsonParsingUtils2.rejectExplicitNull(reader, "thread_participants");
                                list5 = jsonParsingUtils2.parseList(reader, this.userAdapter);
                                strNextString5 = str;
                                strNextString4 = str2;
                                boolValueOf = bool;
                                numValueOf2 = num;
                                numValueOf = num2;
                                list2 = list6;
                                list4 = list7;
                                list = list8;
                                strNextString = str3;
                                strNextString3 = str4;
                                date = date7;
                                strNextString2 = str5;
                                list3 = list9;
                                mapAccumulateExtraData = map;
                            }
                            break;
                        case 1243323018:
                            if (strNextName.equals("pin_expires")) {
                                date5 = (Date) this.dateAdapter.fromJson(reader);
                                strNextString5 = str;
                                strNextString4 = str2;
                                boolValueOf = bool;
                                numValueOf2 = num;
                                numValueOf = num2;
                                list2 = list6;
                                list4 = list7;
                                list = list8;
                                strNextString = str3;
                                strNextString3 = str4;
                                date = date7;
                                strNextString2 = str5;
                                list3 = list9;
                                mapAccumulateExtraData = map;
                            }
                            break;
                        case 1369680106:
                            if (strNextName.equals("created_at")) {
                                date = (Date) this.dateAdapter.fromJson(reader);
                                strNextString5 = str;
                                strNextString4 = str2;
                                boolValueOf = bool;
                                numValueOf2 = num;
                                numValueOf = num2;
                                list2 = list6;
                                list4 = list7;
                                list = list8;
                                strNextString = str3;
                                strNextString3 = str4;
                                strNextString2 = str5;
                                list3 = list9;
                                mapAccumulateExtraData = map;
                            }
                            break;
                        case 1498308178:
                            if (strNextName.equals("mentioned_users")) {
                                list4 = JsonParsingUtils.INSTANCE.parseList(reader, this.userAdapter);
                                strNextString5 = str;
                                strNextString4 = str2;
                                boolValueOf = bool;
                                numValueOf2 = num;
                                numValueOf = num2;
                                list2 = list6;
                                list = list8;
                                strNextString = str3;
                                strNextString3 = str4;
                                date = date7;
                                strNextString2 = str5;
                                list3 = list9;
                                mapAccumulateExtraData = map;
                            }
                            break;
                        case 1559881201:
                            if (strNextName.equals("own_reactions")) {
                                list2 = JsonParsingUtils.INSTANCE.parseList(reader, this.reactionAdapter);
                                strNextString5 = str;
                                strNextString4 = str2;
                                boolValueOf = bool;
                                numValueOf2 = num;
                                numValueOf = num2;
                                list4 = list7;
                                list = list8;
                                strNextString = str3;
                                strNextString3 = str4;
                                date = date7;
                                strNextString2 = str5;
                                list3 = list9;
                                mapAccumulateExtraData = map;
                            }
                            break;
                        case 1617880090:
                            if (strNextName.equals("reaction_counts")) {
                                linkedHashMap = JsonParsingUtils.INSTANCE.parseIntMap(reader);
                                strNextString5 = str;
                                strNextString4 = str2;
                                boolValueOf = bool;
                                numValueOf2 = num;
                                numValueOf = num2;
                                list2 = list6;
                                list4 = list7;
                                list = list8;
                                strNextString = str3;
                                strNextString3 = str4;
                                date = date7;
                                strNextString2 = str5;
                                list3 = list9;
                                mapAccumulateExtraData = map;
                            }
                            break;
                        case 1734995114:
                            if (strNextName.equals("reaction_groups")) {
                                reactionGroupsMap = this.reactionGroupAdapter.parseReactionGroupsMap(reader);
                                strNextString5 = str;
                                strNextString4 = str2;
                                boolValueOf = bool;
                                numValueOf2 = num;
                                numValueOf = num2;
                                list2 = list6;
                                list4 = list7;
                                list = list8;
                                strNextString = str3;
                                strNextString3 = str4;
                                date = date7;
                                strNextString2 = str5;
                                list3 = list9;
                                mapAccumulateExtraData = map;
                            }
                            break;
                        case 1765056025:
                            if (strNextName.equals("deleted_at")) {
                                date3 = (Date) this.dateAdapter.fromJson(reader);
                                strNextString5 = str;
                                strNextString4 = str2;
                                boolValueOf = bool;
                                numValueOf2 = num;
                                numValueOf = num2;
                                list2 = list6;
                                list4 = list7;
                                list = list8;
                                strNextString = str3;
                                strNextString3 = str4;
                                date = date7;
                                strNextString2 = str5;
                                list3 = list9;
                                mapAccumulateExtraData = map;
                            }
                            break;
                        case 1804399540:
                            if (strNextName.equals("deleted_for_me")) {
                                nullableBoolean = JsonParsingUtils.INSTANCE.readNullableBoolean(reader);
                                strNextString5 = str;
                                strNextString4 = str2;
                                boolValueOf = bool;
                                numValueOf2 = num;
                                numValueOf = num2;
                                list2 = list6;
                                list4 = list7;
                                list = list8;
                                strNextString = str3;
                                strNextString3 = str4;
                                date = date7;
                                strNextString2 = str5;
                                list3 = list9;
                                mapAccumulateExtraData = map;
                            }
                            break;
                        case 2064688887:
                            if (strNextName.equals("reaction_scores")) {
                                linkedHashMap2 = JsonParsingUtils.INSTANCE.parseIntMap(reader);
                                strNextString5 = str;
                                strNextString4 = str2;
                                boolValueOf = bool;
                                numValueOf2 = num;
                                numValueOf = num2;
                                list2 = list6;
                                list4 = list7;
                                list = list8;
                                strNextString = str3;
                                strNextString3 = str4;
                                date = date7;
                                strNextString2 = str5;
                                list3 = list9;
                                mapAccumulateExtraData = map;
                            }
                            break;
                        case 2070327504:
                            if (strNextName.equals("parent_id")) {
                                nullableString2 = JsonParsingUtils.INSTANCE.readNullableString(reader);
                                strNextString5 = str;
                                strNextString4 = str2;
                                boolValueOf = bool;
                                numValueOf2 = num;
                                numValueOf = num2;
                                list2 = list6;
                                list4 = list7;
                                list = list8;
                                strNextString = str3;
                                strNextString3 = str4;
                                date = date7;
                                strNextString2 = str5;
                                list3 = list9;
                                mapAccumulateExtraData = map;
                            }
                            break;
                        default:
                            break;
                    }
                }
                JsonParsingUtils jsonParsingUtils3 = JsonParsingUtils.INSTANCE;
                AbstractC22676k.m65747g(strNextName);
                mapAccumulateExtraData = jsonParsingUtils3.accumulateExtraData(strNextName, reader, map);
                strNextString5 = str;
                strNextString4 = str2;
                boolValueOf = bool;
                numValueOf2 = num;
                numValueOf = num2;
                list2 = list6;
                list4 = list7;
                list = list8;
                strNextString = str3;
                strNextString3 = str4;
                date = date7;
                strNextString2 = str5;
                list3 = list9;
            } else {
                reader.endObject();
                JsonParsingUtils jsonParsingUtils4 = JsonParsingUtils.INSTANCE;
                jsonParsingUtils4.requireField(list9, "attachments", reader);
                jsonParsingUtils4.requireField(str5, "cid", reader);
                jsonParsingUtils4.requireField(date7, "created_at", reader);
                jsonParsingUtils4.requireField(str4, "html", reader);
                jsonParsingUtils4.requireField(str3, "id", reader);
                jsonParsingUtils4.requireField(list8, "latest_reactions", reader);
                jsonParsingUtils4.requireField(list7, "mentioned_users", reader);
                jsonParsingUtils4.requireField(list6, "own_reactions", reader);
                jsonParsingUtils4.requireField(num2, "reply_count", reader);
                jsonParsingUtils4.requireField(num, "deleted_reply_count", reader);
                jsonParsingUtils4.requireField(bool, NotificationCompat.GROUP_KEY_SILENT, reader);
                jsonParsingUtils4.requireField(str2, "text", reader);
                jsonParsingUtils4.requireField(str, "type", reader);
                Date date8 = date2;
                jsonParsingUtils4.requireField(date8, "updated_at", reader);
                User user3 = user2;
                jsonParsingUtils4.requireField(user3, UserState.Sources.USER, reader);
                ChannelInfo channelInfo2 = channelInfo == null ? fallbackChannelInfo : channelInfo;
                if (messageCopy != null) {
                    if (channelInfo2 != null && messageCopy.getChannelInfo() == null) {
                        messageCopy = messageCopy.copy(((-1) & 1) != 0 ? messageCopy.id : null, ((-1) & 2) != 0 ? messageCopy.cid : null, ((-1) & 4) != 0 ? messageCopy.text : null, ((-1) & 8) != 0 ? messageCopy.html : null, ((-1) & 16) != 0 ? messageCopy.parentId : null, ((-1) & 32) != 0 ? messageCopy.command : null, ((-1) & 64) != 0 ? messageCopy.attachments : null, ((-1) & 128) != 0 ? messageCopy.mentionedUsersIds : null, ((-1) & 256) != 0 ? messageCopy.mentionedUsers : null, ((-1) & 512) != 0 ? messageCopy.replyCount : 0, ((-1) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? messageCopy.deletedReplyCount : 0, ((-1) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? messageCopy.reactionCounts : null, ((-1) & 4096) != 0 ? messageCopy.reactionScores : null, ((-1) & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? messageCopy.reactionGroups : null, ((-1) & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? messageCopy.syncStatus : null, ((-1) & 32768) != 0 ? messageCopy.type : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? messageCopy.latestReactions : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? messageCopy.ownReactions : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? messageCopy.createdAt : null, ((-1) & 524288) != 0 ? messageCopy.updatedAt : null, ((-1) & 1048576) != 0 ? messageCopy.deletedAt : null, ((-1) & 2097152) != 0 ? messageCopy.updatedLocallyAt : null, ((-1) & 4194304) != 0 ? messageCopy.createdLocallyAt : null, ((-1) & 8388608) != 0 ? messageCopy.user : null, ((-1) & 16777216) != 0 ? messageCopy.extraData : null, ((-1) & AndroidSDKConstants.FLAG_MUTABLE) != 0 ? messageCopy.silent : false, ((-1) & 67108864) != 0 ? messageCopy.shadowed : false, ((-1) & 134217728) != 0 ? messageCopy.i18n : null, ((-1) & 268435456) != 0 ? messageCopy.showInChannel : false, ((-1) & 536870912) != 0 ? messageCopy.channelInfo : channelInfo2, ((-1) & 1073741824) != 0 ? messageCopy.replyTo : null, ((-1) & Integer.MIN_VALUE) != 0 ? messageCopy.replyMessageId : null, (65535 & 1) != 0 ? messageCopy.pinned : false, (65535 & 2) != 0 ? messageCopy.pinnedAt : null, (65535 & 4) != 0 ? messageCopy.pinExpires : null, (65535 & 8) != 0 ? messageCopy.pinnedBy : null, (65535 & 16) != 0 ? messageCopy.threadParticipants : null, (65535 & 32) != 0 ? messageCopy.skipPushNotification : false, (65535 & 64) != 0 ? messageCopy.skipEnrichUrl : false, (65535 & 128) != 0 ? messageCopy.moderationDetails : null, (65535 & 256) != 0 ? messageCopy.moderation : null, (65535 & 512) != 0 ? messageCopy.messageTextUpdatedAt : null, (65535 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? messageCopy.poll : null, (65535 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? messageCopy.restrictedVisibility : null, (65535 & 4096) != 0 ? messageCopy.reminder : null, (65535 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? messageCopy.sharedLocation : null, (65535 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? messageCopy.channelRole : null, (65535 & 32768) != 0 ? messageCopy.deletedForMe : false);
                    }
                    message = messageCopy;
                } else {
                    message = null;
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj : list8) {
                    if (AbstractC22676k.m65745e(((Reaction) obj).getMessageId(), str3)) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : list6) {
                    User user4 = user3;
                    if (AbstractC22676k.m65745e(((Reaction) obj2).getMessageId(), str3)) {
                        arrayList2.add(obj2);
                    }
                    user3 = user4;
                }
                User user5 = user3;
                Iterator it = AbstractC25260n.m74077r0(new Date[]{date8, poll != null ? poll.getUpdatedAt() : null}).iterator();
                if (it.hasNext()) {
                    next = it.next();
                    if (it.hasNext()) {
                        long time = ((Date) next).getTime();
                        while (true) {
                            Object next2 = it.next();
                            long time2 = ((Date) next2).getTime();
                            if (time < time2) {
                                next = next2;
                                time = time2;
                            }
                            if (it.hasNext()) {
                                arrayList = arrayList;
                                arrayList2 = arrayList2;
                            }
                        }
                    }
                } else {
                    next = null;
                }
                Date date9 = (Date) next;
                if (date9 == null) {
                    date9 = date8;
                }
                C25272z c25272z = C25272z.f99163w;
                Map map2 = stringMap == null ? c25272z : stringMap;
                boolean zBooleanValue = boolValueOf2 != null ? boolValueOf2.booleanValue() : false;
                if (linkedHashMap == null) {
                    linkedHashMap = new LinkedHashMap<>();
                }
                Map<String, Integer> map3 = linkedHashMap;
                if (linkedHashMap2 == null) {
                    linkedHashMap2 = new LinkedHashMap<>();
                }
                if (reactionGroupsMap == null) {
                    reactionGroupsMap = c25272z;
                }
                boolean zBooleanValue2 = boolValueOf3 != null ? boolValueOf3.booleanValue() : false;
                boolean zBooleanValue3 = boolValueOf4 != null ? boolValueOf4.booleanValue() : false;
                C25271y c25271y = C25271y.f99162w;
                return this.messageTransformer.transform(new Message(str3, str5, str2, str4, nullableString2, nullableString, list9, null, list7, num2.intValue(), num.intValue(), map3, linkedHashMap2, reactionGroupsMap, null, str, arrayList, arrayList2, date7, date9, date3, null, null, user5, map == null ? c25272z : map, bool.booleanValue(), zBooleanValue2, map2, zBooleanValue3, channelInfo2, message, nullableString3, zBooleanValue, date4, date5, user, list5 == null ? c25271y : list5, false, false, messageModerationDetails, moderation, date6, poll, c25271y, messageReminderInfo, location, memberChannelRole, nullableBoolean != null ? nullableBoolean.booleanValue() : false, 6307968, 96, null));
            }
        }
    }
}
