.class public final Li2/z0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final d:Li2/z0;


# instance fields
.field public final a:J

.field public final b:J

.field public final c:F


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Li2/z0;

    const/4 v1, 0x0

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Li2/z0;-><init>(FI)V

    sput-object v0, Li2/z0;->d:Li2/z0;

    return-void
.end method

.method public synthetic constructor <init>(FI)V
    .locals 8

    const-wide v0, 0xff000000L

    .line 5
    invoke-static {v0, v1}, Li2/w0;->e(J)J

    move-result-wide v3

    and-int/lit8 p2, p2, 0x4

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    move v7, p1

    const-wide/16 v5, 0x0

    move-object v2, p0

    .line 6
    invoke-direct/range {v2 .. v7}, Li2/z0;-><init>(JJF)V

    return-void
.end method

.method public constructor <init>(JJF)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-wide p1, p0, Li2/z0;->a:J

    .line 3
    iput-wide p3, p0, Li2/z0;->b:J

    .line 4
    iput p5, p0, Li2/z0;->c:F

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    if-ne p0, p1, :cond_0

    goto :goto_0

    :cond_0
    instance-of v0, p1, Li2/z0;

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    check-cast p1, Li2/z0;

    iget-wide v0, p1, Li2/z0;->a:J

    iget-wide v2, p0, Li2/z0;->a:J

    invoke-static {v2, v3, v0, v1}, Li2/x;->d(JJ)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    iget-wide v0, p0, Li2/z0;->b:J

    iget-wide v2, p1, Li2/z0;->b:J

    invoke-static {v0, v1, v2, v3}, Lh2/b;->c(JJ)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_1

    :cond_3
    iget v0, p0, Li2/z0;->c:F

    iget p1, p1, Li2/z0;->c:F

    cmpg-float p1, v0, p1

    if-nez p1, :cond_4

    :goto_0
    const/4 p1, 0x1

    return p1

    :cond_4
    :goto_1
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 4

    sget v0, Li2/x;->o:I

    iget-wide v0, p0, Li2/z0;->a:J

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-wide v2, p0, Li2/z0;->b:J

    invoke-static {v0, v2, v3, v1}, Ld;->e(IJI)I

    move-result v0

    iget v1, p0, Li2/z0;->c:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Shadow(color="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v1, p0, Li2/z0;->a:J

    const-string v3, ", offset="

    invoke-static {v1, v2, v3, v0}, Lev/n;->u(JLjava/lang/String;Ljava/lang/StringBuilder;)V

    iget-wide v1, p0, Li2/z0;->b:J

    invoke-static {v1, v2}, Lh2/b;->j(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", blurRadius="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Li2/z0;->c:F

    const/16 v2, 0x29

    invoke-static {v0, v1, v2}, Lr;->l(Ljava/lang/StringBuilder;FC)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
