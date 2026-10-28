package cm2;

import com.whoop.domain.model.UnitSystem;
import ge3.AbstractC15751g;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import t83.InterfaceC33616a;

/* JADX INFO: renamed from: cm2.j */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m65681d2 = {"Lcm2/j;", "", "<init>", "(Ljava/lang/String;I)V", "Lcom/whoop/domain/model/UnitSystem;", "getUnitSystem", "()Lcom/whoop/domain/model/UnitSystem;", "KG", "LBS", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public enum EnumC4822j {
    KG { // from class: cm2.j.a
        @Override // cm2.EnumC4822j
        public UnitSystem getUnitSystem() {
            return UnitSystem.METRIC;
        }
    },
    LBS { // from class: cm2.j.b
        @Override // cm2.EnumC4822j
        public UnitSystem getUnitSystem() {
            return UnitSystem.IMPERIAL;
        }
    };

    private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());

    /* synthetic */ EnumC4822j(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }

    public abstract UnitSystem getUnitSystem();
}
