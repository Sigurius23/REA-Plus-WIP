.class public final Lq1/o;
.super Lq1/j0;
.source "SourceFile"


# static fields
.field public static final d:Lq1/o;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lq1/o;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v2}, Lq1/j0;-><init>(III)V

    sput-object v0, Lq1/o;->d:Lq1/o;

    return-void
.end method


# virtual methods
.method public final d(Lb83/i;Lp1/c;Lp1/i2;Lx1/h;Lq1/k0;)V
    .locals 0

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lb83/i;->c(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lp1/v1;

    iget-object p2, p4, Lx1/h;->i:La0/v0;

    if-eqz p2, :cond_1

    invoke-virtual {p2, p1}, La0/v0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lx1/e;

    if-eqz p3, :cond_1

    iget-object p3, p4, Lx1/h;->j:Ljava/util/ArrayList;

    if-eqz p3, :cond_0

    invoke-virtual {p3}, Ljava/util/ArrayList;->size()I

    move-result p5

    add-int/lit8 p5, p5, -0x1

    invoke-virtual {p3, p5}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lr1/c;

    if-eqz p3, :cond_0

    iput-object p3, p4, Lx1/h;->e:Lr1/c;

    :cond_0
    invoke-virtual {p2, p1}, La0/v0;->k(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-void
.end method
