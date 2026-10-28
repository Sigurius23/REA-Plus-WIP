package com.mapbox.common.module.okhttp;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
import p715kotlin.jvm.internal.AbstractC22676k;
import ud3.C34824k0;
import ud3.C34826l0;
import ud3.C34835q;
import ud3.EnumC34828m0;
import ud3.InterfaceC34853z;

/* JADX INFO: loaded from: classes6.dex */
class LazyClient {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final long DEFAULT_CONNECT_TIMEOUT_SEC = 30;
    private static final long DEFAULT_READ_TIMEOUT_SEC = 60;
    private static final C34835q connectionPool = new C34835q();
    private volatile C34826l0 client;
    private final boolean disableHttp2;
    private byte maxRequestsPerHost = 0;
    private final SocketFactory socketFactory;

    public LazyClient(SocketFactory socketFactory, boolean z4) {
        this.socketFactory = socketFactory;
        this.disableHttp2 = z4;
    }

    private static C34826l0 buildOkHttpClient(SocketFactory socketFactory, boolean z4) {
        C34824k0 c34824k0 = new C34824k0();
        InterfaceC34853z eventListenerFactory = NetworkUsageListener.FACTORY;
        AbstractC22676k.m65750j(eventListenerFactory, "eventListenerFactory");
        c34824k0.f146616e = eventListenerFactory;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        c34824k0.m109892b(DEFAULT_CONNECT_TIMEOUT_SEC, timeUnit);
        c34824k0.m109895e(DEFAULT_READ_TIMEOUT_SEC, timeUnit);
        C34835q connectionPool2 = connectionPool;
        AbstractC22676k.m65750j(connectionPool2, "connectionPool");
        c34824k0.f146613b = connectionPool2;
        if (socketFactory != null) {
            if (socketFactory instanceof SSLSocketFactory) {
                throw new IllegalArgumentException("socketFactory instanceof SSLSocketFactory");
            }
            if (!socketFactory.equals(c34824k0.f146627p)) {
                c34824k0.f146610E = null;
            }
            c34824k0.f146627p = socketFactory;
        }
        if (z4) {
            c34824k0.m109894d(Arrays.asList(EnumC34828m0.HTTP_1_1));
        }
        return new C34826l0(c34824k0);
    }

    public C34826l0 get() {
        if (this.client == null) {
            synchronized (this) {
                try {
                    if (this.client == null) {
                        this.client = buildOkHttpClient(this.socketFactory, this.disableHttp2);
                        if (this.maxRequestsPerHost != 0) {
                            this.client.f146649a.m109923e(this.maxRequestsPerHost);
                        }
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
        return this.client;
    }

    public synchronized void setMaxRequestsPerHost(byte b) {
        this.maxRequestsPerHost = b;
        if (b != 0) {
            synchronized (this) {
                try {
                    C34826l0 c34826l0 = this.client;
                    if (c34826l0 != null) {
                        c34826l0.f146649a.m109923e(b);
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }
}
