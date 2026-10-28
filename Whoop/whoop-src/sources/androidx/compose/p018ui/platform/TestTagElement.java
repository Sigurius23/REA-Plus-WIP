package androidx.compose.p018ui.platform;

import p005a3.AbstractC0207h1;
import p027b3.C2404l2;
import p027b3.C2469y2;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000e\u001a\u00020\n*\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Landroidx/compose/ui/platform/TestTagElement;", "La3/h1;", "Lb3/y2;", "", "tag", "<init>", "(Ljava/lang/String;)V", "create", "()Lb3/y2;", "node", "Ll83/a0;", "update", "(Lb3/y2;)V", "Lb3/l2;", "inspectableProperties", "(Lb3/l2;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Ljava/lang/String;", "ui_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
final class TestTagElement extends AbstractC0207h1 {
    private final String tag;

    public TestTagElement(String str) {
        this.tag = str;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof TestTagElement) {
            return AbstractC22676k.m65745e(this.tag, ((TestTagElement) other).tag);
        }
        return false;
    }

    public int hashCode() {
        return this.tag.hashCode();
    }

    @Override // p005a3.AbstractC0207h1
    public void inspectableProperties(C2404l2 c2404l2) {
        c2404l2.m7401c("testTag");
        c2404l2.m7400b().m7292c(this.tag, "tag");
    }

    @Override // p005a3.AbstractC0207h1
    public C2469y2 create() {
        String str = this.tag;
        C2469y2 c2469y2 = new C2469y2();
        c2469y2.f9620O = str;
        return c2469y2;
    }

    @Override // p005a3.AbstractC0207h1
    public void update(C2469y2 node) {
        node.f9620O = this.tag;
    }
}
