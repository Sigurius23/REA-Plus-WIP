package b30;

import h20.C16665h1;
import my.C26027a;
import p715kotlin.jvm.internal.AbstractC22676k;
import q20.AbstractC29840y;
import v00.C35459c0;

/* JADX INFO: renamed from: b30.z0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2666z0 {

    /* JADX INFO: renamed from: a */
    public final String f10431a;

    /* JADX INFO: renamed from: b */
    public final C35459c0 f10432b;

    /* JADX INFO: renamed from: c */
    public final C26027a f10433c;

    /* JADX INFO: renamed from: d */
    public final C16665h1 f10434d;

    /* JADX INFO: renamed from: e */
    public final AbstractC29840y f10435e;

    public C2666z0(String str, C35459c0 paymentMethodMetadata, C26027a configuration, C16665h1 appearance, AbstractC29840y abstractC29840y) {
        AbstractC22676k.m65750j(paymentMethodMetadata, "paymentMethodMetadata");
        AbstractC22676k.m65750j(configuration, "configuration");
        AbstractC22676k.m65750j(appearance, "appearance");
        this.f10431a = str;
        this.f10432b = paymentMethodMetadata;
        this.f10433c = configuration;
        this.f10434d = appearance;
        this.f10435e = abstractC29840y;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2666z0)) {
            return false;
        }
        C2666z0 c2666z0 = (C2666z0) obj;
        return AbstractC22676k.m65745e(this.f10431a, c2666z0.f10431a) && AbstractC22676k.m65745e(this.f10432b, c2666z0.f10432b) && AbstractC22676k.m65745e(this.f10433c, c2666z0.f10433c) && AbstractC22676k.m65745e(this.f10434d, c2666z0.f10434d) && AbstractC22676k.m65745e(this.f10435e, c2666z0.f10435e);
    }

    public final int hashCode() {
        String str = this.f10431a;
        int iHashCode = (this.f10434d.hashCode() + ((this.f10433c.hashCode() + ((this.f10432b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31)) * 31)) * 31;
        AbstractC29840y abstractC29840y = this.f10435e;
        return iHashCode + (abstractC29840y != null ? abstractC29840y.hashCode() : 0);
    }

    public final String toString() {
        return "Arguments(linkEmail=" + this.f10431a + ", paymentMethodMetadata=" + this.f10432b + ", configuration=" + this.f10433c + ", appearance=" + this.f10434d + ", paymentSelection=" + this.f10435e + ")";
    }
}
