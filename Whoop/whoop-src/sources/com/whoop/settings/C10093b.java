package com.whoop.settings;

import java.util.List;
import l83.C23465k;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: com.whoop.settings.b */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0082\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u001e\u0010\b\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00050\u0004¢\u0006\u0004\b\t\u0010\nJ<\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022 \b\u0002\u0010\b\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0016\u001a\u0004\b\u0017\u0010\u000eR/\u0010\b\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, m65681d2 = {"Lcom/whoop/settings/b;", "", "", "name", "", "Ll83/k;", "Lkotlin/Function0;", "Ll83/a0;", "items", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "a", "(Ljava/lang/String;Ljava/util/List;)Lcom/whoop/settings/b;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "d", "b", "Ljava/util/List;", "c", "()Ljava/util/List;", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
final /* data */ class C10093b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String name;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final List<C23465k> items;

    /* JADX WARN: Multi-variable type inference failed */
    public C10093b(String name, List<? extends C23465k> items) {
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(items, "items");
        this.name = name;
        this.items = items;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C10093b m25336b(C10093b c10093b, String str, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = c10093b.name;
        }
        if ((i13 & 2) != 0) {
            list = c10093b.items;
        }
        return c10093b.m25337a(str, list);
    }

    /* JADX INFO: renamed from: a */
    public final C10093b m25337a(String name, List<? extends C23465k> items) {
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(items, "items");
        return new C10093b(name, items);
    }

    /* JADX INFO: renamed from: c */
    public final List<C23465k> m25338c() {
        return this.items;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C10093b)) {
            return false;
        }
        C10093b c10093b = (C10093b) other;
        return AbstractC22676k.m65745e(this.name, c10093b.name) && AbstractC22676k.m65745e(this.items, c10093b.items);
    }

    public int hashCode() {
        return this.items.hashCode() + (this.name.hashCode() * 31);
    }

    public String toString() {
        return AbstractC36095b.m114679g("DebugCategory(name=", this.name, ", items=", ")", this.items);
    }
}
