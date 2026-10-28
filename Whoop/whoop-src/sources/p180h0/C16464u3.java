package p180h0;

import c93.InterfaceC4351m;
import com.whoop.profile.view.edit.avatar.C9770c;
import l83.C23454a0;
import p512u2.InterfaceC34449b;
import q83.InterfaceC30057d;
import s83.AbstractC32274h;

/* JADX INFO: renamed from: h0.u3 */
/* JADX INFO: loaded from: classes5.dex */
public final class C16464u3 extends AbstractC32274h implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public long f63251E;

    /* JADX INFO: renamed from: F */
    public int f63252F;

    /* JADX INFO: renamed from: G */
    public int f63253G;

    /* JADX INFO: renamed from: H */
    public int f63254H;

    /* JADX INFO: renamed from: I */
    public /* synthetic */ Object f63255I;

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ C9770c f63256J;

    /* JADX INFO: renamed from: x */
    public float f63257x;

    /* JADX INFO: renamed from: y */
    public float f63258y;

    /* JADX INFO: renamed from: z */
    public float f63259z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16464u3(C9770c c9770c, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f63256J = c9770c;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        C16464u3 c16464u3 = new C16464u3(this.f63256J, interfaceC30057d);
        c16464u3.f63255I = obj;
        return c16464u3;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        return ((C16464u3) create((InterfaceC34449b) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:23:0x00ba A[LOOP:0: B:19:0x00aa->B:23:0x00ba, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:68:0x00bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x00b8 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [int] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0098 -> B:18:0x009b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // s83.AbstractC32267a
    public final java.lang.Object invokeSuspend(java.lang.Object r26) {
        /*
            Method dump skipped, instruction units count: 422
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p180h0.C16464u3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
