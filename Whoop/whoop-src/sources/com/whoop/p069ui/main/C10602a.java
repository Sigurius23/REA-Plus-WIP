package com.whoop.p069ui.main;

import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.domain.model.WhoopUri;
import h92.C17029a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.whoop.ui.main.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\f"}, m65681d2 = {"Lcom/whoop/ui/main/a;", "", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "<init>", "(Lcom/whoop/data/repositories/FeatureFlagChecker;)V", "Lcom/whoop/domain/model/WhoopUri;", "selectedUri", "Lcom/whoop/ui/main/a$a;", "a", "(Lcom/whoop/domain/model/WhoopUri;)Lcom/whoop/ui/main/a$a;", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C10602a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: com.whoop.ui.main.a$a */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m65681d2 = {"Lcom/whoop/ui/main/a$a;", "", "<init>", "()V", "b", "c", "a", "Lcom/whoop/ui/main/a$a$a;", "Lcom/whoop/ui/main/a$a$b;", "Lcom/whoop/ui/main/a$a$c;", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static abstract class a {

        /* JADX INFO: renamed from: com.whoop.ui.main.a$a$a, reason: collision with other inner class name */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/ui/main/a$a$a;", "Lcom/whoop/ui/main/a$a;", "<init>", "()V", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C41431a extends a {

            /* JADX INFO: renamed from: a */
            public static final C41431a f32218a = new C41431a();

            private C41431a() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: com.whoop.ui.main.a$a$b */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/ui/main/a$a$b;", "Lcom/whoop/ui/main/a$a;", "<init>", "()V", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class b extends a {

            /* JADX INFO: renamed from: a */
            public static final b f32219a = new b();

            private b() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: com.whoop.ui.main.a$a$c */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/ui/main/a$a$c;", "Lcom/whoop/ui/main/a$a;", "<init>", "()V", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class c extends a {

            /* JADX INFO: renamed from: a */
            public static final c f32220a = new c();

            private c() {
                super(null);
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C10602a(FeatureFlagChecker featureFlagChecker) {
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        this.featureFlagChecker = featureFlagChecker;
    }

    /* JADX INFO: renamed from: a */
    public final a m27348a(WhoopUri selectedUri) {
        C17029a.Companion companion = C17029a.INSTANCE;
        if (companion.m48094b(selectedUri)) {
            return a.c.f32220a;
        }
        return !companion.m48093a(selectedUri) ? a.C41431a.f32218a : a.b.f32219a;
    }
}
