.class public final Lfc3/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# instance fields
.field public final synthetic w:Ldc3/h;

.field public final synthetic x:I


# direct methods
.method public constructor <init>(Ldc3/h;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfc3/m;->w:Ldc3/h;

    iput p2, p0, Lfc3/m;->x:I

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 5

    instance-of v0, p2, Lfc3/l;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lfc3/l;

    iget v1, v0, Lfc3/l;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lfc3/l;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lfc3/l;

    invoke-direct {v0, p0, p2}, Lfc3/l;-><init>(Lfc3/m;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lfc3/l;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lfc3/l;->y:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance p2, Lm83/c0;

    iget v2, p0, Lfc3/m;->x:I

    invoke-direct {p2, v2, p1}, Lm83/c0;-><init>(ILjava/lang/Object;)V

    iput v4, v0, Lfc3/l;->y:I

    iget-object p1, p0, Lfc3/m;->w:Ldc3/h;

    invoke-interface {p1, p2, v0}, Ldc3/x;->t(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    iput v3, v0, Lfc3/l;->y:I

    invoke-static {v0}, Lbc3/f0;->L(Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    :goto_2
    return-object v1

    :cond_5
    :goto_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
