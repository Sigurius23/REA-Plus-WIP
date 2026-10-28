package com.amplitude.android.engagement.types;

import ad3.C0775r;
import com.amplitude.android.engagement.C4861a;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.InterfaceC23457c;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p305lj.AbstractC24425e0;
import p319m4.AbstractC25012a;
import p585wj.AbstractC37316b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/0B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tBK\b\u0017\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ(\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012HÇ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0011\u0010\u0017\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0018J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0018J:\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0018J\u0010\u0010!\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b!\u0010\u001bJ\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b%\u0010&R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b+\u0010\u0018R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010'\u001a\u0004\b,\u0010\u0018R\u001a\u0010\u000b\u001a\u00020\u00028\u0016X\u0096D¢\u0006\f\n\u0004\b\u000b\u0010'\u001a\u0004\b-\u0010\u0018¨\u00061"}, m65681d2 = {"Lcom/amplitude/android/engagement/types/SurveyResponseSelect;", "Llj/e0;", "", "blockId", "", "value", "stringResponse", "otherText", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "seen1", "type", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self", "(Lcom/amplitude/android/engagement/types/SurveyResponseSelect;Lzc3/c;Lyc3/g;)V", "toJSONString", "()Ljava/lang/String;", "component1", "component2", "()I", "component3", "component4", "copy", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)Lcom/amplitude/android/engagement/types/SurveyResponseSelect;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getBlockId", "I", "getValue", "getStringResponse", "getOtherText", "getType", "Companion", "$serializer", "com/amplitude/android/engagement/types/s1", "engagement_release"}, m65682k = 1, m65683mv = {1, 8, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class SurveyResponseSelect extends AbstractC24425e0 {
    public static final int $stable = 0;
    public static final C4933s1 Companion = new C4933s1();
    private final String blockId;
    private final String otherText;
    private final String stringResponse;
    private final String type;
    private final int value;

    public SurveyResponseSelect(String blockId, int i13, String stringResponse, String str) {
        AbstractC22676k.m65750j(blockId, "blockId");
        AbstractC22676k.m65750j(stringResponse, "stringResponse");
        this.blockId = blockId;
        this.value = i13;
        this.stringResponse = stringResponse;
        this.otherText = str;
        this.type = "string";
    }

    public static /* synthetic */ SurveyResponseSelect copy$default(SurveyResponseSelect surveyResponseSelect, String str, int i13, String str2, String str3, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            str = surveyResponseSelect.blockId;
        }
        if ((i14 & 2) != 0) {
            i13 = surveyResponseSelect.value;
        }
        if ((i14 & 4) != 0) {
            str2 = surveyResponseSelect.stringResponse;
        }
        if ((i14 & 8) != 0) {
            str3 = surveyResponseSelect.otherText;
        }
        return surveyResponseSelect.copy(str, i13, str2, str3);
    }

    public static final /* synthetic */ void write$Self(SurveyResponseSelect self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.getBlockId());
        output.encodeIntElement(serialDesc, 1, self.value);
        output.encodeStringElement(serialDesc, 2, self.stringResponse);
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.otherText != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.otherText);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 4) && AbstractC22676k.m65745e(self.getType(), "string")) {
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
    public final String getStringResponse() {
        return this.stringResponse;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getOtherText() {
        return this.otherText;
    }

    public final SurveyResponseSelect copy(String blockId, int value, String stringResponse, String otherText) {
        AbstractC22676k.m65750j(blockId, "blockId");
        AbstractC22676k.m65750j(stringResponse, "stringResponse");
        return new SurveyResponseSelect(blockId, value, stringResponse, otherText);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SurveyResponseSelect)) {
            return false;
        }
        SurveyResponseSelect surveyResponseSelect = (SurveyResponseSelect) other;
        return AbstractC22676k.m65745e(this.blockId, surveyResponseSelect.blockId) && this.value == surveyResponseSelect.value && AbstractC22676k.m65745e(this.stringResponse, surveyResponseSelect.stringResponse) && AbstractC22676k.m65745e(this.otherText, surveyResponseSelect.otherText);
    }

    @Override // p305lj.AbstractC24425e0
    public String getBlockId() {
        return this.blockId;
    }

    public final String getOtherText() {
        return this.otherText;
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
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30448b(this.value, this.blockId.hashCode() * 31, 31), 31, this.stringResponse);
        String str = this.otherText;
        return iM30450d + (str == null ? 0 : str.hashCode());
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
        StringBuilder sb4 = new StringBuilder("SurveyResponseSelect(blockId=");
        sb4.append(this.blockId);
        sb4.append(", value=");
        sb4.append(this.value);
        sb4.append(", stringResponse=");
        sb4.append(this.stringResponse);
        sb4.append(", otherText=");
        return AbstractC25012a.m73377j(sb4, this.otherText, ')');
    }

    @InterfaceC23457c
    public SurveyResponseSelect(int i13, String str, int i14, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i13 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 7, SurveyResponseSelect$$serializer.INSTANCE.getDescriptor());
        }
        this.blockId = str;
        this.value = i14;
        this.stringResponse = str2;
        if ((i13 & 8) == 0) {
            this.otherText = null;
        } else {
            this.otherText = str3;
        }
        if ((i13 & 16) == 0) {
            this.type = "string";
        } else {
            this.type = str4;
        }
    }

    public /* synthetic */ SurveyResponseSelect(String str, int i13, String str2, String str3, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i13, str2, (i14 & 8) != 0 ? null : str3);
    }
}
