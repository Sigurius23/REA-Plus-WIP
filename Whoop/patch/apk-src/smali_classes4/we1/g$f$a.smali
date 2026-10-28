.class final Lwe1/g$f$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lwe1/g$f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lbc3/c0;",
        "Lcom/whoop/entitlements/EntitlementsResponse;",
        "<anonymous>",
        "(Lbc3/c0;)Lcom/whoop/entitlements/EntitlementsResponse;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.entitlements.EntitlementsRepository$update$2$entitlements$1"
    f = "EntitlementsRepository.kt"
    l = {
        0x4b,
        0x51
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field final synthetic x:Lwe1/g;

.field final synthetic y:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lwe1/g;Ljava/lang/String;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwe1/g;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lwe1/g$f$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lwe1/g$f$a;->x:Lwe1/g;

    iput-object p2, p0, Lwe1/g$f$a;->y:Ljava/lang/String;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

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

    new-instance p1, Lwe1/g$f$a;

    iget-object v0, p0, Lwe1/g$f$a;->x:Lwe1/g;

    iget-object v1, p0, Lwe1/g$f$a;->y:Ljava/lang/String;

    invoke-direct {p1, v0, v1, p2}, Lwe1/g$f$a;-><init>(Lwe1/g;Ljava/lang/String;Lq83/d;)V

    return-object p1
.end method

.method public final invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc3/c0;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/entitlements/EntitlementsResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lwe1/g$f$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lwe1/g$f$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lwe1/g$f$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lwe1/g$f$a;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lwe1/g$f$a;->w:I

    const/4 v2, 0x0

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v4, :cond_1

    if-ne v1, v3, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v9, p0

    goto :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v9, p0

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move p1, v4

    sget-object v4, Lu02/a;->a:Lu02/a$a;

    iget-object v1, p0, Lwe1/g$f$a;->x:Lwe1/g;

    invoke-static {v1}, Lwe1/g;->g(Lwe1/g;)Ltr2/n;

    move-result-object v5

    new-instance v8, Lwe1/g$f$a$a;

    iget-object v1, p0, Lwe1/g$f$a;->y:Ljava/lang/String;

    iget-object v6, p0, Lwe1/g$f$a;->x:Lwe1/g;

    invoke-direct {v8, v1, v6, v2}, Lwe1/g$f$a$a;-><init>(Ljava/lang/String;Lwe1/g;Lq83/d;)V

    iput p1, p0, Lwe1/g$f$a;->w:I

    const/4 v6, 0x0

    const-string v7, "failed to fetch entitlements, falling back to cached copy"

    move-object v9, p0

    invoke-virtual/range {v4 .. v9}, Lu02/a$a;->a(Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    goto :goto_1

    :cond_3
    :goto_0
    check-cast p1, Lu02/a;

    new-instance v1, Lwe1/g$f$a$b;

    iget-object v4, v9, Lwe1/g$f$a;->x:Lwe1/g;

    iget-object v5, v9, Lwe1/g$f$a;->y:Ljava/lang/String;

    invoke-direct {v1, v4, v5, v2}, Lwe1/g$f$a$b;-><init>(Lwe1/g;Ljava/lang/String;Lq83/d;)V

    iput v3, v9, Lwe1/g$f$a;->w:I

    invoke-static {p1, v1, p0}, Lu02/b;->f(Lu02/a;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    :goto_1
    return-object v0

    :cond_4
    :goto_2
    check-cast p1, Lu02/a;

    invoke-static {p1}, Lu02/b;->b(Lu02/a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
