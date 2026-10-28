package s40;

import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Filter;
import com.stripe.android.core.model.Country;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: s40.f0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C32148f0 extends Filter {

    /* JADX INFO: renamed from: a */
    public List f133193a;

    /* JADX INFO: renamed from: b */
    public final C32153h f133194b;

    /* JADX INFO: renamed from: c */
    public final WeakReference f133195c;

    public C32148f0(List unfilteredCountries, C32153h c32153h, Activity activity) {
        AbstractC22676k.m65750j(unfilteredCountries, "unfilteredCountries");
        this.f133193a = unfilteredCountries;
        this.f133194b = c32153h;
        this.f133195c = new WeakReference(activity);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x006b  */
    @Override // android.widget.Filter
    public final Filter.FilterResults performFiltering(CharSequence charSequence) {
        List list;
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (charSequence != null) {
            List list2 = this.f133193a;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list2) {
                String name = ((Country) obj).getName();
                Locale locale = Locale.ROOT;
                String lowerCase = name.toLowerCase(locale);
                AbstractC22676k.m65749i(lowerCase, "toLowerCase(...)");
                String lowerCase2 = String.valueOf(charSequence).toLowerCase(locale);
                AbstractC22676k.m65749i(lowerCase2, "toLowerCase(...)");
                if (AbstractC39421y.m125930O(lowerCase, lowerCase2, false)) {
                    arrayList.add(obj);
                }
            }
            if (arrayList.isEmpty() || (arrayList.size() == 1 && AbstractC22676k.m65745e(((Country) arrayList.get(0)).getName(), String.valueOf(charSequence)))) {
                list = arrayList;
                list = arrayList;
                list = this.f133193a;
            }
            if (list == null) {
                list = this.f133193a;
            }
        } else {
            list = this.f133193a;
        }
        filterResults.values = list;
        return filterResults;
    }

    @Override // android.widget.Filter
    public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        Object obj = filterResults != null ? filterResults.values : null;
        AbstractC22676k.m65748h(obj, "null cannot be cast to non-null type kotlin.collections.List<com.stripe.android.core.model.Country>");
        List list = (List) obj;
        Activity activity = (Activity) this.f133195c.get();
        if (activity != null) {
            List list2 = list;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    if (AbstractC22676k.m65745e(((Country) it.next()).getName(), charSequence)) {
                        Object systemService = activity.getSystemService("input_method");
                        InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
                        if (inputMethodManager == null || !inputMethodManager.isAcceptingText()) {
                            break;
                            break;
                        } else {
                            View currentFocus = activity.getCurrentFocus();
                            inputMethodManager.hideSoftInputFromWindow(currentFocus != null ? currentFocus.getWindowToken() : null, 0);
                            break;
                        }
                    }
                }
            }
        }
        C32153h c32153h = this.f133194b;
        c32153h.f133207e = list;
        c32153h.notifyDataSetChanged();
    }
}
