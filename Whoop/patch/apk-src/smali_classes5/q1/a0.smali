.class public final Lq1/a0;
.super Lq1/j0;
.source "SourceFile"


# static fields
.field public static final d:Lq1/a0;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lq1/a0;

    const/4 v1, 0x0

    const/4 v2, 0x3

    invoke-direct {v0, v1, v1, v2}, Lq1/j0;-><init>(III)V

    sput-object v0, Lq1/a0;->d:Lq1/a0;

    return-void
.end method


# virtual methods
.method public final d(Lb83/i;Lp1/c;Lp1/i2;Lx1/h;Lq1/k0;)V
    .locals 0

    iget p1, p3, Lp1/i2;->n:I

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const-string p1, "Cannot reset when inserting"

    invoke-static {p1}, Lp1/r;->c(Ljava/lang/String;)V

    :goto_0
    invoke-virtual {p3}, Lp1/i2;->F()V

    const/4 p1, 0x0

    iput p1, p3, Lp1/i2;->t:I

    invoke-virtual {p3}, Lp1/i2;->o()I

    move-result p2

    iget p4, p3, Lp1/i2;->h:I

    sub-int/2addr p2, p4

    iput p2, p3, Lp1/i2;->u:I

    iput p1, p3, Lp1/i2;->i:I

    iput p1, p3, Lp1/i2;->j:I

    iput p1, p3, Lp1/i2;->o:I

    return-void
.end method
