package com.whoop.healthconnect.domain.models;

import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import lj1.C24474b;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import y00.AbstractC38963t7;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/.B3\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bBK\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJD\u0010 \u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010(\u001a\u00020\u00072\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010*\u001a\u0004\b+\u0010\u001bR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b,\u0010\u001bR\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010-\u001a\u0004\b\b\u0010\u001eR\u001a\u0010\t\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010-\u001a\u0004\b\t\u0010\u001e¨\u00060"}, m65681d2 = {"Lcom/whoop/healthconnect/domain/models/HealthConnectExerciseSessionRequestBody;", "", "", "Lcom/whoop/healthconnect/domain/models/HealthConnectExerciseSessionModel;", "records", "Lcom/whoop/healthconnect/domain/models/HealthConnectDeletedRecordModel;", "deletedRecords", "", "isInitialImport", "isTokenRefreshImport", "<init>", "(Ljava/util/List;Ljava/util/List;ZZ)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/util/List;ZZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$health_connect_release", "(Lcom/whoop/healthconnect/domain/models/HealthConnectExerciseSessionRequestBody;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "component3", "()Z", "component4", "copy", "(Ljava/util/List;Ljava/util/List;ZZ)Lcom/whoop/healthconnect/domain/models/HealthConnectExerciseSessionRequestBody;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getRecords", "getDeletedRecords", "Z", "Companion", "$serializer", "health-connect_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class HealthConnectExerciseSessionRequestBody {
    private static final InterfaceC23462h[] $childSerializers;

    @SerializedName("deleted_records")
    private final List<HealthConnectDeletedRecordModel> deletedRecords;

    @SerializedName("is_initial_import")
    private final boolean isInitialImport;

    @SerializedName("is_token_refresh_import")
    private final boolean isTokenRefreshImport;

    @SerializedName("records")
    private final List<HealthConnectExerciseSessionModel> records;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/healthconnect/domain/models/HealthConnectExerciseSessionRequestBody$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/healthconnect/domain/models/HealthConnectExerciseSessionRequestBody;", "serializer", "()Lwc3/c;", "health-connect_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return HealthConnectExerciseSessionRequestBody$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{AbstractC30060g.m92087G(enumC23463i, new C24474b(2)), AbstractC30060g.m92087G(enumC23463i, new C24474b(3)), null, null};
    }

    public /* synthetic */ HealthConnectExerciseSessionRequestBody(int i13, List list, List list2, boolean z4, boolean z13, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i13 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 15, HealthConnectExerciseSessionRequestBody$$serializer.INSTANCE.getDescriptor());
        }
        this.records = list;
        this.deletedRecords = list2;
        this.isInitialImport = z4;
        this.isTokenRefreshImport = z13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(HealthConnectExerciseSessionModel$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new ArrayListSerializer(HealthConnectDeletedRecordModel$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HealthConnectExerciseSessionRequestBody copy$default(HealthConnectExerciseSessionRequestBody healthConnectExerciseSessionRequestBody, List list, List list2, boolean z4, boolean z13, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = healthConnectExerciseSessionRequestBody.records;
        }
        if ((i13 & 2) != 0) {
            list2 = healthConnectExerciseSessionRequestBody.deletedRecords;
        }
        if ((i13 & 4) != 0) {
            z4 = healthConnectExerciseSessionRequestBody.isInitialImport;
        }
        if ((i13 & 8) != 0) {
            z13 = healthConnectExerciseSessionRequestBody.isTokenRefreshImport;
        }
        return healthConnectExerciseSessionRequestBody.copy(list, list2, z4, z13);
    }

    public static final /* synthetic */ void write$Self$health_connect_release(HealthConnectExerciseSessionRequestBody self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, (InterfaceC37145j) interfaceC23462hArr[0].getValue(), self.records);
        output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.deletedRecords);
        output.encodeBooleanElement(serialDesc, 2, self.isInitialImport);
        output.encodeBooleanElement(serialDesc, 3, self.isTokenRefreshImport);
    }

    public final List<HealthConnectExerciseSessionModel> component1() {
        return this.records;
    }

    public final List<HealthConnectDeletedRecordModel> component2() {
        return this.deletedRecords;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsInitialImport() {
        return this.isInitialImport;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getIsTokenRefreshImport() {
        return this.isTokenRefreshImport;
    }

    public final HealthConnectExerciseSessionRequestBody copy(List<HealthConnectExerciseSessionModel> records, List<HealthConnectDeletedRecordModel> deletedRecords, boolean isInitialImport, boolean isTokenRefreshImport) {
        AbstractC22676k.m65750j(records, "records");
        AbstractC22676k.m65750j(deletedRecords, "deletedRecords");
        return new HealthConnectExerciseSessionRequestBody(records, deletedRecords, isInitialImport, isTokenRefreshImport);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HealthConnectExerciseSessionRequestBody)) {
            return false;
        }
        HealthConnectExerciseSessionRequestBody healthConnectExerciseSessionRequestBody = (HealthConnectExerciseSessionRequestBody) other;
        return AbstractC22676k.m65745e(this.records, healthConnectExerciseSessionRequestBody.records) && AbstractC22676k.m65745e(this.deletedRecords, healthConnectExerciseSessionRequestBody.deletedRecords) && this.isInitialImport == healthConnectExerciseSessionRequestBody.isInitialImport && this.isTokenRefreshImport == healthConnectExerciseSessionRequestBody.isTokenRefreshImport;
    }

    public final List<HealthConnectDeletedRecordModel> getDeletedRecords() {
        return this.deletedRecords;
    }

    public final List<HealthConnectExerciseSessionModel> getRecords() {
        return this.records;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isTokenRefreshImport) + AbstractC2875y.m8289b(AbstractC11895b.m31983b(this.records.hashCode() * 31, 31, this.deletedRecords), 31, this.isInitialImport);
    }

    public final boolean isInitialImport() {
        return this.isInitialImport;
    }

    public final boolean isTokenRefreshImport() {
        return this.isTokenRefreshImport;
    }

    public String toString() {
        List<HealthConnectExerciseSessionModel> list = this.records;
        List<HealthConnectDeletedRecordModel> list2 = this.deletedRecords;
        return AbstractC36095b.m114682j(AbstractC38963t7.m124380j("HealthConnectExerciseSessionRequestBody(records=", ", deletedRecords=", list, ", isInitialImport=", list2), this.isInitialImport, ", isTokenRefreshImport=", this.isTokenRefreshImport, ")");
    }

    public HealthConnectExerciseSessionRequestBody(List<HealthConnectExerciseSessionModel> records, List<HealthConnectDeletedRecordModel> deletedRecords, boolean z4, boolean z13) {
        AbstractC22676k.m65750j(records, "records");
        AbstractC22676k.m65750j(deletedRecords, "deletedRecords");
        this.records = records;
        this.deletedRecords = deletedRecords;
        this.isInitialImport = z4;
        this.isTokenRefreshImport = z13;
    }
}
