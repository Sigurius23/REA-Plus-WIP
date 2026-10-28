package uh0;

import androidx.core.app.NotificationCompat;
import com.whoop.design.item.DesignItemInteraction;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.NavigationScreenModel;
import com.whoop.navigation.StrengthTrainerScreenModel;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import qr2.AbstractC30556a;
import te0.AbstractC33745d;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: uh0.a */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00042\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0006¨\u0006\u0007"}, m65681d2 = {"Luh0/a;", "", "<init>", "()V", "a", "b", "Luh0/a$a;", "ai-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC34963a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: uh0.a$a */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m65681d2 = {"Luh0/a$a;", "Luh0/a;", "Lcom/whoop/navigation/e;", "destination", "<init>", "(Lcom/whoop/navigation/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lcom/whoop/navigation/e;", "a", "()Lcom/whoop/navigation/e;", "ai-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC34963a {

        /* JADX INFO: renamed from: c */
        public static final int f147933c = C9598e.f28134d;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final C9598e destination;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C9598e destination) {
            super(null);
            AbstractC22676k.m65750j(destination, "destination");
            this.destination = destination;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C9598e getDestination() {
            return this.destination;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a) && AbstractC22676k.m65745e(this.destination, ((a) other).destination);
        }

        public int hashCode() {
            return this.destination.hashCode();
        }

        public String toString() {
            return AbstractC33745d.m106650i("BackendDriveNav(destination=", this.destination, ")");
        }
    }

    /* JADX INFO: renamed from: uh0.a$b, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m65681d2 = {"Luh0/a$b;", "", "<init>", "()V", NotificationCompat.CATEGORY_EVENT, "Ltr2/n;", "logger", "Luh0/a;", "a", "(Ljava/lang/Object;Ltr2/n;)Luh0/a;", "ai-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:13:0x0029  */
        /* JADX WARN: Code duplicated, block: B:15:0x0044  */
        /* JADX WARN: Code duplicated, block: B:17:0x004c  */
        /* JADX INFO: renamed from: a */
        public final AbstractC34963a m110425a(Object event, InterfaceC34116n logger) {
            C9598e c9598eM23127b;
            C9598e c9598e;
            NavigationScreenModel parameters;
            AbstractC22676k.m65750j(event, "event");
            AbstractC22676k.m65750j(logger, "logger");
            if (!(event instanceof C9598e)) {
                if (event instanceof DesignItemInteraction) {
                    Object actionArgument = ((DesignItemInteraction) event).getActionArgument();
                    if (actionArgument instanceof C9598e) {
                        c9598e = (C9598e) actionArgument;
                    }
                    if (c9598eM23127b == null) {
                        logger.mo85228t(AbstractC11266d.m30461o("Ignoring content item event: ", AbstractC22671h0.f89337a.getOrCreateKotlinClass(event.getClass()).getSimpleName()), new AbstractC30556a.a[0]);
                        return null;
                    }
                    parameters = c9598eM23127b.getParameters();
                    if (parameters instanceof StrengthTrainerScreenModel) {
                        c9598eM23127b = C9598e.m23127b(c9598eM23127b, null, StrengthTrainerScreenModel.copy$default((StrengthTrainerScreenModel) parameters, null, null, null, null, true, null, 47, null), null, 5, null);
                    }
                    return new a(c9598eM23127b);
                }
                c9598eM23127b = null;
                if (c9598eM23127b == null) {
                    logger.mo85228t(AbstractC11266d.m30461o("Ignoring content item event: ", AbstractC22671h0.f89337a.getOrCreateKotlinClass(event.getClass()).getSimpleName()), new AbstractC30556a.a[0]);
                    return null;
                }
                parameters = c9598eM23127b.getParameters();
                if (parameters instanceof StrengthTrainerScreenModel) {
                    c9598eM23127b = C9598e.m23127b(c9598eM23127b, null, StrengthTrainerScreenModel.copy$default((StrengthTrainerScreenModel) parameters, null, null, null, null, true, null, 47, null), null, 5, null);
                }
                return new a(c9598eM23127b);
            }
            c9598e = (C9598e) event;
            c9598eM23127b = c9598e;
            if (c9598eM23127b == null) {
                logger.mo85228t(AbstractC11266d.m30461o("Ignoring content item event: ", AbstractC22671h0.f89337a.getOrCreateKotlinClass(event.getClass()).getSimpleName()), new AbstractC30556a.a[0]);
                return null;
            }
            parameters = c9598eM23127b.getParameters();
            if (parameters instanceof StrengthTrainerScreenModel) {
                c9598eM23127b = C9598e.m23127b(c9598eM23127b, null, StrengthTrainerScreenModel.copy$default((StrengthTrainerScreenModel) parameters, null, null, null, null, true, null, 47, null), null, 5, null);
            }
            return new a(c9598eM23127b);
        }

        private Companion() {
        }
    }

    public /* synthetic */ AbstractC34963a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC34963a() {
    }
}
