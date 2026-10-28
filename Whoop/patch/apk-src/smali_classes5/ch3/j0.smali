.class public final Lch3/j0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lxg3/f;


# instance fields
.field public final w:Lxg3/k;

.field public final x:Z

.field public final y:I


# direct methods
.method public constructor <init>(Lxg3/k;ZI)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lch3/j0;->w:Lxg3/k;

    iput-boolean p2, p0, Lch3/j0;->x:Z

    if-lez p3, :cond_0

    goto :goto_0

    :cond_0
    sget p3, Lgh3/g;->x:I

    :goto_0
    iput p3, p0, Lch3/j0;->y:I

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    check-cast p1, Lxg3/s;

    new-instance v0, Lch3/i0;

    iget-boolean v1, p0, Lch3/j0;->x:Z

    iget v2, p0, Lch3/j0;->y:I

    iget-object v3, p0, Lch3/j0;->w:Lxg3/k;

    invoke-direct {v0, v3, p1, v1, v2}, Lch3/i0;-><init>(Lxg3/k;Lxg3/s;ZI)V

    new-instance p1, Laj/d;

    invoke-direct {p1, v0}, Laj/d;-><init>(Ljava/lang/Object;)V

    iget-object v1, v0, Lch3/i0;->E:Lxg3/s;

    invoke-virtual {v1, p1}, Lxg3/s;->f(Lxg3/i;)V

    iget-object p1, v0, Lch3/i0;->F:Lxg3/j;

    invoke-virtual {v1, p1}, Lxg3/s;->c(Lxg3/t;)V

    invoke-virtual {v1, v0}, Lxg3/s;->c(Lxg3/t;)V

    return-object v0
.end method
