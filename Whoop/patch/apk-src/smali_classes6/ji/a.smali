.class public final Lji/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lji/d;


# instance fields
.field public final b:I


# direct methods
.method public constructor <init>(I)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lji/a;->b:I

    if-lez p1, :cond_0

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "durationMillis must be > 0."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final a(Lhi/a;Lfi/l;)Lji/e;
    .locals 2

    instance-of v0, p2, Lfi/q;

    if-nez v0, :cond_0

    new-instance v0, Lji/c;

    invoke-direct {v0, p1, p2}, Lji/c;-><init>(Lhi/a;Lfi/l;)V

    return-object v0

    :cond_0
    move-object v0, p2

    check-cast v0, Lfi/q;

    iget-object v0, v0, Lfi/q;->c:Lsh/h;

    sget-object v1, Lsh/h;->w:Lsh/h;

    if-ne v0, v1, :cond_1

    new-instance v0, Lji/c;

    invoke-direct {v0, p1, p2}, Lji/c;-><init>(Lhi/a;Lfi/l;)V

    return-object v0

    :cond_1
    new-instance v0, Lab/h0;

    iget v1, p0, Lji/a;->b:I

    invoke-direct {v0, p1, p2, v1}, Lab/h0;-><init>(Lhi/a;Lfi/l;I)V

    return-object v0
.end method
