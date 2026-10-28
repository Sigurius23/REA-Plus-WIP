package jk0;

import nj0.InterfaceC26750f;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import st0.EnumC32978v;

/* JADX INFO: renamed from: jk0.i */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lnj0/f;", "Lst0/v;", "a", "(Lnj0/f;)Lst0/v;", "connectivity_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC21755i {
    /* JADX INFO: renamed from: a */
    public static final EnumC32978v m61391a(InterfaceC26750f interfaceC26750f) {
        AbstractC22676k.m65750j(interfaceC26750f, "<this>");
        if (interfaceC26750f.equals(InterfaceC26750f.b.C42056b.f106385b)) {
            return EnumC32978v.GEN_4;
        }
        if (interfaceC26750f.equals(InterfaceC26750f.b.c.f106390b)) {
            return EnumC32978v.MAVERICK;
        }
        if (interfaceC26750f.equals(InterfaceC26750f.b.a.C42055b.f106382b)) {
            return EnumC32978v.SYMPHONY;
        }
        if (interfaceC26750f.equals(InterfaceC26750f.b.a.C42054a.f106379b)) {
            return EnumC32978v.MONUMENT;
        }
        throw new NoWhenBranchMatchedException();
    }
}
