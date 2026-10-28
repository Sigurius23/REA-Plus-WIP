package nb3;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import l83.C23470p;
import lb3.InterfaceC23796q0;
import m83.C25271y;
import o93.AbstractC27736h;
import o93.C27733e;
import p048ce.AbstractC4482w;
import p715kotlin.jvm.internal.AbstractC22676k;
import r93.InterfaceC31126h;

/* JADX INFO: renamed from: nb3.j */
/* JADX INFO: loaded from: classes5.dex */
public final class C26553j implements InterfaceC23796q0 {

    /* JADX INFO: renamed from: w */
    public final EnumC26554k f105529w;

    /* JADX INFO: renamed from: x */
    public final String[] f105530x;

    /* JADX INFO: renamed from: y */
    public final String f105531y;

    public C26553j(EnumC26554k kind, String... formatParams) {
        AbstractC22676k.m65750j(kind, "kind");
        AbstractC22676k.m65750j(formatParams, "formatParams");
        this.f105529w = kind;
        this.f105530x = formatParams;
        EnumC26545b[] enumC26545bArr = EnumC26545b.f105507w;
        String str = kind.f105562w;
        Object[] objArrCopyOf = Arrays.copyOf(formatParams, formatParams.length);
        this.f105531y = String.format("[Error type: %s]", Arrays.copyOf(new Object[]{String.format(str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length))}, 1));
    }

    @Override // lb3.InterfaceC23796q0
    /* JADX INFO: renamed from: c */
    public final AbstractC27736h mo1783c() {
        C23470p c23470p = C27733e.f111784f;
        return AbstractC4482w.m13977M();
    }

    @Override // lb3.InterfaceC23796q0
    /* JADX INFO: renamed from: d */
    public final InterfaceC31126h mo1784d() {
        C26555l.f105564a.getClass();
        return C26555l.f105566c;
    }

    @Override // lb3.InterfaceC23796q0
    /* JADX INFO: renamed from: f */
    public final boolean mo1785f() {
        return false;
    }

    @Override // lb3.InterfaceC23796q0
    public final List getParameters() {
        return C25271y.f99162w;
    }

    @Override // lb3.InterfaceC23796q0
    public final Collection getSupertypes() {
        return C25271y.f99162w;
    }

    public final String toString() {
        return this.f105531y;
    }
}
