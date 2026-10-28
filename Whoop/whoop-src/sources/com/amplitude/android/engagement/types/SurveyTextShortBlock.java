package com.amplitude.android.engagement.types;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.InterfaceC23457c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002()B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0017\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ(\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÇ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J$\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0016J\u0010\u0010\u001c\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u0018¨\u0006*"}, m65681d2 = {"Lcom/amplitude/android/engagement/types/SurveyTextShortBlock;", "Lcom/amplitude/android/engagement/types/ContentBlock;", "", "uuid", "Lcom/amplitude/android/engagement/types/SurveyTextMeta;", "meta", "<init>", "(Ljava/lang/String;Lcom/amplitude/android/engagement/types/SurveyTextMeta;)V", "", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/amplitude/android/engagement/types/SurveyTextMeta;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self", "(Lcom/amplitude/android/engagement/types/SurveyTextShortBlock;Lzc3/c;Lyc3/g;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/amplitude/android/engagement/types/SurveyTextMeta;", "copy", "(Ljava/lang/String;Lcom/amplitude/android/engagement/types/SurveyTextMeta;)Lcom/amplitude/android/engagement/types/SurveyTextShortBlock;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUuid", "Lcom/amplitude/android/engagement/types/SurveyTextMeta;", "getMeta", "Companion", "$serializer", "com/amplitude/android/engagement/types/w1", "engagement_release"}, m65682k = 1, m65683mv = {1, 8, 0}, m65685xi = 48)
@InterfaceC37143h("survey_text_short")
@InterfaceC37144i
public final /* data */ class SurveyTextShortBlock extends ContentBlock {
    public static final int $stable = 0;
    public static final C4945w1 Companion = new C4945w1();
    private final SurveyTextMeta meta;
    private final String uuid;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @InterfaceC23457c
    public /* synthetic */ SurveyTextShortBlock(int i13, String str, SurveyTextMeta surveyTextMeta, SerializationConstructorMarker serializationConstructorMarker) {
        super(i13, serializationConstructorMarker);
        if (3 != (i13 & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 3, SurveyTextShortBlock$$serializer.INSTANCE.getDescriptor());
        }
        this.uuid = str;
        this.meta = surveyTextMeta;
    }

    public static /* synthetic */ SurveyTextShortBlock copy$default(SurveyTextShortBlock surveyTextShortBlock, String str, SurveyTextMeta surveyTextMeta, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = surveyTextShortBlock.uuid;
        }
        if ((i13 & 2) != 0) {
            surveyTextMeta = surveyTextShortBlock.meta;
        }
        return surveyTextShortBlock.copy(str, surveyTextMeta);
    }

    public static final /* synthetic */ void write$Self(SurveyTextShortBlock self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        ContentBlock.write$Self(self, output, serialDesc);
        output.encodeStringElement(serialDesc, 0, self.uuid);
        output.encodeSerializableElement(serialDesc, 1, SurveyTextMeta$$serializer.INSTANCE, self.meta);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUuid() {
        return this.uuid;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final SurveyTextMeta getMeta() {
        return this.meta;
    }

    public final SurveyTextShortBlock copy(String uuid, SurveyTextMeta meta) {
        AbstractC22676k.m65750j(uuid, "uuid");
        AbstractC22676k.m65750j(meta, "meta");
        return new SurveyTextShortBlock(uuid, meta);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SurveyTextShortBlock)) {
            return false;
        }
        SurveyTextShortBlock surveyTextShortBlock = (SurveyTextShortBlock) other;
        return AbstractC22676k.m65745e(this.uuid, surveyTextShortBlock.uuid) && AbstractC22676k.m65745e(this.meta, surveyTextShortBlock.meta);
    }

    public final SurveyTextMeta getMeta() {
        return this.meta;
    }

    public final String getUuid() {
        return this.uuid;
    }

    public int hashCode() {
        return this.meta.hashCode() + (this.uuid.hashCode() * 31);
    }

    public String toString() {
        return "SurveyTextShortBlock(uuid=" + this.uuid + ", meta=" + this.meta + ')';
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SurveyTextShortBlock(String uuid, SurveyTextMeta meta) {
        super(null);
        AbstractC22676k.m65750j(uuid, "uuid");
        AbstractC22676k.m65750j(meta, "meta");
        this.uuid = uuid;
        this.meta = meta;
    }
}
