package p132f0;

import android.view.textclassifier.TextClassifier;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p077d0.InterfaceC11337c0;
import p133f1.C13966p;
import p180h0.C16360a3;
import p180h0.C16372c3;
import p238j0.InterfaceC21083i;
import p389p0.C28550t;
import p390p1.InterfaceC28601c1;
import p401pj.InterfaceC29260b0;
import p605x6.C37999d;
import p647yf.InterfaceC39502o;
import p647yf.InterfaceC39507t;
import p715kotlin.jvm.internal.C22663d0;
import p715kotlin.jvm.internal.C22667f0;
import q83.InterfaceC30057d;
import s83.AbstractC32275i;
import t23.C33368c0;

/* JADX INFO: renamed from: f0.c */
/* JADX INFO: loaded from: classes5.dex */
public final class C13774c extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public Object f49139E;

    /* JADX INFO: renamed from: F */
    public /* synthetic */ Object f49140F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f49141w;

    /* JADX INFO: renamed from: x */
    public int f49142x;

    /* JADX INFO: renamed from: y */
    public long f49143y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f49144z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13774c(long j7, InterfaceC29260b0 interfaceC29260b0, String str, InterfaceC28601c1 interfaceC28601c1, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f49141w = 5;
        this.f49143y = j7;
        this.f49139E = interfaceC29260b0;
        this.f49140F = str;
        this.f49144z = interfaceC28601c1;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f49141w) {
            case 0:
                return new C13774c((AbstractC13789h) this.f49140F, this.f49143y, (InterfaceC21083i) this.f49144z, interfaceC30057d, 0);
            case 1:
                return new C13774c((C13833w) this.f49140F, this.f49143y, (InterfaceC21083i) this.f49144z, interfaceC30057d, 1);
            case 2:
                C13774c c13774c = new C13774c((C13966p) this.f49140F, (CharSequence) this.f49144z, this.f49143y, interfaceC30057d, 2);
                c13774c.f49139E = obj;
                return c13774c;
            case 3:
                C13774c c13774c2 = new C13774c((C16372c3) this.f49140F, this.f49143y, (C22663d0) this.f49144z, interfaceC30057d, 3);
                c13774c2.f49139E = obj;
                return c13774c2;
            case 4:
                return new C13774c((C28550t) this.f49140F, (InterfaceC11337c0) this.f49144z, this.f49143y, interfaceC30057d, 4);
            case 5:
                return new C13774c(this.f49143y, (InterfaceC29260b0) this.f49139E, (String) this.f49140F, (InterfaceC28601c1) this.f49144z, interfaceC30057d);
            case 6:
                C13774c c13774c3 = new C13774c(this.f49143y, (C33368c0) this.f49144z, interfaceC30057d);
                c13774c3.f49140F = obj;
                return c13774c3;
            case 7:
                return new C13774c((InterfaceC28601c1) this.f49140F, this.f49143y, (InterfaceC21083i) this.f49144z, interfaceC30057d, 7);
            case 8:
                return new C13774c((C22667f0) this.f49139E, (C22667f0) this.f49140F, (C37999d) this.f49144z, this.f49143y, interfaceC30057d);
            default:
                return new C13774c((InterfaceC39507t) this.f49140F, (InterfaceC39502o) this.f49144z, interfaceC30057d);
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f49141w) {
            case 0:
                return ((C13774c) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 1:
                return ((C13774c) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 2:
                return ((C13774c) create((TextClassifier) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 3:
                return ((C13774c) create((C16360a3) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 4:
                return ((C13774c) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 5:
                return ((C13774c) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 6:
                return ((C13774c) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 7:
                return ((C13774c) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 8:
                return ((C13774c) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            default:
                return ((C13774c) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:103:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:107:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:158:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:240:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:241:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:242:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:244:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:251:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x019b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:107:0x01d3 -> B:93:0x0195). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0046 -> B:14:0x0049). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:99:0x01ae -> B:93:0x0195). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // s83.AbstractC32267a
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            Method dump skipped, instruction units count: 1036
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p132f0.C13774c.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13774c(long j7, C33368c0 c33368c0, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f49141w = 6;
        this.f49143y = j7;
        this.f49144z = c33368c0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C13774c(Object obj, long j7, Object obj2, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f49141w = i13;
        this.f49140F = obj;
        this.f49143y = j7;
        this.f49144z = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C13774c(Object obj, Object obj2, long j7, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f49141w = i13;
        this.f49140F = obj;
        this.f49144z = obj2;
        this.f49143y = j7;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13774c(C22667f0 c22667f0, C22667f0 c22667f1, C37999d c37999d, long j7, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f49141w = 8;
        this.f49139E = c22667f0;
        this.f49140F = c22667f1;
        this.f49144z = c37999d;
        this.f49143y = j7;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13774c(InterfaceC39507t interfaceC39507t, InterfaceC39502o interfaceC39502o, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f49141w = 9;
        this.f49140F = interfaceC39507t;
        this.f49144z = interfaceC39502o;
    }
}
