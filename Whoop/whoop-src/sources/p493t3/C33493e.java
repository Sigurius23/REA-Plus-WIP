package p493t3;

import android.text.style.ClickableSpan;
import android.view.View;
import i20.C17990z0;
import p294l3.AbstractC23284v;

/* JADX INFO: renamed from: t3.e */
/* JADX INFO: loaded from: classes5.dex */
public final class C33493e extends ClickableSpan {

    /* JADX INFO: renamed from: w */
    public final AbstractC23284v f139840w;

    public C33493e(AbstractC23284v abstractC23284v) {
        this.f139840w = abstractC23284v;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        AbstractC23284v abstractC23284v = this.f139840w;
        C17990z0 c17990z0Mo67352a = abstractC23284v.mo67352a();
        if (c17990z0Mo67352a != null) {
            c17990z0Mo67352a.m51594a(abstractC23284v);
        }
    }
}
