.class public final Lvg/b;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public synthetic E:Ljava/lang/Object;

.field public final synthetic F:Lvg/c;

.field public G:I

.field public w:Ls83/i;

.field public x:Lmc3/e;

.field public y:Lvg/h;

.field public z:I


# direct methods
.method public constructor <init>(Lvg/c;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Lvg/b;->F:Lvg/c;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lvg/b;->E:Ljava/lang/Object;

    iget p1, p0, Lvg/b;->G:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lvg/b;->G:I

    iget-object p1, p0, Lvg/b;->F:Lvg/c;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Lvg/c;->b(Lkotlin/jvm/functions/Function1;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
