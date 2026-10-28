.class public final Lbe/j;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public synthetic w:Ljava/lang/Object;

.field public final synthetic x:Lbe/k;

.field public y:I


# direct methods
.method public constructor <init>(Lbe/k;Lq83/d;)V
    .locals 0

    iput-object p1, p0, Lbe/j;->x:Lbe/k;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lbe/j;->w:Ljava/lang/Object;

    iget p1, p0, Lbe/j;->y:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lbe/j;->y:I

    iget-object p1, p0, Lbe/j;->x:Lbe/k;

    invoke-virtual {p1, p0}, Lbe/k;->d(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
