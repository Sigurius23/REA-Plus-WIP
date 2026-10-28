package io.getstream.chat.android.client.internal.offline.repository.domain.user.internal;

import androidx.viewpager2.widget.ViewPager2;
import p390p1.InterfaceC28601c1;
import p500tb.InterfaceC33687a;
import p715kotlin.jvm.functions.Function1;
import p734sl0.AbstractC32583a3;
import w81.AbstractC36945c;

/* JADX INFO: renamed from: io.getstream.chat.android.client.internal.offline.repository.domain.user.internal.a */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C19254a implements Function1 {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f73876E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f73877w = 2;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ int f73878x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ int f73879y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f73880z;

    public /* synthetic */ C19254a(int i13, int i14, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2) {
        this.f73878x = i13;
        this.f73879y = i14;
        this.f73880z = interfaceC28601c1;
        this.f73876E = interfaceC28601c2;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f73877w) {
            case 0:
                return UserDao_Impl.m54777f((String) this.f73880z, this.f73878x, this.f73879y, (UserDao_Impl) this.f73876E, (InterfaceC33687a) obj);
            case 1:
                return AbstractC32583a3.m101642f((Function1) this.f73876E, this.f73878x, this.f73879y, (String) this.f73880z, (String) obj);
            default:
                return AbstractC36945c.m118627p(this.f73878x, this.f73879y, (InterfaceC28601c1) this.f73880z, (InterfaceC28601c1) this.f73876E, (ViewPager2) obj);
        }
    }

    public /* synthetic */ C19254a(String str, int i13, int i14, UserDao_Impl userDao_Impl) {
        this.f73880z = str;
        this.f73878x = i13;
        this.f73879y = i14;
        this.f73876E = userDao_Impl;
    }

    public /* synthetic */ C19254a(String str, int i13, int i14, Function1 function1) {
        this.f73876E = function1;
        this.f73878x = i13;
        this.f73879y = i14;
        this.f73880z = str;
    }
}
