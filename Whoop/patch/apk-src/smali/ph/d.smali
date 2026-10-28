.class public final Lph/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lph/f;


# instance fields
.field public final a:Lch/j;

.field public final b:Lmh/k;


# direct methods
.method public constructor <init>(Lch/j;Lmh/k;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lph/d;->a:Lch/j;

    iput-object p2, p0, Lph/d;->b:Lmh/k;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    iget-object v0, p0, Lph/d;->b:Lmh/k;

    instance-of v1, v0, Lmh/o;

    iget-object v2, p0, Lph/d;->a:Lch/j;

    if-eqz v1, :cond_0

    check-cast v0, Lmh/o;

    iget-object v0, v0, Lmh/o;->a:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    :cond_0
    instance-of v1, v0, Lmh/e;

    if-eqz v1, :cond_1

    check-cast v0, Lmh/e;

    invoke-virtual {v0}, Lmh/e;->a()Landroid/graphics/drawable/Drawable;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    :cond_1
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method
