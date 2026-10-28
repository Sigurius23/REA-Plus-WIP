package com.whoop.p069ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: com.whoop.ui.k */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BS\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\n\u0012\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J)\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u0013\u001a\u00020\u00052\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ)\u0010\u001f\u001a\u00020\u00192\u0006\u0010\u0013\u001a\u00020\u00052\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001f\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u0012R\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b#\u0010!\u001a\u0004\b$\u0010\u0012R\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0014\u0010!\u001a\u0004\b%\u0010\u0012R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\n8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R%\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\r\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-¨\u0006."}, m65681d2 = {"Lcom/whoop/ui/k;", "Landroid/widget/ArrayAdapter;", "", "Landroid/content/Context;", "context", "", "itemRes", "dropDownRes", "menuRes", "textViewId", "", "values", "Lkotlin/Function1;", "Ll83/a0;", "onClick", "<init>", "(Landroid/content/Context;IIII[Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "getCount", "()I", "position", "c", "(I)Ljava/lang/String;", "", "getItemId", "(I)J", "Landroid/view/View;", "convertView", "Landroid/view/ViewGroup;", "parent", "getDropDownView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "getView", "a", "I", "getDropDownRes", "b", "getMenuRes", "getTextViewId", "d", "[Ljava/lang/String;", "getValues", "()[Ljava/lang/String;", "e", "Lkotlin/jvm/functions/Function1;", "getOnClick", "()Lkotlin/jvm/functions/Function1;", "feature_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C10593k extends ArrayAdapter<String> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int dropDownRes;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int menuRes;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int textViewId;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String[] values;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final Function1 onClick;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10593k(Context context, int i13, int i14, int i15, int i16, String[] values, Function1 function1) {
        super(context, i13, values);
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(values, "values");
        this.dropDownRes = i14;
        this.menuRes = i15;
        this.textViewId = i16;
        this.values = values;
        this.onClick = function1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static final void m27328b(C10593k c10593k, int i13, View view) {
        c10593k.onClick.invoke(Integer.valueOf(i13));
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public String getItem(int position) {
        return this.values[position];
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public int getCount() {
        return this.values.length;
    }

    @Override // android.widget.ArrayAdapter, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int position, View convertView, ViewGroup parent) {
        AbstractC22676k.m65750j(parent, "parent");
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(this.dropDownRes, parent, false);
        }
        ((TextView) convertView.findViewById(this.textViewId)).setText(this.values[position]);
        if (this.onClick != null) {
            convertView.setOnClickListener(new ViewOnClickListenerC10592j(this, position, 0));
        }
        return convertView;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public long getItemId(int position) {
        return position;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public View getView(int position, View convertView, ViewGroup parent) {
        AbstractC22676k.m65750j(parent, "parent");
        if (convertView != null) {
            return convertView;
        }
        View viewInflate = LayoutInflater.from(getContext()).inflate(this.menuRes, parent, false);
        AbstractC22676k.m65749i(viewInflate, "inflate(...)");
        return viewInflate;
    }
}
