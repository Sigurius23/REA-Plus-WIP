.class public abstract Lh31/t;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\"\u001b\u0010\n\u001a\u00020\u00058BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010\u0007\u001a\u0004\u0008\u0008\u0010\t\u00a8\u0006\u000b"
    }
    d2 = {
        "",
        "event",
        "Lcom/whoop/whoopaction/domain/models/UpdateAction;",
        "d",
        "(Ljava/lang/Object;)Lcom/whoop/whoopaction/domain/models/UpdateAction;",
        "Lad3/c;",
        "a",
        "Ll83/h;",
        "c",
        "()Lad3/c;",
        "recommendationActionJson",
        "design_release"
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
.field private static final a:Ll83/h;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lh00/d0;

    const/4 v1, 0x7

    invoke-direct {v0, v1}, Lh00/d0;-><init>(I)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    sput-object v0, Lh31/t;->a:Ll83/h;

    return-void
.end method

.method public static synthetic a()Lad3/c;
    .locals 1

    invoke-static {}, Lh31/t;->e()Lad3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic b(Lad3/g;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lh31/t;->f(Lad3/g;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final c()Lad3/c;
    .locals 1

    sget-object v0, Lh31/t;->a:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lad3/c;

    return-object v0
.end method

.method public static final d(Ljava/lang/Object;)Lcom/whoop/whoopaction/domain/models/UpdateAction;
    .locals 2

    const-string v0, "event"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Lcom/whoop/navigation/models/GenericInteraction;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p0, Lcom/whoop/navigation/models/GenericInteraction;

    goto :goto_0

    :cond_0
    move-object p0, v1

    :goto_0
    if-eqz p0, :cond_1

    invoke-static {}, Lh31/t;->c()Lad3/c;

    move-result-object v0

    invoke-static {p0, v0}, Lsw2/a;->a(Lcom/whoop/navigation/models/GenericInteraction;Lad3/c;)Lcom/whoop/whoopaction/domain/models/Action;

    move-result-object p0

    goto :goto_1

    :cond_1
    move-object p0, v1

    :goto_1
    instance-of v0, p0, Lcom/whoop/whoopaction/domain/models/UpdateAction;

    if-eqz v0, :cond_2

    check-cast p0, Lcom/whoop/whoopaction/domain/models/UpdateAction;

    return-object p0

    :cond_2
    return-object v1
.end method

.method private static final e()Lad3/c;
    .locals 3

    invoke-static {}, Lu82/k;->c()Lad3/c;

    move-result-object v0

    new-instance v1, Lh00/l0;

    const/16 v2, 0xe

    invoke-direct {v1, v2}, Lh00/l0;-><init>(I)V

    invoke-static {v0, v1}, Lts/o;->b(Lad3/c;Lkotlin/jvm/functions/Function1;)Lad3/r;

    move-result-object v0

    return-object v0
.end method

.method private static final f(Lad3/g;)Ll83/a0;
    .locals 4

    const-string v0, "$this$Json"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcd3/g;

    invoke-direct {v0}, Lcd3/g;-><init>()V

    new-instance v1, Lcom/whoop/navigation/json/a;

    const/4 v2, 0x0

    const/4 v3, 0x3

    invoke-direct {v1, v2, v2, v3, v2}, Lcom/whoop/navigation/json/a;-><init>(Ljava/util/Map;Liy1/c;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const-class v2, Lcom/whoop/navigation/e;

    sget-object v3, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v3, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-virtual {v0, v2, v1}, Lcd3/g;->k(Lj93/d;Lwc3/c;)V

    invoke-virtual {v0}, Lcd3/g;->r()Lcd3/d;

    move-result-object v0

    iput-object v0, p0, Lad3/g;->o:Lcd3/f;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
