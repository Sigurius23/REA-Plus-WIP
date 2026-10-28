package com.whoop.whooplabs.data.remote.domain.dto.bff;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import com.whoop.whooplabs.data.domain.LabsCampaign;
import dx2.C12430a;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yb3.AbstractC39421y;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0087\b\u0018\u0000 22\u00020\u0001:\u000232B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB?\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b \u0010!J4\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020$HÖ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010*\u001a\u00020\u00192\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b*\u0010+R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010\u001dR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010.\u001a\u0004\b/\u0010\u001fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u00100\u001a\u0004\b1\u0010!¨\u00064"}, m65681d2 = {"Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepsScreenResponse;", "", "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;", "config", "", "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;", "steps", "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/SessionResponse;", "session", "<init>", "(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;Ljava/util/List;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/SessionResponse;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;Ljava/util/List;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/SessionResponse;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$whooplabs_release", "(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepsScreenResponse;Lzc3/c;Lyc3/g;)V", "write$Self", "", "isStrapRequired", "()Z", "component1", "()Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;", "component2", "()Ljava/util/List;", "component3", "()Lcom/whoop/whooplabs/data/remote/domain/dto/bff/SessionResponse;", "copy", "(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;Ljava/util/List;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/SessionResponse;)Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepsScreenResponse;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;", "getConfig", "Ljava/util/List;", "getSteps", "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/SessionResponse;", "getSession", "Companion", "$serializer", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class CampaignStepsScreenResponse {
    private final CampaignStepConfigResponse config;
    private final SessionResponse session;
    private final List<CampaignStepResponse> steps;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C12430a(1)), null};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepsScreenResponse$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepsScreenResponse;", "serializer", "()Lwc3/c;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return CampaignStepsScreenResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ CampaignStepsScreenResponse(int i13, CampaignStepConfigResponse campaignStepConfigResponse, List list, SessionResponse sessionResponse, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i13 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 7, CampaignStepsScreenResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.config = campaignStepConfigResponse;
        this.steps = list;
        this.session = sessionResponse;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(CampaignStepResponse$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CampaignStepsScreenResponse copy$default(CampaignStepsScreenResponse campaignStepsScreenResponse, CampaignStepConfigResponse campaignStepConfigResponse, List list, SessionResponse sessionResponse, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            campaignStepConfigResponse = campaignStepsScreenResponse.config;
        }
        if ((i13 & 2) != 0) {
            list = campaignStepsScreenResponse.steps;
        }
        if ((i13 & 4) != 0) {
            sessionResponse = campaignStepsScreenResponse.session;
        }
        return campaignStepsScreenResponse.copy(campaignStepConfigResponse, list, sessionResponse);
    }

    public static final /* synthetic */ void write$Self$whooplabs_release(CampaignStepsScreenResponse self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, CampaignStepConfigResponse$$serializer.INSTANCE, self.config);
        output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.steps);
        output.encodeSerializableElement(serialDesc, 2, SessionResponse$$serializer.INSTANCE, self.session);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final CampaignStepConfigResponse getConfig() {
        return this.config;
    }

    public final List<CampaignStepResponse> component2() {
        return this.steps;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final SessionResponse getSession() {
        return this.session;
    }

    public final CampaignStepsScreenResponse copy(CampaignStepConfigResponse config, List<CampaignStepResponse> steps, SessionResponse session) {
        AbstractC22676k.m65750j(config, "config");
        AbstractC22676k.m65750j(steps, "steps");
        AbstractC22676k.m65750j(session, "session");
        return new CampaignStepsScreenResponse(config, steps, session);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CampaignStepsScreenResponse)) {
            return false;
        }
        CampaignStepsScreenResponse campaignStepsScreenResponse = (CampaignStepsScreenResponse) other;
        return AbstractC22676k.m65745e(this.config, campaignStepsScreenResponse.config) && AbstractC22676k.m65745e(this.steps, campaignStepsScreenResponse.steps) && AbstractC22676k.m65745e(this.session, campaignStepsScreenResponse.session);
    }

    public final CampaignStepConfigResponse getConfig() {
        return this.config;
    }

    public final SessionResponse getSession() {
        return this.session;
    }

    public final List<CampaignStepResponse> getSteps() {
        return this.steps;
    }

    public int hashCode() {
        return this.session.hashCode() + AbstractC11895b.m31983b(this.config.hashCode() * 31, 31, this.steps);
    }

    public final boolean isStrapRequired() {
        List<String> dataTypes = this.config.getDataTypes();
        if (!(dataTypes instanceof Collection) || !dataTypes.isEmpty()) {
            for (String str : dataTypes) {
                Locale locale = Locale.ROOT;
                String lowerCase = str.toLowerCase(locale);
                AbstractC22676k.m65749i(lowerCase, "toLowerCase(...)");
                if (lowerCase.equals(LabsCampaign.RAW_ENTRY)) {
                    return true;
                }
                String lowerCase2 = str.toLowerCase(locale);
                AbstractC22676k.m65749i(lowerCase2, "toLowerCase(...)");
                if (lowerCase2.equals(LabsCampaign.PPG_ENTRY)) {
                    return true;
                }
                String lowerCase3 = str.toLowerCase(locale);
                AbstractC22676k.m65749i(lowerCase3, "toLowerCase(...)");
                if (lowerCase3.equals(LabsCampaign.IMU_ENTRY)) {
                    return true;
                }
                String lowerCase4 = str.toLowerCase(locale);
                AbstractC22676k.m65749i(lowerCase4, "toLowerCase(...)");
                if (AbstractC39421y.m125930O(lowerCase4, LabsCampaign.LABRADOR_ENTRY, false)) {
                    return true;
                }
            }
        }
        return false;
    }

    public String toString() {
        return "CampaignStepsScreenResponse(config=" + this.config + ", steps=" + this.steps + ", session=" + this.session + ")";
    }

    public CampaignStepsScreenResponse(CampaignStepConfigResponse config, List<CampaignStepResponse> steps, SessionResponse session) {
        AbstractC22676k.m65750j(config, "config");
        AbstractC22676k.m65750j(steps, "steps");
        AbstractC22676k.m65750j(session, "session");
        this.config = config;
        this.steps = steps;
        this.session = session;
    }
}
