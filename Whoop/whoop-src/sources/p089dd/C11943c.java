package p089dd;

import bd3.C3130k;
import cd.C4423c;
import cd.C4424d;
import cg.C4548c;
import cg.C4549d;
import cg.C4552g;
import cg.C4555j;
import e73.C12803b;
import hg3.AbstractC17269i;
import id.C18404a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import m83.AbstractC25260n;
import p000.C31931s;
import p003a1.C0106e;
import p048ce.AbstractC4482w;
import p078d1.C11457j;
import p091dg.C12002a;
import p097ds.AbstractC12313p;
import p133f1.C13990x;
import p193hf.C17231h;
import p194hg.C17248i;
import p194hg.C17249j;
import p194hg.C17250k;
import p194hg.C17251l;
import p194hg.InterfaceC17243d;
import p194hg.InterfaceC17253n;
import p219ig.C18458c;
import p219ig.C18459d;
import p219ig.C18460e;
import p251jg.C21652e;
import p251jg.C21653f;
import p251jg.EnumC21664q;
import p326mf.C25483c;
import p326mf.C25490j;
import p326mf.EnumC25498r;
import p365od.C27825d;
import p367of.C27892a;
import p520ud.C34780a;
import p520ud.C34782c;
import p522uf.InterfaceC34885l;
import p550vd.C35899b;
import p551vf.C35937b;
import p619xl.C38445a;
import p647yf.C39498k;
import p715kotlin.jvm.internal.AbstractC22676k;
import re.AbstractC31268f;
import re.AbstractC31309z;
import re.C31254a0;
import re.C31256b;
import re.C31258b1;
import re.C31261c1;
import re.C31267e1;
import re.C31276i0;
import re.C31278j0;
import re.C31282l0;
import re.C31286n0;
import re.C31294r0;
import re.C31298t0;
import re.C31304w0;
import re.C31310z0;
import se.C32413d;
import se.C32414e;
import se.C32415f;
import se.C32418i;
import tg.C33775g;
import tg.InterfaceC33773e;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: dd.c */
/* JADX INFO: loaded from: classes5.dex */
public final class C11943c implements InterfaceC34885l {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f39045a;

    public /* synthetic */ C11943c(int i13) {
        this.f39045a = i13;
    }

