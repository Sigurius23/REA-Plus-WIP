package p392p3;

import java.util.List;
import p005a3.C0237p;
import p014aj.C0928c;
import p390p1.AbstractC28683x;
import p390p1.C28633k1;
import p390p1.InterfaceC28670t2;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: p3.c */
/* JADX INFO: loaded from: classes5.dex */
public final class C28762c implements InterfaceC28670t2 {

    /* JADX INFO: renamed from: E */
    public boolean f116508E = true;

    /* JADX INFO: renamed from: w */
    public final List f116509w;

    /* JADX INFO: renamed from: x */
    public final C28759a0 f116510x;

    /* JADX INFO: renamed from: y */
    public final Function1 f116511y;

    /* JADX INFO: renamed from: z */
    public final C28633k1 f116512z;

    public C28762c(List list, Object obj, C28759a0 c28759a0, C0237p c0237p, Function1 function1, C0928c c0928c) {
        this.f116509w = list;
        this.f116510x = c28759a0;
        this.f116511y = function1;
        this.f116512z = AbstractC28683x.m87272z(obj);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00a3 A[Catch: all -> 0x003a, TRY_LEAVE, TryCatch #0 {all -> 0x003a, blocks: (B:14:0x0035, B:34:0x00a3, B:21:0x004f, B:23:0x0054, B:27:0x007a, B:32:0x0096), top: B:39:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00a3 -> B:35:0x00ac). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: a */
    public final java.lang.Object m87526a(s83.AbstractC32269c r13) {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p392p3.C28762c.m87526a(s83.c):java.lang.Object");
    }

    @Override // p390p1.InterfaceC28670t2
    public final Object getValue() {
        return this.f116512z.getValue();
    }
}
