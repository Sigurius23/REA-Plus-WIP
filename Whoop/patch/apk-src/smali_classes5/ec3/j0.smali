.class public final Lec3/j0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# instance fields
.field public final synthetic w:Lkotlin/jvm/internal/e0;

.field public final synthetic x:I

.field public final synthetic y:Lec3/m;


# direct methods
.method public constructor <init>(Lkotlin/jvm/internal/e0;ILec3/m;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lec3/j0;->w:Lkotlin/jvm/internal/e0;

    iput p2, p0, Lec3/j0;->x:I

    iput-object p3, p0, Lec3/j0;->y:Lec3/m;

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 6

    instance-of v0, p2, Lec3/i0;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lec3/i0;

    iget v1, v0, Lec3/i0;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lec3/i0;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lec3/i0;

    invoke-direct {v0, p0, p2}, Lec3/i0;-><init>(Lec3/j0;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lec3/i0;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lec3/i0;->y:I

    sget-object v3, Ll83/a0;->a:Ll83/a0;

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v4, :cond_1

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    return-object v3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lec3/j0;->w:Lkotlin/jvm/internal/e0;

    iget v2, p2, Lkotlin/jvm/internal/e0;->w:I

    iget v5, p0, Lec3/j0;->x:I

    if-lt v2, v5, :cond_4

    iput v4, v0, Lec3/i0;->y:I

    iget-object p2, p0, Lec3/j0;->y:Lec3/m;

    invoke-interface {p2, p1, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    return-object v3

    :cond_4
    add-int/2addr v2, v4

    iput v2, p2, Lkotlin/jvm/internal/e0;->w:I

    return-object v3
.end method
