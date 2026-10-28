package p601x0;

import android.view.textclassifier.TextClassification;
import p088dc.AbstractC11895b;

/* JADX INFO: renamed from: x0.h */
/* JADX INFO: loaded from: classes5.dex */
public final class C37797h extends AbstractC37791b {

    /* JADX INFO: renamed from: b */
    public final TextClassification f161902b;

    /* JADX INFO: renamed from: c */
    public final int f161903c;

    public C37797h(Object obj, TextClassification textClassification, int i13) {
        super(obj);
        this.f161902b = textClassification;
        this.f161903c = i13;
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("TextContextMenuRemoteActionItem(key=");
        sb4.append(this.f161890a);
        sb4.append(", textClassification=");
        sb4.append(this.f161902b);
        sb4.append(", index=");
        return AbstractC11895b.m31999r(sb4, this.f161903c, ')');
    }
}
