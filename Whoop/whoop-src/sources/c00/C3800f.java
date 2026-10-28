package c00;

import a30.C0294h;
import al0.C0971f;
import android.content.Context;
import androidx.lifecycle.C1601k1;
import b10.C2222b;
import b20.C2326f;
import bc3.AbstractC3050q0;
import bz.C3710i;
import i20.C17932c0;
import i20.C17946h;
import i20.C17975s;
import j10.C21196a;
import kc3.C22365e;
import kc3.ExecutorC22364d;
import m83.C25235a0;
import ng3.C26701n;
import p442qy.C30765d;
import p442qy.C30766e;
import p599wz.C37708d;
import p631xz.C38721f0;
import p664yy.C39865j;
import p715kotlin.jvm.internal.AbstractC22676k;
import s93.AbstractC32309k;
import tz.C34275b;
import v03.C35518e;
import v03.InterfaceC35517d;
import v03.InterfaceC35521h;
import y30.C39189d;

/* JADX INFO: renamed from: c00.f */
/* JADX INFO: loaded from: classes6.dex */
public final class C3800f implements InterfaceC35517d {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f15548w;

    /* JADX INFO: renamed from: x */
    public final C35518e f15549x;

    /* JADX INFO: renamed from: y */
    public final InterfaceC35521h f15550y;

    public /* synthetic */ C3800f(InterfaceC35521h interfaceC35521h, C35518e c35518e, int i13) {
        this.f15548w = i13;
        this.f15550y = interfaceC35521h;
        this.f15549x = c35518e;
    }

    @Override // k83.InterfaceC22297a
    public final Object get() {
        String str;
        int i13 = this.f15548w;
        int i14 = 1;
        C30765d c30765d = C30766e.f126697b;
        C25235a0 c25235a0 = C25235a0.f99113w;
        C35518e c35518e = this.f15549x;
        InterfaceC35521h interfaceC35521h = this.f15550y;
        switch (i13) {
            case 0:
                C1601k1 savedStateHandle = (C1601k1) interfaceC35521h.get();
                C37708d linkAccountInfo = (C37708d) c35518e.f151137w;
                AbstractC22676k.m65750j(savedStateHandle, "savedStateHandle");
                AbstractC22676k.m65750j(linkAccountInfo, "linkAccountInfo");
                C38721f0 c38721f0 = new C38721f0(savedStateHandle);
                c38721f0.m124147a(linkAccountInfo);
                return c38721f0;
            case 1:
                return new C21196a((C34275b) c35518e.f151137w, (C3710i) interfaceC35521h.get());
            case 2:
                Context context = (Context) interfaceC35521h.get();
                C17946h args = (C17946h) c35518e.f151137w;
                AbstractC22676k.m65750j(context, "context");
                AbstractC22676k.m65750j(args, "args");
                C17975s c17975s = args.f69728x;
                if (c17975s == null || (str = c17975s.f69801G) == null) {
                    return null;
                }
                Context applicationContext = context.getApplicationContext();
                AbstractC22676k.m65749i(applicationContext, "getApplicationContext(...)");
                C22365e c22365e = AbstractC3050q0.f12077a;
                ExecutorC22364d executorC22364d = ExecutorC22364d.f87316w;
                AbstractC32309k.m100574c(executorC22364d);
                return C39189d.m124823b(context, str, new C2326f(new C39865j(c30765d, executorC22364d), new C2222b(applicationContext, c25235a0, new C0971f(applicationContext, i14))));
            default:
                Context context2 = (Context) interfaceC35521h.get();
                C17932c0 args2 = (C17932c0) c35518e.f151137w;
                AbstractC22676k.m65750j(context2, "context");
                AbstractC22676k.m65750j(args2, "args");
                String str2 = args2.f69694y;
                Context applicationContext2 = context2.getApplicationContext();
                AbstractC22676k.m65749i(applicationContext2, "getApplicationContext(...)");
                C22365e c22365e2 = AbstractC3050q0.f12077a;
                ExecutorC22364d executorC22364d2 = ExecutorC22364d.f87316w;
                AbstractC32309k.m100574c(executorC22364d2);
                return C39189d.m124823b(context2, str2, new C2326f(new C39865j(c30765d, executorC22364d2), new C2222b(applicationContext2, c25235a0, new C0971f(applicationContext2, i14))));
        }
    }

    public C3800f(C35518e c35518e, C0294h c0294h) {
        this.f15548w = 1;
        this.f15549x = c35518e;
        this.f15550y = c0294h;
    }

    public C3800f(C26701n c26701n, C35518e c35518e, C35518e c35518e2) {
        this.f15548w = 2;
        this.f15550y = c35518e;
        this.f15549x = c35518e2;
    }
}
