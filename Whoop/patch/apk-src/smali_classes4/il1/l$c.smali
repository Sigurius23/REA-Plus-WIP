.class public final Lil1/l$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lil1/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0010\u0008\u0087\u0008\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ8\u0010\u000c\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008H\u00c6\u0001\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010\u0018\u001a\u0004\u0008\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u001c\u001a\u0004\u0008\u001d\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001f\u0010 \u001a\u0004\u0008!\u0010\"R\u0017\u0010\t\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001d\u0010#\u001a\u0004\u0008\u001f\u0010$\u00a8\u0006%"
    }
    d2 = {
        "Lil1/l$c;",
        "",
        "Ljava/time/LocalDate;",
        "lastRequestedDate",
        "",
        "lastKnownDateTimeStamp",
        "Lfm1/g;",
        "lastKnownPillarType",
        "Lil1/u;",
        "homePillarAction",
        "<init>",
        "(Ljava/time/LocalDate;JLfm1/g;Lil1/u;)V",
        "a",
        "(Ljava/time/LocalDate;JLfm1/g;Lil1/u;)Lil1/l$c;",
        "",
        "toString",
        "()Ljava/lang/String;",
        "",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/time/LocalDate;",
        "f",
        "()Ljava/time/LocalDate;",
        "b",
        "J",
        "d",
        "()J",
        "c",
        "Lfm1/g;",
        "e",
        "()Lfm1/g;",
        "Lil1/u;",
        "()Lil1/u;",
        "home_release"
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
.field private final a:Ljava/time/LocalDate;

.field private final b:J

.field private final c:Lfm1/g;

.field private final d:Lil1/u;


# direct methods
.method public constructor <init>(Ljava/time/LocalDate;JLfm1/g;Lil1/u;)V
    .locals 1

    const-string v0, "lastRequestedDate"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lastKnownPillarType"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "homePillarAction"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lil1/l$c;->a:Ljava/time/LocalDate;

    .line 3
    iput-wide p2, p0, Lil1/l$c;->b:J

    .line 4
    iput-object p4, p0, Lil1/l$c;->c:Lfm1/g;

    .line 5
    iput-object p5, p0, Lil1/l$c;->d:Lil1/u;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/time/LocalDate;JLfm1/g;Lil1/u;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 13

    and-int/lit8 v0, p6, 0x4

    if-eqz v0, :cond_0

    .line 6
    sget-object v0, Lfm1/g;->OVERVIEW:Lfm1/g;

    move-object v5, v0

    goto :goto_0

    :cond_0
    move-object/from16 v5, p4

    :goto_0
    and-int/lit8 v0, p6, 0x8

    if-eqz v0, :cond_1

    .line 7
    new-instance v6, Lil1/u$c;

    const/16 v11, 0xf

    const/4 v12, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v6 .. v12}, Lil1/u$c;-><init>(Ljava/time/LocalDate;Lfm1/g;ZLem1/r;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :goto_1
    move-object v1, p0

    move-object v2, p1

    move-wide v3, p2

    goto :goto_2

    :cond_1
    move-object/from16 v6, p5

    goto :goto_1

    .line 8
    :goto_2
    invoke-direct/range {v1 .. v6}, Lil1/l$c;-><init>(Ljava/time/LocalDate;JLfm1/g;Lil1/u;)V

    return-void
.end method

.method public static synthetic b(Lil1/l$c;Ljava/time/LocalDate;JLfm1/g;Lil1/u;ILjava/lang/Object;)Lil1/l$c;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Lil1/l$c;->a:Ljava/time/LocalDate;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-wide p2, p0, Lil1/l$c;->b:J

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget-object p4, p0, Lil1/l$c;->c:Lfm1/g;

    :cond_2
    and-int/lit8 p6, p6, 0x8

    if-eqz p6, :cond_3

    iget-object p5, p0, Lil1/l$c;->d:Lil1/u;

    :cond_3
    move-object p6, p4

    move-object p7, p5

    move-wide p4, p2

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p7}, Lil1/l$c;->a(Ljava/time/LocalDate;JLfm1/g;Lil1/u;)Lil1/l$c;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(Ljava/time/LocalDate;JLfm1/g;Lil1/u;)Lil1/l$c;
    .locals 7

    const-string v0, "lastRequestedDate"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lastKnownPillarType"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "homePillarAction"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lil1/l$c;

    move-object v2, p1

    move-wide v3, p2

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, Lil1/l$c;-><init>(Ljava/time/LocalDate;JLfm1/g;Lil1/u;)V

    return-object v1
.end method

.method public final c()Lil1/u;
    .locals 1

    iget-object v0, p0, Lil1/l$c;->d:Lil1/u;

    return-object v0
.end method

.method public final d()J
    .locals 2

    iget-wide v0, p0, Lil1/l$c;->b:J

    return-wide v0
.end method

.method public final e()Lfm1/g;
    .locals 1

    iget-object v0, p0, Lil1/l$c;->c:Lfm1/g;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lil1/l$c;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lil1/l$c;

    iget-object v1, p0, Lil1/l$c;->a:Ljava/time/LocalDate;

    iget-object v3, p1, Lil1/l$c;->a:Ljava/time/LocalDate;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-wide v3, p0, Lil1/l$c;->b:J

    iget-wide v5, p1, Lil1/l$c;->b:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lil1/l$c;->c:Lfm1/g;

    iget-object v3, p1, Lil1/l$c;->c:Lfm1/g;

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lil1/l$c;->d:Lil1/u;

    iget-object p1, p1, Lil1/l$c;->d:Lil1/u;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final f()Ljava/time/LocalDate;
    .locals 1

    iget-object v0, p0, Lil1/l$c;->a:Ljava/time/LocalDate;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lil1/l$c;->a:Ljava/time/LocalDate;

    invoke-virtual {v0}, Ljava/time/LocalDate;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-wide v2, p0, Lil1/l$c;->b:J

    invoke-static {v0, v2, v3, v1}, Ld;->e(IJI)I

    move-result v0

    iget-object v2, p0, Lil1/l$c;->c:Lfm1/g;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lil1/l$c;->d:Lil1/u;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lil1/l$c;->a:Ljava/time/LocalDate;

    iget-wide v1, p0, Lil1/l$c;->b:J

    iget-object v3, p0, Lil1/l$c;->c:Lfm1/g;

    iget-object v4, p0, Lil1/l$c;->d:Lil1/u;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "HomeAccumulatedAction(lastRequestedDate="

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", lastKnownDateTimeStamp="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ", lastKnownPillarType="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", homePillarAction="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
