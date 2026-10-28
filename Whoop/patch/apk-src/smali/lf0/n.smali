.class public final Llf0/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm91/f;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lm91/f<",
        "Lld0/d;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J3\u0010\u000c\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0008H\u0017\u00a2\u0006\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Llf0/n;",
        "Lm91/f;",
        "Lld0/d;",
        "<init>",
        "()V",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "itemState",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "c",
        "(Landroidx/compose/ui/Modifier;Lld0/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
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


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Lcom/whoop/advancedlabs/presentation/models/AppointmentSummaryBottomSheet;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Llf0/n;->d(Lkotlin/jvm/functions/Function1;Lcom/whoop/advancedlabs/presentation/models/AppointmentSummaryBottomSheet;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Llf0/n;Landroidx/compose/ui/Modifier;Lld0/d;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Llf0/n;->e(Llf0/n;Landroidx/compose/ui/Modifier;Lld0/d;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final d(Lkotlin/jvm/functions/Function1;Lcom/whoop/advancedlabs/presentation/models/AppointmentSummaryBottomSheet;)Ll83/a0;
    .locals 1

    const-string v0, "bottomSheet"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final e(Llf0/n;Landroidx/compose/ui/Modifier;Lld0/d;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p5

    invoke-virtual/range {v0 .. v5}, Llf0/n;->c(Landroidx/compose/ui/Modifier;Lld0/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic Compose(Landroidx/compose/ui/Modifier;Lm91/u;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 0

    check-cast p2, Lld0/d;

    invoke-virtual/range {p0 .. p5}, Llf0/n;->c(Landroidx/compose/ui/Modifier;Lld0/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    return-void
.end method

.method public c(Landroidx/compose/ui/Modifier;Lld0/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lld0/d;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move/from16 v7, p5

    const-string v2, "modifier"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "itemState"

    invoke-static {p2, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "onViewEvent"

    invoke-static {p3, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v3, p4

    check-cast v3, Lp1/q;

    const v2, 0x2c8540fb

    invoke-virtual {v3, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, v7, 0x6

    if-nez v2, :cond_1

    invoke-virtual {v3, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    :goto_0
    or-int/2addr v2, v7

    goto :goto_1

    :cond_1
    move v2, v7

    :goto_1
    and-int/lit8 v4, v7, 0x30

    if-nez v4, :cond_4

    and-int/lit8 v4, v7, 0x40

    if-nez v4, :cond_2

    invoke-virtual {v3, p2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    goto :goto_2

    :cond_2
    invoke-virtual {v3, p2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    :goto_2
    if-eqz v4, :cond_3

    const/16 v4, 0x20

    goto :goto_3

    :cond_3
    const/16 v4, 0x10

    :goto_3
    or-int/2addr v2, v4

    :cond_4
    and-int/lit16 v4, v7, 0x180

    const/16 v5, 0x100

    if-nez v4, :cond_6

    invoke-virtual {v3, p3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_5

    move v4, v5

    goto :goto_4

    :cond_5
    const/16 v4, 0x80

    :goto_4
    or-int/2addr v2, v4

    :cond_6
    and-int/lit16 v4, v2, 0x93

    const/16 v8, 0x92

    const/4 v9, 0x0

    const/4 v10, 0x1

    if-eq v4, v8, :cond_7

    move v4, v10

    goto :goto_5

    :cond_7
    move v4, v9

    :goto_5
    and-int/lit8 v8, v2, 0x1

    invoke-virtual {v3, v8, v4}, Lp1/q;->U(IZ)Z

    move-result v4

    if-eqz v4, :cond_b

    and-int/lit16 v4, v2, 0x380

    if-ne v4, v5, :cond_8

    move v9, v10

    :cond_8
    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v9, :cond_9

    sget-object v5, Lp1/l;->a:Lp1/v0;

    if-ne v4, v5, :cond_a

    :cond_9
    new-instance v4, Ll80/k;

    const/4 v5, 0x3

    invoke-direct {v4, p3, v5}, Ll80/k;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v3, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast v4, Lkotlin/jvm/functions/Function1;

    and-int/lit8 v5, v2, 0xe

    sget v8, Lkd1/o;->a:I

    shl-int/lit8 v8, v8, 0x3

    or-int/2addr v5, v8

    and-int/lit8 v2, v2, 0x70

    or-int/2addr v2, v5

    const/4 v5, 0x0

    move-object v0, v4

    move v4, v2

    move-object v2, v0

    move-object v0, p1

    move-object v1, p2

    invoke-static/range {v0 .. v5}, Llf0/p;->h(Landroidx/compose/ui/Modifier;Lld0/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    goto :goto_6

    :cond_b
    invoke-virtual {v3}, Lp1/q;->X()V

    :goto_6
    invoke-virtual {v3}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_c

    new-instance v0, Ll01/j;

    const/16 v6, 0xf

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, v7

    invoke-direct/range {v0 .. v6}, Ll01/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_c
    return-void
.end method
