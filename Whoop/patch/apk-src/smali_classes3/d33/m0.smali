.class public final Ld33/m0;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public final synthetic E:Ld33/h1;

.field public F:I

.field public w:Ld33/h1;

.field public x:Lmc3/a;

.field public y:Ljava/util/Iterator;

.field public synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ld33/h1;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Ld33/m0;->E:Ld33/h1;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Ld33/m0;->z:Ljava/lang/Object;

    iget p1, p0, Ld33/m0;->F:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Ld33/m0;->F:I

    iget-object p1, p0, Ld33/m0;->E:Ld33/h1;

    const/4 v0, 0x0

    invoke-static {p1, v0, p0}, Ld33/h1;->c(Ld33/h1;Ld33/h1;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
