package xg3;

import p471rx.exceptions.MissingBackpressureException;

/* JADX INFO: renamed from: xg3.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C38274a implements InterfaceC38275b {

    /* JADX INFO: renamed from: b */
    public static final C38274a f164079b = new C38274a(0);

    /* JADX INFO: renamed from: c */
    public static final C38274a f164080c = new C38274a(1);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f164081a;

    public /* synthetic */ C38274a(int i13) {
        this.f164081a = i13;
    }

    @Override // xg3.InterfaceC38275b
    /* JADX INFO: renamed from: a */
    public final boolean mo122633a() throws MissingBackpressureException {
        switch (this.f164081a) {
            case 0:
                return true;
            default:
                throw new MissingBackpressureException("Overflowed buffer");
        }
    }
}
