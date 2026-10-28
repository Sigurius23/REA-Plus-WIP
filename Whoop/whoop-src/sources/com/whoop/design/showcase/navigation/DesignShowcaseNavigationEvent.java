package com.whoop.design.showcase.navigation;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, m65681d2 = {"Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;", "", "<init>", "()V", "PresentGallery", "PresentLegacyGallery", "PresentMenu", "PresentAtomicGallery", "Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;", "Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentGallery;", "Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentLegacyGallery;", "Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentMenu;", "design-showcase_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class DesignShowcaseNavigationEvent {

    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;", "Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;", "Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;", "type", "<init>", "(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;", "()Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;", "design-showcase_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class PresentAtomicGallery extends DesignShowcaseNavigationEvent {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final DesignShowcaseAtomicType type;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PresentAtomicGallery(DesignShowcaseAtomicType type) {
            super(null);
            AbstractC22676k.m65750j(type, "type");
            this.type = type;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final DesignShowcaseAtomicType getType() {
            return this.type;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PresentAtomicGallery) && this.type == ((PresentAtomicGallery) other).type;
        }

        public int hashCode() {
            return this.type.hashCode();
        }

        public String toString() {
            return "PresentAtomicGallery(type=" + this.type + ")";
        }
    }

    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentGallery;", "Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;", "Lcom/whoop/design/showcase/navigation/DesignShowcaseGalleryType;", "type", "<init>", "(Lcom/whoop/design/showcase/navigation/DesignShowcaseGalleryType;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/showcase/navigation/DesignShowcaseGalleryType;", "()Lcom/whoop/design/showcase/navigation/DesignShowcaseGalleryType;", "design-showcase_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class PresentGallery extends DesignShowcaseNavigationEvent {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final DesignShowcaseGalleryType type;

        /* JADX WARN: Multi-variable type inference failed */
        public PresentGallery() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final DesignShowcaseGalleryType getType() {
            return this.type;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PresentGallery) && this.type == ((PresentGallery) other).type;
        }

        public int hashCode() {
            return this.type.hashCode();
        }

        public String toString() {
            return "PresentGallery(type=" + this.type + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PresentGallery(DesignShowcaseGalleryType type) {
            super(null);
            AbstractC22676k.m65750j(type, "type");
            this.type = type;
        }

        public /* synthetic */ PresentGallery(DesignShowcaseGalleryType designShowcaseGalleryType, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? DesignShowcaseGalleryType.PARTICLE_COLOR : designShowcaseGalleryType);
        }
    }

    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentLegacyGallery;", "Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;", "<init>", "()V", "design-showcase_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class PresentLegacyGallery extends DesignShowcaseNavigationEvent {

        /* JADX INFO: renamed from: a */
        public static final PresentLegacyGallery f25885a = new PresentLegacyGallery();

        private PresentLegacyGallery() {
            super(null);
        }
    }

    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentMenu;", "Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;", "Lcom/whoop/design/showcase/navigation/DesignShowcaseMenuType;", "type", "<init>", "(Lcom/whoop/design/showcase/navigation/DesignShowcaseMenuType;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/showcase/navigation/DesignShowcaseMenuType;", "()Lcom/whoop/design/showcase/navigation/DesignShowcaseMenuType;", "design-showcase_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class PresentMenu extends DesignShowcaseNavigationEvent {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final DesignShowcaseMenuType type;

        /* JADX WARN: Multi-variable type inference failed */
        public PresentMenu() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final DesignShowcaseMenuType getType() {
            return this.type;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PresentMenu) && this.type == ((PresentMenu) other).type;
        }

        public int hashCode() {
            return this.type.hashCode();
        }

        public String toString() {
            return "PresentMenu(type=" + this.type + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PresentMenu(DesignShowcaseMenuType type) {
            super(null);
            AbstractC22676k.m65750j(type, "type");
            this.type = type;
        }

        public /* synthetic */ PresentMenu(DesignShowcaseMenuType designShowcaseMenuType, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? DesignShowcaseMenuType.ROOT : designShowcaseMenuType);
        }
    }

    public /* synthetic */ DesignShowcaseNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private DesignShowcaseNavigationEvent() {
    }
}
