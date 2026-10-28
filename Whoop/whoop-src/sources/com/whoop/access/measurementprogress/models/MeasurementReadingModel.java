package com.whoop.access.measurementprogress.models;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import hy0.EnumC17727b2;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q41.C29968a;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+,B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ0\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b'\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b)\u0010\u001b¨\u0006-"}, m65681d2 = {"Lcom/whoop/access/measurementprogress/models/MeasurementReadingModel;", "", "", "label", "value", "Lhy0/b2;", "style", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lhy0/b2;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lhy0/b2;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$access_release", "(Lcom/whoop/access/measurementprogress/models/MeasurementReadingModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lhy0/b2;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lhy0/b2;)Lcom/whoop/access/measurementprogress/models/MeasurementReadingModel;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getLabel", "getValue", "Lhy0/b2;", "getStyle", "Companion", "$serializer", "a", "access_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class MeasurementReadingModel {
    public static final int $stable = 0;
    private final String label;
    private final EnumC17727b2 style;
    private final String value;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final InterfaceC23462h[] $childSerializers = {null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C29968a(2))};

    /* JADX INFO: renamed from: com.whoop.access.measurementprogress.models.MeasurementReadingModel$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/access/measurementprogress/models/MeasurementReadingModel$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/access/measurementprogress/models/MeasurementReadingModel;", "serializer", "()Lwc3/c;", "access_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return MeasurementReadingModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ MeasurementReadingModel(int i13, String str, String str2, EnumC17727b2 enumC17727b2, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i13 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 7, MeasurementReadingModel$$serializer.INSTANCE.getDescriptor());
        }
        this.label = str;
        this.value = str2;
        this.style = enumC17727b2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.atomic.atom.TrendTypeState", EnumC17727b2.values());
    }

    public static /* synthetic */ MeasurementReadingModel copy$default(MeasurementReadingModel measurementReadingModel, String str, String str2, EnumC17727b2 enumC17727b2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = measurementReadingModel.label;
        }
        if ((i13 & 2) != 0) {
            str2 = measurementReadingModel.value;
        }
        if ((i13 & 4) != 0) {
            enumC17727b2 = measurementReadingModel.style;
        }
        return measurementReadingModel.copy(str, str2, enumC17727b2);
    }

    public static final /* synthetic */ void write$Self$access_release(MeasurementReadingModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.label);
        output.encodeStringElement(serialDesc, 1, self.value);
        output.encodeNullableSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.style);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final EnumC17727b2 getStyle() {
        return this.style;
    }

    public final MeasurementReadingModel copy(String label, String value, EnumC17727b2 style) {
        AbstractC22676k.m65750j(label, "label");
        AbstractC22676k.m65750j(value, "value");
        return new MeasurementReadingModel(label, value, style);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MeasurementReadingModel)) {
            return false;
        }
        MeasurementReadingModel measurementReadingModel = (MeasurementReadingModel) other;
        return AbstractC22676k.m65745e(this.label, measurementReadingModel.label) && AbstractC22676k.m65745e(this.value, measurementReadingModel.value) && this.style == measurementReadingModel.style;
    }

    public final String getLabel() {
        return this.label;
    }

    public final EnumC17727b2 getStyle() {
        return this.style;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(this.label.hashCode() * 31, 31, this.value);
        EnumC17727b2 enumC17727b2 = this.style;
        return iM30450d + (enumC17727b2 == null ? 0 : enumC17727b2.hashCode());
    }

    public String toString() {
        String str = this.label;
        String str2 = this.value;
        EnumC17727b2 enumC17727b2 = this.style;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("MeasurementReadingModel(label=", str, ", value=", str2, ", style=");
        sbM32001t.append(enumC17727b2);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public MeasurementReadingModel(String label, String value, EnumC17727b2 enumC17727b2) {
        AbstractC22676k.m65750j(label, "label");
        AbstractC22676k.m65750j(value, "value");
        this.label = label;
        this.value = value;
        this.style = enumC17727b2;
    }
}
