package io.seon.androidsdk.service;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.provider.Telephony;
import android.telecom.TelecomManager;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.telephony.euicc.EuiccManager;
import hc3.AbstractC17176i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.IntFunction;
import live.hms.video.factories.MediaConstraintsFactory;
import p037bu.C3632c;
import p237j$.util.Collection$EL;

/* JADX INFO: renamed from: io.seon.androidsdk.service.r */
/* JADX INFO: loaded from: classes5.dex */
public final class C20690r extends AbstractC20664g {

    /* JADX INFO: renamed from: k */
    public static final String[] f77436k = {"carrier_name", "carrier_country", "device_id", "network_config", "is_on_call", "sim_slot_count"};

    /* JADX INFO: renamed from: l */
    public static final C3632c f77437l = new C3632c(C20690r.class.getName());

    /* JADX INFO: renamed from: e */
    public Context f77438e;

    /* JADX INFO: renamed from: f */
    public PackageManager f77439f;

    /* JADX INFO: renamed from: g */
    public TelephonyManager f77440g;

    /* JADX INFO: renamed from: h */
    public SubscriptionManager f77441h;

    /* JADX INFO: renamed from: i */
    public TelecomManager f77442i;

    /* JADX INFO: renamed from: j */
    public EuiccManager f77443j;

    @Override // io.seon.androidsdk.service.InterfaceC20670i
    /* JADX INFO: renamed from: a */
    public final Map mo56774a() {
        String networkOperatorName;
        String upperCase;
        String deviceId;
        Boolean boolValueOf;
        C3632c c3632c = AbstractC20664g.f77301d;
        HashMap map = new HashMap();
        Integer numValueOf = null;
        try {
            TelephonyManager telephonyManager = this.f77440g;
            networkOperatorName = (telephonyManager == null || telephonyManager.getNetworkOperatorName().isEmpty()) ? null : this.f77440g.getNetworkOperatorName();
        } catch (Exception e5) {
            c3632c.m11163L(3, e5);
        } catch (Throwable unused) {
        }
        map.put("carrier_name", networkOperatorName);
        try {
            TelephonyManager telephonyManager2 = this.f77440g;
            upperCase = (telephonyManager2 == null || telephonyManager2.getNetworkCountryIso().isEmpty()) ? null : this.f77440g.getNetworkCountryIso().toUpperCase();
        } catch (Exception e13) {
            c3632c.m11163L(3, e13);
        } catch (Throwable unused2) {
        }
        map.put("carrier_country", upperCase);
        try {
            C3632c c3632c2 = f77437l;
            if (Build.VERSION.SDK_INT > 28) {
                deviceId = null;
            } else if (this.f77440g == null) {
                c3632c2.m11157F(6, "Failed to get TelephonyManager");
                deviceId = "";
            } else {
                if (!AbstractC20684o.m56854g(this.f77438e, "android.permission.READ_PHONE_STATE")) {
                    c3632c2.m11157F(5, "There is no granted READ_PHONE_STATE permission");
                } else if (this.f77440g.getDeviceId() != null) {
                    deviceId = this.f77440g.getDeviceId();
                }
                deviceId = null;
            }
        } catch (Exception e14) {
            c3632c.m11163L(3, e14);
        } catch (Throwable unused3) {
        }
        map.put("device_id", deviceId);
        map.put("network_config", AbstractC20664g.m56801d(new C20686p(this, 2)));
        boolean z4 = false;
        try {
            try {
                if (m56872g() || m56871f().booleanValue()) {
                    z4 = true;
                }
            } catch (Throwable unused4) {
                boolValueOf = null;
                map.put("is_on_call", boolValueOf);
                numValueOf = Integer.valueOf(m56873h());
                map.put("sim_slot_count", numValueOf);
                return map;
            }
        } catch (Exception unused5) {
        }
        try {
            boolValueOf = Boolean.valueOf(z4);
        } catch (Exception e15) {
            c3632c.m11163L(3, e15);
            boolValueOf = null;
        }
        map.put("is_on_call", boolValueOf);
        try {
            numValueOf = Integer.valueOf(m56873h());
        } catch (Exception e16) {
            c3632c.m11163L(3, e16);
        } catch (Throwable unused6) {
        }
        map.put("sim_slot_count", numValueOf);
        return map;
    }

