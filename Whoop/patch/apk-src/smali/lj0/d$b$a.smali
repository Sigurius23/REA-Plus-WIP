.class public final Llj0/d$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llj0/d$b;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;
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

.field final synthetic x:Llj0/d;


# direct methods
.method public constructor <init>(Lec3/m;Llj0/d;)V
    .locals 0

    iput-object p1, p0, Llj0/d$b$a;->w:Lec3/m;

    iput-object p2, p0, Llj0/d$b$a;->x:Llj0/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 13

    instance-of v0, p2, Llj0/d$b$a$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Llj0/d$b$a$a;

    iget v1, v0, Llj0/d$b$a$a;->x:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Llj0/d$b$a$a;->x:I

    goto :goto_0

    :cond_0
    new-instance v0, Llj0/d$b$a$a;

    invoke-direct {v0, p0, p2}, Llj0/d$b$a$a;-><init>(Llj0/d$b$a;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Llj0/d$b$a$a;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Llj0/d$b$a$a;->x:I

    const/4 v3, 0x4

    const/4 v4, 0x3

    const/4 v5, 0x2

    const/4 v6, 0x1

    const/4 v7, 0x0

    sget-object v8, Ll83/a0;->a:Ll83/a0;

    if-eqz v2, :cond_3

    if-eq v2, v6, :cond_2

    if-eq v2, v5, :cond_2

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Llj0/d$b$a$a;->G:Ljava/lang/Object;

    check-cast p1, Lec3/m;

    iget-object p1, v0, Llj0/d$b$a$a;->E:Ljava/lang/Object;

    check-cast p1, Llj0/d$b$a$a;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget p1, v0, Llj0/d$b$a$a;->K:I

    iget-object v2, v0, Llj0/d$b$a$a;->J:Ljava/lang/Object;

    check-cast v2, Llt0/k;

    iget-object v2, v0, Llj0/d$b$a$a;->I:Ljava/lang/Object;

    check-cast v2, Lq83/d;

    iget-object v2, v0, Llj0/d$b$a$a;->H:Ljava/lang/Object;

    check-cast v2, Lec3/m;

    iget-object v4, v0, Llj0/d$b$a$a;->G:Ljava/lang/Object;

    check-cast v4, Lec3/m;

    iget-object v4, v0, Llj0/d$b$a$a;->E:Ljava/lang/Object;

    check-cast v4, Llj0/d$b$a$a;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_1

    :cond_3
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, p0, Llj0/d$b$a;->w:Lec3/m;

    check-cast p1, Llt0/k;

    invoke-virtual {p1}, Llt0/k;->b()Llt0/c;

    move-result-object p2

    instance-of v9, p2, Ldk0/g;

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    if-eqz v9, :cond_5

    iget-object p1, p0, Llj0/d$b$a;->x:Llj0/d;

    sget-object p2, Llj0/k$c;->a:Llj0/k$c;

    iput-object v7, v0, Llj0/d$b$a$a;->y:Ljava/lang/Object;

    iput-object v7, v0, Llj0/d$b$a$a;->E:Ljava/lang/Object;

    iput-object v7, v0, Llj0/d$b$a$a;->F:Ljava/lang/Object;

    iput-object v7, v0, Llj0/d$b$a$a;->G:Ljava/lang/Object;

    iput-object v2, v0, Llj0/d$b$a$a;->H:Ljava/lang/Object;

    iput-object v7, v0, Llj0/d$b$a$a;->I:Ljava/lang/Object;

    iput-object v7, v0, Llj0/d$b$a$a;->J:Ljava/lang/Object;

    iput v12, v0, Llj0/d$b$a$a;->K:I

    iput v12, v0, Llj0/d$b$a$a;->L:I

    iput v6, v0, Llj0/d$b$a$a;->x:I

    invoke-static {p1, p2, v10, v11, v0}, Llj0/d;->a(Llj0/d;Llj0/k;DLq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    goto :goto_2

    :cond_4
    move p1, v12

    goto :goto_1

    :cond_5
    instance-of p2, p2, Ldk0/b;

    if-eqz p2, :cond_6

    iget-object p1, p0, Llj0/d$b$a;->x:Llj0/d;

    sget-object p2, Llj0/k$a;->a:Llj0/k$a;

    iput-object v7, v0, Llj0/d$b$a$a;->y:Ljava/lang/Object;

    iput-object v7, v0, Llj0/d$b$a$a;->E:Ljava/lang/Object;

    iput-object v7, v0, Llj0/d$b$a$a;->F:Ljava/lang/Object;

    iput-object v7, v0, Llj0/d$b$a$a;->G:Ljava/lang/Object;

    iput-object v2, v0, Llj0/d$b$a$a;->H:Ljava/lang/Object;

    iput-object v7, v0, Llj0/d$b$a$a;->I:Ljava/lang/Object;

    iput-object v7, v0, Llj0/d$b$a$a;->J:Ljava/lang/Object;

    iput v12, v0, Llj0/d$b$a$a;->K:I

    iput v12, v0, Llj0/d$b$a$a;->L:I

    iput v5, v0, Llj0/d$b$a$a;->x:I

    invoke-static {p1, p2, v10, v11, v0}, Llj0/d;->a(Llj0/d;Llj0/k;DLq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    goto :goto_2

    :cond_6
    iget-object p2, p0, Llj0/d$b$a;->x:Llj0/d;

    sget-object v5, Llj0/k$b;->a:Llj0/k$b;

    invoke-virtual {p1}, Llt0/k;->a()Lmt0/b;

    move-result-object p1

    invoke-virtual {p1}, Lmt0/b;->f()Ljava/nio/ByteBuffer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object p1

    array-length p1, p1

    int-to-double v9, p1

    iput-object v7, v0, Llj0/d$b$a$a;->y:Ljava/lang/Object;

    iput-object v7, v0, Llj0/d$b$a$a;->E:Ljava/lang/Object;

    iput-object v7, v0, Llj0/d$b$a$a;->F:Ljava/lang/Object;

    iput-object v7, v0, Llj0/d$b$a$a;->G:Ljava/lang/Object;

    iput-object v2, v0, Llj0/d$b$a$a;->H:Ljava/lang/Object;

    iput-object v7, v0, Llj0/d$b$a$a;->I:Ljava/lang/Object;

    iput-object v7, v0, Llj0/d$b$a$a;->J:Ljava/lang/Object;

    iput v12, v0, Llj0/d$b$a$a;->K:I

    iput v12, v0, Llj0/d$b$a$a;->L:I

    iput v4, v0, Llj0/d$b$a$a;->x:I

    invoke-static {p2, v5, v9, v10, v0}, Llj0/d;->a(Llj0/d;Llj0/k;DLq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    goto :goto_2

    :goto_1
    iput-object v7, v0, Llj0/d$b$a$a;->y:Ljava/lang/Object;

    iput-object v7, v0, Llj0/d$b$a$a;->E:Ljava/lang/Object;

    iput-object v7, v0, Llj0/d$b$a$a;->F:Ljava/lang/Object;

    iput-object v7, v0, Llj0/d$b$a$a;->G:Ljava/lang/Object;

    iput-object v7, v0, Llj0/d$b$a$a;->H:Ljava/lang/Object;

    iput-object v7, v0, Llj0/d$b$a$a;->I:Ljava/lang/Object;

    iput-object v7, v0, Llj0/d$b$a$a;->J:Ljava/lang/Object;

    iput p1, v0, Llj0/d$b$a$a;->K:I

    iput v3, v0, Llj0/d$b$a$a;->x:I

    invoke-interface {v2, v8, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_7

    :goto_2
    return-object v1

    :cond_7
    :goto_3
    return-object v8
.end method
