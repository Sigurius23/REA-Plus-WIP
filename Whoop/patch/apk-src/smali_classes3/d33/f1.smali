.class public final Ld33/f1;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public E:I

.field public w:Ld33/h1;

.field public x:Le33/u;

.field public synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ld33/h1;


# direct methods
.method public constructor <init>(Ld33/h1;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Ld33/f1;->z:Ld33/h1;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Ld33/f1;->y:Ljava/lang/Object;

    iget p1, p0, Ld33/f1;->E:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Ld33/f1;->E:I

    iget-object p1, p0, Ld33/f1;->z:Ld33/h1;

    invoke-virtual {p1, p0}, Ld33/h1;->J(Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
