package p524ui;

import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: ui.v */
/* JADX INFO: loaded from: classes6.dex */
public final class C34994v implements InterfaceC34997y {

    /* JADX INFO: renamed from: a */
    public final String f148051a;

    public /* synthetic */ C34994v(String str) {
        this.f148051a = str;
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ C34994v m110481a(String str) {
        return new C34994v(str);
    }

    /* JADX INFO: renamed from: b */
    public static void m110482b(String jsonString) {
        AbstractC22676k.m65750j(jsonString, "jsonString");
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String m110483c() {
        return this.f148051a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C34994v) {
            return AbstractC22676k.m65745e(this.f148051a, ((C34994v) obj).f148051a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f148051a.hashCode();
    }

    public final String toString() {
        return AbstractC31061c.m95633i(')', "JsonString(jsonString=", this.f148051a);
    }
}
