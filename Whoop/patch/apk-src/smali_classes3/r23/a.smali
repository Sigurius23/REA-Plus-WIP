.class public final Lr23/a;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public E:Lkotlin/jvm/internal/g0;

.field public synthetic F:Ljava/lang/Object;

.field public final synthetic G:Lq30/w0;

.field public H:I

.field public w:Lq30/w0;

.field public x:Lkotlin/jvm/functions/Function1;

.field public y:Lkotlin/jvm/internal/e0;

.field public z:Lkotlin/jvm/internal/g0;


# direct methods
.method public constructor <init>(Lq30/w0;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Lr23/a;->G:Lq30/w0;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lr23/a;->F:Ljava/lang/Object;

    iget p1, p0, Lr23/a;->H:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lr23/a;->H:I

    iget-object p1, p0, Lr23/a;->G:Lq30/w0;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Lq30/w0;->A(La6/e;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
