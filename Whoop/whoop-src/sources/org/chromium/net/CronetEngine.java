package org.chromium.net;

import android.content.Context;
import android.util.Log;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandlerFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import r80.AbstractC31061c;

/* JADX INFO: loaded from: classes3.dex */
public abstract class CronetEngine {
    public static final int ACTIVE_REQUEST_COUNT_UNKNOWN = -1;
    public static final int CONNECTION_METRIC_UNKNOWN = -1;
    public static final int EFFECTIVE_CONNECTION_TYPE_2G = 3;
    public static final int EFFECTIVE_CONNECTION_TYPE_3G = 4;
    public static final int EFFECTIVE_CONNECTION_TYPE_4G = 5;
    public static final int EFFECTIVE_CONNECTION_TYPE_OFFLINE = 1;
    public static final int EFFECTIVE_CONNECTION_TYPE_SLOW_2G = 2;
    public static final int EFFECTIVE_CONNECTION_TYPE_UNKNOWN = 0;
    private static final String TAG = "CronetEngine";
    public static final long UNBIND_NETWORK_HANDLE = -1;

    public static class Builder {
        public static final int HTTP_CACHE_DISABLED = 0;
        public static final int HTTP_CACHE_DISK = 3;
        public static final int HTTP_CACHE_DISK_NO_HTTP = 2;
        public static final int HTTP_CACHE_IN_MEMORY = 1;
        private static final String TAG = "CronetEngine.Builder";
        protected final ICronetEngineBuilder mBuilderDelegate;

        public static abstract class LibraryLoader {
            public abstract void loadLibrary(String str);
        }

        public Builder(Context context) {
            this(createBuilderDelegate(context));
        }

        public static int compareVersions(String str, String str2) {
            if (str == null || str2 == null) {
                throw new IllegalArgumentException("The input values cannot be null");
            }
            String[] strArrSplit = str.split("\\.");
            String[] strArrSplit2 = str2.split("\\.");
            for (int i13 = 0; i13 < strArrSplit.length && i13 < strArrSplit2.length; i13++) {
                try {
                    int i14 = Integer.parseInt(strArrSplit[i13]);
                    int i15 = Integer.parseInt(strArrSplit2[i13]);
                    if (i14 != i15) {
                        return Integer.signum(i14 - i15);
                    }
                } catch (NumberFormatException e5) {
                    throw new IllegalArgumentException(AbstractC31061c.m95640p("Unable to convert version segments into integers: ", strArrSplit[i13], " & ", strArrSplit2[i13]), e5);
                }
            }
            return Integer.signum(strArrSplit.length - strArrSplit2.length);
        }

        private static ICronetEngineBuilder createBuilderDelegate(Context context) {
            CronetProvider cronetProvider = getEnabledCronetProviders(context, new ArrayList(CronetProvider.getAllProviders(context))).get(0);
            if (Log.isLoggable(TAG, 3)) {
                Log.d(TAG, String.format("Using '%s' provider for creating CronetEngine.Builder.", cronetProvider));
            }
            return cronetProvider.createBuilder().mBuilderDelegate;
        }

        public static List<CronetProvider> getEnabledCronetProviders(Context context, List<CronetProvider> list) {
            if (list.isEmpty()) {
                throw new RuntimeException("Unable to find any Cronet provider. Have you included all necessary jars?");
            }
            Iterator<CronetProvider> it = list.iterator();
            while (it.hasNext()) {
                if (!it.next().isEnabled()) {
                    it.remove();
                }
            }
            if (list.isEmpty()) {
                throw new RuntimeException("All available Cronet providers are disabled. A provider should be enabled before it can be used.");
            }
            Collections.sort(list, new C28223a());
            return list;
        }

        private int getImplementationApiLevel() {
            try {
                return ((Integer) this.mBuilderDelegate.getClass().getClassLoader().loadClass("org.chromium.net.impl.ImplVersion").getMethod("getApiLevel", null).invoke(null, null)).intValue();
            } catch (Exception unused) {
                return -1;
            }
        }

        private int getMaximumApiLevel() {
            return ApiVersion.getMaximumAvailableApiLevel();
        }

        public Builder addPublicKeyPins(String str, Set<byte[]> set, boolean z4, Date date) {
            this.mBuilderDelegate.addPublicKeyPins(str, set, z4, date);
            return this;
        }

        public Builder addQuicHint(String str, int i13, int i14) {
            this.mBuilderDelegate.addQuicHint(str, i13, i14);
            return this;
        }

        public CronetEngine build() {
            int implementationApiLevel = getImplementationApiLevel();
            if (implementationApiLevel != -1 && implementationApiLevel < getMaximumApiLevel()) {
                Log.w(TAG, "The implementation version is lower than the API version. Calls to methods added in API " + (implementationApiLevel + 1) + " and newer will likely have no effect.");
            }
            return this.mBuilderDelegate.build();
        }

