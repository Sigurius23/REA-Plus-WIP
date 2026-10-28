.class final Lfm0/c$b;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfm0/c;->f()Lec3/l;
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
        "Lfm0/a;",
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
    c = "com.whoop.bottomnavigation.domain.BottomNavInteractor$coachContextActions$1$1"
    f = "BottomNavInteractor.kt"
    l = {
        0x39,
        0x3d
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:Ljava/lang/Object;

.field x:I

.field final synthetic y:Lfm0/c;


# direct methods
.method public constructor <init>(Lfm0/c;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfm0/c;",
            "Lq83/d<",
            "-",
            "Lfm0/c$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lfm0/c$b;->y:Lfm0/c;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 1
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

    new-instance p1, Lfm0/c$b;

    iget-object v0, p0, Lfm0/c$b;->y:Lfm0/c;

    invoke-direct {p1, v0, p2}, Lfm0/c$b;-><init>(Lfm0/c;Lq83/d;)V

    return-object p1
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
    invoke-virtual {p0, p1, p2}, Lfm0/c$b;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lfm0/c$b;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lfm0/c$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lfm0/c$b;->invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lfm0/c$b;->x:I

    const/4 v2, 0x0

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v4, :cond_1

    if-ne v1, v3, :cond_0

    iget-object v0, p0, Lfm0/c$b;->w:Ljava/lang/Object;

    check-cast v0, Lu02/a;

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

    iget-object v1, p0, Lfm0/c$b;->y:Lfm0/c;

    invoke-static {v1}, Lfm0/c;->d(Lfm0/c;)Ltr2/n;

    move-result-object v5

    new-instance v8, Lfm0/c$b$a;

    iget-object v1, p0, Lfm0/c$b;->y:Lfm0/c;

    invoke-direct {v8, v1, v2}, Lfm0/c$b$a;-><init>(Lfm0/c;Lq83/d;)V

    iput p1, p0, Lfm0/c$b;->x:I

    const/4 v6, 0x0

    const-string v7, "failed to fetch bottom nav coach config"

    const/4 v10, 0x2

    const/4 v11, 0x0

    move-object v9, p0

    invoke-static/range {v4 .. v11}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    goto :goto_1

    :cond_3
    :goto_0
    check-cast p1, Lu02/a;

    instance-of v1, p1, Lu02/a$c;

    if-eqz v1, :cond_4

    iget-object v1, v9, Lfm0/c$b;->y:Lfm0/c;

    invoke-static {v1}, Lfm0/c;->c(Lfm0/c;)Ldp0/g;

    move-result-object v1

    iget-object v4, v9, Lfm0/c$b;->y:Lfm0/c;

    check-cast p1, Lu02/a$c;

    invoke-virtual {p1}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/bottomnavigation/domain/models/BottomNavCoachConfig;

    invoke-static {v4, p1}, Lfm0/c;->e(Lfm0/c;Lcom/whoop/bottomnavigation/domain/models/BottomNavCoachConfig;)Lcom/whoop/coacheverywherecommon/models/AiContextMetadataBottomRow;

    move-result-object p1

    iput-object v2, v9, Lfm0/c$b;->w:Ljava/lang/Object;

    iput v3, v9, Lfm0/c$b;->x:I

    invoke-interface {v1, p1, p0}, Ldp0/g;->q(Lcom/whoop/coacheverywherecommon/models/AiContextMetadataBottomRow;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    :goto_1
    return-object v0

    :cond_4
    :goto_2
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
