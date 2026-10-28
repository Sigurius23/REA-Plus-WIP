package p734sl0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m83.AbstractC25265s;
import nl0.C26801c;
import nl0.C26804f;
import nl0.EnumC26800b;
import oh0.C27935c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import sc2.C32375n;

/* JADX INFO: renamed from: sl0.j */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001d\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a)\u0010\u0007\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000H\u0002¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u001f\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a9\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u000b2 \u0010\u0015\u001a\u001c\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013H\u0000¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"", "Lm91/u;", "items", "", "c", "(Ljava/util/List;)Ljava/lang/String;", "content", "b", "(Ljava/lang/String;Ljava/util/List;)Ljava/lang/String;", "Lnl0/f;", "viewState", "Lsl0/w2;", "g", "(Lnl0/f;)Lsl0/w2;", "", "hasContentPrefetched", "f", "(Lnl0/f;Z)Lsl0/w2;", "result", "Lkotlin/Function3;", "Ll83/a0;", "onContentLoaded", "e", "(Lsl0/w2;Lkotlin/jvm/functions/Function3;)V", "bot_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC32624j {
    /* JADX INFO: renamed from: b */
    private static final String m101885b(String str, List<? extends InterfaceC25312u> list) {
        if (str == null || str.length() == 0) {
            return list != null ? m101886c(list) : "";
        }
        return str;
    }

    /* JADX INFO: renamed from: c */
    private static final String m101886c(List<? extends InterfaceC25312u> list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof C27935c) {
                arrayList.add(obj);
            }
        }
        return AbstractC25265s.m74110N0(arrayList, " ", null, null, new C32375n(11), 30);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final CharSequence m101887d(C27935c it) {
        AbstractC22676k.m65750j(it, "it");
        return it.getContent();
    }

    /* JADX INFO: renamed from: e */
    public static final void m101888e(C32689w2 result, Function3 function3) {
        AbstractC22676k.m65750j(result, "result");
        if (!result.getShouldInvokeCallback() || function3 == null) {
            return;
        }
        function3.invoke(result.getPreviewContent(), result.getMessageId(), Boolean.valueOf(result.getWasTextCutoff()));
    }

    /* JADX INFO: renamed from: f */
    public static final C32689w2 m101889f(C26804f viewState, boolean z4) {
        Object next;
        String strM79889e;
        String strM101885b;
        AbstractC22676k.m65750j(viewState, "viewState");
        if (!z4) {
            return new C32689w2(false, "", "", false, 8, null);
        }
        Iterator<T> it = viewState.getConversation().m79883f().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((C26801c) next).getRole() != EnumC26800b.ASSISTANT);
        C26801c c26801c = (C26801c) next;
        String str = (c26801c == null || (strM101885b = m101885b(c26801c.getContent(), c26801c.m79890f())) == null) ? "" : strM101885b;
        String str2 = (c26801c == null || (strM79889e = c26801c.getId()) == null) ? "" : strM79889e;
        return new C32689w2(str2.length() > 0, str, str2, false, 8, null);
    }

    /* JADX INFO: renamed from: g */
    public static final C32689w2 m101890g(C26804f viewState) {
        Object next;
        String strM101885b;
        String strM79889e;
        AbstractC22676k.m65750j(viewState, "viewState");
        Iterator<T> it = viewState.getConversation().m79883f().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            C26801c c26801c = (C26801c) next;
            if (c26801c.getRole() == EnumC26800b.ASSISTANT && m101885b(c26801c.getContent(), c26801c.m79890f()).length() > 0) {
                break;
            }
        }
        C26801c c26801c2 = (C26801c) next;
        if (c26801c2 == null || (strM101885b = m101885b(c26801c2.getContent(), c26801c2.m79890f())) == null) {
            strM101885b = "";
        }
        String str = (c26801c2 == null || (strM79889e = c26801c2.getId()) == null) ? "" : strM79889e;
        boolean z4 = strM101885b.length() > 0 && str.length() > 0;
        return new C32689w2(z4, z4 ? strM101885b : "", str, false, 8, null);
    }
}
