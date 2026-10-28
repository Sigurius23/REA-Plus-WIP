.class public final Lyw2/h$w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf93/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lyw2/h;-><init>(Lin2/d;Lz92/a;Ltr2/n;Lex2/c;Lcom/whoop/data/remote/api/FileDownloaderApi;Lor2/a0;Ltd1/b;Lcom/whoop/whooplabs/data/network/WhoopLabsApi;Lmz2/e;Lcom/whoop/whooplabs/io/HrDeviceConnection;Lzr2/a;Lyw2/f;Lcom/whoop/data/repositories/FeatureFlagChecker;Lnz2/g;Ljt0/a;Lzw2/b;Lbc3/c0;Loz2/c;Loz2/a;Lyw2/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lf93/d;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0007*\u0001\u0000\u0008\n\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00028\u00000\u0001J&\u0010\u0006\u001a\u00028\u00002\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\u0008\u00030\u0004H\u0096\u0002\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J.\u0010\n\u001a\u00020\t2\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\u0008\u00030\u00042\u0006\u0010\u0008\u001a\u00028\u0000H\u0096\u0002\u00a2\u0006\u0004\u0008\n\u0010\u000bR\"\u0010\u0008\u001a\u00028\u00008\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u000c\u0010\r\u001a\u0004\u0008\u0006\u0010\u000e\"\u0004\u0008\n\u0010\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "yw2/h$w",
        "Lf93/d;",
        "",
        "thisRef",
        "Lj93/z;",
        "property",
        "getValue",
        "(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;",
        "value",
        "Ll83/a0;",
        "setValue",
        "(Ljava/lang/Object;Lj93/z;Ljava/lang/Object;)V",
        "w",
        "Ljava/lang/Object;",
        "()Ljava/lang/Object;",
        "(Ljava/lang/Object;)V",
        "feature_release"
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
.field private w:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudy;"
        }
    .end annotation
.end field

.field final synthetic x:Lyw2/h;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Lyw2/h;)V
    .locals 0

    iput-object p2, p0, Lyw2/h$w;->x:Lyw2/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lyw2/h$w;->w:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public getValue(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lj93/z;",
            ")",
            "Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudy;"
        }
    .end annotation

    const-string p1, "property"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lyw2/h$w;->w:Ljava/lang/Object;

    return-object p1
.end method

.method public setValue(Ljava/lang/Object;Lj93/z;Ljava/lang/Object;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lj93/z;",
            "Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudy;",
            ")V"
        }
    .end annotation

    const-string p1, "property"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p3, p0, Lyw2/h$w;->w:Ljava/lang/Object;

    check-cast p3, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudy;

    iget-object p1, p0, Lyw2/h$w;->x:Lyw2/h;

    new-instance p2, Lyw2/h$c0;

    const/4 v0, 0x0

    invoke-direct {p2, p1, p3, v0}, Lyw2/h$c0;-><init>(Lyw2/h;Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudy;Lq83/d;)V

    const/4 v1, 0x3

    invoke-static {p1, v0, v0, p2, v1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    iget-object p1, p0, Lyw2/h$w;->x:Lyw2/h;

    invoke-static {p1}, Lyw2/h;->d(Lyw2/h;)Lin2/d;

    move-result-object p2

    invoke-interface {p2}, Lin2/d;->b()Lq83/j;

    move-result-object p2

    new-instance v1, Lyw2/h$d0;

    iget-object v2, p0, Lyw2/h$w;->x:Lyw2/h;

    invoke-direct {v1, v2, p3, v0}, Lyw2/h$d0;-><init>(Lyw2/h;Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudy;Lq83/d;)V

    const/4 p3, 0x2

    invoke-static {p1, p2, v0, v1, p3}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method
