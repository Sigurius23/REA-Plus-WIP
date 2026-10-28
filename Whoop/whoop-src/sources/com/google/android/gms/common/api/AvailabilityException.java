package com.google.android.gms.common.api;

import android.text.TextUtils;
import com.google.android.gms.common.C4969a;
import java.util.ArrayList;
import java.util.Iterator;
import p002a0.AbstractC0038m;
import p002a0.C0010c;
import p002a0.C0022g;
import p529uo.AbstractC35135w;
import q63.AbstractC30007c;
import to.C33961a;

/* JADX INFO: loaded from: classes6.dex */
public class AvailabilityException extends Exception {

    /* JADX INFO: renamed from: w */
    public final C0022g f20484w;

    public AvailabilityException(C0022g c0022g) {
        this.f20484w = c0022g;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        ArrayList arrayList = new ArrayList();
        C0022g c0022g = this.f20484w;
        Iterator it = ((C0010c) c0022g.keySet()).iterator();
        boolean z4 = true;
        while (true) {
            AbstractC0038m abstractC0038m = (AbstractC0038m) it;
            if (!abstractC0038m.hasNext()) {
                break;
            }
            C33961a c33961a = (C33961a) abstractC0038m.next();
            C4969a c4969a = (C4969a) c0022g.get(c33961a);
            AbstractC35135w.m111094f(c4969a);
            z4 &= !c4969a.m15588b();
            String str = c33961a.f142393b.f20500b;
            String strValueOf = String.valueOf(c4969a);
            StringBuilder sb4 = new StringBuilder(AbstractC30007c.m91832b(2, str) + strValueOf.length());
            sb4.append(str);
            sb4.append(": ");
            sb4.append(strValueOf);
            arrayList.add(sb4.toString());
        }
        StringBuilder sb5 = new StringBuilder();
        if (z4) {
            sb5.append("None of the queried APIs are available. ");
        } else {
            sb5.append("Some of the queried APIs are unavailable. ");
        }
        sb5.append(TextUtils.join("; ", arrayList));
        return sb5.toString();
    }
}
