package com.whoop.advancedlabs.domain.models;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p555vl.AbstractC36095b;
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
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 92\u00020\u0001:\u0002:9B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rB]\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b#\u0010\u001fJ\u0010\u0010$\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b$\u0010%JR\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00072\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b(\u0010\u001fJ\u0010\u0010)\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010-\u001a\u00020,2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b-\u0010.R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010/\u001a\u0004\b0\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00101\u001a\u0004\b2\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u00101\u001a\u0004\b3\u0010\u001fR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00078\u0006¢\u0006\f\n\u0004\b\b\u00104\u001a\u0004\b5\u0010\"R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u00101\u001a\u0004\b6\u0010\u001fR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00107\u001a\u0004\b8\u0010%¨\u0006;"}, m65681d2 = {"Lcom/whoop/advancedlabs/domain/models/ConsentResponse;", "", "Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;", "navigationBar", "", "title", "description", "", "checkboxes", "buttonLabel", "Lcom/whoop/advancedlabs/domain/models/ButtonModel;", "button", "<init>", "(Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/whoop/advancedlabs/domain/models/ButtonModel;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/advancedlabs/domain/models/NavigationBarModel;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/whoop/advancedlabs/domain/models/ButtonModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$advanced_labs_release", "(Lcom/whoop/advancedlabs/domain/models/ConsentResponse;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;", "component2", "()Ljava/lang/String;", "component3", "component4", "()Ljava/util/List;", "component5", "component6", "()Lcom/whoop/advancedlabs/domain/models/ButtonModel;", "copy", "(Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/whoop/advancedlabs/domain/models/ButtonModel;)Lcom/whoop/advancedlabs/domain/models/ConsentResponse;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;", "getNavigationBar", "Ljava/lang/String;", "getTitle", "getDescription", "Ljava/util/List;", "getCheckboxes", "getButtonLabel", "Lcom/whoop/advancedlabs/domain/models/ButtonModel;", "getButton", "Companion", "$serializer", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ConsentResponse {
    private final ButtonModel button;
    private final String buttonLabel;
    private final List<String> checkboxes;
    private final String description;
    private final NavigationBarModel navigationBar;
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C33690a(2)), null, null};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/advancedlabs/domain/models/ConsentResponse$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/advancedlabs/domain/models/ConsentResponse;", "serializer", "()Lwc3/c;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ConsentResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ConsentResponse(int i13, NavigationBarModel navigationBarModel, String str, String str2, List list, String str3, ButtonModel buttonModel, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i13 & 63)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 63, ConsentResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.navigationBar = navigationBarModel;
        this.title = str;
        this.description = str2;
        this.checkboxes = list;
        this.buttonLabel = str3;
        this.button = buttonModel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(StringSerializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ConsentResponse copy$default(ConsentResponse consentResponse, NavigationBarModel navigationBarModel, String str, String str2, List list, String str3, ButtonModel buttonModel, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            navigationBarModel = consentResponse.navigationBar;
        }
        if ((i13 & 2) != 0) {
            str = consentResponse.title;
        }
        if ((i13 & 4) != 0) {
            str2 = consentResponse.description;
        }
        if ((i13 & 8) != 0) {
            list = consentResponse.checkboxes;
        }
        if ((i13 & 16) != 0) {
            str3 = consentResponse.buttonLabel;
        }
        if ((i13 & 32) != 0) {
            buttonModel = consentResponse.button;
        }
        String str4 = str3;
        ButtonModel buttonModel2 = buttonModel;
        return consentResponse.copy(navigationBarModel, str, str2, list, str4, buttonModel2);
    }

    public static final /* synthetic */ void write$Self$advanced_labs_release(ConsentResponse self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, NavigationBarModel$$serializer.INSTANCE, self.navigationBar);
        output.encodeStringElement(serialDesc, 1, self.title);
        output.encodeStringElement(serialDesc, 2, self.description);
        output.encodeSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.checkboxes);
        output.encodeStringElement(serialDesc, 4, self.buttonLabel);
        output.encodeSerializableElement(serialDesc, 5, ButtonModel$$serializer.INSTANCE, self.button);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final NavigationBarModel getNavigationBar() {
        return this.navigationBar;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    public final List<String> component4() {
        return this.checkboxes;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getButtonLabel() {
        return this.buttonLabel;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final ButtonModel getButton() {
        return this.button;
    }

    public final ConsentResponse copy(NavigationBarModel navigationBar, String title, String description, List<String> checkboxes, String buttonLabel, ButtonModel button) {
        AbstractC22676k.m65750j(navigationBar, "navigationBar");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(description, "description");
        AbstractC22676k.m65750j(checkboxes, "checkboxes");
        AbstractC22676k.m65750j(buttonLabel, "buttonLabel");
        AbstractC22676k.m65750j(button, "button");
        return new ConsentResponse(navigationBar, title, description, checkboxes, buttonLabel, button);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConsentResponse)) {
            return false;
        }
        ConsentResponse consentResponse = (ConsentResponse) other;
        return AbstractC22676k.m65745e(this.navigationBar, consentResponse.navigationBar) && AbstractC22676k.m65745e(this.title, consentResponse.title) && AbstractC22676k.m65745e(this.description, consentResponse.description) && AbstractC22676k.m65745e(this.checkboxes, consentResponse.checkboxes) && AbstractC22676k.m65745e(this.buttonLabel, consentResponse.buttonLabel) && AbstractC22676k.m65745e(this.button, consentResponse.button);
    }

    public final ButtonModel getButton() {
        return this.button;
    }

    public final String getButtonLabel() {
        return this.buttonLabel;
    }

    public final List<String> getCheckboxes() {
        return this.checkboxes;
    }

    public final String getDescription() {
        return this.description;
    }

    public final NavigationBarModel getNavigationBar() {
        return this.navigationBar;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.button.hashCode() + AbstractC11266d.m30450d(AbstractC11895b.m31983b(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.navigationBar.hashCode() * 31, 31, this.title), 31, this.description), 31, this.checkboxes), 31, this.buttonLabel);
    }

    public String toString() {
        NavigationBarModel navigationBarModel = this.navigationBar;
        String str = this.title;
        String str2 = this.description;
        List<String> list = this.checkboxes;
        String str3 = this.buttonLabel;
        ButtonModel buttonModel = this.button;
        StringBuilder sb4 = new StringBuilder("ConsentResponse(navigationBar=");
        sb4.append(navigationBarModel);
        sb4.append(", title=");
        sb4.append(str);
        sb4.append(", description=");
        AbstractC36095b.m114694v(str2, ", checkboxes=", ", buttonLabel=", sb4, list);
        sb4.append(str3);
        sb4.append(", button=");
        sb4.append(buttonModel);
        sb4.append(")");
        return sb4.toString();
    }

    public ConsentResponse(NavigationBarModel navigationBar, String title, String description, List<String> checkboxes, String buttonLabel, ButtonModel button) {
        AbstractC22676k.m65750j(navigationBar, "navigationBar");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(description, "description");
        AbstractC22676k.m65750j(checkboxes, "checkboxes");
        AbstractC22676k.m65750j(buttonLabel, "buttonLabel");
        AbstractC22676k.m65750j(button, "button");
        this.navigationBar = navigationBar;
        this.title = title;
        this.description = description;
        this.checkboxes = checkboxes;
        this.buttonLabel = buttonLabel;
        this.button = button;
    }
}
