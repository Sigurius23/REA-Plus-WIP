.class public final Lj4/f;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final h:Ljava/lang/String;

.field public static final i:Ljava/lang/String;

.field public static final j:Ljava/lang/String;

.field public static final k:Ljava/lang/String;

.field public static final l:Ljava/lang/String;

.field public static final m:Ljava/lang/String;


# instance fields
.field public a:I

.field public b:I

.field public c:F

.field public d:I

.field public e:Ljava/lang/String;

.field public f:Ljava/lang/String;

.field public g:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ljava/lang/String;

    const-string v1, "FIXED_DIMENSION"

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    sput-object v0, Lj4/f;->h:Ljava/lang/String;

    new-instance v0, Ljava/lang/String;

    const-string v1, "WRAP_DIMENSION"

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    sput-object v0, Lj4/f;->i:Ljava/lang/String;

    new-instance v0, Ljava/lang/String;

    const-string v1, "SPREAD_DIMENSION"

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    sput-object v0, Lj4/f;->j:Ljava/lang/String;

    new-instance v0, Ljava/lang/String;

    const-string v1, "PARENT_DIMENSION"

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    sput-object v0, Lj4/f;->k:Ljava/lang/String;

    new-instance v0, Ljava/lang/String;

    const-string v1, "PERCENT_DIMENSION"

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    sput-object v0, Lj4/f;->l:Ljava/lang/String;

    new-instance v0, Ljava/lang/String;

    const-string v1, "RATIO_DIMENSION"

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    sput-object v0, Lj4/f;->m:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lj4/f;->a:I

    const v1, 0x7fffffff

    iput v1, p0, Lj4/f;->b:I

    const/high16 v1, 0x3f800000    # 1.0f

    iput v1, p0, Lj4/f;->c:F

    iput v0, p0, Lj4/f;->d:I

    const/4 v1, 0x0

    iput-object v1, p0, Lj4/f;->e:Ljava/lang/String;

    iput-boolean v0, p0, Lj4/f;->g:Z

    iput-object p1, p0, Lj4/f;->f:Ljava/lang/String;

    return-void
.end method

.method public static b(I)Lj4/f;
    .locals 2

    new-instance v0, Lj4/f;

    sget-object v1, Lj4/f;->h:Ljava/lang/String;

    invoke-direct {v0, v1}, Lj4/f;-><init>(Ljava/lang/String;)V

    const/4 v1, 0x0

    iput-object v1, v0, Lj4/f;->f:Ljava/lang/String;

    iput p0, v0, Lj4/f;->d:I

    return-object v0
.end method

.method public static c(Ljava/lang/String;)Lj4/f;
    .locals 3

    new-instance v0, Lj4/f;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const/4 v1, 0x0

    iput v1, v0, Lj4/f;->a:I

    const v2, 0x7fffffff

    iput v2, v0, Lj4/f;->b:I

    const/high16 v2, 0x3f800000    # 1.0f

    iput v2, v0, Lj4/f;->c:F

    iput v1, v0, Lj4/f;->d:I

    const/4 v1, 0x0

    iput-object v1, v0, Lj4/f;->e:Ljava/lang/String;

    iput-object p0, v0, Lj4/f;->f:Ljava/lang/String;

    const/4 p0, 0x1

    iput-boolean p0, v0, Lj4/f;->g:Z

    return-object v0
.end method


