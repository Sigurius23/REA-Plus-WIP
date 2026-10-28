package com.whoop.advancedlabs.domain.models;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import hc3.AbstractC17176i;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import tb0.C33690a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 :2\u00020\u0001:\u0002;:B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eBS\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b%\u0010&JJ\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b)\u0010$J\u0010\u0010*\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b*\u0010+J\u001a\u0010.\u001a\u00020-2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b.\u0010/R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00100\u001a\u0004\b1\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00102\u001a\u0004\b3\u0010 R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u00104\u001a\u0004\b5\u0010\"R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u00106\u001a\u0004\b7\u0010$R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00108\u001a\u0004\b9\u0010&¨\u0006<"}, m65681d2 = {"Lcom/whoop/advancedlabs/domain/models/SchedulePrimerResponse;", "", "Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;", "navigationBar", "Lcom/whoop/advancedlabs/domain/models/SchedulePrimerHeaderModel;", "header", "", "Lcom/whoop/advancedlabs/domain/models/AdvancedLabsSectionModel;", "sections", "", "label", "Lcom/whoop/advancedlabs/domain/models/SchedulePrimerFooterModel;", "footer", "<init>", "(Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;Lcom/whoop/advancedlabs/domain/models/SchedulePrimerHeaderModel;Ljava/util/List;Ljava/lang/String;Lcom/whoop/advancedlabs/domain/models/SchedulePrimerFooterModel;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/advancedlabs/domain/models/NavigationBarModel;Lcom/whoop/advancedlabs/domain/models/SchedulePrimerHeaderModel;Ljava/util/List;Ljava/lang/String;Lcom/whoop/advancedlabs/domain/models/SchedulePrimerFooterModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$advanced_labs_release", "(Lcom/whoop/advancedlabs/domain/models/SchedulePrimerResponse;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;", "component2", "()Lcom/whoop/advancedlabs/domain/models/SchedulePrimerHeaderModel;", "component3", "()Ljava/util/List;", "component4", "()Ljava/lang/String;", "component5", "()Lcom/whoop/advancedlabs/domain/models/SchedulePrimerFooterModel;", "copy", "(Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;Lcom/whoop/advancedlabs/domain/models/SchedulePrimerHeaderModel;Ljava/util/List;Ljava/lang/String;Lcom/whoop/advancedlabs/domain/models/SchedulePrimerFooterModel;)Lcom/whoop/advancedlabs/domain/models/SchedulePrimerResponse;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;", "getNavigationBar", "Lcom/whoop/advancedlabs/domain/models/SchedulePrimerHeaderModel;", "getHeader", "Ljava/util/List;", "getSections", "Ljava/lang/String;", "getLabel", "Lcom/whoop/advancedlabs/domain/models/SchedulePrimerFooterModel;", "getFooter", "Companion", "$serializer", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class SchedulePrimerResponse {
    private final SchedulePrimerFooterModel footer;
    private final SchedulePrimerHeaderModel header;
    private final String label;
    private final NavigationBarModel navigationBar;
    private final List<AdvancedLabsSectionModel> sections;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C33690a(22)), null, null};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/advancedlabs/domain/models/SchedulePrimerResponse$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/advancedlabs/domain/models/SchedulePrimerResponse;", "serializer", "()Lwc3/c;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return SchedulePrimerResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ SchedulePrimerResponse(int i13, NavigationBarModel navigationBarModel, SchedulePrimerHeaderModel schedulePrimerHeaderModel, List list, String str, SchedulePrimerFooterModel schedulePrimerFooterModel, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i13 & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 31, SchedulePrimerResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.navigationBar = navigationBarModel;
        this.header = schedulePrimerHeaderModel;
        this.sections = list;
        this.label = str;
        this.footer = schedulePrimerFooterModel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(AdvancedLabsSectionModel$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SchedulePrimerResponse copy$default(SchedulePrimerResponse schedulePrimerResponse, NavigationBarModel navigationBarModel, SchedulePrimerHeaderModel schedulePrimerHeaderModel, List list, String str, SchedulePrimerFooterModel schedulePrimerFooterModel, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            navigationBarModel = schedulePrimerResponse.navigationBar;
        }
        if ((i13 & 2) != 0) {
            schedulePrimerHeaderModel = schedulePrimerResponse.header;
        }
        if ((i13 & 4) != 0) {
            list = schedulePrimerResponse.sections;
        }
        if ((i13 & 8) != 0) {
            str = schedulePrimerResponse.label;
        }
        if ((i13 & 16) != 0) {
            schedulePrimerFooterModel = schedulePrimerResponse.footer;
        }
        SchedulePrimerFooterModel schedulePrimerFooterModel2 = schedulePrimerFooterModel;
        List list2 = list;
        return schedulePrimerResponse.copy(navigationBarModel, schedulePrimerHeaderModel, list2, str, schedulePrimerFooterModel2);
    }

    public static final /* synthetic */ void write$Self$advanced_labs_release(SchedulePrimerResponse self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, NavigationBarModel$$serializer.INSTANCE, self.navigationBar);
        output.encodeSerializableElement(serialDesc, 1, SchedulePrimerHeaderModel$$serializer.INSTANCE, self.header);
        output.encodeSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.sections);
        output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.label);
        output.encodeSerializableElement(serialDesc, 4, SchedulePrimerFooterModel$$serializer.INSTANCE, self.footer);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final NavigationBarModel getNavigationBar() {
        return this.navigationBar;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final SchedulePrimerHeaderModel getHeader() {
        return this.header;
    }

    public final List<AdvancedLabsSectionModel> component3() {
        return this.sections;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final SchedulePrimerFooterModel getFooter() {
        return this.footer;
    }

    public final SchedulePrimerResponse copy(NavigationBarModel navigationBar, SchedulePrimerHeaderModel header, List<AdvancedLabsSectionModel> sections, String label, SchedulePrimerFooterModel footer) {
        AbstractC22676k.m65750j(navigationBar, "navigationBar");
        AbstractC22676k.m65750j(header, "header");
        AbstractC22676k.m65750j(sections, "sections");
        AbstractC22676k.m65750j(footer, "footer");
        return new SchedulePrimerResponse(navigationBar, header, sections, label, footer);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SchedulePrimerResponse)) {
            return false;
        }
        SchedulePrimerResponse schedulePrimerResponse = (SchedulePrimerResponse) other;
        return AbstractC22676k.m65745e(this.navigationBar, schedulePrimerResponse.navigationBar) && AbstractC22676k.m65745e(this.header, schedulePrimerResponse.header) && AbstractC22676k.m65745e(this.sections, schedulePrimerResponse.sections) && AbstractC22676k.m65745e(this.label, schedulePrimerResponse.label) && AbstractC22676k.m65745e(this.footer, schedulePrimerResponse.footer);
    }

    public final SchedulePrimerFooterModel getFooter() {
        return this.footer;
    }

    public final SchedulePrimerHeaderModel getHeader() {
        return this.header;
    }

    public final String getLabel() {
        return this.label;
    }

    public final NavigationBarModel getNavigationBar() {
        return this.navigationBar;
    }

    public final List<AdvancedLabsSectionModel> getSections() {
        return this.sections;
    }

    public int hashCode() {
        int iM31983b = AbstractC11895b.m31983b((this.header.hashCode() + (this.navigationBar.hashCode() * 31)) * 31, 31, this.sections);
        String str = this.label;
        return this.footer.hashCode() + ((iM31983b + (str == null ? 0 : str.hashCode())) * 31);
    }

    public String toString() {
        NavigationBarModel navigationBarModel = this.navigationBar;
        SchedulePrimerHeaderModel schedulePrimerHeaderModel = this.header;
        List<AdvancedLabsSectionModel> list = this.sections;
        String str = this.label;
        SchedulePrimerFooterModel schedulePrimerFooterModel = this.footer;
        StringBuilder sb4 = new StringBuilder("SchedulePrimerResponse(navigationBar=");
        sb4.append(navigationBarModel);
        sb4.append(", header=");
        sb4.append(schedulePrimerHeaderModel);
        sb4.append(", sections=");
        AbstractC17176i.m48511m(", label=", str, ", footer=", sb4, list);
        sb4.append(schedulePrimerFooterModel);
        sb4.append(")");
        return sb4.toString();
    }

    public SchedulePrimerResponse(NavigationBarModel navigationBar, SchedulePrimerHeaderModel header, List<AdvancedLabsSectionModel> sections, String str, SchedulePrimerFooterModel footer) {
        AbstractC22676k.m65750j(navigationBar, "navigationBar");
        AbstractC22676k.m65750j(header, "header");
        AbstractC22676k.m65750j(sections, "sections");
        AbstractC22676k.m65750j(footer, "footer");
        this.navigationBar = navigationBar;
        this.header = header;
        this.sections = sections;
        this.label = str;
        this.footer = footer;
    }
}
