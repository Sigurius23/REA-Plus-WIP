package com.whoop.bot.settings;

import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import gz0.EnumC16313m0;
import h11.AbstractC16611f;
import java.util.List;
import ls2.C24717b;
import p114eb.C12987s0;
import p329n0.InterfaceC26064q;
import p390p1.InterfaceC28601c1;
import p715kotlin.jvm.functions.Function1;
import vt2.AbstractC36497f;
import vt2.C36499h;
import wt2.AbstractC37636q;
import wt2.C37635p;

/* JADX INFO: renamed from: com.whoop.bot.settings.e */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C6075e implements Function1 {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f24115E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Object f24116F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ Object f24117G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ Object f24118H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ Object f24119I;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f24120w = 0;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ boolean f24121x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f24122y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Function1 f24123z;

    public /* synthetic */ C6075e(CoachSettingsViewState.Success success, boolean z4, InterfaceC4339a interfaceC4339a, Function1 function1, InterfaceC4339a interfaceC4339a2, InterfaceC4339a interfaceC4339a3, InterfaceC4339a interfaceC4339a4, InterfaceC4339a interfaceC4339a5) {
        this.f24115E = success;
        this.f24121x = z4;
        this.f24122y = interfaceC4339a;
        this.f24123z = function1;
        this.f24116F = interfaceC4339a2;
        this.f24117G = interfaceC4339a3;
        this.f24118H = interfaceC4339a4;
        this.f24119I = interfaceC4339a5;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f24120w) {
            case 0:
                return CoachSettingsScreenKt.CoachSettingsContent$lambda$6$0((CoachSettingsViewState.Success) this.f24115E, this.f24121x, (InterfaceC4339a) this.f24122y, this.f24123z, (InterfaceC4339a) this.f24116F, (InterfaceC4339a) this.f24117G, (InterfaceC4339a) this.f24118H, (InterfaceC4339a) this.f24119I, (InterfaceC26064q) obj);
            case 1:
                return AbstractC16611f.m47152j((EnumC16313m0) this.f24115E, (List) this.f24116F, (EnumC16313m0) this.f24117G, this.f24121x, (InterfaceC4339a) this.f24122y, (String) this.f24118H, this.f24123z, (InterfaceC4351m) this.f24119I, (InterfaceC26064q) obj);
            default:
                return AbstractC36497f.m116955A((AbstractC37636q) this.f24115E, (String) this.f24122y, this.f24121x, (C37635p) this.f24116F, (C24717b) this.f24117G, (C36499h) this.f24118H, (InterfaceC28601c1) this.f24119I, this.f24123z, (C12987s0) obj);
        }
    }

    public /* synthetic */ C6075e(EnumC16313m0 enumC16313m0, List list, EnumC16313m0 enumC16313m1, boolean z4, InterfaceC4339a interfaceC4339a, String str, Function1 function1, InterfaceC4351m interfaceC4351m) {
        this.f24115E = enumC16313m0;
        this.f24116F = list;
        this.f24117G = enumC16313m1;
        this.f24121x = z4;
        this.f24122y = interfaceC4339a;
        this.f24118H = str;
        this.f24123z = function1;
        this.f24119I = interfaceC4351m;
    }

    public /* synthetic */ C6075e(AbstractC37636q abstractC37636q, String str, boolean z4, C37635p c37635p, C24717b c24717b, C36499h c36499h, InterfaceC28601c1 interfaceC28601c1, Function1 function1) {
        this.f24115E = abstractC37636q;
        this.f24122y = str;
        this.f24121x = z4;
        this.f24116F = c37635p;
        this.f24117G = c24717b;
        this.f24118H = c36499h;
        this.f24119I = interfaceC28601c1;
        this.f24123z = function1;
    }
}
