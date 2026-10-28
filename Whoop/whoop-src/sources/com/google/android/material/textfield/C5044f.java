package com.google.android.material.textfield;

import com.google.android.material.internal.CheckableImageButton;
import p477s2.AbstractC32073e;

/* JADX INFO: renamed from: com.google.android.material.textfield.f */
/* JADX INFO: loaded from: classes6.dex */
public final class C5044f extends AbstractC5059r {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f21210e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5044f(C5058q c5058q, int i13) {
        super(c5058q);
        this.f21210e = i13;
    }

    @Override // com.google.android.material.textfield.AbstractC5059r
    /* JADX INFO: renamed from: q */
    public void mo15844q() {
        switch (this.f21210e) {
            case 0:
                C5058q c5058q = this.f21264b;
                c5058q.f21251O = null;
                CheckableImageButton checkableImageButton = c5058q.f21243G;
                checkableImageButton.setOnLongClickListener(null);
                AbstractC32073e.m99742e0(checkableImageButton, null);
                break;
        }
    }
}
