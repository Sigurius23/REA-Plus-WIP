.class public final Ll1/h1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll1/g1;


# instance fields
.field public final a:Li93/j;

.field public final b:Ljava/util/Locale;

.field public final c:Lm1/q;

.field public final d:Lp1/k1;

.field public final e:Lp1/k1;

.field public final f:Lp1/k1;

.field public final g:Lp1/k1;


# direct methods
.method public constructor <init>(Ljava/lang/Long;Ljava/lang/Long;Li93/j;ILl1/n3;Ljava/util/Locale;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p3, p0, Ll1/h1;->a:Li93/j;

    iput-object p6, p0, Ll1/h1;->b:Ljava/util/Locale;

    new-instance v0, Lm1/q;

    invoke-direct {v0, p6}, Lm1/q;-><init>(Ljava/util/Locale;)V

    iput-object v0, p0, Ll1/h1;->c:Lm1/q;

    invoke-static {p5}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object p5

    iput-object p5, p0, Ll1/h1;->d:Lp1/k1;

    const/4 p5, 0x1

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lm1/q;->a(J)Lm1/r;

    move-result-object p2

    iget p6, p2, Lm1/r;->a:I

    invoke-virtual {p3, p6}, Li93/j;->e(I)Z

    move-result p6

    if-nez p6, :cond_1

    invoke-virtual {v0}, Lm1/q;->b()Lm1/n;

    move-result-object p2

    iget p6, p2, Lm1/n;->w:I

    iget p2, p2, Lm1/n;->x:I

    invoke-static {p6, p2, p5}, Ljava/time/LocalDate;->of(III)Ljava/time/LocalDate;

    move-result-object p2

    invoke-virtual {v0, p2}, Lm1/q;->e(Ljava/time/LocalDate;)Lm1/r;

    move-result-object p2

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lm1/q;->b()Lm1/n;

    move-result-object p2

    iget p6, p2, Lm1/n;->w:I

    iget p2, p2, Lm1/n;->x:I

    invoke-static {p6, p2, p5}, Ljava/time/LocalDate;->of(III)Ljava/time/LocalDate;

    move-result-object p2

    invoke-virtual {v0, p2}, Lm1/q;->e(Ljava/time/LocalDate;)Lm1/r;

    move-result-object p2

    :cond_1
    :goto_0
    invoke-static {p2}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object p2

    iput-object p2, p0, Ll1/h1;->e:Lp1/k1;

    const/4 p2, 0x0

    if-eqz p1, :cond_2

    iget-object p5, p0, Ll1/h1;->c:Lm1/q;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-virtual {p5, v0, v1}, Lm1/q;->d(J)Lm1/n;

    move-result-object p1

    iget p5, p1, Lm1/n;->w:I

    invoke-virtual {p3, p5}, Li93/j;->e(I)Z

    move-result p3

    if-eqz p3, :cond_2

    move-object p2, p1

    :cond_2
    invoke-static {p2}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object p1

    iput-object p1, p0, Ll1/h1;->f:Lp1/k1;

    new-instance p1, Ll1/k1;

    invoke-direct {p1, p4}, Ll1/k1;-><init>(I)V

    invoke-static {p1}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object p1

    iput-object p1, p0, Ll1/h1;->g:Lp1/k1;

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget-object v0, p0, Ll1/h1;->g:Lp1/k1;

    invoke-virtual {v0}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll1/k1;

    iget v0, v0, Ll1/k1;->a:I

    return v0
.end method

.method public final b()Ljava/lang/Long;
    .locals 2

    iget-object v0, p0, Ll1/h1;->f:Lp1/k1;

    invoke-virtual {v0}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lm1/n;

    if-eqz v0, :cond_0

    iget-wide v0, v0, Lm1/n;->z:J

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method
