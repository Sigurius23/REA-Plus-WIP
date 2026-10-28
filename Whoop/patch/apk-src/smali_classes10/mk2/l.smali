.class public final Lmk2/l;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0012\u0008\u0087\u0008\u0018\u00002\u00020\u0001BG\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0014\u0008\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00080\u0006\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n\u0012\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000c\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u001b\u001a\u0004\u0008\u001c\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001e\u0010\u001f\u001a\u0004\u0008\u001e\u0010 R#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00080\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008!\u0010\"\u001a\u0004\u0008!\u0010#R\u0017\u0010\u000b\u001a\u00020\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008$\u0010%\u001a\u0004\u0008\u001a\u0010&R\u0019\u0010\r\u001a\u0004\u0018\u00010\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010\'\u001a\u0004\u0008$\u0010(\u00a8\u0006)"
    }
    d2 = {
        "Lmk2/l;",
        "",
        "Lmk2/i;",
        "strain",
        "Lmk2/e;",
        "heartRate",
        "",
        "Lcom/whoop/hrZones/network/ZoneID;",
        "Ljava/time/Duration;",
        "hrZoneDurations",
        "Lmk2/d;",
        "duration",
        "Lmk2/f;",
        "map",
        "<init>",
        "(Lmk2/i;Lmk2/e;Ljava/util/Map;Lmk2/d;Lmk2/f;)V",
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
        "a",
        "Lmk2/i;",
        "e",
        "()Lmk2/i;",
        "b",
        "Lmk2/e;",
        "()Lmk2/e;",
        "c",
        "Ljava/util/Map;",
        "()Ljava/util/Map;",
        "d",
        "Lmk2/d;",
        "()Lmk2/d;",
        "Lmk2/f;",
        "()Lmk2/f;",
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


# instance fields
.field private final a:Lmk2/i;

.field private final b:Lmk2/e;

.field private final c:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lcom/whoop/hrZones/network/ZoneID;",
            "Ljava/time/Duration;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Lmk2/d;

.field private final e:Lmk2/f;


# direct methods
.method public constructor <init>(Lmk2/i;Lmk2/e;Ljava/util/Map;Lmk2/d;Lmk2/f;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lmk2/i;",
            "Lmk2/e;",
            "Ljava/util/Map<",
            "Lcom/whoop/hrZones/network/ZoneID;",
            "Ljava/time/Duration;",
            ">;",
            "Lmk2/d;",
            "Lmk2/f;",
            ")V"
        }
    .end annotation

    const-string v0, "strain"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "heartRate"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "hrZoneDurations"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "duration"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lmk2/l;->a:Lmk2/i;

    .line 3
    iput-object p2, p0, Lmk2/l;->b:Lmk2/e;

    .line 4
    iput-object p3, p0, Lmk2/l;->c:Ljava/util/Map;

    .line 5
    iput-object p4, p0, Lmk2/l;->d:Lmk2/d;

    .line 6
    iput-object p5, p0, Lmk2/l;->e:Lmk2/f;

    return-void
.end method

.method public synthetic constructor <init>(Lmk2/i;Lmk2/e;Ljava/util/Map;Lmk2/d;Lmk2/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 14

    and-int/lit8 v0, p6, 0x1

    if-eqz v0, :cond_0

    .line 7
    new-instance v1, Lmk2/i;

    const/16 v12, 0xff

    const/4 v13, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const-wide/16 v8, 0x0

    const-wide/16 v10, 0x0

    invoke-direct/range {v1 .. v13}, Lmk2/i;-><init>(FFFLjava/lang/Float;FFDDILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object p1, v1

    :cond_0
    and-int/lit8 v0, p6, 0x2

    const/4 v1, 0x3

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    .line 8
    new-instance v0, Lmk2/e;

    invoke-direct {v0, v2, v2, v1, v2}, Lmk2/e;-><init>(Lyg2/d;Ljava/lang/Double;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_0

    :cond_1
    move-object/from16 v0, p2

    :goto_0
    and-int/lit8 v3, p6, 0x4

    if-eqz v3, :cond_2

    .line 9
    sget-object v3, Lm83/z;->w:Lm83/z;

    goto :goto_1

    :cond_2
    move-object/from16 v3, p3

    :goto_1
    and-int/lit8 v4, p6, 0x8

    if-eqz v4, :cond_3

    .line 10
    new-instance v4, Lmk2/d;

    invoke-direct {v4, v2, v2, v1, v2}, Lmk2/d;-><init>(Ljava/time/Duration;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_2

    :cond_3
    move-object/from16 v4, p4

    :goto_2
    and-int/lit8 v1, p6, 0x10

    if-eqz v1, :cond_4

    move-object/from16 p6, v2

    :goto_3
    move-object/from16 p2, p1

    move-object/from16 p3, v0

    move-object/from16 p4, v3

    move-object/from16 p5, v4

    move-object p1, p0

    goto :goto_4

    :cond_4
    move-object/from16 p6, p5

    goto :goto_3

    .line 11
    :goto_4
    invoke-direct/range {p1 .. p6}, Lmk2/l;-><init>(Lmk2/i;Lmk2/e;Ljava/util/Map;Lmk2/d;Lmk2/f;)V

    return-void
.end method


# virtual methods
.method public final a()Lmk2/d;
    .locals 1

    iget-object v0, p0, Lmk2/l;->d:Lmk2/d;

    return-object v0
.end method

.method public final b()Lmk2/e;
    .locals 1

    iget-object v0, p0, Lmk2/l;->b:Lmk2/e;

    return-object v0
.end method

.method public final c()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Lcom/whoop/hrZones/network/ZoneID;",
            "Ljava/time/Duration;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lmk2/l;->c:Ljava/util/Map;

    return-object v0
.end method

.method public final d()Lmk2/f;
    .locals 1

    iget-object v0, p0, Lmk2/l;->e:Lmk2/f;

    return-object v0
.end method

.method public final e()Lmk2/i;
    .locals 1

    iget-object v0, p0, Lmk2/l;->a:Lmk2/i;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lmk2/l;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lmk2/l;

    iget-object v1, p0, Lmk2/l;->a:Lmk2/i;

    iget-object v3, p1, Lmk2/l;->a:Lmk2/i;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lmk2/l;->b:Lmk2/e;

    iget-object v3, p1, Lmk2/l;->b:Lmk2/e;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lmk2/l;->c:Ljava/util/Map;

    iget-object v3, p1, Lmk2/l;->c:Ljava/util/Map;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lmk2/l;->d:Lmk2/d;

    iget-object v3, p1, Lmk2/l;->d:Lmk2/d;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lmk2/l;->e:Lmk2/f;

    iget-object p1, p1, Lmk2/l;->e:Lmk2/f;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lmk2/l;->a:Lmk2/i;

    invoke-virtual {v0}, Lmk2/i;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lmk2/l;->b:Lmk2/e;

    invoke-virtual {v2}, Lmk2/e;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lmk2/l;->c:Ljava/util/Map;

    invoke-static {v0, v2, v1}, Lc13/a;->e(Ljava/util/Map;II)I

    move-result v0

    iget-object v2, p0, Lmk2/l;->d:Lmk2/d;

    invoke-virtual {v2}, Lmk2/d;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lmk2/l;->e:Lmk2/f;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lmk2/f;->hashCode()I

    move-result v0

    :goto_0
    add-int/2addr v2, v0

    return v2
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lmk2/l;->a:Lmk2/i;

    iget-object v1, p0, Lmk2/l;->b:Lmk2/e;

    iget-object v2, p0, Lmk2/l;->c:Ljava/util/Map;

    iget-object v3, p0, Lmk2/l;->d:Lmk2/d;

    iget-object v4, p0, Lmk2/l;->e:Lmk2/f;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "TrackSessionDomainState(strain="

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", heartRate="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", hrZoneDurations="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", duration="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", map="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
