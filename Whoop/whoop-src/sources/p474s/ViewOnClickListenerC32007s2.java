package p474s;

import android.content.Context;
import android.view.View;
import android.view.Window;
import p444r.C30803a;

/* JADX INFO: renamed from: s.s2 */
/* JADX INFO: loaded from: classes5.dex */
public final class ViewOnClickListenerC32007s2 implements View.OnClickListener {

    /* JADX INFO: renamed from: w */
    public final C30803a f132821w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C32011t2 f132822x;

    public ViewOnClickListenerC32007s2(C32011t2 c32011t2) {
        this.f132822x = c32011t2;
        Context context = c32011t2.f132828a.getContext();
        CharSequence charSequence = c32011t2.f132835h;
        C30803a c30803a = new C30803a();
        c30803a.f126974f = 4096;
        c30803a.f126976h = 4096;
        c30803a.f126981m = null;
        c30803a.f126982n = null;
        c30803a.f126983o = false;
        c30803a.f126984p = false;
        c30803a.f126985q = 16;
        c30803a.f126978j = context;
        c30803a.f126970b = charSequence;
        this.f132821w = c30803a;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C32011t2 c32011t2 = this.f132822x;
        Window.Callback callback = c32011t2.f132838k;
        if (callback == null || !c32011t2.f132839l) {
            return;
        }
        callback.onMenuItemSelected(0, this.f132821w);
    }
}
