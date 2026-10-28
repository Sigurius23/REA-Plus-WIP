.class public final Ld33/p0;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public E:Ljava/lang/Object;

.field public F:Lstream/video/sfu/models/AndroidThermalState;

.field public G:Z

.field public synthetic H:Ljava/lang/Object;

.field public final synthetic I:Ld33/h1;

.field public J:I

.field public w:Ld33/h1;

.field public x:Ljava/lang/Object;

.field public y:Ljava/io/Serializable;

.field public z:Ljava/io/Serializable;


# direct methods
.method public constructor <init>(Ld33/h1;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Ld33/p0;->I:Ld33/h1;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Ld33/p0;->H:Ljava/lang/Object;

    iget p1, p0, Ld33/p0;->J:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Ld33/p0;->J:I

    iget-object p1, p0, Ld33/p0;->I:Ld33/h1;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, v0, v0, p0}, Ld33/h1;->A(Lt23/u0;Ljava/lang/Float;Ll83/k;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
