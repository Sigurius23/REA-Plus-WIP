package com.whoop.service.network.model.cycles;

import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import m83.AbstractC25267u;
import org.joda.time.DateTime;
import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeZone;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import yb3.AbstractC39414r;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0087\b\u0018\u0000 W2\u00020\u0001:\u0002XWB\u008d\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u0016B³\u0001\b\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0006\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u0015\u0010\u001aJ\r\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u001fJ\u0010\u0010%\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u001fJ\u0010\u0010&\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b&\u0010#J\u0010\u0010'\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b'\u0010\u001fJ\u0010\u0010(\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b(\u0010\u001fJ\u0012\u0010)\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b)\u0010\u001fJ\u0010\u0010*\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b*\u0010\u001fJ\u0010\u0010+\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b+\u0010\u001fJ\u0010\u0010,\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b,\u0010\u001fJ\u0010\u0010-\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b-\u0010\u001fJ\u0012\u0010.\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b.\u0010\u001fJ\u0012\u0010/\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b/\u0010\u001fJ\u0010\u00100\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b0\u0010#J¶\u0001\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0014\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b3\u0010\u001fJ\u0010\u00104\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b4\u0010#J\u001a\u00107\u001a\u0002062\b\u00105\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b7\u00108J'\u0010A\u001a\u00020>2\u0006\u00109\u001a\u00020\u00002\u0006\u0010;\u001a\u00020:2\u0006\u0010=\u001a\u00020<H\u0001¢\u0006\u0004\b?\u0010@R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010B\u001a\u0004\bC\u0010\u001fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010D\u001a\u0004\bE\u0010!R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010F\u001a\u0004\bG\u0010#R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010B\u001a\u0004\bH\u0010\u001fR\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010B\u001a\u0004\bI\u0010\u001fR\u001a\u0010\n\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010F\u001a\u0004\bJ\u0010#R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010B\u001a\u0004\bK\u0010\u001fR\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010B\u001a\u0004\bL\u0010\u001fR\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010B\u001a\u0004\bM\u0010\u001fR\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010B\u001a\u0004\bN\u0010\u001fR\u001a\u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010B\u001a\u0004\bO\u0010\u001fR\u001a\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010B\u001a\u0004\bP\u0010\u001fR\u001a\u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010B\u001a\u0004\bQ\u0010\u001fR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010B\u001a\u0004\bR\u0010\u001fR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010B\u001a\u0004\bS\u0010\u001fR \u0010\u0014\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010F\u0012\u0004\bU\u0010V\u001a\u0004\bT\u0010#¨\u0006Y"}, m65681d2 = {"Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;", "", "", "id", "", "cycleId", "", "userId", "createdAt", "updatedAt", "version", "during", "timezone", "timezoneOffset", "source", "scoreState", "scoreType", "type", "translatedType", "sourceId", "activityV1Id", "<init>", "(Ljava/lang/String;JILjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;JILjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Lcom/whoop/service/network/model/cycles/SleepActivity;", "toSleepActivity", "()Lcom/whoop/service/network/model/cycles/SleepActivity;", "component1", "()Ljava/lang/String;", "component2", "()J", "component3", "()I", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "copy", "(Ljava/lang/String;JILjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$core_release", "(Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getId", "J", "getCycleId", "I", "getUserId", "getCreatedAt", "getUpdatedAt", "getVersion", "getDuring", "getTimezone", "getTimezoneOffset", "getSource", "getScoreState", "getScoreType", "getType", "getTranslatedType", "getSourceId", "getActivityV1Id", "getActivityV1Id$annotations", "()V", "Companion", "$serializer", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class SleepActivityResponseV2 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @SerializedName("activity_v1_id")
    private final int activityV1Id;

    @SerializedName("created_at")
    private final String createdAt;

    @SerializedName("cycle_id")
    private final long cycleId;

    @SerializedName("during")
    private final String during;

    @SerializedName("id")
    private final String id;

    @SerializedName("score_state")
    private final String scoreState;

    @SerializedName("score_type")
    private final String scoreType;

    @SerializedName("source")
    private final String source;

    @SerializedName("source_id")
    private final String sourceId;

    @SerializedName("timezone")
    private final String timezone;

    @SerializedName("timezone_offset")
    private final String timezoneOffset;

    @SerializedName("translated_type")
    private final String translatedType;

    @SerializedName("type")
    private final String type;

    @SerializedName("updated_at")
    private final String updatedAt;

    @SerializedName("user_id")
    private final int userId;

    @SerializedName("version")
    private final int version;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;", "serializer", "()Lwc3/c;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return SleepActivityResponseV2$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ SleepActivityResponseV2(int i13, String str, long j7, int i14, String str2, String str3, int i15, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, int i16, SerializationConstructorMarker serializationConstructorMarker) {
        if (65535 != (i13 & 65535)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 65535, SleepActivityResponseV2$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        this.cycleId = j7;
        this.userId = i14;
        this.createdAt = str2;
        this.updatedAt = str3;
        this.version = i15;
        this.during = str4;
        this.timezone = str5;
        this.timezoneOffset = str6;
        this.source = str7;
        this.scoreState = str8;
        this.scoreType = str9;
        this.type = str10;
        this.translatedType = str11;
        this.sourceId = str12;
        this.activityV1Id = i16;
    }

    @InterfaceC37143h("activity_v1_id")
    public static /* synthetic */ void getActivityV1Id$annotations() {
    }

    public static final /* synthetic */ void write$Self$core_release(SleepActivityResponseV2 self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.id);
        output.encodeLongElement(serialDesc, 1, self.cycleId);
        output.encodeIntElement(serialDesc, 2, self.userId);
        output.encodeStringElement(serialDesc, 3, self.createdAt);
        output.encodeStringElement(serialDesc, 4, self.updatedAt);
        output.encodeIntElement(serialDesc, 5, self.version);
        output.encodeStringElement(serialDesc, 6, self.during);
        output.encodeStringElement(serialDesc, 7, self.timezone);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 8, stringSerializer, self.timezoneOffset);
        output.encodeStringElement(serialDesc, 9, self.source);
        output.encodeStringElement(serialDesc, 10, self.scoreState);
        output.encodeStringElement(serialDesc, 11, self.scoreType);
        output.encodeStringElement(serialDesc, 12, self.type);
        output.encodeNullableSerializableElement(serialDesc, 13, stringSerializer, self.translatedType);
        output.encodeNullableSerializableElement(serialDesc, 14, stringSerializer, self.sourceId);
        output.encodeIntElement(serialDesc, 15, self.activityV1Id);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getScoreState() {
        return this.scoreState;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getScoreType() {
        return this.scoreType;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getTranslatedType() {
        return this.translatedType;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getSourceId() {
        return this.sourceId;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final int getActivityV1Id() {
        return this.activityV1Id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getCycleId() {
        return this.cycleId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCreatedAt() {
        return this.createdAt;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getUpdatedAt() {
        return this.updatedAt;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getVersion() {
        return this.version;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getDuring() {
        return this.during;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getTimezone() {
        return this.timezone;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getTimezoneOffset() {
        return this.timezoneOffset;
    }

    public final SleepActivityResponseV2 copy(String id4, long cycleId, int userId, String createdAt, String updatedAt, int version, String during, String timezone, String timezoneOffset, String source, String scoreState, String scoreType, String type, String translatedType, String sourceId, int activityV1Id) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(createdAt, "createdAt");
        AbstractC22676k.m65750j(updatedAt, "updatedAt");
        AbstractC22676k.m65750j(during, "during");
        AbstractC22676k.m65750j(timezone, "timezone");
        AbstractC22676k.m65750j(source, "source");
        AbstractC22676k.m65750j(scoreState, "scoreState");
        AbstractC22676k.m65750j(scoreType, "scoreType");
        AbstractC22676k.m65750j(type, "type");
        return new SleepActivityResponseV2(id4, cycleId, userId, createdAt, updatedAt, version, during, timezone, timezoneOffset, source, scoreState, scoreType, type, translatedType, sourceId, activityV1Id);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SleepActivityResponseV2)) {
            return false;
        }
        SleepActivityResponseV2 sleepActivityResponseV2 = (SleepActivityResponseV2) other;
        return AbstractC22676k.m65745e(this.id, sleepActivityResponseV2.id) && this.cycleId == sleepActivityResponseV2.cycleId && this.userId == sleepActivityResponseV2.userId && AbstractC22676k.m65745e(this.createdAt, sleepActivityResponseV2.createdAt) && AbstractC22676k.m65745e(this.updatedAt, sleepActivityResponseV2.updatedAt) && this.version == sleepActivityResponseV2.version && AbstractC22676k.m65745e(this.during, sleepActivityResponseV2.during) && AbstractC22676k.m65745e(this.timezone, sleepActivityResponseV2.timezone) && AbstractC22676k.m65745e(this.timezoneOffset, sleepActivityResponseV2.timezoneOffset) && AbstractC22676k.m65745e(this.source, sleepActivityResponseV2.source) && AbstractC22676k.m65745e(this.scoreState, sleepActivityResponseV2.scoreState) && AbstractC22676k.m65745e(this.scoreType, sleepActivityResponseV2.scoreType) && AbstractC22676k.m65745e(this.type, sleepActivityResponseV2.type) && AbstractC22676k.m65745e(this.translatedType, sleepActivityResponseV2.translatedType) && AbstractC22676k.m65745e(this.sourceId, sleepActivityResponseV2.sourceId) && this.activityV1Id == sleepActivityResponseV2.activityV1Id;
    }

    public final int getActivityV1Id() {
        return this.activityV1Id;
    }

    public final String getCreatedAt() {
        return this.createdAt;
    }

    public final long getCycleId() {
        return this.cycleId;
    }

    public final String getDuring() {
        return this.during;
    }

    public final String getId() {
        return this.id;
    }

    public final String getScoreState() {
        return this.scoreState;
    }

    public final String getScoreType() {
        return this.scoreType;
    }

    public final String getSource() {
        return this.source;
    }

    public final String getSourceId() {
        return this.sourceId;
    }

    public final String getTimezone() {
        return this.timezone;
    }

    public final String getTimezoneOffset() {
        return this.timezoneOffset;
    }

    public final String getTranslatedType() {
        return this.translatedType;
    }

    public final String getType() {
        return this.type;
    }

    public final String getUpdatedAt() {
        return this.updatedAt;
    }

    public final int getUserId() {
        return this.userId;
    }

    public final int getVersion() {
        return this.version;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30448b(this.version, AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30448b(this.userId, AbstractC11266d.m30451e(this.id.hashCode() * 31, this.cycleId, 31), 31), 31, this.createdAt), 31, this.updatedAt), 31), 31, this.during), 31, this.timezone);
        String str = this.timezoneOffset;
        int iM30450d2 = AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d((iM30450d + (str == null ? 0 : str.hashCode())) * 31, 31, this.source), 31, this.scoreState), 31, this.scoreType), 31, this.type);
        String str2 = this.translatedType;
        int iHashCode = (iM30450d2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.sourceId;
        return Integer.hashCode(this.activityV1Id) + ((iHashCode + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final SleepActivity toSleepActivity() {
        List listM125906y0 = AbstractC39414r.m125906y0(AbstractC39414r.m125900s0(AbstractC39414r.m125898q0(this.during, "["), ")"), new String[]{","}, 6);
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(listM125906y0, 10));
        Iterator it = listM125906y0.iterator();
        while (it.hasNext()) {
            String string = AbstractC39414r.m125869O0((String) it.next()).toString();
            AbstractC22676k.m65750j(string, "<this>");
            arrayList.add(AbstractC39414r.m125901t0(string, "'", "'"));
        }
        DateTime dateTime = DateTime.parse((String) arrayList.get(0));
        Period period = new Period(dateTime, DateTime.parse((String) arrayList.get(1)));
        String str = this.timezoneOffset;
        if (str == null) {
            int offset = DateTimeZone.forID(this.timezone).getOffset(dateTime.getMillis());
            str = String.format("%+03d%02d", Arrays.copyOf(new Object[]{Integer.valueOf(offset / DateTimeConstants.MILLIS_PER_HOUR), Integer.valueOf(Math.abs(offset / DateTimeConstants.MILLIS_PER_MINUTE) % 60)}, 2));
        }
        String str2 = str;
        int i13 = this.activityV1Id;
        String str3 = this.scoreState;
        String lowerCase = this.type.toLowerCase(Locale.ROOT);
        AbstractC22676k.m65749i(lowerCase, "toLowerCase(...)");
        return new SleepActivity(i13, str3, 0.0d, period, str2, false, null, lowerCase.equals("nap"), null, null, null, null, null, null, null, null, null, null, null);
    }

    public String toString() {
        String str = this.id;
        long j7 = this.cycleId;
        int i13 = this.userId;
        String str2 = this.createdAt;
        String str3 = this.updatedAt;
        int i14 = this.version;
        String str4 = this.during;
        String str5 = this.timezone;
        String str6 = this.timezoneOffset;
        String str7 = this.source;
        String str8 = this.scoreState;
        String str9 = this.scoreType;
        String str10 = this.type;
        String str11 = this.translatedType;
        String str12 = this.sourceId;
        int i15 = this.activityV1Id;
        StringBuilder sbM32000s = AbstractC11895b.m32000s("SleepActivityResponseV2(id=", str, j7, ", cycleId=");
        sbM32000s.append(", userId=");
        sbM32000s.append(i13);
        sbM32000s.append(", createdAt=");
        sbM32000s.append(str2);
        sbM32000s.append(", updatedAt=");
        sbM32000s.append(str3);
        sbM32000s.append(", version=");
        sbM32000s.append(i14);
        AbstractC11266d.m30444B(sbM32000s, ", during=", str4, ", timezone=", str5);
        AbstractC11266d.m30444B(sbM32000s, ", timezoneOffset=", str6, ", source=", str7);
        AbstractC11266d.m30444B(sbM32000s, ", scoreState=", str8, ", scoreType=", str9);
        AbstractC11266d.m30444B(sbM32000s, ", type=", str10, ", translatedType=", str11);
        sbM32000s.append(", sourceId=");
        sbM32000s.append(str12);
        sbM32000s.append(", activityV1Id=");
        sbM32000s.append(i15);
        sbM32000s.append(")");
        return sbM32000s.toString();
    }

    public SleepActivityResponseV2(String id4, long j7, int i13, String createdAt, String updatedAt, int i14, String during, String timezone, String str, String source, String scoreState, String scoreType, String type, String str2, String str3, int i15) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(createdAt, "createdAt");
        AbstractC22676k.m65750j(updatedAt, "updatedAt");
        AbstractC22676k.m65750j(during, "during");
        AbstractC22676k.m65750j(timezone, "timezone");
        AbstractC22676k.m65750j(source, "source");
        AbstractC22676k.m65750j(scoreState, "scoreState");
        AbstractC22676k.m65750j(scoreType, "scoreType");
        AbstractC22676k.m65750j(type, "type");
        this.id = id4;
        this.cycleId = j7;
        this.userId = i13;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.version = i14;
        this.during = during;
        this.timezone = timezone;
        this.timezoneOffset = str;
        this.source = source;
        this.scoreState = scoreState;
        this.scoreType = scoreType;
        this.type = type;
        this.translatedType = str2;
        this.sourceId = str3;
        this.activityV1Id = i15;
    }
}
