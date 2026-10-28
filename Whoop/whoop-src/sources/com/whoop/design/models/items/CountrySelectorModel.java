package com.whoop.design.models.items;

import c13.AbstractC3855a;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import w91.C36955b;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u0000 =2\u00020\u0001:\u0002>=BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b¢\u0006\u0004\b\r\u0010\u000eBg\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001eJ\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001eJ\u0010\u0010#\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b%\u0010$J\u0016\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00040\u000bHÆ\u0003¢\u0006\u0004\b&\u0010'J\\\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000bHÆ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b*\u0010\u001eJ\u0010\u0010+\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b+\u0010,J\u001a\u00100\u001a\u00020/2\b\u0010.\u001a\u0004\u0018\u00010-HÖ\u0003¢\u0006\u0004\b0\u00101R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00102\u001a\u0004\b3\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00104\u001a\u0004\b5\u0010 R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u00102\u001a\u0004\b6\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u00102\u001a\u0004\b7\u0010\u001eR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u00108\u001a\u0004\b9\u0010$R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\n\u00108\u001a\u0004\b:\u0010$R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010;\u001a\u0004\b<\u0010'¨\u0006?"}, m65681d2 = {"Lcom/whoop/design/models/items/CountrySelectorModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "title", "Lcom/whoop/design/models/items/CountryModel;", "selectedCountry", "headerText", "searchPlaceholderText", "Lcom/whoop/design/models/items/CardButtonModel;", "confirmButton", "cancelButton", "", "countries", "<init>", "(Ljava/lang/String;Lcom/whoop/design/models/items/CountryModel;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/CardButtonModel;Lcom/whoop/design/models/items/CardButtonModel;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/whoop/design/models/items/CountryModel;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/CardButtonModel;Lcom/whoop/design/models/items/CardButtonModel;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/CountrySelectorModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lcom/whoop/design/models/items/CountryModel;", "component3", "component4", "component5", "()Lcom/whoop/design/models/items/CardButtonModel;", "component6", "component7", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Lcom/whoop/design/models/items/CountryModel;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/CardButtonModel;Lcom/whoop/design/models/items/CardButtonModel;Ljava/util/List;)Lcom/whoop/design/models/items/CountrySelectorModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "Lcom/whoop/design/models/items/CountryModel;", "getSelectedCountry", "getHeaderText", "getSearchPlaceholderText", "Lcom/whoop/design/models/items/CardButtonModel;", "getConfirmButton", "getCancelButton", "Ljava/util/List;", "getCountries", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class CountrySelectorModel implements DesignSystemModel {
    private final CardButtonModel cancelButton;
    private final CardButtonModel confirmButton;
    private final List<CountryModel> countries;
    private final String headerText;
    private final String searchPlaceholderText;
    private final CountryModel selectedCountry;
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C36955b(21))};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/CountrySelectorModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/CountrySelectorModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return CountrySelectorModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ CountrySelectorModel(int i13, String str, CountryModel countryModel, String str2, String str3, CardButtonModel cardButtonModel, CardButtonModel cardButtonModel2, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (127 != (i13 & 127)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 127, CountrySelectorModel$$serializer.INSTANCE.getDescriptor());
        }
        this.title = str;
        this.selectedCountry = countryModel;
        this.headerText = str2;
        this.searchPlaceholderText = str3;
        this.confirmButton = cardButtonModel;
        this.cancelButton = cardButtonModel2;
        this.countries = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(CountryModel$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CountrySelectorModel copy$default(CountrySelectorModel countrySelectorModel, String str, CountryModel countryModel, String str2, String str3, CardButtonModel cardButtonModel, CardButtonModel cardButtonModel2, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = countrySelectorModel.title;
        }
        if ((i13 & 2) != 0) {
            countryModel = countrySelectorModel.selectedCountry;
        }
        if ((i13 & 4) != 0) {
            str2 = countrySelectorModel.headerText;
        }
        if ((i13 & 8) != 0) {
            str3 = countrySelectorModel.searchPlaceholderText;
        }
        if ((i13 & 16) != 0) {
            cardButtonModel = countrySelectorModel.confirmButton;
        }
        if ((i13 & 32) != 0) {
            cardButtonModel2 = countrySelectorModel.cancelButton;
        }
        if ((i13 & 64) != 0) {
            list = countrySelectorModel.countries;
        }
        CardButtonModel cardButtonModel3 = cardButtonModel2;
        List list2 = list;
        CardButtonModel cardButtonModel4 = cardButtonModel;
        String str4 = str2;
        return countrySelectorModel.copy(str, countryModel, str4, str3, cardButtonModel4, cardButtonModel3, list2);
    }

    public static final /* synthetic */ void write$Self$design_models_release(CountrySelectorModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.title);
        output.encodeSerializableElement(serialDesc, 1, CountryModel$$serializer.INSTANCE, self.selectedCountry);
        output.encodeStringElement(serialDesc, 2, self.headerText);
        output.encodeStringElement(serialDesc, 3, self.searchPlaceholderText);
        CardButtonModel$$serializer cardButtonModel$$serializer = CardButtonModel$$serializer.INSTANCE;
        output.encodeSerializableElement(serialDesc, 4, cardButtonModel$$serializer, self.confirmButton);
        output.encodeSerializableElement(serialDesc, 5, cardButtonModel$$serializer, self.cancelButton);
        output.encodeSerializableElement(serialDesc, 6, (InterfaceC37145j) interfaceC23462hArr[6].getValue(), self.countries);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final CountryModel getSelectedCountry() {
        return this.selectedCountry;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getHeaderText() {
        return this.headerText;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSearchPlaceholderText() {
        return this.searchPlaceholderText;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final CardButtonModel getConfirmButton() {
        return this.confirmButton;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final CardButtonModel getCancelButton() {
        return this.cancelButton;
    }

    public final List<CountryModel> component7() {
        return this.countries;
    }

    public final CountrySelectorModel copy(String title, CountryModel selectedCountry, String headerText, String searchPlaceholderText, CardButtonModel confirmButton, CardButtonModel cancelButton, List<CountryModel> countries) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(selectedCountry, "selectedCountry");
        AbstractC22676k.m65750j(headerText, "headerText");
        AbstractC22676k.m65750j(searchPlaceholderText, "searchPlaceholderText");
        AbstractC22676k.m65750j(confirmButton, "confirmButton");
        AbstractC22676k.m65750j(cancelButton, "cancelButton");
        AbstractC22676k.m65750j(countries, "countries");
        return new CountrySelectorModel(title, selectedCountry, headerText, searchPlaceholderText, confirmButton, cancelButton, countries);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CountrySelectorModel)) {
            return false;
        }
        CountrySelectorModel countrySelectorModel = (CountrySelectorModel) other;
        return AbstractC22676k.m65745e(this.title, countrySelectorModel.title) && AbstractC22676k.m65745e(this.selectedCountry, countrySelectorModel.selectedCountry) && AbstractC22676k.m65745e(this.headerText, countrySelectorModel.headerText) && AbstractC22676k.m65745e(this.searchPlaceholderText, countrySelectorModel.searchPlaceholderText) && AbstractC22676k.m65745e(this.confirmButton, countrySelectorModel.confirmButton) && AbstractC22676k.m65745e(this.cancelButton, countrySelectorModel.cancelButton) && AbstractC22676k.m65745e(this.countries, countrySelectorModel.countries);
    }

    public final CardButtonModel getCancelButton() {
        return this.cancelButton;
    }

    public final CardButtonModel getConfirmButton() {
        return this.confirmButton;
    }

    public final List<CountryModel> getCountries() {
        return this.countries;
    }

    public final String getHeaderText() {
        return this.headerText;
    }

    public final String getSearchPlaceholderText() {
        return this.searchPlaceholderText;
    }

    public final CountryModel getSelectedCountry() {
        return this.selectedCountry;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.countries.hashCode() + ((this.cancelButton.hashCode() + ((this.confirmButton.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d((this.selectedCountry.hashCode() + (this.title.hashCode() * 31)) * 31, 31, this.headerText), 31, this.searchPlaceholderText)) * 31)) * 31);
    }

    public String toString() {
        String str = this.title;
        CountryModel countryModel = this.selectedCountry;
        String str2 = this.headerText;
        String str3 = this.searchPlaceholderText;
        CardButtonModel cardButtonModel = this.confirmButton;
        CardButtonModel cardButtonModel2 = this.cancelButton;
        List<CountryModel> list = this.countries;
        StringBuilder sb4 = new StringBuilder("CountrySelectorModel(title=");
        sb4.append(str);
        sb4.append(", selectedCountry=");
        sb4.append(countryModel);
        sb4.append(", headerText=");
        AbstractC11266d.m30444B(sb4, str2, ", searchPlaceholderText=", str3, ", confirmButton=");
        sb4.append(cardButtonModel);
        sb4.append(", cancelButton=");
        sb4.append(cardButtonModel2);
        sb4.append(", countries=");
        return AbstractC3855a.m11829m(sb4, list, ")");
    }

    public CountrySelectorModel(String title, CountryModel selectedCountry, String headerText, String searchPlaceholderText, CardButtonModel confirmButton, CardButtonModel cancelButton, List<CountryModel> countries) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(selectedCountry, "selectedCountry");
        AbstractC22676k.m65750j(headerText, "headerText");
        AbstractC22676k.m65750j(searchPlaceholderText, "searchPlaceholderText");
        AbstractC22676k.m65750j(confirmButton, "confirmButton");
        AbstractC22676k.m65750j(cancelButton, "cancelButton");
        AbstractC22676k.m65750j(countries, "countries");
        this.title = title;
        this.selectedCountry = selectedCountry;
        this.headerText = headerText;
        this.searchPlaceholderText = searchPlaceholderText;
        this.confirmButton = confirmButton;
        this.cancelButton = cancelButton;
        this.countries = countries;
    }
}
