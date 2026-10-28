package s40;

import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Filter;
import android.widget.ImageView;
import android.widget.TextView;
import com.stripe.android.core.model.Country;
import com.whoop.android.R;
import java.util.List;
import m83.AbstractC25265s;
import p715kotlin.jvm.internal.AbstractC22676k;
import q11.C29793c;
import y00.EnumC38853i;

/* JADX INFO: renamed from: s40.h */
/* JADX INFO: loaded from: classes6.dex */
public final class C32153h extends ArrayAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f133203a = 1;

    /* JADX INFO: renamed from: b */
    public List f133204b;

    /* JADX INFO: renamed from: c */
    public final Object f133205c;

    /* JADX INFO: renamed from: d */
    public final Object f133206d;

    /* JADX INFO: renamed from: e */
    public Object f133207e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32153h(Context context, List unfilteredCountries, int i13, C29793c c29793c) {
        super(context, i13);
        AbstractC22676k.m65750j(unfilteredCountries, "unfilteredCountries");
        this.f133204b = unfilteredCountries;
        this.f133205c = c29793c;
        this.f133206d = new C32148f0(this.f133204b, this, context instanceof Activity ? (Activity) context : null);
        this.f133207e = this.f133204b;
    }

    /* JADX INFO: renamed from: a */
    public Country m100105a(int i13) {
        return (Country) ((List) this.f133207e).get(i13);
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean areAllItemsEnabled() {
        switch (this.f133203a) {
            case 0:
                return false;
            default:
                return super.areAllItemsEnabled();
        }
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final int getCount() {
        switch (this.f133203a) {
            case 0:
                List list = this.f133204b;
                if (list.isEmpty()) {
                    return 0;
                }
                return list.size() + 1;
            default:
                return ((List) this.f133207e).size();
        }
    }

    @Override // android.widget.ArrayAdapter, android.widget.Filterable
    public Filter getFilter() {
        switch (this.f133203a) {
            case 1:
                return (C32148f0) this.f133206d;
            default:
                return super.getFilter();
        }
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final Object getItem(int i13) {
        switch (this.f133203a) {
            case 0:
                if (i13 == 0) {
                    return null;
                }
                return (EnumC38853i) super.getItem(i13 - 1);
            default:
                return m100105a(i13);
        }
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public long getItemId(int i13) {
        switch (this.f133203a) {
            case 1:
                return m100105a(i13).hashCode();
            default:
                return super.getItemId(i13);
        }
    }

    @Override // android.widget.ArrayAdapter
    public int getPosition(Object obj) {
        switch (this.f133203a) {
            case 1:
                List list = (List) this.f133207e;
                AbstractC22676k.m65750j(list, "<this>");
                return list.indexOf((Country) obj);
            default:
                return super.getPosition(obj);
        }
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i13, View view, ViewGroup parent) {
        switch (this.f133203a) {
            case 0:
                LayoutInflater layoutInflater = (LayoutInflater) this.f133206d;
                AbstractC22676k.m65750j(parent, "parent");
                View viewInflate = i13 == 0 ? layoutInflater.inflate(R.layout.stripe_select_card_brand_view, parent, false) : layoutInflater.inflate(R.layout.stripe_card_brand_choice_list_view, parent, false);
                if (i13 > 0) {
                    AbstractC22676k.m65747g(viewInflate);
                    C32137b1 c32137b1 = (C32137b1) this.f133207e;
                    EnumC38853i enumC38853i = (EnumC38853i) AbstractC25265s.m74102I0(i13 - 1, this.f133204b);
                    if (enumC38853i != null) {
                        boolean z4 = enumC38853i == ((EnumC38853i) this.f133205c);
                        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.brand_icon);
                        if (imageView != null) {
                            imageView.setImageResource(enumC38853i.f167262y);
                        }
                        ImageView imageView2 = (ImageView) viewInflate.findViewById(R.id.brand_check);
                        if (z4) {
                            imageView2.setVisibility(0);
                            imageView2.setColorFilter(c32137b1.f133170f);
                        } else {
                            imageView2.setVisibility(8);
                        }
                        TextView textView = (TextView) viewInflate.findViewById(R.id.brand_text);
                        if (textView != null) {
                            textView.setText(enumC38853i.f167261x);
                            if (z4) {
                                textView.setTextColor(c32137b1.f133170f);
                                textView.setTypeface(Typeface.DEFAULT_BOLD);
                            } else {
                                textView.setTypeface(Typeface.DEFAULT);
                            }
                        }
                    }
                }
                AbstractC22676k.m65747g(viewInflate);
                return viewInflate;
            default:
                AbstractC22676k.m65750j(parent, "viewGroup");
                TextView textView2 = view instanceof TextView ? (TextView) view : (TextView) ((C29793c) this.f133205c).invoke(parent);
                textView2.setText(m100105a(i13).getName());
                return textView2;
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean isEnabled(int i13) {
        switch (this.f133203a) {
            case 0:
                return i13 != 0;
            default:
                return super.isEnabled(i13);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32153h(Context context, List brands, EnumC38853i enumC38853i) {
        super(context, 0, brands);
        AbstractC22676k.m65750j(brands, "brands");
        this.f133204b = brands;
        this.f133205c = enumC38853i;
        this.f133206d = LayoutInflater.from(context);
        this.f133207e = new C32137b1(context);
    }
}
