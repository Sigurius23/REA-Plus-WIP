.class public final Ld33/n0;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public synthetic w:Ljava/lang/Object;

.field public final synthetic x:Ld33/h1;

.field public y:I


# direct methods
.method public constructor <init>(Ld33/h1;Lq83/d;)V
    .locals 0

    iput-object p1, p0, Ld33/n0;->x:Ld33/h1;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Ld33/n0;->w:Ljava/lang/Object;

    iget p1, p0, Ld33/n0;->y:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Ld33/n0;->y:I

    iget-object p1, p0, Ld33/n0;->x:Ld33/h1;

    invoke-virtual {p1, p0}, Ld33/h1;->y(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
