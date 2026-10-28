.class public final Lfs2/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfs2/k;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0018\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\nH\u0096@\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u000cH\u0096@\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000c2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016\u00a2\u0006\u0004\u0008\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0018R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00198\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u001bR \u0010!\u001a\u0008\u0012\u0004\u0012\u00020\u001a0\u001d8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001e\u0010\u001f\u001a\u0004\u0008\u0017\u0010 \u00a8\u0006\""
    }
    d2 = {
        "Lfs2/d;",
        "Lfs2/k;",
        "Lcom/whoop/videocall/api/HmsVideoCallApi;",
        "hmsVideoCallApi",
        "Lfs2/f;",
        "clientService",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Lcom/whoop/videocall/api/HmsVideoCallApi;Lfs2/f;Ltr2/n;)V",
        "",
        "callId",
        "Ll83/a0;",
        "b",
        "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "d",
        "(Lq83/d;)Ljava/lang/Object;",
        "Lfs2/a;",
        "reason",
        "a",
        "(Lfs2/a;)V",
        "Lcom/whoop/videocall/api/HmsVideoCallApi;",
        "Lfs2/f;",
        "c",
        "Ltr2/n;",
        "Lec3/p1;",
        "Lfs2/l;",
        "Lec3/p1;",
        "stateOverride",
        "Lec3/l;",
        "e",
        "Lec3/l;",
        "()Lec3/l;",
        "callStateFlow",
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
.field private final a:Lcom/whoop/videocall/api/HmsVideoCallApi;

.field private final b:Lfs2/f;

.field private final c:Ltr2/n;

.field private final d:Lec3/p1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/p1;"
        }
    .end annotation
.end field

.field private final e:Lec3/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/l;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/whoop/videocall/api/HmsVideoCallApi;Lfs2/f;Ltr2/n;)V
    .locals 2

    const-string v0, "hmsVideoCallApi"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "clientService"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lfs2/d;->a:Lcom/whoop/videocall/api/HmsVideoCallApi;

    .line 3
    iput-object p2, p0, Lfs2/d;->b:Lfs2/f;

    .line 4
    iput-object p3, p0, Lfs2/d;->c:Ltr2/n;

    const/4 p1, 0x0

    .line 5
    invoke-static {p1}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p3

    iput-object p3, p0, Lfs2/d;->d:Lec3/p1;

    .line 6
    invoke-virtual {p2}, Lfs2/f;->e()Lec3/f2;

    move-result-object p2

    .line 7
    new-instance v0, Lfs2/d$a;

    invoke-direct {v0, p1}, Lfs2/d$a;-><init>(Lq83/d;)V

    .line 8
    new-instance p1, Lec3/l1;

    const/4 v1, 0x1

    invoke-direct {p1, p3, p2, v0, v1}, Lec3/l1;-><init>(Lec3/l;Ljava/lang/Object;Ll83/e;I)V

    .line 9
    invoke-static {p1}, Lec3/v;->t(Lec3/l;)Lec3/l;

    move-result-object p1

    iput-object p1, p0, Lfs2/d;->e:Lec3/l;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/videocall/api/HmsVideoCallApi;Lfs2/f;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    .line 10
    sget-object p3, Ltr2/n;->a:Ltr2/n$a;

    const-string p4, "HmsVideoCallManager"

    invoke-virtual {p3, p4}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p3

    .line 11
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lfs2/d;-><init>(Lcom/whoop/videocall/api/HmsVideoCallApi;Lfs2/f;Ltr2/n;)V

    return-void
.end method

.method public static final synthetic e(Lfs2/d;)Lcom/whoop/videocall/api/HmsVideoCallApi;
    .locals 0

    iget-object p0, p0, Lfs2/d;->a:Lcom/whoop/videocall/api/HmsVideoCallApi;

    return-object p0
.end method


