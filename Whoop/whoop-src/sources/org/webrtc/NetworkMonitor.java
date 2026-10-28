package org.webrtc;

import android.content.Context;
import android.os.Build;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class NetworkMonitor {
    private static final String TAG = "NetworkMonitor";
    private volatile NetworkChangeDetector.ConnectionType currentConnectionType;
    private final ArrayList<Long> nativeNetworkObservers;
    private NetworkChangeDetector networkChangeDetector;
    private NetworkChangeDetectorFactory networkChangeDetectorFactory;
    private final Object networkChangeDetectorLock;
    private final ArrayList<NetworkObserver> networkObservers;
    private int numObservers;

    public static class InstanceHolder {
        static final NetworkMonitor instance = new NetworkMonitor(0);

        private InstanceHolder() {
        }
    }

    public interface NetworkObserver {
        void onConnectionTypeChanged(NetworkChangeDetector.ConnectionType connectionType);
    }

    public /* synthetic */ NetworkMonitor(int i13) {
        this();
    }

    @Deprecated
    public static void addNetworkObserver(NetworkObserver networkObserver) {
        getInstance().addObserver(networkObserver);
    }

    @CalledByNative
    private static int androidSdkInt() {
        return Build.VERSION.SDK_INT;
    }

    private static void assertIsTrue(boolean z4) {
        if (!z4) {
            throw new AssertionError("Expected to be true");
        }
    }

    public static NetworkMonitorAutoDetect createAndSetAutoDetectForTest(Context context, String str) {
        NetworkMonitor networkMonitor = getInstance();
        NetworkChangeDetector networkChangeDetectorCreateNetworkChangeDetector = networkMonitor.createNetworkChangeDetector(context, str);
        networkMonitor.networkChangeDetector = networkChangeDetectorCreateNetworkChangeDetector;
        return (NetworkMonitorAutoDetect) networkChangeDetectorCreateNetworkChangeDetector;
    }

    private NetworkChangeDetector createNetworkChangeDetector(Context context, final String str) {
        return this.networkChangeDetectorFactory.create(new NetworkChangeDetector.Observer(this) { // from class: org.webrtc.NetworkMonitor.2
            final /* synthetic */ NetworkMonitor this$0;

            {
                this.this$0 = this;
            }

            @Override // org.webrtc.NetworkChangeDetector.Observer
            public String getFieldTrialsString() {
                return str;
            }

            @Override // org.webrtc.NetworkChangeDetector.Observer
            public void onConnectionTypeChanged(NetworkChangeDetector.ConnectionType connectionType) {
                this.this$0.updateCurrentConnectionType(connectionType);
            }

            @Override // org.webrtc.NetworkChangeDetector.Observer
            public void onNetworkConnect(NetworkChangeDetector.NetworkInformation networkInformation) {
                this.this$0.notifyObserversOfNetworkConnect(networkInformation);
            }

            @Override // org.webrtc.NetworkChangeDetector.Observer
            public void onNetworkDisconnect(long j7) {
                this.this$0.notifyObserversOfNetworkDisconnect(j7);
            }

            @Override // org.webrtc.NetworkChangeDetector.Observer
            public void onNetworkPreference(List<NetworkChangeDetector.ConnectionType> list, int i13) {
                this.this$0.notifyObserversOfNetworkPreference(list, i13);
            }
        }, context);
    }

    private NetworkChangeDetector.ConnectionType getCurrentConnectionType() {
        return this.currentConnectionType;
    }

    @CalledByNative
    public static NetworkMonitor getInstance() {
        return InstanceHolder.instance;
    }

    @Deprecated
    public static void init(Context context) {
    }

    public static boolean isOnline() {
        return getInstance().getCurrentConnectionType() != NetworkChangeDetector.ConnectionType.CONNECTION_NONE;
    }

    private native void nativeNotifyConnectionTypeChanged(long j7);

    private native void nativeNotifyOfActiveNetworkList(long j7, NetworkChangeDetector.NetworkInformation[] networkInformationArr);

    private native void nativeNotifyOfNetworkConnect(long j7, NetworkChangeDetector.NetworkInformation networkInformation);

    private native void nativeNotifyOfNetworkDisconnect(long j7, long j13);

    private native void nativeNotifyOfNetworkPreference(long j7, NetworkChangeDetector.ConnectionType connectionType, int i13);

    @CalledByNative
    private boolean networkBindingSupported() {
        boolean z4;
        synchronized (this.networkChangeDetectorLock) {
            try {
                NetworkChangeDetector networkChangeDetector = this.networkChangeDetector;
                z4 = networkChangeDetector != null && networkChangeDetector.supportNetworkCallback();
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return z4;
    }

    private void notifyObserversOfConnectionTypeChange(NetworkChangeDetector.ConnectionType connectionType) {
        ArrayList arrayList;
        synchronized (this.nativeNetworkObservers) {
            try {
                Iterator<Long> it = this.nativeNetworkObservers.iterator();
                while (it.hasNext()) {
                    nativeNotifyConnectionTypeChanged(it.next().longValue());
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        synchronized (this.networkObservers) {
            arrayList = new ArrayList(this.networkObservers);
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            ((NetworkObserver) it3.next()).onConnectionTypeChanged(connectionType);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyObserversOfNetworkConnect(NetworkChangeDetector.NetworkInformation networkInformation) {
        synchronized (this.nativeNetworkObservers) {
            try {
                Iterator<Long> it = this.nativeNetworkObservers.iterator();
                while (it.hasNext()) {
                    nativeNotifyOfNetworkConnect(it.next().longValue(), networkInformation);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyObserversOfNetworkDisconnect(long j7) {
        synchronized (this.nativeNetworkObservers) {
            try {
                Iterator<Long> it = this.nativeNetworkObservers.iterator();
                while (it.hasNext()) {
                    nativeNotifyOfNetworkDisconnect(it.next().longValue(), j7);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyObserversOfNetworkPreference(List<NetworkChangeDetector.ConnectionType> list, int i13) {
        synchronized (this.nativeNetworkObservers) {
            try {
                for (NetworkChangeDetector.ConnectionType connectionType : list) {
                    Iterator<Long> it = this.nativeNetworkObservers.iterator();
                    while (it.hasNext()) {
                        nativeNotifyOfNetworkPreference(it.next().longValue(), connectionType, i13);
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Deprecated
    public static void removeNetworkObserver(NetworkObserver networkObserver) {
        getInstance().removeObserver(networkObserver);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateCurrentConnectionType(NetworkChangeDetector.ConnectionType connectionType) {
        this.currentConnectionType = connectionType;
        notifyObserversOfConnectionTypeChange(connectionType);
    }

    private void updateObserverActiveNetworkList(long j7) {
        List<NetworkChangeDetector.NetworkInformation> activeNetworkList;
        synchronized (this.networkChangeDetectorLock) {
            NetworkChangeDetector networkChangeDetector = this.networkChangeDetector;
            activeNetworkList = networkChangeDetector == null ? null : networkChangeDetector.getActiveNetworkList();
        }
        if (activeNetworkList == null) {
            return;
        }
        nativeNotifyOfActiveNetworkList(j7, (NetworkChangeDetector.NetworkInformation[]) activeNetworkList.toArray(new NetworkChangeDetector.NetworkInformation[activeNetworkList.size()]));
    }

    public void addObserver(NetworkObserver networkObserver) {
        synchronized (this.networkObservers) {
            this.networkObservers.add(networkObserver);
        }
    }

    public NetworkChangeDetector getNetworkChangeDetector() {
        NetworkChangeDetector networkChangeDetector;
        synchronized (this.networkChangeDetectorLock) {
            networkChangeDetector = this.networkChangeDetector;
        }
        return networkChangeDetector;
    }

    public int getNumObservers() {
        int i13;
        synchronized (this.networkChangeDetectorLock) {
            i13 = this.numObservers;
        }
        return i13;
    }

    public void removeObserver(NetworkObserver networkObserver) {
        synchronized (this.networkObservers) {
            this.networkObservers.remove(networkObserver);
        }
    }

    public void setNetworkChangeDetectorFactory(NetworkChangeDetectorFactory networkChangeDetectorFactory) {
        assertIsTrue(this.numObservers == 0);
        this.networkChangeDetectorFactory = networkChangeDetectorFactory;
    }

    public void startMonitoring(Context context, String str) {
        synchronized (this.networkChangeDetectorLock) {
            try {
                this.numObservers++;
                if (this.networkChangeDetector == null) {
                    this.networkChangeDetector = createNetworkChangeDetector(context, str);
                }
                this.currentConnectionType = this.networkChangeDetector.getCurrentConnectionType();
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public void stopMonitoring() {
        synchronized (this.networkChangeDetectorLock) {
            try {
                int i13 = this.numObservers - 1;
                this.numObservers = i13;
                if (i13 == 0) {
                    this.networkChangeDetector.destroy();
                    this.networkChangeDetector = null;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    private NetworkMonitor() {
        this.networkChangeDetectorFactory = new NetworkChangeDetectorFactory() { // from class: org.webrtc.NetworkMonitor.1
            @Override // org.webrtc.NetworkChangeDetectorFactory
            public NetworkChangeDetector create(NetworkChangeDetector.Observer observer, Context context) {
                return new NetworkMonitorAutoDetect(observer, context);
            }
        };
        this.networkChangeDetectorLock = new Object();
        this.nativeNetworkObservers = new ArrayList<>();
        this.networkObservers = new ArrayList<>();
        this.numObservers = 0;
        this.currentConnectionType = NetworkChangeDetector.ConnectionType.CONNECTION_UNKNOWN;
    }

    @CalledByNative
    private void stopMonitoring(long j7) {
        Logging.m85621d(TAG, "Stop monitoring with native observer " + j7);
        stopMonitoring();
        synchronized (this.nativeNetworkObservers) {
            this.nativeNetworkObservers.remove(Long.valueOf(j7));
        }
    }

    @Deprecated
    public void startMonitoring(Context context) {
        startMonitoring(context, "");
    }

    @Deprecated
    public void startMonitoring() {
        startMonitoring(ContextUtils.getApplicationContext(), "");
    }

    @CalledByNative
    private void startMonitoring(Context context, long j7, String str) {
        Logging.m85621d(TAG, "Start monitoring with native observer " + j7 + " fieldTrialsString: " + str);
        if (context == null) {
            context = ContextUtils.getApplicationContext();
        }
        startMonitoring(context, str);
        synchronized (this.nativeNetworkObservers) {
            this.nativeNetworkObservers.add(Long.valueOf(j7));
        }
        updateObserverActiveNetworkList(j7);
        notifyObserversOfConnectionTypeChange(this.currentConnectionType);
    }
}
