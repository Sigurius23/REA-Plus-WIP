package p209i3;

import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.semantics.AppendedSemanticsElement;
import androidx.compose.p018ui.semantics.ClearAndSetSemanticsElement;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import m83.AbstractC25247g0;
import m83.AbstractC25267u;
import p027b3.C2365d3;
import p027b3.C2404l2;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: i3.n */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC18032n {

    /* JADX INFO: renamed from: a */
    public static final AtomicInteger f69984a = new AtomicInteger(0);

    /* JADX INFO: renamed from: a */
    public static final void m51773a(C2404l2 c2404l2, C18030l c18030l) {
        C2365d3 c2365d3M7400b = c2404l2.m7400b();
        int iM73988W = AbstractC25247g0.m73988W(AbstractC25267u.m74163i0(c18030l, 10));
        if (iM73988W < 16) {
            iM73988W = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM73988W);
        Iterator it = c18030l.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(((C18043y) entry.getKey()).f70064a, entry.getValue());
        }
        c2365d3M7400b.m7292c(linkedHashMap, "properties");
    }

    /* JADX INFO: renamed from: b */
    public static final Modifier m51774b(Modifier modifier, Function1 function1) {
        return modifier.mo3471e(new ClearAndSetSemanticsElement(function1));
    }

    /* JADX INFO: renamed from: c */
    public static final Modifier m51775c(Modifier modifier, boolean z4, Function1 function1) {
        return modifier.mo3471e(new AppendedSemanticsElement(z4, function1));
    }
}
