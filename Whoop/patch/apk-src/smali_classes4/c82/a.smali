.class public final Lc82/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\n\u0010\u000bR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\rR#\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006\u00a2\u0006\u0012\n\u0004\u0008\u0010\u0010\u0011\u0012\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\u0017"
    }
    d2 = {
        "Lc82/a;",
        "",
        "Lci2/b;",
        "whoopStrapProvider",
        "Ltr2/n;",
        "logger",
        "Ltd1/b;",
        "whoopStrapProxy",
        "<init>",
        "(Lci2/b;Ltr2/n;Ltd1/b;)V",
        "a",
        "Ltr2/n;",
        "b",
        "Ltd1/b;",
        "Lec3/l;",
        "Lsj0/a;",
        "c",
        "Lec3/l;",
        "getHrRealtimeStreamFlow",
        "()Lec3/l;",
        "getHrRealtimeStreamFlow$annotations",
        "()V",
        "hrRealtimeStreamFlow",
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

.annotation runtime Ll83/c;
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

    iput-object p2, p0, Lc82/a;->a:Ltr2/n;

    iput-object p3, p0, Lc82/a;->b:Ltd1/b;

    invoke-interface {p1}, Lci2/b;->c()Lec3/f2;

    move-result-object p1

    new-instance p2, Lc82/a$a;

    const/4 p3, 0x0

    invoke-direct {p2, p3}, Lc82/a$a;-><init>(Lq83/d;)V

    invoke-static {p1, p2}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object p1

    iput-object p1, p0, Lc82/a;->c:Lec3/l;

    return-void
.end method
