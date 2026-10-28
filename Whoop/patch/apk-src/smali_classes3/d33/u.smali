.class public final Ld33/u;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public synthetic E:Ljava/lang/Object;

.field public final synthetic F:Ld33/h1;

.field public G:I

.field public w:Ld33/h1;

.field public x:Lstream/video/sfu/event/ReconnectDetails;

.field public y:Ljava/util/List;

.field public z:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ld33/h1;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Ld33/u;->F:Ld33/h1;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Ld33/u;->E:Ljava/lang/Object;

    iget p1, p0, Ld33/u;->G:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Ld33/u;->G:I

    iget-object p1, p0, Ld33/u;->F:Ld33/h1;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, v0, p0}, Ld33/h1;->i(Lstream/video/sfu/event/ReconnectDetails;Ljava/util/List;Ls83/c;)Ljava/io/Serializable;

    move-result-object p1

    return-object p1
.end method
