.class public final Lc51/y;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0006\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u0011\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0010\u0010\n\u001a\u00020\tH\u00d6\u0001\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010\u0011\u001a\u0004\u0008\u0010\u0010\u0012\u00a8\u0006\u0013"
    }
    d2 = {
        "Lc51/y;",
        "",
        "Li2/t;",
        "brush",
        "<init>",
        "(Li2/t;)V",
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
        "Li2/t;",
        "()Li2/t;",
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
.field private final a:Li2/t;


# direct methods
.method public constructor <init>(Li2/t;)V
    .locals 1

    const-string v0, "brush"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lc51/y;->a:Li2/t;

    return-void
.end method

.method public constructor <init>(Li2/t;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    .line 3
    sget-object v0, Li2/t;->b:Li2/s;

    const/4 p1, 0x0

    .line 4
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p2

    const/16 p3, 0x10

    invoke-static {p1, p1, p1, p1, p3}, Li2/w0;->f(FFFFI)J

    move-result-wide v1

    .line 5
    new-instance v3, Li2/x;

    invoke-direct {v3, v1, v2}, Li2/x;-><init>(J)V

    .line 6
    new-instance v1, Ll83/k;

    invoke-direct {v1, p2, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const p2, 0x3e4ccccd    # 0.2f

    .line 7
    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p2

    invoke-static {p1, p1, p1, p1, p3}, Li2/w0;->f(FFFFI)J

    move-result-wide v2

    .line 8
    new-instance v4, Li2/x;

    invoke-direct {v4, v2, v3}, Li2/x;-><init>(J)V

    .line 9
    new-instance v2, Ll83/k;

    invoke-direct {v2, p2, v4}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/high16 p2, 0x3f800000    # 1.0f

    .line 10
    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p2

    const v3, 0x3f333333    # 0.7f

    invoke-static {p1, p1, p1, v3, p3}, Li2/w0;->f(FFFFI)J

    move-result-wide v3

    .line 11
    new-instance p1, Li2/x;

    invoke-direct {p1, v3, v4}, Li2/x;-><init>(J)V

    .line 12
    new-instance p3, Ll83/k;

    invoke-direct {p3, p2, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 13
    filled-new-array {v1, v2, p3}, [Ll83/k;

    move-result-object v1

    const/4 v4, 0x0

    const/16 v5, 0xe

    const-wide/16 v2, 0x0

    .line 14
    invoke-static/range {v0 .. v5}, Li2/s;->h(Li2/s;[Ll83/k;JFI)Li2/u0;

    move-result-object p1

    .line 15
    :cond_0
    invoke-direct {p0, p1}, Lc51/y;-><init>(Li2/t;)V

    return-void
.end method


# virtual methods
.method public final a()Li2/t;
    .locals 1

    iget-object v0, p0, Lc51/y;->a:Li2/t;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lc51/y;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lc51/y;

    iget-object v1, p0, Lc51/y;->a:Li2/t;

    iget-object p1, p1, Lc51/y;->a:Li2/t;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lc51/y;->a:Li2/t;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lc51/y;->a:Li2/t;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "PrimitiveEdgeFadeSettings(brush="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
