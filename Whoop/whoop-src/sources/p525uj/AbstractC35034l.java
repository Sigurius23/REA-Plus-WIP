package p525uj;

import yb3.C39412p;

/* JADX INFO: renamed from: uj.l */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC35034l {

    /* JADX INFO: renamed from: a */
    public static final C39412p f148296a = new C39412p("^\\d+(\\.\\d+)?px$");

    /* JADX INFO: renamed from: b */
    public static final C39412p f148297b = new C39412p("rgb\\(from rgb\\((\\d+), (\\d+), (\\d+)\\) r g b / (\\.\\d+)\\)");

    /* JADX INFO: renamed from: c */
    public static final C39412p f148298c = new C39412p("rgb\\(from #([A-Fa-f0-9]{6}|[A-Fa-f0-9]{8}) r g b / (\\.\\d+|\\d+(\\.\\d+)?)\\)");

    /* JADX INFO: renamed from: d */
    public static final C39412p f148299d = new C39412p("color-mix\\(in srgb, rgba?\\((\\d+), (\\d+), (\\d+)(?:, (\\d+(\\.\\d+)?))?\\) (\\d+)%?, (white|black)\\)");

    /* JADX INFO: renamed from: e */
    public static final C39412p f148300e = new C39412p("rgba?\\((\\d+), (\\d+), (\\d+)(?:, (\\d+(\\.\\d+)?))?\\)");

    /* JADX INFO: renamed from: f */
    public static final C39412p f148301f = new C39412p("var\\(--([\\w-]+)\\)");
}
