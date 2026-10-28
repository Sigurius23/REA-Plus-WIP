package com.google.android.gms.location;

import a30.C0332w0;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.location.Location;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.annotation.RecentlyNonNull;
import cd3.C4455g;
import com.google.android.gms.common.api.AbstractC4977h;
import com.google.android.gms.common.api.C4976g;
import com.google.android.gms.common.api.InterfaceC4972c;
import com.google.android.gms.tasks.Task;
import e73.C12803b;
import np.AbstractC27007l;
import np.C27000e;
import np.C27004i;
import np.C27005j;
import np.C27006k;
import p014aj.C0928c;
import p031b9.C2852m1;
import p073cq.AbstractC11032a;
import p073cq.C11040i;
import p073cq.C11048q;
import p249jc.C21567b;
import p309lo.C24560r;
import p408q.C29662f;
import p412q3.C29875i;
import p477s2.AbstractC32076h;
import p478s3.AbstractC32098d;
import p503tp.AbstractC34036g;
import p503tp.AbstractC34037h;
import p503tp.AbstractC34051v;
import p503tp.BinderC34048s;
import p503tp.BinderC34049t;
import p503tp.C34044o;
import p503tp.C34045p;
import p503tp.C34046q;
import p503tp.C34047r;
import p503tp.InterfaceC34050u;
import p529uo.C35110d0;
import q30.C29934u0;
import q30.C29938w0;
import s30.AbstractC32103e;
import se.AbstractC32410a;
import to.AbstractC33993q;
import to.C33981k;
import to.C33985m;

/* JADX INFO: loaded from: classes.dex */
public class FusedLocationProviderClient extends AbstractC4977h {

    @RecentlyNonNull
    public static final String KEY_MOCK_LOCATION = "mockLocation";

    @RecentlyNonNull
    public static final String KEY_VERTICAL_ACCURACY = "verticalAccuracy";

    public FusedLocationProviderClient(@RecentlyNonNull Activity activity) {
        super(activity, AbstractC34037h.f142695a, new C21567b(24));
    }

    private final Task<Void> zze(C27005j c27005j, AbstractC34036g abstractC34036g, Looper looper, InterfaceC34050u interfaceC34050u, int i13) {
        C33981k c33981kM99774g = AbstractC32076h.m99774g(AbstractC32410a.m101043m0(looper), abstractC34036g, AbstractC34036g.class.getSimpleName());
        C34047r c34047r = new C34047r(this, c33981kM99774g);
        C0332w0 c0332w0 = new C0332w0(this, c34047r, abstractC34036g, interfaceC34050u, c27005j, c33981kM99774g, 14);
        C24560r c24560rM107460a = C33985m.m107460a();
        c24560rM107460a.m71619c(c0332w0);
        c24560rM107460a.m71622h(c34047r);
        c24560rM107460a.m71623i(c33981kM99774g);
        c24560rM107460a.m71621g(i13);
        return doRegisterEventListener(c24560rM107460a.m71618b());
    }

    @RecentlyNonNull
    public Task<Void> flushLocations() {
        C12803b c12803bM107465a = AbstractC33993q.m107465a();
        c12803bM107465a.m35870m(C34044o.f142719y);
        c12803bM107465a.m35872o(2422);
        return doWrite(c12803bM107465a.m35864g());
    }

    @RecentlyNonNull
    public Task<Location> getCurrentLocation(int i13, @RecentlyNonNull AbstractC11032a abstractC11032a) {
        LocationRequest locationRequestM15625b = LocationRequest.m15625b();
        locationRequestM15625b.m15630k(i13);
        locationRequestM15625b.m15629i(0L);
        locationRequestM15625b.m15628h(0L);
        locationRequestM15625b.m15627f();
        C27005j c27005jM80988b = C27005j.m80988b(locationRequestM15625b);
        c27005jM80988b.m80991i();
        c27005jM80988b.m80989f();
        C29938w0 c29938w0 = new C29938w0(this, abstractC11032a, c27005jM80988b, 17);
        C12803b c12803bM107465a = AbstractC33993q.m107465a();
        c12803bM107465a.m35870m(c29938w0);
        c12803bM107465a.m35871n(AbstractC34037h.f142698d);
        c12803bM107465a.m35872o(2415);
        Task<Location> taskDoRead = doRead(c12803bM107465a.m35864g());
        if (abstractC11032a == null) {
            return taskDoRead;
        }
        C11040i c11040i = new C11040i(abstractC11032a);
        taskDoRead.continueWithTask(new C11048q(2, c11040i));
        return c11040i.f34644a;
    }

    @RecentlyNonNull
    public Task<Location> getLastLocation() {
        C12803b c12803bM107465a = AbstractC33993q.m107465a();
        c12803bM107465a.m35870m(new C29934u0(this, 28));
        c12803bM107465a.m35872o(2414);
        return doRead(c12803bM107465a.m35864g());
    }

    @RecentlyNonNull
    public Task<LocationAvailability> getLocationAvailability() {
        C12803b c12803bM107465a = AbstractC33993q.m107465a();
        c12803bM107465a.m35870m(C34044o.f142718x);
        c12803bM107465a.m35872o(2416);
        return doRead(c12803bM107465a.m35864g());
    }

    @RecentlyNonNull
    public Task<Void> removeLocationUpdates(@RecentlyNonNull PendingIntent pendingIntent) {
        C12803b c12803bM107465a = AbstractC33993q.m107465a();
        c12803bM107465a.m35870m(new C34045p(0, pendingIntent));
        c12803bM107465a.m35872o(2418);
        return doWrite(c12803bM107465a.m35864g());
    }