    @Override // io.seon.androidsdk.service.InterfaceC20670i
    /* JADX INFO: renamed from: b */
    public final Map mo56775b() {
        String strM56856i;
        String strM56856i2;
        String[] strArrM56877l;
        String[] strArrM56878m;
        String[] strArrM56876k;
        String voiceMailNumber;
        String typeAllocationCode;
        String mmsUAProfUrl;
        String mmsUserAgent;
        Boolean boolValueOf;
        Boolean boolValueOf2;
        Boolean boolValueOf3;
        Boolean boolValueOf4;
        Boolean boolM56871f;
        C3632c c3632c = AbstractC20664g.f77301d;
        HashMap map = new HashMap();
        map.put("is_network_roaming", AbstractC20664g.m56801d(new C20686p(this, 3)));
        String str = null;
        try {
            strM56856i = AbstractC20684o.m56856i(this.f77438e, "gsm.operator.isroaming");
        } catch (Exception e5) {
            c3632c.m11163L(3, e5);
            strM56856i = null;
        } catch (Throwable unused) {
            strM56856i = null;
        }
        map.put("gsm_roaming_state", strM56856i);
        map.put("data_roaming_state", AbstractC20664g.m56801d(new C20686p(this, 8)));
        try {
            strM56856i2 = AbstractC20684o.m56856i(this.f77438e, "ro.com.android.dataroaming");
        } catch (Exception e13) {
            c3632c.m11163L(3, e13);
            strM56856i2 = null;
        } catch (Throwable unused2) {
            strM56856i2 = null;
        }
        map.put("data_roaming_state_prop", strM56856i2);
        map.put("sim_state", AbstractC20664g.m56801d(new C20686p(this, 9)));
        map.put("sim_operator_name", AbstractC20664g.m56801d(new C20686p(this, 10)));
        map.put("sim_operator_country", AbstractC20664g.m56801d(new C20686p(this, 0)));
        map.put("sim_operator_code", AbstractC20664g.m56801d(new C20686p(this, 1)));
        try {
            strArrM56877l = m56877l();
        } catch (Exception e14) {
            c3632c.m11163L(3, e14);
            strArrM56877l = null;
        } catch (Throwable unused3) {
            strArrM56877l = null;
        }
        map.put("sim_specific_carrier_id", strArrM56877l);
        try {
            strArrM56878m = m56878m();
        } catch (Exception e15) {
            c3632c.m11163L(3, e15);
            strArrM56878m = null;
        } catch (Throwable unused4) {
            strArrM56878m = null;
        }
        map.put("sim_specific_carrier_id_name", strArrM56878m);
        map.put("carrier_operator_code", AbstractC20664g.m56801d(new C20686p(this, 4)));
        map.put("line1_number", AbstractC20664g.m56801d(new C20686p(this, 5)));
        try {
            strArrM56876k = m56876k();
        } catch (Exception e16) {
            c3632c.m11163L(3, e16);
            strArrM56876k = null;
        } catch (Throwable unused5) {
            strArrM56876k = null;
        }
        map.put("phone_number", strArrM56876k);
        try {
            voiceMailNumber = (this.f77440g == null || !AbstractC20684o.m56854g(this.f77438e, "android.permission.READ_PHONE_STATE")) ? null : this.f77440g.getVoiceMailNumber();
        } catch (Exception e17) {
            c3632c.m11163L(3, e17);
        } catch (Throwable unused6) {
        }
        map.put("voicemail_number", voiceMailNumber);
        try {
            TelephonyManager telephonyManager = this.f77440g;
            typeAllocationCode = (telephonyManager == null || Build.VERSION.SDK_INT < 29) ? null : telephonyManager.getTypeAllocationCode();
        } catch (Exception e18) {
            c3632c.m11163L(3, e18);
            typeAllocationCode = null;
        } catch (Throwable unused7) {
            typeAllocationCode = null;
        }
        map.put("type_allocation_code", typeAllocationCode);
        try {
            mmsUAProfUrl = (this.f77440g == null || !this.f77439f.hasSystemFeature("android.hardware.telephony.messaging")) ? null : this.f77440g.getMmsUAProfUrl();
        } catch (Exception e19) {
            c3632c.m11163L(3, e19);
        } catch (Throwable unused8) {
        }
        map.put("mms_ua_prof_url", mmsUAProfUrl);
        try {
            mmsUserAgent = (this.f77440g == null || !this.f77439f.hasSystemFeature("android.hardware.telephony.messaging")) ? null : this.f77440g.getMmsUserAgent();
        } catch (Exception e22) {
            c3632c.m11163L(3, e22);
        } catch (Throwable unused9) {
        }
        map.put("mms_user_agent", mmsUserAgent);
        try {
            boolValueOf = (this.f77442i == null || !AbstractC20684o.m56854g(this.f77438e, "android.permission.READ_PHONE_STATE")) ? null : Boolean.valueOf(this.f77442i.isInCall());
        } catch (Exception e24) {
            c3632c.m11163L(3, e24);
        } catch (Throwable unused10) {
        }
        map.put("is_in_call", boolValueOf);
        try {
            boolValueOf2 = (this.f77442i == null || !AbstractC20684o.m56854g(this.f77438e, "android.permission.READ_PHONE_STATE")) ? null : Boolean.valueOf(this.f77442i.isInManagedCall());
        } catch (Exception e25) {
            c3632c.m11163L(3, e25);
        } catch (Throwable unused11) {
        }
        map.put("is_in_managed_call", boolValueOf2);
        map.put("default_sms_package", AbstractC20664g.m56801d(new C20686p(this, 6)));
        try {
            TelephonyManager telephonyManager2 = this.f77440g;
            boolValueOf3 = (telephonyManager2 != null && Build.VERSION.SDK_INT < 35) ? Boolean.valueOf(telephonyManager2.isSmsCapable()) : null;
        } catch (Exception e26) {
            c3632c.m11163L(3, e26);
        } catch (Throwable unused12) {
        }
        map.put("is_sms_capable", boolValueOf3);
        try {
            boolValueOf4 = Boolean.valueOf(m56872g());
        } catch (Exception e27) {
            c3632c.m11163L(3, e27);
            boolValueOf4 = null;
        } catch (Throwable unused13) {
            boolValueOf4 = null;
        }
        map.put("is_on_call_perm", boolValueOf4);
        try {
            boolM56871f = m56871f();
        } catch (Exception e28) {
            c3632c.m11163L(3, e28);
            boolM56871f = null;
        } catch (Throwable unused14) {
            boolM56871f = null;
        }
        map.put("is_call_active_by_audio", boolM56871f);
        try {
            if (this.f77439f.hasSystemFeature("android.hardware.telephony.euicc")) {
                str = this.f77443j.isEnabled() ? "ENABLED" : "DISABLED";
            } else {
                str = "UNSUPPORTED";
            }
        } catch (Throwable unused15) {
        }
        map.put("esim_feature", str);
        map.put("sim_types", AbstractC20664g.m56801d(new C20686p(this, 7)));
        return map;
    }

