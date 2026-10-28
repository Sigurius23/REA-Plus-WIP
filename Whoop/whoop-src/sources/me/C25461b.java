package me;

import androidx.room.C1832u;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import l83.C23470p;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import ma1.C25371a;
import p147ff.InterfaceC14422a;
import p474s.C31983m2;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import s83.AbstractC32269c;
import vg.C35966m;
import vg.InterfaceC35967n;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: me.b */
/* JADX INFO: loaded from: classes.dex */
public final class C25461b implements Closeable, InterfaceC14422a {

    /* JADX INFO: renamed from: w */
    public final InterfaceC14422a[] f99696w;

    /* JADX INFO: renamed from: x */
    public final C31983m2 f99697x;

    public C25461b(InterfaceC35967n platformProvider, C31983m2 profile, int i13) {
        if ((i13 & 1) != 0) {
            InterfaceC35967n.f153143a.getClass();
            platformProvider = C35966m.f153142b;
        }
        C23470p c23470pM92088H = AbstractC30060g.m92088H(new C25371a(2));
        profile = (i13 & 4) != 0 ? new C31983m2(new C25460a(platformProvider, null)) : profile;
        AbstractC22676k.m65750j(platformProvider, "platformProvider");
        AbstractC22676k.m65750j(profile, "profile");
        this.f99696w = new InterfaceC14422a[]{new C25464e(), new C25462c(platformProvider, 0), new C25462c(profile, 1), new C25463d(c23470pM92088H, platformProvider)};
        this.f99697x = new C31983m2(new C1832u(1, this, C25461b.class, "resolveRegion", "resolveRegion(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 11));
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0063  */
    /* JADX WARN: Code duplicated, block: B:25:0x0077  */
    /* JADX WARN: Code duplicated, block: B:28:0x007c A[Catch: Exception -> 0x0036, TryCatch #0 {Exception -> 0x0036, blocks: (B:12:0x0032, B:26:0x0078, B:28:0x007c, B:29:0x0087, B:23:0x0065), top: B:37:0x0032 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x0087 A[Catch: Exception -> 0x0036, TRY_LEAVE, TryCatch #0 {Exception -> 0x0036, blocks: (B:12:0x0032, B:26:0x0078, B:28:0x007c, B:29:0x0087, B:23:0x0065), top: B:37:0x0032 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0075 -> B:26:0x0078). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: h */
    public static final java.lang.Object m74864h(me.C25461b r9, q83.InterfaceC30057d r10) {
        /*
            r9.getClass()
            boolean r0 = r10 instanceof p147ff.C14423b
            if (r0 == 0) goto L16
            r0 = r10
            ff.b r0 = (p147ff.C14423b) r0
            int r1 = r0.f52599H
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f52599H = r1
            goto L1b
        L16:
            ff.b r0 = new ff.b
            r0.<init>(r9, r10)
        L1b:
            java.lang.Object r10 = r0.f52597F
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.f52599H
            r3 = 1
            if (r2 == 0) goto L40
            if (r2 != r3) goto L38
            int r9 = r0.f52596E
            int r2 = r0.f52603z
            ff.a r4 = r0.f52602y
            java.lang.Object[] r5 = r0.f52601x
            ff.a[] r5 = (p147ff.InterfaceC14422a[]) r5
            og.g r6 = r0.f52600w
            p505ts.AbstractC34132o.m107864I(r10)     // Catch: java.lang.Exception -> L36
            goto L78
        L36:
            r10 = move-exception
            goto L92
        L38:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L40:
            p505ts.AbstractC34132o.m107864I(r10)
            q83.j r10 = r0.getContext()
            java.lang.Class<me.b> r2 = me.C25461b.class
            kotlin.jvm.internal.i0 r4 = p715kotlin.jvm.internal.AbstractC22671h0.f89337a
            j93.d r2 = r4.getOrCreateKotlinClass(r2)
            java.lang.String r2 = r2.getQualifiedName()
            if (r2 == 0) goto L9f
            gm.r r10 = p550vd.AbstractC35903f.m113984B(r10, r2)
            ff.a[] r9 = r9.f99696w
            int r2 = r9.length
            r4 = 0
            r5 = r9
            r6 = r10
            r9 = r2
            r2 = r4
        L61:
            if (r2 >= r9) goto L9d
            r4 = r5[r2]
            r0.f52600w = r6     // Catch: java.lang.Exception -> L36
            r0.f52601x = r5     // Catch: java.lang.Exception -> L36
            r0.f52602y = r4     // Catch: java.lang.Exception -> L36
            r0.f52603z = r2     // Catch: java.lang.Exception -> L36
            r0.f52596E = r9     // Catch: java.lang.Exception -> L36
            r0.f52599H = r3     // Catch: java.lang.Exception -> L36
            java.lang.Object r10 = r4.mo41126b(r0)     // Catch: java.lang.Exception -> L36
            if (r10 != r1) goto L78
            goto L9e
        L78:
            java.lang.String r10 = (java.lang.String) r10     // Catch: java.lang.Exception -> L36
            if (r10 == 0) goto L87
            f1.w1 r7 = new f1.w1     // Catch: java.lang.Exception -> L36
            r8 = 3
            r7.<init>(r8, r10, r4)     // Catch: java.lang.Exception -> L36
            p368og.InterfaceC27910g.m84218m(r6, r7)     // Catch: java.lang.Exception -> L36
            r1 = r10
            goto L9e
        L87:
            d1.i r10 = new d1.i     // Catch: java.lang.Exception -> L36
            r7 = 19
            r10.<init>(r4, r7)     // Catch: java.lang.Exception -> L36
            p368og.InterfaceC27910g.m84218m(r6, r10)     // Catch: java.lang.Exception -> L36
            goto L9b
        L92:
            f1.w1 r7 = new f1.w1
            r8 = 4
            r7.<init>(r8, r4, r10)
            p368og.InterfaceC27910g.m84218m(r6, r7)
        L9b:
            int r2 = r2 + r3
            goto L61
        L9d:
            r1 = 0
        L9e:
            return r1
        L9f:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "logger<T> cannot be used on an anonymous object"
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: me.C25461b.m74864h(me.b, q83.d):java.lang.Object");
    }

    @Override // p147ff.InterfaceC14422a
    /* JADX INFO: renamed from: b */
    public final Object mo41126b(AbstractC32269c abstractC32269c) {
        return this.f99697x.m99483g(abstractC32269c);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        for (InterfaceC14422a interfaceC14422a : this.f99696w) {
            if (interfaceC14422a instanceof Closeable) {
                ((Closeable) interfaceC14422a).close();
            }
        }
    }

    public final String toString() {
        ArrayList arrayListM74130h1 = AbstractC25265s.m74130h1(AbstractC37056f.m118958J(this), this.f99696w);
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(arrayListM74130h1, 10));
        Iterator it = arrayListM74130h1.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC22671h0.f89337a.getOrCreateKotlinClass(((InterfaceC14422a) it.next()).getClass()).getSimpleName());
        }
        return AbstractC25265s.m74110N0(arrayList, " -> ", null, null, null, 62);
    }
}
