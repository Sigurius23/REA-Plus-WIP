.class public final Lq1/g0;
.super Lq1/j0;
.source "SourceFile"


# static fields
.field public static final d:Lq1/g0;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lq1/g0;

    const/4 v1, 0x2

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-direct {v0, v3, v1, v2}, Lq1/j0;-><init>(III)V

    sput-object v0, Lq1/g0;->d:Lq1/g0;

    return-void
.end method


# virtual methods
.method public final d(Lb83/i;Lp1/c;Lp1/i2;Lx1/h;Lq1/k0;)V
    .locals 0

    const/4 p3, 0x0

    invoke-virtual {p1, p3}, Lb83/i;->c(I)Ljava/lang/Object;

    move-result-object p3

    const/4 p4, 0x1

    invoke-virtual {p1, p4}, Lb83/i;->c(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lc93/m;

    invoke-interface {p2, p3, p1}, Lp1/c;->d(Ljava/lang/Object;Lc93/m;)V

    return-void
.end method
