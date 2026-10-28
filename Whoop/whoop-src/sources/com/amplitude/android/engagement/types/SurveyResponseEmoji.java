package com.amplitude.android.engagement.types;

import ad3.C0775r;
import com.amplitude.android.engagement.C4861a;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.InterfaceC23457c;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p305lj.AbstractC24425e0;
import p319m4.AbstractC25012a;
import p585wj.AbstractC37316b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/0B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tBI\b\u0017\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ(\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012HÇ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0011\u0010\u0017\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0018J8\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0018J\u0010\u0010!\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b!\u0010\u001bJ\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b%\u0010&R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b+\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010'\u001a\u0004\b,\u0010\u0018R\u001a\u0010\u000b\u001a\u00020\u00028\u0016X\u0096D¢\u0006\f\n\u0004\b\u000b\u0010'\u001a\u0004\b-\u0010\u0018¨\u00061"}, m65681d2 = {"Lcom/amplitude/android/engagement/types/SurveyResponseEmoji;", "Llj/e0;", "", "blockId", "", "value", "max", "stringResponse", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", "seen1", "type", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;IILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self", "(Lcom/amplitude/android/engagement/types/SurveyResponseEmoji;Lzc3/c;Lyc3/g;)V", "toJSONString", "()Ljava/lang/String;", "component1", "component2", "()I", "component3", "component4", "copy", "(Ljava/lang/String;IILjava/lang/String;)Lcom/amplitude/android/engagement/types/SurveyResponseEmoji;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getBlockId", "I", "getValue", "getMax", "getStringResponse", "getType", "Companion", "$serializer", "com/amplitude/android/engagement/types/o1", "engagement_release"}, m65682k = 1, m65683mv = {1, 8, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class SurveyResponseEmoji extends AbstractC24425e0 {
    public static final int $stable = 0;
    public static final C4921o1 Companion = new C4921o1();
    private final String blockId;
    private final int max;
    private final String stringResponse;
    private final String type;
    private final int value;

    public SurveyResponseEmoji(String blockId, int i13, int i14, String stringResponse) {
        AbstractC22676k.m65750j(blockId, "blockId");
        AbstractC22676k.m65750j(stringResponse, "stringResponse");
        this.blockId = blockId;
        this.value = i13;
        this.max = i14;
        this.stringResponse = stringResponse;
        this.type = "number";
    }

    public static /* synthetic */ SurveyResponseEmoji copy$default(SurveyResponseEmoji surveyResponseEmoji, String str, int i13, int i14, String str2, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            str = surveyResponseEmoji.blockId;
        }
        if ((i15 & 2) != 0) {
            i13 = surveyResponseEmoji.value;
        }
        if ((i15 & 4) != 0) {
            i14 = surveyResponseEmoji.max;
        }
        if ((i15 & 8) != 0) {
            str2 = surveyResponseEmoji.stringResponse;
        }
        return surveyResponseEmoji.copy(str, i13, i14, str2);
    }

    public static final /* synthetic */ void write$Self(SurveyResponseEmoji self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.getBlockId());
        output.encodeIntElement(serialDesc, 1, self.value);
        output.encodeIntElement(serialDesc, 2, self.max);
        output.encodeStringElement(serialDesc, 3, self.stringResponse);
        if (!output.shouldEncodeElementDefault(serialDesc, 4) && AbstractC22676k.m65745e(self.getType(), "number")) {
            return;
        }
        output.encodeStringElement(serialDesc, 4, self.getType());
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBlockId() {
        return this.blockId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getMax() {
        return this.max;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getStringResponse() {
        return this.stringResponse;
    }

    public final SurveyResponseEmoji copy(String blockId, int value, int max, String stringResponse) {
        AbstractC22676k.m65750j(blockId, "blockId");
        AbstractC22676k.m65750j(stringResponse, "stringResponse");
        return new SurveyResponseEmoji(blockId, value, max, stringResponse);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SurveyResponseEmoji)) {
            return false;
        }
        SurveyResponseEmoji surveyResponseEmoji = (SurveyResponseEmoji) other;
        return AbstractC22676k.m65745e(this.blockId, surveyResponseEmoji.blockId) && this.value == surveyResponseEmoji.value && this.max == surveyResponseEmoji.max && AbstractC22676k.m65745e(this.stringResponse, surveyResponseEmoji.stringResponse);
    }

    @Override // p305lj.AbstractC24425e0
    public String getBlockId() {
        return this.blockId;
    }

    public final int getMax() {
        return this.max;
    }

    public final String getStringResponse() {
        return this.stringResponse;
    }

    public String getType() {
        return this.type;
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.stringResponse.hashCode() + AbstractC11266d.m30448b(this.max, AbstractC11266d.m30448b(this.value, this.blockId.hashCode() * 31, 31), 31);
    }

    @Override // p305lj.AbstractC24425e0
    public String toJSONString() {
        try {
            C0775r c0775r = AbstractC37316b.f159546a;
            c0775r.getClass();
            return c0775r.m1833d(Companion.serializer(), this);
        } catch (Exception e5) {
            C4861a.f20259o.m16067m0(AbstractC2875y.m8298k(e5, new StringBuilder("Failed to serialize to JSON string: ")));
            return null;
        }
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("SurveyResponseEmoji(blockId=");
        sb4.append(this.blockId);
        sb4.append(", value=");
        sb4.append(this.value);
        sb4.append(", max=");
        sb4.append(this.max);
        sb4.append(", stringResponse=");
        return AbstractC25012a.m73377j(sb4, this.stringResponse, ')');
    }

    @InterfaceC23457c
    public SurveyResponseEmoji(int i13, String str, int i14, int i15, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i13 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 15, SurveyResponseEmoji$$serializer.INSTANCE.getDescriptor());
        }
        this.blockId = str;
        this.value = i14;
        this.max = i15;
        this.stringResponse = str2;
        if ((i13 & 16) == 0) {
            this.type = "number";
        } else {
            this.type = str3;
        }
    }
}
