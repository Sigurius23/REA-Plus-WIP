.class final Ldf0/c$i;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ldf0/c;->interact(Lec3/l;)Lec3/l;
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
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Ldf0/c$b;",
        "previousState",
        "Ldf0/a;",
        "action",
        "<anonymous>",
        "(Ldf0/c$b;Ldf0/a;)Ldf0/c$b;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.advancedlabs.typeformwebview.domain.AdvancedLabsTypeformWebviewInteractor$interact$1"
    f = "AdvancedLabsTypeformWebviewInteractor.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lq83/d;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ldf0/c$i;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x3

    invoke-direct {p0, v0, p1}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Ldf0/c$b;Ldf0/a;Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldf0/c$b;",
            "Ldf0/a;",
            "Lq83/d<",
            "-",
            "Ldf0/c$b;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Ldf0/c$i;

    invoke-direct {v0, p3}, Ldf0/c$i;-><init>(Lq83/d;)V

    iput-object p1, v0, Ldf0/c$i;->x:Ljava/lang/Object;

    iput-object p2, v0, Ldf0/c$i;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Ldf0/c$i;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ldf0/c$b;

    check-cast p2, Ldf0/a;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Ldf0/c$i;->f(Ldf0/c$b;Ldf0/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget-object v0, p0, Ldf0/c$i;->x:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ldf0/c$b;

    iget-object v0, p0, Ldf0/c$i;->y:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Ldf0/a;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v0, p0, Ldf0/c$i;->w:I

    if-nez v0, :cond_5

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    instance-of p1, v4, Ldf0/a$h;

    if-eqz p1, :cond_1

    move-object p1, v4

    check-cast p1, Ldf0/a$h;

    invoke-virtual {p1}, Ldf0/a$h;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Ldf0/a$h;->b()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_0

    invoke-virtual {v1}, Ldf0/c$b;->e()Ljava/lang/String;

    move-result-object p1

    :cond_0
    move-object v3, p1

    const/16 v6, 0x8

    const/4 v7, 0x0

    const/4 v5, 0x0

    invoke-static/range {v1 .. v7}, Ldf0/c$b;->b(Ldf0/c$b;Ljava/lang/String;Ljava/lang/String;Ldf0/a;ZILjava/lang/Object;)Ldf0/c$b;

    move-result-object p1

    return-object p1

    :cond_1
    instance-of p1, v4, Ldf0/a$a;

    if-eqz p1, :cond_3

    move-object p1, v4

    check-cast p1, Ldf0/a$a;

    invoke-virtual {p1}, Ldf0/a$a;->a()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_2

    invoke-virtual {v1}, Ldf0/c$b;->e()Ljava/lang/String;

    move-result-object p1

    :cond_2
    move-object v3, p1

    const/16 v6, 0x9

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v5, 0x0

    invoke-static/range {v1 .. v7}, Ldf0/c$b;->b(Ldf0/c$b;Ljava/lang/String;Ljava/lang/String;Ldf0/a;ZILjava/lang/Object;)Ldf0/c$b;

    move-result-object p1

    return-object p1

    :cond_3
    instance-of p1, v4, Ldf0/a$g;

    if-eqz p1, :cond_4

    const/4 v6, 0x3

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x1

    invoke-static/range {v1 .. v7}, Ldf0/c$b;->b(Ldf0/c$b;Ljava/lang/String;Ljava/lang/String;Ldf0/a;ZILjava/lang/Object;)Ldf0/c$b;

    move-result-object p1

    return-object p1

    :cond_4
    const/16 v6, 0xb

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    invoke-static/range {v1 .. v7}, Ldf0/c$b;->b(Ldf0/c$b;Ljava/lang/String;Ljava/lang/String;Ldf0/a;ZILjava/lang/Object;)Ldf0/c$b;

    move-result-object p1

    return-object p1

    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
