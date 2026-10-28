.class final Lde2/a$b$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lde2/a$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
    c = "com.whoop.shepherd.feature.terms.domain.ShepherdSubmitTermsOfUseInteractor$interact$1$1$1"
    f = "ShepherdSubmitTermsOfUseInteractor.kt"
    l = {
        0x21,
        0x23,
        0x25,
        0x2e,
        0x2f
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lec3/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/m;"
        }
    .end annotation
.end field

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:I

.field final synthetic z:Lde2/a;


# direct methods
.method public constructor <init>(Lde2/a;Lec3/m;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lde2/a;",
            "Lec3/m;",
            "Lq83/d<",
            "-",
            "Lde2/a$b$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lde2/a$b$a;->z:Lde2/a;

    iput-object p2, p0, Lde2/a$b$a;->E:Lec3/m;

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

    new-instance p1, Lde2/a$b$a;

    iget-object v0, p0, Lde2/a$b$a;->z:Lde2/a;

    iget-object v1, p0, Lde2/a$b$a;->E:Lec3/m;

    invoke-direct {p1, v0, v1, p2}, Lde2/a$b$a;-><init>(Lde2/a;Lec3/m;Lq83/d;)V

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
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lde2/a$b$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lde2/a$b$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lde2/a$b$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lde2/a$b$a;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lde2/a$b$a;->y:I

    const/4 v2, 0x5

    const/4 v3, 0x4

    const/4 v4, 0x3

    const/4 v5, 0x2

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-eqz v1, :cond_5

    if-eq v1, v6, :cond_2

    if-eq v1, v5, :cond_4

    if-eq v1, v4, :cond_3

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    iget-object v0, p0, Lde2/a$b$a;->x:Ljava/lang/Object;

    check-cast v0, Lu02/a;

    :cond_2
    iget-object v0, p0, Lde2/a$b$a;->w:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/shepherd/feature/terms/domain/models/ShepherdTermsOfUseRequest;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    iget-object v1, p0, Lde2/a$b$a;->w:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/shepherd/feature/terms/domain/models/ShepherdTermsOfUseRequest;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v13, p0

    goto/16 :goto_3

    :cond_4
    iget-object v1, p0, Lde2/a$b$a;->w:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/shepherd/feature/terms/domain/models/ShepherdTermsOfUseRequest;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v13, p0

    goto :goto_2

    :cond_5
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lde2/a$b$a;->z:Lde2/a;

    invoke-static {p1}, Lde2/a;->c(Lde2/a;)Lde2/e;

    move-result-object p1

    invoke-virtual {p1}, Lde2/e;->a()Lcom/whoop/shepherd/feature/terms/domain/models/ShepherdTermsOfUseRequest;

    move-result-object p1

    if-nez p1, :cond_7

    iget-object p1, p0, Lde2/a$b$a;->E:Lec3/m;

    new-instance v1, Lge2/c$a;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lge2/c$a;-><init>(Z)V

    iput-object v7, p0, Lde2/a$b$a;->w:Ljava/lang/Object;

    iput v6, p0, Lde2/a$b$a;->y:I

    invoke-interface {p1, v1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_6

    move-object v13, p0

    goto :goto_4

    :cond_6
    :goto_1
    move-object v13, p0

    goto :goto_5

    :cond_7
    sget-object v8, Lu02/a;->a:Lu02/a$a;

    iget-object v1, p0, Lde2/a$b$a;->z:Lde2/a;

    invoke-static {v1}, Lde2/a;->b(Lde2/a;)Ltr2/n;

    move-result-object v9

    new-instance v12, Lde2/a$b$a$a;

    iget-object v1, p0, Lde2/a$b$a;->z:Lde2/a;

    invoke-direct {v12, v1, p1, v7}, Lde2/a$b$a$a;-><init>(Lde2/a;Lcom/whoop/shepherd/feature/terms/domain/models/ShepherdTermsOfUseRequest;Lq83/d;)V

    iput-object v7, p0, Lde2/a$b$a;->w:Ljava/lang/Object;

    iput v5, p0, Lde2/a$b$a;->y:I

    const/4 v10, 0x0

    const-string v11, "Failed to submit ANF terms of use"

    move-object v13, p0

    invoke-virtual/range {v8 .. v13}, Lu02/a$a;->a(Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_8

    goto :goto_4

    :cond_8
    :goto_2
    move-object v8, p1

    check-cast v8, Lu02/a;

    iget-object p1, v13, Lde2/a$b$a;->z:Lde2/a;

    invoke-static {p1}, Lde2/a;->b(Lde2/a;)Ltr2/n;

    move-result-object v9

    new-instance v12, Lde2/a$b$a$b;

    iget-object p1, v13, Lde2/a$b$a;->z:Lde2/a;

    invoke-direct {v12, p1, v7}, Lde2/a$b$a$b;-><init>(Lde2/a;Lq83/d;)V

    iput-object v7, v13, Lde2/a$b$a;->w:Ljava/lang/Object;

    iput v4, v13, Lde2/a$b$a;->y:I

    const/4 v10, 0x0

    const-string v11, "Failed to update arrhythmia settings"

    invoke-static/range {v8 .. v13}, Lu02/b;->a(Lu02/a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_9

    goto :goto_4

    :cond_9
    :goto_3
    check-cast p1, Lu02/a;

    instance-of p1, p1, Lu02/a$c;

    if-eqz p1, :cond_a

    iget-object p1, v13, Lde2/a$b$a;->E:Lec3/m;

    sget-object v1, Lge2/c$c;->a:Lge2/c$c;

    iput-object v7, v13, Lde2/a$b$a;->w:Ljava/lang/Object;

    iput-object v7, v13, Lde2/a$b$a;->x:Ljava/lang/Object;

    iput v3, v13, Lde2/a$b$a;->y:I

    invoke-interface {p1, v1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_b

    goto :goto_4

    :cond_a
    iget-object p1, v13, Lde2/a$b$a;->E:Lec3/m;

    new-instance v1, Lge2/c$a;

    invoke-direct {v1, v6}, Lge2/c$a;-><init>(Z)V

    iput-object v7, v13, Lde2/a$b$a;->w:Ljava/lang/Object;

    iput-object v7, v13, Lde2/a$b$a;->x:Ljava/lang/Object;

    iput v2, v13, Lde2/a$b$a;->y:I

    invoke-interface {p1, v1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_b

    :goto_4
    return-object v0

    :cond_b
    :goto_5
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
