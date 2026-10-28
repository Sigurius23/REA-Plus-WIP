package l30;

import android.os.Debug;

/* JADX INFO: renamed from: l30.h */
/* JADX INFO: loaded from: classes6.dex */
public final class C23299h extends AbstractC23304m {

    /* JADX INFO: renamed from: c */
    public static final C23306o f92341c = new C23306o("SW04", "A debugger is attached to the App.", EnumC23305n.f92349w);

    /* JADX INFO: renamed from: b */
    public final boolean f92342b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23299h() {
        super(f92341c);
        boolean zIsDebuggerConnected = Debug.isDebuggerConnected();
        this.f92342b = zIsDebuggerConnected;
    }

    @Override // l30.AbstractC23304m
    /* JADX INFO: renamed from: a */
    public final boolean mo67390a() {
        return this.f92342b;
    }
}
