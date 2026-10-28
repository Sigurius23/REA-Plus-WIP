package p028b4;

import android.view.MotionEvent;
import androidx.compose.p018ui.node.Owner;
import androidx.compose.p018ui.platform.AndroidComposeView;
import l83.C23454a0;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22680m;
import p715kotlin.jvm.internal.AbstractC22681m0;

/* JADX INFO: renamed from: b4.e */
/* JADX INFO: loaded from: classes5.dex */
public final class C2694e extends AbstractC22680m implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f10599w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ AbstractC2701l f10600x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2694e(AbstractC2701l abstractC2701l, int i13) {
        super(1);
        this.f10599w = i13;
        this.f10600x = abstractC2701l;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean zDispatchTouchEvent;
        switch (this.f10599w) {
            case 0:
                Owner owner = (Owner) obj;
                AndroidComposeView androidComposeView = owner instanceof AndroidComposeView ? (AndroidComposeView) owner : null;
                AbstractC2701l abstractC2701l = this.f10600x;
                if (androidComposeView != null) {
                    androidComposeView.getAndroidViewsHandler$ui_release().removeViewInLayout(abstractC2701l);
                    AbstractC22681m0.m65772c(androidComposeView.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder()).remove(androidComposeView.getAndroidViewsHandler$ui_release().getHolderToLayoutNode().remove(abstractC2701l));
                    abstractC2701l.setImportantForAccessibility(0);
                }
                abstractC2701l.removeAllViewsInLayout();
                return C23454a0.f92919a;
            default:
                MotionEvent motionEvent = (MotionEvent) obj;
                int actionMasked = motionEvent.getActionMasked();
                AbstractC2701l abstractC2701l2 = this.f10600x;
                switch (actionMasked) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        zDispatchTouchEvent = abstractC2701l2.dispatchTouchEvent(motionEvent);
                        break;
                    default:
                        zDispatchTouchEvent = abstractC2701l2.dispatchGenericMotionEvent(motionEvent);
                        break;
                }
                return Boolean.valueOf(zDispatchTouchEvent);
        }
    }
}
