.class public final La30/d;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public E:Ly00/n;

.field public F:Lux/a;

.field public G:Li20/b;

.field public H:Ljava/lang/String;

.field public synthetic I:Ljava/lang/Object;

.field public final synthetic J:La30/f;

.field public K:I

.field public w:La30/f;

.field public x:Lmy/a;

.field public y:Ly00/u1;

.field public z:La30/t0;


# direct methods
.method public constructor <init>(La30/f;Ls83/c;)V
    .locals 0

    iput-object p1, p0, La30/d;->J:La30/f;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iput-object p1, p0, La30/d;->I:Ljava/lang/Object;

    iget p1, p0, La30/d;->K:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, La30/d;->K:I

    const/4 v1, 0x0

    const/4 v4, 0x0

    iget-object v0, p0, La30/d;->J:La30/f;

    const/4 v2, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v3, p0

    invoke-virtual/range {v0 .. v6}, La30/f;->a(La30/t0;Lmy/a;Ls83/c;Ly00/n;Ly00/u1;Lz20/h;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
