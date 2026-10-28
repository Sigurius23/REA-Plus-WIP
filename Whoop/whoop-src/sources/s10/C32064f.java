package s10;

import android.os.Bundle;
import androidx.lifecycle.C1601k1;
import ec3.C13081r1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q20.AbstractC29835t;
import q20.AbstractC29840y;
import ug.AbstractC34924m;

/* JADX INFO: renamed from: s10.f */
/* JADX INFO: loaded from: classes6.dex */
public final class C32064f {

    /* JADX INFO: renamed from: a */
    public final C1601k1 f132972a;

    /* JADX INFO: renamed from: b */
    public final C13081r1 f132973b;

    /* JADX INFO: renamed from: c */
    public final Bundle f132974c;

    public C32064f(C1601k1 savedStateHandle) {
        AbstractC22676k.m65750j(savedStateHandle, "savedStateHandle");
        this.f132972a = savedStateHandle;
        this.f132973b = savedStateHandle.m5002c(null, "EMBEDDED_SELECTION_KEY");
        savedStateHandle.m5002c(null, "EMBEDDED_TEMPORARY_SELECTION_KEY");
        Bundle bundle = (Bundle) savedStateHandle.m5001b("EMBEDDED_PREVIOUS_SELECTIONS_KEY");
        this.f132974c = bundle == null ? new Bundle() : bundle;
    }

    /* JADX INFO: renamed from: a */
    public final void m99630a(AbstractC29840y abstractC29840y) {
        this.f132972a.m5004e(abstractC29840y, "EMBEDDED_SELECTION_KEY");
        if (abstractC29840y == null || !(abstractC29840y instanceof AbstractC29835t)) {
            return;
        }
        this.f132974c.putParcelable(AbstractC34924m.m110122D(abstractC29840y), abstractC29840y);
    }
}
