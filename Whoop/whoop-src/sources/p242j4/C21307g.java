package p242j4;

import java.util.ArrayList;
import java.util.Collections;
import p108e4.C12685s;
import p272k4.InterfaceC22180d;
import p319m4.AbstractC25021j;
import p319m4.C25016e;

/* JADX INFO: renamed from: j4.g */
/* JADX INFO: loaded from: classes.dex */
public class C21307g extends C21302b implements InterfaceC22180d {

    /* JADX INFO: renamed from: k0 */
    public final C12685s f81470k0;

    /* JADX INFO: renamed from: l0 */
    public final int f81471l0;

    /* JADX INFO: renamed from: m0 */
    public final ArrayList f81472m0;

    public C21307g(C12685s c12685s, int i13) {
        super(c12685s);
        this.f81472m0 = new ArrayList();
        this.f81470k0 = c12685s;
        this.f81471l0 = i13;
    }

    @Override // p242j4.C21302b, p242j4.InterfaceC21308h
    /* JADX INFO: renamed from: a */
    public final C25016e mo59809a() {
        return mo59831s();
    }

    @Override // p242j4.C21302b, p242j4.InterfaceC21308h
    public void apply() {
    }

    /* JADX INFO: renamed from: q */
    public final void m59829q(Object... objArr) {
        Collections.addAll(this.f81472m0, objArr);
    }

    /* JADX INFO: renamed from: r */
    public final void m59830r() {
        super.apply();
    }

    /* JADX INFO: renamed from: s */
    public AbstractC25021j mo59831s() {
        return null;
    }
}
