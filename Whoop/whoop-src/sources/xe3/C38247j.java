package xe3;

import af3.AbstractC0822a;
import af3.C0836l;
import ai.C0904j;
import bf3.C3205d;
import cf3.AbstractC4545a;
import java.util.regex.Pattern;
import p188ha.C17039h;

/* JADX INFO: renamed from: xe3.j */
/* JADX INFO: loaded from: classes3.dex */
public final class C38247j extends AbstractC4545a {

    /* JADX INFO: renamed from: e */
    public static final Pattern[][] f163988e = {new Pattern[]{null, null}, new Pattern[]{Pattern.compile("^<(?:script|pre|style|textarea)(?:\\s|>|$)", 2), Pattern.compile("</(?:script|pre|style|textarea)>", 2)}, new Pattern[]{Pattern.compile("^<!--"), Pattern.compile("-->")}, new Pattern[]{Pattern.compile("^<[?]"), Pattern.compile("\\?>")}, new Pattern[]{Pattern.compile("^<![A-Z]"), Pattern.compile(">")}, new Pattern[]{Pattern.compile("^<!\\[CDATA\\["), Pattern.compile("\\]\\]>")}, new Pattern[]{Pattern.compile("^</?(?:address|article|aside|base|basefont|blockquote|body|caption|center|col|colgroup|dd|details|dialog|dir|div|dl|dt|fieldset|figcaption|figure|footer|form|frame|frameset|h1|h2|h3|h4|h5|h6|head|header|hr|html|iframe|legend|li|link|main|menu|menuitem|nav|noframes|ol|optgroup|option|p|param|section|source|summary|table|tbody|td|tfoot|th|thead|title|tr|track|ul)(?:\\s|[/]?[>]|$)", 2), null}, new Pattern[]{Pattern.compile("^(?:<[A-Za-z][A-Za-z0-9-]*(?:\\s+[a-zA-Z_:][a-zA-Z0-9:._-]*(?:\\s*=\\s*(?:[^\"'=<>`\\x00-\\x20]+|'[^']*'|\"[^\"]*\"))?)*\\s*/?>|</[A-Za-z][A-Za-z0-9-]*\\s*[>])\\s*$", 2), null}};

    /* JADX INFO: renamed from: b */
    public final Pattern f163990b;

    /* JADX INFO: renamed from: a */
    public final C0836l f163989a = new C0836l();

    /* JADX INFO: renamed from: c */
    public boolean f163991c = false;

    /* JADX INFO: renamed from: d */
    public C0904j f163992d = new C0904j(13, false);

    public C38247j(Pattern pattern) {
        this.f163990b = pattern;
    }

    @Override // cf3.AbstractC4545a
    /* JADX INFO: renamed from: a */
    public final void mo14221a(C3205d c3205d) {
        C0904j c0904j = this.f163992d;
        CharSequence charSequence = c3205d.f12559a;
        StringBuilder sb4 = (StringBuilder) c0904j.f3302x;
        if (c0904j.f3301w != 0) {
            sb4.append('\n');
        }
        sb4.append(charSequence);
        c0904j.f3301w++;
        Pattern pattern = this.f163990b;
        if (pattern == null || !pattern.matcher(charSequence).find()) {
            return;
        }
        this.f163991c = true;
    }

    @Override // cf3.AbstractC4545a
    /* JADX INFO: renamed from: e */
    public final void mo14225e() {
        ((StringBuilder) this.f163992d.f3302x).toString();
        this.f163989a.getClass();
        this.f163992d = null;
    }

    @Override // cf3.AbstractC4545a
    /* JADX INFO: renamed from: f */
    public final AbstractC0822a mo14226f() {
        return this.f163989a;
    }

    @Override // cf3.AbstractC4545a
    /* JADX INFO: renamed from: i */
    public final C17039h mo14229i(C38244g c38244g) {
        if (this.f163991c) {
            return null;
        }
        if (c38244g.f163973i && this.f163990b == null) {
            return null;
        }
        return C17039h.m48099a(c38244g.f163967c);
    }
}
