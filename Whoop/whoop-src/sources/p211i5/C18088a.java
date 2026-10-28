package p211i5;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* JADX INFO: renamed from: i5.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C18088a extends ClickableSpan {

    /* JADX INFO: renamed from: w */
    public final int f70296w;

    /* JADX INFO: renamed from: x */
    public final C18093f f70297x;

    /* JADX INFO: renamed from: y */
    public final int f70298y;

    public C18088a(int i13, C18093f c18093f, int i14) {
        this.f70296w = i13;
        this.f70297x = c18093f;
        this.f70298y = i14;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f70296w);
        this.f70297x.f70317a.performAction(this.f70298y, bundle);
    }
}
