package androidx.room;

import p500tb.InterfaceC33687a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: androidx.room.g1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1788g1 implements InterfaceC1792h1 {
    private final String identityHash;
    private final String legacyIdentityHash;
    private final int version;

    public AbstractC1788g1(int i13, String identityHash, String legacyIdentityHash) {
        AbstractC22676k.m65750j(identityHash, "identityHash");
        AbstractC22676k.m65750j(legacyIdentityHash, "legacyIdentityHash");
        this.version = i13;
        this.identityHash = identityHash;
        this.legacyIdentityHash = legacyIdentityHash;
    }

    public abstract void createAllTables(InterfaceC33687a interfaceC33687a);

    public abstract void dropAllTables(InterfaceC33687a interfaceC33687a);

    public final String getIdentityHash() {
        return this.identityHash;
    }

    public final String getLegacyIdentityHash() {
        return this.legacyIdentityHash;
    }

    public final int getVersion() {
        return this.version;
    }

    public abstract void onCreate(InterfaceC33687a interfaceC33687a);

    public abstract void onOpen(InterfaceC33687a interfaceC33687a);

    public abstract void onPostMigrate(InterfaceC33687a interfaceC33687a);

    public abstract void onPreMigrate(InterfaceC33687a interfaceC33687a);

    public abstract C1784f1 onValidateSchema(InterfaceC33687a interfaceC33687a);
}
