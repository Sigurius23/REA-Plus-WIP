.class final Le52/a$c;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Le52/a;->h(Lbc3/c0;)V
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
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Ly42/a;",
        "puffin",
        "Ll83/a0;",
        "<anonymous>",
        "(Ly42/a;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.puffin.store.PuffinStore$observeConnectedPuffinFlow$1"
    f = "PuffinStore.kt"
    l = {
        0x28
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Le52/a;

.field w:Ljava/lang/Object;

.field x:I

.field y:I

.field synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Le52/a;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le52/a;",
            "Lq83/d<",
            "-",
            "Le52/a$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Le52/a$c;->E:Le52/a;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

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

    new-instance v0, Le52/a$c;

    iget-object v1, p0, Le52/a$c;->E:Le52/a;

    invoke-direct {v0, v1, p2}, Le52/a$c;-><init>(Le52/a;Lq83/d;)V

    iput-object p1, v0, Le52/a$c;->z:Ljava/lang/Object;

    return-object v0
.end method

.method public final f(Ly42/a;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ly42/a;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Le52/a$c;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Le52/a$c;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Le52/a$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ly42/a;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Le52/a$c;->f(Ly42/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    iget-object v0, p0, Le52/a$c;->z:Ljava/lang/Object;

    check-cast v0, Ly42/a;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Le52/a$c;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_1

    if-ne v2, v3, :cond_0

    iget-object v0, p0, Le52/a$c;->w:Ljava/lang/Object;

    check-cast v0, Lc52/d;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-interface {v0}, Ly42/a;->O()Lc52/d;

    move-result-object p1

    if-eqz p1, :cond_2

    iget-object v0, p0, Le52/a$c;->E:Le52/a;

    invoke-virtual {p1}, Lc52/d;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lc52/d;->c()Ljava/lang/String;

    move-result-object p1

    const/4 v4, 0x0

    iput-object v4, p0, Le52/a$c;->z:Ljava/lang/Object;

    iput-object v4, p0, Le52/a$c;->w:Ljava/lang/Object;

    const/4 v4, 0x0

    iput v4, p0, Le52/a$c;->x:I

    iput v3, p0, Le52/a$c;->y:I

    invoke-static {v0, v2, p1, p0}, Le52/a;->f(Le52/a;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_2

    return-object v1

    :cond_2
    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
