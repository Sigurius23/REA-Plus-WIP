.class public final Lnh/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lnh/i;


# instance fields
.field public final w:Lnh/h;


# direct methods
.method public constructor <init>(Lnh/h;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnh/e;->w:Lnh/h;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lnh/e;

    if-eqz v1, :cond_1

    check-cast p1, Lnh/e;

    iget-object p1, p1, Lnh/e;->w:Lnh/h;

    iget-object v1, p0, Lnh/e;->w:Lnh/h;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    return v0

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Lnh/e;->w:Lnh/h;

    invoke-virtual {v0}, Lnh/h;->hashCode()I

    move-result v0

    return v0
.end method

.method public final j(Lbh/g;)Ljava/lang/Object;
    .locals 0

    iget-object p1, p0, Lnh/e;->w:Lnh/h;

    return-object p1
.end method
