package za2;

import com.whoop.design.models.items.UpsellCardFeaturesModel;
import com.whoop.design.models.modal.AnyModal;
import com.whoop.settings.banner.models.SettingsBannerDtoV2;
import java.util.List;
import m83.C25271y;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import vc2.AbstractC35880c;

/* JADX INFO: renamed from: za2.f */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m65681d2 = {"Lza2/f;", "", "<init>", "()V", "c", "a", "b", "Lza2/f$a;", "Lza2/f$b;", "Lza2/f$c;", "settings_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC40230f {

    /* JADX INFO: renamed from: za2.f$a */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lza2/f$a;", "Lza2/f;", "<init>", "()V", "settings_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC40230f {

        /* JADX INFO: renamed from: a */
        public static final a f173882a = new a();

        private a() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: za2.f$b */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lza2/f$b;", "Lza2/f;", "<init>", "()V", "settings_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC40230f {

        /* JADX INFO: renamed from: a */
        public static final b f173883a = new b();

        private b() {
            super(null);
        }
    }

    public /* synthetic */ AbstractC40230f(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC40230f() {
    }

    /* JADX INFO: renamed from: za2.f$c */
    @Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJN\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\t2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b'\u0010)\u001a\u0004\b%\u0010*¨\u0006+"}, m65681d2 = {"Lza2/f$c;", "Lza2/f;", "", "Lcom/whoop/settings/banner/models/SettingsBannerDtoV2;", "itemsV2", "Lvc2/c;", "switchPlanModalResult", "Lcom/whoop/design/models/items/UpsellCardFeaturesModel;", "upsellCard", "", "requiresUpdate", "Lcom/whoop/design/models/modal/AnyModal;", "presentedModal", "<init>", "(Ljava/util/List;Lvc2/c;Lcom/whoop/design/models/items/UpsellCardFeaturesModel;ZLcom/whoop/design/models/modal/AnyModal;)V", "a", "(Ljava/util/List;Lvc2/c;Lcom/whoop/design/models/items/UpsellCardFeaturesModel;ZLcom/whoop/design/models/modal/AnyModal;)Lza2/f$c;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "c", "()Ljava/util/List;", "b", "Lvc2/c;", "f", "()Lvc2/c;", "Lcom/whoop/design/models/items/UpsellCardFeaturesModel;", "g", "()Lcom/whoop/design/models/items/UpsellCardFeaturesModel;", "d", "Z", "e", "()Z", "Lcom/whoop/design/models/modal/AnyModal;", "()Lcom/whoop/design/models/modal/AnyModal;", "settings_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c extends AbstractC40230f {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final List<SettingsBannerDtoV2> itemsV2;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final AbstractC35880c switchPlanModalResult;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final UpsellCardFeaturesModel upsellCard;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final boolean requiresUpdate;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final AnyModal presentedModal;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(List<SettingsBannerDtoV2> itemsV2, AbstractC35880c abstractC35880c, UpsellCardFeaturesModel upsellCardFeaturesModel, boolean z4, AnyModal anyModal) {
            super(null);
            AbstractC22676k.m65750j(itemsV2, "itemsV2");
            this.itemsV2 = itemsV2;
            this.switchPlanModalResult = abstractC35880c;
            this.upsellCard = upsellCardFeaturesModel;
            this.requiresUpdate = z4;
            this.presentedModal = anyModal;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: b */
        public static /* synthetic */ c m129180b(c cVar, List list, AbstractC35880c abstractC35880c, UpsellCardFeaturesModel upsellCardFeaturesModel, boolean z4, AnyModal anyModal, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                list = cVar.itemsV2;
            }
            if ((i13 & 2) != 0) {
                abstractC35880c = cVar.switchPlanModalResult;
            }
            if ((i13 & 4) != 0) {
                upsellCardFeaturesModel = cVar.upsellCard;
            }
            if ((i13 & 8) != 0) {
                z4 = cVar.requiresUpdate;
            }
            if ((i13 & 16) != 0) {
                anyModal = cVar.presentedModal;
            }
            AnyModal anyModal2 = anyModal;
            UpsellCardFeaturesModel upsellCardFeaturesModel2 = upsellCardFeaturesModel;
            return cVar.m129181a(list, abstractC35880c, upsellCardFeaturesModel2, z4, anyModal2);
        }

        /* JADX INFO: renamed from: a */
        public final c m129181a(List<SettingsBannerDtoV2> itemsV2, AbstractC35880c switchPlanModalResult, UpsellCardFeaturesModel upsellCard, boolean requiresUpdate, AnyModal presentedModal) {
            AbstractC22676k.m65750j(itemsV2, "itemsV2");
            return new c(itemsV2, switchPlanModalResult, upsellCard, requiresUpdate, presentedModal);
        }

        /* JADX INFO: renamed from: c */
        public final List<SettingsBannerDtoV2> m129182c() {
            return this.itemsV2;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final AnyModal getPresentedModal() {
            return this.presentedModal;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final boolean getRequiresUpdate() {
            return this.requiresUpdate;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return AbstractC22676k.m65745e(this.itemsV2, cVar.itemsV2) && AbstractC22676k.m65745e(this.switchPlanModalResult, cVar.switchPlanModalResult) && AbstractC22676k.m65745e(this.upsellCard, cVar.upsellCard) && this.requiresUpdate == cVar.requiresUpdate && AbstractC22676k.m65745e(this.presentedModal, cVar.presentedModal);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final AbstractC35880c getSwitchPlanModalResult() {
            return this.switchPlanModalResult;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final UpsellCardFeaturesModel getUpsellCard() {
            return this.upsellCard;
        }

        public int hashCode() {
            int iHashCode = this.itemsV2.hashCode() * 31;
            AbstractC35880c abstractC35880c = this.switchPlanModalResult;
            int iHashCode2 = (iHashCode + (abstractC35880c == null ? 0 : abstractC35880c.hashCode())) * 31;
            UpsellCardFeaturesModel upsellCardFeaturesModel = this.upsellCard;
            int iM8289b = AbstractC2875y.m8289b((iHashCode2 + (upsellCardFeaturesModel == null ? 0 : upsellCardFeaturesModel.hashCode())) * 31, 31, this.requiresUpdate);
            AnyModal anyModal = this.presentedModal;
            return iM8289b + (anyModal != null ? anyModal.hashCode() : 0);
        }

        public String toString() {
            return "Success(itemsV2=" + this.itemsV2 + ", switchPlanModalResult=" + this.switchPlanModalResult + ", upsellCard=" + this.upsellCard + ", requiresUpdate=" + this.requiresUpdate + ", presentedModal=" + this.presentedModal + ")";
        }

        public /* synthetic */ c(List list, AbstractC35880c abstractC35880c, UpsellCardFeaturesModel upsellCardFeaturesModel, boolean z4, AnyModal anyModal, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? C25271y.f99162w : list, (i13 & 2) != 0 ? null : abstractC35880c, (i13 & 4) != 0 ? null : upsellCardFeaturesModel, (i13 & 8) != 0 ? false : z4, (i13 & 16) != 0 ? null : anyModal);
        }
    }
}
