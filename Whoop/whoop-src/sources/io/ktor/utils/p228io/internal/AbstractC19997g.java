package io.ktor.utils.p228io.internal;

import j93.AbstractC21478l0;
import no.nordicsemi.android.dfu.DfuBaseService;
import x63.C38033e;

/* JADX INFO: renamed from: io.ktor.utils.io.internal.g */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC19997g {

    /* JADX INFO: renamed from: a */
    public static final int f75048a;

    /* JADX INFO: renamed from: b */
    public static final C38033e f75049b;

    /* JADX INFO: renamed from: c */
    public static final C19996f f75050c;

    /* JADX INFO: renamed from: d */
    public static final C19995e f75051d;

    static {
        int iM60395A = AbstractC21478l0.m60395A(4096, "BufferSize");
        f75048a = iM60395A;
        int iM60395A2 = AbstractC21478l0.m60395A(DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS, "BufferPoolSize");
        int iM60395A3 = AbstractC21478l0.m60395A(DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED, "BufferObjectPoolSize");
        f75049b = new C38033e(iM60395A2, iM60395A);
        f75050c = new C19996f(iM60395A3);
        f75051d = new C19995e(0);
    }
}
