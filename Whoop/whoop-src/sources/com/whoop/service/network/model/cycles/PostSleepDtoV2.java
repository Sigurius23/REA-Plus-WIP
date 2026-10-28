package com.whoop.service.network.model.cycles;

import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002.-B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tBM\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0019JD\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0019J\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b)\u0010\u0019R\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b*\u0010\u0019R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b+\u0010\u0019R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010'\u001a\u0004\b,\u0010\u0019¨\u0006/"}, m65681d2 = {"Lcom/whoop/service/network/model/cycles/PostSleepDtoV2;", "", "", "during", "timezone", "source", "type", "sourceId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$core_release", "(Lcom/whoop/service/network/model/cycles/PostSleepDtoV2;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/service/network/model/cycles/PostSleepDtoV2;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDuring", "getTimezone", "getSource", "getType", "getSourceId", "Companion", "$serializer", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class PostSleepDtoV2 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @SerializedName("during")
    private final String during;

    @SerializedName("source")
    private final String source;

    @SerializedName("source_id")
    private final String sourceId;

    @SerializedName("timezone")
    private final String timezone;

    @SerializedName("type")
    private final String type;

    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/service/network/model/cycles/PostSleepDtoV2$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/service/network/model/cycles/PostSleepDtoV2;", "serializer", "()Lwc3/c;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return PostSleepDtoV2$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ PostSleepDtoV2(int i13, String str, String str2, String str3, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i13 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 15, PostSleepDtoV2$$serializer.INSTANCE.getDescriptor());
        }
        this.during = str;
        this.timezone = str2;
        this.source = str3;
        this.type = str4;
        if ((i13 & 16) == 0) {
            this.sourceId = null;
        } else {
            this.sourceId = str5;
        }
    }

    public static /* synthetic */ PostSleepDtoV2 copy$default(PostSleepDtoV2 postSleepDtoV2, String str, String str2, String str3, String str4, String str5, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = postSleepDtoV2.during;
        }
        if ((i13 & 2) != 0) {
            str2 = postSleepDtoV2.timezone;
        }
        if ((i13 & 4) != 0) {
            str3 = postSleepDtoV2.source;
        }
        if ((i13 & 8) != 0) {
            str4 = postSleepDtoV2.type;
        }
        if ((i13 & 16) != 0) {
            str5 = postSleepDtoV2.sourceId;
        }
        String str6 = str5;
        String str7 = str3;
        return postSleepDtoV2.copy(str, str2, str7, str4, str6);
    }

    public static final /* synthetic */ void write$Self$core_release(PostSleepDtoV2 self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.during);
        output.encodeStringElement(serialDesc, 1, self.timezone);
        output.encodeStringElement(serialDesc, 2, self.source);
        output.encodeStringElement(serialDesc, 3, self.type);
        if (!output.shouldEncodeElementDefault(serialDesc, 4) && self.sourceId == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, self.sourceId);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDuring() {
        return this.during;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTimezone() {
        return this.timezone;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSourceId() {
        return this.sourceId;
    }

    public final PostSleepDtoV2 copy(String during, String timezone, String source, String type, String sourceId) {
        AbstractC22676k.m65750j(during, "during");
        AbstractC22676k.m65750j(timezone, "timezone");
        AbstractC22676k.m65750j(source, "source");
        AbstractC22676k.m65750j(type, "type");
        return new PostSleepDtoV2(during, timezone, source, type, sourceId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PostSleepDtoV2)) {
            return false;
        }
        PostSleepDtoV2 postSleepDtoV2 = (PostSleepDtoV2) other;
        return AbstractC22676k.m65745e(this.during, postSleepDtoV2.during) && AbstractC22676k.m65745e(this.timezone, postSleepDtoV2.timezone) && AbstractC22676k.m65745e(this.source, postSleepDtoV2.source) && AbstractC22676k.m65745e(this.type, postSleepDtoV2.type) && AbstractC22676k.m65745e(this.sourceId, postSleepDtoV2.sourceId);
    }

    public final String getDuring() {
        return this.during;
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

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.during.hashCode() * 31, 31, this.timezone), 31, this.source), 31, this.type);
        String str = this.sourceId;
        return iM30450d + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.during;
        String str2 = this.timezone;
        String str3 = this.source;
        String str4 = this.type;
        String str5 = this.sourceId;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("PostSleepDtoV2(during=", str, ", timezone=", str2, ", source=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", type=", str4, ", sourceId=");
        return AbstractC25012a.m73376i(str5, ")", sbM32001t);
    }

    public PostSleepDtoV2(String during, String timezone, String source, String type, String str) {
        AbstractC22676k.m65750j(during, "during");
        AbstractC22676k.m65750j(timezone, "timezone");
        AbstractC22676k.m65750j(source, "source");
        AbstractC22676k.m65750j(type, "type");
        this.during = during;
        this.timezone = timezone;
        this.source = source;
        this.type = type;
        this.sourceId = str;
    }

    public /* synthetic */ PostSleepDtoV2(String str, String str2, String str3, String str4, String str5, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, (i13 & 16) != 0 ? null : str5);
    }
}
