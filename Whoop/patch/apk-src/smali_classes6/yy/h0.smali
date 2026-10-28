.class public final Lyy/h0;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public E:I

.field public w:Lcom/stripe/android/core/networking/SendAnalyticsRequestV2Worker;

.field public x:Lcom/stripe/android/core/networking/SendAnalyticsRequestV2Worker;

.field public synthetic y:Ljava/lang/Object;

.field public final synthetic z:Lcom/stripe/android/core/networking/SendAnalyticsRequestV2Worker;


# direct methods
.method public constructor <init>(Lcom/stripe/android/core/networking/SendAnalyticsRequestV2Worker;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Lyy/h0;->z:Lcom/stripe/android/core/networking/SendAnalyticsRequestV2Worker;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lyy/h0;->y:Ljava/lang/Object;

    iget p1, p0, Lyy/h0;->E:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lyy/h0;->E:I

    iget-object p1, p0, Lyy/h0;->z:Lcom/stripe/android/core/networking/SendAnalyticsRequestV2Worker;

    invoke-virtual {p1, p0}, Lcom/stripe/android/core/networking/SendAnalyticsRequestV2Worker;->doWork(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
