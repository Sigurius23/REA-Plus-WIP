.class public final Leu/d0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Z

.field public final b:Z

.field public final c:Z

.field public final d:Z

.field public final e:Z

.field public final f:Z

.field public final g:Z

.field public final h:Z

.field public final i:Z

.field public final j:Z


# direct methods
.method public synthetic constructor <init>(ZZZZI)V
    .locals 15

    move/from16 v0, p5

    and-int/lit8 v1, v0, 0x4

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_0

    move v7, v3

    goto :goto_0

    :cond_0
    move v7, v2

    :goto_0
    and-int/lit8 v1, v0, 0x8

    if-eqz v1, :cond_1

    move v8, v3

    goto :goto_1

    :cond_1
    move/from16 v8, p1

    :goto_1
    and-int/lit8 v1, v0, 0x10

    if-eqz v1, :cond_2

    move v9, v3

    goto :goto_2

    :cond_2
    move v9, v2

    :goto_2
    and-int/lit8 v1, v0, 0x20

    if-eqz v1, :cond_3

    move v10, v3

    goto :goto_3

    :cond_3
    move/from16 v10, p2

    :goto_3
    and-int/lit16 v1, v0, 0x80

    if-eqz v1, :cond_4

    move v12, v3

    goto :goto_4

    :cond_4
    move v12, v2

    :goto_4
    and-int/lit16 v1, v0, 0x100

    if-eqz v1, :cond_5

    move v13, v3

    goto :goto_5

    :cond_5
    move/from16 v13, p3

    :goto_5
    and-int/lit16 v0, v0, 0x200

    if-eqz v0, :cond_6

    move v14, v3

    goto :goto_6

    :cond_6
    move/from16 v14, p4

    :goto_6
    const/4 v5, 0x1

    const/4 v6, 0x1

    const/4 v11, 0x1

    move-object v4, p0

    .line 1
    invoke-direct/range {v4 .. v14}, Leu/d0;-><init>(ZZZZZZZZZZ)V

    return-void
.end method

.method public constructor <init>(ZZZZZZZZZZ)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-boolean p1, p0, Leu/d0;->a:Z

    .line 4
    iput-boolean p2, p0, Leu/d0;->b:Z

    .line 5
    iput-boolean p3, p0, Leu/d0;->c:Z

    .line 6
    iput-boolean p4, p0, Leu/d0;->d:Z

    .line 7
    iput-boolean p5, p0, Leu/d0;->e:Z

    .line 8
    iput-boolean p6, p0, Leu/d0;->f:Z

    .line 9
    iput-boolean p7, p0, Leu/d0;->g:Z

    .line 10
    iput-boolean p8, p0, Leu/d0;->h:Z

    .line 11
    iput-boolean p9, p0, Leu/d0;->i:Z

    .line 12
    iput-boolean p10, p0, Leu/d0;->j:Z

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    instance-of v0, p1, Leu/d0;

    if-eqz v0, :cond_0

    check-cast p1, Leu/d0;

    iget-boolean v0, p1, Leu/d0;->a:Z

    iget-boolean v1, p0, Leu/d0;->a:Z

    if-ne v1, v0, :cond_0

    iget-boolean v0, p0, Leu/d0;->b:Z

    iget-boolean v1, p1, Leu/d0;->b:Z

    if-ne v0, v1, :cond_0

    iget-boolean v0, p0, Leu/d0;->c:Z

    iget-boolean v1, p1, Leu/d0;->c:Z

    if-ne v0, v1, :cond_0

    iget-boolean v0, p0, Leu/d0;->d:Z

    iget-boolean v1, p1, Leu/d0;->d:Z

    if-ne v0, v1, :cond_0

    iget-boolean v0, p0, Leu/d0;->e:Z

    iget-boolean v1, p1, Leu/d0;->e:Z

    if-ne v0, v1, :cond_0

    iget-boolean v0, p0, Leu/d0;->f:Z

    iget-boolean v1, p1, Leu/d0;->f:Z

    if-ne v0, v1, :cond_0

    iget-boolean v0, p0, Leu/d0;->g:Z

    iget-boolean v1, p1, Leu/d0;->g:Z

    if-ne v0, v1, :cond_0

    iget-boolean v0, p0, Leu/d0;->h:Z

    iget-boolean v1, p1, Leu/d0;->h:Z

    if-ne v0, v1, :cond_0

    iget-boolean v0, p0, Leu/d0;->i:Z

    iget-boolean v1, p1, Leu/d0;->i:Z

    if-ne v0, v1, :cond_0

    iget-boolean v0, p0, Leu/d0;->j:Z

    iget-boolean p1, p1, Leu/d0;->j:Z

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 11

    iget-boolean v0, p0, Leu/d0;->a:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    iget-boolean v0, p0, Leu/d0;->b:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    iget-boolean v0, p0, Leu/d0;->c:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    iget-boolean v0, p0, Leu/d0;->d:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    iget-boolean v0, p0, Leu/d0;->e:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    iget-boolean v0, p0, Leu/d0;->f:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v6

    iget-boolean v0, p0, Leu/d0;->g:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v7

    iget-boolean v0, p0, Leu/d0;->h:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v8

    iget-boolean v0, p0, Leu/d0;->i:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v9

    iget-boolean v0, p0, Leu/d0;->j:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v10

    filled-new-array/range {v1 .. v10}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->hash([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "MapUiSettings(compassEnabled="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-boolean v1, p0, Leu/d0;->a:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", indoorLevelPickerEnabled="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Leu/d0;->b:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", mapToolbarEnabled="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Leu/d0;->c:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", myLocationButtonEnabled="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Leu/d0;->d:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", rotationGesturesEnabled="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Leu/d0;->e:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", scrollGesturesEnabled="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Leu/d0;->f:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", scrollGesturesEnabledDuringRotateOrZoom="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Leu/d0;->g:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", tiltGesturesEnabled="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Leu/d0;->h:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", zoomControlsEnabled="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Leu/d0;->i:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", zoomGesturesEnabled="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Leu/d0;->j:Z

    const/16 v2, 0x29

    invoke-static {v0, v1, v2}, Lb9/y;->r(Ljava/lang/StringBuilder;ZC)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
