package com.whoop.profile.view.edit;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import io.getstream.chat.android.client.api.internal.DistinctChatApi;
import io.getstream.chat.android.models.FilterObject;
import io.getstream.chat.android.models.querysort.QuerySorter;
import java.util.Date;
import p163g1.C15199y3;
import p390p1.InterfaceC28601c1;

/* JADX INFO: renamed from: com.whoop.profile.view.edit.f */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C9775f implements InterfaceC4339a {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f28420E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Object f28421F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ Object f28422G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ Object f28423H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ Object f28424I;

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ Object f28425J;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f28426w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f28427x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f28428y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f28429z;

    public /* synthetic */ C9775f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, int i13) {
        this.f28426w = i13;
        this.f28427x = obj;
        this.f28428y = obj2;
        this.f28429z = obj3;
        this.f28420E = obj4;
        this.f28421F = obj5;
        this.f28422G = obj6;
        this.f28423H = obj7;
        this.f28424I = obj8;
        this.f28425J = obj9;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f28426w) {
            case 0:
                return EditProfileBottomSheetKt.EditProfileBottomSheet$lambda$25$0$0$0((InterfaceC2994c0) this.f28427x, (C15199y3) this.f28428y, (InterfaceC28601c1) this.f28429z, (InterfaceC28601c1) this.f28420E, (InterfaceC28601c1) this.f28421F, (InterfaceC28601c1) this.f28422G, (InterfaceC28601c1) this.f28423H, (InterfaceC28601c1) this.f28424I, (InterfaceC28601c1) this.f28425J);
            default:
                return DistinctChatApi.m54549i((DistinctChatApi) this.f28427x, (FilterObject) this.f28428y, (QuerySorter) this.f28429z, (Integer) this.f28420E, (Integer) this.f28421F, (Date) this.f28422G, (Date) this.f28423H, (Date) this.f28424I, (Date) this.f28425J);
        }
    }
}
