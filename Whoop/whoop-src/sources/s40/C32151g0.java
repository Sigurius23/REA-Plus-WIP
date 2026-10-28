package s40;

import android.widget.AutoCompleteTextView;
import com.stripe.android.core.model.Country;
import java.util.Iterator;
import p715kotlin.jvm.internal.AbstractC22676k;
import q11.C29793c;

/* JADX INFO: renamed from: s40.g0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C32151g0 implements AutoCompleteTextView.Validator {

    /* JADX INFO: renamed from: a */
    public final C32153h f133198a;

    /* JADX INFO: renamed from: b */
    public final C29793c f133199b;

    public C32151g0(C32153h c32153h, C29793c c29793c) {
        this.f133198a = c32153h;
        this.f133199b = c29793c;
    }

    @Override // android.widget.AutoCompleteTextView.Validator
    public final CharSequence fixText(CharSequence charSequence) {
        return charSequence == null ? "" : charSequence;
    }

    @Override // android.widget.AutoCompleteTextView.Validator
    public final boolean isValid(CharSequence charSequence) throws Exception {
        Object next;
        Iterator it = this.f133198a.f133204b.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!AbstractC22676k.m65745e(((Country) next).getName(), String.valueOf(charSequence)));
        this.f133199b.invoke(next);
        return ((Country) next) != null;
    }
}
