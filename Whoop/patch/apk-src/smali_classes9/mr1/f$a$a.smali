.class final Lmr1/f$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lmr1/f$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lec3/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic w:Lec3/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/m;"
        }
    .end annotation
.end field

.field final synthetic x:Lmr1/f;


# direct methods
.method public constructor <init>(Lec3/m;Lmr1/f;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/m;",
            "Lmr1/f;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lmr1/f$a$a;->w:Lec3/m;

    iput-object p2, p0, Lmr1/f$a$a;->x:Lmr1/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Lu02/g;Lq83/d;)Ljava/lang/Object;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lu02/g<",
            "Lcom/whoop/internal/checkout/models/CreateCartResponse;",
            ">;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lmr1/f$a$a;->w:Lec3/m;

    instance-of v1, p1, Lu02/h;

    if-eqz v1, :cond_2

    check-cast p1, Lu02/h;

    invoke-virtual {p1}, Lu02/h;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/internal/checkout/models/CreateCartResponse;

    invoke-virtual {p1}, Lcom/whoop/internal/checkout/models/CreateCartResponse;->getActualCartId()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-static {v2}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v1, Lmr1/c;

    sget-object v5, Lmr1/a$c;->a:Lmr1/a$c;

    const/16 v7, 0x14

    const/4 v8, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v1 .. v8}, Lmr1/c;-><init>(Ljava/lang/String;ZLjava/lang/String;Lmr1/a;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_1

    :cond_1
    :goto_0
    new-instance v2, Lmr1/c;

    sget-object v6, Lmr1/a$d;->a:Lmr1/a$d;

    const/16 v8, 0x13

    const/4 v9, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const-string v5, "Cart creation succeeded but no cartId could be extracted from response"

    const/4 v7, 0x0

    invoke-direct/range {v2 .. v9}, Lmr1/c;-><init>(Ljava/lang/String;ZLjava/lang/String;Lmr1/a;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v1, v2

    goto :goto_1

    :cond_2
    instance-of p1, p1, Lu02/e;

    if-eqz p1, :cond_4

    iget-object p1, p0, Lmr1/f$a$a;->x:Lmr1/f;

    invoke-static {p1}, Lmr1/f;->f(Lmr1/f;)Lmr1/c;

    move-result-object v1

    :goto_1
    invoke-interface {v0, v1, p2}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_3

    return-object p1

    :cond_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_4
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lu02/g;

    invoke-virtual {p0, p1, p2}, Lmr1/f$a$a;->b(Lu02/g;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
