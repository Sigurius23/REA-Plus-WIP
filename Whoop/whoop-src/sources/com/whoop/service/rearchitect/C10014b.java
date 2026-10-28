package com.whoop.service.rearchitect;

import jk0.InterfaceC21750d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.whoop.service.rearchitect.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0082\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Lcom/whoop/service/rearchitect/b;", "", "Ljk0/d;", "value", "<init>", "(Ljk0/d;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljk0/d;", "()Ljk0/d;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
final /* data */ class C10014b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC21750d value;

    public C10014b(InterfaceC21750d interfaceC21750d) {
        this.value = interfaceC21750d;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final InterfaceC21750d getValue() {
        return this.value;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof C10014b) && AbstractC22676k.m65745e(this.value, ((C10014b) other).value);
    }

    public int hashCode() {
        InterfaceC21750d interfaceC21750d = this.value;
        if (interfaceC21750d == null) {
            return 0;
        }
        return interfaceC21750d.hashCode();
    }

    public String toString() {
        return "IWhoopStrapWrapper(value=" + this.value + ")";
    }

    public /* synthetic */ C10014b(InterfaceC21750d interfaceC21750d, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : interfaceC21750d);
    }
}
