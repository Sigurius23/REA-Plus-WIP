.class public final Lq1/v;
.super Lq1/j0;
.source "SourceFile"


# static fields
.field public static final d:Lq1/v;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lq1/v;

    const/4 v1, 0x0

    const/4 v2, 0x2

    const/4 v3, 0x3

    invoke-direct {v0, v3, v1, v2}, Lq1/j0;-><init>(III)V

    sput-object v0, Lq1/v;->d:Lq1/v;

    return-void
.end method


# virtual methods
.method public final d(Lb83/i;Lp1/c;Lp1/i2;Lx1/h;Lq1/k0;)V
    .locals 0

    const/4 p3, 0x0

    invoke-virtual {p1, p3}, Lb83/i;->b(I)I

    move-result p3

    const/4 p4, 0x1

    invoke-virtual {p1, p4}, Lb83/i;->b(I)I

    move-result p4

    const/4 p5, 0x2

    invoke-virtual {p1, p5}, Lb83/i;->b(I)I

    move-result p1

    invoke-interface {p2, p3, p4, p1}, Lp1/c;->e(III)V

    return-void
.end method
