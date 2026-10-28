.class public final Lpj/i0;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public E:I

.field public synthetic F:Ljava/lang/Object;

.field public final synthetic G:Lpj/j0;

.field public H:I

.field public w:Lpj/j0;

.field public x:Ljava/lang/String;

.field public y:Lkotlin/jvm/functions/Function1;

.field public z:Lkotlin/jvm/functions/Function1;


# direct methods
.method public constructor <init>(Lpj/j0;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Lpj/i0;->G:Lpj/j0;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lpj/i0;->F:Ljava/lang/Object;

    iget p1, p0, Lpj/i0;->H:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lpj/i0;->H:I

    iget-object p1, p0, Lpj/i0;->G:Lpj/j0;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, v0, v0, p0}, Lpj/j0;->a(Ljava/lang/String;Lpj/a;Lpj/b;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
