.class public final Lxh/d;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public E:Lfi/o;

.field public F:Lrh/f;

.field public G:I

.field public synthetic H:Ljava/lang/Object;

.field public final synthetic I:Lxh/f;

.field public J:I

.field public w:Lxh/f;

.field public x:Lrh/d;

.field public y:Lfi/i;

.field public z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lxh/f;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Lxh/d;->I:Lxh/f;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iput-object p1, p0, Lxh/d;->H:Ljava/lang/Object;

    iget p1, p0, Lxh/d;->J:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lxh/d;->J:I

    const/4 v4, 0x0

    const/4 v5, 0x0

    iget-object v0, p0, Lxh/d;->I:Lxh/f;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v6, p0

    invoke-virtual/range {v0 .. v6}, Lxh/f;->c(Lrh/d;Lfi/i;Ljava/lang/Object;Lfi/o;Lrh/f;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
