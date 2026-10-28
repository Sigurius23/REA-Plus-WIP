package com.whoop.activation.feature.orderconfirmation.domain.models;

import c13.AbstractC3855a;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23457c;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import w70.C36870a;
import wc3.C37136a;
import wc3.C37140e;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import xc3.AbstractC38195a;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0087\b\u0018\u0000 D2\u00020\u0001:\u0002EDBg\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\u000f\u0010\u0010B\u0081\u0001\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u000f\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0017J\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0017J\u0010\u0010 \u001a\u00020\fHÆ\u0003¢\u0006\u0004\b \u0010!J\u0018\u0010\"\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\"\u0010\u001cJ~\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\r\u001a\u00020\f2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010\u0017J\u0010\u0010&\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b*\u0010+J'\u00104\u001a\u0002012\u0006\u0010,\u001a\u00020\u00002\u0006\u0010.\u001a\u00020-2\u0006\u00100\u001a\u00020/H\u0001¢\u0006\u0004\b2\u00103R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00105\u001a\u0004\b6\u0010\u0017R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00105\u001a\u0004\b7\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00105\u001a\u0004\b8\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u00105\u001a\u0004\b9\u0010\u0017R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010:\u001a\u0004\b;\u0010\u001cR\u0019\u0010\n\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\n\u0010<\u001a\u0004\b=\u0010\u001eR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u00105\u001a\u0004\b>\u0010\u0017R \u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010?\u0012\u0004\bA\u0010B\u001a\u0004\b@\u0010!R\u001f\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u000e\u0010:\u001a\u0004\bC\u0010\u001c¨\u0006F"}, m65681d2 = {"Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse;", "", "", "imageName", "backgroundImageUrl", "header", "description", "", "Lcom/whoop/design/models/DesignSystemModel;", "menuItems", "educationContent", "provisionalEmail", "Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationCta;", "cta", "footerButtons", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/DesignSystemModel;Ljava/lang/String;Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationCta;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/DesignSystemModel;Ljava/lang/String;Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationCta;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Ljava/util/List;", "component6", "()Lcom/whoop/design/models/DesignSystemModel;", "component7", "component8", "()Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationCta;", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/DesignSystemModel;Ljava/lang/String;Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationCta;Ljava/util/List;)Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$activation_release", "(Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getImageName", "getBackgroundImageUrl", "getHeader", "getDescription", "Ljava/util/List;", "getMenuItems", "Lcom/whoop/design/models/DesignSystemModel;", "getEducationContent", "getProvisionalEmail", "Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationCta;", "getCta", "getCta$annotations", "()V", "getFooterButtons", "Companion", "$serializer", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class OrderConfirmationResponse {
    private static final InterfaceC23462h[] $childSerializers;
    private final String backgroundImageUrl;
    private final OrderConfirmationCta cta;
    private final String description;
    private final DesignSystemModel educationContent;
    private final List<DesignSystemModel> footerButtons;
    private final String header;
    private final String imageName;
    private final List<DesignSystemModel> menuItems;
    private final String provisionalEmail;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse;", "serializer", "()Lwc3/c;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return OrderConfirmationResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, null, null, AbstractC30060g.m92087G(enumC23463i, new C36870a(0)), AbstractC30060g.m92087G(enumC23463i, new C36870a(1)), null, null, AbstractC30060g.m92087G(enumC23463i, new C36870a(2))};
    }

    public /* synthetic */ OrderConfirmationResponse(int i13, String str, String str2, String str3, String str4, List list, DesignSystemModel designSystemModel, String str5, OrderConfirmationCta orderConfirmationCta, List list2, SerializationConstructorMarker serializationConstructorMarker) {
        if (253 != (i13 & 253)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 253, OrderConfirmationResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.imageName = str;
        if ((i13 & 2) == 0) {
            this.backgroundImageUrl = null;
        } else {
            this.backgroundImageUrl = str2;
        }
        this.header = str3;
        this.description = str4;
        this.menuItems = list;
        this.educationContent = designSystemModel;
        this.provisionalEmail = str5;
        this.cta = orderConfirmationCta;
        if ((i13 & 256) == 0) {
            this.footerButtons = null;
        } else {
            this.footerButtons = list2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new ArrayListSerializer(new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0]), new InterfaceC37138c[0]));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_$0() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), AbstractC38195a.m122336d(new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0])), new InterfaceC37138c[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_$1() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new ArrayListSerializer(new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0]), new InterfaceC37138c[0]));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OrderConfirmationResponse copy$default(OrderConfirmationResponse orderConfirmationResponse, String str, String str2, String str3, String str4, List list, DesignSystemModel designSystemModel, String str5, OrderConfirmationCta orderConfirmationCta, List list2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = orderConfirmationResponse.imageName;
        }
        if ((i13 & 2) != 0) {
            str2 = orderConfirmationResponse.backgroundImageUrl;
        }
        if ((i13 & 4) != 0) {
            str3 = orderConfirmationResponse.header;
        }
        if ((i13 & 8) != 0) {
            str4 = orderConfirmationResponse.description;
        }
        if ((i13 & 16) != 0) {
            list = orderConfirmationResponse.menuItems;
        }
        if ((i13 & 32) != 0) {
            designSystemModel = orderConfirmationResponse.educationContent;
        }
        if ((i13 & 64) != 0) {
            str5 = orderConfirmationResponse.provisionalEmail;
        }
        if ((i13 & 128) != 0) {
            orderConfirmationCta = orderConfirmationResponse.cta;
        }
        if ((i13 & 256) != 0) {
            list2 = orderConfirmationResponse.footerButtons;
        }
        OrderConfirmationCta orderConfirmationCta2 = orderConfirmationCta;
        List list3 = list2;
        DesignSystemModel designSystemModel2 = designSystemModel;
        String str6 = str5;
        List list4 = list;
        String str7 = str3;
        return orderConfirmationResponse.copy(str, str2, str7, str4, list4, designSystemModel2, str6, orderConfirmationCta2, list3);
    }

    @InterfaceC23457c
    public static /* synthetic */ void getCta$annotations() {
    }

    public static final /* synthetic */ void write$Self$activation_release(OrderConfirmationResponse self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.imageName);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.backgroundImageUrl != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.backgroundImageUrl);
        }
        output.encodeStringElement(serialDesc, 2, self.header);
        output.encodeStringElement(serialDesc, 3, self.description);
        output.encodeSerializableElement(serialDesc, 4, (InterfaceC37145j) interfaceC23462hArr[4].getValue(), self.menuItems);
        output.encodeNullableSerializableElement(serialDesc, 5, (InterfaceC37145j) interfaceC23462hArr[5].getValue(), self.educationContent);
        output.encodeNullableSerializableElement(serialDesc, 6, StringSerializer.INSTANCE, self.provisionalEmail);
        output.encodeSerializableElement(serialDesc, 7, OrderConfirmationCta$$serializer.INSTANCE, self.cta);
        if (!output.shouldEncodeElementDefault(serialDesc, 8) && self.footerButtons == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 8, (InterfaceC37145j) interfaceC23462hArr[8].getValue(), self.footerButtons);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getImageName() {
        return this.imageName;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getBackgroundImageUrl() {
        return this.backgroundImageUrl;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getHeader() {
        return this.header;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    public final List<DesignSystemModel> component5() {
        return this.menuItems;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final DesignSystemModel getEducationContent() {
        return this.educationContent;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getProvisionalEmail() {
        return this.provisionalEmail;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final OrderConfirmationCta getCta() {
        return this.cta;
    }

    public final List<DesignSystemModel> component9() {
        return this.footerButtons;
    }

    public final OrderConfirmationResponse copy(String imageName, String backgroundImageUrl, String header, String description, List<? extends DesignSystemModel> menuItems, DesignSystemModel educationContent, String provisionalEmail, OrderConfirmationCta cta, List<? extends DesignSystemModel> footerButtons) {
        AbstractC22676k.m65750j(imageName, "imageName");
        AbstractC22676k.m65750j(header, "header");
        AbstractC22676k.m65750j(description, "description");
        AbstractC22676k.m65750j(menuItems, "menuItems");
        AbstractC22676k.m65750j(cta, "cta");
        return new OrderConfirmationResponse(imageName, backgroundImageUrl, header, description, menuItems, educationContent, provisionalEmail, cta, footerButtons);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderConfirmationResponse)) {
            return false;
        }
        OrderConfirmationResponse orderConfirmationResponse = (OrderConfirmationResponse) other;
        return AbstractC22676k.m65745e(this.imageName, orderConfirmationResponse.imageName) && AbstractC22676k.m65745e(this.backgroundImageUrl, orderConfirmationResponse.backgroundImageUrl) && AbstractC22676k.m65745e(this.header, orderConfirmationResponse.header) && AbstractC22676k.m65745e(this.description, orderConfirmationResponse.description) && AbstractC22676k.m65745e(this.menuItems, orderConfirmationResponse.menuItems) && AbstractC22676k.m65745e(this.educationContent, orderConfirmationResponse.educationContent) && AbstractC22676k.m65745e(this.provisionalEmail, orderConfirmationResponse.provisionalEmail) && AbstractC22676k.m65745e(this.cta, orderConfirmationResponse.cta) && AbstractC22676k.m65745e(this.footerButtons, orderConfirmationResponse.footerButtons);
    }

    public final String getBackgroundImageUrl() {
        return this.backgroundImageUrl;
    }

    public final OrderConfirmationCta getCta() {
        return this.cta;
    }

    public final String getDescription() {
        return this.description;
    }

    public final DesignSystemModel getEducationContent() {
        return this.educationContent;
    }

    public final List<DesignSystemModel> getFooterButtons() {
        return this.footerButtons;
    }

    public final String getHeader() {
        return this.header;
    }

    public final String getImageName() {
        return this.imageName;
    }

    public final List<DesignSystemModel> getMenuItems() {
        return this.menuItems;
    }

    public final String getProvisionalEmail() {
        return this.provisionalEmail;
    }

    public int hashCode() {
        int iHashCode = this.imageName.hashCode() * 31;
        String str = this.backgroundImageUrl;
        int iM31983b = AbstractC11895b.m31983b(AbstractC11266d.m30450d(AbstractC11266d.m30450d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.header), 31, this.description), 31, this.menuItems);
        DesignSystemModel designSystemModel = this.educationContent;
        int iHashCode2 = (iM31983b + (designSystemModel == null ? 0 : designSystemModel.hashCode())) * 31;
        String str2 = this.provisionalEmail;
        int iHashCode3 = (this.cta.hashCode() + ((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        List<DesignSystemModel> list = this.footerButtons;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        String str = this.imageName;
        String str2 = this.backgroundImageUrl;
        String str3 = this.header;
        String str4 = this.description;
        List<DesignSystemModel> list = this.menuItems;
        DesignSystemModel designSystemModel = this.educationContent;
        String str5 = this.provisionalEmail;
        OrderConfirmationCta orderConfirmationCta = this.cta;
        List<DesignSystemModel> list2 = this.footerButtons;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("OrderConfirmationResponse(imageName=", str, ", backgroundImageUrl=", str2, ", header=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", description=", str4, ", menuItems=");
        sbM32001t.append(list);
        sbM32001t.append(", educationContent=");
        sbM32001t.append(designSystemModel);
        sbM32001t.append(", provisionalEmail=");
        sbM32001t.append(str5);
        sbM32001t.append(", cta=");
        sbM32001t.append(orderConfirmationCta);
        sbM32001t.append(", footerButtons=");
        return AbstractC3855a.m11829m(sbM32001t, list2, ")");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OrderConfirmationResponse(String imageName, String str, String header, String description, List<? extends DesignSystemModel> menuItems, DesignSystemModel designSystemModel, String str2, OrderConfirmationCta cta, List<? extends DesignSystemModel> list) {
        AbstractC22676k.m65750j(imageName, "imageName");
        AbstractC22676k.m65750j(header, "header");
        AbstractC22676k.m65750j(description, "description");
        AbstractC22676k.m65750j(menuItems, "menuItems");
        AbstractC22676k.m65750j(cta, "cta");
        this.imageName = imageName;
        this.backgroundImageUrl = str;
        this.header = header;
        this.description = description;
        this.menuItems = menuItems;
        this.educationContent = designSystemModel;
        this.provisionalEmail = str2;
        this.cta = cta;
        this.footerButtons = list;
    }

    public /* synthetic */ OrderConfirmationResponse(String str, String str2, String str3, String str4, List list, DesignSystemModel designSystemModel, String str5, OrderConfirmationCta orderConfirmationCta, List list2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i13 & 2) != 0 ? null : str2, str3, str4, list, designSystemModel, str5, orderConfirmationCta, (i13 & 256) != 0 ? null : list2);
    }
}
