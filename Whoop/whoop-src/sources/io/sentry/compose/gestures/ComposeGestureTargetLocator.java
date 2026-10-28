package io.sentry.compose.gestures;

import android.view.View;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.node.C1134a;
import androidx.compose.p018ui.node.Owner;
import bi.AbstractC3269g;
import io.sentry.C20412l5;
import io.sentry.C20535s;
import io.sentry.InterfaceC20602v0;
import io.sentry.compose.C20300a;
import io.sentry.internal.gestures.C20381c;
import io.sentry.internal.gestures.EnumC20380b;
import io.sentry.internal.gestures.InterfaceC20379a;
import io.sentry.util.C20579a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import l83.C23465k;
import m83.AbstractC25267u;
import p005a3.C0230n0;
import p209i3.C18043y;
import p209i3.InterfaceC18031m;
import p249jc.AbstractC21598x;
import p635y2.C39148y0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m65681d2 = {"Lio/sentry/compose/gestures/ComposeGestureTargetLocator;", "Lio/sentry/internal/gestures/a;", "Lio/sentry/v0;", "logger", "<init>", "(Lio/sentry/v0;)V", "sentry-compose_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final class ComposeGestureTargetLocator implements InterfaceC20379a {

    /* JADX INFO: renamed from: a */
    public final InterfaceC20602v0 f76201a;

    /* JADX INFO: renamed from: b */
    public volatile C20300a f76202b;

    /* JADX INFO: renamed from: c */
    public final C20579a f76203c;

    public ComposeGestureTargetLocator(InterfaceC20602v0 logger) {
        AbstractC22676k.m65750j(logger, "logger");
        this.f76201a = logger;
        this.f76203c = new C20579a();
        C20412l5.m56626d().m56628b("maven:io.sentry:sentry-compose", "8.41.0");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.sentry.internal.gestures.InterfaceC20379a
    /* JADX INFO: renamed from: a */
    public final C20381c mo55964a(View view, float f13, float f14, EnumC20380b targetType) {
        String strM56300a;
        String str;
        AbstractC22676k.m65750j(targetType, "targetType");
        if (view instanceof Owner) {
            if (this.f76202b == null) {
                C20535s c20535sM56711a = this.f76203c.m56711a();
                try {
                    if (this.f76202b == null) {
                        this.f76202b = new C20300a(this.f76201a);
                    }
                    AbstractC21598x.m60698r(c20535sM56711a, null);
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        AbstractC21598x.m60698r(c20535sM56711a, th3);
                        throw th4;
                    }
                }
            }
            C0230n0 root = ((Owner) view).getRoot();
            LinkedList linkedList = new LinkedList();
            linkedList.add(new C23465k(root, null));
            String str2 = null;
            while (!linkedList.isEmpty()) {
                C23465k c23465k = (C23465k) linkedList.poll();
                if (c23465k != null) {
                    C0230n0 c0230n0 = (C0230n0) c23465k.f92937w;
                    String str3 = (String) c23465k.f92938x;
                    if (c0230n0.m606Y()) {
                        if (AbstractC3269g.m9505i((C1134a) c0230n0.f783e0.f740d, (C1134a) root.f783e0.f740d).m47196a((((long) Float.floatToRawIntBits(f13)) << 32) | (((long) Float.floatToRawIntBits(f14)) & 4294967295L))) {
                            C20300a c20300a = this.f76202b;
                            AbstractC22676k.m65747g(c20300a);
                            List listM583D = c0230n0.m583D();
                            int size = listM583D.size();
                            int i13 = 0;
                            int i14 = 0;
                            while (true) {
                                if (i14 >= size) {
                                    strM56300a = null;
                                    break;
                                }
                                strM56300a = c20300a.m56300a(((C39148y0) listM583D.get(i14)).m124666a());
                                if (strM56300a != null) {
                                    break;
                                }
                                i14++;
                            }
                            String str4 = strM56300a == null ? str3 : strM56300a;
                            if (str4 != null) {
                                List listM583D2 = c0230n0.m583D();
                                int size2 = listM583D2.size();
                                while (i13 < size2) {
                                    C39148y0 c39148y0 = (C39148y0) listM583D2.get(i13);
                                    if (c39148y0.m124666a() instanceof InterfaceC18031m) {
                                        Modifier modifierM124666a = c39148y0.m124666a();
                                        AbstractC22676k.m65748h(modifierM124666a, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsModifier");
                                        Iterator it = ((InterfaceC18031m) modifierM124666a).mo3600i().iterator();
                                        while (it.hasNext()) {
                                            String str5 = ((C18043y) ((Map.Entry) it.next()).getKey()).f70064a;
                                            if (targetType == EnumC20380b.SCROLLABLE && "ScrollBy".equals(str5)) {
                                                return new C20381c(null, null, null, str4, "jetpack_compose");
                                            }
                                            if (targetType == EnumC20380b.CLICKABLE && "OnClick".equals(str5)) {
                                                str2 = str4;
                                            }
                                        }
                                    } else {
                                        String name = c39148y0.m124666a().getClass().getName();
                                        if (targetType == EnumC20380b.CLICKABLE && ("androidx.compose.foundation.ClickableElement".equals(name) || "androidx.compose.foundation.CombinedClickableElement".equals(name))) {
                                            str2 = str4;
                                            str = str2;
                                        } else if (targetType == EnumC20380b.SCROLLABLE && ("androidx.compose.foundation.ScrollingLayoutElement".equals(name) || "androidx.compose.foundation.ScrollingContainerElement".equals(name))) {
                                            return new C20381c(null, null, null, str4, "jetpack_compose");
                                        }
                                        i13++;
                                        str4 = str;
                                    }
                                    str = str4;
                                    i13++;
                                    str4 = str;
                                }
                            }
                            String str6 = str4;
                            List listM94889f = c0230n0.m594L().m94889f();
                            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(listM94889f, 10));
                            Iterator it3 = listM94889f.iterator();
                            while (it3.hasNext()) {
                                arrayList.add(new C23465k((C0230n0) it3.next(), str6));
                            }
                            linkedList.addAll(arrayList);
                        } else {
                            continue;
                        }
                    } else {
                        continue;
                    }
                }
            }
            if (str2 != null) {
                return new C20381c(null, null, null, str2, "jetpack_compose");
            }
        }
        return null;
    }
}
