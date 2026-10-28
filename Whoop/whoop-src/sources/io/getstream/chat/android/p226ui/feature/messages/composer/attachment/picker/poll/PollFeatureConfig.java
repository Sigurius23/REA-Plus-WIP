package io.getstream.chat.android.p226ui.feature.messages.composer.attachment.picker.poll;

import android.os.Parcel;
import android.os.Parcelable;
import p000.AbstractC30802r;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\b\b\u0087\b\u0018\u0000  2\u00020\u0001:\u0001 B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J$\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0018\u0010\tJ\u001a\u0010\u001b\u001a\u00020\u00022\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001f\u0010\u0011¨\u0006!"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollFeatureConfig;", "Landroid/os/Parcelable;", "", "configurable", "defaultValue", "<init>", "(ZZ)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Ll83/a0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Z", "component2", "copy", "(ZZ)Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollFeatureConfig;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getConfigurable", "getDefaultValue", "Companion", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class PollFeatureConfig implements Parcelable {
    private final boolean configurable;
    private final boolean defaultValue;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Parcelable.Creator<PollFeatureConfig> CREATOR = new Creator();
    private static final PollFeatureConfig Default = new PollFeatureConfig(true, false);
    private static final PollFeatureConfig NotConfigurable = new PollFeatureConfig(false, false);

    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\n"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollFeatureConfig$Companion;", "", "<init>", "()V", "Default", "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollFeatureConfig;", "getDefault", "()Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollFeatureConfig;", "NotConfigurable", "getNotConfigurable", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final PollFeatureConfig getDefault() {
            return PollFeatureConfig.Default;
        }

        public final PollFeatureConfig getNotConfigurable() {
            return PollFeatureConfig.NotConfigurable;
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Creator implements Parcelable.Creator<PollFeatureConfig> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PollFeatureConfig createFromParcel(Parcel parcel) {
            AbstractC22676k.m65750j(parcel, "parcel");
            return new PollFeatureConfig(parcel.readInt() != 0, parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PollFeatureConfig[] newArray(int i13) {
            return new PollFeatureConfig[i13];
        }

        @Override // android.os.Parcelable.Creator
        public final PollFeatureConfig[] newArray(int i13) {
            return new PollFeatureConfig[i13];
        }
    }

    public PollFeatureConfig(boolean z4, boolean z13) {
        this.configurable = z4;
        this.defaultValue = z13;
    }

    public static PollFeatureConfig copy$default(PollFeatureConfig pollFeatureConfig, boolean z4, boolean z13, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z4 = pollFeatureConfig.configurable;
        }
        if ((i13 & 2) != 0) {
            z13 = pollFeatureConfig.defaultValue;
        }
        pollFeatureConfig.getClass();
        return new PollFeatureConfig(z4, z13);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getConfigurable() {
        return this.configurable;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getDefaultValue() {
        return this.defaultValue;
    }

    public final PollFeatureConfig copy(boolean configurable, boolean defaultValue) {
        return new PollFeatureConfig(configurable, defaultValue);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PollFeatureConfig)) {
            return false;
        }
        PollFeatureConfig pollFeatureConfig = (PollFeatureConfig) other;
        return this.configurable == pollFeatureConfig.configurable && this.defaultValue == pollFeatureConfig.defaultValue;
    }

    public final boolean getConfigurable() {
        return this.configurable;
    }

    public final boolean getDefaultValue() {
        return this.defaultValue;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.defaultValue) + (Boolean.hashCode(this.configurable) * 31);
    }

    public final String toString() {
        return AbstractC30802r.m94762k("PollFeatureConfig(configurable=", ", defaultValue=", ")", this.configurable, this.defaultValue);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeInt(this.configurable ? 1 : 0);
        dest.writeInt(this.defaultValue ? 1 : 0);
    }
}
