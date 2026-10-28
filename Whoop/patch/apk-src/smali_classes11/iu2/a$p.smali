.class final Liu2/a$p;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Liu2/a;->v(Lq83/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.weightlifting.data.StrengthTrainerPacketManager"
    f = "StrengthTrainerPacketManager.kt"
    l = {
        0x88
    }
    m = "startStreamingRealtimeStrengthTrainerPackets"
    v = 0x2
.end annotation


# instance fields
.field synthetic w:Ljava/lang/Object;

.field final synthetic x:Liu2/a;

.field y:I


# direct methods
.method public constructor <init>(Liu2/a;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Liu2/a;",
            "Lq83/d<",
            "-",
            "Liu2/a$p;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Liu2/a$p;->x:Liu2/a;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Liu2/a$p;->w:Ljava/lang/Object;

    iget p1, p0, Liu2/a$p;->y:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Liu2/a$p;->y:I

    iget-object p1, p0, Liu2/a$p;->x:Liu2/a;

    invoke-virtual {p1, p0}, Liu2/a;->v(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
