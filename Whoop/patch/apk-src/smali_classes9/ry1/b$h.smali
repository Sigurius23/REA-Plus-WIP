.class final Lry1/b$h;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lry1/b;->E(Lty1/j$c;)Lec3/l;
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
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u0002*\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lec3/m;",
        "Lry1/b$a;",
        "Ll83/a0;",
        "<anonymous>",
        "(Lec3/m;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.mfa.challenge.domain.MfaChallengeInteractor$submit$1"
    f = "MfaChallengeInteractor.kt"
    l = {
        0x1b0,
        0x234,
        0x1c7
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field private synthetic E:Ljava/lang/Object;

.field final synthetic F:Lty1/j$c;

.field final synthetic G:Lry1/b;

.field w:Ljava/lang/Object;

.field x:J

.field y:I

.field z:I


# direct methods
.method public constructor <init>(Lty1/j$c;Lry1/b;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lty1/j$c;",
            "Lry1/b;",
            "Lq83/d<",
            "-",
            "Lry1/b$h;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lry1/b$h;->F:Lty1/j$c;

    iput-object p2, p0, Lry1/b$h;->G:Lry1/b;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 3
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

    new-instance v0, Lry1/b$h;

    iget-object v1, p0, Lry1/b$h;->F:Lty1/j$c;

    iget-object v2, p0, Lry1/b$h;->G:Lry1/b;

    invoke-direct {v0, v1, v2, p2}, Lry1/b$h;-><init>(Lty1/j$c;Lry1/b;Lq83/d;)V

    iput-object p1, v0, Lry1/b$h;->E:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/m;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lry1/b$h;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lry1/b$h;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lry1/b$h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lry1/b$h;->invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    iget-object v0, p0, Lry1/b$h;->E:Ljava/lang/Object;

    check-cast v0, Lec3/m;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lry1/b$h;->z:I

    const/4 v3, 0x3

    const/4 v4, 0x1

    const/4 v5, 0x2

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-eq v2, v5, :cond_1

    if-ne v2, v3, :cond_0

    iget-object v0, p0, Lry1/b$h;->w:Ljava/lang/Object;

    check-cast v0, Ldj0/h;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance p1, Lry1/b$a$d;

    iget-object v2, p0, Lry1/b$h;->F:Lty1/j$c;

    invoke-virtual {v2}, Lty1/j$c;->a()Ljava/lang/String;

    move-result-object v2

    invoke-direct {p1, v2}, Lry1/b$a$d;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lry1/b$h;->E:Ljava/lang/Object;

    iput v4, p0, Lry1/b$h;->z:I

    invoke-interface {v0, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    goto :goto_2

    :cond_4
    :goto_0
    iget-object p1, p0, Lry1/b$h;->G:Lry1/b;

    invoke-static {p1}, Lry1/b;->c(Lry1/b;)J

    move-result-wide v6

    invoke-static {v6, v7, v5}, Lkotlin/time/Duration;->times-UwyO8pc(JI)J

    move-result-wide v9

    iget-object v12, p0, Lry1/b$h;->G:Lry1/b;

    iget-object v13, p0, Lry1/b$h;->F:Lty1/j$c;

    new-instance v8, Lry1/b$h$a;

    const/4 v11, 0x0

    invoke-direct/range {v8 .. v13}, Lry1/b$h$a;-><init>(JLq83/d;Lry1/b;Lty1/j$c;)V

    iput-object v0, p0, Lry1/b$h;->E:Ljava/lang/Object;

    iput-wide v9, p0, Lry1/b$h;->x:J

    const/4 p1, 0x0

    iput p1, p0, Lry1/b$h;->y:I

    iput v5, p0, Lry1/b$h;->z:I

    invoke-static {v8, p0}, Lbc3/f0;->m(Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    goto :goto_2

    :cond_5
    :goto_1
    check-cast p1, Ldj0/h;

    new-instance v2, Lry1/b$a$e;

    invoke-direct {v2, p1}, Lry1/b$a$e;-><init>(Ldj0/h;)V

    const/4 p1, 0x0

    iput-object p1, p0, Lry1/b$h;->E:Ljava/lang/Object;

    iput-object p1, p0, Lry1/b$h;->w:Ljava/lang/Object;

    iput v3, p0, Lry1/b$h;->z:I

    invoke-interface {v0, v2, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    :goto_2
    return-object v1

    :cond_6
    :goto_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
