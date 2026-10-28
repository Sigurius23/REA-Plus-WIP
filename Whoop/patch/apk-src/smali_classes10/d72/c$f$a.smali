.class public final Ld72/c$f$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ld72/c$f;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;
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

.field final synthetic x:Ld72/c;


# direct methods
.method public constructor <init>(Lec3/m;Ld72/c;)V
    .locals 0

    iput-object p1, p0, Ld72/c$f$a;->w:Lec3/m;

    iput-object p2, p0, Ld72/c$f$a;->x:Ld72/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 9

    instance-of v0, p2, Ld72/c$f$a$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Ld72/c$f$a$a;

    iget v1, v0, Ld72/c$f$a$a;->x:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Ld72/c$f$a$a;->x:I

    goto :goto_0

    :cond_0
    new-instance v0, Ld72/c$f$a$a;

    invoke-direct {v0, p0, p2}, Ld72/c$f$a$a;-><init>(Ld72/c$f$a;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Ld72/c$f$a$a;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Ld72/c$f$a$a;->x:I

    const/4 v3, 0x4

    const/4 v4, 0x3

    const/4 v5, 0x2

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-eqz v2, :cond_3

    if-eq v2, v6, :cond_2

    if-eq v2, v5, :cond_2

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Ld72/c$f$a$a;->G:Ljava/lang/Object;

    check-cast p1, Lec3/m;

    iget-object p1, v0, Ld72/c$f$a$a;->E:Ljava/lang/Object;

    check-cast p1, Ld72/c$f$a$a;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_5

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget p1, v0, Ld72/c$f$a$a;->K:I

    iget-object v2, v0, Ld72/c$f$a$a;->J:Ljava/lang/Object;

    check-cast v2, Ld72/a;

    iget-object v2, v0, Ld72/c$f$a$a;->I:Ljava/lang/Object;

    check-cast v2, Lq83/d;

    iget-object v2, v0, Ld72/c$f$a$a;->H:Ljava/lang/Object;

    check-cast v2, Lec3/m;

    iget-object v4, v0, Ld72/c$f$a$a;->G:Ljava/lang/Object;

    check-cast v4, Lec3/m;

    iget-object v4, v0, Ld72/c$f$a$a;->E:Ljava/lang/Object;

    check-cast v4, Ld72/c$f$a$a;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, p0, Ld72/c$f$a;->w:Lec3/m;

    check-cast p1, Ld72/a;

    instance-of p2, p1, Ld72/a$c;

    const/4 v8, 0x0

    if-eqz p2, :cond_6

    iget-object p2, p0, Ld72/c$f$a;->x:Ld72/c;

    invoke-static {p2}, Ld72/c;->h(Ld72/c;)Lcom/whoop/data/repositories/FeatureFlagChecker;

    move-result-object p2

    const-string v4, "sage-feature"

    invoke-interface {p2, v4}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_5

    iget-object p2, p0, Ld72/c$f$a;->x:Ld72/c;

    check-cast p1, Ld72/a$c;

    invoke-virtual {p1}, Ld72/a$c;->a()Ljava/lang/String;

    move-result-object p1

    iput-object v7, v0, Ld72/c$f$a$a;->y:Ljava/lang/Object;

    iput-object v7, v0, Ld72/c$f$a$a;->E:Ljava/lang/Object;

    iput-object v7, v0, Ld72/c$f$a$a;->F:Ljava/lang/Object;

    iput-object v7, v0, Ld72/c$f$a$a;->G:Ljava/lang/Object;

    iput-object v2, v0, Ld72/c$f$a$a;->H:Ljava/lang/Object;

    iput-object v7, v0, Ld72/c$f$a$a;->I:Ljava/lang/Object;

    iput-object v7, v0, Ld72/c$f$a$a;->J:Ljava/lang/Object;

    iput v8, v0, Ld72/c$f$a$a;->K:I

    iput v8, v0, Ld72/c$f$a$a;->L:I

    iput v6, v0, Ld72/c$f$a$a;->x:I

    invoke-static {p2, p1, v0}, Ld72/c;->d(Ld72/c;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_4

    goto/16 :goto_4

    :cond_4
    move p1, v8

    :goto_1
    move v8, p1

    goto :goto_3

    :cond_5
    sget-object p1, Ld72/b$c;->a:Ld72/b$c;

    :goto_2
    move-object p2, p1

    goto :goto_3

    :cond_6
    instance-of p2, p1, Ld72/a$a;

    if-eqz p2, :cond_8

    check-cast p1, Ld72/a$a;

    invoke-virtual {p1}, Ld72/a$a;->a()Lo51/a;

    move-result-object p2

    instance-of p2, p2, Lo51/a$a;

    if-eqz p2, :cond_7

    iget-object p2, p0, Ld72/c$f$a;->x:Ld72/c;

    invoke-virtual {p1}, Ld72/a$a;->a()Lo51/a;

    move-result-object p1

    check-cast p1, Lo51/a$a;

    iput-object v7, v0, Ld72/c$f$a$a;->y:Ljava/lang/Object;

    iput-object v7, v0, Ld72/c$f$a$a;->E:Ljava/lang/Object;

    iput-object v7, v0, Ld72/c$f$a$a;->F:Ljava/lang/Object;

    iput-object v7, v0, Ld72/c$f$a$a;->G:Ljava/lang/Object;

    iput-object v2, v0, Ld72/c$f$a$a;->H:Ljava/lang/Object;

    iput-object v7, v0, Ld72/c$f$a$a;->I:Ljava/lang/Object;

    iput-object v7, v0, Ld72/c$f$a$a;->J:Ljava/lang/Object;

    iput v8, v0, Ld72/c$f$a$a;->K:I

    iput v8, v0, Ld72/c$f$a$a;->L:I

    iput v5, v0, Ld72/c$f$a$a;->x:I

    invoke-static {p2, p2, p1, v0}, Ld72/c;->e(Ld72/c;Ld72/c;Lo51/a$a;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_4

    goto :goto_4

    :cond_7
    sget-object p1, Ld72/b$e;->a:Ld72/b$e;

    goto :goto_2

    :cond_8
    instance-of p2, p1, Ld72/a$d;

    if-eqz p2, :cond_9

    sget-object p1, Ld72/b$d;->a:Ld72/b$d;

    goto :goto_2

    :cond_9
    instance-of p2, p1, Ld72/a$b;

    if-eqz p2, :cond_b

    iget-object p2, p0, Ld72/c$f$a;->x:Ld72/c;

    check-cast p1, Ld72/a$b;

    invoke-virtual {p1}, Ld72/a$b;->a()Ljava/lang/String;

    move-result-object p1

    iput-object v7, v0, Ld72/c$f$a$a;->y:Ljava/lang/Object;

    iput-object v7, v0, Ld72/c$f$a$a;->E:Ljava/lang/Object;

    iput-object v7, v0, Ld72/c$f$a$a;->F:Ljava/lang/Object;

    iput-object v7, v0, Ld72/c$f$a$a;->G:Ljava/lang/Object;

    iput-object v2, v0, Ld72/c$f$a$a;->H:Ljava/lang/Object;

    iput-object v7, v0, Ld72/c$f$a$a;->I:Ljava/lang/Object;

    iput-object v7, v0, Ld72/c$f$a$a;->J:Ljava/lang/Object;

    iput v8, v0, Ld72/c$f$a$a;->K:I

    iput v8, v0, Ld72/c$f$a$a;->L:I

    iput v4, v0, Ld72/c$f$a$a;->x:I

    invoke-static {p2, p1, v0}, Ld72/c;->c(Ld72/c;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_4

    goto :goto_4

    :goto_3
    iput-object v7, v0, Ld72/c$f$a$a;->y:Ljava/lang/Object;

    iput-object v7, v0, Ld72/c$f$a$a;->E:Ljava/lang/Object;

    iput-object v7, v0, Ld72/c$f$a$a;->F:Ljava/lang/Object;

    iput-object v7, v0, Ld72/c$f$a$a;->G:Ljava/lang/Object;

    iput-object v7, v0, Ld72/c$f$a$a;->H:Ljava/lang/Object;

    iput-object v7, v0, Ld72/c$f$a$a;->I:Ljava/lang/Object;

    iput-object v7, v0, Ld72/c$f$a$a;->J:Ljava/lang/Object;

    iput v8, v0, Ld72/c$f$a$a;->K:I

    iput v3, v0, Ld72/c$f$a$a;->x:I

    invoke-interface {v2, p2, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_a

    :goto_4
    return-object v1

    :cond_a
    :goto_5
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_b
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
