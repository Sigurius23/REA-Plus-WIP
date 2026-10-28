package kr;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import p257jq.AbstractC21885a;
import se.AbstractC32410a;
import se.AbstractC32411b;

/* JADX INFO: renamed from: kr.k */
/* JADX INFO: loaded from: classes6.dex */
public final class C22792k {

    /* JADX INFO: renamed from: m */
    public static final C22789h f89765m = new C22789h(0.5f);

    /* JADX INFO: renamed from: a */
    public AbstractC32410a f89766a = new C22790i();

    /* JADX INFO: renamed from: b */
    public AbstractC32410a f89767b = new C22790i();

    /* JADX INFO: renamed from: c */
    public AbstractC32410a f89768c = new C22790i();

    /* JADX INFO: renamed from: d */
    public AbstractC32410a f89769d = new C22790i();

    /* JADX INFO: renamed from: e */
    public InterfaceC22784c f89770e = new C22782a(0.0f);

    /* JADX INFO: renamed from: f */
    public InterfaceC22784c f89771f = new C22782a(0.0f);

    /* JADX INFO: renamed from: g */
    public InterfaceC22784c f89772g = new C22782a(0.0f);

    /* JADX INFO: renamed from: h */
    public InterfaceC22784c f89773h = new C22782a(0.0f);

    /* JADX INFO: renamed from: i */
    public C22786e f89774i;

    /* JADX INFO: renamed from: j */
    public C22786e f89775j;

    /* JADX INFO: renamed from: k */
    public C22786e f89776k;

    /* JADX INFO: renamed from: l */
    public C22786e f89777l;

    public C22792k() {
        int i13 = 0;
        this.f89774i = new C22786e(i13);
        this.f89775j = new C22786e(i13);
        this.f89776k = new C22786e(i13);
        this.f89777l = new C22786e(i13);
    }

    /* JADX INFO: renamed from: a */
    public static C22791j m66025a(Context context, int i13, int i14, InterfaceC22784c interfaceC22784c) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i13);
        if (i14 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, i14);
        }
        TypedArray typedArrayObtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(AbstractC21885a.f84530G);
        try {
            int i15 = typedArrayObtainStyledAttributes.getInt(0, 0);
            int i16 = typedArrayObtainStyledAttributes.getInt(3, i15);
            int i17 = typedArrayObtainStyledAttributes.getInt(4, i15);
            int i18 = typedArrayObtainStyledAttributes.getInt(2, i15);
            int i19 = typedArrayObtainStyledAttributes.getInt(1, i15);
            InterfaceC22784c interfaceC22784cM66027c = m66027c(typedArrayObtainStyledAttributes, 5, interfaceC22784c);
            InterfaceC22784c interfaceC22784cM66027c2 = m66027c(typedArrayObtainStyledAttributes, 8, interfaceC22784cM66027c);
            InterfaceC22784c interfaceC22784cM66027c3 = m66027c(typedArrayObtainStyledAttributes, 9, interfaceC22784cM66027c);
            InterfaceC22784c interfaceC22784cM66027c4 = m66027c(typedArrayObtainStyledAttributes, 7, interfaceC22784cM66027c);
            InterfaceC22784c interfaceC22784cM66027c5 = m66027c(typedArrayObtainStyledAttributes, 6, interfaceC22784cM66027c);
            C22791j c22791j = new C22791j();
            c22791j.f89753a = AbstractC32411b.m101114z(i16);
            c22791j.f89757e = interfaceC22784cM66027c2;
            c22791j.f89754b = AbstractC32411b.m101114z(i17);
            c22791j.f89758f = interfaceC22784cM66027c3;
            c22791j.f89755c = AbstractC32411b.m101114z(i18);
            c22791j.f89759g = interfaceC22784cM66027c4;
            c22791j.f89756d = AbstractC32411b.m101114z(i19);
            c22791j.f89760h = interfaceC22784cM66027c5;
            return c22791j;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: b */
    public static C22791j m66026b(Context context, AttributeSet attributeSet, int i13, int i14) {
        C22782a c22782a = new C22782a(0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC21885a.f84524A, i13, i14);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        return m66025a(context, resourceId, resourceId2, c22782a);
    }

    /* JADX INFO: renamed from: c */
    public static InterfaceC22784c m66027c(TypedArray typedArray, int i13, InterfaceC22784c interfaceC22784c) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i13);
        if (typedValuePeekValue != null) {
            int i14 = typedValuePeekValue.type;
            if (i14 == 5) {
                return new C22782a(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (i14 == 6) {
                return new C22789h(typedValuePeekValue.getFraction(1.0f, 1.0f));
            }
        }
        return interfaceC22784c;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m66028d(RectF rectF) {
        boolean z4 = this.f89777l.getClass().equals(C22786e.class) && this.f89775j.getClass().equals(C22786e.class) && this.f89774i.getClass().equals(C22786e.class) && this.f89776k.getClass().equals(C22786e.class);
        float fMo65993a = this.f89770e.mo65993a(rectF);
        return z4 && ((this.f89771f.mo65993a(rectF) > fMo65993a ? 1 : (this.f89771f.mo65993a(rectF) == fMo65993a ? 0 : -1)) == 0 && (this.f89773h.mo65993a(rectF) > fMo65993a ? 1 : (this.f89773h.mo65993a(rectF) == fMo65993a ? 0 : -1)) == 0 && (this.f89772g.mo65993a(rectF) > fMo65993a ? 1 : (this.f89772g.mo65993a(rectF) == fMo65993a ? 0 : -1)) == 0) && ((this.f89767b instanceof C22790i) && (this.f89766a instanceof C22790i) && (this.f89768c instanceof C22790i) && (this.f89769d instanceof C22790i));
    }

    /* JADX INFO: renamed from: e */
    public final C22791j m66029e() {
        C22791j c22791j = new C22791j();
        c22791j.f89753a = this.f89766a;
        c22791j.f89754b = this.f89767b;
        c22791j.f89755c = this.f89768c;
        c22791j.f89756d = this.f89769d;
        c22791j.f89757e = this.f89770e;
        c22791j.f89758f = this.f89771f;
        c22791j.f89759g = this.f89772g;
        c22791j.f89760h = this.f89773h;
        c22791j.f89761i = this.f89774i;
        c22791j.f89762j = this.f89775j;
        c22791j.f89763k = this.f89776k;
        c22791j.f89764l = this.f89777l;
        return c22791j;
    }
}
