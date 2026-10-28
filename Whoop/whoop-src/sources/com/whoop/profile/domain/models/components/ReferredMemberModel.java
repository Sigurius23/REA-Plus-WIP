package com.whoop.profile.domain.models.components;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002-,B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bBC\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0018J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0018J:\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b'\u0010\u0018R \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010%\u0012\u0004\b)\u0010*\u001a\u0004\b(\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b+\u0010\u0018¨\u0006."}, m65681d2 = {"Lcom/whoop/profile/domain/models/components/ReferredMemberModel;", "", "", "name", "avatar", "endIcon", "subtitle", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$profile_release", "(Lcom/whoop/profile/domain/models/components/ReferredMemberModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/profile/domain/models/components/ReferredMemberModel;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "getAvatar", "getEndIcon", "getEndIcon$annotations", "()V", "getSubtitle", "Companion", "$serializer", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ReferredMemberModel {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String avatar;
    private final String endIcon;
    private final String name;
    private final String subtitle;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/profile/domain/models/components/ReferredMemberModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/profile/domain/models/components/ReferredMemberModel;", "serializer", "()Lwc3/c;", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ReferredMemberModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ReferredMemberModel(int i13, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i13 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 7, ReferredMemberModel$$serializer.INSTANCE.getDescriptor());
        }
        this.name = str;
        this.avatar = str2;
        this.endIcon = str3;
        if ((i13 & 8) == 0) {
            this.subtitle = null;
        } else {
            this.subtitle = str4;
        }
    }

    public static /* synthetic */ ReferredMemberModel copy$default(ReferredMemberModel referredMemberModel, String str, String str2, String str3, String str4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = referredMemberModel.name;
        }
        if ((i13 & 2) != 0) {
            str2 = referredMemberModel.avatar;
        }
        if ((i13 & 4) != 0) {
            str3 = referredMemberModel.endIcon;
        }
        if ((i13 & 8) != 0) {
            str4 = referredMemberModel.subtitle;
        }
        return referredMemberModel.copy(str, str2, str3, str4);
    }

    @InterfaceC37143h("end_icon")
    public static /* synthetic */ void getEndIcon$annotations() {
    }

    public static final /* synthetic */ void write$Self$profile_release(ReferredMemberModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.name);
        output.encodeStringElement(serialDesc, 1, self.avatar);
        output.encodeStringElement(serialDesc, 2, self.endIcon);
        if (!output.shouldEncodeElementDefault(serialDesc, 3) && self.subtitle == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.subtitle);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAvatar() {
        return this.avatar;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getEndIcon() {
        return this.endIcon;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    public final ReferredMemberModel copy(String name, String avatar, String endIcon, String subtitle) {
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(avatar, "avatar");
        AbstractC22676k.m65750j(endIcon, "endIcon");
        return new ReferredMemberModel(name, avatar, endIcon, subtitle);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReferredMemberModel)) {
            return false;
        }
        ReferredMemberModel referredMemberModel = (ReferredMemberModel) other;
        return AbstractC22676k.m65745e(this.name, referredMemberModel.name) && AbstractC22676k.m65745e(this.avatar, referredMemberModel.avatar) && AbstractC22676k.m65745e(this.endIcon, referredMemberModel.endIcon) && AbstractC22676k.m65745e(this.subtitle, referredMemberModel.subtitle);
    }

    public final String getAvatar() {
        return this.avatar;
    }

    public final String getEndIcon() {
        return this.endIcon;
    }

    public final String getName() {
        return this.name;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.name.hashCode() * 31, 31, this.avatar), 31, this.endIcon);
        String str = this.subtitle;
        return iM30450d + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.name;
        String str2 = this.avatar;
        return AbstractC11266d.m30464r(AbstractC11895b.m32001t("ReferredMemberModel(name=", str, ", avatar=", str2, ", endIcon="), this.endIcon, ", subtitle=", this.subtitle, ")");
    }

    public ReferredMemberModel(String name, String avatar, String endIcon, String str) {
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(avatar, "avatar");
        AbstractC22676k.m65750j(endIcon, "endIcon");
        this.name = name;
        this.avatar = avatar;
        this.endIcon = endIcon;
        this.subtitle = str;
    }

    public /* synthetic */ ReferredMemberModel(String str, String str2, String str3, String str4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i13 & 8) != 0 ? null : str4);
    }
}
