.class public final Lnb2/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lod1/g;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnb2/d$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lod1/g<",
        "Lnb2/a;",
        "Lnb2/c;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\n\u0008\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B!\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u000cH\u0082@\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0010*\u00020\u000fH\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J#\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00132\u000c\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0013H\u0016\u00a2\u0006\u0004\u0008\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001aR\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u001c\u00a8\u0006\u001d"
    }
    d2 = {
        "Lnb2/d;",
        "Lod1/g;",
        "Lnb2/a;",
        "Lnb2/c;",
        "Lcom/whoop/settings/gifthub/api/GiftHubApi;",
        "api",
        "Llb2/b;",
        "analyticsHelper",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Lcom/whoop/settings/gifthub/api/GiftHubApi;Llb2/b;Ltr2/n;)V",
        "Lcom/whoop/settings/gifthub/domain/models/GiftHubResponse;",
        "g",
        "(Lq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/settings/gifthub/domain/models/GiftHubStyle;",
        "",
        "h",
        "(Lcom/whoop/settings/gifthub/domain/models/GiftHubStyle;)Ljava/lang/String;",
        "Lec3/l;",
        "upstream",
        "interact",
        "(Lec3/l;)Lec3/l;",
        "a",
        "Lcom/whoop/settings/gifthub/api/GiftHubApi;",
        "b",
        "Llb2/b;",
        "c",
        "Ltr2/n;",
        "settings_release"
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
.field private final a:Lcom/whoop/settings/gifthub/api/GiftHubApi;

.field private final b:Llb2/b;

.field private final c:Ltr2/n;


# direct methods
.method public constructor <init>(Lcom/whoop/settings/gifthub/api/GiftHubApi;Llb2/b;Ltr2/n;)V
    .locals 1

    const-string v0, "api"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analyticsHelper"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lnb2/d;->a:Lcom/whoop/settings/gifthub/api/GiftHubApi;

    .line 3
    iput-object p2, p0, Lnb2/d;->b:Llb2/b;

    .line 4
    iput-object p3, p0, Lnb2/d;->c:Ltr2/n;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/settings/gifthub/api/GiftHubApi;Llb2/b;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    .line 5
    sget-object p3, Ltr2/n;->a:Ltr2/n$a;

    const-string p4, "GiftHubInteractor"

    invoke-virtual {p3, p4}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p3

    .line 6
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lnb2/d;-><init>(Lcom/whoop/settings/gifthub/api/GiftHubApi;Llb2/b;Ltr2/n;)V

    return-void
.end method

.method public static final synthetic c(Lnb2/d;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lnb2/d;->g(Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic d(Lnb2/d;)Llb2/b;
    .locals 0

    iget-object p0, p0, Lnb2/d;->b:Llb2/b;

    return-object p0
.end method

.method public static final synthetic e(Lnb2/d;)Lcom/whoop/settings/gifthub/api/GiftHubApi;
    .locals 0

    iget-object p0, p0, Lnb2/d;->a:Lcom/whoop/settings/gifthub/api/GiftHubApi;

    return-object p0
.end method

.method public static final synthetic f(Lnb2/d;Lcom/whoop/settings/gifthub/domain/models/GiftHubStyle;)Ljava/lang/String;
    .locals 0

    invoke-direct {p0, p1}, Lnb2/d;->h(Lcom/whoop/settings/gifthub/domain/models/GiftHubStyle;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private final g(Lq83/d;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lcom/whoop/settings/gifthub/domain/models/GiftHubResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lnb2/d$b;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lnb2/d$b;

    iget v1, v0, Lnb2/d$b;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lnb2/d$b;->y:I

    :goto_0
    move-object v6, v0

    goto :goto_1

    :cond_0
    new-instance v0, Lnb2/d$b;

    invoke-direct {v0, p0, p1}, Lnb2/d$b;-><init>(Lnb2/d;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object p1, v6, Lnb2/d$b;->w:Ljava/lang/Object;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v6, Lnb2/d$b;->y:I

    const/4 v2, 0x1

    if-eqz v1, :cond_2

    if-ne v1, v2, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object v1, Lu02/a;->a:Lu02/a$a;

    move p1, v2

    iget-object v2, p0, Lnb2/d;->c:Ltr2/n;

    new-instance v5, Lnb2/d$c;

    const/4 v3, 0x0

    invoke-direct {v5, p0, v3}, Lnb2/d$c;-><init>(Lnb2/d;Lq83/d;)V

    iput p1, v6, Lnb2/d$b;->y:I

    const/4 v4, 0x0

    const/4 v7, 0x6

    const/4 v8, 0x0

    invoke-static/range {v1 .. v8}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    :goto_2
    check-cast p1, Lu02/a;

    invoke-static {p1}, Lu02/b;->b(Lu02/a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method private final h(Lcom/whoop/settings/gifthub/domain/models/GiftHubStyle;)Ljava/lang/String;
    .locals 1

    sget-object v0, Lnb2/d$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_1

    const/4 v0, 0x2

    if-ne p1, v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    const-string p1, "holiday"

    return-object p1
.end method


# virtual methods
.method public interact(Lec3/l;)Lec3/l;
    .locals 4
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

    new-instance v0, Lnb2/d$d;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lnb2/d$d;-><init>(Lq83/d;)V

    invoke-static {p1, v0}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object p1

    new-instance v0, Lnb2/c;

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v1}, Lnb2/c;-><init>(Lnb2/b;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v3, Lnb2/d$e;

    invoke-direct {v3, p0, v1}, Lnb2/d$e;-><init>(Lnb2/d;Lq83/d;)V

    new-instance v1, Lec3/l1;

    invoke-direct {v1, v0, p1, v3}, Lec3/l1;-><init>(Ljava/lang/Object;Lec3/l;Lkotlin/jvm/functions/Function3;)V

    invoke-static {v1, v2}, Lec3/v;->v(Lec3/l;I)Lec3/h0;

    move-result-object p1

    return-object p1
.end method
