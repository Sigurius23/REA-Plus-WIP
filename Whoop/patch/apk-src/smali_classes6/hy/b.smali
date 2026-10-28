.class public final Lhy/b;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public E:Ly00/r1;

.field public F:Ljava/lang/String;

.field public G:Lhy/e;

.field public synthetic H:Ljava/lang/Object;

.field public final synthetic I:Lhy/c;

.field public J:I

.field public w:Lhy/c;

.field public x:Ly00/u1;

.field public y:La30/v0;

.field public z:Ljava/util/List;


# direct methods
.method public constructor <init>(Lhy/c;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Lhy/b;->I:Lhy/c;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lhy/b;->H:Ljava/lang/Object;

    iget p1, p0, Lhy/b;->J:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lhy/b;->J:I

    iget-object p1, p0, Lhy/b;->I:Lhy/c;

    const/4 v0, 0x0

    invoke-static {p1, v0, v0, v0, p0}, Lhy/c;->a(Lhy/c;Ly00/u1;La30/v0;Ljava/util/List;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
