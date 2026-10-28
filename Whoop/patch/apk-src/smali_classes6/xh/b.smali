.class public final Lxh/b;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public E:Ljava/lang/Object;

.field public F:Lfi/o;

.field public G:Lrh/f;

.field public H:I

.field public synthetic I:Ljava/lang/Object;

.field public final synthetic J:Lxh/f;

.field public K:I

.field public w:Lxh/f;

.field public x:Luh/h;

.field public y:Lrh/d;

.field public z:Lfi/i;


# direct methods
.method public constructor <init>(Lxh/f;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Lxh/b;->J:Lxh/f;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iput-object p1, p0, Lxh/b;->I:Ljava/lang/Object;

    iget p1, p0, Lxh/b;->K:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lxh/b;->K:I

    const/4 v5, 0x0

    const/4 v6, 0x0

    iget-object v0, p0, Lxh/b;->J:Lxh/f;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v7, p0

    invoke-static/range {v0 .. v7}, Lxh/f;->a(Lxh/f;Luh/h;Lrh/d;Lfi/i;Ljava/lang/Object;Lfi/o;Lrh/f;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
