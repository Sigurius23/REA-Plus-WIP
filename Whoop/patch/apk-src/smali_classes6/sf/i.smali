.class public final Lsf/i;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public E:I

.field public F:I

.field public synthetic G:Ljava/lang/Object;

.field public final synthetic H:La30/w0;

.field public I:I

.field public w:Lsf/f;

.field public x:Ljava/util/Iterator;

.field public y:Lsf/f;

.field public z:Lsf/f;


# direct methods
.method public constructor <init>(La30/w0;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Lsf/i;->H:La30/w0;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lsf/i;->G:Ljava/lang/Object;

    iget p1, p0, Lsf/i;->I:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lsf/i;->I:I

    iget-object p1, p0, Lsf/i;->H:La30/w0;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, La30/w0;->y(Lrf/l;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
