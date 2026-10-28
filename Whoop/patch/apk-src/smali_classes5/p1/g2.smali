.class public final Lp1/g2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Iterable;
.implements Ld93/a;


# instance fields
.field public final w:Lp1/f2;

.field public final x:I

.field public final y:I


# direct methods
.method public constructor <init>(Lp1/f2;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp1/g2;->w:Lp1/f2;

    iput p2, p0, Lp1/g2;->x:I

    iput p3, p0, Lp1/g2;->y:I

    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 5

    iget-object v0, p0, Lp1/g2;->w:Lp1/f2;

    iget v1, v0, Lp1/f2;->H:I

    iget v2, p0, Lp1/g2;->y:I

    if-eq v1, v2, :cond_0

    invoke-static {}, Lp1/h2;->f()V

    :cond_0
    iget v1, p0, Lp1/g2;->x:I

    invoke-virtual {v0, v1}, Lp1/f2;->j(I)Lp1/n0;

    new-instance v2, Lp1/m0;

    add-int/lit8 v3, v1, 0x1

    iget-object v4, v0, Lp1/f2;->w:[I

    invoke-static {v4, v1}, Lp1/h2;->a([II)I

    move-result v4

    add-int/2addr v4, v1

    invoke-direct {v2, v0, v3, v4}, Lp1/m0;-><init>(Lp1/f2;II)V

    return-object v2
.end method
