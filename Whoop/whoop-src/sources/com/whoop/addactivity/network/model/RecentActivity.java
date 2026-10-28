package com.whoop.addactivity.network.model;

import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import ih0.AbstractC18489d0;
import j02.C21174w;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import y00.AbstractC38963t7;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b#\b\u0087\b\u0018\u0000 82\u00020\u0001:\u00029:B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rB]\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001dJ\u0010\u0010 \u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001dJ\u0010\u0010#\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b%\u0010!JV\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010\u001dJ\u0010\u0010)\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010,\u001a\u00020\u00062\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b,\u0010-R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010\u001dR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010.\u001a\u0004\b0\u0010\u001dR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010.\u001a\u0004\b1\u0010\u001dR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00102\u001a\u0004\b3\u0010!R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b4\u0010\u001dR\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00105\u001a\u0004\b6\u0010$R\u001a\u0010\u000b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00102\u001a\u0004\b7\u0010!¨\u0006;"}, m65681d2 = {"Lcom/whoop/addactivity/network/model/RecentActivity;", "", "", "displayName", "internalName", "iconUrl", "", "deleted", "category", "Lcom/whoop/addactivity/network/model/ScoreType;", "scoreType", "hasGps", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lcom/whoop/addactivity/network/model/ScoreType;Z)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lcom/whoop/addactivity/network/model/ScoreType;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$core_release", "(Lcom/whoop/addactivity/network/model/RecentActivity;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Z", "component5", "component6", "()Lcom/whoop/addactivity/network/model/ScoreType;", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lcom/whoop/addactivity/network/model/ScoreType;Z)Lcom/whoop/addactivity/network/model/RecentActivity;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDisplayName", "getInternalName", "getIconUrl", "Z", "getDeleted", "getCategory", "Lcom/whoop/addactivity/network/model/ScoreType;", "getScoreType", "getHasGps", "Companion", "$serializer", "a", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class RecentActivity {

    @SerializedName("category")
    private final String category;

    @SerializedName("deleted")
    private final boolean deleted;

    @SerializedName("display_name")
    private final String displayName;

    @SerializedName("has_gps")
    private final boolean hasGps;

    @SerializedName("icon_url")
    private final String iconUrl;

    @SerializedName("internal_name")
    private final String internalName;

    @SerializedName("score_type")
    private final ScoreType scoreType;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C21174w(11)), null};

    /* JADX INFO: renamed from: com.whoop.addactivity.network.model.RecentActivity$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/addactivity/network/model/RecentActivity$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/addactivity/network/model/RecentActivity;", "serializer", "()Lwc3/c;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return RecentActivity$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ RecentActivity(int i13, String str, String str2, String str3, boolean z4, String str4, ScoreType scoreType, boolean z13, SerializationConstructorMarker serializationConstructorMarker) {
        if (127 != (i13 & 127)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 127, RecentActivity$$serializer.INSTANCE.getDescriptor());
        }
        this.displayName = str;
        this.internalName = str2;
        this.iconUrl = str3;
        this.deleted = z4;
        this.category = str4;
        this.scoreType = scoreType;
        this.hasGps = z13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return ScoreType.INSTANCE.serializer();
    }

    public static /* synthetic */ RecentActivity copy$default(RecentActivity recentActivity, String str, String str2, String str3, boolean z4, String str4, ScoreType scoreType, boolean z13, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = recentActivity.displayName;
        }
        if ((i13 & 2) != 0) {
            str2 = recentActivity.internalName;
        }
        if ((i13 & 4) != 0) {
            str3 = recentActivity.iconUrl;
        }
        if ((i13 & 8) != 0) {
            z4 = recentActivity.deleted;
        }
        if ((i13 & 16) != 0) {
            str4 = recentActivity.category;
        }
        if ((i13 & 32) != 0) {
            scoreType = recentActivity.scoreType;
        }
        if ((i13 & 64) != 0) {
            z13 = recentActivity.hasGps;
        }
        ScoreType scoreType2 = scoreType;
        boolean z14 = z13;
        String str5 = str4;
        String str6 = str3;
        return recentActivity.copy(str, str2, str6, z4, str5, scoreType2, z14);
    }

    public static final /* synthetic */ void write$Self$core_release(RecentActivity self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.displayName);
        output.encodeStringElement(serialDesc, 1, self.internalName);
        output.encodeStringElement(serialDesc, 2, self.iconUrl);
        output.encodeBooleanElement(serialDesc, 3, self.deleted);
        output.encodeStringElement(serialDesc, 4, self.category);
        output.encodeSerializableElement(serialDesc, 5, (InterfaceC37145j) interfaceC23462hArr[5].getValue(), self.scoreType);
        output.encodeBooleanElement(serialDesc, 6, self.hasGps);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getInternalName() {
        return this.internalName;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getIconUrl() {
        return this.iconUrl;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getDeleted() {
        return this.deleted;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCategory() {
        return this.category;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final ScoreType getScoreType() {
        return this.scoreType;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getHasGps() {
        return this.hasGps;
    }

    public final RecentActivity copy(String displayName, String internalName, String iconUrl, boolean deleted, String category, ScoreType scoreType, boolean hasGps) {
        AbstractC22676k.m65750j(displayName, "displayName");
        AbstractC22676k.m65750j(internalName, "internalName");
        AbstractC22676k.m65750j(iconUrl, "iconUrl");
        AbstractC22676k.m65750j(category, "category");
        AbstractC22676k.m65750j(scoreType, "scoreType");
        return new RecentActivity(displayName, internalName, iconUrl, deleted, category, scoreType, hasGps);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecentActivity)) {
            return false;
        }
        RecentActivity recentActivity = (RecentActivity) other;
        return AbstractC22676k.m65745e(this.displayName, recentActivity.displayName) && AbstractC22676k.m65745e(this.internalName, recentActivity.internalName) && AbstractC22676k.m65745e(this.iconUrl, recentActivity.iconUrl) && this.deleted == recentActivity.deleted && AbstractC22676k.m65745e(this.category, recentActivity.category) && this.scoreType == recentActivity.scoreType && this.hasGps == recentActivity.hasGps;
    }

    public final String getCategory() {
        return this.category;
    }

    public final boolean getDeleted() {
        return this.deleted;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final boolean getHasGps() {
        return this.hasGps;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final String getInternalName() {
        return this.internalName;
    }

    public final ScoreType getScoreType() {
        return this.scoreType;
    }

    public int hashCode() {
        return Boolean.hashCode(this.hasGps) + ((this.scoreType.hashCode() + AbstractC11266d.m30450d(AbstractC2875y.m8289b(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.displayName.hashCode() * 31, 31, this.internalName), 31, this.iconUrl), 31, this.deleted), 31, this.category)) * 31);
    }

    public String toString() {
        String str = this.displayName;
        String str2 = this.internalName;
        String str3 = this.iconUrl;
        boolean z4 = this.deleted;
        String str4 = this.category;
        ScoreType scoreType = this.scoreType;
        boolean z13 = this.hasGps;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("RecentActivity(displayName=", str, ", internalName=", str2, ", iconUrl=");
        AbstractC38963t7.m124390t(sbM32001t, str3, ", deleted=", z4, ", category=");
        sbM32001t.append(str4);
        sbM32001t.append(", scoreType=");
        sbM32001t.append(scoreType);
        sbM32001t.append(", hasGps=");
        return AbstractC18489d0.m53372m(sbM32001t, z13, ")");
    }

    public RecentActivity(String displayName, String internalName, String iconUrl, boolean z4, String category, ScoreType scoreType, boolean z13) {
        AbstractC22676k.m65750j(displayName, "displayName");
        AbstractC22676k.m65750j(internalName, "internalName");
        AbstractC22676k.m65750j(iconUrl, "iconUrl");
        AbstractC22676k.m65750j(category, "category");
        AbstractC22676k.m65750j(scoreType, "scoreType");
        this.displayName = displayName;
        this.internalName = internalName;
        this.iconUrl = iconUrl;
        this.deleted = z4;
        this.category = category;
        this.scoreType = scoreType;
        this.hasGps = z13;
    }
}
