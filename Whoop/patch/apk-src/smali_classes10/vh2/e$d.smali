.class final Lvh2/e$d;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvh2/e;->o(Ljk0/d;Ljava/lang/String;Lvh2/i;IZLvh2/h;JLjava/lang/Long;Ljava/lang/Long;J)Lvh2/h;
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
    c = "com.whoop.strapauth.unlock.StrapUnlockServiceImpl$finishAttempt$1"
    f = "StrapUnlockServiceImpl.kt"
    l = {
        0xd9
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Z

.field final synthetic F:Ljava/lang/String;

.field w:I

.field final synthetic x:Lvh2/e;

.field final synthetic y:Ljava/lang/String;

.field final synthetic z:Lvh2/h;


# direct methods
.method public constructor <init>(Lvh2/e;Ljava/lang/String;Lvh2/h;ZLjava/lang/String;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvh2/e;",
            "Ljava/lang/String;",
            "Lvh2/h;",
            "Z",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lvh2/e$d;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lvh2/e$d;->x:Lvh2/e;

    iput-object p2, p0, Lvh2/e$d;->y:Ljava/lang/String;

    iput-object p3, p0, Lvh2/e$d;->z:Lvh2/h;

    iput-boolean p4, p0, Lvh2/e$d;->E:Z

    iput-object p5, p0, Lvh2/e$d;->F:Ljava/lang/String;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 7
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

    new-instance v0, Lvh2/e$d;

    iget-object v1, p0, Lvh2/e$d;->x:Lvh2/e;

    iget-object v2, p0, Lvh2/e$d;->y:Ljava/lang/String;

    iget-object v3, p0, Lvh2/e$d;->z:Lvh2/h;

    iget-boolean v4, p0, Lvh2/e$d;->E:Z

    iget-object v5, p0, Lvh2/e$d;->F:Ljava/lang/String;

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Lvh2/e$d;-><init>(Lvh2/e;Ljava/lang/String;Lvh2/h;ZLjava/lang/String;Lq83/d;)V

    return-object v0
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
    invoke-virtual {p0, p1, p2}, Lvh2/e$d;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lvh2/e$d;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lvh2/e$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lvh2/e$d;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lvh2/e$d;->w:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lvh2/e$d;->x:Lvh2/e;

    invoke-static {p1}, Lvh2/e;->j(Lvh2/e;)Lvh2/g;

    move-result-object v3

    iget-object v4, p0, Lvh2/e$d;->y:Ljava/lang/String;

    iget-object v5, p0, Lvh2/e$d;->z:Lvh2/h;

    iget-boolean v6, p0, Lvh2/e$d;->E:Z

    iget-object v7, p0, Lvh2/e$d;->F:Ljava/lang/String;

    iput v2, p0, Lvh2/e$d;->w:I

    move-object v8, p0

    invoke-virtual/range {v3 .. v8}, Lvh2/g;->a(Ljava/lang/String;Lvh2/h;ZLjava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
