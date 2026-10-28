package gh1;

import androidx.compose.p018ui.Modifier;
import gb1.AbstractC15673b0;
import ge3.AbstractC15751g;
import p026b2.C2314t;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import t83.InterfaceC33616a;

/* JADX INFO: renamed from: gh1.a */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0013\b\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, m65681d2 = {"Lgh1/a;", "", "Landroidx/compose/ui/Modifier;", "backgroundModifier", "<init>", "(Ljava/lang/String;ILandroidx/compose/ui/Modifier;)V", "Landroidx/compose/ui/Modifier;", "getBackgroundModifier", "()Landroidx/compose/ui/Modifier;", "DEFAULT", "ADVANCED_LABS", "gifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public enum EnumC15851a {
    DEFAULT(null, 1, null),
    ADVANCED_LABS(AbstractC15673b0.m44038g0(AbstractC15673b0.m44028b0(C2314t.f9131w)));

    private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());
    private final Modifier backgroundModifier;

    EnumC15851a(Modifier modifier) {
        this.backgroundModifier = modifier;
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }

    public final Modifier getBackgroundModifier() {
        return this.backgroundModifier;
    }

    /* synthetic */ EnumC15851a(Modifier modifier, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? AbstractC15673b0.m44028b0(C2314t.f9131w) : modifier);
    }
}
