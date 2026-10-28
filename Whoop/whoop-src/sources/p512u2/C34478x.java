package p512u2;

import android.view.MotionEvent;
import l83.C23454a0;
import p028b4.C2694e;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: u2.x */
/* JADX INFO: loaded from: classes5.dex */
public final class C34478x extends AbstractC22680m implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f144848w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C34479y f144849x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C34478x(C34479y c34479y, int i13) {
        super(1);
        this.f144848w = i13;
        this.f144849x = c34479y;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f144848w) {
            case 0:
                MotionEvent motionEvent = (MotionEvent) obj;
                C2694e c2694e = this.f144849x.f144850w;
                if (c2694e != null) {
                    c2694e.invoke(motionEvent);
                    return C23454a0.f92919a;
                }
                AbstractC22676k.m65757q("onTouchEvent");
                throw null;
            default:
                MotionEvent motionEvent2 = (MotionEvent) obj;
                C2694e c2694e2 = this.f144849x.f144850w;
                if (c2694e2 != null) {
                    c2694e2.invoke(motionEvent2);
                    return C23454a0.f92919a;
                }
                AbstractC22676k.m65757q("onTouchEvent");
                throw null;
        }
    }
}
