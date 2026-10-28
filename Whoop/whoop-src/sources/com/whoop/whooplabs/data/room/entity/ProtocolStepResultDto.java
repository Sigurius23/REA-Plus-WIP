package com.whoop.whooplabs.data.room.entity;

import androidx.core.app.FrameMetricsAggregator;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import com.whoop.whooplabs.data.domain.ProtocolStepResultWithStepType;
import java.util.Date;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.joda.time.DateTime;
import p127ev.AbstractC13673n;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import u82.C34641b;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0087\b\u0018\u0000 I2\u00020\u0001:\u0002IJB_\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000f\u0010\u0010Bs\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000f\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b!\u0010\u0018J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\"\u0010\u0018Jz\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b%\u0010\u001fJ\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010\u0016J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*J'\u00103\u001a\u0002002\u0006\u0010+\u001a\u00020\u00002\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.H\u0001¢\u0006\u0004\b1\u00102R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00104\u001a\u0004\b5\u0010\u0016R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u00106\u0012\u0004\b8\u00109\u001a\u0004\b7\u0010\u0018R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u00106\u0012\u0004\b;\u00109\u001a\u0004\b:\u0010\u0018R\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010<\u0012\u0004\b>\u00109\u001a\u0004\b=\u0010\u001bR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010?\u001a\u0004\b@\u0010\u001dR\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010A\u0012\u0004\bC\u00109\u001a\u0004\bB\u0010\u001fR\u0019\u0010\f\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\f\u0010A\u001a\u0004\bD\u0010\u001fR\"\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u00106\u0012\u0004\bF\u00109\u001a\u0004\bE\u0010\u0018R\"\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u00106\u0012\u0004\bH\u00109\u001a\u0004\bG\u0010\u0018¨\u0006K"}, m65681d2 = {"Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResultDto;", "", "", "id", "Ljava/util/Date;", "startTimestamp", "endTimestamp", "Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReadingDto;", "mysticReading", "numberInput", "", "textOption", "textInput", "timestampInput", "dateTimeStampInput", "<init>", "(ILjava/util/Date;Ljava/util/Date;Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReadingDto;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IILjava/util/Date;Ljava/util/Date;Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReadingDto;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()I", "component2", "()Ljava/util/Date;", "component3", "component4", "()Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReadingDto;", "component5", "()Ljava/lang/Integer;", "component6", "()Ljava/lang/String;", "component7", "component8", "component9", "copy", "(ILjava/util/Date;Ljava/util/Date;Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReadingDto;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;)Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResultDto;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$whooplabs_release", "(Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResultDto;Lzc3/c;Lyc3/g;)V", "write$Self", "I", "getId", "Ljava/util/Date;", "getStartTimestamp", "getStartTimestamp$annotations", "()V", "getEndTimestamp", "getEndTimestamp$annotations", "Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReadingDto;", "getMysticReading", "getMysticReading$annotations", "Ljava/lang/Integer;", "getNumberInput", "Ljava/lang/String;", "getTextOption", "getTextOption$annotations", "getTextInput", "getTimestampInput", "getTimestampInput$annotations", "getDateTimeStampInput", "getDateTimeStampInput$annotations", "Companion", "$serializer", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ProtocolStepResultDto {
    private final Date dateTimeStampInput;
    private final Date endTimestamp;
    private final int id;
    private final ProtocolStepMysticReadingDto mysticReading;
    private final Integer numberInput;
    private final Date startTimestamp;
    private final String textInput;
    private final String textOption;
    private final Date timestampInput;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m65681d2 = {"Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResultDto$Companion;", "", "<init>", "()V", "Lcom/whoop/whooplabs/data/domain/ProtocolStepResultWithStepType;", "stepResult", "Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResultDto;", "fromProtocolStepResult", "(Lcom/whoop/whooplabs/data/domain/ProtocolStepResultWithStepType;)Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResultDto;", "Lwc3/c;", "serializer", "()Lwc3/c;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ProtocolStepResultDto fromProtocolStepResult(ProtocolStepResultWithStepType stepResult) {
            Date date;
            Date date2;
            DateTime timestampInput;
            DateTime timestampInput2;
            AbstractC22676k.m65750j(stepResult, "stepResult");
            ProtocolStepResult protocolStepResult = stepResult.getProtocolStepResult();
            int resultId = protocolStepResult.getResultId();
            DateTime startTimestamp = protocolStepResult.getStartTimestamp();
            Date date3 = startTimestamp != null ? startTimestamp.toDate() : null;
            DateTime endTimestamp = protocolStepResult.getEndTimestamp();
            Date date4 = endTimestamp != null ? endTimestamp.toDate() : null;
            ProtocolStepMysticReadingDto protocolStepMysticReadingDtoFromMysticReading = ProtocolStepMysticReadingDto.INSTANCE.fromMysticReading(protocolStepResult.getMysticReading());
            Date date5 = date4;
            Integer numberInput = protocolStepResult.getNumberInput();
            String textOption = protocolStepResult.getTextOption();
            String textInput = protocolStepResult.getTextInput();
            Date date6 = (!stepResult.isTimePickerStep() || (timestampInput2 = protocolStepResult.getTimestampInput()) == null) ? null : timestampInput2.toDate();
            if (!stepResult.isDateTimePickerStep() || (timestampInput = protocolStepResult.getTimestampInput()) == null) {
                Date date7 = date6;
                date = null;
                date2 = date7;
            } else {
                date2 = date6;
                date = timestampInput.toDate();
            }
            return new ProtocolStepResultDto(resultId, date3, date5, protocolStepMysticReadingDtoFromMysticReading, numberInput, textOption, textInput, date2, date);
        }

        public final InterfaceC37138c serializer() {
            return ProtocolStepResultDto$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ProtocolStepResultDto(int i13, int i14, Date date, Date date2, ProtocolStepMysticReadingDto protocolStepMysticReadingDto, Integer num, String str, String str2, Date date3, Date date4, SerializationConstructorMarker serializationConstructorMarker) {
        if (511 != (i13 & FrameMetricsAggregator.EVERY_DURATION)) {
            PluginExceptionsKt.throwMissingFieldException(i13, FrameMetricsAggregator.EVERY_DURATION, ProtocolStepResultDto$$serializer.INSTANCE.getDescriptor());
        }
        this.id = i14;
        this.startTimestamp = date;
        this.endTimestamp = date2;
        this.mysticReading = protocolStepMysticReadingDto;
        this.numberInput = num;
        this.textOption = str;
        this.textInput = str2;
        this.timestampInput = date3;
        this.dateTimeStampInput = date4;
    }

    public static /* synthetic */ ProtocolStepResultDto copy$default(ProtocolStepResultDto protocolStepResultDto, int i13, Date date, Date date2, ProtocolStepMysticReadingDto protocolStepMysticReadingDto, Integer num, String str, String str2, Date date3, Date date4, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i13 = protocolStepResultDto.id;
        }
        if ((i14 & 2) != 0) {
            date = protocolStepResultDto.startTimestamp;
        }
        if ((i14 & 4) != 0) {
            date2 = protocolStepResultDto.endTimestamp;
        }
        if ((i14 & 8) != 0) {
            protocolStepMysticReadingDto = protocolStepResultDto.mysticReading;
        }
        if ((i14 & 16) != 0) {
            num = protocolStepResultDto.numberInput;
        }
        if ((i14 & 32) != 0) {
            str = protocolStepResultDto.textOption;
        }
        if ((i14 & 64) != 0) {
            str2 = protocolStepResultDto.textInput;
        }
        if ((i14 & 128) != 0) {
            date3 = protocolStepResultDto.timestampInput;
        }
        if ((i14 & 256) != 0) {
            date4 = protocolStepResultDto.dateTimeStampInput;
        }
        Date date5 = date3;
        Date date6 = date4;
        String str3 = str;
        String str4 = str2;
        Integer num2 = num;
        Date date7 = date2;
        return protocolStepResultDto.copy(i13, date, date7, protocolStepMysticReadingDto, num2, str3, str4, date5, date6);
    }

    @InterfaceC37143h("datetime_picker")
    @InterfaceC37144i(with = C34641b.class)
    public static /* synthetic */ void getDateTimeStampInput$annotations() {
    }

    @InterfaceC37143h("end_timestamp")
    @InterfaceC37144i(with = C34641b.class)
    public static /* synthetic */ void getEndTimestamp$annotations() {
    }

    @InterfaceC37143h("mystic_readings")
    public static /* synthetic */ void getMysticReading$annotations() {
    }

    @InterfaceC37143h("start_timestamp")
    @InterfaceC37144i(with = C34641b.class)
    public static /* synthetic */ void getStartTimestamp$annotations() {
    }

    @InterfaceC37143h("text_selection")
    public static /* synthetic */ void getTextOption$annotations() {
    }

    @InterfaceC37143h("time_picker")
    @InterfaceC37144i(with = C34641b.class)
    public static /* synthetic */ void getTimestampInput$annotations() {
    }

    public static final /* synthetic */ void write$Self$whooplabs_release(ProtocolStepResultDto self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeIntElement(serialDesc, 0, self.id);
        C34641b c34641b = C34641b.f145940a;
        output.encodeNullableSerializableElement(serialDesc, 1, c34641b, self.startTimestamp);
        output.encodeNullableSerializableElement(serialDesc, 2, c34641b, self.endTimestamp);
        output.encodeNullableSerializableElement(serialDesc, 3, ProtocolStepMysticReadingDto$$serializer.INSTANCE, self.mysticReading);
        output.encodeNullableSerializableElement(serialDesc, 4, IntSerializer.INSTANCE, self.numberInput);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 5, stringSerializer, self.textOption);
        output.encodeNullableSerializableElement(serialDesc, 6, stringSerializer, self.textInput);
        output.encodeNullableSerializableElement(serialDesc, 7, c34641b, self.timestampInput);
        output.encodeNullableSerializableElement(serialDesc, 8, c34641b, self.dateTimeStampInput);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Date getStartTimestamp() {
        return this.startTimestamp;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Date getEndTimestamp() {
        return this.endTimestamp;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final ProtocolStepMysticReadingDto getMysticReading() {
        return this.mysticReading;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getNumberInput() {
        return this.numberInput;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getTextOption() {
        return this.textOption;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getTextInput() {
        return this.textInput;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Date getTimestampInput() {
        return this.timestampInput;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Date getDateTimeStampInput() {
        return this.dateTimeStampInput;
    }

    public final ProtocolStepResultDto copy(int id4, Date startTimestamp, Date endTimestamp, ProtocolStepMysticReadingDto mysticReading, Integer numberInput, String textOption, String textInput, Date timestampInput, Date dateTimeStampInput) {
        return new ProtocolStepResultDto(id4, startTimestamp, endTimestamp, mysticReading, numberInput, textOption, textInput, timestampInput, dateTimeStampInput);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProtocolStepResultDto)) {
            return false;
        }
        ProtocolStepResultDto protocolStepResultDto = (ProtocolStepResultDto) other;
        return this.id == protocolStepResultDto.id && AbstractC22676k.m65745e(this.startTimestamp, protocolStepResultDto.startTimestamp) && AbstractC22676k.m65745e(this.endTimestamp, protocolStepResultDto.endTimestamp) && AbstractC22676k.m65745e(this.mysticReading, protocolStepResultDto.mysticReading) && AbstractC22676k.m65745e(this.numberInput, protocolStepResultDto.numberInput) && AbstractC22676k.m65745e(this.textOption, protocolStepResultDto.textOption) && AbstractC22676k.m65745e(this.textInput, protocolStepResultDto.textInput) && AbstractC22676k.m65745e(this.timestampInput, protocolStepResultDto.timestampInput) && AbstractC22676k.m65745e(this.dateTimeStampInput, protocolStepResultDto.dateTimeStampInput);
    }

    public final Date getDateTimeStampInput() {
        return this.dateTimeStampInput;
    }

    public final Date getEndTimestamp() {
        return this.endTimestamp;
    }

    public final int getId() {
        return this.id;
    }

    public final ProtocolStepMysticReadingDto getMysticReading() {
        return this.mysticReading;
    }

    public final Integer getNumberInput() {
        return this.numberInput;
    }

    public final Date getStartTimestamp() {
        return this.startTimestamp;
    }

    public final String getTextInput() {
        return this.textInput;
    }

    public final String getTextOption() {
        return this.textOption;
    }

    public final Date getTimestampInput() {
        return this.timestampInput;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.id) * 31;
        Date date = this.startTimestamp;
        int iHashCode2 = (iHashCode + (date == null ? 0 : date.hashCode())) * 31;
        Date date2 = this.endTimestamp;
        int iHashCode3 = (iHashCode2 + (date2 == null ? 0 : date2.hashCode())) * 31;
        ProtocolStepMysticReadingDto protocolStepMysticReadingDto = this.mysticReading;
        int iHashCode4 = (iHashCode3 + (protocolStepMysticReadingDto == null ? 0 : protocolStepMysticReadingDto.hashCode())) * 31;
        Integer num = this.numberInput;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.textOption;
        int iHashCode6 = (iHashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.textInput;
        int iHashCode7 = (iHashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Date date3 = this.timestampInput;
        int iHashCode8 = (iHashCode7 + (date3 == null ? 0 : date3.hashCode())) * 31;
        Date date4 = this.dateTimeStampInput;
        return iHashCode8 + (date4 != null ? date4.hashCode() : 0);
    }

    public String toString() {
        int i13 = this.id;
        Date date = this.startTimestamp;
        Date date2 = this.endTimestamp;
        ProtocolStepMysticReadingDto protocolStepMysticReadingDto = this.mysticReading;
        Integer num = this.numberInput;
        String str = this.textOption;
        String str2 = this.textInput;
        Date date3 = this.timestampInput;
        Date date4 = this.dateTimeStampInput;
        StringBuilder sb4 = new StringBuilder("ProtocolStepResultDto(id=");
        sb4.append(i13);
        sb4.append(", startTimestamp=");
        sb4.append(date);
        sb4.append(", endTimestamp=");
        sb4.append(date2);
        sb4.append(", mysticReading=");
        sb4.append(protocolStepMysticReadingDto);
        sb4.append(", numberInput=");
        AbstractC13673n.m38577x(num, ", textOption=", str, ", textInput=", sb4);
        AbstractC13673n.m38579z(sb4, str2, ", timestampInput=", date3, ", dateTimeStampInput=");
        return AbstractC13673n.m38564k(sb4, date4, ")");
    }

    public ProtocolStepResultDto(int i13, Date date, Date date2, ProtocolStepMysticReadingDto protocolStepMysticReadingDto, Integer num, String str, String str2, Date date3, Date date4) {
        this.id = i13;
        this.startTimestamp = date;
        this.endTimestamp = date2;
        this.mysticReading = protocolStepMysticReadingDto;
        this.numberInput = num;
        this.textOption = str;
        this.textInput = str2;
        this.timestampInput = date3;
        this.dateTimeStampInput = date4;
    }
}
