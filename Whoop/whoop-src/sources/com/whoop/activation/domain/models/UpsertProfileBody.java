package com.whoop.activation.domain.models;

import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p000.AbstractC11266d;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 42\u00020\u0001:\u000254B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fB]\b\u0010\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000b\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b \u0010\u001eJ\u0010\u0010!\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b!\u0010\u001eJ\u0010\u0010\"\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\"\u0010\u001eJV\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b%\u0010\u001eJ\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010\u001bJ\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u001bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010+\u001a\u0004\b-\u0010\u001bR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010.\u001a\u0004\b/\u0010\u001eR\u001a\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010.\u001a\u0004\b0\u0010\u001eR\u001a\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b1\u0010\u001eR\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010.\u001a\u0004\b2\u0010\u001eR\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010.\u001a\u0004\b3\u0010\u001e¨\u00066"}, m65681d2 = {"Lcom/whoop/activation/domain/models/UpsertProfileBody;", "", "", "height", "weight", "", "birthday", "gender", "physiologicalBaseline", "unitSystem", "timeZoneOffset", "<init>", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$activation_release", "(Lcom/whoop/activation/domain/models/UpsertProfileBody;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()I", "component2", "component3", "()Ljava/lang/String;", "component4", "component5", "component6", "component7", "copy", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/activation/domain/models/UpsertProfileBody;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getHeight", "getWeight", "Ljava/lang/String;", "getBirthday", "getGender", "getPhysiologicalBaseline", "getUnitSystem", "getTimeZoneOffset", "Companion", "$serializer", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class UpsertProfileBody {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @SerializedName("birthday")
    private final String birthday;

    @SerializedName("gender")
    private final String gender;

    @SerializedName("height")
    private final int height;

    @SerializedName("physiological_baseline")
    private final String physiologicalBaseline;

    @SerializedName("time_zone_offset")
    private final String timeZoneOffset;

    @SerializedName("unit_system")
    private final String unitSystem;

    @SerializedName("weight")
    private final int weight;

    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/activation/domain/models/UpsertProfileBody$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/activation/domain/models/UpsertProfileBody;", "serializer", "()Lwc3/c;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return UpsertProfileBody$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ UpsertProfileBody(int i13, int i14, int i15, String str, String str2, String str3, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if (127 != (i13 & 127)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 127, UpsertProfileBody$$serializer.INSTANCE.getDescriptor());
        }
        this.height = i14;
        this.weight = i15;
        this.birthday = str;
        this.gender = str2;
        this.physiologicalBaseline = str3;
        this.unitSystem = str4;
        this.timeZoneOffset = str5;
    }

    public static /* synthetic */ UpsertProfileBody copy$default(UpsertProfileBody upsertProfileBody, int i13, int i14, String str, String str2, String str3, String str4, String str5, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            i13 = upsertProfileBody.height;
        }
        if ((i15 & 2) != 0) {
            i14 = upsertProfileBody.weight;
        }
        if ((i15 & 4) != 0) {
            str = upsertProfileBody.birthday;
        }
        if ((i15 & 8) != 0) {
            str2 = upsertProfileBody.gender;
        }
        if ((i15 & 16) != 0) {
            str3 = upsertProfileBody.physiologicalBaseline;
        }
        if ((i15 & 32) != 0) {
            str4 = upsertProfileBody.unitSystem;
        }
        if ((i15 & 64) != 0) {
            str5 = upsertProfileBody.timeZoneOffset;
        }
        String str6 = str4;
        String str7 = str5;
        String str8 = str3;
        String str9 = str;
        return upsertProfileBody.copy(i13, i14, str9, str2, str8, str6, str7);
    }

    public static final /* synthetic */ void write$Self$activation_release(UpsertProfileBody self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeIntElement(serialDesc, 0, self.height);
        output.encodeIntElement(serialDesc, 1, self.weight);
        output.encodeStringElement(serialDesc, 2, self.birthday);
        output.encodeStringElement(serialDesc, 3, self.gender);
        output.encodeStringElement(serialDesc, 4, self.physiologicalBaseline);
        output.encodeStringElement(serialDesc, 5, self.unitSystem);
        output.encodeStringElement(serialDesc, 6, self.timeZoneOffset);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getHeight() {
        return this.height;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getWeight() {
        return this.weight;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getBirthday() {
        return this.birthday;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getGender() {
        return this.gender;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getPhysiologicalBaseline() {
        return this.physiologicalBaseline;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getUnitSystem() {
        return this.unitSystem;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getTimeZoneOffset() {
        return this.timeZoneOffset;
    }

    public final UpsertProfileBody copy(int height, int weight, String birthday, String gender, String physiologicalBaseline, String unitSystem, String timeZoneOffset) {
        AbstractC22676k.m65750j(birthday, "birthday");
        AbstractC22676k.m65750j(gender, "gender");
        AbstractC22676k.m65750j(physiologicalBaseline, "physiologicalBaseline");
        AbstractC22676k.m65750j(unitSystem, "unitSystem");
        AbstractC22676k.m65750j(timeZoneOffset, "timeZoneOffset");
        return new UpsertProfileBody(height, weight, birthday, gender, physiologicalBaseline, unitSystem, timeZoneOffset);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpsertProfileBody)) {
            return false;
        }
        UpsertProfileBody upsertProfileBody = (UpsertProfileBody) other;
        return this.height == upsertProfileBody.height && this.weight == upsertProfileBody.weight && AbstractC22676k.m65745e(this.birthday, upsertProfileBody.birthday) && AbstractC22676k.m65745e(this.gender, upsertProfileBody.gender) && AbstractC22676k.m65745e(this.physiologicalBaseline, upsertProfileBody.physiologicalBaseline) && AbstractC22676k.m65745e(this.unitSystem, upsertProfileBody.unitSystem) && AbstractC22676k.m65745e(this.timeZoneOffset, upsertProfileBody.timeZoneOffset);
    }

    public final String getBirthday() {
        return this.birthday;
    }

    public final String getGender() {
        return this.gender;
    }

    public final int getHeight() {
        return this.height;
    }

    public final String getPhysiologicalBaseline() {
        return this.physiologicalBaseline;
    }

    public final String getTimeZoneOffset() {
        return this.timeZoneOffset;
    }

    public final String getUnitSystem() {
        return this.unitSystem;
    }

    public final int getWeight() {
        return this.weight;
    }

    public int hashCode() {
        return this.timeZoneOffset.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30448b(this.weight, Integer.hashCode(this.height) * 31, 31), 31, this.birthday), 31, this.gender), 31, this.physiologicalBaseline), 31, this.unitSystem);
    }

    public String toString() {
        int i13 = this.height;
        int i14 = this.weight;
        String str = this.birthday;
        String str2 = this.gender;
        String str3 = this.physiologicalBaseline;
        String str4 = this.unitSystem;
        String str5 = this.timeZoneOffset;
        StringBuilder sbM30465s = AbstractC11266d.m30465s(i13, i14, "UpsertProfileBody(height=", ", weight=", ", birthday=");
        AbstractC11266d.m30444B(sbM30465s, str, ", gender=", str2, ", physiologicalBaseline=");
        AbstractC11266d.m30444B(sbM30465s, str3, ", unitSystem=", str4, ", timeZoneOffset=");
        return AbstractC25012a.m73376i(str5, ")", sbM30465s);
    }

    public UpsertProfileBody(int i13, int i14, String birthday, String gender, String physiologicalBaseline, String unitSystem, String timeZoneOffset) {
        AbstractC22676k.m65750j(birthday, "birthday");
        AbstractC22676k.m65750j(gender, "gender");
        AbstractC22676k.m65750j(physiologicalBaseline, "physiologicalBaseline");
        AbstractC22676k.m65750j(unitSystem, "unitSystem");
        AbstractC22676k.m65750j(timeZoneOffset, "timeZoneOffset");
        this.height = i13;
        this.weight = i14;
        this.birthday = birthday;
        this.gender = gender;
        this.physiologicalBaseline = physiologicalBaseline;
        this.unitSystem = unitSystem;
        this.timeZoneOffset = timeZoneOffset;
    }
}
