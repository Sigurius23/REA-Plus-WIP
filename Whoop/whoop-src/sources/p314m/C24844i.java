package p314m;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;

/* JADX INFO: renamed from: m.i */
/* JADX INFO: loaded from: classes5.dex */
public class C24844i {

    /* JADX INFO: renamed from: a */
    public final C24836e f97324a;

    /* JADX INFO: renamed from: b */
    public final int f97325b;

    public C24844i(Context context) {
        this(context, DialogInterfaceC24846j.m72853g(context, 0));
    }

    /* JADX INFO: renamed from: a */
    public final void m72848a(int i13) {
        C24836e c24836e = this.f97324a;
        c24836e.f97261f = c24836e.f97256a.getText(i13);
    }

    /* JADX INFO: renamed from: b */
    public final void m72849b(int i13) {
        C24836e c24836e = this.f97324a;
        c24836e.f97259d = c24836e.f97256a.getText(i13);
    }

    /* JADX INFO: renamed from: c */
    public final DialogInterfaceC24846j m72850c() {
        DialogInterfaceC24846j dialogInterfaceC24846jCreate = create();
        dialogInterfaceC24846jCreate.show();
        return dialogInterfaceC24846jCreate;
    }

    public DialogInterfaceC24846j create() {
        C24836e c24836e = this.f97324a;
        DialogInterfaceC24846j dialogInterfaceC24846j = new DialogInterfaceC24846j(c24836e.f97256a, this.f97325b);
        View view = c24836e.f97260e;
        C24842h c24842h = dialogInterfaceC24846j.f97334F;
        if (view != null) {
            c24842h.f97319w = view;
        } else {
            CharSequence charSequence = c24836e.f97259d;
            if (charSequence != null) {
                c24842h.f97300d = charSequence;
                TextView textView = c24842h.f97317u;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = c24836e.f97258c;
            if (drawable != null) {
                c24842h.f97315s = drawable;
                ImageView imageView = c24842h.f97316t;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    c24842h.f97316t.setImageDrawable(drawable);
                }
            }
        }
        CharSequence charSequence2 = c24836e.f97261f;
        if (charSequence2 != null) {
            c24842h.f97301e = charSequence2;
            TextView textView2 = c24842h.f97318v;
            if (textView2 != null) {
                textView2.setText(charSequence2);
            }
        }
        CharSequence charSequence3 = c24836e.f97262g;
        if (charSequence3 != null) {
            c24842h.m72845c(-1, charSequence3, c24836e.f97263h);
        }
        CharSequence charSequence4 = c24836e.f97264i;
        if (charSequence4 != null) {
            c24842h.m72845c(-2, charSequence4, c24836e.f97265j);
        }
        CharSequence charSequence5 = c24836e.f97266k;
        if (charSequence5 != null) {
            c24842h.m72845c(-3, charSequence5, c24836e.f97267l);
        }
        if (c24836e.f97272q != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) c24836e.f97257b.inflate(c24842h.f97291A, (ViewGroup) null);
            int i13 = c24836e.f97275t ? c24842h.f97292B : c24842h.f97293C;
            ListAdapter c24840g = c24836e.f97272q;
            if (c24840g == null) {
                c24840g = new C24840g(c24836e.f97256a, i13, R.id.text1, null);
            }
            c24842h.f97320x = c24840g;
            c24842h.f97321y = c24836e.f97276u;
            if (c24836e.f97273r != null) {
                alertController$RecycleListView.setOnItemClickListener(new C24834d(c24836e, c24842h));
            }
            if (c24836e.f97275t) {
                alertController$RecycleListView.setChoiceMode(1);
            }
            c24842h.f97302f = alertController$RecycleListView;
        }
        View view2 = c24836e.f97274s;
        if (view2 != null) {
            c24842h.f97303g = view2;
            c24842h.f97304h = false;
        }
        dialogInterfaceC24846j.setCancelable(c24836e.f97268m);
        if (c24836e.f97268m) {
            dialogInterfaceC24846j.setCanceledOnTouchOutside(true);
        }
        dialogInterfaceC24846j.setOnCancelListener(c24836e.f97269n);
        dialogInterfaceC24846j.setOnDismissListener(c24836e.f97270o);
        DialogInterface.OnKeyListener onKeyListener = c24836e.f97271p;
        if (onKeyListener != null) {
            dialogInterfaceC24846j.setOnKeyListener(onKeyListener);
        }
        return dialogInterfaceC24846j;
    }

    public Context getContext() {
        return this.f97324a.f97256a;
    }

    public C24844i setNegativeButton(int i13, DialogInterface.OnClickListener onClickListener) {
        C24836e c24836e = this.f97324a;
        c24836e.f97264i = c24836e.f97256a.getText(i13);
        c24836e.f97265j = onClickListener;
        return this;
    }

    public C24844i setPositiveButton(int i13, DialogInterface.OnClickListener onClickListener) {
        C24836e c24836e = this.f97324a;
        c24836e.f97262g = c24836e.f97256a.getText(i13);
        c24836e.f97263h = onClickListener;
        return this;
    }

    public C24844i setTitle(CharSequence charSequence) {
        this.f97324a.f97259d = charSequence;
        return this;
    }

    public C24844i setView(View view) {
        this.f97324a.f97274s = view;
        return this;
    }

    public C24844i(Context context, int i13) {
        this.f97324a = new C24836e(new ContextThemeWrapper(context, DialogInterfaceC24846j.m72853g(context, i13)));
        this.f97325b = i13;
    }
}
