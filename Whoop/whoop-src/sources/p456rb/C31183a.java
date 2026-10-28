package p456rb;

import android.os.Bundle;
import androidx.lifecycle.EnumC1635w;
import java.util.LinkedHashMap;
import m83.C25262p;
import p027b3.C2390i3;
import p249jc.C21567b;
import p399pb.InterfaceC29049f;

/* JADX INFO: renamed from: rb.a */
/* JADX INFO: loaded from: classes.dex */
public final class C31183a {

    /* JADX INFO: renamed from: a */
    public final InterfaceC29049f f128495a;

    /* JADX INFO: renamed from: b */
    public final C25262p f128496b;

    /* JADX INFO: renamed from: e */
    public boolean f128499e;

    /* JADX INFO: renamed from: f */
    public Bundle f128500f;

    /* JADX INFO: renamed from: g */
    public boolean f128501g;

    /* JADX INFO: renamed from: c */
    public final C21567b f128497c = new C21567b(22);

    /* JADX INFO: renamed from: d */
    public final LinkedHashMap f128498d = new LinkedHashMap();

    /* JADX INFO: renamed from: h */
    public boolean f128502h = true;

    public C31183a(InterfaceC29049f interfaceC29049f, C25262p c25262p) {
        this.f128495a = interfaceC29049f;
        this.f128496b = c25262p;
    }

    /* JADX INFO: renamed from: a */
    public final void m95914a() {
        InterfaceC29049f interfaceC29049f = this.f128495a;
        if (interfaceC29049f.getLifecycle().getCurrentState() != EnumC1635w.f6326x) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        if (this.f128499e) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        this.f128496b.invoke();
        interfaceC29049f.getLifecycle().mo4986a(new C2390i3(this, 3));
        this.f128499e = true;
    }
}
