package p185h6;

import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.TextWatcher;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: h6.v */
/* JADX INFO: loaded from: classes5.dex */
public final class C16967v implements TextWatcher, SpanWatcher {

    /* JADX INFO: renamed from: w */
    public final Object f65119w;

    /* JADX INFO: renamed from: x */
    public final AtomicInteger f65120x = new AtomicInteger(0);

    public C16967v(Object obj) {
        this.f65119w = obj;
    }

    /* JADX INFO: renamed from: a */
    public final void m47724a() {
        this.f65120x.incrementAndGet();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        ((TextWatcher) this.f65119w).afterTextChanged(editable);
    }

    /* JADX INFO: renamed from: b */
    public final void m47725b() {
        this.f65120x.decrementAndGet();
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i13, int i14, int i15) {
        ((TextWatcher) this.f65119w).beforeTextChanged(charSequence, i13, i14, i15);
    }

    @Override // android.text.SpanWatcher
    public final void onSpanAdded(Spannable spannable, Object obj, int i13, int i14) {
        if (this.f65120x.get() <= 0 || !(obj instanceof C16970y)) {
            ((SpanWatcher) this.f65119w).onSpanAdded(spannable, obj, i13, i14);
        }
    }

    @Override // android.text.SpanWatcher
    public final void onSpanChanged(Spannable spannable, Object obj, int i13, int i14, int i15, int i16) {
        if (this.f65120x.get() <= 0 || !(obj instanceof C16970y)) {
            ((SpanWatcher) this.f65119w).onSpanChanged(spannable, obj, i13, i14, i15, i16);
        }
    }

    @Override // android.text.SpanWatcher
    public final void onSpanRemoved(Spannable spannable, Object obj, int i13, int i14) {
        if (this.f65120x.get() <= 0 || !(obj instanceof C16970y)) {
            ((SpanWatcher) this.f65119w).onSpanRemoved(spannable, obj, i13, i14);
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i13, int i14, int i15) {
        ((TextWatcher) this.f65119w).onTextChanged(charSequence, i13, i14, i15);
    }
}
