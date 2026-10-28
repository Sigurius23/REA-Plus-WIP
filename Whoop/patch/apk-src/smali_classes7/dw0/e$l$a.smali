.class public final Ldw0/e$l$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ldw0/e$l;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;
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
.field final synthetic E:Z

.field final synthetic F:Ljava/lang/String;

.field final synthetic w:Lec3/m;

.field final synthetic x:Ldw0/e;

.field final synthetic y:Ljava/lang/String;

.field final synthetic z:Lhw0/a;


# direct methods
.method public constructor <init>(Lec3/m;Ldw0/e;Ljava/lang/String;Lhw0/a;ZLjava/lang/String;)V
    .locals 0

    iput-object p1, p0, Ldw0/e$l$a;->w:Lec3/m;

    iput-object p2, p0, Ldw0/e$l$a;->x:Ldw0/e;

    iput-object p3, p0, Ldw0/e$l$a;->y:Ljava/lang/String;

    iput-object p4, p0, Ldw0/e$l$a;->z:Lhw0/a;

    iput-boolean p5, p0, Ldw0/e$l$a;->E:Z

    iput-object p6, p0, Ldw0/e$l$a;->F:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 10

    instance-of v0, p2, Ldw0/e$l$a$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Ldw0/e$l$a$a;

    iget v1, v0, Ldw0/e$l$a$a;->x:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Ldw0/e$l$a$a;->x:I

    goto :goto_0

    :cond_0
    new-instance v0, Ldw0/e$l$a$a;

    invoke-direct {v0, p0, p2}, Ldw0/e$l$a$a;-><init>(Ldw0/e$l$a;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Ldw0/e$l$a$a;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Ldw0/e$l$a$a;->x:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Ldw0/e$l$a$a;->G:Ljava/lang/Object;

    check-cast p1, Lec3/m;

    iget-object p1, v0, Ldw0/e$l$a$a;->E:Ljava/lang/Object;

    check-cast p1, Ldw0/e$l$a$a;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Ldw0/e$l$a;->w:Lec3/m;

    check-cast p1, Lpm0/a;

    instance-of v2, p1, Lpm0/a$a$a;

    if-eqz v2, :cond_3

    iget-object v4, p0, Ldw0/e$l$a;->x:Ldw0/e;

    check-cast p1, Lpm0/a$a$a;

    invoke-virtual {p1}, Lpm0/a$a$a;->getData()Ljava/lang/Object;

    move-result-object p1

    move-object v5, p1

    check-cast v5, Lcom/whoop/core/details/network/model/CoreDetailsModel;

    iget-object v6, p0, Ldw0/e$l$a;->y:Ljava/lang/String;

    iget-object v7, p0, Ldw0/e$l$a;->z:Lhw0/a;

    iget-boolean v8, p0, Ldw0/e$l$a;->E:Z

    iget-object v9, p0, Ldw0/e$l$a;->F:Ljava/lang/String;

    invoke-static/range {v4 .. v9}, Ldw0/e;->d(Ldw0/e;Lcom/whoop/core/details/network/model/CoreDetailsModel;Ljava/lang/String;Lhw0/a;ZLjava/lang/String;)Ldw0/k;

    move-result-object p1

    goto :goto_2

    :cond_3
    instance-of v2, p1, Lpm0/a$a$b;

    if-eqz v2, :cond_4

    iget-object v4, p0, Ldw0/e$l$a;->x:Ldw0/e;

    check-cast p1, Lpm0/a$a$b;

    invoke-virtual {p1}, Lpm0/a$a$b;->getData()Ljava/lang/Object;

    move-result-object p1

    move-object v5, p1

    check-cast v5, Lcom/whoop/core/details/network/model/CoreDetailsModel;

    iget-object v6, p0, Ldw0/e$l$a;->y:Ljava/lang/String;

    iget-object v7, p0, Ldw0/e$l$a;->z:Lhw0/a;

    iget-boolean v8, p0, Ldw0/e$l$a;->E:Z

    iget-object v9, p0, Ldw0/e$l$a;->F:Ljava/lang/String;

    invoke-static/range {v4 .. v9}, Ldw0/e;->d(Ldw0/e;Lcom/whoop/core/details/network/model/CoreDetailsModel;Ljava/lang/String;Lhw0/a;ZLjava/lang/String;)Ldw0/k;

    move-result-object p1

    goto :goto_2

    :cond_4
    instance-of v2, p1, Lpm0/a$d;

    if-nez v2, :cond_7

    instance-of v2, p1, Lpm0/a$c;

    if-eqz v2, :cond_5

    goto :goto_1

    :cond_5
    instance-of p1, p1, Lpm0/a$e;

    if-eqz p1, :cond_6

    sget-object p1, Ldw0/k$b;->a:Ldw0/k$b;

    goto :goto_2

    :cond_6
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_7
    :goto_1
    iget-object p1, p0, Ldw0/e$l$a;->x:Ldw0/e;

    iget-object v2, p0, Ldw0/e$l$a;->y:Ljava/lang/String;

    iget-object v4, p0, Ldw0/e$l$a;->z:Lhw0/a;

    iget-boolean v5, p0, Ldw0/e$l$a;->E:Z

    iget-object v6, p0, Ldw0/e$l$a;->F:Ljava/lang/String;

    invoke-static {p1, v2, v4, v5, v6}, Ldw0/e;->e(Ldw0/e;Ljava/lang/String;Lhw0/a;ZLjava/lang/String;)Ldw0/k;

    move-result-object p1

    :goto_2
    const/4 v2, 0x0

    iput-object v2, v0, Ldw0/e$l$a$a;->y:Ljava/lang/Object;

    iput-object v2, v0, Ldw0/e$l$a$a;->E:Ljava/lang/Object;

    iput-object v2, v0, Ldw0/e$l$a$a;->F:Ljava/lang/Object;

    iput-object v2, v0, Ldw0/e$l$a$a;->G:Ljava/lang/Object;

    const/4 v2, 0x0

    iput v2, v0, Ldw0/e$l$a$a;->H:I

    iput v3, v0, Ldw0/e$l$a$a;->x:I

    invoke-interface {p2, p1, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_8

    return-object v1

    :cond_8
    :goto_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
