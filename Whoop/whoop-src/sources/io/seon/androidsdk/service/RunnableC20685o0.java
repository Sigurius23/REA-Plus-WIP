package io.seon.androidsdk.service;

import android.net.TrafficStats;
import java.net.DatagramSocket;
import java.net.SocketException;

/* JADX INFO: renamed from: io.seon.androidsdk.service.o0 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC20685o0 implements Runnable {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f77417w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f77418x;

    public /* synthetic */ RunnableC20685o0(Object obj, int i13) {
        this.f77417w = i13;
        this.f77418x = obj;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x007b A[Catch: all -> 0x0030, Exception -> 0x0085, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0030, blocks: (B:5:0x000b, B:7:0x0016, B:9:0x001d, B:11:0x0025, B:18:0x0033, B:46:0x007b, B:20:0x0038, B:22:0x0040, B:24:0x0046, B:26:0x004d, B:32:0x005d, B:34:0x0065, B:41:0x0072, B:40:0x006f), top: B:62:0x000b }] */
    @Override // java.lang.Runnable
    public final void run() {
        boolean z4;
        switch (this.f77417w) {
            case 0:
                C20687p0 c20687p0 = (C20687p0) this.f77418x;
                try {
                    c20687p0.f77424f.getClass();
                    c20687p0.m56865g();
                    return;
                } catch (Exception unused) {
                    c20687p0.m56865g();
                    return;
                }
            case 1:
                ((C20687p0) this.f77418x).m56865g();
                return;
            default:
                PortScanHelper$PortScanTarget portScanHelper$PortScanTarget = (PortScanHelper$PortScanTarget) this.f77418x;
                try {
                    try {
                        TrafficStats.setThreadStatsTag(1111);
                        boolean z13 = false;
                        if (portScanHelper$PortScanTarget.proto != PortScanHelper$Protocol.TCP) {
                            if (!portScanHelper$PortScanTarget.address.isEmpty() || portScanHelper$PortScanTarget.proto != PortScanHelper$Protocol.UDP) {
                                if (z13) {
                                    AbstractC20674j0.f77349a.add(portScanHelper$PortScanTarget);
                                }
                                break;
                            } else {
                                z4 = false;
                                for (Integer num : portScanHelper$PortScanTarget.ports) {
                                    int iIntValue = num.intValue();
                                    if (z4) {
                                        z4 = true;
                                    } else {
                                        if (iIntValue > 0 && iIntValue <= 65535) {
                                            try {
                                                DatagramSocket datagramSocket = new DatagramSocket(iIntValue);
                                                try {
                                                    datagramSocket.close();
                                                    datagramSocket.close();
                                                } catch (Throwable th3) {
                                                    try {
                                                        datagramSocket.close();
                                                        break;
                                                    } catch (Throwable th4) {
                                                        th3.addSuppressed(th4);
                                                    }
                                                    throw th3;
                                                }
                                            } catch (SocketException unused2) {
                                            } catch (Exception unused3) {
                                            }
                                        }
                                        z4 = false;
                                    }
                                }
                            }
                            TrafficStats.clearThreadStatsTag();
                            return;
                        }
                        z4 = false;
                        for (Integer num2 : portScanHelper$PortScanTarget.ports) {
                            z4 = z4 || AbstractC20674j0.m56825b(num2.intValue(), portScanHelper$PortScanTarget.address);
                        }
                        z13 = z4;
                        if (z13) {
                            AbstractC20674j0.f77349a.add(portScanHelper$PortScanTarget);
                        }
                    } catch (Throwable th5) {
                        TrafficStats.clearThreadStatsTag();
                        throw th5;
                    }
                    break;
                } catch (Exception unused4) {
                }
                TrafficStats.clearThreadStatsTag();
                return;
        }
    }
}
