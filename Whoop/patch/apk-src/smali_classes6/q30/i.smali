.class public final Lq30/i;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public E:I

.field public w:Lq30/j;

.field public x:Lr30/b;

.field public synthetic y:Ljava/lang/Object;

.field public final synthetic z:Lq30/j;


# direct methods
.method public constructor <init>(Lq30/j;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Lq30/i;->z:Lq30/j;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lq30/i;->y:Ljava/lang/Object;

    iget p1, p0, Lq30/i;->E:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lq30/i;->E:I

    iget-object p1, p0, Lq30/i;->z:Lq30/j;

    const/4 v0, 0x0

    invoke-static {p1, v0, p0}, Lq30/j;->a(Lq30/j;Lr30/b;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
