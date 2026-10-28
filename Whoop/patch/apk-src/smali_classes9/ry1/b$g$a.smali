.class public final Lry1/b$g$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lry1/b$g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
        "\u0000\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\u0008\u0000\u0010\u0000*\u00020\u0001H\n"
    }
    d2 = {
        "T",
        "Lbc3/c0;",
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
    c = "com.whoop.mfa.challenge.domain.MfaChallengeInteractor$resend$3$invokeSuspend$$inlined$withMinimumDelayOf-KLykuaI$1"
    f = "MfaChallengeInteractor.kt"
    l = {
        0x2c,
        0x2d,
        0x2e,
        0x27
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:J

.field final synthetic F:Lry1/b;

.field final synthetic G:Lec3/m;

.field H:Ljava/lang/Object;

.field I:Ljava/lang/Object;

.field J:I

.field K:Z

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:I

.field private synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(JLq83/d;Lry1/b;Lec3/m;)V
    .locals 0

    iput-wide p1, p0, Lry1/b$g$a;->E:J

    iput-object p4, p0, Lry1/b$g$a;->F:Lry1/b;

    iput-object p5, p0, Lry1/b$g$a;->G:Lec3/m;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 6
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

    new-instance v0, Lry1/b$g$a;

    iget-wide v1, p0, Lry1/b$g$a;->E:J

    iget-object v4, p0, Lry1/b$g$a;->F:Lry1/b;

    iget-object v5, p0, Lry1/b$g$a;->G:Lec3/m;

    move-object v3, p2

    invoke-direct/range {v0 .. v5}, Lry1/b$g$a;-><init>(JLq83/d;Lry1/b;Lec3/m;)V

    iput-object p1, v0, Lry1/b$g$a;->z:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lry1/b$g$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lry1/b$g$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lry1/b$g$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lry1/b$g$a;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    iget-object v0, p0, Lry1/b$g$a;->z:Ljava/lang/Object;

    check-cast v0, Lbc3/c0;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lry1/b$g$a;->y:I

    const/4 v3, 0x4

    const/4 v4, 0x3

    const/4 v5, 0x2

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-eqz v2, :cond_5

    if-eq v2, v6, :cond_4

    if-eq v2, v5, :cond_2

    if-eq v2, v4, :cond_1

    if-ne v2, v3, :cond_0

    iget-object v0, p0, Lry1/b$g$a;->x:Ljava/lang/Object;

    check-cast v0, Ll83/a0;

    iget-object v1, p0, Lry1/b$g$a;->w:Ljava/lang/Object;

    check-cast v1, Lbc3/i0;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object v0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v0, p0, Lry1/b$g$a;->I:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v0, p0, Lry1/b$g$a;->H:Ljava/lang/Object;

    check-cast v0, Lbc3/c0;

    iget-object v0, p0, Lry1/b$g$a;->x:Ljava/lang/Object;

    check-cast v0, Lq83/d;

    iget-object v0, p0, Lry1/b$g$a;->w:Ljava/lang/Object;

    check-cast v0, Lbc3/i0;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_2
    iget v0, p0, Lry1/b$g$a;->J:I

    iget-object v2, p0, Lry1/b$g$a;->I:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    iget-object v2, p0, Lry1/b$g$a;->H:Ljava/lang/Object;

    check-cast v2, Lbc3/c0;

    iget-object v2, p0, Lry1/b$g$a;->x:Ljava/lang/Object;

    check-cast v2, Lq83/d;

    iget-object v2, p0, Lry1/b$g$a;->w:Ljava/lang/Object;

    check-cast v2, Lbc3/i0;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :cond_3
    move-object v10, v2

    move v2, v0

    move-object v0, v10

    goto :goto_2

    :cond_4
    iget v0, p0, Lry1/b$g$a;->J:I

    iget-object v2, p0, Lry1/b$g$a;->H:Ljava/lang/Object;

    check-cast v2, Lbc3/c0;

    iget-object v2, p0, Lry1/b$g$a;->x:Ljava/lang/Object;

    check-cast v2, Lq83/d;

    iget-object v2, p0, Lry1/b$g$a;->w:Ljava/lang/Object;

    check-cast v2, Lbc3/i0;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_5
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance p1, Lry1/b$g$a$a;

    iget-wide v8, p0, Lry1/b$g$a;->E:J

    invoke-direct {p1, v8, v9, v7}, Lry1/b$g$a$a;-><init>(JLq83/d;)V

    invoke-static {v0, v7, p1, v4}, Lbc3/f0;->e(Lbc3/c0;Lq83/j;Lc93/m;I)Lbc3/j0;

    move-result-object v2

    iget-object p1, p0, Lry1/b$g$a;->F:Lry1/b;

    invoke-static {p1}, Lry1/b;->a(Lry1/b;)Ly92/a;

    move-result-object p1

    iput-object v7, p0, Lry1/b$g$a;->z:Ljava/lang/Object;

    iput-object v2, p0, Lry1/b$g$a;->w:Ljava/lang/Object;

    iput-object v7, p0, Lry1/b$g$a;->x:Ljava/lang/Object;

    iput-object v7, p0, Lry1/b$g$a;->H:Ljava/lang/Object;

    const/4 v0, 0x0

    iput v0, p0, Lry1/b$g$a;->J:I

    iput v6, p0, Lry1/b$g$a;->y:I

    invoke-virtual {p1, p0}, Ly92/a;->a(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    goto :goto_4

    :cond_6
    :goto_0
    check-cast p1, Lcom/whoop/domain/model/AuthMaterial;

    if-eqz p1, :cond_7

    invoke-virtual {p1}, Lcom/whoop/domain/model/AuthMaterial;->getAccessToken()Ljava/lang/String;

    move-result-object p1

    goto :goto_1

    :cond_7
    move-object p1, v7

    :goto_1
    iget-object v6, p0, Lry1/b$g$a;->F:Lry1/b;

    invoke-static {v6}, Lry1/b;->b(Lry1/b;)Ldj0/b;

    move-result-object v6

    iput-object v7, p0, Lry1/b$g$a;->z:Ljava/lang/Object;

    iput-object v2, p0, Lry1/b$g$a;->w:Ljava/lang/Object;

    iput-object v7, p0, Lry1/b$g$a;->x:Ljava/lang/Object;

    iput-object v7, p0, Lry1/b$g$a;->H:Ljava/lang/Object;

    iput-object v7, p0, Lry1/b$g$a;->I:Ljava/lang/Object;

    iput v0, p0, Lry1/b$g$a;->J:I

    iput v5, p0, Lry1/b$g$a;->y:I

    invoke-virtual {v6, p1, p0}, Ldj0/b;->F(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    goto :goto_4

    :goto_2
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v5, p0, Lry1/b$g$a;->G:Lec3/m;

    new-instance v6, Lry1/b$a$b;

    invoke-direct {v6, p1}, Lry1/b$a$b;-><init>(Z)V

    iput-object v7, p0, Lry1/b$g$a;->z:Ljava/lang/Object;

    iput-object v0, p0, Lry1/b$g$a;->w:Ljava/lang/Object;

    iput-object v7, p0, Lry1/b$g$a;->x:Ljava/lang/Object;

    iput-object v7, p0, Lry1/b$g$a;->H:Ljava/lang/Object;

    iput-object v7, p0, Lry1/b$g$a;->I:Ljava/lang/Object;

    iput v2, p0, Lry1/b$g$a;->J:I

    iput-boolean p1, p0, Lry1/b$g$a;->K:Z

    iput v4, p0, Lry1/b$g$a;->y:I

    invoke-interface {v5, v6, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_8

    goto :goto_4

    :cond_8
    :goto_3
    iput-object v7, p0, Lry1/b$g$a;->z:Ljava/lang/Object;

    iput-object v7, p0, Lry1/b$g$a;->w:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    iput-object p1, p0, Lry1/b$g$a;->x:Ljava/lang/Object;

    iput-object v7, p0, Lry1/b$g$a;->H:Ljava/lang/Object;

    iput-object v7, p0, Lry1/b$g$a;->I:Ljava/lang/Object;

    iput v3, p0, Lry1/b$g$a;->y:I

    invoke-interface {v0, p0}, Lbc3/i0;->await(Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_9

    :goto_4
    return-object v1

    :cond_9
    return-object p1
.end method
