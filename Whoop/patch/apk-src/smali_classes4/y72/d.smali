.class public final Ly72/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J!\u0010\t\u001a\u00020\u00082\u0006\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ!\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\u000b2\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000b\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0011"
    }
    d2 = {
        "Ly72/d;",
        "",
        "<init>",
        "()V",
        "Lcom/whoop/sanguine/domain/models/SanguineWaitlistResponse;",
        "response",
        "Lsz0/p0;",
        "waitlistJoinModalState",
        "Lw72/g$c;",
        "b",
        "(Lcom/whoop/sanguine/domain/models/SanguineWaitlistResponse;Lsz0/p0;)Lw72/g$c;",
        "Lec3/l;",
        "Lt72/e;",
        "upstream",
        "Lw72/g;",
        "c",
        "(Lec3/l;)Lec3/l;",
        "sanguine_release"
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

.method public static final synthetic a(Ly72/d;Lcom/whoop/sanguine/domain/models/SanguineWaitlistResponse;Lsz0/p0;)Lw72/g$c;
    .locals 0

    invoke-direct {p0, p1, p2}, Ly72/d;->b(Lcom/whoop/sanguine/domain/models/SanguineWaitlistResponse;Lsz0/p0;)Lw72/g$c;

    move-result-object p0

    return-object p0
.end method

.method private final b(Lcom/whoop/sanguine/domain/models/SanguineWaitlistResponse;Lsz0/p0;)Lw72/g$c;
    .locals 9

    invoke-virtual {p1}, Lcom/whoop/sanguine/domain/models/SanguineWaitlistResponse;->getAnalytics()Lcom/whoop/sanguine/domain/models/SanguineWaitlistAnalyticsInfo;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v1, Lw72/a;

    invoke-virtual {v0}, Lcom/whoop/sanguine/domain/models/SanguineWaitlistAnalyticsInfo;->getOnWaitlist()Z

    move-result v2

    invoke-virtual {v0}, Lcom/whoop/sanguine/domain/models/SanguineWaitlistAnalyticsInfo;->getViewedLabel()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v2, v0}, Lw72/a;-><init>(ZLjava/lang/String;)V

    :goto_0
    move-object v7, v1

    goto :goto_1

    :cond_0
    const/4 v1, 0x0

    goto :goto_0

    :goto_1
    new-instance v0, Lkd1/o$c;

    invoke-virtual {p1}, Lcom/whoop/sanguine/domain/models/SanguineWaitlistResponse;->getHeaderImageUrl()Ljava/lang/String;

    move-result-object v1

    const/16 v5, 0xe

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v0 .. v6}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p1}, Lcom/whoop/sanguine/domain/models/SanguineWaitlistResponse;->getHeaderText()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-virtual {p1}, Lcom/whoop/sanguine/domain/models/SanguineWaitlistResponse;->getItems()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v5, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v1, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v5, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/design/models/DesignSystemModel;

    invoke-static {}, Ly72/a;->g()Ljb1/a;

    move-result-object v3

    invoke-virtual {v3, v2}, Ljb1/a;->h(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object v2

    invoke-virtual {v5, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_1
    invoke-virtual {p1}, Lcom/whoop/sanguine/domain/models/SanguineWaitlistResponse;->getFooter()Lcom/whoop/sanguine/domain/models/SanguineWaitlistFooter;

    move-result-object v6

    new-instance v2, Lw72/g$c;

    move-object v8, p2

    move-object v3, v0

    invoke-direct/range {v2 .. v8}, Lw72/g$c;-><init>(Lkd1/o;Lcom/whoop/design/util/TextResource;Ljava/util/List;Lcom/whoop/sanguine/domain/models/SanguineWaitlistFooter;Lw72/a;Lsz0/p0;)V

    return-object v2
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

    new-instance v0, Ly72/c;

    sget-object v1, Lw72/g$b;->b:Lw72/g$b;

    invoke-direct {v0, v1}, Ly72/c;-><init>(Lw72/g;)V

    new-instance v1, Ly72/d$b;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Ly72/d$b;-><init>(Ly72/d;Lq83/d;)V

    new-instance v2, Lec3/l1;

    invoke-direct {v2, v0, p1, v1}, Lec3/l1;-><init>(Ljava/lang/Object;Lec3/l;Lkotlin/jvm/functions/Function3;)V

    new-instance p1, Ly72/d$a;

    invoke-direct {p1, v2}, Ly72/d$a;-><init>(Lec3/l;)V

    return-object p1
.end method
