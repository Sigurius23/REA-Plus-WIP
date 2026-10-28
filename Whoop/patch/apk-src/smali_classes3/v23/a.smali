.class public final Lv23/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lz23/c;

.field public final b:Lb30/m;

.field public final c:Lb30/m;

.field public final d:Lw23/p;

.field public final e:Lb30/m;

.field public final f:Lio/sentry/android/replay/video/d;

.field public final g:Ld33/c;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lec3/f2;Lec3/f2;Lec3/h2;Lz23/c;Lhc3/d;)V
    .locals 8

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callType"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "myParticipantState"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "connectionFlow"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "participants"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p6, "eventReporter"

    invoke-static {p7, p6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p7, p0, Lv23/a;->a:Lz23/c;

    const-string p6, "CallAnalyticsHooks"

    invoke-static {p0, p6}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    new-instance v5, Lso/q;

    const/4 p6, 0x5

    invoke-direct {v5, p6}, Lso/q;-><init>(I)V

    new-instance v6, La30/w0;

    invoke-direct {v6}, La30/w0;-><init>()V

    new-instance v0, Lb30/m;

    move-object v4, v5

    new-instance v5, Lm5/k;

    const/16 p6, 0xb

    invoke-direct {v5, p0, p6}, Lm5/k;-><init>(Ljava/lang/Object;I)V

    move-object v1, p2

    move-object v2, p3

    move-object v3, p7

    invoke-direct/range {v0 .. v5}, Lb30/m;-><init>(Ljava/lang/String;Ljava/lang/String;Lz23/c;Lso/q;Lm5/k;)V

    move-object v5, v4

    iput-object v0, p0, Lv23/a;->b:Lb30/m;

    new-instance v0, Lb30/m;

    move-object v3, p5

    move-object/from16 v4, p8

    move-object v7, v6

    move-object v6, v5

    move-object v5, p7

    invoke-direct/range {v0 .. v7}, Lb30/m;-><init>(Ljava/lang/String;Ljava/lang/String;Lec3/f2;Lhc3/d;Lz23/c;Lso/q;La30/w0;)V

    move-object v5, v6

    move-object v6, v7

    iput-object v0, p0, Lv23/a;->c:Lb30/m;

    new-instance v0, Lw23/p;

    move-object v4, p7

    move-object/from16 v3, p8

    invoke-direct/range {v0 .. v6}, Lw23/p;-><init>(Ljava/lang/String;Ljava/lang/String;Lhc3/d;Lz23/c;Lso/q;La30/w0;)V

    iput-object v0, p0, Lv23/a;->d:Lw23/p;

    new-instance v0, Lb30/m;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    invoke-direct/range {v0 .. v5}, Lb30/m;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lz23/c;Lso/q;)V

    iput-object v0, p0, Lv23/a;->e:Lb30/m;

    new-instance p1, Lio/sentry/android/replay/video/d;

    const-string p5, "callType"

    invoke-static {p3, p5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p5, "clientEventReporter"

    invoke-static {p7, p5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p2, p1, Lio/sentry/android/replay/video/d;->a:Ljava/lang/Object;

    iput-object p3, p1, Lio/sentry/android/replay/video/d;->b:Ljava/lang/Object;

    iput-object p7, p1, Lio/sentry/android/replay/video/d;->c:Ljava/lang/Object;

    iput-object v5, p1, Lio/sentry/android/replay/video/d;->d:Ljava/lang/Object;

    iput-object v6, p1, Lio/sentry/android/replay/video/d;->e:Ljava/lang/Object;

    move-object/from16 v3, p8

    iput-object v3, p1, Lio/sentry/android/replay/video/d;->f:Ljava/lang/Object;

    new-instance p5, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 p6, 0x0

    invoke-direct {p5, p6}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object p5, p1, Lio/sentry/android/replay/video/d;->g:Ljava/lang/Object;

    iput-object p1, p0, Lv23/a;->f:Lio/sentry/android/replay/video/d;

    new-instance v0, Ld33/c;

    move-object v1, p2

    move-object v2, p3

    move-object v3, p4

    invoke-direct/range {v0 .. v6}, Ld33/c;-><init>(Ljava/lang/String;Ljava/lang/String;Lec3/f2;Lz23/c;Lso/q;La30/w0;)V

    iput-object v0, p0, Lv23/a;->g:Ld33/c;

    return-void
.end method
