package com.whoop.profile.presentation.edit;

import androidx.compose.runtime.Composer;
import c13.AbstractC3855a;
import c93.InterfaceC4351m;
import com.whoop.design.util.TextResource;
import com.whoop.profile.samples.EditProfileSamples;
import com.whoop.profile.view.edit.EditProfileBottomSheetKt;
import com.whoop.profile.view.edit.form.EditProfileFormState;
import com.whoop.profile.view.edit.form.FieldState;
import dp0.C12253i;
import fy1.C14873i;
import java.util.ArrayList;
import l83.C23454a0;
import m83.C25235a0;
import p027b3.AbstractC2453v1;
import p163g1.EnumC15209z3;
import p390p1.AbstractC28669t1;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28673u1;
import p390p1.C28674u2;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p602x1.AbstractC37817c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22677k0;
import x81.AbstractC38073e;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"Lcom/whoop/profile/presentation/edit/EditProfileViewState$BottomSheetType;", "bottomSheetType", "Ll83/a0;", "EditProfileBottomSheetPreview", "(Lcom/whoop/profile/presentation/edit/EditProfileViewState$BottomSheetType;Landroidx/compose/runtime/Composer;II)V", "profile_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class EditProfileBottomSheetPreviewKt {
    public static final void EditProfileBottomSheetPreview(final EditProfileViewState.BottomSheetType bottomSheetType, Composer composer, int i13, int i14) {
        int i15;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(71073077);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i15 = (c28655q.m87149e(bottomSheetType == null ? -1 : bottomSheetType.ordinal()) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 3) != 2)) {
            if (i16 != 0) {
                bottomSheetType = EditProfileViewState.BottomSheetType.GENDER;
            }
            final EnumC15209z3 enumC15209z3 = EnumC15209z3.f57107x;
            C22677k0 c22677k0 = new C22677k0(10);
            AbstractC28669t1 abstractC28669t1M11815B = AbstractC3855a.m11815B(AbstractC3855a.m11814A(AbstractC3855a.m11816C(AbstractC3855a.m11834r(AbstractC38073e.m121971s(), c22677k0), c22677k0), c22677k0), c22677k0);
            C25235a0 c25235a0 = C25235a0.f99113w;
            c22677k0.m65760a(AbstractC3855a.m11833q(AbstractC3855a.m11842z(c25235a0, AbstractC3855a.m11832p(c25235a0, abstractC28669t1M11815B, c22677k0), c22677k0), C14873i.f55508a, c22677k0).mo86977a(C12253i.f40998a));
            C28674u2 c28674u2 = AbstractC2453v1.f9573l;
            ArrayList arrayList = c22677k0.f89339a;
            AbstractC28683x.m87248b((C28673u1[]) arrayList.toArray(new C28673u1[AbstractC3855a.m11823g(c28674u2, c22677k0, arrayList)]), AbstractC37817c.m121344e(-306980961, c28655q, new InterfaceC4351m() { // from class: com.whoop.profile.presentation.edit.EditProfileBottomSheetPreviewKt$EditProfileBottomSheetPreview$$inlined$WhoopPreviewTheme$1
                @Override // c93.InterfaceC4351m
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C23454a0.f92919a;
                }

                public final void invoke(Composer composer2, int i17) {
                    C28655q c28655q2 = (C28655q) composer2;
                    if (!c28655q2.m87135U(i17 & 1, (i17 & 3) != 2)) {
                        c28655q2.m87138X();
                        return;
                    }
                    c28655q2.m87150e0(-931349145);
                    EditProfileViewState sampleEditProfileViewState = EditProfileSamples.INSTANCE.getSampleEditProfileViewState();
                    EditProfileFormState editProfileFormState = new EditProfileFormState(new FieldState("test@example.com", null, false, false, false, false, 62, null), new FieldState("testuser", null, false, false, false, false, 62, null), new FieldState("John", null, false, false, false, false, 62, null), new FieldState("Doe", null, false, false, false, false, 62, null), new FieldState("175", null, false, false, false, false, 62, null), new FieldState("70", null, false, false, false, false, 62, null), new FieldState("metric", null, false, false, false, false, 62, null), new FieldState("MALE", null, false, false, false, false, 62, null), new FieldState("MALE", null, false, false, false, false, 62, null), new FieldState("US", null, false, false, false, false, 62, null), new FieldState("CA", null, false, false, false, false, 62, null), new FieldState("1990-01-01", null, false, false, false, false, 62, null), new FieldState("San Francisco", null, false, false, false, false, 62, null));
                    Object objM87133R = c28655q2.m87133R();
                    C28676v0 c28676v0 = C28635l.f115821a;
                    if (objM87133R == c28676v0) {
                        objM87133R = new InterfaceC4351m() { // from class: com.whoop.profile.presentation.edit.EditProfileBottomSheetPreviewKt$EditProfileBottomSheetPreview$1$1$1
                            public final void invoke(EditProfileEvent.FieldType fieldType, String str) {
                                AbstractC22676k.m65750j(fieldType, "<unused var>");
                                AbstractC22676k.m65750j(str, "<unused var>");
                            }

                            @Override // c93.InterfaceC4351m
                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                invoke((EditProfileEvent.FieldType) obj, (String) obj2);
                                return C23454a0.f92919a;
                            }
                        };
                        c28655q2.m87172p0(objM87133R);
                    }
                    InterfaceC4351m interfaceC4351m = (InterfaceC4351m) objM87133R;
                    Object objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new Function1() { // from class: com.whoop.profile.presentation.edit.EditProfileBottomSheetPreviewKt$EditProfileBottomSheetPreview$1$2$1
                            public final void invoke(EditProfileEvent.ViewEvent it) {
                                AbstractC22676k.m65750j(it, "it");
                            }

                            @Override // p715kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((EditProfileEvent.ViewEvent) obj);
                                return C23454a0.f92919a;
                            }
                        };
                        c28655q2.m87172p0(objM87133R2);
                    }
                    EditProfileBottomSheetKt.EditProfileBottomSheet(sampleEditProfileViewState, editProfileFormState, interfaceC4351m, (Function1) objM87133R2, enumC15209z3, bottomSheetType, ComposableSingletons$EditProfileBottomSheetPreviewKt.INSTANCE.getLambda$259284293$profile_release(), c28655q2, (TextResource.$stable << 3) | 1600896, 0);
                    c28655q2.m87173q(false);
                }
            }), c28655q, 56);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C9723b(bottomSheetType, i13, i14, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 EditProfileBottomSheetPreview$lambda$1(EditProfileViewState.BottomSheetType bottomSheetType, int i13, int i14, Composer composer, int i15) {
        EditProfileBottomSheetPreview(bottomSheetType, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
