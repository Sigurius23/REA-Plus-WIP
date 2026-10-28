.class public final Lcg/y;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final synthetic c:I


# instance fields
.field public final a:Ltg/b;

.field public final b:Ltg/b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcg/y;

    sget-object v1, Ltg/b;->f:Ltg/b;

    invoke-direct {v0, v1, v1}, Lcg/y;-><init>(Ltg/b;Ltg/b;)V

    return-void
.end method

.method public constructor <init>(Ltg/b;Ltg/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcg/y;->a:Ltg/b;

    iput-object p2, p0, Lcg/y;->b:Ltg/b;

    iget-boolean p2, p2, Ltg/b;->d:Z

    if-nez p2, :cond_1

    iget-boolean p2, p1, Ltg/b;->e:Z

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Cannot have a password without a user name"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    iget-boolean p1, p1, Ltg/b;->d:Z

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_4

    const-class v2, Lcg/y;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Lcg/y;

    iget-object v2, p0, Lcg/y;->a:Ltg/b;

    iget-object v3, p1, Lcg/y;->a:Ltg/b;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    return v1

    :cond_2
    iget-object v2, p0, Lcg/y;->b:Ltg/b;

    iget-object p1, p1, Lcg/y;->b:Ltg/b;

    invoke-static {v2, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v1

    :cond_3
    return v0

    :cond_4
    :goto_0
    return v1
.end method

.method public final hashCode()I
    .locals 2

    iget-object v0, p0, Lcg/y;->a:Ltg/b;

    invoke-virtual {v0}, Ltg/b;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcg/y;->b:Ltg/b;

    invoke-virtual {v1}, Ltg/b;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lcg/y;->a:Ltg/b;

    iget-boolean v1, v0, Ltg/b;->d:Z

    if-eqz v1, :cond_0

    const-string v0, ""

    return-object v0

    :cond_0
    iget-object v1, p0, Lcg/y;->b:Ltg/b;

    iget-boolean v2, v1, Ltg/b;->d:Z

    if-eqz v2, :cond_1

    iget-object v0, v0, Ltg/b;->b:Ljava/lang/String;

    return-object v0

    :cond_1
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v0, v0, Ltg/b;->b:Ljava/lang/String;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v0, 0x3a

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v0, v1, Ltg/b;->b:Ljava/lang/String;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
