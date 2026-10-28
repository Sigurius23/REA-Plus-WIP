.class public final Lq1/y;
.super Lq1/j0;
.source "SourceFile"


# static fields
.field public static final d:Lq1/y;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lq1/y;

    const/4 v1, 0x0

    const/4 v2, 0x3

    invoke-direct {v0, v1, v1, v2}, Lq1/j0;-><init>(III)V

    sput-object v0, Lq1/y;->d:Lq1/y;

    return-void
.end method


# virtual methods
.method public final d(Lb83/i;Lp1/c;Lp1/i2;Lx1/h;Lq1/k0;)V
    .locals 0

    iget p1, p3, Lp1/i2;->t:I

    new-instance p2, Lc41/l3;

    const/16 p5, 0xa

    invoke-direct {p2, p4, p5}, Lc41/l3;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p3, p1, p2}, Lp1/i2;->n(ILc93/m;)V

    invoke-virtual {p3}, Lp1/i2;->G()Z

    return-void
.end method
