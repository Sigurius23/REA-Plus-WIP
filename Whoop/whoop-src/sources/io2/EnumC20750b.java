package io2;

import ge3.AbstractC15751g;
import p208i2.C17919x;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.C39336i;
import p745y81.Function1;
import p745y81.InterfaceC39332e;
import t83.InterfaceC33616a;

/* JADX INFO: renamed from: io2.b */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, m65681d2 = {"Lio2/b;", "", "Ly81/e;", "textColor", "<init>", "(Ljava/lang/String;ILy81/e;)V", "Ly81/e;", "getTextColor", "()Ly81/e;", "REGULAR", "HIGHLIGHT_GREEN", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public enum EnumC20750b {
    REGULAR(Function1.m125323a(new p715kotlin.jvm.functions.Function1() { // from class: io2.b.a
        /* JADX INFO: renamed from: a */
        public final long m57122a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getBrandWhite();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m57122a((C39336i) obj));
        }
    })),
    HIGHLIGHT_GREEN(Function1.m125323a(new p715kotlin.jvm.functions.Function1() { // from class: io2.b.b
        /* JADX INFO: renamed from: a */
        public final long m57123a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getAccentAction();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m57123a((C39336i) obj));
        }
    }));

    private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());
    private final InterfaceC39332e textColor;

    EnumC20750b(InterfaceC39332e interfaceC39332e) {
        this.textColor = interfaceC39332e;
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }

    public final InterfaceC39332e getTextColor() {
        return this.textColor;
    }
}
