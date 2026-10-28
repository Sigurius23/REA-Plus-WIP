.class public final Ldq0/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/client/cdn/CDN;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ldq0/e$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u0000 \u00082\u00020\u0001:\u0001\u000fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u001c\u0010\u0008\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006H\u0082@\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0018\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0007H\u0096@\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0018\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0007H\u0096@\u00a2\u0006\u0004\u0008\u000e\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0011"
    }
    d2 = {
        "Ldq0/e;",
        "Lio/getstream/chat/android/client/cdn/CDN;",
        "Ly92/a;",
        "authManager",
        "<init>",
        "(Ly92/a;)V",
        "",
        "",
        "b",
        "(Lq83/d;)Ljava/lang/Object;",
        "url",
        "Lio/getstream/chat/android/client/cdn/CDNRequest;",
        "imageRequest",
        "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "fileRequest",
        "a",
        "Ly92/a;",
        "community_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final b:Ldq0/e$a;

.field public static final c:I


# instance fields
.field private final a:Ly92/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ldq0/e$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ldq0/e$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Ldq0/e;->b:Ldq0/e$a;

    const/16 v0, 0x8

    sput v0, Ldq0/e;->c:I

    return-void
.end method

.method public constructor <init>(Ly92/a;)V
    .locals 1

    const-string v0, "authManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ldq0/e;->a:Ly92/a;

    return-void
.end method

.method public static final synthetic a(Ldq0/e;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Ldq0/e;->b(Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final b(Lq83/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Ldq0/e$b;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Ldq0/e$b;

    iget v1, v0, Ldq0/e$b;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Ldq0/e$b;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Ldq0/e$b;

    invoke-direct {v0, p0, p1}, Ldq0/e$b;-><init>(Ldq0/e;Lq83/d;)V

    :goto_0
    iget-object p1, v0, Ldq0/e$b;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Ldq0/e$b;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Ldq0/e;->a:Ly92/a;

    iput v3, v0, Ldq0/e$b;->y:I

    invoke-virtual {p1, v0}, Ly92/a;->a(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p1, Lcom/whoop/domain/model/AuthMaterial;

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Lcom/whoop/domain/model/AuthMaterial;->getAccessToken()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_4

    goto :goto_2

    :cond_4
    const-string v0, "Bearer "

    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "Authorization"

    invoke-static {v0, p1}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object p1

    return-object p1

    :cond_5
    :goto_2
    sget-object p1, Lm83/z;->w:Lm83/z;

    return-object p1
.end method


# virtual methods
.method public fileRequest(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/client/cdn/CDNRequest;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object v0, Lbc3/q0;->a:Lkc3/e;

    sget-object v0, Lkc3/d;->w:Lkc3/d;

    new-instance v1, Ldq0/e$c;

    const/4 v2, 0x0

    invoke-direct {v1, p1, p0, v2}, Ldq0/e$c;-><init>(Ljava/lang/String;Ldq0/e;Lq83/d;)V

    invoke-static {v0, v1, p2}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public imageRequest(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/client/cdn/CDNRequest;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object v0, Lbc3/q0;->a:Lkc3/e;

    sget-object v0, Lkc3/d;->w:Lkc3/d;

    new-instance v1, Ldq0/e$d;

    const/4 v2, 0x0

    invoke-direct {v1, p1, p0, v2}, Ldq0/e$d;-><init>(Ljava/lang/String;Ldq0/e;Lq83/d;)V

    invoke-static {v0, v1, p2}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
