.class public final Lq1/i;
.super Lq1/j0;
.source "SourceFile"


# static fields
.field public static final d:Lq1/i;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lq1/i;

    const/4 v1, 0x0

    const/4 v2, 0x3

    invoke-direct {v0, v1, v1, v2}, Lq1/j0;-><init>(III)V

    sput-object v0, Lq1/i;->d:Lq1/i;

    return-void
.end method


# virtual methods
.method public final d(Lb83/i;Lp1/c;Lp1/i2;Lx1/h;Lq1/k0;)V
    .locals 0

    iget p1, p3, Lp1/i2;->t:I

    new-instance p2, Lj21/d;

    const/16 p5, 0x1c

    invoke-direct {p2, p5, p4, p3}, Lj21/d;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p3, p1, p2}, Lp1/i2;->n(ILc93/m;)V

    return-void
.end method
