package p314m;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import com.google.android.material.datepicker.ViewOnClickListenerC5018l;
import com.whoop.android.R;
import java.lang.ref.WeakReference;
import p290l.AbstractC22932a;

/* JADX INFO: renamed from: m.h */
/* JADX INFO: loaded from: classes5.dex */
public final class C24842h {

    /* JADX INFO: renamed from: A */
    public final int f97291A;

    /* JADX INFO: renamed from: B */
    public final int f97292B;

    /* JADX INFO: renamed from: C */
    public final int f97293C;

    /* JADX INFO: renamed from: D */
    public final boolean f97294D;

    /* JADX INFO: renamed from: E */
    public final HandlerC24838f f97295E;

    /* JADX INFO: renamed from: a */
    public final Context f97297a;

    /* JADX INFO: renamed from: b */
    public final DialogInterfaceC24846j f97298b;

    /* JADX INFO: renamed from: c */
    public final Window f97299c;

    /* JADX INFO: renamed from: d */
    public CharSequence f97300d;

    /* JADX INFO: renamed from: e */
    public CharSequence f97301e;

    /* JADX INFO: renamed from: f */
    public AlertController$RecycleListView f97302f;

    /* JADX INFO: renamed from: g */
    public View f97303g;

    /* JADX INFO: renamed from: i */
    public Button f97305i;

    /* JADX INFO: renamed from: j */
    public CharSequence f97306j;

    /* JADX INFO: renamed from: k */
    public Message f97307k;

    /* JADX INFO: renamed from: l */
    public Button f97308l;

    /* JADX INFO: renamed from: m */
    public CharSequence f97309m;

    /* JADX INFO: renamed from: n */
    public Message f97310n;

    /* JADX INFO: renamed from: o */
    public Button f97311o;

    /* JADX INFO: renamed from: p */
    public CharSequence f97312p;

    /* JADX INFO: renamed from: q */
    public Message f97313q;

    /* JADX INFO: renamed from: r */
    public NestedScrollView f97314r;

    /* JADX INFO: renamed from: s */
    public Drawable f97315s;

    /* JADX INFO: renamed from: t */
    public ImageView f97316t;

    /* JADX INFO: renamed from: u */
    public TextView f97317u;

    /* JADX INFO: renamed from: v */
    public TextView f97318v;

    /* JADX INFO: renamed from: w */
    public View f97319w;

    /* JADX INFO: renamed from: x */
    public ListAdapter f97320x;

    /* JADX INFO: renamed from: z */
    public final int f97322z;

    /* JADX INFO: renamed from: h */
    public boolean f97304h = false;

    /* JADX INFO: renamed from: y */
    public int f97321y = -1;

    /* JADX INFO: renamed from: F */
    public final ViewOnClickListenerC5018l f97296F = new ViewOnClickListenerC5018l(this, 2);

    public C24842h(Context context, DialogInterfaceC24846j dialogInterfaceC24846j, Window window) {
        this.f97297a = context;
        this.f97298b = dialogInterfaceC24846j;
        this.f97299c = window;
        HandlerC24838f handlerC24838f = new HandlerC24838f();
        handlerC24838f.f97282b = new WeakReference(dialogInterfaceC24846j);
        this.f97295E = handlerC24838f;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, AbstractC22932a.f90512e, R.attr.alertDialogStyle, 0);
        this.f97322z = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.getResourceId(2, 0);
        this.f97291A = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.f97292B = typedArrayObtainStyledAttributes.getResourceId(7, 0);
        this.f97293C = typedArrayObtainStyledAttributes.getResourceId(3, 0);
        this.f97294D = typedArrayObtainStyledAttributes.getBoolean(6, true);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        dialogInterfaceC24846j.m72840f(1);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m72843a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (m72843a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static ViewGroup m72844b(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    /* JADX INFO: renamed from: c */
    public final void m72845c(int i13, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        Message messageObtainMessage = onClickListener != null ? this.f97295E.obtainMessage(i13, onClickListener) : null;
        if (i13 == -3) {
            this.f97312p = charSequence;
            this.f97313q = messageObtainMessage;
        } else if (i13 == -2) {
            this.f97309m = charSequence;
            this.f97310n = messageObtainMessage;
        } else {
            if (i13 != -1) {
                throw new IllegalArgumentException("Button does not exist");
            }
            this.f97306j = charSequence;
            this.f97307k = messageObtainMessage;
        }
    }
}
