package fr;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: fr.l */
/* JADX INFO: loaded from: classes6.dex */
public final class C14701l extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f54348a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC14702m f54349b;

    public /* synthetic */ C14701l(AbstractC14702m abstractC14702m, int i13) {
        this.f54348a = i13;
        this.f54349b = abstractC14702m;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.f54348a) {
            case 1:
                super.onAnimationEnd(animator);
                AbstractC14702m abstractC14702m = this.f54349b;
                super/*android.graphics.drawable.Drawable*/.setVisible(false, false);
                ArrayList arrayList = abstractC14702m.f54352F;
                if (arrayList != null && !abstractC14702m.f54353G) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((C14692c) it.next()).m42126a(abstractC14702m);
                    }
                    break;
                }
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f54348a) {
            case 0:
                super.onAnimationStart(animator);
                AbstractC14702m abstractC14702m = this.f54349b;
                ArrayList arrayList = abstractC14702m.f54352F;
                if (arrayList != null && !abstractC14702m.f54353G) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((C14692c) it.next()).m42127b(abstractC14702m);
                    }
                    break;
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
