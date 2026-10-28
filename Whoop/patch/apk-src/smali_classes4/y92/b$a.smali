.class final Ly92/b$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ly92/b;->c(Lcom/whoop/domain/model/AuthMaterial;)V
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
    c = "com.whoop.service.store.user.AuthManagerBridge$submitAuthMaterialOffOfMainThread$1"
    f = "AuthManagerBridge.kt"
    l = {
        0x36,
        0x3a
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:Ljava/lang/Object;

.field x:I

.field final synthetic y:Ly92/b;

.field final synthetic z:Lcom/whoop/domain/model/AuthMaterial;


# direct methods
.method public constructor <init>(Ly92/b;Lcom/whoop/domain/model/AuthMaterial;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ly92/b;",
            "Lcom/whoop/domain/model/AuthMaterial;",
            "Lq83/d<",
            "-",
            "Ly92/b$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Ly92/b$a;->y:Ly92/b;

    iput-object p2, p0, Ly92/b$a;->z:Lcom/whoop/domain/model/AuthMaterial;

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

    new-instance p1, Ly92/b$a;

    iget-object v0, p0, Ly92/b$a;->y:Ly92/b;

    iget-object v1, p0, Ly92/b$a;->z:Lcom/whoop/domain/model/AuthMaterial;

    invoke-direct {p1, v0, v1, p2}, Ly92/b$a;-><init>(Ly92/b;Lcom/whoop/domain/model/AuthMaterial;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Ly92/b$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ly92/b$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ly92/b$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Ly92/b$a;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Ly92/b$a;->x:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Ly92/b$a;->w:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/domain/model/AuthMaterial;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

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

    iget-object p1, p0, Ly92/b$a;->y:Ly92/b;

    invoke-static {p1}, Ly92/b;->a(Ly92/b;)Ly92/a;

    move-result-object p1

    iput v3, p0, Ly92/b$a;->x:I

    invoke-virtual {p1, p0}, Ly92/a;->a(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    goto :goto_1

    :cond_3
    :goto_0
    check-cast p1, Lcom/whoop/domain/model/AuthMaterial;

    const/4 v1, 0x0

    if-nez p1, :cond_4

    iget-object p1, p0, Ly92/b$a;->y:Ly92/b;

    invoke-static {p1}, Ly92/b;->b(Ly92/b;)Ltr2/n;

    move-result-object p1

    const-string v3, "Existing auth material was null, submitting new ones"

    new-array v1, v1, [Lqr2/a$a;

    invoke-interface {p1, v3, v1}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object p1, p0, Ly92/b$a;->y:Ly92/b;

    invoke-static {p1}, Ly92/b;->a(Ly92/b;)Ly92/a;

    move-result-object p1

    iget-object v1, p0, Ly92/b$a;->z:Lcom/whoop/domain/model/AuthMaterial;

    const/4 v3, 0x0

    iput-object v3, p0, Ly92/b$a;->w:Ljava/lang/Object;

    iput v2, p0, Ly92/b$a;->x:I

    invoke-virtual {p1, v1, p0}, Ly92/a;->c(Lcom/whoop/domain/model/AuthMaterial;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    :goto_1
    return-object v0

    :cond_4
    iget-object p1, p0, Ly92/b$a;->y:Ly92/b;

    invoke-static {p1}, Ly92/b;->b(Ly92/b;)Ltr2/n;

    move-result-object p1

    const-string v0, "There was auth material, no need to submit again"

    new-array v1, v1, [Lqr2/a$a;

    invoke-interface {p1, v0, v1}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    :cond_5
    :goto_2
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
