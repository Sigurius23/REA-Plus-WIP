package p262jv;

import android.content.res.TypedArray;
import android.graphics.Color;
import com.mapbox.maps.ImageHolder;
import java.util.Locale;
import l83.C23454a0;
import lv.C24756a;
import p562vv.C36526a;
import p661yv.C39796a;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: jv.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C21964a extends AbstractC22680m implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f85007w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ TypedArray f85008x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ float f85009y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C21964a(TypedArray typedArray, float f13, int i13) {
        super(1);
        this.f85007w = i13;
        this.f85008x = typedArray;
        this.f85009y = f13;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f85007w) {
            case 0:
                C21965b AttributionSettings = (C21965b) obj;
                AbstractC22676k.m65750j(AttributionSettings, "$this$AttributionSettings");
                TypedArray typedArray = this.f85008x;
                AttributionSettings.f85010a = typedArray.getBoolean(1, true);
                AttributionSettings.f85011b = typedArray.getColor(3, Color.parseColor("#FF1E8CAB"));
                AttributionSettings.f85012c = typedArray.getInt(2, 8388691);
                float f13 = this.f85009y;
                AttributionSettings.f85013d = typedArray.getDimension(5, 92.0f * f13);
                float f14 = f13 * 4.0f;
                AttributionSettings.f85014e = typedArray.getDimension(7, f14);
                AttributionSettings.f85015f = typedArray.getDimension(6, f14);
                AttributionSettings.f85016g = typedArray.getDimension(4, f14);
                AttributionSettings.f85017h = typedArray.getBoolean(0, true);
                break;
            case 1:
                C24756a CompassSettings = (C24756a) obj;
                AbstractC22676k.m65750j(CompassSettings, "$this$CompassSettings");
                TypedArray typedArray2 = this.f85008x;
                CompassSettings.f96797a = typedArray2.getBoolean(20, true);
                CompassSettings.f96798b = typedArray2.getInt(22, 8388661);
                float f15 = this.f85009y * 4.0f;
                CompassSettings.f96799c = typedArray2.getDimension(25, f15);
                CompassSettings.f96800d = typedArray2.getDimension(27, f15);
                CompassSettings.f96801e = typedArray2.getDimension(26, f15);
                CompassSettings.f96802f = typedArray2.getDimension(24, f15);
                CompassSettings.f96803g = typedArray2.getFloat(28, 1.0f);
                CompassSettings.f96804h = typedArray2.getFloat(29, 0.0f);
                CompassSettings.f96805i = typedArray2.getBoolean(30, true);
                CompassSettings.f96806j = typedArray2.getBoolean(21, true);
                CompassSettings.f96807k = typedArray2.getBoolean(19, true);
                CompassSettings.f96808l = ImageHolder.INSTANCE.from(typedArray2.getResourceId(23, -1));
                break;
            case 2:
                C36526a LogoSettings = (C36526a) obj;
                AbstractC22676k.m65750j(LogoSettings, "$this$LogoSettings");
                TypedArray typedArray3 = this.f85008x;
                LogoSettings.f156307a = typedArray3.getBoolean(97, true);
                LogoSettings.f156308b = typedArray3.getInt(98, 8388691);
                float f16 = this.f85009y * 4.0f;
                LogoSettings.f156309c = typedArray3.getDimension(100, f16);
                LogoSettings.f156310d = typedArray3.getDimension(102, f16);
                LogoSettings.f156311e = typedArray3.getDimension(101, f16);
                LogoSettings.f156312f = typedArray3.getDimension(99, f16);
                break;
            default:
                C39796a ScaleBarSettings = (C39796a) obj;
                AbstractC22676k.m65750j(ScaleBarSettings, "$this$ScaleBarSettings");
                TypedArray typedArray4 = this.f85008x;
                ScaleBarSettings.f171450a = typedArray4.getBoolean(115, true);
                ScaleBarSettings.f171451b = typedArray4.getInt(116, 8388659);
                float f17 = this.f85009y;
                float f18 = 4.0f * f17;
                ScaleBarSettings.f171452c = typedArray4.getDimension(120, f18);
                ScaleBarSettings.f171453d = typedArray4.getDimension(122, f18);
                ScaleBarSettings.f171454e = typedArray4.getDimension(121, f18);
                ScaleBarSettings.f171455f = typedArray4.getDimension(119, f18);
                ScaleBarSettings.f171456g = typedArray4.getColor(130, -16777216);
                ScaleBarSettings.f171457h = typedArray4.getColor(123, -16777216);
                ScaleBarSettings.f171458i = typedArray4.getColor(126, -1);
                float f19 = 2.0f * f17;
                ScaleBarSettings.f171459j = typedArray4.getDimension(114, f19);
                ScaleBarSettings.f171460k = typedArray4.getDimension(117, f19);
                float f24 = f17 * 8.0f;
                ScaleBarSettings.f171461l = typedArray4.getDimension(128, f24);
                ScaleBarSettings.f171462m = typedArray4.getDimension(129, f19);
                ScaleBarSettings.f171463n = typedArray4.getDimension(131, f24);
                String country = Locale.getDefault().getCountry();
                AbstractC22676k.m65749i(country, "getDefault().country");
                Locale locale = Locale.getDefault();
                AbstractC22676k.m65749i(locale, "getDefault()");
                String upperCase = country.toUpperCase(locale);
                AbstractC22676k.m65749i(upperCase, "this as java.lang.String).toUpperCase(locale)");
                int iHashCode = upperCase.hashCode();
                ScaleBarSettings.f171464o = typedArray4.getBoolean(118, iHashCode == 2438 ? !upperCase.equals("LR") : !(iHashCode == 2464 ? upperCase.equals("MM") : iHashCode == 2718 && upperCase.equals("US")));
                ScaleBarSettings.f171465p = typedArray4.getInt(125, 15);
                ScaleBarSettings.f171466q = typedArray4.getBoolean(127, true);
                ScaleBarSettings.f171467r = typedArray4.getFloat(124, 0.5f);
                ScaleBarSettings.f171468s = typedArray4.getBoolean(132, false);
                break;
        }
        return C23454a0.f92919a;
    }
}
