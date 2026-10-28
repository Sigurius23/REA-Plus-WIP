package com.google.android.play.core.integrity;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import java.util.HashMap;
import java.util.Locale;
import p088dc.AbstractC11895b;
import q63.AbstractC30007c;
import tr.AbstractC34092a;

/* JADX INFO: loaded from: classes6.dex */
public class StandardIntegrityException extends ApiException {

    /* JADX INFO: renamed from: x */
    public final Throwable f21379x;

    /* JADX WARN: Code duplicated, block: B:8:0x002e  */
    /* JADX WARN: Illegal instructions before constructor call */
    public StandardIntegrityException(int i13, Exception exc) {
        String strM31997p;
        Locale locale = Locale.ROOT;
        HashMap map = AbstractC34092a.f142978a;
        Integer numValueOf = Integer.valueOf(i13);
        if (map.containsKey(numValueOf)) {
            HashMap map2 = AbstractC34092a.f142979b;
            if (map2.containsKey(numValueOf)) {
                strM31997p = AbstractC11895b.m31997p((String) map.get(numValueOf), " (https://developer.android.com/google/play/integrity/reference/com/google/android/play/core/integrity/model/StandardIntegrityErrorCode.html#", (String) map2.get(numValueOf), ")");
            } else {
                strM31997p = "";
            }
        } else {
            strM31997p = "";
        }
        super(new Status(i13, AbstractC30007c.m91838h(i13, "Standard Integrity API error (", "): ", strM31997p, "."), null, null));
        if (i13 == 0) {
            throw new IllegalArgumentException("ErrorCode should not be 0.");
        }
        this.f21379x = exc;
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable getCause() {
        return this.f21379x;
    }
}
