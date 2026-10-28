package com.whoop.design.models;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC30802r;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002-,B)\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tB?\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J8\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0019J\u0010\u0010 \u001a\u00020\nHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0019R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b*\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010'\u001a\u0004\b+\u0010\u0019¨\u0006."}, m65681d2 = {"Lcom/whoop/design/models/ImpactMagnitudeTileModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "magnitudeHeaderDisplay", "", "Lcom/whoop/design/models/MagnitudeDetailCardModel;", "magnitudeCards", "magnitudeCalloutDisplay", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/ImpactMagnitudeTileModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)Lcom/whoop/design/models/ImpactMagnitudeTileModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getMagnitudeHeaderDisplay", "Ljava/util/List;", "getMagnitudeCards", "getMagnitudeCalloutDisplay", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ImpactMagnitudeTileModel implements DesignSystemModel {
    private final String magnitudeCalloutDisplay;
    private final List<MagnitudeDetailCardModel> magnitudeCards;
    private final String magnitudeHeaderDisplay;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C6909a(3)), null};

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/ImpactMagnitudeTileModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/ImpactMagnitudeTileModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ImpactMagnitudeTileModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ImpactMagnitudeTileModel(int i13, String str, List list, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i13 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 7, ImpactMagnitudeTileModel$$serializer.INSTANCE.getDescriptor());
        }
        this.magnitudeHeaderDisplay = str;
        this.magnitudeCards = list;
        this.magnitudeCalloutDisplay = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(MagnitudeDetailCardModel$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ImpactMagnitudeTileModel copy$default(ImpactMagnitudeTileModel impactMagnitudeTileModel, String str, List list, String str2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = impactMagnitudeTileModel.magnitudeHeaderDisplay;
        }
        if ((i13 & 2) != 0) {
            list = impactMagnitudeTileModel.magnitudeCards;
        }
        if ((i13 & 4) != 0) {
            str2 = impactMagnitudeTileModel.magnitudeCalloutDisplay;
        }
        return impactMagnitudeTileModel.copy(str, list, str2);
    }

    public static final /* synthetic */ void write$Self$design_models_release(ImpactMagnitudeTileModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 0, stringSerializer, self.magnitudeHeaderDisplay);
        output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.magnitudeCards);
        output.encodeNullableSerializableElement(serialDesc, 2, stringSerializer, self.magnitudeCalloutDisplay);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMagnitudeHeaderDisplay() {
        return this.magnitudeHeaderDisplay;
    }

    public final List<MagnitudeDetailCardModel> component2() {
        return this.magnitudeCards;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMagnitudeCalloutDisplay() {
        return this.magnitudeCalloutDisplay;
    }

    public final ImpactMagnitudeTileModel copy(String magnitudeHeaderDisplay, List<MagnitudeDetailCardModel> magnitudeCards, String magnitudeCalloutDisplay) {
        AbstractC22676k.m65750j(magnitudeCards, "magnitudeCards");
        return new ImpactMagnitudeTileModel(magnitudeHeaderDisplay, magnitudeCards, magnitudeCalloutDisplay);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ImpactMagnitudeTileModel)) {
            return false;
        }
        ImpactMagnitudeTileModel impactMagnitudeTileModel = (ImpactMagnitudeTileModel) other;
        return AbstractC22676k.m65745e(this.magnitudeHeaderDisplay, impactMagnitudeTileModel.magnitudeHeaderDisplay) && AbstractC22676k.m65745e(this.magnitudeCards, impactMagnitudeTileModel.magnitudeCards) && AbstractC22676k.m65745e(this.magnitudeCalloutDisplay, impactMagnitudeTileModel.magnitudeCalloutDisplay);
    }

    public final String getMagnitudeCalloutDisplay() {
        return this.magnitudeCalloutDisplay;
    }

    public final List<MagnitudeDetailCardModel> getMagnitudeCards() {
        return this.magnitudeCards;
    }

    public final String getMagnitudeHeaderDisplay() {
        return this.magnitudeHeaderDisplay;
    }

    public int hashCode() {
        String str = this.magnitudeHeaderDisplay;
        int iM31983b = AbstractC11895b.m31983b((str == null ? 0 : str.hashCode()) * 31, 31, this.magnitudeCards);
        String str2 = this.magnitudeCalloutDisplay;
        return iM31983b + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return AbstractC25012a.m73376i(this.magnitudeCalloutDisplay, ")", AbstractC30802r.m94766o("ImpactMagnitudeTileModel(magnitudeHeaderDisplay=", this.magnitudeHeaderDisplay, ", magnitudeCards=", ", magnitudeCalloutDisplay=", this.magnitudeCards));
    }

    public ImpactMagnitudeTileModel(String str, List<MagnitudeDetailCardModel> magnitudeCards, String str2) {
        AbstractC22676k.m65750j(magnitudeCards, "magnitudeCards");
        this.magnitudeHeaderDisplay = str;
        this.magnitudeCards = magnitudeCards;
        this.magnitudeCalloutDisplay = str2;
    }
}
