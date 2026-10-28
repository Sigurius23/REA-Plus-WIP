.class public final Lph/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lph/f;


# instance fields
.field public final a:Lch/j;

.field public final b:Lmh/k;

.field public final c:I


# direct methods
.method public constructor <init>(Lch/j;Lmh/k;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lph/b;->a:Lch/j;

    iput-object p2, p0, Lph/b;->b:Lmh/k;

    iput p3, p0, Lph/b;->c:I

    if-lez p3, :cond_0

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "durationMillis must be > 0."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final a()V
    .locals 7

    new-instance v0, Lfh/a;

    iget-object v1, p0, Lph/b;->a:Lch/j;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v1, p0, Lph/b;->b:Lmh/k;

    invoke-virtual {v1}, Lmh/k;->a()Landroid/graphics/drawable/Drawable;

    move-result-object v2

    invoke-virtual {v1}, Lmh/k;->b()Lmh/j;

    move-result-object v3

    iget-object v3, v3, Lmh/j;->z:Lnh/g;

    instance-of v4, v1, Lmh/o;

    if-eqz v4, :cond_1

    move-object v5, v1

    check-cast v5, Lmh/o;

    iget-boolean v5, v5, Lmh/o;->g:Z

    if-nez v5, :cond_0

    goto :goto_0

    :cond_0
    const/4 v5, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v5, 0x1

    :goto_1
    iget v6, p0, Lph/b;->c:I

    invoke-direct {v0, v2, v3, v6, v5}, Lfh/a;-><init>(Landroid/graphics/drawable/Drawable;Lnh/g;IZ)V

    if-eqz v4, :cond_2

    goto :goto_2

    :cond_2
    instance-of v0, v1, Lmh/e;

    if-eqz v0, :cond_3

    :goto_2
    return-void

    :cond_3
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method
