package p292l1;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: l1.j */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC23114j {

    /* JADX INFO: renamed from: a */
    public static final WeakHashMap f91334a = new WeakHashMap();

    /* JADX INFO: renamed from: a */
    public static String m67093a(int i13, Locale locale) {
        if (locale == null) {
            locale = Locale.getDefault();
        }
        String str = "1.40.false." + locale.toLanguageTag();
        WeakHashMap weakHashMap = f91334a;
        Object obj = weakHashMap.get(str);
        Object obj2 = obj;
        if (obj == null) {
            NumberFormat integerInstance = NumberFormat.getIntegerInstance(locale);
            integerInstance.setGroupingUsed(false);
            integerInstance.setMinimumIntegerDigits(1);
            integerInstance.setMaximumIntegerDigits(40);
            weakHashMap.put(str, integerInstance);
            obj2 = integerInstance;
        }
        return ((NumberFormat) obj2).format(Integer.valueOf(i13));
    }
}
