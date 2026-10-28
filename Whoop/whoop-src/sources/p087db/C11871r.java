package p087db;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.AbstractC1692i1;
import androidx.recyclerview.widget.AbstractC1717o2;
import androidx.recyclerview.widget.C1744v1;
import com.whoop.android.R;
import jo.C21826o;
import jo.C21830s;
import p004a2.AbstractC0152a;
import p516u8.InterfaceC34599j0;

/* JADX INFO: renamed from: db.r */
/* JADX INFO: loaded from: classes5.dex */
public final class C11871r extends AbstractC1692i1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f38746a = 0;

    /* JADX INFO: renamed from: b */
    public final String[] f38747b;

    /* JADX INFO: renamed from: c */
    public final String[] f38748c;

    /* JADX INFO: renamed from: d */
    public final Drawable[] f38749d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ FrameLayout f38750e;

    public C11871r(C21830s c21830s, String[] strArr, Drawable[] drawableArr) {
        this.f38750e = c21830s;
        this.f38747b = strArr;
        this.f38748c = new String[strArr.length];
        this.f38749d = drawableArr;
    }

    /* JADX INFO: renamed from: a */
    public boolean m31841a(int i13) {
        C11882x c11882x = (C11882x) this.f38750e;
        InterfaceC34599j0 interfaceC34599j0 = c11882x.f38789J0;
        if (interfaceC34599j0 == null) {
            return false;
        }
        if (i13 == 0) {
            return ((AbstractC0152a) interfaceC34599j0).m367A(13);
        }
        if (i13 != 1) {
            return true;
        }
        return ((AbstractC0152a) interfaceC34599j0).m367A(30) && ((AbstractC0152a) c11882x.f38789J0).m367A(29);
    }

    @Override // androidx.recyclerview.widget.AbstractC1692i1
    /* JADX INFO: renamed from: getItemCount */
    public final int getDisplayCount() {
        switch (this.f38746a) {
            case 0:
                break;
        }
        return this.f38747b.length;
    }

    @Override // androidx.recyclerview.widget.AbstractC1692i1
    public final long getItemId(int i13) {
        switch (this.f38746a) {
            case 0:
                break;
        }
        return i13;
    }

    @Override // androidx.recyclerview.widget.AbstractC1692i1
    public final void onBindViewHolder(AbstractC1717o2 abstractC1717o2, int i13) {
        switch (this.f38746a) {
            case 0:
                C11869q c11869q = (C11869q) abstractC1717o2;
                if (m31841a(i13)) {
                    c11869q.itemView.setLayoutParams(new C1744v1(-1, -2));
                } else {
                    c11869q.itemView.setLayoutParams(new C1744v1(0, 0));
                }
                TextView textView = c11869q.f38742a;
                ImageView imageView = c11869q.f38744c;
                TextView textView2 = c11869q.f38743b;
                textView.setText(this.f38747b[i13]);
                String str = this.f38748c[i13];
                if (str == null) {
                    textView2.setVisibility(8);
                } else {
                    textView2.setText(str);
                }
                Drawable drawable = this.f38749d[i13];
                if (drawable != null) {
                    imageView.setImageDrawable(drawable);
                } else {
                    imageView.setVisibility(8);
                }
                break;
            default:
                C21826o c21826o = (C21826o) abstractC1717o2;
                TextView textView3 = c21826o.f84146a;
                ImageView imageView2 = c21826o.f84148c;
                TextView textView4 = c21826o.f84147b;
                textView3.setText(this.f38747b[i13]);
                String str2 = this.f38748c[i13];
                if (str2 == null) {
                    textView4.setVisibility(8);
                } else {
                    textView4.setText(str2);
                }
                Drawable drawable2 = this.f38749d[i13];
                if (drawable2 != null) {
                    imageView2.setImageDrawable(drawable2);
                } else {
                    imageView2.setVisibility(8);
                }
                break;
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC1692i1
    public final AbstractC1717o2 onCreateViewHolder(ViewGroup viewGroup, int i13) {
        switch (this.f38746a) {
            case 0:
                C11882x c11882x = (C11882x) this.f38750e;
                return new C11869q(c11882x, LayoutInflater.from(c11882x.getContext()).inflate(R.layout.exo_styled_settings_list_item, viewGroup, false));
            default:
                C21830s c21830s = (C21830s) this.f38750e;
                return new C21826o(c21830s, LayoutInflater.from(c21830s.getContext()).inflate(R.layout.exo_styled_settings_list_item, viewGroup, false));
        }
    }

    public C11871r(C11882x c11882x, String[] strArr, Drawable[] drawableArr) {
        this.f38750e = c11882x;
        this.f38747b = strArr;
        this.f38748c = new String[strArr.length];
        this.f38749d = drawableArr;
    }
}
