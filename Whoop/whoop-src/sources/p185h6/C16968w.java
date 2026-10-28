package p185h6;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import java.lang.reflect.Array;
import java.util.ArrayList;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: h6.w */
/* JADX INFO: loaded from: classes.dex */
public final class C16968w extends SpannableStringBuilder {

    /* JADX INFO: renamed from: w */
    public final Class f65121w;

    /* JADX INFO: renamed from: x */
    public final ArrayList f65122x;

    public C16968w(Class cls, CharSequence charSequence) {
        super(charSequence);
        this.f65122x = new ArrayList();
        AbstractC37056f.m118993q(cls, "watcherClass cannot be null");
        this.f65121w = cls;
    }

    /* JADX INFO: renamed from: a */
    public final void m47726a() {
        int i13 = 0;
        while (true) {
            ArrayList arrayList = this.f65122x;
            if (i13 >= arrayList.size()) {
                return;
            }
            ((C16967v) arrayList.get(i13)).m47724a();
            i13++;
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final void m47727b() {
        m47730e();
        int i13 = 0;
        while (true) {
            ArrayList arrayList = this.f65122x;
            if (i13 >= arrayList.size()) {
                return;
            }
            ((C16967v) arrayList.get(i13)).onTextChanged(this, 0, length(), length());
            i13++;
        }
    }

    /* JADX INFO: renamed from: c */
    public final C16967v m47728c(Object obj) {
        int i13 = 0;
        while (true) {
            ArrayList arrayList = this.f65122x;
            if (i13 >= arrayList.size()) {
                return null;
            }
            C16967v c16967v = (C16967v) arrayList.get(i13);
            if (c16967v.f65119w == obj) {
                return c16967v;
            }
            i13++;
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m47729d(Object obj) {
        if (obj != null) {
            return this.f65121w == obj.getClass();
        }
        return false;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable delete(int i13, int i14) {
        super.delete(i13, i14);
        return this;
    }

    /* JADX INFO: renamed from: e */
    public final void m47730e() {
        int i13 = 0;
        while (true) {
            ArrayList arrayList = this.f65122x;
            if (i13 >= arrayList.size()) {
                return;
            }
            ((C16967v) arrayList.get(i13)).m47725b();
            i13++;
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanEnd(Object obj) {
        C16967v c16967vM47728c;
        if (m47729d(obj) && (c16967vM47728c = m47728c(obj)) != null) {
            obj = c16967vM47728c;
        }
        return super.getSpanEnd(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanFlags(Object obj) {
        C16967v c16967vM47728c;
        if (m47729d(obj) && (c16967vM47728c = m47728c(obj)) != null) {
            obj = c16967vM47728c;
        }
        return super.getSpanFlags(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanStart(Object obj) {
        C16967v c16967vM47728c;
        if (m47729d(obj) && (c16967vM47728c = m47728c(obj)) != null) {
            obj = c16967vM47728c;
        }
        return super.getSpanStart(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final Object[] getSpans(int i13, int i14, Class cls) {
        if (this.f65121w != cls) {
            return super.getSpans(i13, i14, cls);
        }
        C16967v[] c16967vArr = (C16967v[]) super.getSpans(i13, i14, C16967v.class);
        Object[] objArr = (Object[]) Array.newInstance((Class<?>) cls, c16967vArr.length);
        for (int i15 = 0; i15 < c16967vArr.length; i15++) {
            objArr[i15] = c16967vArr[i15].f65119w;
        }
        return objArr;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable insert(int i13, CharSequence charSequence) {
        super.insert(i13, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int nextSpanTransition(int i13, int i14, Class cls) {
        if (cls == null || this.f65121w == cls) {
            cls = C16967v.class;
        }
        return super.nextSpanTransition(i13, i14, cls);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void removeSpan(Object obj) {
        C16967v c16967vM47728c;
        if (m47729d(obj)) {
            c16967vM47728c = m47728c(obj);
            if (c16967vM47728c != null) {
                obj = c16967vM47728c;
            }
        } else {
            c16967vM47728c = null;
        }
        super.removeSpan(obj);
        if (c16967vM47728c != null) {
            this.f65122x.remove(c16967vM47728c);
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i13, int i14, CharSequence charSequence) {
        replace(i13, i14, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void setSpan(Object obj, int i13, int i14, int i15) {
        if (m47729d(obj)) {
            C16967v c16967v = new C16967v(obj);
            this.f65122x.add(c16967v);
            obj = c16967v;
        }
        super.setSpan(obj, i13, i14, i15);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public final CharSequence subSequence(int i13, int i14) {
        return new C16968w(this.f65121w, this, i13, i14);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder delete(int i13, int i14) {
        super.delete(i13, i14);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int i13, CharSequence charSequence) {
        super.insert(i13, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i13, int i14, CharSequence charSequence, int i15, int i16) {
        replace(i13, i14, charSequence, i15, i16);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable insert(int i13, CharSequence charSequence, int i14, int i15) {
        super.insert(i13, charSequence, i14, i15);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i13, int i14, CharSequence charSequence) {
        m47726a();
        super.replace(i13, i14, charSequence);
        m47730e();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(char c3) {
        super.append(c3);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int i13, CharSequence charSequence, int i14, int i15) {
        super.insert(i13, charSequence, i14, i15);
        return this;
    }

    public C16968w(Class cls, C16968w c16968w, int i13, int i14) {
        super(c16968w, i13, i14);
        this.f65122x = new ArrayList();
        AbstractC37056f.m118993q(cls, "watcherClass cannot be null");
        this.f65121w = cls;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(char c3) {
        super.append(c3);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(char c3) {
        super.append(c3);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i13, int i14, CharSequence charSequence, int i15, int i16) {
        m47726a();
        super.replace(i13, i14, charSequence, i15, i16);
        m47730e();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence charSequence, int i13, int i14) {
        super.append(charSequence, i13, i14);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(CharSequence charSequence, int i13, int i14) {
        super.append(charSequence, i13, i14);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i13, int i14) {
        super.append(charSequence, i13, i14);
        return this;
    }

    @Override // android.text.SpannableStringBuilder
    public final SpannableStringBuilder append(CharSequence charSequence, Object obj, int i13) {
        super.append(charSequence, obj, i13);
        return this;
    }
}
