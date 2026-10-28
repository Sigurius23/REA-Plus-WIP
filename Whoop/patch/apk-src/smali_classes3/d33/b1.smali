.class public final Ld33/b1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# instance fields
.field public final synthetic w:Ld33/h1;

.field public final synthetic x:Ljava/util/Set;

.field public final synthetic y:Ljava/util/Set;


# direct methods
.method public constructor <init>(Ld33/h1;Ljava/util/Set;Ljava/util/Set;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld33/b1;->w:Ld33/h1;

    iput-object p2, p0, Ld33/b1;->x:Ljava/util/Set;

    iput-object p3, p0, Ld33/b1;->y:Ljava/util/Set;

    return-void
.end method


# virtual methods
.method public final b(Le33/v0;Lq83/d;)Ljava/lang/Object;
    .locals 6

    instance-of v0, p2, Ld33/a1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Ld33/a1;

    iget v1, v0, Ld33/a1;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Ld33/a1;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Ld33/a1;

    invoke-direct {v0, p0, p2}, Ld33/a1;-><init>(Ld33/b1;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Ld33/a1;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Ld33/a1;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-eq v2, v3, :cond_1

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p2}, Lb9/y;->v(Ljava/lang/Object;)Lkotlin/KotlinNothingValueException;

    move-result-object p1

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    if-eqz p1, :cond_3

    iget-object p1, p1, Le33/u;->s:Lec3/h2;

    if-eqz p1, :cond_3

    new-instance p2, Ld33/z0;

    iget-object v2, p0, Ld33/b1;->x:Ljava/util/Set;

    iget-object v4, p0, Ld33/b1;->y:Ljava/util/Set;

    iget-object v5, p0, Ld33/b1;->w:Ld33/h1;

    invoke-direct {p2, v5, v2, v4}, Ld33/z0;-><init>(Ld33/h1;Ljava/util/Set;Ljava/util/Set;)V

    iput v3, v0, Ld33/a1;->y:I

    invoke-virtual {p1, p2, v0}, Lec3/h2;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    return-object v1

    :cond_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final bridge synthetic emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Le33/v0;

    invoke-virtual {p0, p1, p2}, Ld33/b1;->b(Le33/v0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
