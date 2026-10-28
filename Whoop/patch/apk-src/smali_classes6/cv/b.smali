.class public final Lcv/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/Long;

.field public final b:Ljava/lang/Long;


# direct methods
.method public constructor <init>(Ld1/j;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-object v0, p1, Ld1/j;->x:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Long;

    iput-object v0, p0, Lcv/b;->a:Ljava/lang/Long;

    iget-object p1, p1, Ld1/j;->y:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Long;

    iput-object p1, p0, Lcv/b;->b:Ljava/lang/Long;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    instance-of v0, p1, Lcv/b;

    if-eqz v0, :cond_0

    check-cast p1, Lcv/b;

    iget-object v0, p1, Lcv/b;->b:Ljava/lang/Long;

    iget-object v1, p0, Lcv/b;->b:Ljava/lang/Long;

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcv/b;->a:Ljava/lang/Long;

    iget-object p1, p1, Lcv/b;->a:Ljava/lang/Long;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 3

    const/4 v0, 0x0

    iget-object v1, p0, Lcv/b;->a:Ljava/lang/Long;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    goto :goto_0

    :cond_0
    move v1, v0

    :goto_0
    mul-int/lit8 v1, v1, 0x1f

    iget-object v2, p0, Lcv/b;->b:Ljava/lang/Long;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :cond_1
    add-int/2addr v1, v0

    return v1
.end method
