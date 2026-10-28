package ug;

import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.C22672i;

/* JADX INFO: renamed from: ug.l */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C34923l extends C22672i implements Function1 {

    /* JADX INFO: renamed from: w */
    public static final C34923l f147041w = new C34923l(1, AbstractC34924m.class, "isDigit", "isDigit(C)Z", 1);

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        char cCharValue = ((Character) obj).charValue();
        boolean z4 = false;
        if ('0' <= cCharValue && cCharValue < ':') {
            z4 = true;
        }
        return Boolean.valueOf(z4);
    }
}
