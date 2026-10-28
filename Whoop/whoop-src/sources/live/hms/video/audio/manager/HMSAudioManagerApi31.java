package live.hms.video.audio.manager;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import io.getstream.chat.android.p226ui.feature.messages.composer.attachment.picker.factory.file.internal.C19683b;
import io.sentry.RunnableC20277c7;
import io.sentry.android.core.RunnableC20151r0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import l83.InterfaceC23462h;
import live.hms.video.audio.AudioChangeEvent;
import live.hms.video.audio.AudioManagerFocusChangeCallbacks;
import live.hms.video.audio.HMSAudioDeviceInfo;
import live.hms.video.audio.HMSAudioManager;
import live.hms.video.error.ErrorFactory;
import live.hms.video.error.HMSException;
import live.hms.video.events.AnalyticsEventFactory;
import live.hms.video.events.AnalyticsEventsService;
import live.hms.video.media.settings.HMSAudioTrackSettings;
import live.hms.video.media.settings.PhoneCallState;
import live.hms.video.sdk.IErrorListener;
import live.hms.video.utils.HMSLogger;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import p031b9.C2820c;
import p098dt.AbstractC12350b;
import p479s4.AbstractC32122c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import wb3.AbstractC37056f;
import yb3.AbstractC39414r;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000½\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001n\b\u0007\u0018\u00002\u00020\u0001B5\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0013\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0016\u0010\u0015J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020\u00102\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0010H\u0016¢\u0006\u0004\b(\u0010\u0015J\u0017\u0010*\u001a\u00020\u00102\u0006\u0010)\u001a\u00020\u001bH\u0016¢\u0006\u0004\b*\u0010+J\u0017\u0010-\u001a\u00020\u00102\u0006\u0010,\u001a\u00020\nH\u0002¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u0010H\u0002¢\u0006\u0004\b/\u0010\u0015J\u000f\u00100\u001a\u00020\u0010H\u0002¢\u0006\u0004\b0\u0010\u0015J\u000f\u00101\u001a\u00020\u0010H\u0002¢\u0006\u0004\b1\u0010\u0015J\u0017\u00104\u001a\u00020\u00102\u0006\u00103\u001a\u000202H\u0002¢\u0006\u0004\b4\u00105J\u0015\u00106\u001a\b\u0012\u0004\u0012\u00020!0 H\u0002¢\u0006\u0004\b6\u0010#J\u0017\u00108\u001a\u00020\u00102\u0006\u00107\u001a\u00020\u0017H\u0002¢\u0006\u0004\b8\u00109J\u0017\u0010:\u001a\u00020\u00102\u0006\u00107\u001a\u00020\u0017H\u0002¢\u0006\u0004\b:\u00109J\u000f\u0010;\u001a\u00020\u0010H\u0002¢\u0006\u0004\b;\u0010\u0015J\u001d\u0010>\u001a\u00020\u00102\f\u0010=\u001a\b\u0012\u0004\u0012\u00020<0 H\u0002¢\u0006\u0004\b>\u0010?R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010@\u001a\u0004\bA\u0010BR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010CR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010D\u001a\u0004\bE\u0010FR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010G\u001a\u0004\bH\u0010IR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010J\u001a\u0004\bK\u0010LR\u0014\u0010N\u001a\u00020M8\u0002X\u0082D¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010Q\u001a\u00020P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0016\u0010T\u001a\u00020S8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010UR\u0018\u0010V\u001a\u0004\u0018\u00010<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010WR\u0016\u0010X\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010YR\u0016\u0010Z\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010[R\u0016\u0010\\\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010[R\u0016\u0010]\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010[R\u0014\u0010_\u001a\u00020^8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010`R\u001b\u0010f\u001a\u00020a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bb\u0010c\u001a\u0004\bd\u0010eR\"\u0010h\u001a\u00020g8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bh\u0010i\u001a\u0004\bj\u0010k\"\u0004\bl\u0010mR\u0014\u0010o\u001a\u00020n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bo\u0010pR\u0018\u0010r\u001a\u0004\u0018\u00010q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\br\u0010sR\u001a\u0010u\u001a\b\u0012\u0004\u0012\u00020\u000e0t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bu\u0010vR\u0018\u0010x\u001a\u0004\u0018\u00010w8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bx\u0010y¨\u0006z"}, m65681d2 = {"Llive/hms/video/audio/manager/HMSAudioManagerApi31;", "Llive/hms/video/audio/HMSAudioManager;", "Landroid/content/Context;", "context", "Llive/hms/video/events/AnalyticsEventsService;", "analytics", "Llive/hms/video/media/settings/HMSAudioTrackSettings;", "hmsAudioTrackSettings", "Llive/hms/video/audio/HMSAudioManager$AudioManagerDeviceChangeListener;", "audioManagerDeviceChangeListener", "Llive/hms/video/sdk/IErrorListener;", "errorListener", "<init>", "(Landroid/content/Context;Llive/hms/video/events/AnalyticsEventsService;Llive/hms/video/media/settings/HMSAudioTrackSettings;Llive/hms/video/audio/HMSAudioManager$AudioManagerDeviceChangeListener;Llive/hms/video/sdk/IErrorListener;)V", "Llive/hms/video/audio/AudioManagerFocusChangeCallbacks;", "callback", "Ll83/a0;", "addAudioFocusChangeCallback", "(Llive/hms/video/audio/AudioManagerFocusChangeCallbacks;)V", "removeAudioFocusChangeCallback", "initialize", "()V", "start", "", "isStarted", "()Z", "", "Llive/hms/video/audio/HMSAudioManager$AudioDevice;", "getAudioDevices", "()Ljava/util/Set;", "getSelectedAudioDevice", "()Llive/hms/video/audio/HMSAudioManager$AudioDevice;", "", "Llive/hms/video/audio/HMSAudioDeviceInfo;", "getAudioDevicesInfoList", "()Ljava/util/List;", "", "audioMode", "setAudioMode", "(I)V", "stop", "device", "selectAudioDevice", "(Llive/hms/video/audio/HMSAudioManager$AudioDevice;)V", "onErrorListener", "initTelephony", "(Llive/hms/video/sdk/IErrorListener;)V", "deInitTelephony", "createAudioFocusChangeListener", "requestAudioFocus", "Llive/hms/video/audio/AudioChangeEvent;", NotificationCompat.CATEGORY_EVENT, "sendAudioChangeEvent", "(Llive/hms/video/audio/AudioChangeEvent;)V", "groupAudioDevices", "on", "setSpeakerphoneOn", "(Z)V", "setMicrophoneMute", "updateAudioDeviceState", "Landroid/media/AudioDeviceInfo;", "availableCommunicationDevices", "setAutomaticSelection", "(Ljava/util/List;)V", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Llive/hms/video/events/AnalyticsEventsService;", "Llive/hms/video/media/settings/HMSAudioTrackSettings;", "getHmsAudioTrackSettings", "()Llive/hms/video/media/settings/HMSAudioTrackSettings;", "Llive/hms/video/audio/HMSAudioManager$AudioManagerDeviceChangeListener;", "getAudioManagerDeviceChangeListener", "()Llive/hms/video/audio/HMSAudioManager$AudioManagerDeviceChangeListener;", "Llive/hms/video/sdk/IErrorListener;", "getErrorListener", "()Llive/hms/video/sdk/IErrorListener;", "", "TAG", "Ljava/lang/String;", "Llive/hms/video/audio/manager/AudioManagerCompat;", "androidAudioManager", "Llive/hms/video/audio/manager/AudioManagerCompat;", "Llive/hms/video/audio/manager/AudioManagerUtil$AudioDevice;", "defaultAudioDevice", "Llive/hms/video/audio/manager/AudioManagerUtil$AudioDevice;", "userSelectedAudioDevice", "Landroid/media/AudioDeviceInfo;", "savedAudioMode", "I", "savedIsSpeakerPhoneOn", "Z", "savedIsMicrophoneMute", "hasWiredHeadset", "", "TELEPHONY_LOCK", "Ljava/lang/Object;", "Landroid/os/Handler;", "mainHandler$delegate", "Ll83/h;", "getMainHandler", "()Landroid/os/Handler;", "mainHandler", "Llive/hms/video/audio/HMSAudioManager$AudioManagerState;", "state", "Llive/hms/video/audio/HMSAudioManager$AudioManagerState;", "getState", "()Llive/hms/video/audio/HMSAudioManager$AudioManagerState;", "setState", "(Llive/hms/video/audio/HMSAudioManager$AudioManagerState;)V", "live/hms/video/audio/manager/HMSAudioManagerApi31$deviceCallback$1", "deviceCallback", "Llive/hms/video/audio/manager/HMSAudioManagerApi31$deviceCallback$1;", "Landroid/media/AudioManager$OnAudioFocusChangeListener;", "audioFocusChangeListener", "Landroid/media/AudioManager$OnAudioFocusChangeListener;", "", "focusChangeCallbacks", "Ljava/util/List;", "Landroid/telephony/PhoneStateListener;", "phoneStateChangeListener", "Landroid/telephony/PhoneStateListener;", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class HMSAudioManagerApi31 implements HMSAudioManager {
    private final String TAG;
    private final Object TELEPHONY_LOCK;
    private final AnalyticsEventsService analytics;
    private final AudioManagerCompat androidAudioManager;
    private AudioManager.OnAudioFocusChangeListener audioFocusChangeListener;
    private final HMSAudioManager.AudioManagerDeviceChangeListener audioManagerDeviceChangeListener;
    private final Context context;
    private AudioManagerUtil.AudioDevice defaultAudioDevice;
    private final HMSAudioManagerApi31$deviceCallback$1 deviceCallback;
    private final IErrorListener errorListener;
    private final List<AudioManagerFocusChangeCallbacks> focusChangeCallbacks;
    private boolean hasWiredHeadset;
    private final HMSAudioTrackSettings hmsAudioTrackSettings;

    /* JADX INFO: renamed from: mainHandler$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h mainHandler;
    private PhoneStateListener phoneStateChangeListener;
    private int savedAudioMode;
    private boolean savedIsMicrophoneMute;
    private boolean savedIsSpeakerPhoneOn;
    private HMSAudioManager.AudioManagerState state;
    private AudioDeviceInfo userSelectedAudioDevice;

    /* JADX WARN: Type inference failed for: r2v8, types: [live.hms.video.audio.manager.HMSAudioManagerApi31$deviceCallback$1] */
    public HMSAudioManagerApi31(Context context, AnalyticsEventsService analytics, HMSAudioTrackSettings hMSAudioTrackSettings, HMSAudioManager.AudioManagerDeviceChangeListener audioManagerDeviceChangeListener, IErrorListener iErrorListener) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(analytics, "analytics");
        AbstractC22676k.m65750j(audioManagerDeviceChangeListener, "audioManagerDeviceChangeListener");
        this.context = context;
        this.analytics = analytics;
        this.hmsAudioTrackSettings = hMSAudioTrackSettings;
        this.audioManagerDeviceChangeListener = audioManagerDeviceChangeListener;
        this.errorListener = iErrorListener;
        this.TAG = "HMSAudioManagerApi31";
        AudioManagerCompat audioManagerCompatCreate = AudioManagerCompat.create(context);
        AbstractC22676k.m65749i(audioManagerCompatCreate, "create(...)");
        this.androidAudioManager = audioManagerCompatCreate;
        this.defaultAudioDevice = AudioManagerUtil.AudioDevice.SPEAKER_PHONE;
        this.savedAudioMode = -2;
        this.TELEPHONY_LOCK = new Object();
        this.mainHandler = AbstractC30060g.m92088H(new C19683b(this, 28));
        this.state = HMSAudioManager.AudioManagerState.UNINITIALIZED;
        initialize();
        this.deviceCallback = new AudioDeviceCallback() { // from class: live.hms.video.audio.manager.HMSAudioManagerApi31$deviceCallback$1
            @Override // android.media.AudioDeviceCallback
            public void onAudioDevicesAdded(AudioDeviceInfo[] addedDevices) {
                AbstractC22676k.m65750j(addedDevices, "addedDevices");
                super.onAudioDevicesAdded(addedDevices);
                String str = this.this$0.TAG;
                StringBuilder sb4 = new StringBuilder("onAudioDevicesAdded :: ");
                ArrayList arrayList = new ArrayList(addedDevices.length);
                for (AudioDeviceInfo audioDeviceInfo : addedDevices) {
                    arrayList.add(AudioDeviceMapping.fromPlatformType(audioDeviceInfo.getType()));
                }
                sb4.append(arrayList);
                HMSLogger.m71136d(str, sb4.toString());
                this.this$0.updateAudioDeviceState();
            }

            @Override // android.media.AudioDeviceCallback
            public void onAudioDevicesRemoved(AudioDeviceInfo[] removedDevices) {
                AbstractC22676k.m65750j(removedDevices, "removedDevices");
                super.onAudioDevicesRemoved(removedDevices);
                String str = this.this$0.TAG;
                StringBuilder sb4 = new StringBuilder("onAudioDevicesRemoved :: ");
                ArrayList arrayList = new ArrayList(removedDevices.length);
                for (AudioDeviceInfo audioDeviceInfo : removedDevices) {
                    arrayList.add(AudioDeviceMapping.fromPlatformType(audioDeviceInfo.getType()));
                }
                sb4.append(arrayList);
                HMSLogger.m71136d(str, sb4.toString());
                this.this$0.updateAudioDeviceState();
            }
        };
        this.focusChangeCallbacks = new ArrayList();
    }

    private final void createAudioFocusChangeListener() {
        this.audioFocusChangeListener = new C2820c(this, 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createAudioFocusChangeListener$lambda$5(HMSAudioManagerApi31 this$0, int i13) {
        AbstractC22676k.m65750j(this$0, "this$0");
        HMSLogger.m71136d(this$0.TAG, "onAudioFocusChange: " + i13);
        if (i13 == -3) {
            this$0.sendAudioChangeEvent(AudioChangeEvent.DEBUG_AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK);
            return;
        }
        if (i13 == -2) {
            this$0.sendAudioChangeEvent(AudioChangeEvent.AUDIOFOCUS_LOSS_TRANSIENT);
            return;
        }
        if (i13 == -1) {
            this$0.sendAudioChangeEvent(AudioChangeEvent.DEBUG_AUDIOFOCUS_LOSS);
            return;
        }
        if (i13 == 1) {
            this$0.sendAudioChangeEvent(AudioChangeEvent.AUDIOFOCUS_GAIN);
            this$0.androidAudioManager.clearCommunicationDevice();
            this$0.updateAudioDeviceState();
        } else {
            if (i13 == 2) {
                this$0.sendAudioChangeEvent(AudioChangeEvent.DEBUG_AUDIOFOCUS_GAIN_TRANSIENT);
                return;
            }
            if (i13 == 3) {
                this$0.sendAudioChangeEvent(AudioChangeEvent.DEBUG_AUDIOFOCUS_GAIN_TRANSIENT_MAY_DUCK);
            } else if (i13 != 4) {
                this$0.sendAudioChangeEvent(AudioChangeEvent.DEBUG_INVALID);
            } else {
                this$0.sendAudioChangeEvent(AudioChangeEvent.DEBUG_AUDIOFOCUS_GAIN_EXCLUSIVE);
            }
        }
    }

    private final void deInitTelephony() {
        if (this.hmsAudioTrackSettings == null || getMainHandler() == null || this.phoneStateChangeListener == null || this.hmsAudioTrackSettings.getPhoneCallState() != PhoneCallState.DISABLE_MUTE_ON_VOIP_PHONE_CALL_RING) {
            return;
        }
        synchronized (this.TELEPHONY_LOCK) {
            getMainHandler().post(new RunnableC20277c7(this, 26));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void deInitTelephony$lambda$4$lambda$3(HMSAudioManagerApi31 this$0) {
        AbstractC22676k.m65750j(this$0, "this$0");
        Object systemService = this$0.context.getSystemService("phone");
        AbstractC22676k.m65748h(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
        TelephonyManager telephonyManager = (TelephonyManager) systemService;
        if (AbstractC32122c.checkSelfPermission(this$0.context, "android.permission.READ_PHONE_STATE") == 0) {
            telephonyManager.listen(this$0.phoneStateChangeListener, 0);
        }
    }

    private final Handler getMainHandler() {
        return (Handler) this.mainHandler.getValue();
    }

    private final List<HMSAudioDeviceInfo> groupAudioDevices() {
        List<AudioDeviceInfo> availableCommunicationDevices = this.androidAudioManager.getAvailableCommunicationDevices();
        AbstractC22676k.m65749i(availableCommunicationDevices, "getAvailableCommunicationDevices(...)");
        List<AudioDeviceInfo> list = availableCommunicationDevices;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        for (AudioDeviceInfo audioDeviceInfo : list) {
            arrayList.add(new HMSAudioDeviceInfo(AudioDeviceMapping.toHMSMapping(AudioDeviceMapping.fromPlatformType(audioDeviceInfo.getType())), audioDeviceInfo.getProductName().toString()));
        }
        return arrayList;
    }

    private final void initTelephony(IErrorListener onErrorListener) {
        if (this.hmsAudioTrackSettings == null || getMainHandler() == null || this.hmsAudioTrackSettings.getPhoneCallState() != PhoneCallState.DISABLE_MUTE_ON_VOIP_PHONE_CALL_RING) {
            return;
        }
        synchronized (this.TELEPHONY_LOCK) {
            getMainHandler().post(new RunnableC20151r0(14, this, onErrorListener));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initTelephony$lambda$2$lambda$1(final HMSAudioManagerApi31 this$0, IErrorListener onErrorListener) {
        AbstractC22676k.m65750j(this$0, "this$0");
        AbstractC22676k.m65750j(onErrorListener, "$onErrorListener");
        if (this$0.phoneStateChangeListener == null) {
            this$0.phoneStateChangeListener = new PhoneStateListener() { // from class: live.hms.video.audio.manager.HMSAudioManagerApi31$initTelephony$1$1$1
                @Override // android.telephony.PhoneStateListener
                public void onCallStateChanged(int state, String phoneNumber) {
                    AbstractC22676k.m65750j(phoneNumber, "phoneNumber");
                    super.onCallStateChanged(state, phoneNumber);
                    if (state == 2) {
                        String str = this.this$0.TAG;
                        StringBuilder sb4 = new StringBuilder("onCallStateChanged: ");
                        AudioChangeEvent audioChangeEvent = AudioChangeEvent.PHONE_RINGING;
                        sb4.append(audioChangeEvent);
                        HMSLogger.m71136d(str, sb4.toString());
                        this.this$0.sendAudioChangeEvent(audioChangeEvent);
                    }
                }
            };
        }
        Object systemService = this$0.context.getSystemService("phone");
        AbstractC22676k.m65748h(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
        TelephonyManager telephonyManager = (TelephonyManager) systemService;
        if (Build.VERSION.SDK_INT < 30) {
            telephonyManager.listen(this$0.phoneStateChangeListener, 32);
        } else if (AbstractC32122c.checkSelfPermission(this$0.context, "android.permission.READ_PHONE_STATE") == 0) {
            telephonyManager.listen(this$0.phoneStateChangeListener, 32);
        } else {
            onErrorListener.onError(ErrorFactory.ReadPhoneStateError());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Handler mainHandler_delegate$lambda$0(HMSAudioManagerApi31 this$0) {
        AbstractC22676k.m65750j(this$0, "this$0");
        return new Handler(this$0.context.getMainLooper());
    }

    private final void requestAudioFocus() {
        AudioFocusRequest.Builder audioAttributes = new AudioFocusRequest.Builder(2).setAcceptsDelayedFocusGain(true).setAudioAttributes(new AudioAttributes.Builder().setUsage(2).setContentType(1).build());
        AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = this.audioFocusChangeListener;
        AbstractC22676k.m65747g(onAudioFocusChangeListener);
        this.androidAudioManager.audioManager.requestAudioFocus(audioAttributes.setOnAudioFocusChangeListener(onAudioFocusChangeListener).build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendAudioChangeEvent(AudioChangeEvent event) {
        Iterator<AudioManagerFocusChangeCallbacks> it = this.focusChangeCallbacks.iterator();
        while (it.hasNext()) {
            it.next().onAudioFocusChange(event);
        }
    }

    private final void setAutomaticSelection(List<AudioDeviceInfo> availableCommunicationDevices) {
        Object next;
        HMSLogger.m71136d(this.TAG, "Automatic selection");
        AudioDeviceInfo audioDeviceInfo = null;
        for (AudioManagerUtil.AudioDevice audioDevice : AbstractC25265s.m74159y0(AbstractC37056f.m118959K(AudioManagerUtil.AudioDevice.BLUETOOTH, AudioManagerUtil.AudioDevice.WIRED_HEADSET, AudioManagerUtil.AudioDevice.SPEAKER_PHONE, AudioManagerUtil.AudioDevice.EARPIECE, AudioManagerUtil.AudioDevice.NONE))) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : availableCommunicationDevices) {
                CharSequence productName = ((AudioDeviceInfo) obj).getProductName();
                AbstractC22676k.m65749i(productName, "getProductName(...)");
                if (!AbstractC39414r.m125876U(productName, " Watch", true)) {
                    arrayList.add(obj);
                }
            }
            Iterator it = arrayList.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (AudioDeviceMapping.fromPlatformType(((AudioDeviceInfo) next).getType()) != audioDevice);
            audioDeviceInfo = (AudioDeviceInfo) next;
            if (audioDeviceInfo != null) {
                HMSLogger.m71136d(this.TAG, "Automatically selected -> " + AudioDeviceMapping.fromPlatformType(audioDeviceInfo.getType()));
                break;
            }
        }
        if (audioDeviceInfo == null) {
            String str = this.TAG;
            StringBuilder sb4 = new StringBuilder("Tried to switch audio devices but could not find suitable device in list of types: ");
            List<AudioDeviceInfo> list = availableCommunicationDevices;
            ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(list, 10));
            Iterator<T> it3 = list.iterator();
            while (it3.hasNext()) {
                arrayList2.add(AudioDeviceMapping.fromPlatformType(((AudioDeviceInfo) it3.next()).getType()));
            }
            sb4.append(AbstractC25265s.m74110N0(arrayList2, null, null, null, null, 63));
            HMSLogger.m71137e(str, sb4.toString());
            this.androidAudioManager.clearCommunicationDevice();
            return;
        }
        HMSLogger.m71136d(this.TAG, "Switching to new device of type " + AudioDeviceMapping.fromPlatformType(audioDeviceInfo.getType()));
        if (!this.androidAudioManager.setCommunicationDevice(audioDeviceInfo)) {
            Log.w(this.TAG, "Failed to set " + audioDeviceInfo.getId() + " as communication device.");
            return;
        }
        HMSAudioManager.AudioDevice hMSMapping = AudioDeviceMapping.toHMSMapping(AudioDeviceMapping.fromPlatformType(audioDeviceInfo.getType()));
        List<AudioDeviceInfo> list2 = availableCommunicationDevices;
        ArrayList arrayList3 = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
        Iterator<T> it4 = list2.iterator();
        while (it4.hasNext()) {
            arrayList3.add(AudioDeviceMapping.toHMSMapping(AudioDeviceMapping.fromPlatformType(((AudioDeviceInfo) it4.next()).getType())));
        }
        this.audioManagerDeviceChangeListener.onAudioDeviceChanged(hMSMapping, AbstractC12350b.m34555D(HMSAudioManager.AudioDevice.AUTOMATIC, AbstractC25265s.m74103I1(arrayList3)));
        this.audioManagerDeviceChangeListener.onAudioDeviceInfoChanged(hMSMapping, groupAudioDevices());
        this.analytics.queue(AnalyticsEventFactory.INSTANCE.selectedAudioDevice(hMSMapping));
    }

    private final void setMicrophoneMute(boolean on3) {
        if (this.androidAudioManager.isMicrophoneMute() != on3) {
            this.androidAudioManager.setMicrophoneMute(on3);
        }
    }

    private final void setSpeakerphoneOn(boolean on3) {
        if (this.androidAudioManager.isSpeakerphoneOn() != on3) {
            this.androidAudioManager.setSpeakerphoneOn(on3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateAudioDeviceState() {
        List<AudioDeviceInfo> availableCommunicationDevices = this.androidAudioManager.getAvailableCommunicationDevices();
        AbstractC22676k.m65749i(availableCommunicationDevices, "getAvailableCommunicationDevices(...)");
        AudioDeviceInfo audioDeviceInfo = this.userSelectedAudioDevice;
        if (audioDeviceInfo == null || audioDeviceInfo.getId() == 0) {
            setAutomaticSelection(availableCommunicationDevices);
            return;
        }
        HMSLogger.m71136d(this.TAG, "Candidate found :: " + AudioDeviceMapping.fromPlatformType(audioDeviceInfo.getType()));
        if (!this.androidAudioManager.setCommunicationDevice(audioDeviceInfo)) {
            Log.w(this.TAG, "Failed to set " + audioDeviceInfo.getId() + " of type " + audioDeviceInfo.getType() + "as communication device. switching to automatic selection");
            setAutomaticSelection(availableCommunicationDevices);
            this.userSelectedAudioDevice = null;
            return;
        }
        HMSAudioManager.AudioDevice hMSMapping = AudioDeviceMapping.toHMSMapping(AudioDeviceMapping.fromPlatformType(audioDeviceInfo.getType()));
        List<AudioDeviceInfo> list = availableCommunicationDevices;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(AudioDeviceMapping.toHMSMapping(AudioDeviceMapping.fromPlatformType(((AudioDeviceInfo) it.next()).getType())));
        }
        LinkedHashSet linkedHashSetM34555D = AbstractC12350b.m34555D(HMSAudioManager.AudioDevice.AUTOMATIC, AbstractC25265s.m74103I1(arrayList));
        if (this.state == HMSAudioManager.AudioManagerState.UNINITIALIZED) {
            return;
        }
        this.audioManagerDeviceChangeListener.onAudioDeviceChanged(hMSMapping, linkedHashSetM34555D);
        this.audioManagerDeviceChangeListener.onAudioDeviceInfoChanged(hMSMapping, groupAudioDevices());
        this.analytics.queue(AnalyticsEventFactory.INSTANCE.selectedAudioDevice(hMSMapping));
    }

    @Override // live.hms.video.audio.HMSAudioManager
    public void addAudioFocusChangeCallback(AudioManagerFocusChangeCallbacks callback) {
        AbstractC22676k.m65750j(callback, "callback");
        this.focusChangeCallbacks.add(callback);
    }

    @Override // live.hms.video.audio.HMSAudioManager
    public Set<HMSAudioManager.AudioDevice> getAudioDevices() {
        List<AudioDeviceInfo> availableCommunicationDevices = this.androidAudioManager.getAvailableCommunicationDevices();
        AbstractC22676k.m65749i(availableCommunicationDevices, "getAvailableCommunicationDevices(...)");
        List<AudioDeviceInfo> list = availableCommunicationDevices;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(AudioDeviceMapping.toHMSMapping(AudioDeviceMapping.fromPlatformType(((AudioDeviceInfo) it.next()).getType())));
        }
        return AbstractC12350b.m34555D(HMSAudioManager.AudioDevice.AUTOMATIC, AbstractC25265s.m74103I1(arrayList));
    }

    @Override // live.hms.video.audio.HMSAudioManager
    public List<HMSAudioDeviceInfo> getAudioDevicesInfoList() {
        return groupAudioDevices();
    }

    public final HMSAudioManager.AudioManagerDeviceChangeListener getAudioManagerDeviceChangeListener() {
        return this.audioManagerDeviceChangeListener;
    }

    public final Context getContext() {
        return this.context;
    }

    public final IErrorListener getErrorListener() {
        return this.errorListener;
    }

    public final HMSAudioTrackSettings getHmsAudioTrackSettings() {
        return this.hmsAudioTrackSettings;
    }

    @Override // live.hms.video.audio.HMSAudioManager
    public HMSAudioManager.AudioDevice getSelectedAudioDevice() {
        AudioDeviceInfo communicationDevice = this.androidAudioManager.getCommunicationDevice();
        return AudioDeviceMapping.toHMSMapping(AudioDeviceMapping.fromPlatformType(communicationDevice != null ? communicationDevice.getType() : -1));
    }

    public final HMSAudioManager.AudioManagerState getState() {
        return this.state;
    }

    public final void initialize() {
        if (this.state == HMSAudioManager.AudioManagerState.UNINITIALIZED) {
            HMSLogger.m71136d(this.TAG, "Initialized HMSAudioManagerApi31");
            this.savedAudioMode = this.androidAudioManager.getMode();
            this.savedIsSpeakerPhoneOn = this.androidAudioManager.isSpeakerphoneOn();
            this.savedIsMicrophoneMute = this.androidAudioManager.isMicrophoneMute();
            this.hasWiredHeadset = this.androidAudioManager.isWiredHeadsetOn();
            this.state = HMSAudioManager.AudioManagerState.PREINITIALIZED;
        }
    }

    @Override // live.hms.video.audio.HMSAudioManager
    public boolean isStarted() {
        return this.state == HMSAudioManager.AudioManagerState.RUNNING;
    }

    @Override // live.hms.video.audio.HMSAudioManager
    public void removeAudioFocusChangeCallback(AudioManagerFocusChangeCallbacks callback) {
        AbstractC22676k.m65750j(callback, "callback");
        this.focusChangeCallbacks.remove(callback);
    }

    @Override // live.hms.video.audio.HMSAudioManager
    public void selectAudioDevice(HMSAudioManager.AudioDevice device) {
        AbstractC22676k.m65750j(device, "device");
        HMSLogger.m71136d(this.TAG, "Manually Selecting " + device);
        List<AudioDeviceInfo> availableCommunicationDevices = this.androidAudioManager.getAvailableCommunicationDevices();
        AbstractC22676k.m65749i(availableCommunicationDevices, "getAvailableCommunicationDevices(...)");
        List<AudioDeviceInfo> list = availableCommunicationDevices;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(AudioDeviceMapping.toHMSMapping(AudioDeviceMapping.fromPlatformType(((AudioDeviceInfo) it.next()).getType())));
        }
        AbstractC25265s.m74103I1(arrayList);
        AudioDeviceInfo audioDeviceInfo = null;
        Object obj = null;
        if (device != HMSAudioManager.AudioDevice.AUTOMATIC) {
            List<AudioDeviceInfo> availableCommunicationDevices2 = this.androidAudioManager.getAvailableCommunicationDevices();
            AbstractC22676k.m65749i(availableCommunicationDevices2, "getAvailableCommunicationDevices(...)");
            for (Object obj2 : availableCommunicationDevices2) {
                if (AudioDeviceMapping.fromPlatformType(((AudioDeviceInfo) obj2).getType()) == AudioDeviceMapping.toSignalMapping(device)) {
                    obj = obj2;
                    break;
                }
            }
            audioDeviceInfo = (AudioDeviceInfo) obj;
        }
        this.userSelectedAudioDevice = audioDeviceInfo;
        updateAudioDeviceState();
    }

    @Override // live.hms.video.audio.HMSAudioManager
    public void setAudioMode(int audioMode) {
        if (isStarted()) {
            this.androidAudioManager.setMode(audioMode);
        }
    }

    public final void setState(HMSAudioManager.AudioManagerState audioManagerState) {
        AbstractC22676k.m65750j(audioManagerState, "<set-?>");
        this.state = audioManagerState;
    }

    @Override // live.hms.video.audio.HMSAudioManager
    public void start() {
        HMSLogger.m71136d(this.TAG, "Started");
        createAudioFocusChangeListener();
        requestAudioFocus();
        if (this.errorListener != null) {
            initTelephony(new IErrorListener() { // from class: live.hms.video.audio.manager.HMSAudioManagerApi31.start.1
                @Override // live.hms.video.sdk.IErrorListener
                public void onError(HMSException error) {
                    AbstractC22676k.m65750j(error, "error");
                    HMSAudioManagerApi31.this.getErrorListener().onError(error);
                }
            });
        }
        this.androidAudioManager.registerAudioDeviceCallback(this.deviceCallback, null);
        this.androidAudioManager.setMicrophoneMute(false);
        this.state = HMSAudioManager.AudioManagerState.RUNNING;
        setAudioMode(3);
        updateAudioDeviceState();
    }

    @Override // live.hms.video.audio.HMSAudioManager
    public void stop() {
        this.androidAudioManager.unregisterAudioDeviceCallback(this.deviceCallback);
        HMSAudioManager.AudioManagerState audioManagerState = this.state;
        HMSAudioManager.AudioManagerState audioManagerState2 = HMSAudioManager.AudioManagerState.UNINITIALIZED;
        if (audioManagerState != audioManagerState2 || this.userSelectedAudioDevice == null) {
            this.androidAudioManager.clearCommunicationDevice();
            setSpeakerphoneOn(this.savedIsSpeakerPhoneOn);
            setMicrophoneMute(this.savedIsMicrophoneMute);
            this.androidAudioManager.setMode(this.savedAudioMode);
        } else {
            Log.d(this.TAG, "Stopping audio manager after selecting audio device but never initializing. This indicates a service spun up solely to set audio device. Therefore skipping audio device reset.");
        }
        deInitTelephony();
        this.androidAudioManager.abandonCallAudioFocus();
        Log.d(this.TAG, "Abandoned audio focus for VOICE_CALL streams");
        this.state = audioManagerState2;
        Log.d(this.TAG, "Stopped");
    }
}
