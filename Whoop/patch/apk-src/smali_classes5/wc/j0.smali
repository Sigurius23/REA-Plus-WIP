.class public final Lwc/j0;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public E:Lkotlin/jvm/internal/g0;

.field public F:Lkotlin/jvm/internal/g0;

.field public G:Ljava/util/Iterator;

.field public H:Lkotlin/jvm/internal/g0;

.field public I:I

.field public J:I

.field public synthetic K:Ljava/lang/Object;

.field public final synthetic L:Lwc/m0;

.field public M:I

.field public w:Lgf/b;

.field public x:Log/g;

.field public y:Lwd/l;

.field public z:Ls/m2;


# direct methods
.method public constructor <init>(Lwc/m0;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Lwc/j0;->L:Lwc/m0;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lwc/j0;->K:Ljava/lang/Object;

    iget p1, p0, Lwc/j0;->M:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lwc/j0;->M:I

    iget-object p1, p0, Lwc/j0;->L:Lwc/m0;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Lwc/m0;->b(Lgf/b;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
