.class public final Lyy/l;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public E:I

.field public w:Ljava/lang/Object;

.field public x:Ljava/lang/Object;

.field public synthetic y:Ljava/lang/Object;

.field public final synthetic z:Lyy/n;


# direct methods
.method public constructor <init>(Lyy/n;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Lyy/l;->z:Lyy/n;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lyy/l;->y:Ljava/lang/Object;

    iget p1, p0, Lyy/l;->E:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lyy/l;->E:I

    iget-object p1, p0, Lyy/l;->z:Lyy/n;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Lyy/n;->b(Lcom/stripe/android/core/networking/AnalyticsRequestV2;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
