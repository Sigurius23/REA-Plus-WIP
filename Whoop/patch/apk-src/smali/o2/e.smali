.class public final Lo2/e;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static k:I

.field public static final l:Ljc/a;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:F

.field public final c:F

.field public final d:F

.field public final e:F

.field public final f:Lo2/e0;

.field public final g:J

.field public final h:I

.field public final i:Z

.field public final j:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ljc/a;

    const/16 v1, 0xd

    invoke-direct {v0, v1}, Ljc/a;-><init>(I)V

    sput-object v0, Lo2/e;->l:Ljc/a;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;FFFFLo2/e0;JIZ)V
    .locals 3

    sget-object v0, Lo2/e;->l:Ljc/a;

    monitor-enter v0

    :try_start_0
    sget v1, Lo2/e;->k:I

    add-int/lit8 v2, v1, 0x1

    sput v2, Lo2/e;->k:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo2/e;->a:Ljava/lang/String;

    iput p2, p0, Lo2/e;->b:F

    iput p3, p0, Lo2/e;->c:F

    iput p4, p0, Lo2/e;->d:F

    iput p5, p0, Lo2/e;->e:F

    iput-object p6, p0, Lo2/e;->f:Lo2/e0;

    iput-wide p7, p0, Lo2/e;->g:J

    iput p9, p0, Lo2/e;->h:I

    iput-boolean p10, p0, Lo2/e;->i:Z

    iput v1, p0, Lo2/e;->j:I

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0

    throw p1
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    if-ne p0, p1, :cond_0

    goto :goto_0

    :cond_0
    instance-of v0, p1, Lo2/e;

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    check-cast p1, Lo2/e;

    iget-object v0, p1, Lo2/e;->a:Ljava/lang/String;

    iget-object v1, p0, Lo2/e;->a:Ljava/lang/String;

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    iget v0, p0, Lo2/e;->b:F

    iget v1, p1, Lo2/e;->b:F

    invoke-static {v0, v1}, Ly3/f;->b(FF)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_1

    :cond_3
    iget v0, p0, Lo2/e;->c:F

    iget v1, p1, Lo2/e;->c:F

    invoke-static {v0, v1}, Ly3/f;->b(FF)Z

    move-result v0

    if-nez v0, :cond_4

    goto :goto_1

    :cond_4
    iget v0, p0, Lo2/e;->d:F

    iget v1, p1, Lo2/e;->d:F

    cmpg-float v0, v0, v1

    if-nez v0, :cond_8

    iget v0, p0, Lo2/e;->e:F

    iget v1, p1, Lo2/e;->e:F

    cmpg-float v0, v0, v1

    if-nez v0, :cond_8

    iget-object v0, p0, Lo2/e;->f:Lo2/e0;

    iget-object v1, p1, Lo2/e;->f:Lo2/e0;

    invoke-virtual {v0, v1}, Lo2/e0;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    goto :goto_1

    :cond_5
    iget-wide v0, p0, Lo2/e;->g:J

    iget-wide v2, p1, Lo2/e;->g:J

    invoke-static {v0, v1, v2, v3}, Li2/x;->d(JJ)Z

    move-result v0

    if-nez v0, :cond_6

    goto :goto_1

    :cond_6
    iget v0, p0, Lo2/e;->h:I

    iget v1, p1, Lo2/e;->h:I

    if-ne v0, v1, :cond_8

    iget-boolean v0, p0, Lo2/e;->i:Z

    iget-boolean p1, p1, Lo2/e;->i:Z

    if-eq v0, p1, :cond_7

    goto :goto_1

    :cond_7
    :goto_0
    const/4 p1, 0x1

    return p1

    :cond_8
    :goto_1
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 5

    iget-object v0, p0, Lo2/e;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget v2, p0, Lo2/e;->b:F

    invoke-static {v2, v0, v1}, Ld;->a(FII)I

    move-result v0

    iget v2, p0, Lo2/e;->c:F

    invoke-static {v2, v0, v1}, Ld;->a(FII)I

    move-result v0

    iget v2, p0, Lo2/e;->d:F

    invoke-static {v2, v0, v1}, Ld;->a(FII)I

    move-result v0

    iget v2, p0, Lo2/e;->e:F

    invoke-static {v2, v0, v1}, Ld;->a(FII)I

    move-result v0

    iget-object v2, p0, Lo2/e;->f:Lo2/e0;

    invoke-virtual {v2}, Lo2/e0;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    sget v0, Li2/x;->o:I

    iget-wide v3, p0, Lo2/e;->g:J

    invoke-static {v2, v3, v4, v1}, Ld;->e(IJI)I

    move-result v0

    iget v2, p0, Lo2/e;->h:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-boolean v1, p0, Lo2/e;->i:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method
