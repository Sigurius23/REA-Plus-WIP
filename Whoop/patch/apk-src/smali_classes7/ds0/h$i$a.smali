.class public final Lds0/h$i$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lds0/h$i;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lec3/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic w:Lec3/m;

.field final synthetic x:Lds0/h;

.field final synthetic y:Lec3/p1;

.field final synthetic z:Lfs0/c;


# direct methods
.method public constructor <init>(Lec3/m;Lds0/h;Lec3/p1;Lfs0/c;)V
    .locals 0

    iput-object p1, p0, Lds0/h$i$a;->w:Lec3/m;

    iput-object p2, p0, Lds0/h$i$a;->x:Lds0/h;

    iput-object p3, p0, Lds0/h$i$a;->y:Lec3/p1;

    iput-object p4, p0, Lds0/h$i$a;->z:Lfs0/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    instance-of v2, v1, Lds0/h$i$a$a;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lds0/h$i$a$a;

    iget v3, v2, Lds0/h$i$a$a;->x:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lds0/h$i$a$a;->x:I

    goto :goto_0

    :cond_0
    new-instance v2, Lds0/h$i$a$a;

    invoke-direct {v2, v0, v1}, Lds0/h$i$a$a;-><init>(Lds0/h$i$a;Lq83/d;)V

    :goto_0
    iget-object v1, v2, Lds0/h$i$a$a;->w:Ljava/lang/Object;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v2, Lds0/h$i$a$a;->x:I

    const/4 v5, 0x1

    if-eqz v4, :cond_2

    if-ne v4, v5, :cond_1

    iget-object v3, v2, Lds0/h$i$a$a;->G:Ljava/lang/Object;

    check-cast v3, Lec3/m;

    iget-object v2, v2, Lds0/h$i$a$a;->E:Ljava/lang/Object;

    check-cast v2, Lds0/h$i$a$a;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_6

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v0, Lds0/h$i$a;->w:Lec3/m;

    move-object/from16 v4, p1

    check-cast v4, Lds0/d$f;

    instance-of v6, v4, Lds0/d$k;

    const/4 v7, 0x0

    if-eqz v6, :cond_5

    new-instance v13, Lds0/b$c;

    check-cast v4, Lds0/d$k;

    invoke-virtual {v4}, Lds0/d$k;->a()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v13, v6}, Lds0/b$c;-><init>(Ljava/lang/String;)V

    iget-object v6, v0, Lds0/h$i$a;->x:Lds0/h;

    invoke-virtual {v4}, Lds0/d$k;->b()Lcom/whoop/navigation/models/GenericInteraction;

    move-result-object v8

    invoke-static {v6, v8}, Lds0/h;->l(Lds0/h;Lcom/whoop/navigation/models/GenericInteraction;)Lcom/whoop/whoopaction/domain/models/UpdateAction;

    move-result-object v6

    if-eqz v6, :cond_4

    iget-object v8, v0, Lds0/h$i$a;->y:Lec3/p1;

    check-cast v8, Lec3/h2;

    invoke-virtual {v8}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lds0/f;

    invoke-virtual {v8}, Lds0/f;->i()Ljava/util/Set;

    move-result-object v8

    invoke-virtual {v4}, Lds0/d$k;->a()Ljava/lang/String;

    move-result-object v9

    invoke-interface {v8, v9}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_4

    iget-object v14, v0, Lds0/h$i$a;->y:Lec3/p1;

    :goto_1
    move-object v15, v14

    check-cast v15, Lec3/h2;

    invoke-virtual {v15}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v8

    move-object v9, v8

    check-cast v9, Lds0/f;

    move-object v10, v8

    iget-object v8, v0, Lds0/h$i$a;->x:Lds0/h;

    move-object v11, v10

    invoke-virtual {v4}, Lds0/d$k;->a()Ljava/lang/String;

    move-result-object v10

    iget-object v12, v0, Lds0/h$i$a;->z:Lfs0/c;

    invoke-virtual {v12}, Lfs0/c;->c()J

    move-result-wide v16

    move-object v5, v11

    move-wide/from16 v11, v16

    invoke-static/range {v8 .. v13}, Lds0/h;->o(Lds0/h;Lds0/f;Ljava/lang/String;JLds0/b$c;)Lds0/f;

    move-result-object v8

    invoke-virtual {v15, v5, v8}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    goto :goto_2

    :cond_3
    const/4 v5, 0x1

    goto :goto_1

    :cond_4
    :goto_2
    new-instance v4, Lfs0/a$a;

    invoke-direct {v4, v13, v6}, Lfs0/a$a;-><init>(Lds0/b;Lcom/whoop/whoopaction/domain/models/UpdateAction;)V

    goto/16 :goto_5

    :cond_5
    instance-of v5, v4, Lds0/d$l;

    if-eqz v5, :cond_9

    iget-object v5, v0, Lds0/h$i$a;->z:Lfs0/c;

    check-cast v4, Lds0/d$l;

    invoke-virtual {v4}, Lds0/d$l;->a()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Lfs0/c;->a(Ljava/lang/String;)Lds0/b$a;

    move-result-object v5

    iget-object v6, v0, Lds0/h$i$a;->y:Lec3/p1;

    check-cast v6, Lec3/h2;

    invoke-virtual {v6}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lds0/f;

    invoke-virtual {v6}, Lds0/f;->f()Lcom/whoop/communityreactions/domain/model/ReactionsInputModel;

    move-result-object v6

    if-eqz v6, :cond_6

    iget-object v8, v0, Lds0/h$i$a;->x:Lds0/h;

    invoke-virtual {v4}, Lds0/d$l;->a()Ljava/lang/String;

    move-result-object v4

    invoke-static {v8, v6, v4}, Lds0/h;->k(Lds0/h;Lcom/whoop/communityreactions/domain/model/ReactionsInputModel;Ljava/lang/String;)Lcom/whoop/whoopaction/domain/models/UpdateAction;

    move-result-object v4

    goto :goto_3

    :cond_6
    move-object v4, v7

    :goto_3
    if-eqz v4, :cond_8

    iget-object v6, v0, Lds0/h$i$a;->y:Lec3/p1;

    :cond_7
    move-object v8, v6

    check-cast v8, Lec3/h2;

    invoke-virtual {v8}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v9

    move-object v10, v9

    check-cast v10, Lds0/f;

    iget-object v11, v0, Lds0/h$i$a;->x:Lds0/h;

    invoke-static {v11, v10, v5}, Lds0/h;->n(Lds0/h;Lds0/f;Lds0/b$a;)Lds0/f;

    move-result-object v10

    invoke-virtual {v8, v9, v10}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_7

    :cond_8
    new-instance v6, Lfs0/a$a;

    invoke-direct {v6, v5, v4}, Lfs0/a$a;-><init>(Lds0/b;Lcom/whoop/whoopaction/domain/models/UpdateAction;)V

    move-object v4, v6

    goto :goto_5

    :cond_9
    instance-of v5, v4, Lds0/d$g;

    if-eqz v5, :cond_b

    new-instance v5, Lfs0/a$a;

    iget-object v6, v0, Lds0/h$i$a;->z:Lfs0/c;

    invoke-virtual {v6}, Lfs0/c;->b()Lds0/b$b;

    move-result-object v6

    check-cast v4, Lds0/d$g;

    invoke-virtual {v4}, Lds0/d$g;->a()Lcom/whoop/whoopaction/domain/models/Action;

    move-result-object v4

    instance-of v8, v4, Lcom/whoop/whoopaction/domain/models/UpdateAction;

    if-eqz v8, :cond_a

    check-cast v4, Lcom/whoop/whoopaction/domain/models/UpdateAction;

    goto :goto_4

    :cond_a
    move-object v4, v7

    :goto_4
    invoke-direct {v5, v6, v4}, Lfs0/a$a;-><init>(Lds0/b;Lcom/whoop/whoopaction/domain/models/UpdateAction;)V

    move-object v4, v5

    goto :goto_5

    :cond_b
    instance-of v4, v4, Lds0/d$j;

    if-eqz v4, :cond_d

    sget-object v4, Lfs0/a$b;->a:Lfs0/a$b;

    :goto_5
    iput-object v7, v2, Lds0/h$i$a$a;->y:Ljava/lang/Object;

    iput-object v7, v2, Lds0/h$i$a$a;->E:Ljava/lang/Object;

    iput-object v7, v2, Lds0/h$i$a$a;->F:Ljava/lang/Object;

    iput-object v7, v2, Lds0/h$i$a$a;->G:Ljava/lang/Object;

    const/4 v5, 0x0

    iput v5, v2, Lds0/h$i$a$a;->H:I

    const/4 v5, 0x1

    iput v5, v2, Lds0/h$i$a$a;->x:I

    invoke-interface {v1, v4, v2}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_c

    return-object v3

    :cond_c
    :goto_6
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :cond_d
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1
.end method
