package io.sentry;

import hg3.AbstractC17269i;
import io.sentry.transport.C20567q;
import java.io.File;
import p343nk.C26781b;

/* JADX INFO: renamed from: io.sentry.k4 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C20402k4 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC20602v0 f76466a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f76467b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AbstractC20601v f76468c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ File f76469d;

    public /* synthetic */ C20402k4(InterfaceC20602v0 interfaceC20602v0, String str, AbstractC20601v abstractC20601v, File file) {
        this.f76466a = interfaceC20602v0;
        this.f76467b = str;
        this.f76468c = abstractC20601v;
        this.f76469d = file;
    }

    /* JADX INFO: renamed from: a */
    public final void m56614a() {
        File file = this.f76469d;
        EnumC20436n5 enumC20436n5 = EnumC20436n5.DEBUG;
        String str = this.f76467b;
        InterfaceC20602v0 interfaceC20602v0 = this.f76466a;
        interfaceC20602v0.mo16066m(enumC20436n5, "Started processing cached files from %s", str);
        AbstractC20601v abstractC20601v = this.f76468c;
        C20396j7 c20396j7 = abstractC20601v.f77113d;
        InterfaceC20602v0 interfaceC20602v1 = abstractC20601v.f77111b;
        try {
            interfaceC20602v1.mo16066m(enumC20436n5, "Processing dir. %s", file.getAbsolutePath());
            File[] fileArrListFiles = file.listFiles(new C26781b(abstractC20601v, 3));
            if (fileArrListFiles == null) {
                interfaceC20602v1.mo16066m(EnumC20436n5.ERROR, "Cache dir %s is null or is not a directory.", file.getAbsolutePath());
            } else {
                interfaceC20602v1.mo16066m(enumC20436n5, "Processing %d items from cache dir %s", Integer.valueOf(fileArrListFiles.length), file.getAbsolutePath());
                int length = fileArrListFiles.length;
                int i13 = 0;
                int i14 = 0;
                while (i14 < length) {
                    File file2 = fileArrListFiles[i14];
                    if (file2.isFile()) {
                        String absolutePath = file2.getAbsolutePath();
                        if (!c20396j7.contains(absolutePath)) {
                            C20567q c20567qMo56430j = abstractC20601v.f77110a.mo56430j();
                            if (c20567qMo56430j != null && c20567qMo56430j.m56688h(EnumC20418m.All)) {
                                interfaceC20602v1.mo16066m(EnumC20436n5.INFO, "DirectoryProcessor, rate limiting active.", new Object[i13]);
                                break;
                            } else {
                                interfaceC20602v1.mo16066m(EnumC20436n5.DEBUG, "Processing file: %s", absolutePath);
                                abstractC20601v.mo55888b(file2, AbstractC17269i.m48858C(new C20571u(abstractC20601v.f77112c, abstractC20601v.f77111b, absolutePath, c20396j7)));
                                Thread.sleep(100L);
                            }
                        } else {
                            interfaceC20602v1.mo16066m(EnumC20436n5.DEBUG, "File '%s' has already been processed so it will not be processed again.", absolutePath);
                        }
                    } else {
                        interfaceC20602v1.mo16066m(EnumC20436n5.DEBUG, "File %s is not a File.", file2.getAbsolutePath());
                    }
                    i14++;
                    i13 = 0;
                }
            }
        } catch (Throwable th3) {
            interfaceC20602v1.mo16058i(EnumC20436n5.ERROR, th3, "Failed processing '%s'", file.getAbsolutePath());
        }
        interfaceC20602v0.mo16066m(EnumC20436n5.DEBUG, "Finished processing cached files from %s", str);
    }
}
