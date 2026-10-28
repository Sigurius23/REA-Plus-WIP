.class public final Lya3/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# static fields
.field public static final w:Lya3/i;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lya3/i;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lya3/i;->w:Lya3/i;

    return-void
.end method

.method public static a(Lr93/k;)I
    .locals 1

    if-eqz p0, :cond_8

    sget v0, Lya3/f;->a:I

    sget-object v0, Lr93/f;->z:Lr93/f;

    invoke-static {p0, v0}, Lya3/f;->l(Lr93/k;Lr93/f;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/16 p0, 0x8

    return p0

    :cond_0
    instance-of v0, p0, Lr93/j;

    if-eqz v0, :cond_1

    const/4 p0, 0x7

    return p0

    :cond_1
    instance-of v0, p0, Lr93/n0;

    if-eqz v0, :cond_3

    check-cast p0, Lr93/n0;

    invoke-interface {p0}, Lr93/b;->B()Lr93/q0;

    move-result-object p0

    if-nez p0, :cond_2

    const/4 p0, 0x6

    return p0

    :cond_2
    const/4 p0, 0x5

    return p0

    :cond_3
    instance-of v0, p0, Lr93/w;

    if-eqz v0, :cond_5

    check-cast p0, Lr93/w;

    invoke-interface {p0}, Lr93/b;->B()Lr93/q0;

    move-result-object p0

    if-nez p0, :cond_4

    const/4 p0, 0x4

    return p0

    :cond_4
    const/4 p0, 0x3

    return p0

    :cond_5
    instance-of v0, p0, Lr93/e;

    if-eqz v0, :cond_6

    const/4 p0, 0x2

    return p0

    :cond_6
    instance-of p0, p0, Lr93/w0;

    if-eqz p0, :cond_7

    const/4 p0, 0x1

    return p0

    :cond_7
    const/4 p0, 0x0

    return p0

    :cond_8
    const/16 p0, 0x24

    invoke-static {p0}, Lya3/f;->a(I)V

    const/4 p0, 0x0

    throw p0
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 3

    check-cast p1, Lr93/k;

    check-cast p2, Lr93/k;

    invoke-static {p2}, Lya3/i;->a(Lr93/k;)I

    move-result v0

    invoke-static {p1}, Lya3/i;->a(Lr93/k;)I

    move-result v1

    sub-int/2addr v0, v1

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    goto :goto_0

    :cond_0
    sget-object v0, Lr93/f;->z:Lr93/f;

    invoke-static {p1, v0}, Lya3/f;->l(Lr93/k;Lr93/f;)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-static {p2, v0}, Lya3/f;->l(Lr93/k;Lr93/f;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    goto :goto_0

    :cond_1
    invoke-interface {p1}, Lr93/k;->getName()Lva3/h;

    move-result-object p1

    invoke-interface {p2}, Lr93/k;->getName()Lva3/h;

    move-result-object p2

    iget-object p1, p1, Lva3/h;->w:Ljava/lang/String;

    iget-object p2, p2, Lva3/h;->w:Ljava/lang/String;

    invoke-virtual {p1, p2}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result p1

    if-eqz p1, :cond_2

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_3

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    return p1

    :cond_3
    return v1
.end method
