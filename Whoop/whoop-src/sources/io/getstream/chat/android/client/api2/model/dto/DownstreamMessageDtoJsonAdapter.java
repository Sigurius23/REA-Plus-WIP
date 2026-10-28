package io.getstream.chat.android.client.api2.model.dto;

import androidx.core.app.NotificationCompat;
import androidx.health.platform.client.proto.C1533u;
import androidx.room.AbstractC1772c1;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.whoop.service.network.model.UserState;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Date;
import java.util.List;
import java.util.Map;
import m83.C25235a0;
import p441qx.AbstractC30704c0;
import p441qx.C30722l0;
import p441qx.C30740v;
import p471rx.AbstractC31885f;
import p471rx.C31882d;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R \u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001aR\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001aR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001aR\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001aR&\u0010#\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u001aR \u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u001aR \u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u001aR\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020(0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010\u001aR\u001c\u0010*\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010&0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010\u001aR\u001c\u0010+\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010\u001aR(\u0010-\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020,\u0018\u00010\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010\u001aR(\u0010/\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020.\u0018\u00010\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010\u001aR\u001a\u00100\u001a\b\u0012\u0004\u0012\u00020,0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010\u001aR\u001a\u00101\u001a\b\u0012\u0004\u0012\u00020&0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010\u001aR\u001c\u00103\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010\u001aR\u001c\u00105\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001040\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010\u001aR\u001c\u00107\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001060\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u0010\u001aR\u001c\u00109\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001080\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010\u001aR\u001c\u0010;\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010:0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010\u001aR\u001c\u0010=\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010<0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010\u001aR\u001c\u0010>\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010(0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010\u001aR&\u0010@\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020?0\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010\u001aR\u001e\u0010B\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010C¨\u0006D"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;", "Lqx/l0;", "moshi", "<init>", "(Lqx/l0;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "(Lcom/squareup/moshi/JsonReader;)Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;", "Lqx/c0;", "writer", "value_", "Ll83/a0;", "toJson", "(Lqx/c0;Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;)V", "Lqx/v;", "options", "Lqx/v;", "", "Lio/getstream/chat/android/client/api2/model/dto/AttachmentDto;", "listOfAttachmentDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lio/getstream/chat/android/client/api2/model/dto/ChannelInfoDto;", "nullableChannelInfoDtoAdapter", "stringAdapter", "nullableStringAdapter", "Ljava/util/Date;", "dateAdapter", "nullableDateAdapter", "", "mapOfStringStringAdapter", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamReactionDto;", "listOfDownstreamReactionDtoAdapter", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;", "listOfDownstreamUserDtoAdapter", "", "booleanAdapter", "nullableDownstreamUserDtoAdapter", "nullableDownstreamMessageDtoAdapter", "", "nullableMapOfStringIntAdapter", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamReactionGroupDto;", "nullableMapOfStringDownstreamReactionGroupDtoAdapter", "intAdapter", "downstreamUserDtoAdapter", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamModerationDetailsDto;", "nullableDownstreamModerationDetailsDtoAdapter", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamModerationDto;", "nullableDownstreamModerationDtoAdapter", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;", "nullableDownstreamPollDtoAdapter", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamReminderInfoDto;", "nullableDownstreamReminderInfoDtoAdapter", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamLocationDto;", "nullableDownstreamLocationDtoAdapter", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamMemberInfoDto;", "nullableDownstreamMemberInfoDtoAdapter", "nullableBooleanAdapter", "", "mapOfStringAnyAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class DownstreamMessageDtoJsonAdapter extends JsonAdapter<DownstreamMessageDto> {
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<DownstreamMessageDto> constructorRef;
    private final JsonAdapter<Date> dateAdapter;
    private final JsonAdapter<DownstreamUserDto> downstreamUserDtoAdapter;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<List<AttachmentDto>> listOfAttachmentDtoAdapter;
    private final JsonAdapter<List<DownstreamReactionDto>> listOfDownstreamReactionDtoAdapter;
    private final JsonAdapter<List<DownstreamUserDto>> listOfDownstreamUserDtoAdapter;
    private final JsonAdapter<Map<String, Object>> mapOfStringAnyAdapter;
    private final JsonAdapter<Map<String, String>> mapOfStringStringAdapter;
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonAdapter<ChannelInfoDto> nullableChannelInfoDtoAdapter;
    private final JsonAdapter<Date> nullableDateAdapter;
    private final JsonAdapter<DownstreamLocationDto> nullableDownstreamLocationDtoAdapter;
    private final JsonAdapter<DownstreamMemberInfoDto> nullableDownstreamMemberInfoDtoAdapter;
    private final JsonAdapter<DownstreamMessageDto> nullableDownstreamMessageDtoAdapter;
    private final JsonAdapter<DownstreamModerationDetailsDto> nullableDownstreamModerationDetailsDtoAdapter;
    private final JsonAdapter<DownstreamModerationDto> nullableDownstreamModerationDtoAdapter;
    private final JsonAdapter<DownstreamPollDto> nullableDownstreamPollDtoAdapter;
    private final JsonAdapter<DownstreamReminderInfoDto> nullableDownstreamReminderInfoDtoAdapter;
    private final JsonAdapter<DownstreamUserDto> nullableDownstreamUserDtoAdapter;
    private final JsonAdapter<Map<String, DownstreamReactionGroupDto>> nullableMapOfStringDownstreamReactionGroupDtoAdapter;
    private final JsonAdapter<Map<String, Integer>> nullableMapOfStringIntAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final C30740v options;
    private final JsonAdapter<String> stringAdapter;

    public DownstreamMessageDtoJsonAdapter(C30722l0 moshi) {
        AbstractC22676k.m65750j(moshi, "moshi");
        this.options = C30740v.m94403a("attachments", "channel", "cid", "command", "created_at", "deleted_at", "html", "i18n", "id", "latest_reactions", "mentioned_users", "own_reactions", "parent_id", "pin_expires", "pinned", "pinned_at", "message_text_updated_at", "pinned_by", "quoted_message", "quoted_message_id", "reaction_counts", "reaction_scores", "reaction_groups", "reply_count", "deleted_reply_count", "shadowed", "show_in_channel", NotificationCompat.GROUP_KEY_SILENT, "text", "thread_participants", "type", "updated_at", UserState.Sources.USER, "moderation_details", "moderation", "poll", NotificationCompat.CATEGORY_REMINDER, "shared_location", "member", "deleted_for_me", "extraData");
        C31882d c31882dM5369F = AbstractC1772c1.m5369F(List.class, AttachmentDto.class);
        C25235a0 c25235a0 = C25235a0.f99113w;
        this.listOfAttachmentDtoAdapter = moshi.m94400c(c31882dM5369F, c25235a0, "attachments");
        this.nullableChannelInfoDtoAdapter = moshi.m94400c(ChannelInfoDto.class, c25235a0, "channel");
        this.stringAdapter = moshi.m94400c(String.class, c25235a0, "cid");
        this.nullableStringAdapter = moshi.m94400c(String.class, c25235a0, "command");
        this.dateAdapter = moshi.m94400c(Date.class, c25235a0, "created_at");
        this.nullableDateAdapter = moshi.m94400c(Date.class, c25235a0, "deleted_at");
        this.mapOfStringStringAdapter = moshi.m94400c(AbstractC1772c1.m5369F(Map.class, String.class, String.class), c25235a0, "i18n");
        this.listOfDownstreamReactionDtoAdapter = moshi.m94400c(AbstractC1772c1.m5369F(List.class, DownstreamReactionDto.class), c25235a0, "latest_reactions");
        this.listOfDownstreamUserDtoAdapter = moshi.m94400c(AbstractC1772c1.m5369F(List.class, DownstreamUserDto.class), c25235a0, "mentioned_users");
        this.booleanAdapter = moshi.m94400c(Boolean.TYPE, c25235a0, "pinned");
        this.nullableDownstreamUserDtoAdapter = moshi.m94400c(DownstreamUserDto.class, c25235a0, "pinned_by");
        this.nullableDownstreamMessageDtoAdapter = moshi.m94400c(DownstreamMessageDto.class, c25235a0, "quoted_message");
        this.nullableMapOfStringIntAdapter = moshi.m94400c(AbstractC1772c1.m5369F(Map.class, String.class, Integer.class), c25235a0, "reaction_counts");
        this.nullableMapOfStringDownstreamReactionGroupDtoAdapter = moshi.m94400c(AbstractC1772c1.m5369F(Map.class, String.class, DownstreamReactionGroupDto.class), c25235a0, "reaction_groups");
        this.intAdapter = moshi.m94400c(Integer.TYPE, c25235a0, "reply_count");
        this.downstreamUserDtoAdapter = moshi.m94400c(DownstreamUserDto.class, c25235a0, UserState.Sources.USER);
        this.nullableDownstreamModerationDetailsDtoAdapter = moshi.m94400c(DownstreamModerationDetailsDto.class, c25235a0, "moderation_details");
        this.nullableDownstreamModerationDtoAdapter = moshi.m94400c(DownstreamModerationDto.class, c25235a0, "moderation");
        this.nullableDownstreamPollDtoAdapter = moshi.m94400c(DownstreamPollDto.class, c25235a0, "poll");
        this.nullableDownstreamReminderInfoDtoAdapter = moshi.m94400c(DownstreamReminderInfoDto.class, c25235a0, NotificationCompat.CATEGORY_REMINDER);
        this.nullableDownstreamLocationDtoAdapter = moshi.m94400c(DownstreamLocationDto.class, c25235a0, "shared_location");
        this.nullableDownstreamMemberInfoDtoAdapter = moshi.m94400c(DownstreamMemberInfoDto.class, c25235a0, "member");
        this.nullableBooleanAdapter = moshi.m94400c(Boolean.class, c25235a0, "deleted_for_me");
        this.mapOfStringAnyAdapter = moshi.m94400c(AbstractC1772c1.m5369F(Map.class, String.class, Object.class), c25235a0, "extraData");
    }

    public String toString() {
        return AbstractC36095b.m114677e(42, "GeneratedJsonAdapter(DownstreamMessageDto)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public DownstreamMessageDto fromJson(JsonReader reader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException {
        int i13;
        AbstractC22676k.m65750j(reader, "reader");
        Boolean bool = Boolean.FALSE;
        reader.beginObject();
        List list = null;
        int i14 = -1;
        Boolean bool2 = bool;
        Boolean bool3 = bool2;
        Boolean bool4 = bool3;
        Map map = null;
        List list2 = null;
        List list3 = null;
        List list4 = null;
        String str = null;
        Integer num = null;
        Integer num2 = null;
        Boolean bool5 = null;
        List list5 = null;
        ChannelInfoDto channelInfoDto = null;
        String str2 = null;
        String str3 = null;
        Date date = null;
        Date date2 = null;
        String str4 = null;
        String str5 = null;
        Date date3 = null;
        Date date4 = null;
        Date date5 = null;
        DownstreamUserDto downstreamUserDto = null;
        DownstreamMessageDto downstreamMessageDto = null;
        String str6 = null;
        Map map2 = null;
        Map map3 = null;
        Map map4 = null;
        String str7 = null;
        String str8 = null;
        Date date6 = null;
        DownstreamUserDto downstreamUserDto2 = null;
        DownstreamModerationDetailsDto downstreamModerationDetailsDto = null;
        DownstreamModerationDto downstreamModerationDto = null;
        DownstreamPollDto downstreamPollDto = null;
        DownstreamReminderInfoDto downstreamReminderInfoDto = null;
        DownstreamLocationDto downstreamLocationDto = null;
        DownstreamMemberInfoDto downstreamMemberInfoDto = null;
        Boolean bool6 = null;
        Map map5 = null;
        int i15 = -1;
        while (true) {
            List list6 = list2;
            List list7 = list3;
            List list8 = list;
            Map map6 = map;
            int i16 = i15;
            if (!reader.hasNext()) {
                reader.endObject();
                if (i14 == -637550721) {
                    if (i16 == -127) {
                        Boolean bool7 = bool5;
                        if (list5 == null) {
                            throw AbstractC31885f.m99129g("attachments", "attachments", reader);
                        }
                        if (str2 == null) {
                            throw AbstractC31885f.m99129g("cid", "cid", reader);
                        }
                        if (date == null) {
                            throw AbstractC31885f.m99129g("created_at", "created_at", reader);
                        }
                        if (str4 == null) {
                            throw AbstractC31885f.m99129g("html", "html", reader);
                        }
                        AbstractC22676k.m65748h(map6, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                        if (str5 == null) {
                            throw AbstractC31885f.m99129g("id", "id", reader);
                        }
                        if (list6 == null) {
                            throw AbstractC31885f.m99129g("latest_reactions", "latest_reactions", reader);
                        }
                        if (list7 == null) {
                            throw AbstractC31885f.m99129g("mentioned_users", "mentioned_users", reader);
                        }
                        if (list4 == null) {
                            throw AbstractC31885f.m99129g("own_reactions", "own_reactions", reader);
                        }
                        boolean zBooleanValue = bool2.booleanValue();
                        if (num == null) {
                            throw AbstractC31885f.m99129g("reply_count", "reply_count", reader);
                        }
                        int iIntValue = num.intValue();
                        if (num2 == null) {
                            throw AbstractC31885f.m99129g("deleted_reply_count", "deleted_reply_count", reader);
                        }
                        int iIntValue2 = num2.intValue();
                        boolean zBooleanValue2 = bool3.booleanValue();
                        boolean zBooleanValue3 = bool4.booleanValue();
                        if (bool7 == null) {
                            throw AbstractC31885f.m99129g(NotificationCompat.GROUP_KEY_SILENT, NotificationCompat.GROUP_KEY_SILENT, reader);
                        }
                        boolean zBooleanValue4 = bool7.booleanValue();
                        if (str7 == null) {
                            throw AbstractC31885f.m99129g("text", "text", reader);
                        }
                        AbstractC22676k.m65748h(list8, "null cannot be cast to non-null type kotlin.collections.List<io.getstream.chat.android.client.api2.model.dto.DownstreamUserDto>");
                        if (str8 == null) {
                            throw AbstractC31885f.m99129g("type", "type", reader);
                        }
                        if (date6 == null) {
                            throw AbstractC31885f.m99129g("updated_at", "updated_at", reader);
                        }
                        if (downstreamUserDto2 == null) {
                            throw AbstractC31885f.m99129g(UserState.Sources.USER, UserState.Sources.USER, reader);
                        }
                        if (map5 != null) {
                            return new DownstreamMessageDto(list5, channelInfoDto, str2, str3, date, date2, str4, map6, str5, list6, list7, list4, str, date3, zBooleanValue, date4, date5, downstreamUserDto, downstreamMessageDto, str6, map2, map3, map4, iIntValue, iIntValue2, zBooleanValue2, zBooleanValue3, zBooleanValue4, str7, list8, str8, date6, downstreamUserDto2, downstreamModerationDetailsDto, downstreamModerationDto, downstreamPollDto, downstreamReminderInfoDto, downstreamLocationDto, downstreamMemberInfoDto, bool6, map5);
                        }
                        throw AbstractC31885f.m99129g("extraData", "extraData", reader);
                    }
                    i16 = i16;
                }
                Constructor<DownstreamMessageDto> declaredConstructor = this.constructorRef;
                if (declaredConstructor == null) {
                    Class cls = AbstractC31885f.f132392c;
                    Class cls2 = Boolean.TYPE;
                    Class cls3 = Integer.TYPE;
                    declaredConstructor = DownstreamMessageDto.class.getDeclaredConstructor(List.class, ChannelInfoDto.class, String.class, String.class, Date.class, Date.class, String.class, Map.class, String.class, List.class, List.class, List.class, String.class, Date.class, cls2, Date.class, Date.class, DownstreamUserDto.class, DownstreamMessageDto.class, String.class, Map.class, Map.class, Map.class, cls3, cls3, cls2, cls2, cls2, String.class, List.class, String.class, Date.class, DownstreamUserDto.class, DownstreamModerationDetailsDto.class, DownstreamModerationDto.class, DownstreamPollDto.class, DownstreamReminderInfoDto.class, DownstreamLocationDto.class, DownstreamMemberInfoDto.class, Boolean.class, Map.class, cls3, cls3, cls);
                    this.constructorRef = declaredConstructor;
                    AbstractC22676k.m65749i(declaredConstructor, "also(...)");
                }
                if (list5 == null) {
                    throw AbstractC31885f.m99129g("attachments", "attachments", reader);
                }
                if (str2 == null) {
                    throw AbstractC31885f.m99129g("cid", "cid", reader);
                }
                if (date == null) {
                    throw AbstractC31885f.m99129g("created_at", "created_at", reader);
                }
                if (str4 == null) {
                    throw AbstractC31885f.m99129g("html", "html", reader);
                }
                if (str5 == null) {
                    throw AbstractC31885f.m99129g("id", "id", reader);
                }
                if (list6 == null) {
                    throw AbstractC31885f.m99129g("latest_reactions", "latest_reactions", reader);
                }
                if (list7 == null) {
                    throw AbstractC31885f.m99129g("mentioned_users", "mentioned_users", reader);
                }
                if (list4 == null) {
                    throw AbstractC31885f.m99129g("own_reactions", "own_reactions", reader);
                }
                if (num == null) {
                    throw AbstractC31885f.m99129g("reply_count", "reply_count", reader);
                }
                if (num2 == null) {
                    throw AbstractC31885f.m99129g("deleted_reply_count", "deleted_reply_count", reader);
                }
                if (bool5 == null) {
                    throw AbstractC31885f.m99129g(NotificationCompat.GROUP_KEY_SILENT, NotificationCompat.GROUP_KEY_SILENT, reader);
                }
                if (str7 == null) {
                    throw AbstractC31885f.m99129g("text", "text", reader);
                }
                if (str8 == null) {
                    throw AbstractC31885f.m99129g("type", "type", reader);
                }
                if (date6 == null) {
                    throw AbstractC31885f.m99129g("updated_at", "updated_at", reader);
                }
                if (downstreamUserDto2 == null) {
                    throw AbstractC31885f.m99129g(UserState.Sources.USER, UserState.Sources.USER, reader);
                }
                if (map5 == null) {
                    throw AbstractC31885f.m99129g("extraData", "extraData", reader);
                }
                DownstreamMessageDto downstreamMessageDtoNewInstance = declaredConstructor.newInstance(list5, channelInfoDto, str2, str3, date, date2, str4, map6, str5, list6, list7, list4, str, date3, bool2, date4, date5, downstreamUserDto, downstreamMessageDto, str6, map2, map3, map4, num, num2, bool3, bool4, bool5, str7, list8, str8, date6, downstreamUserDto2, downstreamModerationDetailsDto, downstreamModerationDto, downstreamPollDto, downstreamReminderInfoDto, downstreamLocationDto, downstreamMemberInfoDto, bool6, map5, Integer.valueOf(i14), Integer.valueOf(i16), null);
                AbstractC22676k.m65749i(downstreamMessageDtoNewInstance, "newInstance(...)");
                return downstreamMessageDtoNewInstance;
            }
            switch (reader.mo16725T(this.options)) {
                case -1:
                    reader.mo16728b0();
                    reader.skipValue();
                    i15 = i16;
                    map = map6;
                    list2 = list6;
                    list3 = list7;
                    list = list8;
                    break;
                case 0:
                    list5 = (List) this.listOfAttachmentDtoAdapter.fromJson(reader);
                    if (list5 == null) {
                        throw AbstractC31885f.m99135m("attachments", "attachments", reader);
                    }
                    i15 = i16;
                    map = map6;
                    list2 = list6;
                    list3 = list7;
                    list = list8;
                    break;
                case 1:
                    channelInfoDto = (ChannelInfoDto) this.nullableChannelInfoDtoAdapter.fromJson(reader);
                    i15 = i16;
                    map = map6;
                    list2 = list6;
                    list3 = list7;
                    list = list8;
                    break;
                case 2:
                    str2 = (String) this.stringAdapter.fromJson(reader);
                    if (str2 == null) {
                        throw AbstractC31885f.m99135m("cid", "cid", reader);
                    }
                    i15 = i16;
                    map = map6;
                    list2 = list6;
                    list3 = list7;
                    list = list8;
                    break;
                case 3:
                    str3 = (String) this.nullableStringAdapter.fromJson(reader);
                    i15 = i16;
                    map = map6;
                    list2 = list6;
                    list3 = list7;
                    list = list8;
                    break;
                case 4:
                    date = (Date) this.dateAdapter.fromJson(reader);
                    if (date == null) {
                        throw AbstractC31885f.m99135m("created_at", "created_at", reader);
                    }
                    i15 = i16;
                    map = map6;
                    list2 = list6;
                    list3 = list7;
                    list = list8;
                    break;
                case 5:
                    date2 = (Date) this.nullableDateAdapter.fromJson(reader);
                    i15 = i16;
                    map = map6;
                    list2 = list6;
                    list3 = list7;
                    list = list8;
                    break;
                case 6:
                    str4 = (String) this.stringAdapter.fromJson(reader);
                    if (str4 == null) {
                        throw AbstractC31885f.m99135m("html", "html", reader);
                    }
                    i15 = i16;
                    map = map6;
                    list2 = list6;
                    list3 = list7;
                    list = list8;
                    break;
                case 7:
                    map = (Map) this.mapOfStringStringAdapter.fromJson(reader);
                    if (map == null) {
                        throw AbstractC31885f.m99135m("i18n", "i18n", reader);
                    }
                    i14 &= -129;
                    i15 = i16;
                    list2 = list6;
                    list3 = list7;
                    list = list8;
                    break;
                    break;
                case 8:
                    str5 = (String) this.stringAdapter.fromJson(reader);
                    if (str5 == null) {
                        throw AbstractC31885f.m99135m("id", "id", reader);
                    }
                    i15 = i16;
                    map = map6;
                    list2 = list6;
                    list3 = list7;
                    list = list8;
                    break;
                case 9:
                    list2 = (List) this.listOfDownstreamReactionDtoAdapter.fromJson(reader);
                    if (list2 == null) {
                        throw AbstractC31885f.m99135m("latest_reactions", "latest_reactions", reader);
                    }
                    i15 = i16;
                    map = map6;
                    list3 = list7;
                    list = list8;
                    break;
                    break;
                case 10:
                    list3 = (List) this.listOfDownstreamUserDtoAdapter.fromJson(reader);
                    if (list3 == null) {
                        throw AbstractC31885f.m99135m("mentioned_users", "mentioned_users", reader);
                    }
                    i15 = i16;
                    map = map6;
                    list2 = list6;
                    list = list8;
                    break;
                    break;
                case 11:
                    list4 = (List) this.listOfDownstreamReactionDtoAdapter.fromJson(reader);
                    if (list4 == null) {
                        throw AbstractC31885f.m99135m("own_reactions", "own_reactions", reader);
                    }
                    i15 = i16;
                    map = map6;
                    list2 = list6;
                    list3 = list7;
                    list = list8;
                    break;
                case 12:
                    str = (String) this.nullableStringAdapter.fromJson(reader);
                    i15 = i16;
                    map = map6;
                    list2 = list6;
                    list3 = list7;
                    list = list8;
                    break;
                case 13:
                    date3 = (Date) this.nullableDateAdapter.fromJson(reader);
                    i15 = i16;
                    map = map6;
                    list2 = list6;
                    list3 = list7;
                    list = list8;
                    break;
                case 14:
                    bool2 = (Boolean) this.booleanAdapter.fromJson(reader);
                    if (bool2 == null) {
                        throw AbstractC31885f.m99135m("pinned", "pinned", reader);
                    }
                    i14 &= -16385;
                    i15 = i16;
                    map = map6;
                    list2 = list6;
                    list3 = list7;
                    list = list8;
                    break;
                    break;
                case 15:
                    date4 = (Date) this.nullableDateAdapter.fromJson(reader);
                    i15 = i16;
                    map = map6;
                    list2 = list6;
                    list3 = list7;
                    list = list8;
                    break;
                case 16:
                    date5 = (Date) this.nullableDateAdapter.fromJson(reader);
                    i15 = i16;
                    map = map6;
                    list2 = list6;
                    list3 = list7;
                    list = list8;
                    break;
                case C1533u.MAX_FIELD_NUMBER /* 17 */:
                    downstreamUserDto = (DownstreamUserDto) this.nullableDownstreamUserDtoAdapter.fromJson(reader);
                    i15 = i16;
                    map = map6;
                    list2 = list6;
                    list3 = list7;
                    list = list8;
                    break;
                case C1533u.AVG_FIELD_NUMBER /* 18 */:
                    downstreamMessageDto = (DownstreamMessageDto) this.nullableDownstreamMessageDtoAdapter.fromJson(reader);
                    i15 = i16;
                    map = map6;
                    list2 = list6;
                    list3 = list7;
                    list = list8;
                    break;
                case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                    str6 = (String) this.nullableStringAdapter.fromJson(reader);
                    i15 = i16;
                    map = map6;
                    list2 = list6;
                    list3 = list7;
                    list = list8;
                    break;
                case 20:
                    map2 = (Map) this.nullableMapOfStringIntAdapter.fromJson(reader);
                    i15 = i16;
                    map = map6;
                    list2 = list6;
                    list3 = list7;
                    list = list8;
                    break;
                case 21:
                    map3 = (Map) this.nullableMapOfStringIntAdapter.fromJson(reader);
                    i15 = i16;
                    map = map6;
                    list2 = list6;
                    list3 = list7;
                    list = list8;
                    break;
                case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                    map4 = (Map) this.nullableMapOfStringDownstreamReactionGroupDtoAdapter.fromJson(reader);
                    i15 = i16;
                    map = map6;
                    list2 = list6;
                    list3 = list7;
                    list = list8;
                    break;
                case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                    num = (Integer) this.intAdapter.fromJson(reader);
                    if (num == null) {
                        throw AbstractC31885f.m99135m("reply_count", "reply_count", reader);
                    }
                    i15 = i16;
                    map = map6;
                    list2 = list6;
                    list3 = list7;
                    list = list8;
                    break;
                case 24:
                    num2 = (Integer) this.intAdapter.fromJson(reader);
                    if (num2 == null) {
                        throw AbstractC31885f.m99135m("deleted_reply_count", "deleted_reply_count", reader);
                    }
                    i15 = i16;
                    map = map6;
                    list2 = list6;
                    list3 = list7;
                    list = list8;
                    break;
                case 25:
                    bool3 = (Boolean) this.booleanAdapter.fromJson(reader);
                    if (bool3 == null) {
                        throw AbstractC31885f.m99135m("shadowed", "shadowed", reader);
                    }
                    i13 = -33554433;
                    i14 &= i13;
                    i15 = i16;
                    map = map6;
                    list2 = list6;
                    list3 = list7;
                    list = list8;
                    break;
                    break;
                case 26:
                    bool4 = (Boolean) this.booleanAdapter.fromJson(reader);
                    if (bool4 == null) {
                        throw AbstractC31885f.m99135m("show_in_channel", "show_in_channel", reader);
                    }
                    i13 = -67108865;
                    i14 &= i13;
                    i15 = i16;
                    map = map6;
                    list2 = list6;
                    list3 = list7;
                    list = list8;
                    break;
                    break;
                case 27:
                    bool5 = (Boolean) this.booleanAdapter.fromJson(reader);
                    if (bool5 == null) {
                        throw AbstractC31885f.m99135m(NotificationCompat.GROUP_KEY_SILENT, NotificationCompat.GROUP_KEY_SILENT, reader);
                    }
                    i15 = i16;
                    map = map6;
                    list2 = list6;
                    list3 = list7;
                    list = list8;
                    break;
                case 28:
                    str7 = (String) this.stringAdapter.fromJson(reader);
                    if (str7 == null) {
                        throw AbstractC31885f.m99135m("text", "text", reader);
                    }
                    i15 = i16;
                    map = map6;
                    list2 = list6;
                    list3 = list7;
                    list = list8;
                    break;
                case 29:
                    list = (List) this.listOfDownstreamUserDtoAdapter.fromJson(reader);
                    if (list == null) {
                        throw AbstractC31885f.m99135m("thread_participants", "thread_participants", reader);
                    }
                    i14 &= -536870913;
                    i15 = i16;
                    map = map6;
                    list2 = list6;
                    list3 = list7;
                    break;
                    break;
                case 30:
                    str8 = (String) this.stringAdapter.fromJson(reader);
                    if (str8 == null) {
                        throw AbstractC31885f.m99135m("type", "type", reader);
                    }
                    i15 = i16;
                    map = map6;
                    list2 = list6;
                    list3 = list7;
                    list = list8;
                    break;
                case 31:
                    date6 = (Date) this.dateAdapter.fromJson(reader);
                    if (date6 == null) {
                        throw AbstractC31885f.m99135m("updated_at", "updated_at", reader);
                    }
                    i15 = i16;
                    map = map6;
                    list2 = list6;
                    list3 = list7;
                    list = list8;
                    break;
                case 32:
                    downstreamUserDto2 = (DownstreamUserDto) this.downstreamUserDtoAdapter.fromJson(reader);
                    if (downstreamUserDto2 == null) {
                        throw AbstractC31885f.m99135m(UserState.Sources.USER, UserState.Sources.USER, reader);
                    }
                    i15 = i16;
                    map = map6;
                    list2 = list6;
                    list3 = list7;
                    list = list8;
                    break;
                case 33:
                    downstreamModerationDetailsDto = (DownstreamModerationDetailsDto) this.nullableDownstreamModerationDetailsDtoAdapter.fromJson(reader);
                    i15 = i16 & (-3);
                    map = map6;
                    list2 = list6;
                    list3 = list7;
                    list = list8;
                    break;
                case 34:
                    downstreamModerationDto = (DownstreamModerationDto) this.nullableDownstreamModerationDtoAdapter.fromJson(reader);
                    i15 = i16 & (-5);
                    map = map6;
                    list2 = list6;
                    list3 = list7;
                    list = list8;
                    break;
                case 35:
                    downstreamPollDto = (DownstreamPollDto) this.nullableDownstreamPollDtoAdapter.fromJson(reader);
                    i15 = i16 & (-9);
                    map = map6;
                    list2 = list6;
                    list3 = list7;
                    list = list8;
                    break;
                case 36:
                    downstreamReminderInfoDto = (DownstreamReminderInfoDto) this.nullableDownstreamReminderInfoDtoAdapter.fromJson(reader);
                    i15 = i16 & (-17);
                    map = map6;
                    list2 = list6;
                    list3 = list7;
                    list = list8;
                    break;
                case 37:
                    downstreamLocationDto = (DownstreamLocationDto) this.nullableDownstreamLocationDtoAdapter.fromJson(reader);
                    i15 = i16 & (-33);
                    map = map6;
                    list2 = list6;
                    list3 = list7;
                    list = list8;
                    break;
                case 38:
                    downstreamMemberInfoDto = (DownstreamMemberInfoDto) this.nullableDownstreamMemberInfoDtoAdapter.fromJson(reader);
                    i15 = i16 & (-65);
                    map = map6;
                    list2 = list6;
                    list3 = list7;
                    list = list8;
                    break;
                case 39:
                    bool6 = (Boolean) this.nullableBooleanAdapter.fromJson(reader);
                    i15 = i16;
                    map = map6;
                    list2 = list6;
                    list3 = list7;
                    list = list8;
                    break;
                case 40:
                    map5 = (Map) this.mapOfStringAnyAdapter.fromJson(reader);
                    if (map5 == null) {
                        throw AbstractC31885f.m99135m("extraData", "extraData", reader);
                    }
                    i15 = i16;
                    map = map6;
                    list2 = list6;
                    list3 = list7;
                    list = list8;
                    break;
                default:
                    i15 = i16;
                    map = map6;
                    list2 = list6;
                    list3 = list7;
                    list = list8;
                    break;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(AbstractC30704c0 writer, DownstreamMessageDto value_) {
        AbstractC22676k.m65750j(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.mo94368h();
        writer.mo94373x("attachments");
        this.listOfAttachmentDtoAdapter.toJson(writer, value_.getAttachments());
        writer.mo94373x("channel");
        this.nullableChannelInfoDtoAdapter.toJson(writer, value_.getChannel());
        writer.mo94373x("cid");
        this.stringAdapter.toJson(writer, value_.getCid());
        writer.mo94373x("command");
        this.nullableStringAdapter.toJson(writer, value_.getCommand());
        writer.mo94373x("created_at");
        this.dateAdapter.toJson(writer, value_.getCreated_at());
        writer.mo94373x("deleted_at");
        this.nullableDateAdapter.toJson(writer, value_.getDeleted_at());
        writer.mo94373x("html");
        this.stringAdapter.toJson(writer, value_.getHtml());
        writer.mo94373x("i18n");
        this.mapOfStringStringAdapter.toJson(writer, value_.getI18n());
        writer.mo94373x("id");
        this.stringAdapter.toJson(writer, value_.getId());
        writer.mo94373x("latest_reactions");
        this.listOfDownstreamReactionDtoAdapter.toJson(writer, value_.getLatest_reactions());
        writer.mo94373x("mentioned_users");
        this.listOfDownstreamUserDtoAdapter.toJson(writer, value_.getMentioned_users());
        writer.mo94373x("own_reactions");
        this.listOfDownstreamReactionDtoAdapter.toJson(writer, value_.getOwn_reactions());
        writer.mo94373x("parent_id");
        this.nullableStringAdapter.toJson(writer, value_.getParent_id());
        writer.mo94373x("pin_expires");
        this.nullableDateAdapter.toJson(writer, value_.getPin_expires());
        writer.mo94373x("pinned");
        this.booleanAdapter.toJson(writer, Boolean.valueOf(value_.getPinned()));
        writer.mo94373x("pinned_at");
        this.nullableDateAdapter.toJson(writer, value_.getPinned_at());
        writer.mo94373x("message_text_updated_at");
        this.nullableDateAdapter.toJson(writer, value_.getMessage_text_updated_at());
        writer.mo94373x("pinned_by");
        this.nullableDownstreamUserDtoAdapter.toJson(writer, value_.getPinned_by());
        writer.mo94373x("quoted_message");
        this.nullableDownstreamMessageDtoAdapter.toJson(writer, value_.getQuoted_message());
        writer.mo94373x("quoted_message_id");
        this.nullableStringAdapter.toJson(writer, value_.getQuoted_message_id());
        writer.mo94373x("reaction_counts");
        this.nullableMapOfStringIntAdapter.toJson(writer, value_.getReaction_counts());
        writer.mo94373x("reaction_scores");
        this.nullableMapOfStringIntAdapter.toJson(writer, value_.getReaction_scores());
        writer.mo94373x("reaction_groups");
        this.nullableMapOfStringDownstreamReactionGroupDtoAdapter.toJson(writer, value_.getReaction_groups());
        writer.mo94373x("reply_count");
        this.intAdapter.toJson(writer, Integer.valueOf(value_.getReply_count()));
        writer.mo94373x("deleted_reply_count");
        this.intAdapter.toJson(writer, Integer.valueOf(value_.getDeleted_reply_count()));
        writer.mo94373x("shadowed");
        this.booleanAdapter.toJson(writer, Boolean.valueOf(value_.getShadowed()));
        writer.mo94373x("show_in_channel");
        this.booleanAdapter.toJson(writer, Boolean.valueOf(value_.getShow_in_channel()));
        writer.mo94373x(NotificationCompat.GROUP_KEY_SILENT);
        this.booleanAdapter.toJson(writer, Boolean.valueOf(value_.getSilent()));
        writer.mo94373x("text");
        this.stringAdapter.toJson(writer, value_.getText());
        writer.mo94373x("thread_participants");
        this.listOfDownstreamUserDtoAdapter.toJson(writer, value_.getThread_participants());
        writer.mo94373x("type");
        this.stringAdapter.toJson(writer, value_.getType());
        writer.mo94373x("updated_at");
        this.dateAdapter.toJson(writer, value_.getUpdated_at());
        writer.mo94373x(UserState.Sources.USER);
        this.downstreamUserDtoAdapter.toJson(writer, value_.getUser());
        writer.mo94373x("moderation_details");
        this.nullableDownstreamModerationDetailsDtoAdapter.toJson(writer, value_.getModeration_details());
        writer.mo94373x("moderation");
        this.nullableDownstreamModerationDtoAdapter.toJson(writer, value_.getModeration());
        writer.mo94373x("poll");
        this.nullableDownstreamPollDtoAdapter.toJson(writer, value_.getPoll());
        writer.mo94373x(NotificationCompat.CATEGORY_REMINDER);
        this.nullableDownstreamReminderInfoDtoAdapter.toJson(writer, value_.getReminder());
        writer.mo94373x("shared_location");
        this.nullableDownstreamLocationDtoAdapter.toJson(writer, value_.getShared_location());
        writer.mo94373x("member");
        this.nullableDownstreamMemberInfoDtoAdapter.toJson(writer, value_.getMember());
        writer.mo94373x("deleted_for_me");
        this.nullableBooleanAdapter.toJson(writer, value_.getDeleted_for_me());
        writer.mo94373x("extraData");
        this.mapOfStringAnyAdapter.toJson(writer, value_.getExtraData());
        writer.mo94370m();
    }
}
