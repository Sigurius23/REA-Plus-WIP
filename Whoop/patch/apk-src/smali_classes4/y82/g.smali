.class public final Ly82/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lbc3/c0;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u0013\u0010\u0012J\u0015\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0014\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u0018\u0010\u0012J\u0015\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u0019\u00a2\u0006\u0004\u0008\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010 R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008!\u0010\"R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008#\u0010$R\u0014\u0010(\u001a\u00020%8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008&\u0010\'R\u0014\u0010,\u001a\u00020)8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008*\u0010+\u00a8\u0006-"
    }
    d2 = {
        "Ly82/g;",
        "Lbc3/c0;",
        "Lf82/c;",
        "strapAlarmSdk",
        "Ld82/a;",
        "imuSdk",
        "Lin2/d;",
        "dispatcherFactory",
        "Lb82/a;",
        "hapticsFeedbackSdk",
        "<init>",
        "(Lf82/c;Ld82/a;Lin2/d;Lb82/a;)V",
        "",
        "timeStampMillis",
        "Ll83/a0;",
        "h",
        "(J)V",
        "f",
        "()V",
        "d",
        "",
        "duration",
        "e",
        "(I)V",
        "g",
        "",
        "enable",
        "i",
        "(Z)V",
        "w",
        "Lf82/c;",
        "x",
        "Ld82/a;",
        "y",
        "Lin2/d;",
        "z",
        "Lb82/a;",
        "Lbc3/u;",
        "E",
        "Lbc3/u;",
        "job",
        "Lq83/j;",
        "getCoroutineContext",
        "()Lq83/j;",
        "coroutineContext",
        "app_prodStandardRelease"
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
.field private final E:Lbc3/u;

.field private final w:Lf82/c;

.field private final x:Ld82/a;

.field private final y:Lin2/d;

.field private final z:Lb82/a;


# direct methods
.method public constructor <init>(Lf82/c;Ld82/a;Lin2/d;Lb82/a;)V
    .locals 1

    const-string v0, "strapAlarmSdk"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "imuSdk"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dispatcherFactory"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "hapticsFeedbackSdk"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly82/g;->w:Lf82/c;

    iput-object p2, p0, Ly82/g;->x:Ld82/a;

    iput-object p3, p0, Ly82/g;->y:Lin2/d;

    iput-object p4, p0, Ly82/g;->z:Lb82/a;

    invoke-static {}, Lbc3/f0;->d()Lbc3/e2;

    move-result-object p1

    iput-object p1, p0, Ly82/g;->E:Lbc3/u;

    return-void
.end method

.method public static final synthetic a(Ly82/g;)Lb82/a;
    .locals 0

    iget-object p0, p0, Ly82/g;->z:Lb82/a;

    return-object p0
.end method

.method public static final synthetic b(Ly82/g;)Ld82/a;
    .locals 0

    iget-object p0, p0, Ly82/g;->x:Ld82/a;

    return-object p0
.end method

.method public static final synthetic c(Ly82/g;)Lf82/c;
    .locals 0

    iget-object p0, p0, Ly82/g;->w:Lf82/c;

    return-object p0
.end method


# virtual methods
.method public final d()V
    .locals 3

    new-instance v0, Ly82/g$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Ly82/g$a;-><init>(Ly82/g;Lq83/d;)V

    const/4 v2, 0x3

    invoke-static {p0, v1, v1, v0, v2}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method public final e(I)V
    .locals 2

    new-instance v0, Ly82/g$b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Ly82/g$b;-><init>(Ly82/g;ILq83/d;)V

    const/4 p1, 0x3

    invoke-static {p0, v1, v1, v0, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method public final f()V
    .locals 3

    new-instance v0, Ly82/g$c;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Ly82/g$c;-><init>(Ly82/g;Lq83/d;)V

    const/4 v2, 0x3

    invoke-static {p0, v1, v1, v0, v2}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method public final g()V
    .locals 3

    new-instance v0, Ly82/g$d;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Ly82/g$d;-><init>(Ly82/g;Lq83/d;)V

    const/4 v2, 0x3

    invoke-static {p0, v1, v1, v0, v2}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method public getCoroutineContext()Lq83/j;
    .locals 2

    iget-object v0, p0, Ly82/g;->y:Lin2/d;

    invoke-interface {v0}, Lin2/d;->b()Lq83/j;

    move-result-object v0

    iget-object v1, p0, Ly82/g;->E:Lbc3/u;

    invoke-interface {v0, v1}, Lq83/j;->plus(Lq83/j;)Lq83/j;

    move-result-object v0

    return-object v0
.end method

.method public final h(J)V
    .locals 2

    new-instance v0, Ly82/g$e;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, p2, v1}, Ly82/g$e;-><init>(Ly82/g;JLq83/d;)V

    const/4 p1, 0x3

    invoke-static {p0, v1, v1, v0, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method public final i(Z)V
    .locals 2

    new-instance v0, Ly82/g$f;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Ly82/g$f;-><init>(Ly82/g;ZLq83/d;)V

    const/4 p1, 0x3

    invoke-static {p0, v1, v1, v0, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method
