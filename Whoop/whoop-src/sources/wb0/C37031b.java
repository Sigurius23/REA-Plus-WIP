package wb0;

import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import java.util.List;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: wb0.b */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JQ\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0011J3\u0010\u0016\u001a\u0004\u0018\u00010\u00062\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Lwb0/b;", "", "<init>", "()V", "", "inputValue", "", "numericValue", "minValue", "maxValue", "initialValue", "", "isIncluded", "invalidFormatMessage", "outOfRangeMessage", "Lwb0/a;", "b", "(Ljava/lang/String;Ljava/lang/Double;DDLjava/lang/Double;ZLjava/lang/String;Ljava/lang/String;)Lwb0/a;", "", "Lwb0/c;", "categoricalOptions", "selectedCategoricalValue", "a", "(Ljava/util/List;Ljava/lang/Double;Ljava/lang/Double;)Ljava/lang/Double;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C37031b {

    /* JADX INFO: renamed from: a */
    public static final C37031b f158424a = new C37031b();

    private C37031b() {
    }

    /* JADX INFO: renamed from: a */
    public final Double m118840a(List<C37032c> categoricalOptions, Double selectedCategoricalValue, Double numericValue) {
        return categoricalOptions != null ? selectedCategoricalValue : numericValue;
    }

    /* JADX INFO: renamed from: b */
    public final C37030a m118841b(String inputValue, Double numericValue, double minValue, double maxValue, Double initialValue, boolean isIncluded, String invalidFormatMessage, String outOfRangeMessage) {
        TextResource c8691e;
        AbstractC22676k.m65750j(inputValue, "inputValue");
        AbstractC22676k.m65750j(invalidFormatMessage, "invalidFormatMessage");
        AbstractC22676k.m65750j(outOfRangeMessage, "outOfRangeMessage");
        boolean z4 = true;
        boolean z13 = inputValue.length() != 0 && numericValue != null && numericValue.doubleValue() >= minValue && numericValue.doubleValue() <= maxValue;
        if (inputValue.length() == 0) {
            c8691e = AbstractC8693b.m21267a();
        } else if (numericValue == null) {
            c8691e = new TextResource.C8691e(invalidFormatMessage);
        } else {
            c8691e = (numericValue.doubleValue() < minValue || numericValue.doubleValue() > maxValue) ? new TextResource.C8691e(outOfRangeMessage) : AbstractC8693b.m21267a();
        }
        if (initialValue != null ? !(!inputValue.equals(String.valueOf(initialValue.doubleValue())) || !isIncluded) : inputValue.length() <= 0) {
            z4 = false;
        }
        return new C37030a(inputValue, numericValue, z13, c8691e, z4);
    }
}
