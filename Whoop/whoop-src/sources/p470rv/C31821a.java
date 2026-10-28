package p470rv;

import android.content.Context;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.mapbox.common.location.DeviceLocationProvider;
import dc3.InterfaceC11936u;
import java.io.BufferedReader;
import l83.C23454a0;
import m63.C25126d;
import q83.InterfaceC30057d;
import s83.AbstractC32275i;
import v10.AbstractC35531g;
import v10.C35526b;

/* JADX INFO: renamed from: rv.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C31821a extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public /* synthetic */ Object f131835E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Object f131836F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ Object f131837G;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f131838w = 0;

    /* JADX INFO: renamed from: x */
    public Object f131839x;

    /* JADX INFO: renamed from: y */
    public long f131840y;

    /* JADX INFO: renamed from: z */
    public int f131841z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31821a(Context context, DeviceLocationProvider deviceLocationProvider, C25126d c25126d, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f131835E = context;
        this.f131836F = deviceLocationProvider;
        this.f131837G = c25126d;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f131838w) {
            case 0:
                C31821a c31821a = new C31821a((Context) this.f131835E, (DeviceLocationProvider) this.f131836F, (C25126d) this.f131837G, interfaceC30057d);
                c31821a.f131839x = obj;
                return c31821a;
            case 1:
                C31821a c31821a2 = new C31821a((AbstractC35531g) this.f131836F, (C35526b) this.f131837G, interfaceC30057d);
                c31821a2.f131835E = obj;
                return c31821a2;
            default:
                return new C31821a((BufferedReader) this.f131839x, (char[]) this.f131835E, (StringBuilder) this.f131836F, this.f131840y, (Process) this.f131837G, interfaceC30057d);
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f131838w) {
            case 0:
                return ((C31821a) create((InterfaceC11936u) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 1:
                return ((C31821a) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            default:
                return ((C31821a) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:133:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:144:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:158:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [q83.d] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:140:0x02df -> B:142:0x02e2). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // s83.AbstractC32267a
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 756
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p470rv.C31821a.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31821a(BufferedReader bufferedReader, char[] cArr, StringBuilder sb4, long j7, Process process, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f131839x = bufferedReader;
        this.f131835E = cArr;
        this.f131836F = sb4;
        this.f131840y = j7;
        this.f131837G = process;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31821a(AbstractC35531g abstractC35531g, C35526b c35526b, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f131836F = abstractC35531g;
        this.f131837G = c35526b;
    }
}
