package com.whoop.labrador.feature.reading.domain.models;

import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import qo1.C30527b;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import y00.AbstractC38963t7;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u000201B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tBI\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0019J@\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0019J\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010'\u0012\u0004\b)\u0010*\u001a\u0004\b(\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b+\u0010\u0019R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b-\u0010\u001cR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010'\u001a\u0004\b.\u0010\u0019¨\u00062"}, m65681d2 = {"Lcom/whoop/labrador/feature/reading/domain/models/LabradorReadingSymptomsUpdateRequest;", "", "", "timeStamp", "strapSerial", "", "symptoms", "notes", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$labrador_release", "(Lcom/whoop/labrador/feature/reading/domain/models/LabradorReadingSymptomsUpdateRequest;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/List;", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)Lcom/whoop/labrador/feature/reading/domain/models/LabradorReadingSymptomsUpdateRequest;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTimeStamp", "getTimeStamp$annotations", "()V", "getStrapSerial", "Ljava/util/List;", "getSymptoms", "getNotes", "Companion", "$serializer", "a", "labrador_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class LabradorReadingSymptomsUpdateRequest {

    @SerializedName("notes")
    private final String notes;

    @SerializedName("strap_serial")
    private final String strapSerial;

    @SerializedName("symptoms")
    private final List<String> symptoms;

    @SerializedName("trailing_timestamp")
    private final String timeStamp;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C30527b(24)), null};

    /* JADX INFO: renamed from: com.whoop.labrador.feature.reading.domain.models.LabradorReadingSymptomsUpdateRequest$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/labrador/feature/reading/domain/models/LabradorReadingSymptomsUpdateRequest$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/labrador/feature/reading/domain/models/LabradorReadingSymptomsUpdateRequest;", "serializer", "()Lwc3/c;", "labrador_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return LabradorReadingSymptomsUpdateRequest$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ LabradorReadingSymptomsUpdateRequest(int i13, String str, String str2, List list, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i13 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 15, LabradorReadingSymptomsUpdateRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.timeStamp = str;
        this.strapSerial = str2;
        this.symptoms = list;
        this.notes = str3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(StringSerializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LabradorReadingSymptomsUpdateRequest copy$default(LabradorReadingSymptomsUpdateRequest labradorReadingSymptomsUpdateRequest, String str, String str2, List list, String str3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = labradorReadingSymptomsUpdateRequest.timeStamp;
        }
        if ((i13 & 2) != 0) {
            str2 = labradorReadingSymptomsUpdateRequest.strapSerial;
        }
        if ((i13 & 4) != 0) {
            list = labradorReadingSymptomsUpdateRequest.symptoms;
        }
        if ((i13 & 8) != 0) {
            str3 = labradorReadingSymptomsUpdateRequest.notes;
        }
        return labradorReadingSymptomsUpdateRequest.copy(str, str2, list, str3);
    }

    @InterfaceC37143h("trailing_timestamp")
    public static /* synthetic */ void getTimeStamp$annotations() {
    }

    public static final /* synthetic */ void write$Self$labrador_release(LabradorReadingSymptomsUpdateRequest self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.timeStamp);
        output.encodeStringElement(serialDesc, 1, self.strapSerial);
        output.encodeSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.symptoms);
        output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.notes);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTimeStamp() {
        return this.timeStamp;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getStrapSerial() {
        return this.strapSerial;
    }

    public final List<String> component3() {
        return this.symptoms;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getNotes() {
        return this.notes;
    }

    public final LabradorReadingSymptomsUpdateRequest copy(String timeStamp, String strapSerial, List<String> symptoms, String notes) {
        AbstractC22676k.m65750j(timeStamp, "timeStamp");
        AbstractC22676k.m65750j(strapSerial, "strapSerial");
        AbstractC22676k.m65750j(symptoms, "symptoms");
        return new LabradorReadingSymptomsUpdateRequest(timeStamp, strapSerial, symptoms, notes);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LabradorReadingSymptomsUpdateRequest)) {
            return false;
        }
        LabradorReadingSymptomsUpdateRequest labradorReadingSymptomsUpdateRequest = (LabradorReadingSymptomsUpdateRequest) other;
        return AbstractC22676k.m65745e(this.timeStamp, labradorReadingSymptomsUpdateRequest.timeStamp) && AbstractC22676k.m65745e(this.strapSerial, labradorReadingSymptomsUpdateRequest.strapSerial) && AbstractC22676k.m65745e(this.symptoms, labradorReadingSymptomsUpdateRequest.symptoms) && AbstractC22676k.m65745e(this.notes, labradorReadingSymptomsUpdateRequest.notes);
    }

    public final String getNotes() {
        return this.notes;
    }

    public final String getStrapSerial() {
        return this.strapSerial;
    }

    public final List<String> getSymptoms() {
        return this.symptoms;
    }

    public final String getTimeStamp() {
        return this.timeStamp;
    }

    public int hashCode() {
        int iM31983b = AbstractC11895b.m31983b(AbstractC11266d.m30450d(this.timeStamp.hashCode() * 31, 31, this.strapSerial), 31, this.symptoms);
        String str = this.notes;
        return iM31983b + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.timeStamp;
        String str2 = this.strapSerial;
        return AbstractC38963t7.m124377g(", notes=", this.notes, ")", AbstractC11895b.m32001t("LabradorReadingSymptomsUpdateRequest(timeStamp=", str, ", strapSerial=", str2, ", symptoms="), this.symptoms);
    }

    public LabradorReadingSymptomsUpdateRequest(String timeStamp, String strapSerial, List<String> symptoms, String str) {
        AbstractC22676k.m65750j(timeStamp, "timeStamp");
        AbstractC22676k.m65750j(strapSerial, "strapSerial");
        AbstractC22676k.m65750j(symptoms, "symptoms");
        this.timeStamp = timeStamp;
        this.strapSerial = strapSerial;
        this.symptoms = symptoms;
        this.notes = str;
    }
}