# virtual methods
.method public final a(Lm4/e;I)V
    .locals 9

    iget-object v0, p0, Lj4/f;->e:Ljava/lang/String;

    if-eqz v0, :cond_0

    invoke-virtual {p1, v0}, Lm4/e;->K(Ljava/lang/String;)V

    :cond_0
    const/4 v0, 0x1

    const/4 v1, 0x4

    sget-object v2, Lj4/f;->k:Ljava/lang/String;

    const/4 v3, 0x2

    const v4, 0x7fffffff

    sget-object v5, Lj4/f;->l:Ljava/lang/String;

    const/4 v6, 0x0

    const/4 v7, 0x3

    sget-object v8, Lj4/f;->i:Ljava/lang/String;

    if-nez p2, :cond_9

    iget-boolean p2, p0, Lj4/f;->g:Z

    if-eqz p2, :cond_3

    invoke-virtual {p1, v7}, Lm4/e;->O(I)V

    iget-object p2, p0, Lj4/f;->f:Ljava/lang/String;

    if-ne p2, v8, :cond_1

    goto :goto_0

    :cond_1
    if-ne p2, v5, :cond_2

    move v0, v3

    goto :goto_0

    :cond_2
    move v0, v6

    :goto_0
    iget p2, p0, Lj4/f;->a:I

    iget v1, p0, Lj4/f;->b:I

    iget v2, p0, Lj4/f;->c:F

    invoke-virtual {p1, v2, v0, p2, v1}, Lm4/e;->P(FIII)V

    return-void

    :cond_3
    iget p2, p0, Lj4/f;->a:I

    if-lez p2, :cond_5

    if-gez p2, :cond_4

    iput v6, p1, Lm4/e;->c0:I

    goto :goto_1

    :cond_4
    iput p2, p1, Lm4/e;->c0:I

    :cond_5
    :goto_1
    iget p2, p0, Lj4/f;->b:I

    if-ge p2, v4, :cond_6

    iget-object v4, p1, Lm4/e;->D:[I

    aput p2, v4, v6

    :cond_6
    iget-object p2, p0, Lj4/f;->f:Ljava/lang/String;

    if-ne p2, v8, :cond_7

    invoke-virtual {p1, v3}, Lm4/e;->O(I)V

    return-void

    :cond_7
    if-ne p2, v2, :cond_8

    invoke-virtual {p1, v1}, Lm4/e;->O(I)V

    return-void

    :cond_8
    if-nez p2, :cond_12

    invoke-virtual {p1, v0}, Lm4/e;->O(I)V

    iget p2, p0, Lj4/f;->d:I

    invoke-virtual {p1, p2}, Lm4/e;->S(I)V

    return-void

    :cond_9
    iget-boolean p2, p0, Lj4/f;->g:Z

    if-eqz p2, :cond_c

    invoke-virtual {p1, v7}, Lm4/e;->Q(I)V

    iget-object p2, p0, Lj4/f;->f:Ljava/lang/String;

    if-ne p2, v8, :cond_a

    goto :goto_2

    :cond_a
    if-ne p2, v5, :cond_b

    move v0, v3

    goto :goto_2

    :cond_b
    move v0, v6

    :goto_2
    iget p2, p0, Lj4/f;->a:I

    iget v1, p0, Lj4/f;->b:I

    iget v2, p0, Lj4/f;->c:F

    invoke-virtual {p1, v2, v0, p2, v1}, Lm4/e;->R(FIII)V

    return-void

    :cond_c
    iget p2, p0, Lj4/f;->a:I

    if-lez p2, :cond_e

    if-gez p2, :cond_d

    iput v6, p1, Lm4/e;->d0:I

    goto :goto_3

    :cond_d
    iput p2, p1, Lm4/e;->d0:I

    :cond_e
    :goto_3
    iget p2, p0, Lj4/f;->b:I

    if-ge p2, v4, :cond_f

    iget-object v4, p1, Lm4/e;->D:[I

    aput p2, v4, v0

    :cond_f
    iget-object p2, p0, Lj4/f;->f:Ljava/lang/String;

    if-ne p2, v8, :cond_10

    invoke-virtual {p1, v3}, Lm4/e;->Q(I)V

    return-void

    :cond_10
    if-ne p2, v2, :cond_11

    invoke-virtual {p1, v1}, Lm4/e;->Q(I)V

    return-void

    :cond_11
    if-nez p2, :cond_12

    invoke-virtual {p1, v0}, Lm4/e;->Q(I)V

    iget p2, p0, Lj4/f;->d:I

    invoke-virtual {p1, p2}, Lm4/e;->N(I)V

    :cond_12
    return-void
.end method
