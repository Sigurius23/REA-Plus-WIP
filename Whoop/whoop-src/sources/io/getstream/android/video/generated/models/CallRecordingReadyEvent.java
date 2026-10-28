package io.getstream.android.video.generated.models;

import c13.AbstractC3855a;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import jg3.C21682i;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p088dc.AbstractC11895b;
import p441qx.AbstractC30704c0;
import p441qx.InterfaceC30729p;
import p441qx.InterfaceC30731q;
import p441qx.InterfaceC30738t0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002:\u00010BC\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n\u0012\b\b\u0001\u0010\f\u001a\u00020\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0010J\u0010\u0010\u0013\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0010J\u0010\u0010\u0016\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0010JL\u0010\u001b\u001a\u00020\u00002\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00052\b\b\u0003\u0010\u0007\u001a\u00020\u00032\b\b\u0003\u0010\t\u001a\u00020\b2\b\b\u0003\u0010\u000b\u001a\u00020\n2\b\b\u0003\u0010\f\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0010J\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b'\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b)\u0010\u0014R\u0017\u0010\u0007\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b*\u0010\u0010R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010+\u001a\u0004\b,\u0010\u0017R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010-\u001a\u0004\b.\u0010\u0019R\u0017\u0010\f\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\f\u0010&\u001a\u0004\b/\u0010\u0010¨\u00061"}, m65681d2 = {"Lio/getstream/android/video/generated/models/CallRecordingReadyEvent;", "Lio/getstream/android/video/generated/models/VideoEvent;", "Lio/getstream/android/video/generated/models/WSCallEvent;", "", "callCid", "Ljg3/i;", "createdAt", "egressId", "Lio/getstream/android/video/generated/models/CallRecordingReadyEvent$RecordingType;", "recordingType", "Lio/getstream/android/video/generated/models/CallRecording;", "callRecording", "type", "<init>", "(Ljava/lang/String;Ljg3/i;Ljava/lang/String;Lio/getstream/android/video/generated/models/CallRecordingReadyEvent$RecordingType;Lio/getstream/android/video/generated/models/CallRecording;Ljava/lang/String;)V", "getEventType", "()Ljava/lang/String;", "getCallCID", "component1", "component2", "()Ljg3/i;", "component3", "component4", "()Lio/getstream/android/video/generated/models/CallRecordingReadyEvent$RecordingType;", "component5", "()Lio/getstream/android/video/generated/models/CallRecording;", "component6", "copy", "(Ljava/lang/String;Ljg3/i;Ljava/lang/String;Lio/getstream/android/video/generated/models/CallRecordingReadyEvent$RecordingType;Lio/getstream/android/video/generated/models/CallRecording;Ljava/lang/String;)Lio/getstream/android/video/generated/models/CallRecordingReadyEvent;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCallCid", "Ljg3/i;", "getCreatedAt", "getEgressId", "Lio/getstream/android/video/generated/models/CallRecordingReadyEvent$RecordingType;", "getRecordingType", "Lio/getstream/android/video/generated/models/CallRecording;", "getCallRecording", "getType", "RecordingType", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final /* data */ class CallRecordingReadyEvent extends VideoEvent implements WSCallEvent {
    private final String callCid;
    private final CallRecording callRecording;
    private final C21682i createdAt;
    private final String egressId;
    private final RecordingType recordingType;
    private final String type;

    @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \b2\u00020\u0001:\u0006\b\t\n\u000b\f\rB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0004\u000e\u000f\u0010\u0011¨\u0006\u0012"}, m65681d2 = {"Lio/getstream/android/video/generated/models/CallRecordingReadyEvent$RecordingType;", "", "value", "", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "toString", "Companion", "Composite", "Individual", "Raw", "RecordingTypeAdapter", "Unknown", "Lio/getstream/android/video/generated/models/CallRecordingReadyEvent$RecordingType$Composite;", "Lio/getstream/android/video/generated/models/CallRecordingReadyEvent$RecordingType$Individual;", "Lio/getstream/android/video/generated/models/CallRecordingReadyEvent$RecordingType$Raw;", "Lio/getstream/android/video/generated/models/CallRecordingReadyEvent$RecordingType$Unknown;", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
    public static abstract class RecordingType {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String value;

        @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m65681d2 = {"Lio/getstream/android/video/generated/models/CallRecordingReadyEvent$RecordingType$Companion;", "", "()V", "fromString", "Lio/getstream/android/video/generated/models/CallRecordingReadyEvent$RecordingType;", "s", "", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final RecordingType fromString(String s13) {
                AbstractC22676k.m65750j(s13, "s");
                int iHashCode = s13.hashCode();
                if (iHashCode != -1399754105) {
                    if (iHashCode != -46292327) {
                        if (iHashCode == 112680 && s13.equals("raw")) {
                            return Raw.INSTANCE;
                        }
                    } else if (s13.equals("individual")) {
                        return Individual.INSTANCE;
                    }
                } else if (s13.equals("composite")) {
                    return Composite.INSTANCE;
                }
                return new Unknown(s13);
            }

            private Companion() {
            }
        }

        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/CallRecordingReadyEvent$RecordingType$Composite;", "Lio/getstream/android/video/generated/models/CallRecordingReadyEvent$RecordingType;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class Composite extends RecordingType {
            public static final Composite INSTANCE = new Composite();

            private Composite() {
                super("composite", null);
            }
        }

        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/CallRecordingReadyEvent$RecordingType$Individual;", "Lio/getstream/android/video/generated/models/CallRecordingReadyEvent$RecordingType;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class Individual extends RecordingType {
            public static final Individual INSTANCE = new Individual();

            private Individual() {
                super("individual", null);
            }
        }

        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/CallRecordingReadyEvent$RecordingType$Raw;", "Lio/getstream/android/video/generated/models/CallRecordingReadyEvent$RecordingType;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class Raw extends RecordingType {
            public static final Raw INSTANCE = new Raw();

            private Raw() {
                super("raw", null);
            }
        }

        @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0017¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Lio/getstream/android/video/generated/models/CallRecordingReadyEvent$RecordingType$RecordingTypeAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lio/getstream/android/video/generated/models/CallRecordingReadyEvent$RecordingType;", "<init>", "()V", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "(Lcom/squareup/moshi/JsonReader;)Lio/getstream/android/video/generated/models/CallRecordingReadyEvent$RecordingType;", "Lqx/c0;", "writer", "value", "Ll83/a0;", "toJson", "(Lqx/c0;Lio/getstream/android/video/generated/models/CallRecordingReadyEvent$RecordingType;)V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class RecordingTypeAdapter extends JsonAdapter<RecordingType> {
            @Override // com.squareup.moshi.JsonAdapter
            @InterfaceC30729p
            public RecordingType fromJson(JsonReader reader) {
                AbstractC22676k.m65750j(reader, "reader");
                String strNextString = reader.nextString();
                if (strNextString == null) {
                    return null;
                }
                return RecordingType.INSTANCE.fromString(strNextString);
            }

            @Override // com.squareup.moshi.JsonAdapter
            @InterfaceC30738t0
            public void toJson(AbstractC30704c0 writer, RecordingType value) {
                AbstractC22676k.m65750j(writer, "writer");
                writer.mo94362F0(value != null ? value.getValue() : null);
            }
        }

        @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, m65681d2 = {"Lio/getstream/android/video/generated/models/CallRecordingReadyEvent$RecordingType$Unknown;", "Lio/getstream/android/video/generated/models/CallRecordingReadyEvent$RecordingType;", "unknownValue", "", "(Ljava/lang/String;)V", "getUnknownValue", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final /* data */ class Unknown extends RecordingType {
            private final String unknownValue;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Unknown(String unknownValue) {
                super(unknownValue, null);
                AbstractC22676k.m65750j(unknownValue, "unknownValue");
                this.unknownValue = unknownValue;
            }

            public static /* synthetic */ Unknown copy$default(Unknown unknown, String str, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    str = unknown.unknownValue;
                }
                return unknown.copy(str);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getUnknownValue() {
                return this.unknownValue;
            }

            public final Unknown copy(String unknownValue) {
                AbstractC22676k.m65750j(unknownValue, "unknownValue");
                return new Unknown(unknownValue);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Unknown) && AbstractC22676k.m65745e(this.unknownValue, ((Unknown) other).unknownValue);
            }

            public final String getUnknownValue() {
                return this.unknownValue;
            }

            public int hashCode() {
                return this.unknownValue.hashCode();
            }

            @Override // io.getstream.android.video.generated.models.CallRecordingReadyEvent.RecordingType
            public String toString() {
                return AbstractC11895b.m31996o("Unknown(unknownValue=", this.unknownValue, ")");
            }
        }

        public /* synthetic */ RecordingType(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        public final String getValue() {
            return this.value;
        }

        public String toString() {
            return this.value;
        }

        private RecordingType(String str) {
            this.value = str;
        }
    }

    public CallRecordingReadyEvent(@InterfaceC30731q(name = "call_cid") String callCid, @InterfaceC30731q(name = "created_at") C21682i createdAt, @InterfaceC30731q(name = "egress_id") String egressId, @InterfaceC30731q(name = "recording_type") RecordingType recordingType, @InterfaceC30731q(name = "call_recording") CallRecording callRecording, @InterfaceC30731q(name = "type") String type) {
        AbstractC22676k.m65750j(callCid, "callCid");
        AbstractC22676k.m65750j(createdAt, "createdAt");
        AbstractC22676k.m65750j(egressId, "egressId");
        AbstractC22676k.m65750j(recordingType, "recordingType");
        AbstractC22676k.m65750j(callRecording, "callRecording");
        AbstractC22676k.m65750j(type, "type");
        this.callCid = callCid;
        this.createdAt = createdAt;
        this.egressId = egressId;
        this.recordingType = recordingType;
        this.callRecording = callRecording;
        this.type = type;
    }

    public static /* synthetic */ CallRecordingReadyEvent copy$default(CallRecordingReadyEvent callRecordingReadyEvent, String str, C21682i c21682i, String str2, RecordingType recordingType, CallRecording callRecording, String str3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = callRecordingReadyEvent.callCid;
        }
        if ((i13 & 2) != 0) {
            c21682i = callRecordingReadyEvent.createdAt;
        }
        if ((i13 & 4) != 0) {
            str2 = callRecordingReadyEvent.egressId;
        }
        if ((i13 & 8) != 0) {
            recordingType = callRecordingReadyEvent.recordingType;
        }
        if ((i13 & 16) != 0) {
            callRecording = callRecordingReadyEvent.callRecording;
        }
        if ((i13 & 32) != 0) {
            str3 = callRecordingReadyEvent.type;
        }
        CallRecording callRecording2 = callRecording;
        String str4 = str3;
        return callRecordingReadyEvent.copy(str, c21682i, str2, recordingType, callRecording2, str4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCallCid() {
        return this.callCid;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final C21682i getCreatedAt() {
        return this.createdAt;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getEgressId() {
        return this.egressId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final RecordingType getRecordingType() {
        return this.recordingType;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final CallRecording getCallRecording() {
        return this.callRecording;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getType() {
        return this.type;
    }

    public final CallRecordingReadyEvent copy(@InterfaceC30731q(name = "call_cid") String callCid, @InterfaceC30731q(name = "created_at") C21682i createdAt, @InterfaceC30731q(name = "egress_id") String egressId, @InterfaceC30731q(name = "recording_type") RecordingType recordingType, @InterfaceC30731q(name = "call_recording") CallRecording callRecording, @InterfaceC30731q(name = "type") String type) {
        AbstractC22676k.m65750j(callCid, "callCid");
        AbstractC22676k.m65750j(createdAt, "createdAt");
        AbstractC22676k.m65750j(egressId, "egressId");
        AbstractC22676k.m65750j(recordingType, "recordingType");
        AbstractC22676k.m65750j(callRecording, "callRecording");
        AbstractC22676k.m65750j(type, "type");
        return new CallRecordingReadyEvent(callCid, createdAt, egressId, recordingType, callRecording, type);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CallRecordingReadyEvent)) {
            return false;
        }
        CallRecordingReadyEvent callRecordingReadyEvent = (CallRecordingReadyEvent) other;
        return AbstractC22676k.m65745e(this.callCid, callRecordingReadyEvent.callCid) && AbstractC22676k.m65745e(this.createdAt, callRecordingReadyEvent.createdAt) && AbstractC22676k.m65745e(this.egressId, callRecordingReadyEvent.egressId) && AbstractC22676k.m65745e(this.recordingType, callRecordingReadyEvent.recordingType) && AbstractC22676k.m65745e(this.callRecording, callRecordingReadyEvent.callRecording) && AbstractC22676k.m65745e(this.type, callRecordingReadyEvent.type);
    }

    @Override // io.getstream.android.video.generated.models.WSCallEvent
    public String getCallCID() {
        return this.callCid;
    }

    public final String getCallCid() {
        return this.callCid;
    }

    public final CallRecording getCallRecording() {
        return this.callRecording;
    }

    public final C21682i getCreatedAt() {
        return this.createdAt;
    }

    public final String getEgressId() {
        return this.egressId;
    }

    @Override // io.getstream.android.video.generated.models.VideoEvent
    /* JADX INFO: renamed from: getEventType */
    public String getType() {
        return this.type;
    }

    public final RecordingType getRecordingType() {
        return this.recordingType;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return this.type.hashCode() + ((this.callRecording.hashCode() + ((this.recordingType.hashCode() + AbstractC11266d.m30450d(AbstractC3855a.m11822f(this.createdAt, this.callCid.hashCode() * 31, 31), 31, this.egressId)) * 31)) * 31);
    }

    public String toString() {
        String str = this.callCid;
        C21682i c21682i = this.createdAt;
        String str2 = this.egressId;
        RecordingType recordingType = this.recordingType;
        CallRecording callRecording = this.callRecording;
        String str3 = this.type;
        StringBuilder sbM94767p = AbstractC30802r.m94767p("CallRecordingReadyEvent(callCid=", c21682i, str, ", createdAt=", ", egressId=");
        sbM94767p.append(str2);
        sbM94767p.append(", recordingType=");
        sbM94767p.append(recordingType);
        sbM94767p.append(", callRecording=");
        sbM94767p.append(callRecording);
        sbM94767p.append(", type=");
        sbM94767p.append(str3);
        sbM94767p.append(")");
        return sbM94767p.toString();
    }
}
