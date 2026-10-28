package com.whoop.data.local.room.dao.wipeable;

import android.os.Bundle;
import android.os.Parcel;
import androidx.glance.appwidget.protobuf.AbstractC1391i;
import androidx.glance.appwidget.protobuf.C1388h;
import com.whoop.domain.model.RecordsDto;
import ep1.AbstractC13413h;
import hq0.C17561a;
import ik1.C18608e;
import io.getstream.chat.android.client.audio.AudioState;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.view.internal.AudioRecordPlayerView;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.view.internal.AudioRecordingAttachmentsGroupView;
import java.util.List;
import l83.C23454a0;
import lk1.AbstractC24492b;
import lw1.AbstractC24769e;
import m81.AbstractC25230e;
import n82.C26457c;
import p180h0.EnumC16377d2;
import p217ib.AbstractC18324u;
import p329n0.InterfaceC26064q;
import p390p1.C28621h1;
import p390p1.InterfaceC28593a1;
import p395p6.AbstractC28916s0;
import p412q3.C29869e0;
import p451r6.C30947a;
import p451r6.C30950d;
import p451r6.C30951e;
import p451r6.C30954h;
import p451r6.C30955i;
import p451r6.C30960n;
import p500tb.InterfaceC33687a;
import p510u0.AbstractC34339n0;
import p510u0.C34340n1;
import p510u0.C34346p1;
import p510u0.C34364v1;
import p635y2.AbstractC39101i1;
import p635y2.AbstractC39104j1;
import p635y2.InterfaceC39147y;
import p668z1.C39967p;
import p668z1.C39970s;
import p715kotlin.jvm.functions.Function1;
import rq0.C31662e1;
import rq0.C31666g;
import rq0.C31673i0;
import rq0.C31678k0;
import rq0.C31702w0;
import rs2.AbstractC31795a;
import tg2.AbstractC33796j;
import tr2.C34109g;

