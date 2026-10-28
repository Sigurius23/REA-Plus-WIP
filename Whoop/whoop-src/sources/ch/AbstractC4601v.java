package ch;

import android.content.Context;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import mh.C25540h;
import mh.C25542j;
import p319m4.AbstractC25012a;
import p341nh.C26711e;
import p341nh.C26714h;
import p341nh.InterfaceC26715i;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p635y2.C39102j;
import p635y2.InterfaceC39105k;
import p636y3.AbstractC39170b;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ch.v */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4601v {

    /* JADX INFO: renamed from: a */
    public static final long f18505a = AbstractC39170b.m124776h(0, 0, 0, 0);

    /* JADX INFO: renamed from: b */
    public static final C26711e f18506b = new C26711e(C26714h.f106216c);

    /* JADX INFO: renamed from: a */
    public static final C4600u m14263a(Function1 function1, Function1 function2) {
        if (function1 == null && function2 == null) {
            return null;
        }
        return new C4600u(function1, 0, function2);
    }

    /* JADX INFO: renamed from: b */
    public static final C25542j m14264b(Object obj, Composer composer) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87152f0(1087186730);
        if (obj instanceof C25542j) {
            C25542j c25542j = (C25542j) obj;
            c28655q.m87173q(false);
            return c25542j;
        }
        Context context = (Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b);
        c28655q.m87152f0(-1245195153);
        boolean zM87153g = c28655q.m87153g(context) | c28655q.m87153g(obj);
        Object objM87133R = c28655q.m87133R();
        if (zM87153g || objM87133R == C28635l.f115821a) {
            C25540h c25540h = new C25540h(context);
            c25540h.f100079c = obj;
            objM87133R = c25540h.m75117a();
            c28655q.m87172p0(objM87133R);
        }
        C25542j c25542j2 = (C25542j) objM87133R;
        c28655q.m87173q(false);
        c28655q.m87173q(false);
        return c25542j2;
    }

    /* JADX INFO: renamed from: c */
    public static final C25542j m14265c(Object obj, InterfaceC39105k interfaceC39105k, Composer composer) {
        InterfaceC26715i interfaceC26715i;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87152f0(1677680258);
        boolean z4 = obj instanceof C25542j;
        if (z4) {
            C25542j c25542j = (C25542j) obj;
            if (c25542j.f100106E.f100066a != null) {
                c28655q.m87173q(false);
                return c25542j;
            }
        }
        c28655q.m87152f0(408306591);
        boolean zM65745e = AbstractC22676k.m65745e(interfaceC39105k, C39102j.f168204f);
        C28676v0 c28676v0 = C28635l.f115821a;
        if (zM65745e) {
            interfaceC26715i = f18506b;
        } else {
            c28655q.m87152f0(408309406);
            Object objM87133R = c28655q.m87133R();
            if (objM87133R == c28676v0) {
                objM87133R = new C4595p();
                c28655q.m87172p0(objM87133R);
            }
            interfaceC26715i = (C4595p) objM87133R;
            c28655q.m87173q(false);
        }
        c28655q.m87173q(false);
        if (z4) {
            c28655q.m87152f0(-227230258);
            C25542j c25542j2 = (C25542j) obj;
            c28655q.m87152f0(408312509);
            boolean zM87153g = c28655q.m87153g(c25542j2) | c28655q.m87153g(interfaceC26715i);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87153g || objM87133R2 == c28676v0) {
                C25540h c25540hM75122a = C25542j.m75122a(c25542j2);
                c25540hM75122a.f100097u = interfaceC26715i;
                c25540hM75122a.f100099w = null;
                c25540hM75122a.f100100x = null;
                c25540hM75122a.f100101y = null;
                objM87133R2 = c25540hM75122a.m75117a();
                c28655q.m87172p0(objM87133R2);
            }
            C25542j c25542j3 = (C25542j) objM87133R2;
            AbstractC25012a.m73392y(c28655q, false, false, false);
            return c25542j3;
        }
        c28655q.m87152f0(-227066702);
        Context context = (Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b);
        c28655q.m87152f0(408319118);
        boolean zM87153g2 = c28655q.m87153g(context) | c28655q.m87153g(obj) | c28655q.m87153g(interfaceC26715i);
        Object objM87133R3 = c28655q.m87133R();
        if (zM87153g2 || objM87133R3 == c28676v0) {
            C25540h c25540h = new C25540h(context);
            c25540h.f100079c = obj;
            c25540h.f100097u = interfaceC26715i;
            c25540h.f100099w = null;
            c25540h.f100100x = null;
            c25540h.f100101y = null;
            objM87133R3 = c25540h.m75117a();
            c28655q.m87172p0(objM87133R3);
        }
        C25542j c25542j4 = (C25542j) objM87133R3;
        AbstractC25012a.m73392y(c28655q, false, false, false);
        return c25542j4;
    }
}
