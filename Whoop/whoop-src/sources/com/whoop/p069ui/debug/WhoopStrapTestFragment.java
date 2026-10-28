package com.whoop.p069ui.debug;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import as2.C1951a;
import hi0.AbstractC17307e;
import hi0.AbstractC17308f;
import hj0.AbstractC17348g;
import s52.C32224e;
import y82.EnumC39339b;

/* JADX INFO: loaded from: classes10.dex */
public class WhoopStrapTestFragment extends AbstractC17348g {

    /* JADX INFO: renamed from: F */
    private C10485a f31738F;

    /* JADX INFO: renamed from: com.whoop.ui.debug.WhoopStrapTestFragment$a */
    public static class C10485a {

        /* JADX INFO: renamed from: a */
        LinearLayout f31739a;

        public C10485a(View view) {
            this.f31739a = (LinearLayout) view.findViewById(AbstractC17307e.f66651S1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public /* synthetic */ void m26835G(EnumC39339b enumC39339b, View view) {
        if (this.f31738F != null) {
            m26836I(enumC39339b, enumC39339b.performFromUi(getContext()));
        }
    }

    /* JADX INFO: renamed from: I */
    private void m26836I(EnumC39339b enumC39339b, EnumC39339b.t tVar) {
        if (tVar != null && !TextUtils.isEmpty(tVar.m125449e()) && this.f31738F != null) {
            Toast.makeText(getContext(), tVar.m125449e(), 0).show();
        }
        m26838H();
    }

    @Override // hj0.AbstractC17348g
    /* JADX INFO: renamed from: A */
    public String mo26762A() {
        return "WhoopStrapTest";
    }

    /* JADX INFO: renamed from: F */
    public void m26837F(EnumC39339b enumC39339b, TextView textView) {
        textView.setOnClickListener(new C1951a(new C32224e(2, this, enumC39339b)));
        textView.setText(enumC39339b.getUserDisplayName());
    }

    /* JADX INFO: renamed from: H */
    public void m26838H() {
        C10485a c10485a = this.f31738F;
        if (c10485a != null) {
            c10485a.f31739a.removeAllViews();
            for (EnumC39339b enumC39339b : EnumC39339b.values()) {
                if (enumC39339b.isVisibleInUi()) {
                    Button button = new Button(getContext());
                    m26837F(enumC39339b, button);
                    this.f31738F.f31739a.addView(button, new LinearLayout.LayoutParams(-1, -2));
                }
            }
        }
    }

    @Override // hj0.AbstractC17348g, androidx.fragment.app.DialogInterfaceOnCancelListenerC1361y, androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(AbstractC17308f.f66892n, viewGroup, false);
    }

    @Override // hj0.AbstractC17348g, androidx.fragment.app.DialogInterfaceOnCancelListenerC1361y, androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onDestroyView() {
        super.onDestroyView();
        this.f31738F = null;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f31738F = new C10485a(view);
        m26838H();
    }
}
