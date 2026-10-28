.class public final Ls33/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lec3/h2;

.field public final b:Ljava/util/LinkedHashSet;

.field public c:Lbc3/c2;

.field public final d:Lec3/h2;

.field public final e:Lec3/h2;

.field public f:Lbc3/c2;

.field public final g:Lhc3/d;

.field public final h:Lmc3/c;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lm83/y;->w:Lm83/y;

    invoke-static {v0}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v0

    iput-object v0, p0, Ls33/c;->a:Lec3/h2;

    invoke-static {v0}, Lec3/v;->h(Lec3/p1;)Lec3/r1;

    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object v0, p0, Ls33/c;->b:Ljava/util/LinkedHashSet;

    sget-object v0, Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$ClosedCaptionMode$Disabled;->INSTANCE:Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$ClosedCaptionMode$Disabled;

    invoke-static {v0}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v0

    iput-object v0, p0, Ls33/c;->d:Lec3/h2;

    invoke-static {v0}, Lec3/v;->h(Lec3/p1;)Lec3/r1;

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v0}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v0

    iput-object v0, p0, Ls33/c;->e:Lec3/h2;

    sget-object v0, Lbc3/q0;->a:Lkc3/e;

    invoke-static {}, Lbc3/f0;->d()Lbc3/e2;

    move-result-object v1

    invoke-virtual {v0, v1}, Lq83/a;->plus(Lq83/j;)Lq83/j;

    move-result-object v0

    invoke-static {v0}, Lbc3/f0;->b(Lq83/j;)Lhc3/d;

    move-result-object v0

    iput-object v0, p0, Ls33/c;->g:Lhc3/d;

    invoke-static {}, Lmc3/d;->a()Lmc3/c;

    move-result-object v0

    iput-object v0, p0, Ls33/c;->h:Lmc3/c;

    return-void
.end method
