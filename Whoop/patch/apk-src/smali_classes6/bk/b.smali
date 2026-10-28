.class public final Lbk/b;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public E:Ljava/util/Iterator;

.field public F:Ljk/a;

.field public G:I

.field public synthetic H:Ljava/lang/Object;

.field public final synthetic I:La33/d;

.field public J:I

.field public w:La33/d;

.field public x:Ljava/util/Iterator;

.field public y:Ljava/lang/String;

.field public z:Ljava/util/List;


# direct methods
.method public constructor <init>(La33/d;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Lbk/b;->I:La33/d;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lbk/b;->H:Ljava/lang/Object;

    iget p1, p0, Lbk/b;->J:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lbk/b;->J:I

    iget-object p1, p0, Lbk/b;->I:La33/d;

    invoke-virtual {p1, p0}, La33/d;->A(Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
