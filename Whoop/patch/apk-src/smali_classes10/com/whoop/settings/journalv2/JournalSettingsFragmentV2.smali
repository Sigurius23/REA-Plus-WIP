.class public final Lcom/whoop/settings/journalv2/JournalSettingsFragmentV2;
.super Lcom/whoop/settings/i;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J+\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b2\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0003R\u001b\u0010\u0016\u001a\u00020\u00118BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\u0013\u001a\u0004\u0008\u0014\u0010\u0015R\u001b\u0010\u001b\u001a\u00020\u00178BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u0013\u001a\u0004\u0008\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001d\u0010\u001e\u00a8\u0006\"\u00b2\u0006\u000c\u0010!\u001a\u00020 8\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Lcom/whoop/settings/journalv2/JournalSettingsFragmentV2;",
        "Lcom/whoop/settings/i;",
        "<init>",
        "()V",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "Ll83/a0;",
        "onCreate",
        "(Landroid/os/Bundle;)V",
        "Landroid/view/LayoutInflater;",
        "inflater",
        "Landroid/view/ViewGroup;",
        "container",
        "Landroid/view/View;",
        "onCreateView",
        "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;",
        "onResume",
        "Lz82/b;",
        "x",
        "Ll83/h;",
        "N",
        "()Lz82/b;",
        "analyticsManager",
        "Lcom/whoop/settings/journalv2/g;",
        "y",
        "O",
        "()Lcom/whoop/settings/journalv2/g;",
        "viewModel",
        "",
        "getLogTag",
        "()Ljava/lang/String;",
        "logTag",
        "Lcom/whoop/settings/journalv2/h;",
        "viewState",
        "settings_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final x:Ll83/h;

.field private final y:Ll83/h;


