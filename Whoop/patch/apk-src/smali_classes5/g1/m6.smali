.class public final Lg1/m6;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public synthetic E:Ljava/lang/Object;

.field public final synthetic F:Lg1/n6;

.field public G:I

.field public w:Ljava/lang/String;

.field public x:Ljava/lang/String;

.field public y:Lg1/h6;

.field public z:Lmc3/a;


# direct methods
.method public constructor <init>(Lg1/n6;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Lg1/m6;->F:Lg1/n6;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lg1/m6;->E:Ljava/lang/Object;

    iget p1, p0, Lg1/m6;->G:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lg1/m6;->G:I

    iget-object p1, p0, Lg1/m6;->F:Lg1/n6;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, v0, p0}, Lg1/n6;->a(Ljava/lang/String;Lg1/h6;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
