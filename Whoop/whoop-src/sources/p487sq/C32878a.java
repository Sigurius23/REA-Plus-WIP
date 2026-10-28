package p487sq;

import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.recyclerview.widget.AbstractC1724q1;
import androidx.recyclerview.widget.C1701k2;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.whoop.android.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p543v4.AbstractC35642a;

/* JADX INFO: renamed from: sq.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C32878a extends AbstractC1724q1 {

    /* JADX INFO: renamed from: a */
    public final Paint f137024a;

    /* JADX INFO: renamed from: b */
    public final List f137025b;

    public C32878a() {
        Paint paint = new Paint();
        this.f137024a = paint;
        this.f137025b = Collections.unmodifiableList(new ArrayList());
        paint.setStrokeWidth(5.0f);
        paint.setColor(-65281);
    }

    @Override // androidx.recyclerview.widget.AbstractC1724q1
    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, C1701k2 c1701k2) {
        Canvas canvas2;
        float dimension = recyclerView.getResources().getDimension(R.dimen.m3_carousel_debug_keyline_width);
        Paint paint = this.f137024a;
        paint.setStrokeWidth(dimension);
        Iterator it = this.f137025b.iterator();
        while (it.hasNext()) {
            ((AbstractC32880c) it.next()).getClass();
            paint.setColor(AbstractC35642a.m112833b(0.0f, -65281, -16776961));
            if (((CarouselLayoutManager) recyclerView.getLayoutManager()).m15726d()) {
                canvas2 = canvas;
                canvas2.drawLine(0.0f, ((CarouselLayoutManager) recyclerView.getLayoutManager()).f20865b.mo1501m(), 0.0f, ((CarouselLayoutManager) recyclerView.getLayoutManager()).f20865b.mo1497g(), paint);
            } else {
                canvas2 = canvas;
                canvas2.drawLine(((CarouselLayoutManager) recyclerView.getLayoutManager()).f20865b.mo1498i(), 0.0f, ((CarouselLayoutManager) recyclerView.getLayoutManager()).f20865b.mo1499k(), 0.0f, paint);
            }
            canvas = canvas2;
        }
    }
}
