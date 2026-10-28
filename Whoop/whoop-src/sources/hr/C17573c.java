package hr;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import p477s2.AbstractC32073e;

/* JADX INFO: renamed from: hr.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C17573c extends AbstractC32073e {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Context f68087a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ TextPaint f68088b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AbstractC32073e f68089c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C17574d f68090d;

    public C17573c(C17574d c17574d, Context context, TextPaint textPaint, AbstractC32073e abstractC32073e) {
        this.f68090d = c17574d;
        this.f68087a = context;
        this.f68088b = textPaint;
        this.f68089c = abstractC32073e;
    }

    @Override // p477s2.AbstractC32073e
    /* JADX INFO: renamed from: Q */
    public final void mo29862Q(int i13) {
        this.f68089c.mo29862Q(i13);
    }

    @Override // p477s2.AbstractC32073e
    /* JADX INFO: renamed from: R */
    public final void mo29863R(Typeface typeface, boolean z4) {
        this.f68090d.m50028g(this.f68087a, this.f68088b, typeface);
        this.f68089c.mo29863R(typeface, z4);
    }
}
