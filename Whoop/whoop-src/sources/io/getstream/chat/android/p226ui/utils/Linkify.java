package io.getstream.chat.android.p226ui.utils;

import android.annotation.SuppressLint;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.widget.TextView;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.core.internal.InternalStreamChatApi;
import io.getstream.chat.android.models.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import l83.C23454a0;
import l83.C23465k;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import p000.AbstractC11266d;
import p167g5.AbstractC15484c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;
import wb3.AbstractC37056f;
import yb3.AbstractC39421y;

/* JADX INFO: loaded from: classes3.dex */
@InternalStreamChatApi
@Metadata(m65680d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001%B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0014\u001a\u00020\u0013*\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0006H\u0002¢\u0006\u0004\b\u0014\u0010\u0015JC\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001b0\u001aH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ'\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0006*\b\u0012\u0004\u0012\u00020\u001d0\u00062\u0006\u0010 \u001a\u00020\u0004H\u0002¢\u0006\u0004\b!\u0010\"J#\u0010\n\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\f2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\n\u0010$¨\u0006&"}, m65681d2 = {"Lio/getstream/chat/android/ui/utils/Linkify;", "", "<init>", "()V", "Landroid/text/Spannable;", "spannable", "", "Lio/getstream/chat/android/models/User;", "mentionableUsers", "", "addLinks", "(Landroid/text/Spannable;Ljava/util/List;)Z", "Landroid/widget/TextView;", "t", "Ll83/a0;", "addLinkMovementMethod", "(Landroid/widget/TextView;)V", "", "prefixes", "Landroid/text/style/URLSpan;", "makeUrlSpan", "(Ljava/lang/String;Ljava/util/List;)Landroid/text/style/URLSpan;", "Ljava/util/regex/Pattern;", "pattern", "Landroid/text/util/Linkify$MatchFilter;", "matchFilter", "Lkotlin/Function1;", "Landroid/text/style/ClickableSpan;", "createSpan", "Lio/getstream/chat/android/ui/utils/Linkify$SpanSpec;", "gatherSpanSpecs", "(Landroid/text/Spannable;Ljava/util/regex/Pattern;Landroid/text/util/Linkify$MatchFilter;Lkotlin/jvm/functions/Function1;)Ljava/util/List;", "text", "pruneOverlaps", "(Ljava/util/List;Landroid/text/Spannable;)Ljava/util/List;", "textView", "(Landroid/widget/TextView;Ljava/util/List;)V", "SpanSpec", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class Linkify {
    public static final Linkify INSTANCE = new Linkify();

    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, m65681d2 = {"Lio/getstream/chat/android/ui/utils/Linkify$SpanSpec;", "", "span", "Landroid/text/style/ClickableSpan;", "start", "", "end", "<init>", "(Landroid/text/style/ClickableSpan;II)V", "getSpan", "()Landroid/text/style/ClickableSpan;", "getStart", "()I", "getEnd", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* data */ class SpanSpec {
        private final int end;
        private final ClickableSpan span;
        private final int start;

        public SpanSpec(ClickableSpan span, int i13, int i14) {
            AbstractC22676k.m65750j(span, "span");
            this.span = span;
            this.start = i13;
            this.end = i14;
        }

        public static /* synthetic */ SpanSpec copy$default(SpanSpec spanSpec, ClickableSpan clickableSpan, int i13, int i14, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                clickableSpan = spanSpec.span;
            }
            if ((i15 & 2) != 0) {
                i13 = spanSpec.start;
            }
            if ((i15 & 4) != 0) {
                i14 = spanSpec.end;
            }
            return spanSpec.copy(clickableSpan, i13, i14);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final ClickableSpan getSpan() {
            return this.span;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getStart() {
            return this.start;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final int getEnd() {
            return this.end;
        }

        public final SpanSpec copy(ClickableSpan span, int start, int end) {
            AbstractC22676k.m65750j(span, "span");
            return new SpanSpec(span, start, end);
        }

        public final boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SpanSpec)) {
                return false;
            }
            SpanSpec spanSpec = (SpanSpec) other;
            return AbstractC22676k.m65745e(this.span, spanSpec.span) && this.start == spanSpec.start && this.end == spanSpec.end;
        }

        public final int getEnd() {
            return this.end;
        }

        public final ClickableSpan getSpan() {
            return this.span;
        }

        public final int getStart() {
            return this.start;
        }

        public final int hashCode() {
            return Integer.hashCode(this.end) + AbstractC11266d.m30448b(this.start, this.span.hashCode() * 31, 31);
        }

        public final String toString() {
            ClickableSpan clickableSpan = this.span;
            int i13 = this.start;
            int i14 = this.end;
            StringBuilder sb4 = new StringBuilder("SpanSpec(span=");
            sb4.append(clickableSpan);
            sb4.append(", start=");
            sb4.append(i13);
            sb4.append(", end=");
            return AbstractC18489d0.m53371l(sb4, i14, ")");
        }
    }

    private Linkify() {
    }

    private final void addLinkMovementMethod(TextView t14) {
        if ((t14.getMovementMethod() instanceof LinkMovementMethod) || !t14.getLinksClickable()) {
            return;
        }
        t14.setMovementMethod(LinkMovementMethod.getInstance());
    }

    private static final ClickableSpan addLinks$lambda$0(String it) {
        AbstractC22676k.m65750j(it, "it");
        return INSTANCE.makeUrlSpan(it, AbstractC37056f.m118959K("http://", "https://", "rtsp://"));
    }

    private static final ClickableSpan addLinks$lambda$1(String it) {
        AbstractC22676k.m65750j(it, "it");
        return INSTANCE.makeUrlSpan(it, AbstractC37056f.m118958J("mailto:"));
    }

    private static final ClickableSpan addLinks$lambda$3$lambda$2(User user, String it) {
        AbstractC22676k.m65750j(it, "it");
        return new UserSpan(user);
    }

    private final List<SpanSpec> gatherSpanSpecs(Spannable spannable, Pattern pattern, android.text.util.Linkify.MatchFilter matchFilter, Function1 createSpan) {
        ClickableSpan clickableSpan;
        ArrayList arrayList = new ArrayList();
        Matcher matcher = pattern.matcher(spannable);
        while (matcher.find()) {
            int iStart = matcher.start();
            int iEnd = matcher.end();
            if (matchFilter == null || matchFilter.acceptMatch(spannable, iStart, iEnd)) {
                String strGroup = matcher.group(0);
                if (strGroup != null && (clickableSpan = (ClickableSpan) createSpan.invoke(strGroup)) != null) {
                    arrayList.add(new SpanSpec(clickableSpan, iStart, iEnd));
                }
            }
        }
        return arrayList;
    }

    private final URLSpan makeUrlSpan(String str, List<String> list) {
        String str2;
        List<String> list2 = list;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
        for (String str3 : list2) {
            Locale locale = Locale.US;
            arrayList.add(AbstractC31061c.m95641q(locale, "US", str3, locale, "toLowerCase(...)"));
        }
        C23465k c23465k = new C23465k(str, Boolean.FALSE);
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            String str4 = (String) it.next();
            Object obj = c23465k.f92937w;
            String str5 = (String) (AbstractC39421y.m125930O((String) obj, str4, true) ? obj : null);
            if (str5 != null) {
                c23465k = new C23465k(AbstractC39421y.m125926K(str5, str4, str4, true), Boolean.TRUE);
            }
        }
        if (!((Boolean) c23465k.f92938x).booleanValue()) {
            c23465k = null;
        }
        if (c23465k == null || (str2 = (String) c23465k.f92937w) == null) {
            str2 = AbstractC25265s.m74096F0(list) + str;
        }
        return new URLSpan(str2);
    }

    private final List<SpanSpec> pruneOverlaps(List<SpanSpec> list, Spannable spannable) {
        List<SpanSpec> list2 = list;
        Object[] spans = spannable.getSpans(0, spannable.length(), URLSpan.class);
        AbstractC22676k.m65749i(spans, "getSpans(...)");
        ArrayList<SpanSpec> arrayList = new ArrayList(spans.length);
        for (Object obj : spans) {
            URLSpan uRLSpan = (URLSpan) obj;
            AbstractC22676k.m65747g(uRLSpan);
            arrayList.add(new SpanSpec(uRLSpan, spannable.getSpanStart(uRLSpan), spannable.getSpanEnd(uRLSpan)));
        }
        ArrayList arrayList2 = new ArrayList();
        for (SpanSpec spanSpec : arrayList) {
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : list2) {
                SpanSpec spanSpec2 = (SpanSpec) obj2;
                if (spanSpec2.getStart() <= spanSpec.getStart() && spanSpec2.getEnd() >= spanSpec.getEnd()) {
                    arrayList3.add(obj2);
                }
            }
            ArrayList arrayList4 = new ArrayList();
            for (Object obj3 : list2) {
                SpanSpec spanSpec3 = (SpanSpec) obj3;
                if (spanSpec.getStart() <= spanSpec3.getStart() && spanSpec.getEnd() >= spanSpec3.getEnd()) {
                    arrayList4.add(obj3);
                }
            }
            AbstractC25265s.m74141p0(arrayList2, AbstractC25265s.m74129g1(arrayList3, arrayList4));
        }
        return AbstractC25265s.m74125c1(list2, AbstractC25265s.m74103I1(arrayList2));
    }

    public final void addLinks(TextView textView, List<User> mentionableUsers) {
        AbstractC22676k.m65750j(textView, "textView");
        AbstractC22676k.m65750j(mentionableUsers, "mentionableUsers");
        CharSequence text = textView.getText();
        AbstractC22676k.m65749i(text, "getText(...)");
        if (text instanceof Spannable) {
            if (addLinks((Spannable) text, mentionableUsers)) {
                addLinkMovementMethod(textView);
            }
        } else {
            SpannableString spannableStringValueOf = SpannableString.valueOf(text);
            AbstractC22676k.m65747g(spannableStringValueOf);
            if (addLinks(spannableStringValueOf, mentionableUsers)) {
                addLinkMovementMethod(textView);
                textView.setText(spannableStringValueOf);
            }
        }
    }

    @SuppressLint({"RestrictedApi"})
    private final boolean addLinks(Spannable spannable, List<User> mentionableUsers) {
        Pattern AUTOLINK_WEB_URL = AbstractC15484c.f58140a;
        AbstractC22676k.m65749i(AUTOLINK_WEB_URL, "AUTOLINK_WEB_URL");
        android.text.util.Linkify.MatchFilter matchFilter = android.text.util.Linkify.sUrlMatchFilter;
        ArrayList arrayList = new ArrayList();
        Matcher matcher = AUTOLINK_WEB_URL.matcher(spannable);
        while (matcher.find()) {
            int iStart = matcher.start();
            int iEnd = matcher.end();
            if (matchFilter == null || matchFilter.acceptMatch(spannable, iStart, iEnd)) {
                String strGroup = matcher.group(0);
                if (strGroup != null) {
                    arrayList.add(new SpanSpec((URLSpan) addLinks$lambda$0(strGroup), iStart, iEnd));
                }
            }
        }
        Pattern AUTOLINK_EMAIL_ADDRESS = AbstractC15484c.f58141b;
        AbstractC22676k.m65749i(AUTOLINK_EMAIL_ADDRESS, "AUTOLINK_EMAIL_ADDRESS");
        ArrayList arrayList2 = new ArrayList();
        Matcher matcher2 = AUTOLINK_EMAIL_ADDRESS.matcher(spannable);
        while (matcher2.find()) {
            int iStart2 = matcher2.start();
            int iEnd2 = matcher2.end();
            String strGroup2 = matcher2.group(0);
            if (strGroup2 != null) {
                arrayList2.add(new SpanSpec((URLSpan) addLinks$lambda$1(strGroup2), iStart2, iEnd2));
            }
        }
        ArrayList arrayListM74129g1 = AbstractC25265s.m74129g1(arrayList, arrayList2);
        ArrayList arrayList3 = new ArrayList();
        for (User user : mentionableUsers) {
            Linkify linkify = INSTANCE;
            Pattern patternCompile = Pattern.compile("((?:\\B|^)(@" + user.getName() + ")(?:\\b|$))");
            AbstractC22676k.m65749i(patternCompile, "compile(...)");
            linkify.getClass();
            ArrayList arrayList4 = new ArrayList();
            Matcher matcher3 = patternCompile.matcher(spannable);
            while (matcher3.find()) {
                int iStart3 = matcher3.start();
                int iEnd3 = matcher3.end();
                String strGroup3 = matcher3.group(0);
                if (strGroup3 != null) {
                    arrayList4.add(new SpanSpec((UserSpan) addLinks$lambda$3$lambda$2(user, strGroup3), iStart3, iEnd3));
                }
            }
            AbstractC25265s.m74141p0(arrayList3, arrayList4);
        }
        List<SpanSpec> listPruneOverlaps = pruneOverlaps(AbstractC25265s.m74129g1(arrayListM74129g1, arrayList3), spannable);
        ArrayList arrayList5 = new ArrayList(AbstractC25267u.m74163i0(listPruneOverlaps, 10));
        for (SpanSpec spanSpec : listPruneOverlaps) {
            spannable.setSpan(spanSpec.getSpan(), spanSpec.getStart(), spanSpec.getEnd(), 33);
            arrayList5.add(C23454a0.f92919a);
        }
        return !arrayList5.isEmpty();
    }
}
