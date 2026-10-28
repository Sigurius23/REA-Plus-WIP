package u92;

import android.content.Context;
import android.content.SharedPreferences;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import l83.InterfaceC23457c;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import qr2.AbstractC30556a;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: u92.d */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0019\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\nJ\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0012\u001a\u00020\u00112\u0012\u0010\u0010\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u000f\"\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0011¢\u0006\u0004\b\u0016\u0010\u0015J\u001d\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u0017¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\f¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010 \u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\f¢\u0006\u0004\b \u0010!J\u001d\u0010#\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\"¢\u0006\u0004\b#\u0010$J\u001d\u0010%\u001a\u00020\"2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\"¢\u0006\u0004\b%\u0010&J\u001d\u0010(\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020'¢\u0006\u0004\b(\u0010)J\u001d\u0010*\u001a\u00020'2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020'¢\u0006\u0004\b*\u0010+J\u001f\u0010,\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b,\u0010-J!\u0010.\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000b\u001a\u00020\u00042\b\u0010\u001b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b.\u0010/J\u0017\u00100\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b0\u00101J\u001d\u00104\u001a\u00020\u00112\u0006\u00102\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u000203¢\u0006\u0004\b4\u00105J\u001d\u00106\u001a\u0002032\u0006\u00102\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u000203¢\u0006\u0004\b6\u00107J#\u0010:\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\u00042\f\u00109\u001a\b\u0012\u0004\u0012\u00020\u000408¢\u0006\u0004\b:\u0010;J\u001b\u0010<\u001a\b\u0012\u0004\u0012\u00020\u0004082\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b<\u0010=J\u001b\u0010>\u001a\b\u0012\u0004\u0012\u00020\u0004082\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b>\u0010=J\u001f\u0010A\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010@\u001a\u00020?H\u0002¢\u0006\u0004\bA\u0010BJ\u0017\u0010C\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\bC\u00101J\u001f\u0010E\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010D\u001a\u00020\u0017H\u0002¢\u0006\u0004\bE\u0010FR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010GR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010HR\u0014\u0010K\u001a\u00020I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010JR\u0017\u0010O\u001a\b\u0012\u0004\u0012\u00020\u00040L8F¢\u0006\u0006\u001a\u0004\bM\u0010N¨\u0006P"}, m65681d2 = {"Lu92/d;", "", "Landroid/content/SharedPreferences;", "prefs", "", "prefsName", "<init>", "(Landroid/content/SharedPreferences;Ljava/lang/String;)V", "Landroid/content/Context;", "context", "(Landroid/content/Context;Ljava/lang/String;)V", "tag", "", "c", "(Ljava/lang/String;)Z", "", "tags", "Ll83/a0;", "p", "([Ljava/lang/String;)V", "a", "()V", "x", "", "value", "t", "(Ljava/lang/String;I)V", "defaultValue", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Ljava/lang/String;I)I", "q", "(Ljava/lang/String;Z)V", "e", "(Ljava/lang/String;Z)Z", "", "r", "(Ljava/lang/String;D)V", "f", "(Ljava/lang/String;D)D", "", "u", "(Ljava/lang/String;J)V", "i", "(Ljava/lang/String;J)J", "v", "(Ljava/lang/String;Ljava/lang/String;)V", "k", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "j", "(Ljava/lang/String;)Ljava/lang/String;", "key", "", "s", "(Ljava/lang/String;F)V", "g", "(Ljava/lang/String;F)F", "", "strings", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "(Ljava/lang/String;Ljava/util/List;)V", "l", "(Ljava/lang/String;)Ljava/util/List;", "o", "Landroid/content/SharedPreferences$Editor;", "editor", "b", "(Ljava/lang/String;Landroid/content/SharedPreferences$Editor;)V", "n", "index", "m", "(Ljava/lang/String;I)Ljava/lang/String;", "Landroid/content/SharedPreferences;", "Ljava/lang/String;", "Ltr2/n;", "Ltr2/n;", "logger", "", "d", "()Ljava/util/Set;", "allKeys", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public class C34660d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final SharedPreferences prefs;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String prefsName;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    public C34660d(SharedPreferences prefs, String str) {
        AbstractC22676k.m65750j(prefs, "prefs");
        this.prefs = prefs;
        this.prefsName = str;
        this.logger = InterfaceC34116n.INSTANCE.m107848a("PrefsStore");
    }

    /* JADX INFO: renamed from: b */
    private final synchronized void m109522b(String tag, SharedPreferences.Editor editor) {
        String strM109524n = m109524n(tag);
        int i13 = this.prefs.getInt(strM109524n, 0);
        editor.remove(strM109524n);
        for (int i14 = 0; i14 < i13; i14++) {
            editor.remove(m109523m(tag, i14));
        }
    }

    /* JADX INFO: renamed from: m */
    private final String m109523m(String tag, int index) {
        return AbstractC25012a.m73373f(index, tag, "§§§");
    }

    /* JADX INFO: renamed from: n */
    private final String m109524n(String tag) {
        return AbstractC2875y.m8299l(tag, "§§§count");
    }

    /* JADX INFO: renamed from: a */
    public final void m109525a() {
        this.logger.mo85216g(AbstractC11266d.m30461o("clearing all values in prefs ", this.prefsName), new AbstractC30556a.a[0]);
        this.prefs.edit().clear().apply();
    }

    /* JADX INFO: renamed from: c */
    public final boolean m109526c(String tag) {
        AbstractC22676k.m65750j(tag, "tag");
        return this.prefs.contains(tag);
    }

    /* JADX INFO: renamed from: d */
    public final Set<String> m109527d() {
        return this.prefs.getAll().keySet();
    }

    /* JADX INFO: renamed from: e */
    public final boolean m109528e(String tag, boolean defaultValue) {
        AbstractC22676k.m65750j(tag, "tag");
        return this.prefs.getBoolean(tag, defaultValue);
    }

    /* JADX INFO: renamed from: f */
    public final double m109529f(String tag, double defaultValue) {
        AbstractC22676k.m65750j(tag, "tag");
        return !this.prefs.contains(tag) ? defaultValue : Double.longBitsToDouble(this.prefs.getLong(tag, 0L));
    }

    /* JADX INFO: renamed from: g */
    public final float m109530g(String key, float defaultValue) {
        AbstractC22676k.m65750j(key, "key");
        return this.prefs.getFloat(key, defaultValue);
    }

    /* JADX INFO: renamed from: h */
    public final int m109531h(String tag, int defaultValue) {
        AbstractC22676k.m65750j(tag, "tag");
        return this.prefs.getInt(tag, defaultValue);
    }

    /* JADX INFO: renamed from: i */
    public final long m109532i(String tag, long defaultValue) {
        AbstractC22676k.m65750j(tag, "tag");
        return this.prefs.getLong(tag, defaultValue);
    }

    /* JADX INFO: renamed from: j */
    public final String m109533j(String tag) {
        AbstractC22676k.m65750j(tag, "tag");
        return this.prefs.getString(tag, null);
    }

    /* JADX INFO: renamed from: k */
    public final String m109534k(String tag, String defaultValue) {
        AbstractC22676k.m65750j(tag, "tag");
        return this.prefs.getString(tag, defaultValue);
    }

    /* JADX INFO: renamed from: l */
    public final synchronized List<String> m109535l(String tag) {
        ArrayList arrayList;
        AbstractC22676k.m65750j(tag, "tag");
        int i13 = this.prefs.getInt(m109524n(tag), 0);
        arrayList = new ArrayList(i13);
        for (int i14 = 0; i14 < i13; i14++) {
            String string = this.prefs.getString(m109523m(tag, i14), null);
            AbstractC22676k.m65747g(string);
            arrayList.add(string);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: o */
    public final synchronized List<String> m109536o(String tag) {
        ArrayList arrayList;
        try {
            AbstractC22676k.m65750j(tag, "tag");
            int i13 = this.prefs.getInt(m109524n(tag), 0);
            arrayList = new ArrayList(i13);
            for (int i14 = 0; i14 < i13; i14++) {
                String string = this.prefs.getString(m109523m(tag, i14), null);
                if (string != null) {
                    arrayList.add(string);
                } else {
                    this.logger.mo85228t("Missing entry in string list for tag: " + tag + " at index: " + i14, new AbstractC30556a.a[0]);
                }
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: p */
    public final void m109537p(String... tags) {
        AbstractC22676k.m65750j(tags, "tags");
        SharedPreferences.Editor editorEdit = this.prefs.edit();
        for (String str : tags) {
            editorEdit.remove(str);
        }
        editorEdit.apply();
    }

    /* JADX INFO: renamed from: q */
    public final void m109538q(String tag, boolean value) {
        AbstractC22676k.m65750j(tag, "tag");
        this.prefs.edit().putBoolean(tag, value).apply();
    }

    /* JADX INFO: renamed from: r */
    public final void m109539r(String tag, double value) {
        AbstractC22676k.m65750j(tag, "tag");
        this.prefs.edit().putLong(tag, Double.doubleToRawLongBits(value)).apply();
    }

    /* JADX INFO: renamed from: s */
    public final void m109540s(String key, float value) {
        AbstractC22676k.m65750j(key, "key");
        this.prefs.edit().putFloat(key, value).apply();
    }

    /* JADX INFO: renamed from: t */
    public final void m109541t(String tag, int value) {
        AbstractC22676k.m65750j(tag, "tag");
        this.prefs.edit().putInt(tag, value).apply();
    }

    /* JADX INFO: renamed from: u */
    public final void m109542u(String tag, long value) {
        AbstractC22676k.m65750j(tag, "tag");
        this.prefs.edit().putLong(tag, value).apply();
    }

    /* JADX INFO: renamed from: v */
    public final void m109543v(String tag, String value) {
        AbstractC22676k.m65750j(tag, "tag");
        this.prefs.edit().putString(tag, value).apply();
    }

    /* JADX INFO: renamed from: w */
    public final void m109544w(String tag, List<String> strings) {
        AbstractC22676k.m65750j(tag, "tag");
        AbstractC22676k.m65750j(strings, "strings");
        SharedPreferences.Editor editorEdit = this.prefs.edit();
        AbstractC22676k.m65747g(editorEdit);
        m109522b(tag, editorEdit);
        if (!strings.isEmpty()) {
            int size = strings.size();
            editorEdit.putInt(m109524n(tag), size);
            for (int i13 = 0; i13 < size; i13++) {
                editorEdit.putString(m109523m(tag, i13), strings.get(i13));
            }
        }
        editorEdit.apply();
    }

    /* JADX INFO: renamed from: x */
    public final void m109545x() {
        this.prefs.edit().clear().apply();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C34660d(Context context, String prefsName) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(prefsName, "prefsName");
        SharedPreferences sharedPreferences = context.getSharedPreferences(prefsName, 0);
        AbstractC22676k.m65749i(sharedPreferences, "getSharedPreferences(...)");
        this(sharedPreferences, prefsName);
    }
}
