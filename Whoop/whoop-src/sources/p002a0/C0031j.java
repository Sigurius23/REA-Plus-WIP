package p002a0;

import c93.InterfaceC4351m;
import l83.C23454a0;
import p446r1.C30851e;
import q83.InterfaceC30057d;
import s83.AbstractC32274h;
import xb3.C38175j;

/* JADX INFO: renamed from: a0.j */
/* JADX INFO: loaded from: classes5.dex */
public final class C0031j extends AbstractC32274h implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public int f83E;

    /* JADX INFO: renamed from: F */
    public int f84F;

    /* JADX INFO: renamed from: G */
    public int f85G;

    /* JADX INFO: renamed from: H */
    public long f86H;

    /* JADX INFO: renamed from: I */
    public int f87I;

    /* JADX INFO: renamed from: J */
    public /* synthetic */ Object f88J;

    /* JADX INFO: renamed from: K */
    public Object f89K;

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ Object f90L;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ int f91x;

    /* JADX INFO: renamed from: y */
    public long[] f92y;

    /* JADX INFO: renamed from: z */
    public int f93z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0031j(Object obj, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f91x = i13;
        this.f90L = obj;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f91x) {
            case 0:
                C0031j c0031j = new C0031j((C0034k) this.f90L, interfaceC30057d, 0);
                c0031j.f88J = obj;
                return c0031j;
            case 1:
                C0031j c0031j2 = new C0031j((C0034k) this.f90L, interfaceC30057d, 1);
                c0031j2.f88J = obj;
                return c0031j2;
            case 2:
                C0031j c0031j3 = new C0031j((C0033j1) this.f90L, interfaceC30057d, 2);
                c0031j3.f88J = obj;
                return c0031j3;
            default:
                C0031j c0031j4 = new C0031j((C30851e) this.f90L, interfaceC30057d, 3);
                c0031j4.f88J = obj;
                return c0031j4;
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        C38175j c38175j = (C38175j) obj;
        InterfaceC30057d interfaceC30057d = (InterfaceC30057d) obj2;
        switch (this.f91x) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return ((C0031j) create(c38175j, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }

    /* JADX WARN: Code duplicated, block: B:81:0x023e  */
    /* JADX WARN: Code duplicated, block: B:91:0x0292  */
    /* JADX WARN: Code duplicated, block: B:93:0x0295  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x006c -> B:23:0x00ae). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x006e -> B:16:0x007f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0085 -> B:20:0x00a5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x0104 -> B:45:0x0146). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x0106 -> B:38:0x0117). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x011d -> B:42:0x013d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x019c -> B:67:0x01de). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x019e -> B:60:0x01af). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x01b5 -> B:64:0x01d5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:81:0x023e -> B:82:0x0251). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:86:0x0285 -> B:87:0x0286). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:91:0x0292 -> B:92:0x0293). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // s83.AbstractC32267a
    public final java.lang.Object invokeSuspend(java.lang.Object r27) {
        /*
            Method dump skipped, instruction units count: 678
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p002a0.C0031j.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
