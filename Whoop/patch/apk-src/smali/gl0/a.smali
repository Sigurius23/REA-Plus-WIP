.class public final Lgl0/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lod1/g;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lod1/g<",
        "Lgl0/b;",
        "Lgl0/d;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000e\u0008\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B)\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u001b\u0010\u0011\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00100\u000f0\u000eH\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J#\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u000e2\u000c\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u000eH\u0016\u00a2\u0006\u0004\u0008\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001bR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001d\u00a8\u0006\u001e"
    }
    d2 = {
        "Lgl0/a;",
        "Lod1/g;",
        "Lgl0/b;",
        "Lgl0/d;",
        "Lnm0/e;",
        "cachedApiSource",
        "Lu92/d;",
        "prefs",
        "Lq83/j;",
        "ioContext",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Lnm0/e;Lu92/d;Lq83/j;Ltr2/n;)V",
        "Lec3/l;",
        "Lpm0/a;",
        "Lcom/whoop/bot/models/educationhub/EducationHubResponse;",
        "f",
        "()Lec3/l;",
        "upstream",
        "interact",
        "(Lec3/l;)Lec3/l;",
        "a",
        "Lnm0/e;",
        "b",
        "Lu92/d;",
        "c",
        "Lq83/j;",
        "d",
        "Ltr2/n;",
        "bot_release"
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

.field private final b:Lu92/d;

.field private final c:Lq83/j;

.field private final d:Ltr2/n;


# direct methods
.method public constructor <init>(Lnm0/e;Lu92/d;Lq83/j;Ltr2/n;)V
    .locals 1

    const-string v0, "cachedApiSource"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "prefs"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ioContext"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lgl0/a;->a:Lnm0/e;

    iput-object p2, p0, Lgl0/a;->b:Lu92/d;

    iput-object p3, p0, Lgl0/a;->c:Lq83/j;

    iput-object p4, p0, Lgl0/a;->d:Ltr2/n;

    return-void
.end method

.method public static final synthetic c(Lgl0/a;)Lec3/l;
    .locals 0

    invoke-direct {p0}, Lgl0/a;->f()Lec3/l;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic d(Lgl0/a;)Lq83/j;
    .locals 0

    iget-object p0, p0, Lgl0/a;->c:Lq83/j;

    return-object p0
.end method

.method public static final synthetic e(Lgl0/a;)Lu92/d;
    .locals 0

    iget-object p0, p0, Lgl0/a;->b:Lu92/d;

    return-object p0
.end method

.method private final f()Lec3/l;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/l;"
        }
    .end annotation

    sget-object v0, Lcom/whoop/bot/models/educationhub/EducationHubGetRequest;->INSTANCE:Lcom/whoop/bot/models/educationhub/EducationHubGetRequest;

    new-instance v1, La6/u;

    const/4 v2, 0x1

    invoke-direct {v1, v0, v2}, La6/u;-><init>(Ljava/lang/Object;I)V

    const/4 v0, 0x3

    const/4 v2, 0x0

    invoke-static {v1, v2, v2, v0, v2}, Lsm0/a;->b(Lec3/l;Ljava/util/Set;Ljava/lang/String;ILjava/lang/Object;)Lec3/l;

    move-result-object v0

    iget-object v1, p0, Lgl0/a;->a:Lnm0/e;

    new-instance v3, Lgl0/a$a;

    invoke-direct {v3, v2, v1}, Lgl0/a$a;-><init>(Lq83/d;Lnm0/e;)V

    invoke-static {v0, v3}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object v0

    return-object v0
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

    new-instance v0, Lgl0/a$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0}, Lgl0/a$b;-><init>(Lq83/d;Lgl0/a;)V

    invoke-static {p1, v0}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object p1

    new-instance v0, Lgl0/d;

    const/4 v2, 0x0

    const/4 v3, 0x3

    invoke-direct {v0, v1, v2, v3, v1}, Lgl0/d;-><init>(Lcom/whoop/design/models/items/ArticleTileCarouselModel;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v2, Lgl0/a$c;

    invoke-direct {v2, p0, v1}, Lgl0/a$c;-><init>(Lgl0/a;Lq83/d;)V

    new-instance v1, Lec3/l1;

    invoke-direct {v1, v0, p1, v2}, Lec3/l1;-><init>(Ljava/lang/Object;Lec3/l;Lkotlin/jvm/functions/Function3;)V

    return-object v1
.end method
