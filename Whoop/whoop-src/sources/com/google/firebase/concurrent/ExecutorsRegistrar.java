package com.google.firebase.concurrent;

import android.annotation.SuppressLint;
import com.google.firebase.components.ComponentRegistrar;
import gt.C16162a;
import gt.C16163b;
import gt.C16167f;
import gt.C16173l;
import gt.C16177p;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import p155ft.InterfaceC14761a;
import p155ft.InterfaceC14762b;
import p155ft.InterfaceC14763c;
import p155ft.InterfaceC14764d;
import p184h5.C16893m1;
import p505ts.AbstractC34132o;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"ThreadPoolCreation"})
public class ExecutorsRegistrar implements ComponentRegistrar {

    /* JADX INFO: renamed from: a */
    public static final C16173l f21605a = new C16173l(new C16167f(2));

    /* JADX INFO: renamed from: b */
    public static final C16173l f21606b = new C16173l(new C16167f(3));

    /* JADX INFO: renamed from: c */
    public static final C16173l f21607c = new C16173l(new C16167f(4));

    /* JADX INFO: renamed from: d */
    public static final C16173l f21608d = new C16173l(new C16167f(5));

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        C16177p c16177p = new C16177p(InterfaceC14761a.class, ScheduledExecutorService.class);
        C16177p[] c16177pArr = {new C16177p(InterfaceC14761a.class, ExecutorService.class), new C16177p(InterfaceC14761a.class, Executor.class)};
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(c16177p);
        for (C16177p c16177p2 : c16177pArr) {
            AbstractC34132o.m107884h(c16177p2, "Null interface");
        }
        Collections.addAll(hashSet, c16177pArr);
        C16163b c16163b = new C16163b(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new C16893m1(25), hashSet3);
        C16177p c16177p3 = new C16177p(InterfaceC14762b.class, ScheduledExecutorService.class);
        C16177p[] c16177pArr2 = {new C16177p(InterfaceC14762b.class, ExecutorService.class), new C16177p(InterfaceC14762b.class, Executor.class)};
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        HashSet hashSet6 = new HashSet();
        hashSet4.add(c16177p3);
        for (C16177p c16177p4 : c16177pArr2) {
            AbstractC34132o.m107884h(c16177p4, "Null interface");
        }
        Collections.addAll(hashSet4, c16177pArr2);
        C16163b c16163b2 = new C16163b(null, new HashSet(hashSet4), new HashSet(hashSet5), 0, 0, new C16893m1(26), hashSet6);
        C16177p c16177p5 = new C16177p(InterfaceC14763c.class, ScheduledExecutorService.class);
        C16177p[] c16177pArr3 = {new C16177p(InterfaceC14763c.class, ExecutorService.class), new C16177p(InterfaceC14763c.class, Executor.class)};
        HashSet hashSet7 = new HashSet();
        HashSet hashSet8 = new HashSet();
        HashSet hashSet9 = new HashSet();
        hashSet7.add(c16177p5);
        for (C16177p c16177p6 : c16177pArr3) {
            AbstractC34132o.m107884h(c16177p6, "Null interface");
        }
        Collections.addAll(hashSet7, c16177pArr3);
        C16163b c16163b3 = new C16163b(null, new HashSet(hashSet7), new HashSet(hashSet8), 0, 0, new C16893m1(27), hashSet9);
        C16162a c16162aM45707a = C16163b.m45707a(new C16177p(InterfaceC14764d.class, Executor.class));
        c16162aM45707a.f61426f = new C16893m1(28);
        return Arrays.asList(c16163b, c16163b2, c16163b3, c16162aM45707a.m45706b());
    }
}
