.class public final Lw71/f0$g;
.super Lw71/f0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lw71/f0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "g"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0007\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u000c\u0008\u0087\u0008\u0018\u00002\u00020\u0001B)\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0008\u0010\tJ8\u0010\n\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0004H\u00c6\u0001\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u000cH\u00d6\u0001\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fH\u00d6\u0001\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010\u0017\u001a\u0004\u0008\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u001b\u001a\u0004\u0008\u001c\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001e\u0010\u001b\u001a\u0004\u0008\u001f\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001f\u0010\u001b\u001a\u0004\u0008\u001e\u0010\u001d\u00a8\u0006 "
    }
    d2 = {
        "Lw71/f0$g;",
        "Lw71/f0;",
        "Lcom/whoop/design/util/TextResource;",
        "time",
        "",
        "minTime",
        "maxTime",
        "curTime",
        "<init>",
        "(Lcom/whoop/design/util/TextResource;JJJ)V",
        "a",
        "(Lcom/whoop/design/util/TextResource;JJJ)Lw71/f0$g;",
        "",
        "toString",
        "()Ljava/lang/String;",
        "",
        "hashCode",
        "()I",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Lcom/whoop/design/util/TextResource;",
        "f",
        "()Lcom/whoop/design/util/TextResource;",
        "b",
        "J",
        "e",
        "()J",
        "c",
        "d",
        "design_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final a:Lcom/whoop/design/util/TextResource;

.field private final b:J

.field private final c:J

.field private final d:J


# direct methods
.method public constructor <init>(Lcom/whoop/design/util/TextResource;JJJ)V
    .locals 1

    const-string v0, "time"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lw71/f0;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lw71/f0$g;->a:Lcom/whoop/design/util/TextResource;

    iput-wide p2, p0, Lw71/f0$g;->b:J

    iput-wide p4, p0, Lw71/f0$g;->c:J

    iput-wide p6, p0, Lw71/f0$g;->d:J

    return-void
.end method

.method public static synthetic b(Lw71/f0$g;Lcom/whoop/design/util/TextResource;JJJILjava/lang/Object;)Lw71/f0$g;
    .locals 0

    and-int/lit8 p9, p8, 0x1

    if-eqz p9, :cond_0

    iget-object p1, p0, Lw71/f0$g;->a:Lcom/whoop/design/util/TextResource;

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    iget-wide p2, p0, Lw71/f0$g;->b:J

    :cond_1
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_2

    iget-wide p4, p0, Lw71/f0$g;->c:J

    :cond_2
    and-int/lit8 p8, p8, 0x8

    if-eqz p8, :cond_3

    iget-wide p6, p0, Lw71/f0$g;->d:J

    :cond_3
    move-wide p8, p6

    move-wide p6, p4

    move-wide p4, p2

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p9}, Lw71/f0$g;->a(Lcom/whoop/design/util/TextResource;JJJ)Lw71/f0$g;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(Lcom/whoop/design/util/TextResource;JJJ)Lw71/f0$g;
    .locals 9

    const-string v0, "time"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lw71/f0$g;

    move-object v2, p1

    move-wide v3, p2

    move-wide v5, p4

    move-wide v7, p6

    invoke-direct/range {v1 .. v8}, Lw71/f0$g;-><init>(Lcom/whoop/design/util/TextResource;JJJ)V

    return-object v1
.end method

.method public final c()J
    .locals 2

    iget-wide v0, p0, Lw71/f0$g;->d:J

    return-wide v0
.end method

.method public final d()J
    .locals 2

    iget-wide v0, p0, Lw71/f0$g;->c:J

    return-wide v0
.end method

.method public final e()J
    .locals 2

    iget-wide v0, p0, Lw71/f0$g;->b:J

    return-wide v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lw71/f0$g;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lw71/f0$g;

    iget-object v1, p0, Lw71/f0$g;->a:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lw71/f0$g;->a:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-wide v3, p0, Lw71/f0$g;->b:J

    iget-wide v5, p1, Lw71/f0$g;->b:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget-wide v3, p0, Lw71/f0$g;->c:J

    iget-wide v5, p1, Lw71/f0$g;->c:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_4

    return v2

    :cond_4
    iget-wide v3, p0, Lw71/f0$g;->d:J

    iget-wide v5, p1, Lw71/f0$g;->d:J

    cmp-long p1, v3, v5

    if-eqz p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final f()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lw71/f0$g;->a:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lw71/f0$g;->a:Lcom/whoop/design/util/TextResource;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-wide v2, p0, Lw71/f0$g;->b:J

    invoke-static {v0, v2, v3, v1}, Ld;->e(IJI)I

    move-result v0

    iget-wide v2, p0, Lw71/f0$g;->c:J

    invoke-static {v0, v2, v3, v1}, Ld;->e(IJI)I

    move-result v0

    iget-wide v1, p0, Lw71/f0$g;->d:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 9

    iget-object v0, p0, Lw71/f0$g;->a:Lcom/whoop/design/util/TextResource;

    iget-wide v1, p0, Lw71/f0$g;->b:J

    iget-wide v3, p0, Lw71/f0$g;->c:J

    iget-wide v5, p0, Lw71/f0$g;->d:J

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "TimeSlider(time="

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", minTime="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ", maxTime="

    const-string v1, ", curTime="

    invoke-static {v7, v0, v3, v4, v1}, Lb9/y;->A(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)V

    const-string v0, ")"

    invoke-static {v5, v6, v0, v7}, Ld;->k(JLjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
