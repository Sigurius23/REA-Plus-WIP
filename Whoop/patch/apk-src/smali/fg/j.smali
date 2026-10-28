.class public final Lfg/j;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:J

.field public final b:D

.field public final c:D

.field public final d:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget-object v0, Lkotlin/time/Duration;->Companion:Lkotlin/time/Duration$Companion;

    const/16 v0, 0xa

    sget-object v1, Lkotlin/time/DurationUnit;->MILLISECONDS:Lkotlin/time/DurationUnit;

    invoke-static {v0, v1}, Lkotlin/time/DurationKt;->toDuration(ILkotlin/time/DurationUnit;)J

    const/16 v0, 0x14

    sget-object v1, Lkotlin/time/DurationUnit;->SECONDS:Lkotlin/time/DurationUnit;

    invoke-static {v0, v1}, Lkotlin/time/DurationKt;->toDuration(ILkotlin/time/DurationUnit;)J

    return-void
.end method

.method public constructor <init>(Lfg/i;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-wide v0, p1, Lfg/i;->a:J

    iput-wide v0, p0, Lfg/j;->a:J

    iget-wide v0, p1, Lfg/i;->b:D

    iput-wide v0, p0, Lfg/j;->b:D

    iget-wide v0, p1, Lfg/i;->c:D

    iput-wide v0, p0, Lfg/j;->c:D

    iget-wide v0, p1, Lfg/i;->d:J

    iput-wide v0, p0, Lfg/j;->d:J

    return-void
.end method
