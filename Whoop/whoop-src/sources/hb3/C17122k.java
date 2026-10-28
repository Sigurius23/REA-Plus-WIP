package hb3;

import java.util.List;
import jb3.InterfaceC21550j;
import p715kotlin.jvm.internal.AbstractC22676k;
import r93.InterfaceC31135k;
import sa3.AbstractC32327a;
import sa3.C32334h;
import sa3.C32336j;
import sa3.InterfaceC32332f;

/* JADX INFO: renamed from: hb3.k */
/* JADX INFO: loaded from: classes5.dex */
public final class C17122k {

    /* JADX INFO: renamed from: a */
    public final C17119i f65760a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC32332f f65761b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC31135k f65762c;

    /* JADX INFO: renamed from: d */
    public final C32334h f65763d;

    /* JADX INFO: renamed from: e */
    public final C32336j f65764e;

    /* JADX INFO: renamed from: f */
    public final AbstractC32327a f65765f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC21550j f65766g;

    /* JADX INFO: renamed from: h */
    public final C17118h0 f65767h;

    /* JADX INFO: renamed from: i */
    public final C17135x f65768i;

    public C17122k(C17119i c17119i, InterfaceC32332f nameResolver, InterfaceC31135k containingDeclaration, C32334h c32334h, C32336j versionRequirementTable, AbstractC32327a metadataVersion, InterfaceC21550j interfaceC21550j, C17118h0 c17118h0, List typeParameters) {
        String strMo60582j;
        AbstractC22676k.m65750j(nameResolver, "nameResolver");
        AbstractC22676k.m65750j(containingDeclaration, "containingDeclaration");
        AbstractC22676k.m65750j(versionRequirementTable, "versionRequirementTable");
        AbstractC22676k.m65750j(metadataVersion, "metadataVersion");
        AbstractC22676k.m65750j(typeParameters, "typeParameters");
        this.f65760a = c17119i;
        this.f65761b = nameResolver;
        this.f65762c = containingDeclaration;
        this.f65763d = c32334h;
        this.f65764e = versionRequirementTable;
        this.f65765f = metadataVersion;
        this.f65766g = interfaceC21550j;
        this.f65767h = new C17118h0(this, c17118h0, typeParameters, "Deserializer for \"" + containingDeclaration.getName() + '\"', (interfaceC21550j == null || (strMo60582j = interfaceC21550j.mo60582j()) == null) ? "[container not found]" : strMo60582j);
        this.f65768i = new C17135x(this);
    }

    /* JADX INFO: renamed from: a */
    public final C17122k m48372a(InterfaceC31135k interfaceC31135k, List typeParameterProtos, InterfaceC32332f nameResolver, C32334h c32334h, C32336j versionRequirementTable, AbstractC32327a metadataVersion) {
        AbstractC22676k.m65750j(typeParameterProtos, "typeParameterProtos");
        AbstractC22676k.m65750j(nameResolver, "nameResolver");
        AbstractC22676k.m65750j(versionRequirementTable, "versionRequirementTable");
        AbstractC22676k.m65750j(metadataVersion, "metadataVersion");
        int i13 = metadataVersion.f133780b;
        if ((i13 != 1 || metadataVersion.f133781c < 4) && i13 <= 1) {
            versionRequirementTable = this.f65764e;
        }
        return new C17122k(this.f65760a, nameResolver, interfaceC31135k, c32334h, versionRequirementTable, metadataVersion, this.f65766g, this.f65767h, typeParameterProtos);
    }
}