# virtual methods
.method public a(Lfs2/a;)V
    .locals 3

    const-string v0, "reason"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lfs2/d;->c:Ltr2/n;

    invoke-virtual {p1}, Lfs2/a;->getTag()Ljava/lang/String;

    move-result-object p1

    const-string v1, "leaveCall("

    const-string v2, ") ignored \u2014 not implemented yet"

    invoke-static {v1, p1, v2}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    new-array v1, v1, [Lqr2/a$a;

    invoke-interface {v0, p1, v1}, Ltr2/n;->q(Ljava/lang/String;[Lqr2/a$a;)V

    return-void
.end method

.method public b(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of p1, p2, Lfs2/d$b;

    if-eqz p1, :cond_0

    move-object p1, p2

    check-cast p1, Lfs2/d$b;

    iget v0, p1, Lfs2/d$b;->z:I

    const/high16 v1, -0x80000000

    and-int v2, v0, v1

    if-eqz v2, :cond_0

    sub-int/2addr v0, v1

    iput v0, p1, Lfs2/d$b;->z:I

    :goto_0
    move-object v5, p1

    goto :goto_1

    :cond_0
    new-instance p1, Lfs2/d$b;

    invoke-direct {p1, p0, p2}, Lfs2/d$b;-><init>(Lfs2/d;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object p1, v5, Lfs2/d$b;->x:Ljava/lang/Object;

    sget-object p2, Lr83/a;->w:Lr83/a;

    iget v0, v5, Lfs2/d$b;->z:I

    const/4 v8, 0x1

    const/4 v9, 0x0

    if-eqz v0, :cond_2

    if-ne v0, v8, :cond_1

    iget-object p2, v5, Lfs2/d$b;->w:Ljava/lang/Object;

    check-cast p2, Ljava/lang/String;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lfs2/d;->d:Lec3/p1;

    sget-object v0, Lfs2/l$f;->a:Lfs2/l$f;

    check-cast p1, Lec3/h2;

    invoke-virtual {p1, v0}, Lec3/h2;->j(Ljava/lang/Object;)V

    sget-object v0, Lu02/a;->a:Lu02/a$a;

    iget-object v1, p0, Lfs2/d;->c:Ltr2/n;

    new-instance v4, Lfs2/d$c;

    invoke-direct {v4, p0, v9}, Lfs2/d$c;-><init>(Lfs2/d;Lq83/d;)V

    iput-object v9, v5, Lfs2/d$b;->w:Ljava/lang/Object;

    iput v8, v5, Lfs2/d$b;->z:I

    const/4 v2, 0x0

    const-string v3, "100ms video call session"

    const/4 v6, 0x2

    const/4 v7, 0x0

    invoke-static/range {v0 .. v7}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, p2, :cond_3

    return-object p2

    :cond_3
    :goto_2
    check-cast p1, Lu02/a;

    instance-of p2, p1, Lu02/a$c;

    if-eqz p2, :cond_4

    iget-object p2, p0, Lfs2/d;->b:Lfs2/f;

    check-cast p1, Lu02/a$c;

    invoke-virtual {p1}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/videocall/api/HmsVideoCallSessionResponse;

    invoke-virtual {p2, p1}, Lfs2/f;->f(Lcom/whoop/videocall/api/HmsVideoCallSessionResponse;)V

    iget-object p1, p0, Lfs2/d;->d:Lec3/p1;

    check-cast p1, Lec3/h2;

    invoke-virtual {p1, v9}, Lec3/h2;->j(Ljava/lang/Object;)V

    goto :goto_3

    :cond_4
    instance-of p1, p1, Lu02/a$b;

    if-eqz p1, :cond_5

    iget-object p1, p0, Lfs2/d;->d:Lec3/p1;

    new-instance p2, Lfs2/l$c;

    invoke-direct {p2, v9, v8, v9}, Lfs2/l$c;-><init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast p1, Lec3/h2;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1, v9, p2}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    :goto_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_5
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public c()Lec3/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/l;"
        }
    .end annotation

    iget-object v0, p0, Lfs2/d;->e:Lec3/l;

    return-object v0
.end method

.method public d(Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object p1, p0, Lfs2/d;->c:Ltr2/n;

    const/4 v0, 0x0

    new-array v0, v0, [Lqr2/a$a;

    const-string v1, "joinCall() ignored \u2014 not implemented yet"

    invoke-interface {p1, v1, v0}, Ltr2/n;->q(Ljava/lang/String;[Lqr2/a$a;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
