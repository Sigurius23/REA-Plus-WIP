.class public final Lq1/x;
.super Lq1/j0;
.source "SourceFile"


# static fields
.field public static final d:Lq1/x;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lq1/x;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v2}, Lq1/j0;-><init>(III)V

    sput-object v0, Lq1/x;->d:Lq1/x;

    return-void
.end method


# virtual methods
.method public final d(Lb83/i;Lp1/c;Lp1/i2;Lx1/h;Lq1/k0;)V
    .locals 0

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lb83/i;->c(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lp1/v1;

    iget-object p2, p4, Lx1/h;->a:Ljava/util/Set;

    if-nez p2, :cond_0

    return-void

    :cond_0
    new-instance p3, Lx1/e;

    invoke-direct {p3, p2}, Lx1/e;-><init>(Ljava/util/Set;)V

    iget-object p2, p4, Lx1/h;->i:La0/v0;

    if-nez p2, :cond_1

    sget-object p2, La0/d1;->a:[J

    new-instance p2, La0/v0;

    invoke-direct {p2}, La0/v0;-><init>()V

    iput-object p2, p4, Lx1/h;->i:La0/v0;

    :cond_1
    invoke-virtual {p2, p1, p3}, La0/v0;->m(Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object p1, p4, Lx1/h;->e:Lr1/c;

    new-instance p2, Lp1/a2;

    const/4 p4, 0x0

    invoke-direct {p2, p3, p4}, Lp1/a2;-><init>(Lp1/z1;Lp1/a;)V

    invoke-virtual {p1, p2}, Lr1/c;->b(Ljava/lang/Object;)V

    return-void
.end method
