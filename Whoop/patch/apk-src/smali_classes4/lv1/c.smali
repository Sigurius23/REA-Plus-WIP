.class public final Llv1/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0008H\u0086@\u00a2\u0006\u0004\u0008\u000b\u0010\u000cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "Llv1/c;",
        "",
        "Lin2/d;",
        "dispatcher",
        "Lmv1/a;",
        "memberDataExportServiceRepository",
        "<init>",
        "(Lin2/d;Lmv1/a;)V",
        "Llv1/a;",
        "action",
        "Lcom/whoop/memberdataexport/models/MemberDataExportModel;",
        "b",
        "(Llv1/a;Lq83/d;)Ljava/lang/Object;",
        "a",
        "Lin2/d;",
        "Lmv1/a;",
        "member-data-export_release"
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
.field private final a:Lin2/d;

.field private final b:Lmv1/a;


# direct methods
.method public constructor <init>(Lin2/d;Lmv1/a;)V
    .locals 1

    const-string v0, "dispatcher"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "memberDataExportServiceRepository"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llv1/c;->a:Lin2/d;

    iput-object p2, p0, Llv1/c;->b:Lmv1/a;

    return-void
.end method

.method public static final synthetic a(Llv1/c;)Lmv1/a;
    .locals 0

    iget-object p0, p0, Llv1/c;->b:Lmv1/a;

    return-object p0
.end method


# virtual methods
.method public final b(Llv1/a;Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llv1/a;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/memberdataexport/models/MemberDataExportModel;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Llv1/c;->a:Lin2/d;

    invoke-interface {v0}, Lin2/d;->b()Lq83/j;

    move-result-object v0

    new-instance v1, Llv1/c$a;

    const/4 v2, 0x0

    invoke-direct {v1, p1, p0, v2}, Llv1/c$a;-><init>(Llv1/a;Llv1/c;Lq83/d;)V

    invoke-static {v0, v1, p2}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
