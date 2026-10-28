package androidx.work.impl;

import androidx.room.C1835v;
import androidx.room.InterfaceC1792h1;
import androidx.work.impl.WorkDatabase_Impl;
import c93.InterfaceC4339a;
import j93.InterfaceC21461d;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import l83.C23470p;
import m83.C25271y;
import p249jc.C21573e;
import p249jc.C21593s;
import p249jc.C21595u;
import p420qc.C30193c;
import p420qc.C30195e;
import p420qc.C30197g;
import p420qc.C30199i;
import p420qc.C30202l;
import p420qc.C30204n;
import p420qc.C30211u;
import p420qc.C30213w;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import q83.AbstractC30060g;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Landroidx/work/impl/WorkDatabase_Impl;", "Landroidx/work/impl/WorkDatabase;", "<init>", "()V", "work-runtime_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
public final class WorkDatabase_Impl extends WorkDatabase {

    /* JADX INFO: renamed from: a */
    public final C23470p f7343a;

    /* JADX INFO: renamed from: b */
    public final C23470p f7344b;

    /* JADX INFO: renamed from: c */
    public final C23470p f7345c;

    /* JADX INFO: renamed from: d */
    public final C23470p f7346d;

    /* JADX INFO: renamed from: e */
    public final C23470p f7347e;

    /* JADX INFO: renamed from: f */
    public final C23470p f7348f;

    /* JADX INFO: renamed from: g */
    public final C23470p f7349g;

    /* JADX INFO: renamed from: h */
    public final C23470p f7350h;

