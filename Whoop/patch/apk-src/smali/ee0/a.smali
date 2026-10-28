.class public final Lee0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u001f\u0010\u000c\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\u000b\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0013\u0010\u0010\u001a\u00020\u000f*\u00020\u000eH\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u001f\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0002\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J%\u0010\u001c\u001a\u0004\u0018\u00010\u00182\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0002\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ!\u0010 \u001a\u0008\u0012\u0004\u0012\u00020\n0\u001e2\u000c\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u001e\u00a2\u0006\u0004\u0008 \u0010!R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\"\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010$\u00a8\u0006%"
    }
    d2 = {
        "Lee0/a;",
        "",
        "Ljb1/a;",
        "reducer",
        "Lnd0/a;",
        "schedulingButtonStateFactory",
        "<init>",
        "(Ljb1/a;Lnd0/a;)V",
        "Lae0/b;",
        "domainResult",
        "Lce0/d;",
        "currentViewState",
        "b",
        "(Lae0/b;Lce0/d;)Lce0/d;",
        "Lae0/b$j;",
        "Lce0/d$c;",
        "d",
        "(Lae0/b$j;)Lce0/d$c;",
        "Lc31/k;",
        "currentButton",
        "",
        "isAppointmentSelected",
        "e",
        "(Lc31/k;Z)Lc31/k;",
        "Lce0/a;",
        "formContent",
        "Lde0/a;",
        "selectedAppointment",
        "f",
        "(Lce0/a;Lde0/a;)Lce0/a;",
        "Lec3/l;",
        "domainResults",
        "c",
        "(Lec3/l;)Lec3/l;",
        "a",
        "Ljb1/a;",
        "Lnd0/a;",
        "advanced-labs_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final c:I


# instance fields
.field private final a:Ljb1/a;

.field private final b:Lnd0/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget v0, Ljb1/a;->c:I

    sput v0, Lee0/a;->c:I

    return-void
.end method

.method public constructor <init>(Ljb1/a;Lnd0/a;)V
    .locals 1

    const-string v0, "reducer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "schedulingButtonStateFactory"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lee0/a;->a:Ljb1/a;

    .line 3
    iput-object p2, p0, Lee0/a;->b:Lnd0/a;

    return-void
.end method

.method public synthetic constructor <init>(Ljb1/a;Lnd0/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    .line 4
    invoke-static {}, Lmd0/c;->z0()Ljb1/a;

    move-result-object p1

    .line 5
    :cond_0
    invoke-direct {p0, p1, p2}, Lee0/a;-><init>(Ljb1/a;Lnd0/a;)V

    return-void
.end method

.method public static final synthetic a(Lee0/a;Lae0/b;Lce0/d;)Lce0/d;
    .locals 0

    invoke-direct {p0, p1, p2}, Lee0/a;->b(Lae0/b;Lce0/d;)Lce0/d;

    move-result-object p0

    return-object p0
.end method

.method private final b(Lae0/b;Lce0/d;)Lce0/d;
    .locals 21

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    instance-of v3, v1, Lae0/b$j;

    if-eqz v3, :cond_0

    check-cast v1, Lae0/b$j;

    invoke-direct {v0, v1}, Lee0/a;->d(Lae0/b$j;)Lce0/d$c;

    move-result-object v1

    return-object v1

    :cond_0
    instance-of v3, v1, Lae0/b$d;

    if-eqz v3, :cond_1

    sget-object v1, Lce0/d$a;->b:Lce0/d$a;

    return-object v1

    :cond_1
    instance-of v3, v1, Lae0/b$b;

    if-eqz v3, :cond_2

    instance-of v3, v2, Lce0/d$c;

    if-eqz v3, :cond_f

    new-instance v12, Lde0/a;

    check-cast v1, Lae0/b$b;

    invoke-virtual {v1}, Lae0/b$b;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Lae0/b$b;->a()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v12, v3, v1}, Lde0/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    move-object v4, v2

    check-cast v4, Lce0/d$c;

    invoke-virtual {v4}, Lce0/d$c;->e()Lc31/k;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lee0/a;->e(Lc31/k;Z)Lc31/k;

    move-result-object v10

    invoke-virtual {v4}, Lce0/d$c;->h()Lce0/a;

    move-result-object v1

    invoke-direct {v0, v1, v12}, Lee0/a;->f(Lce0/a;Lde0/a;)Lce0/a;

    move-result-object v9

    const/16 v18, 0x1f4f

    const/16 v19, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-static/range {v4 .. v19}, Lce0/d$c;->c(Lce0/d$c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lm91/u;Lce0/a;Lc31/k;Lcom/whoop/navigation/e;Lde0/a;Lsz0/q0;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lce0/d$c;

    move-result-object v1

    return-object v1

    :cond_2
    instance-of v3, v1, Lae0/b$a;

    const/4 v4, 0x0

    if-eqz v3, :cond_3

    instance-of v1, v2, Lce0/d$c;

    if-eqz v1, :cond_f

    move-object v5, v2

    check-cast v5, Lce0/d$c;

    invoke-virtual {v5}, Lce0/d$c;->e()Lc31/k;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lee0/a;->e(Lc31/k;Z)Lc31/k;

    move-result-object v11

    invoke-virtual {v5}, Lce0/d$c;->h()Lce0/a;

    move-result-object v1

    invoke-direct {v0, v1, v4}, Lee0/a;->f(Lce0/a;Lde0/a;)Lce0/a;

    move-result-object v10

    const/16 v19, 0x1f4f

    const/16 v20, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    invoke-static/range {v5 .. v20}, Lce0/d$c;->c(Lce0/d$c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lm91/u;Lce0/a;Lc31/k;Lcom/whoop/navigation/e;Lde0/a;Lsz0/q0;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lce0/d$c;

    move-result-object v1

    return-object v1

    :cond_3
    instance-of v3, v1, Lae0/b$f;

    if-eqz v3, :cond_4

    instance-of v1, v2, Lce0/d$c;

    if-eqz v1, :cond_f

    check-cast v2, Lce0/d$c;

    new-instance v3, Lsz0/q0;

    sget-object v5, Lsz0/p0$f;->e:Lsz0/p0$f;

    const/16 v14, 0x3fd

    const/4 v15, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-direct/range {v3 .. v15}, Lsz0/q0;-><init>(Landroidx/compose/ui/Modifier;Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;ZZLcom/whoop/design/util/TextResource;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v16, 0x1eff

    const/16 v17, 0x0

    move-object v11, v3

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-static/range {v2 .. v17}, Lce0/d$c;->c(Lce0/d$c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lm91/u;Lce0/a;Lc31/k;Lcom/whoop/navigation/e;Lde0/a;Lsz0/q0;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lce0/d$c;

    move-result-object v1

    return-object v1

    :cond_4
    instance-of v3, v1, Lae0/b$e;

    if-eqz v3, :cond_6

    instance-of v3, v2, Lce0/d$c;

    if-eqz v3, :cond_f

    move-object v5, v2

    check-cast v5, Lce0/d$c;

    check-cast v1, Lae0/b$e;

    invoke-virtual {v1}, Lae0/b$e;->a()Z

    move-result v1

    if-eqz v1, :cond_5

    new-instance v6, Lsz0/q0;

    new-instance v7, Lsz0/p0$h;

    const/4 v12, 0x7

    const/4 v13, 0x0

    const/4 v8, 0x0

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    invoke-direct/range {v7 .. v13}, Lsz0/p0$h;-><init>(Lcom/whoop/design/util/TextResource;JLc93/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v17, 0x3fd

    const/16 v18, 0x0

    move-object v8, v7

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-direct/range {v6 .. v18}, Lsz0/q0;-><init>(Landroidx/compose/ui/Modifier;Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;ZZLcom/whoop/design/util/TextResource;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v14, v6

    goto :goto_0

    :cond_5
    new-instance v7, Lsz0/q0;

    new-instance v8, Lsz0/p0$b;

    new-instance v9, Lcom/whoop/design/util/TextResource$b;

    sget v1, Luv0/c;->H:I

    const/4 v2, 0x2

    invoke-direct {v9, v1, v4, v2, v4}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v12, 0x6

    const/4 v13, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-direct/range {v8 .. v13}, Lsz0/p0$b;-><init>(Lcom/whoop/design/util/TextResource;ZLkd1/o;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v12, Lcom/whoop/design/util/TextResource$b;

    sget v1, Luv0/c;->E:I

    invoke-direct {v12, v1, v4, v2, v4}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v18, 0x3ed

    const/16 v19, 0x0

    move-object v9, v8

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-direct/range {v7 .. v19}, Lsz0/q0;-><init>(Landroidx/compose/ui/Modifier;Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;ZZLcom/whoop/design/util/TextResource;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v14, v7

    :goto_0
    const/16 v19, 0x1eff

    const/16 v20, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    invoke-static/range {v5 .. v20}, Lce0/d$c;->c(Lce0/d$c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lm91/u;Lce0/a;Lc31/k;Lcom/whoop/navigation/e;Lde0/a;Lsz0/q0;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lce0/d$c;

    move-result-object v1

    return-object v1

    :cond_6
    instance-of v3, v1, Lae0/b$c;

    if-eqz v3, :cond_7

    instance-of v1, v2, Lce0/d$c;

    if-eqz v1, :cond_f

    check-cast v2, Lce0/d$c;

    const/16 v16, 0x1eff

    const/16 v17, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-static/range {v2 .. v17}, Lce0/d$c;->c(Lce0/d$c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lm91/u;Lce0/a;Lc31/k;Lcom/whoop/navigation/e;Lde0/a;Lsz0/q0;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lce0/d$c;

    move-result-object v1

    return-object v1

    :cond_7
    instance-of v3, v1, Lae0/b$h;

    if-eqz v3, :cond_c

    instance-of v3, v2, Lce0/d$c;

    if-eqz v3, :cond_b

    move-object v5, v2

    check-cast v5, Lce0/d$c;

    check-cast v1, Lae0/b$h;

    invoke-virtual {v1}, Lae0/b$h;->a()Lcom/whoop/advancedlabs/domain/models/FormContent;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/advancedlabs/domain/models/FormContent;->getHeaderInfoCallout()Lcom/whoop/design/models/InfoCalloutTileModel;

    move-result-object v2

    if-eqz v2, :cond_8

    iget-object v3, v0, Lee0/a;->a:Ljb1/a;

    invoke-virtual {v3, v2}, Ljb1/a;->h(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object v2

    goto :goto_1

    :cond_8
    move-object v2, v4

    :goto_1
    invoke-virtual {v1}, Lae0/b$h;->a()Lcom/whoop/advancedlabs/domain/models/FormContent;

    move-result-object v3

    invoke-virtual {v3}, Lcom/whoop/advancedlabs/domain/models/FormContent;->getSchedulingDatePicker()Lcom/whoop/advancedlabs/domain/models/SchedulingDatePickerModel;

    move-result-object v3

    if-eqz v3, :cond_9

    iget-object v6, v0, Lee0/a;->a:Ljb1/a;

    invoke-virtual {v6, v3}, Ljb1/a;->h(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object v3

    goto :goto_2

    :cond_9
    move-object v3, v4

    :goto_2
    invoke-virtual {v1}, Lae0/b$h;->a()Lcom/whoop/advancedlabs/domain/models/FormContent;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/advancedlabs/domain/models/FormContent;->getErrorCard()Lcom/whoop/design/models/tiles/EmptyTileModel;

    move-result-object v1

    if-eqz v1, :cond_a

    iget-object v4, v0, Lee0/a;->a:Ljb1/a;

    invoke-virtual {v4, v1}, Ljb1/a;->h(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object v4

    :cond_a
    new-instance v10, Lce0/a;

    invoke-direct {v10, v2, v3, v4}, Lce0/a;-><init>(Lm91/u;Lm91/u;Lm91/u;)V

    const/16 v19, 0x1def

    const/16 v20, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    invoke-static/range {v5 .. v20}, Lce0/d$c;->c(Lce0/d$c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lm91/u;Lce0/a;Lc31/k;Lcom/whoop/navigation/e;Lde0/a;Lsz0/q0;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lce0/d$c;

    move-result-object v1

    return-object v1

    :cond_b
    sget-object v1, Lce0/d$b;->b:Lce0/d$b;

    return-object v1

    :cond_c
    instance-of v3, v1, Lae0/b$g;

    if-eqz v3, :cond_e

    instance-of v1, v2, Lce0/d$c;

    if-eqz v1, :cond_d

    check-cast v2, Lce0/d$c;

    const/16 v16, 0x1dff

    const/16 v17, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-static/range {v2 .. v17}, Lce0/d$c;->c(Lce0/d$c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lm91/u;Lce0/a;Lc31/k;Lcom/whoop/navigation/e;Lde0/a;Lsz0/q0;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lce0/d$c;

    move-result-object v1

    return-object v1

    :cond_d
    sget-object v1, Lce0/d$a;->b:Lce0/d$a;

    return-object v1

    :cond_e
    instance-of v3, v1, Lae0/b$i;

    if-eqz v3, :cond_10

    instance-of v3, v2, Lce0/d$c;

    if-eqz v3, :cond_f

    move-object v4, v2

    check-cast v4, Lce0/d$c;

    check-cast v1, Lae0/b$i;

    invoke-virtual {v1}, Lae0/b$i;->a()Z

    move-result v14

    const/16 v18, 0x1dff

    const/16 v19, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-static/range {v4 .. v19}, Lce0/d$c;->c(Lce0/d$c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lm91/u;Lce0/a;Lc31/k;Lcom/whoop/navigation/e;Lde0/a;Lsz0/q0;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lce0/d$c;

    move-result-object v1

    return-object v1

    :cond_f
    return-object v2

    :cond_10
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1
.end method

.method private final d(Lae0/b$j;)Lce0/d$c;
    .locals 18

    move-object/from16 v0, p0

    invoke-virtual/range {p1 .. p1}, Lae0/b$j;->c()Lcom/whoop/advancedlabs/domain/models/SchedulingFormResponse;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/advancedlabs/domain/models/SchedulingFormResponse;->getTitle()Ljava/lang/String;

    move-result-object v3

    invoke-virtual/range {p1 .. p1}, Lae0/b$j;->c()Lcom/whoop/advancedlabs/domain/models/SchedulingFormResponse;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/advancedlabs/domain/models/SchedulingFormResponse;->getSubtitle()Ljava/lang/String;

    move-result-object v4

    invoke-virtual/range {p1 .. p1}, Lae0/b$j;->c()Lcom/whoop/advancedlabs/domain/models/SchedulingFormResponse;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/advancedlabs/domain/models/SchedulingFormResponse;->getSearchHeaderDisplay()Ljava/lang/String;

    move-result-object v5

    invoke-virtual/range {p1 .. p1}, Lae0/b$j;->c()Lcom/whoop/advancedlabs/domain/models/SchedulingFormResponse;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/advancedlabs/domain/models/SchedulingFormResponse;->getTestTile()Lcom/whoop/advancedlabs/domain/models/TestTileModel;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    iget-object v6, v0, Lee0/a;->a:Ljb1/a;

    invoke-virtual {v6, v1}, Ljb1/a;->h(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object v1

    move-object v6, v1

    goto :goto_0

    :cond_0
    move-object v6, v2

    :goto_0
    invoke-virtual/range {p1 .. p1}, Lae0/b$j;->c()Lcom/whoop/advancedlabs/domain/models/SchedulingFormResponse;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/advancedlabs/domain/models/SchedulingFormResponse;->getFormContent()Lcom/whoop/advancedlabs/domain/models/FormContent;

    move-result-object v1

    if-eqz v1, :cond_4

    invoke-virtual {v1}, Lcom/whoop/advancedlabs/domain/models/FormContent;->getHeaderInfoCallout()Lcom/whoop/design/models/InfoCalloutTileModel;

    move-result-object v7

    if-eqz v7, :cond_1

    iget-object v8, v0, Lee0/a;->a:Ljb1/a;

    invoke-virtual {v8, v7}, Ljb1/a;->h(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object v7

    goto :goto_1

    :cond_1
    move-object v7, v2

    :goto_1
    invoke-virtual {v1}, Lcom/whoop/advancedlabs/domain/models/FormContent;->getSchedulingDatePicker()Lcom/whoop/advancedlabs/domain/models/SchedulingDatePickerModel;

    move-result-object v8

    if-eqz v8, :cond_2

    iget-object v9, v0, Lee0/a;->a:Ljb1/a;

    invoke-virtual {v9, v8}, Ljb1/a;->h(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object v8

    goto :goto_2

    :cond_2
    move-object v8, v2

    :goto_2
    invoke-virtual {v1}, Lcom/whoop/advancedlabs/domain/models/FormContent;->getErrorCard()Lcom/whoop/design/models/tiles/EmptyTileModel;

    move-result-object v1

    if-eqz v1, :cond_3

    iget-object v2, v0, Lee0/a;->a:Ljb1/a;

    invoke-virtual {v2, v1}, Ljb1/a;->h(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object v2

    :cond_3
    new-instance v1, Lce0/a;

    invoke-direct {v1, v7, v8, v2}, Lce0/a;-><init>(Lm91/u;Lm91/u;Lm91/u;)V

    move-object v7, v1

    goto :goto_3

    :cond_4
    move-object v7, v2

    :goto_3
    iget-object v1, v0, Lee0/a;->b:Lnd0/a;

    invoke-virtual/range {p1 .. p1}, Lae0/b$j;->c()Lcom/whoop/advancedlabs/domain/models/SchedulingFormResponse;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/advancedlabs/domain/models/SchedulingFormResponse;->getButton()Lcom/whoop/advancedlabs/domain/models/SchedulingButton;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/advancedlabs/domain/models/SchedulingButton;->getTextDisplay()Ljava/lang/String;

    move-result-object v2

    invoke-virtual/range {p1 .. p1}, Lae0/b$j;->c()Lcom/whoop/advancedlabs/domain/models/SchedulingFormResponse;

    move-result-object v8

    invoke-virtual {v8}, Lcom/whoop/advancedlabs/domain/models/SchedulingFormResponse;->getButton()Lcom/whoop/advancedlabs/domain/models/SchedulingButton;

    move-result-object v8

    invoke-virtual {v8}, Lcom/whoop/advancedlabs/domain/models/SchedulingButton;->getProgress()Ljava/lang/Float;

    move-result-object v8

    const/4 v9, 0x0

    invoke-virtual {v1, v2, v8, v9}, Lnd0/a;->a(Ljava/lang/String;Ljava/lang/Float;Z)Lc31/k;

    move-result-object v8

    invoke-virtual/range {p1 .. p1}, Lae0/b$j;->c()Lcom/whoop/advancedlabs/domain/models/SchedulingFormResponse;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/advancedlabs/domain/models/SchedulingFormResponse;->getButton()Lcom/whoop/advancedlabs/domain/models/SchedulingButton;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/advancedlabs/domain/models/SchedulingButton;->getDestination()Lcom/whoop/navigation/e;

    move-result-object v9

    invoke-virtual/range {p1 .. p1}, Lae0/b$j;->b()Ljava/lang/String;

    move-result-object v13

    invoke-virtual/range {p1 .. p1}, Lae0/b$j;->a()Ljava/lang/String;

    move-result-object v14

    invoke-virtual/range {p1 .. p1}, Lae0/b$j;->d()Ljava/lang/String;

    move-result-object v15

    new-instance v2, Lce0/d$c;

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/16 v16, 0x180

    const/16 v17, 0x0

    invoke-direct/range {v2 .. v17}, Lce0/d$c;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lm91/u;Lce0/a;Lc31/k;Lcom/whoop/navigation/e;Lde0/a;Lsz0/q0;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v2
.end method

.method private final e(Lc31/k;Z)Lc31/k;
    .locals 21

    const v19, 0x1fdff

    const/16 v20, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    move-object/from16 v1, p1

    move/from16 v11, p2

    invoke-static/range {v1 .. v20}, Lc31/k;->b(Lc31/k;Lc31/d;Lcom/whoop/design/util/TextResource;Ly81/e;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lgz0/m0;IILjava/lang/Float;ZZLy81/e;Li2/t;Ly81/e;Ly81/e;Lcom/whoop/navigation/models/GenericInteraction;Ljava/lang/String;ILjava/lang/Object;)Lc31/k;

    move-result-object v0

    return-object v0
.end method

.method private final f(Lce0/a;Lde0/a;)Lce0/a;
    .locals 24

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    :cond_0
    invoke-virtual/range {p1 .. p1}, Lce0/a;->e()Lm91/u;

    move-result-object v1

    instance-of v2, v1, Lge0/f;

    if-eqz v2, :cond_1

    check-cast v1, Lge0/f;

    move-object v2, v1

    goto :goto_0

    :cond_1
    move-object v2, v0

    :goto_0
    if-eqz v2, :cond_5

    invoke-virtual {v2}, Lge0/f;->e()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {v0, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v4, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v5, v3

    check-cast v5, Lge0/a;

    invoke-virtual {v5}, Lge0/a;->e()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    new-instance v7, Ljava/util/ArrayList;

    invoke-static {v3, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-direct {v7, v6}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lm91/u;

    instance-of v8, v6, Llf0/a2;

    if-eqz v8, :cond_2

    move-object v9, v6

    check-cast v9, Llf0/a2;

    const/16 v22, 0x7ff

    const/16 v23, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    move-object/from16 v21, p2

    invoke-static/range {v9 .. v23}, Llf0/a2;->b(Llf0/a2;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lc41/p2;ZILde0/a;ILjava/lang/Object;)Llf0/a2;

    move-result-object v6

    :cond_2
    invoke-interface {v7, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_3
    const/16 v10, 0xd

    const/4 v11, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v5 .. v11}, Lge0/a;->b(Lge0/a;Ljava/lang/String;Ljava/util/List;Lh11/h;Lm91/u;ILjava/lang/Object;)Lge0/a;

    move-result-object v3

    invoke-interface {v4, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_4
    const/4 v7, 0x5

    const/4 v8, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    move-object/from16 v6, p2

    invoke-static/range {v2 .. v8}, Lge0/f;->b(Lge0/f;Ljava/lang/String;Ljava/util/List;Li11/f;Lde0/a;ILjava/lang/Object;)Lge0/f;

    move-result-object v0

    :cond_5
    if-eqz v0, :cond_6

    :goto_3
    move-object v3, v0

    goto :goto_4

    :cond_6
    invoke-virtual/range {p1 .. p1}, Lce0/a;->e()Lm91/u;

    move-result-object v0

    goto :goto_3

    :goto_4
    const/4 v5, 0x5

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    move-object/from16 v1, p1

    invoke-static/range {v1 .. v6}, Lce0/a;->b(Lce0/a;Lm91/u;Lm91/u;Lm91/u;ILjava/lang/Object;)Lce0/a;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final c(Lec3/l;)Lec3/l;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/l;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    const-string v0, "domainResults"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lce0/d$b;->b:Lce0/d$b;

    const-string v1, "null cannot be cast to non-null type com.whoop.advancedlabs.schedulingform.presentation.SchedulingFormViewState"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lee0/a$a;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lee0/a$a;-><init>(Lee0/a;Lq83/d;)V

    new-instance v2, Lec3/l1;

    invoke-direct {v2, v0, p1, v1}, Lec3/l1;-><init>(Ljava/lang/Object;Lec3/l;Lkotlin/jvm/functions/Function3;)V

    return-object v2
.end method
