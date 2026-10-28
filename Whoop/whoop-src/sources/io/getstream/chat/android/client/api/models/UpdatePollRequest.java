package io.getstream.chat.android.client.api.models;

import c13.AbstractC3855a;
import io.getstream.chat.android.models.PollOption;
import io.getstream.chat.android.models.VotingVisibility;
import java.util.List;
import java.util.Map;
import m83.C25272z;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p127ev.AbstractC13673n;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b&\b\u0086\b\u0018\u00002\u00020\u0001B\u0091\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\u0010\u0010*\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u001aJ\u0010\u0010+\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u001aJ\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010-\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u001aJ\u0010\u0010.\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u001aJ\u0010\u0010/\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010 J\u0011\u00100\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0003J\t\u00101\u001a\u00020\u0011HÆ\u0003J\u0015\u00102\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0013HÆ\u0003J\u009c\u0001\u00103\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0013HÆ\u0001¢\u0006\u0002\u00104J\u0013\u00105\u001a\u00020\u00062\b\u00106\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00107\u001a\u00020\fHÖ\u0001J\t\u00108\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u001c\u0010\u001aR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0017R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u001e\u0010\u001aR\u0015\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\n\u0010\u001aR\u0015\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010!\u001a\u0004\b\u001f\u0010 R\u0019\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u001d\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'¨\u00069"}, m65681d2 = {"Lio/getstream/chat/android/client/api/models/UpdatePollRequest;", "", "id", "", "name", "allowAnswers", "", "allowUserSuggestedOptions", "description", "enforceUniqueVote", "isClosed", "maxVotesAllowed", "", "options", "", "Lio/getstream/chat/android/models/PollOption;", "votingVisibility", "Lio/getstream/chat/android/models/VotingVisibility;", "extraData", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/util/List;Lio/getstream/chat/android/models/VotingVisibility;Ljava/util/Map;)V", "getId", "()Ljava/lang/String;", "getName", "getAllowAnswers", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getAllowUserSuggestedOptions", "getDescription", "getEnforceUniqueVote", "getMaxVotesAllowed", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getOptions", "()Ljava/util/List;", "getVotingVisibility", "()Lio/getstream/chat/android/models/VotingVisibility;", "getExtraData", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/util/List;Lio/getstream/chat/android/models/VotingVisibility;Ljava/util/Map;)Lio/getstream/chat/android/client/api/models/UpdatePollRequest;", "equals", "other", "hashCode", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class UpdatePollRequest {
    private final Boolean allowAnswers;
    private final Boolean allowUserSuggestedOptions;
    private final String description;
    private final Boolean enforceUniqueVote;
    private final Map<String, Object> extraData;
    private final String id;
    private final Boolean isClosed;
    private final Integer maxVotesAllowed;
    private final String name;
    private final List<PollOption> options;
    private final VotingVisibility votingVisibility;

    public UpdatePollRequest(String id4, String name, Boolean bool, Boolean bool2, String str, Boolean bool3, Boolean bool4, Integer num, List<PollOption> list, VotingVisibility votingVisibility, Map<String, ? extends Object> extraData) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(votingVisibility, "votingVisibility");
        AbstractC22676k.m65750j(extraData, "extraData");
        this.id = id4;
        this.name = name;
        this.allowAnswers = bool;
        this.allowUserSuggestedOptions = bool2;
        this.description = str;
        this.enforceUniqueVote = bool3;
        this.isClosed = bool4;
        this.maxVotesAllowed = num;
        this.options = list;
        this.votingVisibility = votingVisibility;
        this.extraData = extraData;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UpdatePollRequest copy$default(UpdatePollRequest updatePollRequest, String str, String str2, Boolean bool, Boolean bool2, String str3, Boolean bool3, Boolean bool4, Integer num, List list, VotingVisibility votingVisibility, Map map, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = updatePollRequest.id;
        }
        if ((i13 & 2) != 0) {
            str2 = updatePollRequest.name;
        }
        if ((i13 & 4) != 0) {
            bool = updatePollRequest.allowAnswers;
        }
        if ((i13 & 8) != 0) {
            bool2 = updatePollRequest.allowUserSuggestedOptions;
        }
        if ((i13 & 16) != 0) {
            str3 = updatePollRequest.description;
        }
        if ((i13 & 32) != 0) {
            bool3 = updatePollRequest.enforceUniqueVote;
        }
        if ((i13 & 64) != 0) {
            bool4 = updatePollRequest.isClosed;
        }
        if ((i13 & 128) != 0) {
            num = updatePollRequest.maxVotesAllowed;
        }
        if ((i13 & 256) != 0) {
            list = updatePollRequest.options;
        }
        if ((i13 & 512) != 0) {
            votingVisibility = updatePollRequest.votingVisibility;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
            map = updatePollRequest.extraData;
        }
        VotingVisibility votingVisibility2 = votingVisibility;
        Map map2 = map;
        Integer num2 = num;
        List list2 = list;
        Boolean bool5 = bool3;
        Boolean bool6 = bool4;
        String str4 = str3;
        Boolean bool7 = bool;
        return updatePollRequest.copy(str, str2, bool7, bool2, str4, bool5, bool6, num2, list2, votingVisibility2, map2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final VotingVisibility getVotingVisibility() {
        return this.votingVisibility;
    }

    public final Map<String, Object> component11() {
        return this.extraData;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Boolean getAllowAnswers() {
        return this.allowAnswers;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Boolean getAllowUserSuggestedOptions() {
        return this.allowUserSuggestedOptions;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Boolean getEnforceUniqueVote() {
        return this.enforceUniqueVote;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Boolean getIsClosed() {
        return this.isClosed;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Integer getMaxVotesAllowed() {
        return this.maxVotesAllowed;
    }

    public final List<PollOption> component9() {
        return this.options;
    }

    public final UpdatePollRequest copy(String id4, String name, Boolean allowAnswers, Boolean allowUserSuggestedOptions, String description, Boolean enforceUniqueVote, Boolean isClosed, Integer maxVotesAllowed, List<PollOption> options, VotingVisibility votingVisibility, Map<String, ? extends Object> extraData) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(votingVisibility, "votingVisibility");
        AbstractC22676k.m65750j(extraData, "extraData");
        return new UpdatePollRequest(id4, name, allowAnswers, allowUserSuggestedOptions, description, enforceUniqueVote, isClosed, maxVotesAllowed, options, votingVisibility, extraData);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpdatePollRequest)) {
            return false;
        }
        UpdatePollRequest updatePollRequest = (UpdatePollRequest) other;
        return AbstractC22676k.m65745e(this.id, updatePollRequest.id) && AbstractC22676k.m65745e(this.name, updatePollRequest.name) && AbstractC22676k.m65745e(this.allowAnswers, updatePollRequest.allowAnswers) && AbstractC22676k.m65745e(this.allowUserSuggestedOptions, updatePollRequest.allowUserSuggestedOptions) && AbstractC22676k.m65745e(this.description, updatePollRequest.description) && AbstractC22676k.m65745e(this.enforceUniqueVote, updatePollRequest.enforceUniqueVote) && AbstractC22676k.m65745e(this.isClosed, updatePollRequest.isClosed) && AbstractC22676k.m65745e(this.maxVotesAllowed, updatePollRequest.maxVotesAllowed) && AbstractC22676k.m65745e(this.options, updatePollRequest.options) && this.votingVisibility == updatePollRequest.votingVisibility && AbstractC22676k.m65745e(this.extraData, updatePollRequest.extraData);
    }

    public final Boolean getAllowAnswers() {
        return this.allowAnswers;
    }

    public final Boolean getAllowUserSuggestedOptions() {
        return this.allowUserSuggestedOptions;
    }

    public final String getDescription() {
        return this.description;
    }

    public final Boolean getEnforceUniqueVote() {
        return this.enforceUniqueVote;
    }

    public final Map<String, Object> getExtraData() {
        return this.extraData;
    }

    public final String getId() {
        return this.id;
    }

    public final Integer getMaxVotesAllowed() {
        return this.maxVotesAllowed;
    }

    public final String getName() {
        return this.name;
    }

    public final List<PollOption> getOptions() {
        return this.options;
    }

    public final VotingVisibility getVotingVisibility() {
        return this.votingVisibility;
    }

    public final int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(this.id.hashCode() * 31, 31, this.name);
        Boolean bool = this.allowAnswers;
        int iHashCode = (iM30450d + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.allowUserSuggestedOptions;
        int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str = this.description;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool3 = this.enforceUniqueVote;
        int iHashCode4 = (iHashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.isClosed;
        int iHashCode5 = (iHashCode4 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Integer num = this.maxVotesAllowed;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        List<PollOption> list = this.options;
        return this.extraData.hashCode() + ((this.votingVisibility.hashCode() + ((iHashCode6 + (list != null ? list.hashCode() : 0)) * 31)) * 31);
    }

    public final Boolean isClosed() {
        return this.isClosed;
    }

    public final String toString() {
        String str = this.id;
        String str2 = this.name;
        Boolean bool = this.allowAnswers;
        Boolean bool2 = this.allowUserSuggestedOptions;
        String str3 = this.description;
        Boolean bool3 = this.enforceUniqueVote;
        Boolean bool4 = this.isClosed;
        Integer num = this.maxVotesAllowed;
        List<PollOption> list = this.options;
        VotingVisibility votingVisibility = this.votingVisibility;
        Map<String, Object> map = this.extraData;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("UpdatePollRequest(id=", str, ", name=", str2, ", allowAnswers=");
        AbstractC3855a.m11839w(sbM32001t, bool, ", allowUserSuggestedOptions=", bool2, ", description=");
        AbstractC36095b.m114692t(bool3, str3, ", enforceUniqueVote=", ", isClosed=", sbM32001t);
        sbM32001t.append(bool4);
        sbM32001t.append(", maxVotesAllowed=");
        sbM32001t.append(num);
        sbM32001t.append(", options=");
        sbM32001t.append(list);
        sbM32001t.append(", votingVisibility=");
        sbM32001t.append(votingVisibility);
        sbM32001t.append(", extraData=");
        return AbstractC13673n.m38565l(sbM32001t, map, ")");
    }

    public /* synthetic */ UpdatePollRequest(String str, String str2, Boolean bool, Boolean bool2, String str3, Boolean bool3, Boolean bool4, Integer num, List list, VotingVisibility votingVisibility, Map map, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i13 & 4) != 0 ? null : bool, (i13 & 8) != 0 ? null : bool2, (i13 & 16) != 0 ? null : str3, (i13 & 32) != 0 ? null : bool3, (i13 & 64) != 0 ? null : bool4, (i13 & 128) != 0 ? null : num, (i13 & 256) != 0 ? null : list, (i13 & 512) != 0 ? VotingVisibility.PUBLIC : votingVisibility, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? C25272z.f99163w : map);
    }
}
