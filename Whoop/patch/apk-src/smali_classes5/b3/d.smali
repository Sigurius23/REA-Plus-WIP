.class public final Lb3/d;
.super Lb3/b;
.source "SourceFile"


# static fields
.field public static e:Lb3/d;

.field public static final f:Lw3/j;

.field public static final g:Lw3/j;


# instance fields
.field public d:Ll3/r0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lw3/j;->x:Lw3/j;

    sput-object v0, Lb3/d;->f:Lw3/j;

    sget-object v0, Lw3/j;->w:Lw3/j;

    sput-object v0, Lb3/d;->g:Lw3/j;

    return-void
.end method


# virtual methods
.method public final C(I)[I
    .locals 4

    invoke-virtual {p0}, Lb3/b;->u()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    if-gtz v0, :cond_0

    return-object v1

    :cond_0
    if-gtz p1, :cond_1

    return-object v1

    :cond_1
    invoke-virtual {p0}, Lb3/b;->u()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    sget-object v2, Lb3/d;->g:Lw3/j;

    const-string v3, "layoutResult"

    if-le p1, v0, :cond_3

    iget-object p1, p0, Lb3/d;->d:Ll3/r0;

    if-eqz p1, :cond_2

    invoke-virtual {p0}, Lb3/b;->u()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    iget-object p1, p1, Ll3/r0;->b:Ll3/w;

    invoke-virtual {p1, v0}, Ll3/w;->d(I)I

    move-result p1

    goto :goto_0

    :cond_2
    invoke-static {v3}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_3
    iget-object v0, p0, Lb3/d;->d:Ll3/r0;

    if-eqz v0, :cond_6

    iget-object v0, v0, Ll3/r0;->b:Ll3/w;

    invoke-virtual {v0, p1}, Ll3/w;->d(I)I

    move-result v0

    invoke-virtual {p0, v0, v2}, Lb3/d;->L(ILw3/j;)I

    move-result v3

    add-int/lit8 v3, v3, 0x1

    if-ne v3, p1, :cond_4

    move p1, v0

    goto :goto_0

    :cond_4
    add-int/lit8 p1, v0, -0x1

    :goto_0
    if-gez p1, :cond_5

    return-object v1

    :cond_5
    sget-object v0, Lb3/d;->f:Lw3/j;

    invoke-virtual {p0, p1, v0}, Lb3/d;->L(ILw3/j;)I

    move-result v0

    invoke-virtual {p0, p1, v2}, Lb3/d;->L(ILw3/j;)I

    move-result p1

    add-int/lit8 p1, p1, 0x1

    invoke-virtual {p0, v0, p1}, Lb3/b;->s(II)[I

    move-result-object p1

    return-object p1

    :cond_6
    invoke-static {v3}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1
.end method

.method public final L(ILw3/j;)I
    .locals 4

    iget-object v0, p0, Lb3/d;->d:Ll3/r0;

    const/4 v1, 0x0

    const-string v2, "layoutResult"

    if-eqz v0, :cond_4

    invoke-virtual {v0, p1}, Ll3/r0;->h(I)I

    move-result v0

    iget-object v3, p0, Lb3/d;->d:Ll3/r0;

    if-eqz v3, :cond_3

    invoke-virtual {v3, v0}, Ll3/r0;->i(I)Lw3/j;

    move-result-object v0

    if-eq p2, v0, :cond_1

    iget-object p2, p0, Lb3/d;->d:Ll3/r0;

    if-eqz p2, :cond_0

    invoke-virtual {p2, p1}, Ll3/r0;->h(I)I

    move-result p1

    return p1

    :cond_0
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_1
    iget-object p2, p0, Lb3/d;->d:Ll3/r0;

    if-eqz p2, :cond_2

    const/4 v0, 0x0

    iget-object p2, p2, Ll3/r0;->b:Ll3/w;

    invoke-virtual {p2, p1, v0}, Ll3/w;->c(IZ)I

    move-result p1

    add-int/lit8 p1, p1, -0x1

    return p1

    :cond_2
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_3
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_4
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1
.end method

.method public final M(Ljava/lang/String;Ll3/r0;)V
    .locals 0

    iput-object p1, p0, Lb3/b;->b:Ljava/lang/Object;

    iput-object p2, p0, Lb3/d;->d:Ll3/r0;

    return-void
.end method

.method public final n(I)[I
    .locals 5

    invoke-virtual {p0}, Lb3/b;->u()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    if-gtz v0, :cond_0

    return-object v1

    :cond_0
    invoke-virtual {p0}, Lb3/b;->u()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-lt p1, v0, :cond_1

    return-object v1

    :cond_1
    sget-object v0, Lb3/d;->f:Lw3/j;

    const-string v2, "layoutResult"

    if-gez p1, :cond_3

    iget-object p1, p0, Lb3/d;->d:Ll3/r0;

    if-eqz p1, :cond_2

    const/4 v3, 0x0

    iget-object p1, p1, Ll3/r0;->b:Ll3/w;

    invoke-virtual {p1, v3}, Ll3/w;->d(I)I

    move-result p1

    goto :goto_0

    :cond_2
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_3
    iget-object v3, p0, Lb3/d;->d:Ll3/r0;

    if-eqz v3, :cond_7

    iget-object v3, v3, Ll3/r0;->b:Ll3/w;

    invoke-virtual {v3, p1}, Ll3/w;->d(I)I

    move-result v3

    invoke-virtual {p0, v3, v0}, Lb3/d;->L(ILw3/j;)I

    move-result v4

    if-ne v4, p1, :cond_4

    move p1, v3

    goto :goto_0

    :cond_4
    add-int/lit8 p1, v3, 0x1

    :goto_0
    iget-object v3, p0, Lb3/d;->d:Ll3/r0;

    if-eqz v3, :cond_6

    iget-object v2, v3, Ll3/r0;->b:Ll3/w;

    iget v2, v2, Ll3/w;->f:I

    if-lt p1, v2, :cond_5

    return-object v1

    :cond_5
    invoke-virtual {p0, p1, v0}, Lb3/d;->L(ILw3/j;)I

    move-result v0

    sget-object v1, Lb3/d;->g:Lw3/j;

    invoke-virtual {p0, p1, v1}, Lb3/d;->L(ILw3/j;)I

    move-result p1

    add-int/lit8 p1, p1, 0x1

    invoke-virtual {p0, v0, p1}, Lb3/b;->s(II)[I

    move-result-object p1

    return-object p1

    :cond_6
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_7
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1
.end method
