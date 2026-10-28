.class public final Lc51/t;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\n\u0008\u0087\u0008\u0018\u00002\u00020\u0001B%\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0010\u0010\n\u001a\u00020\tH\u00d6\u0001\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u000cH\u00d6\u0001\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010\u0014\u001a\u0004\u0008\u0013\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u0017\u001a\u0004\u0008\u0016\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u0017\u001a\u0004\u0008\u0019\u0010\u0018\u00a8\u0006\u001a"
    }
    d2 = {
        "Lc51/t;",
        "",
        "Li2/x;",
        "color",
        "Ld51/d;",
        "startRange",
        "stopRange",
        "<init>",
        "(JLd51/d;Ld51/d;Lkotlin/jvm/internal/DefaultConstructorMarker;)V",
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
        "J",
        "()J",
        "b",
        "Ld51/d;",
        "()Ld51/d;",
        "c",
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
.field private final a:J

.field private final b:Ld51/d;

.field private final c:Ld51/d;


# direct methods
.method private constructor <init>(JLd51/d;Ld51/d;)V
    .locals 1

    const-string v0, "startRange"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "stopRange"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-wide p1, p0, Lc51/t;->a:J

    .line 4
    iput-object p3, p0, Lc51/t;->b:Ld51/d;

    .line 5
    iput-object p4, p0, Lc51/t;->c:Ld51/d;

    return-void
.end method

.method public synthetic constructor <init>(JLd51/d;Ld51/d;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 11

    and-int/lit8 v0, p5, 0x1

    if-eqz v0, :cond_0

    const-wide p1, 0xff080808L

    .line 6
    invoke-static {p1, p2}, Li2/w0;->e(J)J

    move-result-wide p1

    :cond_0
    move-wide v1, p1

    and-int/lit8 p1, p5, 0x2

    if-eqz p1, :cond_1

    .line 7
    new-instance v3, Ld51/d;

    const/16 v8, 0x8

    const/4 v9, 0x0

    const/high16 v4, 0x3e800000    # 0.25f

    sget-object v5, Lm83/y;->w:Lm83/y;

    const v6, 0x3e19999a    # 0.15f

    const/4 v7, 0x0

    invoke-direct/range {v3 .. v9}, Ld51/d;-><init>(FLjava/util/List;FLd0/z;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_0

    :cond_1
    move-object v3, p3

    :goto_0
    and-int/lit8 p1, p5, 0x4

    if-eqz p1, :cond_2

    .line 8
    new-instance v4, Ld51/d;

    const p1, 0x3f0ccccd    # 0.55f

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-static {p1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v6

    const/16 v9, 0x8

    const/4 v10, 0x0

    const v5, 0x3f19999a    # 0.6f

    const v7, 0x3ecccccd    # 0.4f

    const/4 v8, 0x0

    invoke-direct/range {v4 .. v10}, Ld51/d;-><init>(FLjava/util/List;FLd0/z;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_1

    :cond_2
    move-object v4, p4

    :goto_1
    const/4 v5, 0x0

    move-object v0, p0

    .line 9
    invoke-direct/range {v0 .. v5}, Lc51/t;-><init>(JLd51/d;Ld51/d;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(JLd51/d;Ld51/d;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Lc51/t;-><init>(JLd51/d;Ld51/d;)V

    return-void
.end method


# virtual methods
.method public final a()J
    .locals 2

    iget-wide v0, p0, Lc51/t;->a:J

    return-wide v0
.end method

.method public final b()Ld51/d;
    .locals 1

    iget-object v0, p0, Lc51/t;->b:Ld51/d;

    return-object v0
.end method

.method public final c()Ld51/d;
    .locals 1

    iget-object v0, p0, Lc51/t;->c:Ld51/d;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lc51/t;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lc51/t;

    iget-wide v3, p0, Lc51/t;->a:J

    iget-wide v5, p1, Lc51/t;->a:J

    invoke-static {v3, v4, v5, v6}, Li2/x;->d(JJ)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lc51/t;->b:Ld51/d;

    iget-object v3, p1, Lc51/t;->b:Ld51/d;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lc51/t;->c:Ld51/d;

    iget-object p1, p1, Lc51/t;->c:Ld51/d;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-wide v0, p0, Lc51/t;->a:J

    sget v2, Li2/x;->o:I

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lc51/t;->b:Ld51/d;

    invoke-virtual {v1}, Ld51/d;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lc51/t;->c:Ld51/d;

    invoke-virtual {v0}, Ld51/d;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-wide v0, p0, Lc51/t;->a:J

    invoke-static {v0, v1}, Li2/x;->j(J)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lc51/t;->b:Ld51/d;

    iget-object v2, p0, Lc51/t;->c:Ld51/d;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "CenterShadowSettings(color="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", startRange="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", stopRange="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
