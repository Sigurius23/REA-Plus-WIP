package com.amplitude.android.engagement.types;

import ad3.C0775r;
import com.amplitude.android.engagement.C4861a;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.InterfaceC23457c;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p305lj.AbstractC24425e0;
import p319m4.AbstractC25012a;
import p585wj.AbstractC37316b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000212B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nBY\b\u0017\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ(\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013HÇ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0011\u0010\u0018\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0019JF\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\u0019J\u0010\u0010\"\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b'\u0010(R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u0019R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010+\u001a\u0004\b,\u0010\u001cR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b-\u0010\u001cR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b.\u0010\u0019R\u001a\u0010\f\u001a\u00020\u00028\u0016X\u0096D¢\u0006\f\n\u0004\b\f\u0010)\u001a\u0004\b/\u0010\u0019¨\u00063"}, m65681d2 = {"Lcom/amplitude/android/engagement/types/SurveyResponseMultiSelect;", "Llj/e0;", "", "blockId", "", "", "value", "stringResponse", "otherText", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V", "seen1", "type", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self", "(Lcom/amplitude/android/engagement/types/SurveyResponseMultiSelect;Lzc3/c;Lyc3/g;)V", "toJSONString", "()Ljava/lang/String;", "component1", "component2", "()Ljava/util/List;", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)Lcom/amplitude/android/engagement/types/SurveyResponseMultiSelect;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getBlockId", "Ljava/util/List;", "getValue", "getStringResponse", "getOtherText", "getType", "Companion", "$serializer", "com/amplitude/android/engagement/types/p1", "engagement_release"}, m65682k = 1, m65683mv = {1, 8, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class SurveyResponseMultiSelect extends AbstractC24425e0 {
    public static final int $stable = 8;
    private final String blockId;
    private final String otherText;
    private final List<String> stringResponse;
    private final String type;
    private final List<Integer> value;
    public static final C4924p1 Companion = new C4924p1();
    private static final InterfaceC37138c[] $childSerializers = {null, new ArrayListSerializer(IntSerializer.INSTANCE), new ArrayListSerializer(StringSerializer.INSTANCE), null, null};

    public SurveyResponseMultiSelect(String blockId, List<Integer> value, List<String> stringResponse, String str) {
        AbstractC22676k.m65750j(blockId, "blockId");
        AbstractC22676k.m65750j(value, "value");
        AbstractC22676k.m65750j(stringResponse, "stringResponse");
        this.blockId = blockId;
        this.value = value;
        this.stringResponse = stringResponse;
        this.otherText = str;
        this.type = "string";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SurveyResponseMultiSelect copy$default(SurveyResponseMultiSelect surveyResponseMultiSelect, String str, List list, List list2, String str2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = surveyResponseMultiSelect.blockId;
        }
        if ((i13 & 2) != 0) {
            list = surveyResponseMultiSelect.value;
        }
        if ((i13 & 4) != 0) {
            list2 = surveyResponseMultiSelect.stringResponse;
        }
        if ((i13 & 8) != 0) {
            str2 = surveyResponseMultiSelect.otherText;
        }
        return surveyResponseMultiSelect.copy(str, list, list2, str2);
    }

    public static final /* synthetic */ void write$Self(SurveyResponseMultiSelect self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC37138c[] interfaceC37138cArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.getBlockId());
        output.encodeSerializableElement(serialDesc, 1, interfaceC37138cArr[1], self.value);
        output.encodeSerializableElement(serialDesc, 2, interfaceC37138cArr[2], self.stringResponse);
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

    public final List<Integer> component2() {
        return this.value;
    }

    public final List<String> component3() {
        return this.stringResponse;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getOtherText() {
        return this.otherText;
    }

    public final SurveyResponseMultiSelect copy(String blockId, List<Integer> value, List<String> stringResponse, String otherText) {
        AbstractC22676k.m65750j(blockId, "blockId");
        AbstractC22676k.m65750j(value, "value");
        AbstractC22676k.m65750j(stringResponse, "stringResponse");
        return new SurveyResponseMultiSelect(blockId, value, stringResponse, otherText);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SurveyResponseMultiSelect)) {
            return false;
        }
        SurveyResponseMultiSelect surveyResponseMultiSelect = (SurveyResponseMultiSelect) other;
        return AbstractC22676k.m65745e(this.blockId, surveyResponseMultiSelect.blockId) && AbstractC22676k.m65745e(this.value, surveyResponseMultiSelect.value) && AbstractC22676k.m65745e(this.stringResponse, surveyResponseMultiSelect.stringResponse) && AbstractC22676k.m65745e(this.otherText, surveyResponseMultiSelect.otherText);
    }

    @Override // p305lj.AbstractC24425e0
    public String getBlockId() {
        return this.blockId;
    }

    public final String getOtherText() {
        return this.otherText;
    }

    public final List<String> getStringResponse() {
        return this.stringResponse;
    }

    public String getType() {
        return this.type;
    }

    public final List<Integer> getValue() {
        return this.value;
    }

    public int hashCode() {
        int iM31983b = AbstractC11895b.m31983b(AbstractC11895b.m31983b(this.blockId.hashCode() * 31, 31, this.value), 31, this.stringResponse);
        String str = this.otherText;
        return iM31983b + (str == null ? 0 : str.hashCode());
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
        StringBuilder sb4 = new StringBuilder("SurveyResponseMultiSelect(blockId=");
        sb4.append(this.blockId);
        sb4.append(", value=");
        sb4.append(this.value);
        sb4.append(", stringResponse=");
        sb4.append(this.stringResponse);
        sb4.append(", otherText=");
        return AbstractC25012a.m73377j(sb4, this.otherText, ')');
    }

    @InterfaceC23457c
    public SurveyResponseMultiSelect(int i13, String str, List list, List list2, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i13 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 7, SurveyResponseMultiSelect$$serializer.INSTANCE.getDescriptor());
        }
        this.blockId = str;
        this.value = list;
        this.stringResponse = list2;
        if ((i13 & 8) == 0) {
            this.otherText = null;
        } else {
            this.otherText = str2;
        }
        if ((i13 & 16) == 0) {
            this.type = "string";
        } else {
            this.type = str3;
        }
    }

    public /* synthetic */ SurveyResponseMultiSelect(String str, List list, List list2, String str2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, list2, (i13 & 8) != 0 ? null : str2);
    }
}
