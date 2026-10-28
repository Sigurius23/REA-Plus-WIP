package com.mapbox.common.geofencing;

/* JADX INFO: renamed from: com.mapbox.common.geofencing.a */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class RunnableC5421a implements Runnable {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f21915w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ long f21916x;

    public /* synthetic */ RunnableC5421a(long j7, int i13) {
        this.f21915w = i13;
        this.f21916x = j7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f21915w) {
            case 0:
                AddFeatureCallbackNative._init_$lambda$0(this.f21916x);
                break;
            case 1:
                AddObserverCallbackNative._init_$lambda$0(this.f21916x);
                break;
            case 2:
                ClearFeaturesCallbackNative._init_$lambda$0(this.f21916x);
                break;
            case 3:
                ConfigureCallbackNative._init_$lambda$0(this.f21916x);
                break;
            case 4:
                GeofencingUtilsUserConsentResponseCallbackNative._init_$lambda$0(this.f21916x);
                break;
            case 5:
                GetFeatureCallbackNative._init_$lambda$0(this.f21916x);
                break;
            case 6:
                GetOptionsCallbackNative._init_$lambda$0(this.f21916x);
                break;
            case 7:
                RemoveFeatureCallbackNative._init_$lambda$0(this.f21916x);
                break;
            case 8:
                RemoveObserverCallbackNative._init_$lambda$0(this.f21916x);
                break;
            case 9:
                GeofencingFactory.setPeer$lambda$0(this.f21916x);
                break;
            case 10:
                GeofencingObserverNative._init_$lambda$0(this.f21916x);
                break;
            case 11:
                GeofencingServiceNative._init_$lambda$0(this.f21916x);
                break;
            default:
                GeofencingUtils.setPeer$lambda$0(this.f21916x);
                break;
        }
    }
}