# direct methods
.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Lcom/whoop/settings/i;-><init>()V

    sget-object v0, Ll83/i;->w:Ll83/i;

    new-instance v1, Lcom/whoop/settings/journalv2/JournalSettingsFragmentV2$a;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2, v2}, Lcom/whoop/settings/journalv2/JournalSettingsFragmentV2$a;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/settings/journalv2/JournalSettingsFragmentV2;->x:Ll83/h;

    new-instance v0, Lcom/whoop/settings/journalv2/JournalSettingsFragmentV2$b;

    invoke-direct {v0, p0}, Lcom/whoop/settings/journalv2/JournalSettingsFragmentV2$b;-><init>(Landroid/content/ComponentCallbacks;)V

    sget-object v1, Ll83/i;->y:Ll83/i;

    new-instance v3, Lcom/whoop/settings/journalv2/JournalSettingsFragmentV2$c;

    invoke-direct {v3, p0, v2, v0, v2}, Lcom/whoop/settings/journalv2/JournalSettingsFragmentV2$c;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;Lc93/a;)V

    invoke-static {v1, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/settings/journalv2/JournalSettingsFragmentV2;->y:Ll83/h;

    return-void
.end method

.method public static synthetic G()Ll83/a0;
    .locals 1

    invoke-static {}, Lcom/whoop/settings/journalv2/JournalSettingsFragmentV2;->T()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic H(Lcom/whoop/settings/journalv2/JournalSettingsFragmentV2;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/settings/journalv2/JournalSettingsFragmentV2;->R(Lcom/whoop/settings/journalv2/JournalSettingsFragmentV2;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic I(Lcom/whoop/settings/journalv2/JournalSettingsFragmentV2;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/settings/journalv2/JournalSettingsFragmentV2;->W(Lcom/whoop/settings/journalv2/JournalSettingsFragmentV2;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic J(Lcom/whoop/settings/journalv2/JournalSettingsFragmentV2;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/settings/journalv2/JournalSettingsFragmentV2;->P(Lcom/whoop/settings/journalv2/JournalSettingsFragmentV2;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic K(Lcom/whoop/settings/journalv2/JournalSettingsFragmentV2;Leb/x0;JLcom/whoop/journal/model/CurrentCycle;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/whoop/settings/journalv2/JournalSettingsFragmentV2;->U(Lcom/whoop/settings/journalv2/JournalSettingsFragmentV2;Leb/x0;JLcom/whoop/journal/model/CurrentCycle;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic L(Lcom/whoop/settings/journalv2/JournalSettingsFragmentV2;Z)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/settings/journalv2/JournalSettingsFragmentV2;->S(Lcom/whoop/settings/journalv2/JournalSettingsFragmentV2;Z)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic M(Lcom/whoop/settings/journalv2/JournalSettingsFragmentV2;Z)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/settings/journalv2/JournalSettingsFragmentV2;->V(Lcom/whoop/settings/journalv2/JournalSettingsFragmentV2;Z)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private final N()Lz82/b;
    .locals 1

    iget-object v0, p0, Lcom/whoop/settings/journalv2/JournalSettingsFragmentV2;->x:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lz82/b;

    return-object v0
.end method

.method private final O()Lcom/whoop/settings/journalv2/g;
    .locals 1

    iget-object v0, p0, Lcom/whoop/settings/journalv2/JournalSettingsFragmentV2;->y:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/settings/journalv2/g;

    return-object v0
.end method

.method private static final P(Lcom/whoop/settings/journalv2/JournalSettingsFragmentV2;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 17

    move-object/from16 v0, p0

    and-int/lit8 v1, p2, 0x3

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eq v1, v2, :cond_0

    move v1, v3

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    and-int/lit8 v2, p2, 0x1

    move-object/from16 v6, p1

    check-cast v6, Lp1/q;

    invoke-virtual {v6, v2, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_c

    invoke-direct {v0}, Lcom/whoop/settings/journalv2/JournalSettingsFragmentV2;->O()Lcom/whoop/settings/journalv2/g;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/settings/journalv2/g;->getViewState()Lec3/l;

    move-result-object v3

    sget-object v4, Lcom/whoop/settings/journalv2/h$b;->a:Lcom/whoop/settings/journalv2/h$b;

    const/16 v7, 0x30

    const/4 v8, 0x2

    const/4 v5, 0x0

    invoke-static/range {v3 .. v8}, Lp1/x;->n(Lec3/l;Ljava/lang/Object;Lq83/j;Landroidx/compose/runtime/Composer;II)Lp1/c1;

    move-result-object v1

    sget v13, Lnf1/a;->l:I

    sget v16, Lnf1/a;->i:I

    new-instance v7, Leb/x0;

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, -0x1

    const/4 v11, 0x0

    const/4 v12, 0x0

    move v14, v10

    move v15, v10

    invoke-direct/range {v7 .. v16}, Leb/x0;-><init>(ZZIZZIIII)V

    invoke-static {v1}, Lcom/whoop/settings/journalv2/JournalSettingsFragmentV2;->Q(Lp1/t2;)Lcom/whoop/settings/journalv2/h;

    move-result-object v3

    invoke-virtual {v6, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    sget-object v4, Lp1/l;->a:Lp1/v0;

    if-nez v1, :cond_1

    if-ne v2, v4, :cond_2

    :cond_1
    new-instance v2, Lub2/b;

    const/4 v1, 0x0

    invoke-direct {v2, v0, v1}, Lub2/b;-><init>(Lcom/whoop/settings/journalv2/JournalSettingsFragmentV2;I)V

    invoke-virtual {v6, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    check-cast v2, Lc93/a;

    invoke-virtual {v6, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v1, :cond_3

    if-ne v5, v4, :cond_4

    :cond_3
    new-instance v5, Lub2/c;

    const/4 v1, 0x0

    invoke-direct {v5, v0, v1}, Lub2/c;-><init>(Lcom/whoop/settings/journalv2/JournalSettingsFragmentV2;I)V

    invoke-virtual {v6, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    check-cast v5, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v4, :cond_5

    new-instance v1, Lu91/a;

    const/4 v8, 0x5

    invoke-direct {v1, v8}, Lu91/a;-><init>(I)V

    invoke-virtual {v6, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    check-cast v1, Lc93/a;

    invoke-virtual {v6, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    invoke-virtual {v6, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    or-int/2addr v8, v9

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-nez v8, :cond_6

    if-ne v9, v4, :cond_7

    :cond_6
    new-instance v9, Lpp2/o;

    const/16 v8, 0xf

    invoke-direct {v9, v8, v0, v7}, Lpp2/o;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v6, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    move-object v7, v9

    check-cast v7, Lc93/m;

    invoke-virtual {v6, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-nez v8, :cond_8

    if-ne v9, v4, :cond_9

    :cond_8
    new-instance v9, Lub2/c;

    const/4 v8, 0x1

    invoke-direct {v9, v0, v8}, Lub2/c;-><init>(Lcom/whoop/settings/journalv2/JournalSettingsFragmentV2;I)V

    invoke-virtual {v6, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    move-object v8, v9

    check-cast v8, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v6, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-nez v9, :cond_a

    if-ne v10, v4, :cond_b

    :cond_a
    new-instance v10, Lub2/b;

    const/4 v4, 0x1

    invoke-direct {v10, v0, v4}, Lub2/b;-><init>(Lcom/whoop/settings/journalv2/JournalSettingsFragmentV2;I)V

    invoke-virtual {v6, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    move-object v9, v10

    check-cast v9, Lc93/a;

    const/16 v11, 0xc00

    move-object v4, v2

    move-object v10, v6

    move-object v6, v1

    invoke-static/range {v3 .. v11}, Lcom/whoop/settings/journalv2/e;->q(Lcom/whoop/settings/journalv2/h;Lc93/a;Lkotlin/jvm/functions/Function1;Lc93/a;Lc93/m;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    goto :goto_1

    :cond_c
    invoke-virtual {v6}, Lp1/q;->X()V

    :goto_1
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final Q(Lp1/t2;)Lcom/whoop/settings/journalv2/h;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")",
            "Lcom/whoop/settings/journalv2/h;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/whoop/settings/journalv2/h;

    return-object p0
.end method

.method private static final R(Lcom/whoop/settings/journalv2/JournalSettingsFragmentV2;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/squareup/wire/n;->z(Landroidx/fragment/app/m0;)Leb/a0;

    move-result-object p0

    invoke-virtual {p0}, Leb/a0;->z()Z

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final S(Lcom/whoop/settings/journalv2/JournalSettingsFragmentV2;Z)Ll83/a0;
    .locals 6

    invoke-direct {p0}, Lcom/whoop/settings/journalv2/JournalSettingsFragmentV2;->N()Lz82/b;

    move-result-object v0

    const-string v1, "On or Off"

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-static {v2, v1}, Lvl/b;->p(Ljava/lang/Boolean;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v5

    const-string v1, "Recording Data"

    const/4 v2, 0x0

    const/4 v3, 0x0

    const-string v4, "Journal - Toggle Feature"

    invoke-interface/range {v0 .. v5}, Lfi0/a;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    invoke-direct {p0}, Lcom/whoop/settings/journalv2/JournalSettingsFragmentV2;->O()Lcom/whoop/settings/journalv2/g;

    move-result-object p0

    new-instance v0, Lcom/whoop/settings/journalv2/f$a;

    invoke-direct {v0, p1}, Lcom/whoop/settings/journalv2/f$a;-><init>(Z)V

    invoke-virtual {p0, v0}, Lcom/whoop/settings/journalv2/g;->o(Lcom/whoop/settings/journalv2/f;)Lbc3/k1;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final T()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final U(Lcom/whoop/settings/journalv2/JournalSettingsFragmentV2;Leb/x0;JLcom/whoop/journal/model/CurrentCycle;)Ll83/a0;
    .locals 10

    const-string v0, "currentCycle"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Ljava/time/LocalDate;->now()Ljava/time/LocalDate;

    move-result-object v0

    invoke-virtual {p4}, Lcom/whoop/journal/model/CurrentCycle;->getPreviousCycleStartTime()J

    move-result-wide v1

    invoke-virtual {p4}, Lcom/whoop/journal/model/CurrentCycle;->getPreviousCycleEndTime()J

    move-result-wide v3

    invoke-virtual {p4}, Lcom/whoop/journal/model/CurrentCycle;->getTodayCycleStartTime()J

    move-result-wide v5

    invoke-virtual {p4}, Lcom/whoop/journal/model/CurrentCycle;->getTodayCycleEndTime()J

    move-result-wide v7

    const-string p4, "android-app://com.whoop.journal.view.fragment/"

    const-string v9, "/"

    invoke-static {p2, p3, p4, v9}, Lyb0/f;->b(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-virtual {p2, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p3, "?todayCycleStartTime="

    invoke-static {p2, v9, v3, v4, p3}, Lb9/y;->A(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)V

    invoke-virtual {p2, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p3, "&todayCycleEndTime="

    const-string p4, "&fromSettings=true&source=Settings&newHome=false&fromFab=false&showCustomize=false&requestDate="

    invoke-static {p2, p3, v7, v8, p4}, Lb9/y;->A(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)V

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p2

    const-string p3, "uri"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p3, Leb/k0;

    const/4 p4, 0x0

    invoke-direct {p3, p2, p4, p4}, Leb/k0;-><init>(Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {p0}, Lcom/squareup/wire/n;->z(Landroidx/fragment/app/m0;)Leb/a0;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p0, p3, p1}, Leb/a0;->x(Leb/k0;Leb/x0;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final V(Lcom/whoop/settings/journalv2/JournalSettingsFragmentV2;Z)Ll83/a0;
    .locals 1

    invoke-direct {p0}, Lcom/whoop/settings/journalv2/JournalSettingsFragmentV2;->O()Lcom/whoop/settings/journalv2/g;

    move-result-object p0

    new-instance v0, Lcom/whoop/settings/journalv2/f$b;

    invoke-direct {v0, p1}, Lcom/whoop/settings/journalv2/f$b;-><init>(Z)V

    invoke-virtual {p0, v0}, Lcom/whoop/settings/journalv2/g;->o(Lcom/whoop/settings/journalv2/f;)Lbc3/k1;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final W(Lcom/whoop/settings/journalv2/JournalSettingsFragmentV2;)Ll83/a0;
    .locals 1

    invoke-direct {p0}, Lcom/whoop/settings/journalv2/JournalSettingsFragmentV2;->O()Lcom/whoop/settings/journalv2/g;

    move-result-object p0

    sget-object v0, Lcom/whoop/settings/journalv2/f$c;->a:Lcom/whoop/settings/journalv2/f$c;

    invoke-virtual {p0, v0}, Lcom/whoop/settings/journalv2/g;->o(Lcom/whoop/settings/journalv2/f;)Lbc3/k1;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public getLogTag()Ljava/lang/String;
    .locals 1

    const-string v0, "JournalSettingsFragmentV2"

    return-object v0
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    invoke-super {p0, p1}, Lhj0/m;->onCreate(Landroid/os/Bundle;)V

    invoke-static {p0}, Lor2/g0;->l(Landroidx/fragment/app/m0;)V

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->requireActivity()Landroidx/fragment/app/r0;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p1

    const/16 v0, 0x30

    invoke-virtual {p1, v0}, Landroid/view/Window;->setSoftInputMode(I)V

    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    const-string p2, "inflater"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Ltx0/a;

    const/4 p2, 0x6

    invoke-direct {p1, p0, p2}, Ltx0/a;-><init>(Ljava/lang/Object;I)V

    new-instance p2, Lx1/b;

    const/4 p3, 0x1

    const v0, 0x6c064ce3

    invoke-direct {p2, p1, p3, v0}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    invoke-static {p0, p2}, Lkd1/b0;->c(Landroidx/fragment/app/m0;Lc93/m;)Landroidx/compose/ui/platform/ComposeView;

    move-result-object p1

    return-object p1
.end method

.method public onResume()V
    .locals 0

    invoke-super {p0}, Lcom/whoop/settings/i;->onResume()V

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getActivity()Landroidx/fragment/app/r0;

    return-void
.end method
