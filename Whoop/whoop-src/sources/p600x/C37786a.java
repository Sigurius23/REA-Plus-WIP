package p600x;

import android.os.Bundle;

/* JADX INFO: renamed from: x.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C37786a {

    /* JADX INFO: renamed from: a */
    public Integer f161888a;

    public C37786a(Integer num) {
        this.f161888a = num;
    }

    /* JADX INFO: renamed from: a */
    public C37786a m121286a() {
        return new C37786a(this.f161888a);
    }

    /* JADX INFO: renamed from: b */
    public void m121287b(int i13) {
        this.f161888a = Integer.valueOf(i13 | (-16777216));
    }

    /* JADX INFO: renamed from: c */
    public Bundle m121288c() {
        Bundle bundle = new Bundle();
        Integer num = this.f161888a;
        if (num != null) {
            bundle.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", num.intValue());
        }
        return bundle;
    }

    public C37786a() {
    }
}
