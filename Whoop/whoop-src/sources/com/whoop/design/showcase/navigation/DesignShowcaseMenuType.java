package com.whoop.design.showcase.navigation;

import ge3.AbstractC15751g;
import p715kotlin.Metadata;
import t83.InterfaceC33616a;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u001b\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0000¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016¨\u0006\u0017"}, m65681d2 = {"Lcom/whoop/design/showcase/navigation/DesignShowcaseMenuType;", "", "title", "", "parent", "<init>", "(Ljava/lang/String;ILjava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseMenuType;)V", "getTitle", "()Ljava/lang/String;", "getParent", "()Lcom/whoop/design/showcase/navigation/DesignShowcaseMenuType;", "ROOT", "PARTICLES", "ATOMS", "MOLECULES", "MOLECULES_TILES", "ORGANISMS", "TEMPLATES", "COMPOSE_STRESS_TEST", "ATOM_ICONS", "ATOM_BUTTONS", "MOLECULE_GRAPHING_ELEMENTS", "ATOM_PROGRESS_BAR", "design-showcase_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public enum DesignShowcaseMenuType {
    ROOT("Design Showcase", null),
    PARTICLES("Particles", ROOT),
    ATOMS("Atoms", ROOT),
    MOLECULES("Molecules", ROOT),
    MOLECULES_TILES("Tiles", MOLECULES),
    ORGANISMS("Organisms", ROOT),
    TEMPLATES("Templates", ROOT),
    COMPOSE_STRESS_TEST("Stress Test", ROOT),
    ATOM_ICONS("Icons", ATOMS),
    ATOM_BUTTONS("Buttons", ATOMS),
    MOLECULE_GRAPHING_ELEMENTS("Graphing Elements", MOLECULES),
    ATOM_PROGRESS_BAR("Progress Bar", ATOMS);

    private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());
    private final DesignShowcaseMenuType parent;
    private final String title;

    DesignShowcaseMenuType(String str, DesignShowcaseMenuType designShowcaseMenuType) {
        this.title = str;
        this.parent = designShowcaseMenuType;
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }

    public final DesignShowcaseMenuType getParent() {
        return this.parent;
    }

    public final String getTitle() {
        return this.title;
    }
}
