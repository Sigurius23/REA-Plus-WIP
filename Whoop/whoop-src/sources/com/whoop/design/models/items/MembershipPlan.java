package com.whoop.design.models.items;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import jh3.AbstractC21702c;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\b\u0087\b\u0018\u0000 12\u00020\u0001:\u000221B=\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bBU\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001bJ\u0010\u0010\u001f\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001bJR\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u001bJ\u0010\u0010%\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010(\u001a\u00020\u00072\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u001bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010*\u001a\u0004\b,\u0010\u001bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b-\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b.\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010/\u001a\u0004\b\b\u0010 R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010*\u001a\u0004\b0\u0010\u001b¨\u00063"}, m65681d2 = {"Lcom/whoop/design/models/items/MembershipPlan;", "", "", "header", "iconUrl", "planText", "price", "", "isHighlighted", "style", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/MembershipPlan;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Z", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)Lcom/whoop/design/models/items/MembershipPlan;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getHeader", "getIconUrl", "getPlanText", "getPrice", "Z", "getStyle", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class MembershipPlan {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String header;
    private final String iconUrl;
    private final boolean isHighlighted;
    private final String planText;
    private final String price;
    private final String style;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/MembershipPlan$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/MembershipPlan;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return MembershipPlan$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ MembershipPlan(int i13, String str, String str2, String str3, String str4, boolean z4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i13 & 63)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 63, MembershipPlan$$serializer.INSTANCE.getDescriptor());
        }
        this.header = str;
        this.iconUrl = str2;
        this.planText = str3;
        this.price = str4;
        this.isHighlighted = z4;
        this.style = str5;
    }

    public static /* synthetic */ MembershipPlan copy$default(MembershipPlan membershipPlan, String str, String str2, String str3, String str4, boolean z4, String str5, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = membershipPlan.header;
        }
        if ((i13 & 2) != 0) {
            str2 = membershipPlan.iconUrl;
        }
        if ((i13 & 4) != 0) {
            str3 = membershipPlan.planText;
        }
        if ((i13 & 8) != 0) {
            str4 = membershipPlan.price;
        }
        if ((i13 & 16) != 0) {
            z4 = membershipPlan.isHighlighted;
        }
        if ((i13 & 32) != 0) {
            str5 = membershipPlan.style;
        }
        boolean z13 = z4;
        String str6 = str5;
        return membershipPlan.copy(str, str2, str3, str4, z13, str6);
    }

    public static final /* synthetic */ void write$Self$design_models_release(MembershipPlan self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 0, stringSerializer, self.header);
        output.encodeNullableSerializableElement(serialDesc, 1, stringSerializer, self.iconUrl);
        output.encodeNullableSerializableElement(serialDesc, 2, stringSerializer, self.planText);
        output.encodeStringElement(serialDesc, 3, self.price);
        output.encodeBooleanElement(serialDesc, 4, self.isHighlighted);
        output.encodeStringElement(serialDesc, 5, self.style);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getHeader() {
        return this.header;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getIconUrl() {
        return this.iconUrl;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPlanText() {
        return this.planText;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPrice() {
        return this.price;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getIsHighlighted() {
        return this.isHighlighted;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getStyle() {
        return this.style;
    }

    public final MembershipPlan copy(String header, String iconUrl, String planText, String price, boolean isHighlighted, String style) {
        AbstractC22676k.m65750j(price, "price");
        AbstractC22676k.m65750j(style, "style");
        return new MembershipPlan(header, iconUrl, planText, price, isHighlighted, style);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MembershipPlan)) {
            return false;
        }
        MembershipPlan membershipPlan = (MembershipPlan) other;
        return AbstractC22676k.m65745e(this.header, membershipPlan.header) && AbstractC22676k.m65745e(this.iconUrl, membershipPlan.iconUrl) && AbstractC22676k.m65745e(this.planText, membershipPlan.planText) && AbstractC22676k.m65745e(this.price, membershipPlan.price) && this.isHighlighted == membershipPlan.isHighlighted && AbstractC22676k.m65745e(this.style, membershipPlan.style);
    }

    public final String getHeader() {
        return this.header;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final String getPlanText() {
        return this.planText;
    }

    public final String getPrice() {
        return this.price;
    }

    public final String getStyle() {
        return this.style;
    }

    public int hashCode() {
        String str = this.header;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.iconUrl;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.planText;
        return this.style.hashCode() + AbstractC2875y.m8289b(AbstractC11266d.m30450d((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31, 31, this.price), 31, this.isHighlighted);
    }

    public final boolean isHighlighted() {
        return this.isHighlighted;
    }

    public String toString() {
        String str = this.header;
        String str2 = this.iconUrl;
        String str3 = this.planText;
        String str4 = this.price;
        boolean z4 = this.isHighlighted;
        String str5 = this.style;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("MembershipPlan(header=", str, ", iconUrl=", str2, ", planText=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", price=", str4, ", isHighlighted=");
        return AbstractC21702c.m61139j(sbM32001t, z4, ", style=", str5, ")");
    }

    public MembershipPlan(String str, String str2, String str3, String price, boolean z4, String style) {
        AbstractC22676k.m65750j(price, "price");
        AbstractC22676k.m65750j(style, "style");
        this.header = str;
        this.iconUrl = str2;
        this.planText = str3;
        this.price = price;
        this.isHighlighted = z4;
        this.style = style;
    }
}
