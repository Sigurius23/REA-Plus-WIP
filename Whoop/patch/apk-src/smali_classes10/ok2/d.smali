.class public final Lok2/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0010\u0008\u0087\u0008\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0010\u0010\u000c\u001a\u00020\u000bH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00062\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0014\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u0018\u001a\u0004\u0008\u0019\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u001b\u001a\u0004\u0008\u001c\u0010\u001dR\u0017\u0010\u0008\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010\u001b\u001a\u0004\u0008\u0017\u0010\u001d\u00a8\u0006\u001e"
    }
    d2 = {
        "Lok2/d;",
        "",
        "",
        "fillFraction",
        "Lok2/j;",
        "timeLabel",
        "",
        "isReached",
        "showDashes",
        "<init>",
        "(FLok2/j;ZZ)V",
        "",
        "toString",
        "()Ljava/lang/String;",
        "",
        "hashCode",
        "()I",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "a",
        "F",
        "()F",
        "b",
        "Lok2/j;",
        "c",
        "()Lok2/j;",
        "Z",
        "d",
        "()Z",
        "track-activity_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final e:I


# instance fields
.field private final a:F

.field private final b:Lok2/j;

.field private final c:Z

.field private final d:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget v0, Lcom/whoop/design/util/TextResource;->$stable:I

    sput v0, Lok2/d;->e:I

    return-void
.end method

.method public constructor <init>(FLok2/j;ZZ)V
    .locals 1

    const-string v0, "timeLabel"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lok2/d;->a:F

    iput-object p2, p0, Lok2/d;->b:Lok2/j;

    iput-boolean p3, p0, Lok2/d;->c:Z

    iput-boolean p4, p0, Lok2/d;->d:Z

    return-void
.end method


# virtual methods
.method public final a()F
    .locals 1

    iget v0, p0, Lok2/d;->a:F

    return v0
.end method

.method public final b()Z
    .locals 1

    iget-boolean v0, p0, Lok2/d;->d:Z

    return v0
.end method

.method public final c()Lok2/j;
    .locals 1

    iget-object v0, p0, Lok2/d;->b:Lok2/j;

    return-object v0
.end method

.method public final d()Z
    .locals 1

    iget-boolean v0, p0, Lok2/d;->c:Z

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lok2/d;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lok2/d;

    iget v1, p0, Lok2/d;->a:F

    iget v3, p1, Lok2/d;->a:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lok2/d;->b:Lok2/j;

    iget-object v3, p1, Lok2/d;->b:Lok2/j;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lok2/d;->c:Z

    iget-boolean v3, p1, Lok2/d;->c:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lok2/d;->d:Z

    iget-boolean p1, p1, Lok2/d;->d:Z

    if-eq v1, p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public hashCode()I
    .locals 3

    iget v0, p0, Lok2/d;->a:F

    invoke-static {v0}, Ljava/lang/Float;->hashCode(F)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lok2/d;->b:Lok2/j;

    invoke-virtual {v2}, Lok2/j;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-boolean v0, p0, Lok2/d;->c:Z

    invoke-static {v2, v1, v0}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v1, p0, Lok2/d;->d:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget v0, p0, Lok2/d;->a:F

    iget-object v1, p0, Lok2/d;->b:Lok2/j;

    iget-boolean v2, p0, Lok2/d;->c:Z

    iget-boolean v3, p0, Lok2/d;->d:Z

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "HrZoneGoalState(fillFraction="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v0, ", timeLabel="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", isReached="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", showDashes="

    const-string v1, ")"

    invoke-static {v4, v2, v0, v3, v1}, Lvl/b;->j(Ljava/lang/StringBuilder;ZLjava/lang/String;ZLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
