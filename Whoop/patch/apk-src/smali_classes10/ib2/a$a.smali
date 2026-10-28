.class public final Lib2/a$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lib2/a;->d(Lib2/c$d;Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.settings.email.EditEmailInteractor$handleSubmit$$inlined$withMinimumDelayOf-KLykuaI$1"
    f = "EditEmailInteractor.kt"
    l = {
        0x2c,
        0x27
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:J

.field final synthetic F:Lib2/a;

.field final synthetic G:Lcom/whoop/domain/model/AuthMaterial;

.field final synthetic H:Lib2/c$d;

.field I:Ljava/lang/Object;

.field J:I

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:I

.field private synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(JLq83/d;Lib2/a;Lcom/whoop/domain/model/AuthMaterial;Lib2/c$d;)V
    .locals 0

    iput-wide p1, p0, Lib2/a$a;->E:J

    iput-object p4, p0, Lib2/a$a;->F:Lib2/a;

    iput-object p5, p0, Lib2/a$a;->G:Lcom/whoop/domain/model/AuthMaterial;

    iput-object p6, p0, Lib2/a$a;->H:Lib2/c$d;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 7
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

    new-instance v0, Lib2/a$a;

    iget-wide v1, p0, Lib2/a$a;->E:J

    iget-object v4, p0, Lib2/a$a;->F:Lib2/a;

    iget-object v5, p0, Lib2/a$a;->G:Lcom/whoop/domain/model/AuthMaterial;

    iget-object v6, p0, Lib2/a$a;->H:Lib2/c$d;

    move-object v3, p2

    invoke-direct/range {v0 .. v6}, Lib2/a$a;-><init>(JLq83/d;Lib2/a;Lcom/whoop/domain/model/AuthMaterial;Lib2/c$d;)V

    iput-object p1, v0, Lib2/a$a;->z:Ljava/lang/Object;

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
            "Ldj0/e<",
            "+",
            "Ll83/a0;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lib2/a$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lib2/a$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lib2/a$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lib2/a$a;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget-object v0, p0, Lib2/a$a;->z:Ljava/lang/Object;

    check-cast v0, Lbc3/c0;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lib2/a$a;->y:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v2, :cond_2

    if-eq v2, v4, :cond_1

    if-ne v2, v3, :cond_0

    iget-object v0, p0, Lib2/a$a;->x:Ljava/lang/Object;

    iget-object v1, p0, Lib2/a$a;->w:Ljava/lang/Object;

    check-cast v1, Lbc3/i0;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object v0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v0, p0, Lib2/a$a;->I:Ljava/lang/Object;

    check-cast v0, Lbc3/c0;

    iget-object v0, p0, Lib2/a$a;->x:Ljava/lang/Object;

    check-cast v0, Lq83/d;

    iget-object v0, p0, Lib2/a$a;->w:Ljava/lang/Object;

    check-cast v0, Lbc3/i0;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance p1, Lib2/a$a$a;

    iget-wide v6, p0, Lib2/a$a;->E:J

    invoke-direct {p1, v6, v7, v5}, Lib2/a$a$a;-><init>(JLq83/d;)V

    const/4 v2, 0x3

    invoke-static {v0, v5, p1, v2}, Lbc3/f0;->e(Lbc3/c0;Lq83/j;Lc93/m;I)Lbc3/j0;

    move-result-object v0

    iget-object p1, p0, Lib2/a$a;->F:Lib2/a;

    invoke-static {p1}, Lib2/a;->b(Lib2/a;)Ldj0/b;

    move-result-object p1

    iget-object v2, p0, Lib2/a$a;->G:Lcom/whoop/domain/model/AuthMaterial;

    invoke-virtual {v2}, Lcom/whoop/domain/model/AuthMaterial;->getAccessToken()Ljava/lang/String;

    move-result-object v2

    iget-object v6, p0, Lib2/a$a;->H:Lib2/c$d;

    invoke-virtual {v6}, Lib2/c$d;->a()Ljava/lang/String;

    move-result-object v6

    iput-object v5, p0, Lib2/a$a;->z:Ljava/lang/Object;

    iput-object v0, p0, Lib2/a$a;->w:Ljava/lang/Object;

    iput-object v5, p0, Lib2/a$a;->x:Ljava/lang/Object;

    iput-object v5, p0, Lib2/a$a;->I:Ljava/lang/Object;

    const/4 v7, 0x0

    iput v7, p0, Lib2/a$a;->J:I

    iput v4, p0, Lib2/a$a;->y:I

    invoke-virtual {p1, v2, v6, p0}, Ldj0/b;->p(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    goto :goto_1

    :cond_3
    :goto_0
    iput-object v5, p0, Lib2/a$a;->z:Ljava/lang/Object;

    iput-object v5, p0, Lib2/a$a;->w:Ljava/lang/Object;

    iput-object p1, p0, Lib2/a$a;->x:Ljava/lang/Object;

    iput-object v5, p0, Lib2/a$a;->I:Ljava/lang/Object;

    iput v3, p0, Lib2/a$a;->y:I

    invoke-interface {v0, p0}, Lbc3/i0;->await(Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_4

    :goto_1
    return-object v1

    :cond_4
    return-object p1
.end method
