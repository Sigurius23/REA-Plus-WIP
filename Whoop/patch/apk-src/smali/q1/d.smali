.class public final Lq1/d;
.super Lq1/j0;
.source "SourceFile"


# static fields
.field public static final d:Lq1/d;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lq1/d;

    const/4 v1, 0x0

    const/4 v2, 0x2

    const/4 v3, 0x1

    invoke-direct {v0, v3, v1, v2}, Lq1/j0;-><init>(III)V

    sput-object v0, Lq1/d;->d:Lq1/d;

    return-void
.end method


# virtual methods
.method public final d(Lb83/i;Lp1/c;Lp1/i2;Lx1/h;Lq1/k0;)V
    .locals 0

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lb83/i;->b(I)I

    move-result p1

    invoke-virtual {p3, p1}, Lp1/i2;->a(I)V

    return-void
.end method
