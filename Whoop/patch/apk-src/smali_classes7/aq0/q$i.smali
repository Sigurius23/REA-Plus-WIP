.class final Laq0/q$i;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Laq0/q;->w1(Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.community.chat.ChatFragment"
    f = "ChatFragment.kt"
    l = {
        0x11f,
        0x131,
        0x132
    }
    m = "initChat"
    v = 0x2
.end annotation


# instance fields
.field synthetic E:Ljava/lang/Object;

.field final synthetic F:Laq0/q;

.field G:I

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Laq0/q;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Laq0/q;",
            "Lq83/d<",
            "-",
            "Laq0/q$i;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Laq0/q$i;->F:Laq0/q;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Laq0/q$i;->E:Ljava/lang/Object;

    iget p1, p0, Laq0/q$i;->G:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Laq0/q$i;->G:I

    iget-object p1, p0, Laq0/q$i;->F:Laq0/q;

    invoke-static {p1, p0}, Laq0/q;->M0(Laq0/q;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
