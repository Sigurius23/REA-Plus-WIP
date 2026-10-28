.class public final Lq1/g;
.super Lq1/j0;
.source "SourceFile"


# static fields
.field public static final d:Lq1/g;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lq1/g;

    const/4 v1, 0x2

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-direct {v0, v3, v1, v2}, Lq1/j0;-><init>(III)V

    sput-object v0, Lq1/g;->d:Lq1/g;

    return-void
.end method


# virtual methods
.method public final d(Lb83/i;Lp1/c;Lp1/i2;Lx1/h;Lq1/k0;)V
    .locals 2

    const/4 p3, 0x0

    invoke-virtual {p1, p3}, Lb83/i;->c(I)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Lx1/d;

    iget p4, p4, Lx1/d;->a:I

    const/4 p5, 0x1

    invoke-virtual {p1, p5}, Lb83/i;->c(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    move-object p5, p1

    check-cast p5, Ljava/util/Collection;

    invoke-interface {p5}, Ljava/util/Collection;->size()I

    move-result p5

    :goto_0
    if-ge p3, p5, :cond_0

    invoke-interface {p1, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    add-int v1, p4, p3

    invoke-interface {p2, v1, v0}, Lp1/c;->k(ILjava/lang/Object;)V

    invoke-interface {p2, v1, v0}, Lp1/c;->g(ILjava/lang/Object;)V

    add-int/lit8 p3, p3, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method
