.class public final Leb/x0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Z

.field public final b:Z

.field public final c:I

.field public final d:Z

.field public final e:Z

.field public final f:I

.field public final g:I

.field public final h:I

.field public final i:I

.field public j:Ljava/lang/String;


# direct methods
.method public constructor <init>(ZZIZZIIII)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Leb/x0;->a:Z

    iput-boolean p2, p0, Leb/x0;->b:Z

    iput p3, p0, Leb/x0;->c:I

    iput-boolean p4, p0, Leb/x0;->d:Z

    iput-boolean p5, p0, Leb/x0;->e:Z

    iput p6, p0, Leb/x0;->f:I

    iput p7, p0, Leb/x0;->g:I

    iput p8, p0, Leb/x0;->h:I

    iput p9, p0, Leb/x0;->i:I

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    goto :goto_0

    :cond_0
    if-eqz p1, :cond_2

    instance-of v0, p1, Leb/x0;

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    check-cast p1, Leb/x0;

    iget-boolean v0, p1, Leb/x0;->a:Z

    iget-boolean v1, p0, Leb/x0;->a:Z

    if-ne v1, v0, :cond_2

    iget-boolean v0, p0, Leb/x0;->b:Z

    iget-boolean v1, p1, Leb/x0;->b:Z

    if-ne v0, v1, :cond_2

    iget v0, p0, Leb/x0;->c:I

    iget v1, p1, Leb/x0;->c:I

    if-ne v0, v1, :cond_2

    iget-object v0, p0, Leb/x0;->j:Ljava/lang/String;

    iget-object v1, p1, Leb/x0;->j:Ljava/lang/String;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-boolean v0, p0, Leb/x0;->d:Z

    iget-boolean v1, p1, Leb/x0;->d:Z

    if-ne v0, v1, :cond_2

    iget-boolean v0, p0, Leb/x0;->e:Z

    iget-boolean v1, p1, Leb/x0;->e:Z

    if-ne v0, v1, :cond_2

    iget v0, p0, Leb/x0;->f:I

    iget v1, p1, Leb/x0;->f:I

    if-ne v0, v1, :cond_2

    iget v0, p0, Leb/x0;->g:I

    iget v1, p1, Leb/x0;->g:I

    if-ne v0, v1, :cond_2

    iget v0, p0, Leb/x0;->h:I

    iget v1, p1, Leb/x0;->h:I

    if-ne v0, v1, :cond_2

    iget v0, p0, Leb/x0;->i:I

    iget p1, p1, Leb/x0;->i:I

    if-ne v0, p1, :cond_2

    :goto_0
    const/4 p1, 0x1

    return p1

    :cond_2
    :goto_1
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 2

    iget-boolean v0, p0, Leb/x0;->a:Z

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Leb/x0;->b:Z

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Leb/x0;->c:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Leb/x0;->j:Ljava/lang/String;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit16 v0, v0, 0x745f

    iget-boolean v1, p0, Leb/x0;->d:Z

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Leb/x0;->e:Z

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Leb/x0;->f:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Leb/x0;->g:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Leb/x0;->h:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Leb/x0;->i:I

    add-int/2addr v0, v1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Leb/x0;->j:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-class v2, Leb/x0;

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v2, p0, Leb/x0;->a:Z

    if-eqz v2, :cond_0

    const-string v2, "launchSingleTop "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    iget-boolean v2, p0, Leb/x0;->b:Z

    if-eqz v2, :cond_1

    const-string v2, "restoreState "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1
    const-string v2, ")"

    const/4 v3, -0x1

    if-nez v0, :cond_2

    iget v4, p0, Leb/x0;->c:I

    if-eq v4, v3, :cond_5

    :cond_2
    if-eqz v0, :cond_5

    const-string v4, "popUpTo("

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v0, p0, Leb/x0;->d:Z

    if-eqz v0, :cond_3

    const-string v0, " inclusive"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_3
    iget-boolean v0, p0, Leb/x0;->e:Z

    if-eqz v0, :cond_4

    const-string v0, " saveState"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_4
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_5
    iget v0, p0, Leb/x0;->i:I

    iget v4, p0, Leb/x0;->h:I

    iget v5, p0, Leb/x0;->g:I

    iget v6, p0, Leb/x0;->f:I

    if-ne v6, v3, :cond_6

    if-ne v5, v3, :cond_6

    if-ne v4, v3, :cond_6

    if-eq v0, v3, :cond_7

    :cond_6
    const-string v3, "anim(enterAnim=0x"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v6}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " exitAnim=0x"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v5}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " popEnterAnim=0x"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v4}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " popExitAnim=0x"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_7
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "sb.toString()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
