.class public final Lvl2/p;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J!\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00082\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\r"
    }
    d2 = {
        "Lvl2/p;",
        "",
        "<init>",
        "()V",
        "Lvl2/n;",
        "Lvl2/b0;",
        "b",
        "(Lvl2/n;)Lvl2/b0;",
        "Lec3/l;",
        "Lvl2/o;",
        "upstream",
        "c",
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

.method public static final synthetic a(Lvl2/p;Lvl2/n;)Lvl2/b0;
    .locals 0

    invoke-direct {p0, p1}, Lvl2/p;->b(Lvl2/n;)Lvl2/b0;

    move-result-object p0

    return-object p0
.end method

.method private final b(Lvl2/n;)Lvl2/b0;
    .locals 6

    invoke-virtual {p1}, Lvl2/n;->b()Lvl2/h;

    move-result-object p1

    instance-of v0, p1, Lvl2/h$a;

    if-eqz v0, :cond_0

    check-cast p1, Lvl2/h$a;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lvl2/h$a;->a()Lvl2/b0;

    move-result-object p1

    if-nez p1, :cond_1

    goto :goto_1

    :cond_1
    return-object p1

    :cond_2
    :goto_1
    new-instance v0, Lvl2/b0;

    const/4 v4, 0x7

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v5}, Lvl2/b0;-><init>(Ljava/lang/Integer;Ljava/lang/String;Ljava/time/LocalDateTime;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method


# virtual methods
.method public final c(Lec3/l;)Lec3/l;
    .locals 3
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

    new-instance v0, Lvl2/n;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lvl2/n;-><init>(Lvl2/h;)V

    new-instance v2, Lvl2/p$a;

    invoke-direct {v2, p0, v1}, Lvl2/p$a;-><init>(Lvl2/p;Lq83/d;)V

    new-instance v1, Lec3/l1;

    invoke-direct {v1, v0, p1, v2}, Lec3/l1;-><init>(Ljava/lang/Object;Lec3/l;Lkotlin/jvm/functions/Function3;)V

    return-object v1
.end method
