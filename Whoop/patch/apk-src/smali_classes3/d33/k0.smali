.class public final Ld33/k0;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public E:I

.field public w:Ld33/h1;

.field public x:Ljava/lang/String;

.field public synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ld33/h1;


# direct methods
.method public constructor <init>(Ld33/h1;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Ld33/k0;->z:Ld33/h1;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Ld33/k0;->y:Ljava/lang/Object;

    iget p1, p0, Ld33/k0;->E:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Ld33/k0;->E:I

    iget-object p1, p0, Ld33/k0;->z:Ld33/h1;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Ld33/h1;->x(Ljava/lang/String;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
