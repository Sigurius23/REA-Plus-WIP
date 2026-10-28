.class public final Lna3/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final e:Lna3/d;


# instance fields
.field public final a:Lna3/g;

.field public final b:Lna3/e;

.field public final c:Z

.field public final d:Z


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lna3/d;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lna3/d;-><init>(Lna3/g;Z)V

    sput-object v0, Lna3/d;->e:Lna3/d;

    return-void
.end method

.method public constructor <init>(Lna3/g;Lna3/e;ZZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lna3/d;->a:Lna3/g;

    .line 3
    iput-object p2, p0, Lna3/d;->b:Lna3/e;

    .line 4
    iput-boolean p3, p0, Lna3/d;->c:Z

    .line 5
    iput-boolean p4, p0, Lna3/d;->d:Z

    return-void
.end method

.method public synthetic constructor <init>(Lna3/g;Z)V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 6
    invoke-direct {p0, p1, v0, p2, v1}, Lna3/d;-><init>(Lna3/g;Lna3/e;ZZ)V

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 1

    iget-boolean v0, p0, Lna3/d;->c:Z

    return v0
.end method

.method public final b()Lna3/g;
    .locals 1

    iget-object v0, p0, Lna3/d;->a:Lna3/g;

    return-object v0
.end method

.method public final c()Z
    .locals 1

    iget-boolean v0, p0, Lna3/d;->d:Z

    return v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lna3/d;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lna3/d;

    iget-object v1, p0, Lna3/d;->a:Lna3/g;

    iget-object v3, p1, Lna3/d;->a:Lna3/g;

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lna3/d;->b:Lna3/e;

    iget-object v3, p1, Lna3/d;->b:Lna3/e;

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lna3/d;->c:Z

    iget-boolean v3, p1, Lna3/d;->c:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lna3/d;->d:Z

    iget-boolean p1, p1, Lna3/d;->d:Z

    if-eq v1, p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final hashCode()I
    .locals 4

    const/4 v0, 0x0

    iget-object v1, p0, Lna3/d;->a:Lna3/g;

    if-nez v1, :cond_0

    move v1, v0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_0
    const/16 v2, 0x1f

    mul-int/2addr v1, v2

    iget-object v3, p0, Lna3/d;->b:Lna3/e;

    if-nez v3, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_1
    add-int/2addr v1, v0

    mul-int/2addr v1, v2

    iget-boolean v0, p0, Lna3/d;->c:Z

    invoke-static {v1, v2, v0}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v1, p0, Lna3/d;->d:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "JavaTypeQualifiers(nullability="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lna3/d;->a:Lna3/g;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", mutability="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lna3/d;->b:Lna3/e;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", definitelyNotNull="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lna3/d;->c:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", isNullabilityQualifierForWarning="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lna3/d;->d:Z

    const/16 v2, 0x29

    invoke-static {v0, v1, v2}, Lb9/y;->r(Ljava/lang/StringBuilder;ZC)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
