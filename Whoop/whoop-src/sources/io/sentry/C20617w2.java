package io.sentry;

import io.sentry.featureflags.C20335c;
import io.sentry.featureflags.InterfaceC20334b;
import io.sentry.protocol.C20470c;
import io.sentry.protocol.C20481h0;
import io.sentry.protocol.C20482i;
import io.sentry.protocol.C20496q;
import io.sentry.protocol.C20501v;
import io.sentry.util.C20584f;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import p005a3.C0237p;
import p213i7.C18194g;
import p581we.C37199o;

/* JADX INFO: renamed from: io.sentry.w2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C20617w2 implements InterfaceC20259b1 {

    /* JADX INFO: renamed from: b */
    public static final C20617w2 f77154b = new C20617w2();

    /* JADX INFO: renamed from: a */
    public final C20584f f77155a = new C20584f(new C18194g(14));

    /* JADX INFO: renamed from: g */
    public static C20617w2 m56758g() {
        return f77154b;
    }

    @Override // io.sentry.InterfaceC20259b1
    /* JADX INFO: renamed from: A */
    public final String mo56179A() {
        return null;
    }

    @Override // io.sentry.InterfaceC20259b1
    /* JADX INFO: renamed from: B */
    public final void mo56180B(InterfaceC20432n1 interfaceC20432n1) {
    }

    @Override // io.sentry.InterfaceC20259b1
    /* JADX INFO: renamed from: C */
    public final List mo56181C() {
        return new ArrayList();
    }

    @Override // io.sentry.InterfaceC20259b1
    /* JADX INFO: renamed from: D */
    public final String mo56182D() {
        return null;
    }

    @Override // io.sentry.InterfaceC20259b1
    /* JADX INFO: renamed from: E */
    public final void mo56183E() {
    }

    @Override // io.sentry.InterfaceC20259b1
    /* JADX INFO: renamed from: F */
    public final InterfaceC20334b mo56184F() {
        return C20335c.f76341w;
    }

    @Override // io.sentry.InterfaceC20259b1
    /* JADX INFO: renamed from: G */
    public final C0237p mo56185G() {
        return new C0237p(9);
    }

    @Override // io.sentry.InterfaceC20259b1
    /* JADX INFO: renamed from: H */
    public final void mo56186H(String str) {
    }

    @Override // io.sentry.InterfaceC20259b1
    /* JADX INFO: renamed from: I */
    public final InterfaceC20338g1 mo56187I() {
        return C20044a3.f75194w;
    }

    @Override // io.sentry.InterfaceC20259b1
    /* JADX INFO: renamed from: J */
    public final void mo56188J(Object obj, String str) {
    }

    @Override // io.sentry.InterfaceC20259b1
    /* JADX INFO: renamed from: K */
    public final List mo56189K() {
        return new ArrayList();
    }

    @Override // io.sentry.InterfaceC20259b1
    /* JADX INFO: renamed from: L */
    public final void mo56190L(C20321e5 c20321e5) {
    }

    @Override // io.sentry.InterfaceC20259b1
    /* JADX INFO: renamed from: M */
    public final C0237p mo56191M(InterfaceC20642z3 interfaceC20642z3) {
        return new C0237p(9);
    }

    @Override // io.sentry.InterfaceC20259b1
    /* JADX INFO: renamed from: N */
    public final void mo56192N(InterfaceC20262b4 interfaceC20262b4) {
    }

    @Override // io.sentry.InterfaceC20259b1
    /* JADX INFO: renamed from: O */
    public final void mo56193O(C20501v c20501v) {
    }

    @Override // io.sentry.InterfaceC20259b1
    /* JADX INFO: renamed from: P */
    public final List mo56194P() {
        return new ArrayList();
    }

    @Override // io.sentry.InterfaceC20259b1
    /* JADX INFO: renamed from: a */
    public final Map mo56195a() {
        return new HashMap();
    }

    @Override // io.sentry.InterfaceC20259b1
    /* JADX INFO: renamed from: b */
    public final void mo56196b(String str) {
    }

    @Override // io.sentry.InterfaceC20259b1
    /* JADX INFO: renamed from: c */
    public final void mo56197c(String str, String str2) {
    }

    @Override // io.sentry.InterfaceC20259b1
    public final void clear() {
    }

    @Override // io.sentry.InterfaceC20259b1
    /* JADX INFO: renamed from: clone */
    public final InterfaceC20259b1 m134238clone() {
        return f77154b;
    }

    @Override // io.sentry.InterfaceC20259b1
    /* JADX INFO: renamed from: d */
    public final C20496q mo56198d() {
        return null;
    }

    @Override // io.sentry.InterfaceC20259b1
    /* JADX INFO: renamed from: e */
    public final void mo56199e(C20481h0 c20481h0) {
    }

    @Override // io.sentry.InterfaceC20259b1
    /* JADX INFO: renamed from: f */
    public final InterfaceC20408l1 mo56200f() {
        return null;
    }

    @Override // io.sentry.InterfaceC20259b1
    public final Map getExtras() {
        return new HashMap();
    }

    @Override // io.sentry.InterfaceC20259b1
    public final EnumC20436n5 getLevel() {
        return null;
    }

    @Override // io.sentry.InterfaceC20259b1
    public final C20481h0 getUser() {
        return null;
    }

    @Override // io.sentry.InterfaceC20259b1
    /* JADX INFO: renamed from: i */
    public final void mo56201i(C20315e c20315e, C20337g0 c20337g0) {
    }

    @Override // io.sentry.InterfaceC20259b1
    /* JADX INFO: renamed from: l */
    public final C20513q6 mo56202l() {
        return (C20513q6) this.f77155a.m56714a();
    }

    @Override // io.sentry.InterfaceC20259b1
    /* JADX INFO: renamed from: m */
    public final InterfaceC20432n1 mo56203m() {
        return null;
    }

    @Override // io.sentry.InterfaceC20259b1
    /* JADX INFO: renamed from: o */
    public final C20265b7 mo56204o() {
        return null;
    }

    @Override // io.sentry.InterfaceC20259b1
    /* JADX INFO: renamed from: p */
    public final void mo56205p(Throwable th3, C20314d7 c20314d7, String str) {
    }

    @Override // io.sentry.InterfaceC20259b1
    /* JADX INFO: renamed from: q */
    public final C20265b7 mo56206q() {
        return null;
    }

    @Override // io.sentry.InterfaceC20259b1
    /* JADX INFO: renamed from: r */
    public final C20482i mo56207r() {
        return null;
    }

    @Override // io.sentry.InterfaceC20259b1
    /* JADX INFO: renamed from: s */
    public final C20501v mo56208s() {
        return C20501v.f76802x;
    }

    @Override // io.sentry.InterfaceC20259b1
    /* JADX INFO: renamed from: t */
    public final void mo56209t(C20501v c20501v) {
    }

    @Override // io.sentry.InterfaceC20259b1
    /* JADX INFO: renamed from: u */
    public final C37199o mo56210u() {
        return null;
    }

    @Override // io.sentry.InterfaceC20259b1
    /* JADX INFO: renamed from: v */
    public final Queue mo56211v() {
        return new ArrayDeque();
    }

    @Override // io.sentry.InterfaceC20259b1
    /* JADX INFO: renamed from: w */
    public final C20265b7 mo56212w(InterfaceC20045a4 interfaceC20045a4) {
        return null;
    }

    @Override // io.sentry.InterfaceC20259b1
    /* JADX INFO: renamed from: x */
    public final void mo56213x(C0237p c0237p) {
    }

    @Override // io.sentry.InterfaceC20259b1
    /* JADX INFO: renamed from: y */
    public final List mo56214y() {
        return new ArrayList();
    }

    @Override // io.sentry.InterfaceC20259b1
    /* JADX INFO: renamed from: z */
    public final C20470c mo56215z() {
        return new C20470c();
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final Object m134241clone() {
        return f77154b;
    }
}
