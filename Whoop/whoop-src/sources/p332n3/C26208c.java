package p332n3;

import java.text.BreakIterator;
import p522uf.AbstractC34870c0;

/* JADX INFO: renamed from: n3.c */
/* JADX INFO: loaded from: classes5.dex */
public final class C26208c extends AbstractC34870c0 {

    /* JADX INFO: renamed from: x */
    public final BreakIterator f103923x;

    public C26208c(CharSequence charSequence) {
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(charSequence.toString());
        this.f103923x = characterInstance;
    }

    @Override // p522uf.AbstractC34870c0
    /* JADX INFO: renamed from: d0 */
    public final int mo77819d0(int i13) {
        return this.f103923x.following(i13);
    }

    @Override // p522uf.AbstractC34870c0
    /* JADX INFO: renamed from: g0 */
    public final int mo77820g0(int i13) {
        return this.f103923x.preceding(i13);
    }
}
