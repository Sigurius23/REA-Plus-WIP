package mh;

import p341nh.EnumC26710d;
import p341nh.EnumC26713g;
import p341nh.InterfaceC26715i;
import p715kotlin.jvm.internal.AbstractC22676k;
import ph.InterfaceC29231e;

/* JADX INFO: renamed from: mh.d */
/* JADX INFO: loaded from: classes.dex */
public final class C25536d {

    /* JADX INFO: renamed from: a */
    public final InterfaceC26715i f100066a;

    /* JADX INFO: renamed from: b */
    public final EnumC26713g f100067b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC29231e f100068c;

    /* JADX INFO: renamed from: d */
    public final EnumC26710d f100069d;

    /* JADX INFO: renamed from: e */
    public final Boolean f100070e;

    /* JADX INFO: renamed from: f */
    public final EnumC25534b f100071f;

    public C25536d(InterfaceC26715i interfaceC26715i, EnumC26713g enumC26713g, InterfaceC29231e interfaceC29231e, EnumC26710d enumC26710d, Boolean bool, EnumC25534b enumC25534b) {
        this.f100066a = interfaceC26715i;
        this.f100067b = enumC26713g;
        this.f100068c = interfaceC29231e;
        this.f100069d = enumC26710d;
        this.f100070e = bool;
        this.f100071f = enumC25534b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25536d)) {
            return false;
        }
        C25536d c25536d = (C25536d) obj;
        return AbstractC22676k.m65745e(this.f100066a, c25536d.f100066a) && this.f100067b == c25536d.f100067b && AbstractC22676k.m65745e(this.f100068c, c25536d.f100068c) && this.f100069d == c25536d.f100069d && AbstractC22676k.m65745e(this.f100070e, c25536d.f100070e) && this.f100071f == c25536d.f100071f;
    }

    public final int hashCode() {
        InterfaceC26715i interfaceC26715i = this.f100066a;
        int iHashCode = (interfaceC26715i != null ? interfaceC26715i.hashCode() : 0) * 31;
        EnumC26713g enumC26713g = this.f100067b;
        int iHashCode2 = (iHashCode + (enumC26713g != null ? enumC26713g.hashCode() : 0)) * 28629151;
        InterfaceC29231e interfaceC29231e = this.f100068c;
        int iHashCode3 = (iHashCode2 + (interfaceC29231e != null ? interfaceC29231e.hashCode() : 0)) * 31;
        EnumC26710d enumC26710d = this.f100069d;
        int iHashCode4 = (iHashCode3 + (enumC26710d != null ? enumC26710d.hashCode() : 0)) * 961;
        Boolean bool = this.f100070e;
        int iHashCode5 = (iHashCode4 + (bool != null ? bool.hashCode() : 0)) * 961;
        EnumC25534b enumC25534b = this.f100071f;
        return (iHashCode5 + (enumC25534b != null ? enumC25534b.hashCode() : 0)) * 961;
    }
}
