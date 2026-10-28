.class public final Luf/a;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public E:Lgf/c;

.field public F:Ljava/lang/Object;

.field public G:Lgf/b;

.field public H:Lqg/c;

.field public I:Lgf/b;

.field public J:J

.field public synthetic K:Ljava/lang/Object;

.field public final synthetic L:Luf/b;

.field public M:I

.field public w:Luf/u;

.field public x:Lnf/e;

.field public y:Lgf/b;

.field public z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Luf/b;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Luf/a;->L:Luf/b;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Luf/a;->K:Ljava/lang/Object;

    iget p1, p0, Luf/a;->M:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Luf/a;->M:I

    iget-object p1, p0, Luf/a;->L:Luf/b;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Luf/b;->b(Luf/u;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
