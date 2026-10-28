.class public final Lyy/m;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public final synthetic E:Lyy/n;

.field public F:I

.field public w:Lyy/n;

.field public x:Lcom/stripe/android/core/networking/AnalyticsRequestV2;

.field public y:Lyy/n;

.field public synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lyy/n;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Lyy/m;->E:Lyy/n;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lyy/m;->z:Ljava/lang/Object;

    iget p1, p0, Lyy/m;->F:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lyy/m;->F:I

    iget-object p1, p0, Lyy/m;->E:Lyy/n;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Lyy/n;->c(Lcom/stripe/android/core/networking/AnalyticsRequestV2;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
