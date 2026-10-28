package io.sentry.android.core;

import android.os.FileObserver;
import hg3.AbstractC17269i;
import ih0.AbstractC18489d0;
import io.sentry.C20337g0;
import io.sentry.C20410l3;
import io.sentry.EnumC20436n5;
import io.sentry.InterfaceC20602v0;
import java.io.File;
import pf.AbstractC29125c;

/* JADX INFO: renamed from: io.sentry.android.core.q0 */
/* JADX INFO: loaded from: classes5.dex */
public final class FileObserverC20148q0 extends FileObserver {

    /* JADX INFO: renamed from: a */
    public final String f75681a;

    /* JADX INFO: renamed from: b */
    public final C20410l3 f75682b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC20602v0 f75683c;

    /* JADX INFO: renamed from: d */
    public final long f75684d;

    public FileObserverC20148q0(String str, C20410l3 c20410l3, InterfaceC20602v0 interfaceC20602v0, long j7) {
        super(str);
        this.f75681a = str;
        this.f75682b = c20410l3;
        AbstractC29125c.m88510S(interfaceC20602v0, "Logger is required.");
        this.f75683c = interfaceC20602v0;
        this.f75684d = j7;
    }

    @Override // android.os.FileObserver
    public final void onEvent(int i13, String str) {
        if (str == null || i13 != 8) {
            return;
        }
        EnumC20436n5 enumC20436n5 = EnumC20436n5.DEBUG;
        Integer numValueOf = Integer.valueOf(i13);
        String str2 = this.f75681a;
        InterfaceC20602v0 interfaceC20602v0 = this.f75683c;
        interfaceC20602v0.mo16066m(enumC20436n5, "onEvent fired for EnvelopeFileObserver with event type %d on path: %s for file %s.", numValueOf, str2, str);
        C20337g0 c20337g0M48858C = AbstractC17269i.m48858C(new C20136p0(this.f75684d, interfaceC20602v0));
        StringBuilder sbM53374o = AbstractC18489d0.m53374o(str2);
        sbM53374o.append(File.separator);
        sbM53374o.append(str);
        String string = sbM53374o.toString();
        C20410l3 c20410l3 = this.f75682b;
        c20410l3.getClass();
        AbstractC29125c.m88510S(string, "Path is required.");
        c20410l3.mo55888b(new File(string), c20337g0M48858C);
    }
}
