package io.getstream.chat.android.p226ui.utils.extensions;

import android.text.SpannableString;
import android.text.style.StyleSpan;
import e93.AbstractC12889b;
import i93.C18284j;
import io.getstream.chat.android.p226ui.common.utils.extensions.C19616a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;
import m83.C25235a0;
import p098dt.AbstractC12350b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22679l0;
import wb3.AbstractC37056f;
import xb3.AbstractC38176k;
import yb3.C39410n;
import yb3.C39412p;
import yb3.EnumC39413q;
import yb3.InterfaceC39407k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a5\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0001*\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a)\u0010\f\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\t\u001a\u00020\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0001H\u0000¢\u0006\u0004\b\f\u0010\r\u001a/\u0010\u000e\u001a\u00020\u000b*\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a/\u0010\u0010\u001a\u00020\u000b*\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0010\u0010\u000f\"\u0018\u0010\u0014\u001a\u00020\u0000*\u00020\u00118@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, m65681d2 = {"", "", "items", "", "ignoreCase", "Li93/j;", "getOccurrenceRanges", "(Ljava/lang/String;Ljava/util/List;Z)Ljava/util/List;", "", "typeface", "ranges", "Landroid/text/SpannableString;", "applyTypeface", "(Ljava/lang/String;ILjava/util/List;)Landroid/text/SpannableString;", "bold", "(Ljava/lang/String;Ljava/util/List;Z)Landroid/text/SpannableString;", "italicize", "Lkotlin/String$Companion;", "getEMPTY", "(Lkotlin/jvm/internal/l0;)Ljava/lang/String;", "EMPTY", "stream-chat-android-ui-components_release"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class StringKt {
    public static final SpannableString applyTypeface(String str, int i13, List<C18284j> ranges) {
        AbstractC22676k.m65750j(str, "<this>");
        AbstractC22676k.m65750j(ranges, "ranges");
        SpannableString spannableString = new SpannableString(str);
        for (C18284j c18284j : ranges) {
            spannableString.setSpan(new StyleSpan(i13), c18284j.f71133w, c18284j.f71134x + 1, 33);
        }
        return spannableString;
    }

    public static final SpannableString bold(String str, List<String> list, boolean z4) {
        AbstractC22676k.m65750j(str, "<this>");
        return applyTypeface(str, 1, getOccurrenceRanges(str, list, z4));
    }

    public static /* synthetic */ SpannableString bold$default(String str, List list, boolean z4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = null;
        }
        if ((i13 & 2) != 0) {
            z4 = false;
        }
        return bold(str, list, z4);
    }

    public static final String getEMPTY(AbstractC22679l0 abstractC22679l0) {
        AbstractC22676k.m65750j(abstractC22679l0, "<this>");
        return "";
    }

    public static final List<C18284j> getOccurrenceRanges(String str, List<String> list, boolean z4) {
        AbstractC22676k.m65750j(str, "<this>");
        EnumC39413q enumC39413q = EnumC39413q.IGNORE_CASE;
        if (!z4) {
            enumC39413q = null;
        }
        Set setM34570S = enumC39413q != null ? AbstractC12350b.m34570S(enumC39413q) : C25235a0.f99113w;
        if (list == null) {
            return AbstractC37056f.m118958J(AbstractC12889b.m36278i0(0, str.length()));
        }
        ArrayList arrayList = new ArrayList();
        for (String literal : list) {
            AbstractC22676k.m65750j(literal, "literal");
            String strQuote = Pattern.quote(literal);
            AbstractC22676k.m65749i(strQuote, "quote(...)");
            Iterator it = AbstractC38176k.m122272A(C39412p.m125847b(str, new C39412p(strQuote, setM34570S)), new C19616a(25)).iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
        }
        return arrayList;
    }

    public static /* synthetic */ List getOccurrenceRanges$default(String str, List list, boolean z4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = null;
        }
        if ((i13 & 2) != 0) {
            z4 = false;
        }
        return getOccurrenceRanges(str, list, z4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C18284j getOccurrenceRanges$lambda$2$lambda$1(InterfaceC39407k it) {
        AbstractC22676k.m65750j(it, "it");
        return ((C39410n) it).m125844b();
    }

    public static final SpannableString italicize(String str, List<String> list, boolean z4) {
        AbstractC22676k.m65750j(str, "<this>");
        return applyTypeface(str, 2, getOccurrenceRanges(str, list, z4));
    }

    public static /* synthetic */ SpannableString italicize$default(String str, List list, boolean z4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = null;
        }
        if ((i13 & 2) != 0) {
            z4 = false;
        }
        return italicize(str, list, z4);
    }
}
