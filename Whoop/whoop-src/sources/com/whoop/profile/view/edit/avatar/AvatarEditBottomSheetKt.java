package com.whoop.profile.view.edit.avatar;

import a01.C0089i;
import android.content.Context;
import android.graphics.Rect;
import android.net.Uri;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.graphics.AbstractC1127a;
import androidx.compose.p018ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import c93.InterfaceC4351m;
import com.mapbox.maps.MapboxMap;
import com.whoop.data.local.room.dao.persistent.C6498i;
import com.whoop.profile.C9691R;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p088dc.AbstractC11894a;
import p181h2.C16617b;
import p208i2.C17903p;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23010x;
import p390p1.AbstractC28683x;
import p390p1.C28617g1;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28690z0;
import p490t0.AbstractC33253j;
import p512u2.AbstractC34452c0;
import p635y2.C39102j;
import p635y2.InterfaceC39127r0;
import p636y3.C39180l;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a/\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\u000e²\u0006\u000e\u0010\t\u001a\u00020\b8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u000b\u001a\u00020\n8\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010\r\u001a\u0004\u0018\u00010\f8\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Landroid/net/Uri;", "imageUri", "Lkotlin/Function1;", "Landroid/graphics/Rect;", "Ll83/a0;", "onCropBoundsChanged", "PhotoCropDisplay", "(Landroid/net/Uri;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "scale", "Lh2/b;", MapboxMap.QFE_OFFSET, "Ly3/l;", "imageSize", "profile_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class AvatarEditBottomSheetKt {
    /* JADX WARN: Code duplicated, block: B:23:0x0047  */
    /* JADX WARN: Code duplicated, block: B:24:0x0049  */
    /* JADX WARN: Code duplicated, block: B:27:0x0052  */
    /* JADX WARN: Code duplicated, block: B:29:0x0056  */
    /* JADX WARN: Code duplicated, block: B:31:0x005c  */
    /* JADX WARN: Code duplicated, block: B:33:0x006a  */
    /* JADX WARN: Code duplicated, block: B:36:0x0073  */
    /* JADX WARN: Code duplicated, block: B:39:0x0081  */
    /* JADX WARN: Code duplicated, block: B:40:0x0092  */
    /* JADX WARN: Code duplicated, block: B:43:0x009f  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:50:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:51:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:55:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:60:0x014e  */
    /* JADX WARN: Code duplicated, block: B:61:0x0152  */
    /* JADX WARN: Code duplicated, block: B:66:0x0173  */
    /* JADX WARN: Code duplicated, block: B:69:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:70:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:75:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:78:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:79:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:82:0x0286  */
    /* JADX WARN: Code duplicated, block: B:83:0x028a  */
    /* JADX WARN: Code duplicated, block: B:88:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:90:0x032f  */
    /* JADX WARN: Code duplicated, block: B:93:0x0339  */
    /* JADX WARN: Code duplicated, block: B:95:? A[RETURN, SYNTHETIC] */
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
    public static final void PhotoCropDisplay(Uri imageUri, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        Function1 function2;
        boolean z4;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        Function1 function4;
        Object objM87133R;
        InterfaceC28690z0 interfaceC28690z0;
        Object objM87133R2;
        InterfaceC28601c1 interfaceC28601c1;
        Object objM87133R3;
        InterfaceC28601c1 interfaceC28601c2;
        Context context;
        boolean zM87157i;
        Object objM87133R4;
        boolean z13;
        Object avatarEditBottomSheetKt$PhotoCropDisplay$3$1;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        int iHashCode2;
        Object objM87133R5;
        InterfaceC28601c1 interfaceC28601c3;
        int iHashCode3;
        Object objM87133R6;
        AbstractC22676k.m65750j(imageUri, "imageUri");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-506701345);
        if ((i13 & 6) == 0) {
            i15 = i13 | (c28655q.m87157i(imageUri) ? 4 : 2);
        } else {
            i15 = i13;
        }
        int i16 = i14 & 2;
        if (i16 == 0) {
            if ((i13 & 48) == 0) {
                function2 = function1;
                i15 |= c28655q.m87157i(function2) ? 32 : 16;
            }
            if ((i15 & 19) != 18) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R6 = c28655q.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = new C6498i(28);
                        c28655q.m87172p0(objM87133R6);
                    }
                    function4 = (Function1) objM87133R6;
                } else {
                    function4 = function2;
                }
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC11266d.m30468v(1.0f, c28655q);
                }
                interfaceC28690z0 = (InterfaceC28690z0) objM87133R;
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC28683x.m87272z(new C16617b(0L));
                    c28655q.m87172p0(objM87133R2);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                objM87133R3 = c28655q.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = AbstractC28683x.m87272z(null);
                    c28655q.m87172p0(objM87133R3);
                }
                interfaceC28601c2 = (InterfaceC28601c1) objM87133R3;
                context = (Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b);
                zM87157i = c28655q.m87157i(context) | c28655q.m87157i(imageUri);
                objM87133R4 = c28655q.m87133R();
                if (zM87157i || objM87133R4 == c28676v0) {
                    objM87133R4 = new AvatarEditBottomSheetKt$PhotoCropDisplay$2$1(context, imageUri, interfaceC28601c2, null);
                    c28655q.m87172p0(objM87133R4);
                }
                int i17 = i15 & 14;
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R4, imageUri);
                Float fValueOf = Float.valueOf(PhotoCropDisplay$lambda$2(interfaceC28690z0));
                C16617b c16617b = new C16617b(PhotoCropDisplay$lambda$5(interfaceC28601c1));
                C39180l c39180lPhotoCropDisplay$lambda$8 = PhotoCropDisplay$lambda$8(interfaceC28601c2);
                if ((i15 & 112) == 32) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                Object objM87133R7 = c28655q.m87133R();
                if (!z13 || objM87133R7 == c28676v0) {
                    avatarEditBottomSheetKt$PhotoCropDisplay$3$1 = new AvatarEditBottomSheetKt$PhotoCropDisplay$3$1(function4, interfaceC28601c2, interfaceC28690z0, interfaceC28601c1, null);
                    c28655q.m87172p0(avatarEditBottomSheetKt$PhotoCropDisplay$3$1);
                } else {
                    avatarEditBottomSheetKt$PhotoCropDisplay$3$1 = objM87133R7;
                }
                AbstractC28683x.m87255i(fValueOf, c16617b, c39180lPhotoCropDisplay$lambda$8, (InterfaceC4351m) avatarEditBottomSheetKt$PhotoCropDisplay$3$1, c28655q);
                C2314t c2314t = C2314t.f9131w;
                float f13 = 8;
                float f14 = 2 * f13;
                Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, f14, 1);
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3396r);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i2 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a);
                C0209i c0209i3 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                C0209i c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
                Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3409f);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC39127r0M66763d);
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m2);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
                float f15 = 4;
                Modifier modifierM118994r = AbstractC37056f.m118994r(AbstractC1102d.m3419p(63 * f15, c2314t), AbstractC33253j.f138651a);
                objM87133R5 = c28655q.m87133R();
                if (objM87133R5 == c28676v0) {
                    interfaceC28601c3 = interfaceC28601c1;
                    objM87133R5 = new AvatarEditBottomSheetKt$PhotoCropDisplay$4$1$1$1(interfaceC28690z0, interfaceC28601c3);
                    c28655q.m87172p0(objM87133R5);
                } else {
                    interfaceC28601c3 = interfaceC28601c1;
                }
                AbstractC11894a.m31954c(imageUri, "Selected photo", AbstractC1127a.m3488c(AbstractC34452c0.m108903b(modifierM118994r, C23454a0.f92919a, (PointerInputEventHandler) objM87133R5), PhotoCropDisplay$lambda$2(interfaceC28690z0), PhotoCropDisplay$lambda$2(interfaceC28690z0), 0.0f, Float.intBitsToFloat((int) (PhotoCropDisplay$lambda$5(interfaceC28601c3) >> 32)), Float.intBitsToFloat((int) (PhotoCropDisplay$lambda$5(interfaceC28601c3) & 4294967295L)), 0.0f, null, null, 0, 524260), null, C39102j.f168199a, 0.0f, c28655q, i17 | 1572912, 952);
                c28655q.m87173q(true);
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f15 * f13, c2314t));
                Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t);
                C38072d c38072d = C38072d.f163053a;
                int i18 = C38072d.f163054b;
                Modifier modifierM3394p = AbstractC1099a.m3394p(f14, AbstractC31061c.m95629e(modifierM3409f2, 3, f15, c38072d.m121949b(c28655q, i18).getNeutral15()));
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 54);
                iHashCode3 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3394p);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i2, c22994r1M66759a);
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m3);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N3);
                AbstractC29125c.m88522c(AbstractC29125c.m88500I(C9691R.drawable.profile_gesture_pinch, c28655q, 0), null, AbstractC1102d.m3419p(5 * f15, c2314t), null, null, 0.0f, new C17903p(c38072d.m121949b(c28655q, i18).getRecovery(), 5), c28655q, 432, 56);
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3424u(f14, c2314t));
                AbstractC30795n.m94707h(AbstractC30060g.m92103Y(c28655q, C9691R.string.profile_avatar_zoom_and_move_photo), null, c38072d.m121949b(c28655q, i18).getRecovery(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i18).getB2(), null, c28655q, 0, C2886a.f11498d << 18, 196602);
                c28655q = c28655q;
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                function3 = function4;
            } else {
                c28655q.m87138X();
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C0089i(imageUri, i13, function3, i14, 25);
            }
        }
        i15 |= 48;
        function2 = function1;
        if ((i15 & 19) != 18) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c28676v0 = C28635l.f115821a;
            if (i16 != 0) {
                objM87133R6 = c28655q.m87133R();
                if (objM87133R6 == c28676v0) {
                    objM87133R6 = new C6498i(28);
                    c28655q.m87172p0(objM87133R6);
                }
                function4 = (Function1) objM87133R6;
            } else {
                function4 = function2;
            }
            objM87133R = c28655q.m87133R();
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC11266d.m30468v(1.0f, c28655q);
            }
            interfaceC28690z0 = (InterfaceC28690z0) objM87133R;
            objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = AbstractC28683x.m87272z(new C16617b(0L));
                c28655q.m87172p0(objM87133R2);
            }
            interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
            objM87133R3 = c28655q.m87133R();
            if (objM87133R3 == c28676v0) {
                objM87133R3 = AbstractC28683x.m87272z(null);
                c28655q.m87172p0(objM87133R3);
            }
            interfaceC28601c2 = (InterfaceC28601c1) objM87133R3;
            context = (Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b);
            zM87157i = c28655q.m87157i(context) | c28655q.m87157i(imageUri);
            objM87133R4 = c28655q.m87133R();
            if (zM87157i) {
                objM87133R4 = new AvatarEditBottomSheetKt$PhotoCropDisplay$2$1(context, imageUri, interfaceC28601c2, null);
                c28655q.m87172p0(objM87133R4);
            } else {
                objM87133R4 = new AvatarEditBottomSheetKt$PhotoCropDisplay$2$1(context, imageUri, interfaceC28601c2, null);
                c28655q.m87172p0(objM87133R4);
            }
            int i19 = i15 & 14;
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R4, imageUri);
            Float fValueOf2 = Float.valueOf(PhotoCropDisplay$lambda$2(interfaceC28690z0));
            C16617b c16617b2 = new C16617b(PhotoCropDisplay$lambda$5(interfaceC28601c1));
            C39180l c39180lPhotoCropDisplay$lambda$9 = PhotoCropDisplay$lambda$8(interfaceC28601c2);
            if ((i15 & 112) == 32) {
                z13 = true;
            } else {
                z13 = false;
            }
            Object objM87133R8 = c28655q.m87133R();
            if (z13) {
                avatarEditBottomSheetKt$PhotoCropDisplay$3$1 = new AvatarEditBottomSheetKt$PhotoCropDisplay$3$1(function4, interfaceC28601c2, interfaceC28690z0, interfaceC28601c1, null);
                c28655q.m87172p0(avatarEditBottomSheetKt$PhotoCropDisplay$3$1);
            } else {
                avatarEditBottomSheetKt$PhotoCropDisplay$3$1 = new AvatarEditBottomSheetKt$PhotoCropDisplay$3$1(function4, interfaceC28601c2, interfaceC28690z0, interfaceC28601c1, null);
                c28655q.m87172p0(avatarEditBottomSheetKt$PhotoCropDisplay$3$1);
            }
            AbstractC28683x.m87255i(fValueOf2, c16617b2, c39180lPhotoCropDisplay$lambda$9, (InterfaceC4351m) avatarEditBottomSheetKt$PhotoCropDisplay$3$1, c28655q);
            C2314t c2314t2 = C2314t.f9131w;
            float f16 = 8;
            float f17 = 2 * f16;
            Modifier modifierM3396r2 = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t2), 0.0f, f17, 1);
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3396r2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i5 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i5, c23010xM66775a2);
            C0209i c0209i6 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m4);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            C0209i c0209i7 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N4);
            Modifier modifierM3409f3 = AbstractC1102d.m3409f(1.0f, c2314t2);
            InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9102E, false);
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
            Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierM3409f3);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, interfaceC39127r0M66763d2);
            AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m5);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N5);
            float f18 = 4;
            Modifier modifierM118994r2 = AbstractC37056f.m118994r(AbstractC1102d.m3419p(63 * f18, c2314t2), AbstractC33253j.f138651a);
            objM87133R5 = c28655q.m87133R();
            if (objM87133R5 == c28676v0) {
                interfaceC28601c3 = interfaceC28601c1;
                objM87133R5 = new AvatarEditBottomSheetKt$PhotoCropDisplay$4$1$1$1(interfaceC28690z0, interfaceC28601c3);
                c28655q.m87172p0(objM87133R5);
            } else {
                interfaceC28601c3 = interfaceC28601c1;
            }
            AbstractC11894a.m31954c(imageUri, "Selected photo", AbstractC1127a.m3488c(AbstractC34452c0.m108903b(modifierM118994r2, C23454a0.f92919a, (PointerInputEventHandler) objM87133R5), PhotoCropDisplay$lambda$2(interfaceC28690z0), PhotoCropDisplay$lambda$2(interfaceC28690z0), 0.0f, Float.intBitsToFloat((int) (PhotoCropDisplay$lambda$5(interfaceC28601c3) >> 32)), Float.intBitsToFloat((int) (PhotoCropDisplay$lambda$5(interfaceC28601c3) & 4294967295L)), 0.0f, null, null, 0, 524260), null, C39102j.f168199a, 0.0f, c28655q, i19 | 1572912, 952);
            c28655q.m87173q(true);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f18 * f16, c2314t2));
            Modifier modifierM3409f4 = AbstractC1102d.m3409f(1.0f, c2314t2);
            C38072d c38072d2 = C38072d.f163053a;
            int i110 = C38072d.f163054b;
            Modifier modifierM3394p2 = AbstractC1099a.m3394p(f17, AbstractC31061c.m95629e(modifierM3409f4, 3, f18, c38072d2.m121949b(c28655q, i110).getNeutral15()));
            C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 54);
            iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
            Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, modifierM3394p2);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, c22994r1M66759a2);
            AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m6);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N6);
            AbstractC29125c.m88522c(AbstractC29125c.m88500I(C9691R.drawable.profile_gesture_pinch, c28655q, 0), null, AbstractC1102d.m3419p(5 * f18, c2314t2), null, null, 0.0f, new C17903p(c38072d2.m121949b(c28655q, i110).getRecovery(), 5), c28655q, 432, 56);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3424u(f17, c2314t2));
            AbstractC30795n.m94707h(AbstractC30060g.m92103Y(c28655q, C9691R.string.profile_avatar_zoom_and_move_photo), null, c38072d2.m121949b(c28655q, i110).getRecovery(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q, i110).getB2(), null, c28655q, 0, C2886a.f11498d << 18, 196602);
            c28655q = c28655q;
            c28655q.m87173q(true);
            c28655q.m87173q(true);
            function3 = function4;
        } else {
            c28655q.m87138X();
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0089i(imageUri, i13, function3, i14, 25);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 PhotoCropDisplay$lambda$0$0(Rect rect) {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 PhotoCropDisplay$lambda$13(Uri uri, Function1 function1, int i13, int i14, Composer composer, int i15) {
        PhotoCropDisplay(uri, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float PhotoCropDisplay$lambda$2(InterfaceC28690z0 interfaceC28690z0) {
        return ((C28617g1) interfaceC28690z0).m87022x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void PhotoCropDisplay$lambda$3(InterfaceC28690z0 interfaceC28690z0, float f13) {
        ((C28617g1) interfaceC28690z0).m87023y(f13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long PhotoCropDisplay$lambda$5(InterfaceC28601c1 interfaceC28601c1) {
        return ((C16617b) interfaceC28601c1.getValue()).f63937a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void PhotoCropDisplay$lambda$6(InterfaceC28601c1 interfaceC28601c1, long j7) {
        interfaceC28601c1.setValue(new C16617b(j7));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C39180l PhotoCropDisplay$lambda$8(InterfaceC28601c1 interfaceC28601c1) {
        return (C39180l) interfaceC28601c1.getValue();
    }
}
