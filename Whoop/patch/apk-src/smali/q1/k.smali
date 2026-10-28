.class public final Lq1/k;
.super Lq1/j0;
.source "SourceFile"


# static fields
.field public static final d:Lq1/k;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lq1/k;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v2}, Lq1/j0;-><init>(III)V

    sput-object v0, Lq1/k;->d:Lq1/k;

    return-void
.end method


# virtual methods
.method public final d(Lb83/i;Lp1/c;Lp1/i2;Lx1/h;Lq1/k0;)V
    .locals 0

    const/4 p3, 0x0

    invoke-virtual {p1, p3}, Lb83/i;->c(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/lang/Object;

    array-length p4, p1

    :goto_0
    if-ge p3, p4, :cond_0

    aget-object p5, p1, p3

    invoke-interface {p2, p5}, Lp1/c;->l(Ljava/lang/Object;)V

    add-int/lit8 p3, p3, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method
