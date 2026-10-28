package com.whoop.coacheverywherecommon.models;

import ep0.C13395a;
import ge3.AbstractC15751g;
import java.lang.annotation.Annotation;
import java.util.Iterator;
import kotlinx.serialization.internal.EnumsKt;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import t83.InterfaceC33616a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yb3.AbstractC39421y;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m65681d2 = {"Lcom/whoop/coacheverywherecommon/models/CoachEducationType;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "a", "COACH_EVERYWHERE_DAY_ZERO", "OVERLAY_COACH_EVERYWHERE", "NONE", "coach-everywhere-common_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public enum CoachEducationType {
    COACH_EVERYWHERE_DAY_ZERO,
    OVERLAY_COACH_EVERYWHERE,
    NONE;

    private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final InterfaceC23462h $cachedSerializer$delegate = AbstractC30060g.m92087G(EnumC23463i.f92934x, new C13395a(2));

    /* JADX INFO: renamed from: com.whoop.coacheverywherecommon.models.CoachEducationType$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m65681d2 = {"Lcom/whoop/coacheverywherecommon/models/CoachEducationType$a;", "", "<init>", "()V", "", "educationType", "Lcom/whoop/coacheverywherecommon/models/CoachEducationType;", "a", "(Ljava/lang/String;)Lcom/whoop/coacheverywherecommon/models/CoachEducationType;", "Lwc3/c;", "serializer", "()Lwc3/c;", "coach-everywhere-common_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: b */
        private final /* synthetic */ InterfaceC37138c m18518b() {
            return (InterfaceC37138c) CoachEducationType.$cachedSerializer$delegate.getValue();
        }

        /* JADX INFO: renamed from: a */
        public final CoachEducationType m18519a(String educationType) {
            Object next;
            Iterator<E> it = CoachEducationType.getEntries().iterator();
            while (it.hasNext()) {
                next = it.next();
                if (AbstractC39421y.m125921F(((CoachEducationType) next).name(), educationType, true)) {
                    return (CoachEducationType) next;
                }
            }
            next = null;
            return (CoachEducationType) next;
        }

        public final InterfaceC37138c serializer() {
            return m18518b();
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _init_$_anonymous_() {
        return EnumsKt.createAnnotatedEnumSerializer("com.whoop.coacheverywherecommon.models.CoachEducationType", values(), new String[]{"COACH_EVERYWHERE_DAY_ZERO", "OVERLAY_COACH_EVERYWHERE", "NONE"}, new Annotation[][]{null, null, null}, null);
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }
}
