package p007a6;

import android.view.View;
import androidx.compose.material.ripple.RippleNode;
import androidx.health.platform.client.proto.C1533u;
import androidx.lifecycle.AbstractC1615p0;
import androidx.room.C1797i2;
import bc3.InterfaceC2994c0;
import bh.C3247j;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import ck.C4775e;
import coil.compose.AsyncImagePainter;
import dc3.C11930o;
import dc3.InterfaceC11936u;
import e63.C12776e;
import ec3.InterfaceC13037f2;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import fc3.AbstractC14373d;
import fc3.C14392w;
import java.util.List;
import l83.C23454a0;
import lb.C23571n;
import mh.C25542j;
import mk.C25626a;
import nc.AbstractC26558b;
import p027b3.C2419o2;
import p138f6.AbstractC14134f;
import p173gj.C15903d;
import p173gj.C15912m;
import p238j0.InterfaceC21083i;
import p255jk.C21743a;
import p282kk.C22533b;
import p390p1.C28688y1;
import p390p1.InterfaceC28601c1;
import p692zt.C41113q;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import w73.C36926l;
import y53.InterfaceC39242b;

/* JADX INFO: renamed from: a6.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0410c extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f1406w;

    /* JADX INFO: renamed from: x */
    public int f1407x;

    /* JADX INFO: renamed from: y */
    public Object f1408y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f1409z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0410c(InterfaceC4351m interfaceC4351m, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f1406w = 14;
        this.f1409z = (AbstractC32275i) interfaceC4351m;
    }

    /* JADX WARN: Type inference failed for: r1v27, types: [c93.m, s83.i] */
    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f1406w) {
            case 0:
                C0410c c0410c = new C0410c((List) this.f1409z, interfaceC30057d, 0);
                c0410c.f1408y = obj;
                return c0410c;
            case 1:
                return new C0410c((C0429i0) this.f1408y, (C0455t0) this.f1409z, interfaceC30057d, 1);
            case 2:
                return new C0410c((InterfaceC4351m) this.f1408y, (C0407b) this.f1409z, interfaceC30057d, 2);
            case 3:
                C0410c c0410c2 = new C0410c((C0429i0) this.f1409z, interfaceC30057d, 3);
                c0410c2.f1408y = obj;
                return c0410c2;
            case 4:
                return new C0410c((C41113q) this.f1409z, interfaceC30057d, 4);
            case 5:
                C0410c c0410c3 = new C0410c((AbstractC1615p0) this.f1409z, interfaceC30057d, 5);
                c0410c3.f1408y = obj;
                return c0410c3;
            case 6:
                return new C0410c((C1797i2) this.f1408y, (InterfaceC4339a) this.f1409z, interfaceC30057d, 6);
            case 7:
                return new C0410c((C28688y1) this.f1408y, (View) this.f1409z, interfaceC30057d, 7);
            case 8:
                return new C0410c((InterfaceC13037f2) this.f1408y, (C2419o2) this.f1409z, interfaceC30057d, 8);
            case 9:
                return new C0410c((C3247j) this.f1408y, (C25542j) this.f1409z, interfaceC30057d, 9);
            case 10:
                C0410c c0410c4 = new C0410c((AsyncImagePainter) this.f1409z, interfaceC30057d, 10);
                c0410c4.f1408y = obj;
                return c0410c4;
            case 11:
                return new C0410c((C4775e) this.f1409z, interfaceC30057d, 11);
            case 12:
                C0410c c0410c5 = new C0410c((InterfaceC13058l) this.f1409z, interfaceC30057d, 12);
                c0410c5.f1408y = obj;
                return c0410c5;
            case 13:
                C0410c c0410c6 = new C0410c((InterfaceC13062m) this.f1409z, interfaceC30057d, 13);
                c0410c6.f1408y = obj;
                return c0410c6;
            case 14:
                C0410c c0410c7 = new C0410c((AbstractC32275i) this.f1409z, interfaceC30057d);
                c0410c7.f1408y = obj;
                return c0410c7;
            case 15:
                C0410c c0410c8 = new C0410c((AbstractC14373d) this.f1409z, interfaceC30057d, 15);
                c0410c8.f1408y = obj;
                return c0410c8;
            case 16:
                return new C0410c((InterfaceC13058l) this.f1408y, (C14392w) this.f1409z, interfaceC30057d, 16);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return new C0410c((C15912m) this.f1409z, interfaceC30057d, 17);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return new C0410c((C15903d) this.f1408y, (C15903d) this.f1409z, interfaceC30057d, 18);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return new C0410c((C15903d) this.f1408y, (String) this.f1409z, interfaceC30057d, 19);
            case 20:
                return new C0410c((InterfaceC21083i) this.f1408y, (InterfaceC28601c1) this.f1409z, interfaceC30057d, 20);
            case 21:
                C0410c c0410c9 = new C0410c((C36926l) this.f1409z, interfaceC30057d, 21);
                c0410c9.f1408y = obj;
                return c0410c9;
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                C0410c c0410c10 = new C0410c((RippleNode) this.f1409z, interfaceC30057d, 22);
                c0410c10.f1408y = obj;
                return c0410c10;
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                C0410c c0410c11 = new C0410c((C22533b) this.f1409z, interfaceC30057d, 23);
                c0410c11.f1408y = obj;
                return c0410c11;
            case 24:
                return new C0410c((InterfaceC4351m) this.f1408y, (C23571n) this.f1409z, interfaceC30057d, 24);
            case 25:
                return new C0410c((C25626a) this.f1408y, (C21743a) this.f1409z, interfaceC30057d, 25);
            case 26:
                C0410c c0410c12 = new C0410c((AbstractC26558b) this.f1409z, interfaceC30057d, 26);
                c0410c12.f1408y = obj;
                return c0410c12;
            default:
                return new C0410c((InterfaceC39242b) this.f1408y, (C12776e) this.f1409z, interfaceC30057d, 27);
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        switch (this.f1406w) {
            case 0:
                return ((C0410c) create((C0440m) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 1:
                return ((C0410c) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 2:
                return ((C0410c) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 3:
                return ((C0410c) create((C0455t0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 4:
                return ((C0410c) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 5:
                ((C0410c) create((InterfaceC11936u) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
                return EnumC31071a.f128113w;
            case 6:
                return ((C0410c) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 7:
                return ((C0410c) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 8:
                ((C0410c) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
                return EnumC31071a.f128113w;
            case 9:
                return ((C0410c) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 10:
                return ((C0410c) create((C25542j) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 11:
                return ((C0410c) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 12:
                return ((C0410c) create((InterfaceC11936u) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 13:
                return ((C0410c) create(new C11930o(((C11930o) obj).f39032a), (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 14:
                return ((C0410c) create((AbstractC14134f) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 15:
                return ((C0410c) create((InterfaceC11936u) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 16:
                return ((C0410c) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return ((C0410c) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return ((C0410c) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return ((C0410c) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 20:
                return ((C0410c) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 21:
                return ((C0410c) create((InterfaceC11936u) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return ((C0410c) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return ((C0410c) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 24:
                return ((C0410c) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 25:
                return ((C0410c) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 26:
                return ((C0410c) create((InterfaceC11936u) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            default:
                return ((C0410c) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:439:0x07e6  */
    /* JADX WARN: Code duplicated, block: B:558:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:559:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v46, types: [c93.m, s83.i] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:184:0x03bc -> B:178:0x039b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:261:0x04f7 -> B:263:0x04fa). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:435:0x07d5 -> B:437:0x07d8). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:421:0x077f
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // s83.AbstractC32267a
    public final java.lang.Object invokeSuspend(java.lang.Object r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p007a6.C0410c.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0410c(Object obj, Object obj2, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f1406w = i13;
        this.f1408y = obj;
        this.f1409z = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0410c(Object obj, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f1406w = i13;
        this.f1409z = obj;
    }
}
