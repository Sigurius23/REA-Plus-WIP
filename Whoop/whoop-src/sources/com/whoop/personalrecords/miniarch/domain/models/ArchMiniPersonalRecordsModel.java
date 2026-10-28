package com.whoop.personalrecords.miniarch.domain.models;

import com.whoop.design.models.DesignSystemModel;
import java.lang.annotation.Annotation;
import kotlinx.serialization.internal.ObjectSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import ou1.C28376a;
import p715kotlin.Metadata;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Lcom/whoop/personalrecords/miniarch/domain/models/ArchMiniPersonalRecordsModel;", "Lcom/whoop/design/models/DesignSystemModel;", "<init>", "()V", "Lwc3/c;", "serializer", "()Lwc3/c;", "personal-records-mini-arch_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final class ArchMiniPersonalRecordsModel implements DesignSystemModel {
    public static final int $stable = 0;
    public static final ArchMiniPersonalRecordsModel INSTANCE = new ArchMiniPersonalRecordsModel();
    private static final /* synthetic */ InterfaceC23462h $cachedSerializer$delegate = AbstractC30060g.m92087G(EnumC23463i.f92934x, new C28376a(12));

    private ArchMiniPersonalRecordsModel() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _init_$_anonymous_() {
        return new ObjectSerializer("com.whoop.personalrecords.miniarch.domain.models.ArchMiniPersonalRecordsModel", INSTANCE, new Annotation[0]);
    }

    private final /* synthetic */ InterfaceC37138c get$cachedSerializer() {
        return (InterfaceC37138c) $cachedSerializer$delegate.getValue();
    }

    public final InterfaceC37138c serializer() {
        return get$cachedSerializer();
    }
}
