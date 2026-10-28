.class public final Lsf/l;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public E:Lsf/e;

.field public F:Lsf/e;

.field public G:I

.field public H:I

.field public I:I

.field public synthetic J:Ljava/lang/Object;

.field public final synthetic K:La30/w0;

.field public L:I

.field public w:Lvf/a;

.field public x:Lsf/e;

.field public y:Ljava/util/Iterator;

.field public z:Lsf/e;


# direct methods
.method public constructor <init>(La30/w0;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Lsf/l;->K:La30/w0;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lsf/l;->J:Ljava/lang/Object;

    iget p1, p0, Lsf/l;->L:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lsf/l;->L:I

    iget-object p1, p0, Lsf/l;->K:La30/w0;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, La30/w0;->B(Lvf/g;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
