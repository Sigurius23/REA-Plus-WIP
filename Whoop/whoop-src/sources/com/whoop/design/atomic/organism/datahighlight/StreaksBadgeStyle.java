package com.whoop.design.atomic.organism.datahighlight;

import com.whoop.design.models.DesignSystemEnum;
import ge3.AbstractC15751g;
import kotlinx.serialization.internal.EnumsKt;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p745y81.EnumC39333f;
import q83.AbstractC30060g;
import s51.C32219p;
import t83.InterfaceC33616a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\u0081\u0002\u0018\u0000 \n2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000bB\u0013\b\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, m65681d2 = {"Lcom/whoop/design/atomic/organism/datahighlight/StreaksBadgeStyle;", "Lcom/whoop/design/models/DesignSystemEnum;", "", "Ly81/f;", "tint", "<init>", "(Ljava/lang/String;ILy81/f;)V", "Ly81/f;", "getTint", "()Ly81/f;", "Companion", "a", "SLEEP", "RECOVERY", "STRAIN", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public enum StreaksBadgeStyle implements DesignSystemEnum {
    SLEEP(EnumC39333f.SLEEP),
    RECOVERY(EnumC39333f.RECOVERY_HIGH_RECOVERY),
    STRAIN(EnumC39333f.STRAIN);

    private final EnumC39333f tint;
    private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final InterfaceC23462h $cachedSerializer$delegate = AbstractC30060g.m92087G(EnumC23463i.f92934x, new C32219p(0));

    /* JADX INFO: renamed from: com.whoop.design.atomic.organism.datahighlight.StreaksBadgeStyle$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/atomic/organism/datahighlight/StreaksBadgeStyle$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/atomic/organism/datahighlight/StreaksBadgeStyle;", "serializer", "()Lwc3/c;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        private final /* synthetic */ InterfaceC37138c m20115a() {
            return (InterfaceC37138c) StreaksBadgeStyle.$cachedSerializer$delegate.getValue();
        }

        public final InterfaceC37138c serializer() {
            return m20115a();
        }

        private Companion() {
        }
    }

    StreaksBadgeStyle(EnumC39333f enumC39333f) {
        this.tint = enumC39333f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _init_$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.atomic.organism.datahighlight.StreaksBadgeStyle", values());
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }

    public final EnumC39333f getTint() {
        return this.tint;
    }

    /* synthetic */ StreaksBadgeStyle(EnumC39333f enumC39333f, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? EnumC39333f.WHITE_20 : enumC39333f);
    }
}
