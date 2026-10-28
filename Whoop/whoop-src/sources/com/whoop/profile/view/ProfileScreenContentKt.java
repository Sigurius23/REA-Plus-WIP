package com.whoop.profile.view;

import a01.C0086f;
import a80.C0542f;
import a81.C0559j;
import am2.C1042s;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.lazy.InterfaceC1103a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import bf0.C3189a;
import bj0.C3328a;
import bz0.C3713c;
import c13.AbstractC3855a;
import c41.AbstractC4066l4;
import c41.C4018e5;
import c41.C4108r4;
import c41.EnumC4073m4;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.data.local.room.dao.persistent.C6498i;
import com.whoop.design.models.modal.C8527a;
import com.whoop.profile.presentation.ProfileEvent;
import com.whoop.profile.presentation.ProfileViewState;
import com.whoop.profile.samples.ProfileSamples;
import com.whoop.profile.view.components.ContextHubTileItem;
import com.whoop.profile.view.components.ContextHubTileViewState;
import com.whoop.profile.view.components.ReferralsTileItem;
import com.whoop.profile.view.components.ReferralsTileKt;
import com.whoop.profile.view.components.ReferralsTileViewState;
import com.whoop.profile.view.components.StreaksTileItem;
import com.whoop.profile.view.components.StreaksTileKt;
import com.whoop.profile.view.components.StreaksTileViewState;
import dp0.C12253i;
import fy1.C14873i;
import gb1.AbstractC15689q;
import j93.InterfaceC21461d;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import l83.C23454a0;
import m83.AbstractC25265s;
import m83.C25235a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p000.C0003a0;
import p000.C22931l;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C22944c2;
import p291l0.C22949e;
import p291l0.C22976l1;
import p291l0.C23010x;
import p293l2.C23224a;
import p329n0.AbstractC26071x;
import p329n0.C26068u;
import p329n0.InterfaceC26064q;
import p390p1.AbstractC28669t1;
import p390p1.AbstractC28683x;
import p390p1.C28621h1;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28673u1;
import p390p1.C28674u2;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22674j;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.C22677k0;
import p720m91.AbstractC25303l;
import p720m91.C25306o;
import p720m91.C25307p;
import p720m91.C25308q;
import p720m91.Function1;
import p720m91.InterfaceC25297f;
import wb3.AbstractC37056f;
import wr0.C37519b0;
import wr0.C37562x;
import x81.AbstractC38073e;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aY\u0010\f\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\u0004H\u0001¢\u0006\u0004\b\f\u0010\r\u001a-\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00060\u0004H\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u000f\u0010\u0013\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0013\u0010\u0014\"\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Lcom/whoop/profile/presentation/ProfileViewState$ScreenContent;", "screenContent", "Lcom/whoop/profile/presentation/ProfileViewState$Metadata;", "metadata", "Lkotlin/Function1;", "Lcom/whoop/profile/presentation/ProfileEvent;", "Ll83/a0;", "onEvent", "Lkotlin/Function0;", "onOpenBottomSheet", "", "onScrollOffsetChanged", "ProfileContentArea", "(Lcom/whoop/profile/presentation/ProfileViewState$ScreenContent;Lcom/whoop/profile/presentation/ProfileViewState$Metadata;Lkotlin/jvm/functions/Function1;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lm91/o;", "itemWrapper", "", "ProfileScreenItem", "(Lm91/o;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "PreviewProfileContentArea", "(Landroidx/compose/runtime/Composer;I)V", "Lm91/p;", "profileItemViewFactory", "Lm91/p;", "profile_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class ProfileScreenContentKt {
    private static final C25307p profileItemViewFactory = Function1.m74306g(new C6498i(17));

    public static final void PreviewProfileContentArea(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(2117931031);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            final List listM74156w1 = AbstractC25265s.m74156w1(AbstractC4066l4.m12461v(), 2);
            C22677k0 c22677k0 = new C22677k0(10);
            AbstractC28669t1 abstractC28669t1M11815B = AbstractC3855a.m11815B(AbstractC3855a.m11814A(AbstractC3855a.m11816C(AbstractC3855a.m11834r(AbstractC38073e.m121971s(), c22677k0), c22677k0), c22677k0), c22677k0);
            C25235a0 c25235a0 = C25235a0.f99113w;
            c22677k0.m65760a(AbstractC3855a.m11833q(AbstractC3855a.m11842z(c25235a0, AbstractC3855a.m11832p(c25235a0, abstractC28669t1M11815B, c22677k0), c22677k0), C14873i.f55508a, c22677k0).mo86977a(C12253i.f40998a));
            C28674u2 c28674u2 = AbstractC2453v1.f9573l;
            ArrayList arrayList = c22677k0.f89339a;
            AbstractC28683x.m87248b((C28673u1[]) arrayList.toArray(new C28673u1[AbstractC3855a.m11823g(c28674u2, c22677k0, arrayList)]), AbstractC37817c.m121344e(-306980961, c28655q, new InterfaceC4351m() { // from class: com.whoop.profile.view.ProfileScreenContentKt$PreviewProfileContentArea$$inlined$WhoopPreviewTheme$1
                @Override // c93.InterfaceC4351m
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C23454a0.f92919a;
                }

                public final void invoke(Composer composer2, int i14) {
                    C28655q c28655q2 = (C28655q) composer2;
                    if (!c28655q2.m87135U(i14 & 1, (i14 & 3) != 2)) {
                        c28655q2.m87138X();
                        return;
                    }
                    c28655q2.m87150e0(-1713985519);
                    ProfileSamples profileSamples = ProfileSamples.INSTANCE;
                    ProfileViewState sampleProfileViewState = profileSamples.getSampleProfileViewState();
                    C4108r4 c4108r4 = (C4108r4) listM74156w1.get(0);
                    EnumC4073m4 enumC4073m4 = EnumC4073m4.DOUBLE;
                    ProfileViewState profileViewStateCopy$default = ProfileViewState.copy$default(sampleProfileViewState, null, null, null, null, profileSamples.getSampleProfileViewStateMetadata(), new ProfileViewState.ScreenContent(AbstractC37056f.m118958J(new ProfileViewState.ComponentItem(AbstractC37056f.m118959K(new C25306o(new C4018e5(C4108r4.m12654b(c4108r4, null, enumC4073m4, null, null, null, null, null, null, null, null, null, null, 4093, null), C4108r4.m12654b((C4108r4) listM74156w1.get(1), null, enumC4073m4, null, null, null, null, null, null, null, null, null, null, 4093, null), false, 4, null), null, 2, null), new C25306o(StreaksTileKt.getSampleStreaksTileWithStreak(), null, 2, null), new C25306o(ReferralsTileKt.getSampleReferralsTileWithActiveReferrals(), null, 2, null)), null, 2, null))), 15, null);
                    Object objM87133R = c28655q2.m87133R();
                    if (objM87133R == C28635l.f115821a) {
                        objM87133R = new p715kotlin.jvm.functions.Function1() { // from class: com.whoop.profile.view.ProfileScreenContentKt$PreviewProfileContentArea$1$1$1
                            public final void invoke(ProfileEvent it) {
                                AbstractC22676k.m65750j(it, "it");
                            }

                            @Override // p715kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((ProfileEvent) obj);
                                return C23454a0.f92919a;
                            }
                        };
                        c28655q2.m87172p0(objM87133R);
                    }
                    ProfileScreenKt.ProfileScreen(profileViewStateCopy$default, null, (p715kotlin.jvm.functions.Function1) objM87133R, c28655q2, 384, 2);
                    c28655q2.m87173q(false);
                }
            }), c28655q, 56);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3713c(i13, 23);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 PreviewProfileContentArea$lambda$1(int i13, Composer composer, int i14) {
        PreviewProfileContentArea(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0071  */
    /* JADX WARN: Code duplicated, block: B:39:0x0076  */
    /* JADX WARN: Code duplicated, block: B:41:0x007a  */
    /* JADX WARN: Code duplicated, block: B:43:0x0082  */
    /* JADX WARN: Code duplicated, block: B:44:0x0085  */
    /* JADX WARN: Code duplicated, block: B:48:0x008f  */
    /* JADX WARN: Code duplicated, block: B:49:0x0091  */
    /* JADX WARN: Code duplicated, block: B:52:0x009a  */
    /* JADX WARN: Code duplicated, block: B:54:0x009e  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:63:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:66:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:69:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:70:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:73:0x00f5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:74:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:77:0x0125  */
    /* JADX WARN: Code duplicated, block: B:78:0x0127  */
    /* JADX WARN: Code duplicated, block: B:81:0x012f  */
    /* JADX WARN: Code duplicated, block: B:82:0x0131  */
    /* JADX WARN: Code duplicated, block: B:85:0x013f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:88:0x0144  */
    /* JADX WARN: Code duplicated, block: B:90:0x016a  */
    /* JADX WARN: Code duplicated, block: B:93:0x0177  */
    /* JADX WARN: Code duplicated, block: B:95:? A[RETURN, SYNTHETIC] */
    public static final void ProfileContentArea(ProfileViewState.ScreenContent screenContent, ProfileViewState.Metadata metadata, p715kotlin.jvm.functions.Function1 onEvent, InterfaceC4339a interfaceC4339a, p715kotlin.jvm.functions.Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        InterfaceC4339a interfaceC4339a2;
        int i16;
        p715kotlin.jvm.functions.Function1 function2;
        int i17;
        int i18;
        boolean z4;
        C28655q c28655q;
        InterfaceC4339a interfaceC4339a3;
        p715kotlin.jvm.functions.Function1 function3;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        p715kotlin.jvm.functions.Function1 function4;
        C26068u c26068uM77569a;
        Object objM87133R;
        int i19;
        boolean z13;
        Object objM87133R2;
        boolean z14;
        boolean z15;
        boolean zM87157i;
        Object objM87133R3;
        InterfaceC4339a interfaceC4339a4;
        Object objM87133R4;
        Object objM87133R5;
        AbstractC22676k.m65750j(screenContent, "screenContent");
        AbstractC22676k.m65750j(metadata, "metadata");
        AbstractC22676k.m65750j(onEvent, "onEvent");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-2120761129);
        if ((i13 & 6) == 0) {
            i15 = (c28655q2.m87157i(screenContent) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q2.m87157i(metadata) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q2.m87157i(onEvent) ? 256 : 128;
        }
        int i24 = i14 & 8;
        if (i24 == 0) {
            if ((i13 & 3072) == 0) {
                interfaceC4339a2 = interfaceC4339a;
                i15 |= c28655q2.m87157i(interfaceC4339a2) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            i16 = i14 & 16;
            if (i16 != 0) {
                if ((i13 & 24576) == 0) {
                    function2 = function1;
                    if (c28655q2.m87157i(function2)) {
                        i17 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i17 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i17;
                }
                i18 = 0;
                if ((i15 & 9363) != 9362) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q2.m87135U(i15 & 1, z4)) {
                    c28676v0 = C28635l.f115821a;
                    if (i24 != 0) {
                        objM87133R5 = c28655q2.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C8527a(9);
                            c28655q2.m87172p0(objM87133R5);
                        }
                        interfaceC4339a2 = (InterfaceC4339a) objM87133R5;
                    }
                    if (i16 != 0) {
                        objM87133R4 = c28655q2.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C6498i(18);
                            c28655q2.m87172p0(objM87133R4);
                        }
                        function4 = (p715kotlin.jvm.functions.Function1) objM87133R4;
                    } else {
                        function4 = function2;
                    }
                    c26068uM77569a = AbstractC26071x.m77569a(0, 0, c28655q2, 3);
                    objM87133R = c28655q2.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC28683x.m87264r(new C9749c(c26068uM77569a, i18));
                        c28655q2.m87172p0(objM87133R);
                    }
                    function4.invoke(((InterfaceC28670t2) objM87133R).getValue());
                    i19 = i15 & 896;
                    if (i19 == 256) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objM87133R2 = c28655q2.m87133R();
                    if (z13 || objM87133R2 == c28676v0) {
                        objM87133R2 = new C3189a(onEvent, 27);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    AbstractC15689q.m44141i(c26068uM77569a, (InterfaceC4339a) objM87133R2, c28655q2, 0);
                    C2305k c2305k = C2299e.f9111N;
                    WeakHashMap weakHashMap = C22944c2.f90553v;
                    C22976l1 c22976l1M3381c = AbstractC1099a.m3381c(0.0f, 0.0f, 0.0f, AbstractC22953f.m66717e(C22949e.m66712e(c28655q2).f90558e, c28655q2).mo43109a(), 7);
                    boolean zM87157i2 = c28655q2.m87157i(metadata);
                    if (i19 == 256) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    boolean z16 = z14 | zM87157i2;
                    if ((i15 & 7168) == 2048) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    zM87157i = z16 | z15 | c28655q2.m87157i(screenContent);
                    objM87133R3 = c28655q2.m87133R();
                    if (!zM87157i || objM87133R3 == c28676v0) {
                        interfaceC4339a4 = interfaceC4339a2;
                        C1042s c1042s = new C1042s(metadata, onEvent, interfaceC4339a4, screenContent, 11);
                        c28655q2.m87172p0(c1042s);
                        objM87133R3 = c1042s;
                    } else {
                        interfaceC4339a4 = interfaceC4339a2;
                    }
                    c28655q = c28655q2;
                    AbstractC22674j.m65717c(null, c26068uM77569a, c22976l1M3381c, null, c2305k, null, false, null, (p715kotlin.jvm.functions.Function1) objM87133R3, c28655q, ProfileVerifier.CompilationStatus.f6515xf2722a21, 473);
                    function3 = function4;
                    interfaceC4339a3 = interfaceC4339a4;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    interfaceC4339a3 = interfaceC4339a2;
                    function3 = function2;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C0086f((Object) screenContent, (Object) metadata, onEvent, (Object) interfaceC4339a3, (Object) function3, i13, i14, 15);
                }
            }
            i15 |= 24576;
            function2 = function1;
            i18 = 0;
            if ((i15 & 9363) != 9362) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i24 != 0) {
                    objM87133R5 = c28655q2.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C8527a(9);
                        c28655q2.m87172p0(objM87133R5);
                    }
                    interfaceC4339a2 = (InterfaceC4339a) objM87133R5;
                }
                if (i16 != 0) {
                    objM87133R4 = c28655q2.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C6498i(18);
                        c28655q2.m87172p0(objM87133R4);
                    }
                    function4 = (p715kotlin.jvm.functions.Function1) objM87133R4;
                } else {
                    function4 = function2;
                }
                c26068uM77569a = AbstractC26071x.m77569a(0, 0, c28655q2, 3);
                objM87133R = c28655q2.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87264r(new C9749c(c26068uM77569a, i18));
                    c28655q2.m87172p0(objM87133R);
                }
                function4.invoke(((InterfaceC28670t2) objM87133R).getValue());
                i19 = i15 & 896;
                if (i19 == 256) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objM87133R2 = c28655q2.m87133R();
                if (z13) {
                    objM87133R2 = new C3189a(onEvent, 27);
                    c28655q2.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C3189a(onEvent, 27);
                    c28655q2.m87172p0(objM87133R2);
                }
                AbstractC15689q.m44141i(c26068uM77569a, (InterfaceC4339a) objM87133R2, c28655q2, 0);
                C2305k c2305k2 = C2299e.f9111N;
                WeakHashMap weakHashMap2 = C22944c2.f90553v;
                C22976l1 c22976l1M3381c2 = AbstractC1099a.m3381c(0.0f, 0.0f, 0.0f, AbstractC22953f.m66717e(C22949e.m66712e(c28655q2).f90558e, c28655q2).mo43109a(), 7);
                boolean zM87157i3 = c28655q2.m87157i(metadata);
                if (i19 == 256) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                boolean z17 = z14 | zM87157i3;
                if ((i15 & 7168) == 2048) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                zM87157i = z17 | z15 | c28655q2.m87157i(screenContent);
                objM87133R3 = c28655q2.m87133R();
                if (zM87157i) {
                    interfaceC4339a4 = interfaceC4339a2;
                    C1042s c1042s2 = new C1042s(metadata, onEvent, interfaceC4339a4, screenContent, 11);
                    c28655q2.m87172p0(c1042s2);
                    objM87133R3 = c1042s2;
                } else {
                    interfaceC4339a4 = interfaceC4339a2;
                    C1042s c1042s3 = new C1042s(metadata, onEvent, interfaceC4339a4, screenContent, 11);
                    c28655q2.m87172p0(c1042s3);
                    objM87133R3 = c1042s3;
                }
                c28655q = c28655q2;
                AbstractC22674j.m65717c(null, c26068uM77569a, c22976l1M3381c2, null, c2305k2, null, false, null, (p715kotlin.jvm.functions.Function1) objM87133R3, c28655q, ProfileVerifier.CompilationStatus.f6515xf2722a21, 473);
                function3 = function4;
                interfaceC4339a3 = interfaceC4339a4;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                interfaceC4339a3 = interfaceC4339a2;
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C0086f((Object) screenContent, (Object) metadata, onEvent, (Object) interfaceC4339a3, (Object) function3, i13, i14, 15);
            }
        }
        i15 |= 3072;
        interfaceC4339a2 = interfaceC4339a;
        i16 = i14 & 16;
        if (i16 != 0) {
            if ((i13 & 24576) == 0) {
                function2 = function1;
                if (c28655q2.m87157i(function2)) {
                    i17 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i17 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i17;
            }
            i18 = 0;
            if ((i15 & 9363) != 9362) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i24 != 0) {
                    objM87133R5 = c28655q2.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C8527a(9);
                        c28655q2.m87172p0(objM87133R5);
                    }
                    interfaceC4339a2 = (InterfaceC4339a) objM87133R5;
                }
                if (i16 != 0) {
                    objM87133R4 = c28655q2.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C6498i(18);
                        c28655q2.m87172p0(objM87133R4);
                    }
                    function4 = (p715kotlin.jvm.functions.Function1) objM87133R4;
                } else {
                    function4 = function2;
                }
                c26068uM77569a = AbstractC26071x.m77569a(0, 0, c28655q2, 3);
                objM87133R = c28655q2.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87264r(new C9749c(c26068uM77569a, i18));
                    c28655q2.m87172p0(objM87133R);
                }
                function4.invoke(((InterfaceC28670t2) objM87133R).getValue());
                i19 = i15 & 896;
                if (i19 == 256) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objM87133R2 = c28655q2.m87133R();
                if (z13) {
                    objM87133R2 = new C3189a(onEvent, 27);
                    c28655q2.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C3189a(onEvent, 27);
                    c28655q2.m87172p0(objM87133R2);
                }
                AbstractC15689q.m44141i(c26068uM77569a, (InterfaceC4339a) objM87133R2, c28655q2, 0);
                C2305k c2305k3 = C2299e.f9111N;
                WeakHashMap weakHashMap3 = C22944c2.f90553v;
                C22976l1 c22976l1M3381c3 = AbstractC1099a.m3381c(0.0f, 0.0f, 0.0f, AbstractC22953f.m66717e(C22949e.m66712e(c28655q2).f90558e, c28655q2).mo43109a(), 7);
                boolean zM87157i4 = c28655q2.m87157i(metadata);
                if (i19 == 256) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                boolean z18 = z14 | zM87157i4;
                if ((i15 & 7168) == 2048) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                zM87157i = z18 | z15 | c28655q2.m87157i(screenContent);
                objM87133R3 = c28655q2.m87133R();
                if (zM87157i) {
                    interfaceC4339a4 = interfaceC4339a2;
                    C1042s c1042s4 = new C1042s(metadata, onEvent, interfaceC4339a4, screenContent, 11);
                    c28655q2.m87172p0(c1042s4);
                    objM87133R3 = c1042s4;
                } else {
                    interfaceC4339a4 = interfaceC4339a2;
                    C1042s c1042s5 = new C1042s(metadata, onEvent, interfaceC4339a4, screenContent, 11);
                    c28655q2.m87172p0(c1042s5);
                    objM87133R3 = c1042s5;
                }
                c28655q = c28655q2;
                AbstractC22674j.m65717c(null, c26068uM77569a, c22976l1M3381c3, null, c2305k3, null, false, null, (p715kotlin.jvm.functions.Function1) objM87133R3, c28655q, ProfileVerifier.CompilationStatus.f6515xf2722a21, 473);
                function3 = function4;
                interfaceC4339a3 = interfaceC4339a4;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                interfaceC4339a3 = interfaceC4339a2;
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C0086f((Object) screenContent, (Object) metadata, onEvent, (Object) interfaceC4339a3, (Object) function3, i13, i14, 15);
            }
        }
        i15 |= 24576;
        function2 = function1;
        i18 = 0;
        if ((i15 & 9363) != 9362) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q2.m87135U(i15 & 1, z4)) {
            c28676v0 = C28635l.f115821a;
            if (i24 != 0) {
                objM87133R5 = c28655q2.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = new C8527a(9);
                    c28655q2.m87172p0(objM87133R5);
                }
                interfaceC4339a2 = (InterfaceC4339a) objM87133R5;
            }
            if (i16 != 0) {
                objM87133R4 = c28655q2.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = new C6498i(18);
                    c28655q2.m87172p0(objM87133R4);
                }
                function4 = (p715kotlin.jvm.functions.Function1) objM87133R4;
            } else {
                function4 = function2;
            }
            c26068uM77569a = AbstractC26071x.m77569a(0, 0, c28655q2, 3);
            objM87133R = c28655q2.m87133R();
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87264r(new C9749c(c26068uM77569a, i18));
                c28655q2.m87172p0(objM87133R);
            }
            function4.invoke(((InterfaceC28670t2) objM87133R).getValue());
            i19 = i15 & 896;
            if (i19 == 256) {
                z13 = true;
            } else {
                z13 = false;
            }
            objM87133R2 = c28655q2.m87133R();
            if (z13) {
                objM87133R2 = new C3189a(onEvent, 27);
                c28655q2.m87172p0(objM87133R2);
            } else {
                objM87133R2 = new C3189a(onEvent, 27);
                c28655q2.m87172p0(objM87133R2);
            }
            AbstractC15689q.m44141i(c26068uM77569a, (InterfaceC4339a) objM87133R2, c28655q2, 0);
            C2305k c2305k4 = C2299e.f9111N;
            WeakHashMap weakHashMap4 = C22944c2.f90553v;
            C22976l1 c22976l1M3381c4 = AbstractC1099a.m3381c(0.0f, 0.0f, 0.0f, AbstractC22953f.m66717e(C22949e.m66712e(c28655q2).f90558e, c28655q2).mo43109a(), 7);
            boolean zM87157i5 = c28655q2.m87157i(metadata);
            if (i19 == 256) {
                z14 = true;
            } else {
                z14 = false;
            }
            boolean z19 = z14 | zM87157i5;
            if ((i15 & 7168) == 2048) {
                z15 = true;
            } else {
                z15 = false;
            }
            zM87157i = z19 | z15 | c28655q2.m87157i(screenContent);
            objM87133R3 = c28655q2.m87133R();
            if (zM87157i) {
                interfaceC4339a4 = interfaceC4339a2;
                C1042s c1042s6 = new C1042s(metadata, onEvent, interfaceC4339a4, screenContent, 11);
                c28655q2.m87172p0(c1042s6);
                objM87133R3 = c1042s6;
            } else {
                interfaceC4339a4 = interfaceC4339a2;
                C1042s c1042s7 = new C1042s(metadata, onEvent, interfaceC4339a4, screenContent, 11);
                c28655q2.m87172p0(c1042s7);
                objM87133R3 = c1042s7;
            }
            c28655q = c28655q2;
            AbstractC22674j.m65717c(null, c26068uM77569a, c22976l1M3381c4, null, c2305k4, null, false, null, (p715kotlin.jvm.functions.Function1) objM87133R3, c28655q, ProfileVerifier.CompilationStatus.f6515xf2722a21, 473);
            function3 = function4;
            interfaceC4339a3 = interfaceC4339a4;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            interfaceC4339a3 = interfaceC4339a2;
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0086f((Object) screenContent, (Object) metadata, onEvent, (Object) interfaceC4339a3, (Object) function3, i13, i14, 15);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 ProfileContentArea$lambda$1$0(float f13) {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float ProfileContentArea$lambda$2$0(C26068u c26068u) {
        C23224a c23224a = c26068u.f103222e;
        return ((C28621h1) c23224a.f91958b).m87024x() == 0 ? ((C28621h1) c23224a.f91959c).m87024x() : ((C28621h1) c23224a.f91959c).m87024x() + 1050.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 ProfileContentArea$lambda$3$0(p715kotlin.jvm.functions.Function1 function1) {
        function1.invoke(ProfileEvent.ScrolledToBottomAnalyticEvent.INSTANCE);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 ProfileContentArea$lambda$4$0(ProfileViewState.Metadata metadata, p715kotlin.jvm.functions.Function1 function1, InterfaceC4339a interfaceC4339a, ProfileViewState.ScreenContent screenContent, InterfaceC26064q LazyColumn) {
        AbstractC22676k.m65750j(LazyColumn, "$this$LazyColumn");
        InterfaceC26064q.m77556b(LazyColumn, null, new C37816b(new C0542f((Object) metadata, function1, (Object) interfaceC4339a, 7), true, 243478754), 3);
        InterfaceC26064q.m77556b(LazyColumn, null, new C37816b(new C22931l(12, screenContent, function1), true, -1043177909), 3);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 ProfileContentArea$lambda$4$0$0(ProfileViewState.Metadata metadata, p715kotlin.jvm.functions.Function1 function1, InterfaceC4339a interfaceC4339a, InterfaceC1103a item, Composer composer, int i13) {
        AbstractC22676k.m65750j(item, "$this$item");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            ProfileHeaderKt.ProfileHeader(metadata, function1, interfaceC4339a, c28655q, 0, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 ProfileContentArea$lambda$4$0$1(ProfileViewState.ScreenContent screenContent, p715kotlin.jvm.functions.Function1 function1, InterfaceC1103a item, Composer composer, int i13) {
        AbstractC22676k.m65750j(item, "$this$item");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            float f13 = 2 * 8;
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1099a.m3396r(c2314t, f13, 0.0f, 2), 0.0f, f13, 0.0f, 0.0f, 13);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3398t);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            c28655q.m87150e0(-1503569014);
            for (ProfileViewState.ComponentItem componentItem : screenContent.getItems()) {
                c28655q.m87150e0(-1503567161);
                for (C25306o c25306o : componentItem.getItemViewState()) {
                    boolean zM87153g = c28655q.m87153g(function1) | c28655q.m87157i(c25306o);
                    Object objM87133R = c28655q.m87133R();
                    if (zM87153g || objM87133R == C28635l.f115821a) {
                        objM87133R = new C0559j(function1, c25306o, 3);
                        c28655q.m87172p0(objM87133R);
                    }
                    ProfileScreenItem(c25306o, (p715kotlin.jvm.functions.Function1) objM87133R, c28655q, C25306o.f99297c, 0);
                    AbstractC11266d.m30469w(3, 4, c2314t, c28655q);
                }
                c28655q.m87173q(false);
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(componentItem.getInsetBottom().getSpacing(), c2314t));
            }
            c28655q.m87173q(false);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 ProfileContentArea$lambda$4$0$1$0$0$0$0$0(p715kotlin.jvm.functions.Function1 function1, C25306o c25306o, Object it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(new ProfileEvent.ItemClicked(it, c25306o.getState()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 ProfileContentArea$lambda$5(ProfileViewState.ScreenContent screenContent, ProfileViewState.Metadata metadata, p715kotlin.jvm.functions.Function1 function1, InterfaceC4339a interfaceC4339a, p715kotlin.jvm.functions.Function1 function2, int i13, int i14, Composer composer, int i15) {
        ProfileContentArea(screenContent, metadata, function1, interfaceC4339a, function2, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    public static final void ProfileScreenItem(C25306o itemWrapper, p715kotlin.jvm.functions.Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        AbstractC22676k.m65750j(itemWrapper, "itemWrapper");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(311563960);
        if ((i13 & 6) == 0) {
            i15 = ((i13 & 8) == 0 ? c28655q.m87153g(itemWrapper) : c28655q.m87157i(itemWrapper) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i16 = i14 & 2;
        if (i16 != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(function1) ? 32 : 16;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 19) != 18)) {
            if (i16 != 0) {
                Object objM87133R = c28655q.m87133R();
                if (objM87133R == C28635l.f115821a) {
                    objM87133R = new C6498i(19);
                    c28655q.m87172p0(objM87133R);
                }
                function1 = (p715kotlin.jvm.functions.Function1) objM87133R;
            }
            AbstractC28683x.m87247a(AbstractC25303l.m74272C().mo86977a(profileItemViewFactory), AbstractC37817c.m121344e(-537121928, c28655q, new C0003a0(17, itemWrapper, function1)), c28655q, 56);
        } else {
            c28655q.m87138X();
        }
        p715kotlin.jvm.functions.Function1 function2 = function1;
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3328a(itemWrapper, function2, i13, i14, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 ProfileScreenItem$lambda$0$0(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 ProfileScreenItem$lambda$1(C25306o c25306o, p715kotlin.jvm.functions.Function1 function1, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            AbstractC25303l.m74290q(c25306o, profileItemViewFactory, null, function1, c28655q, C25306o.f99297c | (C25307p.f99300b << 3), 4);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 ProfileScreenItem$lambda$2(C25306o c25306o, p715kotlin.jvm.functions.Function1 function1, int i13, int i14, Composer composer, int i15) {
        ProfileScreenItem(c25306o, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 profileItemViewFactory$lambda$0(C25308q designItemViewFactory) {
        AbstractC22676k.m65750j(designItemViewFactory, "$this$designItemViewFactory");
        Map<InterfaceC21461d, InterfaceC25297f<?>> mapM74324c = designItemViewFactory.m74324c();
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        mapM74324c.put(c22673i0.getOrCreateKotlinClass(ContextHubTileViewState.class), new ContextHubTileItem());
        designItemViewFactory.m74324c().put(c22673i0.getOrCreateKotlinClass(StreaksTileViewState.class), new StreaksTileItem());
        designItemViewFactory.m74324c().put(c22673i0.getOrCreateKotlinClass(ReferralsTileViewState.class), new ReferralsTileItem());
        designItemViewFactory.m74324c().put(c22673i0.getOrCreateKotlinClass(C37519b0.class), new C37562x());
        return C23454a0.f92919a;
    }
}
