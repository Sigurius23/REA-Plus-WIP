.class final Lvg0/b$e;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvg0/b;->l(Lvg0/a$b;)Lec3/l;
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
        "\u0000\u0012\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "",
        "index",
        "Lec3/l;",
        "Lxg0/c;",
        "<anonymous>",
        "(I)Lec3/l;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.ai.chat.domain.interactors.AiChatFileInteractor$uploadFiles$1"
    f = "AiChatFileInteractor.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:I

.field final synthetic y:Lvg0/b;

.field final synthetic z:Lvg0/a$b;


# direct methods
.method public constructor <init>(Lvg0/b;Lvg0/a$b;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvg0/b;",
            "Lvg0/a$b;",
            "Lq83/d<",
            "-",
            "Lvg0/b$e;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lvg0/b$e;->y:Lvg0/b;

    iput-object p2, p0, Lvg0/b$e;->z:Lvg0/a$b;

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

    new-instance v0, Lvg0/b$e;

    iget-object v1, p0, Lvg0/b$e;->y:Lvg0/b;

    iget-object v2, p0, Lvg0/b$e;->z:Lvg0/a$b;

    invoke-direct {v0, v1, v2, p2}, Lvg0/b$e;-><init>(Lvg0/b;Lvg0/a$b;Lq83/d;)V

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    iput p1, v0, Lvg0/b$e;->x:I

    return-object v0
.end method

.method public final invoke(ILq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lq83/d<",
            "-",
            "Lec3/l;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Lvg0/b$e;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lvg0/b$e;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lvg0/b$e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lvg0/b$e;->invoke(ILq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget v0, p0, Lvg0/b$e;->x:I

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lvg0/b$e;->w:I

    if-nez v1, :cond_2

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, p0, Lvg0/b$e;->y:Lvg0/b;

    iget-object p1, p0, Lvg0/b$e;->z:Lvg0/a$b;

    invoke-virtual {p1}, Lvg0/a$b;->d()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    move-object v3, p1

    check-cast v3, Landroid/net/Uri;

    iget-object p1, p0, Lvg0/b$e;->z:Lvg0/a$b;

    invoke-virtual {p1}, Lvg0/a$b;->a()Ljava/util/List;

    move-result-object p1

    if-ltz v0, :cond_0

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    goto :goto_0

    :cond_0
    const-string p1, ""

    :goto_0
    move-object v4, p1

    check-cast v4, Ljava/lang/String;

    iget-object p1, p0, Lvg0/b$e;->z:Lvg0/a$b;

    invoke-virtual {p1}, Lvg0/a$b;->c()Ljava/lang/String;

    move-result-object v5

    iget-object p1, p0, Lvg0/b$e;->z:Lvg0/a$b;

    invoke-virtual {p1}, Lvg0/a$b;->b()Ljava/util/List;

    move-result-object p1

    if-ltz v0, :cond_1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_1

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/Long;

    const-wide/16 v0, 0x0

    invoke-direct {p1, v0, v1}, Ljava/lang/Long;-><init>(J)V

    :goto_1
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v6

    invoke-static/range {v2 .. v7}, Lvg0/b;->g(Lvg0/b;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;J)Lec3/l;

    move-result-object p1

    return-object p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
