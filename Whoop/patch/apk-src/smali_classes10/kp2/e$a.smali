.class final Lkp2/e$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkp2/e;->interact(Lec3/l;)Lec3/l;
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
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lkp2/b;",
        "action",
        "Lec3/l;",
        "Lkp2/f;",
        "<anonymous>",
        "(Lkp2/b;)Lec3/l;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.universalcheckout.features.shippingaddress.domain.ShippingAddressInteractor$interact$1"
    f = "ShippingAddressInteractor.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field final synthetic y:Lkp2/e;


# direct methods
.method public constructor <init>(Lkp2/e;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkp2/e;",
            "Lq83/d<",
            "-",
            "Lkp2/e$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lkp2/e$a;->y:Lkp2/e;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

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

    new-instance v0, Lkp2/e$a;

    iget-object v1, p0, Lkp2/e$a;->y:Lkp2/e;

    invoke-direct {v0, v1, p2}, Lkp2/e$a;-><init>(Lkp2/e;Lq83/d;)V

    iput-object p1, v0, Lkp2/e$a;->x:Ljava/lang/Object;

    return-object v0
.end method

.method public final f(Lkp2/b;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkp2/b;",
            "Lq83/d<",
            "-",
            "Lec3/l;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lkp2/e$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lkp2/e$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lkp2/e$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkp2/b;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lkp2/e$a;->f(Lkp2/b;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lkp2/e$a;->x:Ljava/lang/Object;

    check-cast v0, Lkp2/b;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lkp2/e$a;->w:I

    if-nez v1, :cond_2

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    instance-of p1, v0, Lkp2/b$e;

    if-eqz p1, :cond_0

    iget-object p1, p0, Lkp2/e$a;->y:Lkp2/e;

    check-cast v0, Lkp2/b$e;

    invoke-virtual {v0}, Lkp2/b$e;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Lkp2/b$e;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Lkp2/b$e;->b()Z

    move-result v0

    invoke-static {p1, v1, v2, v0}, Lkp2/e;->j(Lkp2/e;Ljava/lang/String;Ljava/lang/String;Z)Lec3/l;

    move-result-object p1

    return-object p1

    :cond_0
    instance-of p1, v0, Lkp2/b$h;

    if-eqz p1, :cond_1

    iget-object p1, p0, Lkp2/e$a;->y:Lkp2/e;

    check-cast v0, Lkp2/b$h;

    invoke-virtual {v0}, Lkp2/b$h;->a()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lkp2/e$a;->y:Lkp2/e;

    invoke-static {v1}, Lkp2/e;->e(Lkp2/e;)Lkp2/c;

    move-result-object v1

    invoke-virtual {v1}, Lkp2/c;->n()Ljava/util/Map;

    move-result-object v1

    invoke-static {p1, v0, v1}, Lkp2/e;->l(Lkp2/e;Ljava/lang/String;Ljava/util/Map;)Lec3/l;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance p1, Lkp2/e$a$a;

    const/4 v1, 0x0

    invoke-direct {p1, v0, v1}, Lkp2/e$a$a;-><init>(Lkp2/b;Lq83/d;)V

    new-instance v0, Lec3/s1;

    invoke-direct {v0, p1}, Lec3/s1;-><init>(Lc93/m;)V

    return-object v0

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
