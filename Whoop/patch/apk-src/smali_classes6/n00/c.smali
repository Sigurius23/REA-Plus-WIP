.class public final Ln00/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Z

.field public final c:Z

.field public final d:Z

.field public final e:Ln00/d;

.field public final f:Z

.field public final g:Lzy/c;

.field public final h:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;ZZZLn00/d;ZLzy/c;Ljava/lang/String;)V
    .locals 1

    const-string v0, "merchantName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "signUpState"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln00/c;->a:Ljava/lang/String;

    iput-boolean p2, p0, Ln00/c;->b:Z

    iput-boolean p3, p0, Ln00/c;->c:Z

    iput-boolean p4, p0, Ln00/c;->d:Z

    iput-object p5, p0, Ln00/c;->e:Ln00/d;

    iput-boolean p6, p0, Ln00/c;->f:Z

    iput-object p7, p0, Ln00/c;->g:Lzy/c;

    iput-object p8, p0, Ln00/c;->h:Ljava/lang/String;

    return-void
.end method

.method public static a(Ln00/c;ZLn00/d;ZLzy/c;Ljava/lang/String;I)Ln00/c;
    .locals 9

    iget-object v1, p0, Ln00/c;->a:Ljava/lang/String;

    and-int/lit8 v0, p6, 0x2

    if-eqz v0, :cond_0

    iget-boolean p1, p0, Ln00/c;->b:Z

    :cond_0
    move v2, p1

    iget-boolean v3, p0, Ln00/c;->c:Z

    iget-boolean v4, p0, Ln00/c;->d:Z

    and-int/lit8 p1, p6, 0x10

    if-eqz p1, :cond_1

    iget-object p2, p0, Ln00/c;->e:Ln00/d;

    :cond_1
    move-object v5, p2

    and-int/lit8 p1, p6, 0x20

    if-eqz p1, :cond_2

    iget-boolean p3, p0, Ln00/c;->f:Z

    :cond_2
    move v6, p3

    and-int/lit8 p1, p6, 0x40

    if-eqz p1, :cond_3

    iget-object p4, p0, Ln00/c;->g:Lzy/c;

    :cond_3
    move-object v7, p4

    and-int/lit16 p1, p6, 0x80

    if-eqz p1, :cond_4

    iget-object p5, p0, Ln00/c;->h:Ljava/lang/String;

    :cond_4
    move-object v8, p5

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string p0, "merchantName"

    invoke-static {v1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "signUpState"

    invoke-static {v5, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ln00/c;

    invoke-direct/range {v0 .. v8}, Ln00/c;-><init>(Ljava/lang/String;ZZZLn00/d;ZLzy/c;Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Ln00/c;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Ln00/c;

    iget-object v1, p0, Ln00/c;->a:Ljava/lang/String;

    iget-object v3, p1, Ln00/c;->a:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Ln00/c;->b:Z

    iget-boolean v3, p1, Ln00/c;->b:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Ln00/c;->c:Z

    iget-boolean v3, p1, Ln00/c;->c:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Ln00/c;->d:Z

    iget-boolean v3, p1, Ln00/c;->d:Z

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Ln00/c;->e:Ln00/d;

    iget-object v3, p1, Ln00/c;->e:Ln00/d;

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-boolean v1, p0, Ln00/c;->f:Z

    iget-boolean v3, p1, Ln00/c;->f:Z

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Ln00/c;->g:Lzy/c;

    iget-object v3, p1, Ln00/c;->g:Lzy/c;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Ln00/c;->h:Ljava/lang/String;

    iget-object p1, p1, Ln00/c;->h:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    return v2

    :cond_9
    return v0
.end method

.method public final hashCode()I
    .locals 4

    iget-object v0, p0, Ln00/c;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Ln00/c;->b:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v2, p0, Ln00/c;->c:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v2, p0, Ln00/c;->d:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Ln00/c;->e:Ln00/d;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-boolean v0, p0, Ln00/c;->f:Z

    invoke-static {v2, v1, v0}, Lb9/y;->b(IIZ)I

    move-result v0

    const/4 v2, 0x0

    iget-object v3, p0, Ln00/c;->g:Lzy/c;

    if-nez v3, :cond_0

    move v3, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_0
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v1, p0, Ln00/c;->h:Ljava/lang/String;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    const-string v0, ", signUpEnabled="

    const-string v1, ", requiresNameCollection="

    const-string v2, "SignUpScreenState(merchantName="

    iget-object v3, p0, Ln00/c;->a:Ljava/lang/String;

    iget-boolean v4, p0, Ln00/c;->b:Z

    invoke-static {v2, v3, v0, v1, v4}, Lm4/a;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", canEditEmail="

    const-string v2, ", signUpState="

    iget-boolean v3, p0, Ln00/c;->c:Z

    iget-boolean v4, p0, Ln00/c;->d:Z

    invoke-static {v0, v3, v1, v4, v2}, Ly00/t7;->v(Ljava/lang/StringBuilder;ZLjava/lang/String;ZLjava/lang/String;)V

    iget-object v1, p0, Ln00/c;->e:Ln00/d;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", isSubmitting="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Ln00/c;->f:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", errorMessage="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ln00/c;->g:Lzy/c;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", suggestedEmail="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ln00/c;->h:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
