package p649yi;

import java.util.ArrayList;
import p426qi.C30387i;
import p426qi.C30402w;
import p616xi.C38313a;
import p616xi.C38314b;
import p682zi.AbstractC40652b;
import si.C32533s;
import si.InterfaceC32517c;

/* JADX INFO: renamed from: yi.p */
/* JADX INFO: loaded from: classes.dex */
public final class C39561p implements InterfaceC39547b {

    /* JADX INFO: renamed from: a */
    public final String f170199a;

    /* JADX INFO: renamed from: b */
    public final C38314b f170200b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f170201c;

    /* JADX INFO: renamed from: d */
    public final C38313a f170202d;

    /* JADX INFO: renamed from: e */
    public final C38313a f170203e;

    /* JADX INFO: renamed from: f */
    public final C38314b f170204f;

    /* JADX INFO: renamed from: g */
    public final int f170205g;

    /* JADX INFO: renamed from: h */
    public final int f170206h;

    /* JADX INFO: renamed from: i */
    public final float f170207i;

    /* JADX INFO: renamed from: j */
    public final boolean f170208j;

    public C39561p(String str, C38314b c38314b, ArrayList arrayList, C38313a c38313a, C38313a c38313a2, C38314b c38314b2, int i13, int i14, float f13, boolean z4) {
        this.f170199a = str;
        this.f170200b = c38314b;
        this.f170201c = arrayList;
        this.f170202d = c38313a;
        this.f170203e = c38313a2;
        this.f170204f = c38314b2;
        this.f170205g = i13;
        this.f170206h = i14;
        this.f170207i = f13;
        this.f170208j = z4;
    }

    @Override // p649yi.InterfaceC39547b
    /* JADX INFO: renamed from: a */
    public final InterfaceC32517c mo122786a(C30402w c30402w, C30387i c30387i, AbstractC40652b abstractC40652b) {
        return new C32533s(c30402w, abstractC40652b, this);
    }
}
