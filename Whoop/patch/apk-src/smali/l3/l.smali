.class public final Ll3/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll3/b;


# static fields
.field public static final d:J

.field public static final e:Ll3/l;


# instance fields
.field public final a:J

.field public final b:J

.field public final c:J


# direct methods
.method static constructor <clinit>()V
    .locals 9

    const-wide v0, 0x200000000L

    const/4 v2, 0x1

    int-to-float v2, v2

    invoke-static {v2, v0, v1}, Lv63/c;->j(FJ)J

    move-result-wide v0

    sput-wide v0, Ll3/l;->d:J

    const-wide/high16 v0, 0x3fd0000000000000L    # 0.25

    invoke-static {v0, v1}, Lv63/c;->f(D)J

    move-result-wide v3

    invoke-static {v0, v1}, Lv63/c;->f(D)J

    move-result-wide v7

    new-instance v2, Ll3/l;

    move-wide v5, v3

    invoke-direct/range {v2 .. v8}, Ll3/l;-><init>(JJJ)V

    sput-object v2, Ll3/l;->e:Ll3/l;

    return-void
.end method

.method public constructor <init>(JJJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Ll3/l;->a:J

    iput-wide p3, p0, Ll3/l;->b:J

    iput-wide p5, p0, Ll3/l;->c:J

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    if-eqz p1, :cond_5

    instance-of v0, p1, Ll3/l;

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Ll3/l;

    sget-object v0, Ll3/o;->a:Ll3/o;

    invoke-virtual {v0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    iget-wide v0, p0, Ll3/l;->a:J

    iget-wide v2, p1, Ll3/l;->a:J

    invoke-static {v0, v1, v2, v3}, Ly3/o;->a(JJ)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_0

    :cond_3
    iget-wide v0, p0, Ll3/l;->b:J

    iget-wide v2, p1, Ll3/l;->b:J

    invoke-static {v0, v1, v2, v3}, Ly3/o;->a(JJ)Z

    move-result v0

    if-nez v0, :cond_4

    goto :goto_0

    :cond_4
    iget-wide v0, p0, Ll3/l;->c:J

    iget-wide v2, p1, Ll3/l;->c:J

    invoke-static {v0, v1, v2, v3}, Ly3/o;->a(JJ)Z

    :cond_5
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 5

    sget-object v0, Ll3/o;->a:Ll3/o;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    sget-object v2, Ly3/o;->b:[Ly3/p;

    iget-wide v2, p0, Ll3/l;->a:J

    invoke-static {v0, v2, v3, v1}, Ld;->e(IJI)I

    move-result v0

    iget-wide v2, p0, Ll3/l;->b:J

    invoke-static {v0, v2, v3, v1}, Ld;->e(IJI)I

    move-result v0

    iget-wide v2, p0, Ll3/l;->c:J

    const/16 v4, 0x3c1

    invoke-static {v0, v2, v3, v4}, Ld;->e(IJI)I

    move-result v0

    const/high16 v2, 0x7fc00000    # Float.NaN

    invoke-static {v2, v0, v1}, Ld;->a(FII)I

    move-result v0

    sget-object v1, Lk2/h;->a:Lk2/h;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Bullet(shape="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v1, Ll3/o;->a:Ll3/o;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", size=("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Ll3/l;->a:J

    invoke-static {v1, v2}, Ly3/o;->e(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Ll3/l;->b:J

    invoke-static {v1, v2}, Ly3/o;->e(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "), padding="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Ll3/l;->c:J

    invoke-static {v1, v2}, Ly3/o;->e(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", brush=null, alpha=NaN, drawStyle="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v1, Lk2/h;->a:Lk2/h;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