    @RecentlyNonNull
    public Task<Void> requestLocationUpdates(@RecentlyNonNull LocationRequest locationRequest, @RecentlyNonNull PendingIntent pendingIntent) {
        C27005j c27005jM80988b = C27005j.m80988b(locationRequest);
        C12803b c12803bM107465a = AbstractC33993q.m107465a();
        c12803bM107465a.m35870m(new C29938w0(this, c27005jM80988b, pendingIntent, 18));
        c12803bM107465a.m35872o(2417);
        return doWrite(c12803bM107465a.m35864g());
    }

    @RecentlyNonNull
    public Task<Void> setMockLocation(@RecentlyNonNull Location location) {
        C12803b c12803bM107465a = AbstractC33993q.m107465a();
        c12803bM107465a.m35870m(new C29934u0(location, 26));
        c12803bM107465a.m35872o(2421);
        return doWrite(c12803bM107465a.m35864g());
    }

    @RecentlyNonNull
    public Task<Void> setMockMode(boolean z4) {
        C12803b c12803bM107465a = AbstractC33993q.m107465a();
        c12803bM107465a.m35870m(new C2852m1(z4, 5));
        c12803bM107465a.m35872o(2420);
        return doWrite(c12803bM107465a.m35864g());
    }

    public final void zza(C27005j c27005j, PendingIntent pendingIntent, C27004i c27004i, C11040i c11040i) throws RemoteException {
        BinderC34048s binderC34048s = new BinderC34048s(1, c11040i);
        c27005j.m80990h(getContextAttributionTag());
        C0928c c0928c = (C0928c) c27004i.f107683A.f17959E;
        ((C27004i) c0928c.f3421x).m111058c();
        c0928c.m2318a0().m80984j0(C27006k.m80992b(c27005j, pendingIntent, binderC34048s));
    }

    public final void zzb(AbstractC34051v abstractC34051v, AbstractC34036g abstractC34036g, InterfaceC34050u interfaceC34050u, C27005j c27005j, C33981k c33981k, C27004i c27004i, C11040i c11040i) throws RemoteException {
        BinderC34049t binderC34049t = new BinderC34049t(c11040i, new C29662f(this, abstractC34051v, abstractC34036g, interfaceC34050u));
        c27005j.m80990h(getContextAttributionTag());
        synchronized (c27004i.f107683A) {
            c27004i.f107683A.m13938L(c27005j, c33981k, binderC34049t);
        }
    }

    public final /* synthetic */ void zzc(AbstractC11032a abstractC11032a, C27005j c27005j, C27004i c27004i, C11040i c11040i) throws RemoteException {
        C34046q c34046q = new C34046q(this, c11040i);
        if (abstractC11032a != null) {
            abstractC11032a.mo29684a(new C29875i(this, c34046q));
        }
        zze(c27005j, c34046q, Looper.getMainLooper(), new C11048q(5, c11040i), 2437).continueWithTask(new C11048q(1, c11040i));
    }

    public final void zzd(C27004i c27004i, C11040i c11040i) throws RemoteException {
        Location location;
        String contextAttributionTag = getContextAttributionTag();
        C4455g c4455g = c27004i.f107683A;
        C35110d0 c35110d0 = c27004i.f148983v;
        if (AbstractC32103e.m99884f(c35110d0 == null ? null : c35110d0.f148989x, AbstractC34037h.f142697c)) {
            C0928c c0928c = (C0928c) c4455g.f17959E;
            ((C27004i) c0928c.f3421x).m111058c();
            C27000e c27000eM2318a0 = c0928c.m2318a0();
            Parcel parcelM80981s = c27000eM2318a0.m80981s();
            parcelM80981s.writeString(contextAttributionTag);
            Parcel parcelM80979X = c27000eM2318a0.m80979X(parcelM80981s, 80);
            location = (Location) AbstractC27007l.m80995b(parcelM80979X, Location.CREATOR);
            parcelM80979X.recycle();
        } else {
            C0928c c0928c2 = (C0928c) c4455g.f17959E;
            ((C27004i) c0928c2.f3421x).m111058c();
            C27000e c27000eM2318a1 = c0928c2.m2318a0();
            Parcel parcelM80979X2 = c27000eM2318a1.m80979X(c27000eM2318a1.m80981s(), 7);
            location = (Location) AbstractC27007l.m80995b(parcelM80979X2, Location.CREATOR);
            parcelM80979X2.recycle();
        }
        c11040i.m29687b(location);
    }

    public FusedLocationProviderClient(@RecentlyNonNull Context context) {
        super(context, null, AbstractC34037h.f142695a, InterfaceC4972c.f20498g, new C4976g(new C21567b(24), Looper.getMainLooper()));
    }

    @RecentlyNonNull
    public Task<Void> removeLocationUpdates(@RecentlyNonNull AbstractC34036g abstractC34036g) {
        return AbstractC32098d.m99853t(doUnregisterEventListener(AbstractC32076h.m99775h(abstractC34036g, AbstractC34036g.class.getSimpleName())));
    }

    @RecentlyNonNull
    public Task<Void> requestLocationUpdates(@RecentlyNonNull LocationRequest locationRequest, @RecentlyNonNull AbstractC34036g abstractC34036g, @RecentlyNonNull Looper looper) {
        return zze(C27005j.m80988b(locationRequest), abstractC34036g, looper, null, 2436);
    }
}
