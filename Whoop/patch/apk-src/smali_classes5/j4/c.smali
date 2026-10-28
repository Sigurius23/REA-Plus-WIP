.class public final Lj4/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj4/d;


# instance fields
.field public a:Z

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;

.field public d:F

.field public final e:F

.field public final f:F


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;FF)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lj4/c;->a:Z

    const/4 v0, 0x0

    iput v0, p0, Lj4/c;->d:F

    const-string v0, ""

    if-nez p1, :cond_0

    move-object p1, v0

    :cond_0
    iput-object p1, p0, Lj4/c;->b:Ljava/lang/String;

    if-nez p2, :cond_1

    move-object p2, v0

    :cond_1
    iput-object p2, p0, Lj4/c;->c:Ljava/lang/String;

    iput p4, p0, Lj4/c;->f:F

    iput p3, p0, Lj4/c;->e:F

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/ArrayList;
    .locals 6

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget v1, p0, Lj4/c;->e:F

    float-to-int v1, v1

    iget v2, p0, Lj4/c;->f:F

    float-to-int v2, v2

    move v3, v1

    :goto_0
    if-gt v1, v2, :cond_0

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v5, p0, Lj4/c;->b:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    iget-object v5, p0, Lj4/c;->c:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v4, 0x3f800000    # 1.0f

    float-to-int v4, v4

    add-int/2addr v3, v4

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public final value()F
    .locals 2

    iget v0, p0, Lj4/c;->d:F

    iget v1, p0, Lj4/c;->f:F

    cmpl-float v1, v0, v1

    if-ltz v1, :cond_0

    const/4 v1, 0x1

    iput-boolean v1, p0, Lj4/c;->a:Z

    :cond_0
    iget-boolean v1, p0, Lj4/c;->a:Z

    if-nez v1, :cond_1

    const/high16 v1, 0x3f800000    # 1.0f

    add-float/2addr v0, v1

    iput v0, p0, Lj4/c;->d:F

    :cond_1
    iget v0, p0, Lj4/c;->d:F

    return v0
.end method
