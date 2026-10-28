.class public final Lu0/n1;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final g:Lp0/n0;


# instance fields
.field public final a:Lp1/g1;

.field public final b:Lp1/g1;

.field public final c:Lp1/h1;

.field public d:Lh2/c;

.field public e:J

.field public final f:Lp1/k1;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lsl0/b2;

    const/16 v1, 0x9

    invoke-direct {v0, v1}, Lsl0/b2;-><init>(I)V

    new-instance v1, Lu0/r;

    const/16 v2, 0x8

    invoke-direct {v1, v2}, Lu0/r;-><init>(I)V

    invoke-static {v0, v1}, Ly1/k;->b(Lc93/m;Lkotlin/jvm/functions/Function1;)Lp0/n0;

    move-result-object v0

    sput-object v0, Lu0/n1;->g:Lp0/n0;

    return-void
.end method

.method public constructor <init>(Lh0/d2;F)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lp1/g1;

    invoke-direct {v0, p2}, Lp1/g1;-><init>(F)V

    iput-object v0, p0, Lu0/n1;->a:Lp1/g1;

    new-instance p2, Lp1/g1;

    const/4 v0, 0x0

    invoke-direct {p2, v0}, Lp1/g1;-><init>(F)V

    iput-object p2, p0, Lu0/n1;->b:Lp1/g1;

    new-instance p2, Lp1/h1;

    const/4 v0, 0x0

    invoke-direct {p2, v0}, Lp1/h1;-><init>(I)V

    iput-object p2, p0, Lu0/n1;->c:Lp1/h1;

    sget-object p2, Lh2/c;->e:Lh2/c;

    iput-object p2, p0, Lu0/n1;->d:Lh2/c;

    sget-wide v0, Ll3/u0;->b:J

    iput-wide v0, p0, Lu0/n1;->e:J

    sget-object p2, Lp1/v0;->F:Lp1/v0;

    new-instance v0, Lp1/k1;

    invoke-direct {v0, p1, p2}, Lp1/k1;-><init>(Ljava/lang/Object;Lp1/o2;)V

    iput-object v0, p0, Lu0/n1;->f:Lp1/k1;

    return-void
.end method


# virtual methods
.method public final a(Lh0/d2;Lh2/c;II)V
    .locals 8

    sub-int/2addr p4, p3

    int-to-float p4, p4

    iget-object v0, p0, Lu0/n1;->b:Lp1/g1;

    invoke-virtual {v0, p4}, Lp1/g1;->y(F)V

    iget v0, p2, Lh2/c;->a:F

    iget v1, p2, Lh2/c;->b:F

    iget-object v2, p0, Lu0/n1;->d:Lh2/c;

    iget v3, v2, Lh2/c;->a:F

    cmpg-float v3, v0, v3

    iget-object v4, p0, Lu0/n1;->a:Lp1/g1;

    const/4 v5, 0x0

    if-nez v3, :cond_0

    iget v2, v2, Lh2/c;->b:F

    cmpg-float v2, v1, v2

    if-nez v2, :cond_0

    goto :goto_4

    :cond_0
    sget-object v2, Lh0/d2;->w:Lh0/d2;

    if-ne p1, v2, :cond_1

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_2

    move v0, v1

    :cond_2
    if-eqz p1, :cond_3

    iget p1, p2, Lh2/c;->d:F

    goto :goto_1

    :cond_3
    iget p1, p2, Lh2/c;->c:F

    :goto_1
    invoke-virtual {v4}, Lp1/g1;->x()F

    move-result v1

    int-to-float v2, p3

    add-float v3, v1, v2

    cmpl-float v6, p1, v3

    if-lez v6, :cond_4

    :goto_2
    sub-float/2addr p1, v3

    goto :goto_3

    :cond_4
    cmpg-float v6, v0, v1

    if-gez v6, :cond_5

    sub-float v7, p1, v0

    cmpl-float v7, v7, v2

    if-lez v7, :cond_5

    goto :goto_2

    :cond_5
    if-gez v6, :cond_6

    sub-float/2addr p1, v0

    cmpg-float p1, p1, v2

    if-gtz p1, :cond_6

    sub-float p1, v0, v1

    goto :goto_3

    :cond_6
    move p1, v5

    :goto_3
    invoke-virtual {v4}, Lp1/g1;->x()F

    move-result v0

    add-float/2addr v0, p1

    invoke-virtual {v4, v0}, Lp1/g1;->y(F)V

    iput-object p2, p0, Lu0/n1;->d:Lh2/c;

    :goto_4
    invoke-virtual {v4}, Lp1/g1;->x()F

    move-result p1

    invoke-static {p1, v5, p4}, Le93/b;->m(FFF)F

    move-result p1

    invoke-virtual {v4, p1}, Lp1/g1;->y(F)V

    iget-object p1, p0, Lu0/n1;->c:Lp1/h1;

    invoke-virtual {p1, p3}, Lp1/h1;->y(I)V

    return-void
.end method
