.class public final Lt23/g2;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final A:Lec3/h2;

.field public final B:Lec3/h2;

.field public final C:Lec3/h2;

.field public final D:Lec3/h2;

.field public final E:Lec3/h2;

.field public final F:Lec3/h2;

.field public final G:Lec3/h2;

.field public final H:Lec3/h2;

.field public final I:Lec3/h2;

.field public final J:Lec3/h2;

.field public final K:Lec3/r1;

.field public final L:Lec3/h2;

.field public final M:Lec3/h2;

.field public a:Ljava/lang/String;

.field public final b:Lhc3/d;

.field public final c:Lq30/u0;

.field public final d:Ljava/lang/String;

.field public final e:Lstream/video/sfu/models/ParticipantSource;

.field public f:Ljava/lang/String;

.field public final g:Ll83/p;

.field public final h:Ll83/p;

.field public final i:Lec3/h2;

.field public final j:Lec3/h2;

.field public final k:Lec3/h2;

.field public final l:Lec3/h2;

.field public final m:Lec3/h2;

.field public final n:Lec3/h2;

.field public final o:Lec3/h2;

.field public final p:Lec3/h2;

.field public final q:Lec3/h2;

.field public final r:Lec3/h2;

.field public final s:Lec3/h2;

.field public final t:Lec3/h2;

.field public final u:Lec3/h2;

.field public final v:Lec3/h2;

.field public final w:Lec3/h2;

.field public final x:Lec3/h2;

.field public final y:Lec3/h2;

