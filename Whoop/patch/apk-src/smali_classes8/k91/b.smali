.class public final Lk91/b;
.super Lt0/a;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000c\u0008\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J/\u0010\r\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\n\u001a\u00020\u00082\u0006\u0010\u000b\u001a\u00020\u00082\u0006\u0010\u000c\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000eJ?\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\u00112\u0006\u0010\u000c\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0012H\u0016\u00a2\u0006\u0004\u0008\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u0017\u001a\u0004\u0008\u0018\u0010\u0019R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u001a\u0010\u001b\u001a\u0004\u0008\u001c\u0010\u001d\"\u0004\u0008\u001e\u0010\u001f\u00a8\u0006 "
    }
    d2 = {
        "Lk91/b;",
        "Lt0/a;",
        "Lt0/i;",
        "roundRect",
        "Li2/s0;",
        "path",
        "<init>",
        "(Lt0/i;Li2/s0;)V",
        "Lt0/b;",
        "topStart",
        "topEnd",
        "bottomEnd",
        "bottomStart",
        "c",
        "(Lt0/b;Lt0/b;Lt0/b;Lt0/b;)Lt0/a;",
        "Lh2/e;",
        "size",
        "",
        "Ly3/m;",
        "layoutDirection",
        "Li2/p0;",
        "e",
        "(JFFFFLy3/m;)Li2/p0;",
        "Lt0/i;",
        "getRoundRect",
        "()Lt0/i;",
        "f",
        "Li2/s0;",
        "j",
        "()Li2/s0;",
        "setPath",
        "(Li2/s0;)V",
        "design_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final e:Lt0/i;

.field private f:Li2/s0;


# direct methods
.method public constructor <init>(Lt0/i;Li2/s0;)V
    .locals 4

    const-string v0, "roundRect"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "path"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-virtual {p1}, Lt0/a;->i()Lt0/b;

    move-result-object v0

    .line 4
    invoke-virtual {p1}, Lt0/a;->h()Lt0/b;

    move-result-object v1

    .line 5
    invoke-virtual {p1}, Lt0/a;->f()Lt0/b;

    move-result-object v2

    .line 6
    invoke-virtual {p1}, Lt0/a;->g()Lt0/b;

    move-result-object v3

    .line 7
    invoke-direct {p0, v0, v1, v2, v3}, Lt0/a;-><init>(Lt0/b;Lt0/b;Lt0/b;Lt0/b;)V

    .line 8
    iput-object p1, p0, Lk91/b;->e:Lt0/i;

    .line 9
    iput-object p2, p0, Lk91/b;->f:Li2/s0;

    return-void
.end method

.method public synthetic constructor <init>(Lt0/i;Li2/s0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    .line 1
    invoke-static {}, Li2/m;->a()Li2/j;

    move-result-object p2

    .line 2
    :cond_0
    invoke-direct {p0, p1, p2}, Lk91/b;-><init>(Lt0/i;Li2/s0;)V

    return-void
.end method


# virtual methods
.method public c(Lt0/b;Lt0/b;Lt0/b;Lt0/b;)Lt0/a;
    .locals 2

    const-string v0, "topStart"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "topEnd"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bottomEnd"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bottomStart"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lk91/b;

    new-instance v1, Lt0/i;

    invoke-direct {v1, p1, p2, p3, p4}, Lt0/a;-><init>(Lt0/b;Lt0/b;Lt0/b;Lt0/b;)V

    const/4 p1, 0x0

    const/4 p2, 0x2

    invoke-direct {v0, v1, p1, p2, p1}, Lk91/b;-><init>(Lt0/i;Li2/s0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method public e(JFFFFLy3/m;)Li2/p0;
    .locals 9

    const-string v0, "layoutDirection"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lk91/b;->e:Lt0/i;

    move-wide v2, p1

    move v4, p3

    move v5, p4

    move v6, p5

    move v7, p6

    invoke-virtual/range {v1 .. v8}, Lt0/i;->e(JFFFFLy3/m;)Li2/p0;

    move-result-object p3

    invoke-static {}, Li2/m;->a()Li2/j;

    move-result-object p4

    invoke-static {}, Li2/m;->a()Li2/j;

    move-result-object p5

    const/16 p6, 0x20

    shr-long/2addr p1, p6

    long-to-int p1, p1

    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p1

    const/high16 p2, 0x40000000    # 2.0f

    div-float/2addr p1, p2

    const/4 p2, 0x4

    int-to-float p2, p2

    mul-float/2addr p2, p2

    sub-float p6, p1, p2

    const/4 v0, 0x0

    invoke-virtual {p5, p6, v0}, Li2/j;->i(FF)V

    neg-float p6, p2

    invoke-virtual {p5, p1, p6}, Li2/j;->h(FF)V

    add-float/2addr p2, p1

    invoke-virtual {p5, p2, v0}, Li2/j;->h(FF)V

    invoke-virtual {p5, p1, p6}, Li2/j;->i(FF)V

    invoke-virtual {p5}, Li2/j;->f()V

    invoke-static {}, Li2/m;->a()Li2/j;

    move-result-object p1

    invoke-static {p1, p3}, Li2/w0;->n(Li2/j;Li2/p0;)V

    const/4 p2, 0x3

    invoke-virtual {p4, p1, p5, p2}, Li2/j;->j(Li2/s0;Li2/s0;I)Z

    iput-object p4, p0, Lk91/b;->f:Li2/s0;

    new-instance p1, Li2/m0;

    invoke-direct {p1, p4}, Li2/m0;-><init>(Li2/s0;)V

    return-object p1
.end method

.method public final j()Li2/s0;
    .locals 1

    iget-object v0, p0, Lk91/b;->f:Li2/s0;

    return-object v0
.end method
