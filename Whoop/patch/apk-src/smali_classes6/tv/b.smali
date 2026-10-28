.class public final Ltv/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Lev/e;

.field public b:Z

.field public c:Z

.field public d:I

.field public e:F

.field public f:Z

.field public g:I

.field public h:I

.field public i:Ljava/lang/String;

.field public j:Ljava/lang/String;

.field public k:Z

.field public l:Lev/r;

.field public m:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lev/e;)V
    .locals 1

    const-string v0, "locationPuck"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ltv/b;->a:Lev/e;

    const-string p1, "#4A90E2"

    invoke-static {p1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result p1

    iput p1, p0, Ltv/b;->d:I

    const/high16 p1, 0x41200000    # 10.0f

    iput p1, p0, Ltv/b;->e:F

    const-string p1, "#4d89cff0"

    invoke-static {p1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Ltv/b;->g:I

    invoke-static {p1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result p1

    iput p1, p0, Ltv/b;->h:I

    sget-object p1, Lev/r;->w:Lev/r;

    iput-object p1, p0, Ltv/b;->l:Lev/r;

    return-void
.end method


# virtual methods
.method public final a()Ltv/c;
    .locals 14

    new-instance v0, Ltv/c;

    iget-boolean v1, p0, Ltv/b;->b:Z

    iget-boolean v2, p0, Ltv/b;->c:Z

    iget v3, p0, Ltv/b;->d:I

    iget v4, p0, Ltv/b;->e:F

    iget-boolean v5, p0, Ltv/b;->f:Z

    iget v6, p0, Ltv/b;->g:I

    iget v7, p0, Ltv/b;->h:I

    iget-object v8, p0, Ltv/b;->i:Ljava/lang/String;

    iget-object v9, p0, Ltv/b;->j:Ljava/lang/String;

    iget-boolean v10, p0, Ltv/b;->k:Z

    iget-object v11, p0, Ltv/b;->l:Lev/r;

    iget-object v12, p0, Ltv/b;->m:Ljava/lang/String;

    iget-object v13, p0, Ltv/b;->a:Lev/e;

    invoke-direct/range {v0 .. v13}, Ltv/c;-><init>(ZZIFZIILjava/lang/String;Ljava/lang/String;ZLev/r;Ljava/lang/String;Lev/e;)V

    return-object v0
.end method
