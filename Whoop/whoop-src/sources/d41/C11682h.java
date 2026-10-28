package d41;

import androidx.core.app.NotificationCompat;
import d11.InterfaceC11466a;
import ih0.AbstractC18489d0;
import l83.C23454a0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: d41.h */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJD\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\n2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\"R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b'\u0010)¨\u0006*"}, m65681d2 = {"Ld41/h;", "Lm91/u;", "", NotificationCompat.CATEGORY_EVENT, "Ld41/g;", "tileSize", "Ld11/a;", "borderInfo", "Ld41/j;", "type", "", "overrideTitleAndSubtitleFontToB2", "<init>", "(Ljava/lang/Object;Ld41/g;Ld11/a;Ld41/j;Z)V", "a", "(Ljava/lang/Object;Ld41/g;Ld11/a;Ld41/j;Z)Ld41/h;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Object;", "getEvent", "()Ljava/lang/Object;", "b", "Ld41/g;", "f", "()Ld41/g;", "c", "Ld11/a;", "()Ld11/a;", "d", "Ld41/j;", "g", "()Ld41/j;", "e", "Z", "()Z", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C11682h implements InterfaceC25312u {

    /* JADX INFO: renamed from: f */
    public static final int f37758f = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Object event;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final EnumC11681g tileSize;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC11466a borderInfo;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final AbstractC11684j type;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final boolean overrideTitleAndSubtitleFontToB2;

    public C11682h(Object event, EnumC11681g tileSize, InterfaceC11466a interfaceC11466a, AbstractC11684j type, boolean z4) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC22676k.m65750j(tileSize, "tileSize");
        AbstractC22676k.m65750j(type, "type");
        this.event = event;
        this.tileSize = tileSize;
        this.borderInfo = interfaceC11466a;
        this.type = type;
        this.overrideTitleAndSubtitleFontToB2 = z4;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C11682h m31135b(C11682h c11682h, Object obj, EnumC11681g enumC11681g, InterfaceC11466a interfaceC11466a, AbstractC11684j abstractC11684j, boolean z4, int i13, Object obj2) {
        if ((i13 & 1) != 0) {
            obj = c11682h.event;
        }
        if ((i13 & 2) != 0) {
            enumC11681g = c11682h.tileSize;
        }
        if ((i13 & 4) != 0) {
            interfaceC11466a = c11682h.borderInfo;
        }
        if ((i13 & 8) != 0) {
            abstractC11684j = c11682h.type;
        }
        if ((i13 & 16) != 0) {
            z4 = c11682h.overrideTitleAndSubtitleFontToB2;
        }
        boolean z13 = z4;
        InterfaceC11466a interfaceC11466a2 = interfaceC11466a;
        return c11682h.m31136a(obj, enumC11681g, interfaceC11466a2, abstractC11684j, z13);
    }

    /* JADX INFO: renamed from: a */
    public final C11682h m31136a(Object event, EnumC11681g tileSize, InterfaceC11466a borderInfo, AbstractC11684j type, boolean overrideTitleAndSubtitleFontToB2) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC22676k.m65750j(tileSize, "tileSize");
        AbstractC22676k.m65750j(type, "type");
        return new C11682h(event, tileSize, borderInfo, type, overrideTitleAndSubtitleFontToB2);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final InterfaceC11466a getBorderInfo() {
        return this.borderInfo;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getOverrideTitleAndSubtitleFontToB2() {
        return this.overrideTitleAndSubtitleFontToB2;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C11682h)) {
            return false;
        }
        C11682h c11682h = (C11682h) other;
        return AbstractC22676k.m65745e(this.event, c11682h.event) && this.tileSize == c11682h.tileSize && AbstractC22676k.m65745e(this.borderInfo, c11682h.borderInfo) && AbstractC22676k.m65745e(this.type, c11682h.type) && this.overrideTitleAndSubtitleFontToB2 == c11682h.overrideTitleAndSubtitleFontToB2;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final EnumC11681g getTileSize() {
        return this.tileSize;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final AbstractC11684j getType() {
        return this.type;
    }

    @Override // p720m91.InterfaceC25312u
    /* JADX INFO: renamed from: getEvent, reason: from getter */
    public Object getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String() {
        return this.event;
    }

    public int hashCode() {
        int iHashCode = (this.tileSize.hashCode() + (this.event.hashCode() * 31)) * 31;
        InterfaceC11466a interfaceC11466a = this.borderInfo;
        return Boolean.hashCode(this.overrideTitleAndSubtitleFontToB2) + ((this.type.hashCode() + ((iHashCode + (interfaceC11466a == null ? 0 : interfaceC11466a.hashCode())) * 31)) * 31);
    }

    public String toString() {
        Object obj = this.event;
        EnumC11681g enumC11681g = this.tileSize;
        InterfaceC11466a interfaceC11466a = this.borderInfo;
        AbstractC11684j abstractC11684j = this.type;
        boolean z4 = this.overrideTitleAndSubtitleFontToB2;
        StringBuilder sb4 = new StringBuilder("ArticleTileState(event=");
        sb4.append(obj);
        sb4.append(", tileSize=");
        sb4.append(enumC11681g);
        sb4.append(", borderInfo=");
        sb4.append(interfaceC11466a);
        sb4.append(", type=");
        sb4.append(abstractC11684j);
        sb4.append(", overrideTitleAndSubtitleFontToB2=");
        return AbstractC18489d0.m53372m(sb4, z4, ")");
    }

    public /* synthetic */ C11682h(Object obj, EnumC11681g enumC11681g, InterfaceC11466a interfaceC11466a, AbstractC11684j abstractC11684j, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? C23454a0.f92919a : obj, enumC11681g, (i13 & 4) != 0 ? null : interfaceC11466a, abstractC11684j, (i13 & 16) != 0 ? false : z4);
    }
}
