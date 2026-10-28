package com.whoop.weeklyplan.api;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.HeaderModel;
import com.whoop.design.models.items.HeaderModel$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.lang.annotation.Annotation;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import mq2.C25888a;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.C37136a;
import wc3.C37140e;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u0000 82\u00020\u0001:\u000298B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0001¢\u0006\u0004\b\t\u0010\nBC\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J8\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0001HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b#\u0010\u001cJ\u0010\u0010$\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010&HÖ\u0003¢\u0006\u0004\b)\u0010*R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010+\u0012\u0004\b-\u0010.\u001a\u0004\b,\u0010\u001aR \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010/\u0012\u0004\b1\u0010.\u001a\u0004\b0\u0010\u001cR \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00102\u0012\u0004\b4\u0010.\u001a\u0004\b3\u0010\u001eR \u0010\b\u001a\u00020\u00018\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u00105\u0012\u0004\b7\u0010.\u001a\u0004\b6\u0010 ¨\u0006:"}, m65681d2 = {"Lcom/whoop/weeklyplan/api/ChallengeLandingCustomPlanCard;", "Lcom/whoop/design/models/DesignSystemModel;", "Lcom/whoop/design/models/items/HeaderModel;", "headerSection", "", "path", "Lcom/whoop/weeklyplan/api/ChallengeLandingLoadingState;", "loadingState", "errorState", "<init>", "(Lcom/whoop/design/models/items/HeaderModel;Ljava/lang/String;Lcom/whoop/weeklyplan/api/ChallengeLandingLoadingState;Lcom/whoop/design/models/DesignSystemModel;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/design/models/items/HeaderModel;Ljava/lang/String;Lcom/whoop/weeklyplan/api/ChallengeLandingLoadingState;Lcom/whoop/design/models/DesignSystemModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$weekly_plan_release", "(Lcom/whoop/weeklyplan/api/ChallengeLandingCustomPlanCard;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/design/models/items/HeaderModel;", "component2", "()Ljava/lang/String;", "component3", "()Lcom/whoop/weeklyplan/api/ChallengeLandingLoadingState;", "component4", "()Lcom/whoop/design/models/DesignSystemModel;", "copy", "(Lcom/whoop/design/models/items/HeaderModel;Ljava/lang/String;Lcom/whoop/weeklyplan/api/ChallengeLandingLoadingState;Lcom/whoop/design/models/DesignSystemModel;)Lcom/whoop/weeklyplan/api/ChallengeLandingCustomPlanCard;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/design/models/items/HeaderModel;", "getHeaderSection", "getHeaderSection$annotations", "()V", "Ljava/lang/String;", "getPath", "getPath$annotations", "Lcom/whoop/weeklyplan/api/ChallengeLandingLoadingState;", "getLoadingState", "getLoadingState$annotations", "Lcom/whoop/design/models/DesignSystemModel;", "getErrorState", "getErrorState$annotations", "Companion", "$serializer", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ChallengeLandingCustomPlanCard implements DesignSystemModel {
    private final DesignSystemModel errorState;
    private final HeaderModel headerSection;
    private final ChallengeLandingLoadingState loadingState;
    private final String path;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C25888a(3))};

    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/weeklyplan/api/ChallengeLandingCustomPlanCard$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/weeklyplan/api/ChallengeLandingCustomPlanCard;", "serializer", "()Lwc3/c;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ChallengeLandingCustomPlanCard$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ChallengeLandingCustomPlanCard(int i13, HeaderModel headerModel, String str, ChallengeLandingLoadingState challengeLandingLoadingState, DesignSystemModel designSystemModel, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i13 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 15, ChallengeLandingCustomPlanCard$$serializer.INSTANCE.getDescriptor());
        }
        this.headerSection = headerModel;
        this.path = str;
        this.loadingState = challengeLandingLoadingState;
        this.errorState = designSystemModel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0]), new InterfaceC37138c[0]);
    }

    public static /* synthetic */ ChallengeLandingCustomPlanCard copy$default(ChallengeLandingCustomPlanCard challengeLandingCustomPlanCard, HeaderModel headerModel, String str, ChallengeLandingLoadingState challengeLandingLoadingState, DesignSystemModel designSystemModel, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            headerModel = challengeLandingCustomPlanCard.headerSection;
        }
        if ((i13 & 2) != 0) {
            str = challengeLandingCustomPlanCard.path;
        }
        if ((i13 & 4) != 0) {
            challengeLandingLoadingState = challengeLandingCustomPlanCard.loadingState;
        }
        if ((i13 & 8) != 0) {
            designSystemModel = challengeLandingCustomPlanCard.errorState;
        }
        return challengeLandingCustomPlanCard.copy(headerModel, str, challengeLandingLoadingState, designSystemModel);
    }

    @InterfaceC37143h("error_state")
    public static /* synthetic */ void getErrorState$annotations() {
    }

    @InterfaceC37143h("header_section")
    public static /* synthetic */ void getHeaderSection$annotations() {
    }

    @InterfaceC37143h("loading_state")
    public static /* synthetic */ void getLoadingState$annotations() {
    }

    @InterfaceC37143h("path")
    public static /* synthetic */ void getPath$annotations() {
    }

    public static final /* synthetic */ void write$Self$weekly_plan_release(ChallengeLandingCustomPlanCard self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, HeaderModel$$serializer.INSTANCE, self.headerSection);
        output.encodeStringElement(serialDesc, 1, self.path);
        output.encodeSerializableElement(serialDesc, 2, ChallengeLandingLoadingState$$serializer.INSTANCE, self.loadingState);
        output.encodeSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.errorState);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final HeaderModel getHeaderSection() {
        return this.headerSection;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final ChallengeLandingLoadingState getLoadingState() {
        return this.loadingState;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final DesignSystemModel getErrorState() {
        return this.errorState;
    }

    public final ChallengeLandingCustomPlanCard copy(HeaderModel headerSection, String path, ChallengeLandingLoadingState loadingState, DesignSystemModel errorState) {
        AbstractC22676k.m65750j(headerSection, "headerSection");
        AbstractC22676k.m65750j(path, "path");
        AbstractC22676k.m65750j(loadingState, "loadingState");
        AbstractC22676k.m65750j(errorState, "errorState");
        return new ChallengeLandingCustomPlanCard(headerSection, path, loadingState, errorState);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChallengeLandingCustomPlanCard)) {
            return false;
        }
        ChallengeLandingCustomPlanCard challengeLandingCustomPlanCard = (ChallengeLandingCustomPlanCard) other;
        return AbstractC22676k.m65745e(this.headerSection, challengeLandingCustomPlanCard.headerSection) && AbstractC22676k.m65745e(this.path, challengeLandingCustomPlanCard.path) && AbstractC22676k.m65745e(this.loadingState, challengeLandingCustomPlanCard.loadingState) && AbstractC22676k.m65745e(this.errorState, challengeLandingCustomPlanCard.errorState);
    }

    public final DesignSystemModel getErrorState() {
        return this.errorState;
    }

    public final HeaderModel getHeaderSection() {
        return this.headerSection;
    }

    public final ChallengeLandingLoadingState getLoadingState() {
        return this.loadingState;
    }

    public final String getPath() {
        return this.path;
    }

    public int hashCode() {
        return this.errorState.hashCode() + ((this.loadingState.hashCode() + AbstractC11266d.m30450d(this.headerSection.hashCode() * 31, 31, this.path)) * 31);
    }

    public String toString() {
        return "ChallengeLandingCustomPlanCard(headerSection=" + this.headerSection + ", path=" + this.path + ", loadingState=" + this.loadingState + ", errorState=" + this.errorState + ")";
    }

    public ChallengeLandingCustomPlanCard(HeaderModel headerSection, String path, ChallengeLandingLoadingState loadingState, DesignSystemModel errorState) {
        AbstractC22676k.m65750j(headerSection, "headerSection");
        AbstractC22676k.m65750j(path, "path");
        AbstractC22676k.m65750j(loadingState, "loadingState");
        AbstractC22676k.m65750j(errorState, "errorState");
        this.headerSection = headerSection;
        this.path = path;
        this.loadingState = loadingState;
        this.errorState = errorState;
    }
}
