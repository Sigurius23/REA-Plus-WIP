package com.squareup.wire;

import j93.InterfaceC21461d;
import p000.AbstractC11266d;
import p249jc.AbstractC21598x;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, m65681d2 = {"com/squareup/wire/ProtoAdapter$EnumConstantNotFoundException", "Ljava/lang/IllegalArgumentException;", "Lkotlin/IllegalArgumentException;", "wire-runtime"}, m65682k = 1, m65683mv = {1, 8, 0}, m65685xi = 48)
public final class ProtoAdapter$EnumConstantNotFoundException extends IllegalArgumentException {

    /* JADX INFO: renamed from: w */
    public final int f22081w;

    /* JADX WARN: Illegal instructions before constructor call */
    public ProtoAdapter$EnumConstantNotFoundException(int i13, InterfaceC21461d interfaceC21461d) {
        StringBuilder sbM30466t = AbstractC11266d.m30466t(i13, "Unknown enum tag ", " for ");
        sbM30466t.append(interfaceC21461d != null ? AbstractC21598x.m60663S(interfaceC21461d).getName() : null);
        super(sbM30466t.toString());
        this.f22081w = i13;
    }
}
