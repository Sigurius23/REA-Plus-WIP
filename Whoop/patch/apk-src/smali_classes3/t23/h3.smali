.class public final Lt23/h3;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lt23/a2;

.field public final b:Lc93/a;

.field public final c:Ll83/p;

.field public final d:Lec3/h2;

.field public final e:Lec3/h2;

.field public final f:Ln53/e;

.field public final g:Lec3/h2;

.field public final h:Lec3/h2;

.field public final i:Lec3/h2;

.field public j:Lc33/l;


# direct methods
.method public constructor <init>(Lt23/x1;Lt23/a2;Lt23/l;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lt23/h3;->a:Lt23/a2;

    iput-object p3, p0, Lt23/h3;->b:Lc93/a;

    const-string p1, "Media:SpeakerManager"

    invoke-static {p0, p1}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lt23/h3;->c:Ll83/p;

    const/4 p1, 0x0

    invoke-static {p1}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    sget-object p1, Lt23/p1;->a:Lt23/p1;

    invoke-static {p1}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p1

    iput-object p1, p0, Lt23/h3;->d:Lec3/h2;

    iput-object p1, p0, Lt23/h3;->e:Lec3/h2;

    sget-object v0, Lt23/l0;->R:Lt23/l0;

    invoke-static {p1, v0}, Lx30/s0;->x(Lec3/f2;Lkotlin/jvm/functions/Function1;)Ln53/e;

    move-result-object p1

    iput-object p1, p0, Lt23/h3;->f:Ln53/e;

    invoke-interface {p3}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    iget-object p1, p2, Lt23/a2;->o:Lec3/h2;

    iput-object p1, p0, Lt23/h3;->g:Lec3/h2;

    iget-object p1, p2, Lt23/a2;->q:Lec3/h2;

    iput-object p1, p0, Lt23/h3;->h:Lec3/h2;

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {p1}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p1

    iput-object p1, p0, Lt23/h3;->i:Lec3/h2;

    return-void
.end method
