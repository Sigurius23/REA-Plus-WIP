.class public final Lrf/q;
.super Lpf/h;
.source "SourceFile"


# instance fields
.field public j:Ll83/t;

.field public k:Lmg/h;

.field public final l:Z


# direct methods
.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lkotlin/time/Duration;->Companion:Lkotlin/time/Duration$Companion;

    sget-object v0, Lkotlin/time/DurationUnit;->SECONDS:Lkotlin/time/DurationUnit;

    const/16 v1, 0x1e

    invoke-static {v1, v0}, Lkotlin/time/DurationKt;->toDuration(ILkotlin/time/DurationUnit;)J

    move-result-wide v2

    iput-wide v2, p0, Lpf/h;->a:J

    invoke-static {v1, v0}, Lkotlin/time/DurationKt;->toDuration(ILkotlin/time/DurationUnit;)J

    move-result-wide v1

    iput-wide v1, p0, Lpf/h;->b:J

    const/4 v1, 0x2

    invoke-static {v1, v0}, Lkotlin/time/DurationKt;->toDuration(ILkotlin/time/DurationUnit;)J

    move-result-wide v1

    iput-wide v1, p0, Lpf/h;->c:J

    const/16 v1, 0xa

    invoke-static {v1, v0}, Lkotlin/time/DurationKt;->toDuration(ILkotlin/time/DurationUnit;)J

    move-result-wide v1

    iput-wide v1, p0, Lpf/h;->d:J

    const/16 v1, 0x3c

    invoke-static {v1, v0}, Lkotlin/time/DurationKt;->toDuration(ILkotlin/time/DurationUnit;)J

    move-result-wide v0

    iput-wide v0, p0, Lpf/h;->e:J

    const/16 v0, 0x80

    iput v0, p0, Lpf/h;->f:I

    new-instance v0, La3/p;

    const/16 v1, 0x19

    invoke-direct {v0, v1}, La3/p;-><init>(I)V

    iput-object v0, p0, Lpf/h;->g:Lpf/t;

    sget-object v0, Lbg/g;->a:Lbg/b;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, Lbg/b;->b:Lbg/b;

    iput-object v0, p0, Lpf/h;->h:Lbg/g;

    sget-object v0, Lpf/v;->b:Lpf/v;

    iput-object v0, p0, Lpf/h;->i:Lpf/v;

    sget-object v0, Lmg/h;->a:Lmg/g;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v1, Lmg/g;->a:Lmg/g;

    invoke-static {v0}, Lpf/c;->z(Lmg/g;)Lmg/h;

    move-result-object v0

    iput-object v0, p0, Lrf/q;->k:Lmg/h;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lrf/q;->l:Z

    return-void
.end method
