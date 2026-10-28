.class public final Lq1/h0;
.super Lq1/j0;
.source "SourceFile"


# static fields
.field public static final d:Lq1/h0;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lq1/h0;

    const/4 v1, 0x0

    const/4 v2, 0x2

    const/4 v3, 0x1

    invoke-direct {v0, v3, v1, v2}, Lq1/j0;-><init>(III)V

    sput-object v0, Lq1/h0;->d:Lq1/h0;

    return-void
.end method


# virtual methods
.method public final d(Lb83/i;Lp1/c;Lp1/i2;Lx1/h;Lq1/k0;)V
    .locals 0

    const/4 p3, 0x0

    invoke-virtual {p1, p3}, Lb83/i;->b(I)I

    move-result p1

    :goto_0
    if-ge p3, p1, :cond_0

    invoke-interface {p2}, Lp1/c;->p()V

    add-int/lit8 p3, p3, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method
