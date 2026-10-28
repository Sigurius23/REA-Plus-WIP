package com.whoop.challengedetails.domain.models;

import ge3.AbstractC15751g;
import kg2.C22458d;
import kotlinx.serialization.internal.EnumsKt;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p745y81.EnumC39333f;
import q83.AbstractC30060g;
import t83.InterfaceC33616a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\t\b\u0081\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\n¨\u0006\u000b"}, m65681d2 = {"Lcom/whoop/challengedetails/domain/models/ChallengeDetailsStyle;", "", "Ly81/f;", "color", "<init>", "(Ljava/lang/String;ILy81/f;)V", "Ly81/f;", "getColor", "()Ly81/f;", "Companion", "CHALLENGE", "challenge-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public enum ChallengeDetailsStyle {
    CHALLENGE(EnumC39333f.BRAND_WHOOP_PRO);

    private final EnumC39333f color;
    private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final InterfaceC23462h $cachedSerializer$delegate = AbstractC30060g.m92087G(EnumC23463i.f92934x, new C22458d(13));

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/challengedetails/domain/models/ChallengeDetailsStyle$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/challengedetails/domain/models/ChallengeDetailsStyle;", "serializer", "()Lwc3/c;", "challenge-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final /* synthetic */ InterfaceC37138c get$cachedSerializer() {
            return (InterfaceC37138c) ChallengeDetailsStyle.$cachedSerializer$delegate.getValue();
        }

        public final InterfaceC37138c serializer() {
            return get$cachedSerializer();
        }

        private Companion() {
        }
    }

    ChallengeDetailsStyle(EnumC39333f enumC39333f) {
        this.color = enumC39333f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _init_$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.challengedetails.domain.models.ChallengeDetailsStyle", values());
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }

    public final EnumC39333f getColor() {
        return this.color;
    }
}
