package com.whoop.navigation;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p319m4.AbstractC25012a;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+,B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0007\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ4\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001aJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0017R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b'\u0010\u0017R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b)\u0010\u001a¨\u0006-"}, m65681d2 = {"Lcom/whoop/navigation/WhoopLabsScreenModel;", "Lcom/whoop/navigation/CommonNavigationScreenModel;", "", "campaignId", "sessionId", "", "campaignFilter", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$navigation_release", "(Lcom/whoop/navigation/WhoopLabsScreenModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/Integer;", "component2", "component3", "()Ljava/lang/String;", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)Lcom/whoop/navigation/WhoopLabsScreenModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Integer;", "getCampaignId", "getSessionId", "Ljava/lang/String;", "getCampaignFilter", "Companion", "$serializer", "a", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class WhoopLabsScreenModel implements CommonNavigationScreenModel {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String campaignFilter;
    private final Integer campaignId;
    private final Integer sessionId;

    /* JADX INFO: renamed from: com.whoop.navigation.WhoopLabsScreenModel$a, reason: from kotlin metadata */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/navigation/WhoopLabsScreenModel$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/navigation/WhoopLabsScreenModel;", "serializer", "()Lwc3/c;", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return WhoopLabsScreenModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public WhoopLabsScreenModel() {
        this((Integer) null, (Integer) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ WhoopLabsScreenModel copy$default(WhoopLabsScreenModel whoopLabsScreenModel, Integer num, Integer num2, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            num = whoopLabsScreenModel.campaignId;
        }
        if ((i13 & 2) != 0) {
            num2 = whoopLabsScreenModel.sessionId;
        }
        if ((i13 & 4) != 0) {
            str = whoopLabsScreenModel.campaignFilter;
        }
        return whoopLabsScreenModel.copy(num, num2, str);
    }

    public static final /* synthetic */ void write$Self$navigation_release(WhoopLabsScreenModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.campaignId != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, IntSerializer.INSTANCE, self.campaignId);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.sessionId != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, IntSerializer.INSTANCE, self.sessionId);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 2) && self.campaignFilter == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.campaignFilter);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getCampaignId() {
        return this.campaignId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getSessionId() {
        return this.sessionId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCampaignFilter() {
        return this.campaignFilter;
    }

    public final WhoopLabsScreenModel copy(Integer campaignId, Integer sessionId, String campaignFilter) {
        return new WhoopLabsScreenModel(campaignId, sessionId, campaignFilter);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WhoopLabsScreenModel)) {
            return false;
        }
        WhoopLabsScreenModel whoopLabsScreenModel = (WhoopLabsScreenModel) other;
        return AbstractC22676k.m65745e(this.campaignId, whoopLabsScreenModel.campaignId) && AbstractC22676k.m65745e(this.sessionId, whoopLabsScreenModel.sessionId) && AbstractC22676k.m65745e(this.campaignFilter, whoopLabsScreenModel.campaignFilter);
    }

    public final String getCampaignFilter() {
        return this.campaignFilter;
    }

    public final Integer getCampaignId() {
        return this.campaignId;
    }

    public final Integer getSessionId() {
        return this.sessionId;
    }

    public int hashCode() {
        Integer num = this.campaignId;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.sessionId;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.campaignFilter;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return AbstractC25012a.m73376i(this.campaignFilter, ")", AbstractC36095b.m114684l("WhoopLabsScreenModel(campaignId=", this.campaignId, ", sessionId=", this.sessionId, ", campaignFilter="));
    }

    public /* synthetic */ WhoopLabsScreenModel(int i13, Integer num, Integer num2, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i13 & 1) == 0) {
            this.campaignId = null;
        } else {
            this.campaignId = num;
        }
        if ((i13 & 2) == 0) {
            this.sessionId = null;
        } else {
            this.sessionId = num2;
        }
        if ((i13 & 4) == 0) {
            this.campaignFilter = null;
        } else {
            this.campaignFilter = str;
        }
    }

    public WhoopLabsScreenModel(Integer num, Integer num2, String str) {
        this.campaignId = num;
        this.sessionId = num2;
        this.campaignFilter = str;
    }

    public /* synthetic */ WhoopLabsScreenModel(Integer num, Integer num2, String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : num, (i13 & 2) != 0 ? null : num2, (i13 & 4) != 0 ? null : str);
    }
}
