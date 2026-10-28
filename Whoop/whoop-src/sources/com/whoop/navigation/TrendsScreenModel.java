package com.whoop.navigation;

import com.mapbox.common.HttpHeaders;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import io.getstream.chat.android.client.extensions.AttachmentExtensionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 52\u00020\u0001:\u000267BK\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fBU\b\u0010\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000b\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001bJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001bJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001bJ\u0012\u0010!\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b!\u0010\"JT\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010\u001bJ\u0010\u0010&\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b&\u0010\u001dJ\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010'HÖ\u0003¢\u0006\u0004\b*\u0010+R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010.\u001a\u0004\b/\u0010\u001dR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b0\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b1\u0010\u001bR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010,\u001a\u0004\b2\u0010\u001bR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u00103\u001a\u0004\b4\u0010\"¨\u00068"}, m65681d2 = {"Lcom/whoop/navigation/TrendsScreenModel;", "Lcom/whoop/navigation/CommonNavigationScreenModel;", "", "trendKey", "", AttachmentExtensionsKt.EXTRA_DURATION, HttpHeaders.DATE, "source", "fromLocation", "Lcom/whoop/navigation/AiAction;", "aiAction", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/AiAction;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/AiAction;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$navigation_release", "(Lcom/whoop/navigation/TrendsScreenModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()I", "component3", "component4", "component5", "component6", "()Lcom/whoop/navigation/AiAction;", "copy", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/AiAction;)Lcom/whoop/navigation/TrendsScreenModel;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTrendKey", "I", "getDuration", "getDate", "getSource", "getFromLocation", "Lcom/whoop/navigation/AiAction;", "getAiAction", "Companion", "$serializer", "a", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class TrendsScreenModel implements CommonNavigationScreenModel {
    private final AiAction aiAction;
    private final String date;
    private final int duration;
    private final String fromLocation;
    private final String source;
    private final String trendKey;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: com.whoop.navigation.TrendsScreenModel$a, reason: from kotlin metadata */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/navigation/TrendsScreenModel$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/navigation/TrendsScreenModel;", "serializer", "()Lwc3/c;", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return TrendsScreenModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public TrendsScreenModel() {
        this((String) null, 0, (String) null, (String) null, (String) null, (AiAction) null, 63, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ TrendsScreenModel copy$default(TrendsScreenModel trendsScreenModel, String str, int i13, String str2, String str3, String str4, AiAction aiAction, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            str = trendsScreenModel.trendKey;
        }
        if ((i14 & 2) != 0) {
            i13 = trendsScreenModel.duration;
        }
        if ((i14 & 4) != 0) {
            str2 = trendsScreenModel.date;
        }
        if ((i14 & 8) != 0) {
            str3 = trendsScreenModel.source;
        }
        if ((i14 & 16) != 0) {
            str4 = trendsScreenModel.fromLocation;
        }
        if ((i14 & 32) != 0) {
            aiAction = trendsScreenModel.aiAction;
        }
        String str5 = str4;
        AiAction aiAction2 = aiAction;
        return trendsScreenModel.copy(str, i13, str2, str3, str5, aiAction2);
    }

    public static final /* synthetic */ void write$Self$navigation_release(TrendsScreenModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !AbstractC22676k.m65745e(self.trendKey, "")) {
            output.encodeStringElement(serialDesc, 0, self.trendKey);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.duration != 1) {
            output.encodeIntElement(serialDesc, 1, self.duration);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.date != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.date);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || !AbstractC22676k.m65745e(self.source, "")) {
            output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.source);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.fromLocation != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, self.fromLocation);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 5) && self.aiAction == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 5, AiAction$$serializer.INSTANCE, self.aiAction);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTrendKey() {
        return this.trendKey;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getDuration() {
        return this.duration;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDate() {
        return this.date;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getFromLocation() {
        return this.fromLocation;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final AiAction getAiAction() {
        return this.aiAction;
    }

    public final TrendsScreenModel copy(String trendKey, int duration, String date, String source, String fromLocation, AiAction aiAction) {
        AbstractC22676k.m65750j(trendKey, "trendKey");
        return new TrendsScreenModel(trendKey, duration, date, source, fromLocation, aiAction);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TrendsScreenModel)) {
            return false;
        }
        TrendsScreenModel trendsScreenModel = (TrendsScreenModel) other;
        return AbstractC22676k.m65745e(this.trendKey, trendsScreenModel.trendKey) && this.duration == trendsScreenModel.duration && AbstractC22676k.m65745e(this.date, trendsScreenModel.date) && AbstractC22676k.m65745e(this.source, trendsScreenModel.source) && AbstractC22676k.m65745e(this.fromLocation, trendsScreenModel.fromLocation) && AbstractC22676k.m65745e(this.aiAction, trendsScreenModel.aiAction);
    }

    public final AiAction getAiAction() {
        return this.aiAction;
    }

    public final String getDate() {
        return this.date;
    }

    public final int getDuration() {
        return this.duration;
    }

    public final String getFromLocation() {
        return this.fromLocation;
    }

    public final String getSource() {
        return this.source;
    }

    public final String getTrendKey() {
        return this.trendKey;
    }

    public int hashCode() {
        int iM30448b = AbstractC11266d.m30448b(this.duration, this.trendKey.hashCode() * 31, 31);
        String str = this.date;
        int iHashCode = (iM30448b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.source;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.fromLocation;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        AiAction aiAction = this.aiAction;
        return iHashCode3 + (aiAction != null ? aiAction.hashCode() : 0);
    }

    public String toString() {
        String str = this.trendKey;
        int i13 = this.duration;
        String str2 = this.date;
        String str3 = this.source;
        String str4 = this.fromLocation;
        AiAction aiAction = this.aiAction;
        StringBuilder sbM30467u = AbstractC11266d.m30467u(i13, "TrendsScreenModel(trendKey=", str, ", duration=", ", date=");
        AbstractC11266d.m30444B(sbM30467u, str2, ", source=", str3, ", fromLocation=");
        sbM30467u.append(str4);
        sbM30467u.append(", aiAction=");
        sbM30467u.append(aiAction);
        sbM30467u.append(")");
        return sbM30467u.toString();
    }

    public /* synthetic */ TrendsScreenModel(int i13, String str, int i14, String str2, String str3, String str4, AiAction aiAction, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i13 & 1) == 0) {
            this.trendKey = "";
        } else {
            this.trendKey = str;
        }
        if ((i13 & 2) == 0) {
            this.duration = 1;
        } else {
            this.duration = i14;
        }
        if ((i13 & 4) == 0) {
            this.date = null;
        } else {
            this.date = str2;
        }
        if ((i13 & 8) == 0) {
            this.source = "";
        } else {
            this.source = str3;
        }
        if ((i13 & 16) == 0) {
            this.fromLocation = null;
        } else {
            this.fromLocation = str4;
        }
        if ((i13 & 32) == 0) {
            this.aiAction = null;
        } else {
            this.aiAction = aiAction;
        }
    }

    public TrendsScreenModel(String trendKey, int i13, String str, String str2, String str3, AiAction aiAction) {
        AbstractC22676k.m65750j(trendKey, "trendKey");
        this.trendKey = trendKey;
        this.duration = i13;
        this.date = str;
        this.source = str2;
        this.fromLocation = str3;
        this.aiAction = aiAction;
    }

    public /* synthetic */ TrendsScreenModel(String str, int i13, String str2, String str3, String str4, AiAction aiAction, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? "" : str, (i14 & 2) != 0 ? 1 : i13, (i14 & 4) != 0 ? null : str2, (i14 & 8) != 0 ? "" : str3, (i14 & 16) != 0 ? null : str4, (i14 & 32) != 0 ? null : aiAction);
    }
}
