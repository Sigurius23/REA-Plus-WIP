.class public final Lyy/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lyy/g0;


# instance fields
.field public final a:J


# direct methods
.method public constructor <init>()V
    .locals 3

    const-wide/16 v0, 0x3

    sget-object v2, Lkotlin/time/DurationUnit;->SECONDS:Lkotlin/time/DurationUnit;

    invoke-static {v0, v1, v2}, Lkotlin/time/DurationKt;->toDuration(JLkotlin/time/DurationUnit;)J

    move-result-wide v0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide v0, p0, Lyy/p;->a:J

    return-void
.end method


# virtual methods
.method public final a(I)J
    .locals 2

    iget-wide v0, p0, Lyy/p;->a:J

    return-wide v0
.end method