/* JADX INFO: renamed from: com.whoop.data.local.room.dao.wipeable.d */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C6517d implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f25409w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ int f25410x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f25411y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f25412z;

    public /* synthetic */ C6517d(int i13, Object obj, InterfaceC28593a1 interfaceC28593a1, int i14) {
        this.f25409w = i14;
        this.f25410x = i13;
        this.f25412z = obj;
        this.f25411y = interfaceC28593a1;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f25409w) {
            case 0:
                return ((TeamInviteDao_Impl) this.f25412z).lambda$addInvites$1(this.f25410x, (List) this.f25411y, (InterfaceC33687a) obj);
            case 1:
                return ((TeamsDao_Impl) this.f25412z).lambda$updateTeams$2(this.f25410x, (List) this.f25411y, (InterfaceC33687a) obj);
            case 2:
                return AbstractC13413h.m37951t(this.f25410x, (C28621h1) this.f25412z, (InterfaceC28593a1) this.f25411y, ((Integer) obj).intValue());
            case 3:
                AudioRecordingAttachmentsGroupView.registerStateChange$lambda$26((AudioRecordingAttachmentsGroupView) this.f25412z, (AudioRecordPlayerView) this.f25411y, this.f25410x, (AudioState) obj);
                return C23454a0.f92919a;
            case 4:
                return AbstractC24492b.m71282f((C39967p) this.f25412z, this.f25410x, (C18608e) this.f25411y, ((Boolean) obj).booleanValue());
            case 5:
                return AbstractC24769e.m72548n(this.f25410x, (Function1) this.f25412z, (InterfaceC28593a1) this.f25411y, ((Boolean) obj).booleanValue());
            case 6:
                return AbstractC25230e.m73965u((Function1) this.f25412z, (List) this.f25411y, this.f25410x, ((Boolean) obj).booleanValue());
            case 7:
                AbstractC28916s0 abstractC28916s0 = (AbstractC28916s0) this.f25412z;
                String str = (String) this.f25411y;
                C30947a c30947a = (C30947a) obj;
                C30950d c30950dM95201u = C30951e.m95201u();
                String canonicalName = abstractC28916s0.getClass().getCanonicalName();
                c30950dM95201u.m4554c();
                C30951e.m95197n((C30951e) c30950dM95201u.f5992x, canonicalName);
                c30950dM95201u.m4554c();
                C30951e.m95198o((C30951e) c30950dM95201u.f5992x, this.f25410x);
                c30950dM95201u.m4554c();
                C30951e.m95199p((C30951e) c30950dM95201u.f5992x, str);
                C30951e c30951e = (C30951e) c30950dM95201u.m4552a();
                c30947a.m4554c();
                C30960n.m95232q((C30960n) c30947a.f5992x, c30951e);
                return C23454a0.f92919a;
            case 8:
                AbstractC28916s0 abstractC28916s1 = (AbstractC28916s0) this.f25412z;
                Bundle bundle = (Bundle) this.f25411y;
                C30947a c30947a2 = (C30947a) obj;
                C30954h c30954hM95210u = C30955i.m95210u();
                String canonicalName2 = abstractC28916s1.getClass().getCanonicalName();
                c30954hM95210u.m4554c();
                C30955i.m95206n((C30955i) c30954hM95210u.f5992x, canonicalName2);
                c30954hM95210u.m4554c();
                C30955i.m95207o((C30955i) c30954hM95210u.f5992x, this.f25410x);
                Parcel parcelObtain = Parcel.obtain();
                bundle.writeToParcel(parcelObtain, 0);
                byte[] bArrMarshall = parcelObtain.marshall();
                parcelObtain.recycle();
                C1388h c1388hM4353d = AbstractC1391i.m4353d(bArrMarshall, 0, bArrMarshall.length);
                c30954hM95210u.m4554c();
                C30955i.m95208p((C30955i) c30954hM95210u.f5992x, c1388hM4353d);
                C30955i c30955i = (C30955i) c30954hM95210u.m4552a();
                c30947a2.m4554c();
                C30960n.m95230o((C30960n) c30947a2.f5992x, c30955i);
                return C23454a0.f92919a;
            case 9:
                return C31666g.m97978p((AbstractC18324u) this.f25412z, this.f25410x, (C31666g) this.f25411y, (List) obj);
            case 10:
                return C31673i0.b.m98086p((AbstractC18324u) this.f25412z, this.f25410x, (C31673i0.b) this.f25411y, (RecordsDto) obj);
            case 11:
                return C31678k0.m98163p((AbstractC18324u) this.f25412z, this.f25410x, (C31678k0) this.f25411y, (C17561a) obj);
            case 12:
                return C31702w0.m98281p((AbstractC18324u) this.f25412z, this.f25410x, (C31702w0) this.f25411y, (RecordsDto) obj);
            case 13:
                return C31662e1.b.m97962p((AbstractC18324u) this.f25412z, this.f25410x, (C31662e1.b) this.f25411y, (RecordsDto) obj);
            case 14:
                return AbstractC31795a.m98750u((C39970s) this.f25412z, this.f25410x, (InterfaceC28593a1) this.f25411y, (InterfaceC39147y) obj);
            case 15:
                return AbstractC33796j.m106926h((C26457c) this.f25412z, this.f25410x, (Function1) this.f25411y, (InterfaceC26064q) obj);
            case 16:
                return C34109g.m107827u((String) this.f25412z, (String) this.f25411y, this.f25410x, (InterfaceC33687a) obj);
            default:
                C34364v1 c34364v1 = (C34364v1) this.f25412z;
                AbstractC39104j1 abstractC39104j1 = (AbstractC39104j1) this.f25411y;
                AbstractC39101i1 abstractC39101i1 = (AbstractC39101i1) obj;
                int i13 = c34364v1.f144376x;
                C34340n1 c34340n1 = c34364v1.f144375w;
                C29869e0 c29869e0 = c34364v1.f144377y;
                C34346p1 c34346p1 = (C34346p1) c34364v1.f144378z.invoke();
                c34340n1.m108644a(EnumC16377d2.f62971w, AbstractC34339n0.m108630h(abstractC39101i1, i13, c29869e0, c34346p1 != null ? c34346p1.f144282a : null, false, abstractC39104j1.f168211w), this.f25410x, abstractC39104j1.f168212x);
                AbstractC39101i1.m124624n(abstractC39104j1, 0, Math.round(-c34340n1.f144248a.m87022x()), abstractC39101i1);
                return C23454a0.f92919a;
        }
    }

    public /* synthetic */ C6517d(Object obj, int i13, Object obj2, int i14) {
        this.f25409w = i14;
        this.f25412z = obj;
        this.f25410x = i13;
        this.f25411y = obj2;
    }

    public /* synthetic */ C6517d(Object obj, Object obj2, int i13, int i14) {
        this.f25409w = i14;
        this.f25412z = obj;
        this.f25411y = obj2;
        this.f25410x = i13;
    }
}
