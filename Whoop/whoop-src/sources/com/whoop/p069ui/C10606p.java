package com.whoop.p069ui;

import android.graphics.Rect;
import cr.C11065c;

/* JADX INFO: renamed from: com.whoop.ui.p */
/* JADX INFO: loaded from: classes10.dex */
public class C10606p {

    /* JADX INFO: renamed from: a */
    private C11065c f32242a;

    public C10606p(Object obj) {
        this.f32242a = (C11065c) obj;
    }

    /* JADX INFO: renamed from: a */
    public void m27359a() {
        C11065c c11065c = this.f32242a;
        if (c11065c != null) {
            c11065c.m29849i(false);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m27360b(int i13, int i14, int i15, int i16) {
        C11065c c11065c = this.f32242a;
        if (c11065c != null) {
            Rect rect = c11065c.f34972g;
            if (rect.left == i13 && rect.top == i14 && rect.right == i15 && rect.bottom == i16) {
                return;
            }
            rect.set(i13, i14, i15, i16);
            c11065c.f34952S = true;
        }
    }
}
