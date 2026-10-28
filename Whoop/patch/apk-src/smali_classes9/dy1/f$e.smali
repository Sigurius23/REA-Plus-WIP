.class final Ldy1/f$e;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ldy1/f;->t([BLq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.memfault.PuffinMemfaultManager"
    f = "PuffinMemfaultManager.kt"
    l = {
        0x87,
        0x62
    }
    m = "onChunkReceived"
    v = 0x2
.end annotation


# instance fields
.field synthetic E:Ljava/lang/Object;

.field final synthetic F:Ldy1/f;

.field G:I

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:I

.field z:I


# direct methods
.method public constructor <init>(Ldy1/f;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldy1/f;",
            "Lq83/d<",
            "-",
            "Ldy1/f$e;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Ldy1/f$e;->F:Ldy1/f;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Ldy1/f$e;->E:Ljava/lang/Object;

    iget p1, p0, Ldy1/f$e;->G:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Ldy1/f$e;->G:I

    iget-object p1, p0, Ldy1/f$e;->F:Ldy1/f;

    const/4 v0, 0x0

    invoke-static {p1, v0, p0}, Ldy1/f;->m(Ldy1/f;[BLq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
