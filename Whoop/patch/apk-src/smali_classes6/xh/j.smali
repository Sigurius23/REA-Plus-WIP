.class public final Lxh/j;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public E:I

.field public w:Lxh/k;

.field public x:Lxh/i;

.field public synthetic y:Ljava/lang/Object;

.field public final synthetic z:Lxh/k;


# direct methods
.method public constructor <init>(Lxh/k;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Lxh/j;->z:Lxh/k;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lxh/j;->y:Ljava/lang/Object;

    iget p1, p0, Lxh/j;->E:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lxh/j;->E:I

    iget-object p1, p0, Lxh/j;->z:Lxh/k;

    invoke-virtual {p1, p0}, Lxh/k;->c(Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
