.class public final Lj12/b$d;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lj12/b;->j(Lec3/l;)Lec3/l;
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
    c = "com.whoop.onboarding.overlay.OnboardingOverlayInteractor$interact$$inlined$flatMapLatest$1"
    f = "OnboardingOverlayInteractor.kt"
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

.field final synthetic z:Lj12/b;


# direct methods
.method public constructor <init>(Lq83/d;Lj12/b;)V
    .locals 0

    iput-object p2, p0, Lj12/b$d;->z:Lj12/b;

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
            "Lk12/a;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance v0, Lj12/b$d;

    iget-object v1, p0, Lj12/b$d;->z:Lj12/b;

    invoke-direct {v0, p3, v1}, Lj12/b$d;-><init>(Lq83/d;Lj12/b;)V

    iput-object p1, v0, Lj12/b$d;->x:Ljava/lang/Object;

    iput-object p2, v0, Lj12/b$d;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lj12/b$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lj12/b$d;->invoke(Lec3/m;Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lj12/b$d;->w:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lj12/b$d;->x:Ljava/lang/Object;

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

    iget-object p1, p0, Lj12/b$d;->x:Ljava/lang/Object;

    check-cast p1, Lec3/m;

    iget-object v1, p0, Lj12/b$d;->y:Ljava/lang/Object;

    check-cast v1, Lk12/a;

    sget-object v3, Lk12/a$c;->a:Lk12/a$c;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_2

    sget-object v1, Lj12/b$a$c;->a:Lj12/b$a$c;

    new-instance v3, La6/u;

    const/4 v5, 0x1

    invoke-direct {v3, v1, v5}, La6/u;-><init>(Ljava/lang/Object;I)V

    goto :goto_0

    :cond_2
    sget-object v3, Lk12/a$a;->a:Lk12/a$a;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    sget-object v1, Lj12/b$a$b;->a:Lj12/b$a$b;

    new-instance v3, La6/u;

    const/4 v5, 0x1

    invoke-direct {v3, v1, v5}, La6/u;-><init>(Ljava/lang/Object;I)V

    goto :goto_0

    :cond_3
    instance-of v3, v1, Lk12/a$b;

    if-eqz v3, :cond_5

    iget-object v3, p0, Lj12/b$d;->z:Lj12/b;

    move-object v5, v1

    check-cast v5, Lk12/a$b;

    invoke-virtual {v5}, Lk12/a$b;->a()Ljava/lang/String;

    move-result-object v5

    invoke-static {v3, v5}, Lj12/b;->a(Lj12/b;Ljava/lang/String;)Lec3/l;

    move-result-object v3

    new-instance v5, Lj12/b$f;

    iget-object v6, p0, Lj12/b$d;->z:Lj12/b;

    invoke-direct {v5, v4, v6, v1}, Lj12/b$f;-><init>(Lq83/d;Lj12/b;Lk12/a;)V

    invoke-static {v3, v5}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object v3

    :goto_0
    iput-object v4, p0, Lj12/b$d;->x:Ljava/lang/Object;

    iput-object v4, p0, Lj12/b$d;->y:Ljava/lang/Object;

    iput v2, p0, Lj12/b$d;->w:I

    invoke-static {p1, v3, p0}, Lec3/v;->w(Lec3/m;Lec3/l;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    return-object v0

    :cond_4
    :goto_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_5
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
