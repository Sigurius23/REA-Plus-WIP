package com.whoop.archv2.feature.domain;

import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: com.whoop.archv2.feature.domain.d */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/archv2/feature/domain/c;", "Lcom/whoop/archv2/feature/domain/e;", "a", "(Lcom/whoop/archv2/feature/domain/c;)Lcom/whoop/archv2/feature/domain/e;", "arch-v2_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC5996d {
    /* JADX INFO: renamed from: a */
    public static final EnumC5997e m17896a(AbstractC5995c abstractC5995c) {
        AbstractC22676k.m65750j(abstractC5995c, "<this>");
        if ((abstractC5995c instanceof AbstractC5995c.d) || (abstractC5995c instanceof AbstractC5995c.n)) {
            return EnumC5997e.Fetch;
        }
        if (abstractC5995c instanceof AbstractC5995c.e) {
            return EnumC5997e.Pagination;
        }
        if ((abstractC5995c instanceof AbstractC5995c.j) || (abstractC5995c instanceof AbstractC5995c.k) || (abstractC5995c instanceof AbstractC5995c.l) || (abstractC5995c instanceof AbstractC5995c.m) || (abstractC5995c instanceof AbstractC5995c.c) || (abstractC5995c instanceof AbstractC5995c.b) || (abstractC5995c instanceof AbstractC5995c.a) || (abstractC5995c instanceof AbstractC5995c.g) || (abstractC5995c instanceof AbstractC5995c.h) || (abstractC5995c instanceof AbstractC5995c.f) || abstractC5995c.equals(AbstractC5995c.i.f23707a)) {
            return EnumC5997e.Action;
        }
        throw new NoWhenBranchMatchedException();
    }
}
