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
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+,B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007BC\b\u0017\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0006\u0010\rJ(\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011HÇ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0011\u0010\u0016\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0017J.\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0017J\u0010\u0010\u001e\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b#\u0010$R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b'\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b(\u0010\u0017R\u001a\u0010\n\u001a\u00020\u00028\u0016X\u0096D¢\u0006\f\n\u0004\b\n\u0010%\u001a\u0004\b)\u0010\u0017¨\u0006-"}, m65681d2 = {"Lcom/amplitude/android/engagement/types/SurveyResponseText;", "Llj/e0;", "", "blockId", "value", "stringResponse", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen1", "type", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self", "(Lcom/amplitude/android/engagement/types/SurveyResponseText;Lzc3/c;Lyc3/g;)V", "toJSONString", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/amplitude/android/engagement/types/SurveyResponseText;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getBlockId", "getValue", "getStringResponse", "getType", "Companion", "$serializer", "com/amplitude/android/engagement/types/t1", "engagement_release"}, m65682k = 1, m65683mv = {1, 8, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class SurveyResponseText extends AbstractC24425e0 {
    public static final int $stable = 0;
    public static final C4936t1 Companion = new C4936t1();
    private final String blockId;
    private final String stringResponse;
    private final String type;
    private final String value;

    public SurveyResponseText(String blockId, String value, String stringResponse) {
        AbstractC22676k.m65750j(blockId, "blockId");
        AbstractC22676k.m65750j(value, "value");
        AbstractC22676k.m65750j(stringResponse, "stringResponse");
        this.blockId = blockId;
        this.value = value;
        this.stringResponse = stringResponse;
        this.type = "string";
    }

    public static /* synthetic */ SurveyResponseText copy$default(SurveyResponseText surveyResponseText, String str, String str2, String str3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = surveyResponseText.blockId;
        }
        if ((i13 & 2) != 0) {
            str2 = surveyResponseText.value;
        }
        if ((i13 & 4) != 0) {
            str3 = surveyResponseText.stringResponse;
        }
        return surveyResponseText.copy(str, str2, str3);
    }

    public static final /* synthetic */ void write$Self(SurveyResponseText self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.getBlockId());
        output.encodeStringElement(serialDesc, 1, self.value);
        output.encodeStringElement(serialDesc, 2, self.stringResponse);
        if (!output.shouldEncodeElementDefault(serialDesc, 3) && AbstractC22676k.m65745e(self.getType(), "string")) {
            return;
        }
        output.encodeStringElement(serialDesc, 3, self.getType());
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBlockId() {
        return this.blockId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getStringResponse() {
        return this.stringResponse;
    }

    public final SurveyResponseText copy(String blockId, String value, String stringResponse) {
        AbstractC22676k.m65750j(blockId, "blockId");
        AbstractC22676k.m65750j(value, "value");
        AbstractC22676k.m65750j(stringResponse, "stringResponse");
        return new SurveyResponseText(blockId, value, stringResponse);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SurveyResponseText)) {
            return false;
        }
        SurveyResponseText surveyResponseText = (SurveyResponseText) other;
        return AbstractC22676k.m65745e(this.blockId, surveyResponseText.blockId) && AbstractC22676k.m65745e(this.value, surveyResponseText.value) && AbstractC22676k.m65745e(this.stringResponse, surveyResponseText.stringResponse);
    }

    @Override // p305lj.AbstractC24425e0
    public String getBlockId() {
        return this.blockId;
    }

    public final String getStringResponse() {
        return this.stringResponse;
    }

    public String getType() {
        return this.type;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.stringResponse.hashCode() + AbstractC11266d.m30450d(this.blockId.hashCode() * 31, 31, this.value);
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
        StringBuilder sb4 = new StringBuilder("SurveyResponseText(blockId=");
        sb4.append(this.blockId);
        sb4.append(", value=");
        sb4.append(this.value);
        sb4.append(", stringResponse=");
        return AbstractC25012a.m73377j(sb4, this.stringResponse, ')');
    }

    @InterfaceC23457c
    public SurveyResponseText(int i13, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i13 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 7, SurveyResponseText$$serializer.INSTANCE.getDescriptor());
        }
        this.blockId = str;
        this.value = str2;
        this.stringResponse = str3;
        if ((i13 & 8) == 0) {
            this.type = "string";
        } else {
            this.type = str4;
        }
    }
}
