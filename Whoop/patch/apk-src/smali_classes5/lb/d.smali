.class public final Llb/d;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public E:Lq83/j;

.field public F:Lkotlin/jvm/internal/g0;

.field public G:Lg73/d;

.field public synthetic H:Ljava/lang/Object;

.field public final synthetic I:Llb/e;

.field public J:I

.field public w:Z

.field public x:Ljava/lang/Object;

.field public y:Ljava/lang/Object;

.field public z:Lkotlin/jvm/internal/g0;


# direct methods
.method public constructor <init>(Llb/e;Lq83/d;)V
    .locals 0

    iput-object p1, p0, Llb/d;->I:Llb/e;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iput-object p1, p0, Llb/d;->H:Ljava/lang/Object;

    iget p1, p0, Llb/d;->J:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Llb/d;->J:I

    const/4 p1, 0x0

    const/4 v0, 0x0

    iget-object v1, p0, Llb/d;->I:Llb/e;

    invoke-virtual {v1, p1, v0, p0}, Llb/e;->A0(ZLc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
