package com.whoop.archv2.feature.domain;

import com.whoop.navigation.CachePolicyModel;
import ec3.InterfaceC13058l;
import od1.InterfaceC27844g;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import pi0.C29249a;

/* JADX INFO: renamed from: com.whoop.archv2.feature.domain.k */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m65681d2 = {"Lcom/whoop/archv2/feature/domain/k;", "Lod1/g;", "Lpi0/a;", "Lcom/whoop/archv2/feature/domain/f;", "Lcom/whoop/archv2/feature/domain/j;", "cachedInteractor", "Lcom/whoop/archv2/feature/domain/l;", "noCacheInteractor", "Lcom/whoop/navigation/CachePolicyModel;", "cachePolicyModel", "<init>", "(Lcom/whoop/archv2/feature/domain/j;Lcom/whoop/archv2/feature/domain/l;Lcom/whoop/navigation/CachePolicyModel;)V", "Lec3/l;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "a", "Lcom/whoop/archv2/feature/domain/j;", "b", "Lcom/whoop/archv2/feature/domain/l;", "c", "Lcom/whoop/navigation/CachePolicyModel;", "arch-v2_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C6003k implements InterfaceC27844g<C29249a, C5998f> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C6002j cachedInteractor;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C6004l noCacheInteractor;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final CachePolicyModel cachePolicyModel;

    public C6003k(C6002j cachedInteractor, C6004l noCacheInteractor, CachePolicyModel cachePolicyModel) {
        AbstractC22676k.m65750j(cachedInteractor, "cachedInteractor");
        AbstractC22676k.m65750j(noCacheInteractor, "noCacheInteractor");
        AbstractC22676k.m65750j(cachePolicyModel, "cachePolicyModel");
        this.cachedInteractor = cachedInteractor;
        this.noCacheInteractor = noCacheInteractor;
        this.cachePolicyModel = cachePolicyModel;
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return (this.cachePolicyModel.getEnabled() ? this.cachedInteractor : this.noCacheInteractor).interact(upstream);
    }
}
