.class public final Lsz/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ldq/p;


# direct methods
.method public constructor <init>(Ldq/p;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsz/b;->a:Ldq/p;

    return-void
.end method


# virtual methods
.method public final a(Ldq/f;Ls83/c;)Ljava/lang/Object;
    .locals 5

    instance-of v0, p2, Lsz/a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lsz/a;

    iget v1, v0, Lsz/a;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lsz/a;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lsz/a;

    invoke-direct {v0, p0, p2}, Lsz/a;-><init>(Lsz/b;Ls83/c;)V

    :goto_0
    iget-object p2, v0, Lsz/a;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lsz/a;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-static {}, Lto/q;->a()Le73/b;

    move-result-object p2

    const/16 v2, 0x5c99

    iput v2, p2, Le73/b;->d:I

    new-instance v2, Lro/i;

    const/16 v4, 0x1b

    invoke-direct {v2, p1, v4}, Lro/i;-><init>(Ljava/lang/Object;I)V

    iput-object v2, p2, Le73/b;->e:Ljava/lang/Object;

    invoke-virtual {p2}, Le73/b;->g()Lto/j0;

    move-result-object p1

    iget-object p2, p0, Lsz/b;->a:Ldq/p;

    invoke-virtual {p2, p1}, Lcom/google/android/gms/common/api/h;->doRead(Lto/q;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    const-string p2, "isReadyToPay(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput v3, v0, Lsz/a;->y:I

    invoke-static {p1, v0}, Lcom/squareup/wire/n;->o(Lcom/google/android/gms/tasks/Task;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    const-string p1, "await(...)"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p2
.end method
