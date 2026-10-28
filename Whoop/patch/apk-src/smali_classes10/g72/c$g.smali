.class final Lg72/c$g;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lg72/c;->interact(Lec3/l;)Lec3/l;
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
        "Lg72/d;",
        "accumulation",
        "Lg72/a;",
        "domainAction",
        "<anonymous>",
        "(Lg72/d;Lg72/a;)Lg72/d;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.sage.onboarding.domain.SageOnboardingInteractor$interact$1"
    f = "SageOnboardingInteractor.kt"
    l = {
        0x22
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Lg72/c;


# direct methods
.method public constructor <init>(Lg72/c;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lg72/c;",
            "Lq83/d<",
            "-",
            "Lg72/c$g;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lg72/c$g;->z:Lg72/c;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Lg72/d;Lg72/a;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lg72/d;",
            "Lg72/a;",
            "Lq83/d<",
            "-",
            "Lg72/d;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lg72/c$g;

    iget-object v1, p0, Lg72/c$g;->z:Lg72/c;

    invoke-direct {v0, v1, p3}, Lg72/c$g;-><init>(Lg72/c;Lq83/d;)V

    iput-object p1, v0, Lg72/c$g;->x:Ljava/lang/Object;

    iput-object p2, v0, Lg72/c$g;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lg72/c$g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lg72/d;

    check-cast p2, Lg72/a;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lg72/c$g;->f(Lg72/d;Lg72/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    iget-object v0, p0, Lg72/c$g;->x:Ljava/lang/Object;

    check-cast v0, Lg72/d;

    iget-object v1, p0, Lg72/c$g;->y:Ljava/lang/Object;

    check-cast v1, Lg72/a;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, p0, Lg72/c$g;->w:I

    const/4 v4, 0x1

    if-eqz v3, :cond_1

    if-ne v3, v4, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    instance-of p1, v1, Lg72/a$c;

    if-eqz p1, :cond_3

    iget-object p1, p0, Lg72/c$g;->z:Lg72/c;

    check-cast v1, Lg72/a$c;

    invoke-virtual {v1}, Lg72/a$c;->a()Z

    move-result v1

    iput-object v0, p0, Lg72/c$g;->x:Ljava/lang/Object;

    const/4 v3, 0x0

    iput-object v3, p0, Lg72/c$g;->y:Ljava/lang/Object;

    iput v4, p0, Lg72/c$g;->w:I

    invoke-static {p1, v1, p0}, Lg72/c;->c(Lg72/c;ZLq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_2

    return-object v2

    :cond_2
    :goto_0
    check-cast p1, Lg72/b;

    goto :goto_1

    :cond_3
    instance-of p1, v1, Lg72/a$b;

    if-eqz p1, :cond_4

    iget-object p1, p0, Lg72/c$g;->z:Lg72/c;

    check-cast v1, Lg72/a$b;

    invoke-virtual {v0}, Lg72/d;->a()Lg72/b;

    move-result-object v2

    invoke-static {p1, v1, v2}, Lg72/c;->g(Lg72/c;Lg72/a$b;Lg72/b;)Lg72/b;

    move-result-object p1

    goto :goto_1

    :cond_4
    instance-of p1, v1, Lg72/a$a;

    if-eqz p1, :cond_5

    iget-object p1, p0, Lg72/c$g;->z:Lg72/c;

    invoke-virtual {v0}, Lg72/d;->a()Lg72/b;

    move-result-object v1

    invoke-static {p1, v1}, Lg72/c;->f(Lg72/c;Lg72/b;)Lg72/b;

    move-result-object p1

    goto :goto_1

    :cond_5
    instance-of p1, v1, Lg72/a$d;

    if-eqz p1, :cond_8

    invoke-virtual {v0}, Lg72/d;->b()Lg72/b$g;

    move-result-object v2

    if-eqz v2, :cond_6

    check-cast v1, Lg72/a$d;

    invoke-virtual {v1}, Lg72/a$d;->b()Lg72/f;

    move-result-object v5

    invoke-virtual {v1}, Lg72/a$d;->a()Lg72/e;

    move-result-object v4

    const/16 v7, 0x9

    const/4 v8, 0x0

    const/4 v3, 0x0

    const/4 v6, 0x0

    invoke-static/range {v2 .. v8}, Lg72/b$g;->b(Lg72/b$g;Lcom/whoop/sage/onboarding/domain/models/SageOnboardingResponse;Lg72/e;Lg72/f;ZILjava/lang/Object;)Lg72/b$g;

    move-result-object p1

    if-eqz p1, :cond_6

    goto :goto_1

    :cond_6
    invoke-virtual {v0}, Lg72/d;->a()Lg72/b;

    move-result-object p1

    :goto_1
    new-instance v1, Lg72/d;

    instance-of v2, p1, Lg72/b$g;

    if-eqz v2, :cond_7

    move-object v0, p1

    check-cast v0, Lg72/b$g;

    goto :goto_2

    :cond_7
    invoke-virtual {v0}, Lg72/d;->b()Lg72/b$g;

    move-result-object v0

    :goto_2
    invoke-direct {v1, p1, v0}, Lg72/d;-><init>(Lg72/b;Lg72/b$g;)V

    return-object v1

    :cond_8
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
