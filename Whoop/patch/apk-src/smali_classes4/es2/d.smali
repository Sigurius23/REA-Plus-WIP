.class public final Les2/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lod1/g;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Les2/d$a;,
        Les2/d$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lod1/g<",
        "Les2/b;",
        "Les2/c;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\r\u0008\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u001f\u001dB\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ#\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\n2\u000c\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u00020\nH\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000cH\u0082@\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u001f\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00020\n*\u0008\u0012\u0004\u0012\u00020\u00020\nH\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u000eJ#\u0010\u0018\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00170\u00160\n2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u001b\u0010\u001a\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ#\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u00030\n2\u000c\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u001c\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010 R\u001a\u0010#\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008!\u0010\"\u00a8\u0006$"
    }
    d2 = {
        "Les2/d;",
        "Lod1/g;",
        "Les2/b;",
        "Les2/c;",
        "Lnm0/e;",
        "cachedApiSource",
        "Lfs2/k;",
        "videoCallManager",
        "<init>",
        "(Lnm0/e;Lfs2/k;)V",
        "Lec3/l;",
        "upstream",
        "Les2/d$a;",
        "h",
        "(Lec3/l;)Lec3/l;",
        "action",
        "Ll83/a0;",
        "k",
        "(Les2/d$a;Lq83/d;)Ljava/lang/Object;",
        "j",
        "",
        "callId",
        "Lpm0/a;",
        "Lcom/whoop/videocall/api/VideoCallContentResponse;",
        "i",
        "(Ljava/lang/String;)Lec3/l;",
        "g",
        "(Les2/c;Les2/d$a;)Les2/c;",
        "interact",
        "a",
        "Lnm0/e;",
        "b",
        "Lfs2/k;",
        "c",
        "Lec3/l;",
        "callFlow",
        "video-call_release"
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
.field private final a:Lnm0/e;

.field private final b:Lfs2/k;

.field private final c:Lec3/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/l;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lnm0/e;Lfs2/k;)V
    .locals 1

    const-string v0, "cachedApiSource"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "videoCallManager"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Les2/d;->a:Lnm0/e;

    iput-object p2, p0, Les2/d;->b:Lfs2/k;

    invoke-interface {p2}, Lfs2/k;->c()Lec3/l;

    move-result-object p1

    new-instance p2, Les2/d$m;

    invoke-direct {p2, p1}, Les2/d$m;-><init>(Lec3/l;)V

    iput-object p2, p0, Les2/d;->c:Lec3/l;

    return-void
.end method

.method public static final synthetic c(Les2/d;Les2/c;Les2/d$a;)Les2/c;
    .locals 0

    invoke-direct {p0, p1, p2}, Les2/d;->g(Les2/c;Les2/d$a;)Les2/c;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic d(Les2/d;Ljava/lang/String;)Lec3/l;
    .locals 0

    invoke-direct {p0, p1}, Les2/d;->i(Ljava/lang/String;)Lec3/l;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic e(Les2/d;)Lfs2/k;
    .locals 0

    iget-object p0, p0, Les2/d;->b:Lfs2/k;

    return-object p0
.end method

