package io.seon.androidsdk.service;

import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import live.hms.video.error.ErrorCodes;

/* JADX INFO: renamed from: io.seon.androidsdk.service.j0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC20674j0 {

    /* JADX INFO: renamed from: a */
    public static List f77349a = Collections.synchronizedList(new ArrayList());

    /* JADX INFO: renamed from: a */
    public static List m56824a() {
        List list = f77349a;
        return list != null ? list : new ArrayList();
    }

    /* JADX INFO: renamed from: b */
    public static boolean m56825b(int i13, String str) {
        if (i13 > 0 && i13 <= 65535) {
            try {
                Socket socket = new Socket();
                try {
                    socket.connect(new InetSocketAddress(str, i13), ErrorCodes.InitAPIErrors.cServerErrors);
                    socket.close();
                    return true;
                } catch (Throwable th3) {
                    try {
                        socket.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public static void m56826c() {
        ExecutorService executorServiceNewFixedThreadPool = null;
        try {
            f77349a = Collections.synchronizedList(new ArrayList());
            executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(PortScanHelper$PortScanTarget.values().length);
            for (PortScanHelper$PortScanTarget portScanHelper$PortScanTarget : PortScanHelper$PortScanTarget.values()) {
                executorServiceNewFixedThreadPool.submit(new RunnableC20685o0(portScanHelper$PortScanTarget, 2));
            }
            if (executorServiceNewFixedThreadPool == null) {
                return;
            }
        } catch (Exception unused) {
            if (executorServiceNewFixedThreadPool == null) {
                return;
            }
        } catch (Throwable th3) {
            if (executorServiceNewFixedThreadPool != null) {
                try {
                    executorServiceNewFixedThreadPool.shutdown();
                } catch (Exception unused2) {
                }
            }
            throw th3;
        }
        try {
            executorServiceNewFixedThreadPool.shutdown();
        } catch (Exception unused3) {
        }
    }
}
