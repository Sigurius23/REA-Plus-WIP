.class public abstract Lq1/j0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final b:I

.field public final c:I


# direct methods
.method public synthetic constructor <init>(III)V
    .locals 2

    const/4 v0, 0x0

    iput v0, p0, Lq1/j0;->a:I

    and-int/lit8 v0, p3, 0x1

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move p1, v1

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    move p2, v1

    :cond_1
    const/4 p3, 0x0

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, p3, v0}, Lq1/j0;-><init>(IIIB)V

    return-void
.end method

.method public synthetic constructor <init>(IIIB)V
    .locals 0

    .line 1
    iput p3, p0, Lq1/j0;->a:I

    iput p1, p0, Lq1/j0;->b:I

    iput p2, p0, Lq1/j0;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Lq1/j0;[Lwa3/q;)Lsa3/c;
    .locals 1

    iget v0, p0, Lq1/j0;->b:I

    iget p0, p0, Lq1/j0;->c:I

    add-int/2addr v0, p0

    new-instance p0, Lsa3/c;

    invoke-direct {p0, v0, p1}, Lsa3/c;-><init>(I[Lwa3/q;)V

    return-object p0
.end method

.method public static b(Lq1/j0;)Lsa3/b;
    .locals 4

    iget v0, p0, Lq1/j0;->b:I

    iget p0, p0, Lq1/j0;->c:I

    add-int/2addr v0, p0

    new-instance p0, Lsa3/b;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-direct {p0, v0, v3, v1, v2}, Lq1/j0;-><init>(IIIB)V

    return-object p0
.end method

.method public static c()Lsa3/b;
    .locals 5

    new-instance v0, Lsa3/b;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x1

    invoke-direct {v0, v3, v4, v1, v2}, Lq1/j0;-><init>(IIIB)V

    return-object v0
.end method


# virtual methods
.method public abstract d(Lb83/i;Lp1/c;Lp1/i2;Lx1/h;Lq1/k0;)V
.end method

.method public abstract e(I)Ljava/lang/Object;
.end method

.method public f(Lb83/i;)Lp1/a;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    iget v0, p0, Lq1/j0;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-interface {v0}, Lj93/d;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    const-string v0, ""

    :cond_0
    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
