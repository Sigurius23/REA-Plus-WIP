.class public final Lxh/c;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public E:Lkotlin/jvm/internal/g0;

.field public F:Lkotlin/jvm/internal/g0;

.field public G:Lkotlin/jvm/internal/g0;

.field public H:Lkotlin/jvm/internal/g0;

.field public synthetic I:Ljava/lang/Object;

.field public final synthetic J:Lxh/f;

.field public K:I

.field public w:Lxh/f;

.field public x:Lfi/i;

.field public y:Ljava/lang/Object;

.field public z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lxh/f;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Lxh/c;->J:Lxh/f;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iput-object p1, p0, Lxh/c;->I:Ljava/lang/Object;

    iget p1, p0, Lxh/c;->K:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lxh/c;->K:I

    const/4 v3, 0x0

    const/4 v4, 0x0

    iget-object v0, p0, Lxh/c;->J:Lxh/f;

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v5, p0

    invoke-static/range {v0 .. v5}, Lxh/f;->b(Lxh/f;Lfi/i;Ljava/lang/Object;Lfi/o;Lrh/f;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
