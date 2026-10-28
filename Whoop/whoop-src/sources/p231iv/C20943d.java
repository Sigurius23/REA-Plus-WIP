package p231iv;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import androidx.fragment.app.AbstractActivityC1340r0;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import p403pp.C29408d;
import p479s4.AbstractC32122c;
import p656yp.C39699f;
import p715kotlin.jvm.internal.AbstractC22676k;
import so.C32800q;

/* JADX INFO: renamed from: iv.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C20943d extends ArrayAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f79126a = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f79127b;

    /* JADX WARN: Illegal instructions before constructor call */
    public C20943d(C39699f c39699f, AbstractActivityC1340r0 abstractActivityC1340r0) {
        this.f79127b = c39699f;
        C32800q c32800q = c39699f.f170866y;
        Resources resources = (Resources) c32800q.f136504w;
        String str = (String) c32800q.f136505x;
        super(abstractActivityC1340r0, resources.getIdentifier("libraries_social_licenses_license", "layout", str), ((Resources) c32800q.f136504w).getIdentifier("license", "id", str), new ArrayList());
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i13, View view, ViewGroup parent) {
        switch (this.f79126a) {
            case 0:
                AbstractC22676k.m65750j(parent, "parent");
                View view2 = super.getView(i13, view, parent);
                AbstractC22676k.m65749i(view2, "super.getView(position, convertView, parent)");
                C20940a c20940a = (C20940a) ((List) this.f79127b).get(i13);
                TextView textView = (TextView) view2.findViewById(R.id.text1);
                textView.setTextColor(c20940a.f79120b.length() == 0 ? -7829368 : AbstractC32122c.getColor(textView.getContext(), com.whoop.android.R.color.mapbox_blue));
                textView.setText(c20940a.f79119a);
                return view2;
            default:
                C39699f c39699f = (C39699f) this.f79127b;
                if (view == null) {
                    LayoutInflater layoutInflater = c39699f.getLayoutInflater();
                    C32800q c32800q = c39699f.f170866y;
                    Resources resources = (Resources) c32800q.f136504w;
                    view = layoutInflater.inflate((XmlPullParser) resources.getXml(resources.getIdentifier("libraries_social_licenses_license", "layout", (String) c32800q.f136505x)), parent, false);
                }
                C29408d c29408d = (C29408d) getItem(i13);
                if (c29408d != null) {
                    C32800q c32800q2 = c39699f.f170866y;
                    ((TextView) view.findViewById(((Resources) c32800q2.f136504w).getIdentifier("license", "id", (String) c32800q2.f136505x))).setText(c29408d.f119430w);
                }
                return view;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20943d(Context context, List list) {
        super(context, com.whoop.android.R.layout.mapbox_attribution_list_item, list);
        this.f79127b = list;
    }
}
