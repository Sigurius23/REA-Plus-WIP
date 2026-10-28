package androidx.room;

import a30.C0273a;
import a30.C0290f1;
import a30.C0307l0;
import a33.C0352d;
import android.R;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import androidx.health.platform.client.proto.C1533u;
import androidx.lifecycle.C1601k1;
import b10.C2222b;
import b30.C2578n;
import bc3.AbstractC3006f0;
import bc3.C2996c2;
import bc3.C3033m;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3027k1;
import c33.C3936c;
import c33.C3938e;
import c93.InterfaceC4351m;
import com.amplitude.android.engagement.C4861a;
import com.mapbox.common.MapboxServices;
import com.stripe.android.core.exception.LocalStripeException;
import com.stripe.android.model.StripeIntent$NextActionType;
import com.stripe.android.model.StripeIntent$Status;
import dk.C12100f;
import dz.AbstractC12462i;
import e10.C12534a0;
import e10.C12567r;
import e10.C12575v;
import e10.C12579y;
import e10.C12580z;
import e10.InterfaceC12536b0;
import ec3.C13045h2;
import eg.C13161j;
import f53.C14123k;
import g20.AbstractC15258d;
import g20.AbstractC15276v;
import g20.C15255a;
import g20.C15256b;
import g20.C15257c;
import g20.C15272r;
import g20.C15273s;
import g20.C15274t;
import g20.C15275u;
import gm.C15990r;
import h00.C16493b0;
import h20.AbstractC16632b4;
import h20.C16626a4;
import h20.C16651f;
import h20.C16686k4;
import h20.C16759x;
import h20.C16769y3;
import h20.C16775z3;
import h20.C16776z4;
import h20.EnumC16656f4;
import h20.InterfaceC16638c4;
import i20.AbstractC17960l1;
import i20.C17948h1;
import i20.C17954j1;
import i20.C17955k;
import i20.C17957k1;
import i20.C17958l;
import i20.C17974r0;
import i20.C17976s0;
import i20.InterfaceC17951i1;
import i20.InterfaceC17978t0;
import io.ktor.utils.p228io.C20020m;
import io.ktor.utils.p228io.InterfaceC20024q;
import j20.C21241c;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import k20.C22136a;
import k20.C22139d;
import k20.C22144i;
import k20.C22146k;
import l40.C23328a;
import l83.C23454a0;
import m83.AbstractC25247g0;
import m83.C25272z;
import n00.C26075c;
import n00.C26083k;
import n20.C26173h;
import n20.C26174i;
import n20.C26186u;
import o23.C27481k;
import o23.InterfaceC27471a;
import org.json.JSONException;
import org.json.JSONObject;
import p000.AbstractC11266d;
import p000.C12473e;
import p021av.C2088b;
import p047c9.C4312c;
import p078d1.C11453f;
import p114eb.C12982q;
import p114eb.C12991u0;
import p132f0.C13821r1;
import p164g2.C15247s;
import p197hj.C17319b;
import p197hj.RunnableC17322e;
import p255jk.C21743a;
import p281kj.C22507b;
import p342nj.AbstractC26738c;
import p342nj.C26737b;
import p343nk.C26792m;
import p505ts.AbstractC34132o;
import p537ux.AbstractC35343l0;
import p537ux.AbstractC35345m0;
import p553vj.C36065b;
import p664yy.AbstractC39851c;
import p664yy.C39865j;
import p664yy.InterfaceC39847a;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q20.C29811c0;
import q20.C29838w;
import q83.InterfaceC30057d;
import r20.C30868f;
import r20.C30869g;
import r20.C30871i;
import r20.C30872j;
import r20.C30873k;
import r20.C30877o;
import r20.C30878p;
import r20.C30879q;
import r20.C30880r;
import r20.InterfaceC30881s;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import t23.C33366b4;
import t23.C33368c0;
import t23.C33391g1;
import t23.C33407j2;
import t23.InterfaceC33442q2;
import v00.C35459c0;
import v00.C35480n;
import wb3.AbstractC37056f;
import x30.AbstractC37926s0;
import y00.C38915o4;
import y00.EnumC38828f4;
import y00.InterfaceC38802c8;
import yb3.C39408l;
import yb3.C39410n;
import yb3.InterfaceC39407k;
import z40.AbstractC40058e;
import z40.C40065l;

