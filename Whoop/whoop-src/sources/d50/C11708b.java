package d50;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/* JADX INFO: renamed from: d50.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C11708b extends View {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f37851w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C11708b(Context context, int i13) {
        super(context);
        this.f37851w = i13;
    }

    @Override // android.view.View
    public int getWindowSystemUiVisibility() {
        switch (this.f37851w) {
            case 1:
                return 0;
            default:
                return super.getWindowSystemUiVisibility();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        switch (this.f37851w) {
            case 0:
                getWidth();
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }
}
