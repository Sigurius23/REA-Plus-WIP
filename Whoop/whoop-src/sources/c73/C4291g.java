package c73;

import a73.C0530e;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.URLSpan;
import android.util.Log;
import android.view.View;
import p671z5.C40084b;

/* JADX INFO: renamed from: c73.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C4291g extends URLSpan {

    /* JADX INFO: renamed from: w */
    public final C0530e f17404w;

    /* JADX INFO: renamed from: x */
    public final String f17405x;

    /* JADX INFO: renamed from: y */
    public final C40084b f17406y;

    public C4291g(C0530e c0530e, String str, C40084b c40084b) {
        super(str);
        this.f17404w = c0530e;
        this.f17405x = str;
        this.f17406y = c40084b;
    }

    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.f17406y.getClass();
        String str = this.f17405x;
        Uri uriBuild = Uri.parse(str);
        if (TextUtils.isEmpty(uriBuild.getScheme())) {
            uriBuild = uriBuild.buildUpon().scheme("https").build();
        }
        Context context = view.getContext();
        Intent intent = new Intent("android.intent.action.VIEW", uriBuild);
        intent.putExtra("com.android.browser.application_id", context.getPackageName());
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            Log.w("LinkResolverDef", "Actvity was not found for the link: '" + str + "'");
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        this.f17404w.getClass();
        textPaint.setUnderlineText(true);
        textPaint.setColor(textPaint.linkColor);
    }
}
