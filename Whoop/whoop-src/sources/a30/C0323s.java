package a30;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import bc3.InterfaceC2994c0;
import bi.C3277o;
import bi.C3280r;
import bi.C3281s;
import c93.InterfaceC4351m;
import h53.C16941f;
import io.getstream.video.android.core.notifications.internal.receivers.LeaveCallBroadcastReceiver;
import io.getstream.video.android.model.StreamCallId;
import java.util.ArrayList;
import l83.C23454a0;
import my.C26027a;
import p027b3.C2471z0;
import p390p1.C28679w;
import p390p1.C28688y1;
import p395p6.C28894l;
import p512u2.InterfaceC34476v;
import p605x6.InterfaceC38016u;
import p664yy.C39857f;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.C22667f0;
import p715kotlin.jvm.internal.C22669g0;
import q83.InterfaceC30057d;
import s83.AbstractC32275i;
import v10.AbstractC35531g;
import y00.C38901n;
import y00.C38915o4;
import y00.C38966u1;
import z20.C40013g;
import z20.C40014h;

/* JADX INFO: renamed from: a30.s */
/* JADX INFO: loaded from: classes6.dex */
public final class C0323s extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public Object f1118E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Object f1119F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ Object f1120G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ Object f1121H;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f1122w;

    /* JADX INFO: renamed from: x */
    public int f1123x;

    /* JADX INFO: renamed from: y */
    public Object f1124y;

    /* JADX INFO: renamed from: z */
    public Object f1125z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0323s(C16941f c16941f, C2471z0 c2471z0, InterfaceC4351m interfaceC4351m, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f1122w = 3;
        this.f1119F = c16941f;
        this.f1120G = c2471z0;
        this.f1121H = (AbstractC32275i) interfaceC4351m;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [c93.m, s83.i] */
    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f1122w) {
            case 0:
                return new C0323s((C0274a0) this.f1124y, (C38966u1) this.f1125z, (C26027a) this.f1118E, (InterfaceC0303k) this.f1119F, (AbstractC0326t0) this.f1120G, (C38901n) this.f1121H, interfaceC30057d, 0);
            case 1:
                C0323s c0323s = new C0323s((C22669g0) this.f1118E, (C3277o) this.f1119F, (C22669g0) this.f1120G, (C3280r) this.f1121H, interfaceC30057d, 1);
                c0323s.f1125z = obj;
                return c0323s;
            case 2:
                C0323s c0323s2 = new C0323s((InterfaceC34476v) this.f1125z, (Function3) this.f1118E, (Function1) this.f1119F, (Function1) this.f1120G, (Function1) this.f1121H, interfaceC30057d, 2);
                c0323s2.f1124y = obj;
                return c0323s2;
            case 3:
                return new C0323s((C16941f) this.f1119F, (C2471z0) this.f1120G, (AbstractC32275i) this.f1121H, interfaceC30057d);
            case 4:
                return new C0323s((LeaveCallBroadcastReceiver) this.f1124y, (String) this.f1125z, (StreamCallId) this.f1118E, (Context) this.f1119F, (Intent) this.f1120G, (BroadcastReceiver.PendingResult) this.f1121H, interfaceC30057d, 4);
            case 5:
                return new C0323s((C22669g0) this.f1125z, (AbstractC35531g) this.f1118E, (String) this.f1119F, (C39857f) this.f1120G, (C22667f0) this.f1121H, interfaceC30057d, 5);
            case 6:
                return new C0323s((C28679w) this.f1125z, (C28894l) this.f1118E, (Context) this.f1119F, (C28688y1) this.f1120G, (InterfaceC38016u) this.f1121H, interfaceC30057d, 6);
            default:
                return new C0323s((C38915o4) this.f1118E, (C40013g) this.f1119F, (C40014h) this.f1120G, (ArrayList) this.f1121H, interfaceC30057d, 7);
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f1122w) {
            case 0:
                return ((C0323s) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 1:
                return ((C0323s) create((C3281s) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 2:
                return ((C0323s) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 3:
                return ((C0323s) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 4:
                return ((C0323s) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 5:
                return ((C0323s) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 6:
                return ((C0323s) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            default:
                return ((C0323s) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:126:0x02df  */
    /* JADX WARN: Code duplicated, block: B:209:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:210:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:213:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x0155  */
    /* JADX WARN: Code duplicated, block: B:67:0x017d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v29, types: [c93.m] */
    /* JADX WARN: Type inference failed for: r2v60 */
    /* JADX WARN: Type inference failed for: r2v61 */
    /* JADX WARN: Type inference failed for: r5v0, types: [q83.d] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.String] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:67:0x017d -> B:68:0x017e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // s83.AbstractC32267a
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 1152
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a30.C0323s.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0323s(Object obj, Object obj2, Parcelable parcelable, Object obj3, Parcelable parcelable2, Object obj4, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f1122w = i13;
        this.f1124y = obj;
        this.f1125z = obj2;
        this.f1118E = parcelable;
        this.f1119F = obj3;
        this.f1120G = parcelable2;
        this.f1121H = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0323s(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f1122w = i13;
        this.f1125z = obj;
        this.f1118E = obj2;
        this.f1119F = obj3;
        this.f1120G = obj4;
        this.f1121H = obj5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0323s(Object obj, Object obj2, Object obj3, Object obj4, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f1122w = i13;
        this.f1118E = obj;
        this.f1119F = obj2;
        this.f1120G = obj3;
        this.f1121H = obj4;
    }
}
