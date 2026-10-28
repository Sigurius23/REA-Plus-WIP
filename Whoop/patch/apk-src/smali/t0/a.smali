.class public abstract Lt0/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li2/a1;


# instance fields
.field private final a:Lt0/b;

.field private final b:Lt0/b;

.field private final c:Lt0/b;

.field private final d:Lt0/b;


# direct methods
.method public constructor <init>(Lt0/b;Lt0/b;Lt0/b;Lt0/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt0/a;->a:Lt0/b;

    iput-object p2, p0, Lt0/a;->b:Lt0/b;

    iput-object p3, p0, Lt0/a;->c:Lt0/b;

    iput-object p4, p0, Lt0/a;->d:Lt0/b;

    return-void
.end method

.method public static synthetic d(Lt0/a;Lt0/b;Lt0/b;Lt0/b;Lt0/b;ILjava/lang/Object;)Lt0/a;
    .locals 0

    if-nez p6, :cond_4

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Lt0/a;->a:Lt0/b;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Lt0/a;->b:Lt0/b;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, Lt0/a;->c:Lt0/b;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, Lt0/a;->d:Lt0/b;

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lt0/a;->c(Lt0/b;Lt0/b;Lt0/b;Lt0/b;)Lt0/a;

    move-result-object p0

    return-object p0

    :cond_4
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: copy"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final a(JLy3/m;Ly3/c;)Li2/p0;
    .locals 10

    iget-object v4, p0, Lt0/a;->a:Lt0/b;

    invoke-interface {v4, p1, p2, p4}, Lt0/b;->a(JLy3/c;)F

    move-result v4

    iget-object v5, p0, Lt0/a;->b:Lt0/b;

    invoke-interface {v5, p1, p2, p4}, Lt0/b;->a(JLy3/c;)F

    move-result v5

    iget-object v6, p0, Lt0/a;->c:Lt0/b;

    invoke-interface {v6, p1, p2, p4}, Lt0/b;->a(JLy3/c;)F

    move-result v6

    iget-object v7, p0, Lt0/a;->d:Lt0/b;

    invoke-interface {v7, p1, p2, p4}, Lt0/b;->a(JLy3/c;)F

    move-result v3

    invoke-static {p1, p2}, Lh2/e;->d(J)F

    move-result v7

    add-float v8, v4, v3

    cmpl-float v9, v8, v7

    if-lez v9, :cond_0

    div-float v8, v7, v8

    mul-float/2addr v4, v8

    mul-float/2addr v3, v8

    :cond_0
    add-float v8, v5, v6

    cmpl-float v9, v8, v7

    if-lez v9, :cond_1

    div-float/2addr v7, v8

    mul-float/2addr v5, v7

    mul-float/2addr v6, v7

    :cond_1
    const/4 v7, 0x0

    cmpl-float v8, v4, v7

    if-ltz v8, :cond_2

    cmpl-float v8, v5, v7

    if-ltz v8, :cond_2

    cmpl-float v8, v6, v7

    if-ltz v8, :cond_2

    cmpl-float v7, v3, v7

    if-ltz v7, :cond_2

    :goto_0
    move v0, v6

    move v6, v3

    move v3, v4

    move v4, v5

    move v5, v0

    move-object v0, p0

    move-wide v1, p1

    move-object v7, p3

    goto :goto_1

    :cond_2
    const-string v7, ", topEnd = "

    const-string v8, ", bottomEnd = "

    const-string v9, "Corner size in Px can\'t be negative(topStart = "

    invoke-static {v9, v4, v7, v5, v8}, Lb9/y;->t(Ljava/lang/String;FLjava/lang/String;FLjava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v8, ", bottomStart = "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v8, ")!"

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lk0/a;->a(Ljava/lang/String;)V

    goto :goto_0

    :goto_1
    invoke-virtual/range {v0 .. v7}, Lt0/a;->e(JFFFFLy3/m;)Li2/p0;

    move-result-object v1

    return-object v1
.end method

.method public final b(Lt0/b;)Lt0/a;
    .locals 0

    invoke-virtual {p0, p1, p1, p1, p1}, Lt0/a;->c(Lt0/b;Lt0/b;Lt0/b;Lt0/b;)Lt0/a;

    move-result-object p1

    return-object p1
.end method

.method public abstract c(Lt0/b;Lt0/b;Lt0/b;Lt0/b;)Lt0/a;
.end method

.method public abstract e(JFFFFLy3/m;)Li2/p0;
.end method

.method public final f()Lt0/b;
    .locals 1

    iget-object v0, p0, Lt0/a;->c:Lt0/b;

    return-object v0
.end method

.method public final g()Lt0/b;
    .locals 1

    iget-object v0, p0, Lt0/a;->d:Lt0/b;

    return-object v0
.end method

.method public final h()Lt0/b;
    .locals 1

    iget-object v0, p0, Lt0/a;->b:Lt0/b;

    return-object v0
.end method

.method public final i()Lt0/b;
    .locals 1

    iget-object v0, p0, Lt0/a;->a:Lt0/b;

    return-object v0
.end method
