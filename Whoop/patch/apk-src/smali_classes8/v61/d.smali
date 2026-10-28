.class public abstract Lv61/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\r\u0010\u0001\u001a\u00020\u0000\u00a2\u0006\u0004\u0008\u0001\u0010\u0002\u00a8\u0006\u0003"
    }
    d2 = {
        "Lj71/b$i;",
        "a",
        "()Lj71/b$i;",
        "design_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final a()Lj71/b$i;
    .locals 21

    new-instance v0, Lj71/b$i;

    new-instance v1, Ly61/a;

    new-instance v2, Ly61/b;

    sget-object v3, Lv61/d$a;->w:Lv61/d$a;

    invoke-static {v3}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v3

    const v4, 0x3ecccccd    # 0.4f

    const v5, 0x3e4ccccd    # 0.2f

    invoke-direct {v2, v4, v5, v3}, Ly61/b;-><init>(FFLy81/e;)V

    invoke-static {v2}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    new-instance v4, Lu61/d;

    const-string v2, "3"

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    const/16 v9, 0xe

    const/4 v10, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v4 .. v10}, Lu61/d;-><init>(Lcom/whoop/design/util/TextResource;Ly81/e;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v13, 0x7f1

    const/4 v14, 0x0

    const/4 v2, 0x0

    move-object v5, v4

    const v4, 0x3e4ccccd    # 0.2f

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-direct/range {v1 .. v14}, Ly61/a;-><init>(Lcom/whoop/design/util/TextResource;Ljava/util/List;FLu61/d;Lkd1/o;Ly81/f;La71/a;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lgz0/m0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v2, Ly61/b;

    sget-object v3, Lv61/d$b;->w:Lv61/d$b;

    invoke-static {v3}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v3

    const v4, 0x3dcccccd    # 0.1f

    const/high16 v5, 0x3f000000    # 0.5f

    invoke-direct {v2, v4, v5, v3}, Ly61/b;-><init>(FFLy81/e;)V

    invoke-static {v2}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v8

    new-instance v11, Lkd1/o$a;

    sget-object v2, Lx81/d;->a:Lx81/d;

    invoke-static {v2}, Lm4/a;->b(Lx81/d;)I

    move-result v3

    invoke-direct {v11, v3}, Lkd1/o$a;-><init>(I)V

    new-instance v10, Lu61/d;

    const-string v3, "7:45"

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v13

    const/16 v17, 0xe

    const/16 v18, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    move-object v12, v10

    invoke-direct/range {v12 .. v18}, Lu61/d;-><init>(Lcom/whoop/design/util/TextResource;Ly81/e;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v6, Ly61/a;

    const/16 v18, 0x7e1

    const/16 v19, 0x0

    const/high16 v9, 0x3f000000    # 0.5f

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-direct/range {v6 .. v19}, Ly61/a;-><init>(Lcom/whoop/design/util/TextResource;Ljava/util/List;FLu61/d;Lkd1/o;Ly81/f;La71/a;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lgz0/m0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v7, Ly61/a;

    new-instance v3, Ly61/b;

    sget-object v4, Lv61/d$c;->w:Lv61/d$c;

    invoke-static {v4}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v4

    const v5, 0x3cf5c28f    # 0.03f

    const v8, 0x3f266666    # 0.65f

    invoke-direct {v3, v5, v8, v4}, Ly61/b;-><init>(FFLy81/e;)V

    new-instance v4, Ly61/b;

    sget-object v8, Lv61/d$d;->w:Lv61/d$d;

    invoke-static {v8}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v8

    const v9, 0x3f333333    # 0.7f

    invoke-direct {v4, v5, v9, v8}, Ly61/b;-><init>(FFLy81/e;)V

    new-instance v8, Ly61/b;

    sget-object v9, Lv61/d$e;->w:Lv61/d$e;

    invoke-static {v9}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v9

    const/high16 v10, 0x3f400000    # 0.75f

    invoke-direct {v8, v5, v10, v9}, Ly61/b;-><init>(FFLy81/e;)V

    filled-new-array {v3, v4, v8}, [Ly61/b;

    move-result-object v3

    invoke-static {v3}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v9

    new-instance v12, Lkd1/o$a;

    invoke-static {v2}, Lm4/a;->b(Lx81/d;)I

    move-result v2

    invoke-direct {v12, v2}, Lkd1/o$a;-><init>(I)V

    const/16 v19, 0x7e9

    const/16 v20, 0x0

    const/4 v8, 0x0

    const v10, 0x3f333333    # 0.7f

    const/4 v11, 0x0

    const/16 v18, 0x0

    invoke-direct/range {v7 .. v20}, Ly61/a;-><init>(Lcom/whoop/design/util/TextResource;Ljava/util/List;FLu61/d;Lkd1/o;Ly81/f;La71/a;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lgz0/m0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    filled-new-array {v1, v6, v7}, [Ly61/a;

    move-result-object v1

    invoke-static {v1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    const/16 v6, 0x1a

    const/4 v7, 0x0

    const/4 v2, 0x0

    const-string v3, "overlayPlot"

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v7}, Lj71/b$i;-><init>(Ljava/util/List;Lx61/a;Ljava/lang/String;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method
