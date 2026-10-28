.class public final Lno0/l0$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll1/n3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lno0/l0;->Z(Llo0/d0;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;I)V
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
        "no0/l0$c",
        "Ll1/n3;",
        "",
        "utcTimeMillis",
        "",
        "isSelectableDate",
        "(J)Z",
        "clinician-in-the-loop_release"
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

    iput-object p1, p0, Lno0/l0$c;->a:Ljava/lang/Long;

    iput-object p2, p0, Lno0/l0$c;->b:Ljava/lang/Long;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public isSelectableDate(J)Z
    .locals 4

    iget-object v0, p0, Lno0/l0$c;->a:Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    iget-object v2, p0, Lno0/l0$c;->b:Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    cmp-long v2, p1, v2

    const/4 v3, 0x0

    if-gtz v2, :cond_0

    cmp-long p1, v0, p1

    if-gtz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    return v3
.end method

.method public bridge isSelectableYear(I)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method
