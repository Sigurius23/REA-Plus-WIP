package io.getstream.chat.android.p226ui.feature.messages.list.adapter.view.internal;

import android.view.View;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: io.getstream.chat.android.ui.feature.messages.list.adapter.view.internal.j */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC19779j implements View.OnClickListener {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f74638w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f74639x;

    public /* synthetic */ ViewOnClickListenerC19779j(Function1 function1, int i13) {
        this.f74638w = i13;
        this.f74639x = function1;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i13 = this.f74638w;
        Function1 function1 = this.f74639x;
        switch (i13) {
            case 0:
                int i14 = FootnoteView.f74615w;
                function1.invoke(view);
                break;
            default:
                int i15 = FootnoteView.f74615w;
                function1.invoke(view);
                break;
        }
    }
}
