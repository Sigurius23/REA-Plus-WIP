package p631xz;

import al0.C0971f;
import android.content.Context;
import android.content.SharedPreferences;
import l83.C23470p;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;

/* JADX INFO: renamed from: xz.n0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C38737n0 {

    /* JADX INFO: renamed from: a */
    public final C23470p f166704a;

    public C38737n0(Context context) {
        AbstractC22676k.m65750j(context, "context");
        this.f166704a = AbstractC30060g.m92088H(new C0971f(context, 17));
    }

    /* JADX INFO: renamed from: a */
    public final void m124148a() {
        Object value = this.f166704a.getValue();
        AbstractC22676k.m65749i(value, "getValue(...)");
        SharedPreferences.Editor editorEdit = ((SharedPreferences) value).edit();
        editorEdit.putBoolean("has_used_link", true);
        editorEdit.apply();
    }
}
