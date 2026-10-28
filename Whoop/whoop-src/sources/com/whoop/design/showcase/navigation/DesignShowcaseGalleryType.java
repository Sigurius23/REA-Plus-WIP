package com.whoop.design.showcase.navigation;

import ge3.AbstractC15751g;
import p715kotlin.Metadata;
import t83.InterfaceC33616a;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018¨\u0006\u0019"}, m65681d2 = {"Lcom/whoop/design/showcase/navigation/DesignShowcaseGalleryType;", "", "title", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "ATOM_BUTTON_ICON", "ATOM_SWITCH", "ATOM_ICON_ACTION", "ATOM_ICON_ACTIVITIES", "ATOM_ICON_CONNECTIONS", "ATOM_ICON_GENERAL", "ATOM_ICON_GROWTH", "ATOM_ICON_LOGO", "ATOM_ICON_NAVIGATION", "ATOM_ICON_RECOVERY", "ATOM_ICON_SLEEP", "ATOM_ICON_STRAIN", "ATOM_ICON_STRAP", "ATOM_ICON_VARIOUS", "PARTICLE_COLOR", "PARTICLE_STYLE", "PARTICLE_TYPOGRAPHY", "design-showcase_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public enum DesignShowcaseGalleryType {
    ATOM_BUTTON_ICON("Icon Button"),
    ATOM_SWITCH("Switch"),
    ATOM_ICON_ACTION("Action Icons"),
    ATOM_ICON_ACTIVITIES("Activities Icons"),
    ATOM_ICON_CONNECTIONS("Connections Icons"),
    ATOM_ICON_GENERAL("General Icons"),
    ATOM_ICON_GROWTH("Growth Icons"),
    ATOM_ICON_LOGO("Logo Icons"),
    ATOM_ICON_NAVIGATION("Navigation Icons"),
    ATOM_ICON_RECOVERY("Recovery Icons"),
    ATOM_ICON_SLEEP("Sleep Icons"),
    ATOM_ICON_STRAIN("Strain Icons"),
    ATOM_ICON_STRAP("Strap Icons"),
    ATOM_ICON_VARIOUS("Various Icons"),
    PARTICLE_COLOR("Colors"),
    PARTICLE_STYLE("Styles"),
    PARTICLE_TYPOGRAPHY("Typography");

    private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());
    private final String title;

    DesignShowcaseGalleryType(String str) {
        this.title = str;
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }

    public final String getTitle() {
        return this.title;
    }
}
