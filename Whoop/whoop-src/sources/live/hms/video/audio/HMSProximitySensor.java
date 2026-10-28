package live.hms.video.audio;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import hms.webrtc.ThreadUtils;
import live.hms.video.utils.HMSLogger;

/* JADX INFO: loaded from: classes3.dex */
class HMSProximitySensor implements SensorEventListener {
    private static final String TAG = "HMSProximitySensor";
    private boolean lastStateReportIsNear;
    private final Runnable onSensorStateListener;
    private Sensor proximitySensor;
    private final SensorManager sensorManager;
    private final ThreadUtils.ThreadChecker threadChecker = new ThreadUtils.ThreadChecker();

    private HMSProximitySensor(Context context, Runnable runnable) {
        HMSLogger.m71136d(TAG, TAG + live.hms.video.utils.ThreadUtils.getThreadInfo());
        this.onSensorStateListener = runnable;
        this.sensorManager = (SensorManager) context.getSystemService("sensor");
    }

    private void HMSLoggerProximitySensorInfo() {
        if (this.proximitySensor == null) {
            return;
        }
        HMSLogger.m71136d(TAG, "Proximity sensor: name=" + this.proximitySensor.getName() + ", vendor: " + this.proximitySensor.getVendor() + ", power: " + this.proximitySensor.getPower() + ", resolution: " + this.proximitySensor.getResolution() + ", max range: " + this.proximitySensor.getMaximumRange() + ", min delay: " + this.proximitySensor.getMinDelay() + ", type: " + this.proximitySensor.getStringType() + ", max delay: " + this.proximitySensor.getMaxDelay() + ", reporting mode: " + this.proximitySensor.getReportingMode() + ", isWakeUpSensor: " + this.proximitySensor.isWakeUpSensor());
    }

    private void assertIsTrue(boolean z4) {
        if (!z4) {
            throw new AssertionError("Expected condition to be true");
        }
    }

    public static HMSProximitySensor create(Context context, Runnable runnable) {
        return new HMSProximitySensor(context, runnable);
    }

    private boolean initDefaultSensor() {
        if (this.proximitySensor != null) {
            return true;
        }
        Sensor defaultSensor = this.sensorManager.getDefaultSensor(8);
        this.proximitySensor = defaultSensor;
        if (defaultSensor == null) {
            return false;
        }
        HMSLoggerProximitySensorInfo();
        return true;
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i13) {
        this.threadChecker.checkIsOnValidThread();
        assertIsTrue(sensor.getType() == 8);
        if (i13 == 0) {
            HMSLogger.m71137e(TAG, "The values returned by this sensor cannot be trusted");
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        this.threadChecker.checkIsOnValidThread();
        assertIsTrue(sensorEvent.sensor.getType() == 8);
        if (sensorEvent.values[0] < this.proximitySensor.getMaximumRange()) {
            HMSLogger.m71136d(TAG, "Proximity sensor => NEAR state");
            this.lastStateReportIsNear = true;
        } else {
            HMSLogger.m71136d(TAG, "Proximity sensor => FAR state");
            this.lastStateReportIsNear = false;
        }
        Runnable runnable = this.onSensorStateListener;
        if (runnable != null) {
            runnable.run();
        }
        HMSLogger.m71136d(TAG, "onSensorChanged" + live.hms.video.utils.ThreadUtils.getThreadInfo() + ": accuracy=" + sensorEvent.accuracy + ", timestamp=" + sensorEvent.timestamp + ", distance=" + sensorEvent.values[0]);
    }

    public boolean sensorReportsNearState() {
        this.threadChecker.checkIsOnValidThread();
        return this.lastStateReportIsNear;
    }

    public boolean start() {
        this.threadChecker.checkIsOnValidThread();
        HMSLogger.m71136d(TAG, "start" + live.hms.video.utils.ThreadUtils.getThreadInfo());
        if (!initDefaultSensor()) {
            return false;
        }
        this.sensorManager.registerListener(this, this.proximitySensor, 3);
        return true;
    }

    public void stop() {
        this.threadChecker.checkIsOnValidThread();
        HMSLogger.m71136d(TAG, "stop" + live.hms.video.utils.ThreadUtils.getThreadInfo());
        Sensor sensor = this.proximitySensor;
        if (sensor == null) {
            return;
        }
        this.sensorManager.unregisterListener(this, sensor);
    }
}
