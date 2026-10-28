package oh1;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.CountryModel;
import com.whoop.design.models.items.CountrySelectorModel;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.gifting.feature.gifting.domain.models.GiftingModels;
import com.whoop.gifting.feature.gifting.domain.models.NumericStepperModel;
import com.whoop.gifting.feature.gifting.domain.models.QuantitySelectorModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import jb1.AbstractC21537c;
import jb1.C21535a;
import jb1.C21536b;
import l83.C23454a0;
import m83.AbstractC25267u;
import m83.C25272z;
import nh1.C26723d;
import o72.C27644e;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p716lb1.AbstractC23613d4;
import p716lb1.C23749z0;
import p720m91.InterfaceC25312u;
import r51.C30938f;
import r51.C30939g;

/* JADX INFO: renamed from: oh1.b */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001f\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\b\"\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\r"}, m65681d2 = {"Lcom/whoop/design/models/items/CountryModel;", "Lr51/g;", "l", "(Lcom/whoop/design/models/items/CountryModel;)Lr51/g;", "Lcom/whoop/gifting/feature/gifting/domain/models/GiftingModels;", "", "", "k", "(Lcom/whoop/gifting/feature/gifting/domain/models/GiftingModels;)Ljava/util/Map;", "Ljb1/a;", "a", "Ljb1/a;", "itemReducer", "gifting_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC27937b {

    /* JADX INFO: renamed from: a */
    private static final C21535a f112656a = AbstractC21537c.m60554d(new C27644e(11));

    /* JADX INFO: renamed from: oh1.b$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f112657w;

        public a(Function1 function1) {
            this.f112657w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f112657w.invoke((QuantitySelectorModel) it);
        }
    }

    /* JADX INFO: renamed from: oh1.b$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f112658w;

        public b(Function1 function1) {
            this.f112658w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f112658w.invoke((CountrySelectorModel) it);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m84296g(C21536b designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "$this$designItemReducer");
        designItemReducer.m60547b(new C27644e(12));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m84297h(C23749z0 addModelMapper) {
        AbstractC22676k.m65750j(addModelMapper, "$this$addModelMapper");
        C27644e c27644e = new C27644e(13);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        addModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(QuantitySelectorModel.class), new a(c27644e));
        addModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(CountrySelectorModel.class), new b(new C27644e(14)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C26723d m84298i(QuantitySelectorModel model) {
        AbstractC22676k.m65750j(model, "model");
        String id4 = model.getId();
        String description = model.getDescription();
        TextResource textResourceM21278l = description != null ? AbstractC8693b.m21278l(description) : null;
        NumericStepperModel numericStepper = model.getNumericStepper();
        int minimumStepperValue = numericStepper != null ? numericStepper.getMinimumStepperValue() : 0;
        NumericStepperModel numericStepper2 = model.getNumericStepper();
        int maximumStepperValue = numericStepper2 != null ? numericStepper2.getMaximumStepperValue() : 0;
        NumericStepperModel numericStepper3 = model.getNumericStepper();
        return new C26723d(id4, textResourceM21278l, minimumStepperValue, maximumStepperValue, numericStepper3 != null ? numericStepper3.getStartingStepperValue() : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C30938f m84299j(CountrySelectorModel model) {
        AbstractC22676k.m65750j(model, "model");
        TextResource textResourceM21278l = AbstractC8693b.m21278l(model.getTitle());
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l(model.getHeaderText());
        TextResource textResourceM21278l3 = AbstractC8693b.m21278l(model.getSearchPlaceholderText());
        C30939g c30939gM84301l = m84301l(model.getSelectedCountry());
        List<CountryModel> countries = model.getCountries();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(countries, 10));
        Iterator<T> it = countries.iterator();
        while (it.hasNext()) {
            arrayList.add(m84301l((CountryModel) it.next()));
        }
        return new C30938f(AbstractC23613d4.m68662l(model.getConfirmButton(), null, 1, null), AbstractC23613d4.m68662l(model.getCancelButton(), null, 1, null), c30939gM84301l, textResourceM21278l, textResourceM21278l2, textResourceM21278l3, arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final Map<String, String> m84300k(GiftingModels giftingModels) {
        Map<String, String> analytics = giftingModels.getAnalytics();
        if (analytics == null) {
            return C25272z.f99163w;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, String> entry : analytics.entrySet()) {
            if (entry.getValue().length() > 0) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: l */
    private static final C30939g m84301l(CountryModel countryModel) {
        return new C30939g(countryModel.getAlpha2(), countryModel.getAlpha3(), countryModel.getRegion(), countryModel.getPhoneCountryCode(), countryModel.getCountryFlag(), AbstractC8693b.m21278l(countryModel.getName()));
    }
}