    @Override // io.seon.androidsdk.service.InterfaceC20670i
    /* JADX INFO: renamed from: c */
    public final void mo56776c(C20663f1 c20663f1) {
        this.f77438e = c20663f1.f77299a;
        this.f77303b = c20663f1;
        AtomicInteger atomicInteger = AbstractC20684o.f77414a;
        try {
            Context context = this.f77438e;
            AtomicInteger atomicInteger2 = AbstractC20684o.f77414a;
            this.f77439f = context.getPackageManager();
        } catch (Throwable unused) {
        }
        TelecomManager telecomManager = null;
        try {
            Context context2 = this.f77438e;
            AtomicInteger atomicInteger3 = AbstractC20684o.f77414a;
            this.f77440g = !context2.getPackageManager().hasSystemFeature("android.hardware.telephony") ? null : (TelephonyManager) context2.getSystemService("phone");
        } catch (Throwable unused2) {
        }
        try {
            Context context3 = this.f77438e;
            AtomicInteger atomicInteger4 = AbstractC20684o.f77414a;
            this.f77441h = (SubscriptionManager) context3.getSystemService("telephony_subscription_service");
        } catch (Throwable unused3) {
        }
        try {
            Context context4 = this.f77438e;
            AtomicInteger atomicInteger5 = AbstractC20684o.f77414a;
            if (context4.getPackageManager().hasSystemFeature("android.software.telecom")) {
                telecomManager = (TelecomManager) context4.getSystemService("telecom");
            }
            this.f77442i = telecomManager;
        } catch (Throwable unused4) {
        }
        try {
            this.f77443j = (EuiccManager) this.f77438e.getSystemService("euicc");
        } catch (Throwable unused5) {
        }
    }

