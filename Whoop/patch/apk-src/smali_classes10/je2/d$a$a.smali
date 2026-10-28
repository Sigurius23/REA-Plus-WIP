.class public final Lje2/d$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lje2/d$a;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;
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

.field final synthetic x:Lje2/d;


# direct methods
.method public constructor <init>(Lec3/m;Lje2/d;)V
    .locals 0

    iput-object p1, p0, Lje2/d$a$a;->w:Lec3/m;

    iput-object p2, p0, Lje2/d$a$a;->x:Lje2/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    instance-of v2, v1, Lje2/d$a$a$a;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lje2/d$a$a$a;

    iget v3, v2, Lje2/d$a$a$a;->x:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lje2/d$a$a$a;->x:I

    goto :goto_0

    :cond_0
    new-instance v2, Lje2/d$a$a$a;

    invoke-direct {v2, v0, v1}, Lje2/d$a$a$a;-><init>(Lje2/d$a$a;Lq83/d;)V

    :goto_0
    iget-object v1, v2, Lje2/d$a$a$a;->w:Ljava/lang/Object;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v2, Lje2/d$a$a$a;->x:I

    const/4 v5, 0x1

    if-eqz v4, :cond_2

    if-ne v4, v5, :cond_1

    iget-object v3, v2, Lje2/d$a$a$a;->G:Ljava/lang/Object;

    check-cast v3, Lec3/m;

    iget-object v2, v2, Lje2/d$a$a$a;->E:Ljava/lang/Object;

    check-cast v2, Lje2/d$a$a$a;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_2

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v0, Lje2/d$a$a;->w:Lec3/m;

    move-object/from16 v4, p1

    check-cast v4, Lie2/b;

    invoke-virtual {v4}, Lie2/b;->c()Lie2/d;

    move-result-object v6

    sget-object v7, Lie2/d$d;->a:Lie2/d$d;

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_3

    sget-object v4, Lje2/c$a;->h:Lje2/c$a$a;

    invoke-virtual {v4}, Lje2/c$a$a;->c()Lje2/c$a;

    move-result-object v4

    goto/16 :goto_1

    :cond_3
    sget-object v7, Lie2/d$b;->a:Lie2/d$b;

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_4

    sget-object v4, Lje2/c$a;->h:Lje2/c$a$a;

    invoke-virtual {v4}, Lje2/c$a$a;->b()Lje2/c$a;

    move-result-object v4

    goto/16 :goto_1

    :cond_4
    sget-object v7, Lie2/d$c;->a:Lie2/d$c;

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_5

    iget-object v6, v0, Lje2/d$a$a;->x:Lje2/d;

    invoke-virtual {v4}, Lie2/b;->d()Lcom/whoop/shepherd/feature/togglesettings/domain/models/ShepherdToggleSettingsResponse;

    move-result-object v4

    invoke-static {v6, v4}, Lje2/d;->a(Lje2/d;Lcom/whoop/shepherd/feature/togglesettings/domain/models/ShepherdToggleSettingsResponse;)Lje2/c;

    move-result-object v4

    goto/16 :goto_1

    :cond_5
    instance-of v7, v6, Lie2/d$e;

    if-eqz v7, :cond_6

    sget-object v6, Lje2/c$a;->h:Lje2/c$a$a;

    invoke-virtual {v6}, Lje2/c$a$a;->d()Lje2/c$a;

    move-result-object v7

    new-instance v14, Lje2/a$i;

    invoke-virtual {v4}, Lie2/b;->c()Lie2/d;

    move-result-object v6

    check-cast v6, Lie2/d$e;

    invoke-virtual {v6}, Lie2/d$e;->a()Z

    move-result v6

    invoke-virtual {v4}, Lie2/b;->c()Lie2/d;

    move-result-object v4

    check-cast v4, Lie2/d$e;

    invoke-virtual {v4}, Lie2/d$e;->b()Z

    move-result v4

    invoke-direct {v14, v6, v4}, Lje2/a$i;-><init>(ZZ)V

    const/16 v15, 0x3f

    const/16 v16, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-static/range {v7 .. v16}, Lje2/c$a;->f(Lje2/c$a;Lsz0/p0;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lje2/a;Lcom/whoop/design/util/TextResource;Lje2/a;Lje2/a;ILjava/lang/Object;)Lje2/c$a;

    move-result-object v4

    goto :goto_1

    :cond_6
    instance-of v7, v6, Lie2/d$a;

    if-eqz v7, :cond_7

    sget-object v6, Lje2/c$a;->h:Lje2/c$a$a;

    invoke-virtual {v6}, Lje2/c$a$a;->a()Lje2/c$a;

    move-result-object v7

    new-instance v11, Lje2/a$g;

    invoke-virtual {v4}, Lie2/b;->c()Lie2/d;

    move-result-object v6

    check-cast v6, Lie2/d$a;

    invoke-virtual {v6}, Lie2/d$a;->a()Z

    move-result v6

    invoke-virtual {v4}, Lie2/b;->c()Lie2/d;

    move-result-object v4

    check-cast v4, Lie2/d$a;

    invoke-virtual {v4}, Lie2/d$a;->b()Z

    move-result v4

    invoke-direct {v11, v6, v4}, Lje2/a$g;-><init>(ZZ)V

    sget-object v13, Lje2/a$a;->a:Lje2/a$a;

    const/16 v15, 0x57

    const/16 v16, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    invoke-static/range {v7 .. v16}, Lje2/c$a;->f(Lje2/c$a;Lsz0/p0;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lje2/a;Lcom/whoop/design/util/TextResource;Lje2/a;Lje2/a;ILjava/lang/Object;)Lje2/c$a;

    move-result-object v4

    goto :goto_1

    :cond_7
    sget-object v4, Lie2/d$f;->a:Lie2/d$f;

    invoke-static {v6, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_9

    new-instance v6, Lje2/c$a;

    new-instance v7, Lsz0/p0$h;

    const/4 v12, 0x7

    const/4 v13, 0x0

    const/4 v8, 0x0

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    invoke-direct/range {v7 .. v13}, Lsz0/p0$h;-><init>(Lcom/whoop/design/util/TextResource;JLc93/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object v13, Lje2/a$f;->a:Lje2/a$f;

    const/16 v14, 0x3e

    const/4 v15, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    invoke-direct/range {v6 .. v15}, Lje2/c$a;-><init>(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lje2/a;Lcom/whoop/design/util/TextResource;Lje2/a;Lje2/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v4, v6

    :goto_1
    const/4 v6, 0x0

    iput-object v6, v2, Lje2/d$a$a$a;->y:Ljava/lang/Object;

    iput-object v6, v2, Lje2/d$a$a$a;->E:Ljava/lang/Object;

    iput-object v6, v2, Lje2/d$a$a$a;->F:Ljava/lang/Object;

    iput-object v6, v2, Lje2/d$a$a$a;->G:Ljava/lang/Object;

    const/4 v6, 0x0

    iput v6, v2, Lje2/d$a$a$a;->H:I

    iput v5, v2, Lje2/d$a$a$a;->x:I

    invoke-interface {v1, v4, v2}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_8

    return-object v3

    :cond_8
    :goto_2
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :cond_9
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1
.end method
