.class public final La6/d0;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public E:I

.field public synthetic F:Ljava/lang/Object;

.field public final synthetic G:La6/i0;

.field public H:I

.field public w:Z

.field public x:Ljava/lang/Object;

.field public y:Lkotlin/jvm/internal/g0;

.field public z:Ljava/io/Serializable;


# direct methods
.method public constructor <init>(La6/i0;Ls83/c;)V
    .locals 0

    iput-object p1, p0, La6/d0;->G:La6/i0;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, La6/d0;->F:Ljava/lang/Object;

    iget p1, p0, La6/d0;->H:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, La6/d0;->H:I

    iget-object p1, p0, La6/d0;->G:La6/i0;

    const/4 v0, 0x0

    invoke-static {p1, v0, p0}, La6/i0;->g(La6/i0;ZLs83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
