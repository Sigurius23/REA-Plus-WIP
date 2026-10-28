.class public final Lnk/c;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public final synthetic E:Lnk/i;

.field public F:I

.field public w:Lnk/i;

.field public x:Ljava/lang/String;

.field public y:Lmc3/a;

.field public synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lnk/i;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Lnk/c;->E:Lnk/i;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lnk/c;->z:Ljava/lang/Object;

    iget p1, p0, Lnk/c;->F:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lnk/c;->F:I

    iget-object p1, p0, Lnk/c;->E:Lnk/i;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Lnk/i;->d(Ljava/lang/String;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
