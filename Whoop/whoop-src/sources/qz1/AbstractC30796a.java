package qz1;

import com.whoop.design.models.items.CardButtonModel;
import com.whoop.design.models.items.CountryModel;
import com.whoop.design.models.items.CountrySelectorModel;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m83.AbstractC25267u;
import ny0.C27256h;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p716lb1.AbstractC23613d4;
import r51.C30938f;
import r51.C30939g;

/* JADX INFO: renamed from: qz1.a */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m65681d2 = {"Lcom/whoop/design/models/items/CountrySelectorModel;", "Lr51/f;", "b", "(Lcom/whoop/design/models/items/CountrySelectorModel;)Lr51/f;", "Lcom/whoop/design/models/items/CountryModel;", "Lr51/g;", "c", "(Lcom/whoop/design/models/items/CountryModel;)Lr51/g;", "Lcom/whoop/design/models/items/CardButtonModel;", "Lny0/h;", "a", "(Lcom/whoop/design/models/items/CardButtonModel;)Lny0/h;", "native-store_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC30796a {
    /* JADX INFO: renamed from: a */
    private static final C27256h m94713a(CardButtonModel cardButtonModel) {
        return AbstractC23613d4.m68662l(cardButtonModel, null, 1, null);
    }

    /* JADX INFO: renamed from: b */
    public static final C30938f m94714b(CountrySelectorModel countrySelectorModel) {
        AbstractC22676k.m65750j(countrySelectorModel, "<this>");
        TextResource textResourceM21278l = AbstractC8693b.m21278l(countrySelectorModel.getTitle());
        C30939g c30939gM94715c = m94715c(countrySelectorModel.getSelectedCountry());
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l(countrySelectorModel.getHeaderText());
        TextResource textResourceM21278l3 = AbstractC8693b.m21278l(countrySelectorModel.getSearchPlaceholderText());
        C27256h c27256hM94713a = m94713a(countrySelectorModel.getConfirmButton());
        C27256h c27256hM94713a2 = m94713a(countrySelectorModel.getCancelButton());
        List<CountryModel> countries = countrySelectorModel.getCountries();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(countries, 10));
        Iterator<T> it = countries.iterator();
        while (it.hasNext()) {
            arrayList.add(m94715c((CountryModel) it.next()));
        }
        return new C30938f(c27256hM94713a, c27256hM94713a2, c30939gM94715c, textResourceM21278l, textResourceM21278l2, textResourceM21278l3, arrayList);
    }

    /* JADX INFO: renamed from: c */
    private static final C30939g m94715c(CountryModel countryModel) {
        return new C30939g(countryModel.getAlpha2(), countryModel.getAlpha3(), countryModel.getRegion(), countryModel.getPhoneCountryCode(), countryModel.getCountryFlag(), AbstractC8693b.m21278l(countryModel.getName()));
    }
}
