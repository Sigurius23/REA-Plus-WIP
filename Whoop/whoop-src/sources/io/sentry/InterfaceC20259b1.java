package io.sentry;

import io.sentry.featureflags.InterfaceC20334b;
import io.sentry.protocol.C20470c;
import io.sentry.protocol.C20481h0;
import io.sentry.protocol.C20482i;
import io.sentry.protocol.C20496q;
import io.sentry.protocol.C20501v;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import p005a3.C0237p;
import p581we.C37199o;

/* JADX INFO: renamed from: io.sentry.b1 */
/* JADX INFO: loaded from: classes5.dex */
public interface InterfaceC20259b1 {
    /* JADX INFO: renamed from: A */
    String mo56179A();

    /* JADX INFO: renamed from: B */
    void mo56180B(InterfaceC20432n1 interfaceC20432n1);

    /* JADX INFO: renamed from: C */
    List mo56181C();

    /* JADX INFO: renamed from: D */
    String mo56182D();

    /* JADX INFO: renamed from: E */
    void mo56183E();

    /* JADX INFO: renamed from: F */
    InterfaceC20334b mo56184F();

    /* JADX INFO: renamed from: G */
    C0237p mo56185G();

    /* JADX INFO: renamed from: H */
    void mo56186H(String str);

    /* JADX INFO: renamed from: I */
    InterfaceC20338g1 mo56187I();

    /* JADX INFO: renamed from: J */
    void mo56188J(Object obj, String str);

    /* JADX INFO: renamed from: K */
    List mo56189K();

    /* JADX INFO: renamed from: L */
    void mo56190L(C20321e5 c20321e5);

    /* JADX INFO: renamed from: M */
    C0237p mo56191M(InterfaceC20642z3 interfaceC20642z3);

    /* JADX INFO: renamed from: N */
    void mo56192N(InterfaceC20262b4 interfaceC20262b4);

    /* JADX INFO: renamed from: O */
    void mo56193O(C20501v c20501v);

    /* JADX INFO: renamed from: P */
    List mo56194P();

    /* JADX INFO: renamed from: a */
    Map mo56195a();

    /* JADX INFO: renamed from: b */
    void mo56196b(String str);

    /* JADX INFO: renamed from: c */
    void mo56197c(String str, String str2);

    void clear();

    InterfaceC20259b1 clone();

    /* JADX INFO: renamed from: d */
    C20496q mo56198d();

    /* JADX INFO: renamed from: e */
    void mo56199e(C20481h0 c20481h0);

    /* JADX INFO: renamed from: f */
    InterfaceC20408l1 mo56200f();

    Map getExtras();

    EnumC20436n5 getLevel();

    C20481h0 getUser();

    /* JADX INFO: renamed from: i */
    void mo56201i(C20315e c20315e, C20337g0 c20337g0);

    /* JADX INFO: renamed from: l */
    C20513q6 mo56202l();

    /* JADX INFO: renamed from: m */
    InterfaceC20432n1 mo56203m();

    /* JADX INFO: renamed from: o */
    C20265b7 mo56204o();

    /* JADX INFO: renamed from: p */
    void mo56205p(Throwable th3, C20314d7 c20314d7, String str);

    /* JADX INFO: renamed from: q */
    C20265b7 mo56206q();

    /* JADX INFO: renamed from: r */
    C20482i mo56207r();

    /* JADX INFO: renamed from: s */
    C20501v mo56208s();

    /* JADX INFO: renamed from: t */
    void mo56209t(C20501v c20501v);

    /* JADX INFO: renamed from: u */
    C37199o mo56210u();

    /* JADX INFO: renamed from: v */
    Queue mo56211v();

    /* JADX INFO: renamed from: w */
    C20265b7 mo56212w(InterfaceC20045a4 interfaceC20045a4);

    /* JADX INFO: renamed from: x */
    void mo56213x(C0237p c0237p);

    /* JADX INFO: renamed from: y */
    List mo56214y();

    /* JADX INFO: renamed from: z */
    C20470c mo56215z();
}
