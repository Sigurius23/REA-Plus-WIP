package io.getstream.video.android.model;

import l83.C23465k;
import p547v8.AbstractC35785b;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: io.getstream.video.android.model.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C19971b {
    /* JADX INFO: renamed from: a */
    public static StreamCallId m55786a(String cid) {
        AbstractC22676k.m65750j(cid, "cid");
        C23465k c23465kM113402Y = AbstractC35785b.m113402Y(cid);
        return new StreamCallId(AbstractC39414r.m125869O0((String) c23465kM113402Y.f92937w).toString(), AbstractC39414r.m125869O0((String) c23465kM113402Y.f92938x).toString(), (String) null, false, 12, (DefaultConstructorMarker) null);
    }

    public final InterfaceC37138c serializer() {
        return StreamCallId$$serializer.INSTANCE;
    }
}
