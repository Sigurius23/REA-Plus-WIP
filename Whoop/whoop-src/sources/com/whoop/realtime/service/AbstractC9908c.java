package com.whoop.realtime.service;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.whoop.p069ui.AbstractC10538f;
import hj0.C17358q;
import k52.AbstractC22210f;
import od1.C27848k;
import org.joda.time.LocalDateTime;
import p92.C29016e;

/* JADX INFO: renamed from: com.whoop.realtime.service.c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC9908c {

    /* JADX INFO: renamed from: com.whoop.realtime.service.c$a */
    public static class a extends C17358q {
        public /* synthetic */ a(Context context, Intent intent, int i13) {
            this(context, intent);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: u */
        public a m24290u(long j7) {
            m49150i().putExtra("endTime", j7);
            return this;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: v */
        public a m24291v(long j7) {
            m49150i().putExtra("startTime", j7);
            return this;
        }

        @Override // hj0.C17358q
        /* JADX INFO: renamed from: f */
        public Intent mo23852f() {
            Intent intentMo23852f = super.mo23852f();
            intentMo23852f.setPackage(m49149h().getPackageName());
            return intentMo23852f;
        }

        /* JADX INFO: renamed from: s */
        public Long m24292s() {
            if (m49150i().hasExtra("endTime")) {
                return Long.valueOf(m49150i().getLongExtra("endTime", -1L));
            }
            return null;
        }

        /* JADX INFO: renamed from: t */
        public Long m24293t() {
            if (m49150i().hasExtra("startTime")) {
                return Long.valueOf(m49150i().getLongExtra("startTime", -1L));
            }
            return null;
        }

        public a(Context context) {
            super(context, "com.whoop.realTimeActivityFinished");
        }

        private a(Context context, Intent intent) {
            super(context, intent);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m24280a(Context context, Long l7, Long l12) {
        a aVar = new a(context);
        if (l7 != null) {
            aVar.m24291v(l7.longValue());
        }
        if (l12 != null) {
            aVar.m24290u(l12.longValue());
        }
        context.sendBroadcast(aVar.mo23852f());
    }

    /* JADX INFO: renamed from: b */
    public static IntentFilter m24281b(Context context) {
        return new IntentFilter("com.whoop.realTimeActivityFinished");
    }

    /* JADX INFO: renamed from: c */
    public static String m24282c(Context context, int i13, C29016e c29016e, long j7) {
        return context.getString(m24283d(i13), c29016e.m88168a().mo71415h(context), AbstractC10538f.m27185j(new LocalDateTime(c29016e.m88170c())), AbstractC10538f.m27185j(new LocalDateTime(j7)));
    }

    /* JADX INFO: renamed from: d */
    private static int m24283d(int i13) {
        if (i13 == 11) {
            return AbstractC22210f.f86478g;
        }
        if (i13 == 12) {
            return AbstractC22210f.f86490k;
        }
        if (i13 != 400) {
            return 0;
        }
        return AbstractC22210f.f86496m;
    }

    /* JADX INFO: renamed from: e */
    public static String m24284e(Context context, int i13) {
        return context.getString(m24285f(i13));
    }

    /* JADX INFO: renamed from: f */
    private static int m24285f(int i13) {
        if (i13 == 11) {
            return AbstractC22210f.f86481h;
        }
        if (i13 == 12) {
            return AbstractC22210f.f86493l;
        }
        if (i13 != 400) {
            return 0;
        }
        return AbstractC22210f.f86499n;
    }

    /* JADX INFO: renamed from: g */
    public static int m24286g(C27848k c27848k) {
        if (c27848k.m83961c()) {
            return 0;
        }
        if (c27848k.m83960b()) {
            return 11;
        }
        if (c27848k.m83962d()) {
            return 12;
        }
        return c27848k.m83959a() ? 400 : 5;
    }

    /* JADX INFO: renamed from: h */
    public static a m24287h(Context context, Intent intent) {
        return new a(context, intent, 0);
    }
}
