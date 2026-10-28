.class public abstract Lqh/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lmh/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lmh/c;

    invoke-direct {v0}, Lmh/c;-><init>()V

    sput-object v0, Lqh/b;->a:Lmh/c;

    return-void
.end method

.method public static final a(Lmh/j;)Z
    .locals 4

    iget-object v0, p0, Lmh/j;->g:Lnh/d;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    const/4 v2, 0x1

    if-eq v0, v2, :cond_2

    const/4 v3, 0x2

    if-ne v0, v3, :cond_1

    iget-object v0, p0, Lmh/j;->E:Lmh/d;

    iget-object v0, v0, Lmh/d;->a:Lnh/i;

    if-nez v0, :cond_0

    iget-object p0, p0, Lmh/j;->y:Lnh/i;

    instance-of p0, p0, Lnh/c;

    if-eqz p0, :cond_0

    return v2

    :cond_0
    return v1

    :cond_1
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_2
    return v2

    :cond_3
    return v1
.end method

.method public static final b(Lmh/j;Ljava/lang/Integer;)Landroid/graphics/drawable/Drawable;
    .locals 2

    const/4 v0, 0x0

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-nez v1, :cond_0

    return-object v0

    :cond_0
    iget-object p0, p0, Lmh/j;->a:Landroid/content/Context;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-static {p0, p1}, Lq83/g;->x(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p0

    if-eqz p0, :cond_1

    return-object p0

    :cond_1
    const-string p0, "Invalid resource ID: "

    invoke-static {p1, p0}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    return-object v0
.end method
