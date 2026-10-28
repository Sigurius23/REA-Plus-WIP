package p242j4;

import java.util.ArrayList;

/* JADX INFO: renamed from: j4.c */
/* JADX INFO: loaded from: classes5.dex */
public final class C21303c implements InterfaceC21304d {

    /* JADX INFO: renamed from: b */
    public final String f81450b;

    /* JADX INFO: renamed from: c */
    public final String f81451c;

    /* JADX INFO: renamed from: e */
    public final float f81453e;

    /* JADX INFO: renamed from: f */
    public final float f81454f;

    /* JADX INFO: renamed from: a */
    public boolean f81449a = false;

    /* JADX INFO: renamed from: d */
    public float f81452d = 0.0f;

    public C21303c(String str, String str2, float f13, float f14) {
        this.f81450b = str == null ? "" : str;
        this.f81451c = str2 == null ? "" : str2;
        this.f81454f = f14;
        this.f81453e = f13;
    }

    /* JADX INFO: renamed from: a */
    public final ArrayList m59825a() {
        ArrayList arrayList = new ArrayList();
        int i13 = (int) this.f81453e;
        int i14 = (int) this.f81454f;
        int i15 = i13;
        while (i13 <= i14) {
            arrayList.add(this.f81450b + i15 + this.f81451c);
            i15 += (int) 1.0f;
            i13++;
        }
        return arrayList;
    }

    @Override // p242j4.InterfaceC21304d
    public final float value() {
        float f13 = this.f81452d;
        if (f13 >= this.f81454f) {
            this.f81449a = true;
        }
        if (!this.f81449a) {
            this.f81452d = f13 + 1.0f;
        }
        return this.f81452d;
    }
}
