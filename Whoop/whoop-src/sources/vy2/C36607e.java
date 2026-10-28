package vy2;

import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: vy2.e */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0012R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001f\u0010\u0012R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u001c\u001a\u0004\b\u0019\u0010\u0012R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\u001c\u001a\u0004\b!\u0010\u0012R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b\u001e\u0010\u0012R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\"\u001a\u0004\b#\u0010$R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006¢\u0006\f\n\u0004\b#\u0010%\u001a\u0004\b \u0010&¨\u0006'"}, m65681d2 = {"Lvy2/e;", "", "", "id", "", "title", "subtitle", "content", "positiveButtonText", "negativeButtonText", "Lvy2/f;", "type", "", "Lvy2/d;", "options", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvy2/f;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Ljava/lang/String;", "g", "c", "f", "d", "e", "Lvy2/f;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Lvy2/f;", "Ljava/util/List;", "()Ljava/util/List;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C36607e {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String title;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String subtitle;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String content;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final String positiveButtonText;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final String negativeButtonText;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final EnumC36608f type;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final List<C36606d> options;

    public C36607e(int i13, String title, String str, String str2, String positiveButtonText, String str3, EnumC36608f type, List<C36606d> options) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(positiveButtonText, "positiveButtonText");
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(options, "options");
        this.id = i13;
        this.title = title;
        this.subtitle = str;
        this.content = str2;
        this.positiveButtonText = positiveButtonText;
        this.negativeButtonText = str3;
        this.type = type;
        this.options = options;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getNegativeButtonText() {
        return this.negativeButtonText;
    }

    /* JADX INFO: renamed from: d */
    public final List<C36606d> m117596d() {
        return this.options;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getPositiveButtonText() {
        return this.positiveButtonText;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C36607e)) {
            return false;
        }
        C36607e c36607e = (C36607e) other;
        return this.id == c36607e.id && AbstractC22676k.m65745e(this.title, c36607e.title) && AbstractC22676k.m65745e(this.subtitle, c36607e.subtitle) && AbstractC22676k.m65745e(this.content, c36607e.content) && AbstractC22676k.m65745e(this.positiveButtonText, c36607e.positiveButtonText) && AbstractC22676k.m65745e(this.negativeButtonText, c36607e.negativeButtonText) && this.type == c36607e.type && AbstractC22676k.m65745e(this.options, c36607e.options);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final EnumC36608f getType() {
        return this.type;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(Integer.hashCode(this.id) * 31, 31, this.title);
        String str = this.subtitle;
        int iHashCode = (iM30450d + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.content;
        int iM30450d2 = AbstractC11266d.m30450d((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.positiveButtonText);
        String str3 = this.negativeButtonText;
        return this.options.hashCode() + ((this.type.hashCode() + ((iM30450d2 + (str3 != null ? str3.hashCode() : 0)) * 31)) * 31);
    }

    public String toString() {
        int i13 = this.id;
        String str = this.title;
        String str2 = this.subtitle;
        String str3 = this.content;
        String str4 = this.positiveButtonText;
        String str5 = this.negativeButtonText;
        EnumC36608f enumC36608f = this.type;
        List<C36606d> list = this.options;
        StringBuilder sbM53373n = AbstractC18489d0.m53373n(i13, "ScreeningQuestion(id=", ", title=", str, ", subtitle=");
        AbstractC11266d.m30444B(sbM53373n, str2, ", content=", str3, ", positiveButtonText=");
        AbstractC11266d.m30444B(sbM53373n, str4, ", negativeButtonText=", str5, ", type=");
        sbM53373n.append(enumC36608f);
        sbM53373n.append(", options=");
        sbM53373n.append(list);
        sbM53373n.append(")");
        return sbM53373n.toString();
    }
}
