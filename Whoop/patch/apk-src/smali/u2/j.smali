.class public Lu2/j;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lr1/c;

.field public final b:La0/q0;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lr1/c;

    const/16 v1, 0x10

    new-array v1, v1, [Lu2/i;

    invoke-direct {v0, v1}, Lr1/c;-><init>([Ljava/lang/Object;)V

    iput-object v0, p0, Lu2/j;->a:Lr1/c;

    new-instance v0, La0/q0;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, La0/q0;-><init>(I)V

    iput-object v0, p0, Lu2/j;->b:La0/q0;

    return-void
.end method


# virtual methods
.method public a(La0/y;Ly2/y;Lf1/p1;Z)Z
    .locals 6

    iget-object v0, p0, Lu2/j;->a:Lr1/c;

    iget-object v1, v0, Lr1/c;->w:[Ljava/lang/Object;

    iget v0, v0, Lr1/c;->y:I

    const/4 v2, 0x0

    move v3, v2

    move v4, v3

    :goto_0
    if-ge v3, v0, :cond_2

    aget-object v5, v1, v3

    check-cast v5, Lu2/i;

    invoke-virtual {v5, p1, p2, p3, p4}, Lu2/i;->a(La0/y;Ly2/y;Lf1/p1;Z)Z

    move-result v5

    if-nez v5, :cond_1

    if-eqz v4, :cond_0

    goto :goto_1

    :cond_0
    move v4, v2

    goto :goto_2

    :cond_1
    :goto_1
    const/4 v4, 0x1

    :goto_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    return v4
.end method

.method public b(Lf1/p1;)V
    .locals 2

    iget-object p1, p0, Lu2/j;->a:Lr1/c;

    iget v0, p1, Lr1/c;->y:I

    add-int/lit8 v0, v0, -0x1

    :goto_0
    const/4 v1, -0x1

    if-ge v1, v0, :cond_1

    iget-object v1, p1, Lr1/c;->w:[Ljava/lang/Object;

    aget-object v1, v1, v0

    check-cast v1, Lu2/i;

    iget-object v1, v1, Lu2/i;->d:Llo/k;

    invoke-virtual {v1}, Llo/k;->h()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p1, v0}, Lr1/c;->l(I)Ljava/lang/Object;

    :cond_0
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_1
    return-void
.end method
