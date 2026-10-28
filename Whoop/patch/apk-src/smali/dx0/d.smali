.class public final Ldx0/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldt0/e;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000e\u0008\u0000\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016\u00a2\u0006\u0004\u0008\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001aR\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u001cR\u001a\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001eR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010 \u00a8\u0006!"
    }
    d2 = {
        "Ldx0/d;",
        "Ldt0/e;",
        "Ltr2/n;",
        "logger",
        "Ldt0/d;",
        "dataSyncService",
        "Lbc3/c0;",
        "scope",
        "Ljs0/c;",
        "configurationRepository",
        "La6/g;",
        "Lf6/f;",
        "dataStore",
        "Ljava/time/Clock;",
        "clock",
        "<init>",
        "(Ltr2/n;Ldt0/d;Lbc3/c0;Ljs0/c;La6/g;Ljava/time/Clock;)V",
        "Lcom/whoop/connectivityCore/dataSyncService/models/ProcessNowSource;",
        "source",
        "Ll83/a0;",
        "a",
        "(Lcom/whoop/connectivityCore/dataSyncService/models/ProcessNowSource;)V",
        "Ltr2/n;",
        "b",
        "Ldt0/d;",
        "c",
        "Lbc3/c0;",
        "d",
        "Ljs0/c;",
        "e",
        "La6/g;",
        "f",
        "Ljava/time/Clock;",
        "data-sync-service_release"
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

.field private final b:Ldt0/d;

.field private final c:Lbc3/c0;

.field private final d:Ljs0/c;

.field private final e:La6/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La6/g;"
        }
    .end annotation
.end field

.field private final f:Ljava/time/Clock;


# direct methods
.method public constructor <init>(Ltr2/n;Ldt0/d;Lbc3/c0;Ljs0/c;La6/g;Ljava/time/Clock;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltr2/n;",
            "Ldt0/d;",
            "Lbc3/c0;",
            "Ljs0/c;",
            "La6/g;",
            "Ljava/time/Clock;",
            ")V"
        }
    .end annotation

    const-string v0, "logger"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dataSyncService"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scope"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "configurationRepository"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dataStore"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "clock"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ldx0/d;->a:Ltr2/n;

    iput-object p2, p0, Ldx0/d;->b:Ldt0/d;

    iput-object p3, p0, Ldx0/d;->c:Lbc3/c0;

    iput-object p4, p0, Ldx0/d;->d:Ljs0/c;

    iput-object p5, p0, Ldx0/d;->e:La6/g;

    iput-object p6, p0, Ldx0/d;->f:Ljava/time/Clock;

    return-void
.end method

.method public static final synthetic b(Ldx0/d;)Ljava/time/Clock;
    .locals 0

    iget-object p0, p0, Ldx0/d;->f:Ljava/time/Clock;

    return-object p0
.end method

.method public static final synthetic c(Ldx0/d;)Ljs0/c;
    .locals 0

    iget-object p0, p0, Ldx0/d;->d:Ljs0/c;

    return-object p0
.end method

.method public static final synthetic d(Ldx0/d;)La6/g;
    .locals 0

    iget-object p0, p0, Ldx0/d;->e:La6/g;

    return-object p0
.end method

.method public static final synthetic e(Ldx0/d;)Ldt0/d;
    .locals 0

    iget-object p0, p0, Ldx0/d;->b:Ldt0/d;

    return-object p0
.end method

.method public static final synthetic f(Ldx0/d;)Ltr2/n;
    .locals 0

    iget-object p0, p0, Ldx0/d;->a:Ltr2/n;

    return-object p0
.end method


# virtual methods
.method public a(Lcom/whoop/connectivityCore/dataSyncService/models/ProcessNowSource;)V
    .locals 3

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ldx0/d;->c:Lbc3/c0;

    new-instance v1, Ldx0/d$a;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Ldx0/d$a;-><init>(Ldx0/d;Lcom/whoop/connectivityCore/dataSyncService/models/ProcessNowSource;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v2, v2, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method
