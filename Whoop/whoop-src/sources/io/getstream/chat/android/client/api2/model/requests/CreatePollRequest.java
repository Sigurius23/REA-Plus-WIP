package io.getstream.chat.android.client.api2.model.requests;

import hc3.AbstractC17176i;
import io.getstream.chat.android.client.api2.model.dto.ExtraDataDto;
import java.util.List;
import java.util.Map;
import live.hms.video.utils.HMSFieldTrials;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p127ev.AbstractC13673n;
import p441qx.InterfaceC30737t;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.AbstractC38963t7;

/* JADX INFO: loaded from: classes5.dex */
@InterfaceC30737t(generateAdapter = HMSFieldTrials.DisableVideoAutoSubscribe)
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\"\b\u0081\b\u0018\u0000 22\u00020\u0001:\u00012Bc\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0006HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\u0010\u0010'\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u001bJ\t\u0010(\u001a\u00020\u0006HÆ\u0003J\u000f\u0010)\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0003J\t\u0010*\u001a\u00020\u0006HÆ\u0003J\u0015\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00110\u0010HÆ\u0003J|\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u00062\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00062\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00110\u0010HÆ\u0001¢\u0006\u0002\u0010-J\u0013\u0010.\u001a\u00020\u00032\b\u0010/\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u00100\u001a\u00020\tHÖ\u0001J\t\u00101\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\n\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0018R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u000e\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0018R\u001d\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"¨\u00063"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/requests/CreatePollRequest;", "Lio/getstream/chat/android/client/api2/model/dto/ExtraDataDto;", "allow_answers", "", "allow_user_suggested_options", "description", "", "enforce_unique_vote", "max_votes_allowed", "", "name", "options", "", "Lio/getstream/chat/android/client/api2/model/requests/UpstreamOptionDto;", "voting_visibility", "extraData", "", "", "<init>", "(ZZLjava/lang/String;ZLjava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/Map;)V", "getAllow_answers", "()Z", "getAllow_user_suggested_options", "getDescription", "()Ljava/lang/String;", "getEnforce_unique_vote", "getMax_votes_allowed", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getName", "getOptions", "()Ljava/util/List;", "getVoting_visibility", "getExtraData", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(ZZLjava/lang/String;ZLjava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/Map;)Lio/getstream/chat/android/client/api2/model/requests/CreatePollRequest;", "equals", "other", "hashCode", "toString", "Companion", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class CreatePollRequest implements ExtraDataDto {
    public static final String VOTING_VISIBILITY_ANONYMOUS = "anonymous";
    public static final String VOTING_VISIBILITY_PUBLIC = "public";
    private final boolean allow_answers;
    private final boolean allow_user_suggested_options;
    private final String description;
    private final boolean enforce_unique_vote;
    private final Map<String, Object> extraData;
    private final Integer max_votes_allowed;
    private final String name;
    private final List<UpstreamOptionDto> options;
    private final String voting_visibility;

    public CreatePollRequest(boolean z4, boolean z13, String description, boolean z14, Integer num, String name, List<UpstreamOptionDto> options, String voting_visibility, Map<String, ? extends Object> extraData) {
        AbstractC22676k.m65750j(description, "description");
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(options, "options");
        AbstractC22676k.m65750j(voting_visibility, "voting_visibility");
        AbstractC22676k.m65750j(extraData, "extraData");
        this.allow_answers = z4;
        this.allow_user_suggested_options = z13;
        this.description = description;
        this.enforce_unique_vote = z14;
        this.max_votes_allowed = num;
        this.name = name;
        this.options = options;
        this.voting_visibility = voting_visibility;
        this.extraData = extraData;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CreatePollRequest copy$default(CreatePollRequest createPollRequest, boolean z4, boolean z13, String str, boolean z14, Integer num, String str2, List list, String str3, Map map, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z4 = createPollRequest.allow_answers;
        }
        if ((i13 & 2) != 0) {
            z13 = createPollRequest.allow_user_suggested_options;
        }
        if ((i13 & 4) != 0) {
            str = createPollRequest.description;
        }
        if ((i13 & 8) != 0) {
            z14 = createPollRequest.enforce_unique_vote;
        }
        if ((i13 & 16) != 0) {
            num = createPollRequest.max_votes_allowed;
        }
        if ((i13 & 32) != 0) {
            str2 = createPollRequest.name;
        }
        if ((i13 & 64) != 0) {
            list = createPollRequest.options;
        }
        if ((i13 & 128) != 0) {
            str3 = createPollRequest.voting_visibility;
        }
        if ((i13 & 256) != 0) {
            map = createPollRequest.extraData;
        }
        String str4 = str3;
        Map map2 = map;
        String str5 = str2;
        List list2 = list;
        Integer num2 = num;
        String str6 = str;
        return createPollRequest.copy(z4, z13, str6, z14, num2, str5, list2, str4, map2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getAllow_answers() {
        return this.allow_answers;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getAllow_user_suggested_options() {
        return this.allow_user_suggested_options;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getEnforce_unique_vote() {
        return this.enforce_unique_vote;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getMax_votes_allowed() {
        return this.max_votes_allowed;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final List<UpstreamOptionDto> component7() {
        return this.options;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getVoting_visibility() {
        return this.voting_visibility;
    }

    public final Map<String, Object> component9() {
        return this.extraData;
    }

    public final CreatePollRequest copy(boolean allow_answers, boolean allow_user_suggested_options, String description, boolean enforce_unique_vote, Integer max_votes_allowed, String name, List<UpstreamOptionDto> options, String voting_visibility, Map<String, ? extends Object> extraData) {
        AbstractC22676k.m65750j(description, "description");
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(options, "options");
        AbstractC22676k.m65750j(voting_visibility, "voting_visibility");
        AbstractC22676k.m65750j(extraData, "extraData");
        return new CreatePollRequest(allow_answers, allow_user_suggested_options, description, enforce_unique_vote, max_votes_allowed, name, options, voting_visibility, extraData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreatePollRequest)) {
            return false;
        }
        CreatePollRequest createPollRequest = (CreatePollRequest) other;
        return this.allow_answers == createPollRequest.allow_answers && this.allow_user_suggested_options == createPollRequest.allow_user_suggested_options && AbstractC22676k.m65745e(this.description, createPollRequest.description) && this.enforce_unique_vote == createPollRequest.enforce_unique_vote && AbstractC22676k.m65745e(this.max_votes_allowed, createPollRequest.max_votes_allowed) && AbstractC22676k.m65745e(this.name, createPollRequest.name) && AbstractC22676k.m65745e(this.options, createPollRequest.options) && AbstractC22676k.m65745e(this.voting_visibility, createPollRequest.voting_visibility) && AbstractC22676k.m65745e(this.extraData, createPollRequest.extraData);
    }

    public final boolean getAllow_answers() {
        return this.allow_answers;
    }

    public final boolean getAllow_user_suggested_options() {
        return this.allow_user_suggested_options;
    }

    public final String getDescription() {
        return this.description;
    }

    public final boolean getEnforce_unique_vote() {
        return this.enforce_unique_vote;
    }

    public final Map<String, Object> getExtraData() {
        return this.extraData;
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
        int iM8289b = AbstractC2875y.m8289b(AbstractC11266d.m30450d(AbstractC2875y.m8289b(Boolean.hashCode(this.allow_answers) * 31, 31, this.allow_user_suggested_options), 31, this.description), 31, this.enforce_unique_vote);
        Integer num = this.max_votes_allowed;
        return this.extraData.hashCode() + AbstractC11266d.m30450d(AbstractC11895b.m31983b(AbstractC11266d.m30450d((iM8289b + (num == null ? 0 : num.hashCode())) * 31, 31, this.name), 31, this.options), 31, this.voting_visibility);
    }

    public String toString() {
        boolean z4 = this.allow_answers;
        boolean z13 = this.allow_user_suggested_options;
        String str = this.description;
        boolean z14 = this.enforce_unique_vote;
        Integer num = this.max_votes_allowed;
        String str2 = this.name;
        List<UpstreamOptionDto> list = this.options;
        String str3 = this.voting_visibility;
        Map<String, Object> map = this.extraData;
        StringBuilder sbM32002u = AbstractC11895b.m32002u("CreatePollRequest(allow_answers=", ", allow_user_suggested_options=", ", description=", z4, z13);
        AbstractC38963t7.m124390t(sbM32002u, str, ", enforce_unique_vote=", z14, ", max_votes_allowed=");
        AbstractC13673n.m38577x(num, ", name=", str2, ", options=", sbM32002u);
        AbstractC17176i.m48511m(", voting_visibility=", str3, ", extraData=", sbM32002u, list);
        return AbstractC13673n.m38565l(sbM32002u, map, ")");
    }
}
