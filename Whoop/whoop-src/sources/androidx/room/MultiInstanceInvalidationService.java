package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import java.util.LinkedHashMap;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Landroidx/room/MultiInstanceInvalidationService;", "Landroid/app/Service;", "<init>", "()V", "room-runtime"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
public final class MultiInstanceInvalidationService extends Service {

    /* JADX INFO: renamed from: w */
    public int f6945w;

    /* JADX INFO: renamed from: x */
    public final LinkedHashMap f6946x = new LinkedHashMap();

    /* JADX INFO: renamed from: y */
    public final RemoteCallbackListC1779e0 f6947y = new RemoteCallbackListC1779e0(this);

    /* JADX INFO: renamed from: z */
    public final BinderC1775d0 f6948z = new BinderC1775d0(this);

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        AbstractC22676k.m65750j(intent, "intent");
        return this.f6948z;
    }
}
