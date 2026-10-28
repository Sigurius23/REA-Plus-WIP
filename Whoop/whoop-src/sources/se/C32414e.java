package se;

import c93.InterfaceC4351m;
import d13.AbstractC11478a;
import l83.C23454a0;
import m83.AbstractC25260n;
import p194hg.C17248i;
import p194hg.C17249j;
import p194hg.C17251l;
import p194hg.InterfaceC17243d;
import p194hg.InterfaceC17252m;
import p194hg.InterfaceC17253n;
import p251jg.C21652e;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22672i;
import re.C31310z0;

/* JADX INFO: renamed from: se.e */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C32414e extends C22672i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public static final C32414e f134173w = new C32414e(2, AbstractC32416g.class, "serializeSmsMfaSettingsTypeDocument", "serializeSmsMfaSettingsTypeDocument(Laws/smithy/kotlin/runtime/serde/Serializer;Laws/sdk/kotlin/services/cognitoidentityprovider/model/SmsMfaSettingsType;)V", 1);

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC17252m p13 = (InterfaceC17252m) obj;
        C31310z0 p14 = (C31310z0) obj2;
        AbstractC22676k.m65750j(p13, "p0");
        AbstractC22676k.m65750j(p14, "p1");
        C17251l c17251l = C17251l.f66272c;
        C17248i c17248i = new C17248i(c17251l, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C21652e("Enabled")}), 0);
        C17248i c17248i2 = new C17248i(c17251l, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C21652e("PreferredMfa")}), 0);
        InterfaceC17253n interfaceC17253nMo48823e = p13.mo48823e(new C17249j(AbstractC11478a.m30864p(c17248i, c17248i2)));
        interfaceC17253nMo48823e.mo30748r(c17248i, p14.f128861a);
        interfaceC17253nMo48823e.mo30748r(c17248i2, p14.f128862b);
        interfaceC17253nMo48823e.mo30746o();
        return C23454a0.f92919a;
    }
}