    /* JADX INFO: renamed from: f */
    public final Boolean m56871f() {
        try {
            AudioManager audioManager = (AudioManager) this.f77438e.getSystemService("audio");
            boolean z4 = true;
            boolean z13 = audioManager.getMode() == 2 || (audioManager.getMode() == 3 && !audioManager.isMusicActive());
            if (Build.VERSION.SDK_INT >= 30) {
                if (audioManager.getMode() != 4) {
                    z4 = false;
                }
                z13 |= z4;
            }
            return Boolean.valueOf(z13);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: g */
    public final boolean m56872g() {
        if (!AbstractC20684o.m56854g(this.f77438e, "android.permission.READ_PHONE_STATE")) {
            return false;
        }
        try {
            return ((TelecomManager) this.f77438e.getSystemService("telecom")).isInCall();
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: h */
    public final int m56873h() {
        TelephonyManager telephonyManager = this.f77440g;
        if (telephonyManager == null) {
            return -1;
        }
        try {
            return Build.VERSION.SDK_INT >= 30 ? telephonyManager.getActiveModemCount() : telephonyManager.getPhoneCount();
        } catch (Exception unused) {
            return -1;
        }
    }

    /* JADX INFO: renamed from: i */
    public final String[] m56874i() {
        String str = "DISABLED";
        if (this.f77440g == null || !((AbstractC20684o.m56854g(this.f77438e, "android.permission.ACCESS_NETWORK_STATE") || AbstractC20684o.m56854g(this.f77438e, "android.permission.READ_PHONE_STATE") || AbstractC20684o.m56854g(this.f77438e, "android.permission.READ_BASIC_PHONE_STATE")) && this.f77439f.hasSystemFeature("android.hardware.telephony.data") && Build.VERSION.SDK_INT >= 29)) {
            String strM56856i = AbstractC20684o.m56856i(this.f77438e, "ro.com.android.dataroaming");
            if (Objects.equals(strM56856i, MediaConstraintsFactory.kValueTrue)) {
                str = "ENABLED";
            } else if (!Objects.equals(strM56856i, MediaConstraintsFactory.kValueFalse)) {
                str = "UNKNOWN";
            }
            return new String[]{str};
        }
        try {
            if (this.f77441h == null || !AbstractC20684o.m56854g(this.f77438e, "android.permission.READ_PHONE_STATE")) {
                return new String[]{this.f77440g.isDataRoamingEnabled() ? "ENABLED" : "DISABLED"};
            }
            ArrayList arrayList = new ArrayList();
            Iterator<SubscriptionInfo> it = this.f77441h.getActiveSubscriptionInfoList().iterator();
            while (it.hasNext()) {
                arrayList.add(this.f77440g.createForSubscriptionId(it.next().getSubscriptionId()).isDataRoamingEnabled() ? "ENABLED" : "DISABLED");
            }
            return (String[]) arrayList.toArray(new String[0]);
        } catch (Exception unused) {
            return new String[0];
        }
    }

    /* JADX INFO: renamed from: j */
    public final String m56875j() {
        String defaultSmsPackage;
        try {
            defaultSmsPackage = Telephony.Sms.getDefaultSmsPackage(this.f77438e);
        } catch (Exception e5) {
            AbstractC20684o.m56853f("getDefaultSmsPackage", e5);
            defaultSmsPackage = null;
        }
        if ((defaultSmsPackage != null && !AbstractC17176i.m48519u(defaultSmsPackage)) || Build.VERSION.SDK_INT < 33) {
            return defaultSmsPackage;
        }
        try {
            Intent intent = new Intent("android.intent.action.SENDTO");
            intent.setData(Uri.parse("smsto:"));
            List<ResolveInfo> listQueryIntentActivities = this.f77439f.queryIntentActivities(intent, PackageManager.ResolveInfoFlags.of(65536L));
            return !listQueryIntentActivities.isEmpty() ? listQueryIntentActivities.get(0).activityInfo.packageName : defaultSmsPackage;
        } catch (Exception e13) {
            AbstractC20684o.m56853f("getDefaultSmsPackage", e13);
            return defaultSmsPackage;
        }
    }

    /* JADX INFO: renamed from: k */
    public final String[] m56876k() {
        if (this.f77441h == null || !AbstractC20684o.m56854g(this.f77438e, "android.permission.READ_PHONE_NUMBERS") || Build.VERSION.SDK_INT < 33) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        try {
            Iterator<SubscriptionInfo> it = this.f77441h.getActiveSubscriptionInfoList().iterator();
            while (it.hasNext()) {
                arrayList.add(this.f77441h.getPhoneNumber(it.next().getSubscriptionId()));
            }
        } catch (Exception unused) {
        }
        return (String[]) Collection$EL.toArray(arrayList, new IntFunction() { // from class: io.seon.androidsdk.service.q
            @Override // java.util.function.IntFunction
            public final Object apply(int i13) {
                return new String[i13];
            }
        });
    }

    /* JADX INFO: renamed from: l */
    public final String[] m56877l() {
        if (this.f77440g != null && Build.VERSION.SDK_INT >= 29) {
            try {
                if (this.f77441h == null || !AbstractC20684o.m56854g(this.f77438e, "android.permission.READ_PHONE_STATE")) {
                    return new String[]{String.valueOf(this.f77440g.getSimSpecificCarrierId())};
                }
                ArrayList arrayList = new ArrayList();
                try {
                    Iterator<SubscriptionInfo> it = this.f77441h.getActiveSubscriptionInfoList().iterator();
                    while (it.hasNext()) {
                        arrayList.add(String.valueOf(this.f77440g.createForSubscriptionId(it.next().getSubscriptionId()).getSimSpecificCarrierId()));
                    }
                } catch (Exception unused) {
                }
                return (String[]) arrayList.toArray(new String[0]);
            } catch (Exception unused2) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: m */
    public final String[] m56878m() {
        if (this.f77440g != null && Build.VERSION.SDK_INT >= 29) {
            try {
                if (this.f77441h == null || !AbstractC20684o.m56854g(this.f77438e, "android.permission.READ_PHONE_STATE")) {
                    CharSequence simSpecificCarrierIdName = this.f77440g.getSimSpecificCarrierIdName();
                    return simSpecificCarrierIdName != null ? new String[]{simSpecificCarrierIdName.toString()} : new String[0];
                }
                ArrayList arrayList = new ArrayList();
                Iterator<SubscriptionInfo> it = this.f77441h.getActiveSubscriptionInfoList().iterator();
                while (it.hasNext()) {
                    CharSequence simSpecificCarrierIdName2 = this.f77440g.createForSubscriptionId(it.next().getSubscriptionId()).getSimSpecificCarrierIdName();
                    if (simSpecificCarrierIdName2 != null) {
                        arrayList.add(simSpecificCarrierIdName2.toString());
                    }
                }
                return (String[]) arrayList.toArray(new String[0]);
            } catch (Exception unused) {
            }
        }
        return null;
    }
}
