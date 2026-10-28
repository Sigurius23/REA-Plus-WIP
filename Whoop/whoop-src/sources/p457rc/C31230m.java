package p457rc;

import androidx.work.impl.WorkDatabase;
import p218ic.C18389w;
import p400pc.InterfaceC29062a;
import p420qc.C30211u;
import sc.C32352b;

/* JADX INFO: renamed from: rc.m */
/* JADX INFO: loaded from: classes.dex */
public final class C31230m {

    /* JADX INFO: renamed from: a */
    public final C32352b f128609a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC29062a f128610b;

    /* JADX INFO: renamed from: c */
    public final C30211u f128611c;

    static {
        C18389w.m52887f("WMFgUpdater");
    }

    public C31230m(WorkDatabase workDatabase, InterfaceC29062a interfaceC29062a, C32352b c32352b) {
        this.f128610b = interfaceC29062a;
        this.f128609a = c32352b;
        this.f128611c = workDatabase.mo5521h();
    }
}
