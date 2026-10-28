package com.mapbox.common.location;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.mapbox.common.MapboxCommonLogger;
import com.mapbox.common.MapboxSDKCommonInitializer;
import d93.InterfaceC11820a;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import p644yb.C39376a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import xb3.AbstractC38176k;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000b2\u00020\u0001:\u0002\f\u000bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\r"}, m65681d2 = {"Lcom/mapbox/common/location/LocationUpdatesReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "Ll83/a0;", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "Companion", "CircularArray", "common_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
public final class LocationUpdatesReceiver extends BroadcastReceiver {
    public static final String ACTION_PROCESS_LOCATION_UPDATES = "com.mapbox.common.location.action.PROCESS_LOCATION_UPDATES";
    public static final String LOCATION_PROVIDER_ID_KEY = "com.mapbox.common.location.DeviceLocationProvider.ID";
    private static final String TAG = "LUReceiver";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final ConcurrentHashMap<Integer, CircularArray<Intent>> pendingIntents = new ConcurrentHashMap<>();
    private static final ConcurrentHashMap<Integer, WeakReference<BaseDeviceLocationProvider>> backgroundDeviceLocationProviders = new ConcurrentHashMap<>();

    @Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u001c\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\r\b\u0001\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\r\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014R \u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00158\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u0012\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001a\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001c\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010!\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b \u0010\u001e¨\u0006\""}, m65681d2 = {"Lcom/mapbox/common/location/LocationUpdatesReceiver$CircularArray;", "", "T", "", "", "capacity", "<init>", "(I)V", "item", "Ll83/a0;", "add", "(Ljava/lang/Object;)V", "index", "get", "(I)Ljava/lang/Object;", "", "toList", "()Ljava/util/List;", "", "iterator", "()Ljava/util/Iterator;", "", "arr", "[Ljava/lang/Object;", "getArr$annotations", "()V", "currentSize", "I", "tail", "getHead", "()I", "head", "getSize", "size", "common_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
    public static final class CircularArray<T> implements Iterable<T>, InterfaceC11820a {
        private final T[] arr;
        private int currentSize;
        private int tail = -1;

        public CircularArray(int i13) {
            this.arr = (T[]) new Object[i13];
        }

        private static /* synthetic */ void getArr$annotations() {
        }

        private final int getHead() {
            int i13 = this.currentSize;
            if (i13 == this.arr.length) {
                return (this.tail + 1) % i13;
            }
            return 0;
        }

        public final void add(T item) {
            AbstractC22676k.m65750j(item, "item");
            int i13 = this.tail + 1;
            T[] tArr = this.arr;
            int length = i13 % tArr.length;
            this.tail = length;
            tArr[length] = item;
            int i14 = this.currentSize;
            if (i14 < tArr.length) {
                this.currentSize = i14 + 1;
            }
        }

        public final T get(int index) {
            int i13 = this.currentSize;
            if (i13 == 0 || index >= i13 || index < 0) {
                throw new IndexOutOfBoundsException(String.valueOf(index));
            }
            T[] tArr = this.arr;
            T t14 = i13 == tArr.length ? tArr[(getHead() + index) % this.arr.length] : tArr[index];
            AbstractC22676k.m65748h(t14, "null cannot be cast to non-null type T of com.mapbox.common.location.LocationUpdatesReceiver.CircularArray");
            return t14;
        }

        /* JADX INFO: renamed from: getSize, reason: from getter */
        public final int getCurrentSize() {
            return this.currentSize;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return new LocationUpdatesReceiver$CircularArray$iterator$1(this);
        }

        public final List<T> toList() {
            return AbstractC38176k.m122276E(AbstractC38176k.m122278n(iterator()));
        }
    }

    @Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000f8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u000f8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R&\u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00150\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R&\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00180\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0017¨\u0006\u001b"}, m65681d2 = {"Lcom/mapbox/common/location/LocationUpdatesReceiver$Companion;", "", "<init>", "()V", "", "persistentId", "Lcom/mapbox/common/location/BaseDeviceLocationProvider;", "locationProvider", "Ll83/a0;", "addDeviceLocationProvider$common_release", "(ILcom/mapbox/common/location/BaseDeviceLocationProvider;)V", "addDeviceLocationProvider", "removeDeviceLocationProvider$common_release", "(I)V", "removeDeviceLocationProvider", "", "ACTION_PROCESS_LOCATION_UPDATES", "Ljava/lang/String;", "LOCATION_PROVIDER_ID_KEY", "TAG", "Ljava/util/concurrent/ConcurrentHashMap;", "Ljava/lang/ref/WeakReference;", "backgroundDeviceLocationProviders", "Ljava/util/concurrent/ConcurrentHashMap;", "Lcom/mapbox/common/location/LocationUpdatesReceiver$CircularArray;", "Landroid/content/Intent;", "pendingIntents", "common_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void addDeviceLocationProvider$common_release(int persistentId, BaseDeviceLocationProvider locationProvider) {
            AbstractC22676k.m65750j(locationProvider, "locationProvider");
            LocationUpdatesReceiver.backgroundDeviceLocationProviders.put(Integer.valueOf(persistentId), new WeakReference(locationProvider));
            CircularArray circularArray = (CircularArray) LocationUpdatesReceiver.pendingIntents.remove(Integer.valueOf(persistentId));
            if (circularArray != null) {
                Iterator it = circularArray.toList().iterator();
                while (it.hasNext()) {
                    List<Location> listExtractResult = locationProvider.extractResult((Intent) it.next());
                    if (!listExtractResult.isEmpty()) {
                        locationProvider.notifyLocationUpdate(listExtractResult);
                    }
                }
            }
        }

        public final void removeDeviceLocationProvider$common_release(int persistentId) {
            LocationUpdatesReceiver.backgroundDeviceLocationProviders.remove(Integer.valueOf(persistentId));
        }

        private Companion() {
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        CircularArray<Intent> circularArrayPutIfAbsent;
        AbstractC22676k.m65750j(context, "context");
        if (intent == null || !AbstractC22676k.m65745e(intent.getAction(), ACTION_PROCESS_LOCATION_UPDATES)) {
            return;
        }
        C39376a.m125585c(context).m125588d(MapboxSDKCommonInitializer.class);
        if (!intent.hasExtra(LOCATION_PROVIDER_ID_KEY)) {
            try {
                MapboxCommonLogger.INSTANCE.logW$common_release(TAG, "Missing location provider persistent id");
                return;
            } catch (Throwable unused) {
                Log.w(TAG, "Missing location provider persistent id");
                return;
            }
        }
        int intExtra = intent.getIntExtra(LOCATION_PROVIDER_ID_KEY, 0);
        WeakReference<BaseDeviceLocationProvider> weakReference = backgroundDeviceLocationProviders.get(Integer.valueOf(intExtra));
        if (weakReference != null) {
            BaseDeviceLocationProvider baseDeviceLocationProvider = weakReference.get();
            if (baseDeviceLocationProvider != null) {
                List<Location> listExtractResult = baseDeviceLocationProvider.extractResult(intent);
                if (listExtractResult.isEmpty()) {
                    return;
                }
                baseDeviceLocationProvider.notifyLocationUpdate(listExtractResult);
                return;
            }
            return;
        }
        ConcurrentHashMap<Integer, CircularArray<Intent>> concurrentHashMap = pendingIntents;
        Integer numValueOf = Integer.valueOf(intExtra);
        CircularArray<Intent> circularArray = concurrentHashMap.get(numValueOf);
        if (circularArray == null && (circularArrayPutIfAbsent = concurrentHashMap.putIfAbsent(numValueOf, (circularArray = new CircularArray<>(5)))) != null) {
            circularArray = circularArrayPutIfAbsent;
        }
        circularArray.add(intent);
        String str = "DeviceLocationProvider with id " + intExtra + " not found.";
        try {
            MapboxCommonLogger.INSTANCE.logE$common_release(TAG, str);
        } catch (Throwable unused2) {
            Log.e(TAG, str);
        }
    }
}
