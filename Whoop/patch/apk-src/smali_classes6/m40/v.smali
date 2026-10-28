.class public final Lm40/v;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public synthetic E:Ljava/lang/Object;

.field public final synthetic F:Lm40/w;

.field public G:I

.field public w:Lm40/w;

.field public x:Ljava/lang/String;

.field public y:Ljava/lang/Object;

.field public z:Lmc3/a;


# direct methods
.method public constructor <init>(Lm40/w;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Lm40/v;->F:Lm40/w;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lm40/v;->E:Ljava/lang/Object;

    iget p1, p0, Lm40/v;->G:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lm40/v;->G:I

    iget-object p1, p0, Lm40/v;->F:Lm40/w;

    const/4 v0, 0x0

    invoke-static {p1, v0, v0, p0}, Lm40/w;->e(Lm40/w;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
