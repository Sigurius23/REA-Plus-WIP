.class public final Lh5/t;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:I

.field public b:I


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 2

    iget v0, p0, Lh5/t;->a:I

    iget v1, p0, Lh5/t;->b:I

    or-int/2addr v0, v1

    return v0
.end method

.method public final b(II)V
    .locals 1

    const/4 v0, 0x1

    if-ne p2, v0, :cond_0

    iput p1, p0, Lh5/t;->b:I

    return-void

    :cond_0
    iput p1, p0, Lh5/t;->a:I

    return-void
.end method

.method public final c(I)V
    .locals 2

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-ne p1, v0, :cond_0

    iput v1, p0, Lh5/t;->b:I

    return-void

    :cond_0
    iput v1, p0, Lh5/t;->a:I

    return-void
.end method
