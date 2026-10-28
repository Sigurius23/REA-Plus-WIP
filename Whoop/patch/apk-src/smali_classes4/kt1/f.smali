.class public final Lkt1/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0001\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ!\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\r0\n2\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\u0004\u0008\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\u0016"
    }
    d2 = {
        "Lkt1/f;",
        "",
        "Lcom/whoop/labrador/domain/LabradorApi;",
        "labradorApi",
        "Lkt1/d;",
        "repository",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Lcom/whoop/labrador/domain/LabradorApi;Lkt1/d;Ltr2/n;)V",
        "Lec3/l;",
        "Lnt1/f;",
        "upstream",
        "Lnt1/h;",
        "d",
        "(Lec3/l;)Lec3/l;",
        "a",
        "Lcom/whoop/labrador/domain/LabradorApi;",
        "b",
        "Lkt1/d;",
        "c",
        "Ltr2/n;",
        "labrador_release"
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
.field private final a:Lcom/whoop/labrador/domain/LabradorApi;

.field private final b:Lkt1/d;

.field private final c:Ltr2/n;


# direct methods
.method public constructor <init>(Lcom/whoop/labrador/domain/LabradorApi;Lkt1/d;Ltr2/n;)V
    .locals 1

    const-string v0, "labradorApi"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "repository"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lkt1/f;->a:Lcom/whoop/labrador/domain/LabradorApi;

    .line 3
    iput-object p2, p0, Lkt1/f;->b:Lkt1/d;

    .line 4
    iput-object p3, p0, Lkt1/f;->c:Ltr2/n;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/labrador/domain/LabradorApi;Lkt1/d;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    .line 5
    sget-object p3, Ltr2/n;->a:Ltr2/n$a;

    const-string p4, "EcgSubmitEligibilityInteractor"

    invoke-virtual {p3, p4}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p3

    .line 6
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lkt1/f;-><init>(Lcom/whoop/labrador/domain/LabradorApi;Lkt1/d;Ltr2/n;)V

    return-void
.end method

.method public static final synthetic a(Lkt1/f;)Lcom/whoop/labrador/domain/LabradorApi;
    .locals 0

    iget-object p0, p0, Lkt1/f;->a:Lcom/whoop/labrador/domain/LabradorApi;

    return-object p0
.end method

.method public static final synthetic b(Lkt1/f;)Ltr2/n;
    .locals 0

    iget-object p0, p0, Lkt1/f;->c:Ltr2/n;

    return-object p0
.end method

.method public static final synthetic c(Lkt1/f;)Lkt1/d;
    .locals 0

    iget-object p0, p0, Lkt1/f;->b:Lkt1/d;

    return-object p0
.end method


# virtual methods
.method public final d(Lec3/l;)Lec3/l;
    .locals 2
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

    new-instance v0, Lkt1/f$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0}, Lkt1/f$a;-><init>(Lq83/d;Lkt1/f;)V

    invoke-static {p1, v0}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object p1

    return-object p1
.end method
