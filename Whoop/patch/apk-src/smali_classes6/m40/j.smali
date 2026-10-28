.class public final Lm40/j;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public E:I

.field public synthetic F:Ljava/lang/Object;

.field public final synthetic G:Lm40/k;

.field public H:I

.field public w:Lm40/k;

.field public x:Ljava/net/URL;

.field public y:Landroid/graphics/BitmapFactory$Options;

.field public z:I


# direct methods
.method public constructor <init>(Lm40/k;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Lm40/j;->G:Lm40/k;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iput-object p1, p0, Lm40/j;->F:Ljava/lang/Object;

    iget p1, p0, Lm40/j;->H:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lm40/j;->H:I

    const/4 p1, 0x0

    const/4 v0, 0x0

    iget-object v1, p0, Lm40/j;->G:Lm40/k;

    invoke-virtual {v1, p1, v0, v0, p0}, Lm40/k;->a(Ljava/net/URL;IILs83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
