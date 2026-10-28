package com.whoop.data.remote.domain.dto;

import com.google.gson.annotations.SerializedName;
import com.whoop.data.remote.domain.response.journal.JournalMagnitude;
import com.whoop.data.remote.domain.response.journal.JournalMagnitudeValue;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.FloatSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m83.AbstractC25265s;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import vs2.C36478d;
import vw0.C36541a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import xb3.AbstractC38176k;
import y00.AbstractC38963t7;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0087\b\u0018\u0000 E2\u00020\u0001:\u0002FEB]\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000e\u0010\u000fBq\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0014J\r\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0019J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001bJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001bJ\u0018\u0010 \u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\"\u0010\u001bJv\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b%\u0010\u001bJ\u0010\u0010&\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b*\u0010+J'\u00104\u001a\u0002012\u0006\u0010,\u001a\u00020\u00002\u0006\u0010.\u001a\u00020-2\u0006\u00100\u001a\u00020/H\u0001¢\u0006\u0004\b2\u00103R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u00105\u0012\u0004\b7\u00108\u001a\u0004\b6\u0010\u0019R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00109\u001a\u0004\b:\u0010\u001bR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u00105\u0012\u0004\b<\u00108\u001a\u0004\b;\u0010\u0019R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00105\u0012\u0004\b>\u00108\u001a\u0004\b=\u0010\u0019R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00109\u001a\u0004\b?\u0010\u001bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00109\u001a\u0004\b@\u0010\u001bR\"\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010A\u001a\u0004\bB\u0010!R\"\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u00109\u0012\u0004\bD\u00108\u001a\u0004\bC\u0010\u001b¨\u0006G"}, m65681d2 = {"Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;", "", "", "intervalSize", "", "label", "maxInclusive", "minInclusive", "type", "units", "", "Lcom/whoop/data/remote/domain/dto/JournalMagnitudeValueDto;", "choices", "questionType", "<init>", "(Ljava/lang/Float;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/Float;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Lcom/whoop/data/remote/domain/response/journal/JournalMagnitude;", "toJournalMagnitude", "()Lcom/whoop/data/remote/domain/response/journal/JournalMagnitude;", "component1", "()Ljava/lang/Float;", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "component6", "component7", "()Ljava/util/List;", "component8", "copy", "(Ljava/lang/Float;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$core_release", "(Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/Float;", "getIntervalSize", "getIntervalSize$annotations", "()V", "Ljava/lang/String;", "getLabel", "getMaxInclusive", "getMaxInclusive$annotations", "getMinInclusive", "getMinInclusive$annotations", "getType", "getUnits", "Ljava/util/List;", "getChoices", "getQuestionType", "getQuestionType$annotations", "Companion", "$serializer", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class JournalMagnitudeDto {

    @SerializedName("choices")
    private final List<JournalMagnitudeValueDto> choices;

    @SerializedName("interval")
    private final Float intervalSize;

    @SerializedName("label")
    private final String label;

    @SerializedName("maximum_inclusive")
    private final Float maxInclusive;

    @SerializedName("minimum_inclusive")
    private final Float minInclusive;

    @SerializedName("question_type")
    private final String questionType;

    @SerializedName("type")
    private final String type;

    @SerializedName("units")
    private final String units;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C36541a(4)), null};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;", "serializer", "()Lwc3/c;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return JournalMagnitudeDto$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ JournalMagnitudeDto(int i13, Float f13, String str, Float f14, Float f15, String str2, String str3, List list, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (255 != (i13 & 255)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 255, JournalMagnitudeDto$$serializer.INSTANCE.getDescriptor());
        }
        this.intervalSize = f13;
        this.label = str;
        this.maxInclusive = f14;
        this.minInclusive = f15;
        this.type = str2;
        this.units = str3;
        this.choices = list;
        this.questionType = str4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(JournalMagnitudeValueDto$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ JournalMagnitudeDto copy$default(JournalMagnitudeDto journalMagnitudeDto, Float f13, String str, Float f14, Float f15, String str2, String str3, List list, String str4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            f13 = journalMagnitudeDto.intervalSize;
        }
        if ((i13 & 2) != 0) {
            str = journalMagnitudeDto.label;
        }
        if ((i13 & 4) != 0) {
            f14 = journalMagnitudeDto.maxInclusive;
        }
        if ((i13 & 8) != 0) {
            f15 = journalMagnitudeDto.minInclusive;
        }
        if ((i13 & 16) != 0) {
            str2 = journalMagnitudeDto.type;
        }
        if ((i13 & 32) != 0) {
            str3 = journalMagnitudeDto.units;
        }
        if ((i13 & 64) != 0) {
            list = journalMagnitudeDto.choices;
        }
        if ((i13 & 128) != 0) {
            str4 = journalMagnitudeDto.questionType;
        }
        List list2 = list;
        String str5 = str4;
        String str6 = str2;
        String str7 = str3;
        return journalMagnitudeDto.copy(f13, str, f14, f15, str6, str7, list2, str5);
    }

    @InterfaceC37143h("interval")
    public static /* synthetic */ void getIntervalSize$annotations() {
    }

    @InterfaceC37143h("maximum_inclusive")
    public static /* synthetic */ void getMaxInclusive$annotations() {
    }

    @InterfaceC37143h("minimum_inclusive")
    public static /* synthetic */ void getMinInclusive$annotations() {
    }

    @InterfaceC37143h("question_type")
    public static /* synthetic */ void getQuestionType$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final JournalMagnitudeValue toJournalMagnitude$lambda$0(JournalMagnitudeValueDto magnitudeValueDto) {
        AbstractC22676k.m65750j(magnitudeValueDto, "magnitudeValueDto");
        return magnitudeValueDto.toJournalMagnitudeValue();
    }

    public static final /* synthetic */ void write$Self$core_release(JournalMagnitudeDto self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 0, floatSerializer, self.intervalSize);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 1, stringSerializer, self.label);
        output.encodeNullableSerializableElement(serialDesc, 2, floatSerializer, self.maxInclusive);
        output.encodeNullableSerializableElement(serialDesc, 3, floatSerializer, self.minInclusive);
        output.encodeNullableSerializableElement(serialDesc, 4, stringSerializer, self.type);
        output.encodeNullableSerializableElement(serialDesc, 5, stringSerializer, self.units);
        output.encodeNullableSerializableElement(serialDesc, 6, (InterfaceC37145j) interfaceC23462hArr[6].getValue(), self.choices);
        output.encodeNullableSerializableElement(serialDesc, 7, stringSerializer, self.questionType);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Float getIntervalSize() {
        return this.intervalSize;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Float getMaxInclusive() {
        return this.maxInclusive;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Float getMinInclusive() {
        return this.minInclusive;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getUnits() {
        return this.units;
    }

    public final List<JournalMagnitudeValueDto> component7() {
        return this.choices;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getQuestionType() {
        return this.questionType;
    }

    public final JournalMagnitudeDto copy(Float intervalSize, String label, Float maxInclusive, Float minInclusive, String type, String units, List<JournalMagnitudeValueDto> choices, String questionType) {
        return new JournalMagnitudeDto(intervalSize, label, maxInclusive, minInclusive, type, units, choices, questionType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof JournalMagnitudeDto)) {
            return false;
        }
        JournalMagnitudeDto journalMagnitudeDto = (JournalMagnitudeDto) other;
        return AbstractC22676k.m65745e(this.intervalSize, journalMagnitudeDto.intervalSize) && AbstractC22676k.m65745e(this.label, journalMagnitudeDto.label) && AbstractC22676k.m65745e(this.maxInclusive, journalMagnitudeDto.maxInclusive) && AbstractC22676k.m65745e(this.minInclusive, journalMagnitudeDto.minInclusive) && AbstractC22676k.m65745e(this.type, journalMagnitudeDto.type) && AbstractC22676k.m65745e(this.units, journalMagnitudeDto.units) && AbstractC22676k.m65745e(this.choices, journalMagnitudeDto.choices) && AbstractC22676k.m65745e(this.questionType, journalMagnitudeDto.questionType);
    }

    public final List<JournalMagnitudeValueDto> getChoices() {
        return this.choices;
    }

    public final Float getIntervalSize() {
        return this.intervalSize;
    }

    public final String getLabel() {
        return this.label;
    }

    public final Float getMaxInclusive() {
        return this.maxInclusive;
    }

    public final Float getMinInclusive() {
        return this.minInclusive;
    }

    public final String getQuestionType() {
        return this.questionType;
    }

    public final String getType() {
        return this.type;
    }

    public final String getUnits() {
        return this.units;
    }

    public int hashCode() {
        Float f13 = this.intervalSize;
        int iHashCode = (f13 == null ? 0 : f13.hashCode()) * 31;
        String str = this.label;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Float f14 = this.maxInclusive;
        int iHashCode3 = (iHashCode2 + (f14 == null ? 0 : f14.hashCode())) * 31;
        Float f15 = this.minInclusive;
        int iHashCode4 = (iHashCode3 + (f15 == null ? 0 : f15.hashCode())) * 31;
        String str2 = this.type;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.units;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<JournalMagnitudeValueDto> list = this.choices;
        int iHashCode7 = (iHashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        String str4 = this.questionType;
        return iHashCode7 + (str4 != null ? str4.hashCode() : 0);
    }

    public final JournalMagnitude toJournalMagnitude() {
        Float f13 = this.intervalSize;
        String str = this.label;
        AbstractC22676k.m65747g(str);
        Float f14 = this.maxInclusive;
        Float f15 = this.minInclusive;
        String str2 = this.type;
        AbstractC22676k.m65747g(str2);
        String str3 = this.units;
        List<JournalMagnitudeValueDto> list = this.choices;
        return new JournalMagnitude(f13, str, f14, f15, str2, str3, list != null ? AbstractC38176k.m122276E(AbstractC38176k.m122272A(AbstractC25265s.m74145r0(list), new C36478d(7))) : null, JournalResponseDtoKt.convertToQuestionTypeEnum(this.questionType));
    }

    public String toString() {
        Float f13 = this.intervalSize;
        String str = this.label;
        Float f14 = this.maxInclusive;
        Float f15 = this.minInclusive;
        String str2 = this.type;
        String str3 = this.units;
        List<JournalMagnitudeValueDto> list = this.choices;
        String str4 = this.questionType;
        StringBuilder sb4 = new StringBuilder("JournalMagnitudeDto(intervalSize=");
        sb4.append(f13);
        sb4.append(", label=");
        sb4.append(str);
        sb4.append(", maxInclusive=");
        sb4.append(f14);
        sb4.append(", minInclusive=");
        sb4.append(f15);
        sb4.append(", type=");
        AbstractC11266d.m30444B(sb4, str2, ", units=", str3, ", choices=");
        return AbstractC38963t7.m124377g(", questionType=", str4, ")", sb4, list);
    }

    public JournalMagnitudeDto(Float f13, String str, Float f14, Float f15, String str2, String str3, List<JournalMagnitudeValueDto> list, String str4) {
        this.intervalSize = f13;
        this.label = str;
        this.maxInclusive = f14;
        this.minInclusive = f15;
        this.type = str2;
        this.units = str3;
        this.choices = list;
        this.questionType = str4;
    }
}
