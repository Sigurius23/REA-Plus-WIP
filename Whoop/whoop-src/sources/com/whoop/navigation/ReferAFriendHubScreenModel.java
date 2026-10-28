package com.whoop.navigation;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u000201B3\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nBA\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\t\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ<\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\u0019J\u0010\u0010\"\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020\u00072\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010(\u001a\u0004\b*\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010+\u001a\u0004\b,\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010-\u001a\u0004\b.\u0010\u001e¨\u00062"}, m65681d2 = {"Lcom/whoop/navigation/ReferAFriendHubScreenModel;", "Lcom/whoop/navigation/CommonNavigationScreenModel;", "", "shareMessage", "source", "", "graphId", "", "resolveServerSide", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Z)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$navigation_release", "(Lcom/whoop/navigation/ReferAFriendHubScreenModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/lang/Integer;", "component4", "()Z", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Z)Lcom/whoop/navigation/ReferAFriendHubScreenModel;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getShareMessage", "getSource", "Ljava/lang/Integer;", "getGraphId", "Z", "getResolveServerSide", "Companion", "$serializer", "a", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ReferAFriendHubScreenModel implements CommonNavigationScreenModel {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Integer graphId;
    private final boolean resolveServerSide;
    private final String shareMessage;
    private final String source;

    /* JADX INFO: renamed from: com.whoop.navigation.ReferAFriendHubScreenModel$a, reason: from kotlin metadata */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/navigation/ReferAFriendHubScreenModel$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/navigation/ReferAFriendHubScreenModel;", "serializer", "()Lwc3/c;", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ReferAFriendHubScreenModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public ReferAFriendHubScreenModel() {
        this((String) null, (String) null, (Integer) null, false, 15, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ ReferAFriendHubScreenModel copy$default(ReferAFriendHubScreenModel referAFriendHubScreenModel, String str, String str2, Integer num, boolean z4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = referAFriendHubScreenModel.shareMessage;
        }
        if ((i13 & 2) != 0) {
            str2 = referAFriendHubScreenModel.source;
        }
        if ((i13 & 4) != 0) {
            num = referAFriendHubScreenModel.graphId;
        }
        if ((i13 & 8) != 0) {
            z4 = referAFriendHubScreenModel.resolveServerSide;
        }
        return referAFriendHubScreenModel.copy(str, str2, num, z4);
    }

    public static final /* synthetic */ void write$Self$navigation_release(ReferAFriendHubScreenModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !AbstractC22676k.m65745e(self.shareMessage, "")) {
            output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.shareMessage);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || !AbstractC22676k.m65745e(self.source, "")) {
            output.encodeStringElement(serialDesc, 1, self.source);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.graphId != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, IntSerializer.INSTANCE, self.graphId);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.resolveServerSide) {
            output.encodeBooleanElement(serialDesc, 3, self.resolveServerSide);
        }
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getShareMessage() {
        return this.shareMessage;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getGraphId() {
        return this.graphId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getResolveServerSide() {
        return this.resolveServerSide;
    }

    public final ReferAFriendHubScreenModel copy(String shareMessage, String source, Integer graphId, boolean resolveServerSide) {
        AbstractC22676k.m65750j(source, "source");
        return new ReferAFriendHubScreenModel(shareMessage, source, graphId, resolveServerSide);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReferAFriendHubScreenModel)) {
            return false;
        }
        ReferAFriendHubScreenModel referAFriendHubScreenModel = (ReferAFriendHubScreenModel) other;
        return AbstractC22676k.m65745e(this.shareMessage, referAFriendHubScreenModel.shareMessage) && AbstractC22676k.m65745e(this.source, referAFriendHubScreenModel.source) && AbstractC22676k.m65745e(this.graphId, referAFriendHubScreenModel.graphId) && this.resolveServerSide == referAFriendHubScreenModel.resolveServerSide;
    }

    public final Integer getGraphId() {
        return this.graphId;
    }

    public final boolean getResolveServerSide() {
        return this.resolveServerSide;
    }

    public final String getShareMessage() {
        return this.shareMessage;
    }

    public final String getSource() {
        return this.source;
    }

    public int hashCode() {
        String str = this.shareMessage;
        int iM30450d = AbstractC11266d.m30450d((str == null ? 0 : str.hashCode()) * 31, 31, this.source);
        Integer num = this.graphId;
        return Boolean.hashCode(this.resolveServerSide) + ((iM30450d + (num != null ? num.hashCode() : 0)) * 31);
    }

    public String toString() {
        String str = this.shareMessage;
        String str2 = this.source;
        Integer num = this.graphId;
        boolean z4 = this.resolveServerSide;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("ReferAFriendHubScreenModel(shareMessage=", str, ", source=", str2, ", graphId=");
        sbM32001t.append(num);
        sbM32001t.append(", resolveServerSide=");
        sbM32001t.append(z4);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public /* synthetic */ ReferAFriendHubScreenModel(int i13, String str, String str2, Integer num, boolean z4, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i13 & 1) == 0) {
            this.shareMessage = "";
        } else {
            this.shareMessage = str;
        }
        if ((i13 & 2) == 0) {
            this.source = "";
        } else {
            this.source = str2;
        }
        if ((i13 & 4) == 0) {
            this.graphId = null;
        } else {
            this.graphId = num;
        }
        if ((i13 & 8) == 0) {
            this.resolveServerSide = false;
        } else {
            this.resolveServerSide = z4;
        }
    }

    public ReferAFriendHubScreenModel(String str, String source, Integer num, boolean z4) {
        AbstractC22676k.m65750j(source, "source");
        this.shareMessage = str;
        this.source = source;
        this.graphId = num;
        this.resolveServerSide = z4;
    }

    public /* synthetic */ ReferAFriendHubScreenModel(String str, String str2, Integer num, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? "" : str2, (i13 & 4) != 0 ? null : num, (i13 & 8) != 0 ? false : z4);
    }
}
