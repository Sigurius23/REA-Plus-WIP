.class final Lf92/a$b;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lf92/a;-><init>(Ltr2/n;Landroid/content/Context;Lq92/h;ZLbc3/c0;Lcom/whoop/data/repositories/FeatureFlagChecker;Lec3/l;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lc93/n;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u000c\u0010\u0004\u001a\u0008\u0018\u00010\u0002R\u00020\u00032\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\n\u00a2\u0006\u0004\u0008\u0007\u0010\u0008"
    }
    d2 = {
        "Lst0/f;",
        "state",
        "Lcom/whoop/service/rearchitect/BleWhoopStrapService$a;",
        "Lcom/whoop/service/rearchitect/BleWhoopStrapService;",
        "binder",
        "Ljk0/d;",
        "dataPlaneStrap",
        "<anonymous>",
        "(Lst0/f;Lcom/whoop/service/rearchitect/BleWhoopStrapService$a;Ljk0/d;)Ljk0/d;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.service.firmware.memfault.WhoopStrapProviderImpl$commandCapableStrapFlow$2"
    f = "WhoopStrapProviderImpl.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lf92/a;

.field w:I

.field synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lf92/a;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf92/a;",
            "Lq83/d<",
            "-",
            "Lf92/a$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lf92/a$b;->E:Lf92/a;

    const/4 p1, 0x4

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Lst0/f;Lcom/whoop/service/rearchitect/BleWhoopStrapService$a;Ljk0/d;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lst0/f;",
            "Lcom/whoop/service/rearchitect/BleWhoopStrapService$a;",
            "Ljk0/d;",
            "Lq83/d<",
            "-",
            "Ljk0/d;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lf92/a$b;

    iget-object v1, p0, Lf92/a$b;->E:Lf92/a;

    invoke-direct {v0, v1, p4}, Lf92/a$b;-><init>(Lf92/a;Lq83/d;)V

    iput-object p1, v0, Lf92/a$b;->x:Ljava/lang/Object;

    iput-object p2, v0, Lf92/a$b;->y:Ljava/lang/Object;

    iput-object p3, v0, Lf92/a$b;->z:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lf92/a$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lst0/f;

    check-cast p2, Lcom/whoop/service/rearchitect/BleWhoopStrapService$a;

    check-cast p3, Ljk0/d;

    check-cast p4, Lq83/d;

    invoke-virtual {p0, p1, p2, p3, p4}, Lf92/a$b;->f(Lst0/f;Lcom/whoop/service/rearchitect/BleWhoopStrapService$a;Ljk0/d;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lf92/a$b;->x:Ljava/lang/Object;

    check-cast v0, Lst0/f;

    iget-object v1, p0, Lf92/a$b;->y:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/service/rearchitect/BleWhoopStrapService$a;

    iget-object v2, p0, Lf92/a$b;->z:Ljava/lang/Object;

    check-cast v2, Ljk0/d;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v3, p0, Lf92/a$b;->w:I

    if-nez v3, :cond_3

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lf92/a$b;->E:Lf92/a;

    invoke-static {p1}, Lf92/a;->f(Lf92/a;)Lcom/whoop/data/repositories/FeatureFlagChecker;

    move-result-object p1

    invoke-static {p1}, Lst0/u;->a(Lcom/whoop/data/repositories/FeatureFlagChecker;)Z

    move-result p1

    if-eqz p1, :cond_2

    sget-object p1, Lst0/n;->a:Lst0/n;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    const/4 v2, 0x0

    if-nez p1, :cond_1

    sget-object p1, Lst0/m;->a:Lst0/m;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    return-object v2

    :cond_1
    :goto_0
    if-eqz v1, :cond_2

    invoke-virtual {v1}, Lcom/whoop/service/rearchitect/BleWhoopStrapService$a;->f()Ljk0/d;

    move-result-object p1

    return-object p1

    :cond_2
    return-object v2

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
