package com.whoop.profile.domain.models.components;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import y00.AbstractC38963t7;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/.B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tBA\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\b\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0018J8\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0018J\u0010\u0010 \u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b \u0010\u001bJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b'\u0010\u0018R \u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010(\u0012\u0004\b*\u0010+\u001a\u0004\b)\u0010\u001bR \u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010%\u0012\u0004\b-\u0010+\u001a\u0004\b,\u0010\u0018¨\u00060"}, m65681d2 = {"Lcom/whoop/profile/domain/models/components/ReferralsTileHeaderModel;", "", "", "title", "subtitle", "", "referralsCount", "referralsImg", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$profile_release", "(Lcom/whoop/profile/domain/models/components/ReferralsTileHeaderModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()I", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Lcom/whoop/profile/domain/models/components/ReferralsTileHeaderModel;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getSubtitle", "I", "getReferralsCount", "getReferralsCount$annotations", "()V", "getReferralsImg", "getReferralsImg$annotations", "Companion", "$serializer", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ReferralsTileHeaderModel {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final int referralsCount;
    private final String referralsImg;
    private final String subtitle;
    private final String title;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/profile/domain/models/components/ReferralsTileHeaderModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/profile/domain/models/components/ReferralsTileHeaderModel;", "serializer", "()Lwc3/c;", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ReferralsTileHeaderModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ReferralsTileHeaderModel(int i13, String str, String str2, int i14, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i13 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 15, ReferralsTileHeaderModel$$serializer.INSTANCE.getDescriptor());
        }
        this.title = str;
        this.subtitle = str2;
        this.referralsCount = i14;
        this.referralsImg = str3;
    }

    public static /* synthetic */ ReferralsTileHeaderModel copy$default(ReferralsTileHeaderModel referralsTileHeaderModel, String str, String str2, int i13, String str3, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            str = referralsTileHeaderModel.title;
        }
        if ((i14 & 2) != 0) {
            str2 = referralsTileHeaderModel.subtitle;
        }
        if ((i14 & 4) != 0) {
            i13 = referralsTileHeaderModel.referralsCount;
        }
        if ((i14 & 8) != 0) {
            str3 = referralsTileHeaderModel.referralsImg;
        }
        return referralsTileHeaderModel.copy(str, str2, i13, str3);
    }

    @InterfaceC37143h("referrals_count")
    public static /* synthetic */ void getReferralsCount$annotations() {
    }

    @InterfaceC37143h("referrals_img")
    public static /* synthetic */ void getReferralsImg$annotations() {
    }

    public static final /* synthetic */ void write$Self$profile_release(ReferralsTileHeaderModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.title);
        output.encodeStringElement(serialDesc, 1, self.subtitle);
        output.encodeIntElement(serialDesc, 2, self.referralsCount);
        output.encodeStringElement(serialDesc, 3, self.referralsImg);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getReferralsCount() {
        return this.referralsCount;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getReferralsImg() {
        return this.referralsImg;
    }

    public final ReferralsTileHeaderModel copy(String title, String subtitle, int referralsCount, String referralsImg) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(referralsImg, "referralsImg");
        return new ReferralsTileHeaderModel(title, subtitle, referralsCount, referralsImg);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReferralsTileHeaderModel)) {
            return false;
        }
        ReferralsTileHeaderModel referralsTileHeaderModel = (ReferralsTileHeaderModel) other;
        return AbstractC22676k.m65745e(this.title, referralsTileHeaderModel.title) && AbstractC22676k.m65745e(this.subtitle, referralsTileHeaderModel.subtitle) && this.referralsCount == referralsTileHeaderModel.referralsCount && AbstractC22676k.m65745e(this.referralsImg, referralsTileHeaderModel.referralsImg);
    }

    public final int getReferralsCount() {
        return this.referralsCount;
    }

    public final String getReferralsImg() {
        return this.referralsImg;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.referralsImg.hashCode() + AbstractC11266d.m30448b(this.referralsCount, AbstractC11266d.m30450d(this.title.hashCode() * 31, 31, this.subtitle), 31);
    }

    public String toString() {
        return AbstractC38963t7.m124376f(this.referralsCount, ", referralsImg=", this.referralsImg, ")", AbstractC11895b.m32001t("ReferralsTileHeaderModel(title=", this.title, ", subtitle=", this.subtitle, ", referralsCount="));
    }

    public ReferralsTileHeaderModel(String title, String subtitle, int i13, String referralsImg) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(referralsImg, "referralsImg");
        this.title = title;
        this.subtitle = subtitle;
        this.referralsCount = i13;
        this.referralsImg = referralsImg;
    }
}
