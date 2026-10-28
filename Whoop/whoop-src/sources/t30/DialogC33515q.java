package t30;

import android.app.Dialog;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.Window;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import k30.C22170c;
import l83.C23470p;
import m30.C24992h;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import sc0.C32355c;

/* JADX INFO: renamed from: t30.q */
/* JADX INFO: loaded from: classes6.dex */
public final class DialogC33515q extends Dialog {

    /* JADX INFO: renamed from: w */
    public final C24992h f139918w;

    /* JADX INFO: renamed from: x */
    public final C23470p f139919x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogC33515q(Context context, C24992h uiCustomization) {
        super(context);
        AbstractC22676k.m65750j(uiCustomization, "uiCustomization");
        this.f139918w = uiCustomization;
        this.f139919x = AbstractC30060g.m92088H(new C32355c(this, 6));
        setCancelable(false);
        Window window = getWindow();
        if (window != null) {
            window.clearFlags(2);
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setBackgroundDrawable(new ColorDrawable(0));
        }
    }

    @Override // android.app.Dialog
    public final void onStart() {
        String str;
        super.onStart();
        C23470p c23470p = this.f139919x;
        setContentView(((C22170c) c23470p.getValue()).f85986a);
        CircularProgressIndicator circularProgressIndicator = ((C22170c) c23470p.getValue()).f85987b;
        C24992h c24992h = this.f139918w;
        if (c24992h == null || (str = c24992h.f97799F) == null) {
            return;
        }
        circularProgressIndicator.setIndeterminateTintList(ColorStateList.valueOf(Color.parseColor(str)));
    }
}
