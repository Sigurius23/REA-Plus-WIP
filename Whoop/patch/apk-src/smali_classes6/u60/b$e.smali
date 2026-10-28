.class final Lu60/b$e;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lu60/b;-><init>(Lr60/d;Lv60/a;Lgv1/c;Lgv1/d;Lbc3/c0;)V
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
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "Lr60/c;",
        "domainResult",
        "Lgv1/h;",
        "config",
        "Lu60/c;",
        "<anonymous>",
        "(Lr60/c;Lgv1/h;)Lu60/c;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.achievements.presentation.AchievementsViewModel$viewState$1"
    f = "AchievementsViewModel.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Lu60/b;


# direct methods
.method public constructor <init>(Lu60/b;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lu60/b;",
            "Lq83/d<",
            "-",
            "Lu60/b$e;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lu60/b$e;->z:Lu60/b;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Lr60/c;Lgv1/h;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lr60/c;",
            "Lgv1/h;",
            "Lq83/d<",
            "-",
            "Lu60/c;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lu60/b$e;

    iget-object v1, p0, Lu60/b$e;->z:Lu60/b;

    invoke-direct {v0, v1, p3}, Lu60/b$e;-><init>(Lu60/b;Lq83/d;)V

    iput-object p1, v0, Lu60/b$e;->x:Ljava/lang/Object;

    iput-object p2, v0, Lu60/b$e;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lu60/b$e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lr60/c;

    check-cast p2, Lgv1/h;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lu60/b$e;->f(Lr60/c;Lgv1/h;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lu60/b$e;->x:Ljava/lang/Object;

    check-cast v0, Lr60/c;

    iget-object v1, p0, Lu60/b$e;->y:Ljava/lang/Object;

    check-cast v1, Lgv1/h;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lu60/b$e;->w:I

    if-nez v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lu60/b$e;->z:Lu60/b;

    invoke-static {p1}, Lu60/b;->j(Lu60/b;)Lv60/a;

    move-result-object p1

    invoke-virtual {p1, v0, v1}, Lv60/a;->b(Lr60/c;Lgv1/h;)Lu60/c;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
