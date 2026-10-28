package s30;

import m40.C25027d;
import no.nordicsemi.android.dfu.DfuBaseService;

/* JADX INFO: renamed from: s30.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C32101c implements InterfaceC32102d {

    /* JADX INFO: renamed from: a */
    public static final C32101c f133102a = new C32101c();

    /* JADX INFO: renamed from: b */
    public static final C25027d f133103b = new C25027d(Math.min((int) ((Runtime.getRuntime().maxMemory() / ((long) DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED)) / ((long) 8)), 10240), 1);
}
