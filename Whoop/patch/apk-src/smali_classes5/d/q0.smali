.class public Ld/q0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ld/q;
.implements Ld/f;


# instance fields
.field public final a:I

.field public final b:I

.field public final c:Lab/h0;


# direct methods
.method public constructor <init>(IILab/h0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Ld/q0;->a:I

    iput p2, p0, Ld/q0;->b:I

    iput-object p3, p0, Ld/q0;->c:Lab/h0;

    return-void
.end method


# virtual methods
.method public b()Ld/b1;
    .locals 8

    iget-object v0, p0, Ld/q0;->c:Lab/h0;

    invoke-virtual {v0}, Lab/h0;->c()Ld/s;

    move-result-object v0

    iget v1, v0, Ld/s;->a:I

    iget v4, p0, Ld/q0;->a:I

    iget v5, p0, Ld/q0;->b:I

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    new-instance v2, Ld/d0;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ld/s;->d(I)Ld/q;

    move-result-object v6

    const/4 v3, 0x3

    const/4 v7, 0x1

    invoke-direct/range {v2 .. v7}, Ld/d0;-><init>(IIILd/q;I)V

    return-object v2

    :cond_0
    move v3, v2

    new-instance v2, Ld/d0;

    sget-object v6, Ld/y;->a:Ld/e0;

    if-ge v1, v3, :cond_1

    sget-object v0, Ld/y;->a:Ld/e0;

    move-object v6, v0

    goto :goto_0

    :cond_1
    new-instance v1, Ld/e0;

    invoke-direct {v1, v0}, Ld/h1;-><init>(Ld/s;)V

    move-object v6, v1

    :goto_0
    const/4 v7, 0x1

    const/4 v3, 0x4

    invoke-direct/range {v2 .. v7}, Ld/d0;-><init>(IIILd/q;I)V

    return-object v2
.end method

.method public final d()Ld/b1;
    .locals 2

    :try_start_0
    invoke-virtual {p0}, Ld/q0;->b()Ld/b1;

    move-result-object v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, La/v;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method