.field public final z:Lec3/h2;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lhc3/d;Lq30/u0;Ljava/lang/String;Lstream/video/sfu/models/ParticipantSource;)V
    .locals 8

    const-string v0, "sessionId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callActions"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "initialUserId"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "source"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt23/g2;->a:Ljava/lang/String;

    iput-object p2, p0, Lt23/g2;->b:Lhc3/d;

    iput-object p3, p0, Lt23/g2;->c:Lq30/u0;

    iput-object p4, p0, Lt23/g2;->d:Ljava/lang/String;

    iput-object p5, p0, Lt23/g2;->e:Lstream/video/sfu/models/ParticipantSource;

    const-string p1, ""

    iput-object p1, p0, Lt23/g2;->f:Ljava/lang/String;

    const-string p3, "ParticipantState"

    invoke-static {p0, p3}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    move-result-object p3

    iput-object p3, p0, Lt23/g2;->g:Ll83/p;

    new-instance p3, Lm5/k;

    const/16 p5, 0x8

    invoke-direct {p3, p0, p5}, Lm5/k;-><init>(Ljava/lang/Object;I)V

    invoke-static {p3}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p3

    iput-object p3, p0, Lt23/g2;->h:Ll83/p;

    const/4 p3, 0x0

    invoke-static {p3}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p5

    iput-object p5, p0, Lt23/g2;->i:Lec3/h2;

    sget-object v0, Lc43/x;->y:Lc43/x;

    invoke-static {v0}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v0

    iput-object v0, p0, Lt23/g2;->j:Lec3/h2;

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v0}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v1

    iput-object v1, p0, Lt23/g2;->k:Lec3/h2;

    iput-object v1, p0, Lt23/g2;->l:Lec3/h2;

    invoke-static {v0}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v2

    iput-object v2, p0, Lt23/g2;->m:Lec3/h2;

    iput-object v2, p0, Lt23/g2;->n:Lec3/h2;

    invoke-static {v0}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v3

    iput-object v3, p0, Lt23/g2;->o:Lec3/h2;

    iput-object v3, p0, Lt23/g2;->p:Lec3/h2;

    invoke-static {p3}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v4

    iput-object v4, p0, Lt23/g2;->q:Lec3/h2;

    invoke-static {v0}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v5

    iput-object v5, p0, Lt23/g2;->r:Lec3/h2;

    iput-object v5, p0, Lt23/g2;->s:Lec3/h2;

    invoke-static {p3}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v6

    iput-object v6, p0, Lt23/g2;->t:Lec3/h2;

    invoke-static {p1}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v7

    iput-object v7, p0, Lt23/g2;->u:Lec3/h2;

    iput-object v7, p0, Lt23/g2;->v:Lec3/h2;

    invoke-static {p1}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p1

    iput-object p1, p0, Lt23/g2;->w:Lec3/h2;

    invoke-static {p4}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p1

    iput-object p1, p0, Lt23/g2;->x:Lec3/h2;

    iput-object p1, p0, Lt23/g2;->y:Lec3/h2;

    new-instance p1, Lj43/a;

    const/16 p4, 0xb

    invoke-direct {p1, p0, p4}, Lj43/a;-><init>(Ljava/lang/Object;I)V

    invoke-static {v7, p1}, Lx30/s0;->x(Lec3/f2;Lkotlin/jvm/functions/Function1;)Ln53/e;

    invoke-static {p3}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p1

    iput-object p1, p0, Lt23/g2;->z:Lec3/h2;

    const/4 p1, 0x0

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-static {p1}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p4

    iput-object p4, p0, Lt23/g2;->A:Lec3/h2;

    iput-object p4, p0, Lt23/g2;->B:Lec3/h2;

    filled-new-array {p1, p1, p1, p1, p1}, [Ljava/lang/Float;

    move-result-object p1

    invoke-static {p1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p1

    iput-object p1, p0, Lt23/g2;->C:Lec3/h2;

    new-instance p1, Lc43/l;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p1

    iput-object p1, p0, Lt23/g2;->D:Lec3/h2;

    invoke-static {v0}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p1

    iput-object p1, p0, Lt23/g2;->E:Lec3/h2;

    iput-object p1, p0, Lt23/g2;->F:Lec3/h2;

    invoke-static {v0}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p1

    iput-object p1, p0, Lt23/g2;->G:Lec3/h2;

    iput-object p1, p0, Lt23/g2;->H:Lec3/h2;

    invoke-static {p3}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    sget-object p1, Lm83/y;->w:Lm83/y;

    invoke-static {p1}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p4

    iput-object p4, p0, Lt23/g2;->I:Lec3/h2;

    iput-object p4, p0, Lt23/g2;->J:Lec3/h2;

    new-instance p4, Lt23/f2;

    invoke-direct {p4, p0, p3}, Lt23/f2;-><init>(Lt23/g2;Lq83/d;)V

    invoke-static {p5, v1, v2, p4}, Lec3/v;->p(Lec3/l;Lec3/l;Lec3/l;Lc93/n;)Lec3/j1;

    move-result-object p4

    sget-object p5, Lec3/z1;->b:Lec3/b2;

    invoke-static {p4, p2, p5, p3}, Lec3/v;->M(Lec3/l;Lbc3/c0;Lec3/a2;Ljava/lang/Object;)Lec3/r1;

    move-result-object p2

    iput-object p2, p0, Lt23/g2;->K:Lec3/r1;

    new-instance p2, Lt23/e2;

    const/4 p3, 0x0

    invoke-direct {p2, p0, p3}, Lt23/e2;-><init>(Lt23/g2;I)V

    invoke-static {v4, v3, p2}, Lx30/s0;->m(Lec3/h2;Lec3/h2;Lc93/m;)V

    new-instance p2, Lt23/e2;

    const/4 p3, 0x1

    invoke-direct {p2, p0, p3}, Lt23/e2;-><init>(Lt23/g2;I)V

    invoke-static {v6, v5, p2}, Lx30/s0;->m(Lec3/h2;Lec3/h2;Lc93/m;)V

    invoke-static {p1}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p1

    iput-object p1, p0, Lt23/g2;->L:Lec3/h2;

    iput-object p1, p0, Lt23/g2;->M:Lec3/h2;

    return-void
.end method


# virtual methods
.method public final a(F)V
    .locals 6

    iget-object v0, p0, Lt23/g2;->C:Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Collection;

    invoke-static {v1}, Lm83/s;->F1(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    move-result v3

    const/4 v4, 0x0

    cmpg-float v3, v3, v4

    if-nez v3, :cond_0

    const/4 v3, 0x2

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->floatValue()F

    move-result v5

    cmpg-float v4, v5, v4

    if-nez v4, :cond_0

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    invoke-virtual {v1, v2, v4}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    invoke-virtual {v1, v3, v2}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    :cond_0
    invoke-static {v1}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    iget-object v0, p0, Lt23/g2;->A:Lec3/h2;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0, v2, p1}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    return-void
.end method

.method public final b(Lstream/video/sfu/models/Participant;)V
    .locals 3

    const-string v0, "participant"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lstream/video/sfu/models/Participant;->getSession_id()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lt23/g2;->a:Ljava/lang/String;

    invoke-virtual {p1}, Lstream/video/sfu/models/Participant;->getJoined_at()Ljava/time/Instant;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/time/Instant;->toEpochMilli()J

    move-result-wide v0

    goto :goto_0

    :cond_0
    invoke-static {}, Ljg3/i;->p0()Ljg3/i;

    move-result-object v0

    invoke-virtual {v0}, Ljg3/i;->toEpochSecond()J

    move-result-wide v0

    :goto_0
    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Ljg3/c;->o0(IJ)Ljg3/c;

    move-result-object v0

    sget-object v1, Ljg3/p;->F:Ljg3/p;

    invoke-static {v0, v1}, Ljg3/i;->q0(Ljg3/c;Ljg3/o;)Ljg3/i;

    move-result-object v0

    iget-object v1, p0, Lt23/g2;->z:Lec3/h2;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v2, 0x0

    invoke-virtual {v1, v2, v0}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    invoke-virtual {p1}, Lstream/video/sfu/models/Participant;->getTrack_lookup_prefix()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lt23/g2;->f:Ljava/lang/String;

    invoke-virtual {p1}, Lstream/video/sfu/models/Participant;->getConnection_quality()Lstream/video/sfu/models/ConnectionQuality;

    move-result-object v0

    const-string v1, "connectionQuality"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lc43/h;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_4

    const/4 v1, 0x2

    if-eq v0, v1, :cond_3

    const/4 v1, 0x3

    if-eq v0, v1, :cond_2

    const/4 v1, 0x4

    if-ne v0, v1, :cond_1

    new-instance v0, Lc43/i;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    goto :goto_1

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_2
    new-instance v0, Lc43/j;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    goto :goto_1

    :cond_3
    new-instance v0, Lc43/k;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    goto :goto_1

    :cond_4
    new-instance v0, Lc43/l;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    :goto_1
    iget-object v1, p0, Lt23/g2;->D:Lec3/h2;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v1, v2, v0}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    invoke-virtual {p1}, Lstream/video/sfu/models/Participant;->is_speaking()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iget-object v1, p0, Lt23/g2;->G:Lec3/h2;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v1, v2, v0}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    invoke-virtual {p1}, Lstream/video/sfu/models/Participant;->getAudio_level()F

    move-result v0

    invoke-virtual {p0, v0}, Lt23/g2;->a(F)V

    invoke-virtual {p1}, Lstream/video/sfu/models/Participant;->getPublished_tracks()Ljava/util/List;

    move-result-object v0

    sget-object v1, Lstream/video/sfu/models/TrackType;->TRACK_TYPE_AUDIO:Lstream/video/sfu/models/TrackType;

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iget-object v1, p0, Lt23/g2;->o:Lec3/h2;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v1, v2, v0}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    invoke-virtual {p1}, Lstream/video/sfu/models/Participant;->getPublished_tracks()Ljava/util/List;

    move-result-object v0

    sget-object v1, Lstream/video/sfu/models/TrackType;->TRACK_TYPE_VIDEO:Lstream/video/sfu/models/TrackType;

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iget-object v1, p0, Lt23/g2;->k:Lec3/h2;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v1, v2, v0}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    invoke-virtual {p1}, Lstream/video/sfu/models/Participant;->getPublished_tracks()Ljava/util/List;

    move-result-object v0

    sget-object v1, Lstream/video/sfu/models/TrackType;->TRACK_TYPE_SCREEN_SHARE:Lstream/video/sfu/models/TrackType;

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iget-object v1, p0, Lt23/g2;->r:Lec3/h2;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v1, v2, v0}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    iget-object v0, p0, Lt23/g2;->L:Lec3/h2;

    invoke-virtual {p1}, Lstream/video/sfu/models/Participant;->getRoles()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lec3/h2;->j(Ljava/lang/Object;)V

    iget-object v0, p0, Lt23/g2;->u:Lec3/h2;

    invoke-virtual {p1}, Lstream/video/sfu/models/Participant;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lec3/h2;->j(Ljava/lang/Object;)V

    iget-object v0, p0, Lt23/g2;->w:Lec3/h2;

    invoke-virtual {p1}, Lstream/video/sfu/models/Participant;->getImage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lec3/h2;->j(Ljava/lang/Object;)V

    return-void
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    goto :goto_1

    :cond_0
    instance-of v0, p1, Lt23/g2;

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Lt23/g2;

    iget-object v0, p0, Lt23/g2;->a:Ljava/lang/String;

    iget-object v1, p1, Lt23/g2;->a:Ljava/lang/String;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lt23/g2;->b:Lhc3/d;

    iget-object v1, p1, Lt23/g2;->b:Lhc3/d;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_0

    :cond_3
    iget-object v0, p0, Lt23/g2;->c:Lq30/u0;

    iget-object v1, p1, Lt23/g2;->c:Lq30/u0;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    goto :goto_0

    :cond_4
    iget-object v0, p0, Lt23/g2;->d:Ljava/lang/String;

    iget-object v1, p1, Lt23/g2;->d:Ljava/lang/String;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    goto :goto_0

    :cond_5
    iget-object v0, p0, Lt23/g2;->e:Lstream/video/sfu/models/ParticipantSource;

    iget-object v1, p1, Lt23/g2;->e:Lstream/video/sfu/models/ParticipantSource;

    if-eq v0, v1, :cond_6

    goto :goto_0

    :cond_6
    iget-object v0, p0, Lt23/g2;->f:Ljava/lang/String;

    iget-object p1, p1, Lt23/g2;->f:Ljava/lang/String;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    :goto_0
    const/4 p1, 0x0

    return p1

    :cond_7
    :goto_1
    const/4 p1, 0x1

    return p1
.end method

.method public final hashCode()I
    .locals 3

    iget-object v0, p0, Lt23/g2;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lt23/g2;->b:Lhc3/d;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lt23/g2;->c:Lq30/u0;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lt23/g2;->d:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lt23/g2;->e:Lstream/video/sfu/models/ParticipantSource;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lt23/g2;->f:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    add-int/2addr v0, v2

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lt23/g2;->a:Ljava/lang/String;

    iget-object v1, p0, Lt23/g2;->f:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "ParticipantState(sessionId="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", scope="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lt23/g2;->b:Lhc3/d;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", callActions="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lt23/g2;->c:Lq30/u0;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", initialUserId="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lt23/g2;->d:Ljava/lang/String;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", source="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lt23/g2;->e:Lstream/video/sfu/models/ParticipantSource;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", trackLookupPrefix="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
