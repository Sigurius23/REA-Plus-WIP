package p244j6;

import android.text.Editable;
import p185h6.C16968w;

/* JADX INFO: renamed from: j6.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C21356a extends Editable.Factory {

    /* JADX INFO: renamed from: a */
    public static final Object f81696a = new Object();

    /* JADX INFO: renamed from: b */
    public static volatile C21356a f81697b;

    /* JADX INFO: renamed from: c */
    public static Class f81698c;

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = f81698c;
        return cls != null ? new C16968w(cls, charSequence) : super.newEditable(charSequence);
    }
}
