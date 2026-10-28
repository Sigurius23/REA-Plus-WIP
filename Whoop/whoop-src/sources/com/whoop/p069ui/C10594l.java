package com.whoop.p069ui;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import xg3.InterfaceC38293t;

/* JADX INFO: renamed from: com.whoop.ui.l */
/* JADX INFO: loaded from: classes4.dex */
public class C10594l {

    /* JADX INFO: renamed from: a */
    private final Set<InterfaceC38293t> f32193a = new HashSet();

    /* JADX INFO: renamed from: a */
    public void m27330a(InterfaceC38293t interfaceC38293t) {
        synchronized (this.f32193a) {
            this.f32193a.add(interfaceC38293t);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m27331b() {
        synchronized (this.f32193a) {
            try {
                Iterator<InterfaceC38293t> it = this.f32193a.iterator();
                while (it.hasNext()) {
                    it.next().mo14750b();
                }
                this.f32193a.clear();
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