/* JADX INFO: renamed from: androidx.room.e */
/* JADX INFO: loaded from: classes5.dex */
public final class C1778e extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f7005w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f7006x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f7007y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1778e(Object obj, Object obj2, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f7005w = i13;
        this.f7006x = obj;
        this.f7007y = obj2;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f7005w) {
            case 0:
                return new C1778e((Callable) this.f7006x, (C3033m) this.f7007y, interfaceC30057d, 0);
            case 1:
                C1778e c1778e = new C1778e((Function1) this.f7007y, interfaceC30057d, 1);
                c1778e.f7006x = obj;
                return c1778e;
            case 2:
                return new C1778e((C3938e) this.f7006x, (AbstractC40058e) this.f7007y, interfaceC30057d, 2);
            case 3:
                C1778e c1778e2 = new C1778e((C11453f) this.f7007y, interfaceC30057d, 3);
                c1778e2.f7006x = obj;
                return c1778e2;
            case 4:
                return new C1778e((C0352d) this.f7006x, (AbstractC12462i) this.f7007y, interfaceC30057d, 4);
            case 5:
                C1778e c1778e3 = new C1778e((C14123k) this.f7007y, interfaceC30057d, 5);
                c1778e3.f7006x = obj;
                return c1778e3;
            case 6:
                return new C1778e((C15272r) this.f7006x, (InterfaceC38802c8) this.f7007y, interfaceC30057d, 6);
            case 7:
                return new C1778e((C15272r) this.f7006x, (AbstractC35345m0) this.f7007y, interfaceC30057d, 7);
            case 8:
                return new C1778e((C15272r) this.f7006x, (Throwable) this.f7007y, interfaceC30057d, 8);
            case 9:
                C1778e c1778e4 = new C1778e((C15247s) this.f7007y, interfaceC30057d, 9);
                c1778e4.f7006x = obj;
                return c1778e4;
            case 10:
                return new C1778e((C16493b0) this.f7006x, (C13821r1) this.f7007y, interfaceC30057d, 10);
            case 11:
                return new C1778e((C16686k4) this.f7006x, (IllegalStateException) this.f7007y, interfaceC30057d, 11);
            case 12:
                C1778e c1778e5 = new C1778e((C16686k4) this.f7007y, interfaceC30057d, 12);
                c1778e5.f7006x = obj;
                return c1778e5;
            case 13:
                return new C1778e((C16776z4) this.f7006x, (C38915o4) this.f7007y, interfaceC30057d, 13);
            case 14:
                C1778e c1778e6 = new C1778e((C17957k1) this.f7007y, interfaceC30057d, 14);
                c1778e6.f7006x = obj;
                return c1778e6;
            case 15:
                C1778e c1778e7 = new C1778e((C17954j1) this.f7007y, interfaceC30057d, 15);
                c1778e7.f7006x = obj;
                return c1778e7;
            case 16:
                return new C1778e((C21241c) this.f7006x, (AbstractC12462i) this.f7007y, interfaceC30057d, 16);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return new C1778e((C22136a) this.f7006x, (AbstractC37926s0) this.f7007y, interfaceC30057d, 17);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return new C1778e((C22136a) this.f7006x, (InterfaceC39847a) this.f7007y, interfaceC30057d, 18);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                C1778e c1778e8 = new C1778e((C22139d) this.f7007y, interfaceC30057d, 19);
                c1778e8.f7006x = obj;
                return c1778e8;
            case 20:
                C1778e c1778e9 = new C1778e((InterfaceC20024q) this.f7007y, interfaceC30057d, 20);
                c1778e9.f7006x = obj;
                return c1778e9;
            case 21:
                return new C1778e((C22507b) this.f7006x, (C21743a) this.f7007y, interfaceC30057d, 21);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return new C1778e((C22507b) this.f7006x, this.f7007y, interfaceC30057d, 22);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                C1778e c1778e10 = new C1778e((C26083k) this.f7007y, interfaceC30057d, 23);
                c1778e10.f7006x = obj;
                return c1778e10;
            case 24:
                return new C1778e((C26174i) this.f7006x, (AbstractC15276v) this.f7007y, interfaceC30057d, 24);
            case 25:
                C1778e c1778e11 = new C1778e((C26186u) this.f7007y, interfaceC30057d, 25);
                c1778e11.f7006x = obj;
                return c1778e11;
            case 26:
                C1778e c1778e12 = new C1778e((C15990r) this.f7007y, interfaceC30057d, 26);
                c1778e12.f7006x = obj;
                return c1778e12;
            case 27:
                return new C1778e((Activity) this.f7006x, (String) this.f7007y, interfaceC30057d, 27);
            case 28:
                return new C1778e((C26792m) this.f7006x, (InterfaceC39407k) this.f7007y, interfaceC30057d, 28);
            default:
                return new C1778e((C27481k) this.f7006x, (InterfaceC27471a) this.f7007y, interfaceC30057d, 29);
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) throws JSONException {
        switch (this.f7005w) {
            case 0:
                C1778e c1778e = (C1778e) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2);
                C23454a0 c23454a0 = C23454a0.f92919a;
                c1778e.invokeSuspend(c23454a0);
                return c23454a0;
            case 1:
                C1778e c1778e2 = (C1778e) create((C2578n) obj, (InterfaceC30057d) obj2);
                C23454a0 c23454a1 = C23454a0.f92919a;
                c1778e2.invokeSuspend(c23454a1);
                return c23454a1;
            case 2:
                C1778e c1778e3 = (C1778e) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2);
                C23454a0 c23454a2 = C23454a0.f92919a;
                c1778e3.invokeSuspend(c23454a2);
                return c23454a2;
            case 3:
                return ((C1778e) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 4:
                C1778e c1778e4 = (C1778e) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2);
                C23454a0 c23454a3 = C23454a0.f92919a;
                c1778e4.invokeSuspend(c23454a3);
                return c23454a3;
            case 5:
                C1778e c1778e5 = (C1778e) create((String) obj, (InterfaceC30057d) obj2);
                C23454a0 c23454a4 = C23454a0.f92919a;
                c1778e5.invokeSuspend(c23454a4);
                return c23454a4;
            case 6:
                C1778e c1778e6 = (C1778e) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2);
                C23454a0 c23454a5 = C23454a0.f92919a;
                c1778e6.invokeSuspend(c23454a5);
                return c23454a5;
            case 7:
                C1778e c1778e7 = (C1778e) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2);
                C23454a0 c23454a6 = C23454a0.f92919a;
                c1778e7.invokeSuspend(c23454a6);
                return c23454a6;
            case 8:
                C1778e c1778e8 = (C1778e) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2);
                C23454a0 c23454a7 = C23454a0.f92919a;
                c1778e8.invokeSuspend(c23454a7);
                return c23454a7;
            case 9:
                C1778e c1778e9 = (C1778e) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2);
                C23454a0 c23454a8 = C23454a0.f92919a;
                c1778e9.invokeSuspend(c23454a8);
                return c23454a8;
            case 10:
                C1778e c1778e10 = (C1778e) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2);
                C23454a0 c23454a9 = C23454a0.f92919a;
                c1778e10.invokeSuspend(c23454a9);
                return c23454a9;
            case 11:
                C1778e c1778e11 = (C1778e) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2);
                C23454a0 c23454a10 = C23454a0.f92919a;
                c1778e11.invokeSuspend(c23454a10);
                return c23454a10;
            case 12:
                C1778e c1778e12 = (C1778e) create((InterfaceC12536b0) obj, (InterfaceC30057d) obj2);
                C23454a0 c23454a11 = C23454a0.f92919a;
                c1778e12.invokeSuspend(c23454a11);
                return c23454a11;
            case 13:
                C1778e c1778e13 = (C1778e) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2);
                C23454a0 c23454a12 = C23454a0.f92919a;
                c1778e13.invokeSuspend(c23454a12);
                return c23454a12;
            case 14:
                C1778e c1778e14 = (C1778e) create((InterfaceC17978t0) obj, (InterfaceC30057d) obj2);
                C23454a0 c23454a13 = C23454a0.f92919a;
                c1778e14.invokeSuspend(c23454a13);
                return c23454a13;
            case 15:
                C1778e c1778e15 = (C1778e) create((Map) obj, (InterfaceC30057d) obj2);
                C23454a0 c23454a14 = C23454a0.f92919a;
                c1778e15.invokeSuspend(c23454a14);
                return c23454a14;
            case 16:
                C1778e c1778e16 = (C1778e) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2);
                C23454a0 c23454a15 = C23454a0.f92919a;
                c1778e16.invokeSuspend(c23454a15);
                return c23454a15;
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                C1778e c1778e17 = (C1778e) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2);
                C23454a0 c23454a16 = C23454a0.f92919a;
                c1778e17.invokeSuspend(c23454a16);
                return c23454a16;
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                C1778e c1778e18 = (C1778e) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2);
                C23454a0 c23454a17 = C23454a0.f92919a;
                c1778e18.invokeSuspend(c23454a17);
                return c23454a17;
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                C1778e c1778e19 = (C1778e) create((InterfaceC30881s) obj, (InterfaceC30057d) obj2);
                C23454a0 c23454a18 = C23454a0.f92919a;
                c1778e19.invokeSuspend(c23454a18);
                return c23454a18;
            case 20:
                return ((C1778e) create(obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 21:
                C1778e c1778e20 = (C1778e) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2);
                C23454a0 c23454a19 = C23454a0.f92919a;
                c1778e20.invokeSuspend(c23454a19);
                return c23454a19;
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                C1778e c1778e21 = (C1778e) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2);
                C23454a0 c23454a20 = C23454a0.f92919a;
                c1778e21.invokeSuspend(c23454a20);
                return c23454a20;
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                C1778e c1778e22 = (C1778e) create((String) obj, (InterfaceC30057d) obj2);
                C23454a0 c23454a21 = C23454a0.f92919a;
                c1778e22.invokeSuspend(c23454a21);
                return c23454a21;
            case 24:
                C1778e c1778e23 = (C1778e) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2);
                C23454a0 c23454a22 = C23454a0.f92919a;
                c1778e23.invokeSuspend(c23454a22);
                return c23454a22;
            case 25:
                C1778e c1778e24 = (C1778e) create((C26173h) obj, (InterfaceC30057d) obj2);
                C23454a0 c23454a23 = C23454a0.f92919a;
                c1778e24.invokeSuspend(c23454a23);
                return c23454a23;
            case 26:
                C1778e c1778e25 = (C1778e) create((InterfaceC33442q2) obj, (InterfaceC30057d) obj2);
                C23454a0 c23454a24 = C23454a0.f92919a;
                c1778e25.invokeSuspend(c23454a24);
                return c23454a24;
            case 27:
                return ((C1778e) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 28:
                C1778e c1778e26 = (C1778e) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2);
                C23454a0 c23454a25 = C23454a0.f92919a;
                c1778e26.invokeSuspend(c23454a25);
                return c23454a25;
            default:
                C1778e c1778e27 = (C1778e) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2);
                C23454a0 c23454a26 = C23454a0.f92919a;
                c1778e27.invokeSuspend(c23454a26);
                return c23454a26;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:204:0x04d5  */
    /* JADX WARN: Code duplicated, block: B:213:0x04f5  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v48, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.i] */
    /* JADX WARN: Type inference failed for: r6v0, types: [q83.d] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v9 */
    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) throws JSONException {
        EnumC38828f4 enumC38828f4;
        AbstractC15258d c15256b;
        C12982q c12982qM36398m;
        C1601k1 c1601k1M36480b;
        C12982q c12982qM36398m2;
        C1601k1 c1601k1M36480b2;
        Map map;
        C35480n c35480n;
        Object value;
        AbstractC16632b4 c16626a4;
        C0290f1 c0290f1;
        C35459c0 c35459c0;
        View viewFindViewWithTag;
        int i13 = this.f7005w;
        int i14 = 22;
        boolean z4 = false;
        i = 0;
        i = 0;
        i = 0;
        int i15 = 0;
        C0307l0 c0307l0 = 0;
        c0307l0 = 0;
        c0307l0 = 0;
        C23454a0 c23454a0 = C23454a0.f92919a;
        Object obj2 = this.f7007y;
        switch (i13) {
            case 0:
                C3033m c3033m = (C3033m) obj2;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                try {
                    c3033m.resumeWith(((Callable) this.f7006x).call());
                    break;
                } catch (Throwable th3) {
                    c3033m.resumeWith(AbstractC34132o.m107888l(th3));
                }
                return c23454a0;
            case 1:
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                ((Function1) obj2).invoke((C2578n) this.f7006x);
                return c23454a0;
            case 2:
                EnumC31071a enumC31071a3 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                C3936c c3936c = ((C3938e) this.f7006x).f16075a;
                AbstractC40058e abstractC40058e = (AbstractC40058e) obj2;
                C40065l c40065l = (C40065l) c3936c.f16072e;
                if (c40065l != null) {
                    if (!AbstractC22676k.m65745e(c40065l.f172884e, abstractC40058e)) {
                        String message = "Selected AudioDevice = " + abstractC40058e;
                        c40065l.f172880a.getClass();
                        AbstractC22676k.m65750j(message, "message");
                        c40065l.f172885f = abstractC40058e;
                        c40065l.m128410d(null);
                    }
                    if (!c3936c.f16068a) {
                        c40065l.m128407a();
                        c3936c.f16068a = true;
                    }
                }
                return c23454a0;
            case 3:
                EnumC31071a enumC31071a4 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) this.f7006x;
                C11453f c11453f = (C11453f) obj2;
                InterfaceC3027k1 interfaceC3027k1 = (InterfaceC3027k1) c11453f.f36745b.getAndSet(null);
                AtomicReference atomicReference = c11453f.f36745b;
                C2996c2 c2996c2M8732z = AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new C12473e(interfaceC3027k1, c11453f, (InterfaceC30057d) c0307l0, 28), 3);
                while (!atomicReference.compareAndSet(null, c2996c2M8732z)) {
                    if (atomicReference.get() != null) {
                        return Boolean.valueOf(z4);
                    }
                }
                z4 = true;
                return Boolean.valueOf(z4);
            case 4:
                EnumC31071a enumC31071a5 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                C0352d c0352d = (C0352d) this.f7006x;
                AbstractC12462i abstractC12462i = (AbstractC12462i) obj2;
                ((C39865j) c0352d.f1237x).m127938a(((AbstractC39851c) c0352d.f1238y).mo7052a(abstractC12462i, abstractC12462i.mo35094a()));
                return c23454a0;
            case 5:
                EnumC31071a enumC31071a6 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                ((C14123k) obj2).f50770h.m36570j((String) this.f7006x);
                return c23454a0;
            case 6:
                EnumC31071a enumC31071a7 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                InterfaceC38802c8 interfaceC38802c8 = (InterfaceC38802c8) obj2;
                C15272r.m43369l((C15272r) this.f7006x, new C15256b(interfaceC38802c8), interfaceC38802c8, null, 4);
                return c23454a0;
            case 7:
                EnumC31071a enumC31071a8 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                C15272r c15272r = (C15272r) this.f7006x;
                AbstractC35345m0 abstractC35345m0 = (AbstractC35345m0) obj2;
                List list = C15272r.f57344O;
                InterfaceC38802c8 interfaceC38802c8Mo112190f = abstractC35345m0.mo112190f();
                int i16 = abstractC35345m0.f150565w;
                if (i16 == 0) {
                    StripeIntent$Status stripeIntent$StatusMo124331c = interfaceC38802c8Mo112190f.mo124331c();
                    switch (stripeIntent$StatusMo124331c == null ? -1 : AbstractC35343l0.f150562a[stripeIntent$StatusMo124331c.ordinal()]) {
                        case 1:
                            if (interfaceC38802c8Mo112190f.mo124335m() != null) {
                                StripeIntent$NextActionType stripeIntent$NextActionTypeMo124328O = abstractC35345m0.mo112190f().mo124328O();
                                switch (stripeIntent$NextActionTypeMo124328O != null ? AbstractC35343l0.f150563b[stripeIntent$NextActionTypeMo124328O.ordinal()] : -1) {
                                    case -1:
                                    case 1:
                                    case 2:
                                    case 3:
                                    case 4:
                                    case 5:
                                    case 6:
                                    case 7:
                                    case 8:
                                        i15 = 3;
                                        break;
                                    case 0:
                                    default:
                                        throw new NoWhenBranchMatchedException();
                                    case 9:
                                    case 10:
                                    case 11:
                                    case 12:
                                    case 13:
                                    case 14:
                                    case 15:
                                        i15 = 1;
                                        break;
                                }
                            } else {
                                i15 = 2;
                                break;
                            }
                            break;
                        case 2:
                            i15 = 3;
                            break;
                        case 3:
                            i15 = 2;
                            break;
                        case 4:
                        case 5:
                        case 6:
                            i15 = 1;
                            break;
                        case 7:
                            C38915o4 c38915o4Mo124330Y = abstractC35345m0.mo112190f().mo124330Y();
                            if (c38915o4Mo124330Y != null && (enumC38828f4 = c38915o4Mo124330Y.f167511E) != null && enumC38828f4.f167130E) {
                                i15 = 1;
                            }
                            break;
                    }
                } else {
                    i15 = i16;
                }
                if (i15 == 1) {
                    c15256b = new C15256b(abstractC35345m0.mo112190f());
                } else if (i15 == 2) {
                    c15256b = new C15257c(new LocalStripeException(abstractC35345m0.mo112189b(), "failedIntentOutcomeError"));
                } else if (i15 != 3) {
                    c15256b = i15 != 4 ? new C15257c(new LocalStripeException(AbstractC11266d.m30461o("Payment fails due to unknown error. \n", abstractC35345m0.mo112189b()), "unknownIntentOutcomeError")) : new C15257c(new LocalStripeException(AbstractC11266d.m30461o("Payment fails due to time out. \n", abstractC35345m0.mo112189b()), "timedOutIntentOutcomeError"));
                } else {
                    c15256b = C15255a.f57286w;
                }
                C15272r.m43369l(c15272r, c15256b, abstractC35345m0.mo112190f(), null, 4);
                return c23454a0;
            case 8:
                EnumC31071a enumC31071a9 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                C15272r.m43369l((C15272r) this.f7006x, new C15257c((Throwable) obj2), null, null, 6);
                return c23454a0;
            case 9:
                EnumC31071a enumC31071a10 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                AbstractC3006f0.m8725s(((InterfaceC2994c0) this.f7006x).getCoroutineContext()).invokeOnCompletion(new C13161j((C15247s) obj2, i14));
                return c23454a0;
            case 10:
                EnumC31071a enumC31071a11 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                C16493b0 c16493b0 = (C16493b0) this.f7006x;
                if (c16493b0 != null) {
                    c16493b0.f63386a.invoke(Boolean.valueOf(((C13821r1) obj2).mo39182c()));
                }
                return c23454a0;
            case 11:
                EnumC31071a enumC31071a12 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                IllegalStateException illegalStateException = (IllegalStateException) obj2;
                C16686k4.m47236B((C16686k4) this.f7006x, new C12575v(illegalStateException, AbstractC37926s0.m121456H(illegalStateException), C12567r.f42912a));
                return c23454a0;
            case 12:
                C16686k4 c16686k4 = (C16686k4) obj2;
                EnumC31071a enumC31071a13 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                InterfaceC12536b0 interfaceC12536b0 = (InterfaceC12536b0) this.f7006x;
                if (!(interfaceC12536b0 instanceof C12534a0)) {
                    if (interfaceC12536b0 instanceof C12580z) {
                        EnumC16656f4 enumC16656f4 = c16686k4.f64168l0;
                        C1601k1 c1601k1 = c16686k4.f43028z;
                        C13045h2 c13045h2 = c16686k4.f64167k0;
                        c16686k4.f64168l0 = enumC16656f4;
                        Boolean bool = Boolean.TRUE;
                        c1601k1.m5004e(bool, "processing");
                        c13045h2.getClass();
                        C29811c0 c29811c0 = C29811c0.f121868b;
                        c13045h2.m36571k(null, c29811c0);
                        if (!(c13045h2.getValue() instanceof C29811c0)) {
                            c16686k4.f64168l0 = c16686k4.f64168l0;
                            c1601k1.m5004e(bool, "processing");
                            c13045h2.getClass();
                            c13045h2.m36571k(null, c29811c0);
                        }
                    } else {
                        if (!(interfaceC12536b0 instanceof C12579y)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        C35459c0 c35459c1 = (C35459c0) c16686k4.f43008L.getValue();
                        if (c35459c1 != null) {
                            c16686k4.m47240F(c35459c1, null);
                        }
                        C16686k4.m47236B(c16686k4, ((C12579y) interfaceC12536b0).f42950a);
                    }
                }
                return c23454a0;
            case 13:
                EnumC31071a enumC31071a14 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                C16776z4 c16776z4 = (C16776z4) this.f7006x;
                C16651f c16651f = c16776z4.f64490i;
                C38915o4 c38915o4 = (C38915o4) obj2;
                C0273a c0273a = (C0273a) c16651f.f64021b.f45200w.getValue();
                c16651f.f64020a.m5004e(c0273a != null ? C0273a.m807b(c0273a, null, c38915o4 != null ? c38915o4.f167527w : null, 1) : null, "customer_info");
                c16776z4.f64489h.invoke(new C29838w(c38915o4, null, null));
                return c23454a0;
            case 14:
                C17957k1 c17957k1 = (C17957k1) obj2;
                EnumC31071a enumC31071a15 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                InterfaceC17978t0 interfaceC17978t0 = (InterfaceC17978t0) this.f7006x;
                if (interfaceC17978t0 instanceof C17976s0) {
                    C17955k c17955k = new C17955k(((C17976s0) interfaceC17978t0).f69808a);
                    C12991u0 c12991u0 = c17957k1.f69766a;
                    if (c12991u0 != null && (c12982qM36398m2 = c12991u0.m36398m()) != null && (c1601k1M36480b2 = c12982qM36398m2.m36480b()) != null) {
                        c1601k1M36480b2.m5004e(c17955k, "AutocompleteEvent");
                    }
                } else {
                    if (!(interfaceC17978t0 instanceof C17974r0)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    C17958l c17958l = new C17958l(((C17974r0) interfaceC17978t0).f69798a);
                    C12991u0 c12991u1 = c17957k1.f69766a;
                    if (c12991u1 != null && (c12982qM36398m = c12991u1.m36398m()) != null && (c1601k1M36480b = c12982qM36398m.m36480b()) != null) {
                        c1601k1M36480b.m5004e(c17958l, "AutocompleteEvent");
                    }
                }
                C12991u0 c12991u2 = c17957k1.f69766a;
                if (c12991u2 != null && !c12991u2.m36410z()) {
                    AbstractC17960l1.m51584k(c17957k1);
                }
                return c23454a0;
            case 15:
                EnumC31071a enumC31071a16 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                Map map2 = (Map) this.f7006x;
                C17954j1 c17954j1 = (C17954j1) obj2;
                C13045h2 c13045h3 = c17954j1.f69745F;
                if (((InterfaceC17951i1) c13045h3.getValue()) instanceof C17948h1) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC25247g0.m73988W(map2.size()));
                    for (Map.Entry entry : map2.entrySet()) {
                        linkedHashMap.put(entry.getKey(), ((C23328a) entry.getValue()).f92491a);
                    }
                    boolean zEquals = linkedHashMap.equals(c17954j1.f69744E);
                    if (!zEquals) {
                        c17954j1.f69746G = linkedHashMap;
                    }
                    C17948h1 c17948h1 = new C17948h1(zEquals);
                    c13045h3.getClass();
                    c13045h3.m36571k(null, c17948h1);
                }
                return c23454a0;
            case 16:
                EnumC31071a enumC31071a17 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                C21241c c21241c = (C21241c) this.f7006x;
                AbstractC12462i abstractC12462i2 = (AbstractC12462i) obj2;
                c21241c.f81098a.m127938a(c21241c.f81099b.mo7052a(abstractC12462i2, abstractC12462i2.mo35094a()));
                return c23454a0;
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                EnumC31071a enumC31071a18 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                if (((C22136a) this.f7006x).f85868f.get() == null) {
                    return c23454a0;
                }
                throw new ClassCastException();
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                EnumC31071a enumC31071a19 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                C22136a c22136a = (C22136a) this.f7006x;
                C39865j c39865j = c22136a.f85864b;
                C2222b c2222b = c22136a.f85866d;
                InterfaceC39847a interfaceC39847a = (InterfaceC39847a) obj2;
                C35459c0 c35459c2 = (C35459c0) c22136a.f85871i.get();
                if (c35459c2 == null || (c35480n = c35459c2.f150992i0) == null || (map = c35480n.f151053x) == null) {
                    map = C25272z.f99163w;
                }
                c39865j.m127938a(c2222b.mo7052a(interfaceC39847a, map));
                return c23454a0;
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                EnumC31071a enumC31071a20 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                InterfaceC30881s interfaceC30881s = (InterfaceC30881s) this.f7006x;
                C22139d c22139d = (C22139d) obj2;
                C1601k1 c1601k2 = c22139d.f85884a;
                C22136a c22136a2 = c22139d.f85885b;
                if (!(interfaceC30881s instanceof C30872j) && !(interfaceC30881s instanceof C30880r) && !(interfaceC30881s instanceof C30871i)) {
                    if (interfaceC30881s instanceof C30873k) {
                        C22136a.m63387i(c22136a2, new C22144i(c22136a2.f85863a, 4));
                    } else if (interfaceC30881s instanceof C30878p) {
                        c22136a2.getClass();
                        C22136a.m63387i(c22136a2, new C22146k(4));
                    } else if (interfaceC30881s instanceof C30877o) {
                        c22139d.m63403c(true);
                        c1601k2.m5004e(null, "previously_shown_payment_form");
                        c1601k2.m5004e(null, "previously_interacted_payment_form");
                    } else if (interfaceC30881s instanceof C30879q) {
                        c22139d.m63403c(false);
                    } else {
                        if (!(interfaceC30881s instanceof C30869g) && !(interfaceC30881s instanceof C30868f)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        String strM35329l = c22139d.f85886c.f42997x.m35329l();
                        if (!AbstractC22676k.m65745e((String) c1601k2.m5001b("previously_shown_payment_form"), strM35329l)) {
                            c22136a2.m63395o(strM35329l);
                            c1601k2.m5004e(strM35329l, "previously_shown_payment_form");
                        }
                        c22139d.m63403c(false);
                    }
                }
                return c23454a0;
            case 20:
                EnumC31071a enumC31071a21 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                return Boolean.valueOf(this.f7006x != null || ((C20020m) ((InterfaceC20024q) obj2)).m55850n());
            case 21:
                EnumC31071a enumC31071a22 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                C22507b c22507b = (C22507b) this.f7006x;
                c22507b.f88211w.m15522h();
                C17319b c17319b = c22507b.f88209H;
                if (c17319b != null) {
                    C4861a c4861a = c22507b.f88211w;
                    AbstractC22676k.m65747g(c17319b);
                    c4861a.m15515a(c17319b);
                } else {
                    C21743a c21743a = (C21743a) obj2;
                    c22507b.m65009c(c21743a.f83629a, c21743a.f83630b);
                }
                return c23454a0;
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                EnumC31071a enumC31071a23 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                C4861a c4861a2 = ((C22507b) this.f7006x).f88211w;
                String str = (String) obj2;
                C4861a.f20259o.m16030H(new C2088b(str, i14));
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("href", str);
                jSONObject.put("pathname", "");
                jSONObject.put(MapboxServices.SEARCH, "");
                String string = jSONObject.toString();
                AbstractC22676k.m65749i(string, "JSONObject()\n           …              .toString()");
                new Handler(Looper.getMainLooper()).postDelayed(new RunnableC17322e(c4861a2, string, z4 ? 1 : 0), 1000L);
                return c23454a0;
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                EnumC31071a enumC31071a24 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                String str2 = (String) this.f7006x;
                int i17 = C26083k.f103293R;
                C13045h2 c13045h4 = ((C26083k) obj2).f103303N;
                do {
                    value = c13045h4.getValue();
                } while (!c13045h4.m36569i(value, C26075c.m77570a((C26075c) value, false, null, false, null, str2, 127)));
                return c23454a0;
            case 24:
                EnumC31071a enumC31071a25 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                InterfaceC16638c4 interfaceC16638c4 = ((C26174i) this.f7006x).f103774e;
                AbstractC15276v abstractC15276v = (AbstractC15276v) obj2;
                if (abstractC15276v instanceof C15274t) {
                    c16626a4 = new C16775z3(true);
                } else if (abstractC15276v instanceof C15273s) {
                    c16626a4 = new C16769y3(true);
                } else {
                    if (!(abstractC15276v instanceof C15275u)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    c16626a4 = new C16626a4(((C15275u) abstractC15276v).f57361w);
                }
                interfaceC16638c4.mo43511a(c16626a4);
                return c23454a0;
            case 25:
                EnumC31071a enumC31071a26 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                C26173h c26173h = (C26173h) this.f7006x;
                C16759x c16759x = (C16759x) ((C26186u) obj2).f103862y.f103703Y.get();
                if (c26173h != null && (c0290f1 = c26173h.f103767w) != null && (c35459c0 = c0290f1.f1019E) != null) {
                    c0307l0 = c35459c0.f150995l0;
                }
                c16759x.m47278c(c0307l0);
                return c23454a0;
            case 26:
                EnumC31071a enumC31071a27 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                if (((InterfaceC33442q2) this.f7006x) instanceof C33407j2) {
                    C15990r c15990r = (C15990r) obj2;
                    C33368c0 c33368c0 = (C33368c0) c15990r.f60512x;
                    String str3 = c33368c0.f139289c;
                    C33366b4 c33366b4 = (C33366b4) c15990r.f60513y;
                    C33391g1 c33391g1 = c33366b4.f139248U;
                    C33368c0 c33368c1 = (C33368c0) c33391g1.f139404g.getValue();
                    if (str3.equals(c33368c1 != null ? c33368c1.f139289c : null)) {
                        c33391g1.m105848d(c33368c0);
                        c33366b4.m105802t(c33368c0);
                    }
                }
                return c23454a0;
            case 27:
                EnumC31071a enumC31071a28 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                Activity activity = (Activity) this.f7006x;
                ViewGroup viewGroup = (ViewGroup) activity.findViewById(R.id.content);
                Rect rect = new Rect();
                viewGroup.getGlobalVisibleRect(rect);
                Context applicationContext = activity.getApplicationContext();
                AbstractC22676k.m65749i(applicationContext, "this@findViewsWithSelector.applicationContext");
                String str4 = (String) obj2;
                ArrayList arrayListM79607a = AbstractC26738c.m79607a(viewGroup, applicationContext, rect, str4);
                if (!arrayListM79607a.isEmpty() || (viewFindViewWithTag = activity.getWindow().getDecorView().findViewWithTag(str4)) == null || viewFindViewWithTag.getVisibility() != 0) {
                    return arrayListM79607a;
                }
                Rect rect2 = new Rect();
                return viewFindViewWithTag.getGlobalVisibleRect(rect2) ? AbstractC37056f.m118958J(new C26737b(0, rect2).invoke(new C36065b(activity))) : arrayListM79607a;
            case 28:
                EnumC31071a enumC31071a29 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                C12100f c12100f = ((C26792m) this.f7006x).f106715a;
                String insertId = (String) ((C39408l) ((C39410n) ((InterfaceC39407k) obj2)).m125843a()).get(1);
                AbstractC22676k.m65750j(insertId, "insertId");
                c12100f.f40293d.remove(insertId);
                return c23454a0;
            default:
                EnumC31071a enumC31071a30 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                C27481k c27481k = (C27481k) this.f7006x;
                c27481k.f110702b.enqueue(new C4312c(24, c27481k, (InterfaceC27471a) obj2));
                return c23454a0;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1778e(Object obj, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f7005w = i13;
        this.f7007y = obj;
    }
}
