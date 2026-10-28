package v92;

import com.whoop.domain.model.AuthMaterial;
import l83.C23454a0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;

/* JADX INFO: renamed from: v92.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0006H\u0096@¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\bH\u0096@¢\u0006\u0004\b\r\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Lv92/b;", "Lv92/a;", "Lv92/c;", "store", "<init>", "(Lv92/c;)V", "Lcom/whoop/domain/model/AuthMaterial;", "material", "Ll83/a0;", "c", "(Lcom/whoop/domain/model/AuthMaterial;Lq83/d;)Ljava/lang/Object;", "b", "(Lq83/d;)Ljava/lang/Object;", "a", "Lv92/c;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C35832b implements InterfaceC35831a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C35833c store;

    public C35832b(C35833c store) {
        AbstractC22676k.m65750j(store, "store");
        this.store = store;
    }

    @Override // v92.InterfaceC35831a
    /* JADX INFO: renamed from: a */
    public Object mo113720a(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objM113738n = this.store.m113738n(interfaceC30057d);
        return objM113738n == EnumC31071a.f128113w ? objM113738n : C23454a0.f92919a;
    }

    @Override // v92.InterfaceC35831a
    /* JADX INFO: renamed from: b */
    public Object mo113721b(InterfaceC30057d<? super AuthMaterial> interfaceC30057d) {
        return this.store.m113737m(interfaceC30057d);
    }

    @Override // v92.InterfaceC35831a
    /* JADX INFO: renamed from: c */
    public Object mo113722c(AuthMaterial authMaterial, InterfaceC30057d<? super C23454a0> interfaceC30057d) throws Throwable {
        Object objM113739o = this.store.m113739o(authMaterial.getAccessToken(), authMaterial.getRefreshToken(), authMaterial.getExpirationSeconds(), authMaterial.getRefreshTokenExpirationSeconds(), interfaceC30057d);
        return objM113739o == EnumC31071a.f128113w ? objM113739o : C23454a0.f92919a;
    }
}
