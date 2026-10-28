package q52;

import android.graphics.drawable.GradientDrawable;
import android.view.View;
import p479s4.AbstractC32122c;

/* JADX INFO: renamed from: q52.d */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC29986d {

    /* JADX INFO: renamed from: a */
    public static final c f122453a = new b();

    /* JADX INFO: renamed from: q52.d$a */
    public class a implements View.OnLayoutChangeListener {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ int f122454E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ float f122455F;

        /* JADX INFO: renamed from: G */
        final /* synthetic */ float f122456G;

        /* JADX INFO: renamed from: w */
        private int f122457w = 0;

        /* JADX INFO: renamed from: x */
        private int f122458x = 0;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ c f122459y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ int f122460z;

        public a(c cVar, int i13, int i14, float f13, float f14) {
            this.f122459y = cVar;
            this.f122460z = i13;
            this.f122454E = i14;
            this.f122455F = f13;
            this.f122456G = f14;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i24) {
            int i25 = i15 - i13;
            int i26 = i16 - i14;
            if (i25 != this.f122457w || i26 != this.f122458x) {
                float fMo91713a = this.f122459y.mo91713a(i25, i26);
                GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{this.f122460z, this.f122454E});
                gradientDrawable.setGradientType(1);
                gradientDrawable.setGradientRadius(fMo91713a);
                gradientDrawable.setGradientCenter(this.f122455F, this.f122456G);
                view.setBackground(gradientDrawable);
            }
            this.f122457w = i25;
            this.f122458x = i26;
        }
    }

    /* JADX INFO: renamed from: q52.d$b */
    public static class b implements c {

        /* JADX INFO: renamed from: a */
        private float f122461a = 1.0f;

        @Override // q52.AbstractC29986d.c
        /* JADX INFO: renamed from: a */
        public float mo91713a(int i13, int i14) {
            return ((float) Math.sqrt((i14 * i14) + (i13 * i13))) * this.f122461a;
        }
    }

    /* JADX INFO: renamed from: q52.d$c */
    public interface c {
        /* JADX INFO: renamed from: a */
        float mo91713a(int i13, int i14);
    }

    /* JADX INFO: renamed from: a */
    public static void m91711a(View view, int i13, int i14, float f13, float f14, c cVar) {
        view.addOnLayoutChangeListener(new a(cVar, i13, i14, f13, f14));
    }

    /* JADX INFO: renamed from: b */
    public static void m91712b(View view, int i13, int i14, float f13, float f14, c cVar) {
        m91711a(view, AbstractC32122c.getColor(view.getContext(), i13), AbstractC32122c.getColor(view.getContext(), i14), f13, f14, cVar);
    }
}
