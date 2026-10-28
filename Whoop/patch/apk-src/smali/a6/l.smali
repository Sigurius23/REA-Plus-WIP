.class public final La6/l;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public E:La6/i0;

.field public synthetic F:Ljava/lang/Object;

.field public final synthetic G:La6/m;

.field public H:I

.field public w:Ljava/lang/Object;

.field public x:Ljava/lang/Object;

.field public y:Ljava/lang/Object;

.field public z:Lkotlin/jvm/internal/g0;


# direct methods
.method public constructor <init>(La6/m;Ls83/c;)V
    .locals 0

    iput-object p1, p0, La6/l;->G:La6/m;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, La6/l;->F:Ljava/lang/Object;

    iget p1, p0, La6/l;->H:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, La6/l;->H:I

    iget-object p1, p0, La6/l;->G:La6/m;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, La6/m;->a(La6/f;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
