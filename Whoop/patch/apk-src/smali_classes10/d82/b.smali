.class public final Ld82/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ld82/a;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u001a\u0010\r\u001a\u0004\u0018\u00010\u000c2\u0006\u0010\u000b\u001a\u00020\nH\u0096@\u00a2\u0006\u0004\u0008\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u000fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0011R&\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u00128\u0016X\u0096\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0014\u0010\u0015\u0012\u0004\u0008\u0018\u0010\u0019\u001a\u0004\u0008\u0016\u0010\u0017\u00a8\u0006\u001b"
    }
    d2 = {
        "Ld82/b;",
        "Ld82/a;",
        "Lci2/b;",
        "whoopStrapProvider",
        "Ltr2/n;",
        "logger",
        "Ltd1/b;",
        "whoopStrapProxy",
        "<init>",
        "(Lci2/b;Ltr2/n;Ltd1/b;)V",
        "",
        "enabled",
        "Lzj0/g1;",
        "a",
        "(ZLq83/d;)Ljava/lang/Object;",
        "Ltr2/n;",
        "b",
        "Ltd1/b;",
        "Lec3/l;",
        "Ldk0/h;",
        "c",
        "Lec3/l;",
        "getImuDataStreamFlow",
        "()Lec3/l;",
        "getImuDataStreamFlow$annotations",
        "()V",
        "imuDataStreamFlow",
        "connectivity_release"
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
.field private final a:Ltr2/n;

.field private final b:Ltd1/b;

.field private final c:Lec3/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/l;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lci2/b;Ltr2/n;Ltd1/b;)V
    .locals 1

    const-string v0, "whoopStrapProvider"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "whoopStrapProxy"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Ld82/b;->a:Ltr2/n;

    iput-object p3, p0, Ld82/b;->b:Ltd1/b;

    invoke-interface {p1}, Lci2/b;->c()Lec3/f2;

    move-result-object p1

    new-instance p2, Ld82/b$a;

    const/4 p3, 0x0

    invoke-direct {p2, p3}, Ld82/b$a;-><init>(Lq83/d;)V

    invoke-static {p1, p2}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object p1

    iput-object p1, p0, Ld82/b;->c:Lec3/l;

    return-void
.end method


# virtual methods
.method public a(ZLq83/d;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lq83/d<",
            "-",
            "Lzj0/g1;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Ld82/b;->b:Ltd1/b;

    const/4 v5, 0x2

    const/4 v6, 0x0

    const-wide/16 v2, 0x0

    move v1, p1

    move-object v4, p2

    invoke-static/range {v0 .. v6}, Ltd1/b;->s(Ltd1/b;ZJLq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
