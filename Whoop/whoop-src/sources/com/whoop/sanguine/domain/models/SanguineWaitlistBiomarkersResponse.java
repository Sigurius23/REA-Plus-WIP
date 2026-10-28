package com.whoop.sanguine.domain.models;

import c13.AbstractC3855a;
import com.whoop.design.models.items.BiomarkerModel;
import com.whoop.design.models.items.BiomarkerModel$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import ty1.C34260e;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002,-B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tB?\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ4\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0019J\u0010\u0010 \u001a\u00020\nHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b(\u0010\u0019R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b*\u0010\u001c¨\u0006."}, m65681d2 = {"Lcom/whoop/sanguine/domain/models/SanguineWaitlistBiomarkersResponse;", "", "", "pageHeader", "searchPlaceholder", "", "Lcom/whoop/design/models/items/BiomarkerModel;", "biomarkers", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$sanguine_release", "(Lcom/whoop/sanguine/domain/models/SanguineWaitlistBiomarkersResponse;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/whoop/sanguine/domain/models/SanguineWaitlistBiomarkersResponse;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPageHeader", "getSearchPlaceholder", "Ljava/util/List;", "getBiomarkers", "Companion", "$serializer", "a", "sanguine_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class SanguineWaitlistBiomarkersResponse {
    private final List<BiomarkerModel> biomarkers;
    private final String pageHeader;
    private final String searchPlaceholder;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C34260e(10))};

    /* JADX INFO: renamed from: com.whoop.sanguine.domain.models.SanguineWaitlistBiomarkersResponse$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/sanguine/domain/models/SanguineWaitlistBiomarkersResponse$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/sanguine/domain/models/SanguineWaitlistBiomarkersResponse;", "serializer", "()Lwc3/c;", "sanguine_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return SanguineWaitlistBiomarkersResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ SanguineWaitlistBiomarkersResponse(int i13, String str, String str2, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i13 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 7, SanguineWaitlistBiomarkersResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.pageHeader = str;
        this.searchPlaceholder = str2;
        this.biomarkers = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(BiomarkerModel$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SanguineWaitlistBiomarkersResponse copy$default(SanguineWaitlistBiomarkersResponse sanguineWaitlistBiomarkersResponse, String str, String str2, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = sanguineWaitlistBiomarkersResponse.pageHeader;
        }
        if ((i13 & 2) != 0) {
            str2 = sanguineWaitlistBiomarkersResponse.searchPlaceholder;
        }
        if ((i13 & 4) != 0) {
            list = sanguineWaitlistBiomarkersResponse.biomarkers;
        }
        return sanguineWaitlistBiomarkersResponse.copy(str, str2, list);
    }

    public static final /* synthetic */ void write$Self$sanguine_release(SanguineWaitlistBiomarkersResponse self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.pageHeader);
        output.encodeStringElement(serialDesc, 1, self.searchPlaceholder);
        output.encodeSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.biomarkers);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPageHeader() {
        return this.pageHeader;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSearchPlaceholder() {
        return this.searchPlaceholder;
    }

    public final List<BiomarkerModel> component3() {
        return this.biomarkers;
    }

    public final SanguineWaitlistBiomarkersResponse copy(String pageHeader, String searchPlaceholder, List<BiomarkerModel> biomarkers) {
        AbstractC22676k.m65750j(pageHeader, "pageHeader");
        AbstractC22676k.m65750j(searchPlaceholder, "searchPlaceholder");
        AbstractC22676k.m65750j(biomarkers, "biomarkers");
        return new SanguineWaitlistBiomarkersResponse(pageHeader, searchPlaceholder, biomarkers);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SanguineWaitlistBiomarkersResponse)) {
            return false;
        }
        SanguineWaitlistBiomarkersResponse sanguineWaitlistBiomarkersResponse = (SanguineWaitlistBiomarkersResponse) other;
        return AbstractC22676k.m65745e(this.pageHeader, sanguineWaitlistBiomarkersResponse.pageHeader) && AbstractC22676k.m65745e(this.searchPlaceholder, sanguineWaitlistBiomarkersResponse.searchPlaceholder) && AbstractC22676k.m65745e(this.biomarkers, sanguineWaitlistBiomarkersResponse.biomarkers);
    }

    public final List<BiomarkerModel> getBiomarkers() {
        return this.biomarkers;
    }

    public final String getPageHeader() {
        return this.pageHeader;
    }

    public final String getSearchPlaceholder() {
        return this.searchPlaceholder;
    }

    public int hashCode() {
        return this.biomarkers.hashCode() + AbstractC11266d.m30450d(this.pageHeader.hashCode() * 31, 31, this.searchPlaceholder);
    }

    public String toString() {
        String str = this.pageHeader;
        String str2 = this.searchPlaceholder;
        return AbstractC3855a.m11829m(AbstractC11895b.m32001t("SanguineWaitlistBiomarkersResponse(pageHeader=", str, ", searchPlaceholder=", str2, ", biomarkers="), this.biomarkers, ")");
    }

    public SanguineWaitlistBiomarkersResponse(String pageHeader, String searchPlaceholder, List<BiomarkerModel> biomarkers) {
        AbstractC22676k.m65750j(pageHeader, "pageHeader");
        AbstractC22676k.m65750j(searchPlaceholder, "searchPlaceholder");
        AbstractC22676k.m65750j(biomarkers, "biomarkers");
        this.pageHeader = pageHeader;
        this.searchPlaceholder = searchPlaceholder;
        this.biomarkers = biomarkers;
    }
}
