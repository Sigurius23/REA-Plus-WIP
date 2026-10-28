.class public final Lvl2/l;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J!\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00042\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "Lvl2/l;",
        "",
        "<init>",
        "()V",
        "Lec3/l;",
        "Lvl2/x;",
        "upstream",
        "Lvl2/y;",
        "a",
        "(Lec3/l;)Lec3/l;",
        "trends_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lec3/l;)Lec3/l;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/l;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    const-string v0, "upstream"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lvl2/y$a;

    sget-object v2, Lvl2/a;->MONTHLY:Lvl2/a;

    sget-object v3, Lor2/h0;->NONE:Lor2/h0;

    const/16 v6, 0x8

    const/4 v7, 0x0

    const-string v4, ""

    const/4 v5, 0x0

    invoke-direct/range {v1 .. v7}, Lvl2/y$a;-><init>(Lvl2/a;Lor2/h0;Ljava/lang/String;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v0, Lvl2/l$a;

    const/4 v2, 0x0

    invoke-direct {v0, v2}, Lvl2/l$a;-><init>(Lq83/d;)V

    new-instance v2, Lec3/l1;

    invoke-direct {v2, v1, p1, v0}, Lec3/l1;-><init>(Ljava/lang/Object;Lec3/l;Lkotlin/jvm/functions/Function3;)V

    const/4 p1, 0x1

    invoke-static {v2, p1}, Lec3/v;->v(Lec3/l;I)Lec3/h0;

    move-result-object p1

    return-object p1
.end method
