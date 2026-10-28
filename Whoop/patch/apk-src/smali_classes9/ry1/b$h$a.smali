.class public final Lry1/b$h$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lry1/b$h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
    c = "com.whoop.mfa.challenge.domain.MfaChallengeInteractor$submit$1$invokeSuspend$$inlined$withMinimumDelayOf-KLykuaI$1"
    f = "MfaChallengeInteractor.kt"
    l = {
        0x2f,
        0x33,
        0x27
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:J

.field final synthetic F:Lry1/b;

.field final synthetic G:Lty1/j$c;

.field H:Ljava/lang/Object;

.field I:Ljava/lang/Object;

.field J:I

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:I

.field private synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(JLq83/d;Lry1/b;Lty1/j$c;)V
    .locals 0

    iput-wide p1, p0, Lry1/b$h$a;->E:J

    iput-object p4, p0, Lry1/b$h$a;->F:Lry1/b;

    iput-object p5, p0, Lry1/b$h$a;->G:Lty1/j$c;

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

    new-instance v0, Lry1/b$h$a;

    iget-wide v1, p0, Lry1/b$h$a;->E:J

    iget-object v4, p0, Lry1/b$h$a;->F:Lry1/b;

    iget-object v5, p0, Lry1/b$h$a;->G:Lty1/j$c;

    move-object v3, p2

    invoke-direct/range {v0 .. v5}, Lry1/b$h$a;-><init>(JLq83/d;Lry1/b;Lty1/j$c;)V

    iput-object p1, v0, Lry1/b$h$a;->z:Ljava/lang/Object;

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
            "Ldj0/h;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lry1/b$h$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lry1/b$h$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lry1/b$h$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lry1/b$h$a;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    iget-object v0, p0, Lry1/b$h$a;->z:Ljava/lang/Object;

    check-cast v0, Lbc3/c0;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lry1/b$h$a;->y:I

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz v2, :cond_2

    if-eq v2, v5, :cond_1

    if-eq v2, v4, :cond_1

    if-ne v2, v3, :cond_0

    iget-object v0, p0, Lry1/b$h$a;->x:Ljava/lang/Object;

    iget-object v1, p0, Lry1/b$h$a;->w:Ljava/lang/Object;

    check-cast v1, Lbc3/i0;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object v0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v0, p0, Lry1/b$h$a;->I:Ljava/lang/Object;

    check-cast v0, Ldj0/u;

    iget-object v0, p0, Lry1/b$h$a;->H:Ljava/lang/Object;

    check-cast v0, Lbc3/c0;

    iget-object v0, p0, Lry1/b$h$a;->x:Ljava/lang/Object;

    check-cast v0, Lq83/d;

    iget-object v0, p0, Lry1/b$h$a;->w:Ljava/lang/Object;

    check-cast v0, Lbc3/i0;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_0

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance p1, Lry1/b$h$a$a;

    iget-wide v7, p0, Lry1/b$h$a;->E:J

    invoke-direct {p1, v7, v8, v6}, Lry1/b$h$a$a;-><init>(JLq83/d;)V

    invoke-static {v0, v6, p1, v3}, Lbc3/f0;->e(Lbc3/c0;Lq83/j;Lc93/m;I)Lbc3/j0;

    move-result-object v0

    iget-object p1, p0, Lry1/b$h$a;->F:Lry1/b;

    invoke-static {p1}, Lry1/b;->e(Lry1/b;)Ldj0/v;

    move-result-object p1

    invoke-virtual {p1}, Ldj0/v;->a()Lec3/p1;

    move-result-object p1

    check-cast p1, Lec3/h2;

    invoke-virtual {p1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ldj0/u;

    instance-of v2, p1, Ldj0/u$b;

    const/4 v7, 0x0

    if-eqz v2, :cond_3

    iget-object p1, p0, Lry1/b$h$a;->F:Lry1/b;

    invoke-static {p1}, Lry1/b;->d(Lry1/b;)Ltr2/n;

    move-result-object p1

    const-string v2, "Completing sign-in MFA challenge"

    new-array v4, v7, [Lqr2/a$a;

    invoke-interface {p1, v2, v4}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object p1, p0, Lry1/b$h$a;->F:Lry1/b;

    invoke-static {p1}, Lry1/b;->b(Lry1/b;)Ldj0/b;

    move-result-object p1

    iget-object v2, p0, Lry1/b$h$a;->G:Lty1/j$c;

    invoke-virtual {v2}, Lty1/j$c;->a()Ljava/lang/String;

    move-result-object v2

    iput-object v6, p0, Lry1/b$h$a;->z:Ljava/lang/Object;

    iput-object v0, p0, Lry1/b$h$a;->w:Ljava/lang/Object;

    iput-object v6, p0, Lry1/b$h$a;->x:Ljava/lang/Object;

    iput-object v6, p0, Lry1/b$h$a;->H:Ljava/lang/Object;

    iput-object v6, p0, Lry1/b$h$a;->I:Ljava/lang/Object;

    iput v7, p0, Lry1/b$h$a;->J:I

    iput v5, p0, Lry1/b$h$a;->y:I

    invoke-virtual {p1, v2, p0}, Ldj0/b;->t(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    goto :goto_1

    :cond_3
    instance-of v2, p1, Ldj0/u$a;

    if-eqz v2, :cond_4

    iget-object v2, p0, Lry1/b$h$a;->F:Lry1/b;

    invoke-static {v2}, Lry1/b;->d(Lry1/b;)Ltr2/n;

    move-result-object v2

    const-string v5, "Completing setup MFA verification"

    new-array v8, v7, [Lqr2/a$a;

    invoke-interface {v2, v5, v8}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object v2, p0, Lry1/b$h$a;->F:Lry1/b;

    iget-object v5, p0, Lry1/b$h$a;->G:Lty1/j$c;

    invoke-virtual {v5}, Lty1/j$c;->a()Ljava/lang/String;

    move-result-object v5

    check-cast p1, Ldj0/u$a;

    iput-object v6, p0, Lry1/b$h$a;->z:Ljava/lang/Object;

    iput-object v0, p0, Lry1/b$h$a;->w:Ljava/lang/Object;

    iput-object v6, p0, Lry1/b$h$a;->x:Ljava/lang/Object;

    iput-object v6, p0, Lry1/b$h$a;->H:Ljava/lang/Object;

    iput-object v6, p0, Lry1/b$h$a;->I:Ljava/lang/Object;

    iput v7, p0, Lry1/b$h$a;->J:I

    iput v4, p0, Lry1/b$h$a;->y:I

    invoke-static {v2, v5, p1, p0}, Lry1/b;->i(Lry1/b;Ljava/lang/String;Ldj0/u$a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    goto :goto_1

    :cond_4
    if-nez p1, :cond_7

    iget-object p1, p0, Lry1/b$h$a;->F:Lry1/b;

    invoke-static {p1}, Lry1/b;->d(Lry1/b;)Ltr2/n;

    move-result-object p1

    const-string v2, "No challenge data available for submission"

    new-array v4, v7, [Lqr2/a$a;

    invoke-interface {p1, v2, v4}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    new-instance p1, Ldj0/f$c;

    new-instance v2, Ljava/lang/IllegalStateException;

    const-string v4, "No challenge data"

    invoke-direct {v2, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    const-string v4, "NoChallengeData"

    const/4 v5, -0x1

    invoke-direct {p1, v2, v4, v5}, Ldj0/f$c;-><init>(Ljava/lang/Exception;Ljava/lang/String;I)V

    :cond_5
    :goto_0
    iput-object v6, p0, Lry1/b$h$a;->z:Ljava/lang/Object;

    iput-object v6, p0, Lry1/b$h$a;->w:Ljava/lang/Object;

    iput-object p1, p0, Lry1/b$h$a;->x:Ljava/lang/Object;

    iput-object v6, p0, Lry1/b$h$a;->H:Ljava/lang/Object;

    iput-object v6, p0, Lry1/b$h$a;->I:Ljava/lang/Object;

    iput v3, p0, Lry1/b$h$a;->y:I

    invoke-interface {v0, p0}, Lbc3/i0;->await(Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_6

    :goto_1
    return-object v1

    :cond_6
    return-object p1

    :cond_7
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
