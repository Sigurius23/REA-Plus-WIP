.class public final Llx0/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lod1/g;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lod1/g<",
        "Llx0/b;",
        "Llx0/e;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000c\u0008\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u001d\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u000c\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J#\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00030\r2\u000c\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00020\rH\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019\u00a8\u0006\u001a"
    }
    d2 = {
        "Llx0/d;",
        "Lod1/g;",
        "Llx0/b;",
        "Llx0/e;",
        "Lp82/b;",
        "sensorDataUploadInteractor",
        "Llx0/f;",
        "uploadGate",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Lp82/b;Llx0/f;Ltr2/n;)V",
        "action",
        "Lec3/l;",
        "Llx0/a;",
        "f",
        "(Llx0/b;)Lec3/l;",
        "upstream",
        "interact",
        "(Lec3/l;)Lec3/l;",
        "a",
        "Lp82/b;",
        "b",
        "Llx0/f;",
        "c",
        "Ltr2/n;",
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
.field private final a:Lp82/b;

.field private final b:Llx0/f;

.field private final c:Ltr2/n;


# direct methods
.method public constructor <init>(Lp82/b;Llx0/f;Ltr2/n;)V
    .locals 1

    const-string v0, "sensorDataUploadInteractor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "uploadGate"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llx0/d;->a:Lp82/b;

    iput-object p2, p0, Llx0/d;->b:Llx0/f;

    iput-object p3, p0, Llx0/d;->c:Ltr2/n;

    return-void
.end method

.method public static final synthetic c(Llx0/d;)Lp82/b;
    .locals 0

    iget-object p0, p0, Llx0/d;->a:Lp82/b;

    return-object p0
.end method

.method public static final synthetic d(Llx0/d;)Llx0/f;
    .locals 0

    iget-object p0, p0, Llx0/d;->b:Llx0/f;

    return-object p0
.end method

.method public static final synthetic e(Llx0/d;Llx0/b;)Lec3/l;
    .locals 0

    invoke-direct {p0, p1}, Llx0/d;->f(Llx0/b;)Lec3/l;

    move-result-object p0

    return-object p0
.end method

.method private final f(Llx0/b;)Lec3/l;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llx0/b;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    invoke-interface {p1}, Llx0/b;->a()Ldt0/c;

    move-result-object p1

    iget-object v0, p0, Llx0/d;->c:Ltr2/n;

    invoke-virtual {p1}, Ldt0/c;->e()Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Receiving Upload action for job: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Lqr2/a$a;

    invoke-interface {v0, v1, v2}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    new-instance v0, Llx0/d$d;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Llx0/d$d;-><init>(Llx0/d;Ldt0/c;Lq83/d;)V

    new-instance p1, Lec3/s1;

    invoke-direct {p1, v0}, Lec3/s1;-><init>(Lc93/m;)V

    return-object p1
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

    new-instance v0, Llx0/d$a;

    invoke-direct {v0, p1}, Llx0/d$a;-><init>(Lec3/l;)V

    new-instance p1, Llx0/d$b;

    const/4 v1, 0x0

    invoke-direct {p1, v1, p0}, Llx0/d$b;-><init>(Lq83/d;Llx0/d;)V

    invoke-static {v0, p1}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object p1

    sget-object v0, Llx0/e$c;->a:Llx0/e$c;

    new-instance v2, Llx0/d$c;

    invoke-direct {v2, v1}, Llx0/d$c;-><init>(Lq83/d;)V

    new-instance v1, Lec3/l1;

    invoke-direct {v1, v0, p1, v2}, Lec3/l1;-><init>(Ljava/lang/Object;Lec3/l;Lkotlin/jvm/functions/Function3;)V

    return-object v1
.end method
