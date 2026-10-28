.class public final Ll0/x1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz2/c;
.implements Lz2/f;


# instance fields
.field public final w:Lp1/k1;

.field public final x:Ll0/b2;


# direct methods
.method public constructor <init>(Ll0/b2;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ll0/j0;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ll0/j0;-><init>(I)V

    invoke-static {v0}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v0

    iput-object v0, p0, Ll0/x1;->w:Lp1/k1;

    iput-object p1, p0, Ll0/x1;->x:Ll0/b2;

    return-void
.end method


# virtual methods
.method public final d()Ll0/b2;
    .locals 1

    iget-object v0, p0, Ll0/x1;->w:Lp1/k1;

    invoke-virtual {v0}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll0/b2;

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    instance-of v0, p1, Ll0/x1;

    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    check-cast p1, Ll0/x1;

    iget-object p1, p1, Ll0/x1;->x:Ll0/b2;

    iget-object v0, p0, Ll0/x1;->x:Ll0/b2;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final getKey()Lz2/h;
    .locals 1

    sget-object v0, Ll0/f;->d:Lz2/h;

    return-object v0
.end method

.method public final h(Lz2/g;)V
    .locals 2

    sget-object v0, Ll0/f;->d:Lz2/h;

    invoke-interface {p1, v0}, Lz2/g;->a(Lz2/h;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll0/b2;

    new-instance v0, Ll0/w1;

    iget-object v1, p0, Ll0/x1;->x:Ll0/b2;

    invoke-direct {v0, v1, p1}, Ll0/w1;-><init>(Ll0/b2;Ll0/b2;)V

    iget-object p1, p0, Ll0/x1;->w:Lp1/k1;

    invoke-virtual {p1, v0}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Ll0/x1;->x:Ll0/b2;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method
