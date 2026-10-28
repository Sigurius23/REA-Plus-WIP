package com.whoop.profile.presentation.edit;

import androidx.compose.runtime.Composer;
import aws.smithy.kotlin.runtime.time.IncompleteException;
import aws.smithy.kotlin.runtime.time.ParseException;
import aws.smithy.kotlin.runtime.time.TakeWhileMNException;
import c93.InterfaceC4351m;
import com.whoop.profile.view.edit.EditProfileScreenKt;
import gz0.EnumC16313m0;
import i93.C18284j;
import o01.AbstractC27348d;
import p031b9.AbstractC2875y;
import p114eb.AbstractC12939a0;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22672i;
import ug.AbstractC34924m;
import ug.C34915d;
import ug.C34917f;
import ug.C34923l;
import w31.AbstractC36791e;
import w31.EnumC36788b;
import w90.AbstractC36952b;

/* JADX INFO: renamed from: com.whoop.profile.presentation.edit.b */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C9723b implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f28345w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ int f28346x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ int f28347y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f28348z;

    public /* synthetic */ C9723b(InterfaceC4351m interfaceC4351m, int i13, int i14) {
        this.f28345w = 3;
        this.f28346x = i13;
        this.f28347y = i14;
        this.f28348z = interfaceC4351m;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.i] */
    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f28345w) {
            case 0:
                return EditProfileBottomSheetPreviewKt.EditProfileBottomSheetPreview$lambda$1((EditProfileViewState.BottomSheetType) this.f28348z, this.f28346x, this.f28347y, (Composer) obj, ((Integer) obj2).intValue());
            case 1:
                return EditProfileScreenKt.EditProfileScreen$lambda$26((AbstractC12939a0) this.f28348z, this.f28346x, this.f28347y, (Composer) obj, ((Integer) obj2).intValue());
            case 2:
                return AbstractC27348d.m82521e((EnumC16313m0) this.f28348z, this.f28346x, this.f28347y, (Composer) obj, ((Integer) obj2).intValue());
            case 3:
                int i13 = this.f28346x;
                int i14 = this.f28347y;
                InterfaceC4351m interfaceC4351m = (InterfaceC4351m) this.f28348z;
                String str = (String) obj;
                Integer num = (Integer) obj2;
                int iIntValue = num.intValue();
                AbstractC22676k.m65750j(str, "str");
                AbstractC34924m.m110128J(iIntValue, 0, str);
                try {
                    C34917f c34917f = (C34917f) new C9723b(C34923l.f147041w, i14, i13).invoke(str, num);
                    int i15 = c34917f.f147021a;
                    C18284j c18284j = (C18284j) c34917f.f147022b;
                    if (c18284j.isEmpty()) {
                        throw new ParseException(str, "expected integer", iIntValue);
                    }
                    return new C34917f(i15, (Number) interfaceC4351m.invoke(str, c18284j));
                } catch (IncompleteException e5) {
                    throw new ParseException(str, AbstractC34924m.m110119A(i13, i14, i13, String.valueOf(e5.f8405x)), iIntValue);
                } catch (TakeWhileMNException e13) {
                    throw new ParseException(str, AbstractC34924m.m110119A(i13, i14, e13.f8406x, "found " + e13.f8407y), iIntValue);
                }
            case 4:
                ?? r10 = (C22672i) this.f28348z;
                String str2 = (String) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                AbstractC22676k.m65750j(str2, "str");
                int i16 = this.f28346x;
                int i17 = this.f28347y;
                if (i16 < i17) {
                    throw new IllegalArgumentException(AbstractC2875y.m8294g(i17, i16, "min m=", " cannot be greater than max=").toString());
                }
                AbstractC34924m.m110128J(iIntValue2, 0, str2);
                int i18 = iIntValue2;
                while (i18 < str2.length() && i18 - iIntValue2 < i16 && ((Boolean) r10.invoke(Character.valueOf(str2.charAt(i18)))).booleanValue()) {
                    i18++;
                }
                int i19 = i18 - iIntValue2;
                if (i19 >= i17) {
                    return new C34917f(i18, new C18284j(iIntValue2, i18 - 1, 1));
                }
                if (i18 >= str2.length()) {
                    throw new IncompleteException(str2, new C34915d(i17 - i19));
                }
                throw new TakeWhileMNException(str2, i18, i17, i19);
            case 5:
                return AbstractC36791e.m117897i((EnumC36788b) this.f28348z, this.f28346x, this.f28347y, (Composer) obj, ((Integer) obj2).intValue());
            default:
                return AbstractC36952b.m118661r((String) this.f28348z, this.f28346x, this.f28347y, (Composer) obj, ((Integer) obj2).intValue());
        }
    }

    public /* synthetic */ C9723b(Object obj, int i13, int i14, int i15) {
        this.f28345w = i15;
        this.f28348z = obj;
        this.f28346x = i13;
        this.f28347y = i14;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ C9723b(Function1 function1, int i13, int i14) {
        this.f28345w = 4;
        this.f28346x = i13;
        this.f28347y = i14;
        this.f28348z = (C22672i) function1;
    }
}
