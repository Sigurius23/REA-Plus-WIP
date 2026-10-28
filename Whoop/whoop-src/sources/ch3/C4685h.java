package ch3;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import dc3.C11934s;
import fa3.AbstractC14325r;
import fa3.C14329v;
import fa3.EnumC14304b0;
import fk.InterfaceC14544a;
import java.util.ArrayDeque;
import p073cq.InterfaceC11047p;
import p715kotlin.jvm.internal.AbstractC22676k;
import xg3.InterfaceC38282i;

/* JADX INFO: renamed from: ch3.h */
/* JADX INFO: loaded from: classes5.dex */
public final class C4685h implements InterfaceC38282i {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f19185w;

    /* JADX INFO: renamed from: x */
    public final Object f19186x;

    /* JADX INFO: renamed from: y */
    public boolean f19187y;

    /* JADX INFO: renamed from: z */
    public Object f19188z;

    public C4685h() {
        this.f19185w = 1;
        this.f19186x = new Object();
    }

    /* JADX INFO: renamed from: a */
    public void m14763a(InterfaceC11047p interfaceC11047p) {
        synchronized (this.f19186x) {
            try {
                if (((ArrayDeque) this.f19188z) == null) {
                    this.f19188z = new ArrayDeque();
                }
                ((ArrayDeque) this.f19188z).add(interfaceC11047p);
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void m14764b(Task task) {
        InterfaceC11047p interfaceC11047p;
        synchronized (this.f19186x) {
            if (((ArrayDeque) this.f19188z) != null && !this.f19187y) {
                this.f19187y = true;
                while (true) {
                    synchronized (this.f19186x) {
                        try {
                            interfaceC11047p = (InterfaceC11047p) ((ArrayDeque) this.f19188z).poll();
                            if (interfaceC11047p == null) {
                                this.f19187y = false;
                                return;
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                    interfaceC11047p.mo29695a(task);
                }
            }
        }
    }

    @Override // xg3.InterfaceC38282i
    public void request(long j7) {
        if (this.f19187y || j7 <= 0) {
            return;
        }
        this.f19187y = true;
        C4689j c4689j = (C4689j) this.f19188z;
        c4689j.m14771j(this.f19186x);
        c4689j.m14770i(1L);
    }

    public String toString() {
        switch (this.f19185w) {
            case 3:
                return "JavaTypeEnhancementState(jsr305=" + ((C14329v) this.f19186x) + ", getReportLevelForAnnotation=" + ((C11934s) this.f19188z) + ')';
            default:
                return super.toString();
        }
    }

    public C4685h(C14329v c14329v, C11934s c11934s) {
        this.f19185w = 3;
        this.f19186x = c14329v;
        this.f19188z = c11934s;
        this.f19187y = c14329v.f52303d || c11934s.invoke(AbstractC14325r.f52289a) == EnumC14304b0.IGNORE;
    }

    public C4685h(Context context, InterfaceC14544a logger) {
        this.f19185w = 2;
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(logger, "logger");
        this.f19186x = context;
        this.f19188z = logger;
        boolean z4 = context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0;
        this.f19187y = z4;
        if (z4) {
            return;
        }
        logger.warn("No ACCESS_NETWORK_STATE permission, offline mode is not supported. To enable, add <uses-permission android:name=\"android.permission.ACCESS_NETWORK_STATE\" /> to your AndroidManifest.xml. Learn more at https://www.docs.developers.amplitude.com/data/sdks/android-kotlin/#offline-mode");
    }

    public C4685h(Object obj, C4689j c4689j) {
        this.f19185w = 0;
        this.f19186x = obj;
        this.f19188z = c4689j;
    }
}
