package no.nordicsemi.android.dfu;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.HashMap;
import java.util.Map;
import no.nordicsemi.android.dfu.internal.scanner.BootloaderScannerFactory;
import p417q8.C30028b;
import p460rg.AbstractC31366a;

/* JADX INFO: loaded from: classes3.dex */
public class DfuServiceListenerHelper {
    private static LogBroadcastReceiver mLogBroadcastReceiver;
    private static ProgressBroadcastsReceiver mProgressBroadcastReceiver;

    public static class LogBroadcastReceiver extends BroadcastReceiver {
        private DfuLogListener mGlobalLogListener;
        private final Map<String, DfuLogListener> mListeners;

        public /* synthetic */ LogBroadcastReceiver(int i13) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean removeLogListener(DfuLogListener dfuLogListener) {
            if (this.mGlobalLogListener == dfuLogListener) {
                this.mGlobalLogListener = null;
            }
            for (Map.Entry<String, DfuLogListener> entry : this.mListeners.entrySet()) {
                if (entry.getValue() == dfuLogListener) {
                    this.mListeners.remove(entry.getKey());
                    break;
                }
            }
            for (Map.Entry<String, DfuLogListener> entry2 : this.mListeners.entrySet()) {
                if (entry2.getValue() == dfuLogListener) {
                    this.mListeners.remove(entry2.getKey());
                    break;
                }
            }
            return this.mGlobalLogListener == null && this.mListeners.isEmpty();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLogListener(DfuLogListener dfuLogListener) {
            this.mGlobalLogListener = dfuLogListener;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String stringExtra = intent.getStringExtra(DfuBaseService.EXTRA_DEVICE_ADDRESS);
            DfuLogListener dfuLogListener = this.mGlobalLogListener;
            DfuLogListener dfuLogListener2 = this.mListeners.get(stringExtra);
            if (dfuLogListener == null && dfuLogListener2 == null) {
                return;
            }
            int intExtra = intent.getIntExtra(DfuBaseService.EXTRA_LOG_LEVEL, 0);
            String stringExtra2 = intent.getStringExtra(DfuBaseService.EXTRA_LOG_MESSAGE);
            if (dfuLogListener != null) {
                dfuLogListener.onLogEvent(stringExtra, intExtra, stringExtra2);
            }
            if (dfuLogListener2 != null) {
                dfuLogListener2.onLogEvent(stringExtra, intExtra, stringExtra2);
            }
        }

        private LogBroadcastReceiver() {
            this.mListeners = new HashMap();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLogListener(String str, DfuLogListener dfuLogListener) {
            this.mListeners.put(str, dfuLogListener);
            this.mListeners.put(BootloaderScannerFactory.getIncrementedAddress(str), dfuLogListener);
        }
    }

    public static class ProgressBroadcastsReceiver extends BroadcastReceiver {
        private DfuProgressListener mGlobalProgressListener;
        private final Map<String, DfuProgressListener> mListeners;

        public /* synthetic */ ProgressBroadcastsReceiver(int i13) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean removeProgressListener(DfuProgressListener dfuProgressListener) {
            if (this.mGlobalProgressListener == dfuProgressListener) {
                this.mGlobalProgressListener = null;
            }
            for (Map.Entry<String, DfuProgressListener> entry : this.mListeners.entrySet()) {
                if (entry.getValue() == dfuProgressListener) {
                    this.mListeners.remove(entry.getKey());
                    break;
                }
            }
            for (Map.Entry<String, DfuProgressListener> entry2 : this.mListeners.entrySet()) {
                if (entry2.getValue() == dfuProgressListener) {
                    this.mListeners.remove(entry2.getKey());
                    break;
                }
            }
            return this.mGlobalProgressListener == null && this.mListeners.isEmpty();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setProgressListener(DfuProgressListener dfuProgressListener) {
            this.mGlobalProgressListener = dfuProgressListener;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String action;
            String stringExtra = intent.getStringExtra(DfuBaseService.EXTRA_DEVICE_ADDRESS);
            if (stringExtra == null) {
                return;
            }
            DfuProgressListener dfuProgressListener = this.mGlobalProgressListener;
            DfuProgressListener dfuProgressListener2 = this.mListeners.get(stringExtra);
            if ((dfuProgressListener == null && dfuProgressListener2 == null) || (action = intent.getAction()) == null) {
                return;
            }
            if (!action.equals(DfuBaseService.BROADCAST_PROGRESS)) {
                if (action.equals(DfuBaseService.BROADCAST_ERROR)) {
                    int intExtra = intent.getIntExtra(DfuBaseService.EXTRA_DATA, 0);
                    int intExtra2 = intent.getIntExtra(DfuBaseService.EXTRA_ERROR_TYPE, 0);
                    if (dfuProgressListener != null) {
                        dfuProgressListener.onDeviceDisconnected(stringExtra);
                    }
                    if (dfuProgressListener2 != null) {
                        dfuProgressListener2.onDeviceDisconnected(stringExtra);
                    }
                    if (intExtra2 == 1) {
                        if (dfuProgressListener != null) {
                            dfuProgressListener.onError(stringExtra, intExtra, intExtra2, AbstractC31366a.m96477q(intExtra));
                        }
                        if (dfuProgressListener2 != null) {
                            dfuProgressListener2.onError(stringExtra, intExtra, intExtra2, AbstractC31366a.m96477q(intExtra));
                            return;
                        }
                        return;
                    }
                    if (intExtra2 != 3) {
                        if (dfuProgressListener != null) {
                            dfuProgressListener.onError(stringExtra, intExtra, intExtra2, AbstractC31366a.m96476p(intExtra));
                        }
                        if (dfuProgressListener2 != null) {
                            dfuProgressListener2.onError(stringExtra, intExtra, intExtra2, AbstractC31366a.m96476p(intExtra));
                        }
                        return;
                    }
                    if (dfuProgressListener != null) {
                        dfuProgressListener.onError(stringExtra, intExtra, intExtra2, AbstractC31366a.m96478r(intExtra));
                    }
                    if (dfuProgressListener2 != null) {
                        dfuProgressListener2.onError(stringExtra, intExtra, intExtra2, AbstractC31366a.m96478r(intExtra));
                        return;
                    }
                    return;
                }
                return;
            }
            int intExtra3 = intent.getIntExtra(DfuBaseService.EXTRA_DATA, 0);
            float floatExtra = intent.getFloatExtra(DfuBaseService.EXTRA_SPEED_B_PER_MS, 0.0f);
            float floatExtra2 = intent.getFloatExtra(DfuBaseService.EXTRA_AVG_SPEED_B_PER_MS, 0.0f);
            int intExtra4 = intent.getIntExtra(DfuBaseService.EXTRA_PART_CURRENT, 0);
            int intExtra5 = intent.getIntExtra(DfuBaseService.EXTRA_PARTS_TOTAL, 0);
            switch (intExtra3) {
                case DfuBaseService.PROGRESS_ABORTED /* -7 */:
                    if (dfuProgressListener != null) {
                        dfuProgressListener.onDeviceDisconnected(stringExtra);
                        dfuProgressListener.onDfuAborted(stringExtra);
                    }
                    if (dfuProgressListener2 != null) {
                        dfuProgressListener2.onDeviceDisconnected(stringExtra);
                        dfuProgressListener2.onDfuAborted(stringExtra);
                    }
                    break;
                case DfuBaseService.PROGRESS_COMPLETED /* -6 */:
                    if (dfuProgressListener != null) {
                        dfuProgressListener.onDeviceDisconnected(stringExtra);
                        dfuProgressListener.onDfuCompleted(stringExtra);
                    }
                    if (dfuProgressListener2 != null) {
                        dfuProgressListener2.onDeviceDisconnected(stringExtra);
                        dfuProgressListener2.onDfuCompleted(stringExtra);
                    }
                    break;
                case DfuBaseService.PROGRESS_DISCONNECTING /* -5 */:
                    if (dfuProgressListener != null) {
                        dfuProgressListener.onDeviceDisconnecting(stringExtra);
                    }
                    if (dfuProgressListener2 != null) {
                        dfuProgressListener2.onDeviceDisconnecting(stringExtra);
                    }
                    break;
                case DfuBaseService.PROGRESS_VALIDATING /* -4 */:
                    if (dfuProgressListener != null) {
                        dfuProgressListener.onFirmwareValidating(stringExtra);
                    }
                    if (dfuProgressListener2 != null) {
                        dfuProgressListener2.onFirmwareValidating(stringExtra);
                    }
                    break;
                case DfuBaseService.PROGRESS_ENABLING_DFU_MODE /* -3 */:
                    if (dfuProgressListener != null) {
                        dfuProgressListener.onEnablingDfuMode(stringExtra);
                    }
                    if (dfuProgressListener2 != null) {
                        dfuProgressListener2.onEnablingDfuMode(stringExtra);
                    }
                    break;
                case -2:
                    if (dfuProgressListener != null) {
                        dfuProgressListener.onDeviceConnected(stringExtra);
                        dfuProgressListener.onDfuProcessStarting(stringExtra);
                    }
                    if (dfuProgressListener2 != null) {
                        dfuProgressListener2.onDeviceConnected(stringExtra);
                        dfuProgressListener2.onDfuProcessStarting(stringExtra);
                    }
                    break;
                case -1:
                    if (dfuProgressListener != null) {
                        dfuProgressListener.onDeviceConnecting(stringExtra);
                    }
                    if (dfuProgressListener2 != null) {
                        dfuProgressListener2.onDeviceConnecting(stringExtra);
                    }
                    break;
                default:
                    if (intExtra3 == 0) {
                        if (dfuProgressListener != null) {
                            dfuProgressListener.onDfuProcessStarted(stringExtra);
                        }
                        if (dfuProgressListener2 != null) {
                            dfuProgressListener2.onDfuProcessStarted(stringExtra);
                        }
                    }
                    if (dfuProgressListener != null) {
                        dfuProgressListener.onProgressChanged(stringExtra, intExtra3, floatExtra, floatExtra2, intExtra4, intExtra5);
                    }
                    if (dfuProgressListener2 != null) {
                        dfuProgressListener2.onProgressChanged(stringExtra, intExtra3, floatExtra, floatExtra2, intExtra4, intExtra5);
                    }
                    break;
            }
        }

        private ProgressBroadcastsReceiver() {
            this.mListeners = new HashMap();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setProgressListener(String str, DfuProgressListener dfuProgressListener) {
            this.mListeners.put(str, dfuProgressListener);
            this.mListeners.put(BootloaderScannerFactory.getIncrementedAddress(str), dfuProgressListener);
        }
    }

    public static void registerLogListener(Context context, DfuLogListener dfuLogListener) {
        if (mLogBroadcastReceiver == null) {
            mLogBroadcastReceiver = new LogBroadcastReceiver(0);
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction(DfuBaseService.BROADCAST_LOG);
            C30028b.m91918a(context).m91919b(mLogBroadcastReceiver, intentFilter);
        }
        mLogBroadcastReceiver.setLogListener(dfuLogListener);
    }

    public static void registerProgressListener(Context context, DfuProgressListener dfuProgressListener) {
        if (mProgressBroadcastReceiver == null) {
            mProgressBroadcastReceiver = new ProgressBroadcastsReceiver(0);
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction(DfuBaseService.BROADCAST_PROGRESS);
            intentFilter.addAction(DfuBaseService.BROADCAST_ERROR);
            C30028b.m91918a(context).m91919b(mProgressBroadcastReceiver, intentFilter);
        }
        mProgressBroadcastReceiver.setProgressListener(dfuProgressListener);
    }

    public static void unregisterLogListener(Context context, DfuLogListener dfuLogListener) {
        LogBroadcastReceiver logBroadcastReceiver = mLogBroadcastReceiver;
        if (logBroadcastReceiver == null || !logBroadcastReceiver.removeLogListener(dfuLogListener)) {
            return;
        }
        C30028b.m91918a(context).m91921d(mLogBroadcastReceiver);
        mLogBroadcastReceiver = null;
    }

    public static void unregisterProgressListener(Context context, DfuProgressListener dfuProgressListener) {
        ProgressBroadcastsReceiver progressBroadcastsReceiver = mProgressBroadcastReceiver;
        if (progressBroadcastsReceiver == null || !progressBroadcastsReceiver.removeProgressListener(dfuProgressListener)) {
            return;
        }
        C30028b.m91918a(context).m91921d(mProgressBroadcastReceiver);
        mProgressBroadcastReceiver = null;
    }

    public static void registerLogListener(Context context, DfuLogListener dfuLogListener, String str) {
        if (mLogBroadcastReceiver == null) {
            mLogBroadcastReceiver = new LogBroadcastReceiver(0);
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction(DfuBaseService.BROADCAST_LOG);
            C30028b.m91918a(context).m91919b(mLogBroadcastReceiver, intentFilter);
        }
        mLogBroadcastReceiver.setLogListener(str, dfuLogListener);
    }

    public static void registerProgressListener(Context context, DfuProgressListener dfuProgressListener, String str) {
        if (mProgressBroadcastReceiver == null) {
            mProgressBroadcastReceiver = new ProgressBroadcastsReceiver(0);
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction(DfuBaseService.BROADCAST_PROGRESS);
            intentFilter.addAction(DfuBaseService.BROADCAST_ERROR);
            C30028b.m91918a(context).m91919b(mProgressBroadcastReceiver, intentFilter);
        }
        mProgressBroadcastReceiver.setProgressListener(str, dfuProgressListener);
    }
}
