.class public Lkr/f;
.super Landroid/graphics/drawable/Drawable$ConstantState;
.source "SourceFile"


# instance fields
.field public a:Lkr/k;

.field public b:Lyq/a;

.field public c:Landroid/content/res/ColorStateList;

.field public d:Landroid/content/res/ColorStateList;

.field public e:Landroid/content/res/ColorStateList;

.field public f:Landroid/content/res/ColorStateList;

.field public g:Landroid/graphics/PorterDuff$Mode;

.field public h:Landroid/graphics/Rect;

.field public final i:F

.field public j:F

.field public k:F

.field public l:I

.field public m:F

.field public n:F

.field public o:I

.field public p:I

.field public final q:I

.field public r:Landroid/graphics/Paint$Style;


# direct methods
.method public constructor <init>(Lkr/f;)V
    .locals 2

    .line 19
    invoke-direct {p0}, Landroid/graphics/drawable/Drawable$ConstantState;-><init>()V

    const/4 v0, 0x0

    .line 20
    iput-object v0, p0, Lkr/f;->c:Landroid/content/res/ColorStateList;

    .line 21
    iput-object v0, p0, Lkr/f;->d:Landroid/content/res/ColorStateList;

    .line 22
    iput-object v0, p0, Lkr/f;->e:Landroid/content/res/ColorStateList;

    .line 23
    iput-object v0, p0, Lkr/f;->f:Landroid/content/res/ColorStateList;

    .line 24
    sget-object v1, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    iput-object v1, p0, Lkr/f;->g:Landroid/graphics/PorterDuff$Mode;

    .line 25
    iput-object v0, p0, Lkr/f;->h:Landroid/graphics/Rect;

    const/high16 v0, 0x3f800000    # 1.0f

    .line 26
    iput v0, p0, Lkr/f;->i:F

    .line 27
    iput v0, p0, Lkr/f;->j:F

    const/16 v0, 0xff

    .line 28
    iput v0, p0, Lkr/f;->l:I

    const/4 v0, 0x0

    .line 29
    iput v0, p0, Lkr/f;->m:F

    .line 30
    iput v0, p0, Lkr/f;->n:F

    const/4 v0, 0x0

    .line 31
    iput v0, p0, Lkr/f;->o:I

    .line 32
    iput v0, p0, Lkr/f;->p:I

    .line 33
    iput v0, p0, Lkr/f;->q:I

    .line 34
    sget-object v0, Landroid/graphics/Paint$Style;->FILL_AND_STROKE:Landroid/graphics/Paint$Style;

    iput-object v0, p0, Lkr/f;->r:Landroid/graphics/Paint$Style;

    .line 35
    iget-object v0, p1, Lkr/f;->a:Lkr/k;

    iput-object v0, p0, Lkr/f;->a:Lkr/k;

    .line 36
    iget-object v0, p1, Lkr/f;->b:Lyq/a;

    iput-object v0, p0, Lkr/f;->b:Lyq/a;

    .line 37
    iget v0, p1, Lkr/f;->k:F

    iput v0, p0, Lkr/f;->k:F

    .line 38
    iget-object v0, p1, Lkr/f;->c:Landroid/content/res/ColorStateList;

    iput-object v0, p0, Lkr/f;->c:Landroid/content/res/ColorStateList;

    .line 39
    iget-object v0, p1, Lkr/f;->d:Landroid/content/res/ColorStateList;

    iput-object v0, p0, Lkr/f;->d:Landroid/content/res/ColorStateList;

    .line 40
    iget-object v0, p1, Lkr/f;->g:Landroid/graphics/PorterDuff$Mode;

    iput-object v0, p0, Lkr/f;->g:Landroid/graphics/PorterDuff$Mode;

    .line 41
    iget-object v0, p1, Lkr/f;->f:Landroid/content/res/ColorStateList;

    iput-object v0, p0, Lkr/f;->f:Landroid/content/res/ColorStateList;

    .line 42
    iget v0, p1, Lkr/f;->l:I

    iput v0, p0, Lkr/f;->l:I

    .line 43
    iget v0, p1, Lkr/f;->i:F

    iput v0, p0, Lkr/f;->i:F

    .line 44
    iget v0, p1, Lkr/f;->p:I

    iput v0, p0, Lkr/f;->p:I

    .line 45
    iget v0, p1, Lkr/f;->j:F

    iput v0, p0, Lkr/f;->j:F

    .line 46
    iget v0, p1, Lkr/f;->m:F

    iput v0, p0, Lkr/f;->m:F

    .line 47
    iget v0, p1, Lkr/f;->n:F

    iput v0, p0, Lkr/f;->n:F

    .line 48
    iget v0, p1, Lkr/f;->o:I

    iput v0, p0, Lkr/f;->o:I

    .line 49
    iget v0, p1, Lkr/f;->q:I

    iput v0, p0, Lkr/f;->q:I

    .line 50
    iget-object v0, p1, Lkr/f;->e:Landroid/content/res/ColorStateList;

    iput-object v0, p0, Lkr/f;->e:Landroid/content/res/ColorStateList;

    .line 51
    iget-object v0, p1, Lkr/f;->r:Landroid/graphics/Paint$Style;

    iput-object v0, p0, Lkr/f;->r:Landroid/graphics/Paint$Style;

    .line 52
    iget-object v0, p1, Lkr/f;->h:Landroid/graphics/Rect;

    if-eqz v0, :cond_0

    .line 53
    new-instance v0, Landroid/graphics/Rect;

    iget-object p1, p1, Lkr/f;->h:Landroid/graphics/Rect;

    invoke-direct {v0, p1}, Landroid/graphics/Rect;-><init>(Landroid/graphics/Rect;)V

    iput-object v0, p0, Lkr/f;->h:Landroid/graphics/Rect;

    :cond_0
    return-void
