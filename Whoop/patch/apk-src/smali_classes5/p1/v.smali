.class public final Lp1/v;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lp1/s;


# direct methods
.method public constructor <init>(Lp1/s;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp1/v;->a:Lp1/s;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Lp1/v;

    if-eqz v0, :cond_0

    check-cast p1, Lp1/v;

    iget-object p1, p1, Lp1/v;->a:Lp1/s;

    iget-object v0, p0, Lp1/v;->a:Lp1/s;

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
    .locals 1

    iget-object v0, p0, Lp1/v;->a:Lp1/s;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    return v0
.end method
