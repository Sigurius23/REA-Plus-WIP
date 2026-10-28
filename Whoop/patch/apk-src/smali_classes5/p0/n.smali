.class public final Lp0/n;
.super Lb2/v;
.source "SourceFile"

# interfaces
.implements Lz2/e;
.implements La3/c0;


# static fields
.field public static final R:Lp0/l;


# instance fields
.field public O:Lp0/o;

.field public P:Laj/d;

.field public Q:Lh0/d2;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lp0/l;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lp0/n;->R:Lp0/l;

    return-void
.end method


# virtual methods
.method public final X0(Lp0/k;I)Z
    .locals 3

    const/4 v0, 0x5

    const/4 v1, 0x1

    if-ne p2, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x6

    if-ne p2, v0, :cond_1

    :goto_0
    iget-object v0, p0, Lp0/n;->Q:Lh0/d2;

    sget-object v2, Lh0/d2;->x:Lh0/d2;

    if-ne v0, v2, :cond_5

    goto :goto_4

    :cond_1
    const/4 v0, 0x3

    if-ne p2, v0, :cond_2

    goto :goto_1

    :cond_2
    const/4 v0, 0x4

    if-ne p2, v0, :cond_3

    :goto_1
    iget-object v0, p0, Lp0/n;->Q:Lh0/d2;

    sget-object v2, Lh0/d2;->w:Lh0/d2;

    if-ne v0, v2, :cond_5

    goto :goto_4

    :cond_3
    if-ne p2, v1, :cond_4

    goto :goto_2

    :cond_4
    const/4 v0, 0x2

    if-ne p2, v0, :cond_8

    :cond_5
    :goto_2
    invoke-virtual {p0, p2}, Lp0/n;->Y0(I)Z

    move-result p2

    if-eqz p2, :cond_6

    iget p1, p1, Lp0/k;->b:I

    iget-object p2, p0, Lp0/n;->O:Lp0/o;

    invoke-interface {p2}, Lp0/o;->getItemCount()I

    move-result p2

    sub-int/2addr p2, v1

    if-ge p1, p2, :cond_7

    goto :goto_3

    :cond_6
    iget p1, p1, Lp0/k;->a:I

    if-lez p1, :cond_7

    :goto_3
    return v1

    :cond_7
    :goto_4
    const/4 p1, 0x0

    return p1

    :cond_8
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Lazy list does not support beyond bounds layout for the specified direction"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final Y0(I)Z
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-ne p1, v1, :cond_0

    return v0

    :cond_0
    const/4 v2, 0x2

    if-ne p1, v2, :cond_1

    return v1

    :cond_1
    const/4 v2, 0x5

    if-ne p1, v2, :cond_2

    return v0

    :cond_2
    const/4 v2, 0x6

    if-ne p1, v2, :cond_3

    return v1

    :cond_3
    const/4 v2, 0x3

    if-ne p1, v2, :cond_6

    invoke-static {p0}, La3/g;->p(La3/n;)La3/n0;

    move-result-object p1

    iget-object p1, p1, La3/n0;->Y:Ly3/m;

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    if-eqz p1, :cond_5

    if-ne p1, v1, :cond_4

    return v1

    :cond_4
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_5
    return v0

    :cond_6
    const/4 v2, 0x4

    if-ne p1, v2, :cond_9

    invoke-static {p0}, La3/g;->p(La3/n;)La3/n0;

    move-result-object p1

    iget-object p1, p1, La3/n0;->Y:Ly3/m;

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    if-eqz p1, :cond_8

    if-ne p1, v1, :cond_7

    return v0

    :cond_7
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_8
    return v1

    :cond_9
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Lazy list does not support beyond bounds layout for the specified direction"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final b(Ly2/t0;Ly2/q0;J)Ly2/s0;
    .locals 2

    invoke-interface {p2, p3, p4}, Ly2/q0;->T(J)Ly2/j1;

    move-result-object p2

    iget p3, p2, Ly2/j1;->w:I

    iget p4, p2, Ly2/j1;->x:I

    new-instance v0, Lch/m;

    const/4 v1, 0x7

    invoke-direct {v0, p2, v1}, Lch/m;-><init>(Ly2/j1;I)V

    sget-object p2, Lm83/z;->w:Lm83/z;

    invoke-interface {p1, p3, p4, p2, v0}, Ly2/t0;->W(IILjava/util/Map;Lkotlin/jvm/functions/Function1;)Ly2/s0;

    move-result-object p1

    return-object p1
.end method

.method public final v()Lv63/c;
    .locals 2

    sget-object v0, Ly2/g;->a:Lz2/h;

    new-instance v1, Lz2/i;

    invoke-direct {v1, v0}, Lz2/i;-><init>(Lz2/h;)V

    iget-object v0, v1, Lz2/i;->b:Lp1/k1;

    invoke-virtual {v0, p0}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    return-object v1
.end method
