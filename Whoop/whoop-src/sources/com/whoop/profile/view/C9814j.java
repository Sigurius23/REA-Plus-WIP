package com.whoop.profile.view;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.bot.models.feedback.AiFeedbackType;
import com.whoop.design.util.TextResource;
import com.whoop.profile.presentation.ProfileViewState;
import cp0.AbstractC11009x0;
import dh0.AbstractC12042c;
import gh0.AbstractC15847b;
import ik1.AbstractC18611h;
import kk1.AbstractC22546g;
import l83.InterfaceC23459e;
import nl0.EnumC26800b;
import ok2.C27995a;
import ok2.EnumC27997c;
import p026b2.InterfaceC2300f;
import p132f0.C13821r1;
import p291l0.InterfaceC23001u;
import p715kotlin.jvm.functions.Function1;
import p720m91.InterfaceC25312u;
import q41.AbstractC29973f;
import qk2.AbstractC30446b;
import re1.AbstractC31323j;
import tk2.InterfaceC33899q;
import w41.C36806f;
import y11.AbstractC39061n;
import yk2.AbstractC39614n;

/* JADX INFO: renamed from: com.whoop.profile.view.j */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C9814j implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f28565E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Object f28566F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ Object f28567G;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f28568w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ float f28569x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ int f28570y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f28571z;

    public /* synthetic */ C9814j(Modifier modifier, Object obj, Object obj2, float f13, int i13, int i14, int i15) {
        this.f28568w = i15;
        this.f28565E = modifier;
        this.f28566F = obj;
        this.f28567G = obj2;
        this.f28569x = f13;
        this.f28570y = i13;
        this.f28571z = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f28568w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return ProfileScreenKt.ProfileToolbar$lambda$2((Modifier) this.f28565E, (ProfileViewState) this.f28566F, (Function1) this.f28567G, this.f28569x, this.f28570y, this.f28571z, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC11009x0.m29478d1((TextResource) this.f28565E, this.f28569x, (InterfaceC4339a) this.f28566F, (InterfaceC4339a) this.f28567G, this.f28570y, this.f28571z, (Composer) obj, iIntValue2);
            case 2:
                int iIntValue3 = ((Integer) obj2).intValue();
                return AbstractC12042c.m33165j((EnumC26800b) this.f28565E, (InterfaceC25312u) this.f28566F, this.f28569x, (Function1) this.f28567G, this.f28570y, this.f28571z, (Composer) obj, iIntValue3);
            case 3:
                int iIntValue4 = ((Integer) obj2).intValue();
                return AbstractC15847b.m44700q((Modifier) this.f28565E, (AiFeedbackType) this.f28566F, this.f28569x, (Function1) this.f28567G, this.f28570y, this.f28571z, (Composer) obj, iIntValue4);
            case 4:
                int iIntValue5 = ((Integer) obj2).intValue();
                return AbstractC22546g.m65226c0((Modifier) this.f28565E, this.f28569x, (AbstractC18611h.c) this.f28566F, (Function1) this.f28567G, this.f28570y, this.f28571z, (Composer) obj, iIntValue5);
            case 5:
                int iIntValue6 = ((Integer) obj2).intValue();
                return AbstractC29973f.m91677h((String) this.f28566F, this.f28569x, (InterfaceC2300f) this.f28567G, (Modifier) this.f28565E, this.f28570y, this.f28571z, (Composer) obj, iIntValue6);
            case 6:
                int iIntValue7 = ((Integer) obj2).intValue();
                return AbstractC30446b.m93164u((C27995a) this.f28566F, (EnumC27997c) this.f28567G, this.f28569x, (Modifier) this.f28565E, this.f28570y, this.f28571z, (Composer) obj, iIntValue7);
            case 7:
                int iIntValue8 = ((Integer) obj2).intValue();
                return AbstractC31323j.m96382o0((InterfaceC23001u) this.f28565E, (C13821r1) this.f28566F, this.f28569x, (InterfaceC4339a) this.f28567G, this.f28570y, this.f28571z, (Composer) obj, iIntValue8);
            case 8:
                int iIntValue9 = ((Integer) obj2).intValue();
                return AbstractC39061n.m124558k((Modifier) this.f28565E, (TextResource) this.f28566F, (TextResource) this.f28567G, this.f28569x, this.f28570y, this.f28571z, (Composer) obj, iIntValue9);
            default:
                int iIntValue10 = ((Integer) obj2).intValue();
                return AbstractC39614n.m126578g((InterfaceC33899q.b) this.f28566F, (Modifier) this.f28565E, this.f28569x, (C36806f) this.f28567G, this.f28570y, this.f28571z, (Composer) obj, iIntValue10);
        }
    }

    public /* synthetic */ C9814j(Object obj, float f13, Object obj2, InterfaceC23459e interfaceC23459e, int i13, int i14, int i15) {
        this.f28568w = i15;
        this.f28565E = obj;
        this.f28569x = f13;
        this.f28566F = obj2;
        this.f28567G = interfaceC23459e;
        this.f28570y = i13;
        this.f28571z = i14;
    }

    public /* synthetic */ C9814j(Object obj, Object obj2, float f13, InterfaceC23459e interfaceC23459e, int i13, int i14, int i15) {
        this.f28568w = i15;
        this.f28565E = obj;
        this.f28566F = obj2;
        this.f28569x = f13;
        this.f28567G = interfaceC23459e;
        this.f28570y = i13;
        this.f28571z = i14;
    }

    public /* synthetic */ C9814j(String str, float f13, InterfaceC2300f interfaceC2300f, Modifier modifier, int i13, int i14) {
        this.f28568w = 5;
        this.f28566F = str;
        this.f28569x = f13;
        this.f28567G = interfaceC2300f;
        this.f28565E = modifier;
        this.f28570y = i13;
        this.f28571z = i14;
    }

    public /* synthetic */ C9814j(C27995a c27995a, EnumC27997c enumC27997c, float f13, Modifier modifier, int i13, int i14) {
        this.f28568w = 6;
        this.f28566F = c27995a;
        this.f28567G = enumC27997c;
        this.f28569x = f13;
        this.f28565E = modifier;
        this.f28570y = i13;
        this.f28571z = i14;
    }

    public /* synthetic */ C9814j(InterfaceC33899q.b bVar, Modifier modifier, float f13, C36806f c36806f, int i13, int i14) {
        this.f28568w = 9;
        this.f28566F = bVar;
        this.f28565E = modifier;
        this.f28569x = f13;
        this.f28567G = c36806f;
        this.f28570y = i13;
        this.f28571z = i14;
    }
}
