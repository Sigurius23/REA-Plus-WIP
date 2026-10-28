package com.whoop.referafriend.domain.models;

import com.whoop.navigation.C9598e;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002.-B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tBC\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0010\u0010\u001c\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ8\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0019J\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b)\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b*\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b,\u0010\u001d¨\u0006/"}, m65681d2 = {"Lcom/whoop/referafriend/domain/models/PromotionRewardModalContentModel;", "", "", "code", "title", "body", "Lcom/whoop/referafriend/domain/models/RafHubCTA;", "cta", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/referafriend/domain/models/RafHubCTA;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/referafriend/domain/models/RafHubCTA;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$refer_a_friend_release", "(Lcom/whoop/referafriend/domain/models/PromotionRewardModalContentModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/whoop/referafriend/domain/models/RafHubCTA;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/referafriend/domain/models/RafHubCTA;)Lcom/whoop/referafriend/domain/models/PromotionRewardModalContentModel;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCode", "getTitle", "getBody", "Lcom/whoop/referafriend/domain/models/RafHubCTA;", "getCta", "Companion", "$serializer", "refer-a-friend_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class PromotionRewardModalContentModel {
    private final String body;
    private final String code;
    private final RafHubCTA cta;
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = C9598e.f28134d;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/referafriend/domain/models/PromotionRewardModalContentModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/referafriend/domain/models/PromotionRewardModalContentModel;", "serializer", "()Lwc3/c;", "refer-a-friend_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return PromotionRewardModalContentModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ PromotionRewardModalContentModel(int i13, String str, String str2, String str3, RafHubCTA rafHubCTA, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i13 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 15, PromotionRewardModalContentModel$$serializer.INSTANCE.getDescriptor());
        }
        this.code = str;
        this.title = str2;
        this.body = str3;
        this.cta = rafHubCTA;
    }

    public static /* synthetic */ PromotionRewardModalContentModel copy$default(PromotionRewardModalContentModel promotionRewardModalContentModel, String str, String str2, String str3, RafHubCTA rafHubCTA, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = promotionRewardModalContentModel.code;
        }
        if ((i13 & 2) != 0) {
            str2 = promotionRewardModalContentModel.title;
        }
        if ((i13 & 4) != 0) {
            str3 = promotionRewardModalContentModel.body;
        }
        if ((i13 & 8) != 0) {
            rafHubCTA = promotionRewardModalContentModel.cta;
        }
        return promotionRewardModalContentModel.copy(str, str2, str3, rafHubCTA);
    }

    public static final /* synthetic */ void write$Self$refer_a_friend_release(PromotionRewardModalContentModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.code);
        output.encodeStringElement(serialDesc, 1, self.title);
        output.encodeStringElement(serialDesc, 2, self.body);
        output.encodeSerializableElement(serialDesc, 3, RafHubCTA$$serializer.INSTANCE, self.cta);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getBody() {
        return this.body;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final RafHubCTA getCta() {
        return this.cta;
    }

    public final PromotionRewardModalContentModel copy(String code, String title, String body, RafHubCTA cta) {
        AbstractC22676k.m65750j(code, "code");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(body, "body");
        AbstractC22676k.m65750j(cta, "cta");
        return new PromotionRewardModalContentModel(code, title, body, cta);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PromotionRewardModalContentModel)) {
            return false;
        }
        PromotionRewardModalContentModel promotionRewardModalContentModel = (PromotionRewardModalContentModel) other;
        return AbstractC22676k.m65745e(this.code, promotionRewardModalContentModel.code) && AbstractC22676k.m65745e(this.title, promotionRewardModalContentModel.title) && AbstractC22676k.m65745e(this.body, promotionRewardModalContentModel.body) && AbstractC22676k.m65745e(this.cta, promotionRewardModalContentModel.cta);
    }

    public final String getBody() {
        return this.body;
    }

    public final String getCode() {
        return this.code;
    }

    public final RafHubCTA getCta() {
        return this.cta;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.cta.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.code.hashCode() * 31, 31, this.title), 31, this.body);
    }

    public String toString() {
        String str = this.code;
        String str2 = this.title;
        String str3 = this.body;
        RafHubCTA rafHubCTA = this.cta;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("PromotionRewardModalContentModel(code=", str, ", title=", str2, ", body=");
        sbM32001t.append(str3);
        sbM32001t.append(", cta=");
        sbM32001t.append(rafHubCTA);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public PromotionRewardModalContentModel(String code, String title, String body, RafHubCTA cta) {
        AbstractC22676k.m65750j(code, "code");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(body, "body");
        AbstractC22676k.m65750j(cta, "cta");
        this.code = code;
        this.title = title;
        this.body = body;
        this.cta = cta;
    }
}
