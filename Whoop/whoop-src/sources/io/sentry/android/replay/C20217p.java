package io.sentry.android.replay;

import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: io.sentry.android.replay.p */
/* JADX INFO: loaded from: classes5.dex */
public final class C20217p {

    /* JADX INFO: renamed from: a */
    public volatile EnumC20218q f75940a;

    /* JADX INFO: renamed from: a */
    public final boolean m56141a(EnumC20218q newState) {
        AbstractC22676k.m65750j(newState, "newState");
        switch (AbstractC20216o.f75939a[this.f75940a.ordinal()]) {
            case 1:
                return newState == EnumC20218q.STARTED || newState == EnumC20218q.CLOSED;
            case 2:
                return newState == EnumC20218q.PAUSED || newState == EnumC20218q.STOPPED || newState == EnumC20218q.CLOSED;
            case 3:
                return newState == EnumC20218q.PAUSED || newState == EnumC20218q.STOPPED || newState == EnumC20218q.CLOSED;
            case 4:
                return newState == EnumC20218q.RESUMED || newState == EnumC20218q.STOPPED || newState == EnumC20218q.CLOSED;
            case 5:
                return newState == EnumC20218q.STARTED || newState == EnumC20218q.CLOSED;
            case 6:
                return false;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
