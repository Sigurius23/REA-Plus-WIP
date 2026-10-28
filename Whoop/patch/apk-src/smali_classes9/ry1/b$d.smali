.class public final Lry1/b$d;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lry1/b;->A(Lec3/l;)Lec3/l;
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
    c = "com.whoop.mfa.challenge.domain.MfaChallengeInteractor$interact$$inlined$flatMapLatest$1"
    f = "MfaChallengeInteractor.kt"
    l = {
        0xbd
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field private synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Lry1/b;


# direct methods
.method public constructor <init>(Lq83/d;Lry1/b;)V
    .locals 0

    iput-object p2, p0, Lry1/b$d;->z:Lry1/b;

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
            "Lty1/j;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance v0, Lry1/b$d;

    iget-object v1, p0, Lry1/b$d;->z:Lry1/b;

    invoke-direct {v0, p3, v1}, Lry1/b$d;-><init>(Lq83/d;Lry1/b;)V

    iput-object p1, v0, Lry1/b$d;->x:Ljava/lang/Object;

    iput-object p2, v0, Lry1/b$d;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lry1/b$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lry1/b$d;->invoke(Lec3/m;Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lry1/b$d;->w:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lry1/b$d;->x:Ljava/lang/Object;

    check-cast v0, Lec3/m;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lry1/b$d;->x:Ljava/lang/Object;

    check-cast p1, Lec3/m;

    iget-object v1, p0, Lry1/b$d;->y:Ljava/lang/Object;

    check-cast v1, Lty1/j;

    instance-of v3, v1, Lty1/j$c;

    if-eqz v3, :cond_2

    iget-object v3, p0, Lry1/b$d;->z:Lry1/b;

    check-cast v1, Lty1/j$c;

    invoke-static {v3, v1}, Lry1/b;->o(Lry1/b;Lty1/j$c;)Lec3/l;

    move-result-object v1

    goto :goto_0

    :cond_2
    instance-of v3, v1, Lty1/j$d;

    if-eqz v3, :cond_3

    iget-object v3, p0, Lry1/b$d;->z:Lry1/b;

    check-cast v1, Lty1/j$d;

    invoke-virtual {v1}, Lty1/j$d;->a()Ljava/time/Instant;

    move-result-object v4

    invoke-virtual {v1}, Lty1/j$d;->b()Ljava/lang/String;

    move-result-object v1

    invoke-static {v3, v4, v1}, Lry1/b;->n(Lry1/b;Ljava/time/Instant;Ljava/lang/String;)Lec3/l;

    move-result-object v1

    goto :goto_0

    :cond_3
    new-instance v3, Lry1/b$a$a;

    invoke-direct {v3, v1}, Lry1/b$a$a;-><init>(Lty1/j;)V

    new-instance v1, La6/u;

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, La6/u;-><init>(Ljava/lang/Object;I)V

    :goto_0
    const/4 v3, 0x0

    iput-object v3, p0, Lry1/b$d;->x:Ljava/lang/Object;

    iput-object v3, p0, Lry1/b$d;->y:Ljava/lang/Object;

    iput v2, p0, Lry1/b$d;->w:I

    invoke-static {p1, v1, p0}, Lec3/v;->w(Lec3/m;Lec3/l;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    return-object v0

    :cond_4
    :goto_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
