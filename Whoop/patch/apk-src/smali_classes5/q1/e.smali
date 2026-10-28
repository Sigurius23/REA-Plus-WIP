.class public final Lq1/e;
.super Lq1/j0;
.source "SourceFile"


# static fields
.field public static final d:Lq1/e;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lq1/e;

    const/4 v1, 0x2

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-direct {v0, v3, v1, v2}, Lq1/j0;-><init>(III)V

    sput-object v0, Lq1/e;->d:Lq1/e;

    return-void
.end method


# virtual methods
.method public final d(Lb83/i;Lp1/c;Lp1/i2;Lx1/h;Lq1/k0;)V
    .locals 3

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lb83/i;->c(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lp1/a;

    const/4 p5, 0x1

    invoke-virtual {p1, p5}, Lb83/i;->c(I)Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Lp1/a2;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lp1/a2;

    iget-object v1, p4, Lx1/h;->e:Lr1/c;

    invoke-virtual {v1, v0}, Lr1/c;->b(Ljava/lang/Object;)V

    iget-object p4, p4, Lx1/h;->d:La0/w0;

    invoke-virtual {p4, v0}, La0/w0;->a(Ljava/lang/Object;)Z

    :cond_0
    iget p4, p3, Lp1/i2;->n:I

    if-nez p4, :cond_1

    goto :goto_0

    :cond_1
    const-string p4, "Can only append a slot if not current inserting"

    invoke-static {p4}, Lp1/r;->c(Ljava/lang/String;)V

    :goto_0
    iget p4, p3, Lp1/i2;->i:I

    iget v0, p3, Lp1/i2;->j:I

    invoke-virtual {p3, p2}, Lp1/i2;->c(Lp1/a;)I

    move-result p2

    iget-object v1, p3, Lp1/i2;->b:[I

    add-int/lit8 v2, p2, 0x1

    invoke-virtual {p3, v2}, Lp1/i2;->r(I)I

    move-result v2

    invoke-virtual {p3, v1, v2}, Lp1/i2;->g([II)I

    move-result v1

    iput v1, p3, Lp1/i2;->i:I

    iput v1, p3, Lp1/i2;->j:I

    invoke-virtual {p3, p5, p2}, Lp1/i2;->w(II)V

    if-lt p4, v1, :cond_2

    add-int/lit8 p4, p4, 0x1

    add-int/lit8 v0, v0, 0x1

    :cond_2
    iget-object p2, p3, Lp1/i2;->c:[Ljava/lang/Object;

    aput-object p1, p2, v1

    iput p4, p3, Lp1/i2;->i:I

    iput v0, p3, Lp1/i2;->j:I

    return-void
.end method
