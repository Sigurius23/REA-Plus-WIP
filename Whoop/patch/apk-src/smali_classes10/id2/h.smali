.class public final Lid2/h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0003\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0008\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lid2/h;",
        "",
        "<init>",
        "()V",
        "Lcom/whoop/share/model/ShareBackground;",
        "Landroidx/compose/ui/Modifier;",
        "d",
        "(Lcom/whoop/share/model/ShareBackground;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;",
        "config",
        "Ll83/a0;",
        "b",
        "(Lcom/whoop/share/model/ShareBackground;Landroidx/compose/runtime/Composer;I)V",
        "share_release"
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

.method public static synthetic a(Lid2/h;Lcom/whoop/share/model/ShareBackground;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lid2/h;->c(Lid2/h;Lcom/whoop/share/model/ShareBackground;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Lid2/h;Lcom/whoop/share/model/ShareBackground;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-virtual {p0, p1, p3, p2}, Lid2/h;->b(Lcom/whoop/share/model/ShareBackground;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private final d(Lcom/whoop/share/model/ShareBackground;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;
    .locals 7

    invoke-virtual {p1}, Lcom/whoop/share/model/ShareBackground;->getStyle()Ljava/lang/String;

    move-result-object p1

    sget-object v0, Lb2/t;->w:Lb2/t;

    const/4 p3, 0x0

    if-eqz p1, :cond_13

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v1

    const/4 v2, 0x6

    sparse-switch v1, :sswitch_data_0

    goto/16 :goto_0

    :sswitch_0
    const-string v1, "BRONZE"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    goto/16 :goto_0

    :cond_0
    check-cast p2, Lp1/q;

    const p1, -0x615cc6bf

    invoke-virtual {p2, p1}, Lp1/q;->e0(I)V

    sget-object p1, Lx81/d;->a:Lx81/d;

    sget v1, Lx81/d;->b:I

    invoke-virtual {p1, p2, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object p1

    invoke-virtual {p1}, Ly81/i;->A()J

    move-result-wide v1

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v0 .. v6}, Lgb1/b0;->I(Landroidx/compose/ui/Modifier;JFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    invoke-virtual {p2, p3}, Lp1/q;->q(Z)V

    return-object p1

    :sswitch_1
    const-string v1, "HEALTHSPAN"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    goto/16 :goto_0

    :cond_1
    check-cast p2, Lp1/q;

    const p1, -0x615ca8db

    invoke-virtual {p2, p1}, Lp1/q;->e0(I)V

    invoke-static {v0, p2, v2}, Lid2/i;->f(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;

    move-result-object p1

    invoke-virtual {p2, p3}, Lp1/q;->q(Z)V

    return-object p1

    :sswitch_2
    const-string v1, "LOW_RECOVERY"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    goto/16 :goto_0

    :cond_2
    check-cast p2, Lp1/q;

    const p1, -0x615c7592

    invoke-virtual {p2, p1}, Lp1/q;->e0(I)V

    sget-object p1, Lx81/d;->a:Lx81/d;

    sget v1, Lx81/d;->b:I

    invoke-virtual {p1, p2, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object p1

    invoke-virtual {p1}, Ly81/i;->b0()J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lid2/i;->c(Landroidx/compose/ui/Modifier;J)Landroidx/compose/ui/Modifier;

    move-result-object p1

    invoke-virtual {p2, p3}, Lp1/q;->q(Z)V

    return-object p1

    :sswitch_3
    const-string v1, "STREAK_WHITE"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    goto/16 :goto_0

    :cond_3
    check-cast p2, Lp1/q;

    const p1, -0x615bdbba

    invoke-virtual {p2, p1}, Lp1/q;->e0(I)V

    sget-object p1, Lx81/d;->a:Lx81/d;

    sget v1, Lx81/d;->b:I

    invoke-virtual {p1, p2, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object p1

    invoke-virtual {p1}, Ly81/i;->l0()J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lid2/i;->c(Landroidx/compose/ui/Modifier;J)Landroidx/compose/ui/Modifier;

    move-result-object p1

    invoke-virtual {p2, p3}, Lp1/q;->q(Z)V

    return-object p1

    :sswitch_4
    const-string v1, "SLEEP"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    goto/16 :goto_0

    :cond_4
    check-cast p2, Lp1/q;

    const p1, -0x615c5640

    invoke-virtual {p2, p1}, Lp1/q;->e0(I)V

    invoke-static {v0, p2, v2}, Lid2/i;->h(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;

    move-result-object p1

    invoke-virtual {p2, p3}, Lp1/q;->q(Z)V

    return-object p1

    :sswitch_5
    const-string v1, "GOLD"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    goto/16 :goto_0

    :cond_5
    check-cast p2, Lp1/q;

    const p1, -0x615cb801

    invoke-virtual {p2, p1}, Lp1/q;->e0(I)V

    sget-object p1, Lx81/d;->a:Lx81/d;

    sget v1, Lx81/d;->b:I

    invoke-virtual {p1, p2, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object p1

    invoke-virtual {p1}, Ly81/i;->E()J

    move-result-wide v1

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v0 .. v6}, Lgb1/b0;->I(Landroidx/compose/ui/Modifier;JFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    invoke-virtual {p2, p3}, Lp1/q;->q(Z)V

    return-object p1

    :sswitch_6
    const-string v1, "RECOVERY"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    goto/16 :goto_0

    :cond_6
    check-cast p2, Lp1/q;

    const p1, -0x615c81bd

    invoke-virtual {p2, p1}, Lp1/q;->e0(I)V

    invoke-static {v0, p2, v2}, Lid2/i;->g(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;

    move-result-object p1

    invoke-virtual {p2, p3}, Lp1/q;->q(Z)V

    return-object p1

    :sswitch_7
    const-string v1, "STREAK_PINK"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    goto/16 :goto_0

    :cond_7
    check-cast p2, Lp1/q;

    const p1, -0x615c1e8f

    invoke-virtual {p2, p1}, Lp1/q;->e0(I)V

    sget-object p1, Lx81/d;->a:Lx81/d;

    sget v1, Lx81/d;->b:I

    invoke-virtual {p1, p2, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object p1

    invoke-virtual {p1}, Ly81/i;->i()J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lid2/i;->c(Landroidx/compose/ui/Modifier;J)Landroidx/compose/ui/Modifier;

    move-result-object p1

    invoke-virtual {p2, p3}, Lp1/q;->q(Z)V

    return-object p1

    :sswitch_8
    const-string v1, "STREAK_GOLD"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    goto/16 :goto_0

    :cond_8
    check-cast p2, Lp1/q;

    const p1, -0x615bec58

    invoke-virtual {p2, p1}, Lp1/q;->e0(I)V

    sget-object p1, Lx81/d;->a:Lx81/d;

    sget v1, Lx81/d;->b:I

    invoke-virtual {p1, p2, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object p1

    invoke-virtual {p1}, Ly81/i;->z()J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lid2/i;->c(Landroidx/compose/ui/Modifier;J)Landroidx/compose/ui/Modifier;

    move-result-object p1

    invoke-virtual {p2, p3}, Lp1/q;->q(Z)V

    return-object p1

    :sswitch_9
    const-string v1, "STREAK_BLUE"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    goto/16 :goto_0

    :cond_9
    check-cast p2, Lp1/q;

    const p1, -0x615bfc3d

    invoke-virtual {p2, p1}, Lp1/q;->e0(I)V

    sget-object p1, Lx81/d;->a:Lx81/d;

    sget v1, Lx81/d;->b:I

    invoke-virtual {p1, p2, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object p1

    invoke-virtual {p1}, Ly81/i;->X()J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lid2/i;->c(Landroidx/compose/ui/Modifier;J)Landroidx/compose/ui/Modifier;

    move-result-object p1

    invoke-virtual {p2, p3}, Lp1/q;->q(Z)V

    return-object p1

    :sswitch_a
    const-string v1, "ACTIVITY"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_a

    goto/16 :goto_0

    :cond_a
    check-cast p2, Lp1/q;

    const p1, -0x615cd21d

    invoke-virtual {p2, p1}, Lp1/q;->e0(I)V

    invoke-static {v0, p2, v2}, Lid2/i;->d(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;

    move-result-object p1

    invoke-virtual {p2, p3}, Lp1/q;->q(Z)V

    return-object p1

    :sswitch_b
    const-string v1, "PURPLE_AQUA"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_b

    goto/16 :goto_0

    :cond_b
    check-cast p2, Lp1/q;

    const p1, -0x615c8d3d

    invoke-virtual {p2, p1}, Lp1/q;->e0(I)V

    invoke-virtual {p2, p3}, Lp1/q;->q(Z)V

    invoke-static {v0}, Lgb1/b0;->V(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    return-object p1

    :sswitch_c
    const-string v1, "STREAK_YELLOW"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_c

    goto/16 :goto_0

    :cond_c
    check-cast p2, Lp1/q;

    const p1, -0x615c3f5a

    invoke-virtual {p2, p1}, Lp1/q;->e0(I)V

    sget-object p1, Lx81/d;->a:Lx81/d;

    sget v1, Lx81/d;->b:I

    invoke-virtual {p1, p2, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object p1

    invoke-virtual {p1}, Ly81/i;->o0()J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lid2/i;->c(Landroidx/compose/ui/Modifier;J)Landroidx/compose/ui/Modifier;

    move-result-object p1

    invoke-virtual {p2, p3}, Lp1/q;->q(Z)V

    return-object p1

    :sswitch_d
    const-string v1, "STREAK_PURPLE"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_d

    goto/16 :goto_0

    :cond_d
    check-cast p2, Lp1/q;

    const p1, -0x615c0cb8

    invoke-virtual {p2, p1}, Lp1/q;->e0(I)V

    sget-object p1, Lx81/d;->a:Lx81/d;

    sget v1, Lx81/d;->b:I

    invoke-virtual {p1, p2, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object p1

    invoke-virtual {p1}, Ly81/i;->j0()J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lid2/i;->c(Landroidx/compose/ui/Modifier;J)Landroidx/compose/ui/Modifier;

    move-result-object p1

    invoke-virtual {p2, p3}, Lp1/q;->q(Z)V

    return-object p1

    :sswitch_e
    const-string v1, "STREAK_ORANGE"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_e

    goto/16 :goto_0

    :cond_e
    check-cast p2, Lp1/q;

    const p1, -0x615c2eda

    invoke-virtual {p2, p1}, Lp1/q;->e0(I)V

    sget-object p1, Lx81/d;->a:Lx81/d;

    sget v1, Lx81/d;->b:I

    invoke-virtual {p1, p2, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object p1

    invoke-virtual {p1}, Ly81/i;->p0()J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lid2/i;->c(Landroidx/compose/ui/Modifier;J)Landroidx/compose/ui/Modifier;

    move-result-object p1

    invoke-virtual {p2, p3}, Lp1/q;->q(Z)V

    return-object p1

    :sswitch_f
    const-string v1, "PLATINUM"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_f

    goto/16 :goto_0

    :cond_f
    check-cast p2, Lp1/q;

    const p1, -0x615c9cfd

    invoke-virtual {p2, p1}, Lp1/q;->e0(I)V

    sget-object p1, Lx81/d;->a:Lx81/d;

    sget v1, Lx81/d;->b:I

    invoke-virtual {p1, p2, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object p1

    invoke-virtual {p1}, Ly81/i;->W()J

    move-result-wide v1

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v0 .. v6}, Lgb1/b0;->I(Landroidx/compose/ui/Modifier;JFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    invoke-virtual {p2, p3}, Lp1/q;->q(Z)V

    return-object p1

    :sswitch_10
    const-string v1, "STRAIN"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_10

    goto :goto_0

    :cond_10
    check-cast p2, Lp1/q;

    const p1, -0x615c4b5f

    invoke-virtual {p2, p1}, Lp1/q;->e0(I)V

    invoke-static {v0, p2, v2}, Lid2/i;->i(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;

    move-result-object p1

    invoke-virtual {p2, p3}, Lp1/q;->q(Z)V

    return-object p1

    :sswitch_11
    const-string v1, "SILVER"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_11

    goto :goto_0

    :cond_11
    check-cast p2, Lp1/q;

    const p1, -0x615c64ff

    invoke-virtual {p2, p1}, Lp1/q;->e0(I)V

    sget-object p1, Lx81/d;->a:Lx81/d;

    sget v1, Lx81/d;->b:I

    invoke-virtual {p1, p2, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object p1

    invoke-virtual {p1}, Ly81/i;->e0()J

    move-result-wide v1

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v0 .. v6}, Lgb1/b0;->I(Landroidx/compose/ui/Modifier;JFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    invoke-virtual {p2, p3}, Lp1/q;->q(Z)V

    return-object p1

    :sswitch_12
    const-string v1, "DEFAULT"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_12

    goto :goto_0

    :cond_12
    check-cast p2, Lp1/q;

    const p1, -0x615bcc1e

    invoke-virtual {p2, p1}, Lp1/q;->e0(I)V

    invoke-static {v0, p2, v2}, Lid2/i;->e(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;

    move-result-object p1

    invoke-virtual {p2, p3}, Lp1/q;->q(Z)V

    return-object p1

    :cond_13
    :goto_0
    check-cast p2, Lp1/q;

    const p1, -0x615bc596

    invoke-virtual {p2, p1}, Lp1/q;->e0(I)V

    invoke-virtual {p2, p3}, Lp1/q;->q(Z)V

    return-object v0

    :sswitch_data_0
    .sparse-switch
        -0x79209ddf -> :sswitch_12
        -0x6e3538f3 -> :sswitch_11
        -0x6d97ca8b -> :sswitch_10
        -0x619b4dd4 -> :sswitch_f
        -0x5af475f1 -> :sswitch_e
        -0x590d9463 -> :sswitch_d
        -0x4a9637ab -> :sswitch_c
        -0x386a86a1 -> :sswitch_b
        -0x340e1cf1 -> :sswitch_a
        -0x2059e385 -> :sswitch_9
        -0x2057937f -> :sswitch_8
        -0x20539269 -> :sswitch_7
        -0xfb906b -> :sswitch_6
        0x217860 -> :sswitch_5
        0x4b536b7 -> :sswitch_4
        0x16436408 -> :sswitch_3
        0x44af5440 -> :sswitch_2
        0x531457a6 -> :sswitch_1
        0x7548799a -> :sswitch_0
    .end sparse-switch
.end method


# virtual methods
.method public final b(Lcom/whoop/share/model/ShareBackground;Landroidx/compose/runtime/Composer;I)V
    .locals 8

    const-string v0, "config"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v4, p2

    check-cast v4, Lp1/q;

    const p2, 0xaa974d

    invoke-virtual {v4, p2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 p2, p3, 0x6

    const/4 v0, 0x4

    if-nez p2, :cond_2

    and-int/lit8 p2, p3, 0x8

    if-nez p2, :cond_0

    invoke-virtual {v4, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p2

    goto :goto_0

    :cond_0
    invoke-virtual {v4, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p2

    :goto_0
    if-eqz p2, :cond_1

    move p2, v0

    goto :goto_1

    :cond_1
    const/4 p2, 0x2

    :goto_1
    or-int/2addr p2, p3

    goto :goto_2

    :cond_2
    move p2, p3

    :goto_2
    and-int/lit8 v1, p3, 0x30

    if-nez v1, :cond_4

    invoke-virtual {v4, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    const/16 v1, 0x20

    goto :goto_3

    :cond_3
    const/16 v1, 0x10

    :goto_3
    or-int/2addr p2, v1

    :cond_4
    and-int/lit8 v1, p2, 0x13

    const/16 v2, 0x12

    const/4 v7, 0x0

    if-eq v1, v2, :cond_5

    const/4 v1, 0x1

    goto :goto_4

    :cond_5
    move v1, v7

    :goto_4
    and-int/lit8 v2, p2, 0x1

    invoke-virtual {v4, v2, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_b

    invoke-virtual {p1}, Lcom/whoop/share/model/ShareBackground;->getType()Ljava/lang/String;

    move-result-object v1

    const-string v2, "RADIAL_GRADIENT"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_a

    const v1, -0x7420e046

    invoke-virtual {v4, v1}, Lp1/q;->e0(I)V

    invoke-virtual {p1}, Lcom/whoop/share/model/ShareBackground;->getColors()Lcom/whoop/design/models/colortheme/ColorThemeModel;

    move-result-object v1

    invoke-virtual {v4, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_6

    sget-object v1, Lp1/l;->a:Lp1/v0;

    if-ne v2, v1, :cond_8

    :cond_6
    invoke-virtual {p1}, Lcom/whoop/share/model/ShareBackground;->getColors()Lcom/whoop/design/models/colortheme/ColorThemeModel;

    move-result-object v1

    if-eqz v1, :cond_7

    invoke-virtual {v1}, Lcom/whoop/design/models/colortheme/ColorThemeModel;->getBackground()Lcom/whoop/design/models/colortheme/ColorBackgroundModel;

    move-result-object v1

    if-eqz v1, :cond_7

    invoke-static {v1}, Llb1/f0;->a(Lcom/whoop/design/models/colortheme/ColorBackgroundModel;)Lm51/a;

    move-result-object v1

    :goto_5
    move-object v2, v1

    goto :goto_6

    :cond_7
    const/4 v1, 0x0

    goto :goto_5

    :goto_6
    invoke-virtual {v4, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    check-cast v2, Lm51/a;

    sget-object v1, Lb2/t;->w:Lb2/t;

    if-eqz v2, :cond_9

    const p2, -0x7f9de1b5

    invoke-virtual {v4, p2}, Lp1/q;->e0(I)V

    const/16 v5, 0x186

    const/4 v6, 0x0

    const v3, 0x3f19999a    # 0.6f

    invoke-static/range {v1 .. v6}, Lm51/b;->b(Landroidx/compose/ui/Modifier;Lm51/a;FLandroidx/compose/runtime/Composer;II)Landroidx/compose/ui/Modifier;

    move-result-object p2

    :goto_7
    invoke-virtual {v4, v7}, Lp1/q;->q(Z)V

    goto :goto_8

    :cond_9
    const v2, -0x7f9dd879

    invoke-virtual {v4, v2}, Lp1/q;->e0(I)V

    sget v2, Lcom/whoop/design/models/colortheme/ColorThemeModel;->$stable:I

    and-int/lit8 v3, p2, 0xe

    or-int/2addr v2, v3

    and-int/lit8 p2, p2, 0x70

    or-int/2addr p2, v2

    invoke-direct {p0, p1, v4, p2}, Lid2/h;->d(Lcom/whoop/share/model/ShareBackground;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;

    move-result-object p2

    goto :goto_7

    :goto_8
    const/high16 v2, 0x3f800000    # 1.0f

    invoke-static {v2, v1}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const/4 v2, 0x3

    int-to-float v2, v2

    int-to-float v0, v0

    invoke-static {v1, v2, v0}, Lih0/d0;->e(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v1, Lx81/d;->a:Lx81/d;

    sget v2, Lx81/d;->b:I

    invoke-virtual {v1, v4, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->o()J

    move-result-wide v1

    sget-object v3, Li2/w0;->a:Li2/v0;

    invoke-static {v0, v1, v2, v3}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-interface {v0, p2}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p2

    invoke-static {p2, v4, v7}, Ll0/q;->a(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v4, v7}, Lp1/q;->q(Z)V

    goto :goto_9

    :cond_a
    const p2, -0x7417e1eb

    invoke-virtual {v4, p2}, Lp1/q;->e0(I)V

    invoke-virtual {v4, v7}, Lp1/q;->q(Z)V

    goto :goto_9

    :cond_b
    invoke-virtual {v4}, Lp1/q;->X()V

    :goto_9
    invoke-virtual {v4}, Lp1/q;->u()Lp1/v1;

    move-result-object p2

    if-eqz p2, :cond_c

    new-instance v0, Lf01/b;

    const/16 v1, 0x1d

    invoke-direct {v0, p0, p1, p3, v1}, Lf01/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, p2, Lp1/v1;->d:Lc93/m;

    :cond_c
    return-void
.end method
