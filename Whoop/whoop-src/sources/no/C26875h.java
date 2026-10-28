package no;

import java.nio.FloatBuffer;
import p309lo.AbstractC24543a;
import p607x8.AbstractC38046a;

/* JADX INFO: renamed from: no.h */
/* JADX INFO: loaded from: classes6.dex */
public final class C26875h {

    /* JADX INFO: renamed from: a */
    public final int f107239a;

    /* JADX INFO: renamed from: b */
    public final FloatBuffer f107240b;

    /* JADX INFO: renamed from: c */
    public final FloatBuffer f107241c;

    /* JADX INFO: renamed from: d */
    public final int f107242d;

    public C26875h(C26873f c26873f) {
        float[] fArr = c26873f.f107233c;
        this.f107239a = fArr.length / 3;
        this.f107240b = AbstractC24543a.m71577m(fArr);
        this.f107241c = AbstractC24543a.m71577m(c26873f.f107234d);
        int i13 = c26873f.f107232b;
        if (i13 == 1) {
            this.f107242d = 5;
        } else if (i13 != 2) {
            this.f107242d = 4;
        } else {
            this.f107242d = 6;
        }
    }

    public C26875h(C26873f c26873f, boolean z4) {
        float[] fArr = c26873f.f107233c;
        this.f107239a = fArr.length / 3;
        this.f107240b = AbstractC38046a.m121810e(fArr);
        this.f107241c = AbstractC38046a.m121810e(c26873f.f107234d);
        int i13 = c26873f.f107232b;
        if (i13 == 1) {
            this.f107242d = 5;
        } else if (i13 != 2) {
            this.f107242d = 4;
        } else {
            this.f107242d = 6;
        }
    }
}
