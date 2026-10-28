.class public final Lq1/s;
.super Lq1/j0;
.source "SourceFile"


# static fields
.field public static final d:Lq1/s;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lq1/s;

    const/4 v1, 0x2

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-direct {v0, v3, v1, v2}, Lq1/j0;-><init>(III)V

    sput-object v0, Lq1/s;->d:Lq1/s;

    return-void
.end method


# virtual methods
.method public final d(Lb83/i;Lp1/c;Lp1/i2;Lx1/h;Lq1/k0;)V
    .locals 0

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Lb83/i;->c(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lp1/f2;

    const/4 p4, 0x0

    invoke-virtual {p1, p4}, Lb83/i;->c(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lp1/a;

    invoke-virtual {p3}, Lp1/i2;->d()V

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2, p1}, Lp1/f2;->a(Lp1/a;)I

    move-result p1

    invoke-virtual {p3, p2, p1}, Lp1/i2;->z(Lp1/f2;I)V

    invoke-virtual {p3}, Lp1/i2;->k()V

    return-void
.end method
