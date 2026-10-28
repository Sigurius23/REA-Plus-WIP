.class public abstract Ltw2/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0008\u0005\u001a/\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0008\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0000\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u001a\u0017\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0008H\u0000\u00a2\u0006\u0004\u0008\n\u0010\u000b\" \u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u000c8\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\n\u0010\r\u001a\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0011"
    }
    d2 = {
        "",
        "maxBytes",
        "Lkotlin/Function1;",
        "Ltw2/a;",
        "",
        "encode",
        "b",
        "(Ljava/lang/Long;Lkotlin/jvm/functions/Function1;)[B",
        "",
        "byteCount",
        "a",
        "(I)J",
        "",
        "Ljava/util/List;",
        "getENCODE_LADDER",
        "()Ljava/util/List;",
        "ENCODE_LADDER",
        "whoop-action_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ltw2/a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 8

    new-instance v0, Ltw2/a;

    const/16 v1, 0x5a

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ltw2/a;-><init>(IZ)V

    move v3, v1

    new-instance v1, Ltw2/a;

    const/16 v4, 0x50

    invoke-direct {v1, v4, v2}, Ltw2/a;-><init>(IZ)V

    move v5, v2

    new-instance v2, Ltw2/a;

    const/16 v6, 0x46

    invoke-direct {v2, v6, v5}, Ltw2/a;-><init>(IZ)V

    move v5, v3

    new-instance v3, Ltw2/a;

    const/4 v7, 0x1

    invoke-direct {v3, v5, v7}, Ltw2/a;-><init>(IZ)V

    move v5, v4

    new-instance v4, Ltw2/a;

    invoke-direct {v4, v5, v7}, Ltw2/a;-><init>(IZ)V

    new-instance v5, Ltw2/a;

    invoke-direct {v5, v6, v7}, Ltw2/a;-><init>(IZ)V

    filled-new-array/range {v0 .. v5}, [Ltw2/a;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Ltw2/f;->a:Ljava/util/List;

    return-void
.end method

.method public static final a(I)J
    .locals 4

    add-int/lit8 p0, p0, 0x2

    div-int/lit8 p0, p0, 0x3

    int-to-long v0, p0

    const-wide/16 v2, 0x4

    mul-long/2addr v0, v2

    return-wide v0
.end method

.method public static final b(Ljava/lang/Long;Lkotlin/jvm/functions/Function1;)[B
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Long;",
            "Lkotlin/jvm/functions/Function1;",
            ")[B"
        }
    .end annotation

    const-string v0, "encode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    const-wide/16 v3, 0x0

    cmp-long v1, v1, v3

    if-gtz v1, :cond_0

    return-object v0

    :cond_0
    sget-object v1, Ltw2/f;->a:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ltw2/a;

    invoke-interface {p1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [B

    if-eqz p0, :cond_2

    array-length v3, v2

    invoke-static {v3}, Ltw2/f;->a(I)J

    move-result-wide v3

    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    cmp-long v3, v3, v5

    if-gtz v3, :cond_1

    :cond_2
    return-object v2

    :cond_3
    return-object v0
.end method
