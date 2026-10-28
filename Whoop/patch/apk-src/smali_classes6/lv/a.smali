.class public final Llv/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Z

.field public b:I

.field public c:F

.field public d:F

.field public e:F

.field public f:F

.field public g:F

.field public h:F

.field public i:Z

.field public j:Z

.field public k:Z

.field public l:Lcom/mapbox/maps/ImageHolder;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Llv/a;->a:Z

    const v1, 0x800035

    iput v1, p0, Llv/a;->b:I

    const/high16 v1, 0x40800000    # 4.0f

    iput v1, p0, Llv/a;->c:F

    iput v1, p0, Llv/a;->d:F

    iput v1, p0, Llv/a;->e:F

    iput v1, p0, Llv/a;->f:F

    const/high16 v1, 0x3f800000    # 1.0f

    iput v1, p0, Llv/a;->g:F

    iput-boolean v0, p0, Llv/a;->i:Z

    iput-boolean v0, p0, Llv/a;->j:Z

    iput-boolean v0, p0, Llv/a;->k:Z

    return-void
.end method


# virtual methods
.method public final a()Llv/b;
    .locals 13

    new-instance v0, Llv/b;

    iget-boolean v1, p0, Llv/a;->a:Z

    iget v2, p0, Llv/a;->b:I

    iget v3, p0, Llv/a;->c:F

    iget v4, p0, Llv/a;->d:F

    iget v5, p0, Llv/a;->e:F

    iget v6, p0, Llv/a;->f:F

    iget v7, p0, Llv/a;->g:F

    iget v8, p0, Llv/a;->h:F

    iget-boolean v9, p0, Llv/a;->i:Z

    iget-boolean v10, p0, Llv/a;->j:Z

    iget-boolean v11, p0, Llv/a;->k:Z

    iget-object v12, p0, Llv/a;->l:Lcom/mapbox/maps/ImageHolder;

    invoke-direct/range {v0 .. v12}, Llv/b;-><init>(ZIFFFFFFZZZLcom/mapbox/maps/ImageHolder;)V

    return-object v0
.end method
