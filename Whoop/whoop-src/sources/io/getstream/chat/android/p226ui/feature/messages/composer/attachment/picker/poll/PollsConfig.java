package io.getstream.chat.android.p226ui.feature.messages.composer.attachment.picker.poll;

import android.os.Parcel;
import android.os.Parcelable;
import c13.AbstractC3855a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u0001/BG\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0015J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0015J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJP\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b!\u0010\rJ\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b)\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b*\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b+\u0010\u0015R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010,\u001a\u0004\b-\u0010\u001aR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010,\u001a\u0004\b.\u0010\u001a¨\u00060"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollsConfig;", "Landroid/os/Parcelable;", "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollFeatureConfig;", "multipleVotes", "anonymousPoll", "suggestAnOption", "allowComments", "", "questionTextLimit", "optionTextLimit", "<init>", "(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollFeatureConfig;Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollFeatureConfig;Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollFeatureConfig;Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollFeatureConfig;Ljava/lang/Integer;Ljava/lang/Integer;)V", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Ll83/a0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollFeatureConfig;", "component2", "component3", "component4", "component5", "()Ljava/lang/Integer;", "component6", "copy", "(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollFeatureConfig;Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollFeatureConfig;Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollFeatureConfig;Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollFeatureConfig;Ljava/lang/Integer;Ljava/lang/Integer;)Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollsConfig;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollFeatureConfig;", "getMultipleVotes", "getAnonymousPoll", "getSuggestAnOption", "getAllowComments", "Ljava/lang/Integer;", "getQuestionTextLimit", "getOptionTextLimit", "Companion", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class PollsConfig implements Parcelable {
    private final PollFeatureConfig allowComments;
    private final PollFeatureConfig anonymousPoll;
    private final PollFeatureConfig multipleVotes;
    private final Integer optionTextLimit;
    private final Integer questionTextLimit;
    private final PollFeatureConfig suggestAnOption;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Parcelable.Creator<PollsConfig> CREATOR = new Creator();
    private static final PollsConfig Default = new PollsConfig(null, null, null, null, null, null, 63, null);

    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollsConfig$Companion;", "", "<init>", "()V", "Default", "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollsConfig;", "getDefault", "()Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollsConfig;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final PollsConfig getDefault() {
            return PollsConfig.Default;
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Creator implements Parcelable.Creator<PollsConfig> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PollsConfig createFromParcel(Parcel parcel) {
            AbstractC22676k.m65750j(parcel, "parcel");
            Parcelable.Creator<PollFeatureConfig> creator = PollFeatureConfig.CREATOR;
            return new PollsConfig(creator.createFromParcel(parcel), creator.createFromParcel(parcel), creator.createFromParcel(parcel), creator.createFromParcel(parcel), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PollsConfig[] newArray(int i13) {
            return new PollsConfig[i13];
        }

        @Override // android.os.Parcelable.Creator
        public final PollsConfig[] newArray(int i13) {
            return new PollsConfig[i13];
        }
    }

    public PollsConfig() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ PollsConfig copy$default(PollsConfig pollsConfig, PollFeatureConfig pollFeatureConfig, PollFeatureConfig pollFeatureConfig2, PollFeatureConfig pollFeatureConfig3, PollFeatureConfig pollFeatureConfig4, Integer num, Integer num2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            pollFeatureConfig = pollsConfig.multipleVotes;
        }
        if ((i13 & 2) != 0) {
            pollFeatureConfig2 = pollsConfig.anonymousPoll;
        }
        if ((i13 & 4) != 0) {
            pollFeatureConfig3 = pollsConfig.suggestAnOption;
        }
        if ((i13 & 8) != 0) {
            pollFeatureConfig4 = pollsConfig.allowComments;
        }
        if ((i13 & 16) != 0) {
            num = pollsConfig.questionTextLimit;
        }
        if ((i13 & 32) != 0) {
            num2 = pollsConfig.optionTextLimit;
        }
        Integer num3 = num;
        Integer num4 = num2;
        return pollsConfig.copy(pollFeatureConfig, pollFeatureConfig2, pollFeatureConfig3, pollFeatureConfig4, num3, num4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final PollFeatureConfig getMultipleVotes() {
        return this.multipleVotes;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final PollFeatureConfig getAnonymousPoll() {
        return this.anonymousPoll;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final PollFeatureConfig getSuggestAnOption() {
        return this.suggestAnOption;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final PollFeatureConfig getAllowComments() {
        return this.allowComments;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getQuestionTextLimit() {
        return this.questionTextLimit;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Integer getOptionTextLimit() {
        return this.optionTextLimit;
    }

    public final PollsConfig copy(PollFeatureConfig multipleVotes, PollFeatureConfig anonymousPoll, PollFeatureConfig suggestAnOption, PollFeatureConfig allowComments, Integer questionTextLimit, Integer optionTextLimit) {
        AbstractC22676k.m65750j(multipleVotes, "multipleVotes");
        AbstractC22676k.m65750j(anonymousPoll, "anonymousPoll");
        AbstractC22676k.m65750j(suggestAnOption, "suggestAnOption");
        AbstractC22676k.m65750j(allowComments, "allowComments");
        return new PollsConfig(multipleVotes, anonymousPoll, suggestAnOption, allowComments, questionTextLimit, optionTextLimit);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PollsConfig)) {
            return false;
        }
        PollsConfig pollsConfig = (PollsConfig) other;
        return AbstractC22676k.m65745e(this.multipleVotes, pollsConfig.multipleVotes) && AbstractC22676k.m65745e(this.anonymousPoll, pollsConfig.anonymousPoll) && AbstractC22676k.m65745e(this.suggestAnOption, pollsConfig.suggestAnOption) && AbstractC22676k.m65745e(this.allowComments, pollsConfig.allowComments) && AbstractC22676k.m65745e(this.questionTextLimit, pollsConfig.questionTextLimit) && AbstractC22676k.m65745e(this.optionTextLimit, pollsConfig.optionTextLimit);
    }

    public final PollFeatureConfig getAllowComments() {
        return this.allowComments;
    }

    public final PollFeatureConfig getAnonymousPoll() {
        return this.anonymousPoll;
    }

    public final PollFeatureConfig getMultipleVotes() {
        return this.multipleVotes;
    }

    public final Integer getOptionTextLimit() {
        return this.optionTextLimit;
    }

    public final Integer getQuestionTextLimit() {
        return this.questionTextLimit;
    }

    public final PollFeatureConfig getSuggestAnOption() {
        return this.suggestAnOption;
    }

    public final int hashCode() {
        int iHashCode = (this.allowComments.hashCode() + ((this.suggestAnOption.hashCode() + ((this.anonymousPoll.hashCode() + (this.multipleVotes.hashCode() * 31)) * 31)) * 31)) * 31;
        Integer num = this.questionTextLimit;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.optionTextLimit;
        return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        return "PollsConfig(multipleVotes=" + this.multipleVotes + ", anonymousPoll=" + this.anonymousPoll + ", suggestAnOption=" + this.suggestAnOption + ", allowComments=" + this.allowComments + ", questionTextLimit=" + this.questionTextLimit + ", optionTextLimit=" + this.optionTextLimit + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        AbstractC22676k.m65750j(dest, "dest");
        this.multipleVotes.writeToParcel(dest, flags);
        this.anonymousPoll.writeToParcel(dest, flags);
        this.suggestAnOption.writeToParcel(dest, flags);
        this.allowComments.writeToParcel(dest, flags);
        Integer num = this.questionTextLimit;
        if (num == null) {
            dest.writeInt(0);
        } else {
            AbstractC3855a.m11837u(dest, 1, num);
        }
        Integer num2 = this.optionTextLimit;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            AbstractC3855a.m11837u(dest, 1, num2);
        }
    }

    public PollsConfig(PollFeatureConfig multipleVotes, PollFeatureConfig anonymousPoll, PollFeatureConfig suggestAnOption, PollFeatureConfig allowComments, Integer num, Integer num2) {
        AbstractC22676k.m65750j(multipleVotes, "multipleVotes");
        AbstractC22676k.m65750j(anonymousPoll, "anonymousPoll");
        AbstractC22676k.m65750j(suggestAnOption, "suggestAnOption");
        AbstractC22676k.m65750j(allowComments, "allowComments");
        this.multipleVotes = multipleVotes;
        this.anonymousPoll = anonymousPoll;
        this.suggestAnOption = suggestAnOption;
        this.allowComments = allowComments;
        this.questionTextLimit = num;
        this.optionTextLimit = num2;
        if (!multipleVotes.getConfigurable() && multipleVotes.getDefaultValue()) {
            throw new IllegalArgumentException("Invalid PollsConfig: multipleVotes cannot have defaultValue=true while configurable=false as the user would be unable to set maxVotesAllowed.");
        }
        if (num != null && num.intValue() <= 0) {
            throw new IllegalArgumentException("Invalid PollsConfig: questionTextLimit must be > 0 when provided.");
        }
        if (num2 != null && num2.intValue() <= 0) {
            throw new IllegalArgumentException("Invalid PollsConfig: optionTextLimit must be > 0 when provided.");
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public PollsConfig(PollFeatureConfig pollFeatureConfig, PollFeatureConfig pollFeatureConfig2, PollFeatureConfig pollFeatureConfig3, PollFeatureConfig pollFeatureConfig4, Integer num, Integer num2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i13 & 1) != 0) {
            PollFeatureConfig.INSTANCE.getClass();
            pollFeatureConfig = PollFeatureConfig.Default;
        }
        if ((i13 & 2) != 0) {
            PollFeatureConfig.INSTANCE.getClass();
            pollFeatureConfig2 = PollFeatureConfig.Default;
        }
        if ((i13 & 4) != 0) {
            PollFeatureConfig.INSTANCE.getClass();
            pollFeatureConfig3 = PollFeatureConfig.Default;
        }
        if ((i13 & 8) != 0) {
            PollFeatureConfig.INSTANCE.getClass();
            pollFeatureConfig4 = PollFeatureConfig.Default;
        }
        this(pollFeatureConfig, pollFeatureConfig2, pollFeatureConfig3, pollFeatureConfig4, (i13 & 16) != 0 ? null : num, (i13 & 32) != 0 ? null : num2);
    }
}
