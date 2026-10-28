package com.whoop.health.monitor.medical.domain.model;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.CtaTileModel;
import com.whoop.design.models.items.CtaTileModel$$serializer;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0081\b\u0018\u0000 .2\u00020\u0001:\u0002/.B!\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB9\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ.\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b \u0010\u001bJ\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b+\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b-\u0010\u001d¨\u00060"}, m65681d2 = {"Lcom/whoop/health/monitor/medical/domain/model/OnboardingCardModel;", "Lcom/whoop/design/models/DesignSystemModel;", "Lcom/whoop/health/monitor/medical/domain/model/SamdCardHeaderModel;", "header", "", "body", "Lcom/whoop/design/models/items/CtaTileModel;", "cta", "<init>", "(Lcom/whoop/health/monitor/medical/domain/model/SamdCardHeaderModel;Ljava/lang/String;Lcom/whoop/design/models/items/CtaTileModel;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/health/monitor/medical/domain/model/SamdCardHeaderModel;Ljava/lang/String;Lcom/whoop/design/models/items/CtaTileModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$kennel_release", "(Lcom/whoop/health/monitor/medical/domain/model/OnboardingCardModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/health/monitor/medical/domain/model/SamdCardHeaderModel;", "component2", "()Ljava/lang/String;", "component3", "()Lcom/whoop/design/models/items/CtaTileModel;", "copy", "(Lcom/whoop/health/monitor/medical/domain/model/SamdCardHeaderModel;Ljava/lang/String;Lcom/whoop/design/models/items/CtaTileModel;)Lcom/whoop/health/monitor/medical/domain/model/OnboardingCardModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/health/monitor/medical/domain/model/SamdCardHeaderModel;", "getHeader", "Ljava/lang/String;", "getBody", "Lcom/whoop/design/models/items/CtaTileModel;", "getCta", "Companion", "$serializer", "kennel_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class OnboardingCardModel implements DesignSystemModel {
    private final String body;
    private final CtaTileModel cta;
    private final SamdCardHeaderModel header;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = (CtaTileModel.$stable | C9598e.f28134d) | TextResource.$stable;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/health/monitor/medical/domain/model/OnboardingCardModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/health/monitor/medical/domain/model/OnboardingCardModel;", "serializer", "()Lwc3/c;", "kennel_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return OnboardingCardModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ OnboardingCardModel(int i13, SamdCardHeaderModel samdCardHeaderModel, String str, CtaTileModel ctaTileModel, SerializationConstructorMarker serializationConstructorMarker) {
        if (6 != (i13 & 6)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 6, OnboardingCardModel$$serializer.INSTANCE.getDescriptor());
        }
        if ((i13 & 1) == 0) {
            this.header = new SamdCardHeaderModel((TextResource) null, (String) null, (String) null, (C9598e) null, 15, (DefaultConstructorMarker) null);
        } else {
            this.header = samdCardHeaderModel;
        }
        this.body = str;
        this.cta = ctaTileModel;
    }

    public static /* synthetic */ OnboardingCardModel copy$default(OnboardingCardModel onboardingCardModel, SamdCardHeaderModel samdCardHeaderModel, String str, CtaTileModel ctaTileModel, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            samdCardHeaderModel = onboardingCardModel.header;
        }
        if ((i13 & 2) != 0) {
            str = onboardingCardModel.body;
        }
        if ((i13 & 4) != 0) {
            ctaTileModel = onboardingCardModel.cta;
        }
        return onboardingCardModel.copy(samdCardHeaderModel, str, ctaTileModel);
    }

    public static final /* synthetic */ void write$Self$kennel_release(OnboardingCardModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !AbstractC22676k.m65745e(self.header, new SamdCardHeaderModel((TextResource) null, (String) null, (String) null, (C9598e) null, 15, (DefaultConstructorMarker) null))) {
            output.encodeSerializableElement(serialDesc, 0, SamdCardHeaderModel$$serializer.INSTANCE, self.header);
        }
        output.encodeStringElement(serialDesc, 1, self.body);
        output.encodeSerializableElement(serialDesc, 2, CtaTileModel$$serializer.INSTANCE, self.cta);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final SamdCardHeaderModel getHeader() {
        return this.header;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getBody() {
        return this.body;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final CtaTileModel getCta() {
        return this.cta;
    }

    public final OnboardingCardModel copy(SamdCardHeaderModel header, String body, CtaTileModel cta) {
        AbstractC22676k.m65750j(header, "header");
        AbstractC22676k.m65750j(body, "body");
        AbstractC22676k.m65750j(cta, "cta");
        return new OnboardingCardModel(header, body, cta);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OnboardingCardModel)) {
            return false;
        }
        OnboardingCardModel onboardingCardModel = (OnboardingCardModel) other;
        return AbstractC22676k.m65745e(this.header, onboardingCardModel.header) && AbstractC22676k.m65745e(this.body, onboardingCardModel.body) && AbstractC22676k.m65745e(this.cta, onboardingCardModel.cta);
    }

    public final String getBody() {
        return this.body;
    }

    public final CtaTileModel getCta() {
        return this.cta;
    }

    public final SamdCardHeaderModel getHeader() {
        return this.header;
    }

    public int hashCode() {
        return this.cta.hashCode() + AbstractC11266d.m30450d(this.header.hashCode() * 31, 31, this.body);
    }

    public String toString() {
        return "OnboardingCardModel(header=" + this.header + ", body=" + this.body + ", cta=" + this.cta + ")";
    }

    public OnboardingCardModel(SamdCardHeaderModel header, String body, CtaTileModel cta) {
        AbstractC22676k.m65750j(header, "header");
        AbstractC22676k.m65750j(body, "body");
        AbstractC22676k.m65750j(cta, "cta");
        this.header = header;
        this.body = body;
        this.cta = cta;
    }

    public /* synthetic */ OnboardingCardModel(SamdCardHeaderModel samdCardHeaderModel, String str, CtaTileModel ctaTileModel, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? new SamdCardHeaderModel((TextResource) null, (String) null, (String) null, (C9598e) null, 15, (DefaultConstructorMarker) null) : samdCardHeaderModel, str, ctaTileModel);
    }
}
