.class public final Lb30/p3;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lzy/c;

.field public final b:Z

.field public final c:Lc93/a;

.field public final d:Lc93/a;

.field public final e:Z

.field public final f:Z


# direct methods
.method public constructor <init>(Lzy/c;ZLc93/a;Lc93/a;ZZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb30/p3;->a:Lzy/c;

    iput-boolean p2, p0, Lb30/p3;->b:Z

    iput-object p3, p0, Lb30/p3;->c:Lc93/a;

    iput-object p4, p0, Lb30/p3;->d:Lc93/a;

    iput-boolean p5, p0, Lb30/p3;->e:Z

    iput-boolean p6, p0, Lb30/p3;->f:Z

    return-void
.end method

.method public static a(Lb30/p3;Z)Lb30/p3;
    .locals 7

    iget-object v1, p0, Lb30/p3;->a:Lzy/c;

    iget-boolean v2, p0, Lb30/p3;->b:Z

    iget-object v3, p0, Lb30/p3;->c:Lc93/a;

    iget-object v4, p0, Lb30/p3;->d:Lc93/a;

    iget-boolean v6, p0, Lb30/p3;->f:Z

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Lb30/p3;

    move v5, p1

    invoke-direct/range {v0 .. v6}, Lb30/p3;-><init>(Lzy/c;ZLc93/a;Lc93/a;ZZ)V

    return-object v0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lb30/p3;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lb30/p3;

    iget-object v1, p0, Lb30/p3;->a:Lzy/c;

    iget-object v3, p1, Lb30/p3;->a:Lzy/c;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lb30/p3;->b:Z

    iget-boolean v3, p1, Lb30/p3;->b:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lb30/p3;->c:Lc93/a;

    iget-object v3, p1, Lb30/p3;->c:Lc93/a;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lb30/p3;->d:Lc93/a;

    iget-object v3, p1, Lb30/p3;->d:Lc93/a;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Lb30/p3;->e:Z

    iget-boolean v3, p1, Lb30/p3;->e:Z

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-boolean v1, p0, Lb30/p3;->f:Z

    iget-boolean p1, p1, Lb30/p3;->f:Z

    if-eq v1, p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final hashCode()I
    .locals 3

    iget-object v0, p0, Lb30/p3;->a:Lzy/c;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Lb30/p3;->b:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lb30/p3;->c:Lc93/a;

    invoke-static {v0, v1, v2}, Lr;->d(IILc93/a;)I

    move-result v0

    iget-object v2, p0, Lb30/p3;->d:Lc93/a;

    invoke-static {v0, v1, v2}, Lr;->d(IILc93/a;)I

    move-result v0

    iget-boolean v2, p0, Lb30/p3;->e:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v1, p0, Lb30/p3;->f:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "UIState(label="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lb30/p3;->a:Lzy/c;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", canClickWhileDisabled="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lb30/p3;->b:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", onClick="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lb30/p3;->c:Lc93/a;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", onDisabledClick="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lb30/p3;->d:Lc93/a;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", enabled="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", lockVisible="

    const-string v2, ")"

    iget-boolean v3, p0, Lb30/p3;->e:Z

    iget-boolean v4, p0, Lb30/p3;->f:Z

    invoke-static {v0, v3, v1, v4, v2}, Lvl/b;->j(Ljava/lang/StringBuilder;ZLjava/lang/String;ZLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
