.class public final La03/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lod1/g;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lod1/g<",
        "La03/a;",
        "La03/d;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\n\u0008\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ#\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u000c2\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u000cH\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\u0016"
    }
    d2 = {
        "La03/c;",
        "Lod1/g;",
        "La03/a;",
        "La03/d;",
        "Lcom/whoop/whoopstatus/domain/WhoopStatusService;",
        "statusService",
        "Ltr2/n;",
        "logger",
        "La03/b;",
        "analyticHelper",
        "<init>",
        "(Lcom/whoop/whoopstatus/domain/WhoopStatusService;Ltr2/n;La03/b;)V",
        "Lec3/l;",
        "upstream",
        "interact",
        "(Lec3/l;)Lec3/l;",
        "a",
        "Lcom/whoop/whoopstatus/domain/WhoopStatusService;",
        "b",
        "Ltr2/n;",
        "c",
        "La03/b;",
        "whoop-status_release"
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
.field private final a:Lcom/whoop/whoopstatus/domain/WhoopStatusService;

.field private final b:Ltr2/n;

.field private final c:La03/b;


# direct methods
.method public constructor <init>(Lcom/whoop/whoopstatus/domain/WhoopStatusService;Ltr2/n;La03/b;)V
    .locals 1

    const-string v0, "statusService"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analyticHelper"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La03/c;->a:Lcom/whoop/whoopstatus/domain/WhoopStatusService;

    iput-object p2, p0, La03/c;->b:Ltr2/n;

    iput-object p3, p0, La03/c;->c:La03/b;

    return-void
.end method

.method public static final synthetic c(La03/c;)La03/b;
    .locals 0

    iget-object p0, p0, La03/c;->c:La03/b;

    return-object p0
.end method

.method public static final synthetic d(La03/c;)Ltr2/n;
    .locals 0

    iget-object p0, p0, La03/c;->b:Ltr2/n;

    return-object p0
.end method

.method public static final synthetic e(La03/c;)Lcom/whoop/whoopstatus/domain/WhoopStatusService;
    .locals 0

    iget-object p0, p0, La03/c;->a:Lcom/whoop/whoopstatus/domain/WhoopStatusService;

    return-object p0
.end method


# virtual methods
.method public interact(Lec3/l;)Lec3/l;
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

    sget-object v0, La03/d$b;->a:La03/d$b;

    new-instance v1, La03/c$a;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, La03/c$a;-><init>(La03/c;Lq83/d;)V

    new-instance v2, Lec3/l1;

    invoke-direct {v2, v0, p1, v1}, Lec3/l1;-><init>(Ljava/lang/Object;Lec3/l;Lkotlin/jvm/functions/Function3;)V

    return-object v2
.end method
