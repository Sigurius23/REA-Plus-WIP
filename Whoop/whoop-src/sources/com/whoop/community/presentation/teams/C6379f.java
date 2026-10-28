package com.whoop.community.presentation.teams;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import rq0.AbstractC31685o;
import rq0.C31707z;
import rq0.EnumC31701w;
import xp0.AbstractC38501b0;
import xp0.AbstractC38505d0;

/* JADX INFO: renamed from: com.whoop.community.presentation.teams.f */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0011\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0013\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010R\u001a\u0010\u0014\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000e\u001a\u0004\b\u000e\u0010\u0010R\u001a\u0010\u0019\u001a\u00020\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, m65681d2 = {"Lcom/whoop/community/presentation/teams/f;", "Lrq0/o;", "<init>", "()V", "", "G", "()Ljava/lang/String;", "H", "Lrq0/z;", "state", "Ll83/a0;", "N", "(Lrq0/z;)V", "", "I", "K", "()I", "titleRes", "J", "nextButtonRes", "layoutRes", "Lrq0/w;", "Lrq0/w;", "getStep", "()Lrq0/w;", "step", "a", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C6379f extends AbstractC31685o {

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: L */
    public static final int f25135L = 8;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final int titleRes = AbstractC38505d0.f165644a2;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final int nextButtonRes = AbstractC38505d0.f165628V1;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final int layoutRes = AbstractC38501b0.f165497S;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private final EnumC31701w step = EnumC31701w.SPLASH;

    /* JADX INFO: renamed from: com.whoop.community.presentation.teams.f$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Lcom/whoop/community/presentation/teams/f$a;", "", "<init>", "()V", "Lcom/whoop/community/presentation/teams/f;", "a", "()Lcom/whoop/community/presentation/teams/f;", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C6379f m19531a() {
            return new C6379f();
        }

        private Companion() {
        }
    }

    @Override // rq0.AbstractC31685o
    /* JADX INFO: renamed from: G */
    public String mo19483G() {
        return "Start";
    }

    @Override // rq0.AbstractC31685o
    /* JADX INFO: renamed from: H */
    public String mo19484H() {
        return "";
    }

    @Override // rq0.AbstractC31685o
    /* JADX INFO: renamed from: I, reason: from getter */
    public int getLayoutRes() {
        return this.layoutRes;
    }

    @Override // rq0.AbstractC31685o
    /* JADX INFO: renamed from: J, reason: from getter */
    public int getNextButtonRes() {
        return this.nextButtonRes;
    }

    @Override // rq0.AbstractC31685o
    /* JADX INFO: renamed from: K, reason: from getter */
    public int getTitleRes() {
        return this.titleRes;
    }

    @Override // rq0.AbstractC31685o
    /* JADX INFO: renamed from: N */
    public void mo19488N(C31707z state) {
        AbstractC22676k.m65750j(state, "state");
        m98186P(true);
    }
}