    /* JADX INFO: renamed from: b */
    private final C35937b m32256b(C12002a context, Object obj) throws IOException {
        C34780a input = (C34780a) obj;
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(input, "input");
        C35937b c35937b = new C35937b();
        c35937b.f153015w = EnumC25498r.f99841x;
        C3130k c3130k = c35937b.f153016x.f18357z;
        c3130k.getClass();
        c3130k.m8994e("/");
        C39498k c39498k = new C39498k();
        C18459d c18459d = new C18459d(c39498k, "");
        C17248i c17248i = new C17248i(C17251l.f66274e, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C18458c("DurationSeconds")}), 0);
        C17251l c17251l = C17251l.f66278i;
        C17248i c17248i2 = new C17248i(c17251l, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C18458c("ExternalId")}), 0);
        C17248i c17248i3 = new C17248i(c17251l, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C18458c("Policy")}), 0);
        C17251l c17251l2 = C17251l.f66275f;
        C17248i c17248i4 = new C17248i(c17251l2, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C18458c("PolicyArns")}), 0);
        C17248i c17248i5 = new C17248i(c17251l2, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C18458c("ProvidedContexts")}), 0);
        C17248i c17248i6 = new C17248i(c17251l, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C18458c("RoleArn")}), 0);
        C17248i c17248i7 = new C17248i(c17251l, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C18458c("RoleSessionName")}), 0);
        C17248i c17248i8 = new C17248i(c17251l, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C18458c("SerialNumber")}), 0);
        C17248i c17248i9 = new C17248i(c17251l, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C18458c("SourceIdentity")}), 0);
        C17248i c17248i10 = new C17248i(c17251l2, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C18458c("Tags")}), 0);
        C17248i c17248i11 = new C17248i(c17251l, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C18458c("TokenCode")}), 0);
        C17248i c17248i12 = new C17248i(c17251l2, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C18458c("TransitiveTagKeys")}), 0);
        C38445a c38445a = new C38445a(13);
        C18458c c18458c = new C18458c("AssumeRoleRequest");
        LinkedHashSet linkedHashSet = (LinkedHashSet) c38445a.f164637y;
        linkedHashSet.add(c18458c);
        linkedHashSet.add(new C18460e("Action", "AssumeRole"));
        linkedHashSet.add(new C18460e("Version", "2011-06-15"));
        c38445a.m123180p(c17248i);
        c38445a.m123180p(c17248i2);
        c38445a.m123180p(c17248i3);
        c38445a.m123180p(c17248i4);
        c38445a.m123180p(c17248i5);
        c38445a.m123180p(c17248i6);
        c38445a.m123180p(c17248i7);
        c38445a.m123180p(c17248i8);
        c38445a.m123180p(c17248i9);
        c38445a.m123180p(c17248i10);
        c38445a.m123180p(c17248i11);
        c38445a.m123180p(c17248i12);
        InterfaceC17253n interfaceC17253nMo48823e = c18459d.mo48823e(new C17249j(c38445a));
        Integer num = input.f146454a;
        if (num != null) {
            C11457j c11457j = (C11457j) interfaceC17253nMo48823e;
            c11457j.m30738H(c17248i, new C13990x(c11457j, num.intValue(), 1));
        }
        String str = input.f146455b;
        if (str != null) {
            ((C11457j) interfaceC17253nMo48823e).mo30739a(c17248i2, str);
        }
        if (input.f146456c != null) {
            ((C11457j) interfaceC17253nMo48823e).m30732B(c17248i4, new C35899b(input, 1));
        }
        String str2 = input.f146457d;
        if (str2 != null) {
            ((C11457j) interfaceC17253nMo48823e).mo30739a(c17248i6, str2);
        }
        String str3 = input.f146458e;
        if (str3 != null) {
            ((C11457j) interfaceC17253nMo48823e).mo30739a(c17248i7, str3);
        }
        if (input.f146459f != null) {
            ((C11457j) interfaceC17253nMo48823e).m30732B(c17248i10, new C35899b(input, 0));
        }
        c35937b.f153018z = new C27892a(c39498k.mo126149n());
        c35937b.f153017y.m382P("application/x-www-form-urlencoded");
        return c35937b;
    }

    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, java.util.Map] */
    @Override // p522uf.InterfaceC34885l
    /* JADX INFO: renamed from: a */
    public final C35937b mo32257a(C12002a context, Object obj) throws IOException {
        switch (this.f39045a) {
            case 0:
                C4423c input = (C4423c) obj;
                AbstractC22676k.m65750j(context, "context");
                AbstractC22676k.m65750j(input, "input");
                C35937b c35937b = new C35937b();
                c35937b.f153015w = EnumC25498r.f99841x;
                C3130k c3130k = c35937b.f153016x.f18357z;
                c3130k.getClass();
                c3130k.m8994e("/v1/token");
                C4424d c4424d = input.f17891a;
                if (c4424d != null) {
                    C21653f c21653f = new C21653f();
                    C17251l c17251l = C17251l.f66278i;
                    C17248i c17248i = new C17248i(c17251l, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C21652e("clientId")}), 0);
                    C17248i c17248i2 = new C17248i(c17251l, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C21652e("code")}), 0);
                    C17248i c17248i3 = new C17248i(c17251l, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C21652e("codeVerifier")}), 0);
                    C17248i c17248i4 = new C17248i(c17251l, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C21652e("grantType")}), 0);
                    C17248i c17248i5 = new C17248i(c17251l, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C21652e("redirectUri")}), 0);
                    C17248i c17248i6 = new C17248i(c17251l, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C21652e("refreshToken")}), 0);
                    ArrayList arrayList = new ArrayList();
                    new LinkedHashSet();
                    c17248i.f66267b = arrayList.size();
                    arrayList.add(c17248i);
                    c17248i2.f66267b = arrayList.size();
                    arrayList.add(c17248i2);
                    c17248i3.f66267b = arrayList.size();
                    arrayList.add(c17248i3);
                    c17248i4.f66267b = arrayList.size();
                    arrayList.add(c17248i4);
                    c17248i5.f66267b = arrayList.size();
                    arrayList.add(c17248i5);
                    c17248i6.f66267b = arrayList.size();
                    arrayList.add(c17248i6);
                    C12803b c12803b = c21653f.f83167w;
                    c12803b.m35863f();
                    c21653f.mo30739a(c17248i, c4424d.f17892a);
                    c21653f.mo30739a(c17248i4, c4424d.f17893b);
                    String str = c4424d.f17894c;
                    if (str != null) {
                        c21653f.mo30739a(c17248i6, str);
                    }
                    c21653f.mo30746o();
                    c35937b.f153018z = new C27892a(c12803b.m35869l());
                }
                boolean z4 = c35937b.f153018z instanceof C25490j;
                C25483c c25483c = c35937b.f153017y;
                if (!z4) {
                    c25483c.m382P("application/json");
                }
                if (c4424d == null) {
                    c35937b.f153018z = new C27892a(AbstractC39421y.m125919D("{}"));
                    c25483c.m382P("application/json");
                }
                return c35937b;
            case 1:
                C18404a input2 = (C18404a) obj;
                AbstractC22676k.m65750j(context, "context");
                AbstractC22676k.m65750j(input2, "input");
                C35937b c35937b2 = new C35937b();
                c35937b2.f153015w = EnumC25498r.f99840w;
                C4555j c4555j = c35937b2.f153016x;
                C3130k c3130k2 = c4555j.f18357z;
                c3130k2.getClass();
                c3130k2.m8994e("/federation/credentials");
                C4552g c4552g = c4555j.f18351E;
                C33775g encoding = C33775g.f141363m;
                c4552g.getClass();
                AbstractC22676k.m65750j(encoding, "encoding");
                C17231h decodedParameters = encoding.equals(C33775g.f141360j) ? c4552g.f18345y : AbstractC17269i.m48916t(c4552g, C4548c.f18339w, new C0106e(1, encoding, InterfaceC33773e.class, "encodableFromDecoded", "encodableFromDecoded(Ljava/lang/String;)Laws/smithy/kotlin/runtime/text/encoding/Encodable;", 0, 17), C4549d.f18340w, new C0106e(1, encoding, InterfaceC33773e.class, "encodableFromDecoded", "encodableFromDecoded(Ljava/lang/String;)Laws/smithy/kotlin/runtime/text/encoding/Encodable;", 0, 18));
                AbstractC22676k.m65750j(decodedParameters, "$this$decodedParameters");
                String str2 = input2.f71589b;
                if (str2 != null) {
                    decodedParameters.m48738a("account_id", str2);
                }
                String str3 = input2.f71590c;
                if (str3 != null) {
                    decodedParameters.m48738a("role_name", str3);
                }
                String str4 = input2.f71588a;
                if (str4 != null) {
                    c35937b2.f153017y.m386f(str4, "x-amz-sso_bearer_token");
                }
                return c35937b2;
            case 2:
                C27825d input3 = (C27825d) obj;
                AbstractC22676k.m65750j(context, "context");
                AbstractC22676k.m65750j(input3, "input");
                C35937b c35937b3 = new C35937b();
                c35937b3.f153015w = EnumC25498r.f99841x;
                C3130k c3130k3 = c35937b3.f153016x.f18357z;
                c3130k3.getClass();
                c3130k3.m8994e("/token");
                C21653f c21653f2 = new C21653f();
                C17251l c17251l2 = C17251l.f66278i;
                C17248i c17248i7 = new C17248i(c17251l2, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C21652e("clientId")}), 0);
                C17248i c17248i8 = new C17248i(c17251l2, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C21652e("clientSecret")}), 0);
                C17248i c17248i9 = new C17248i(c17251l2, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C21652e("code")}), 0);
                C17248i c17248i10 = new C17248i(c17251l2, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C21652e("codeVerifier")}), 0);
                C17248i c17248i11 = new C17248i(c17251l2, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C21652e("deviceCode")}), 0);
                C17248i c17248i12 = new C17248i(c17251l2, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C21652e("grantType")}), 0);
                C17248i c17248i13 = new C17248i(c17251l2, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C21652e("redirectUri")}), 0);
                C17248i c17248i14 = new C17248i(c17251l2, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C21652e("refreshToken")}), 0);
                C17248i c17248i15 = new C17248i(C17251l.f66275f, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C21652e("scope")}), 0);
                C38445a c38445a = new C38445a(13);
                c38445a.m123180p(c17248i7);
                c38445a.m123180p(c17248i8);
                c38445a.m123180p(c17248i9);
                c38445a.m123180p(c17248i10);
                c38445a.m123180p(c17248i11);
                c38445a.m123180p(c17248i12);
                c38445a.m123180p(c17248i13);
                c38445a.m123180p(c17248i14);
                c38445a.m123180p(c17248i15);
                LinkedHashSet traits = (LinkedHashSet) c38445a.f164637y;
                AbstractC22676k.m65750j(traits, "traits");
                C12803b c12803b2 = c21653f2.f83167w;
                c12803b2.m35863f();
                String str5 = input3.f112082a;
                if (str5 != null) {
                    c21653f2.mo30739a(c17248i7, str5);
                }
                String str6 = input3.f112083b;
                if (str6 != null) {
                    c21653f2.mo30739a(c17248i8, str6);
                }
                String str7 = input3.f112084c;
                if (str7 != null) {
                    c21653f2.mo30739a(c17248i12, str7);
                }
                String str8 = input3.f112085d;
                if (str8 != null) {
                    c21653f2.mo30739a(c17248i14, str8);
                }
                c21653f2.mo30746o();
                c35937b3.f153018z = new C27892a(c12803b2.m35869l());
                c35937b3.f153017y.m382P("application/json");
                return c35937b3;
            case 3:
                C31254a0 input4 = (C31254a0) obj;
                AbstractC22676k.m65750j(context, "context");
                AbstractC22676k.m65750j(input4, "input");
                C35937b c35937b4 = new C35937b();
                c35937b4.f153015w = EnumC25498r.f99841x;
                C3130k c3130k4 = c35937b4.f153016x.f18357z;
                c3130k4.getClass();
                c3130k4.m8994e("/");
                C21653f c21653f3 = new C21653f();
                C17251l c17251l3 = C17251l.f66278i;
                C17248i c17248i16 = new C17248i(c17251l3, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C21652e("AccessToken")}), 0);
                C17248i c17248i17 = new C17248i(c17251l3, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C21652e("PreviousPassword")}), 0);
                C17248i c17248i18 = new C17248i(c17251l3, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C21652e("ProposedPassword")}), 0);
                ArrayList arrayList2 = new ArrayList();
                new LinkedHashSet();
                c17248i16.f66267b = arrayList2.size();
                arrayList2.add(c17248i16);
                c17248i17.f66267b = arrayList2.size();
                arrayList2.add(c17248i17);
                c17248i18.f66267b = arrayList2.size();
                arrayList2.add(c17248i18);
                C12803b c12803b3 = c21653f3.f83167w;
                c12803b3.m35863f();
                String str9 = input4.f128758a;
                if (str9 != null) {
                    c21653f3.mo30739a(c17248i16, str9);
                }
                String str10 = input4.f128759b;
                if (str10 != null) {
                    c21653f3.mo30739a(c17248i17, str10);
                }
                String str11 = input4.f128760c;
                if (str11 != null) {
                    c21653f3.mo30739a(c17248i18, str11);
                }
                c21653f3.mo30746o();
                c35937b4.f153018z = new C27892a(c12803b3.m35869l());
                c35937b4.f153017y.m382P("application/x-amz-json-1.1");
                return c35937b4;
            case 4:
                C31278j0 input5 = (C31278j0) obj;
                AbstractC22676k.m65750j(context, "context");
                AbstractC22676k.m65750j(input5, "input");
                C35937b c35937b5 = new C35937b();
                c35937b5.f153015w = EnumC25498r.f99841x;
                C3130k c3130k5 = c35937b5.f153016x.f18357z;
                c3130k5.getClass();
                c3130k5.m8994e("/");
                C21653f c21653f4 = new C21653f();
                C17251l c17251l4 = C17251l.f66278i;
                C17248i c17248i19 = new C17248i(c17251l4, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C21652e("AccessToken")}), 0);
                C17248i c17248i20 = new C17248i(c17251l4, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C21652e("AttributeName")}), 0);
                C17248i c17248i21 = new C17248i(C17251l.f66277h, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C21652e("ClientMetadata")}), 0);
                ArrayList arrayList3 = new ArrayList();
                new LinkedHashSet();
                c17248i19.f66267b = arrayList3.size();
                arrayList3.add(c17248i19);
                c17248i20.f66267b = arrayList3.size();
                arrayList3.add(c17248i20);
                c17248i21.f66267b = arrayList3.size();
                arrayList3.add(c17248i21);
                C12803b c12803b4 = c21653f4.f83167w;
                c12803b4.m35863f();
                String str12 = input5.f128803a;
                if (str12 != null) {
                    c21653f4.mo30739a(c17248i19, str12);
                }
                String str13 = input5.f128804b;
                if (str13 != null) {
                    c21653f4.mo30739a(c17248i20, str13);
                }
                c21653f4.mo30746o();
                c35937b5.f153018z = new C27892a(c12803b4.m35869l());
                c35937b5.f153017y.m382P("application/x-amz-json-1.1");
                return c35937b5;
            case 5:
                C31282l0 input6 = (C31282l0) obj;
                AbstractC22676k.m65750j(context, "context");
                AbstractC22676k.m65750j(input6, "input");
                C35937b c35937b6 = new C35937b();
                c35937b6.f153015w = EnumC25498r.f99841x;
                C3130k c3130k6 = c35937b6.f153016x.f18357z;
                c3130k6.getClass();
                c3130k6.m8994e("/");
                C21653f c21653f5 = new C21653f();
                C17248i c17248i22 = new C17248i(C17251l.f66278i, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C21652e("AccessToken")}), 0);
                ArrayList arrayList4 = new ArrayList();
                new LinkedHashSet();
                c17248i22.f66267b = arrayList4.size();
                arrayList4.add(c17248i22);
                C12803b c12803b5 = c21653f5.f83167w;
                c12803b5.m35863f();
                String str14 = input6.f128808a;
                if (str14 != null) {
                    c21653f5.mo30739a(c17248i22, str14);
                }
                c21653f5.mo30746o();
                c35937b6.f153018z = new C27892a(c12803b5.m35869l());
                c35937b6.f153017y.m382P("application/x-amz-json-1.1");
                return c35937b6;
            case 6:
                C31286n0 input7 = (C31286n0) obj;
                AbstractC22676k.m65750j(context, "context");
                AbstractC22676k.m65750j(input7, "input");
                Map map = input7.f128819d;
                Map map2 = input7.f128817b;
                C35937b c35937b7 = new C35937b();
                c35937b7.f153015w = EnumC25498r.f99841x;
                C3130k c3130k7 = c35937b7.f153016x.f18357z;
                c3130k7.getClass();
                c3130k7.m8994e("/");
                C21653f c21653f6 = new C21653f();
                C17251l c17251l5 = C17251l.f66279j;
                C17248i c17248i23 = new C17248i(c17251l5, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C21652e("AnalyticsMetadata")}), 0);
                C17248i c17248i24 = new C17248i(C17251l.f66273d, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C21652e("AuthFlow")}), 0);
                C17251l c17251l6 = C17251l.f66277h;
                C17248i c17248i25 = new C17248i(c17251l6, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C21652e("AuthParameters")}), 0);
                C17251l c17251l7 = C17251l.f66278i;
                C17248i c17248i26 = new C17248i(c17251l7, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C21652e("ClientId")}), 0);
                C17248i c17248i27 = new C17248i(c17251l6, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C21652e("ClientMetadata")}), 0);
                C17248i c17248i28 = new C17248i(c17251l7, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C21652e("Session")}), 0);
                C17248i c17248i29 = new C17248i(c17251l5, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C21652e("UserContextData")}), 0);
                ArrayList arrayList5 = new ArrayList();
                new LinkedHashSet();
                c17248i23.f66267b = arrayList5.size();
                arrayList5.add(c17248i23);
                c17248i24.f66267b = arrayList5.size();
                arrayList5.add(c17248i24);
                c17248i25.f66267b = arrayList5.size();
                arrayList5.add(c17248i25);
                c17248i26.f66267b = arrayList5.size();
                arrayList5.add(c17248i26);
                c17248i27.f66267b = arrayList5.size();
                arrayList5.add(c17248i27);
                c17248i28.f66267b = arrayList5.size();
                arrayList5.add(c17248i28);
                c17248i29.f66267b = arrayList5.size();
                arrayList5.add(c17248i29);
                C12803b c12803b6 = c21653f6.f83167w;
                c12803b6.m35863f();
                AbstractC31268f abstractC31268f = input7.f128816a;
                if (abstractC31268f != null) {
                    c21653f6.mo30739a(c17248i24, abstractC31268f.mo96283a());
                }
                if (map2 != null) {
                    c12803b6.m35874q(AbstractC4482w.m13980P(c17248i25));
                    c12803b6.m35863f();
                    for (Map.Entry entry : map2.entrySet()) {
                        c21653f6.mo48821p((String) entry.getKey(), (String) entry.getValue());
                    }
                    c12803b6.m35868k();
                }
                String str15 = input7.f128818c;
                if (str15 != null) {
                    c21653f6.mo30739a(c17248i26, str15);
                }
                if (map != null) {
                    c12803b6.m35874q(AbstractC4482w.m13980P(c17248i27));
                    c12803b6.m35863f();
                    for (Map.Entry entry2 : map.entrySet()) {
                        c21653f6.mo48821p((String) entry2.getKey(), (String) entry2.getValue());
                    }
                    c12803b6.m35868k();
                }
                c21653f6.mo30746o();
                c35937b7.f153018z = new C27892a(c12803b6.m35869l());
                c35937b7.f153017y.m382P("application/x-amz-json-1.1");
                return c35937b7;
            case 7:
                C31294r0 input8 = (C31294r0) obj;
                AbstractC22676k.m65750j(context, "context");
                AbstractC22676k.m65750j(input8, "input");
                ?? r10 = input8.f128834b;
                C35937b c35937b8 = new C35937b();
                c35937b8.f153015w = EnumC25498r.f99841x;
                C3130k c3130k8 = c35937b8.f153016x.f18357z;
                c3130k8.getClass();
                c3130k8.m8994e("/");
                C21653f c21653f7 = new C21653f();
                C17251l c17251l8 = C17251l.f66279j;
                C17248i c17248i30 = new C17248i(c17251l8, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C21652e("AnalyticsMetadata")}), 0);
                C17248i c17248i31 = new C17248i(C17251l.f66273d, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C21652e("ChallengeName")}), 0);
                C17251l c17251l9 = C17251l.f66277h;
                C17248i c17248i32 = new C17248i(c17251l9, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C21652e("ChallengeResponses")}), 0);
                C17251l c17251l10 = C17251l.f66278i;
                C17248i c17248i33 = new C17248i(c17251l10, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C21652e("ClientId")}), 0);
                C17248i c17248i34 = new C17248i(c17251l9, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C21652e("ClientMetadata")}), 0);
                C17248i c17248i35 = new C17248i(c17251l10, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C21652e("Session")}), 0);
                C17248i c17248i36 = new C17248i(c17251l8, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C21652e("UserContextData")}), 0);
                ArrayList arrayList6 = new ArrayList();
                new LinkedHashSet();
                c17248i30.f66267b = arrayList6.size();
                arrayList6.add(c17248i30);
                c17248i31.f66267b = arrayList6.size();
                arrayList6.add(c17248i31);
                c17248i32.f66267b = arrayList6.size();
                arrayList6.add(c17248i32);
                c17248i33.f66267b = arrayList6.size();
                arrayList6.add(c17248i33);
                c17248i34.f66267b = arrayList6.size();
                arrayList6.add(c17248i34);
                c17248i35.f66267b = arrayList6.size();
                arrayList6.add(c17248i35);
                c17248i36.f66267b = arrayList6.size();
                arrayList6.add(c17248i36);
                C12803b c12803b7 = c21653f7.f83167w;
                c12803b7.m35863f();
                AbstractC31309z abstractC31309z = input8.f128833a;
                if (abstractC31309z != null) {
                    c21653f7.mo30739a(c17248i31, abstractC31309z.mo96296a());
                }
                if (r10 != 0) {
                    c12803b7.m35874q(AbstractC4482w.m13980P(c17248i32));
                    c12803b7.m35863f();
                    for (Map.Entry entry3 : r10.entrySet()) {
                        c21653f7.mo48821p((String) entry3.getKey(), (String) entry3.getValue());
                    }
                    c12803b7.m35868k();
                }
                String str16 = input8.f128835c;
                if (str16 != null) {
                    c21653f7.mo30739a(c17248i33, str16);
                }
                String str17 = input8.f128836d;
                if (str17 != null) {
                    c21653f7.mo30739a(c17248i35, str17);
                }
                c21653f7.mo30746o();
                c35937b8.f153018z = new C27892a(c12803b7.m35869l());
                c35937b8.f153017y.m382P("application/x-amz-json-1.1");
                return c35937b8;
            case 8:
                C31298t0 input9 = (C31298t0) obj;
                AbstractC22676k.m65750j(context, "context");
                AbstractC22676k.m65750j(input9, "input");
                C35937b c35937b9 = new C35937b();
                c35937b9.f153015w = EnumC25498r.f99841x;
                C3130k c3130k9 = c35937b9.f153016x.f18357z;
                c3130k9.getClass();
                c3130k9.m8994e("/");
                C21653f c21653f8 = new C21653f();
                C17251l c17251l11 = C17251l.f66278i;
                C17248i c17248i37 = new C17248i(c17251l11, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C21652e("ClientId")}), 0);
                C17248i c17248i38 = new C17248i(c17251l11, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C21652e("ClientSecret")}), 0);
                C17248i c17248i39 = new C17248i(c17251l11, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C21652e("Token")}), 0);
                ArrayList arrayList7 = new ArrayList();
                new LinkedHashSet();
                c17248i37.f66267b = arrayList7.size();
                arrayList7.add(c17248i37);
                c17248i38.f66267b = arrayList7.size();
                arrayList7.add(c17248i38);
                c17248i39.f66267b = arrayList7.size();
                arrayList7.add(c17248i39);
                C12803b c12803b8 = c21653f8.f83167w;
                c12803b8.m35863f();
                String str18 = input9.f128843a;
                if (str18 != null) {
                    c21653f8.mo30739a(c17248i37, str18);
                }
                String str19 = input9.f128844b;
                if (str19 != null) {
                    c21653f8.mo30739a(c17248i39, str19);
                }
                c21653f8.mo30746o();
                c35937b9.f153018z = new C27892a(c12803b8.m35869l());
                c35937b9.f153017y.m382P("application/x-amz-json-1.1");
                return c35937b9;
            case 9:
                C31304w0 input10 = (C31304w0) obj;
                AbstractC22676k.m65750j(context, "context");
                AbstractC22676k.m65750j(input10, "input");
                C35937b c35937b10 = new C35937b();
                c35937b10.f153015w = EnumC25498r.f99841x;
                C3130k c3130k10 = c35937b10.f153016x.f18357z;
                c3130k10.getClass();
                c3130k10.m8994e("/");
                C21653f c21653f9 = new C21653f();
                C17248i c17248i40 = new C17248i(C17251l.f66278i, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C21652e("AccessToken")}), 0);
                C17251l c17251l12 = C17251l.f66279j;
                C17248i c17248i41 = new C17248i(c17251l12, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C21652e("EmailMfaSettings")}), 0);
                C17248i c17248i42 = new C17248i(c17251l12, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C21652e("SMSMfaSettings")}), 0);
                C17248i c17248i43 = new C17248i(c17251l12, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C21652e("SoftwareTokenMfaSettings")}), 0);
                ArrayList arrayList8 = new ArrayList();
                new LinkedHashSet();
                c17248i40.f66267b = arrayList8.size();
                arrayList8.add(c17248i40);
                c17248i41.f66267b = arrayList8.size();
                arrayList8.add(c17248i41);
                c17248i42.f66267b = arrayList8.size();
                arrayList8.add(c17248i42);
                c17248i43.f66267b = arrayList8.size();
                arrayList8.add(c17248i43);
                C12803b c12803b9 = c21653f9.f83167w;
                c12803b9.m35863f();
                String str20 = input10.f128852a;
                if (str20 != null) {
                    c21653f9.mo30739a(c17248i40, str20);
                }
                C31276i0 c31276i0 = input10.f128853b;
                if (c31276i0 != null) {
                    AbstractC12313p.m34251C(c21653f9, c17248i41, c31276i0, C32413d.f134172w);
                }
                C31310z0 c31310z0 = input10.f128854c;
                if (c31310z0 != null) {
                    AbstractC12313p.m34251C(c21653f9, c17248i42, c31310z0, C32414e.f134173w);
                }
                C31258b1 c31258b1 = input10.f128855d;
                if (c31258b1 != null) {
                    AbstractC12313p.m34251C(c21653f9, c17248i43, c31258b1, C32415f.f134174w);
                }
                c21653f9.mo30746o();
                c35937b10.f153018z = new C27892a(c12803b9.m35869l());
                c35937b10.f153017y.m382P("application/x-amz-json-1.1");
                return c35937b10;
            case 10:
                C31261c1 input11 = (C31261c1) obj;
                AbstractC22676k.m65750j(context, "context");
                AbstractC22676k.m65750j(input11, "input");
                List list = input11.f128774b;
                C35937b c35937b11 = new C35937b();
                c35937b11.f153015w = EnumC25498r.f99841x;
                C3130k c3130k11 = c35937b11.f153016x.f18357z;
                c3130k11.getClass();
                c3130k11.m8994e("/");
                C21653f c21653f10 = new C21653f();
                C17248i c17248i44 = new C17248i(C17251l.f66278i, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C21652e("AccessToken")}), 0);
                C17248i c17248i45 = new C17248i(C17251l.f66277h, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C21652e("ClientMetadata")}), 0);
                C17248i c17248i46 = new C17248i(C17251l.f66275f, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C21652e("UserAttributes")}), 0);
                ArrayList arrayList9 = new ArrayList();
                new LinkedHashSet();
                c17248i44.f66267b = arrayList9.size();
                arrayList9.add(c17248i44);
                c17248i45.f66267b = arrayList9.size();
                arrayList9.add(c17248i45);
                c17248i46.f66267b = arrayList9.size();
                arrayList9.add(c17248i46);
                C12803b c12803b10 = c21653f10.f83167w;
                c12803b10.m35863f();
                String str21 = input11.f128773a;
                if (str21 != null) {
                    c21653f10.mo30739a(c17248i44, str21);
                }
                if (list != null) {
                    c12803b10.m35874q(AbstractC4482w.m13980P(c17248i46));
                    EnumC21664q enumC21664q = EnumC21664q.f83182x;
                    c12803b10.m35867j("[");
                    if (c12803b10.f43824b) {
                        ((StringBuilder) c12803b10.f43827e).append('\n');
                    }
                    c12803b10.f43826d++;
                    ArrayList arrayList10 = (ArrayList) c12803b10.f43825c;
                    AbstractC22676k.m65750j(arrayList10, "<this>");
                    arrayList10.add(enumC21664q);
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        c21653f10.mo48822j(new C17250k((C31256b) it.next(), C32418i.f134175w));
                    }
                    c12803b10.m35865h("]", enumC21664q, EnumC21664q.f83183y);
                }
                c21653f10.mo30746o();
                c35937b11.f153018z = new C27892a(c12803b10.m35869l());
                c35937b11.f153017y.m382P("application/x-amz-json-1.1");
                return c35937b11;
            case 11:
                C31267e1 input12 = (C31267e1) obj;
                AbstractC22676k.m65750j(context, "context");
                AbstractC22676k.m65750j(input12, "input");
                C35937b c35937b12 = new C35937b();
                c35937b12.f153015w = EnumC25498r.f99841x;
                C3130k c3130k12 = c35937b12.f153016x.f18357z;
                c3130k12.getClass();
                c3130k12.m8994e("/");
                C21653f c21653f11 = new C21653f();
                C17251l c17251l13 = C17251l.f66278i;
                C17248i c17248i47 = new C17248i(c17251l13, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C21652e("AccessToken")}), 0);
                C17248i c17248i48 = new C17248i(c17251l13, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C21652e("AttributeName")}), 0);
                C17248i c17248i49 = new C17248i(c17251l13, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C21652e("Code")}), 0);
                ArrayList arrayList11 = new ArrayList();
                new LinkedHashSet();
                c17248i47.f66267b = arrayList11.size();
                arrayList11.add(c17248i47);
                c17248i48.f66267b = arrayList11.size();
                arrayList11.add(c17248i48);
                c17248i49.f66267b = arrayList11.size();
                arrayList11.add(c17248i49);
                C12803b c12803b11 = c21653f11.f83167w;
                c12803b11.m35863f();
                String str22 = input12.f128780a;
                if (str22 != null) {
                    c21653f11.mo30739a(c17248i47, str22);
                }
                String str23 = input12.f128781b;
                if (str23 != null) {
                    c21653f11.mo30739a(c17248i48, str23);
                }
                String str24 = input12.f128782c;
                if (str24 != null) {
                    c21653f11.mo30739a(c17248i49, str24);
                }
                c21653f11.mo30746o();
                c35937b12.f153018z = new C27892a(c12803b11.m35869l());
                c35937b12.f153017y.m382P("application/x-amz-json-1.1");
                return c35937b12;
            case 12:
                return m32256b(context, obj);
            default:
                C34782c input13 = (C34782c) obj;
                AbstractC22676k.m65750j(context, "context");
                AbstractC22676k.m65750j(input13, "input");
                C35937b c35937b13 = new C35937b();
                c35937b13.f153015w = EnumC25498r.f99841x;
                C3130k c3130k13 = c35937b13.f153016x.f18357z;
                c3130k13.getClass();
                c3130k13.m8994e("/");
                C39498k c39498k = new C39498k();
                C18459d c18459d = new C18459d(c39498k, "");
                C17248i c17248i50 = new C17248i(C17251l.f66274e, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C18458c("DurationSeconds")}), 0);
                C17251l c17251l14 = C17251l.f66278i;
                C17248i c17248i51 = new C17248i(c17251l14, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C18458c("Policy")}), 0);
                C17248i c17248i52 = new C17248i(C17251l.f66275f, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C18458c("PolicyArns")}), 0);
                C17248i c17248i53 = new C17248i(c17251l14, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C18458c("ProviderId")}), 0);
                C17248i c17248i54 = new C17248i(c17251l14, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C18458c("RoleArn")}), 0);
                C17248i c17248i55 = new C17248i(c17251l14, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C18458c("RoleSessionName")}), 0);
                C17248i c17248i56 = new C17248i(c17251l14, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C18458c("WebIdentityToken")}), 0);
                C38445a c38445a2 = new C38445a(13);
                C18458c c18458c = new C18458c("AssumeRoleWithWebIdentityRequest");
                LinkedHashSet linkedHashSet = (LinkedHashSet) c38445a2.f164637y;
                linkedHashSet.add(c18458c);
                linkedHashSet.add(new C18460e("Action", "AssumeRoleWithWebIdentity"));
                linkedHashSet.add(new C18460e("Version", "2011-06-15"));
                c38445a2.m123180p(c17248i50);
                c38445a2.m123180p(c17248i51);
                c38445a2.m123180p(c17248i52);
                c38445a2.m123180p(c17248i53);
                c38445a2.m123180p(c17248i54);
                c38445a2.m123180p(c17248i55);
                c38445a2.m123180p(c17248i56);
                InterfaceC17253n interfaceC17253nMo48823e = c18459d.mo48823e(new C17249j(c38445a2));
                Integer num = input13.f146464a;
                if (num != null) {
                    C11457j c11457j = (C11457j) interfaceC17253nMo48823e;
                    c11457j.m30738H(c17248i50, new C13990x(c11457j, num.intValue(), 1));
                }
                if (input13.f146465b != null) {
                    ((C11457j) interfaceC17253nMo48823e).m30732B(c17248i52, new C31931s(input13, 25));
                }
                String str25 = input13.f146466c;
                if (str25 != null) {
                    ((C11457j) interfaceC17253nMo48823e).mo30739a(c17248i54, str25);
                }
                String str26 = input13.f146467d;
                if (str26 != null) {
                    ((C11457j) interfaceC17253nMo48823e).mo30739a(c17248i55, str26);
                }
                String str27 = input13.f146468e;
                if (str27 != null) {
                    ((C11457j) interfaceC17253nMo48823e).mo30739a(c17248i56, str27);
                }
                c35937b13.f153018z = new C27892a(c39498k.mo126149n());
                c35937b13.f153017y.m382P("application/x-www-form-urlencoded");
                return c35937b13;
        }
    }
}
