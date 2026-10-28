.class public final Lq00/m0;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public final synthetic E:Lq00/p0;

.field public F:I

.field public w:Lq00/p0;

.field public x:Ljava/lang/String;

.field public y:Z

.field public synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lq00/p0;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Lq00/m0;->E:Lq00/p0;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iput-object p1, p0, Lq00/m0;->z:Ljava/lang/Object;

    iget p1, p0, Lq00/m0;->F:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lq00/m0;->F:I

    const/4 p1, 0x0

    const/4 v0, 0x0

    iget-object v1, p0, Lq00/m0;->E:Lq00/p0;

    invoke-virtual {v1, p1, v0, p0}, Lq00/p0;->o(Ljava/lang/String;ZLs83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
