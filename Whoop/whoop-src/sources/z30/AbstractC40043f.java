package z30;

import com.stripe.android.p056ui.core.elements.autocomplete.model.AddressComponent;
import com.stripe.android.p056ui.core.elements.autocomplete.model.Place;
import ih0.AbstractC18489d0;
import java.util.List;
import java.util.Set;
import m83.AbstractC25260n;

/* JADX INFO: renamed from: z30.f */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC40043f {

    /* JADX INFO: renamed from: a */
    public static final Set f172767a = AbstractC25260n.m74059b1(new String[]{"BE", "BR", "CH", "DE", "ES", "ID", "IT", "MX", "NL", "NO", "PL", "RU", "SE"});

    /* JADX INFO: renamed from: a */
    public static final C40038a m128368a(C40038a c40038a) {
        C40038a c40038a2 = new C40038a(c40038a.f172751a, c40038a.f172752b, c40038a.f172753c, c40038a.f172754d, c40038a.f172755e, c40038a.f172756f, c40038a.f172757g);
        String strM53370k = c40038a.f172756f;
        if (strM53370k != null) {
            String str = c40038a.f172754d;
            if (str != null) {
                strM53370k = AbstractC18489d0.m53370k(str, ", ", strM53370k);
            }
            c40038a2.f172754d = strM53370k;
        }
        return c40038a2;
    }

    /* JADX INFO: renamed from: b */
    public static final AddressComponent m128369b(Place place, EnumC40042e enumC40042e) {
        List<AddressComponent> addressComponents = place.getAddressComponents();
        Object obj = null;
        if (addressComponents == null) {
            return null;
        }
        for (Object obj2 : addressComponents) {
            if (((AddressComponent) obj2).getTypes().contains(enumC40042e.f172766w)) {
                obj = obj2;
                break;
            }
        }
        return (AddressComponent) obj;
    }
}
