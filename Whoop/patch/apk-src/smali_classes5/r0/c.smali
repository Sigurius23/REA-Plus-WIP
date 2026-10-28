.class public final Lr0/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr0/a;


# instance fields
.field public final a:Lr1/c;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lr1/c;

    const/16 v1, 0x10

    new-array v1, v1, [Lr0/d;

    invoke-direct {v0, v1}, Lr1/c;-><init>([Ljava/lang/Object;)V

    iput-object v0, p0, Lr0/c;->a:Lr1/c;

    return-void
.end method


# virtual methods
.method public final b(Lh2/c;Ls83/c;)Ljava/lang/Object;
    .locals 9

    instance-of v0, p2, Lr0/b;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lr0/b;

    iget v1, v0, Lr0/b;->G:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lr0/b;->G:I

    goto :goto_0

    :cond_0
    new-instance v0, Lr0/b;

    invoke-direct {v0, p0, p2}, Lr0/b;-><init>(Lr0/c;Ls83/c;)V

    :goto_0
    iget-object p2, v0, Lr0/b;->E:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lr0/b;->G:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget p1, v0, Lr0/b;->z:I

    iget v2, v0, Lr0/b;->y:I

    iget-object v4, v0, Lr0/b;->x:[Ljava/lang/Object;

    iget-object v5, v0, Lr0/b;->w:Lh2/c;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    move-object p2, v5

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lr0/c;->a:Lr1/c;

    iget-object v2, p2, Lr1/c;->w:[Ljava/lang/Object;

    iget p2, p2, Lr1/c;->y:I

    const/4 v4, 0x0

    move v8, p2

    move-object p2, p1

    move p1, v8

    move v8, v4

    move-object v4, v2

    move v2, v8

    :goto_1
    if-ge v2, p1, :cond_4

    aget-object v5, v4, v2

    check-cast v5, Lr0/d;

    new-instance v6, Lq80/h;

    const/16 v7, 0x8

    invoke-direct {v6, p2, v7}, Lq80/h;-><init>(Ljava/lang/Object;I)V

    iput-object p2, v0, Lr0/b;->w:Lh2/c;

    iput-object v4, v0, Lr0/b;->x:[Ljava/lang/Object;

    iput v2, v0, Lr0/b;->y:I

    iput p1, v0, Lr0/b;->z:I

    iput v3, v0, Lr0/b;->G:I

    invoke-static {v5, v6, v0}, Lds/q;->m(La3/n;Lc93/a;Ls83/c;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v1, :cond_3

    return-object v1

    :cond_3
    :goto_2
    add-int/2addr v2, v3

    goto :goto_1

    :cond_4
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
