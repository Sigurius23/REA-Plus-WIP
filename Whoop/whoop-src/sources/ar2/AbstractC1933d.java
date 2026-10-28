package ar2;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import bh.C3247j;
import kd1.AbstractC22403o;
import mh.AbstractC25543k;
import mh.C25540h;
import mh.C25542j;
import p479s4.AbstractC32123d;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22674j;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: ar2.d */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\"\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0080@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Landroid/content/Context;", "context", "Lkd1/o;", "imageSource", "Landroid/graphics/Bitmap;", "a", "(Landroid/content/Context;Lkd1/o;Lq83/d;)Ljava/lang/Object;", "user-journey_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC1933d {

    /* JADX INFO: renamed from: ar2.d$a */
    @InterfaceC32271e(m100429c = "com.whoop.user.journey.view.components.steps.shareablestep.ShareableStepViewKt", m100430f = "ShareableStepView.kt", m100431l = {43}, m100432m = "loadBitmap", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f7670E;

        /* JADX INFO: renamed from: F */
        int f7671F;

        /* JADX INFO: renamed from: G */
        /* synthetic */ Object f7672G;

        /* JADX INFO: renamed from: H */
        int f7673H;

        /* JADX INFO: renamed from: w */
        Object f7674w;

        /* JADX INFO: renamed from: x */
        Object f7675x;

        /* JADX INFO: renamed from: y */
        Object f7676y;

        /* JADX INFO: renamed from: z */
        Object f7677z;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f7672G = obj;
            this.f7673H |= Integer.MIN_VALUE;
            return AbstractC1933d.m5926a(null, null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public static final Object m5926a(Context context, AbstractC22403o abstractC22403o, InterfaceC30057d<? super Bitmap> interfaceC30057d) {
        a aVar;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i13 = aVar.f7673H;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f7673H = i13 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        Object objM9386b = aVar.f7672G;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = aVar.f7673H;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM9386b);
            AbstractC22403o.c cVar = abstractC22403o instanceof AbstractC22403o.c ? (AbstractC22403o.c) abstractC22403o : null;
            if (cVar != null) {
                C3247j c3247jM65738x = AbstractC22674j.m65738x(context);
                C25540h c25540h = new C25540h(context);
                c25540h.f100079c = cVar.getData();
                c25540h.f100090n = Boolean.FALSE;
                C25542j c25542jM75117a = c25540h.m75117a();
                aVar.f7674w = null;
                aVar.f7675x = null;
                aVar.f7676y = null;
                aVar.f7677z = null;
                aVar.f7670E = null;
                aVar.f7671F = 0;
                aVar.f7673H = 1;
                objM9386b = c3247jM65738x.m9386b(c25542jM75117a, aVar);
                if (objM9386b == enumC31071a) {
                    return enumC31071a;
                }
            }
            return null;
        }
        if (i14 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC34132o.m107864I(objM9386b);
        Drawable drawableMo75114a = ((AbstractC25543k) objM9386b).mo75114a();
        if (drawableMo75114a != null) {
            return AbstractC32123d.m100030j(drawableMo75114a);
        }
        return null;
    }
}
