package com.whoop.weightlifting.feature.exerciserecords.domain.models;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.lang.annotation.Annotation;
import kotlinx.serialization.internal.ObjectSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import mq2.C25888a;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 32\u00020\u0001:\u000243B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nBC\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0019\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u001b\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b \u0010\u001aJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b!\u0010\u001aJ@\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b$\u0010\u001aJ\u0010\u0010%\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010'HÖ\u0003¢\u0006\u0004\b*\u0010+R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010\u001dR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010.\u001a\u0004\b/\u0010\u001fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00100\u001a\u0004\b1\u0010\u001aR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u00100\u001a\u0004\b2\u0010\u001a¨\u00065"}, m65681d2 = {"Lcom/whoop/weightlifting/feature/exerciserecords/domain/models/ArchMiniExerciseRecords;", "Lcom/whoop/design/models/DesignSystemModel;", "Lcom/whoop/weightlifting/feature/exerciserecords/domain/models/ArchMiniExerciseRecordsModel;", "component", "Lcom/whoop/weightlifting/feature/exerciserecords/domain/models/ArchMiniExerciseRecordsContent;", "content", "", "path", "analyticsAction", "<init>", "(Lcom/whoop/weightlifting/feature/exerciserecords/domain/models/ArchMiniExerciseRecordsModel;Lcom/whoop/weightlifting/feature/exerciserecords/domain/models/ArchMiniExerciseRecordsContent;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/weightlifting/feature/exerciserecords/domain/models/ArchMiniExerciseRecordsModel;Lcom/whoop/weightlifting/feature/exerciserecords/domain/models/ArchMiniExerciseRecordsContent;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$weightlifting_release", "(Lcom/whoop/weightlifting/feature/exerciserecords/domain/models/ArchMiniExerciseRecords;Lzc3/c;Lyc3/g;)V", "write$Self", "resolvedPath", "()Ljava/lang/String;", "resolvedExpansionAnalyticsAction", "component1", "()Lcom/whoop/weightlifting/feature/exerciserecords/domain/models/ArchMiniExerciseRecordsModel;", "component2", "()Lcom/whoop/weightlifting/feature/exerciserecords/domain/models/ArchMiniExerciseRecordsContent;", "component3", "component4", "copy", "(Lcom/whoop/weightlifting/feature/exerciserecords/domain/models/ArchMiniExerciseRecordsModel;Lcom/whoop/weightlifting/feature/exerciserecords/domain/models/ArchMiniExerciseRecordsContent;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/weightlifting/feature/exerciserecords/domain/models/ArchMiniExerciseRecords;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/weightlifting/feature/exerciserecords/domain/models/ArchMiniExerciseRecordsModel;", "getComponent", "Lcom/whoop/weightlifting/feature/exerciserecords/domain/models/ArchMiniExerciseRecordsContent;", "getContent", "Ljava/lang/String;", "getPath", "getAnalyticsAction", "Companion", "$serializer", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ArchMiniExerciseRecords implements DesignSystemModel {
    public static final int $stable = 0;
    private final String analyticsAction;
    private final ArchMiniExerciseRecordsModel component;
    private final ArchMiniExerciseRecordsContent content;
    private final String path;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final InterfaceC23462h[] $childSerializers = {AbstractC30060g.m92087G(EnumC23463i.f92934x, new C25888a(11)), null, null, null};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/weightlifting/feature/exerciserecords/domain/models/ArchMiniExerciseRecords$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/weightlifting/feature/exerciserecords/domain/models/ArchMiniExerciseRecords;", "serializer", "()Lwc3/c;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ArchMiniExerciseRecords$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public ArchMiniExerciseRecords() {
        this((ArchMiniExerciseRecordsModel) null, (ArchMiniExerciseRecordsContent) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ObjectSerializer("com.whoop.weightlifting.feature.exerciserecords.domain.models.ArchMiniExerciseRecordsModel", ArchMiniExerciseRecordsModel.INSTANCE, new Annotation[0]);
    }

    public static /* synthetic */ ArchMiniExerciseRecords copy$default(ArchMiniExerciseRecords archMiniExerciseRecords, ArchMiniExerciseRecordsModel archMiniExerciseRecordsModel, ArchMiniExerciseRecordsContent archMiniExerciseRecordsContent, String str, String str2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            archMiniExerciseRecordsModel = archMiniExerciseRecords.component;
        }
        if ((i13 & 2) != 0) {
            archMiniExerciseRecordsContent = archMiniExerciseRecords.content;
        }
        if ((i13 & 4) != 0) {
            str = archMiniExerciseRecords.path;
        }
        if ((i13 & 8) != 0) {
            str2 = archMiniExerciseRecords.analyticsAction;
        }
        return archMiniExerciseRecords.copy(archMiniExerciseRecordsModel, archMiniExerciseRecordsContent, str, str2);
    }

    public static final /* synthetic */ void write$Self$weightlifting_release(ArchMiniExerciseRecords self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.component != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, (InterfaceC37145j) interfaceC23462hArr[0].getValue(), self.component);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.content != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, ArchMiniExerciseRecordsContent$$serializer.INSTANCE, self.content);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.path != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.path);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 3) && self.analyticsAction == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.analyticsAction);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ArchMiniExerciseRecordsModel getComponent() {
        return this.component;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ArchMiniExerciseRecordsContent getContent() {
        return this.content;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getAnalyticsAction() {
        return this.analyticsAction;
    }

    public final ArchMiniExerciseRecords copy(ArchMiniExerciseRecordsModel component, ArchMiniExerciseRecordsContent content, String path, String analyticsAction) {
        return new ArchMiniExerciseRecords(component, content, path, analyticsAction);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ArchMiniExerciseRecords)) {
            return false;
        }
        ArchMiniExerciseRecords archMiniExerciseRecords = (ArchMiniExerciseRecords) other;
        return AbstractC22676k.m65745e(this.component, archMiniExerciseRecords.component) && AbstractC22676k.m65745e(this.content, archMiniExerciseRecords.content) && AbstractC22676k.m65745e(this.path, archMiniExerciseRecords.path) && AbstractC22676k.m65745e(this.analyticsAction, archMiniExerciseRecords.analyticsAction);
    }

    public final String getAnalyticsAction() {
        return this.analyticsAction;
    }

    public final ArchMiniExerciseRecordsModel getComponent() {
        return this.component;
    }

    public final ArchMiniExerciseRecordsContent getContent() {
        return this.content;
    }

    public final String getPath() {
        return this.path;
    }

    public int hashCode() {
        ArchMiniExerciseRecordsModel archMiniExerciseRecordsModel = this.component;
        int iHashCode = (archMiniExerciseRecordsModel == null ? 0 : archMiniExerciseRecordsModel.hashCode()) * 31;
        ArchMiniExerciseRecordsContent archMiniExerciseRecordsContent = this.content;
        int iHashCode2 = (iHashCode + (archMiniExerciseRecordsContent == null ? 0 : archMiniExerciseRecordsContent.hashCode())) * 31;
        String str = this.path;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.analyticsAction;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String resolvedExpansionAnalyticsAction() {
        String analyticsAction;
        ArchMiniExerciseRecordsContent archMiniExerciseRecordsContent = this.content;
        return (archMiniExerciseRecordsContent == null || (analyticsAction = archMiniExerciseRecordsContent.getAnalyticsAction()) == null) ? this.analyticsAction : analyticsAction;
    }

    public final String resolvedPath() {
        String path;
        ArchMiniExerciseRecordsContent archMiniExerciseRecordsContent = this.content;
        if (archMiniExerciseRecordsContent != null && (path = archMiniExerciseRecordsContent.getPath()) != null) {
            return path;
        }
        String str = this.path;
        return str == null ? "" : str;
    }

    public String toString() {
        ArchMiniExerciseRecordsModel archMiniExerciseRecordsModel = this.component;
        ArchMiniExerciseRecordsContent archMiniExerciseRecordsContent = this.content;
        String str = this.path;
        String str2 = this.analyticsAction;
        StringBuilder sb4 = new StringBuilder("ArchMiniExerciseRecords(component=");
        sb4.append(archMiniExerciseRecordsModel);
        sb4.append(", content=");
        sb4.append(archMiniExerciseRecordsContent);
        sb4.append(", path=");
        return AbstractC11266d.m30464r(sb4, str, ", analyticsAction=", str2, ")");
    }

    public /* synthetic */ ArchMiniExerciseRecords(int i13, ArchMiniExerciseRecordsModel archMiniExerciseRecordsModel, ArchMiniExerciseRecordsContent archMiniExerciseRecordsContent, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i13 & 1) == 0) {
            this.component = null;
        } else {
            this.component = archMiniExerciseRecordsModel;
        }
        if ((i13 & 2) == 0) {
            this.content = null;
        } else {
            this.content = archMiniExerciseRecordsContent;
        }
        if ((i13 & 4) == 0) {
            this.path = null;
        } else {
            this.path = str;
        }
        if ((i13 & 8) == 0) {
            this.analyticsAction = null;
        } else {
            this.analyticsAction = str2;
        }
    }

    public ArchMiniExerciseRecords(ArchMiniExerciseRecordsModel archMiniExerciseRecordsModel, ArchMiniExerciseRecordsContent archMiniExerciseRecordsContent, String str, String str2) {
        this.component = archMiniExerciseRecordsModel;
        this.content = archMiniExerciseRecordsContent;
        this.path = str;
        this.analyticsAction = str2;
    }

    public /* synthetic */ ArchMiniExerciseRecords(ArchMiniExerciseRecordsModel archMiniExerciseRecordsModel, ArchMiniExerciseRecordsContent archMiniExerciseRecordsContent, String str, String str2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : archMiniExerciseRecordsModel, (i13 & 2) != 0 ? null : archMiniExerciseRecordsContent, (i13 & 4) != 0 ? null : str, (i13 & 8) != 0 ? null : str2);
    }
}
