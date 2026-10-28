package q00;

import k00.InterfaceC22088a;
import p696zy.C41210b;
import p696zy.InterfaceC41211c;

/* JADX INFO: renamed from: q00.v */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC29740v implements InterfaceC22088a {

    /* JADX INFO: renamed from: a */
    public final C41210b f121627a;

    /* JADX INFO: renamed from: b */
    public final String f121628b;

    /* JADX INFO: renamed from: c */
    public final boolean f121629c;

    public AbstractC29740v(C41210b c41210b, String str, boolean z4) {
        this.f121627a = c41210b;
        this.f121628b = str;
        this.f121629c = z4;
    }

    @Override // k00.InterfaceC22088a
    /* JADX INFO: renamed from: a */
    public final String mo46671a() {
        return this.f121628b;
    }

    @Override // k00.InterfaceC22088a
    public InterfaceC41211c getText() {
        return this.f121627a;
    }

    @Override // k00.InterfaceC22088a
    public final boolean isDestructive() {
        return this.f121629c;
    }
}
