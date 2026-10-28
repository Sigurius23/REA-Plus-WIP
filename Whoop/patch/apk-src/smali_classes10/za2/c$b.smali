.class final Lza2/c$b;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lza2/c;->h(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lc93/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lbc3/c0;",
        "Ll83/a0;",
        "<anonymous>",
        "(Lbc3/c0;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.settings.banner.SettingsBannerCoordinator$addRemovedScreen$1"
    f = "SettingsBannerCoordinator.kt"
    l = {
        0x50,
        0x53,
        0x5a
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field E:Ljava/lang/Object;

.field F:Ljava/lang/Object;

.field G:I

.field H:I

.field I:I

.field final synthetic J:Lza2/c;

.field final synthetic K:Ljava/lang/String;

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lza2/c;Ljava/lang/String;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lza2/c;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lza2/c$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lza2/c$b;->J:Lza2/c;

    iput-object p2, p0, Lza2/c$b;->K:Ljava/lang/String;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lq83/d<",
            "*>;)",
            "Lq83/d<",
            "Ll83/a0;",
            ">;"
        }
    .end annotation

    new-instance p1, Lza2/c$b;

    iget-object v0, p0, Lza2/c$b;->J:Lza2/c;

    iget-object v1, p0, Lza2/c$b;->K:Ljava/lang/String;

    invoke-direct {p1, v0, v1, p2}, Lza2/c$b;-><init>(Lza2/c;Ljava/lang/String;Lq83/d;)V

    return-object p1
.end method

.method public final invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc3/c0;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lza2/c$b;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lza2/c$b;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lza2/c$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lza2/c$b;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    move-object/from16 v0, p0

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lza2/c$b;->I:I

    const/4 v3, 0x0

    const/4 v4, 0x3

    const/4 v5, 0x2

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-eqz v2, :cond_3

    if-eq v2, v6, :cond_2

    if-eq v2, v5, :cond_1

    if-ne v2, v4, :cond_0

    iget v2, v0, Lza2/c$b;->G:I

    iget-object v5, v0, Lza2/c$b;->F:Ljava/lang/Object;

    check-cast v5, Lza2/f$c;

    iget-object v6, v0, Lza2/c$b;->E:Ljava/lang/Object;

    check-cast v6, Lza2/f;

    iget-object v6, v0, Lza2/c$b;->z:Ljava/lang/Object;

    iget-object v8, v0, Lza2/c$b;->y:Ljava/lang/Object;

    check-cast v8, Lza2/c;

    iget-object v9, v0, Lza2/c$b;->x:Ljava/lang/Object;

    check-cast v9, Lec3/p1;

    iget-object v10, v0, Lza2/c$b;->w:Ljava/lang/Object;

    check-cast v10, Ljava/util/List;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v10, p1

    move-object v11, v5

    goto/16 :goto_5

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    iget-object v2, v0, Lza2/c$b;->w:Ljava/lang/Object;

    check-cast v2, Ljava/util/List;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_2
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v2, p1

    goto :goto_0

    :cond_3
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, v0, Lza2/c$b;->J:Lza2/c;

    invoke-static {v2}, Lza2/c;->e(Lza2/c;)Lec3/l;

    move-result-object v2

    iput v6, v0, Lza2/c$b;->I:I

    invoke-static {v2, v0}, Lec3/v;->C(Lec3/l;Ls83/c;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_4

    goto :goto_4

    :cond_4
    :goto_0
    check-cast v2, Ljava/util/List;

    if-eqz v2, :cond_5

    check-cast v2, Ljava/util/Collection;

    invoke-static {v2}, Lm83/s;->F1(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v2

    goto :goto_1

    :cond_5
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    :goto_1
    iget-object v6, v0, Lza2/c$b;->K:Ljava/lang/String;

    invoke-interface {v2, v6}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_a

    iget-object v6, v0, Lza2/c$b;->K:Ljava/lang/String;

    invoke-interface {v2, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v6, v0, Lza2/c$b;->J:Lza2/c;

    invoke-static {v6}, Lza2/c;->d(Lza2/c;)La6/g;

    move-result-object v6

    new-instance v8, Lza2/c$b$a;

    invoke-direct {v8, v2, v7}, Lza2/c$b$a;-><init>(Ljava/util/List;Lq83/d;)V

    iput-object v7, v0, Lza2/c$b;->w:Ljava/lang/Object;

    iput v5, v0, Lza2/c$b;->I:I

    invoke-interface {v6, v8, v0}, La6/g;->a(Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_6

    goto :goto_4

    :cond_6
    :goto_2
    iget-object v2, v0, Lza2/c$b;->J:Lza2/c;

    invoke-static {v2}, Lza2/c;->g(Lza2/c;)Lec3/p1;

    move-result-object v2

    iget-object v5, v0, Lza2/c$b;->J:Lza2/c;

    move-object v8, v5

    move v5, v3

    :goto_3
    move-object v9, v2

    check-cast v9, Lec3/h2;

    invoke-virtual {v9}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v6

    move-object v2, v6

    check-cast v2, Lza2/f;

    instance-of v10, v2, Lza2/f$c;

    if-eqz v10, :cond_8

    check-cast v2, Lza2/f$c;

    invoke-virtual {v2}, Lza2/f$c;->g()Lcom/whoop/design/models/items/UpsellCardFeaturesModel;

    move-result-object v10

    iput-object v7, v0, Lza2/c$b;->w:Ljava/lang/Object;

    iput-object v9, v0, Lza2/c$b;->x:Ljava/lang/Object;

    iput-object v8, v0, Lza2/c$b;->y:Ljava/lang/Object;

    iput-object v6, v0, Lza2/c$b;->z:Ljava/lang/Object;

    iput-object v7, v0, Lza2/c$b;->E:Ljava/lang/Object;

    iput-object v2, v0, Lza2/c$b;->F:Ljava/lang/Object;

    iput v5, v0, Lza2/c$b;->G:I

    iput v3, v0, Lza2/c$b;->H:I

    iput v4, v0, Lza2/c$b;->I:I

    invoke-static {v8, v10, v0}, Lza2/c;->a(Lza2/c;Lcom/whoop/design/models/items/UpsellCardFeaturesModel;Lq83/d;)Ljava/lang/Object;

    move-result-object v10

    if-ne v10, v1, :cond_7

    :goto_4
    return-object v1

    :cond_7
    move-object v11, v2

    move v2, v5

    :goto_5
    move-object v14, v10

    check-cast v14, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;

    const/16 v17, 0x1b

    const/16 v18, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-static/range {v11 .. v18}, Lza2/f$c;->b(Lza2/f$c;Ljava/util/List;Lvc2/c;Lcom/whoop/design/models/items/UpsellCardFeaturesModel;ZLcom/whoop/design/models/modal/AnyModal;ILjava/lang/Object;)Lza2/f$c;

    move-result-object v5

    move-object/from16 v19, v5

    move v5, v2

    move-object/from16 v2, v19

    :cond_8
    check-cast v9, Lec3/h2;

    invoke-virtual {v9, v6, v2}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_9

    goto :goto_6

    :cond_9
    move-object v2, v9

    goto :goto_3

    :cond_a
    :goto_6
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method
