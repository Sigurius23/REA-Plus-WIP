.class public final Ld/g1;
.super Ld/q0;
.source "SourceFile"


# instance fields
.field public final d:Z


# direct methods
.method public constructor <init>(IIZLab/h0;)V
    .locals 0

    invoke-direct {p0, p1, p2, p4}, Ld/q0;-><init>(IILab/h0;)V

    iput-boolean p3, p0, Ld/g1;->d:Z

    return-void
.end method


# virtual methods
.method public final b()Ld/b1;
    .locals 9

    iget-boolean v0, p0, Ld/g1;->d:Z

    const/4 v2, 0x4

    iget-object v1, p0, Ld/q0;->c:Lab/h0;

    iget v3, p0, Ld/q0;->a:I

    iget v4, p0, Ld/q0;->b:I

    if-nez v0, :cond_0

    iget-object v0, v1, Lab/h0;->y:Ljava/lang/Object;

    check-cast v0, Ld/p;

    check-cast v0, Ld/c;

    invoke-virtual {v0}, Ld/c;->h()[B

    move-result-object v0

    new-instance v1, Ld/d0;

    new-instance v5, Ld/l;

    invoke-direct {v5, v0}, Ld/x0;-><init>([B)V

    const/4 v6, 0x2

    invoke-direct/range {v1 .. v6}, Ld/d0;-><init>(IIILd/q;I)V

    return-object v1

    :cond_0
    invoke-virtual {v1}, Lab/h0;->c()Ld/s;

    move-result-object v0

    iget v1, v0, Ld/s;->a:I

    const/4 v5, 0x1

    if-ne v1, v5, :cond_1

    move v5, v3

    new-instance v3, Ld/d0;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ld/s;->d(I)Ld/q;

    move-result-object v7

    move v6, v4

    const/4 v4, 0x3

    const/4 v8, 0x2

    invoke-direct/range {v3 .. v8}, Ld/d0;-><init>(IIILd/q;I)V

    return-object v3

    :cond_1
    move v6, v5

    move v5, v3

    move v3, v6

    move v6, v1

    new-instance v1, Ld/d0;

    sget-object v7, Ld/w0;->a:Ld/x;

    if-ge v6, v3, :cond_2

    sget-object v0, Ld/w0;->a:Ld/x;

    goto :goto_0

    :cond_2
    new-instance v6, Ld/x;

    invoke-direct {v6, v0, v3}, Ld/x;-><init>(Ld/s;I)V

    const/4 v0, -0x1

    iput v0, v6, Ld/x;->c:I

    move-object v0, v6

    :goto_0
    const/4 v6, 0x2

    move v3, v5

    move-object v5, v0

    invoke-direct/range {v1 .. v6}, Ld/d0;-><init>(IIILd/q;I)V

    return-object v1
.end method
