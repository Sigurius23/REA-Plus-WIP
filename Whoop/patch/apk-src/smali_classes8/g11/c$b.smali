.class public final Lg11/c$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll1/n3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lg11/c;->O(Ljava/time/LocalDate;Ljava/time/LocalDate;Ljava/time/LocalDate;Landroidx/compose/runtime/Composer;I)Ll1/g1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "g11/c$b",
        "Ll1/n3;",
        "",
        "utcTimeMillis",
        "",
        "isSelectableDate",
        "(J)Z",
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
.field final synthetic a:Ljava/lang/Long;

.field final synthetic b:Ljava/lang/Long;


# direct methods
.method public constructor <init>(Ljava/lang/Long;Ljava/lang/Long;)V
    .locals 0

    iput-object p1, p0, Lg11/c$b;->a:Ljava/lang/Long;

    iput-object p2, p0, Lg11/c$b;->b:Ljava/lang/Long;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public isSelectableDate(J)Z
    .locals 5

    iget-object v0, p0, Lg11/c$b;->a:Ljava/lang/Long;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    move-result-wide v3

    cmp-long v0, p1, v3

    if-ltz v0, :cond_0

    goto :goto_0

    :cond_0
    move v0, v1

    goto :goto_1

    :cond_1
    :goto_0
    move v0, v2

    :goto_1
    iget-object v3, p0, Lg11/c$b;->b:Ljava/lang/Long;

    if-eqz v3, :cond_3

    invoke-virtual {v3}, Ljava/lang/Number;->longValue()J

    move-result-wide v3

    cmp-long p1, p1, v3

    if-gtz p1, :cond_2

    goto :goto_2

    :cond_2
    move p1, v1

    goto :goto_3

    :cond_3
    :goto_2
    move p1, v2

    :goto_3
    if-eqz v0, :cond_4

    if-eqz p1, :cond_4

    return v2

    :cond_4
    return v1
.end method

.method public bridge isSelectableYear(I)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method
