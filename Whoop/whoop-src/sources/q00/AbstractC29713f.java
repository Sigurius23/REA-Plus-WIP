package q00;

import k00.InterfaceC22088a;
import p696zy.C41210b;
import p696zy.InterfaceC41211c;

/* JADX INFO: renamed from: q00.f */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC29713f implements InterfaceC22088a {

    /* JADX INFO: renamed from: a */
    public final String f121496a;

    /* JADX INFO: renamed from: b */
    public final C41210b f121497b;

    public AbstractC29713f(String str, C41210b c41210b) {
        this.f121496a = str;
        this.f121497b = c41210b;
    }

    @Override // k00.InterfaceC22088a
    /* JADX INFO: renamed from: a */
    public final String mo46671a() {
        return this.f121496a;
    }

    @Override // k00.InterfaceC22088a
    public final InterfaceC41211c getText() {
        return this.f121497b;
    }

    @Override // k00.InterfaceC22088a
    public final boolean isDestructive() {
        return false;
    }
}
