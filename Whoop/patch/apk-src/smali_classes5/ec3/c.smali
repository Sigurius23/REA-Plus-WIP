.class public final Lec3/c;
.super Lec3/h;
.source "SourceFile"


# instance fields
.field public final F:Ls83/i;


# direct methods
.method public constructor <init>(Lc93/m;Lq83/j;ILdc3/a;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lec3/h;-><init>(Lc93/m;Lq83/j;ILdc3/a;)V

    check-cast p1, Ls83/i;

    iput-object p1, p0, Lec3/c;->F:Ls83/i;

    return-void
.end method


# virtual methods
.method public final e(Ldc3/u;Lq83/d;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p2, Lec3/b;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lec3/b;

    iget v1, v0, Lec3/b;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lec3/b;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Lec3/b;

    check-cast p2, Ls83/c;

    invoke-direct {v0, p0, p2}, Lec3/b;-><init>(Lec3/c;Ls83/c;)V

    :goto_0
    iget-object p2, v0, Lec3/b;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lec3/b;->z:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lec3/b;->w:Ldc3/u;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iput-object p1, v0, Lec3/b;->w:Ldc3/u;

    iput v3, v0, Lec3/b;->z:I

    invoke-super {p0, p1, v0}, Lec3/h;->e(Ldc3/u;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p1, Ldc3/t;

    iget-object p1, p1, Ldc3/t;->z:Ldc3/h;

    invoke-virtual {p1}, Ldc3/h;->x()Z

    move-result p1

    if-eqz p1, :cond_4

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "\'awaitClose { yourCallbackOrListener.cancel() }\' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final f(Lq83/j;ILdc3/a;)Lfc3/d;
    .locals 2

    new-instance v0, Lec3/c;

    iget-object v1, p0, Lec3/c;->F:Ls83/i;

    invoke-direct {v0, v1, p1, p2, p3}, Lec3/c;-><init>(Lc93/m;Lq83/j;ILdc3/a;)V

    return-object v0
.end method