.end method

.method public constructor <init>(Lkr/k;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroid/graphics/drawable/Drawable$ConstantState;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lkr/f;->c:Landroid/content/res/ColorStateList;

    .line 3
    iput-object v0, p0, Lkr/f;->d:Landroid/content/res/ColorStateList;

    .line 4
    iput-object v0, p0, Lkr/f;->e:Landroid/content/res/ColorStateList;

    .line 5
    iput-object v0, p0, Lkr/f;->f:Landroid/content/res/ColorStateList;

    .line 6
    sget-object v1, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    iput-object v1, p0, Lkr/f;->g:Landroid/graphics/PorterDuff$Mode;

    .line 7
    iput-object v0, p0, Lkr/f;->h:Landroid/graphics/Rect;

    const/high16 v1, 0x3f800000    # 1.0f

    .line 8
    iput v1, p0, Lkr/f;->i:F

    .line 9
    iput v1, p0, Lkr/f;->j:F

    const/16 v1, 0xff

    .line 10
    iput v1, p0, Lkr/f;->l:I

    const/4 v1, 0x0

    .line 11
    iput v1, p0, Lkr/f;->m:F

    .line 12
    iput v1, p0, Lkr/f;->n:F

    const/4 v1, 0x0

    .line 13
    iput v1, p0, Lkr/f;->o:I

    .line 14
    iput v1, p0, Lkr/f;->p:I

    .line 15
    iput v1, p0, Lkr/f;->q:I

    .line 16
    sget-object v1, Landroid/graphics/Paint$Style;->FILL_AND_STROKE:Landroid/graphics/Paint$Style;

    iput-object v1, p0, Lkr/f;->r:Landroid/graphics/Paint$Style;

    .line 17
    iput-object p1, p0, Lkr/f;->a:Lkr/k;

    .line 18
    iput-object v0, p0, Lkr/f;->b:Lyq/a;

    return-void
.end method


# virtual methods
.method public final getChangingConfigurations()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public newDrawable()Landroid/graphics/drawable/Drawable;
    .locals 2

    new-instance v0, Lkr/g;

    invoke-direct {v0, p0}, Lkr/g;-><init>(Lkr/f;)V

    const/4 v1, 0x1

    iput-boolean v1, v0, Lkr/g;->E:Z

    return-object v0
.end method
