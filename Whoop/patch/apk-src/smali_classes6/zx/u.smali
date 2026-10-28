.class public final Lzx/u;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public E:Lzx/u;

.field public synthetic F:Ljava/lang/Object;

.field public final synthetic G:Lzx/w;

.field public H:I

.field public w:Lzx/w;

.field public x:Lzx/g;

.field public y:Lzx/a;

.field public z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lzx/w;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Lzx/u;->G:Lzx/w;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lzx/u;->F:Ljava/lang/Object;

    iget p1, p0, Lzx/u;->H:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lzx/u;->H:I

    iget-object p1, p0, Lzx/u;->G:Lzx/w;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Lzx/w;->d(Lzx/g;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
