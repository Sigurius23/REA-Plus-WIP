package io.getstream.chat.android.client.api2.model.requests;

import hc3.AbstractC17176i;
import io.getstream.chat.android.client.api2.model.dto.ExtraDataDto;
import java.util.List;
import java.util.Map;
import live.hms.video.utils.HMSFieldTrials;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p127ev.AbstractC13673n;
import p441qx.InterfaceC30737t;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes5.dex */
@InterfaceC30737t(generateAdapter = HMSFieldTrials.DisableVideoAutoSubscribe)
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b%\b\u0081\b\u0018\u00002\u00020\u0001B\u0081\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0017J\u0010\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0017J\u000b\u0010)\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0017J\t\u0010+\u001a\u00020\u0006HÆ\u0003J\u0010\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0017J\u0010\u0010-\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u001fJ\t\u0010.\u001a\u00020\u0006HÆ\u0003J\u0011\u0010/\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0015\u00101\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00130\u0012HÆ\u0003J\u009e\u0001\u00102\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00062\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00062\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00130\u0012HÆ\u0001¢\u0006\u0002\u00103J\u0013\u00104\u001a\u00020\u00032\b\u00105\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u00106\u001a\u00020\u000bHÖ\u0001J\t\u00107\u001a\u00020\u0006HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0019\u0010\u0017R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u001c\u0010\u0017R\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001bR\u0015\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\t\u0010\u0017R\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010 \u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\f\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001bR\u0019\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001bR\u001d\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&¨\u00068"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/requests/UpdatePollRequest;", "Lio/getstream/chat/android/client/api2/model/dto/ExtraDataDto;", "allow_answers", "", "allow_user_suggested_options", "description", "", "enforce_unique_vote", "id", "is_closed", "max_votes_allowed", "", "name", "options", "", "Lio/getstream/chat/android/client/api2/model/requests/UpstreamOptionDto;", "voting_visibility", "extraData", "", "", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/Map;)V", "getAllow_answers", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getAllow_user_suggested_options", "getDescription", "()Ljava/lang/String;", "getEnforce_unique_vote", "getId", "getMax_votes_allowed", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getName", "getOptions", "()Ljava/util/List;", "getVoting_visibility", "getExtraData", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/Map;)Lio/getstream/chat/android/client/api2/model/requests/UpdatePollRequest;", "equals", "other", "hashCode", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class UpdatePollRequest implements ExtraDataDto {
    private final Boolean allow_answers;
    private final Boolean allow_user_suggested_options;
    private final String description;
    private final Boolean enforce_unique_vote;
    private final Map<String, Object> extraData;
    private final String id;
    private final Boolean is_closed;
    private final Integer max_votes_allowed;
    private final String name;
    private final List<UpstreamOptionDto> options;
    private final String voting_visibility;

    public UpdatePollRequest(Boolean bool, Boolean bool2, String str, Boolean bool3, String id4, Boolean bool4, Integer num, String name, List<UpstreamOptionDto> list, String str2, Map<String, ? extends Object> extraData) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(extraData, "extraData");
        this.allow_answers = bool;
        this.allow_user_suggested_options = bool2;
        this.description = str;
        this.enforce_unique_vote = bool3;
        this.id = id4;
        this.is_closed = bool4;
        this.max_votes_allowed = num;
        this.name = name;
        this.options = list;
        this.voting_visibility = str2;
        this.extraData = extraData;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UpdatePollRequest copy$default(UpdatePollRequest updatePollRequest, Boolean bool, Boolean bool2, String str, Boolean bool3, String str2, Boolean bool4, Integer num, String str3, List list, String str4, Map map, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            bool = updatePollRequest.allow_answers;
        }
        if ((i13 & 2) != 0) {
            bool2 = updatePollRequest.allow_user_suggested_options;
        }
        if ((i13 & 4) != 0) {
            str = updatePollRequest.description;
        }
        if ((i13 & 8) != 0) {
            bool3 = updatePollRequest.enforce_unique_vote;
        }
        if ((i13 & 16) != 0) {
            str2 = updatePollRequest.id;
        }
        if ((i13 & 32) != 0) {
            bool4 = updatePollRequest.is_closed;
        }
        if ((i13 & 64) != 0) {
            num = updatePollRequest.max_votes_allowed;
        }
        if ((i13 & 128) != 0) {
            str3 = updatePollRequest.name;
        }
        if ((i13 & 256) != 0) {
            list = updatePollRequest.options;
        }
        if ((i13 & 512) != 0) {
            str4 = updatePollRequest.voting_visibility;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
            map = updatePollRequest.extraData;
        }
        String str5 = str4;
        Map map2 = map;
        String str6 = str3;
        List list2 = list;
        Boolean bool5 = bool4;
        Integer num2 = num;
        String str7 = str2;
        String str8 = str;
        return updatePollRequest.copy(bool, bool2, str8, bool3, str7, bool5, num2, str6, list2, str5, map2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getAllow_answers() {
        return this.allow_answers;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getVoting_visibility() {
        return this.voting_visibility;
    }

    public final Map<String, Object> component11() {
        return this.extraData;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getAllow_user_suggested_options() {
        return this.allow_user_suggested_options;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Boolean getEnforce_unique_vote() {
        return this.enforce_unique_vote;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Boolean getIs_closed() {
        return this.is_closed;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Integer getMax_votes_allowed() {
        return this.max_votes_allowed;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final List<UpstreamOptionDto> component9() {
        return this.options;
    }

    public final UpdatePollRequest copy(Boolean allow_answers, Boolean allow_user_suggested_options, String description, Boolean enforce_unique_vote, String id4, Boolean is_closed, Integer max_votes_allowed, String name, List<UpstreamOptionDto> options, String voting_visibility, Map<String, ? extends Object> extraData) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(extraData, "extraData");
        return new UpdatePollRequest(allow_answers, allow_user_suggested_options, description, enforce_unique_vote, id4, is_closed, max_votes_allowed, name, options, voting_visibility, extraData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpdatePollRequest)) {
            return false;
        }
        UpdatePollRequest updatePollRequest = (UpdatePollRequest) other;
        return AbstractC22676k.m65745e(this.allow_answers, updatePollRequest.allow_answers) && AbstractC22676k.m65745e(this.allow_user_suggested_options, updatePollRequest.allow_user_suggested_options) && AbstractC22676k.m65745e(this.description, updatePollRequest.description) && AbstractC22676k.m65745e(this.enforce_unique_vote, updatePollRequest.enforce_unique_vote) && AbstractC22676k.m65745e(this.id, updatePollRequest.id) && AbstractC22676k.m65745e(this.is_closed, updatePollRequest.is_closed) && AbstractC22676k.m65745e(this.max_votes_allowed, updatePollRequest.max_votes_allowed) && AbstractC22676k.m65745e(this.name, updatePollRequest.name) && AbstractC22676k.m65745e(this.options, updatePollRequest.options) && AbstractC22676k.m65745e(this.voting_visibility, updatePollRequest.voting_visibility) && AbstractC22676k.m65745e(this.extraData, updatePollRequest.extraData);
    }

    public final Boolean getAllow_answers() {
        return this.allow_answers;
    }

    public final Boolean getAllow_user_suggested_options() {
        return this.allow_user_suggested_options;
    }

    public final String getDescription() {
        return this.description;
    }

    public final Boolean getEnforce_unique_vote() {
        return this.enforce_unique_vote;
    }

    public final Map<String, Object> getExtraData() {
        return this.extraData;
    }

    public final String getId() {
        return this.id;
    }

    public final Integer getMax_votes_allowed() {
        return this.max_votes_allowed;
    }

    public final String getName() {
        return this.name;
    }

    public final List<UpstreamOptionDto> getOptions() {
        return this.options;
    }

    public final String getVoting_visibility() {
        return this.voting_visibility;
    }

    public int hashCode() {
        Boolean bool = this.allow_answers;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.allow_user_suggested_options;
        int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str = this.description;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool3 = this.enforce_unique_vote;
        int iM30450d = AbstractC11266d.m30450d((iHashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31, 31, this.id);
        Boolean bool4 = this.is_closed;
        int iHashCode4 = (iM30450d + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Integer num = this.max_votes_allowed;
        int iM30450d2 = AbstractC11266d.m30450d((iHashCode4 + (num == null ? 0 : num.hashCode())) * 31, 31, this.name);
        List<UpstreamOptionDto> list = this.options;
        int iHashCode5 = (iM30450d2 + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.voting_visibility;
        return this.extraData.hashCode() + ((iHashCode5 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final Boolean is_closed() {
        return this.is_closed;
    }

    public String toString() {
        Boolean bool = this.allow_answers;
        Boolean bool2 = this.allow_user_suggested_options;
        String str = this.description;
        Boolean bool3 = this.enforce_unique_vote;
        String str2 = this.id;
        Boolean bool4 = this.is_closed;
        Integer num = this.max_votes_allowed;
        String str3 = this.name;
        List<UpstreamOptionDto> list = this.options;
        String str4 = this.voting_visibility;
        Map<String, Object> map = this.extraData;
        StringBuilder sb4 = new StringBuilder("UpdatePollRequest(allow_answers=");
        sb4.append(bool);
        sb4.append(", allow_user_suggested_options=");
        sb4.append(bool2);
        sb4.append(", description=");
        AbstractC36095b.m114692t(bool3, str, ", enforce_unique_vote=", ", id=", sb4);
        AbstractC36095b.m114692t(bool4, str2, ", is_closed=", ", max_votes_allowed=", sb4);
        AbstractC13673n.m38577x(num, ", name=", str3, ", options=", sb4);
        AbstractC17176i.m48511m(", voting_visibility=", str4, ", extraData=", sb4, list);
        return AbstractC13673n.m38565l(sb4, map, ")");
    }
}
