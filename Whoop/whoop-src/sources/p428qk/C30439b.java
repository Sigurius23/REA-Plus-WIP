package p428qk;

import fk.InterfaceC14544a;
import java.io.File;
import p000.AbstractC11266d;
import p249jc.C21565a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: qk.b */
/* JADX INFO: loaded from: classes.dex */
public final class C30439b {

    /* JADX INFO: renamed from: a */
    public final String f125062a;

    /* JADX INFO: renamed from: b */
    public final String f125063b;

    /* JADX INFO: renamed from: c */
    public final C21565a f125064c;

    /* JADX INFO: renamed from: d */
    public final File f125065d;

    /* JADX INFO: renamed from: e */
    public final String f125066e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC14544a f125067f;

    public C30439b(String instanceName, String str, C21565a identityStorageProvider, File file, String fileName, InterfaceC14544a interfaceC14544a) {
        AbstractC22676k.m65750j(instanceName, "instanceName");
        AbstractC22676k.m65750j(identityStorageProvider, "identityStorageProvider");
        AbstractC22676k.m65750j(fileName, "fileName");
        this.f125062a = instanceName;
        this.f125063b = str;
        this.f125064c = identityStorageProvider;
        this.f125065d = file;
        this.f125066e = fileName;
        this.f125067f = interfaceC14544a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30439b)) {
            return false;
        }
        C30439b c30439b = (C30439b) obj;
        return AbstractC22676k.m65745e(this.f125062a, c30439b.f125062a) && AbstractC22676k.m65745e(this.f125063b, c30439b.f125063b) && AbstractC22676k.m65745e(this.f125064c, c30439b.f125064c) && this.f125065d.equals(c30439b.f125065d) && AbstractC22676k.m65745e(this.f125066e, c30439b.f125066e) && AbstractC22676k.m65745e(this.f125067f, c30439b.f125067f);
    }

    public final int hashCode() {
        int iHashCode = this.f125062a.hashCode() * 31;
        String str = this.f125063b;
        int iM30450d = AbstractC11266d.m30450d((this.f125065d.hashCode() + ((this.f125064c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 961)) * 31)) * 31, 31, this.f125066e);
        InterfaceC14544a interfaceC14544a = this.f125067f;
        return iM30450d + (interfaceC14544a != null ? interfaceC14544a.hashCode() : 0);
    }

    public final String toString() {
        return "IdentityConfiguration(instanceName=" + this.f125062a + ", apiKey=" + this.f125063b + ", experimentApiKey=null, identityStorageProvider=" + this.f125064c + ", storageDirectory=" + this.f125065d + ", fileName=" + this.f125066e + ", logger=" + this.f125067f + ')';
    }
}