.method public static final synthetic f(Les2/d;Les2/d$a;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Les2/d;->k(Les2/d$a;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final g(Les2/c;Les2/d$a;)Les2/c;
    .locals 13

    instance-of v0, p2, Les2/d$a$a;

    const/4 v1, 0x0

    if-eqz v0, :cond_7

    invoke-virtual {p1}, Les2/c;->d()Lfs2/l;

    move-result-object v0

    instance-of v0, v0, Lfs2/l$c;

    if-eqz v0, :cond_0

    sget-object v1, Les2/a$c;->a:Les2/a$c;

    :cond_0
    move-object v3, v1

    check-cast p2, Les2/d$a$a;

    invoke-virtual {p2}, Les2/d$a$a;->a()Lpm0/a;

    move-result-object p2

    instance-of v0, p2, Lpm0/a$e;

    if-eqz v0, :cond_1

    sget-object v5, Les2/a$b;->a:Les2/a$b;

    const/16 v11, 0x3e

    const/4 v12, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v4, p1

    invoke-static/range {v4 .. v12}, Les2/c;->b(Les2/c;Les2/a;Lcom/whoop/videocall/api/VideoCallContentResponse;Lfs2/l;Lhs2/a;ZLcom/whoop/navigation/e;ILjava/lang/Object;)Les2/c;

    move-result-object p1

    return-object p1

    :cond_1
    move-object v0, p1

    instance-of p1, p2, Lpm0/a$a$b;

    if-eqz p1, :cond_2

    check-cast p2, Lpm0/a$a$b;

    invoke-virtual {p2}, Lpm0/a$a$b;->getData()Ljava/lang/Object;

    move-result-object p1

    move-object v4, p1

    check-cast v4, Lcom/whoop/videocall/api/VideoCallContentResponse;

    const/16 v9, 0x3c

    const/4 v10, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v2, v0

    invoke-static/range {v2 .. v10}, Les2/c;->b(Les2/c;Les2/a;Lcom/whoop/videocall/api/VideoCallContentResponse;Lfs2/l;Lhs2/a;ZLcom/whoop/navigation/e;ILjava/lang/Object;)Les2/c;

    move-result-object p1

    return-object p1

    :cond_2
    instance-of p1, p2, Lpm0/a$a$a;

    if-eqz p1, :cond_3

    check-cast p2, Lpm0/a$a$a;

    invoke-virtual {p2}, Lpm0/a$a$a;->getData()Ljava/lang/Object;

    move-result-object p1

    move-object v4, p1

    check-cast v4, Lcom/whoop/videocall/api/VideoCallContentResponse;

    const/16 v9, 0x3c

    const/4 v10, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v2, v0

    invoke-static/range {v2 .. v10}, Les2/c;->b(Les2/c;Les2/a;Lcom/whoop/videocall/api/VideoCallContentResponse;Lfs2/l;Lhs2/a;ZLcom/whoop/navigation/e;ILjava/lang/Object;)Les2/c;

    move-result-object p1

    return-object p1

    :cond_3
    instance-of p1, p2, Lpm0/a$d;

    if-eqz p1, :cond_4

    check-cast p2, Lpm0/a$d;

    invoke-virtual {p2}, Lpm0/a$d;->getData()Ljava/lang/Object;

    move-result-object p1

    move-object v4, p1

    check-cast v4, Lcom/whoop/videocall/api/VideoCallContentResponse;

    const/16 v9, 0x3c

    const/4 v10, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v2, v0

    invoke-static/range {v2 .. v10}, Les2/c;->b(Les2/c;Les2/a;Lcom/whoop/videocall/api/VideoCallContentResponse;Lfs2/l;Lhs2/a;ZLcom/whoop/navigation/e;ILjava/lang/Object;)Les2/c;

    move-result-object p1

    return-object p1

    :cond_4
    instance-of p1, p2, Lpm0/a$c;

    if-eqz p1, :cond_6

    check-cast p2, Lpm0/a$b;

    invoke-static {p2}, Lpm0/b;->a(Lpm0/a$b;)Z

    move-result p1

    if-eqz p1, :cond_5

    sget-object p1, Les2/a$d;->a:Les2/a$d;

    :goto_0
    move-object v1, p1

    goto :goto_1

    :cond_5
    sget-object p1, Les2/a$c;->a:Les2/a$c;

    goto :goto_0

    :goto_1
    const/16 v7, 0x3e

    const/4 v8, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v0 .. v8}, Les2/c;->b(Les2/c;Les2/a;Lcom/whoop/videocall/api/VideoCallContentResponse;Lfs2/l;Lhs2/a;ZLcom/whoop/navigation/e;ILjava/lang/Object;)Les2/c;

    move-result-object p1

    return-object p1

    :cond_6
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_7
    move-object v0, p1

    instance-of p1, p2, Les2/d$a$b;

    const/4 v2, 0x1

    if-eqz p1, :cond_12

    invoke-virtual {v0}, Les2/c;->d()Lfs2/l;

    move-result-object p1

    instance-of p1, p1, Lfs2/l$f;

    const/4 v3, 0x0

    if-nez p1, :cond_9

    invoke-virtual {v0}, Les2/c;->d()Lfs2/l;

    move-result-object p1

    instance-of p1, p1, Lfs2/l$e;

    if-nez p1, :cond_9

    invoke-virtual {v0}, Les2/c;->d()Lfs2/l;

    move-result-object p1

    instance-of p1, p1, Lfs2/l$a;

    if-eqz p1, :cond_8

    goto :goto_2

    :cond_8
    move p1, v3

    goto :goto_3

    :cond_9
    :goto_2
    move p1, v2

    :goto_3
    check-cast p2, Les2/d$a$b;

    invoke-virtual {p2}, Les2/d$a$b;->a()Lfs2/l;

    move-result-object v4

    instance-of v4, v4, Lfs2/l$b;

    if-eqz v4, :cond_a

    if-eqz p1, :cond_a

    goto :goto_4

    :cond_a
    move v2, v3

    :goto_4
    if-nez v2, :cond_b

    move-object v4, v1

    goto :goto_6

    :cond_b
    invoke-virtual {v0}, Les2/c;->h()Lcom/whoop/navigation/e;

    move-result-object p1

    if-eqz p1, :cond_c

    new-instance p1, Lhs2/a$a;

    invoke-virtual {v0}, Les2/c;->h()Lcom/whoop/navigation/e;

    move-result-object v3

    invoke-direct {p1, v3}, Lhs2/a$a;-><init>(Lcom/whoop/navigation/e;)V

    :goto_5
    move-object v4, p1

    goto :goto_6

    :cond_c
    sget-object p1, Lhs2/a$b;->a:Lhs2/a$b;

    goto :goto_5

    :goto_6
    invoke-virtual {p2}, Les2/d$a$b;->a()Lfs2/l;

    move-result-object v3

    invoke-virtual {p2}, Les2/d$a$b;->a()Lfs2/l;

    move-result-object p1

    instance-of p2, p1, Lfs2/l$f;

    if-eqz p2, :cond_d

    sget-object p1, Les2/a$b;->a:Les2/a$b;

    goto :goto_8

    :cond_d
    instance-of p2, p1, Lfs2/l$c;

    if-eqz p2, :cond_e

    sget-object p1, Les2/a$c;->a:Les2/a$c;

    goto :goto_8

    :cond_e
    instance-of p2, p1, Lfs2/l$a;

    if-nez p2, :cond_10

    instance-of p2, p1, Lfs2/l$e;

    if-nez p2, :cond_10

    instance-of p2, p1, Lfs2/l$d;

    if-nez p2, :cond_10

    instance-of p1, p1, Lfs2/l$b;

    if-eqz p1, :cond_f

    goto :goto_7

    :cond_f
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_10
    :goto_7
    move-object p1, v1

    :goto_8
    if-eqz v2, :cond_11

    :goto_9
    move-object v6, v1

    goto :goto_a

    :cond_11
    invoke-virtual {v0}, Les2/c;->h()Lcom/whoop/navigation/e;

    move-result-object v1

    goto :goto_9

    :goto_a
    const/16 v7, 0x12

    const/4 v8, 0x0

    const/4 v2, 0x0

    const/4 v5, 0x0

    move-object v1, p1

    invoke-static/range {v0 .. v8}, Les2/c;->b(Les2/c;Les2/a;Lcom/whoop/videocall/api/VideoCallContentResponse;Lfs2/l;Lhs2/a;ZLcom/whoop/navigation/e;ILjava/lang/Object;)Les2/c;

    move-result-object p1

    return-object p1

    :cond_12
    instance-of p1, p2, Les2/d$a$c;

    if-eqz p1, :cond_13

    check-cast p2, Les2/d$a$c;

    invoke-virtual {p2}, Les2/d$a$c;->a()Z

    move-result p1

    xor-int/lit8 v5, p1, 0x1

    const/16 v7, 0x2f

    const/4 v8, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    invoke-static/range {v0 .. v8}, Les2/c;->b(Les2/c;Les2/a;Lcom/whoop/videocall/api/VideoCallContentResponse;Lfs2/l;Lhs2/a;ZLcom/whoop/navigation/e;ILjava/lang/Object;)Les2/c;

    move-result-object p1

    return-object p1

    :cond_13
    instance-of p1, p2, Les2/d$a$d;

    if-eqz p1, :cond_14

    check-cast p2, Les2/d$a$d;

    invoke-virtual {p2}, Les2/d$a$d;->a()Lcom/whoop/navigation/e;

    move-result-object v6

    const/16 v7, 0x1f

    const/4 v8, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v0 .. v8}, Les2/c;->b(Les2/c;Les2/a;Lcom/whoop/videocall/api/VideoCallContentResponse;Lfs2/l;Lhs2/a;ZLcom/whoop/navigation/e;ILjava/lang/Object;)Les2/c;

    move-result-object p1

    return-object p1

    :cond_14
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private final h(Lec3/l;)Lec3/l;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/l;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    invoke-direct {p0, p1}, Les2/d;->j(Lec3/l;)Lec3/l;

    move-result-object p1

    new-instance v0, Les2/d$c;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0}, Les2/d$c;-><init>(Lq83/d;Les2/d;)V

    invoke-static {p1, v0}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object p1

    new-instance v0, Les2/d$g;

    invoke-direct {v0, p0, v1}, Les2/d$g;-><init>(Les2/d;Lq83/d;)V

    new-instance v1, Lec3/j1;

    const/4 v2, 0x0

    invoke-direct {v1, p1, v0, v2}, Lec3/j1;-><init>(Ljava/lang/Object;Ll83/e;I)V

    return-object v1
