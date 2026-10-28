.class public final Ltk0/g$c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ltk0/g$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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

.field final synthetic x:Ljava/util/Set;


# direct methods
.method public constructor <init>(Lec3/m;Ljava/util/Set;)V
    .locals 0

    iput-object p2, p0, Ltk0/g$c$a;->x:Ljava/util/Set;

    iput-object p1, p0, Ltk0/g$c$a;->w:Lec3/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Ltk0/g$c$a$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Ltk0/g$c$a$a;

    iget v1, v0, Ltk0/g$c$a$a;->x:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Ltk0/g$c$a$a;->x:I

    goto :goto_0

    :cond_0
    new-instance v0, Ltk0/g$c$a$a;

    invoke-direct {v0, p0, p2}, Ltk0/g$c$a$a;-><init>(Ltk0/g$c$a;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Ltk0/g$c$a$a;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Ltk0/g$c$a$a;->x:I

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget p1, v0, Ltk0/g$c$a$a;->M:I

    iget v2, v0, Ltk0/g$c$a$a;->L:I

    iget-object v5, v0, Ltk0/g$c$a$a;->K:Ljava/lang/Object;

    check-cast v5, Lmj0/e;

    iget-object v5, v0, Ltk0/g$c$a$a;->I:Ljava/lang/Object;

    check-cast v5, Ljava/util/Iterator;

    iget-object v6, v0, Ltk0/g$c$a$a;->H:Ljava/lang/Object;

    check-cast v6, Ljava/lang/Iterable;

    iget-object v6, v0, Ltk0/g$c$a$a;->G:Ljava/lang/Object;

    check-cast v6, Lec3/m;

    iget-object v7, v0, Ltk0/g$c$a$a;->F:Ljava/lang/Object;

    check-cast v7, Ltk0/g$b;

    iget-object v7, v0, Ltk0/g$c$a$a;->E:Ljava/lang/Object;

    check-cast v7, Lq83/d;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Ltk0/g$c$a;->w:Lec3/m;

    check-cast p1, Ltk0/g$b;

    instance-of v2, p1, Ltk0/g$b$b;

    if-eqz v2, :cond_5

    check-cast p1, Ltk0/g$b$b;

    invoke-virtual {p1}, Ltk0/g$b$b;->a()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    move-object v5, p1

    move-object v6, p2

    move p1, v4

    move v2, p1

    :cond_3
    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_4

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lmj0/e;

    iget-object v7, p0, Ltk0/g$c$a;->x:Ljava/util/Set;

    invoke-virtual {p2}, Lmj0/e;->c()Lnj0/f;

    move-result-object v8

    invoke-interface {v7, v8}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_3

    const/4 v7, 0x0

    iput-object v7, v0, Ltk0/g$c$a$a;->z:Ljava/lang/Object;

    iput-object v7, v0, Ltk0/g$c$a$a;->E:Ljava/lang/Object;

    iput-object v7, v0, Ltk0/g$c$a$a;->F:Ljava/lang/Object;

    iput-object v6, v0, Ltk0/g$c$a$a;->G:Ljava/lang/Object;

    iput-object v7, v0, Ltk0/g$c$a$a;->H:Ljava/lang/Object;

    iput-object v5, v0, Ltk0/g$c$a$a;->I:Ljava/lang/Object;

    iput-object v7, v0, Ltk0/g$c$a$a;->J:Ljava/lang/Object;

    iput-object v7, v0, Ltk0/g$c$a$a;->K:Ljava/lang/Object;

    iput v2, v0, Ltk0/g$c$a$a;->L:I

    iput p1, v0, Ltk0/g$c$a$a;->M:I

    iput v4, v0, Ltk0/g$c$a$a;->N:I

    iput v3, v0, Ltk0/g$c$a$a;->x:I

    invoke-interface {v6, p2, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_4
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_5
    instance-of p2, p1, Ltk0/g$b$a;

    if-eqz p2, :cond_6

    check-cast p1, Ltk0/g$b$a;

    invoke-virtual {p1}, Ltk0/g$b$a;->a()Lcom/whoop/ble/api/scan/ScanFailure;

    move-result-object p1

    throw p1

    :cond_6
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
