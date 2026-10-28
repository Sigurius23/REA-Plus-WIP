.class public final Lfg/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfg/l;


# instance fields
.field public a:J

.field public b:D

.field public c:D

.field public d:D

.field public e:D


# direct methods
.method public constructor <init>()V
    .locals 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lkotlin/time/Duration;->Companion:Lkotlin/time/Duration$Companion;

    sget-object v0, Lkotlin/time/DurationUnit;->SECONDS:Lkotlin/time/DurationUnit;

    const-wide/high16 v1, 0x3fe0000000000000L    # 0.5

    invoke-static {v1, v2, v0}, Lkotlin/time/DurationKt;->toDuration(DLkotlin/time/DurationUnit;)J

    move-result-wide v3

    iput-wide v3, p0, Lfg/a;->a:J

    const-wide/high16 v3, 0x3ff0000000000000L    # 1.0

    iput-wide v3, p0, Lfg/a;->b:D

    iput-wide v1, p0, Lfg/a;->c:D

    const-wide v0, 0x3fd999999999999aL    # 0.4

    iput-wide v0, p0, Lfg/a;->d:D

    const-wide v0, 0x3fe999999999999aL    # 0.8

    iput-wide v0, p0, Lfg/a;->e:D

    return-void
.end method
