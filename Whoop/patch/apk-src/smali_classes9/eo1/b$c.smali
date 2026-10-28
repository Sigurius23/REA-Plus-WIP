.class final Leo1/b$c;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Leo1/b;->h(Ljava/lang/String;)Lec3/l;
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
        "Lqp1/a;",
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
    c = "com.whoop.hormonalinsights.fertility.domain.FertilitySettingsInteractor$submitDisableSurveyFlow$1"
    f = "FertilitySettingsInteractor.kt"
    l = {
        0x35,
        0x36
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field private synthetic x:Ljava/lang/Object;

.field final synthetic y:Ljava/lang/String;

.field final synthetic z:Leo1/b;


# direct methods
.method public constructor <init>(Ljava/lang/String;Leo1/b;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Leo1/b;",
            "Lq83/d<",
            "-",
            "Leo1/b$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Leo1/b$c;->y:Ljava/lang/String;

    iput-object p2, p0, Leo1/b$c;->z:Leo1/b;

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

    new-instance v0, Leo1/b$c;

    iget-object v1, p0, Leo1/b$c;->y:Ljava/lang/String;

    iget-object v2, p0, Leo1/b$c;->z:Leo1/b;

    invoke-direct {v0, v1, v2, p2}, Leo1/b$c;-><init>(Ljava/lang/String;Leo1/b;Lq83/d;)V

    iput-object p1, v0, Leo1/b$c;->x:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Leo1/b$c;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Leo1/b$c;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Leo1/b$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Leo1/b$c;->invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    iget-object v0, p0, Leo1/b$c;->x:Ljava/lang/Object;

    check-cast v0, Lec3/m;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Leo1/b$c;->w:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v2, :cond_2

    if-eq v2, v4, :cond_1

    if-ne v2, v3, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v11, p0

    goto :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance p1, Lqp1/a$e;

    iget-object v2, p0, Leo1/b$c;->y:Ljava/lang/String;

    const-string v6, "PREGNANT"

    invoke-static {v2, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    invoke-direct {p1, v2}, Lqp1/a$e;-><init>(Z)V

    iput-object v5, p0, Leo1/b$c;->x:Ljava/lang/Object;

    iput v4, p0, Leo1/b$c;->w:I

    invoke-interface {v0, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    move-object v11, p0

    goto :goto_1

    :cond_3
    :goto_0
    sget-object v6, Lu02/a;->a:Lu02/a$a;

    iget-object p1, p0, Leo1/b$c;->z:Leo1/b;

    invoke-static {p1}, Leo1/b;->d(Leo1/b;)Ltr2/n;

    move-result-object v7

    new-instance v10, Leo1/b$c$a;

    iget-object p1, p0, Leo1/b$c;->z:Leo1/b;

    iget-object v0, p0, Leo1/b$c;->y:Ljava/lang/String;

    invoke-direct {v10, p1, v0, v5}, Leo1/b$c$a;-><init>(Leo1/b;Ljava/lang/String;Lq83/d;)V

    iput-object v5, p0, Leo1/b$c;->x:Ljava/lang/Object;

    iput v3, p0, Leo1/b$c;->w:I

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v12, 0x6

    const/4 v13, 0x0

    move-object v11, p0

    invoke-static/range {v6 .. v13}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    :goto_1
    return-object v1

    :cond_4
    :goto_2
    check-cast p1, Lu02/a;

    instance-of p1, p1, Lu02/a$b;

    if-eqz p1, :cond_5

    iget-object p1, v11, Leo1/b$c;->z:Leo1/b;

    invoke-static {p1}, Leo1/b;->d(Leo1/b;)Ltr2/n;

    move-result-object p1

    const/4 v0, 0x0

    new-array v0, v0, [Lqr2/a$a;

    const-string v1, "Failed to submit disable fertility survey"

    invoke-interface {p1, v1, v0}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    :cond_5
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