    public WorkDatabase_Impl() {
        final int i13 = 0;
        this.f7343a = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: jc.t

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ WorkDatabase_Impl f82800x;

            {
                this.f82800x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        return new C30211u(this.f82800x);
                    case 1:
                        return new C30193c(this.f82800x);
                    case 2:
                        return new C30213w(this.f82800x);
                    case 3:
                        return new C30199i(this.f82800x);
                    case 4:
                        return new C30202l(this.f82800x);
                    case 5:
                        return new C30204n(this.f82800x);
                    case 6:
                        return new C30195e(this.f82800x);
                    default:
                        return new C30197g(this.f82800x);
                }
            }
        });
        final int i14 = 1;
        this.f7344b = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: jc.t

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ WorkDatabase_Impl f82800x;

            {
                this.f82800x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        return new C30211u(this.f82800x);
                    case 1:
                        return new C30193c(this.f82800x);
                    case 2:
                        return new C30213w(this.f82800x);
                    case 3:
                        return new C30199i(this.f82800x);
                    case 4:
                        return new C30202l(this.f82800x);
                    case 5:
                        return new C30204n(this.f82800x);
                    case 6:
                        return new C30195e(this.f82800x);
                    default:
                        return new C30197g(this.f82800x);
                }
            }
        });
        final int i15 = 2;
        this.f7345c = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: jc.t

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ WorkDatabase_Impl f82800x;

            {
                this.f82800x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i15) {
                    case 0:
                        return new C30211u(this.f82800x);
                    case 1:
                        return new C30193c(this.f82800x);
                    case 2:
                        return new C30213w(this.f82800x);
                    case 3:
                        return new C30199i(this.f82800x);
                    case 4:
                        return new C30202l(this.f82800x);
                    case 5:
                        return new C30204n(this.f82800x);
                    case 6:
                        return new C30195e(this.f82800x);
                    default:
                        return new C30197g(this.f82800x);
                }
            }
        });
        final int i16 = 3;
        this.f7346d = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: jc.t

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ WorkDatabase_Impl f82800x;

            {
                this.f82800x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i16) {
                    case 0:
                        return new C30211u(this.f82800x);
                    case 1:
                        return new C30193c(this.f82800x);
                    case 2:
                        return new C30213w(this.f82800x);
                    case 3:
                        return new C30199i(this.f82800x);
                    case 4:
                        return new C30202l(this.f82800x);
                    case 5:
                        return new C30204n(this.f82800x);
                    case 6:
                        return new C30195e(this.f82800x);
                    default:
                        return new C30197g(this.f82800x);
                }
            }
        });
        final int i17 = 4;
        this.f7347e = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: jc.t

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ WorkDatabase_Impl f82800x;

            {
                this.f82800x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i17) {
                    case 0:
                        return new C30211u(this.f82800x);
                    case 1:
                        return new C30193c(this.f82800x);
                    case 2:
                        return new C30213w(this.f82800x);
                    case 3:
                        return new C30199i(this.f82800x);
                    case 4:
                        return new C30202l(this.f82800x);
                    case 5:
                        return new C30204n(this.f82800x);
                    case 6:
                        return new C30195e(this.f82800x);
                    default:
                        return new C30197g(this.f82800x);
                }
            }
        });
        final int i18 = 5;
        this.f7348f = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: jc.t

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ WorkDatabase_Impl f82800x;

            {
                this.f82800x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i18) {
                    case 0:
                        return new C30211u(this.f82800x);
                    case 1:
                        return new C30193c(this.f82800x);
                    case 2:
                        return new C30213w(this.f82800x);
                    case 3:
                        return new C30199i(this.f82800x);
                    case 4:
                        return new C30202l(this.f82800x);
                    case 5:
                        return new C30204n(this.f82800x);
                    case 6:
                        return new C30195e(this.f82800x);
                    default:
                        return new C30197g(this.f82800x);
                }
            }
        });
        final int i19 = 6;
        this.f7349g = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: jc.t

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ WorkDatabase_Impl f82800x;

            {
                this.f82800x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i19) {
                    case 0:
                        return new C30211u(this.f82800x);
                    case 1:
                        return new C30193c(this.f82800x);
                    case 2:
                        return new C30213w(this.f82800x);
                    case 3:
                        return new C30199i(this.f82800x);
                    case 4:
                        return new C30202l(this.f82800x);
                    case 5:
                        return new C30204n(this.f82800x);
                    case 6:
                        return new C30195e(this.f82800x);
                    default:
                        return new C30197g(this.f82800x);
                }
            }
        });
        final int i24 = 7;
        this.f7350h = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: jc.t

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ WorkDatabase_Impl f82800x;

            {
                this.f82800x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i24) {
                    case 0:
                        return new C30211u(this.f82800x);
                    case 1:
                        return new C30193c(this.f82800x);
                    case 2:
                        return new C30213w(this.f82800x);
                    case 3:
                        return new C30199i(this.f82800x);
                    case 4:
                        return new C30202l(this.f82800x);
                    case 5:
                        return new C30204n(this.f82800x);
                    case 6:
                        return new C30195e(this.f82800x);
                    default:
                        return new C30197g(this.f82800x);
                }
            }
        });
    }

    @Override // androidx.work.impl.WorkDatabase
    /* JADX INFO: renamed from: b */
    public final C30193c mo5515b() {
        return (C30193c) this.f7344b.getValue();
    }

    @Override // androidx.work.impl.WorkDatabase
    /* JADX INFO: renamed from: c */
    public final C30195e mo5516c() {
        return (C30195e) this.f7349g.getValue();
    }

    @Override // androidx.room.AbstractC1848z0
    public final void clearAllTables() {
        performClear(true, "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override // androidx.room.AbstractC1848z0
    public final List createAutoMigrations(Map autoMigrationSpecs) {
        AbstractC22676k.m65750j(autoMigrationSpecs, "autoMigrationSpecs");
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C21573e(13, 14, 10));
        arrayList.add(new C21593s(0));
        arrayList.add(new C21573e(16, 17, 11));
        arrayList.add(new C21573e(17, 18, 12));
        arrayList.add(new C21573e(18, 19, 13));
        arrayList.add(new C21593s(1));
        arrayList.add(new C21573e(20, 21, 14));
        arrayList.add(new C21573e(22, 23, 15));
        arrayList.add(new C21573e(23, 24, 16));
        return arrayList;
    }

    @Override // androidx.room.AbstractC1848z0
    public final C1835v createInvalidationTracker() {
        return new C1835v(this, new LinkedHashMap(), new LinkedHashMap(), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override // androidx.room.AbstractC1848z0
    public final InterfaceC1792h1 createOpenDelegate() {
        return new C21595u(this);
    }

    @Override // androidx.work.impl.WorkDatabase
    /* JADX INFO: renamed from: d */
    public final C30197g mo5517d() {
        return (C30197g) this.f7350h.getValue();
    }

    @Override // androidx.work.impl.WorkDatabase
    /* JADX INFO: renamed from: e */
    public final C30199i mo5518e() {
        return (C30199i) this.f7346d.getValue();
    }

    @Override // androidx.work.impl.WorkDatabase
    /* JADX INFO: renamed from: f */
    public final C30202l mo5519f() {
        return (C30202l) this.f7347e.getValue();
    }

    @Override // androidx.work.impl.WorkDatabase
    /* JADX INFO: renamed from: g */
    public final C30204n mo5520g() {
        return (C30204n) this.f7348f.getValue();
    }

    @Override // androidx.room.AbstractC1848z0
    public final Set getRequiredAutoMigrationSpecClasses() {
        return new LinkedHashSet();
    }

    @Override // androidx.room.AbstractC1848z0
    public final Map getRequiredTypeConverterClasses() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(C30211u.class);
        C25271y c25271y = C25271y.f99162w;
        linkedHashMap.put(orCreateKotlinClass, c25271y);
        linkedHashMap.put(c22673i0.getOrCreateKotlinClass(C30193c.class), c25271y);
        linkedHashMap.put(c22673i0.getOrCreateKotlinClass(C30213w.class), c25271y);
        linkedHashMap.put(c22673i0.getOrCreateKotlinClass(C30199i.class), c25271y);
        linkedHashMap.put(c22673i0.getOrCreateKotlinClass(C30202l.class), c25271y);
        linkedHashMap.put(c22673i0.getOrCreateKotlinClass(C30204n.class), c25271y);
        linkedHashMap.put(c22673i0.getOrCreateKotlinClass(C30195e.class), c25271y);
        linkedHashMap.put(c22673i0.getOrCreateKotlinClass(C30197g.class), c25271y);
        return linkedHashMap;
    }

    @Override // androidx.work.impl.WorkDatabase
    /* JADX INFO: renamed from: h */
    public final C30211u mo5521h() {
        return (C30211u) this.f7343a.getValue();
    }

    @Override // androidx.work.impl.WorkDatabase
    /* JADX INFO: renamed from: i */
    public final C30213w mo5522i() {
        return (C30213w) this.f7345c.getValue();
    }
}
