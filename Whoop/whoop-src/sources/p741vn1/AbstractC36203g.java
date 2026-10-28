package p741vn1;

import h01.InterfaceC16556w;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: vn1.g */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\b\u0005\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0003\n\u000b\f¨\u0006\r"}, m65681d2 = {"Lvn1/g;", "", "<init>", "()V", "", "a", "()Z", "shouldShow", "b", "c", "Lvn1/g$a;", "Lvn1/g$b;", "Lvn1/g$c;", "home-notifications-center_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC36203g {

    /* JADX INFO: renamed from: a */
    public static final int f155003a = 0;

    /* JADX INFO: renamed from: vn1.g$a */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lvn1/g$a;", "Lvn1/g;", "<init>", "()V", "", "c", "Z", "a", "()Z", "shouldShow", "home-notifications-center_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC36203g {

        /* JADX INFO: renamed from: b */
        public static final a f155004b = new a();

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private static final boolean shouldShow = true;

        private a() {
            super(null);
        }

        @Override // p741vn1.AbstractC36203g
        /* JADX INFO: renamed from: a */
        public boolean mo115206a() {
            return shouldShow;
        }
    }

    /* JADX INFO: renamed from: vn1.g$b */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lvn1/g$b;", "Lvn1/g;", "<init>", "()V", "", "c", "Z", "a", "()Z", "shouldShow", "home-notifications-center_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC36203g {

        /* JADX INFO: renamed from: b */
        public static final b f155006b = new b();

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private static final boolean shouldShow = true;

        private b() {
            super(null);
        }

        @Override // p741vn1.AbstractC36203g
        /* JADX INFO: renamed from: a */
        public boolean mo115206a() {
            return shouldShow;
        }
    }

    public /* synthetic */ AbstractC36203g(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: renamed from: a */
    public abstract boolean mo115206a();

    private AbstractC36203g() {
    }

    /* JADX INFO: renamed from: vn1.g$c */
    @Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001e\u001a\u0004\b\u001a\u0010\u0015R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b$\u0010\"R\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b%\u0010 \u001a\u0004\b\u001f\u0010\"R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b&\u0010\u001b\u001a\u0004\b%\u0010\u001dR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b$\u0010'\u001a\u0004\b&\u0010(R\u001f\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b!\u0010)\u001a\u0004\b#\u0010*R\u0014\u0010,\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010\"¨\u0006-"}, m65681d2 = {"Lvn1/g$c;", "Lvn1/g;", "Lh01/w;", "cardToDisplay", "", "cardStackSize", "", "isUpdating", "playShimmer", "highlightCounter", "nextCard", "Lvn1/i;", "notificationCardDismissAnimation", "", "listOfCards", "<init>", "(Lh01/w;IZZZLh01/w;Lvn1/i;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "Lh01/w;", "c", "()Lh01/w;", "I", "d", "Z", "i", "()Z", "e", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "f", "g", "Lvn1/i;", "()Lvn1/i;", "Ljava/util/List;", "()Ljava/util/List;", "a", "shouldShow", "home-notifications-center_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c extends AbstractC36203g {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final InterfaceC16556w cardToDisplay;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final int cardStackSize;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final boolean isUpdating;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final boolean playShimmer;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final boolean highlightCounter;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final InterfaceC16556w nextCard;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private final EnumC36205i notificationCardDismissAnimation;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        private final List<InterfaceC16556w> listOfCards;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(InterfaceC16556w interfaceC16556w, int i13, boolean z4, boolean z13, boolean z14, InterfaceC16556w interfaceC16556w2, EnumC36205i notificationCardDismissAnimation, List<? extends InterfaceC16556w> list) {
            super(null);
            AbstractC22676k.m65750j(notificationCardDismissAnimation, "notificationCardDismissAnimation");
            this.cardToDisplay = interfaceC16556w;
            this.cardStackSize = i13;
            this.isUpdating = z4;
            this.playShimmer = z13;
            this.highlightCounter = z14;
            this.nextCard = interfaceC16556w2;
            this.notificationCardDismissAnimation = notificationCardDismissAnimation;
            this.listOfCards = list;
        }

        @Override // p741vn1.AbstractC36203g
        /* JADX INFO: renamed from: a */
        public boolean mo115206a() {
            return this.cardStackSize > 0;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getCardStackSize() {
            return this.cardStackSize;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final InterfaceC16556w getCardToDisplay() {
            return this.cardToDisplay;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final boolean getHighlightCounter() {
            return this.highlightCounter;
        }

        /* JADX INFO: renamed from: e */
        public final List<InterfaceC16556w> m115210e() {
            return this.listOfCards;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return AbstractC22676k.m65745e(this.cardToDisplay, cVar.cardToDisplay) && this.cardStackSize == cVar.cardStackSize && this.isUpdating == cVar.isUpdating && this.playShimmer == cVar.playShimmer && this.highlightCounter == cVar.highlightCounter && AbstractC22676k.m65745e(this.nextCard, cVar.nextCard) && this.notificationCardDismissAnimation == cVar.notificationCardDismissAnimation && AbstractC22676k.m65745e(this.listOfCards, cVar.listOfCards);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final InterfaceC16556w getNextCard() {
            return this.nextCard;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final EnumC36205i getNotificationCardDismissAnimation() {
            return this.notificationCardDismissAnimation;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final boolean getPlayShimmer() {
            return this.playShimmer;
        }

        public int hashCode() {
            InterfaceC16556w interfaceC16556w = this.cardToDisplay;
            int iM8289b = AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC11266d.m30448b(this.cardStackSize, (interfaceC16556w == null ? 0 : interfaceC16556w.hashCode()) * 31, 31), 31, this.isUpdating), 31, this.playShimmer), 31, this.highlightCounter);
            InterfaceC16556w interfaceC16556w2 = this.nextCard;
            int iHashCode = (this.notificationCardDismissAnimation.hashCode() + ((iM8289b + (interfaceC16556w2 == null ? 0 : interfaceC16556w2.hashCode())) * 31)) * 31;
            List<InterfaceC16556w> list = this.listOfCards;
            return iHashCode + (list != null ? list.hashCode() : 0);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final boolean getIsUpdating() {
            return this.isUpdating;
        }

        public String toString() {
            InterfaceC16556w interfaceC16556w = this.cardToDisplay;
            int i13 = this.cardStackSize;
            boolean z4 = this.isUpdating;
            boolean z13 = this.playShimmer;
            boolean z14 = this.highlightCounter;
            InterfaceC16556w interfaceC16556w2 = this.nextCard;
            EnumC36205i enumC36205i = this.notificationCardDismissAnimation;
            List<InterfaceC16556w> list = this.listOfCards;
            StringBuilder sb4 = new StringBuilder("Success(cardToDisplay=");
            sb4.append(interfaceC16556w);
            sb4.append(", cardStackSize=");
            sb4.append(i13);
            sb4.append(", isUpdating=");
            AbstractC38963t7.m124392v(sb4, z4, ", playShimmer=", z13, ", highlightCounter=");
            sb4.append(z14);
            sb4.append(", nextCard=");
            sb4.append(interfaceC16556w2);
            sb4.append(", notificationCardDismissAnimation=");
            sb4.append(enumC36205i);
            sb4.append(", listOfCards=");
            sb4.append(list);
            sb4.append(")");
            return sb4.toString();
        }

        public /* synthetic */ c(InterfaceC16556w interfaceC16556w, int i13, boolean z4, boolean z13, boolean z14, InterfaceC16556w interfaceC16556w2, EnumC36205i enumC36205i, List list, int i14, DefaultConstructorMarker defaultConstructorMarker) {
            this(interfaceC16556w, i13, (i14 & 4) != 0 ? false : z4, (i14 & 8) != 0 ? false : z13, (i14 & 16) != 0 ? false : z14, (i14 & 32) != 0 ? null : interfaceC16556w2, (i14 & 64) != 0 ? EnumC36205i.FADE_IN_PLUS_SCALE_IN_WITHOUT_EXIT : enumC36205i, (i14 & 128) != 0 ? null : list);
        }
    }
}
