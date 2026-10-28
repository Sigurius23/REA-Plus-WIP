.class public final Lyy/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lyy/g0;


# instance fields
.field public final a:J


# direct methods
.method public constructor <init>()V
    .locals 3

    const-wide/16 v0, 0x2

    sget-object v2, Lkotlin/time/DurationUnit;->SECONDS:Lkotlin/time/DurationUnit;

    invoke-static {v0, v1, v2}, Lkotlin/time/DurationKt;->toDuration(JLkotlin/time/DurationUnit;)J

    move-result-wide v0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide v0, p0, Lyy/o;->a:J

    return-void
.end method


# virtual methods
.method public final a(I)J
    .locals 5

    const/4 v0, 0x3

    const/4 v1, 0x1

    invoke-static {p1, v1, v0}, Le93/b;->n(III)I

    move-result p1

    rsub-int/lit8 p1, p1, 0x4

    sget-object v0, Lkotlin/time/DurationUnit;->SECONDS:Lkotlin/time/DurationUnit;

    iget-wide v1, p0, Lyy/o;->a:J

    invoke-static {v1, v2, v0}, Lkotlin/time/Duration;->toDouble-impl(JLkotlin/time/DurationUnit;)D

    move-result-wide v1

    int-to-double v3, p1

    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v1

    invoke-static {v1, v2, v0}, Lkotlin/time/DurationKt;->toDuration(DLkotlin/time/DurationUnit;)J

    move-result-wide v0

    return-wide v0
.end method
