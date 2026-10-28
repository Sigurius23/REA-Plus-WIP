.class public final Lq1/d0;
.super Lq1/j0;
.source "SourceFile"


# static fields
.field public static final d:Lq1/d0;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lq1/d0;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v2}, Lq1/j0;-><init>(III)V

    sput-object v0, Lq1/d0;->d:Lq1/d0;

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

    if-eqz p2, :cond_0

    invoke-virtual {p2, p1}, La0/v0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lx1/e;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_2

    iget-object p2, p4, Lx1/h;->j:Ljava/util/ArrayList;

    if-nez p2, :cond_1

    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    iput-object p2, p4, Lx1/h;->j:Ljava/util/ArrayList;

    :cond_1
    iget-object p3, p4, Lx1/h;->e:Lr1/c;

    invoke-virtual {p2, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object p1, p1, Lx1/e;->x:Lr1/c;

    iput-object p1, p4, Lx1/h;->e:Lr1/c;

    :cond_2
    return-void
.end method
