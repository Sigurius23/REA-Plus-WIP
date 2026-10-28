package io.getstream.chat.android.models;

import c13.AbstractC3855a;
import io.getstream.chat.android.core.internal.InternalStreamChatApi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import m83.AbstractC25267u;
import m83.C25272z;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b(\b\u0086\b\u0018\u00002\u00020\u0001Be\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u000e\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\u0012\u0010\u0013Bs\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u000e¢\u0006\u0004\b\u0012\u0010\u0015J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0006HÆ\u0003J\t\u0010,\u001a\u00020\bHÆ\u0003J\u0010\u0010-\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u001eJ\t\u0010.\u001a\u00020\bHÆ\u0003J\t\u0010/\u001a\u00020\bHÆ\u0003J\u0015\u00100\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u000eHÆ\u0003J\u000f\u00101\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010HÆ\u0003J~\u00102\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\b2\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u000e2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010HÀ\u0001¢\u0006\u0004\b3\u00104J\u0013\u00105\u001a\u00020\b2\b\u00106\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00107\u001a\u00020\nHÖ\u0001J\t\u00108\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u000b\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001cR\u0011\u0010\f\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001cR\u001d\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\"\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u00108F¢\u0006\u0006\u001a\u0004\b(\u0010'¨\u00069"}, m65681d2 = {"Lio/getstream/chat/android/models/CreatePollParams;", "", "name", "", "description", "votingVisibility", "Lio/getstream/chat/android/models/VotingVisibility;", "enforceUniqueVote", "", "maxVotesAllowed", "", "allowUserSuggestedOptions", "allowAnswers", "extraData", "", "optionsWithExtraData", "", "Lio/getstream/chat/android/models/PollOption;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/VotingVisibility;ZLjava/lang/Integer;ZZLjava/util/Map;Ljava/util/List;)V", "options", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lio/getstream/chat/android/models/VotingVisibility;ZLjava/lang/Integer;ZZLjava/util/Map;)V", "getName", "()Ljava/lang/String;", "getDescription", "getVotingVisibility", "()Lio/getstream/chat/android/models/VotingVisibility;", "getEnforceUniqueVote", "()Z", "getMaxVotesAllowed", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getAllowUserSuggestedOptions", "getAllowAnswers", "getExtraData", "()Ljava/util/Map;", "getOptionsWithExtraData$annotations", "()V", "getOptionsWithExtraData", "()Ljava/util/List;", "getOptions", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "copy$stream_chat_android_core", "(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/VotingVisibility;ZLjava/lang/Integer;ZZLjava/util/Map;Ljava/util/List;)Lio/getstream/chat/android/models/CreatePollParams;", "equals", "other", "hashCode", "toString", "stream-chat-android-core"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class CreatePollParams {
    private final boolean allowAnswers;
    private final boolean allowUserSuggestedOptions;
    private final String description;
    private final boolean enforceUniqueVote;
    private final Map<String, Object> extraData;
    private final Integer maxVotesAllowed;
    private final String name;
    private final List<PollOption> optionsWithExtraData;
    private final VotingVisibility votingVisibility;

    public CreatePollParams(String name, String description, VotingVisibility votingVisibility, boolean z4, Integer num, boolean z13, boolean z14, Map<String, ? extends Object> extraData, List<PollOption> optionsWithExtraData) {
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(description, "description");
        AbstractC22676k.m65750j(votingVisibility, "votingVisibility");
        AbstractC22676k.m65750j(extraData, "extraData");
        AbstractC22676k.m65750j(optionsWithExtraData, "optionsWithExtraData");
        this.name = name;
        this.description = description;
        this.votingVisibility = votingVisibility;
        this.enforceUniqueVote = z4;
        this.maxVotesAllowed = num;
        this.allowUserSuggestedOptions = z13;
        this.allowAnswers = z14;
        this.extraData = extraData;
        this.optionsWithExtraData = optionsWithExtraData;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CreatePollParams copy$stream_chat_android_core$default(CreatePollParams createPollParams, String str, String str2, VotingVisibility votingVisibility, boolean z4, Integer num, boolean z13, boolean z14, Map map, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = createPollParams.name;
        }
        if ((i13 & 2) != 0) {
            str2 = createPollParams.description;
        }
        if ((i13 & 4) != 0) {
            votingVisibility = createPollParams.votingVisibility;
        }
        if ((i13 & 8) != 0) {
            z4 = createPollParams.enforceUniqueVote;
        }
        if ((i13 & 16) != 0) {
            num = createPollParams.maxVotesAllowed;
        }
        if ((i13 & 32) != 0) {
            z13 = createPollParams.allowUserSuggestedOptions;
        }
        if ((i13 & 64) != 0) {
            z14 = createPollParams.allowAnswers;
        }
        if ((i13 & 128) != 0) {
            map = createPollParams.extraData;
        }
        if ((i13 & 256) != 0) {
            list = createPollParams.optionsWithExtraData;
        }
        Map map2 = map;
        List list2 = list;
        boolean z15 = z13;
        boolean z16 = z14;
        Integer num2 = num;
        VotingVisibility votingVisibility2 = votingVisibility;
        return createPollParams.copy$stream_chat_android_core(str, str2, votingVisibility2, z4, num2, z15, z16, map2, list2);
    }

    @InternalStreamChatApi
    public static /* synthetic */ void getOptionsWithExtraData$annotations() {
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final VotingVisibility getVotingVisibility() {
        return this.votingVisibility;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getEnforceUniqueVote() {
        return this.enforceUniqueVote;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getMaxVotesAllowed() {
        return this.maxVotesAllowed;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getAllowUserSuggestedOptions() {
        return this.allowUserSuggestedOptions;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getAllowAnswers() {
        return this.allowAnswers;
    }

    public final Map<String, Object> component8() {
        return this.extraData;
    }

    public final List<PollOption> component9() {
        return this.optionsWithExtraData;
    }

    public final CreatePollParams copy$stream_chat_android_core(String name, String description, VotingVisibility votingVisibility, boolean enforceUniqueVote, Integer maxVotesAllowed, boolean allowUserSuggestedOptions, boolean allowAnswers, Map<String, ? extends Object> extraData, List<PollOption> optionsWithExtraData) {
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(description, "description");
        AbstractC22676k.m65750j(votingVisibility, "votingVisibility");
        AbstractC22676k.m65750j(extraData, "extraData");
        AbstractC22676k.m65750j(optionsWithExtraData, "optionsWithExtraData");
        return new CreatePollParams(name, description, votingVisibility, enforceUniqueVote, maxVotesAllowed, allowUserSuggestedOptions, allowAnswers, extraData, optionsWithExtraData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreatePollParams)) {
            return false;
        }
        CreatePollParams createPollParams = (CreatePollParams) other;
        return AbstractC22676k.m65745e(this.name, createPollParams.name) && AbstractC22676k.m65745e(this.description, createPollParams.description) && this.votingVisibility == createPollParams.votingVisibility && this.enforceUniqueVote == createPollParams.enforceUniqueVote && AbstractC22676k.m65745e(this.maxVotesAllowed, createPollParams.maxVotesAllowed) && this.allowUserSuggestedOptions == createPollParams.allowUserSuggestedOptions && this.allowAnswers == createPollParams.allowAnswers && AbstractC22676k.m65745e(this.extraData, createPollParams.extraData) && AbstractC22676k.m65745e(this.optionsWithExtraData, createPollParams.optionsWithExtraData);
    }

    public final boolean getAllowAnswers() {
        return this.allowAnswers;
    }

    public final boolean getAllowUserSuggestedOptions() {
        return this.allowUserSuggestedOptions;
    }

    public final String getDescription() {
        return this.description;
    }

    public final boolean getEnforceUniqueVote() {
        return this.enforceUniqueVote;
    }

    public final Map<String, Object> getExtraData() {
        return this.extraData;
    }

    public final Integer getMaxVotesAllowed() {
        return this.maxVotesAllowed;
    }

    public final String getName() {
        return this.name;
    }

    public final List<String> getOptions() {
        List<PollOption> list = this.optionsWithExtraData;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((PollOption) it.next()).getText());
        }
        return arrayList;
    }

    public final List<PollOption> getOptionsWithExtraData() {
        return this.optionsWithExtraData;
    }

    public final VotingVisibility getVotingVisibility() {
        return this.votingVisibility;
    }

    public int hashCode() {
        int iM8289b = AbstractC2875y.m8289b((this.votingVisibility.hashCode() + AbstractC11266d.m30450d(this.name.hashCode() * 31, 31, this.description)) * 31, 31, this.enforceUniqueVote);
        Integer num = this.maxVotesAllowed;
        return this.optionsWithExtraData.hashCode() + AbstractC3855a.m11821e(this.extraData, AbstractC2875y.m8289b(AbstractC2875y.m8289b((iM8289b + (num == null ? 0 : num.hashCode())) * 31, 31, this.allowUserSuggestedOptions), 31, this.allowAnswers), 31);
    }

    public String toString() {
        String str = this.name;
        String str2 = this.description;
        VotingVisibility votingVisibility = this.votingVisibility;
        boolean z4 = this.enforceUniqueVote;
        Integer num = this.maxVotesAllowed;
        boolean z13 = this.allowUserSuggestedOptions;
        boolean z14 = this.allowAnswers;
        Map<String, Object> map = this.extraData;
        List<PollOption> list = this.optionsWithExtraData;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("CreatePollParams(name=", str, ", description=", str2, ", votingVisibility=");
        sbM32001t.append(votingVisibility);
        sbM32001t.append(", enforceUniqueVote=");
        sbM32001t.append(z4);
        sbM32001t.append(", maxVotesAllowed=");
        sbM32001t.append(num);
        sbM32001t.append(", allowUserSuggestedOptions=");
        sbM32001t.append(z13);
        sbM32001t.append(", allowAnswers=");
        sbM32001t.append(z14);
        sbM32001t.append(", extraData=");
        sbM32001t.append(map);
        sbM32001t.append(", optionsWithExtraData=");
        return AbstractC3855a.m11829m(sbM32001t, list, ")");
    }

    public /* synthetic */ CreatePollParams(String str, List list, String str2, VotingVisibility votingVisibility, boolean z4, Integer num, boolean z13, boolean z14, Map map, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (List<PollOption>) list, (i13 & 4) != 0 ? "" : str2, (i13 & 8) != 0 ? VotingVisibility.PUBLIC : votingVisibility, (i13 & 16) != 0 ? true : z4, (i13 & 32) != 0 ? 1 : num, (i13 & 64) != 0 ? false : z13, (i13 & 128) != 0 ? false : z14, (Map<String, ? extends Object>) ((i13 & 256) != 0 ? C25272z.f99163w : map));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CreatePollParams(String name, List<PollOption> options, String description, VotingVisibility votingVisibility, boolean z4, Integer num, boolean z13, boolean z14, Map<String, ? extends Object> extraData) {
        this(name, description, votingVisibility, z4, num, z13, z14, extraData, options);
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(options, "options");
        AbstractC22676k.m65750j(description, "description");
        AbstractC22676k.m65750j(votingVisibility, "votingVisibility");
        AbstractC22676k.m65750j(extraData, "extraData");
    }
}
