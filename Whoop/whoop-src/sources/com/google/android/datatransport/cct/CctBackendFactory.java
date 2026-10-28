package com.google.android.datatransport.cct;

import androidx.annotation.Keep;
import hm.AbstractC17416c;
import hm.C17415b;
import hm.InterfaceC17419f;
import p122em.C13323c;

/* JADX INFO: loaded from: classes6.dex */
@Keep
public class CctBackendFactory {
    public InterfaceC17419f create(AbstractC17416c abstractC17416c) {
        C17415b c17415b = (C17415b) abstractC17416c;
        return new C13323c(c17415b.f67501a, c17415b.f67502b, c17415b.f67503c);
    }
}
