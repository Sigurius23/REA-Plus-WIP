package com.whoop.homecustomization.domain.models;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import gm2.C15999a;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p127ev.AbstractC13673n;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0002'&B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007B;\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J0\u0010\u0019\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b$\u0010\u0017R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b%\u0010\u0017¨\u0006("}, m65681d2 = {"Lcom/whoop/homecustomization/domain/models/CustomizeOverviewDomainBody;", "", "", "", "pinnedMetrics", "gaugeMetrics", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$home_customization_release", "(Lcom/whoop/homecustomization/domain/models/CustomizeOverviewDomainBody;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "copy", "(Ljava/util/List;Ljava/util/List;)Lcom/whoop/homecustomization/domain/models/CustomizeOverviewDomainBody;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getPinnedMetrics", "getGaugeMetrics", "Companion", "$serializer", "home-customization_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class CustomizeOverviewDomainBody {
    private static final InterfaceC23462h[] $childSerializers;
    private final List<String> gaugeMetrics;
    private final List<String> pinnedMetrics;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/homecustomization/domain/models/CustomizeOverviewDomainBody$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/homecustomization/domain/models/CustomizeOverviewDomainBody;", "serializer", "()Lwc3/c;", "home-customization_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return CustomizeOverviewDomainBody$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{AbstractC30060g.m92087G(enumC23463i, new C15999a(1)), AbstractC30060g.m92087G(enumC23463i, new C15999a(2))};
    }

    public /* synthetic */ CustomizeOverviewDomainBody(int i13, List list, List list2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i13 & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 3, CustomizeOverviewDomainBody$$serializer.INSTANCE.getDescriptor());
        }
        this.pinnedMetrics = list;
        this.gaugeMetrics = list2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(StringSerializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new ArrayListSerializer(StringSerializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CustomizeOverviewDomainBody copy$default(CustomizeOverviewDomainBody customizeOverviewDomainBody, List list, List list2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = customizeOverviewDomainBody.pinnedMetrics;
        }
        if ((i13 & 2) != 0) {
            list2 = customizeOverviewDomainBody.gaugeMetrics;
        }
        return customizeOverviewDomainBody.copy(list, list2);
    }

    public static final /* synthetic */ void write$Self$home_customization_release(CustomizeOverviewDomainBody self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, (InterfaceC37145j) interfaceC23462hArr[0].getValue(), self.pinnedMetrics);
        output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.gaugeMetrics);
    }

    public final List<String> component1() {
        return this.pinnedMetrics;
    }

    public final List<String> component2() {
        return this.gaugeMetrics;
    }

    public final CustomizeOverviewDomainBody copy(List<String> pinnedMetrics, List<String> gaugeMetrics) {
        AbstractC22676k.m65750j(pinnedMetrics, "pinnedMetrics");
        AbstractC22676k.m65750j(gaugeMetrics, "gaugeMetrics");
        return new CustomizeOverviewDomainBody(pinnedMetrics, gaugeMetrics);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CustomizeOverviewDomainBody)) {
            return false;
        }
        CustomizeOverviewDomainBody customizeOverviewDomainBody = (CustomizeOverviewDomainBody) other;
        return AbstractC22676k.m65745e(this.pinnedMetrics, customizeOverviewDomainBody.pinnedMetrics) && AbstractC22676k.m65745e(this.gaugeMetrics, customizeOverviewDomainBody.gaugeMetrics);
    }

    public final List<String> getGaugeMetrics() {
        return this.gaugeMetrics;
    }

    public final List<String> getPinnedMetrics() {
        return this.pinnedMetrics;
    }

    public int hashCode() {
        return this.gaugeMetrics.hashCode() + (this.pinnedMetrics.hashCode() * 31);
    }

    public String toString() {
        return AbstractC13673n.m38562i("CustomizeOverviewDomainBody(pinnedMetrics=", ", gaugeMetrics=", this.pinnedMetrics, ")", this.gaugeMetrics);
    }

    public CustomizeOverviewDomainBody(List<String> pinnedMetrics, List<String> gaugeMetrics) {
        AbstractC22676k.m65750j(pinnedMetrics, "pinnedMetrics");
        AbstractC22676k.m65750j(gaugeMetrics, "gaugeMetrics");
        this.pinnedMetrics = pinnedMetrics;
        this.gaugeMetrics = gaugeMetrics;
    }
}