.end method

.method private final i(Ljava/lang/String;)Lec3/l;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    new-instance v0, Lcom/whoop/videocall/api/GetVideoCallContentRequest;

    invoke-direct {v0, p1}, Lcom/whoop/videocall/api/GetVideoCallContentRequest;-><init>(Ljava/lang/String;)V

    new-instance p1, La6/u;

    const/4 v1, 0x1

    invoke-direct {p1, v0, v1}, La6/u;-><init>(Ljava/lang/Object;I)V

    const-string v0, "video-call"

    invoke-static {v0}, Ldt/b;->S(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {p1, v0, v2, v1, v2}, Lsm0/a;->b(Lec3/l;Ljava/util/Set;Ljava/lang/String;ILjava/lang/Object;)Lec3/l;

    move-result-object p1

    iget-object v0, p0, Les2/d;->a:Lnm0/e;

    new-instance v1, Les2/d$i;

    invoke-direct {v1, v2, v0}, Les2/d$i;-><init>(Lq83/d;Lnm0/e;)V

    invoke-static {p1, v1}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object p1

    return-object p1
.end method

.method private final j(Lec3/l;)Lec3/l;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/l;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    new-instance v0, Les2/d$b;

    sget-object v1, Les2/b$f;->a:Les2/b$f;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Les2/d$b;-><init>(Les2/b;Ljava/lang/String;)V

    new-instance v1, Les2/d$l;

    invoke-direct {v1, v2}, Les2/d$l;-><init>(Lq83/d;)V

    new-instance v2, Lec3/l1;

    invoke-direct {v2, v0, p1, v1}, Lec3/l1;-><init>(Ljava/lang/Object;Lec3/l;Lkotlin/jvm/functions/Function3;)V

    const/4 p1, 0x1

    invoke-static {v2, p1}, Lec3/v;->v(Lec3/l;I)Lec3/h0;

    move-result-object p1

    new-instance v0, Les2/d$k;

    invoke-direct {v0, p1}, Les2/d$k;-><init>(Lec3/l;)V

    return-object v0
.end method

.method private final k(Les2/d$a;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Les2/d$a;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Les2/d$a$a;

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    check-cast p1, Les2/d$a$a;

    invoke-virtual {p1}, Les2/d$a$a;->a()Lpm0/a;

    move-result-object p1

    instance-of v0, p1, Lpm0/a$a$a;

    if-eqz v0, :cond_1

    iget-object v0, p0, Les2/d;->b:Lfs2/k;

    check-cast p1, Lpm0/a$a$a;

    invoke-virtual {p1}, Lpm0/a$a$a;->getData()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/videocall/api/VideoCallContentResponse;

    invoke-virtual {p1}, Lcom/whoop/videocall/api/VideoCallContentResponse;->getCallId()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1, p2}, Lfs2/k;->b(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_1

    return-object p1

    :cond_1
    return-object v1
.end method


# virtual methods
.method public interact(Lec3/l;)Lec3/l;
    .locals 10
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

    invoke-direct {p0, p1}, Les2/d;->h(Lec3/l;)Lec3/l;

    move-result-object p1

    iget-object v0, p0, Les2/d;->c:Lec3/l;

    const/4 v1, 0x2

    new-array v1, v1, [Lec3/l;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const/4 p1, 0x1

    aput-object v0, v1, p1

    invoke-static {v1}, Lec3/v;->J([Lec3/l;)Lec3/h;

    move-result-object v0

    new-instance v1, Les2/c;

    sget-object v2, Les2/a$b;->a:Les2/a$b;

    const/16 v8, 0x3e

    const/4 v9, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v1 .. v9}, Les2/c;-><init>(Les2/a;Lcom/whoop/videocall/api/VideoCallContentResponse;Lfs2/l;Lhs2/a;ZLcom/whoop/navigation/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v2, Les2/d$j;

    invoke-direct {v2, p0, v3}, Les2/d$j;-><init>(Les2/d;Lq83/d;)V

    new-instance v3, Lec3/l1;

    invoke-direct {v3, v1, v0, v2}, Lec3/l1;-><init>(Ljava/lang/Object;Lec3/l;Lkotlin/jvm/functions/Function3;)V

    invoke-static {v3, p1}, Lec3/v;->v(Lec3/l;I)Lec3/h0;

    move-result-object p1

    return-object p1
.end method
