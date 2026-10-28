package com.whoop.hormonalinsights.postpartum.domain.models;

import c13.AbstractC3855a;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import gp1.C16065a;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;
import zn1.C40906a;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000210B'\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nB?\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ6\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b-\u0010\u001cR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b/\u0010\u001e¨\u00062"}, m65681d2 = {"Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumResponse;", "", "Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;", "initialPregnancyScreen", "Lcom/whoop/hormonalinsights/postpartum/domain/models/CongratulationsScreen;", "congratulationsScreen", "", "Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreen;", "screens", "<init>", "(Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;Lcom/whoop/hormonalinsights/postpartum/domain/models/CongratulationsScreen;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;Lcom/whoop/hormonalinsights/postpartum/domain/models/CongratulationsScreen;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$hormonal_insights_release", "(Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumResponse;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;", "component2", "()Lcom/whoop/hormonalinsights/postpartum/domain/models/CongratulationsScreen;", "component3", "()Ljava/util/List;", "copy", "(Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;Lcom/whoop/hormonalinsights/postpartum/domain/models/CongratulationsScreen;Ljava/util/List;)Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumResponse;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;", "getInitialPregnancyScreen", "Lcom/whoop/hormonalinsights/postpartum/domain/models/CongratulationsScreen;", "getCongratulationsScreen", "Ljava/util/List;", "getScreens", "Companion", "$serializer", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class PostPartumResponse {
    private static final InterfaceC23462h[] $childSerializers;
    private final CongratulationsScreen congratulationsScreen;
    private final HormonalScreenId initialPregnancyScreen;
    private final List<HormonalScreen> screens;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumResponse$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumResponse;", "serializer", "()Lwc3/c;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return PostPartumResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{AbstractC30060g.m92087G(enumC23463i, new C16065a(5)), null, AbstractC30060g.m92087G(enumC23463i, new C16065a(6))};
    }

    public /* synthetic */ PostPartumResponse(int i13, HormonalScreenId hormonalScreenId, CongratulationsScreen congratulationsScreen, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i13 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 7, PostPartumResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.initialPregnancyScreen = hormonalScreenId;
        this.congratulationsScreen = congratulationsScreen;
        this.screens = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.hormonalinsights.postpartum.domain.models.HormonalScreenId", HormonalScreenId.values());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new ArrayListSerializer(C40906a.f176311a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PostPartumResponse copy$default(PostPartumResponse postPartumResponse, HormonalScreenId hormonalScreenId, CongratulationsScreen congratulationsScreen, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            hormonalScreenId = postPartumResponse.initialPregnancyScreen;
        }
        if ((i13 & 2) != 0) {
            congratulationsScreen = postPartumResponse.congratulationsScreen;
        }
        if ((i13 & 4) != 0) {
            list = postPartumResponse.screens;
        }
        return postPartumResponse.copy(hormonalScreenId, congratulationsScreen, list);
    }

    public static final /* synthetic */ void write$Self$hormonal_insights_release(PostPartumResponse self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeNullableSerializableElement(serialDesc, 0, (InterfaceC37145j) interfaceC23462hArr[0].getValue(), self.initialPregnancyScreen);
        output.encodeSerializableElement(serialDesc, 1, CongratulationsScreen$$serializer.INSTANCE, self.congratulationsScreen);
        output.encodeSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.screens);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final HormonalScreenId getInitialPregnancyScreen() {
        return this.initialPregnancyScreen;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final CongratulationsScreen getCongratulationsScreen() {
        return this.congratulationsScreen;
    }

    public final List<HormonalScreen> component3() {
        return this.screens;
    }

    public final PostPartumResponse copy(HormonalScreenId initialPregnancyScreen, CongratulationsScreen congratulationsScreen, List<HormonalScreen> screens) {
        AbstractC22676k.m65750j(congratulationsScreen, "congratulationsScreen");
        AbstractC22676k.m65750j(screens, "screens");
        return new PostPartumResponse(initialPregnancyScreen, congratulationsScreen, screens);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PostPartumResponse)) {
            return false;
        }
        PostPartumResponse postPartumResponse = (PostPartumResponse) other;
        return this.initialPregnancyScreen == postPartumResponse.initialPregnancyScreen && AbstractC22676k.m65745e(this.congratulationsScreen, postPartumResponse.congratulationsScreen) && AbstractC22676k.m65745e(this.screens, postPartumResponse.screens);
    }

    public final CongratulationsScreen getCongratulationsScreen() {
        return this.congratulationsScreen;
    }

    public final HormonalScreenId getInitialPregnancyScreen() {
        return this.initialPregnancyScreen;
    }

    public final List<HormonalScreen> getScreens() {
        return this.screens;
    }

    public int hashCode() {
        HormonalScreenId hormonalScreenId = this.initialPregnancyScreen;
        return this.screens.hashCode() + ((this.congratulationsScreen.hashCode() + ((hormonalScreenId == null ? 0 : hormonalScreenId.hashCode()) * 31)) * 31);
    }

    public String toString() {
        HormonalScreenId hormonalScreenId = this.initialPregnancyScreen;
        CongratulationsScreen congratulationsScreen = this.congratulationsScreen;
        List<HormonalScreen> list = this.screens;
        StringBuilder sb4 = new StringBuilder("PostPartumResponse(initialPregnancyScreen=");
        sb4.append(hormonalScreenId);
        sb4.append(", congratulationsScreen=");
        sb4.append(congratulationsScreen);
        sb4.append(", screens=");
        return AbstractC3855a.m11829m(sb4, list, ")");
    }

    public PostPartumResponse(HormonalScreenId hormonalScreenId, CongratulationsScreen congratulationsScreen, List<HormonalScreen> screens) {
        AbstractC22676k.m65750j(congratulationsScreen, "congratulationsScreen");
        AbstractC22676k.m65750j(screens, "screens");
        this.initialPregnancyScreen = hormonalScreenId;
        this.congratulationsScreen = congratulationsScreen;
        this.screens = screens;
    }
}
