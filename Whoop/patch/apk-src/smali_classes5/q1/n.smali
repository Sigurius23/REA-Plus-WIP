.class public final Lq1/n;
.super Lq1/j0;
.source "SourceFile"


# static fields
.field public static final d:Lq1/n;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lq1/n;

    const/4 v1, 0x0

    const/4 v2, 0x3

    invoke-direct {v0, v1, v1, v2}, Lq1/j0;-><init>(III)V

    sput-object v0, Lq1/n;->d:Lq1/n;

    return-void
.end method


# virtual methods
.method public final d(Lb83/i;Lp1/c;Lp1/i2;Lx1/h;Lq1/k0;)V
    .locals 0

    const/4 p1, 0x0

    invoke-static {p3, p2, p1}, Lwb3/f;->Y(Lp1/i2;Lp1/c;I)V

    invoke-virtual {p3}, Lp1/i2;->j()V

    return-void
.end method