        public Builder enableBrotli(boolean z4) {
            this.mBuilderDelegate.enableBrotli(z4);
            return this;
        }

        public Builder enableHttp2(boolean z4) {
            this.mBuilderDelegate.enableHttp2(z4);
            return this;
        }

        public Builder enableHttpCache(int i13, long j7) {
            this.mBuilderDelegate.enableHttpCache(i13, j7);
            return this;
        }

        public Builder enableNetworkQualityEstimator(boolean z4) {
            this.mBuilderDelegate.enableNetworkQualityEstimator(z4);
            return this;
        }

        public Builder enablePublicKeyPinningBypassForLocalTrustAnchors(boolean z4) {
            this.mBuilderDelegate.enablePublicKeyPinningBypassForLocalTrustAnchors(z4);
            return this;
        }

        public Builder enableQuic(boolean z4) {
            this.mBuilderDelegate.enableQuic(z4);
            return this;
        }

        @Deprecated
        public Builder enableSdch(boolean z4) {
            return this;
        }

        public String getDefaultUserAgent() {
            return this.mBuilderDelegate.getDefaultUserAgent();
        }

        @ConnectionMigrationOptions.Experimental
        public Builder setConnectionMigrationOptions(ConnectionMigrationOptions connectionMigrationOptions) {
            this.mBuilderDelegate.setConnectionMigrationOptions(connectionMigrationOptions);
            return this;
        }

        @DnsOptions.Experimental
        public Builder setDnsOptions(DnsOptions dnsOptions) {
            this.mBuilderDelegate.setDnsOptions(dnsOptions);
            return this;
        }

        public Builder setLibraryLoader(LibraryLoader libraryLoader) {
            this.mBuilderDelegate.setLibraryLoader(libraryLoader);
            return this;
        }

        @QuicOptions.Experimental
        public Builder setQuicOptions(QuicOptions quicOptions) {
            this.mBuilderDelegate.setQuicOptions(quicOptions);
            return this;
        }

        public Builder setStoragePath(String str) {
            this.mBuilderDelegate.setStoragePath(str);
            return this;
        }

        public Builder setThreadPriority(int i13) {
            this.mBuilderDelegate.setThreadPriority(i13);
            return this;
        }

        public Builder setUserAgent(String str) {
            this.mBuilderDelegate.setUserAgent(str);
            return this;
        }

        public Builder(ICronetEngineBuilder iCronetEngineBuilder) {
            if (iCronetEngineBuilder instanceof C28225c) {
                this.mBuilderDelegate = iCronetEngineBuilder;
            } else {
                this.mBuilderDelegate = new C28225c(iCronetEngineBuilder);
            }
        }

        @ConnectionMigrationOptions.Experimental
        public Builder setConnectionMigrationOptions(ConnectionMigrationOptions.Builder builder) {
            return setConnectionMigrationOptions(builder.build());
        }

        @DnsOptions.Experimental
        public Builder setDnsOptions(DnsOptions.Builder builder) {
            return setDnsOptions(builder.build());
        }

        @QuicOptions.Experimental
        public Builder setQuicOptions(QuicOptions.Builder builder) {
            return setQuicOptions(builder.build());
        }
    }

    public void addRequestFinishedListener(RequestFinishedInfo.Listener listener) {
    }

    public void addRttListener(NetworkQualityRttListener networkQualityRttListener) {
    }

    public void addThroughputListener(NetworkQualityThroughputListener networkQualityThroughputListener) {
    }

    public void bindToNetwork(long j7) {
    }

    public void configureNetworkQualityEstimatorForTesting(boolean z4, boolean z13, boolean z14) {
    }

    public abstract URLStreamHandlerFactory createURLStreamHandlerFactory();

    public int getActiveRequestCount() {
        return -1;
    }

    public int getDownstreamThroughputKbps() {
        return -1;
    }

    public int getEffectiveConnectionType() {
        return 0;
    }

    public abstract byte[] getGlobalMetricsDeltas();

    public int getHttpRttMs() {
        return -1;
    }

    public int getTransportRttMs() {
        return -1;
    }

    public abstract String getVersionString();

    public BidirectionalStream.Builder newBidirectionalStreamBuilder(String str, BidirectionalStream.Callback callback, Executor executor) {
        throw new UnsupportedOperationException("Not implemented.");
    }

    public abstract UrlRequest.Builder newUrlRequestBuilder(String str, UrlRequest.Callback callback, Executor executor);

    public abstract URLConnection openConnection(URL url) throws IOException;

    public void removeRequestFinishedListener(RequestFinishedInfo.Listener listener) {
    }

    public void removeRttListener(NetworkQualityRttListener networkQualityRttListener) {
    }

    public void removeThroughputListener(NetworkQualityThroughputListener networkQualityThroughputListener) {
    }

    public abstract void shutdown();

    public void startNetLogToDisk(String str, boolean z4, int i13) {
    }

    public abstract void startNetLogToFile(String str, boolean z4);

    public abstract void stopNetLog();
}
