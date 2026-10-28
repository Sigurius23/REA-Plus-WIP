package p015ak;

import android.view.View;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.node.NodeCoordinator;
import androidx.compose.p018ui.node.Owner;
import fk.InterfaceC14544a;
import io.sentry.internal.debugmeta.C20378c;
import java.lang.reflect.Field;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import l83.C23465k;
import p005a3.C0230n0;
import p005a3.C0246r0;
import p027b3.C2360c3;
import p027b3.InterfaceC2394j2;
import p181h2.C16618c;
import p617xj.C38330b;
import p635y2.AbstractC39125q1;
import p635y2.C39148y0;

/* JADX INFO: renamed from: ak.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C0934b implements InterfaceC0935c {

    /* JADX INFO: renamed from: a */
    public volatile C20378c f3432a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC14544a f3433b;

    public C0934b(InterfaceC14544a interfaceC14544a) {
        this.f3433b = interfaceC14544a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p015ak.InterfaceC0935c
    /* JADX INFO: renamed from: a */
    public final C38330b mo2366a(View view, C23465k c23465k) {
        C16618c c16618cM124660f;
        if (this.f3432a == null) {
            synchronized (this) {
                try {
                    if (this.f3432a == null) {
                        this.f3432a = new C20378c(this.f3433b);
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
        if (view instanceof Owner) {
            ArrayDeque arrayDeque = new ArrayDeque();
            arrayDeque.add(((Owner) view).getRoot());
            String str = null;
            String str2 = null;
            while (!arrayDeque.isEmpty()) {
                C0230n0 c0230n0 = (C0230n0) arrayDeque.poll();
                if (c0230n0 != null) {
                    if (c0230n0.m606Y()) {
                        C20378c c20378c = this.f3432a;
                        float fFloatValue = ((Float) c23465k.f92937w).floatValue();
                        float fFloatValue2 = ((Float) c23465k.f92938x).floatValue();
                        Field field = (Field) c20378c.f76422x;
                        if (field == null) {
                            c16618cM124660f = null;
                        } else {
                            try {
                                C0246r0 c0246r0 = (C0246r0) field.get(c0230n0);
                                if (c0246r0 == null) {
                                    c16618cM124660f = null;
                                } else {
                                    NodeCoordinator nodeCoordinatorM753a = c0246r0.m753a();
                                    nodeCoordinatorM753a.getClass();
                                    c16618cM124660f = AbstractC39125q1.m124660f(nodeCoordinatorM753a);
                                }
                            } catch (Exception unused) {
                                ((InterfaceC14544a) c20378c.f76423y).warn("Could not fetch position for LayoutNode");
                            }
                        }
                        if (c16618cM124660f != null && fFloatValue >= c16618cM124660f.f63939a && fFloatValue <= c16618cM124660f.f63941c && fFloatValue2 >= c16618cM124660f.f63940b && fFloatValue2 <= c16618cM124660f.f63942d) {
                            Iterator it = c0230n0.m583D().iterator();
                            boolean z4 = false;
                            while (it.hasNext()) {
                                Modifier modifier = ((C39148y0) it.next()).f168301a;
                                if (modifier instanceof InterfaceC2394j2) {
                                    InterfaceC2394j2 interfaceC2394j2 = (InterfaceC2394j2) modifier;
                                    if ("testTag".equals(interfaceC2394j2.getNameFallback())) {
                                        for (C2360c3 c2360c3 : interfaceC2394j2.getInspectableElements()) {
                                            if ("tag".equals(c2360c3.f9320a)) {
                                                str = (String) c2360c3.f9321b;
                                                break;
                                            }
                                        }
                                    } else if ("semantics".equals(interfaceC2394j2.getNameFallback())) {
                                        for (C2360c3 c2360c4 : interfaceC2394j2.getInspectableElements()) {
                                            if ("properties".equals(c2360c4.f9320a)) {
                                                Object obj = c2360c4.f9321b;
                                                if (obj instanceof LinkedHashMap) {
                                                    for (Map.Entry entry : ((LinkedHashMap) obj).entrySet()) {
                                                        if ("TestTag".equals(entry.getKey())) {
                                                            str = (String) entry.getValue();
                                                            break;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    if (!"clickable".equals(interfaceC2394j2.getNameFallback())) {
                                        String canonicalName = modifier.getClass().getCanonicalName();
                                        if ("androidx.compose.foundation.ClickableElement".equals(canonicalName) || "androidx.compose.foundation.CombinedClickableElement".equals(canonicalName)) {
                                        }
                                    }
                                    z4 = true;
                                }
                            }
                            if (z4) {
                                str2 = str;
                            }
                        }
                    }
                    arrayDeque.addAll(c0230n0.m594L().m94889f());
                }
            }
            if (str2 != null) {
                return new C38330b(null, null, null, str2, null, "jetpack_compose", null);
            }
        }
        return null;
    }
}
