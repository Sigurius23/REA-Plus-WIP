package p401pj;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import p208i2.AbstractC17918w0;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: pj.k */
/* JADX INFO: loaded from: classes6.dex */
public final class C29277k extends ClickableSpan {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ String f118483w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f118484x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ long f118485y;

    public C29277k(String str, Function1 function1, long j7) {
        this.f118483w = str;
        this.f118484x = function1;
        this.f118485y = j7;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View widget) {
        AbstractC22676k.m65750j(widget, "widget");
        String str = this.f118483w;
        if (str != null) {
            this.f118484x.invoke(str);
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint ds3) {
        AbstractC22676k.m65750j(ds3, "ds");
        super.updateDrawState(ds3);
        ds3.setColor(AbstractC17918w0.m51506H(this.f118485y));
        ds3.setUnderlineText(true);
    }
}
