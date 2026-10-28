.class public final Lpv/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Z

.field public b:Z

.field public c:Z

.field public d:Z

.field public e:Z

.field public f:I

.field public g:Z

.field public h:Z

.field public i:Z

.field public j:Lcom/mapbox/maps/ScreenCoordinate;

.field public k:Z

.field public l:Z

.field public m:Z

.field public n:Z

.field public o:Z

.field public p:F

.field public q:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lpv/a;->a:Z

    iput-boolean v0, p0, Lpv/a;->b:Z

    iput-boolean v0, p0, Lpv/a;->c:Z

    iput-boolean v0, p0, Lpv/a;->d:Z

    iput-boolean v0, p0, Lpv/a;->e:Z

    const/4 v1, 0x3

    iput v1, p0, Lpv/a;->f:I

    iput-boolean v0, p0, Lpv/a;->g:Z

    iput-boolean v0, p0, Lpv/a;->h:Z

    iput-boolean v0, p0, Lpv/a;->i:Z

    iput-boolean v0, p0, Lpv/a;->k:Z

    iput-boolean v0, p0, Lpv/a;->l:Z

    iput-boolean v0, p0, Lpv/a;->m:Z

    iput-boolean v0, p0, Lpv/a;->n:Z

    iput-boolean v0, p0, Lpv/a;->o:Z

    const/high16 v1, 0x3f800000    # 1.0f

    iput v1, p0, Lpv/a;->p:F

    iput-boolean v0, p0, Lpv/a;->q:Z

    return-void
.end method


# virtual methods
.method public final a()Lpv/b;
    .locals 20

    move-object/from16 v0, p0

    new-instance v1, Lpv/b;

    iget-boolean v2, v0, Lpv/a;->a:Z

    iget-boolean v3, v0, Lpv/a;->b:Z

    iget-boolean v4, v0, Lpv/a;->c:Z

    iget-boolean v5, v0, Lpv/a;->d:Z

    iget-boolean v6, v0, Lpv/a;->e:Z

    iget v7, v0, Lpv/a;->f:I

    iget-boolean v8, v0, Lpv/a;->g:Z

    iget-boolean v9, v0, Lpv/a;->h:Z

    iget-boolean v10, v0, Lpv/a;->i:Z

    iget-object v11, v0, Lpv/a;->j:Lcom/mapbox/maps/ScreenCoordinate;

    iget-boolean v12, v0, Lpv/a;->k:Z

    iget-boolean v13, v0, Lpv/a;->l:Z

    iget-boolean v14, v0, Lpv/a;->m:Z

    iget-boolean v15, v0, Lpv/a;->n:Z

    move-object/from16 v16, v1

    iget-boolean v1, v0, Lpv/a;->o:Z

    move/from16 v17, v1

    iget v1, v0, Lpv/a;->p:F

    move/from16 v18, v1

    iget-boolean v1, v0, Lpv/a;->q:Z

    move/from16 v19, v18

    move/from16 v18, v1

    move-object/from16 v1, v16

    move/from16 v16, v17

    move/from16 v17, v19

    invoke-direct/range {v1 .. v18}, Lpv/b;-><init>(ZZZZZIZZZLcom/mapbox/maps/ScreenCoordinate;ZZZZZFZ)V

    move-object/from16 v16, v1

    return-object v16
.end method
