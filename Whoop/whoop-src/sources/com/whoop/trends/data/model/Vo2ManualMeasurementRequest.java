package com.whoop.trends.data.model;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
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

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002,+B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tBA\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\b\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0018J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0018J:\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0018J\u0010\u0010 \u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b \u0010\u001aJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b)\u0010\u0018R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b*\u0010\u0018¨\u0006-"}, m65681d2 = {"Lcom/whoop/trends/data/model/Vo2ManualMeasurementRequest;", "", "", "scoreTimestamp", "", "vo2maxScore", "source", "id", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$trends_release", "(Lcom/whoop/trends/data/model/Vo2ManualMeasurementRequest;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()I", "component3", "component4", "copy", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)Lcom/whoop/trends/data/model/Vo2ManualMeasurementRequest;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getScoreTimestamp", "I", "getVo2maxScore", "getSource", "getId", "Companion", "$serializer", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class Vo2ManualMeasurementRequest {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String id;
    private final String scoreTimestamp;
    private final String source;
    private final int vo2maxScore;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/trends/data/model/Vo2ManualMeasurementRequest$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/trends/data/model/Vo2ManualMeasurementRequest;", "serializer", "()Lwc3/c;", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return Vo2ManualMeasurementRequest$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ Vo2ManualMeasurementRequest(int i13, String str, int i14, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i13 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 15, Vo2ManualMeasurementRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.scoreTimestamp = str;
        this.vo2maxScore = i14;
        this.source = str2;
        this.id = str3;
    }

    public static /* synthetic */ Vo2ManualMeasurementRequest copy$default(Vo2ManualMeasurementRequest vo2ManualMeasurementRequest, String str, int i13, String str2, String str3, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            str = vo2ManualMeasurementRequest.scoreTimestamp;
        }
        if ((i14 & 2) != 0) {
            i13 = vo2ManualMeasurementRequest.vo2maxScore;
        }
        if ((i14 & 4) != 0) {
            str2 = vo2ManualMeasurementRequest.source;
        }
        if ((i14 & 8) != 0) {
            str3 = vo2ManualMeasurementRequest.id;
        }
        return vo2ManualMeasurementRequest.copy(str, i13, str2, str3);
    }

    public static final /* synthetic */ void write$Self$trends_release(Vo2ManualMeasurementRequest self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.scoreTimestamp);
        output.encodeIntElement(serialDesc, 1, self.vo2maxScore);
        output.encodeStringElement(serialDesc, 2, self.source);
        output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.id);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getScoreTimestamp() {
        return this.scoreTimestamp;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getVo2maxScore() {
        return this.vo2maxScore;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final Vo2ManualMeasurementRequest copy(String scoreTimestamp, int vo2maxScore, String source, String id4) {
        AbstractC22676k.m65750j(scoreTimestamp, "scoreTimestamp");
        AbstractC22676k.m65750j(source, "source");
        return new Vo2ManualMeasurementRequest(scoreTimestamp, vo2maxScore, source, id4);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Vo2ManualMeasurementRequest)) {
            return false;
        }
        Vo2ManualMeasurementRequest vo2ManualMeasurementRequest = (Vo2ManualMeasurementRequest) other;
        return AbstractC22676k.m65745e(this.scoreTimestamp, vo2ManualMeasurementRequest.scoreTimestamp) && this.vo2maxScore == vo2ManualMeasurementRequest.vo2maxScore && AbstractC22676k.m65745e(this.source, vo2ManualMeasurementRequest.source) && AbstractC22676k.m65745e(this.id, vo2ManualMeasurementRequest.id);
    }

    public final String getId() {
        return this.id;
    }

    public final String getScoreTimestamp() {
        return this.scoreTimestamp;
    }

    public final String getSource() {
        return this.source;
    }

    public final int getVo2maxScore() {
        return this.vo2maxScore;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30448b(this.vo2maxScore, this.scoreTimestamp.hashCode() * 31, 31), 31, this.source);
        String str = this.id;
        return iM30450d + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.scoreTimestamp;
        int i13 = this.vo2maxScore;
        return AbstractC11266d.m30464r(AbstractC11266d.m30467u(i13, "Vo2ManualMeasurementRequest(scoreTimestamp=", str, ", vo2maxScore=", ", source="), this.source, ", id=", this.id, ")");
    }

    public Vo2ManualMeasurementRequest(String scoreTimestamp, int i13, String source, String str) {
        AbstractC22676k.m65750j(scoreTimestamp, "scoreTimestamp");
        AbstractC22676k.m65750j(source, "source");
        this.scoreTimestamp = scoreTimestamp;
        this.vo2maxScore = i13;
        this.source = source;
        this.id = str;
    }
}
