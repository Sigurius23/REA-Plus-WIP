package a63;

import b83.C2807c;
import e63.C12777f;
import e93.AbstractC12889b;
import f63.C14154b;
import hc3.C17191x;
import io.sentry.hints.C20363j;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import m83.AbstractC25265s;
import o63.C27610a;
import p005a3.C0237p;
import p437qt.C30582e;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r63.C30991c;
import r63.C30995g;
import r63.C30996h;
import v53.C35709c;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: a63.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C0475a implements InterfaceC0500q {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1615a;

    public /* synthetic */ C0475a(int i13) {
        this.f1615a = i13;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:23:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:25:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:27:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:34:0x0111  */
    /* JADX WARN: Code duplicated, block: B:37:0x0137 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:38:0x0138  */
    /* JADX WARN: Code duplicated, block: B:41:0x0151  */
    /* JADX WARN: Code duplicated, block: B:43:0x0154  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0138 -> B:39:0x013d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: c */
    public static final java.lang.Object m1196c(a63.InterfaceC0492i0 r17, e63.C12775d r18, w53.C36845b r19, v53.C35709c r20, s83.AbstractC32269c r21) {
        /*
            Method dump skipped, instruction units count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a63.C0475a.m1196c(a63.i0, e63.d, w53.b, v53.c, s83.c):java.lang.Object");
    }

    @Override // a63.InterfaceC0500q
    /* JADX INFO: renamed from: a */
    public final Object mo1197a(Function1 function1) {
        switch (this.f1615a) {
            case 0:
                return new C0481d();
            case 1:
                C0495l c0495l = new C0495l();
                function1.invoke(c0495l);
                return new C0498o(AbstractC25265s.m74138n1(c0495l.f1668a), AbstractC25265s.m74138n1(c0495l.f1669b), c0495l.f1670c);
            case 2:
                C0237p c0237p = new C0237p(1);
                function1.invoke(c0237p);
                return new C0504u((LinkedHashSet) c0237p.f812x, (LinkedHashMap) c0237p.f813y, (Charset) c0237p.f814z);
            case 3:
                function1.invoke(new C20363j(2));
                return new C0507x();
            case 4:
                return new C0509z();
            default:
                function1.invoke(new C30582e(2));
                return new C0484e0();
        }
    }

    @Override // a63.InterfaceC0500q
    /* JADX INFO: renamed from: b */
    public final void mo1198b(Object obj, C35709c scope) throws C2807c {
        AbstractC12889b abstractC12889b;
        C17191x c17191x;
        int i13 = 3;
        int i14 = 0;
        int i15 = 2;
        int i16 = 1;
        InterfaceC30057d interfaceC30057d = null;
        switch (this.f1615a) {
            case 0:
                AbstractC22676k.m65750j((C0481d) obj, "plugin");
                AbstractC22676k.m65750j(scope, "scope");
                C17191x c17191x2 = new C17191x("ObservableContent", 2);
                C12777f c12777f = scope.f151925E;
                C17191x reference = C12777f.f43725j;
                ArrayList arrayList = c12777f.f127964a;
                AbstractC22676k.m65750j(reference, "reference");
                if (!c12777f.m95532e(c17191x2)) {
                    int iM95531c = c12777f.m95531c(reference);
                    if (iM95531c == -1) {
                        throw new C2807c("Phase " + reference + " was not registered for this pipeline");
                    }
                    int i17 = iM95531c + 1;
                    int iM118951C = AbstractC37056f.m118951C(arrayList);
                    if (i17 <= iM118951C) {
                        while (true) {
                            Object obj2 = arrayList.get(i17);
                            C30991c c30991c = obj2 instanceof C30991c ? (C30991c) obj2 : null;
                            if (c30991c != null && (abstractC12889b = c30991c.f127961b) != null) {
                                C30995g c30995g = abstractC12889b instanceof C30995g ? (C30995g) abstractC12889b : null;
                                if (c30995g != null && (c17191x = c30995g.f127970d) != null && c17191x.equals(reference)) {
                                    iM95531c = i17;
                                }
                                if (i17 != iM118951C) {
                                    i17++;
                                }
                            }
                        }
                    }
                    arrayList.add(iM95531c + 1, new C30991c(c17191x2, new C30995g(reference)));
                }
                c12777f.m95533f(c17191x2, new C0477b(i13, i14, interfaceC30057d));
                scope.f151928H.m95533f(C14154b.f50997i, new C0479c(i13, i14, interfaceC30057d));
                return;
            case 1:
                C0498o plugin = (C0498o) obj;
                AbstractC22676k.m65750j(plugin, "plugin");
                AbstractC22676k.m65750j(scope, "scope");
                scope.f151925E.m95533f(C12777f.f43722g, new C0493j(plugin, interfaceC30057d, i16));
                C17191x c17191x3 = new C17191x("BeforeReceive", 2);
                C14154b c14154b = scope.f151926F;
                C17191x reference2 = C14154b.f50998j;
                c14154b.getClass();
                AbstractC22676k.m65750j(reference2, "reference");
                if (!c14154b.m95532e(c17191x3)) {
                    int iM95531c2 = c14154b.m95531c(reference2);
                    if (iM95531c2 == -1) {
                        throw new C2807c("Phase " + reference2 + " was not registered for this pipeline");
                    }
                    c14154b.f127964a.add(iM95531c2, new C30991c(c17191x3, new C30996h()));
                }
                c14154b.m95533f(c17191x3, new C0493j(plugin, interfaceC30057d, i15));
                C0475a c0475a = C0484e0.f1639b;
                ((C0484e0) AbstractC0501r.m1207a(scope)).f1641a.add(new C0493j(plugin, interfaceC30057d, i13));
                return;
            case 2:
                C0504u plugin2 = (C0504u) obj;
                AbstractC22676k.m65750j(plugin2, "plugin");
                AbstractC22676k.m65750j(scope, "scope");
                scope.f151925E.m95533f(C12777f.f43725j, new C0502s(plugin2, interfaceC30057d, i14));
                scope.f151926F.m95533f(C14154b.f51000l, new C0502s(plugin2, interfaceC30057d, i16));
                return;
            case 3:
                C0507x plugin3 = (C0507x) obj;
                AbstractC22676k.m65750j(plugin3, "plugin");
                AbstractC22676k.m65750j(scope, "scope");
                C0475a c0475a2 = C0484e0.f1639b;
                ((C0484e0) AbstractC0501r.m1207a(scope)).f1641a.add(new C0506w(plugin3, scope, interfaceC30057d, i14));
                return;
            case 4:
                AbstractC22676k.m65750j((C0509z) obj, "plugin");
                AbstractC22676k.m65750j(scope, "scope");
                scope.f151925E.m95533f(C12777f.f43722g, new C0479c(scope, interfaceC30057d, i15));
                return;
            default:
                C0484e0 plugin4 = (C0484e0) obj;
                AbstractC22676k.m65750j(plugin4, "plugin");
                AbstractC22676k.m65750j(scope, "scope");
                scope.f151925E.m95533f(C12777f.f43726k, new C0506w(plugin4, scope, interfaceC30057d, i16));
                return;
        }
    }

    @Override // a63.InterfaceC0500q
    public final C27610a getKey() {
        switch (this.f1615a) {
            case 0:
                return C0481d.f1634b;
            case 1:
                return C0498o.f1680e;
            case 2:
                return C0504u.f1693e;
            case 3:
                return C0507x.f1714b;
            case 4:
                return C0509z.f1718b;
            default:
                return C0484e0.f1640c;
        }
    }
}
