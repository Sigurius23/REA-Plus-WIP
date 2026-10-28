.class public final Lj43/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Z

.field public final b:I

.field public final c:Ljava/util/Map;

.field public final d:Ljava/lang/Class;

.field public final e:Z

.field public final f:Ld43/a;


# direct methods
.method public synthetic constructor <init>(ZILjava/lang/Class;ZLd43/a;I)V
    .locals 7

    and-int/lit8 v0, p6, 0x1

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    :cond_0
    move v1, p1

    and-int/lit8 p1, p6, 0x2

    if-eqz p1, :cond_1

    const/4 p2, 0x2

    :cond_1
    move v2, p2

    .line 8
    new-instance p1, Ll83/k;

    const-string p2, "ALL_CALL_TYPES"

    const-class v0, Lio/getstream/video/android/core/notifications/internal/service/CallService;

    invoke-direct {p1, p2, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 9
    invoke-static {p1}, Lm83/g0;->X(Ll83/k;)Ljava/util/Map;

    move-result-object v3

    and-int/lit8 p1, p6, 0x8

    if-eqz p1, :cond_2

    move-object v4, v0

    goto :goto_0

    :cond_2
    move-object v4, p3

    :goto_0
    and-int/lit8 p1, p6, 0x10

    if-eqz p1, :cond_3

    const/4 p4, 0x0

    :cond_3
    move v5, p4

    and-int/lit8 p1, p6, 0x20

    if-eqz p1, :cond_4

    .line 10
    new-instance p5, Ld43/a;

    invoke-direct {p5}, Ld43/a;-><init>()V

    :cond_4
    move-object v0, p0

    move-object v6, p5

    .line 11
    invoke-direct/range {v0 .. v6}, Lj43/c;-><init>(ZILjava/util/Map;Ljava/lang/Class;ZLd43/a;)V

    return-void
.end method

.method public constructor <init>(ZILjava/util/Map;Ljava/lang/Class;ZLd43/a;)V
    .locals 1

    const-string v0, "serviceClass"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "moderationConfig"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-boolean p1, p0, Lj43/c;->a:Z

    .line 3
    iput p2, p0, Lj43/c;->b:I

    .line 4
    iput-object p3, p0, Lj43/c;->c:Ljava/util/Map;

    .line 5
    iput-object p4, p0, Lj43/c;->d:Ljava/lang/Class;

    .line 6
    iput-boolean p5, p0, Lj43/c;->e:Z

    .line 7
    iput-object p6, p0, Lj43/c;->f:Ld43/a;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lj43/c;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lj43/c;

    iget-boolean v1, p0, Lj43/c;->a:Z

    iget-boolean v3, p1, Lj43/c;->a:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lj43/c;->b:I

    iget v3, p1, Lj43/c;->b:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lj43/c;->c:Ljava/util/Map;

    iget-object v3, p1, Lj43/c;->c:Ljava/util/Map;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lj43/c;->d:Ljava/lang/Class;

    iget-object v3, p1, Lj43/c;->d:Ljava/lang/Class;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Lj43/c;->e:Z

    iget-boolean v3, p1, Lj43/c;->e:Z

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lj43/c;->f:Ld43/a;

    iget-object p1, p1, Lj43/c;->f:Ld43/a;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final hashCode()I
    .locals 3

    iget-boolean v0, p0, Lj43/c;->a:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget v2, p0, Lj43/c;->b:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v2, p0, Lj43/c;->c:Ljava/util/Map;

    invoke-static {v2, v0, v1}, Lc13/a;->e(Ljava/util/Map;II)I

    move-result v0

    iget-object v2, p0, Lj43/c;->d:Ljava/lang/Class;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-boolean v0, p0, Lj43/c;->e:Z

    invoke-static {v2, v1, v0}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v1, p0, Lj43/c;->f:Ld43/a;

    invoke-virtual {v1}, Ld43/a;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "CallServiceConfig(runCallServiceInForeground="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-boolean v1, p0, Lj43/c;->a:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", audioUsage="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lj43/c;->b:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", callServicePerType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lj43/c;->c:Ljava/util/Map;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", serviceClass="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lj43/c;->d:Ljava/lang/Class;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", enableTelecom="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lj43/c;->e:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", moderationConfig="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lj43/c;->f:Ld43/a;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
