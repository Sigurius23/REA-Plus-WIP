package com.whoop.design.models.cards;

import androidx.core.app.NotificationCompat;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
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
import t42.C33538a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 52\u00020\u0001:\u000265B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fBI\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b!\u0010\"JB\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b%\u0010\"J\u0010\u0010&\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010(HÖ\u0003¢\u0006\u0004\b+\u0010,R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u001cR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010/\u001a\u0004\b0\u0010\u001eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u00101\u001a\u0004\b2\u0010 R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u00103\u001a\u0004\b4\u0010\"¨\u00067"}, m65681d2 = {"Lcom/whoop/design/models/cards/AdvancedLabsSubscriptionCardModel;", "Lcom/whoop/design/models/DesignSystemModel;", "Lcom/whoop/design/models/cards/Header;", "header", "", "Lcom/whoop/design/models/cards/LineItem;", "lineItems", "Lcom/whoop/design/models/cards/Footer;", "footer", "", NotificationCompat.CATEGORY_STATUS, "<init>", "(Lcom/whoop/design/models/cards/Header;Ljava/util/List;Lcom/whoop/design/models/cards/Footer;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/design/models/cards/Header;Ljava/util/List;Lcom/whoop/design/models/cards/Footer;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/cards/AdvancedLabsSubscriptionCardModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/design/models/cards/Header;", "component2", "()Ljava/util/List;", "component3", "()Lcom/whoop/design/models/cards/Footer;", "component4", "()Ljava/lang/String;", "copy", "(Lcom/whoop/design/models/cards/Header;Ljava/util/List;Lcom/whoop/design/models/cards/Footer;Ljava/lang/String;)Lcom/whoop/design/models/cards/AdvancedLabsSubscriptionCardModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/design/models/cards/Header;", "getHeader", "Ljava/util/List;", "getLineItems", "Lcom/whoop/design/models/cards/Footer;", "getFooter", "Ljava/lang/String;", "getStatus", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class AdvancedLabsSubscriptionCardModel implements DesignSystemModel {
    private final Footer footer;
    private final Header header;
    private final List<LineItem> lineItems;
    private final String status;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C33538a(1)), null, null};

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/cards/AdvancedLabsSubscriptionCardModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/cards/AdvancedLabsSubscriptionCardModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return AdvancedLabsSubscriptionCardModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ AdvancedLabsSubscriptionCardModel(int i13, Header header, List list, Footer footer, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i13 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 15, AdvancedLabsSubscriptionCardModel$$serializer.INSTANCE.getDescriptor());
        }
        this.header = header;
        this.lineItems = list;
        this.footer = footer;
        this.status = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(LineItem$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AdvancedLabsSubscriptionCardModel copy$default(AdvancedLabsSubscriptionCardModel advancedLabsSubscriptionCardModel, Header header, List list, Footer footer, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            header = advancedLabsSubscriptionCardModel.header;
        }
        if ((i13 & 2) != 0) {
            list = advancedLabsSubscriptionCardModel.lineItems;
        }
        if ((i13 & 4) != 0) {
            footer = advancedLabsSubscriptionCardModel.footer;
        }
        if ((i13 & 8) != 0) {
            str = advancedLabsSubscriptionCardModel.status;
        }
        return advancedLabsSubscriptionCardModel.copy(header, list, footer, str);
    }

    public static final /* synthetic */ void write$Self$design_models_release(AdvancedLabsSubscriptionCardModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, Header$$serializer.INSTANCE, self.header);
        output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.lineItems);
        output.encodeNullableSerializableElement(serialDesc, 2, Footer$$serializer.INSTANCE, self.footer);
        output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.status);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Header getHeader() {
        return this.header;
    }

    public final List<LineItem> component2() {
        return this.lineItems;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Footer getFooter() {
        return this.footer;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    public final AdvancedLabsSubscriptionCardModel copy(Header header, List<LineItem> lineItems, Footer footer, String status) {
        AbstractC22676k.m65750j(header, "header");
        AbstractC22676k.m65750j(lineItems, "lineItems");
        return new AdvancedLabsSubscriptionCardModel(header, lineItems, footer, status);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdvancedLabsSubscriptionCardModel)) {
            return false;
        }
        AdvancedLabsSubscriptionCardModel advancedLabsSubscriptionCardModel = (AdvancedLabsSubscriptionCardModel) other;
        return AbstractC22676k.m65745e(this.header, advancedLabsSubscriptionCardModel.header) && AbstractC22676k.m65745e(this.lineItems, advancedLabsSubscriptionCardModel.lineItems) && AbstractC22676k.m65745e(this.footer, advancedLabsSubscriptionCardModel.footer) && AbstractC22676k.m65745e(this.status, advancedLabsSubscriptionCardModel.status);
    }

    public final Footer getFooter() {
        return this.footer;
    }

    public final Header getHeader() {
        return this.header;
    }

    public final List<LineItem> getLineItems() {
        return this.lineItems;
    }

    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        int iM31983b = AbstractC11895b.m31983b(this.header.hashCode() * 31, 31, this.lineItems);
        Footer footer = this.footer;
        int iHashCode = (iM31983b + (footer == null ? 0 : footer.hashCode())) * 31;
        String str = this.status;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "AdvancedLabsSubscriptionCardModel(header=" + this.header + ", lineItems=" + this.lineItems + ", footer=" + this.footer + ", status=" + this.status + ")";
    }

    public AdvancedLabsSubscriptionCardModel(Header header, List<LineItem> lineItems, Footer footer, String str) {
        AbstractC22676k.m65750j(header, "header");
        AbstractC22676k.m65750j(lineItems, "lineItems");
        this.header = header;
        this.lineItems = lineItems;
        this.footer = footer;
        this.status = str;
    }
}
