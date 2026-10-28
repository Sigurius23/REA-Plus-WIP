package uz1;

import ge3.AbstractC15751g;
import p208i2.C17919x;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.C39336i;
import p745y81.Function1;
import p745y81.InterfaceC39332e;
import t83.InterfaceC33616a;

/* JADX INFO: renamed from: uz1.b */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B!\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\b\u001a\u0004\b\u000b\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\f\u0010\nj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, m65681d2 = {"Luz1/b;", "", "Ly81/e;", "shoppingCartIconColor", "badgeTextColor", "badgeBackgroundColor", "<init>", "(Ljava/lang/String;ILy81/e;Ly81/e;Ly81/e;)V", "Ly81/e;", "getShoppingCartIconColor", "()Ly81/e;", "getBadgeTextColor", "getBadgeBackgroundColor", "LIGHT", "DARK", "native-store_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public enum EnumC35424b {
    LIGHT(Function1.m125323a(new p715kotlin.jvm.functions.Function1() { // from class: uz1.b.a
        /* JADX INFO: renamed from: a */
        public final long m112401a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getBrandBlack();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m112401a((C39336i) obj));
        }
    }), Function1.m125323a(new p715kotlin.jvm.functions.Function1() { // from class: uz1.b.b
        /* JADX INFO: renamed from: a */
        public final long m112402a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getBrandWhite();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m112402a((C39336i) obj));
        }
    }), Function1.m125323a(new p715kotlin.jvm.functions.Function1() { // from class: uz1.b.c
        /* JADX INFO: renamed from: a */
        public final long m112403a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getBrandBlack();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m112403a((C39336i) obj));
        }
    })),
    DARK(Function1.m125323a(new p715kotlin.jvm.functions.Function1() { // from class: uz1.b.d
        /* JADX INFO: renamed from: a */
        public final long m112404a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getBrandWhite();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m112404a((C39336i) obj));
        }
    }), Function1.m125323a(new p715kotlin.jvm.functions.Function1() { // from class: uz1.b.e
        /* JADX INFO: renamed from: a */
        public final long m112405a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getBrandBlack();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m112405a((C39336i) obj));
        }
    }), Function1.m125323a(new p715kotlin.jvm.functions.Function1() { // from class: uz1.b.f
        /* JADX INFO: renamed from: a */
        public final long m112406a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getBrandWhite();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m112406a((C39336i) obj));
        }
    }));

    private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());
    private final InterfaceC39332e badgeBackgroundColor;
    private final InterfaceC39332e badgeTextColor;
    private final InterfaceC39332e shoppingCartIconColor;

    EnumC35424b(InterfaceC39332e interfaceC39332e, InterfaceC39332e interfaceC39332e2, InterfaceC39332e interfaceC39332e3) {
        this.shoppingCartIconColor = interfaceC39332e;
        this.badgeTextColor = interfaceC39332e2;
        this.badgeBackgroundColor = interfaceC39332e3;
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }

    public final InterfaceC39332e getBadgeBackgroundColor() {
        return this.badgeBackgroundColor;
    }

    public final InterfaceC39332e getBadgeTextColor() {
        return this.badgeTextColor;
    }

    public final InterfaceC39332e getShoppingCartIconColor() {
        return this.shoppingCartIconColor;
    }
}
