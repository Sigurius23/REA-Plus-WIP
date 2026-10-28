.class public final Lcr1/c$i;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcr1/c;->r(Lec3/l;)Lec3/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lkotlin/jvm/functions/Function3;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\u0008\u0000\u0010\u0000\"\u0004\u0008\u0001\u0010\u0001*\u0008\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"
    }
    d2 = {
        "R",
        "T",
        "Lec3/m;",
        "it",
        "Ll83/a0;",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.integrations.domain.IntegrationsInteractor$interact$$inlined$flatMapLatest$1"
    f = "IntegrationsInteractor.kt"
    l = {
        0xc0,
        0xc3,
        0xc7,
        0xcb,
        0xbd
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field E:Ljava/lang/Object;

.field F:Ljava/lang/Object;

.field G:Ljava/lang/Object;

.field H:I

.field w:I

.field private synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Lcr1/c;


# direct methods
.method public constructor <init>(Lq83/d;Lcr1/c;)V
    .locals 0

    iput-object p2, p0, Lcr1/c$i;->z:Lcr1/c;

    const/4 p2, 0x3

    invoke-direct {p0, p2, p1}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final invoke(Lec3/m;Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/m;",
            "Lcr1/a;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance v0, Lcr1/c$i;

    iget-object v1, p0, Lcr1/c$i;->z:Lcr1/c;

    invoke-direct {v0, p3, v1}, Lcr1/c$i;-><init>(Lq83/d;Lcr1/c;)V

    iput-object p1, v0, Lcr1/c$i;->x:Ljava/lang/Object;

    iput-object p2, v0, Lcr1/c$i;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lcr1/c$i;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lcr1/c$i;->invoke(Lec3/m;Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lcr1/c$i;->w:I

    const/4 v2, 0x5

    const/4 v3, 0x4

    const/4 v4, 0x3

    const/4 v5, 0x2

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-eqz v1, :cond_2

    if-eq v1, v6, :cond_1

    if-eq v1, v5, :cond_1

    if-eq v1, v4, :cond_1

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lcr1/c$i;->x:Ljava/lang/Object;

    check-cast v0, Lec3/m;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v1, p0, Lcr1/c$i;->G:Ljava/lang/Object;

    check-cast v1, Lcr1/a;

    iget-object v1, p0, Lcr1/c$i;->F:Ljava/lang/Object;

    check-cast v1, Lq83/d;

    iget-object v1, p0, Lcr1/c$i;->E:Ljava/lang/Object;

    check-cast v1, Lec3/m;

    iget-object v3, p0, Lcr1/c$i;->x:Ljava/lang/Object;

    check-cast v3, Lec3/m;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_0

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lcr1/c$i;->x:Ljava/lang/Object;

    move-object v1, p1

    check-cast v1, Lec3/m;

    iget-object p1, p0, Lcr1/c$i;->y:Ljava/lang/Object;

    check-cast p1, Lcr1/a;

    instance-of v8, p1, Lcr1/a$e;

    const/4 v9, 0x0

    if-eqz v8, :cond_3

    iget-object p1, p0, Lcr1/c$i;->z:Lcr1/c;

    iput-object v7, p0, Lcr1/c$i;->x:Ljava/lang/Object;

    iput-object v7, p0, Lcr1/c$i;->y:Ljava/lang/Object;

    iput-object v1, p0, Lcr1/c$i;->E:Ljava/lang/Object;

    iput-object v7, p0, Lcr1/c$i;->F:Ljava/lang/Object;

    iput-object v7, p0, Lcr1/c$i;->G:Ljava/lang/Object;

    iput v9, p0, Lcr1/c$i;->H:I

    iput v6, p0, Lcr1/c$i;->w:I

    invoke-static {p1, p0}, Lcr1/c;->f(Lcr1/c;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_a

    goto/16 :goto_1

    :cond_3
    instance-of v6, p1, Lcr1/a$c;

    if-eqz v6, :cond_4

    iget-object v3, p0, Lcr1/c$i;->z:Lcr1/c;

    check-cast p1, Lcr1/a$c;

    invoke-virtual {p1}, Lcr1/a$c;->a()Ljava/lang/String;

    move-result-object p1

    iput-object v7, p0, Lcr1/c$i;->x:Ljava/lang/Object;

    iput-object v7, p0, Lcr1/c$i;->y:Ljava/lang/Object;

    iput-object v1, p0, Lcr1/c$i;->E:Ljava/lang/Object;

    iput-object v7, p0, Lcr1/c$i;->F:Ljava/lang/Object;

    iput-object v7, p0, Lcr1/c$i;->G:Ljava/lang/Object;

    iput v9, p0, Lcr1/c$i;->H:I

    iput v5, p0, Lcr1/c$i;->w:I

    invoke-static {v3, p1, p0}, Lcr1/c;->i(Lcr1/c;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_a

    goto/16 :goto_1

    :cond_4
    instance-of v5, p1, Lcr1/a$b;

    if-eqz v5, :cond_5

    iget-object v3, p0, Lcr1/c$i;->z:Lcr1/c;

    check-cast p1, Lcr1/a$b;

    invoke-virtual {p1}, Lcr1/a$b;->a()Ljava/lang/String;

    move-result-object p1

    iput-object v7, p0, Lcr1/c$i;->x:Ljava/lang/Object;

    iput-object v7, p0, Lcr1/c$i;->y:Ljava/lang/Object;

    iput-object v1, p0, Lcr1/c$i;->E:Ljava/lang/Object;

    iput-object v7, p0, Lcr1/c$i;->F:Ljava/lang/Object;

    iput-object v7, p0, Lcr1/c$i;->G:Ljava/lang/Object;

    iput v9, p0, Lcr1/c$i;->H:I

    iput v4, p0, Lcr1/c$i;->w:I

    invoke-static {v3, p1, p0}, Lcr1/c;->b(Lcr1/c;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_a

    goto/16 :goto_1

    :cond_5
    instance-of v4, p1, Lcr1/a$a;

    if-eqz v4, :cond_6

    iget-object v4, p0, Lcr1/c$i;->z:Lcr1/c;

    check-cast p1, Lcr1/a$a;

    invoke-virtual {p1}, Lcr1/a$a;->a()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1}, Lcr1/a$a;->b()Ljava/lang/String;

    move-result-object p1

    iput-object v7, p0, Lcr1/c$i;->x:Ljava/lang/Object;

    iput-object v7, p0, Lcr1/c$i;->y:Ljava/lang/Object;

    iput-object v1, p0, Lcr1/c$i;->E:Ljava/lang/Object;

    iput-object v7, p0, Lcr1/c$i;->F:Ljava/lang/Object;

    iput-object v7, p0, Lcr1/c$i;->G:Ljava/lang/Object;

    iput v9, p0, Lcr1/c$i;->H:I

    iput v3, p0, Lcr1/c$i;->w:I

    invoke-static {v4, v5, p1, p0}, Lcr1/c;->a(Lcr1/c;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_a

    goto :goto_1

    :cond_6
    instance-of v3, p1, Lcr1/a$d;

    if-eqz v3, :cond_7

    iget-object v3, p0, Lcr1/c$i;->z:Lcr1/c;

    check-cast p1, Lcr1/a$d;

    invoke-virtual {p1}, Lcr1/a$d;->a()Ljava/lang/String;

    move-result-object p1

    invoke-static {v3, p1}, Lcr1/c;->e(Lcr1/c;Ljava/lang/String;)Lec3/l;

    move-result-object p1

    goto :goto_0

    :cond_7
    instance-of v3, p1, Lcr1/a$f;

    if-eqz v3, :cond_8

    sget-object p1, Lcr1/b$i;->a:Lcr1/b$i;

    new-instance v3, La6/u;

    const/4 v4, 0x1

    invoke-direct {v3, p1, v4}, La6/u;-><init>(Ljava/lang/Object;I)V

    move-object p1, v3

    goto :goto_0

    :cond_8
    instance-of v3, p1, Lcr1/a$g;

    if-eqz v3, :cond_9

    iget-object v3, p0, Lcr1/c$i;->z:Lcr1/c;

    check-cast p1, Lcr1/a$g;

    invoke-virtual {p1}, Lcr1/a$g;->a()Ljava/lang/String;

    move-result-object p1

    invoke-static {v3, p1}, Lcr1/c;->j(Lcr1/c;Ljava/lang/String;)Lec3/l;

    move-result-object p1

    goto :goto_0

    :cond_9
    instance-of v3, p1, Lcr1/a$h;

    if-eqz v3, :cond_c

    iget-object v3, p0, Lcr1/c$i;->z:Lcr1/c;

    check-cast p1, Lcr1/a$h;

    invoke-virtual {p1}, Lcr1/a$h;->a()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Lcr1/a$h;->b()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1}, Lcr1/a$h;->c()Z

    move-result p1

    invoke-static {v3, v4, v5, p1}, Lcr1/c;->k(Lcr1/c;Ljava/lang/String;Ljava/lang/String;Z)Lec3/l;

    move-result-object p1

    :cond_a
    :goto_0
    check-cast p1, Lec3/l;

    iput-object v7, p0, Lcr1/c$i;->x:Ljava/lang/Object;

    iput-object v7, p0, Lcr1/c$i;->y:Ljava/lang/Object;

    iput-object v7, p0, Lcr1/c$i;->E:Ljava/lang/Object;

    iput-object v7, p0, Lcr1/c$i;->F:Ljava/lang/Object;

    iput-object v7, p0, Lcr1/c$i;->G:Ljava/lang/Object;

    iput v2, p0, Lcr1/c$i;->w:I

    invoke-static {v1, p1, p0}, Lec3/v;->w(Lec3/m;Lec3/l;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_b

    :goto_1
    return-object v0

    :cond_b
    :goto_2
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_c
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
